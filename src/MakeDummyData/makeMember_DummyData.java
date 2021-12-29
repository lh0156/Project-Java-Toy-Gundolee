package MakeDummyData;

import java.util.Random;

public class makeMember_DummyData {
	public static void main(String[] args) {
		Random random = new Random();
		
		String input = "";
		String[] firstName = {"김", "이", "박", "최", "강", "조", "윤", "장", "임"
				, "한", "오", "서", "신", "권", "황", "안", "송", "류", "전", "홍"
				, "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심"
				, "노", "정", "하", "곽", "성", "차", "주", "우", "구", "신", "임"
				, "라", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방"
				, "강", "현", "함", "변", "염", "양", "변", "여", "추", "노", "도"
				, "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위"
				, "표", "명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제"
				, "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구"
				, "용", "유", "예", "경", "봉", "정", "석", "사", "부", "황", "가"
				,"복", "태", "목", "진", "형", "계", "최", "피", "두", "지", "감"
				,"장", "제", "음", "빈", "동", "온", "공", "호", "경", "범"};
		
		String[] twoAndThreeName = {"다", "솜", "현", "식", "윤", "섭", "창", "현", "감",
				"지", "훈", "채", "은", "소", "정", "민", "종", "수", "연", "채", "윤", "경", "환",
				"주", "영", "현", "범", "정", "석", "기", "용", "호", "용", "다", "영", "하",
				"연", "영", "문", "동", "우", "아", "란", "미", "성"};
		
		String[] rank = {"병장", "상병", "일병", "이병"};
		
		String[] year = {"2019", "2020", "2021"};
		String[] month = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String[] day = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10"
		,"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
		,"21", "22", "23", "24", "25", "26", "27", "28"};
		
		String[] phoneNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		
		String[] birthYear = {"1994", "1995", "1996", "1997", "1998", "1999", "2000"};
		
		String[] passWord = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"
				, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"
				, "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		String[] specialSimbol = {"!", "@", "#", "$", "%"};
		
		String[] grade = {"평간부", "인사과 간부", "군수과 간부", "용사"};
		
		int ArmyNumber = 77260011;
		
		for(int i=8; i<1001; ++i){
			input = String.format("%05d,%d,%s,%s,%s,%s,%s,%s,%s"
					, i
					, ArmyNumber
					, passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]
							+passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]+passWord[random.nextInt(passWord.length)]+specialSimbol[random.nextInt(specialSimbol.length)]						
					,rank[random.nextInt(rank.length)]
					,firstName[random.nextInt(firstName.length)]+twoAndThreeName[random.nextInt(twoAndThreeName.length)]+twoAndThreeName[random.nextInt(twoAndThreeName.length)]
					,year[random.nextInt(year.length)]+"-"+month[random.nextInt(month.length)]+"-"+day[random.nextInt(day.length)]
					,"010"+"-"+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]
					+"-"+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]+phoneNumber[random.nextInt(phoneNumber.length)]
					,birthYear[random.nextInt(birthYear.length)]+"-"+month[random.nextInt(month.length)]+"-"+day[random.nextInt(day.length)]
					,PersonGrade.valueOf("Warrior"));
					
					
			System.out.println(input);
			ArmyNumber++;
		}
		
		
	}
	


}
