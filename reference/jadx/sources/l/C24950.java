package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩻ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes.dex */
public final class C24950 extends C11523 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BitSet f80778;

    public C24950(int i) {
        this.f80778 = new BitSet(i);
    }

    @Override // l.C11523
    /* JADX INFO: renamed from: ۤ */
    public final void mo29015(int i) {
        this.f80778.set(i);
    }

    @Override // l.C11523, l.InterfaceC1829
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6322(int i) {
        int i2 = 0;
        for (int i3 = this.f36268[super.mo6321(i) - 1]; i3 < i; i3++) {
            i2 = this.f80778.get(i3) ? ((i2 / 8) * 8) + 8 : i2 + 1;
        }
        return i2 + 1;
    }
}
