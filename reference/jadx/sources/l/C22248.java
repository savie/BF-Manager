package l;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes.dex */
public class C22248 implements InterfaceC6656 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24289 f71653;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f71654 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7419 f71655;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f71656;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8147 f71657;

    @Override // l.InterfaceC6656
    public final void onDrawerStateChanged(int i) {
    }

    public C22248(AbstractActivityC17204 abstractActivityC17204, C8147 c8147, C16390 c16390) {
        if (c16390 != null) {
            this.f71655 = new C5094(c16390);
            c16390.setNavigationOnClickListener(new ViewOnClickListenerC8910(this));
        } else {
            this.f71655 = abstractActivityC17204.mo13852();
        }
        this.f71657 = c8147;
        this.f71653 = new C24289(this.f71655.mo15398());
        this.f71656 = this.f71655.mo15401();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50302() {
        C8147 c8147 = this.f71657;
        if (c8147.m22057(8388611)) {
            m50299(1.0f);
        } else {
            m50299(0.0f);
        }
        c8147.m22057(8388611);
        boolean z = this.f71654;
        InterfaceC7419 interfaceC7419 = this.f71655;
        if (!z && !interfaceC7419.mo15402()) {
            this.f71654 = true;
        }
        interfaceC7419.mo15400(this.f71653, 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50301() {
        C8147 c8147 = this.f71657;
        int iM22045 = c8147.m22045(8388611);
        if (c8147.m22050(8388611) && iM22045 != 2) {
            c8147.m22037(8388611);
        } else if (iM22045 != 1) {
            c8147.m22049(8388611);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24289 m50300() {
        return this.f71653;
    }

    @Override // l.InterfaceC6656
    public void onDrawerSlide(View view, float f) {
        m50299(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // l.InterfaceC6656
    public void onDrawerOpened(View view) {
        m50299(1.0f);
        this.f71655.mo15399(0);
    }

    @Override // l.InterfaceC6656
    public void onDrawerClosed(View view) {
        m50299(0.0f);
        this.f71655.mo15399(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50299(float f) {
        C24289 c24289 = this.f71653;
        if (f == 1.0f) {
            c24289.m54302(true);
        } else if (f == 0.0f) {
            c24289.m54302(false);
        }
        c24289.m54300(f);
    }
}
