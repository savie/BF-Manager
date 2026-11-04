package l;

/* JADX INFO: renamed from: l.ܺۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes5.dex */
public final class C16669 extends AbstractC6229 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f53849;

    public C16669(int i, int i2, InterfaceC7509 interfaceC7509) {
        super((int) C3991.m12909(i, i2, 2), interfaceC7509);
        this.f53849 = i2;
    }

    @Override // l.AbstractC6229
    /* JADX INFO: renamed from: ۙ */
    public final void mo17856(int i) {
        int i2 = this.f21157;
        StringBuilder sb = this.f21156;
        if (i2 != 0 && i2 % this.f53849 == 0) {
            sb.append('\n');
        }
        for (int i3 = 7; i3 >= 0; i3--) {
            sb.append((char) (((i >>> i3) & 1) + 48));
        }
        sb.append(' ');
    }

    @Override // l.AbstractC6229
    public final String finish() {
        StringBuilder sb = this.f21156;
        C3991.m12911(sb);
        return sb.toString();
    }
}
