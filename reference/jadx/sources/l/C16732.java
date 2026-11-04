package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܺۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16732 implements Closeable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final BufferedReader f54026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f54029;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f54028 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f54025 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f54027 = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedReader bufferedReader = this.f54026;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    public C16732(BufferedReader bufferedReader) {
        this.f54026 = bufferedReader;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m39504() {
        if (this.f54025 < this.f54029.length()) {
            return this.f54029.codePointAt(this.f54025);
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m39497(int i) {
        if (this.f54025 + i < this.f54029.length()) {
            return this.f54029.charAt(this.f54025 + i);
        }
        return '\n';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39501(char c) {
        if (this.f54025 >= this.f54029.length()) {
            throw new C24938(this, "Expected '" + c + "'", true);
        }
        if (m39507() == c) {
            return;
        }
        throw new C24938(this, "Expected '" + c + "'", false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m39506() {
        while (this.f54025 < this.f54029.length() && C21338.m48567(m39504())) {
            m39503();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m39503() {
        try {
            this.f54025 += Character.charCount(this.f54029.codePointAt(this.f54025));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C24938(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private char m39507() {
        try {
            String str = this.f54029;
            int i = this.f54025;
            this.f54025 = i + 1;
            return str.charAt(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C24938(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m39502() throws IOException {
        char cCharAt;
        this.f54025 = 0;
        loop0: while (true) {
            this.f54028++;
            String line = this.f54026.readLine();
            this.f54029 = line;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C21338.m48567(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        return this.f54029 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39510(C8289 c8289) throws IOException {
        C17478 c17478;
        AbstractC1817 c15240;
        Object objM39499;
        String[] strArr;
        char cCharAt;
        loop0: while (true) {
            String line = this.f54026.readLine();
            this.f54029 = line;
            this.f54028++;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C21338.m48567(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        while (this.f54029 != null) {
            m39506();
            String strM39500 = m39500(false);
            m39506();
            if (strM39500.endsWith("package-info")) {
                m39502();
            } else {
                if (strM39500.endsWith("-") && m39497(0) == ">".charAt(0)) {
                    m39507();
                    strM39500 = C1402.m5124(1, 0, strM39500);
                } else {
                    m39506();
                    if (m39497(0) == '-' && m39497(1) == '>') {
                        m39507();
                        m39507();
                    }
                }
                m39506();
                String strM39501 = m39500(false);
                m39506();
                char c = ':';
                m39501(':');
                C21954 c21954M22383 = c8289.m22383(strM39501, strM39500);
                m39506();
                if (this.f54029.length() != this.f54025) {
                    throw new C24938(this, "Expected end of line", false);
                }
                if (m39502()) {
                    C11511 c11511 = null;
                    C11511 c11512 = null;
                    C17478 c17479 = null;
                    while (C21338.m48567(m39504())) {
                        m39506();
                        Object objM394910 = m39499();
                        if (objM394910 == null) {
                            c17478 = null;
                        } else {
                            if (!(objM394910 instanceof C17478)) {
                                throw new C24938(this, String.format("Invalid obfuscated line number range (%s).", objM394910), false);
                            }
                            m39506();
                            m39501(c);
                            c17478 = (C17478) objM394910;
                        }
                        m39506();
                        String strM39502 = m39500(true);
                        boolean z = false;
                        while (this.f54025 < this.f54029.length() && C21338.m48567(m39504())) {
                            z = z || m39504() != 65279;
                            m39503();
                        }
                        if (!z) {
                            throw new C24938(this, "Expected whitespace", true);
                        }
                        int i2 = this.f54025;
                        m39509(true);
                        while (m39497(0) == '.') {
                            m39507();
                            m39509(true);
                        }
                        String strSubstring = this.f54029.substring(i2, this.f54025);
                        HashMap map = this.f54027;
                        if (map.containsKey(strSubstring)) {
                            strSubstring = (String) map.get(strSubstring);
                        } else {
                            map.put(strSubstring, strSubstring);
                        }
                        m39506();
                        if (m39497(0) == '(') {
                            m39507();
                            m39506();
                            if (m39497(0) == ')') {
                                strArr = new String[0];
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(m39500(true));
                                m39506();
                                while (m39497(0) != ')') {
                                    m39506();
                                    m39501(',');
                                    m39506();
                                    linkedList.add(m39500(true));
                                }
                                strArr = (String[]) linkedList.toArray(new String[0]);
                            }
                            m39501(')');
                            c15240 = new C13003(strSubstring, strM39502, strArr);
                        } else {
                            c15240 = new C15240(strSubstring, strM39502);
                        }
                        m39506();
                        if (m39497(0) == ':') {
                            m39507();
                            m39506();
                            objM39499 = m39499();
                            if (objM39499 == null) {
                                throw new C24938(this, "No number follows the colon after the method signature.", false);
                            }
                        } else {
                            objM39499 = null;
                        }
                        if (c17478 == null && objM39499 != null) {
                            throw new C24938(this, "No mapping for original range " + objM39499 + ".", false);
                        }
                        m39506();
                        m39501('-');
                        m39501('>');
                        m39506();
                        int i3 = this.f54025;
                        m39509(true);
                        while (m39497(0) == '.') {
                            m39507();
                            m39509(true);
                        }
                        String strSubstring2 = this.f54029.substring(i3, this.f54025);
                        if (map.containsKey(strSubstring2)) {
                            strSubstring2 = (String) map.get(strSubstring2);
                        } else {
                            map.put(strSubstring2, strSubstring2);
                        }
                        if (c15240 instanceof C13003) {
                            c21954M22383.m49684(c17478, (C13003) c15240, objM39499, strSubstring2);
                        }
                        if (c11512 != null) {
                            boolean zEquals = c11512.f36226.f6169.equals(strSubstring2);
                            boolean zEquals2 = C17359.equals(c17479, c17478);
                            if ((!zEquals || c17479 == null || !zEquals2) && (c11511 == null || !c11511.f36227.equals(c11512.f36227))) {
                                c21954M22383.m49683(c11512);
                                c11511 = c11512;
                            }
                        }
                        c11512 = new C11511(c15240, strSubstring2);
                        if (this.f54029.length() != this.f54025) {
                            throw new C24938(this, "Expected end of line", false);
                        }
                        if (!m39502()) {
                            c17479 = c17478;
                            break;
                        } else {
                            c17479 = c17478;
                            c = ':';
                        }
                    }
                    if (c11512 != null) {
                        boolean z2 = c11511 == null || !c11511.f36227.equals(c11512.f36227);
                        if (c17479 == null || z2) {
                            c21954M22383.m49683(c11512);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39509(boolean z) {
        boolean z2;
        if (z && m39497(0) == '<') {
            m39507();
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C8398.m22568(m39504()) && m39504() != 63) {
            throw new C24938(this, "Identifier expected", false);
        }
        m39503();
        while (true) {
            if (!C8398.m22568(m39504()) && m39504() != 63) {
                break;
            } else {
                m39503();
            }
        }
        if (z2) {
            m39501('>');
        }
        if (C8398.m22568(m39504())) {
            throw new C24938(this, "End of identifier expected (was 0x" + Integer.toHexString(m39504()) + MotionUtils.EASING_TYPE_FORMAT_END, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m39500(boolean z) {
        int i = this.f54025;
        m39509(false);
        while (m39497(0) == '.') {
            m39507();
            m39509(false);
        }
        if (z) {
            while (m39497(0) == '[') {
                m39507();
                m39501(']');
            }
        }
        String strSubstring = this.f54029.substring(i, this.f54025);
        HashMap map = this.f54027;
        if (map.containsKey(strSubstring)) {
            return (String) map.get(strSubstring);
        }
        map.put(strSubstring, strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m39499() {
        char cM39497 = m39497(0);
        if ('0' > cM39497 || cM39497 > '9') {
            return null;
        }
        int iM39505 = m39505();
        m39506();
        if (m39497(0) != ':') {
            return Integer.valueOf(iM39505);
        }
        m39501(':');
        m39506();
        return new C17478(iM39505, m39505());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m39505() {
        char cM39497;
        char cM39498 = m39497(0);
        if ('0' > cM39498 || cM39498 > '9') {
            throw new C24938(this, "Number expected", false);
        }
        int numericValue = 0;
        do {
            numericValue = (numericValue * 10) + Character.getNumericValue(m39507());
            cM39497 = m39497(0);
            if ('0' > cM39497) {
                break;
            }
        } while (cM39497 <= '9');
        return numericValue;
    }
}
