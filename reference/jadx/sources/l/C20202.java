package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩶ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C20202 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20907 f65552;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65553;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20907 f65554;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20907 f65555 = new C20907(true);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC0445 f65556;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20907 f65557;

    public C20202() {
        int i = Build.VERSION.SDK_INT;
        this.f65552 = new C20907(i >= 24);
        this.f65554 = new C20907(i >= 28);
        this.f65557 = new C20907(i >= 33);
        this.f65556 = EnumC0445.FAIL;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m45658() {
        return this.f65555.f67938.m37954() && this.f65552.f67938.m37954() && this.f65554.f67938.m37954() && this.f65557.f67938.m37954();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0445 m45656() {
        return this.f65556;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45657() {
        return this.f65553;
    }
}
