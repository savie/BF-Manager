package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LIUC */
/* JADX INFO: loaded from: classes.dex */
public final class C20346 {
    static {
        ApplicationC23172.m52091(144);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native String m46737(InterfaceC10122 interfaceC10122, int i, String str, String str2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m46738(InterfaceC10122 interfaceC10122, int i, String str) throws C10186 {
        InterfaceC8631 interfaceC8631;
        C8850 c8850 = new C8850(C19647.m45292(i));
        if (str == null) {
            c8850.m23712(interfaceC10122);
        } else {
            Iterator it = interfaceC10122.getMethods().iterator();
            do {
                if (!it.hasNext()) {
                    interfaceC8631 = null;
                    break;
                }
                interfaceC8631 = (InterfaceC8631) it.next();
            } while (!str.equals(C14684.m35306((InterfaceC4859) interfaceC8631, true)));
            if (interfaceC8631 == null) {
                throw C10186.m26300("METHOD_NOT_FOUND", "Method not found.");
            }
            c8850.m23711(interfaceC10122.getType(), interfaceC10122.mo20404(), interfaceC10122.mo20397(), interfaceC10122.mo20402(), interfaceC10122.mo20400(), interfaceC10122.getAnnotations(), (ArrayList) null, Collections.singleton(c8850.m23709(interfaceC8631.mo6804(), interfaceC8631.getName(), interfaceC8631.getParameters(), interfaceC8631.mo6802(), interfaceC8631.mo13184(), interfaceC8631.getAnnotations(), interfaceC8631.mo13176(), c8850.m23710(interfaceC8631.mo13175()))));
        }
        C22781 c22781 = new C22781();
        c8850.m52043(c22781);
        return c22781.m51385();
    }
}
