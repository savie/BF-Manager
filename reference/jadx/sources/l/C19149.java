package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ᩳܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19149 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61970;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f61971;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0142 f61972;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13117 f61973;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC14814 f61974 = InterfaceC14814.f48448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f61975;

    public C19149(Context context, C13117 c13117) {
        this.f61971 = context.getApplicationContext();
        this.f61973 = c13117;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44396() {
        this.f61975 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44395(InterfaceC14814 interfaceC14814) {
        this.f61974 = interfaceC14814;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4914 m44394() {
        C20782.m47568(!this.f61970);
        if (this.f61972 == null) {
            this.f61972 = new C7216();
        }
        C4914 c4914 = new C4914(this);
        this.f61970 = true;
        return c4914;
    }
}
