package l;

import android.os.SystemClock;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8987 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        SystemClock.sleep(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }
}
