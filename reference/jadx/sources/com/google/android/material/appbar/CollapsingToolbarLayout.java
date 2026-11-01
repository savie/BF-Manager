package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import bin.mt.plus.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l.C0976;
import l.C10405;
import l.C13638;
import l.C15844;
import l.C18616;
import l.C2387;
import l.C3798;
import l.C4449;
import l.C5031;
import l.C6938;
import l.C7603;
import l.C8033;
import l.InterfaceC11754;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    public static final int DEF_STYLE_RES = C18616.f59483;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    public final CollapsingTextHelper collapsingTextHelper;
    public boolean collapsingTitleEnabled;
    public Drawable contentScrim;
    public int currentOffset;
    public boolean drawCollapsingTitle;
    public View dummyView;
    public final ElevationOverlayProvider elevationOverlayProvider;
    public int expandedMarginBottom;
    public int expandedMarginEnd;
    public int expandedMarginStart;
    public int expandedMarginTop;
    public int extraMultilineHeight;
    public boolean extraMultilineHeightEnabled;
    public boolean forceApplySystemWindowInsetTop;
    public C15844 lastInsets;
    public AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    public boolean refreshToolbar;
    public int scrimAlpha;
    public long scrimAnimationDuration;
    public final TimeInterpolator scrimAnimationFadeInInterpolator;
    public final TimeInterpolator scrimAnimationFadeOutInterpolator;
    public ValueAnimator scrimAnimator;
    public int scrimVisibleHeightTrigger;
    public boolean scrimsAreShown;
    public Drawable statusBarScrim;
    public int titleCollapseMode;
    public final Rect tmpRect;
    public ViewGroup toolbar;
    public View toolbarDirectChild;
    public int toolbarId;
    public int topInsetApplied;

    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2387.f9342);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineHeight = 0;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C8033.f27639, i, i2, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(C8033.f26695, 8388691));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(C8033.f27427, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27387, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f26749)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f26749, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f26535)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f26535, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f28024)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f28024, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27227)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27227, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(C8033.f27811, true);
        setTitle(typedArrayObtainStyledAttributes.getText(C8033.f27758));
        collapsingTextHelper.setExpandedTextAppearance(C18616.f60140);
        collapsingTextHelper.setCollapsedTextAppearance(R.style.MT_Protector);
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f26428)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C8033.f26428, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f26468)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C8033.f26468, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27120)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(C8033.f27120, -1)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27333)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C8033.f27333));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27054)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C8033.f27054));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27970, -1);
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f28077)) {
            collapsingTextHelper.setMaxLines(typedArrayObtainStyledAttributes.getInt(C8033.f28077, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27014)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(C8033.f27014, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(C8033.f27493, 600);
        this.scrimAnimationFadeInInterpolator = MotionUtils.resolveThemeInterpolator(context2, C2387.f8656, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.scrimAnimationFadeOutInterpolator = MotionUtils.resolveThemeInterpolator(context2, C2387.f8656, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(C8033.f26575));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(C8033.f27705));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(C8033.f26961, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(C8033.f26908, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(C8033.f26855, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(C8033.f26641, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C5031.m13989(this, new InterfaceC11754() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // l.InterfaceC11754
            public C15844 onApplyWindowInsets(View view, C15844 c15844) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(c15844);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            int i = C5031.f17539;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            C5031.m14002(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    public C15844 onWindowInsetChanged(C15844 c15844) {
        int i = C5031.f17539;
        C15844 c15845 = getFitsSystemWindows() ? c15844 : null;
        if (!C13638.equals(this.lastInsets, c15845)) {
            this.lastInsets = c15845;
            requestLayout();
        }
        return c15844.m37682();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode() && this.collapsingTextHelper.getExpansionFraction() < this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.collapsingTextHelper.draw(canvas);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        C15844 c15844 = this.lastInsets;
        int iM37681 = c15844 != null ? c15844.m37681() : 0;
        if (iM37681 > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), iM37681 - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i, i2);
        }
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void updateContentScrimBounds(Drawable drawable, int i, int i2) {
        updateContentScrimBounds(drawable, this.toolbar, i, i2);
    }

    private void updateContentScrimBounds(Drawable drawable, View view, int i, int i2) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i = this.toolbarId;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    public static boolean isToolbar(View view) {
        return (view instanceof C6938) || (view instanceof Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            return view == this.toolbar;
        }
        return view == view2;
    }

    private View findDirectChild(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C15844 c15844 = this.lastInsets;
        int iM37681 = c15844 != null ? c15844.m37681() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && iM37681 > 0) {
            this.topInsetApplied = iM37681;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM37681, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.getMaxLines() > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.extraMultilineHeight = (expandedLineCount - 1) * Math.round(this.collapsingTextHelper.getExpandedTextFullHeight());
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            if (view == null || view == this) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C15844 c15844 = this.lastInsets;
        if (c15844 != null) {
            int iM37681 = c15844.m37681();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                int i6 = C5031.f17539;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iM37681) {
                    C5031.m14004(iM37681, childAt);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            getViewOffsetHelper(getChildAt(i7)).onViewLayout();
        }
        updateTextBounds(i, i2, i3, i4, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            getViewOffsetHelper(getChildAt(i8)).applyOffsets();
        }
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        int i5 = C5031.f17539;
        boolean z2 = view.isAttachedToWindow() && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            updateCollapsedBounds(z3);
            this.collapsingTextHelper.setExpandedBounds(z3 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i3 - i) - (z3 ? this.expandedMarginStart : this.expandedMarginEnd), (i4 - i2) - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate(z);
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    private void updateCollapsedBounds(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof C6938) {
            C6938 c6938 = (C6938) viewGroup;
            titleMarginStart = c6938.getTitleMarginStart();
            titleMarginEnd = c6938.getTitleMarginEnd();
            titleMarginTop = c6938.getTitleMarginTop();
            titleMarginBottom = c6938.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof Toolbar)) {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        } else {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i = rect.left + (z ? titleMarginEnd : titleMarginStart);
        int i2 = rect.top + maxOffsetForPinChild + titleMarginTop;
        int i3 = rect.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        collapsingTextHelper.setCollapsedBounds(i, i2, i3 - titleMarginStart, (rect.bottom + maxOffsetForPinChild) - titleMarginBottom);
    }

    public static CharSequence getToolbarTitle(View view) {
        if (view instanceof C6938) {
            return ((C6938) view).getTitle();
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        return null;
    }

    public static int getHeightWithMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    public static ViewOffsetHelper getViewOffsetHelper(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(C3798.f13847);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(C3798.f13847, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    public void setTitle(CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public void setTitleCollapseMode(int i) {
        this.titleCollapseMode = i;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C2387.f9551);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(C0976.f4390));
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i) {
        if (i == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 1) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i == 3) {
            return TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.END;
    }

    public void setScrimsShown(boolean z) {
        int i = C5031.f17539;
        setScrimsShown(z, isLaidOut() && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            if (z2) {
                animateScrim(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.scrimsAreShown = z;
        }
    }

    private void animateScrim(int i) {
        TimeInterpolator timeInterpolator;
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            if (i > this.scrimAlpha) {
                timeInterpolator = this.scrimAnimationFadeInInterpolator;
            } else {
                timeInterpolator = this.scrimAnimationFadeOutInterpolator;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i);
        this.scrimAnimator.start();
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                int i2 = C5031.f17539;
                viewGroup.postInvalidateOnAnimation();
            }
            this.scrimAlpha = i;
            int i3 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C10405.m26304(getContext(), i));
    }

    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                Drawable drawable3 = this.statusBarScrim;
                int i = C5031.f17539;
                C7603.m20134(drawable3, getLayoutDirection());
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            int i2 = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.contentScrim.setVisible(z, false);
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C10405.m26304(getContext(), i));
    }

    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTextHelper.setCollapsedTextGravity(i);
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.collapsingTextHelper.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.collapsingTextHelper.setExpandedTextGravity(i);
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public void setExpandedTitleTextSize(float f) {
        this.collapsingTextHelper.setExpandedTextSize(f);
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    public void setCollapsedTitleTextSize(float f) {
        this.collapsingTextHelper.setCollapsedTextSize(f);
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setMaxLines(int i) {
        this.collapsingTextHelper.setMaxLines(i);
    }

    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    public void setLineSpacingAdd(float f) {
        this.collapsingTextHelper.setLineSpacingAdd(f);
    }

    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    public void setLineSpacingMultiplier(float f) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f);
    }

    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    public void setHyphenationFrequency(int i) {
        this.collapsingTextHelper.setHyphenationFrequency(i);
    }

    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.forceApplySystemWindowInsetTop = z;
    }

    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.extraMultilineHeightEnabled = z;
    }

    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i + this.topInsetApplied + this.extraMultilineHeight;
        }
        C15844 c15844 = this.lastInsets;
        int iM37681 = c15844 != null ? c15844.m37681() : 0;
        int i2 = C5031.f17539;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + iM37681, getHeight());
        }
        return getHeight() / 3;
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    public void setScrimAnimationDuration(long j) {
        this.scrimAnimationDuration = j;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        public static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        public int collapseMode;
        public float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8033.f26789);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(C8033.f27160, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(C8033.f28117, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    public final int getMaxOffsetForPinChild(View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i;
            C15844 c15844 = collapsingToolbarLayout.lastInsets;
            int iM37681 = c15844 != null ? c15844.m37681() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i3 = layoutParams.collapseMode;
                if (i3 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(C4449.m12402(-i, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && iM37681 > 0) {
                int i4 = C5031.f17539;
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            int i5 = C5031.f17539;
            int minimumHeight = (height - collapsingToolbarLayout3.getMinimumHeight()) - iM37681;
            float f = minimumHeight;
            CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout4.collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout4.currentOffset + minimumHeight);
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i) / f);
        }
    }
}
