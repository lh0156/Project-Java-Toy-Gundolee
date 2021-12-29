package MakeDummyData;

import java.util.Random;

public class maekWeapon_DummyData {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
//		String[] name = {"K2C1 소총,3.28", "K1 기관단총,2.88", "K3 경기관총,6.86","K2 권총,0.85", "루비 권총,0.85"
//				, "TK 권총,0.423", "77식 권총,0.5","29M 권총,0.5", "베홀라 권총,0.7", "", "", "", "", "", "", "",}; 
		
		String[] firstName = {"K", "KA", "A", "SE", "PRS", "MLRS", "KGGB", "QSDS", "QRG", "S"};
		String[] secondName = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String[] threeName = {"소총", "권총", "박격포", "대전차포", "방독면", "보병전투차량", "로켓발사대", "저격소총"
				,"미사일", "중기관총", "자주곡사포", "장갑차", "장애물개척전차", "사격지휘장갑차", "고속유탄기관총"};
		
		
		
		
		String [] state = {"운용 중", "운용 대기 중", "수리 중"};
		
		
		String [] reasonPart = {"부품", "가늠자", "노리쇠", "감시장비", "광학장비"};
		
		String [] reason = {"파손", "불량", "분실", "절삭", "손실"};
		
		
		
		for(int i=0; i<2000; ++i) {
		
			String result = String.format("%05d,%s,%s,%s,%s,%s"
					, i
					, firstName[random.nextInt(firstName.length)]+secondName[random.nextInt(secondName.length)]+secondName[random.nextInt(secondName.length)]+threeName[random.nextInt(threeName.length)]
					, secondName[random.nextInt(secondName.length)]+secondName[random.nextInt(secondName.length)]+"KG"
					, state[random.nextInt(state.length)]
					, reasonPart[random.nextInt(reasonPart.length)] + " "+ reason[random.nextInt(reason.length)]);
			System.out.println(result);
			
		}
		
		
	}
	
}
