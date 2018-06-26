package sixteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ragaman {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String origWord = input.nextLine();
		String compWord = input.nextLine();

		// System.out.println(origWord);
		// System.out.println(compWord);
		assert origWord.length() == compWord.length();
		ArrayList<String> uniqCharsOne = new ArrayList<String>();
		ArrayList<String> uniqCharsTwo = new ArrayList<String>();
		ArrayList<Integer> countOne = new ArrayList<Integer>();
		ArrayList<Integer> countTwo = new ArrayList<Integer>();
		for (int i = 0; i < origWord.length(); i++) {

			String charOW = Character.toString(origWord.charAt(i));
			String charCW = Character.toString(compWord.charAt(i));

			if (!uniqCharsOne.contains(charOW)) {
				uniqCharsOne.add(charOW);
				countOne.add(1);
			} else {
				int freqAdd = uniqCharsOne.indexOf(charOW);
				countOne.set(freqAdd, countOne.get(freqAdd) + 1);
			}

			if (!uniqCharsTwo.contains(charCW)) {

				if (!charCW.equals("*")) { // 0 -> 1
					uniqCharsTwo.add(charCW);
					countTwo.add(1);
				}
			} else {
				int freqAdd = uniqCharsTwo.indexOf(charCW);
				countTwo.set(freqAdd, countTwo.get(freqAdd) + 1);
			}

		}

		// System.out.println(uniqCharsOne);
		// System.out.println(countOne);
		// System.out.println(uniqCharsTwo);
		// System.out.println(countTwo);
		String toPrint = "";
		for (int i = 0; i < uniqCharsTwo.size(); i++) {
			int freqToComp = countTwo.get(i);

			int otherInd = uniqCharsOne.indexOf(uniqCharsTwo.get(i));
			if (otherInd == -1) {
				toPrint = "N";
				break;
			} else {
				int origFreq = countOne.get(otherInd);

				if (freqToComp <= origFreq) {
					toPrint = "A";
				} else {
					toPrint = "N";
					break;
				}
			}

		}

		if (toPrint.equals("")) {
			toPrint = "A";
		}

		System.out.print(toPrint);

	}

}
