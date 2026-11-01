package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11625 extends AbstractC17974 implements InterfaceC20693 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public C11625(InterfaceC20693 interfaceC20693, long j, long j2) {
        super(interfaceC20693, j, j2, 0L, Math.min(interfaceC20693.estimateSize(), j2));
    }

    @Override // l.AbstractC17974
    public final InterfaceC20693 a(InterfaceC20693 interfaceC20693, long j, long j2, long j3, long j4) {
        return new C11625(interfaceC20693, j, j2, j3, j4);
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        C13638.requireNonNull(consumer);
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            this.c.tryAdvance(new C1040(23));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.tryAdvance(consumer);
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13638.requireNonNull(consumer);
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.c.estimateSize() + j3 <= this.b) {
            this.c.forEachRemaining(consumer);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            this.c.tryAdvance(new C1040(24));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.tryAdvance(consumer);
            this.d++;
        }
    }
}
