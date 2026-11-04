package l;

/* JADX INFO: renamed from: l.ۡ֡᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C9015 extends C8270 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0812 m24070(InterfaceC19479 interfaceC19479) {
        return new C12963(interfaceC19479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0812 m24069(EnumC6779 enumC6779, InterfaceC19479 interfaceC19479) {
        C15243.m36590(enumC6779, "mode");
        int i = C2304.f7466[enumC6779.ordinal()];
        if (i == 1) {
            return new C12963(interfaceC19479);
        }
        if (i == 2) {
            return new C15200(interfaceC19479);
        }
        if (i == 3) {
            return new C24898(interfaceC19479);
        }
        throw new C4760();
    }
}
