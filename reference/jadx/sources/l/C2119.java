package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C2119 extends AbstractC21960 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f7771;

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC21960
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6669(int i, Object obj) {
        ((Consumer) obj).accept(new C11377(this.f7771, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2119(C3614 c3614) {
        super(c3614);
        this.f7771 = c3614;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2119(C3614 c3614, int i, int i2, boolean z) {
        super(c3614, i, i2, z);
        this.f7771 = c3614;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f71258 ? 1 : 65;
    }

    @Override // l.AbstractC21960
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21960 mo6668(int i, int i2, boolean z) {
        return new C2119(this.f7771, i, i2, z);
    }
}
