package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public final class C1182 extends AbstractC15755 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4328 f5253;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f5254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f5255;

    @Override // l.AbstractC15755, l.InterfaceC20693
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C21398.$default$forEachRemaining(this, consumer);
    }

    @Override // l.AbstractC15755, l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.AbstractC15755, l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.AbstractC15755, l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182(long j, int i, Iterator it, C4328 c4328) {
        super(j, i);
        this.f5255 = it;
        this.f5253 = c4328;
        this.f5254 = 0L;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        Iterator it = this.f5255;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        long j = this.f5254;
        this.f5254 = 1 + j;
        if (!((C12188) this.f5253.f15523).apply(next)) {
            j = -1;
        }
        consumer.accept(Long.valueOf(j));
        return true;
    }
}
