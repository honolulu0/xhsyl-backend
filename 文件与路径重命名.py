import os
import shutil


def rename_file_name(work_dir, old_str, new_str):
    # 遍历目录及其所有子目录中的文件
    for root, dirs, files in os.walk(work_dir):
        print(root)
        for file in files:
            if old_str in file:
                # 构造旧文件和新文件的完整路径
                old_file_path = os.path.join(root, file)
                new_file_path = os.path.join(root, file.replace(old_str, new_str))
                # 重命名文件
                try:
                    os.rename(old_file_path, new_file_path)
                    print(f"Renamed {old_file_path} to {new_file_path}")
                except OSError as e:
                    print(f"Error renaming {old_file_path}: {e}")


def rename_dirs_in_path(path, old_str, new_str):
    # 遍历目录
    for root, dirs, files in os.walk(path, topdown=False):
        for dir in dirs:
            if old_str in dir:
                # 构造旧目录和新目录的完整路径
                old_dir_path = os.path.join(root, dir)
                new_dir_name = dir.replace(old_str, new_str)
                new_dir_path = os.path.join(root, new_dir_name)

                # 重命名目录
                try:
                    os.rename(old_dir_path, new_dir_path)
                    print(f"Renamed directory {old_dir_path} to {new_dir_path}")
                except OSError as e:
                    print(f"Error renaming directory {old_dir_path}: {e}")


# 修改文件名称
work_dir = r"D:\开发项目\低代码模板\backend"
old_str = "rongzi"
new_str = "weid"

rename_file_name(work_dir, old_str, new_str)

# 修改目录名称
work_dir = r"D:\开发项目\低代码模板\backend"
old_str = "rongzi"
new_str = "weid"

rename_dirs_in_path(work_dir, old_str, new_str)
