package other;

import java.io.FileWriter;

public class OutFileInterImpl implements OutFileInter {
	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		
	}
	
	public void outFile(String msg) {
		//메세지를 파일로 저장
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(msg);
			writer.close();
			System.out.println("파일 저장 성공");
		} catch (Exception e) {
			System.out.println("outFile err : " + e);
		}
	}
}
