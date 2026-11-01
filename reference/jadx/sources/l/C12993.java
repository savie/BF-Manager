package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12993 implements Closeable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final BufferedReader f43329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f43332;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f43328 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f43331 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f43330 = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedReader bufferedReader = this.f43329;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    public C12993(BufferedReader bufferedReader) {
        this.f43329 = bufferedReader;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m32122() {
        if (this.f43331 < this.f43332.length()) {
            return this.f43332.codePointAt(this.f43331);
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m32124(int i) {
        if (this.f43331 + i < this.f43332.length()) {
            return this.f43332.charAt(this.f43331 + i);
        }
        return '\n';
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32131(char c) {
        if (this.f43331 >= this.f43332.length()) {
            throw new C0997(this, "Expected '" + c + "'", true);
        }
        if (m32128() == c) {
            return;
        }
        throw new C0997(this, "Expected '" + c + "'", false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32133() {
        while (this.f43331 < this.f43332.length() && C12123.m30168(m32122())) {
            m32123();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32123() {
        try {
            this.f43331 += Character.charCount(this.f43332.codePointAt(this.f43331));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C0997(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private char m32128() {
        try {
            String str = this.f43332;
            int i = this.f43331;
            this.f43331 = i + 1;
            return str.charAt(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C0997(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m32129() throws IOException {
        char cCharAt;
        this.f43331 = 0;
        loop0: while (true) {
            this.f43328++;
            String line = this.f43329.readLine();
            this.f43332 = line;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C12123.m30168(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        return this.f43332 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32135(C6246 c6246) throws IOException {
        C3819 c3819;
        AbstractC5231 c13699;
        Object objM32126;
        String[] strArr;
        char cCharAt;
        loop0: while (true) {
            String line = this.f43329.readLine();
            this.f43332 = line;
            this.f43328++;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C12123.m30168(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        while (this.f43332 != null) {
            m32133();
            String strM32127 = m32127(false);
            m32133();
            if (strM32127.endsWith("package-info")) {
                m32129();
            } else {
                if (strM32127.endsWith("-") && m32124(0) == ">".charAt(0)) {
                    m32128();
                    strM32127 = C20630.m46498(1, 0, strM32127);
                } else {
                    m32133();
                    if (m32124(0) == '-' && m32124(1) == '>') {
                        m32128();
                        m32128();
                    }
                }
                m32133();
                String strM32128 = m32127(false);
                m32133();
                char c = ':';
                m32131(':');
                C2012 c2012M17308 = c6246.m17308(strM32128, strM32127);
                m32133();
                if (this.f43332.length() != this.f43331) {
                    throw new C0997(this, "Expected end of line", false);
                }
                if (m32129()) {
                    C22165 c22165 = null;
                    C22165 c22166 = null;
                    C3819 c38110 = null;
                    while (C12123.m30168(m32122())) {
                        m32133();
                        Object objM32127 = m32126();
                        if (objM32127 == null) {
                            c3819 = null;
                        } else {
                            if (!(objM32127 instanceof C3819)) {
                                throw new C0997(this, String.format("Invalid obfuscated line number range (%s).", objM32127), false);
                            }
                            m32133();
                            m32131(c);
                            c3819 = (C3819) objM32127;
                        }
                        m32133();
                        String strM32129 = m32127(true);
                        boolean z = false;
                        while (this.f43331 < this.f43332.length() && C12123.m30168(m32122())) {
                            z = z || m32122() != 65279;
                            m32123();
                        }
                        if (!z) {
                            throw new C0997(this, "Expected whitespace", true);
                        }
                        int i2 = this.f43331;
                        m32132(true);
                        while (m32124(0) == '.') {
                            m32128();
                            m32132(true);
                        }
                        String strSubstring = this.f43332.substring(i2, this.f43331);
                        HashMap map = this.f43330;
                        if (map.containsKey(strSubstring)) {
                            strSubstring = (String) map.get(strSubstring);
                        } else {
                            map.put(strSubstring, strSubstring);
                        }
                        m32133();
                        if (m32124(0) == '(') {
                            m32128();
                            m32133();
                            if (m32124(0) == ')') {
                                strArr = new String[0];
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(m32127(true));
                                m32133();
                                while (m32124(0) != ')') {
                                    m32133();
                                    m32131(',');
                                    m32133();
                                    linkedList.add(m32127(true));
                                }
                                strArr = (String[]) linkedList.toArray(new String[0]);
                            }
                            m32131(')');
                            c13699 = new C11582(strSubstring, strM32129, strArr);
                        } else {
                            c13699 = new C13699(strSubstring, strM32129);
                        }
                        m32133();
                        if (m32124(0) == ':') {
                            m32128();
                            m32133();
                            objM32126 = m32126();
                            if (objM32126 == null) {
                                throw new C0997(this, "No number follows the colon after the method signature.", false);
                            }
                        } else {
                            objM32126 = null;
                        }
                        if (c3819 == null && objM32126 != null) {
                            throw new C0997(this, "No mapping for original range " + objM32126 + ".", false);
                        }
                        m32133();
                        m32131('-');
                        m32131('>');
                        m32133();
                        int i3 = this.f43331;
                        m32132(true);
                        while (m32124(0) == '.') {
                            m32128();
                            m32132(true);
                        }
                        String strSubstring2 = this.f43332.substring(i3, this.f43331);
                        if (map.containsKey(strSubstring2)) {
                            strSubstring2 = (String) map.get(strSubstring2);
                        } else {
                            map.put(strSubstring2, strSubstring2);
                        }
                        if (c13699 instanceof C11582) {
                            c2012M17308.m6481(c3819, (C11582) c13699, objM32126, strSubstring2);
                        }
                        if (c22166 != null) {
                            boolean zEquals = c22166.f72502.f18142.equals(strSubstring2);
                            boolean zEquals2 = C13638.equals(c38110, c3819);
                            if ((!zEquals || c38110 == null || !zEquals2) && (c22165 == null || !c22165.f72503.equals(c22166.f72503))) {
                                c2012M17308.m6479(c22166);
                                c22165 = c22166;
                            }
                        }
                        c22166 = new C22165(c13699, strSubstring2);
                        if (this.f43332.length() != this.f43331) {
                            throw new C0997(this, "Expected end of line", false);
                        }
                        if (!m32129()) {
                            c38110 = c3819;
                            break;
                        } else {
                            c38110 = c3819;
                            c = ':';
                        }
                    }
                    if (c22166 != null) {
                        boolean z2 = c22165 == null || !c22165.f72503.equals(c22166.f72503);
                        if (c38110 == null || z2) {
                            c2012M17308.m6479(c22166);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32132(boolean z) {
        boolean z2;
        if (z && m32124(0) == '<') {
            m32128();
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C0735.m3198(m32122()) && m32122() != 63) {
            throw new C0997(this, "Identifier expected", false);
        }
        m32123();
        while (true) {
            if (!C0735.m3198(m32122()) && m32122() != 63) {
                break;
            } else {
                m32123();
            }
        }
        if (z2) {
            m32131('>');
        }
        if (C0735.m3198(m32122())) {
            throw new C0997(this, "End of identifier expected (was 0x" + Integer.toHexString(m32122()) + MotionUtils.EASING_TYPE_FORMAT_END, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m32127(boolean z) {
        int i = this.f43331;
        m32132(false);
        while (m32124(0) == '.') {
            m32128();
            m32132(false);
        }
        if (z) {
            while (m32124(0) == '[') {
                m32128();
                m32131(']');
            }
        }
        String strSubstring = this.f43332.substring(i, this.f43331);
        HashMap map = this.f43330;
        if (map.containsKey(strSubstring)) {
            return (String) map.get(strSubstring);
        }
        map.put(strSubstring, strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m32126() {
        char cM32124 = m32124(0);
        if ('0' > cM32124 || cM32124 > '9') {
            return null;
        }
        int iM32134 = m32134();
        m32133();
        if (m32124(0) != ':') {
            return Integer.valueOf(iM32134);
        }
        m32131(':');
        m32133();
        return new C3819(iM32134, m32134());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m32134() {
        char cM32124;
        char cM32125 = m32124(0);
        if ('0' > cM32125 || cM32125 > '9') {
            throw new C0997(this, "Number expected", false);
        }
        int numericValue = 0;
        do {
            numericValue = (numericValue * 10) + Character.getNumericValue(m32128());
            cM32124 = m32124(0);
            if ('0' > cM32124) {
                break;
            }
        } while (cM32124 <= '9');
        return numericValue;
    }
}
