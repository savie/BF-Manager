package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4IO */
/* JADX INFO: loaded from: classes.dex */
public class C22825 extends TextView {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10125 f74275;

    public C22825(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50569(attributeSet, 0);
    }

    public C22825(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50569(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50569(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            Drawable drawableM50568 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableLeft", 0));
            Drawable drawableM50569 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableTop", 0));
            Drawable drawableM505610 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableRight", 0));
            Drawable drawableM505611 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableBottom", 0));
            Drawable drawableM505612 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableStart", 0));
            Drawable drawableM505613 = m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableM505612 != null) {
                    drawableM50568 = drawableM505612;
                }
                if (drawableM505613 != null) {
                    drawableM505610 = drawableM505613;
                }
            } else {
                if (drawableM505612 != null) {
                    drawableM505610 = drawableM505612;
                }
                if (drawableM505613 != null) {
                    drawableM50568 = drawableM505613;
                }
                Drawable drawable = drawableM505610;
                drawableM505610 = drawableM50568;
                drawableM50568 = drawable;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM50568, drawableM50569, drawableM505610, drawableM505611);
            setBackground(m50568(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "background", 0)));
            C10125 c10125 = new C10125(this, attributeSet, i);
            this.f74275 = c10125;
            if (c10125.f34615 >= 0) {
                for (Drawable drawable2 : getCompoundDrawables()) {
                    C7302.m19453(drawable2, this.f74275.f34615);
                }
                for (Drawable drawable3 : getCompoundDrawablesRelative()) {
                    C7302.m19453(drawable3, this.f74275.f34615);
                }
                C7302.m19453(getBackground(), this.f74275.f34615);
            }
        }
        this.f74275 = new C10125();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Drawable m50568(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C7302.f24237.contains(resourceTypeName)) {
            try {
                return new C4479(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i, getContext().getTheme());
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m50568(i), m50568(i2), m50568(i3), m50568(i4));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m50568(i), m50568(i2), m50568(i3), m50568(i4));
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f74275.f34614) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new C19297(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19297)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19297 c19297 = (C19297) parcelable;
        super.onRestoreInstanceState(c19297.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        c19297.m44284(compoundDrawables[0], 0);
        c19297.m44284(compoundDrawables[1], 1);
        c19297.m44284(compoundDrawables[2], 2);
        c19297.m44284(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        c19297.m44284(compoundDrawablesRelative[0], 4);
        c19297.m44284(compoundDrawablesRelative[2], 5);
        c19297.m44284(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(true, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(true, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackground(m50568(i));
    }
}
