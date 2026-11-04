package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l.ۧ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11493 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f36159;

    public C11493(Drawable.ConstantState constantState) {
        this.f36159 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C24920 c24920 = new C24920();
        c24920.f70810 = (VectorDrawable) this.f36159.newDrawable();
        return c24920;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C24920 c24920 = new C24920();
        c24920.f70810 = (VectorDrawable) this.f36159.newDrawable(resources);
        return c24920;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C24920 c24920 = new C24920();
        c24920.f70810 = (VectorDrawable) this.f36159.newDrawable(resources, theme);
        return c24920;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f36159.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f36159.getChangingConfigurations();
    }
}
