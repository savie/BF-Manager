package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l.AbstractC3000;
import l.C0976;
import l.C12418;
import l.C1977;
import l.C2893;
import l.C5031;
import l.C7603;
import l.C8033;
import l.InterfaceC0422;
import l.InterfaceC12854;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    public static final int MENU_PRESENTER_ID = 1;
    public final NavigationBarMenu menu;
    public MenuInflater menuInflater;
    public final NavigationBarMenuView menuView;
    public final NavigationBarPresenter presenter;
    public OnItemReselectedListener reselectedListener;
    public OnItemSelectedListener selectedListener;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public abstract int getMaxItemCount();

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        C1977 c1977ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C8033.f27559, i, i2, C8033.f26501, C8033.f27353);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26441)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(c1977ObtainTintedStyledAttributes.m6385(C8033.f26441));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(c1977ObtainTintedStyledAttributes.m6384(C8033.f27400, getResources().getDimensionPixelSize(C0976.f4007)));
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26501)) {
            setItemTextAppearanceInactive(c1977ObtainTintedStyledAttributes.m6387(C8033.f26501, 0));
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27353)) {
            setItemTextAppearanceActive(c1977ObtainTintedStyledAttributes.m6387(C8033.f27353, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(c1977ObtainTintedStyledAttributes.m6376(C8033.f27193, true));
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26715)) {
            setItemTextColor(c1977ObtainTintedStyledAttributes.m6385(C8033.f26715));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            int i3 = C5031.f17539;
            setBackground(materialShapeDrawable);
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26548)) {
            setItemPaddingTop(c1977ObtainTintedStyledAttributes.m6384(C8033.f26548, 0));
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27027)) {
            setItemPaddingBottom(c1977ObtainTintedStyledAttributes.m6384(C8033.f27027, 0));
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f27240)) {
            setActiveIndicatorLabelPadding(c1977ObtainTintedStyledAttributes.m6384(C8033.f27240, 0));
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26762)) {
            setElevation(c1977ObtainTintedStyledAttributes.m6384(C8033.f26762, 0));
        }
        C7603.m20129(getBackground().mutate(), MaterialResources.getColorStateList(context2, c1977ObtainTintedStyledAttributes, C8033.f27612));
        setLabelVisibilityMode(c1977ObtainTintedStyledAttributes.m6369(C8033.f27990, -1));
        int iM6387 = c1977ObtainTintedStyledAttributes.m6387(C8033.f28090, 0);
        if (iM6387 != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(iM6387);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, c1977ObtainTintedStyledAttributes, C8033.f26661));
        }
        int iM6388 = c1977ObtainTintedStyledAttributes.m6387(C8033.f27133, 0);
        if (iM6388 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iM6388, C8033.f27080);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27506, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27877, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f27824, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C8033.f26868));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(C8033.f26335, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c1977ObtainTintedStyledAttributes.m6383(C8033.f26395)) {
            inflateMenu(c1977ObtainTintedStyledAttributes.m6387(C8033.f26395, 0));
        }
        c1977ObtainTintedStyledAttributes.m6379();
        addView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarMenu.setCallback(new InterfaceC0422() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // l.InterfaceC0422
            public void onMenuModeChange(C12418 c12418) {
            }

            @Override // l.InterfaceC0422
            public boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public InterfaceC12854 getMenuView() {
        return this.menuView;
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.menuView.setItemBackgroundRes(i);
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public void setItemPaddingTop(int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public void setItemPaddingBottom(int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.menuView.setActiveIndicatorLabelPadding(i);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.menuView.setItemActiveIndicatorEnabled(z);
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem == null || this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public void setItemTextAppearanceInactive(int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public void setItemTextAppearanceActive(int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C2893(getContext());
        }
        return this.menuInflater;
    }

    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
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
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    public class SavedState extends AbstractC3000 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
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
        public Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // l.AbstractC3000, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }
    }
}
