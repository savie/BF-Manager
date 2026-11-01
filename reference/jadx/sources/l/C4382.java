package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۙۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4382 extends AbstractC13556 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15622;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17684 f15623;

    public C4382(C17684 c17684, int i) {
        this.f15623 = c17684;
        this.f15622 = i;
    }

    @Override // l.AbstractC13556
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 mo12235() {
        AbstractC18119 abstractC18119M41166 = this.f15623.m41166();
        int i = this.f15622;
        int iMo9809 = abstractC18119M41166.mo9809(i + 4);
        if (iMo9809 == 0) {
            return InterfaceC9510.f32162;
        }
        return new C3158(this, i + 16, iMo9809);
    }

    @Override // l.AbstractC13556
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 mo12234() {
        C17684 c17684 = this.f15623;
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int i = this.f15622;
        int iMo9809 = abstractC18119M41166.mo9809(i + 8);
        if (iMo9809 != 0) {
            return new C3158(this, (c17684.m41166().mo9809(i + 4) * 8) + i + 16, iMo9809);
        }
        return InterfaceC9510.f32162;
    }

    @Override // l.AbstractC13556
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510 mo12232() {
        C17684 c17684 = this.f15623;
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int i = this.f15622;
        int iMo9809 = abstractC18119M41166.mo9809(i + 12);
        if (iMo9809 != 0) {
            int iMo98010 = c17684.m41166().mo9809(i + 4);
            int i2 = iMo98010 * 8;
            return new C3158(this, (c17684.m41166().mo9809(i + 8) * 8) + i2 + i + 16, iMo9809);
        }
        return InterfaceC9510.f32162;
    }

    @Override // l.AbstractC13556
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set mo12233() {
        C17684 c17684 = this.f15623;
        return AbstractC13556.m33143(c17684, c17684.m41166().mo9809(this.f15622));
    }
}
