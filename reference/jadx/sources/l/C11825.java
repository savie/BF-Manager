package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11825 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7660 f38152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f38153;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C11825(char c, C7660 c7660) {
        this.f38153 = c;
        this.f38152 = c7660;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735((int) this.f38153);
        this.f38152.mo1599((InterfaceC9397) c11388);
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        if (!this.f38152.mo20871()) {
            C7660 c7660 = this.f38152;
            C13054.m32520(c7660, c15291);
            this.f38152 = c7660;
            if (!EnumC15863.m37822(this.f38153)) {
                AbstractC18847 abstractC18847 = this.f38152.f25232;
                this.f38153 = abstractC18847 == null ? EnumC15863.AE_NOT_APPLICABLE.m37827() : abstractC18847.f61223.m10395();
            }
        }
        return this;
    }
}
