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

/* JADX INFO: renamed from: l.۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4G5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7836 extends Button implements InterfaceC8647, InterfaceC18831 {
    public C22402 mAppCompatEmojiTextHelper;
    public final C0378 mBackgroundTintHelper;
    public final C10971 mTextHelper;

    public C7836(Context context) {
        this(context, null);
    }

    public C7836(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7836(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.mTextHelper = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        m21361().m50477(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2182();
        }
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

    @Override // android.widget.TextView, android.view.View
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27807(context, i);
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
        C10971 c10971 = this.mTextHelper;
        if (c10971 == null || C19374.f62604) {
            return;
        }
        c10971.m27820();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C19374.f62604) {
            super.setTextSize(i, f);
            return;
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27805(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C10971 c10971 = this.mTextHelper;
        if (c10971 == null || C19374.f62604 || !c10971.m27816()) {
            return;
        }
        this.mTextHelper.m27820();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C19374.f62604) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27804(i);
        }
    }

    @Override // android.widget.TextView, l.InterfaceC8647
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C19374.f62604) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27806(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C19374.f62604) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27813(iArr, i);
        }
    }

    @Override // android.widget.TextView, l.InterfaceC8647
    public int getAutoSizeTextType() {
        if (C19374.f62604) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            return c10971.m27817();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C19374.f62604) {
            return super.getAutoSizeStepGranularity();
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            return c10971.m27819();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C19374.f62604) {
            return super.getAutoSizeMinTextSize();
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            return c10971.m27821();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C19374.f62604) {
            return super.getAutoSizeMaxTextSize();
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            return c10971.m27815();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C19374.f62604) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C10971 c10971 = this.mTextHelper;
        return c10971 != null ? c10971.m27818() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27812(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18085.m42117(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18085.m42116(super.getCustomSelectionActionModeCallback());
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m27808(colorStateList);
        this.mTextHelper.m27803();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m27814();
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m27809(mode);
        this.mTextHelper.m27803();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m27802();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m21361().m50480(inputFilterArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22402 m21361() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C22402(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m21361().m50478(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m21361().m50481(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m21361().m50479();
    }
}
