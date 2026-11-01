package l;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15507 extends AbstractC11979 {
    public C15507(C12497 c12497) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        mo15525(c12497);
    }

    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("OS/400", "yy/MM/dd HH:mm:ss", null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m37111(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        String str2;
        boolean z;
        int iLastIndexOf;
        C11086 c11086 = new C11086();
        c11086.m27944(str);
        if (!m29790(str)) {
            return null;
        }
        String strM29788 = m29788(1);
        String strM29789 = m29788(2);
        int i = 3;
        if (m37111(m29788(3)) && m37111(m29788(4))) {
            str2 = "";
        } else {
            str2 = m29788(3) + " " + m29788(4);
        }
        String strM297810 = m29788(5);
        String strM297811 = m29788(6);
        try {
            c11086.m27951(m29789(str2));
        } catch (ParseException unused) {
        }
        try {
            if (strM297810.equalsIgnoreCase("*STMF")) {
                if (m37111(strM29789) || m37111(strM297811)) {
                    return null;
                }
                i = 0;
            } else {
                if (!strM297810.equalsIgnoreCase("*DIR")) {
                    if (!strM297810.equalsIgnoreCase("*FILE")) {
                        if (strM297810.equalsIgnoreCase("*MEM")) {
                            if (m37111(strM297811) || !m37111(strM29789) || !m37111(str2)) {
                                return null;
                            }
                            strM297811 = strM297811.replace('/', File.separatorChar);
                        }
                        c11086.m27947(i);
                        c11086.m27954(strM29788);
                        c11086.m27949(Long.parseLong(strM29789));
                        if (strM297811.endsWith("/")) {
                            strM297811 = C20630.m46498(1, 0, strM297811);
                        }
                        if (z && (iLastIndexOf = strM297811.lastIndexOf(47)) > -1) {
                            strM297811 = strM297811.substring(iLastIndexOf + 1);
                        }
                        c11086.m27957(strM297811);
                        return c11086;
                    }
                    if (strM297811 == null || !strM297811.toUpperCase(Locale.ROOT).endsWith(".SAVF")) {
                        return null;
                    }
                    i = 0;
                    z = false;
                    c11086.m27947(i);
                    c11086.m27954(strM29788);
                    c11086.m27949(Long.parseLong(strM29789));
                    if (strM297811.endsWith("/")) {
                        strM297811 = C20630.m46498(1, 0, strM297811);
                    }
                    if (z) {
                        strM297811 = strM297811.substring(iLastIndexOf + 1);
                    }
                    c11086.m27957(strM297811);
                    return c11086;
                }
                if (m37111(strM29789) || m37111(strM297811)) {
                    return null;
                }
                i = 1;
            }
            c11086.m27949(Long.parseLong(strM29789));
        } catch (NumberFormatException unused2) {
        }
        z = true;
        c11086.m27947(i);
        c11086.m27954(strM29788);
        if (strM297811.endsWith("/")) {
            strM297811 = C20630.m46498(1, 0, strM297811);
        }
        if (z) {
            strM297811 = strM297811.substring(iLastIndexOf + 1);
        }
        c11086.m27957(strM297811);
        return c11086;
    }
}
