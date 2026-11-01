package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuItemC4386 extends AbstractC15240 implements MenuItem {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Method f15625;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC9720 f15626;

    public MenuItemC4386(Context context, InterfaceMenuItemC9720 interfaceMenuItemC9720) {
        super(context);
        if (interfaceMenuItemC9720 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15626 = interfaceMenuItemC9720;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f15626.getItemId();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f15626.getGroupId();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f15626.getOrder();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15626.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f15626.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f15626.getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15626.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f15626.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f15626.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f15626.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f15626.getIcon();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f15626.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f15626.getIntent();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f15626.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f15626.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f15626.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f15626.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f15626.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f15626.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f15626.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f15626.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f15626.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f15626.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f15626.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f15626.isCheckable();
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f15626.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f15626.isChecked();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f15626.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f15626.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f15626.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f15626.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f15626.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m36509(this.f15626.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15626.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC3244(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15626.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f15626.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f15626.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1833(view);
        }
        this.f15626.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC9720 interfaceMenuItemC9720 = this.f15626;
        interfaceMenuItemC9720.setActionView(i);
        View actionView = interfaceMenuItemC9720.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC9720.setActionView(new C1833(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f15626.getActionView();
        return actionView instanceof C1833 ? (View) ((C1833) actionView).f7027 : actionView;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC14535 actionProviderVisibilityListenerC14535 = new ActionProviderVisibilityListenerC14535(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC14535 = null;
        }
        this.f15626.mo4157(actionProviderVisibilityListenerC14535);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC5674 abstractC5674Mo4156 = this.f15626.mo4156();
        if (abstractC5674Mo4156 instanceof ActionProviderVisibilityListenerC14535) {
            return ((ActionProviderVisibilityListenerC14535) abstractC5674Mo4156).f47597;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f15626.expandActionView();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f15626.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f15626.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15626.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC9596(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f15626.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f15626.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f15626.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f15626.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15626.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f15626.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15626.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15626.getIconTintMode();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m12236() {
        try {
            Method method = this.f15625;
            InterfaceMenuItemC9720 interfaceMenuItemC9720 = this.f15626;
            if (method == null) {
                this.f15625 = interfaceMenuItemC9720.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f15625.invoke(interfaceMenuItemC9720, Boolean.TRUE);
        } catch (Exception unused) {
        }
    }
}
