package l;

/* JADX INFO: renamed from: l.ᩳۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17974 {
    public final long a;
    public final long b;
    public InterfaceC20693 c;
    public long d;
    public long e;

    public abstract InterfaceC20693 a(InterfaceC20693 interfaceC20693, long j, long j2, long j3, long j4);

    public AbstractC17974(InterfaceC20693 interfaceC20693, long j, long j2, long j3, long j4) {
        this.c = interfaceC20693;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final InterfaceC20693 m41803trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            InterfaceC20693 interfaceC20693TrySplit = this.c.trySplit();
            if (interfaceC20693TrySplit == null) {
                return null;
            }
            long jEstimateSize = interfaceC20693TrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin >= j3) {
                    this.c = interfaceC20693TrySplit;
                    this.e = jMin;
                } else {
                    long j4 = this.d;
                    if (j4 >= j2 && jEstimateSize <= j3) {
                        this.d = jMin;
                        return interfaceC20693TrySplit;
                    }
                    this.d = jMin;
                    return a(interfaceC20693TrySplit, j2, j3, j4, jMin);
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
    public /* bridge */ /* synthetic */ InterfaceC10110 m41800trySplit() {
        return (InterfaceC10110) m41803trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m41801trySplit() {
        return (InterfaceC18576) m41803trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19282 m41802trySplit() {
        return (InterfaceC19282) m41803trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC7535 trySplit() {
        return (InterfaceC7535) m41803trySplit();
    }
}
