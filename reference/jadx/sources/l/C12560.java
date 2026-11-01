package l;

/* JADX INFO: renamed from: l.۫ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X10D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12560 {
    static {
        C12859.m31893();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0690 m31247(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory() || interfaceC2557.mo7969()) {
            return C0690.f2900;
        }
        if (interfaceC2557.mo7991()) {
            return ((AbstractC18931) interfaceC2557).m43610();
        }
        if (interfaceC2557.getName().equals("payload.bin")) {
            return C0690.f2894;
        }
        return interfaceC2557.mo7972().m48181();
    }
}
