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

/* JADX INFO: renamed from: l.֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S51M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1127 implements InterfaceMenuItemC9720 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Intent f5059;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f5060;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public char f5062;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence f5063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Context f5066;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public char f5067;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f5068;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f5069;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f5071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5070 = 4096;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f5072 = 4096;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ColorStateList f5057 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f5065 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f5058 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f5061 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f5064 = 16;

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

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5674 mo4156() {
        return null;
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo4158() {
        return false;
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo4159() {
        return true;
    }

    public C1127(Context context, CharSequence charSequence) {
        this.f5066 = context;
        this.f5068 = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5062;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5072;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5071;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5059;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5067;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5070;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5068;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5069;
        return charSequence != null ? charSequence : this.f5068;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5064 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5064 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5064 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f5064 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f5062 = Character.toLowerCase(c);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5062 = Character.toLowerCase(c);
        this.f5072 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f5064 = (z ? 1 : 0) | (this.f5064 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f5064 = (z ? 2 : 0) | (this.f5064 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f5064 = (z ? 16 : 0) | (this.f5064 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5071 = drawable;
        m4155();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5071 = C10405.m26304(this.f5066, i);
        m4155();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5059 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f5067 = c;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f5067 = c;
        this.f5070 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f5067 = c;
        this.f5062 = Character.toLowerCase(c2);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5067 = c;
        this.f5070 = KeyEvent.normalizeMetaState(i);
        this.f5062 = Character.toLowerCase(c2);
        this.f5072 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5068 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f5068 = this.f5066.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5069 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f5064 = (this.f5064 & 8) | (z ? 0 : 8);
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

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC9720 mo4157(AbstractC5674 abstractC5674) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5060 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final InterfaceMenuItemC9720 setContentDescription(CharSequence charSequence) {
        this.f5060 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5060;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5063 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final InterfaceMenuItemC9720 setTooltipText(CharSequence charSequence) {
        this.f5063 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5063;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5057 = colorStateList;
        this.f5058 = true;
        m4155();
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5057;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5065 = mode;
        this.f5061 = true;
        m4155();
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5065;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m4155() {
        Drawable drawable = this.f5071;
        if (drawable != null) {
            if (this.f5058 || this.f5061) {
                Drawable drawableM20139 = C7603.m20139(drawable);
                this.f5071 = drawableM20139;
                Drawable drawableMutate = drawableM20139.mutate();
                this.f5071 = drawableMutate;
                if (this.f5058) {
                    C7603.m20129(drawableMutate, this.f5057);
                }
                if (this.f5061) {
                    C7603.m20132(this.f5071, this.f5065);
                }
            }
        }
    }
}
