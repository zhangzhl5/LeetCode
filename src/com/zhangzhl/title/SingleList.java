package com.zhangzhl.title;

/**
 * java ʵ�ֵ��б�
 * @author zhangzhl
 *
 */
public class SingleList {
	
	// ͷ���  
    private ListNode header;
    // β�ڵ�  
    private ListNode tail;
    // �����Ѻ��еĽڵ���
    private int size; 
    // �޲ι��캯��
    public SingleList() {
    	this.header = null;
    	this.tail = null;
    }
    
    // ��ָ������Ԫ�ش�������ֻ��һ��Ԫ��  
    public SingleList(int element) {  
   
        header = new ListNode(element, null);  
        // ֻ��һ���ڵ㣬header,tail��ָ��ýڵ�  
        tail = header;  
        size++;  
    }  
    
    
    //ͷ������  
    public void addHeadNode(int data){
        //�����½ڵ㣬���½ڵ��nextָ��header  
        //�����½ڵ���Ϊ�µ�header  
    	ListNode newNode = new ListNode(data, null);  
        newNode.next = header;  
        header = newNode;  
        //������ǰ�ǿձ�  
        if(tail == null){  
            tail = header;  
        }  
           
        size++;
    }
    
    // ��β������Ԫ��  
    public void add(int element) {  
           
        //��������ǿյ�  
        if(header == null){  
            header = new ListNode(element, null);  
            //ֻ��һ���ڵ㣬headwe,tail����ָ��ýڵ�  
            tail = header;  
        }  
        else{  
        	ListNode newNode = new ListNode(element, null);//�����½ڵ�  
            tail.next = newNode;//β�ڵ��nextָ���½ڵ�  
            tail = newNode;//���½ڵ���Ϊβ�ڵ�  
        }  
        size++;  
    } 
    
    public void delete(int data) {
    	
    }
    
    // ��������ĳ���  
    public int length() {  
        return size;  
    }  
}
