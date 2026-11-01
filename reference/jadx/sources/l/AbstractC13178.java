package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13178 implements InterfaceC20693 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20693 f43873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f43874;

    @Override // l.InterfaceC20693
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C21398.$default$forEachRemaining(this, consumer);
    }

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

    public AbstractC13178(InterfaceC20693 interfaceC20693, long j) {
        this.f43873 = interfaceC20693;
        this.f43874 = j;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC20693 interfaceC20693TrySplit = this.f43873.trySplit();
        if (interfaceC20693TrySplit == null) {
            return null;
        }
        long j = this.f43874;
        C22350 c22350 = new C22350(interfaceC20693TrySplit, j, ((C22350) this).f73021);
        this.f43874 = interfaceC20693TrySplit.getExactSizeIfKnown() + j;
        return c22350;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f43873.estimateSize();
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f43873.characteristics() & 16464;
    }
}
