package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A5T6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23559 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51921(C12283 c12283, Set set) throws IOException {
        c12283.m30527();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) it.next();
            c12283.write(interfaceC6533.getName());
            c12283.write(" = ", 0, 3);
            AbstractC14387.m34621(c12283, interfaceC6533.getValue());
            c12283.write(10);
        }
        c12283.m30526();
    }
}
