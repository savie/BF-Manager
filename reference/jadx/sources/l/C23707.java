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

/* JADX INFO: renamed from: l.᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L5OM */
/* JADX INFO: loaded from: classes.dex */
public final class C23707 implements InterfaceMenuItemC9720 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public char f76691;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f76692;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public MenuItem.OnMenuItemClickListener f76693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC5674 f76695;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f76696;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence f76697;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f76698;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public MenuItem.OnActionExpandListener f76699;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ContextMenu.ContextMenuInfo f76701;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f76703;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f76704;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f76707;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f76709;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SubMenuC7915 f76711;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f76712;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Intent f76713;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C12418 f76714;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76716;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f76720;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76710 = 4096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76715 = 4096;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f76719 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ColorStateList f76708 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f76717 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f76706 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f76694 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f76702 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76718 = 16;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f76700 = false;

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

    public C23707(C12418 c12418, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f76714 = c12418;
        this.f76712 = i2;
        this.f76692 = i;
        this.f76704 = i3;
        this.f76716 = i4;
        this.f76697 = charSequence;
        this.f76705 = i5;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m52179() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f76693;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C12418 c12418 = this.f76714;
            if (!c12418.dispatchMenuItemSelected(c12418, this)) {
                if (this.f76713 != null) {
                    try {
                        c12418.getContext().startActivity(this.f76713);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                AbstractC5674 abstractC5674 = this.f76695;
                if (abstractC5674 == null || !abstractC5674.mo15564()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f76718 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f76718 |= 16;
        } else {
            this.f76718 &= -17;
        }
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f76692;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f76712;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f76704;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m52168() {
        return this.f76716;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f76713;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f76713 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f76709;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f76709 == c) {
            return this;
        }
        this.f76709 = Character.toLowerCase(c);
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f76709 == c && this.f76715 == i) {
            return this;
        }
        this.f76709 = Character.toLowerCase(c);
        this.f76715 = KeyEvent.normalizeMetaState(i);
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f76715;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f76691;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f76710;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f76691 == c) {
            return this;
        }
        this.f76691 = c;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f76691 == c && this.f76710 == i) {
            return this;
        }
        this.f76691 = c;
        this.f76710 = KeyEvent.normalizeMetaState(i);
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f76691 = c;
        this.f76709 = Character.toLowerCase(c2);
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f76691 = c;
        this.f76710 = KeyEvent.normalizeMetaState(i);
        this.f76709 = Character.toLowerCase(c2);
        this.f76715 = KeyEvent.normalizeMetaState(i2);
        this.f76714.onItemsChanged(false);
        return this;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char m52175() {
        return this.f76714.isQwertyMode() ? this.f76709 : this.f76691;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m52182() {
        char cM52175 = m52175();
        if (cM52175 == 0) {
            return "";
        }
        C12418 c12418 = this.f76714;
        Resources resources = c12418.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(c12418.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.MT_Protector));
        }
        int i = c12418.isQwertyMode() ? this.f76715 : this.f76710;
        m52166(i, 65536, resources.getString(R.string.MT_Protector), sb);
        m52166(i, 4096, resources.getString(R.string.MT_Protector), sb);
        m52166(i, 2, resources.getString(R.string.MT_Protector), sb);
        m52166(i, 1, resources.getString(R.string.MT_Protector), sb);
        m52166(i, 4, resources.getString(R.string.MT_Protector), sb);
        m52166(i, 8, resources.getString(R.string.MT_Protector), sb);
        if (cM52175 == '\b') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM52175 == '\n') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM52175 == ' ') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else {
            sb.append(cM52175);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52166(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f76711;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f76711 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52173(SubMenuC7915 subMenuC7915) {
        this.f76711 = subMenuC7915;
        subMenuC7915.setHeaderTitle(this.f76697);
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f76697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m52171(InterfaceC0858 interfaceC0858) {
        if (!interfaceC0858.prefersCondensedTitle()) {
            return this.f76697;
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f76697 = charSequence;
        this.f76714.onItemsChanged(false);
        SubMenuC7915 subMenuC7915 = this.f76711;
        if (subMenuC7915 != null) {
            subMenuC7915.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f76714.getContext().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f76703;
        return charSequence != null ? charSequence : this.f76697;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f76703 = charSequence;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f76698;
        if (drawable != null) {
            return m52165(drawable);
        }
        if (this.f76719 == 0) {
            return null;
        }
        Drawable drawableM37904 = C15945.m37904(this.f76714.getContext(), this.f76719);
        this.f76719 = 0;
        this.f76698 = drawableM37904;
        return m52165(drawableM37904);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f76719 = 0;
        this.f76698 = drawable;
        this.f76702 = true;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f76698 = null;
        this.f76719 = i;
        this.f76702 = true;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f76708 = colorStateList;
        this.f76706 = true;
        this.f76702 = true;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f76708;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f76717 = mode;
        this.f76694 = true;
        this.f76702 = true;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f76717;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Drawable m52165(Drawable drawable) {
        if (drawable != null && this.f76702 && (this.f76706 || this.f76694)) {
            drawable = C7603.m20139(drawable).mutate();
            if (this.f76706) {
                C7603.m20129(drawable, this.f76708);
            }
            if (this.f76694) {
                C7603.m20132(drawable, this.f76717);
            }
            this.f76702 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f76718 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f76718;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f76718 = i2;
        if (i != i2) {
            this.f76714.onItemsChanged(false);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52178(boolean z) {
        this.f76718 = (z ? 4 : 0) | (this.f76718 & (-5));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m52177() {
        return (this.f76718 & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f76718 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f76718 & 4) != 0) {
            this.f76714.setExclusiveItemChecked(this);
            return this;
        }
        m52180(z);
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52180(boolean z) {
        int i = this.f76718;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f76718 = i2;
        if (i != i2) {
            this.f76714.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC5674 abstractC5674 = this.f76695;
        if (abstractC5674 == null || !abstractC5674.mo15569()) {
            return (this.f76718 & 8) == 0;
        }
        return (this.f76718 & 8) == 0 && this.f76695.mo15571();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52176(boolean z) {
        int i = this.f76718;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f76718 = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m52176(z)) {
            this.f76714.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f76693 = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f76697;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52172(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f76701 = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f76701;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m52170() {
        return (this.f76718 & 32) == 32;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m52183() {
        return (this.f76705 & 1) == 1;
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo4159() {
        return (this.f76705 & 2) == 2;
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4158() {
        return (mo4159() || m52183()) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52169(boolean z) {
        if (z) {
            this.f76718 |= 32;
        } else {
            this.f76718 &= -33;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m52181() {
        return (this.f76705 & 4) == 4;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f76705 = i;
        this.f76714.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f76707 = view;
        this.f76695 = null;
        if (view != null && view.getId() == -1 && (i = this.f76712) > 0) {
            view.setId(i);
        }
        this.f76714.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        C12418 c12418 = this.f76714;
        Context context = c12418.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f76707 = viewInflate;
        this.f76695 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f76712) > 0) {
            viewInflate.setId(i2);
        }
        c12418.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f76707;
        if (view != null) {
            return view;
        }
        AbstractC5674 abstractC5674 = this.f76695;
        if (abstractC5674 == null) {
            return null;
        }
        View viewMo15565 = abstractC5674.mo15565(this);
        this.f76707 = viewMo15565;
        return viewMo15565;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5674 mo4156() {
        return this.f76695;
    }

    @Override // l.InterfaceMenuItemC9720
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceMenuItemC9720 mo4157(AbstractC5674 abstractC5674) {
        this.f76707 = null;
        this.f76695 = abstractC5674;
        this.f76714.onItemsChanged(true);
        AbstractC5674 abstractC5675 = this.f76695;
        if (abstractC5675 != null) {
            abstractC5675.mo15566(new C11007(this));
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
        if (!m52167()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f76699;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f76714.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f76705 & 8) == 0) {
            return false;
        }
        if (this.f76707 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f76699;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f76714.collapseItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m52167() {
        AbstractC5674 abstractC5674;
        if ((this.f76705 & 8) == 0) {
            return false;
        }
        if (this.f76707 == null && (abstractC5674 = this.f76695) != null) {
            this.f76707 = abstractC5674.mo15565(this);
        }
        return this.f76707 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52174(boolean z) {
        this.f76700 = z;
        this.f76714.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f76700;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f76699 = onActionExpandListener;
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final InterfaceMenuItemC9720 setContentDescription(CharSequence charSequence) {
        this.f76696 = charSequence;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f76696;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final InterfaceMenuItemC9720 setTooltipText(CharSequence charSequence) {
        this.f76720 = charSequence;
        this.f76714.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC9720, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f76720;
    }
}
