package l;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC22254 implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Runnable f72747;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1086 f72749;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f72748 = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72750 = false;

    public ExecutorC22254(ActivityC1086 activityC1086) {
        this.f72749 = activityC1086;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49426(View view) {
        if (this.f72750) {
            return;
        }
        this.f72750 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f72747 = runnable;
        View decorView = this.f72749.getWindow().getDecorView();
        if (this.f72750) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new Runnable() { // from class: l.ۚۨ
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC22254 executorC22254 = this.f18366;
                Runnable runnable2 = executorC22254.f72747;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC22254.f72747 = null;
                }
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f72747;
        ActivityC1086 activityC1086 = this.f72749;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f72748) {
                this.f72750 = false;
                activityC1086.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f72747 = null;
        if (activityC1086.f4957.m43262()) {
            this.f72750 = false;
            activityC1086.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72749.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
