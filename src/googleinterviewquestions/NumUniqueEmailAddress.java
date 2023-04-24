package googleinterviewquestions;

import java.util.HashSet;
import java.util.Set;

/**
 * Overview
 *
 * We need to clean the emails given to us. The most intuitive solution will be to iterate over the emails and clean them one by one.
 * Here, cleaning the email means removing unnecessary characters, per the rules given to us. Once an email has been cleaned, it can be pushed into a hash set. The size of this hash set will then equal the count of unique emails.
 *
 *
 * Rules to clean email:
 *
 * If there are periods '.' in local name ignore them.
 * If there is a plus '+' in local name skip all local name characters till '@'.
 * There is only one '@' symbol and the substring after it is our domain name; we will keep the domain name as it is.
 * Approach 1: Linear Iteration
 *
 * Intuition
 *
 * We can iterate over an email from left to right, and add characters to local name until a '+' occurs, then we can skip all characters until '@' occurs, then we can again start appending the characters till the end of the email string to form the domain name.
 *
 * Notice that per the rules, we do not need to read any characters between the first '+' and '@'. While checking each character from left to right, after finding the first '+' in the local name we can directly find the domain name by switching to a reverse iteration as there is only one '@' and we will skip all characters in between '+' and '@'.
 *
 * This reduces the number of characters iterated, but the overall order time complexity remains the same.
 *
 * For example, consider email = ab.c+abcdefghijklmnopqrstuvwxyz@leetcode.com.
 * Performing a linear scan from left to right, we will traverse all the characters in the given email.
 * Using the method proposed above, we can skip the characters from index 5 to index 30, thus saving time.
 *  However, keep in mind that because we read the domain name from right to left, we must also reverse the domain name before appending it to the local name. Thus, this improvement will be less effective when the domain name is long compared to the number of characters skipped.
 *
 * Algorithm
 *
 * For each email present in the emails array:
 * Iterate over the characters in the email and append each character to the local name if it is not '.'.
 * If the character is '+', do not append the character and break out of the loop.
 * Find the domain name using reverse traversal in the given email and append it to the string formed till now.
 * After cleaning the email insert it into the hash set.
 * Return the size of the hash set.
 */
public class NumUniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder cleanMail = new StringBuilder();

            for (int i = 0; i < email.length(); i ++) {
                char currChar = email.charAt(i);

                if (currChar == '+' || currChar == '@') {
                    break;
                }

                if (currChar != '.') {
                    cleanMail.append(currChar);
                }
            }

            StringBuilder domainName = new StringBuilder();

            for (int i = email.length() - 1; i >= 0; i --) {
                char currChar = email.charAt(i);
                domainName.append(currChar);
                if (currChar == '@') {
                    break;
                }
            }

            domainName = domainName.reverse();
            cleanMail.append(domainName);
            uniqueEmails.add(cleanMail.toString());

        }
        return  uniqueEmails.size();
    }


    public static void main(String[] args) {
        //System.out.println('a' == '@');
        System.out.println();
    }









}
