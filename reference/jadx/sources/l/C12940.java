package l;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.۬ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12940 implements PluginMenuItem {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC9720 f43012;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PluginContext f43013;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22818 f43014;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f43015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f43016;

    public C12940(PluginContext pluginContext, String str, String str2, InterfaceMenuItemC9720 interfaceMenuItemC9720, C22818 c22818) {
        this.f43013 = pluginContext;
        this.f43015 = str;
        this.f43016 = str2;
        this.f43012 = interfaceMenuItemC9720;
        this.f43014 = c22818;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getItemId() {
        return this.f43015;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getGroupId() {
        return this.f43016;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final CharSequence getTitle() {
        CharSequence title = this.f43012.getTitle();
        return title == null ? "" : title;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIcon(Drawable drawable) {
        this.f43012.setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final Drawable getIcon() {
        return this.f43012.getIcon();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIconTintList(ColorStateList colorStateList) {
        this.f43012.setIconTintList(colorStateList);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final ColorStateList getIconTintList() {
        return this.f43012.getIconTintList();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setCheckable(boolean z) {
        this.f43012.setCheckable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isCheckable() {
        return this.f43012.isCheckable();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setChecked(boolean z) {
        this.f43012.setChecked(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isChecked() {
        return this.f43012.isChecked();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setVisible(boolean z) {
        this.f43012.setVisible(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isVisible() {
        return this.f43012.isVisible();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setEnabled(boolean z) {
        this.f43012.setEnabled(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isEnabled() {
        return this.f43012.isEnabled();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean hasSubMenu() {
        return this.f43014 != null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginSubMenu getSubMenu() {
        return this.f43014;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final C22818 getSubMenu() {
        return this.f43014;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setTitle(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C3184.m9601(1, str) == '}' && (stringNullable = this.f43013.getStringNullable(str)) != null) {
                charSequence = stringNullable;
            }
        }
        this.f43012.setTitle(charSequence);
        return this;
    }
}
