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
import l.C0976;
import l.C12025;
import l.C12972;
import l.C15089;
import l.C16407;
import l.C16631;
import l.C18933;
import l.C22006;
import l.C23707;
import l.C3306;
import l.C3798;
import l.C5031;
import l.C7603;
import l.InterfaceC0858;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC0858 {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public final C12025 accessibilityDelegate;
    public FrameLayout actionArea;
    public boolean checkable;
    public Drawable emptyDrawable;
    public boolean hasIconTintList;
    public int iconSize;
    public ColorStateList iconTintList;
    public boolean isBold;
    public C23707 itemData;
    public boolean needsEmptyIcon;
    public final CheckedTextView textView;

    @Override // l.InterfaceC0858
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
        C12025 c12025 = new C12025() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // l.C12025
            public void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
                super.onInitializeAccessibilityNodeInfo(view, c22006);
                c22006.m48877(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c12025;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C15089.f49234, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0976.f4106));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C3798.f13819);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C5031.m13990(checkedTextView, c12025);
    }

    @Override // l.InterfaceC0858
    public void initialize(C23707 c23707, int i) {
        this.itemData = c23707;
        if (c23707.getItemId() > 0) {
            setId(c23707.getItemId());
        }
        setVisibility(c23707.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            int i2 = C5031.f17539;
            setBackground(stateListDrawableCreateDefaultBackground);
        }
        setCheckable(c23707.isCheckable());
        setChecked(c23707.isChecked());
        setEnabled(c23707.isEnabled());
        setTitle(c23707.getTitle());
        setIcon(c23707.getIcon());
        setActionView(c23707.getActionView());
        setContentDescription(c23707.getContentDescription());
        C18933.m43611(this, c23707.getTooltipText());
        adjustAppearance();
    }

    public void initialize(C23707 c23707, boolean z) {
        this.isBold = z;
        initialize(c23707, 0);
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                C3306 c3306 = (C3306) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c3306).width = -1;
                this.actionArea.setLayoutParams(c3306);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            C3306 c3307 = (C3306) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c3307).width = -2;
            this.actionArea.setLayoutParams(c3307);
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
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C3798.f13772)).inflate();
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

    @Override // l.InterfaceC0858
    public C23707 getItemData() {
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
                drawable = C7603.m20139(drawable).mutate();
                C7603.m20129(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM39101 = C16631.m39101(getResources(), C12972.f43196, getContext().getTheme());
                this.emptyDrawable = drawableM39101;
                if (drawableM39101 != null) {
                    int i2 = this.iconSize;
                    drawableM39101.setBounds(0, 0, i2, i2);
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
        C23707 c23707 = this.itemData;
        if (c23707 != null && c23707.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C23707 c23707 = this.itemData;
        if (c23707 != null) {
            setIcon(c23707.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C16407.m38617(this.textView, i);
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
