package l;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.۫᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4KI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13339 extends AbstractRunnableC5882 {
    @Override // l.AbstractRunnableC5882
    /* JADX INFO: renamed from: ۙ */
    public final void mo17109() {
        C17311 c17311 = this.f20165;
        long jM56799 = c17311.f56376.m56799(c17311.f56386);
        if (jM56799 >= 0) {
            this.f20165.f56382 = SystemClock.uptimeMillis() + jM56799;
            if (this.f20165.isVisible() && this.f20165.f56388) {
                C17311 c17312 = this.f20165;
                if (!c17312.f56380) {
                    c17312.f56387.remove(this);
                    C17311 c17313 = this.f20165;
                    c17313.f56379 = c17313.f56387.schedule(this, jM56799, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f20165.f56383.isEmpty() && this.f20165.f56376.m56817() == this.f20165.f56376.m56808() - 1) {
                C17311 c17314 = this.f20165;
                HandlerC23036 handlerC23036 = c17314.f56375;
                GifInfoHandle gifInfoHandle = c17314.f56376;
                int iM56807 = gifInfoHandle.m56807();
                if (iM56807 != 0 && iM56807 >= gifInfoHandle.m56810()) {
                    iM56807--;
                }
                handlerC23036.sendEmptyMessageAtTime(iM56807, this.f20165.f56382);
            }
        } else {
            C17311 c17315 = this.f20165;
            c17315.f56382 = Long.MIN_VALUE;
            c17315.f56388 = false;
        }
        if (!this.f20165.isVisible() || this.f20165.f56375.hasMessages(-1)) {
            return;
        }
        this.f20165.f56375.sendEmptyMessageAtTime(-1, 0L);
    }
}
