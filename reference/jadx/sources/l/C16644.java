package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܺۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16644 implements LongConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f53787;

    public /* synthetic */ C16644(C3966 c3966) {
        this.f53787 = c3966;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f53787.m12714(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }
}
