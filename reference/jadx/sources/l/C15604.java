package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15604 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m37269(InterfaceC2196 interfaceC2196, Object obj) {
        if (obj == null) {
            return null;
        }
        return interfaceC2196.mo1014(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m37271(Set set, InterfaceC2196 interfaceC2196) {
        return new C22659(set, interfaceC2196);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m37270(InterfaceC2196 interfaceC2196, List list) {
        return new C14898(interfaceC2196, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterable m37268(Iterable iterable, InterfaceC2196 interfaceC2196) {
        return new C17719(iterable, interfaceC2196);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21730 m37272(InterfaceC8152 interfaceC8152, C11992 c11992) {
        switch (interfaceC8152.mo20681()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C7842(interfaceC8152, c11992);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C19131(interfaceC8152, c11992);
            default:
                throw new C20749(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC8152.mo20681()));
        }
    }
}
