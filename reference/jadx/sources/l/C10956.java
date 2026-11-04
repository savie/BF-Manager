package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۤܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10956 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f34626 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14763 f34625 = new C14763();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27790(String str) throws C10254, IOException {
        (str != null ? Integer.valueOf(str.length()) : "null").toString();
        if ((str == null || str.length() >= 500) && str != null) {
            str.substring(0, 500);
        }
        C14763 c14763 = this.f34625;
        c14763.clear();
        StringBuilder sb = this.f34626;
        sb.setLength(0);
        C19205 c19205 = new C19205();
        c19205.m44493(new StringReader(str));
        for (int iM44502 = c19205.m44502(); iM44502 != 1; iM44502 = c19205.m44501()) {
            if (iM44502 == 4) {
                String strM44508 = c19205.m44508();
                if (strM44508 != null) {
                    m27788(strM44508);
                }
                if (strM44508 != null && !strM44508.isEmpty()) {
                    int iM44497 = c19205.m44497();
                    sb.length();
                    c14763.getClass();
                    for (int i = 0; i < strM44508.length(); i++) {
                        char cCharAt = strM44508.charAt(i);
                        sb.append(cCharAt);
                        c14763.add(iM44497 + i);
                        if (strM44508.length() <= 50) {
                            sb.length();
                            m27787(cCharAt);
                        }
                    }
                    if (strM44508.length() > 50) {
                        sb.length();
                        sb.length();
                    }
                }
            }
        }
        sb.length();
        c14763.getClass();
        if (sb.length() < 200) {
            m27788(sb.toString());
        } else {
            m27788(sb.substring(0, 200));
        }
        if (c14763.isEmpty()) {
            return;
        }
        int iMin = Math.min(c14763.size(), 50);
        for (int i2 = 0; i2 < iMin; i2++) {
            c14763.getInt(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27789(int i) {
        C14763 c14763 = this.f34625;
        c14763.getClass();
        if (i < 0) {
            return -1;
        }
        if (i == c14763.size()) {
            if (c14763.isEmpty()) {
                return 0;
            }
            return c14763.getInt(c14763.size() - 1) + 1;
        }
        if (i > c14763.size()) {
            c14763.getClass();
            return -1;
        }
        int i2 = c14763.getInt(i);
        StringBuilder sb = this.f34626;
        m27787(i < sb.length() ? sb.charAt(i) : '?');
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m27788(String str) {
        return str == null ? "null" : str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27787(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return;
        }
        String.valueOf(c);
    }
}
