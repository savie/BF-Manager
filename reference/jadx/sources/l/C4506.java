package l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۘ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4506 implements InterfaceC11217 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C4506 f16079 = new C4506();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f16083;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f16087;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16080 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f16081 = true;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20168 f16082 = new C20168(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC8143 f16084 = new RunnableC8143(1, this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24644 f16085 = new C24644(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14227(Context context) {
        C15243.m36590(context, d.R);
        this.f16087 = new Handler();
        this.f16082.m46395(EnumC9330.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C15243.m36587((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C6744(this));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14228() {
        int i = this.f16083 + 1;
        this.f16083 = i;
        if (i == 1 && this.f16081) {
            this.f16082.m46395(EnumC9330.ON_START);
            this.f16081 = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14229() {
        int i = this.f16086 + 1;
        this.f16086 = i;
        if (i == 1) {
            if (this.f16080) {
                this.f16082.m46395(EnumC9330.ON_RESUME);
                this.f16080 = false;
            } else {
                Handler handler = this.f16087;
                C15243.m36586(handler);
                handler.removeCallbacks(this.f16084);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14226() {
        int i = this.f16086 - 1;
        this.f16086 = i;
        if (i == 0) {
            Handler handler = this.f16087;
            C15243.m36586(handler);
            handler.postDelayed(this.f16084, 700L);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m14230() {
        int i = this.f16083 - 1;
        this.f16083 = i;
        if (i == 0 && this.f16080) {
            this.f16082.m46395(EnumC9330.ON_STOP);
            this.f16081 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14223(C4506 c4506) {
        C20168 c20168 = c4506.f16082;
        if (c4506.f16086 == 0) {
            c4506.f16080 = true;
            c20168.m46395(EnumC9330.ON_PAUSE);
        }
        if (c4506.f16083 == 0 && c4506.f16080) {
            c20168.m46395(EnumC9330.ON_STOP);
            c4506.f16081 = true;
        }
    }

    @Override // l.InterfaceC11217
    public final AbstractC8585 getLifecycle() {
        return this.f16082;
    }
}
