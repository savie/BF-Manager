package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1FH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10583 implements InterfaceC23988 {
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6812(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int i;
        c18551.m42946(true);
        String strM21779 = c8340.m21779();
        strM21779.getClass();
        char c = 0;
        switch (strM21779) {
            case "string-array":
                break;
            case "array":
                c = 2;
                break;
            case "integer-array":
                c = 1;
                break;
            default:
                throw new C4811(C16523.m38890("Unknown tag: <", strM21779, ">"), c8340);
        }
        Iterator itM21772 = C8340.m21772(c8340);
        int i2 = 16777217;
        while (itM21772.hasNext()) {
            C8340 c8341 = (C8340) itM21772.next();
            if (c != 2 && c8341.m21789()) {
                String strM26418 = c8341.m21784().m26418();
                if (strM26418.startsWith("@")) {
                    i = i2 + 1;
                    C14816.m35487(c18551, c8341, c11288, true).m38685(i2);
                } else if (strM26418.startsWith("?")) {
                    i = i2 + 1;
                    C14816.m35488(c18551, c11288, c8341).m38685(i2);
                } else if (c == 0) {
                    i = i2 + 1;
                    C14816.m35494(c18551, c11288, c8341).m38685(i2);
                } else if (c == 1) {
                    i = i2 + 1;
                    C14816.m35484(c18551, c11288, c8341).m38685(i2);
                } else {
                    i = i2 + 1;
                    C16932.m39627(c18551, c11288, c8341).m38685(i2);
                }
            } else if (c == 0) {
                i = i2 + 1;
                C14816.m35494(c18551, c11288, c8341).m38685(i2);
            } else if (c == 1) {
                i = i2 + 1;
                C14816.m35484(c18551, c11288, c8341).m38685(i2);
            } else {
                i = i2 + 1;
                C16932.m39627(c18551, c11288, c8341).m38685(i2);
            }
            i2 = i;
        }
    }
}
