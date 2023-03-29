import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("recording");
        Matcher matcher = pattern.matcher(
                "Once upon a time, there was a parrot named Polly who had a unique talent for imitating human speech. One day, while Polly was entertaining her owner's dinner guests with her impressive repertoire of voices, she suddenly blurted out, 'I can't believe you guys are eating this disgusting food!'' Everyone at the table was stunned, and the room fell silent. Then, Polly started laughing uncontrollably, causing the guests to burst into laughter as well. From that day forward, Polly became a celebrity in her town, appearing on talk shows, commercials, and even recording her own album of hilarious parrot noises. People would come from all over just to hear her speak, and Polly loved the attention. However, fame came at a price, and Polly soon realized that she had no privacy. Everywhere she went, people would stop and stare, asking her to repeat her famous phrase or mimic their own voices. Eventually, Polly decided to retire from the public eye and live out her days in peaceful solitude. But even in her quiet moments, she couldn't help but chuckle to herself, thinking back on her wild and crazy days as the world's most famous parrot.");
        boolean matchfound = matcher.find();

        if (matchfound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}