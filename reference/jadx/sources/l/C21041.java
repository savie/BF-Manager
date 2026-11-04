package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B4IO */
/* JADX INFO: loaded from: classes5.dex */
public class C21041 extends TextView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2395 f67251;

    public C21041(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48092(attributeSet, 0);
    }

    public C21041(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48092(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48092(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            Drawable drawableM48091 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableLeft", 0));
            Drawable drawableM48092 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableTop", 0));
            Drawable drawableM48093 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableRight", 0));
            Drawable drawableM48094 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableBottom", 0));
            Drawable drawableM48095 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableStart", 0));
            Drawable drawableM48096 = m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableM48095 != null) {
                    drawableM48091 = drawableM48095;
                }
                if (drawableM48096 != null) {
                    drawableM48093 = drawableM48096;
                }
            } else {
                if (drawableM48095 != null) {
                    drawableM48093 = drawableM48095;
                }
                if (drawableM48096 != null) {
                    drawableM48091 = drawableM48096;
                }
                Drawable drawable = drawableM48093;
                drawableM48093 = drawableM48091;
                drawableM48091 = drawable;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM48091, drawableM48092, drawableM48093, drawableM48094);
            setBackground(m48091(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "background", 0)));
            C2395 c2395 = new C2395(this, attributeSet, i);
            this.f67251 = c2395;
            if (c2395.f7707 >= 0) {
                for (Drawable drawable2 : getCompoundDrawables()) {
                    C8361.m22499(drawable2, this.f67251.f7707);
                }
                for (Drawable drawable3 : getCompoundDrawablesRelative()) {
                    C8361.m22499(drawable3, this.f67251.f7707);
                }
                C8361.m22499(getBackground(), this.f67251.f7707);
            }
        }
        this.f67251 = new C2395();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Drawable m48091(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C8361.f27427.contains(resourceTypeName)) {
            try {
                return new C17311(i, resources);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i, getContext().getTheme());
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m48091(i), m48091(i2), m48091(i3), m48091(i4));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m48091(i), m48091(i2), m48091(i3), m48091(i4));
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f67251.f7706) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new C0904(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0904)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0904 c0904 = (C0904) parcelable;
        super.onRestoreInstanceState(c0904.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        c0904.m3670(compoundDrawables[0], 0);
        c0904.m3670(compoundDrawables[1], 1);
        c0904.m3670(compoundDrawables[2], 2);
        c0904.m3670(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        c0904.m3670(compoundDrawablesRelative[0], 4);
        c0904.m3670(compoundDrawablesRelative[2], 5);
        c0904.m3670(getBackground(), 6);
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
        setBackground(m48091(i));
    }
}
