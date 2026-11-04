package l;

import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18415 f5350;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f5351;

    public C1547(C18415 c18415, String str, boolean z) {
        List listM54899;
        int iIntValue;
        this.f5350 = c18415;
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int iGroupCount = c18415.matcher("").groupCount();
            Map mapM42932 = c18415.m42932();
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                char c = '$';
                if (cCharAt == '\\') {
                    i++;
                    if (i == str.length()) {
                        throw m5477();
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
                                throw m5477();
                            }
                            c = '\t';
                        }
                    }
                    sb.append(c);
                } else if (cCharAt == '$') {
                    int iIndexOf = i + 1;
                    if (iIndexOf == str.length()) {
                        throw m5477();
                    }
                    char cCharAt3 = str.charAt(iIndexOf);
                    if (cCharAt3 == '{') {
                        int i2 = i + 2;
                        iIndexOf = str.indexOf(q.h, i2);
                        if (iIndexOf < 0 || iIndexOf == i2) {
                            throw m5477();
                        }
                        String strSubstring = str.substring(i2, iIndexOf);
                        if (strSubstring.charAt(0) < '0' || strSubstring.charAt(0) > '9') {
                            Integer num = (Integer) mapM42932.get(strSubstring);
                            if (num == null) {
                                throw m5477();
                            }
                            iIntValue = num.intValue();
                        } else {
                            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                                if (strSubstring.charAt(i3) < '0' || strSubstring.charAt(i3) > '9') {
                                    throw m5477();
                                }
                            }
                            try {
                                iIntValue = Integer.parseInt(strSubstring);
                            } catch (NumberFormatException unused) {
                                throw m5477();
                            }
                        }
                    } else {
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            throw m5477();
                        }
                        iIntValue = cCharAt3 - '0';
                    }
                    if (iIntValue > iGroupCount) {
                        throw m5477();
                    }
                    if (sb.length() != 0) {
                        arrayList.add(new C14970(sb.toString(), -1));
                        sb.setLength(0);
                    }
                    arrayList.add(new C14970(null, iIntValue));
                    i = iIndexOf;
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            listM54899 = arrayList;
            if (sb.length() != 0) {
                arrayList.add(new C14970(sb.toString(), -1));
                listM54899 = arrayList;
            }
        } else {
            Object[] objArr = {new C14970(str, -1)};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            listM54899 = C24579.m54899(obj, arrayList2, obj, arrayList2);
        }
        this.f5351 = listM54899;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5276 m5478(String str, boolean z) throws C19446 {
        m5475();
        C4245 c4245Matcher = this.f5350.matcher((CharSequence) str);
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 20971520));
        int iEnd = 0;
        int i = 0;
        do {
            boolean zFind = c4245Matcher.find();
            m5475();
            if (c4245Matcher.m13557() || c4245Matcher.m13560()) {
                throw new C19446(EnumC12733.REGEX_FAILED);
            }
            if (!zFind) {
                break;
            }
            m5476(iEnd, c4245Matcher.start(), str, sb);
            for (C14970 c14970 : this.f5351) {
                m5475();
                if (c14970.f48886 < 0) {
                    m5476(0, c14970.f48887.length(), c14970.f48887, sb);
                } else {
                    int iStart = c4245Matcher.start(c14970.f48886);
                    if (iStart >= 0) {
                        m5476(iStart, c4245Matcher.end(c14970.f48886), str, sb);
                    }
                }
            }
            iEnd = c4245Matcher.end();
            i++;
        } while (!z);
        m5476(iEnd, str.length(), str, sb);
        m5475();
        return new C5276(sb.toString(), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5476(int i, int i2, String str, StringBuilder sb) throws C19446 {
        if ((((long) sb.length()) + ((long) i2)) - ((long) i) > 20971520) {
            throw new C19446(EnumC12733.RESULT_TOO_LARGE);
        }
        sb.append((CharSequence) str, i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m5477() {
        return new IllegalArgumentException("Invalid replacement template or unknown capture group.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5475() throws C19446 {
        if (Thread.currentThread().isInterrupted()) {
            throw new C19446(EnumC12733.CANCELED);
        }
    }
}
