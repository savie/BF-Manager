package l;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: renamed from: l.۠ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8352 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20409 f28943;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View.OnAttachStateChangeListener f28944;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Handler f28945 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f28946;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f28947;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14393 f28948;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f28949;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6111 f28950;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f28951;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f28952;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20556 f28953;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f28954;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2063 f28955;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Point f28956;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15990 f28957;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f28958;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Point f28959;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f28960;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18935 f28961;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18935 m21871() {
        return this.f28961;
    }

    public C8352(C20409 c20409, C14393 c14393, int i, C2063 c2063, boolean z) {
        this.f28943 = c20409;
        this.f28948 = c14393;
        this.f28958 = i;
        this.f28947 = z;
        C6111 c6111 = c20409.f66125;
        this.f28950 = c6111;
        this.f28953 = c20409.f66135;
        this.f28956 = c6111.m16956(c6111.m16916());
        this.f28959 = new Point(c6111.getScrollX(), c6111.m17066());
        this.f28954 = new Bundle(c20409.f16884);
        this.f28955 = c2063 == null ? null : c2063.m6569();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m21873() {
        FutureC12075 futureC12075 = this.f28946;
        if (futureC12075 != null && !futureC12075.m30013()) {
            return m21872();
        }
        this.f28946 = new FutureC12075();
        C15990 c15990 = this.f28957;
        C14393 c14393 = this.f28948;
        if (c15990 == null) {
            this.f28957 = this.f28950.m16847(c14393.f47162);
        }
        c14393.m34655().m30016((InterfaceC7486) new C13291(0, this));
        return m21872();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21863(C8352 c8352, Throwable th) {
        if (th == null) {
            c8352.m21854();
        } else {
            c8352.m21857(th);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Point m21870() {
        return new Point(this.f28956);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Point m21868() {
        return new Point(this.f28959);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m21872() {
        return this.f28946.m30032((InterfaceC15954) new C9023());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21869() {
        this.f28951 = true;
        if (this.f28952) {
            this.f28953.m46365();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m21854() {
        C20556 c20556 = this.f28953;
        try {
            boolean z = this.f28952;
            C14393 c14393 = this.f28948;
            if (!z) {
                if (!this.f28949) {
                    if (!this.f28950.m16899(c14393.f47162, this.f28957)) {
                        this.f28945.postDelayed(new RunnableC6940(this), 10L);
                        return;
                    }
                    this.f28949 = true;
                }
                C11018 c11018 = new C11018();
                C11018 c11019 = new C11018();
                c20556.m46381(c11018);
                c20556.m46372(c11019);
                this.f28954.putBoolean("changed", this.f28943.m46130(c14393.f47162.isChanged()));
                byte[] bArrM27773 = c11018.m27773();
                byte[] bArrM27774 = c11019.m27773();
                C17523 c17523M40781 = C17523.m40781(this.f28950, this.f28954, this.f28955, bArrM27773, bArrM27774, this.f28958, -1L, null);
                this.f28961 = new C18935(c17523M40781.m40790(), bArrM27773, bArrM27774);
                FutureC12075 futureC12075M4634 = c14393.f47165.m4634(c17523M40781);
                C1254 c1254Mo8735 = c14393.f47162.mo8735();
                C13638.requireNonNull(c1254Mo8735);
                futureC12075M4634.m30028((InterfaceC15954) new C5925(1, c1254Mo8735)).m30016((InterfaceC7486) new C10865(this));
                return;
            }
            c14393.m34644(this.f28960).m30016((InterfaceC7486) new C23565(this));
        } catch (Throwable th) {
            m21857(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21859(C8352 c8352, Long l2, Throwable th) {
        if (th != null) {
            c8352.m21857(th);
        } else if (c8352.f28948.f47162.mo8735().m4523() != l2.longValue()) {
            c8352.f28945.post(new RunnableC6940(c8352));
        } else {
            c8352.f28960 = l2.longValue();
            c8352.m21864();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void m21864() {
        C14393 c14393 = this.f28948;
        boolean z = this.f28947;
        C6111 c6111 = this.f28950;
        if (z && c6111.isAttachedToWindow()) {
            if (this.f28944 == null) {
                ViewOnAttachStateChangeListenerC18229 viewOnAttachStateChangeListenerC18229 = new ViewOnAttachStateChangeListenerC18229(this);
                this.f28944 = viewOnAttachStateChangeListenerC18229;
                c6111.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC18229);
                return;
            }
            return;
        }
        try {
            if (c14393.f47162.mo8735().m4523() != this.f28960) {
                m21854();
                return;
            }
            if (!c6111.m16836()) {
                this.f28945.postDelayed(new Runnable() { // from class: l.᩸ᩴۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70515.m21864();
                    }
                }, 10L);
                return;
            }
            c6111.m16861((InterfaceC2916) c14393.f47162);
            this.f28952 = true;
            if (this.f28951) {
                this.f28953.m46365();
            }
            c14393.m34644(this.f28960).m30016((InterfaceC7486) new C23565(this));
        } catch (Throwable th) {
            m21857(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21860(C8352 c8352, Throwable th) {
        C6111 c6111 = c8352.f28950;
        if (th != null) {
            c8352.m21857(th);
            return;
        }
        c6111.m16922(false);
        c6111.m16877(c8352.f28957);
        c8352.f28943.m46136(c8352);
        c8352.f28946.m30019((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21857(Throwable th) {
        if ((th instanceof C17013) && th.getCause() != null) {
            th = th.getCause();
        }
        this.f28946.m30021(th);
        this.f28943.m46137(this, th);
    }
}
