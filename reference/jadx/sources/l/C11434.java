package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C11434 extends C16655 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final WindowInsets.Builder f35938;

    public C11434() {
        this.f35938 = C5469.m16299();
    }

    public C11434(C3977 c3977) {
        WindowInsets.Builder builderM16299;
        super(c3977);
        WindowInsets windowInsetsM12827 = c3977.m12827();
        if (windowInsetsM12827 != null) {
            builderM16299 = C1740.m6147(windowInsetsM12827);
        } else {
            builderM16299 = C5469.m16299();
        }
        this.f35938 = builderM16299;
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo28785(C13275 c13275) {
        this.f35938.setSystemWindowInsets(c13275.m32822());
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo28781(C13275 c13275) {
        this.f35938.setSystemGestureInsets(c13275.m32822());
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28780(C13275 c13275) {
        this.f35938.setMandatorySystemGestureInsets(c13275.m32822());
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo28782(C13275 c13275) {
        this.f35938.setTappableElementInsets(c13275.m32822());
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo28784(C13275 c13275) {
        this.f35938.setStableInsets(c13275.m32822());
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3977 mo28783() {
        m39361();
        C3977 c3977M12812 = C3977.m12812(null, this.f35938.build());
        c3977M12812.m12821(this.f53803);
        return c3977M12812;
    }
}
