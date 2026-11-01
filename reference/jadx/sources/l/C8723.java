package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8723 implements LongConsumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f29974;

    public /* synthetic */ C8723(C5900 c5900) {
        this.f29974 = c5900;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f29974.m16141(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }
}
