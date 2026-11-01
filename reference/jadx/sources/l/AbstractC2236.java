package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2236 extends CountedCompleter implements InterfaceC19171 {
    public final InterfaceC20693 a;
    public final AbstractC22686 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public abstract AbstractC2236 a(InterfaceC20693 interfaceC20693, long j, long j2);

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(double d) {
        AbstractC22686.m();
        throw null;
    }

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(int i) {
        AbstractC22686.t();
        throw null;
    }

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC2236(InterfaceC20693 interfaceC20693, AbstractC22686 abstractC22686, int i) {
        this.a = interfaceC20693;
        this.b = abstractC22686;
        this.c = AbstractC17269.e(interfaceC20693.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public AbstractC2236(AbstractC2236 abstractC2236, InterfaceC20693 interfaceC20693, long j, long j2, int i) {
        super(abstractC2236);
        this.a = interfaceC20693;
        this.b = abstractC2236.b;
        this.c = abstractC2236.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC20693 interfaceC20693TrySplit;
        InterfaceC20693 interfaceC20693 = this.a;
        AbstractC2236 abstractC2236A = this;
        while (interfaceC20693.estimateSize() > abstractC2236A.c && (interfaceC20693TrySplit = interfaceC20693.trySplit()) != null) {
            abstractC2236A.setPendingCount(1);
            long jEstimateSize = interfaceC20693TrySplit.estimateSize();
            abstractC2236A.a(interfaceC20693TrySplit, abstractC2236A.d, jEstimateSize).fork();
            abstractC2236A = abstractC2236A.a(interfaceC20693, abstractC2236A.d + jEstimateSize, abstractC2236A.e - jEstimateSize);
        }
        abstractC2236A.b.f0(interfaceC20693, abstractC2236A);
        abstractC2236A.propagateCompletion();
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
