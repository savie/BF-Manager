package l;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۧۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4KI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10831 extends AbstractRunnableC23531 {
    @Override // l.AbstractRunnableC23531
    /* JADX INFO: renamed from: ۙ */
    public final void mo8900() {
        C4479 c4479 = this.f76196;
        long jM52902 = c4479.f15939.m52902(c4479.f15944);
        if (jM52902 >= 0) {
            this.f76196.f15948 = SystemClock.uptimeMillis() + jM52902;
            if (this.f76196.isVisible() && this.f76196.f15946) {
                C4479 c44710 = this.f76196;
                if (!c44710.f15941) {
                    c44710.f15931.remove(this);
                    C4479 c44711 = this.f76196;
                    c44711.f15938 = c44711.f15931.schedule(this, jM52902, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f76196.f15937.isEmpty() && this.f76196.f15939.m52916() == this.f76196.f15939.m52909() - 1) {
                C4479 c44712 = this.f76196;
                HandlerC12242 handlerC12242 = c44712.f15945;
                GifInfoHandle gifInfoHandle = c44712.f15939;
                int iM52914 = gifInfoHandle.m52914();
                if (iM52914 != 0 && iM52914 >= gifInfoHandle.m52897()) {
                    iM52914--;
                }
                handlerC12242.sendEmptyMessageAtTime(iM52914, this.f76196.f15948);
            }
        } else {
            C4479 c44713 = this.f76196;
            c44713.f15948 = Long.MIN_VALUE;
            c44713.f15946 = false;
        }
        if (!this.f76196.isVisible() || this.f76196.f15945.hasMessages(-1)) {
            return;
        }
        this.f76196.f15945.sendEmptyMessageAtTime(-1, 0L);
    }
}
