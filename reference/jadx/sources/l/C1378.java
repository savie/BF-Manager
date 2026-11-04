package l;

/* JADX INFO: renamed from: l.֨ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1378 extends C19182 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5721 f4913;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378(C5721 c5721, C24404 c24404) {
        super(c24404);
        this.f4913 = c5721;
    }

    @Override // l.C19182, l.InterfaceC4288
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16791 mo2798(InterfaceC16791 interfaceC16791) {
        if (interfaceC16791.mo5414() == 29) {
            InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
            C5721 c5721 = this.f4913;
            if (c5721.f19729.m39892(interfaceC15299.getType())) {
                return new C7344(c5721, this.f62035, interfaceC15299);
            }
        }
        return super.mo2798(interfaceC16791);
    }
}
