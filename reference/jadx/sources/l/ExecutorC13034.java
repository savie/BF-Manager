package l;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC13034 implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5577 f41715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Runnable f41717;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f41716 = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41718 = false;

    public ExecutorC13034(ActivityC5577 activityC5577) {
        this.f41715 = activityC5577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32455(View view) {
        if (this.f41718) {
            return;
        }
        this.f41718 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41717 = runnable;
        View decorView = this.f41715.getWindow().getDecorView();
        if (this.f41718) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new Runnable() { // from class: l.ܳۤ
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC13034 executorC13034 = this.f49921;
                Runnable runnable2 = executorC13034.f41717;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC13034.f41717 = null;
                }
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f41717;
        ActivityC5577 activityC5577 = this.f41715;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f41716) {
                this.f41718 = false;
                activityC5577.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f41717 = null;
        if (activityC5577.f19373.m46993()) {
            this.f41718 = false;
            activityC5577.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41715.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
