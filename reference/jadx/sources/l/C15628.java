package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l.ܺ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15628 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f50824;

    public C15628(Drawable.ConstantState constantState) {
        this.f50824 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C19861 c19861 = new C19861();
        c19861.f56306 = (VectorDrawable) this.f50824.newDrawable();
        return c19861;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C19861 c19861 = new C19861();
        c19861.f56306 = (VectorDrawable) this.f50824.newDrawable(resources);
        return c19861;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C19861 c19861 = new C19861();
        c19861.f56306 = (VectorDrawable) this.f50824.newDrawable(resources, theme);
        return c19861;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f50824.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f50824.getChangingConfigurations();
    }
}
