package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2893 implements IntConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3639 f9481;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f9483;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f9482 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f9484 = 0;

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    public C2893(C3639 c3639, long j) {
        this.f9481 = c3639;
        this.f9483 = j;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.f9482;
        C3639 c3639 = this.f9481;
        if (j >= 1000) {
            c3639.mo11789();
            this.f9482 = jUptimeMillis;
        }
        long j2 = i;
        long j3 = this.f9484 + j2;
        this.f9484 = j3;
        c3639.mo11790(j2, j3, this.f9483);
        if (c3639.f12461.mo924()) {
            throw new CancellationException();
        }
    }
}
