package l;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8P4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24306 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f78655;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4168 f78656;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54322(C24306 c24306, C17074 c17074) {
        synchronized (c17074) {
        }
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4882(c17074);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54332(C17074 c17074) {
        synchronized (c17074) {
        }
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new RunnableC8349(1, this, c17074));
        }
    }

    public C24306(Handler handler, InterfaceC4168 interfaceC4168) {
        if (interfaceC4168 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f78655 = handler;
        this.f78656 = interfaceC4168;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54335(final C17074 c17074) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۨ۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54325(this.f39731, c17074);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54325(C24306 c24306, C17074 c17074) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4887(c17074);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54330(final String str, final long j, final long j2) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩹۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54320(this.f76104, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54320(C24306 c24306, String str, long j, long j2) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str2 = C7116.f23455;
        interfaceC4168.mo4877(str, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54331(final C15648 c15648, final C17820 c17820) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۛ۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54321(this.f21609, c15648, c17820);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54321(C24306 c24306, C15648 c15648, C17820 c17820) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4894(c15648, c17820);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54326(final int i, final long j) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۗ۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54324(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54324(int i, long j, C24306 c24306) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4889(i, j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54334(final int i, final long j) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩵۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54316(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54316(int i, long j, C24306 c24306) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4870(i, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54333(C18787 c18787) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new RunnableC24122(2, this, c18787));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54323(C24306 c24306, C18787 c18787) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4883(c18787);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54328(final Object obj) {
        Handler handler = this.f78655;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.ܶ۫᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C24306.m54318(this.f52152, obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54318(C24306 c24306, Object obj, long j) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4873(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54329(String str) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new RunnableC8498(2, this, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54319(C24306 c24306, String str) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str2 = C7116.f23455;
        interfaceC4168.mo4876(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54327(Exception exc) {
        Handler handler = this.f78655;
        if (handler != null) {
            handler.post(new RunnableC16860(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54317(C24306 c24306, Exception exc) {
        InterfaceC4168 interfaceC4168 = c24306.f78656;
        String str = C7116.f23455;
        interfaceC4168.mo4890(exc);
    }
}
