package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۡۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes3.dex */
public final class C9081 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f29512;

    public C9081(Drawable.ConstantState constantState) {
        this.f29512 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2370 c2370 = new C2370();
        Drawable drawableNewDrawable = this.f29512.newDrawable();
        c2370.f70810 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c2370.f7630);
        return c2370;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2370 c2370 = new C2370();
        Drawable drawableNewDrawable = this.f29512.newDrawable(resources);
        c2370.f70810 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c2370.f7630);
        return c2370;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2370 c2370 = new C2370();
        Drawable drawableNewDrawable = this.f29512.newDrawable(resources, theme);
        c2370.f70810 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c2370.f7630);
        return c2370;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f29512.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f29512.getChangingConfigurations();
    }
}
