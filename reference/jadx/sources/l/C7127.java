package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes3.dex */
public class C7127 extends C7833 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f23831;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C9950 f23832;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // l.C7833, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f23831) {
            super.mutate();
            this.f23832.mo3328();
            this.f23831 = true;
        }
        return this;
    }

    @Override // l.C7833, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // l.C7833
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo19029(AbstractC18416 abstractC18416) {
        super.mo19029(abstractC18416);
        if (abstractC18416 instanceof C9950) {
            this.f23832 = (C9950) abstractC18416;
        }
    }
}
