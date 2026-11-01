package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import l.C0976;
import l.C15089;
import l.C16407;
import l.C1977;
import l.C22006;
import l.C22357;
import l.C3798;
import l.C5031;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public class StartCompoundLayout extends LinearLayout {
    public boolean hintExpanded;
    public CharSequence prefixText;
    public final TextView prefixTextView;
    public int startIconMinSize;
    public View.OnLongClickListener startIconOnLongClickListener;
    public ImageView.ScaleType startIconScaleType;
    public ColorStateList startIconTintList;
    public PorterDuff.Mode startIconTintMode;
    public final CheckableImageButton startIconView;
    public final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, C1977 c1977) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C15089.f49206, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        C22357 c22357 = new C22357(getContext());
        this.prefixTextView = c22357;
        initStartIconView(c1977);
        initPrefixTextView(c1977);
        addView(checkableImageButton);
        addView(c22357);
    }

    private void initStartIconView(C1977 c1977) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (c1977.m6383(C8033.f27943)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), c1977, C8033.f27943);
        }
        if (c1977.m6383(C8033.f27678)) {
            this.startIconTintMode = ViewUtils.parseTintMode(c1977.m6381(C8033.f27678, -1), null);
        }
        if (c1977.m6383(C8033.f26828)) {
            setStartIconDrawable(c1977.m6370(C8033.f26828));
            if (c1977.m6383(C8033.f26614)) {
                setStartIconContentDescription(c1977.m6368(C8033.f26614));
            }
            setStartIconCheckable(c1977.m6376(C8033.f27306, true));
        }
        setStartIconMinSize(c1977.m6384(C8033.f28050, getResources().getDimensionPixelSize(C0976.f4384)));
        if (c1977.m6383(C8033.f27466)) {
            setStartIconScaleType(IconHelper.convertScaleType(c1977.m6381(C8033.f27466, -1)));
        }
    }

    private void initPrefixTextView(C1977 c1977) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(C3798.f13807);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = this.prefixTextView;
        int i = C5031.f17539;
        textView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(c1977.m6387(C8033.f26507, 0));
        if (c1977.m6383(C8033.f26721)) {
            setPrefixTextColor(c1977.m6385(C8033.f26721));
        }
        setPrefixText(c1977.m6368(C8033.f27199));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public void setPrefixTextAppearance(int i) {
        C16407.m38617(this.prefixTextView, i);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconMinSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.startIconMinSize) {
            this.startIconMinSize = i;
            IconHelper.setIconMinSize(this.startIconView, i);
        }
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public void setupAccessibilityNodeInfo(C22006 c22006) {
        if (this.prefixTextView.getVisibility() == 0) {
            c22006.m48873(this.prefixTextView);
            c22006.m48852(this.prefixTextView);
        } else {
            c22006.m48852(this.startIconView);
        }
    }

    public void updatePrefixTextViewPadding() {
        int paddingStart;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        if (isStartIconVisible()) {
            paddingStart = 0;
        } else {
            int i = C5031.f17539;
            paddingStart = editText.getPaddingStart();
        }
        TextView textView = this.prefixTextView;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0976.f4127);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        int i2 = C5031.f17539;
        textView.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public int getPrefixTextStartOffset() {
        int marginEnd;
        if (isStartIconVisible()) {
            marginEnd = ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd() + this.startIconView.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        int i = C5031.f17539;
        return this.prefixTextView.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    private void updateVisibility() {
        int i = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }
}
