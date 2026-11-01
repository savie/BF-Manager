package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C12788 extends AbstractC21960 implements InterfaceC11501 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f42609;

    @Override // l.AbstractC21960, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13618.m33299(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC21960, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13618.m33300(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC21960
    /* JADX INFO: renamed from: ۙ */
    public final void mo6669(int i, Object obj) {
        ((InterfaceC17767) obj).mo35707(this.f42609.f13289[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12788(C3614 c3614) {
        super(c3614);
        this.f42609 = c3614;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12788(C3614 c3614, int i, int i2, boolean z) {
        super(c3614, i, i2, z);
        this.f42609 = c3614;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f71258 ? 256 : 320;
    }

    @Override // l.AbstractC21960
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21960 mo6668(int i, int i2, boolean z) {
        return new C12788(this.f42609, i, i2, z);
    }
}
