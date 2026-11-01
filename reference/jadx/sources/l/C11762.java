package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11762 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15187 f39485;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12738 f39486;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15187 f39487;

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return 4;
    }

    public C11762(C12738 c12738, C15187 c15187, C15187 c15188) {
        super(c12738, EnumC16783.f53718);
        this.f39486 = c12738;
        this.f39485 = c15187;
        this.f39487 = c15188;
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        boolean zMo32563 = this.f39485.mo32563();
        C12738 c12738 = this.f39486;
        if (!zMo32563) {
            this.f39485 = c12738.m31664(this.f39485);
            if (!c12738.m31663().m11412(Integer.valueOf(this.f39485.f43854))) {
                c12738.f42485.m42174("\"{0}\" not found in Constant Pool", this.f39485);
                throw null;
            }
        }
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f39485.f43854);
        C15187 c15187 = this.f39487;
        if (c15187 != null && !c15187.mo32563()) {
            this.f39487 = c12738.m31664(this.f39487);
            if (!c12738.m31663().m11412(Integer.valueOf(this.f39487.f43854))) {
                c12738.f42485.m42174("\"{0}\" not found in Constant Pool", this.f39487);
                throw null;
            }
        }
        C15187 c15188 = this.f39487;
        c23509.m51770(c15188 != null ? c15188.f43854 : 0);
    }
}
