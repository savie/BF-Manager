package l;

/* JADX INFO: renamed from: l.᩷ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91FI */
/* JADX INFO: loaded from: classes.dex */
public final class C22123 extends C15409 {
    @Override // l.C15409, l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public final void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        boolean z;
        if (interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        InterfaceC5650 value = interfaceC8697.getValue();
        if (value.mo16636() && !value.mo11710().mo8825() && value.mo11710().getValue().isEmpty()) {
            z = true;
        } else if (value.mo16635() != 18) {
            super.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
            return;
        } else {
            if (value.getValue() != 0) {
                super.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
                return;
            }
            z = false;
        }
        interfaceC18525.mo14234("id");
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        if (z) {
            interfaceC18525.mo14233("explicit", "true");
        }
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        interfaceC18525.mo14232("id");
    }
}
