package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: l.ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Z */
/* JADX INFO: loaded from: classes5.dex */
public class C16192 extends ToggleButton implements InterfaceC18831 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22402 f52570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10971 f52571;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0378 f52572;

    public C16192(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C16192(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9457.m24831(getContext(), this);
        C0378 c0378 = new C0378(this);
        this.f52572 = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.f52571 = c10971;
        c10971.m27810(attributeSet, i);
        if (this.f52570 == null) {
            this.f52570 = new C22402(this);
        }
        this.f52570.m50477(attributeSet, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.f52572;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.f52572;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.f52572;
        if (c0378 != null) {
            c0378.m2174();
        }
        C10971 c10971 = this.f52571;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f52570 == null) {
            this.f52570 = new C22402(this);
        }
        super.setFilters(this.f52570.m50480(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f52570 == null) {
            this.f52570 = new C22402(this);
        }
        this.f52570.m50478(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f52571;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f52571;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10971 c10971 = this.f52571;
        c10971.m27808(colorStateList);
        c10971.m27803();
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10971 c10971 = this.f52571;
        c10971.m27809(mode);
        c10971.m27803();
    }
}
