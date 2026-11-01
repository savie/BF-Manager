package l;

import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5419 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18717;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4007 f18718;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f18719;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18720;

    public /* synthetic */ C5419(C4007 c4007, int i, int i2, BitSet bitSet) {
        this.f18718 = c4007;
        this.f18720 = i;
        this.f18717 = i2;
        this.f18719 = bitSet;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4007 c4007 = this.f18718;
        C17684 c17684 = c4007.f14856;
        int i = this.f18720;
        return new C22353(c4007, c17684, i, this.f18717, this.f18719, i);
    }
}
