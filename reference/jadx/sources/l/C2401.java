package l;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: l.ۖۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2401 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8367 f7716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConditionVariable f7717;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401(C8367 c8367, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f7716 = c8367;
        this.f7717 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f7716) {
            this.f7717.open();
            C8367.m22515(this.f7716);
            this.f7716.f27444.getClass();
        }
    }
}
