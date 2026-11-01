package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۘ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3611 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f13266;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13267;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16313 f13268;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f13269;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC11593 f13270 = InterfaceC11593.f38960;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC22486 f13271;

    public C3611(Context context, C16313 c16313) {
        this.f13269 = context.getApplicationContext();
        this.f13268 = c16313;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10706() {
        this.f13266 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10705(InterfaceC11593 interfaceC11593) {
        this.f13270 = interfaceC11593;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9963 m10704() {
        C2023.m6510(!this.f13267);
        if (this.f13271 == null) {
            this.f13271 = new C19135();
        }
        C9963 c9963 = new C9963(this);
        this.f13267 = true;
        return c9963;
    }
}
