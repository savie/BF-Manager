package l;

/* JADX INFO: renamed from: l.ۨۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12194 extends AbstractC6229 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f39203;

    public C12194(int i, int i2, InterfaceC7509 interfaceC7509) {
        super((int) C3991.m12909(i, i2, 0), interfaceC7509);
        this.f39203 = i2;
    }

    @Override // l.AbstractC6229
    /* JADX INFO: renamed from: ۙ */
    public final void mo17856(int i) {
        int i2 = this.f21157;
        StringBuilder sb = this.f21156;
        if (i2 != 0 && i2 % this.f39203 == 0) {
            sb.append('\n');
        }
        sb.append(C3991.f13656[i >>> 4]);
        sb.append(C3991.f13656[i & 15]);
        sb.append(' ');
    }

    @Override // l.AbstractC6229
    public final String finish() {
        StringBuilder sb = this.f21156;
        C3991.m12911(sb);
        return sb.toString();
    }
}
