package l;

/* JADX INFO: renamed from: l.۟᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X10D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8153 {
    static {
        C9341.m24618();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20613 m22060(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory() || interfaceC2386.mo8092()) {
            return C20613.f66109;
        }
        if (interfaceC2386.mo8116()) {
            return ((AbstractC11860) interfaceC2386).m29718();
        }
        if (interfaceC2386.getName().equals("payload.bin")) {
            return C20613.f66099;
        }
        return interfaceC2386.mo8091().m23976();
    }
}
