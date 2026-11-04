package l;

/* JADX INFO: renamed from: l.᩵ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20399 extends AbstractC6229 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f65389;

    public C20399(int i, int i2, InterfaceC7509 interfaceC7509) {
        super((int) C3991.m12909(i, i2, 1), interfaceC7509);
        this.f65389 = i2;
    }

    @Override // l.AbstractC6229
    /* JADX INFO: renamed from: ۙ */
    public final void mo17856(int i) {
        int i2 = this.f21157;
        StringBuilder sb = this.f21156;
        if (i2 != 0 && i2 % this.f65389 == 0) {
            sb.append('\n');
        }
        sb.append(i);
        if (i < 10) {
            sb.append("   ");
        } else if (i < 100) {
            sb.append(EnumC7687.f25319);
        } else {
            sb.append(' ');
        }
    }

    @Override // l.AbstractC6229
    public final String finish() {
        StringBuilder sb = this.f21156;
        C3991.m12911(sb);
        return sb.toString();
    }
}
