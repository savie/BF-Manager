package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: l.ᩴܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19902 extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC13956 a;
    public InterfaceC8409 b;
    public long c;
    public AbstractC19902 d;
    public AbstractC19902 e;
    public Object f;

    public abstract Object a();

    public abstract AbstractC19902 c(InterfaceC8409 interfaceC8409);

    public AbstractC19902(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        super(null);
        this.a = abstractC13956;
        this.b = interfaceC8409;
        this.c = 0L;
    }

    public AbstractC19902(AbstractC19902 abstractC19902, InterfaceC8409 interfaceC8409) {
        super(abstractC19902);
        this.b = interfaceC8409;
        this.a = abstractC19902.a;
        this.c = abstractC19902.c;
    }

    public static long e(long j) {
        long j2 = j / ((long) g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((AbstractC19902) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        InterfaceC8409 interfaceC8409TrySplit;
        InterfaceC8409 interfaceC8409 = this.b;
        long jEstimateSize = interfaceC8409.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC19902 abstractC19902 = this;
        while (jEstimateSize > jE && (interfaceC8409TrySplit = interfaceC8409.trySplit()) != null) {
            AbstractC19902 abstractC19902C = abstractC19902.c(interfaceC8409TrySplit);
            abstractC19902.d = abstractC19902C;
            AbstractC19902 abstractC19902C2 = abstractC19902.c(interfaceC8409);
            abstractC19902.e = abstractC19902C2;
            abstractC19902.setPendingCount(1);
            if (z) {
                interfaceC8409 = interfaceC8409TrySplit;
                abstractC19902 = abstractC19902C;
                abstractC19902C = abstractC19902C2;
            } else {
                abstractC19902 = abstractC19902C2;
            }
            z = !z;
            abstractC19902C.fork();
            jEstimateSize = interfaceC8409.estimateSize();
        }
        abstractC19902.d(abstractC19902.a());
        abstractC19902.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
