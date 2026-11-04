package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S51M */
/* JADX INFO: loaded from: classes3.dex */
public final class C1696 implements InterfaceMenuItemC22709 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Intent f5813;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f5814;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f5815;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f5818;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f5820;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public CharSequence f5821;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f5822;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Context f5825;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f5827;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5823 = 4096;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f5828 = 4096;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ColorStateList f5819 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f5816 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5826 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f5824 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f5817 = 16;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15227 mo6057() {
        return null;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo6059() {
        return false;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo6060() {
        return true;
    }

    public C1696(Context context, CharSequence charSequence) {
        this.f5825 = context;
        this.f5821 = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5818;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5828;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5820;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5813;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5822;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5823;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5821;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5827;
        return charSequence != null ? charSequence : this.f5821;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5817 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5817 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5817 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f5817 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f5818 = Character.toLowerCase(c);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5818 = Character.toLowerCase(c);
        this.f5828 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f5817 = (z ? 1 : 0) | (this.f5817 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f5817 = (z ? 2 : 0) | (this.f5817 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f5817 = (z ? 16 : 0) | (this.f5817 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5820 = drawable;
        m6056();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5820 = C7508.m20563(this.f5825, i);
        m6056();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5813 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f5822 = c;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f5822 = c;
        this.f5823 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f5822 = c;
        this.f5818 = Character.toLowerCase(c2);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5822 = c;
        this.f5823 = KeyEvent.normalizeMetaState(i);
        this.f5818 = Character.toLowerCase(c2);
        this.f5828 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5821 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f5821 = this.f5825.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5827 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f5817 = (this.f5817 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC22709 mo6058(AbstractC15227 abstractC15227) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5815 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final InterfaceMenuItemC22709 setContentDescription(CharSequence charSequence) {
        this.f5815 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5815;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5814 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final InterfaceMenuItemC22709 setTooltipText(CharSequence charSequence) {
        this.f5814 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5814;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5819 = colorStateList;
        this.f5826 = true;
        m6056();
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5819;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5816 = mode;
        this.f5824 = true;
        m6056();
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5816;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m6056() {
        Drawable drawable = this.f5820;
        if (drawable != null) {
            if (this.f5826 || this.f5824) {
                Drawable drawableM2697 = C0597.m2697(drawable);
                this.f5820 = drawableM2697;
                Drawable drawableMutate = drawableM2697.mutate();
                this.f5820 = drawableMutate;
                if (this.f5826) {
                    C0597.m2690(drawableMutate, this.f5819);
                }
                if (this.f5824) {
                    C0597.m2693(this.f5820, this.f5816);
                }
            }
        }
    }
}
