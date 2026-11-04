package l;

import android.os.Debug;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۗۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3346 extends Thread {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C13921 f10924;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C13921 f10925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13921 f10929 = f10924;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13921 f10926 = f10925;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f10927 = "";

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10930 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f10932 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f10931 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f10928 = 15000;

    static {
        int i = 1;
        f10924 = new C13921(i);
        f10925 = new C13921(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C16024 c16024M38149;
        setName("|ANR-WatchDog|");
        RunnableC23484 runnableC23484 = new RunnableC23484(0, this);
        while (!isInterrupted()) {
            if (!C4506.f16079.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e = e;
                    this.f10926.getClass();
                    e.getMessage();
                    return;
                }
            } else {
                this.f10932 = false;
                int i = 0;
                while (true) {
                    if (i < 3) {
                        C21576.m49068(runnableC23484);
                        try {
                            Thread.sleep(this.f10928 / 3);
                            if (this.f10932 || !C4506.f16079.getLifecycle().mo23076().m8762(EnumC2619.STARTED)) {
                                break;
                            } else {
                                i++;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            this.f10926.getClass();
                            e.getMessage();
                            return;
                        }
                    } else {
                        if (!this.f10931) {
                            break;
                        }
                        if (!this.f10930 && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            this.f10931 = false;
                            break;
                        }
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.os.MessageQueue")) {
                            this.f10931 = false;
                            break;
                        }
                        String str = this.f10927;
                        if (str != null) {
                            c16024M38149 = C16024.m38150(this.f10928, str, this);
                        } else {
                            c16024M38149 = C16024.m38149(this.f10928);
                        }
                        this.f10929.getClass();
                        throw c16024M38149;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10997(C3346 c3346) {
        c3346.f10932 = true;
        c3346.f10931 = true;
    }
}
