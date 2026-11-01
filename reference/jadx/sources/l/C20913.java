package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20913 extends AbstractC1862 implements LongConsumer {
    public final long[] c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    public C20913(int i) {
        this.c = new long[i];
    }

    @Override // l.AbstractC1862
    public final void a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }
}
