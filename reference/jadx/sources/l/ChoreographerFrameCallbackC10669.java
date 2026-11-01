package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.ۧ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC10669 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ChoreographerFrameCallbackC10669 f36389 = new ChoreographerFrameCallbackC10669();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f36390;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Choreographer f36391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile long f36392 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f36393;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ChoreographerFrameCallbackC10669 m26870() {
        return f36389;
    }

    public ChoreographerFrameCallbackC10669() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = C17983.f57504;
        Handler handler = new Handler(looper, this);
        this.f36393 = handler;
        handler.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26871() {
        this.f36393.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26872() {
        this.f36393.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f36392 = j;
        Choreographer choreographer = this.f36391;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f36391 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                C0303.m1852("Vsync sampling disabled due to platform error", e);
                return true;
            }
        }
        if (i == 2) {
            Choreographer choreographer = this.f36391;
            if (choreographer != null) {
                int i2 = this.f36390 + 1;
                this.f36390 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f36391;
            if (choreographer2 != null) {
                int i3 = this.f36390 - 1;
                this.f36390 = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f36392 = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
