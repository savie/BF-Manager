package l;

/* JADX INFO: renamed from: l.᩹ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23512 implements InterfaceC17544 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f75990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC16052 f75991;

    public C23512(AbstractC16052 abstractC16052, int i) {
        this.f75991 = abstractC16052;
        this.f75990 = i;
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public final void mo1209(int i) {
        if (this.f75989 != i) {
            this.f75989 = i;
            AbstractC16052 abstractC16052 = this.f75991;
            int i2 = 0;
            for (C23512 c23512 : abstractC16052.f52053) {
                i2 += c23512.f75989 * c23512.f75990;
            }
            int i3 = i2 / 10000;
            if (abstractC16052.f52054 != i3) {
                abstractC16052.f52054 = i3;
                abstractC16052.f52052.mo1209(i3);
            }
        }
    }
}
