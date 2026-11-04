package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes5.dex */
public class C14591 extends C12354 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f45973;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C4151 f45974;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // l.C12354, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f45973) {
            super.mutate();
            this.f45974.mo6582();
            this.f45973 = true;
        }
        return this;
    }

    @Override // l.C12354, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // l.C12354
    /* JADX INFO: renamed from: ۙ */
    public void mo30825(AbstractC20559 abstractC20559) {
        super.mo30825(abstractC20559);
        if (abstractC20559 instanceof C4151) {
            this.f45974 = (C4151) abstractC20559;
        }
    }
}
