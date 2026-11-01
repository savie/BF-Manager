package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TZ */
/* JADX INFO: loaded from: classes4.dex */
public class C16465 extends CheckBox implements InterfaceC17112, InterfaceC5823 {
    public C3058 mAppCompatEmojiTextHelper;
    public final C19993 mBackgroundTintHelper;
    public final C5881 mCompoundButtonHelper;
    public final C4717 mTextHelper;

    public C16465(Context context) {
        this(context, null);
    }

    public C16465(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16465(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        C17500.m40762(getContext(), this);
        C5881 c5881 = new C5881(this);
        this.mCompoundButtonHelper = c5881;
        c5881.m16094(attributeSet, i);
        C19993 c19993 = new C19993(this);
        this.mBackgroundTintHelper = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.mTextHelper = c4717;
        c4717.m13067(attributeSet, i);
        m38727().m9165(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3058 m38727() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C3058(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5881 c5881 = this.mCompoundButtonHelper;
        if (c5881 != null) {
            c5881.m16090();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C15945.m37904(getContext(), i));
    }

    @Override // l.InterfaceC17112
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5881 c5881 = this.mCompoundButtonHelper;
        if (c5881 != null) {
            c5881.m16092(colorStateList);
        }
    }

    @Override // l.InterfaceC17112
    public ColorStateList getSupportButtonTintList() {
        C5881 c5881 = this.mCompoundButtonHelper;
        if (c5881 != null) {
            return c5881.m16096();
        }
        return null;
    }

    @Override // l.InterfaceC17112
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5881 c5881 = this.mCompoundButtonHelper;
        if (c5881 != null) {
            c5881.m16093(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5881 c5881 = this.mCompoundButtonHelper;
        if (c5881 != null) {
            return c5881.m16095();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45281(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45280();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45277(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45279();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45274();
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m38727().m9168(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m38727().m9166(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m38727().m9169(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m38727().m9167();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m13074();
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m13065(colorStateList);
        this.mTextHelper.m13060();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m13059();
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m13066(mode);
        this.mTextHelper.m13060();
    }
}
