package cf.tilgiz.codewars;

public class Cubes {
    public String isSumOfCubes(String s) {
        System.out.println(s);
        int sum = 0;
        String lucky = "";
        StringBuilder builder = new StringBuilder();
        for (String value : s.split(" ")) {
            String s2 = value.replaceAll("\\D", "");
            for (int j = 0; j < s2.length(); j += 3) {
                String substring = (j + 3 < s2.length()) ? s2.substring(j, j + 3) : s2.substring(j);
                if (isCubic(substring)) {
                    lucky = "Lucky";
                    builder.append(substring).append(" ");
                    sum += Integer.parseInt(substring);
                }
            }
        }
        if(lucky.isEmpty()) return "Unlucky";
        else return builder.append(sum).append(" ").append(lucky).toString();
    }

    public boolean isCubic(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 3);
        }
        return sum == Integer.parseInt(str);
    }
}
