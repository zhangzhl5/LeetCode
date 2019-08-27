package com.zhangzhl.thread;

public class NeZha implements ITask {

	@Override
	public Boolean getPen() {
		 return Painting.pen;
	}

	@Override
	public void openPainting() {
		 // 花费一秒钟的时间使用钥匙打开江山社稷图
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("哪吒打开了江山社稷图");
        Painting.pen = false;

	}

}
