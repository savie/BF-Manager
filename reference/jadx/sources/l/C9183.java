package l;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9183 extends AbstractC3964 {
    public C9183(C11421 c11421) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        mo6095(c11421);
    }

    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("OS/400", "yy/MM/dd HH:mm:ss", null);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m24307(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        String str2;
        boolean z;
        int iLastIndexOf;
        C17388 c17388 = new C17388();
        c17388.m40844(str);
        if (!m12703(str)) {
            return null;
        }
        String strM12701 = m12701(1);
        String strM12702 = m12701(2);
        int i = 3;
        if (m24307(m12701(3)) && m24307(m12701(4))) {
            str2 = "";
        } else {
            str2 = m12701(3) + " " + m12701(4);
        }
        String strM12703 = m12701(5);
        String strM12704 = m12701(6);
        try {
            c17388.m40831(m12702(str2));
        } catch (ParseException unused) {
        }
        try {
            if (strM12703.equalsIgnoreCase("*STMF")) {
                if (m24307(strM12702) || m24307(strM12704)) {
                    return null;
                }
                i = 0;
            } else {
                if (!strM12703.equalsIgnoreCase("*DIR")) {
                    if (!strM12703.equalsIgnoreCase("*FILE")) {
                        if (strM12703.equalsIgnoreCase("*MEM")) {
                            if (m24307(strM12704) || !m24307(strM12702) || !m24307(str2)) {
                                return null;
                            }
                            strM12704 = strM12704.replace('/', File.separatorChar);
                        }
                        c17388.m40827(i);
                        c17388.m40840(strM12701);
                        c17388.m40829(Long.parseLong(strM12702));
                        if (strM12704.endsWith("/")) {
                            strM12704 = C1402.m5124(1, 0, strM12704);
                        }
                        if (z && (iLastIndexOf = strM12704.lastIndexOf(47)) > -1) {
                            strM12704 = strM12704.substring(iLastIndexOf + 1);
                        }
                        c17388.m40835(strM12704);
                        return c17388;
                    }
                    if (strM12704 == null || !strM12704.toUpperCase(Locale.ROOT).endsWith(".SAVF")) {
                        return null;
                    }
                    i = 0;
                    z = false;
                    c17388.m40827(i);
                    c17388.m40840(strM12701);
                    c17388.m40829(Long.parseLong(strM12702));
                    if (strM12704.endsWith("/")) {
                        strM12704 = C1402.m5124(1, 0, strM12704);
                    }
                    if (z) {
                        strM12704 = strM12704.substring(iLastIndexOf + 1);
                    }
                    c17388.m40835(strM12704);
                    return c17388;
                }
                if (m24307(strM12702) || m24307(strM12704)) {
                    return null;
                }
                i = 1;
            }
            c17388.m40829(Long.parseLong(strM12702));
        } catch (NumberFormatException unused2) {
        }
        z = true;
        c17388.m40827(i);
        c17388.m40840(strM12701);
        if (strM12704.endsWith("/")) {
            strM12704 = C1402.m5124(1, 0, strM12704);
        }
        if (z) {
            strM12704 = strM12704.substring(iLastIndexOf + 1);
        }
        c17388.m40835(strM12704);
        return c17388;
    }
}
