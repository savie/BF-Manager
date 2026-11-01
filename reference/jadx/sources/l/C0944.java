package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes2.dex */
public class C0944 implements PluginMenu {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f3750 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PluginContext f3751;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuC1957 f3752;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6248 f3753;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m3705(String str) {
        if (str == null) {
            return 0;
        }
        return this.f3753.mo17279(str, new C22112(this));
    }

    public C0944(PluginContext pluginContext, InterfaceMenuC1957 interfaceMenuC1957, InterfaceC6248 interfaceC6248) {
        this.f3751 = pluginContext;
        this.f3752 = interfaceMenuC1957;
        this.f3753 = interfaceC6248;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(CharSequence charSequence) {
        return add(charSequence.toString(), charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence) {
        return add(str, charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C13638.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C3184.m9601(1, str3) == '}' && (stringNullable = this.f3751.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C12940 c12940 = new C12940(this.f3751, str, str2, (InterfaceMenuItemC9720) this.f3752.add(m3705(str2), m3705(str), 0, charSequence), null);
        this.f3750.add(c12940);
        return c12940;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(charSequence.toString(), charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence) {
        return addSubMenu(str, charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C13638.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C3184.m9601(1, str3) == '}' && (stringNullable = this.f3751.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C22818 c22818 = new C22818(this.f3751, str, str2, (SubMenuC7915) this.f3752.addSubMenu(m3705(str2), m3705(str), 0, charSequence), this.f3753);
        this.f3750.add(c22818.getItem());
        return c22818;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final C12940 findItem(String str) {
        for (C12940 c12940 : this.f3750) {
            if (c12940.getItemId().equals(str)) {
                return c12940;
            }
            if (c12940.hasSubMenu()) {
                C22818 subMenu = c12940.getSubMenu();
                C13638.requireNonNull(subMenu);
                C12940 c12940FindItem = subMenu.findItem(str);
                if (c12940FindItem != null) {
                    return c12940FindItem;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12940 m3706(int i) {
        for (C12940 c12940 : this.f3750) {
            if (c12940.f43012.getItemId() == i) {
                return c12940;
            }
            if (c12940.hasSubMenu()) {
                C22818 subMenu = c12940.getSubMenu();
                C13638.requireNonNull(subMenu);
                C12940 c12940M3706 = subMenu.m3706(i);
                if (c12940M3706 != null) {
                    return c12940M3706;
                }
            }
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem getItem(int i) {
        return (PluginMenuItem) this.f3750.get(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final int size() {
        return this.f3750.size();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupCheckable(String str, boolean z, boolean z2) {
        this.f3752.setGroupCheckable(m3705(str), z, z2);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupVisible(String str, boolean z) {
        this.f3752.setGroupVisible(m3705(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupEnabled(String str, boolean z) {
        this.f3752.setGroupEnabled(m3705(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupDividerEnabled(boolean z) {
        this.f3752.setGroupDividerEnabled(z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void clear() {
        this.f3752.clear();
        this.f3750.clear();
    }
}
