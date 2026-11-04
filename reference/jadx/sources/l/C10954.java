package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10954 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19159 f34620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1304 f34621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f34622;

    public C10954(C1304 c1304) {
        HashMap map = new HashMap();
        this.f34622 = map;
        this.f34621 = c1304;
        C2863 c2863 = c1304.f4689;
        this.f34620 = C16395.m38927(c2863);
        Iterator it = c2863.m9453().mo15672().iterator();
        while (it.hasNext()) {
            int iMo27607 = ((InterfaceC10869) it.next()).mo27607();
            if (iMo27607 == 1) {
                map.put("android", Integer.valueOf(iMo27607));
            } else if (iMo27607 != 127) {
                map.put(String.format(Locale.ROOT, "app%02x", Integer.valueOf(iMo27607)), Integer.valueOf(iMo27607));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19159 m27784() {
        return this.f34620;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 m27783() {
        return this.f34621.f4689.m9453();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7075 m27785() {
        return this.f34621.f4689.m9457();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22889 m27786(int i, String str) {
        InterfaceC8697 interfaceC8697Mo9076;
        InterfaceC2731 interfaceC2731M21742 = C7972.m21742(m27783(), i, str);
        if (interfaceC2731M21742 == null) {
            return null;
        }
        int i2 = 65535 & i;
        if (!interfaceC2731M21742.mo9075(i2) || (interfaceC8697Mo9076 = interfaceC2731M21742.mo9076(i2)) == null) {
            return null;
        }
        C1304 c1304 = this.f34621;
        InterfaceC2731 interfaceC2731M21743 = C7972.m21742(c1304.f4687, i, str);
        return new C22889(i, str, interfaceC2731M21742, interfaceC2731M21743 != null ? interfaceC2731M21743.mo9076(i2) : null, C7972.m21744(c1304, interfaceC2731M21742, interfaceC8697Mo9076));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27782(int i) {
        return m27779(i, m27783());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27781(String str) {
        int iIntValue = ((Integer) C11392.getOrDefault(this.f34622, str, -1)).intValue();
        if (iIntValue == -1 && "android".equals(str)) {
            return 1;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27780(int i, String str) {
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
            if (str2 == null || str2.isEmpty() || (i = m27781(str2)) != -1) {
                int iM27778 = m27778(m27783(), i, strSubstring, strSubstring2);
                return (iM27778 == -1 && i == 1) ? m27778(C15407.m36884(), i, strSubstring, strSubstring2) : iM27778;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27779(int i, InterfaceC7206 interfaceC7206) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i2) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i3) {
                        return C10208.m26336(interfaceC15344.getTypeName());
                    }
                }
            }
        }
        if (i2 != 1 || C21246.m48416(interfaceC7206)) {
            return null;
        }
        return m27779(i, C15407.m36884());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27778(InterfaceC7206 interfaceC7206, int i, String str, String str2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (i == -1 || interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(str)) {
                        int iMo35827 = interfaceC15344.mo35827(new C25360(str2));
                        if (iMo35827 == -1) {
                            break;
                        }
                        return (interfaceC10869.mo27607() << 24) | (interfaceC15344.mo35833() << 16) | iMo35827;
                    }
                }
            }
        }
        return -1;
    }
}
