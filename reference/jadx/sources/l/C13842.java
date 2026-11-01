package l;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܰ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13842 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f45671;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11725 f45672;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33676(C13842 c13842, C12629 c12629) {
        synchronized (c12629) {
        }
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11576(c12629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33686(C12629 c12629) {
        synchronized (c12629) {
        }
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC21795(2, this, c12629));
        }
    }

    public C13842(Handler handler, InterfaceC11725 interfaceC11725) {
        if (interfaceC11725 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f45671 = handler;
        this.f45672 = interfaceC11725;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33689(C12629 c12629) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC6195(1, this, c12629));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33679(C13842 c13842, C12629 c12629) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11581(c12629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33684(final String str, final long j, final long j2) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۢ֨ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    C13842.m33674(this.f31474, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33674(C13842 c13842, String str, long j, long j2) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str2 = C17983.f57504;
        interfaceC11725.mo11571(str, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33685(C7648 c7648, C17567 c17567) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC22902(this, c7648, c17567, 1));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33675(C13842 c13842, C7648 c7648, C17567 c17567) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11587(c7648, c17567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33680(final int i, final long j) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۗ֨ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    C13842.m33678(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33678(int i, long j, C13842 c13842) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11583(i, j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33688(final int i, final long j) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۙ۬ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    C13842.m33670(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33670(int i, long j, C13842 c13842) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11564(i, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33687(C13314 c13314) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC3850(2, this, c13314));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33677(C13842 c13842, C13314 c13314) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11577(c13314);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33682(final Object obj) {
        Handler handler = this.f45671;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.֫֨ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    C13842.m33672(this.f6035, obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33672(C13842 c13842, Object obj, long j) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11567(j, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33683(String str) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC18522(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33673(C13842 c13842, String str) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str2 = C17983.f57504;
        interfaceC11725.mo11570(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33681(Exception exc) {
        Handler handler = this.f45671;
        if (handler != null) {
            handler.post(new RunnableC3870(2, this, exc));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33671(C13842 c13842, Exception exc) {
        InterfaceC11725 interfaceC11725 = c13842.f45672;
        String str = C17983.f57504;
        interfaceC11725.mo11584(exc);
    }
}
