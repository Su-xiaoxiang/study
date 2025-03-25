# Git

## git基本配置

```
1:打开Git Bash
2:设置用户信息
  git config --global user.name "Suxiaoxiang"
  git config --global user.email "@qq.com"
3:查看配置信息
   git config --global user.name
   git config --global user.email
```

## 获取本地仓库

1. 创建文件夹
2. 右键使用gir bash
3. 使用git init

## 基础操作命令

```
Git工作目录下对于文件的修改存在几个状态，这些修改的状态会随着我们执行的git命令而发生变化
1: git add (工作区->暂存区) git add . 提交全部
2: git commit (暂存区->本地仓库) git commit -m "xxxx"
```

### 查看状态  git status

```java
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        file01.txt

nothing added to commit but untracked files present (use "git add" to track)
```

### 查看日志 git log

```java
--all 显示所有分支
--pretty=online 将提交信息显示为一行
--abbrev-commit 使得输出的commit更简短
--graph 图的形式显示
commit 3546718e962fac63c31af4699334136b97aa99f8 (HEAD -> master)
Author: Suxiaoxiang <2951096305@qq.com>
Date:   Sun Mar 23 22:16:00 2025 +0800

    add file01
```

### 版本回退 git reset --hard commitID

```
git reset --hard commitID
  commitID可以使用git-log或git log指令查看
 如何查看已经删除的记录
   git reflog
```

### 不提交某些文件

```
# Default ignored files
/shelf/
/workspace.xml
# Editor-based HTTP Client requests
/httpRequests/
# Datasource local storage ignored files
/dataSources/
/dataSources.local.xml
# no .a files
*.a
```

## git分支

### 查看本地分支  git branch

```
$ git branch
* master
```

### 创建新分支 git branch name

```
 git branch dev01
```

### 切换分支 git checkout dev01

### 删除分支 git branch -d 名字

### 合并分支 git merge 名字

### 开发中分支使用流程

```
master (生产分支)
  线上分支，主分支，中小规模项目作为线上运行的应用对应的分支；
develop(开发分支)
  是从master创建的分支，一般作为开发部门的主要开发分支，如果没有其他并行开发不同其上线要求，都可以再次版本进行开发，阶段开发完成后，需要合并到master分支，准备上线
 feature(新功能分支)
 hotfix(修复Bug分支) 先合并到master在合并到Develop
```

## 配置SSH公钥

 ssh-keygen -t rsa

获取密钥

cat -/.ssh/id_rsa.pub

验证是否配置成功

ssh -T git@gittee.com

## 远程仓库

### 绑定远程仓库

```
git remote add orign 地址
```

### 查询是否绑定成功

```
git remote -v
```

### 推送到远程

```
git push origin master
```

### 从远程仓库克隆

```
git clone <仓库路径> [本地目录]
```

### 抓取和拉取

```
git fetch origin 分支名 
抓取指令就是将远程仓库的更新弄到本地但不会合并
git merge origin/master 合并远端
```

### 解决冲突

```
git pull
```

## 操作流程

```
在Git中，基于develop分支创建新分支develop/addHtml并切换到该分支的步骤如下：
1切换到develop分支（确保当前工作目录干净，无未提交的更改）：git checkout develop
2拉取最新更改（可选，建议保持本地分支与远程同步）：git pull origin develop
3创建并切换到新分支develop/addHtml：git checkout -b develop/addHtml
4推送新分支到远程仓库（如需与他人协作）：git push -u origin develop/addHtml
```

```
关键点：

git checkout -b <新分支名> <源分支名> 可直接基于指定分支创建新分支，无需提前切换。

-u 参数将本地分支与远程分支关联，后续可使用 git push 简化推送。

验证操作：

查看当前分支：git branch

查看远程分支：git branch -r

```

