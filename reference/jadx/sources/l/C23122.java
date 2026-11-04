package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩸᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16RW */
/* JADX INFO: loaded from: classes.dex */
public final class C23122 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f74978;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f74979;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f74980;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f74983;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11187 f74984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7941 f74986;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16320 f74987;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C24132 f74988;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Handler f74981 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC2393 f74982 = new RunnableC2393(1, this);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f74985 = -1;

    public C23122(C7941 c7941, C16320 c16320, int i) {
        this.f74986 = c7941;
        this.f74987 = c16320;
        this.f74988 = c7941.f26387;
        this.f74980 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52057() {
        this.f74981.postDelayed(this.f74982, 2000L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52058() {
        this.f74978 = true;
        this.f74981.removeCallbacks(this.f74982);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52054(final C23122 c23122) {
        C24132 c24132 = c23122.f74988;
        C16320 c16320 = c23122.f74987;
        C7941 c7941 = c23122.f74986;
        if (c23122.f74978 || !c7941.m21633(c16320, c24132)) {
            c23122.m52058();
            return;
        }
        if (c23122.f74983 || !c24132.m53886()) {
            c23122.m52055();
            return;
        }
        try {
            c7941.f23990.putBoolean("changed", c7941.m21640(c16320.f52980.isChanged()));
            final C11187 c11187 = new C11187(c7941, c16320, c24132);
            if (c11187.m28188(c23122.f74984)) {
                c23122.m52055();
                return;
            }
            C6178 c6178 = new C6178();
            C6178 c6179 = new C6178();
            c7941.f26385.m52823(c6178);
            c7941.f26385.m52809(c6179);
            C4631 c4631M14447 = C4631.m14447(c23122.f74988, c7941.f23990, c7941.m21635(), c6178.m17796(), c6179.m17796(), c23122.f74980, c23122.f74985, c23122.f74979);
            if (c4631M14447 == null) {
                c23122.f74984 = c11187;
                c23122.m52055();
                return;
            }
            final byte[] bArrM14451 = c4631M14447.m14451();
            final long jM14455 = c4631M14447.m14455();
            c11187.f35288 = jM14455;
            c23122.f74983 = true;
            c16320.f52985.m17387(c4631M14447).m52931(new InterfaceC2017() { // from class: l.ۙ᩹᩸
                @Override // l.InterfaceC2017
                /* JADX INFO: renamed from: ᩷ */
                public final void mo1355(Object obj, Throwable th) {
                    long j = jM14455;
                    C11187 c11188 = c11187;
                    C23122 c23123 = this.f18416;
                    c23123.f74981.post(new Runnable() { // from class: l.᩷᩹᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte[] bArr = bArr;
                            C23122.m52053(j, c11188, c23123, th, bArr);
                        }
                    });
                }
            });
        } catch (C14170 unused) {
            c23122.m52055();
        } catch (Exception e) {
            c7941.f23989.m4466(e);
            c23122.m52055();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52053(long j, C11187 c11187, C23122 c23122, Throwable th, byte[] bArr) {
        C16320 c16320 = c23122.f74987;
        C7941 c7941 = c23122.f74986;
        c23122.f74983 = false;
        if (th == null) {
            c23122.f74985 = j;
            c23122.f74979 = bArr;
            c23122.f74984 = c11187;
        }
        if (c23122.f74978 || !c7941.m21633(c16320, c23122.f74988)) {
            return;
        }
        if (th instanceof C3552) {
            th = th.getCause();
        }
        if (th != null && !(th instanceof CancellationException)) {
            c7941.f23989.m4466(th);
        }
        if (c16320.f52985.m17386() != null) {
            c7941.f23989.m4466(c16320.f52985.m17386());
        }
        c23122.m52055();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m52055() {
        if (this.f74978) {
            return;
        }
        this.f74981.postDelayed(this.f74982, 2000L);
    }
}
