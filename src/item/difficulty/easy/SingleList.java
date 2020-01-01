package com.zhangzhl.title;

/**
 * java 实现单列表
 * @author zhangzhl
 *
 */
public class SingleList {
	
	// 头结点  
    private ListNode header;
    // 尾节点  
    private ListNode tail;
    // 保存已含有的节点数
    private int size; 
    // 无参构造函数
    public SingleList() {
    	this.header = null;
    	this.tail = null;
    }
    
    // 已指定数据元素创建链表，只有一个元素  
    public SingleList(int element) {  
   
        header = new ListNode(element, null);  
        // 只有一个节点，header,tail都指向该节点  
        tail = header;  
        size++;  
    }  
    
    
    //头部插入  
    public void addHeadNode(int data){
        //创建新节点，让新节点的next指向header  
        //并以新节点作为新的header  
    	ListNode newNode = new ListNode(data, null);  
        newNode.next = header;  
        header = newNode;  
        //若插入前是空表  
        if(tail == null){  
            tail = header;  
        }  
           
        size++;
    }
    
    // 在尾部插入元素  
    public void add(int element) {  
           
        //如果链表是空的  
        if(header == null){  
            header = new ListNode(element, null);  
            //只有一个节点，headwe,tail都该指向该节点  
            tail = header;  
        }  
        else{  
        	ListNode newNode = new ListNode(element, null);//创建新节点  
            tail.next = newNode;//尾节点的next指向新节点  
            tail = newNode;//将新节点作为尾节点  
        }  
        size++;  
    } 
    
    public void delete(int data) {
    	
    }
    
    // 返回链表的长度  
    public int length() {  
        return size;  
    }  
}
