package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6801 extends AbstractC1862 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    public C6801(int i) {
        this.c = new int[i];
    }

    @Override // l.AbstractC1862
    public final void a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}
