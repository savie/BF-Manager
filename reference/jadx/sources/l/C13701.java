package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13701 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33494(C2161 c2161, Set set) throws IOException {
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            InterfaceC7886 interfaceC7886 = (InterfaceC7886) it.next();
            if (!z) {
                c2161.write(10);
            }
            c2161.getClass();
            c2161.write(".annotation ", 0, 12);
            c2161.write(C8502.m22819(interfaceC7886.getVisibility()));
            c2161.write(32);
            c2161.write(interfaceC7886.getType());
            c2161.write(10);
            AbstractC23727.m52996(c2161, interfaceC7886.getElements());
            c2161.write(".end annotation\n", 0, 16);
            z = false;
        }
    }
}
