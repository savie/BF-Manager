package l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.ۘۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3892 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f14553;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22944 f14557;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13772 f14558;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14559;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2336 f14555 = C2336.f8268;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20827 f14554 = InterfaceC1070.f4921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15889 f14556 = InterfaceC13066.f43561;

    public C3892(ContextWrapper contextWrapper) {
        this.f14553 = contextWrapper;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11325(InterfaceC19664[] interfaceC19664Arr) {
        this.f14557 = new C22944(interfaceC19664Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7421 m11324() {
        C2023.m6510(!this.f14559);
        this.f14559 = true;
        if (this.f14557 == null) {
            this.f14557 = new C22944(new InterfaceC19664[0]);
        }
        if (this.f14558 == null) {
            this.f14558 = new C13772(this.f14553);
        }
        return new C7421(this);
    }
}
