package org.APCSLowell;

public int findFirstVowel(String sWord){
	for (int j = 0; j < sWord.length(); j++){
		if (sWord.substring(j,j+1).equals("a") || sWord.substring(j,j+1).equals("e") || sWord.substring(j,j+1).equals("i") || sWord.substring(j,j+1).equals("o") || sWord.substring(j,j+1).equals("u")){
			return i;
		}
	}
	return -1;
}

public String pigLatin(String sWord){
    int position = findFirstVowel(sWord);
if (sWord.length() == 1){
	if (position == 0){
		return sWord + "way";
	}else if (position == -1){
		return sWord + "ay";
	}
}else
if(position == 1 && sWord.substring(0,1).equals("q") && sWord.substring(1,2).equals("u")){
	return sWord.substring(2) + "quay";
}else if (position == 0){
	return sWord + "way";
}else if (position > 0){
    return sWord.substring(position) + sWord.substring(0,position) + "ay";
}else if (position == -1){
	return sWord + "ay";
}
}
