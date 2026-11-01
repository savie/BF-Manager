package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import l.C0976;
import l.C10405;
import l.C12972;
import l.C13165;
import l.C16407;
import l.C17910;
import l.C18933;
import l.C22006;
import l.C2249;
import l.C23707;
import l.C2387;
import l.C3798;
import l.C5031;
import l.C6621;
import l.C7603;
import l.C9494;
import l.InterfaceC0858;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarItemView extends FrameLayout implements InterfaceC0858 {
    public static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    public static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int INVALID_ITEM_POSITION = -1;
    public ValueAnimator activeIndicatorAnimator;
    public int activeIndicatorDesiredHeight;
    public int activeIndicatorDesiredWidth;
    public boolean activeIndicatorEnabled;
    public int activeIndicatorLabelPadding;
    public int activeIndicatorMarginHorizontal;
    public float activeIndicatorProgress;
    public boolean activeIndicatorResizeable;
    public ActiveIndicatorTransform activeIndicatorTransform;
    public final View activeIndicatorView;
    public int activeTextAppearance;
    public BadgeDrawable badgeDrawable;
    public final ImageView icon;
    public final FrameLayout iconContainer;
    public ColorStateList iconTint;
    public boolean initialized;
    public boolean isShifting;
    public Drawable itemBackground;
    public C23707 itemData;
    public int itemPaddingBottom;
    public int itemPaddingTop;
    public int itemPosition;
    public ColorStateList itemRippleColor;
    public final ViewGroup labelGroup;
    public int labelVisibilityMode;
    public final TextView largeLabel;
    public Drawable originalIconDrawable;
    public float scaleDownFactor;
    public float scaleUpFactor;
    public float shiftAmount;
    public final TextView smallLabel;
    public Drawable wrappedIconDrawable;

    public abstract int getItemLayoutResId();

    @Override // l.InterfaceC0858
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    static {
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new ActiveIndicatorTransform();
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.activeTextAppearance = 0;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.iconContainer = (FrameLayout) findViewById(C3798.f13931);
        this.activeIndicatorView = findViewById(C3798.f13778);
        ImageView imageView = (ImageView) findViewById(C3798.f13895);
        this.icon = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C3798.f13743);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(C3798.f14073);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(C3798.f13790);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        this.activeIndicatorLabelPadding = getResources().getDimensionPixelSize(C0976.f4564);
        int i = C5031.f17539;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
                    }
                }
            });
        }
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return this.labelGroup.getMeasuredHeight() + getSuggestedIconHeight() + (this.labelGroup.getVisibility() == 0 ? this.activeIndicatorLabelPadding : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // l.InterfaceC0858
    public void initialize(C23707 c23707, int i) {
        CharSequence title;
        this.itemData = c23707;
        setCheckable(c23707.isCheckable());
        setChecked(c23707.isChecked());
        setEnabled(c23707.isEnabled());
        setIcon(c23707.getIcon());
        setTitle(c23707.getTitle());
        setId(c23707.getItemId());
        if (!TextUtils.isEmpty(c23707.getContentDescription())) {
            setContentDescription(c23707.getContentDescription());
        }
        if (!TextUtils.isEmpty(c23707.getTooltipText())) {
            title = c23707.getTooltipText();
        } else {
            title = c23707.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C18933.m43611(this, title);
        }
        setVisibility(c23707.isVisible() ? 0 : 8);
        this.initialized = true;
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        return frameLayout != null ? frameLayout : this.icon;
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            refreshChecked();
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    @Override // l.InterfaceC0858
    public C23707 getItemData() {
        return this.itemData;
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        C23707 c23707 = this.itemData;
        if (c23707 == null || TextUtils.isEmpty(c23707.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C23707 c23708 = this.itemData;
        if (c23708 != null && !TextUtils.isEmpty(c23708.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C18933.m43611(this, charSequence);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // android.view.View
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i);
            }
        });
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f, float f2) {
        View view = this.activeIndicatorView;
        if (view != null) {
            this.activeIndicatorTransform.updateForProgress(f, f2, view);
        }
        this.activeIndicatorProgress = f;
    }

    private void maybeAnimateActiveIndicatorToProgress(final float f) {
        if (this.activeIndicatorEnabled && this.initialized) {
            int i = C5031.f17539;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.activeIndicatorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.activeIndicatorAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f);
                this.activeIndicatorAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
                    }
                });
                this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C2387.f8957, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
                this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), C2387.f9469, getResources().getInteger(C6621.f22335)));
                this.activeIndicatorAnimator.start();
                return;
            }
        }
        setActiveIndicatorProgress(f, f);
    }

    private void refreshChecked() {
        C23707 c23707 = this.itemData;
        if (c23707 != null) {
            setChecked(c23707.isChecked());
        }
    }

    public void setChecked(boolean z) {
        TextView textView = this.largeLabel;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.largeLabel;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.smallLabel;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.smallLabel;
        textView4.setPivotY(textView4.getBaseline());
        maybeAnimateActiveIndicatorToProgress(z ? 1.0f : 0.0f);
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i == 1) {
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                    setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                    TextView textView5 = this.smallLabel;
                    float f = this.scaleUpFactor;
                    setViewScaleValues(textView5, f, f, 4);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    TextView textView6 = this.largeLabel;
                    float f2 = this.scaleDownFactor;
                    setViewScaleValues(textView6, f2, f2, 4);
                    setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
            }
        } else if (this.isShifting) {
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView7 = this.smallLabel;
                float f3 = this.scaleUpFactor;
                setViewScaleValues(textView7, f3, f3, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                TextView textView8 = this.largeLabel;
                float f4 = this.scaleDownFactor;
                setViewScaleValues(textView8, f4, f4, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        C22006 c22006M48820 = C22006.m48820(accessibilityNodeInfo);
        c22006M48820.m48846(C2249.m6904(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            c22006M48820.m48834(false);
            c22006M48820.m48876(C9494.f32123);
        }
        c22006M48820.m48875(getResources().getString(C17910.f56797));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public static void setViewTopMarginAndGravity(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void setViewScaleValues(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void updateViewPaddingBottom(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            C5031.m13996(this, C13165.m32553(getContext()));
        } else {
            C5031.m13996(this, (C13165) null);
        }
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

    public void setIcon(Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C7603.m20139(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                C7603.m20129(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        C7603.m20129(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setTextAppearanceInactive(int i) {
        setTextAppearanceWithoutFontScaling(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActive(int i) {
        this.activeTextAppearance = i;
        setTextAppearanceWithoutFontScaling(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.activeTextAppearance);
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public static void setTextAppearanceWithoutFontScaling(TextView textView, int i) {
        C16407.m38617(textView, i);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C10405.m26304(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    private void refreshItemBackground() {
        Drawable drawableCreateItemBackgroundCompat = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && this.iconContainer != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z = false;
            } else if (drawableCreateItemBackgroundCompat == null) {
                drawableCreateItemBackgroundCompat = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.iconContainer.setForeground(rippleDrawable);
        }
        int i = C5031.f17539;
        setBackground(drawableCreateItemBackgroundCompat);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public static Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    public void setItemPaddingTop(int i) {
        if (this.itemPaddingTop != i) {
            this.itemPaddingTop = i;
            refreshChecked();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.itemPaddingBottom != i) {
            this.itemPaddingBottom = i;
            refreshChecked();
        }
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.activeIndicatorLabelPadding != i) {
            this.activeIndicatorLabelPadding = i;
            refreshChecked();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.activeIndicatorEnabled = z;
        refreshItemBackground();
        View view = this.activeIndicatorView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorWidth(int i) {
        this.activeIndicatorDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i) {
        if (this.activeIndicatorView == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.activeIndicatorDesiredWidth, i - (this.activeIndicatorMarginHorizontal * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
        layoutParams.height = isActiveIndicatorResizeableAndUnlabeled() ? iMin : this.activeIndicatorDesiredHeight;
        layoutParams.width = iMin;
        this.activeIndicatorView.setLayoutParams(layoutParams);
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    public void setActiveIndicatorHeight(int i) {
        this.activeIndicatorDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.activeIndicatorMarginHorizontal = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        refreshItemBackground();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && this.activeIndicatorEnabled) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.activeIndicatorResizeable = z;
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        ImageView imageView;
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && (imageView = this.icon) != null) {
            tryRemoveBadgeFromAnchor(imageView);
        }
        this.badgeDrawable = badgeDrawable;
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            tryAttachBadgeToAnchor(imageView2);
        }
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    public int getItemBackgroundResId() {
        return C12972.f43145;
    }

    public int getItemDefaultMarginResId() {
        return C0976.f4173;
    }

    public class ActiveIndicatorTransform {
        public static final float ALPHA_FRACTION = 0.2f;
        public static final float SCALE_X_HIDDEN = 0.4f;
        public static final float SCALE_X_SHOWN = 1.0f;

        public float calculateScaleY(float f, float f2) {
            return 1.0f;
        }

        public ActiveIndicatorTransform() {
        }

        public float calculateAlpha(float f, float f2) {
            return AnimationUtils.lerp(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f);
        }

        public float calculateScaleX(float f, float f2) {
            return AnimationUtils.lerp(0.4f, 1.0f, f);
        }

        public void updateForProgress(float f, float f2, View view) {
            view.setScaleX(calculateScaleX(f, f2));
            view.setScaleY(calculateScaleY(f, f2));
            view.setAlpha(calculateAlpha(f, f2));
        }
    }

    public class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        public ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public float calculateScaleY(float f, float f2) {
            return calculateScaleX(f, f2);
        }
    }
}
