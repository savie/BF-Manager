package l;

/* JADX INFO: renamed from: l.ᩴ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19099 implements InterfaceC21921 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f61689;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18393 f61691;

    public C19099(AbstractC18393 abstractC18393, int i) {
        this.f61691 = abstractC18393;
        this.f61689 = i;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public final void mo1855(int i) {
        if (this.f61690 != i) {
            this.f61690 = i;
            AbstractC18393 abstractC18393 = this.f61691;
            int i2 = 0;
            for (C19099 c19099 : abstractC18393.f58639) {
                i2 += c19099.f61690 * c19099.f61689;
            }
            int i3 = i2 / 10000;
            if (abstractC18393.f58640 != i3) {
                abstractC18393.f58640 = i3;
                abstractC18393.f58638.mo1855(i3);
            }
        }
    }
}
