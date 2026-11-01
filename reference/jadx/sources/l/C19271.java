package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.᩵ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8RI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19271 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f62218;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8688 f62219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44222(C19271 c19271, C12629 c12629) {
        synchronized (c12629) {
        }
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11561(c12629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44231(C12629 c12629) {
        synchronized (c12629) {
        }
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC21527(1, this, c12629));
        }
    }

    public C19271(Handler handler, InterfaceC8688 interfaceC8688) {
        if (interfaceC8688 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f62218 = handler;
        this.f62219 = interfaceC8688;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44235(C12629 c12629) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC22233(1, this, c12629));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44218(C19271 c19271, C12629 c12629) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11589(c12629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44228(final String str, final long j, final long j2) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ᩴۛۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C19271.m44215(this.f59056, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44215(C19271 c19271, String str, long j, long j2) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str2 = C17983.f57504;
        interfaceC8688.mo11586(str, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44229(C7648 c7648, C17567 c17567) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC22939(this, c7648, c17567, 1));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44216(C19271 c19271, C7648 c7648, C17567 c17567) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11574(c7648, c17567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44224(final long j) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ᩳۛۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C19271.m44212(this.f56553, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44212(C19271 c19271, long j) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11565(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44225(final long j, final int i, final long j2) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩸ۛۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C19271.m44211(this.f69536, i, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44211(C19271 c19271, int i, long j, long j2) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11566(j, i, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44227(String str) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC15178(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44214(C19271 c19271, String str) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str2 = C17983.f57504;
        interfaceC8688.mo11585(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44232(final boolean z) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.۠ۛۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C19271.m44219(this.f26202, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44219(C19271 c19271, boolean z) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11579(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44233(Exception exc) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC0968(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44220(C19271 c19271, Exception exc) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11569(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44226(Exception exc) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC7228(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44213(C19271 c19271, Exception exc) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11580(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44230(C10099 c10099) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC3827(1, this, c10099));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44217(C19271 c19271, C10099 c10099) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11575(c10099);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44234(C10099 c10099) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC13438(1, this, c10099));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44221(C19271 c19271, C10099 c10099) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11588(c10099);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44223(int i) {
        Handler handler = this.f62218;
        if (handler != null) {
            handler.post(new RunnableC4488(i, 1, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44210(C19271 c19271, int i) {
        InterfaceC8688 interfaceC8688 = c19271.f62219;
        String str = C17983.f57504;
        interfaceC8688.mo11563(i);
    }
}
