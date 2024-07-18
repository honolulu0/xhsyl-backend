package com.weid.quartz.task.service;

import com.weid.quartz.task.domain.CommentRequest;
import com.weid.quartz.task.domain.NoteRequest;

import net.snowflake.client.jdbc.internal.google.gson.Gson;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class XhsylApi {
    public static final String XHSHOST = "127.0.0.1";
    public static final String POST = "10087";

    public static void collectingNotes(Integer keyword_id, String keyword, Integer all_page, String xhs_search_sort) {
        try {
            // 创建URL对象
            URL url = new URL("http://" + XHSHOST + ":" + POST + "/note_data/get_notes");

            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 设置请求方法
            connection.setRequestMethod("POST");

            // 设置请求头
            connection.setRequestProperty("Content-Type", "application/json");

            // 设置请求体
            NoteRequest request = new NoteRequest(keyword_id, keyword, all_page, xhs_search_sort);
            Gson gson = new Gson();
            String requestBody = gson.toJson(request);

            connection.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
            wr.write(requestBody);
            wr.flush();
            wr.close();

            // 获取响应状态码
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // 关闭连接
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void collectingComment(String noteIds) {
        try {
            // 创建URL对象
            URL url = new URL("http://" + XHSHOST + ":" + POST + "/note_comment/get_comment");

            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 设置请求方法
            connection.setRequestMethod("POST");

            // 设置请求头
            connection.setRequestProperty("Content-Type", "application/json");

            // 设置请求体
            CommentRequest request = new CommentRequest(noteIds);
            Gson gson = new Gson();
            String requestBody = gson.toJson(request);

            connection.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
            wr.write(requestBody);
            wr.flush();
            wr.close();

            // 获取响应状态码
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // 关闭连接
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
