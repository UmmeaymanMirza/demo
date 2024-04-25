public class StringDecompressor {

    public static String decompress(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Find the number of repetitions
                int start = i;
                System.out.println("start:==>"+start);
                while (Character.isDigit(input.charAt(i + 1))) {
                    System.out.println("in while :==>"+i++);
                    i++;
                }
                int repetitions = Integer.parseInt(input.substring(start, i + 1));
                System.out.println("in repetitions :==>"+input.substring(start, i + 1));
                System.out.println("in repetitions :==>"+repetitions);
                System.out.println("in repetitions i:==>"+i);
                // Move past '['
                i += 2;
                System.out.println("in repetitions out i:==>"+i);

                // Find the substring inside brackets
                int startBracket = i;
                int bracketCount = 1;

                System.out.println("startBracket:==>"+startBracket);
                System.out.println("bracketCount:==>"+bracketCount);

                while (bracketCount > 0) {
                    i++;
                    if (input.charAt(i) == '[') {
                        bracketCount++;
                    } else if (input.charAt(i) == ']') {
                        bracketCount--;
                    }
                }

                // Recursively decompress the substring inside brackets
                String substring = decompress(input.substring(startBracket, i));
                System.out.println("substring:==>"+substring);

                // Append the decompressed substring to the result
                for (int j = 0; j < repetitions; j++) {
                    result.append(substring);
                }

                // Move past ']'
                i++;
            } else {
                // If the current character is not a digit, simply append it to the result
                result.append(currentChar);
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String compressedString = "3[abc]4[ab]c";
        String decompressedString = decompress(compressedString);
        System.out.println(decompressedString);
    }
}
