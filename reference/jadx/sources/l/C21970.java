package l;

/* JADX INFO: renamed from: l.᩹֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes5.dex */
public final class C21970 extends AbstractC12798 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f71280;

    public C21970(int i, int i2, InterfaceC5614 interfaceC5614) {
        super((int) C6447.m17632(i, i2, 1), interfaceC5614);
        this.f71280 = i2;
    }

    @Override // l.AbstractC12798
    /* JADX INFO: renamed from: ۙ */
    public final void mo3370(int i) {
        int i2 = this.f42628;
        StringBuilder sb = this.f42626;
        if (i2 != 0 && i2 % this.f71280 == 0) {
            sb.append('\n');
        }
        sb.append(i);
        if (i < 10) {
            sb.append("   ");
        } else if (i < 100) {
            sb.append(EnumC19730.f63352);
        } else {
            sb.append(' ');
        }
    }

    @Override // l.AbstractC12798
    public final String finish() {
        StringBuilder sb = this.f42626;
        C6447.m17634(sb);
        return sb.toString();
    }
}
