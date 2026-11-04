package l;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ۜ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7379 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1413 f24266;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC6908 f24267;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10361 f24268;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7750 f24269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23788 f24270;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f24271;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9615 f24272;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Looper f24273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f24274;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f24275;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24276;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f24277;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f24278;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC6908 f24279;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f24280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24281;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0404 f24282;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C1019 f24283;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24284;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18412 f24285;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24286;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f24287;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9221 f24288;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f24289;

    public C7379(final Application application) {
        this(application, new InterfaceC6908() { // from class: l.ۖ᩶ۙ
            @Override // l.InterfaceC6908
            public final Object get() {
                return new C24534(application);
            }
        }, new InterfaceC6908() { // from class: l.۠᩶ۙ
            @Override // l.InterfaceC6908
            public final Object get() {
                return new C12131(new C17162(application), new C13644());
            }
        });
    }

    public C7379(ActivityC7135 activityC7135, C24534 c24534, C12131 c12131) {
        this(activityC7135, new C8125(c24534), new C19312(c12131));
    }

    public C7379(ContextWrapper contextWrapper, InterfaceC6908 interfaceC6908, InterfaceC6908 interfaceC6909) {
        C10361 c10361 = new C10361(contextWrapper);
        C1413 c1413 = new C1413();
        C9615 c9615 = new C9615(0, contextWrapper);
        C7750 c7750 = new C7750();
        this.f24277 = contextWrapper;
        this.f24267 = interfaceC6908;
        this.f24279 = interfaceC6909;
        this.f24268 = c10361;
        this.f24266 = c1413;
        this.f24272 = c9615;
        this.f24269 = c7750;
        String str = C7116.f23455;
        Looper looperMyLooper = Looper.myLooper();
        this.f24273 = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f24285 = C18412.f59977;
        this.f24281 = 1;
        this.f24276 = true;
        this.f24288 = C9221.f30042;
        this.f24274 = 5000L;
        this.f24271 = 15000L;
        this.f24289 = c.a;
        this.f24283 = C1019.f3686;
        this.f24270 = new C16328().m38750();
        this.f24282 = InterfaceC14814.f48448;
        this.f24287 = 500L;
        this.f24275 = 2000L;
        this.f24284 = true;
        this.f24280 = "";
        this.f24278 = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20267(C24534 c24534) {
        C20782.m47568(!this.f24286);
        this.f24267 = new C8125(c24534);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20266(C12131 c12131) {
        C20782.m47568(!this.f24286);
        this.f24279 = new C19312(c12131);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20269() {
        C20782.m47568(!this.f24286);
        this.f24274 = 10000L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20268() {
        C20782.m47568(!this.f24286);
        this.f24271 = 15000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5054 m20265() {
        C20782.m47568(!this.f24286);
        this.f24286 = true;
        return new C8782(this);
    }
}
