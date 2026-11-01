package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: l.ܿۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17269 extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC22686 a;
    public InterfaceC20693 b;
    public long c;
    public AbstractC17269 d;
    public AbstractC17269 e;
    public Object f;

    public abstract Object a();

    public abstract AbstractC17269 c(InterfaceC20693 interfaceC20693);

    public AbstractC17269(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        super(null);
        this.a = abstractC22686;
        this.b = interfaceC20693;
        this.c = 0L;
    }

    public AbstractC17269(AbstractC17269 abstractC17269, InterfaceC20693 interfaceC20693) {
        super(abstractC17269);
        this.b = interfaceC20693;
        this.a = abstractC17269.a;
        this.c = abstractC17269.c;
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
        return ((AbstractC17269) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        InterfaceC20693 interfaceC20693TrySplit;
        InterfaceC20693 interfaceC20693 = this.b;
        long jEstimateSize = interfaceC20693.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC17269 abstractC17269 = this;
        while (jEstimateSize > jE && (interfaceC20693TrySplit = interfaceC20693.trySplit()) != null) {
            AbstractC17269 abstractC17269C = abstractC17269.c(interfaceC20693TrySplit);
            abstractC17269.d = abstractC17269C;
            AbstractC17269 abstractC17269C2 = abstractC17269.c(interfaceC20693);
            abstractC17269.e = abstractC17269C2;
            abstractC17269.setPendingCount(1);
            if (z) {
                interfaceC20693 = interfaceC20693TrySplit;
                abstractC17269 = abstractC17269C;
                abstractC17269C = abstractC17269C2;
            } else {
                abstractC17269 = abstractC17269C2;
            }
            z = !z;
            abstractC17269C.fork();
            jEstimateSize = interfaceC20693.estimateSize();
        }
        abstractC17269.d(abstractC17269.a());
        abstractC17269.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
