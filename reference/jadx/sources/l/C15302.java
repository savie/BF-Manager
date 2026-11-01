package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: l.ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Z */
/* JADX INFO: loaded from: classes4.dex */
public class C15302 extends ToggleButton implements InterfaceC5823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4717 f49851;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3058 f49852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19993 f49853;

    public C15302(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C15302(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17500.m40762(getContext(), this);
        C19993 c19993 = new C19993(this);
        this.f49853 = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.f49851 = c4717;
        c4717.m13067(attributeSet, i);
        if (this.f49852 == null) {
            this.f49852 = new C3058(this);
        }
        this.f49852.m9165(attributeSet, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.f49853;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.f49853;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.f49853;
        if (c19993 != null) {
            c19993.m45274();
        }
        C4717 c4717 = this.f49851;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f49852 == null) {
            this.f49852 = new C3058(this);
        }
        super.setFilters(this.f49852.m9168(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f49852 == null) {
            this.f49852 = new C3058(this);
        }
        this.f49852.m9166(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f49851;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f49851;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C4717 c4717 = this.f49851;
        c4717.m13065(colorStateList);
        c4717.m13060();
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C4717 c4717 = this.f49851;
        c4717.m13066(mode);
        c4717.m13060();
    }
}
