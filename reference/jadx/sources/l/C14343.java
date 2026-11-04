package l;

import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ܰۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public final class C14343 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f45242;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f45243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f45244;

    public C14343(Class cls, Class cls2, AbstractC17567 abstractC17567) {
        this.f45243 = cls;
        this.f45242 = cls2;
        this.f45244 = abstractC17567;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class clsM18232 = c6446.m18232();
        if (clsM18232 == this.f45243 || clsM18232 == this.f45242) {
            return this.f45244;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f45242.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + this.f45243.getName() + ",adapter=" + this.f45244 + "]";
    }
}
