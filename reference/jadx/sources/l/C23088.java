package l;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: l.᩺ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes.dex */
public final class C23088 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15327 f75026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConditionVariable f75027;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23088(C15327 c15327, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f75026 = c15327;
        this.f75027 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f75026) {
            this.f75027.open();
            C15327.m36695(this.f75026);
            this.f75026.f49921.getClass();
        }
    }
}
