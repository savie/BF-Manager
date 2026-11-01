package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩶ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20150 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14942 f65447;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18738 f65448;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f65449;

    public C20150(C18738 c18738) {
        HashMap map = new HashMap();
        this.f65449 = map;
        this.f65448 = c18738;
        C22577 c22577 = c18738.f60792;
        this.f65447 = C9298.m23850(c22577);
        Iterator it = c22577.m50079().mo17615().iterator();
        while (it.hasNext()) {
            int iMo19106 = ((InterfaceC17721) it.next()).mo19106();
            if (iMo19106 == 1) {
                map.put("android", Integer.valueOf(iMo19106));
            } else if (iMo19106 != 127) {
                map.put(String.format(Locale.ROOT, "app%02x", Integer.valueOf(iMo19106)), Integer.valueOf(iMo19106));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14942 m45572() {
        return this.f65447;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 m45571() {
        return this.f65448.f60792.m50079();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5062 m45574() {
        return this.f65448.f60792.m50082();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0393 m45573(int i, String str) {
        InterfaceC3609 interfaceC3609Mo31753;
        InterfaceC12783 interfaceC12783M50306 = C22703.m50306(m45571(), i, str);
        if (interfaceC12783M50306 == null) {
            return null;
        }
        int i2 = 65535 & i;
        if (!interfaceC12783M50306.mo31756(i2) || (interfaceC3609Mo31753 = interfaceC12783M50306.mo31753(i2)) == null) {
            return null;
        }
        C18738 c18738 = this.f65448;
        InterfaceC12783 interfaceC12783M50307 = C22703.m50306(c18738.f60790, i, str);
        return new C0393(i, str, interfaceC12783M50306, interfaceC12783M50307 != null ? interfaceC12783M50307.mo31753(i2) : null, C22703.m50305(c18738, interfaceC12783M50306, interfaceC3609Mo31753));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45570(int i) {
        return m45567(i, m45571());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45569(String str) {
        int iIntValue = ((Integer) C9735.getOrDefault(this.f65449, str, -1)).intValue();
        if (iIntValue == -1 && "android".equals(str)) {
            return 1;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45568(int i, String str) {
        String str2;
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (str2 == null || str2.isEmpty() || (i = m45569(str2)) != -1) {
                int iM45566 = m45566(m45571(), i, strSubstring, strSubstring2);
                return (iM45566 == -1 && i == 1) ? m45566(C13530.m33074(), i, strSubstring, strSubstring2) : iM45566;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45567(int i, InterfaceC6432 interfaceC6432) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i2) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i3) {
                        return C21291.m47740(interfaceC19133.getTypeName());
                    }
                }
            }
        }
        if (i2 != 1 || C6037.m16361(interfaceC6432)) {
            return null;
        }
        return m45567(i, C13530.m33074());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45566(InterfaceC6432 interfaceC6432, int i, String str, String str2) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (i == -1 || interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(str)) {
                        int iMo1521 = interfaceC19133.mo1521(new C23648(4, str2));
                        if (iMo1521 == -1) {
                            break;
                        }
                        return (interfaceC17721.mo19106() << 24) | (interfaceC19133.mo26942() << 16) | iMo1521;
                    }
                }
            }
        }
        return -1;
    }
}
