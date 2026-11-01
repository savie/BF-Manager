package l;

/* JADX INFO: renamed from: l.ۙ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C4330 extends AbstractC12798 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f15526;

    public C4330(int i, int i2, InterfaceC5614 interfaceC5614) {
        super((int) C6447.m17632(i, i2, 2), interfaceC5614);
        this.f15526 = i2;
    }

    @Override // l.AbstractC12798
    /* JADX INFO: renamed from: ۙ */
    public final void mo3370(int i) {
        int i2 = this.f42628;
        StringBuilder sb = this.f42626;
        if (i2 != 0 && i2 % this.f15526 == 0) {
            sb.append('\n');
        }
        for (int i3 = 7; i3 >= 0; i3--) {
            sb.append((char) (((i >>> i3) & 1) + 48));
        }
        sb.append(' ');
    }

    @Override // l.AbstractC12798
    public final String finish() {
        StringBuilder sb = this.f42626;
        C6447.m17634(sb);
        return sb.toString();
    }
}
