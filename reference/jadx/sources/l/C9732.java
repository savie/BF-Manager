package l;

import android.os.SystemClock;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۡ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9732 implements LongSupplier {
    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        return SystemClock.elapsedRealtime();
    }
}
