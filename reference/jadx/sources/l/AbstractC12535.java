package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12535 implements InterfaceC20693 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20693 f41963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC20693 f41964;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41965;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13212 f41966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f41967;

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

    public AbstractC12535(InterfaceC20693 interfaceC20693, InterfaceC20693 interfaceC20694, C13212 c13212, C0219 c0219, int i, long j) {
        this.f41964 = interfaceC20693;
        this.f41963 = interfaceC20694;
        this.f41966 = c13212;
        this.f41965 = i;
        this.f41967 = j;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        do {
            InterfaceC20693 interfaceC20693 = this.f41964;
            if (interfaceC20693 != null && interfaceC20693.tryAdvance(consumer)) {
                long j = this.f41967;
                if (j == C17492.FOREVER_NS) {
                    return true;
                }
                this.f41967 = j - 1;
                return true;
            }
            this.f41964 = null;
        } while (this.f41963.tryAdvance(new Consumer() { // from class: l.ܽܽܶ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C1455.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f53669.f41964 = (InterfaceC20693) obj;
            }
        }));
        return false;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(final Consumer consumer) {
        InterfaceC20693 interfaceC20693 = this.f41964;
        if (interfaceC20693 != null) {
            interfaceC20693.forEachRemaining(consumer);
            this.f41964 = null;
        }
        this.f41963.forEachRemaining(new Consumer(this) { // from class: l.֡ܽܶ
            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return C1455.$default$andThen(this, consumer2);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC20693 interfaceC20694 = (InterfaceC20693) obj;
                if (interfaceC20694 != null) {
                    interfaceC20694.forEachRemaining(consumer);
                }
            }
        });
        this.f41967 = 0L;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC20693 interfaceC20693TrySplit = this.f41963.trySplit();
        if (interfaceC20693TrySplit != null) {
            int i = this.f41965 & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < C17492.FOREVER_NS) {
                jEstimateSize /= 2;
                this.f41967 -= jEstimateSize;
                this.f41965 = i;
            }
            C17473 c17473 = new C17473(this.f41964, interfaceC20693TrySplit, this.f41966, i, jEstimateSize);
            this.f41964 = null;
            return c17473;
        }
        InterfaceC20693 interfaceC20693 = this.f41964;
        if (interfaceC20693 == null) {
            return null;
        }
        this.f41964 = null;
        return interfaceC20693;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC20693 interfaceC20693 = this.f41964;
        if (interfaceC20693 != null) {
            this.f41967 = Math.max(this.f41967, interfaceC20693.estimateSize());
        }
        return Math.max(this.f41967, 0L);
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f41965;
    }
}
