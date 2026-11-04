package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1FH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1986 implements InterfaceC6461 {
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ */
    public final void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int i;
        c13304.m32860(true);
        String strM6853 = c2008.m6853();
        strM6853.getClass();
        char c = 0;
        switch (strM6853) {
            case "string-array":
                break;
            case "array":
                c = 2;
                break;
            case "integer-array":
                c = 1;
                break;
            default:
                throw new C10254(C14442.m34865("Unknown tag: <", strM6853, ">"), c2008);
        }
        Iterator itM6847 = C2008.m6847(c2008);
        int i2 = 16777217;
        while (itM6847.hasNext()) {
            C2008 c2009 = (C2008) itM6847.next();
            if (c != 2 && c2009.m6864()) {
                String strM39906 = c2009.m6859().m39906();
                if (strM39906.startsWith("@")) {
                    i = i2 + 1;
                    C24361.m54434(c13304, c2009, c12426, true).m11711(i2);
                } else if (strM39906.startsWith("?")) {
                    i = i2 + 1;
                    C24361.m54435(c13304, c12426, c2009).m11711(i2);
                } else if (c == 0) {
                    i = i2 + 1;
                    C24361.m54439(c13304, c12426, c2009).m11711(i2);
                } else if (c == 1) {
                    i = i2 + 1;
                    C24361.m54441(c13304, c12426, c2009).m11711(i2);
                } else {
                    i = i2 + 1;
                    C16155.m38330(c13304, c12426, c2009).m11711(i2);
                }
            } else if (c == 0) {
                i = i2 + 1;
                C24361.m54439(c13304, c12426, c2009).m11711(i2);
            } else if (c == 1) {
                i = i2 + 1;
                C24361.m54441(c13304, c12426, c2009).m11711(i2);
            } else {
                i = i2 + 1;
                C16155.m38330(c13304, c12426, c2009).m11711(i2);
            }
            i2 = i;
        }
    }
}
