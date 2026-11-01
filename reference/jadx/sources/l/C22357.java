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

/* JADX INFO: renamed from: l.᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 254T */
/* JADX INFO: loaded from: classes.dex */
public class C22357 extends TextView implements InterfaceC5823 {
    public final C19993 mBackgroundTintHelper;
    public C3058 mEmojiTextViewHelper;
    public boolean mIsSetTypefaceProcessing;
    public Future mPrecomputedTextFuture;
    public InterfaceC13891 mSuperCaller;
    public final C6358 mTextClassifierHelper;
    public final C4717 mTextHelper;

    public C22357(Context context) {
        this(context, null);
    }

    public C22357(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22357(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C17500.m40762(getContext(), this);
        C19993 c19993 = new C19993(this);
        this.mBackgroundTintHelper = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.mTextHelper = c4717;
        c4717.m13067(attributeSet, i);
        c4717.m13060();
        this.mTextClassifierHelper = new C6358(this);
        m49579().m9165(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C3058 m49579() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C3058(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13064(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m49579().m9168(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m49579().m9166(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m49579().m9169(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m49579().m9167();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C0133.m1207(editorInfo, getText());
        }
        C4947.m13738(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo8077(i);
        } else {
            C16407.m38621(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo8076(i);
        } else {
            C16407.m38628(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C16407.m38627(this, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo14998(i, f);
        } else {
            C16407.m38622(this, i, f);
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

    public C10240 getTextMetricsParamsCompat() {
        return C16407.m38620(this);
    }

    public void setTextMetricsParamsCompat(C10240 c10240) {
        C16407.m38626(this, c10240);
    }

    public void setPrecomputedText(C7417 c7417) {
        C16407.m38625(this, c7417);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m49589() {
        Future future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C16407.m38625(this, (C7417) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m49589();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C6358 c6358;
        if (Build.VERSION.SDK_INT >= 28 || (c6358 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c6358.m17467(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C6358 c6358;
        if (Build.VERSION.SDK_INT >= 28 || (c6358 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c6358.m17466();
    }

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m49589();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C15945.m37904(context, i) : null, i2 != 0 ? C15945.m37904(context, i2) : null, i3 != 0 ? C15945.m37904(context, i3) : null, i4 != 0 ? C15945.m37904(context, i4) : null);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C15945.m37904(context, i) : null, i2 != 0 ? C15945.m37904(context, i2) : null, i3 != 0 ? C15945.m37904(context, i3) : null, i4 != 0 ? C15945.m37904(context, i4) : null);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m13074();
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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
            int i2 = C13248.f44006;
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

    public InterfaceC13891 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C5423(this);
            } else if (i >= 28) {
                this.mSuperCaller = new C2600(this);
            } else if (i >= 26) {
                this.mSuperCaller = new C11774(this);
            }
        }
        return this.mSuperCaller;
    }
}
