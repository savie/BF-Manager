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

/* JADX INFO: renamed from: l.ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4809 extends C14020 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Method f16828;

    public C4809(Drawable drawable) {
        super(drawable);
        if (f16828 == null) {
            try {
                f16828 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    public C4809(C21963 c21963, Resources resources) {
        this.f44417 = c21963;
        Drawable.ConstantState constantState = c21963.f70892;
        if (constantState != null) {
            mo20016(constantState.newDrawable(resources));
        }
        if (f16828 == null) {
            try {
                f16828 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f44413.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f44413.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f44413.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f44413.getDirtyBounds();
    }

    @Override // l.C14020, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (mo14829()) {
            super.setTintList(colorStateList);
        } else {
            this.f44413.setTintList(colorStateList);
        }
    }

    @Override // l.C14020, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (mo14829()) {
            super.setTint(i);
        } else {
            this.f44413.setTint(i);
        }
    }

    @Override // l.C14020, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo14829()) {
            super.setTintMode(mode);
        } else {
            this.f44413.setTintMode(mode);
        }
    }

    @Override // l.C14020, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // l.C14020
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo14829() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f44413;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f44413;
        if (drawable == null || (method = f16828) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
