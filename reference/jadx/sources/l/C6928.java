package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۜᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7GP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6928 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f23298 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15070 f23297 = new C15070();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18585(String str) throws IOException, C4811 {
        (str != null ? Integer.valueOf(str.length()) : "null").toString();
        if ((str == null || str.length() >= 500) && str != null) {
            str.substring(0, 500);
        }
        C15070 c15070 = this.f23297;
        c15070.clear();
        StringBuilder sb = this.f23298;
        sb.setLength(0);
        C3504 c3504 = new C3504();
        c3504.m10317(new StringReader(str));
        for (int iM10318 = c3504.m10318(); iM10318 != 1; iM10318 = c3504.m10327()) {
            if (iM10318 == 4) {
                String strM10326 = c3504.m10326();
                if (strM10326 != null) {
                    m18583(strM10326);
                }
                if (strM10326 != null && !strM10326.isEmpty()) {
                    int iM10320 = c3504.m10320();
                    sb.length();
                    c15070.getClass();
                    for (int i = 0; i < strM10326.length(); i++) {
                        char cCharAt = strM10326.charAt(i);
                        sb.append(cCharAt);
                        c15070.add(iM10320 + i);
                        if (strM10326.length() <= 50) {
                            sb.length();
                            m18582(cCharAt);
                        }
                    }
                    if (strM10326.length() > 50) {
                        sb.length();
                        sb.length();
                    }
                }
            }
        }
        sb.length();
        c15070.getClass();
        if (sb.length() < 200) {
            m18583(sb.toString());
        } else {
            m18583(sb.substring(0, 200));
        }
        if (c15070.isEmpty()) {
            return;
        }
        int iMin = Math.min(c15070.size(), 50);
        for (int i2 = 0; i2 < iMin; i2++) {
            c15070.getInt(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18584(int i) {
        C15070 c15070 = this.f23297;
        c15070.getClass();
        if (i < 0) {
            return -1;
        }
        if (i == c15070.size()) {
            if (c15070.isEmpty()) {
                return 0;
            }
            return c15070.getInt(c15070.size() - 1) + 1;
        }
        if (i > c15070.size()) {
            c15070.getClass();
            return -1;
        }
        int i2 = c15070.getInt(i);
        StringBuilder sb = this.f23298;
        m18582(i < sb.length() ? sb.charAt(i) : '?');
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18583(String str) {
        return str == null ? "null" : str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18582(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return;
        }
        String.valueOf(c);
    }
}
