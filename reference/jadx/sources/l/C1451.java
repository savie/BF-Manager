package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1451 extends AbstractC18847 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC20339 f5077;

    public C1451(EnumC20339 enumC20339, C7660 c7660) {
        super(EnumC3185.f10370, c7660);
        this.f5077 = enumC20339;
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public final void mo3026(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo3026(interfaceC9397);
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735(this.f5077.m46728().intValue());
        ((C7660) this.f61224).mo1599((InterfaceC9397) c11388);
    }

    @Override // l.AbstractC18847
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1451) && super.equals(obj) && this.f5077 == ((C1451) obj).f5077;
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5226(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1451) && super.mo5226(obj) && this.f5077 == ((C1451) obj).f5077;
    }

    @Override // l.AbstractC18847
    public final int hashCode() {
        return this.f5077.hashCode() + (super.hashCode() * 31);
    }
}
