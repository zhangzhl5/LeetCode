package com.zhangzhl.invoke;

public interface BookDao {
    // ����鼮
    public void addBook(String bookName);

    // ɾ���鼮
    public void deletBook(String bookName);

    // �ӳ��鼮
    public void sendBook(int bookName);

}
