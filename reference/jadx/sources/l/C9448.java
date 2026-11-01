package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9448 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24201(C20424 c20424, C12283 c12283, InterfaceC17822 interfaceC17822, InterfaceC10975 interfaceC10975, boolean z) throws IOException {
        int iMo28400 = interfaceC17822.mo28400();
        if (z && EnumC15236.STATIC.m36501(iMo28400) && EnumC15236.FINAL.m36501(iMo28400) && interfaceC10975 != null) {
            if (C23365.m51480(interfaceC10975)) {
                interfaceC10975 = null;
            } else {
                c12283.getClass();
                c12283.write("# The value of this static final field might be set in the static constructor\n", 0, 78);
            }
        }
        c12283.getClass();
        c12283.write(".field ", 0, 7);
        int iMo28401 = interfaceC17822.mo28400();
        Set setMo28398 = interfaceC17822.mo28398();
        for (EnumC15236 enumC15236 : EnumC15236.m36490(iMo28401)) {
            c12283.write(enumC15236.toString());
            c12283.write(32);
        }
        Iterator it = setMo28398.iterator();
        while (it.hasNext()) {
            c12283.write(((EnumC18763) it.next()).toString());
            c12283.write(32);
        }
        C22304.m49470((Writer) c12283, (InterfaceC18735) interfaceC17822, true);
        if (interfaceC10975 != null) {
            c12283.write(" = ", 0, 3);
            c20424.getClass();
            AbstractC14387.m34621(c12283, interfaceC10975);
        }
        c12283.write(10);
        Set annotations = interfaceC17822.getAnnotations();
        if (annotations.size() > 0) {
            c12283.m30527();
            c20424.getClass();
            C18619.m43060(c12283, annotations);
            c12283.m30526();
            c12283.write(".end field\n", 0, 11);
        }
    }
}
