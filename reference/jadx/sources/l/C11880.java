package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۨᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11880 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f39849;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14393 f39850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f39852;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6111 f39854;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20409 f39857;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f39858;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Handler f39855 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC3390 f39851 = new Runnable() { // from class: l.ۗᩳۖ
        @Override // java.lang.Runnable
        public final void run() {
            C11880.m29629(this.f12519);
        }
    };

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f39853 = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۗᩳۖ] */
    public C11880(C20409 c20409, C14393 c14393, int i) {
        this.f39857 = c20409;
        this.f39850 = c14393;
        this.f39854 = c20409.f66125;
        this.f39849 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29632() {
        this.f39855.postDelayed(this.f39851, 2000L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29633() {
        this.f39856 = true;
        this.f39855.removeCallbacks(this.f39851);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29629(final C11880 c11880) {
        C6111 c6111 = c11880.f39854;
        C14393 c14393 = c11880.f39850;
        C20409 c20409 = c11880.f39857;
        if (c11880.f39856 || !c20409.m46144(c14393, c6111)) {
            c11880.m29633();
            return;
        }
        if (c11880.f39858 || !c6111.m17031()) {
            c11880.m29630();
            return;
        }
        try {
            C11018 c11018 = new C11018();
            C11018 c11019 = new C11018();
            c20409.f66135.m46381(c11018);
            c20409.f66135.m46372(c11019);
            c20409.f16884.putBoolean("changed", c20409.m46130(c14393.f47162.isChanged()));
            C17523 c17523M40781 = C17523.m40781(c11880.f39854, c20409.f16884, c20409.m46148(), c11018.m27773(), c11019.m27773(), c11880.f39849, c11880.f39853, c11880.f39852);
            if (c17523M40781 == null) {
                c11880.m29630();
                return;
            }
            final byte[] bArrM40784 = c17523M40781.m40784();
            final long jM40791 = c17523M40781.m40791();
            c11880.f39858 = true;
            c14393.f47165.m4637(c17523M40781).m30016(new InterfaceC7486() { // from class: l.ۙᩴۖ
                @Override // l.InterfaceC7486
                /* JADX INFO: renamed from: ܰ */
                public final void mo2142(Object obj, Throwable th) {
                    long j = jM40791;
                    C11880 c11881 = this.f16967;
                    c11881.f39855.post(new Runnable() { // from class: l.ܰᩴۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11880.m29631(j, c11881, th, bArr);
                        }
                    });
                }
            });
        } catch (C12585 unused) {
            c11880.m29630();
        } catch (Exception e) {
            c20409.f16882.m2969((Throwable) e);
            c11880.m29630();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29631(long j, C11880 c11880, Throwable th, byte[] bArr) {
        C14393 c14393 = c11880.f39850;
        C20409 c20409 = c11880.f39857;
        c11880.f39858 = false;
        if (th == null) {
            c11880.f39853 = j;
            c11880.f39852 = bArr;
        }
        if (c11880.f39856 || !c20409.m46144(c14393, c11880.f39854)) {
            return;
        }
        if (th instanceof C17013) {
            th = th.getCause();
        }
        if (th != null && !(th instanceof CancellationException)) {
            c20409.f16882.m2969(th);
        }
        if (c14393.f47165.m4636() != null) {
            c20409.f16882.m2969((Throwable) c14393.f47165.m4636());
        }
        c11880.m29630();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m29630() {
        if (this.f39856) {
            return;
        }
        this.f39855.postDelayed(this.f39851, 2000L);
    }
}
