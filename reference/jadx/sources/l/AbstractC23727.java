package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5T6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23727 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52996(C2161 c2161, Set set) {
        c2161.m7439();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) it.next();
            c2161.write(interfaceC19073.getName());
            c2161.write(" = ", 0, 3);
            AbstractC3589.m11645(c2161, interfaceC19073.getValue());
            c2161.write(10);
        }
        c2161.m7435();
    }
}
