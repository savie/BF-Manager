package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۨܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12423 extends C6458 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20563 f39943;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f39944;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f39945;

    public C12423(C20981 c20981, C24947 c24947, boolean z) {
        super(c20981, c24947);
        this.f39944 = false;
        this.f39945 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20563 m30889(Context context) {
        if (this.f39944) {
            return this.f39943;
        }
        C20563 c20563M18142 = C6393.m18142(context, m18240().m47964(), m18240().m47959() == EnumC14267.VISIBLE, this.f39945);
        this.f39943 = c20563M18142;
        this.f39944 = true;
        return c20563M18142;
    }
}
