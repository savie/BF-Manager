package l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C8407 implements InterfaceMenuItemC22709 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public CharSequence f27530;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f27533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC15227 f27534;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f27537;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence f27538;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f27539;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f27540;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f27541;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ContextMenu.ContextMenuInfo f27542;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f27543;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f27544;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f27546;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char f27549;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SubMenuC12026 f27550;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f27551;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C9898 f27552;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f27554;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public MenuItem.OnMenuItemClickListener f27555;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Intent f27556;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public MenuItem.OnActionExpandListener f27557;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f27529 = 4096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27553 = 4096;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f27558 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ColorStateList f27547 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f27548 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f27535 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f27531 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f27536 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f27545 = 16;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f27532 = false;

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    public C8407(C9898 c9898, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f27552 = c9898;
        this.f27546 = i2;
        this.f27543 = i;
        this.f27540 = i3;
        this.f27533 = i4;
        this.f27539 = charSequence;
        this.f27537 = i5;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m22591() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f27555;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C9898 c9898 = this.f27552;
            if (!c9898.dispatchMenuItemSelected(c9898, this)) {
                if (this.f27556 != null) {
                    try {
                        c9898.getContext().startActivity(this.f27556);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                AbstractC15227 abstractC15227 = this.f27534;
                if (abstractC15227 == null || !abstractC15227.mo19200()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f27545 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f27545 |= 16;
        } else {
            this.f27545 &= -17;
        }
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f27543;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f27546;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f27540;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m22600() {
        return this.f27533;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f27556;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f27556 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f27544;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f27544 == c) {
            return this;
        }
        this.f27544 = Character.toLowerCase(c);
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f27544 == c && this.f27553 == i) {
            return this;
        }
        this.f27544 = Character.toLowerCase(c);
        this.f27553 = KeyEvent.normalizeMetaState(i);
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f27553;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f27549;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f27529;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f27549 == c) {
            return this;
        }
        this.f27549 = c;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f27549 == c && this.f27529 == i) {
            return this;
        }
        this.f27549 = c;
        this.f27529 = KeyEvent.normalizeMetaState(i);
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f27549 = c;
        this.f27544 = Character.toLowerCase(c2);
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f27549 = c;
        this.f27529 = KeyEvent.normalizeMetaState(i);
        this.f27544 = Character.toLowerCase(c2);
        this.f27553 = KeyEvent.normalizeMetaState(i2);
        this.f27552.onItemsChanged(false);
        return this;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char m22597() {
        return this.f27552.isQwertyMode() ? this.f27544 : this.f27549;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m22595() {
        char cM22597 = m22597();
        if (cM22597 == 0) {
            return "";
        }
        C9898 c9898 = this.f27552;
        Resources resources = c9898.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(c9898.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.MT_Protector));
        }
        int i = c9898.isQwertyMode() ? this.f27553 : this.f27529;
        m22585(i, 65536, resources.getString(R.string.MT_Protector), sb);
        m22585(i, 4096, resources.getString(R.string.MT_Protector), sb);
        m22585(i, 2, resources.getString(R.string.MT_Protector), sb);
        m22585(i, 1, resources.getString(R.string.MT_Protector), sb);
        m22585(i, 4, resources.getString(R.string.MT_Protector), sb);
        m22585(i, 8, resources.getString(R.string.MT_Protector), sb);
        if (cM22597 == '\b') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM22597 == '\n') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM22597 == ' ') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else {
            sb.append(cM22597);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22585(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f27550;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f27550 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22589(SubMenuC12026 subMenuC12026) {
        this.f27550 = subMenuC12026;
        subMenuC12026.setHeaderTitle(this.f27539);
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f27539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m22587(InterfaceC1586 interfaceC1586) {
        if (!interfaceC1586.prefersCondensedTitle()) {
            return this.f27539;
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f27539 = charSequence;
        this.f27552.onItemsChanged(false);
        SubMenuC12026 subMenuC12026 = this.f27550;
        if (subMenuC12026 != null) {
            subMenuC12026.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f27552.getContext().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f27530;
        return charSequence != null ? charSequence : this.f27539;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f27530 = charSequence;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f27541;
        if (drawable != null) {
            return m22584(drawable);
        }
        if (this.f27558 == 0) {
            return null;
        }
        Drawable drawableM2186 = C0385.m2186(this.f27552.getContext(), this.f27558);
        this.f27558 = 0;
        this.f27541 = drawableM2186;
        return m22584(drawableM2186);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f27558 = 0;
        this.f27541 = drawable;
        this.f27536 = true;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f27541 = null;
        this.f27558 = i;
        this.f27536 = true;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27547 = colorStateList;
        this.f27535 = true;
        this.f27536 = true;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f27547;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f27548 = mode;
        this.f27531 = true;
        this.f27536 = true;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f27548;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Drawable m22584(Drawable drawable) {
        if (drawable != null && this.f27536 && (this.f27535 || this.f27531)) {
            drawable = C0597.m2697(drawable).mutate();
            if (this.f27535) {
                C0597.m2690(drawable, this.f27547);
            }
            if (this.f27531) {
                C0597.m2693(drawable, this.f27548);
            }
            this.f27536 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f27545 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f27545;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f27545 = i2;
        if (i != i2) {
            this.f27552.onItemsChanged(false);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22592(boolean z) {
        this.f27545 = (z ? 4 : 0) | (this.f27545 & (-5));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22593() {
        return (this.f27545 & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f27545 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f27545 & 4) != 0) {
            this.f27552.setExclusiveItemChecked(this);
            return this;
        }
        m22599(z);
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22599(boolean z) {
        int i = this.f27545;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f27545 = i2;
        if (i != i2) {
            this.f27552.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC15227 abstractC15227 = this.f27534;
        if (abstractC15227 == null || !abstractC15227.mo19198()) {
            return (this.f27545 & 8) == 0;
        }
        return (this.f27545 & 8) == 0 && this.f27534.mo19199();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22598(boolean z) {
        int i = this.f27545;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f27545 = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m22598(z)) {
            this.f27552.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27555 = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f27539;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22588(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f27542 = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f27542;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22586() {
        return (this.f27545 & 32) == 32;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m22602() {
        return (this.f27537 & 1) == 1;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6060() {
        return (this.f27537 & 2) == 2;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6059() {
        return (mo6060() || m22602()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22601(boolean z) {
        if (z) {
            this.f27545 |= 32;
        } else {
            this.f27545 &= -33;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m22596() {
        return (this.f27537 & 4) == 4;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f27537 = i;
        this.f27552.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f27554 = view;
        this.f27534 = null;
        if (view != null && view.getId() == -1 && (i = this.f27546) > 0) {
            view.setId(i);
        }
        this.f27552.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        C9898 c9898 = this.f27552;
        Context context = c9898.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f27554 = viewInflate;
        this.f27534 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f27546) > 0) {
            viewInflate.setId(i2);
        }
        c9898.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f27554;
        if (view != null) {
            return view;
        }
        AbstractC15227 abstractC15227 = this.f27534;
        if (abstractC15227 == null) {
            return null;
        }
        View viewMo19193 = abstractC15227.mo19193(this);
        this.f27554 = viewMo19193;
        return viewMo19193;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15227 mo6057() {
        return this.f27534;
    }

    @Override // l.InterfaceMenuItemC22709
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceMenuItemC22709 mo6058(AbstractC15227 abstractC15227) {
        this.f27554 = null;
        this.f27534 = abstractC15227;
        this.f27552.onItemsChanged(true);
        AbstractC15227 abstractC15228 = this.f27534;
        if (abstractC15228 != null) {
            abstractC15228.mo19195(new C2441(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m22594()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f27557;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f27552.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f27537 & 8) == 0) {
            return false;
        }
        if (this.f27554 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f27557;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f27552.collapseItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22594() {
        AbstractC15227 abstractC15227;
        if ((this.f27537 & 8) == 0) {
            return false;
        }
        if (this.f27554 == null && (abstractC15227 = this.f27534) != null) {
            this.f27554 = abstractC15227.mo19193(this);
        }
        return this.f27554 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22590(boolean z) {
        this.f27532 = z;
        this.f27552.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f27532;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f27557 = onActionExpandListener;
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final InterfaceMenuItemC22709 setContentDescription(CharSequence charSequence) {
        this.f27551 = charSequence;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f27551;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final InterfaceMenuItemC22709 setTooltipText(CharSequence charSequence) {
        this.f27538 = charSequence;
        this.f27552.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC22709, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f27538;
    }
}
