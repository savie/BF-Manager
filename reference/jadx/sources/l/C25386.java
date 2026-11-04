package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 15T9 */
/* JADX INFO: loaded from: classes.dex */
public class C25386 extends RadioButton implements InterfaceC7644, InterfaceC18831 {
    public C22402 mAppCompatEmojiTextHelper;
    public final C0378 mBackgroundTintHelper;
    public final C9326 mCompoundButtonHelper;
    public final C10971 mTextHelper;

    public C25386(Context context) {
        this(context, null);
    }

    public C25386(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25386(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C9326 c9326 = new C9326(this);
        this.mCompoundButtonHelper = c9326;
        c9326.m24571(attributeSet, i);
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.mTextHelper = c10971;
        c10971.m27810(attributeSet, i);
        m56747().m50477(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22402 m56747() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C22402(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C9326 c9326 = this.mCompoundButtonHelper;
        if (c9326 != null) {
            c9326.m24574();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0385.m2186(getContext(), i));
    }

    @Override // l.InterfaceC7644
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C9326 c9326 = this.mCompoundButtonHelper;
        if (c9326 != null) {
            c9326.m24569(colorStateList);
        }
    }

    @Override // l.InterfaceC7644
    public ColorStateList getSupportButtonTintList() {
        C9326 c9326 = this.mCompoundButtonHelper;
        if (c9326 != null) {
            return c9326.m24573();
        }
        return null;
    }

    @Override // l.InterfaceC7644
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C9326 c9326 = this.mCompoundButtonHelper;
        if (c9326 != null) {
            c9326.m24570(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C9326 c9326 = this.mCompoundButtonHelper;
        if (c9326 != null) {
            return c9326.m24572();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2181(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2180();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2177(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2179();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2174();
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m56747().m50480(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m56747().m50478(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m56747().m50481(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m56747().m50479();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m27814();
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m27808(colorStateList);
        this.mTextHelper.m27803();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m27802();
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m27809(mode);
        this.mTextHelper.m27803();
    }
}
