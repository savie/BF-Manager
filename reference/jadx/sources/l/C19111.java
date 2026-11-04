package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes5.dex */
public class C19111 implements PluginMenu {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PluginContext f61849;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuC10774 f61850;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19722 f61851;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f61852 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m44233(String str) {
        if (str == null) {
            return 0;
        }
        return this.f61851.mo13100(str, new C7924(this));
    }

    public C19111(PluginContext pluginContext, InterfaceMenuC10774 interfaceMenuC10774, InterfaceC19722 interfaceC19722) {
        this.f61849 = pluginContext;
        this.f61850 = interfaceMenuC10774;
        this.f61851 = interfaceC19722;
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
        C17359.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C22313.m50373(1, str3) == '}' && (stringNullable = this.f61849.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C10160 c10160 = new C10160(this.f61849, str, str2, (InterfaceMenuItemC22709) this.f61850.add(m44233(str2), m44233(str), 0, charSequence), null);
        this.f61852.add(c10160);
        return c10160;
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
        C17359.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C22313.m50373(1, str3) == '}' && (stringNullable = this.f61849.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C9414 c9414 = new C9414(this.f61849, str, str2, (SubMenuC12026) this.f61850.addSubMenu(m44233(str2), m44233(str), 0, charSequence), this.f61851);
        this.f61852.add(c9414.getItem());
        return c9414;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final C10160 findItem(String str) {
        for (C10160 c10160 : this.f61852) {
            if (c10160.getItemId().equals(str)) {
                return c10160;
            }
            if (c10160.hasSubMenu()) {
                C9414 subMenu = c10160.getSubMenu();
                C17359.requireNonNull(subMenu);
                C10160 c10160FindItem = subMenu.findItem(str);
                if (c10160FindItem != null) {
                    return c10160FindItem;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10160 m44234(int i) {
        for (C10160 c10160 : this.f61852) {
            if (c10160.f32543.getItemId() == i) {
                return c10160;
            }
            if (c10160.hasSubMenu()) {
                C9414 subMenu = c10160.getSubMenu();
                C17359.requireNonNull(subMenu);
                C10160 c10160M44234 = subMenu.m44234(i);
                if (c10160M44234 != null) {
                    return c10160M44234;
                }
            }
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem getItem(int i) {
        return (PluginMenuItem) this.f61852.get(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final int size() {
        return this.f61852.size();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupCheckable(String str, boolean z, boolean z2) {
        this.f61850.setGroupCheckable(m44233(str), z, z2);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupVisible(String str, boolean z) {
        this.f61850.setGroupVisible(m44233(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupEnabled(String str, boolean z) {
        this.f61850.setGroupEnabled(m44233(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupDividerEnabled(boolean z) {
        this.f61850.setGroupDividerEnabled(z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void clear() {
        this.f61850.clear();
        this.f61852.clear();
    }
}
