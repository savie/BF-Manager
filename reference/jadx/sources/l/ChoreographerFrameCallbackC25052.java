package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.᩻۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC25052 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ChoreographerFrameCallbackC25052 f81033 = new ChoreographerFrameCallbackC25052();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile long f81034 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Choreographer f81035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f81036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f81037;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ChoreographerFrameCallbackC25052 m55876() {
        return f81033;
    }

    public ChoreographerFrameCallbackC25052() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = C7116.f23455;
        Handler handler = new Handler(looper, this);
        this.f81037 = handler;
        handler.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55877() {
        this.f81037.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55878() {
        this.f81037.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f81034 = j;
        Choreographer choreographer = this.f81035;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f81035 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                C1896.m6514("Vsync sampling disabled due to platform error", e);
                return true;
            }
        }
        if (i == 2) {
            Choreographer choreographer = this.f81035;
            if (choreographer != null) {
                int i2 = this.f81036 + 1;
                this.f81036 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f81035;
            if (choreographer2 != null) {
                int i3 = this.f81036 - 1;
                this.f81036 = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f81034 = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
