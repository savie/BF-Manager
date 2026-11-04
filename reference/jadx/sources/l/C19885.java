package l;

/* JADX INFO: renamed from: l.ᩴܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19885 extends C10320 {
    @Override // l.C10320, l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public final void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        int iMo16635;
        if (!interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
            int iMo16637 = interfaceC5650.mo16637();
            if (iMo16637 < 16777220 || iMo16637 > 16777225 || ((iMo16635 = interfaceC5650.mo16635()) != 0 && iMo16635 != 1 && iMo16635 != 2 && iMo16635 != 3)) {
                super.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
                return;
            }
        }
        interfaceC18525.mo14234("plurals");
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        for (InterfaceC5650 interfaceC5651 : interfaceC8697.values()) {
            interfaceC18525.mo14234("item");
            interfaceC18525.mo14233("quantity", InterfaceC5650.f19517[interfaceC5651.mo16637() - 16777220]);
            C14049.m34213(interfaceC18525, C14049.m34210(c2863, interfaceC5651));
            interfaceC18525.mo14232("item");
        }
        interfaceC18525.mo14232("plurals");
    }
}
