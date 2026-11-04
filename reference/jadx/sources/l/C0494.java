package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494 implements InterfaceC6461 {
    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        c13304.m32860(true);
        Iterator itM6848 = C2008.m6848(c2008, "item");
        while (itM6848.hasNext()) {
            C2008 c2009 = (C2008) itM6848.next();
            C5737 c5737M6863 = c2009.m6863("quantity");
            String strM16798 = c5737M6863.m16798();
            int iIndexOf = Arrays.asList(InterfaceC5650.f19517).indexOf(strM16798);
            if (iIndexOf == -1) {
                throw new C10254(C25272.m56409("Unknown quantity: ", strM16798), c5737M6863);
            }
            int i = iIndexOf + 16777220;
            if (c2009.m6864()) {
                String strM39906 = c2009.m6859().m39906();
                if (strM39906.startsWith("@")) {
                    C24361.m54434(c13304, c2009, c12426, true).m11711(i);
                } else if (strM39906.startsWith("?")) {
                    C24361.m54435(c13304, c12426, c2009).m11711(i);
                }
            }
            C24361.m54439(c13304, c12426, c2009).m11711(i);
        }
    }
}
