package org.APCSLowell;

/*Pig Latin*/
public int findFirstVowel(String sWord)
//precondition: sWord is a valid String of length greater than 0.
//postcondition: returns the position of the first vowel in sWord.  If there //are no vowels, returns -1
{
	for (int i = 0; i < sWord.length(); i++){
		if (sWord.substring(i,i+1).equals('a'),sWord.substring(i,i+1).equals('e'),sWord.substring(i,i+1).equals('i'),sWord.substring(i,i+1).equals('o'),sWord.substring(i,i+1).equals('u')){
			return i;
		}
	}
	return -1;
}

public String pigLatin(String sWord)
//precondition: sWord is a valid String of length greater than 0
//postcondition: returns the pig latin equivalent of sWord
{
	if(findFirstVowel(sWord) == -1){
	return sWord + "ay";
}	else if (findFirtsVowel(sWord) == 0){
	return sWord + "way";
} else if (sWord.substring(0,1).equals('q') && sWord.substring(1,2).equals('u')){
	return sWord.substring(2) + sWord.substring(0,2) + "ay";
}else return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
