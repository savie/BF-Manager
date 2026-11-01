package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4XY */
/* JADX INFO: loaded from: classes.dex */
public final class C23831 extends C11131 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f77026;

    public C23831(Drawable drawable) {
        super(drawable);
        if (f77026 == null) {
            try {
                f77026 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    public C23831(C14659 c14659, Resources resources) {
        this.f37778 = c14659;
        Drawable.ConstantState constantState = c14659.f47923;
        if (constantState != null) {
            mo17200(constantState.newDrawable(resources));
        }
        if (f77026 == null) {
            try {
                f77026 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f37777.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f37777.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f37777.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f37777.getDirtyBounds();
    }

    @Override // l.C11131, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (mo28064()) {
            super.setTintList(colorStateList);
        } else {
            this.f37777.setTintList(colorStateList);
        }
    }

    @Override // l.C11131, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (mo28064()) {
            super.setTint(i);
        } else {
            this.f37777.setTint(i);
        }
    }

    @Override // l.C11131, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo28064()) {
            super.setTintMode(mode);
        } else {
            this.f37777.setTintMode(mode);
        }
    }

    @Override // l.C11131, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // l.C11131
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo28064() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f37777;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f37777;
        if (drawable == null || (method = f77026) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
