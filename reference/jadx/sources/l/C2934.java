package l;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes2.dex */
public class C2934 implements InterfaceC7503 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f11019;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f11020 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14225 f11021;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8539 f11022;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17381 f11023;

    @Override // l.InterfaceC7503
    public final void onDrawerStateChanged(int i) {
    }

    public C2934(AbstractActivityC12483 abstractActivityC12483, C17381 c17381, C6938 c6938) {
        if (c6938 != null) {
            this.f11021 = new C9286(c6938);
            c6938.setNavigationOnClickListener(new ViewOnClickListenerC23397(this));
        } else {
            this.f11021 = abstractActivityC12483.mo5291();
        }
        this.f11023 = c17381;
        this.f11022 = new C8539(this.f11021.mo8980());
        this.f11019 = this.f11021.mo8983();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8754() {
        C17381 c17381 = this.f11023;
        if (c17381.m40473(8388611)) {
            m8751(1.0f);
        } else {
            m8751(0.0f);
        }
        c17381.m40473(8388611);
        boolean z = this.f11020;
        InterfaceC14225 interfaceC14225 = this.f11021;
        if (!z && !interfaceC14225.mo8984()) {
            this.f11020 = true;
        }
        interfaceC14225.mo8982(this.f11022, 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8753() {
        C17381 c17381 = this.f11023;
        int iM40485 = c17381.m40485(8388611);
        if (c17381.m40488() && iM40485 != 2) {
            c17381.m40477(8388611);
        } else if (iM40485 != 1) {
            c17381.m40484(8388611);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8539 m8752() {
        return this.f11022;
    }

    @Override // l.InterfaceC7503
    public void onDrawerSlide(View view, float f) {
        m8751(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // l.InterfaceC7503
    public void onDrawerOpened(View view) {
        m8751(1.0f);
        this.f11021.mo8981(0);
    }

    @Override // l.InterfaceC7503
    public void onDrawerClosed(View view) {
        m8751(0.0f);
        this.f11021.mo8981(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8751(float f) {
        C8539 c8539 = this.f11022;
        if (f == 1.0f) {
            c8539.m22296(true);
        } else if (f == 0.0f) {
            c8539.m22296(false);
        }
        c8539.m22294(f);
    }
}
