package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VCBM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2699 implements LongConsumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f10396;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f10396.accept(Long.valueOf(j));
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }
}
