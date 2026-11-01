package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C4VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18619 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43060(C12283 c12283, Set set) throws IOException {
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            InterfaceC3710 interfaceC3710 = (InterfaceC3710) it.next();
            if (!z) {
                c12283.write(10);
            }
            c12283.getClass();
            c12283.write(".annotation ", 0, 12);
            c12283.write(C21585.m48298(interfaceC3710.getVisibility()));
            c12283.write(32);
            c12283.write(interfaceC3710.getType());
            c12283.write(10);
            AbstractC23559.m51921(c12283, interfaceC3710.getElements());
            c12283.write(".end annotation\n", 0, 16);
            z = false;
        }
    }
}
