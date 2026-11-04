package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19047 extends CountedCompleter implements InterfaceC15143 {
    public final InterfaceC8409 a;
    public final AbstractC13956 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public abstract AbstractC19047 a(InterfaceC8409 interfaceC8409, long j, long j2);

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC13956.t();
        throw null;
    }

    @Override // l.InterfaceC15143
    public /* synthetic */ void accept(long j) {
        AbstractC13956.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC19047(InterfaceC8409 interfaceC8409, AbstractC13956 abstractC13956, int i) {
        this.a = interfaceC8409;
        this.b = abstractC13956;
        this.c = AbstractC19902.e(interfaceC8409.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public AbstractC19047(AbstractC19047 abstractC19047, InterfaceC8409 interfaceC8409, long j, long j2, int i) {
        super(abstractC19047);
        this.a = interfaceC8409;
        this.b = abstractC19047.b;
        this.c = abstractC19047.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC8409 interfaceC8409TrySplit;
        InterfaceC8409 interfaceC8409 = this.a;
        AbstractC19047 abstractC19047A = this;
        while (interfaceC8409.estimateSize() > abstractC19047A.c && (interfaceC8409TrySplit = interfaceC8409.trySplit()) != null) {
            abstractC19047A.setPendingCount(1);
            long jEstimateSize = interfaceC8409TrySplit.estimateSize();
            abstractC19047A.a(interfaceC8409TrySplit, abstractC19047A.d, jEstimateSize).fork();
            abstractC19047A = abstractC19047A.a(interfaceC8409, abstractC19047A.d + jEstimateSize, abstractC19047A.e - jEstimateSize);
        }
        abstractC19047A.b.f0(interfaceC8409, abstractC19047A);
        abstractC19047A.propagateCompletion();
    }

    @Override // l.InterfaceC15143
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
