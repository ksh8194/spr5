package pack;

import other.OutFileInter;

public class MessageImpl implements MessageInter{
	private String msg1,msg2; //생성자 주입용
	private int year;
	private MyInfo myInfo;
	
	private String spec;
	
	
	private OutFileInter fileInter;
	
	
	public MessageImpl(String msg1, String msg2, int year ,MyInfo myInfo) { //생성자로 주입
		this.msg1 = msg1;
		this.msg2 = msg2;
		this.year = year;
		this.myInfo = myInfo;
		// TODO Auto-generated constructor stub
	}
	
	public void setSpec(String spec) { //setter주입
		this.spec = spec;
	}
	
	public void setFileInter(OutFileInter fileInter) {
		this.fileInter = fileInter;
	}
	
	public void sayHi() { //출력 담당
		String message = msg1 + " " + msg2;
		message += (year + 19) + "년" + "\n"+ myInfo.myData();
		message += "\n" + spec;
		
		
		System.out.println(message);
		
		//위 메시지를 파일로 저장
		fileInter.outFile(message);
		
	}
}
