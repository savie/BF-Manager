package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1379 implements InterfaceC8409 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10080 f4914;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC8409 f4915;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f4916;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8409 f4917;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f4918;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public AbstractC1379(InterfaceC8409 interfaceC8409, InterfaceC8409 interfaceC84010, C10080 c10080, C13921 c13921, int i, long j) {
        this.f4915 = interfaceC8409;
        this.f4917 = interfaceC84010;
        this.f4914 = c10080;
        this.f4916 = i;
        this.f4918 = j;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        do {
            InterfaceC8409 interfaceC8409 = this.f4915;
            if (interfaceC8409 != null && interfaceC8409.tryAdvance(consumer)) {
                long j = this.f4918;
                if (j == C25227.FOREVER_NS) {
                    return true;
                }
                this.f4918 = j - 1;
                return true;
            }
            this.f4915 = null;
        } while (this.f4917.tryAdvance(new Consumer() { // from class: l.ۢᩴܽ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C12312.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f32930.f4915 = (InterfaceC8409) obj;
            }
        }));
        return false;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC8409 interfaceC8409 = this.f4915;
        if (interfaceC8409 != null) {
            interfaceC8409.forEachRemaining(consumer);
            this.f4915 = null;
        }
        this.f4917.forEachRemaining(new C13261(this, consumer));
        this.f4918 = 0L;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC8409 interfaceC8409TrySplit = this.f4917.trySplit();
        if (interfaceC8409TrySplit != null) {
            int i = this.f4916 & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < C25227.FOREVER_NS) {
                jEstimateSize /= 2;
                this.f4918 -= jEstimateSize;
                this.f4916 = i;
            }
            C9581 c9581 = new C9581(this.f4915, interfaceC8409TrySplit, this.f4914, i, jEstimateSize);
            this.f4915 = null;
            return c9581;
        }
        InterfaceC8409 interfaceC8409 = this.f4915;
        if (interfaceC8409 == null) {
            return null;
        }
        this.f4915 = null;
        return interfaceC8409;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC8409 interfaceC8409 = this.f4915;
        if (interfaceC8409 != null) {
            this.f4918 = Math.max(this.f4918, interfaceC8409.estimateSize());
        }
        return Math.max(this.f4918, 0L);
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f4916;
    }
}
