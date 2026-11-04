package l;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.ۗ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3728 extends Timer {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12808;

    @Override // java.util.Timer
    public final synchronized void cancel() {
        if (this.f12808) {
            return;
        }
        this.f12808 = true;
        super.cancel();
    }

    public C3728(String str, boolean z) {
        super(str, z);
        this.f12808 = false;
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j) {
        if (this.f12808) {
            return;
        }
        super.schedule(timerTask, j);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date) {
        if (this.f12808) {
            return;
        }
        super.schedule(timerTask, date);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j, long j2) {
        if (this.f12808) {
            return;
        }
        super.schedule(timerTask, j, j2);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date, long j) {
        if (this.f12808) {
            return;
        }
        super.schedule(timerTask, date, j);
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
        if (this.f12808) {
            return;
        }
        super.scheduleAtFixedRate(timerTask, j, j2);
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
        if (this.f12808) {
            return;
        }
        super.scheduleAtFixedRate(timerTask, date, j);
    }
}
