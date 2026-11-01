package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19088 extends AbstractC21536 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC11659 f61672;

    public C19088(EnumC11659 enumC11659, C15187 c15187) {
        super(EnumC13776.f45409, c15187);
        this.f61672 = enumC11659;
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public final void mo3209(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo3209(interfaceC19275);
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765(this.f61672.m29113().intValue());
        ((C15187) this.f69953).mo2341((InterfaceC19275) c23509);
    }

    @Override // l.AbstractC21536
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19088) && super.equals(obj) && this.f61672 == ((C19088) obj).f61672;
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8626(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19088) && super.mo8626(obj) && this.f61672 == ((C19088) obj).f61672;
    }

    @Override // l.AbstractC21536
    public final int hashCode() {
        return this.f61672.hashCode() + (super.hashCode() * 31);
    }
}
