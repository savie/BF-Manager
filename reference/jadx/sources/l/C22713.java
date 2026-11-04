package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.᩸ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8RI */
/* JADX INFO: loaded from: classes.dex */
public final class C22713 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f73708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19729 f73709;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51207(C22713 c22713, C17074 c17074) {
        synchronized (c17074) {
        }
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4896(c17074);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51216(C17074 c17074) {
        synchronized (c17074) {
        }
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC1493(2, this, c17074));
        }
    }

    public C22713(Handler handler, InterfaceC19729 interfaceC19729) {
        if (interfaceC19729 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f73708 = handler;
        this.f73709 = interfaceC19729;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51220(C17074 c17074) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC11226(1, this, c17074));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51203(C22713 c22713, C17074 c17074) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4895(c17074);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51213(final String str, final long j, final long j2) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۙۢۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51200(this.f16851, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51200(C22713 c22713, String str, long j, long j2) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str2 = C7116.f23455;
        interfaceC19729.mo4892(str, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51215(final C15648 c15648, final C17820 c17820) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.۬ᩳۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51202(this.f44430, c15648, c17820);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51202(C22713 c22713, C15648 c15648, C17820 c17820) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4881(c15648, c17820);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51209(final long j) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.۠ᩳۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51197(this.f28684, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51197(C22713 c22713, long j) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4871(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51210(final long j, final int i, final long j2) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۖᩳۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51196(this.f9346, i, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51196(C22713 c22713, int i, long j, long j2) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4872(j, i, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51212(String str) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC6528(2, this, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51199(C22713 c22713, String str) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str2 = C7116.f23455;
        interfaceC19729.mo4891(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51217(final boolean z) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۤۢۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51204(this.f34203, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51204(C22713 c22713, boolean z) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4885(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51218(Exception exc) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC10571(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51205(C22713 c22713, Exception exc) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4875(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51211(final Exception exc) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۜᩳۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51198(this.f24088, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51198(C22713 c22713, Exception exc) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4886(exc);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51214(C15253 c15253) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC9695(1, this, c15253));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51201(C22713 c22713, C15253 c15253) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4880(c15253);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51219(C15253 c15253) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new RunnableC24905(1, this, c15253));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51206(C22713 c22713, C15253 c15253) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4893(c15253);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51208(final int i) {
        Handler handler = this.f73708;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩷ۢۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C22713.m51195(this.f70905, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51195(C22713 c22713, int i) {
        InterfaceC19729 interfaceC19729 = c22713.f73709;
        String str = C7116.f23455;
        interfaceC19729.mo4869(i);
    }
}
