package l;

import android.content.Context;

/* JADX INFO: renamed from: l.۟᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7753 extends C21158 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f25601;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f25602;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8543 f25603;

    public C7753(C16386 c16386, C0921 c0921, boolean z) {
        super(c16386, c0921);
        this.f25602 = false;
        this.f25601 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8543 m20399(Context context) {
        if (this.f25602) {
            return this.f25603;
        }
        C8543 c8543M19032 = C7131.m19032(context, m47612().m38571(), m47612().m38577() == EnumC0157.VISIBLE, this.f25601);
        this.f25603 = c8543M19032;
        this.f25602 = true;
        return c8543M19032;
    }
}
