package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩺ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes.dex */
public class C22899 extends C21487 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final WindowInsets.Builder f74449;

    public C22899() {
        this.f74449 = C3847.m11172();
    }

    public C22899(C15844 c15844) {
        WindowInsets.Builder builderM11172;
        super(c15844);
        WindowInsets windowInsetsM37687 = c15844.m37687();
        if (windowInsetsM37687 != null) {
            builderM11172 = C6670.m18061(windowInsetsM37687);
        } else {
            builderM11172 = C3847.m11172();
        }
        this.f74449 = builderM11172;
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ۖ */
    public void mo32199(C13954 c13954) {
        this.f74449.setSystemWindowInsets(c13954.m33796());
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ۨ */
    public void mo48106(C13954 c13954) {
        this.f74449.setSystemGestureInsets(c13954.m33796());
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ۙ */
    public void mo48104(C13954 c13954) {
        this.f74449.setMandatorySystemGestureInsets(c13954.m33796());
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ۚ */
    public void mo48105(C13954 c13954) {
        this.f74449.setTappableElementInsets(c13954.m33796());
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ܰ */
    public void mo32201(C13954 c13954) {
        this.f74449.setStableInsets(c13954.m33796());
    }

    @Override // l.C21487
    /* JADX INFO: renamed from: ܰ */
    public C15844 mo32200() {
        m48103();
        C15844 c15844M37669 = C15844.m37669(null, this.f74449.build());
        c15844M37669.m37679(this.f69815);
        return c15844M37669;
    }
}
