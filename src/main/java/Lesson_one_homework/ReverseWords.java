package Lesson_one_homework;

class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder outstr = new StringBuilder();
        int spaceidx = 0;
        int wordidx = 0;
        while (s.indexOf(" ", wordidx) != -1) {
            if (Character.isWhitespace(s.charAt(wordidx))) {
                wordidx = wordidx + 1;
            } else {
                spaceidx = s.indexOf(" ", wordidx);
                outstr.insert(0, " " + s.substring(wordidx, spaceidx));
                wordidx = spaceidx + 1;
            }
        }
        outstr.insert(0, s.substring(wordidx, s.length()));
        while (Character.isWhitespace(outstr.charAt(0))) {
            outstr.delete(0, 1);
        }
        return outstr.toString();
    }
}