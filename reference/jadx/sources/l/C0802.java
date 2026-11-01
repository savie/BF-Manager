package l;

/* JADX INFO: renamed from: l.֨֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C0802 extends AbstractC12798 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f3401;

    public C0802(int i, int i2, InterfaceC5614 interfaceC5614) {
        super((int) C6447.m17632(i, i2, 0), interfaceC5614);
        this.f3401 = i2;
    }

    @Override // l.AbstractC12798
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3370(int i) {
        int i2 = this.f42628;
        StringBuilder sb = this.f42626;
        if (i2 != 0 && i2 % this.f3401 == 0) {
            sb.append('\n');
        }
        sb.append(C6447.f21818[i >>> 4]);
        sb.append(C6447.f21818[i & 15]);
        sb.append(' ');
    }

    @Override // l.AbstractC12798
    public final String finish() {
        StringBuilder sb = this.f42626;
        C6447.m17634(sb);
        return sb.toString();
    }
}
