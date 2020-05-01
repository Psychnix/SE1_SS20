
public class Sort {
	//Variablen
	private static String[][] pattern = new String [][] {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
	
	public static boolean isWellSorted (String[] sequence){
		int a = pattern[0].length;
		
		for(int i1=0; i1<sequence.length; i1++) {
			String sequence_exemplar1 = sequence[i1];
			for(int i2=i1+1;i2<sequence.length;i2++) {
				String sequence_exemplar2 = sequence[i2];
				for(int j=0; j<a; j++) {
					if(sequence_exemplar1.contentEquals(pattern[j][1]) && sequence_exemplar2.contentEquals(pattern[j][0])) {
						return false;
					}
				}
			}
		}	
		return true;
	}
}
