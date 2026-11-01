package l;

/* JADX INFO: renamed from: l.֡ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0204 implements InterfaceC11955 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16433 f1362;

    public C0204(C16433 c16433) {
        this.f1362 = c16433;
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        InterfaceC10975 interfaceC10975 = (InterfaceC10975) obj;
        C11992 c11992 = this.f1362.f52853.f40803;
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 != 4 && iMo2656 != 6 && iMo2656 != 16 && iMo2656 != 17) {
            switch (iMo2656) {
                case 21:
                    return new C7136(c11992, interfaceC10975);
                case 22:
                    return new C20542(c11992, interfaceC10975);
                case 23:
                    break;
                case 24:
                    return new C12781(c11992, interfaceC10975);
                case 25:
                    return new C3607(c11992, interfaceC10975);
                case 26:
                    return new C6430(c11992, interfaceC10975);
                default:
                    throw new C20749(null, "Unsupported encoded value type: %d", Integer.valueOf(interfaceC10975.mo2656()));
            }
        }
        return interfaceC10975;
    }
}
