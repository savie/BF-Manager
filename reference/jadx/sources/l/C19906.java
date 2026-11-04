package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19906 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m45835(InterfaceC4288 interfaceC4288, Object obj) {
        if (obj == null) {
            return null;
        }
        return interfaceC4288.mo2798(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m45837(Set set, InterfaceC4288 interfaceC4288) {
        return new C10253(set, interfaceC4288);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45836(InterfaceC4288 interfaceC4288, List list) {
        return new C1305(interfaceC4288, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterable m45834(Iterable iterable, InterfaceC4288 interfaceC4288) {
        return new C2796(iterable, interfaceC4288);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2493 m45838(InterfaceC6813 interfaceC6813, C24404 c24404) {
        switch (interfaceC6813.mo17433()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C7271(interfaceC6813, c24404);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C13982(interfaceC6813, c24404);
            default:
                throw new C23044(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC6813.mo17433()));
        }
    }
}
