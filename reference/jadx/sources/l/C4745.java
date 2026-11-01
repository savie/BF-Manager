package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۙܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4745 extends C3479 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BitSet f16695;

    public C4745(int i) {
        this.f16695 = new BitSet(i);
    }

    @Override // l.C3479
    /* JADX INFO: renamed from: ۨ */
    public final void mo10210(int i) {
        this.f16695.set(i);
    }

    @Override // l.C3479, l.InterfaceC9831
    /* JADX INFO: renamed from: ܰ */
    public final int mo10211(int i) {
        int i2 = 0;
        for (int i3 = this.f12773[super.mo10209(i) - 1]; i3 < i; i3++) {
            i2 = this.f16695.get(i3) ? ((i2 / 8) * 8) + 8 : i2 + 1;
        }
        return i2 + 1;
    }
}
