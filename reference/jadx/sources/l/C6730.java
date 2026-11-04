package l;

/* JADX INFO: renamed from: l.ۛ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes3.dex */
public class C6730 extends AbstractC24630 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16579 f22429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16579 f22430;

    @Override // l.AbstractC24630
    /* JADX INFO: renamed from: ۙ */
    public void mo14213(int i, int i2, int i3, int i4) {
        C16579 c16579 = new C16579(i, i2, i3 - i, i4 - i2);
        C16579 c165710 = this.f22429;
        if (c165710 != null) {
            c165710.f53657 = c16579;
        } else {
            this.f22430 = c16579;
        }
        this.f22429 = c16579;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 m18810() {
        m54960();
        return new C17916(this.f22430, m54966(), m54963());
    }
}
