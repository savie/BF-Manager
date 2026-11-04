package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 254T */
/* JADX INFO: loaded from: classes3.dex */
public class C5752 extends TextView implements InterfaceC18831, InterfaceC8647 {
    public final C0378 mBackgroundTintHelper;
    public C22402 mEmojiTextViewHelper;
    public boolean mIsSetTypefaceProcessing;
    public Future mPrecomputedTextFuture;
    public InterfaceC22906 mSuperCaller;
    public final C9721 mTextClassifierHelper;
    public final C10971 mTextHelper;

    public C5752(Context context) {
        this(context, null);
    }

    public C5752(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5752(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C9457.m24831(getContext(), this);
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.mTextHelper = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        this.mTextClassifierHelper = new C9721(this);
        m16826().m50477(attributeSet, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C22402 m16826() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C22402(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27807(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m16826().m50480(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m16826().m50478(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m16826().m50481(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m16826().m50479();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C4173.m13340(editorInfo, getText());
        }
        C11213.m28257(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo36961(i);
        } else {
            C18085.m42127(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo36960(i);
        } else {
            C18085.m42125(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C18085.m42128(this, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo32720(i, f);
        } else {
            C18085.m42120(this, i, f);
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

    public C3801 getTextMetricsParamsCompat() {
        return C18085.m42118(this);
    }

    public void setTextMetricsParamsCompat(C3801 c3801) {
        C18085.m42123(this, c3801);
    }

    public void setPrecomputedText(C14241 c14241) {
        C18085.m42124(this, c14241);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16820() {
        Future future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C18085.m42124(this, (C14241) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m16820();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C9721 c9721;
        if (Build.VERSION.SDK_INT >= 28 || (c9721 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c9721.m25308(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C9721 c9721;
        if (Build.VERSION.SDK_INT >= 28 || (c9721 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c9721.m25307();
    }

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m16820();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0385.m2186(context, i) : null, i2 != 0 ? C0385.m2186(context, i2) : null, i3 != 0 ? C0385.m2186(context, i3) : null, i4 != 0 ? C0385.m2186(context, i4) : null);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0385.m2186(context, i) : null, i2 != 0 ? C0385.m2186(context, i2) : null, i3 != 0 ? C0385.m2186(context, i3) : null, i4 != 0 ? C0385.m2186(context, i4) : null);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m27814();
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            int i2 = C17750.f58298;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    public InterfaceC22906 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C13209(this);
            } else if (i >= 28) {
                this.mSuperCaller = new C15446(this);
            } else if (i >= 26) {
                this.mSuperCaller = new C19922(this);
            }
        }
        return this.mSuperCaller;
    }
}
