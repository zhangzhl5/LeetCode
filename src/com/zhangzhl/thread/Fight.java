package com.zhangzhl.thread;

public class Fight {

	public static void main(String[] args) {
	

		new  Thread(new Runnable() {
			NeZha neZha = new NeZha();
				@Override
				public void run() {
//					try {
//						Thread.sleep(20);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					synchronized(Painting.class){
						try {
							Painting.class.wait(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   if (neZha.getPen()) {
			                neZha.openPainting();
			            } else {
			              System.out.println("��߸û�������ʡ�");
			            };
					}
					
				}
			}).start();
		new  Thread(new Runnable() {
			TaiYiZhenRen taiYiZhenRen = new TaiYiZhenRen();
				@Override
				public void run() {
					synchronized(Painting.class){
					  if (taiYiZhenRen.getPen()) {
			                taiYiZhenRen.openPainting();
			            } else {
			            	System.out.println("̫������û�������ʡ�");
			            }
					}
				}
			}).start();
		new  Thread(new Runnable() {
			AoBing aoBing = new AoBing();
				@Override
				public void run() {
					synchronized(Painting.class){
					  if (aoBing.getPen()) {
			                aoBing.openPainting();
			            } else {
			            	System.out.println("����û�������ʡ�");
			            }
					}
				}
			}).start();
		new  Thread(new Runnable() {
			ShenGongBao shenGongBao = new ShenGongBao();
				@Override
				public void run() {
					synchronized(Painting.class){
					 if (shenGongBao.getPen()) {
			                shenGongBao.openPainting();
			            } else {
			            	System.out.println("�깫��û�������ʡ�");
			            }
					}
				}
			}).start();
		
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
