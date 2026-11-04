package l;

/* JADX INFO: renamed from: l.ۡ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9666 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f31210;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19143 f31211;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7430 f31212;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile C10412 f31213;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f31214;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12628 f31215;

    public C9666(ViewOnClickListenerC7430 viewOnClickListenerC7430, C12628 c12628, C19143 c19143) {
        this.f31212 = viewOnClickListenerC7430;
        this.f31215 = c12628;
        this.f31211 = c19143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25181() {
        C10412 c10412 = this.f31213;
        if (c10412 == null || c10412.f33100 || c10412.f33102 == 0 || !this.f31212.m20356(this.f31211) || this.f31211.m44373() != this.f31214) {
            return;
        }
        this.f31215.m31380();
        C12628 c12628 = this.f31215;
        int i = c10412.f33101;
        C5917 c5917 = c12628.f40509;
        c5917.m17193(i, true);
        c12628.invalidate();
        c12628.m31367(c5917.m17202());
        this.f31210 = true;
    }
}
