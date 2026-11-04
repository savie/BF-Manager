package l;

/* JADX INFO: renamed from: l.ۤܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10951 {
    public final long a;
    public final long b;
    public InterfaceC8409 c;
    public long d;
    public long e;

    public abstract InterfaceC8409 a(InterfaceC8409 interfaceC8409, long j, long j2, long j3, long j4);

    public AbstractC10951(InterfaceC8409 interfaceC8409, long j, long j2, long j3, long j4) {
        this.c = interfaceC8409;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC8409 m27775trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            InterfaceC8409 interfaceC8409TrySplit = this.c.trySplit();
            if (interfaceC8409TrySplit == null) {
                return null;
            }
            long jEstimateSize = interfaceC8409TrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin >= j3) {
                    this.c = interfaceC8409TrySplit;
                    this.e = jMin;
                } else {
                    long j4 = this.d;
                    if (j4 >= j2 && jEstimateSize <= j3) {
                        this.d = jMin;
                        return interfaceC8409TrySplit;
                    }
                    this.d = jMin;
                    return a(interfaceC8409TrySplit, j2, j3, j4, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m27776trySplit() {
        return (InterfaceC9154) m27775trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC7664 m27774trySplit() {
        return (InterfaceC7664) m27775trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9900 m27777trySplit() {
        return (InterfaceC9900) m27775trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC3012 trySplit() {
        return (InterfaceC3012) m27775trySplit();
    }
}
