package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۬֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12805 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f42647;

    public C12805(Drawable.ConstantState constantState) {
        this.f42647 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3631 c3631 = new C3631();
        Drawable drawableNewDrawable = this.f42647.newDrawable();
        c3631.f56306 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3631.f13338);
        return c3631;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C3631 c3631 = new C3631();
        Drawable drawableNewDrawable = this.f42647.newDrawable(resources);
        c3631.f56306 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3631.f13338);
        return c3631;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C3631 c3631 = new C3631();
        Drawable drawableNewDrawable = this.f42647.newDrawable(resources, theme);
        c3631.f56306 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3631.f13338);
        return c3631;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f42647.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f42647.getChangingConfigurations();
    }
}
