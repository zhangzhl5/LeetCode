package com.zhangzhl.thread;

public class ShenGongBao implements ITask {

	@Override
	public Boolean getPen() {
		return Painting.pen;
	}

	@Override
	public void openPainting() {
		 // ����һ���ӵ�ʱ��ʹ��Կ�״򿪽�ɽ���ͼ
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("�깫�����˽�ɽ���ͼ");
        Painting.pen = false;

	}

}
