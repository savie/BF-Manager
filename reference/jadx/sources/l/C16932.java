package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16932 implements InterfaceC23988 {
    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6812(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        boolean zM17653 = true;
        c18551.m42946(true);
        C12812 c12812 = new C12812();
        C18923 c18923M21780 = c8340.m21780("parent");
        if (c18923M21780 != null) {
            String strM43586 = c18923M21780.m43586();
            Integer numM39626 = m39626(strM43586);
            if (numM39626 != null) {
                c12812.f42662 = numM39626.intValue();
                c12812.f42661 = 17;
            } else {
                zM17653 = C6461.m17653(strM43586, c12812);
            }
            if (!zM17653) {
                throw new C4811(C16523.m38890("Expected integer value: parent=\"", c18923M21780.m43586(), "\""), c18923M21780);
            }
            c18551.m42948(c12812.f42662);
        }
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            C8340 c8341 = (C8340) itM21772.next();
            m39627(c18551, c11288, c8341).m38685(m39625(c8341, c12812));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39625(C8340 c8340, C12812 c12812) throws C4811 {
        boolean zM17653;
        C18923 c18923M21780 = c8340.m21780("id");
        if (c18923M21780 == null) {
            return -1;
        }
        String strM43586 = c18923M21780.m43586();
        Integer numM39626 = m39626(strM43586);
        if (numM39626 != null) {
            c12812.f42662 = numM39626.intValue();
            c12812.f42661 = 17;
            zM17653 = true;
        } else {
            zM17653 = C6461.m17653(strM43586, c12812);
        }
        if (zM17653) {
            return c12812.f42662;
        }
        throw new C4811(C16523.m38890("Expected integer value: id=\"", c18923M21780.m43586(), "\""), c18923M21780);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m39626(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C6461.m17648(str)) {
            return Integer.valueOf(C6461.m17654(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16435 m39627(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        String strM21779 = c8340.m21779();
        strM21779.getClass();
        switch (strM21779) {
            case "dynamic-attribute":
                C16435 c16435M35488 = C14816.m35488(c18551, c11288, c8340);
                c16435M35488.m38684(8);
                return c16435M35488;
            case "fraction":
                return C14816.m35496(c18551, c11288, c8340);
            case "reference":
                return C14816.m35487(c18551, c8340, c11288, true);
            case "string":
                return C14816.m35494(c18551, c11288, c8340);
            case "bool":
                return C14816.m35495(c18551, c11288, c8340);
            case "attribute":
                return C14816.m35488(c18551, c11288, c8340);
            case "color":
                return C14816.m35493(c18551, c11288, c8340);
            case "dimen":
                return C14816.m35485(c18551, c11288, c8340);
            case "float":
                return C14816.m35492(c18551, c11288, c8340);
            case "dynamic-reference":
                C16435 c16435M35487 = C14816.m35487(c18551, c8340, c11288, false);
                c16435M35487.m38684(7);
                return c16435M35487;
            case "integer":
                return C14816.m35484(c18551, c11288, c8340);
            default:
                throw new C4811("Unknown tag <" + c8340.m21779() + ">", c8340);
        }
    }
}
