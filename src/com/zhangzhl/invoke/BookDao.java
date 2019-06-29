package com.zhangzhl.invoke;

public interface BookDao {
    // 添加书籍
    public void addBook(String bookName);

    // 删除书籍
    public void deletBook(String bookName);

    // 接出书籍
    public void sendBook(int bookName);

}
