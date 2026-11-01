package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import l.AbstractC0447;
import l.AbstractC3000;
import l.C0443;
import l.C0976;
import l.C10405;
import l.C12418;
import l.C13638;
import l.C15844;
import l.C16882;
import l.C17381;
import l.C18616;
import l.C1977;
import l.C20909;
import l.C23707;
import l.C2387;
import l.C2893;
import l.C5031;
import l.C8033;
import l.InterfaceC0422;
import l.InterfaceC7503;
import l.RunnableC7793;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    public final InterfaceC7503 backDrawerListener;
    public final MaterialBackOrchestrator backOrchestrator;
    public boolean bottomInsetScrimEnabled;
    public int drawerLayoutCornerSize;
    public final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    public final int drawerLayoutCornerSizeBackAnimationMax;
    public OnNavigationItemSelectedListener listener;
    public final int maxWidth;
    public final NavigationMenu menu;
    public MenuInflater menuInflater;
    public ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    public final NavigationMenuPresenter presenter;
    public final ShapeableDelegate shapeableDelegate;
    public final MaterialSideContainerBackHelper sideContainerBackHelper;
    public final int[] tmpLocation;
    public boolean topInsetScrimEnabled;
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] DISABLED_STATE_SET = {-16842910};
    public static final int DEF_STYLE_RES = C18616.f59283;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2387.f9373);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListCreateDefaultColorStateList;
        int i2;
        int i3;
        int i4 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i4), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new AbstractC0447() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // l.AbstractC0447, l.InterfaceC7503
            public void onDrawerOpened(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    C13638.requireNonNull(materialBackOrchestrator);
                    view.post(new RunnableC7793(3, materialBackOrchestrator));
                }
            }

            @Override // l.AbstractC0447, l.InterfaceC7503
            public void onDrawerClosed(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        C1977 c1977ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C8033.f27778, i, i4, new int[0]);
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26981)) {
            Drawable drawableM6370 = c1977ObtainTintedStyledAttributes.m6370(C8033.f26981);
            int i5 = C5031.f17539;
            setBackground(drawableM6370);
        }
        int iM6384 = c1977ObtainTintedStyledAttributes.m6384(C8033.f27566, 0);
        this.drawerLayoutCornerSize = iM6384;
        this.drawerLayoutCornerSizeBackAnimationEnabled = iM6384 == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(C0976.f3997);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i4).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            int i6 = C5031.f17539;
            setBackground(materialShapeDrawable);
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27247)) {
            setElevation(c1977ObtainTintedStyledAttributes.m6384(C8033.f27247, 0));
        }
        setFitsSystemWindows(c1977ObtainTintedStyledAttributes.m6376(C8033.f27087, false));
        this.maxWidth = c1977ObtainTintedStyledAttributes.m6384(C8033.f27884, 0);
        ColorStateList colorStateListM6385 = c1977ObtainTintedStyledAttributes.m6383(C8033.f27761) ? c1977ObtainTintedStyledAttributes.m6385(C8033.f27761) : null;
        int iM6387 = c1977ObtainTintedStyledAttributes.m6383(C8033.f27017) ? c1977ObtainTintedStyledAttributes.m6387(C8033.f27017, 0) : 0;
        if (iM6387 == 0 && colorStateListM6385 == null) {
            colorStateListM6385 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26448)) {
            colorStateListCreateDefaultColorStateList = c1977ObtainTintedStyledAttributes.m6385(C8033.f26448);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int iM6388 = c1977ObtainTintedStyledAttributes.m6383(C8033.f27336) ? c1977ObtainTintedStyledAttributes.m6387(C8033.f27336, 0) : 0;
        boolean zM6376 = c1977ObtainTintedStyledAttributes.m6376(C8033.f26644, true);
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27407)) {
            setItemIconSize(c1977ObtainTintedStyledAttributes.m6384(C8033.f27407, 0));
        }
        ColorStateList colorStateListM6386 = c1977ObtainTintedStyledAttributes.m6383(C8033.f26858) ? c1977ObtainTintedStyledAttributes.m6385(C8033.f26858) : null;
        if (iM6388 == 0 && colorStateListM6386 == null) {
            colorStateListM6386 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM6371 = c1977ObtainTintedStyledAttributes.m6370(C8033.f26769);
        if (drawableM6371 == null && hasShapeAppearance(c1977ObtainTintedStyledAttributes)) {
            drawableM6371 = createDefaultItemBackground(c1977ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c1977ObtainTintedStyledAttributes, C8033.f26555);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(c1977ObtainTintedStyledAttributes, null)));
            }
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27140)) {
            i2 = 0;
            setItemHorizontalPadding(c1977ObtainTintedStyledAttributes.m6384(C8033.f27140, 0));
        } else {
            i2 = 0;
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f28080)) {
            setItemVerticalPadding(c1977ObtainTintedStyledAttributes.m6384(C8033.f28080, i2));
        }
        setDividerInsetStart(c1977ObtainTintedStyledAttributes.m6384(C8033.f26342, i2));
        setDividerInsetEnd(c1977ObtainTintedStyledAttributes.m6384(C8033.f27831, i2));
        setSubheaderInsetStart(c1977ObtainTintedStyledAttributes.m6384(C8033.f27814, i2));
        setSubheaderInsetEnd(c1977ObtainTintedStyledAttributes.m6384(C8033.f26964, i2));
        setTopInsetScrimEnabled(c1977ObtainTintedStyledAttributes.m6376(C8033.f27123, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(c1977ObtainTintedStyledAttributes.m6376(C8033.f27513, this.bottomInsetScrimEnabled));
        int iM6385 = c1977ObtainTintedStyledAttributes.m6384(C8033.f28097, i2);
        setItemMaxLines(c1977ObtainTintedStyledAttributes.m6381(C8033.f27034, 1));
        navigationMenu.setCallback(new InterfaceC0422() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // l.InterfaceC0422
            public void onMenuModeChange(C12418 c12418) {
            }

            @Override // l.InterfaceC0422
            public boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (iM6387 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(iM6387);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListM6385);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (iM6388 != 0) {
            navigationMenuPresenter.setItemTextAppearance(iM6388);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(zM6376);
        navigationMenuPresenter.setItemTextColor(colorStateListM6386);
        navigationMenuPresenter.setItemBackground(drawableM6371);
        navigationMenuPresenter.setItemIconPadding(iM6385);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27496)) {
            i3 = 0;
            inflateMenu(c1977ObtainTintedStyledAttributes.m6387(C8033.f27496, 0));
        } else {
            i3 = 0;
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27619)) {
            inflateHeaderView(c1977ObtainTintedStyledAttributes.m6387(C8033.f27619, i3));
        }
        c1977ObtainTintedStyledAttributes.m6379();
        setupInsetScrimsListener();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof C17381) && (getLayoutParams() instanceof C20909)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i3 = ((C20909) getLayoutParams()).f67943;
                int i4 = C5031.f17539;
                boolean z = Gravity.getAbsoluteGravity(i3, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private boolean hasShapeAppearance(C1977 c1977) {
        return c1977.m6383(C8033.f26698) || c1977.m6383(C8033.f27390);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof C17381) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            C17381 c17381 = (C17381) parent;
            c17381.m40494(this.backDrawerListener);
            c17381.m40481(this.backDrawerListener);
            if (C17381.m40472(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof C17381) {
            ((C17381) parent).m40494(this.backDrawerListener);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    private Drawable createDefaultItemBackground(C1977 c1977) {
        return createDefaultItemDrawable(c1977, MaterialResources.getColorStateList(getContext(), c1977, C8033.f27230));
    }

    private Drawable createDefaultItemDrawable(C1977 c1977, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c1977.m6387(C8033.f26698, 0), c1977.m6387(C8033.f27390, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, c1977.m6384(C8033.f28027, 0), c1977.m6384(C8033.f26431, 0), c1977.m6384(C8033.f26752, 0), c1977.m6384(C8033.f26538, 0));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new C16882(3, this));
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(C15844 c15844) {
        this.presenter.dispatchApplyWindowInsets(c15844);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C10405.m26304(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C23707) menuItemFindItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C23707) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C0443 c0443) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c0443);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C0443 c0443) {
        this.sideContainerBackHelper.updateBackProgress(c0443, ((C20909) requireDrawerLayoutParent().second).f67943);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c0443.m2268()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        C17381 c17381 = (C17381) pairRequireDrawerLayoutParent.first;
        C0443 c0443OnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (c0443OnHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(c0443OnHandleBackInvoked, ((C20909) pairRequireDrawerLayoutParent.second).f67943, DrawerLayoutUtils.getScrimCloseAnimatorListener(c17381, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(c17381));
            return;
        }
        c17381.m40479((View) this, true);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    private Pair requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof C17381) && (layoutParams instanceof C20909)) {
            return new Pair((C17381) parent, (C20909) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C2893(getContext());
        }
        return this.menuInflater;
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM26305 = C10405.m26305(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM26305.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM26305.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Code duplicated, block: B:18:0x004f  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z2 = true;
                boolean z3 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z3);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z3 && navigationView2.isTopInsetScrimEnabled());
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                NavigationView.this.setDrawLeftInsetForeground(z);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z4 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z5 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z4 && z5 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z2 = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z2);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public class SavedState extends AbstractC3000 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l.AbstractC3000, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }
}
