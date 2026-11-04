package l;

/* JADX INFO: renamed from: l.۫ܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C13215 implements InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5758 f42179;

    public C13215(C5758 c5758) {
        this.f42179 = c5758;
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        C24404 c24404 = this.f42179.f19803.f6758;
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 != 4 && iMo5414 != 6 && iMo5414 != 16 && iMo5414 != 17) {
            switch (iMo5414) {
                case 21:
                    return new C10955(c24404, interfaceC16791);
                case 22:
                    return new C22890(c24404, interfaceC16791);
                case 23:
                    break;
                case 24:
                    return new C0559(c24404, interfaceC16791);
                case 25:
                    return new C8017(c24404, interfaceC16791);
                case 26:
                    return new C19204(c24404, interfaceC16791);
                default:
                    throw new C23044(null, "Unsupported encoded value type: %d", Integer.valueOf(interfaceC16791.mo5414()));
            }
        }
        return interfaceC16791;
    }
}
