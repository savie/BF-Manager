package l;

/* JADX INFO: renamed from: l.ۖ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes2.dex */
public class C2824 extends AbstractC5647 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23992 f10711;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23992 f10712;

    @Override // l.AbstractC5647
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo8576(int i, int i2, int i3, int i4) {
        C23992 c23992 = new C23992(i, i2, i3 - i, i4 - i2);
        C23992 c23993 = this.f10712;
        if (c23993 != null) {
            c23993.f77761 = c23992;
        } else {
            this.f10711 = c23992;
        }
        this.f10712 = c23992;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC4941 m8577() {
        m15539();
        return new C1621(this.f10711, m15538(), m15541());
    }
}
