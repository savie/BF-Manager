package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.C0597;
import l.C12388;
import l.C16117;
import l.C17609;
import l.C18085;
import l.C19835;
import l.C22182;
import l.C22666;
import l.C22687;
import l.C23577;
import l.C6696;
import l.C8407;
import l.C9217;
import l.InterfaceC1586;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC1586 {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public final C22687 accessibilityDelegate;
    public FrameLayout actionArea;
    public boolean checkable;
    public Drawable emptyDrawable;
    public boolean hasIconTintList;
    public int iconSize;
    public ColorStateList iconTintList;
    public boolean isBold;
    public C8407 itemData;
    public boolean needsEmptyIcon;
    public final CheckedTextView textView;

    @Override // l.InterfaceC1586
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBold = true;
        C22687 c22687 = new C22687() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // l.C22687
            public void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
                super.onInitializeAccessibilityNodeInfo(view, c19835);
                c19835.m45684(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c22687;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C12388.f39786, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C17609.f57531));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C23577.f76323);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C22666.m51098(checkedTextView, c22687);
    }

    @Override // l.InterfaceC1586
    public void initialize(C8407 c8407, int i) {
        this.itemData = c8407;
        if (c8407.getItemId() > 0) {
            setId(c8407.getItemId());
        }
        setVisibility(c8407.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            int i2 = C22666.f73603;
            setBackground(stateListDrawableCreateDefaultBackground);
        }
        setCheckable(c8407.isCheckable());
        setChecked(c8407.isChecked());
        setEnabled(c8407.isEnabled());
        setTitle(c8407.getTitle());
        setIcon(c8407.getIcon());
        setActionView(c8407.getActionView());
        setContentDescription(c8407.getContentDescription());
        C6696.m18717(this, c8407.getTooltipText());
        adjustAppearance();
    }

    public void initialize(C8407 c8407, boolean z) {
        this.isBold = z;
        initialize(c8407, 0);
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                C22182 c22182 = (C22182) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c22182).width = -1;
                this.actionArea.setLayoutParams(c22182);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            C22182 c22183 = (C22182) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c22183).width = -2;
            this.actionArea.setLayoutParams(c22183);
        }
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C23577.f76172)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // l.InterfaceC1586
    public C8407 getItemData() {
        return this.itemData;
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.isBold) ? 1 : 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0597.m2697(drawable).mutate();
                C0597.m2690(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM24392 = C9217.m24392(getResources(), C16117.f52366, getContext().getTheme());
                this.emptyDrawable = drawableM24392;
                if (drawableM24392 != null) {
                    int i2 = this.iconSize;
                    drawableM24392.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        this.textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconSize(int i) {
        this.iconSize = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C8407 c8407 = this.itemData;
        if (c8407 != null && c8407.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C8407 c8407 = this.itemData;
        if (c8407 != null) {
            setIcon(c8407.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C18085.m42126(this.textView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }
}
