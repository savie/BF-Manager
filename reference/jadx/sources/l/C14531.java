package l;

import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14531 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f45715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7820 f45716;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45717;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45718;

    public /* synthetic */ C14531(C7820 c7820, int i, int i2, BitSet bitSet) {
        this.f45716 = c7820;
        this.f45718 = i;
        this.f45717 = i2;
        this.f45715 = bitSet;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C7820 c7820 = this.f45716;
        C24975 c24975 = c7820.f26041;
        int i = this.f45718;
        return new C21245(c7820, c24975, i, this.f45717, this.f45715, i);
    }
}
