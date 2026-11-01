package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8045 implements IntConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f28185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4516 f28187;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f28186 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f28188 = 0;

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    public C8045(C4516 c4516, long j) {
        this.f28187 = c4516;
        this.f28185 = j;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.f28186;
        C4516 c4516 = this.f28187;
        if (j >= 1000) {
            c4516.mo10126();
            this.f28186 = jUptimeMillis;
        }
        long j2 = i;
        long j3 = this.f28188 + j2;
        this.f28188 = j3;
        c4516.mo10127(j2, j3, this.f28185);
        if (c4516.f16073.mo2357()) {
            throw new CancellationException();
        }
    }
}
