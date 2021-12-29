package load;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import MemberClass.Person;
import data.Path;

public class PersonLoad {

	public ArrayList<Person> PersonRepository = new ArrayList<Person>();

	public void getPersonLoad() {
		try {
			
			String path = "D:\\JavaTest\\Gundol\\src\\data\\Person.dat";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;
			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");
				
				Person person = new Person();
				person.setCode(Integer.parseInt(temp[0]));
				person.setId(temp[1]);
				person.setPassWord(temp[2]);
				person.setRank(temp[3]);
				person.setName(temp[4]);
				person.setEnList(temp[5]);
				person.setTel(temp[6]);
				person.setBirth(temp[7]);
				person.setGrade(temp[8]);

				PersonRepository.add(person);

			}
			
			System.out.println("test");
			reader.close();
		} catch (Exception e) {

		}
	}

}