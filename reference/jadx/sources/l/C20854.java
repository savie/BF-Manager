package l;

import android.os.Debug;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20854 extends Thread {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C0219 f67748 = new C0219();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C0219 f67749 = new C0219();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0219 f67753 = f67748;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0219 f67754 = f67749;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f67752 = "";

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f67750 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f67756 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f67755 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f67751 = 15000;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C10271 c10271M26057;
        setName("|ANR-WatchDog|");
        RunnableC7448 runnableC7448 = new RunnableC7448(0, this);
        while (!isInterrupted()) {
            if (!C12713.f42396.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e = e;
                    this.f67754.getClass();
                    e.getMessage();
                    return;
                }
            } else {
                this.f67756 = false;
                int i = 0;
                while (true) {
                    if (i < 3) {
                        C16737.m39273(runnableC7448);
                        try {
                            Thread.sleep(this.f67751 / 3);
                            if (this.f67756 || !C12713.f42396.getLifecycle().mo9170().m24173(EnumC9414.STARTED)) {
                                break;
                            } else {
                                i++;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            this.f67754.getClass();
                            e.getMessage();
                            return;
                        }
                    } else {
                        if (!this.f67755) {
                            break;
                        }
                        if (!this.f67750 && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            this.f67755 = false;
                            break;
                        }
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.os.MessageQueue")) {
                            this.f67755 = false;
                            break;
                        }
                        String str = this.f67752;
                        if (str != null) {
                            c10271M26057 = C10271.m26058(this.f67751, str, this);
                        } else {
                            c10271M26057 = C10271.m26057(this.f67751);
                        }
                        this.f67753.getClass();
                        throw c10271M26057;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46875(C20854 c20854) {
        c20854.f67756 = true;
        c20854.f67755 = true;
    }
}
