package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11285 implements IntConsumer {
    public long count;
    public long sum;
    public int min = Integer.MAX_VALUE;
    public int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final void a(C11285 c11285) {
        this.count += c11285.count;
        this.sum += c11285.sum;
        this.min = Math.min(this.min, c11285.min);
        this.max = Math.max(this.max, c11285.max);
    }

    public final String toString() {
        String simpleName = C11285.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
