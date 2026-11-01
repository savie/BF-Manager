package l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۫᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12713 implements InterfaceC1423 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C12713 f42396 = new C12713();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f42398;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42403;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f42404;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42402 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42399 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4245 f42400 = new C4245(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC7856 f42401 = new RunnableC7856(4, this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16946 f42397 = new C16946(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31565(Context context) {
        C13465.m32966(context, d.R);
        this.f42404 = new Handler();
        this.f42400.m11902(EnumC1651.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C13465.m32963((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0717(this));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31566() {
        int i = this.f42398 + 1;
        this.f42398 = i;
        if (i == 1 && this.f42399) {
            this.f42400.m11902(EnumC1651.ON_START);
            this.f42399 = false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31567() {
        int i = this.f42403 + 1;
        this.f42403 = i;
        if (i == 1) {
            if (this.f42402) {
                this.f42400.m11902(EnumC1651.ON_RESUME);
                this.f42402 = false;
            } else {
                Handler handler = this.f42404;
                C13465.m32962(handler);
                handler.removeCallbacks(this.f42401);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31564() {
        int i = this.f42403 - 1;
        this.f42403 = i;
        if (i == 0) {
            Handler handler = this.f42404;
            C13465.m32962(handler);
            handler.postDelayed(this.f42401, 700L);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31563() {
        int i = this.f42398 - 1;
        this.f42398 = i;
        if (i == 0 && this.f42402) {
            this.f42400.m11902(EnumC1651.ON_STOP);
            this.f42399 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31560(C12713 c12713) {
        C4245 c4245 = c12713.f42400;
        if (c12713.f42403 == 0) {
            c12713.f42402 = true;
            c4245.m11902(EnumC1651.ON_PAUSE);
        }
        if (c12713.f42398 == 0 && c12713.f42402) {
            c4245.m11902(EnumC1651.ON_STOP);
            c12713.f42399 = true;
        }
    }

    @Override // l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        return this.f42400;
    }
}
