package l;

import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes.dex */
public final class C23158 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14690 f75172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f75173;

    public C23158(C14690 c14690, String str, boolean z) {
        List listUnmodifiableList;
        int iIntValue;
        this.f75172 = c14690;
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int iGroupCount = c14690.matcher("").groupCount();
            Map mapM35221 = c14690.m35221();
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                char c = '$';
                if (cCharAt == '\\') {
                    i++;
                    if (i == str.length()) {
                        throw m51162();
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 != '$') {
                        if (cCharAt2 == '\\') {
                            c = '\\';
                        } else if (cCharAt2 == 'n') {
                            c = '\n';
                        } else if (cCharAt2 == 'r') {
                            c = '\r';
                        } else {
                            if (cCharAt2 != 't') {
                                throw m51162();
                            }
                            c = '\t';
                        }
                    }
                    sb.append(c);
                } else if (cCharAt == '$') {
                    int iIndexOf = i + 1;
                    if (iIndexOf == str.length()) {
                        throw m51162();
                    }
                    char cCharAt3 = str.charAt(iIndexOf);
                    if (cCharAt3 == '{') {
                        int i2 = i + 2;
                        iIndexOf = str.indexOf(q.h, i2);
                        if (iIndexOf < 0 || iIndexOf == i2) {
                            throw m51162();
                        }
                        String strSubstring = str.substring(i2, iIndexOf);
                        if (strSubstring.charAt(0) < '0' || strSubstring.charAt(0) > '9') {
                            Integer num = (Integer) mapM35221.get(strSubstring);
                            if (num == null) {
                                throw m51162();
                            }
                            iIntValue = num.intValue();
                        } else {
                            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                                if (strSubstring.charAt(i3) < '0' || strSubstring.charAt(i3) > '9') {
                                    throw m51162();
                                }
                            }
                            try {
                                iIntValue = Integer.parseInt(strSubstring);
                            } catch (NumberFormatException unused) {
                                throw m51162();
                            }
                        }
                    } else {
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            throw m51162();
                        }
                        iIntValue = cCharAt3 - '0';
                    }
                    if (iIntValue > iGroupCount) {
                        throw m51162();
                    }
                    if (sb.length() != 0) {
                        arrayList.add(new C13280(sb.toString(), -1));
                        sb.setLength(0);
                    }
                    arrayList.add(new C13280(null, iIntValue));
                    i = iIndexOf;
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            listUnmodifiableList = arrayList;
            if (sb.length() != 0) {
                arrayList.add(new C13280(sb.toString(), -1));
                listUnmodifiableList = arrayList;
            }
        } else {
            Object[] objArr = {new C13280(str, -1)};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            C13638.requireNonNull(obj);
            arrayList2.add(obj);
            listUnmodifiableList = C0561.unmodifiableList(arrayList2);
        }
        this.f75173 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6929 m51163(String str, boolean z) throws C1284 {
        m51160();
        C6222 c6222Matcher = this.f75172.matcher((CharSequence) str);
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 20971520));
        int iEnd = 0;
        int i = 0;
        do {
            boolean zFind = c6222Matcher.find();
            m51160();
            if (c6222Matcher.m17270() || c6222Matcher.m17258()) {
                throw new C1284(EnumC4106.REGEX_FAILED);
            }
            if (!zFind) {
                break;
            }
            m51161(iEnd, c6222Matcher.start(), str, sb);
            for (C13280 c13280 : this.f75173) {
                m51160();
                if (c13280.f44100 < 0) {
                    m51161(0, c13280.f44101.length(), c13280.f44101, sb);
                } else {
                    int iStart = c6222Matcher.start(c13280.f44100);
                    if (iStart >= 0) {
                        m51161(iStart, c6222Matcher.end(c13280.f44100), str, sb);
                    }
                }
            }
            iEnd = c6222Matcher.end();
            i++;
        } while (!z);
        m51161(iEnd, str.length(), str, sb);
        m51160();
        return new C6929(sb.toString(), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51161(int i, int i2, String str, StringBuilder sb) throws C1284 {
        if ((((long) sb.length()) + ((long) i2)) - ((long) i) > 20971520) {
            throw new C1284(EnumC4106.RESULT_TOO_LARGE);
        }
        sb.append((CharSequence) str, i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m51162() {
        return new IllegalArgumentException("Invalid replacement template or unknown capture group.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51160() throws C1284 {
        if (Thread.currentThread().isInterrupted()) {
            throw new C1284(EnumC4106.CANCELED);
        }
    }
}
