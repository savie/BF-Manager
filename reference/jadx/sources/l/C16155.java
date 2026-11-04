package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16155 implements InterfaceC6461 {
    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ */
    public final void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        boolean zM29458 = true;
        c13304.m32860(true);
        C5765 c5765 = new C5765();
        C5737 c5737M6854 = c2008.m6854("parent");
        if (c5737M6854 != null) {
            String strM16798 = c5737M6854.m16798();
            Integer numM38329 = m38329(strM16798);
            if (numM38329 != null) {
                c5765.f19813 = numM38329.intValue();
                c5765.f19814 = 17;
            } else {
                zM29458 = C11730.m29458(strM16798, c5765);
            }
            if (!zM29458) {
                throw new C10254(C14442.m34865("Expected integer value: parent=\"", c5737M6854.m16798(), "\""), c5737M6854);
            }
            c13304.m32859(c5765.f19813);
        }
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            C2008 c2009 = (C2008) itM6847.next();
            m38330(c13304, c12426, c2009).m11711(m38328(c2009, c5765));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38328(C2008 c2008, C5765 c5765) throws C10254 {
        boolean zM29458;
        C5737 c5737M6854 = c2008.m6854("id");
        if (c5737M6854 == null) {
            return -1;
        }
        String strM16798 = c5737M6854.m16798();
        Integer numM38329 = m38329(strM16798);
        if (numM38329 != null) {
            c5765.f19813 = numM38329.intValue();
            c5765.f19814 = 17;
            zM29458 = true;
        } else {
            zM29458 = C11730.m29458(strM16798, c5765);
        }
        if (zM29458) {
            return c5765.f19813;
        }
        throw new C10254(C14442.m34865("Expected integer value: id=\"", c5737M6854.m16798(), "\""), c5737M6854);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m38329(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11730.m29453(str)) {
            return Integer.valueOf(C11730.m29456(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3609 m38330(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        String strM6853 = c2008.m6853();
        strM6853.getClass();
        switch (strM6853) {
            case "dynamic-attribute":
                C3609 c3609M54435 = C24361.m54435(c13304, c12426, c2008);
                c3609M54435.m11709(8);
                return c3609M54435;
            case "fraction":
                return C24361.m54442(c13304, c12426, c2008);
            case "reference":
                return C24361.m54434(c13304, c2008, c12426, true);
            case "string":
                return C24361.m54439(c13304, c12426, c2008);
            case "bool":
                return C24361.m54444(c13304, c12426, c2008);
            case "attribute":
                return C24361.m54435(c13304, c12426, c2008);
            case "color":
                return C24361.m54440(c13304, c12426, c2008);
            case "dimen":
                return C24361.m54445(c13304, c12426, c2008);
            case "float":
                return C24361.m54443(c13304, c12426, c2008);
            case "dynamic-reference":
                C3609 c3609M54434 = C24361.m54434(c13304, c2008, c12426, false);
                c3609M54434.m11709(7);
                return c3609M54434;
            case "integer":
                return C24361.m54441(c13304, c12426, c2008);
            default:
                throw new C10254("Unknown tag <" + c2008.m6853() + ">", c2008);
        }
    }
}
