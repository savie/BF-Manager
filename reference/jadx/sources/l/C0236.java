package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4G5 */
/* JADX INFO: loaded from: classes2.dex */
public class C0236 extends Button implements InterfaceC5823 {
    public C3058 mAppCompatEmojiTextHelper;
    public final C19993 mBackgroundTintHelper;
    public final C4717 mTextHelper;

    public C0236(Context context) {
        this(context, null);
    }

    public C0236(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        C17500.m40762(getContext(), this);
        C19993 c19993 = new C19993(this);
        this.mBackgroundTintHelper = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.mTextHelper = c4717;
        c4717.m13067(attributeSet, i);
        c4717.m13060();
        m1602().m9165(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45273();
        }
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

    @Override // android.widget.TextView, android.view.View
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13064(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 == null || C20344.f65888) {
            return;
        }
        c4717.m13075();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C20344.f65888) {
            super.setTextSize(i, f);
            return;
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13062(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C4717 c4717 = this.mTextHelper;
        if (c4717 == null || C20344.f65888 || !c4717.m13072()) {
            return;
        }
        this.mTextHelper.m13075();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C20344.f65888) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13061(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C20344.f65888) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13063(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C20344.f65888) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13070(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C20344.f65888) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            return c4717.m13057();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C20344.f65888) {
            return super.getAutoSizeStepGranularity();
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            return c4717.m13071();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C20344.f65888) {
            return super.getAutoSizeMinTextSize();
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            return c4717.m13058();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C20344.f65888) {
            return super.getAutoSizeMaxTextSize();
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            return c4717.m13073();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C20344.f65888) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C4717 c4717 = this.mTextHelper;
        return c4717 != null ? c4717.m13076() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13069(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C16407.m38619(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C16407.m38618(super.getCustomSelectionActionModeCallback());
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m13065(colorStateList);
        this.mTextHelper.m13060();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m13074();
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m13066(mode);
        this.mTextHelper.m13060();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m13059();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m1602().m9168(inputFilterArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3058 m1602() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C3058(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m1602().m9166(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m1602().m9169(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m1602().m9167();
    }
}
