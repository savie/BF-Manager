package l;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۢܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10160 implements PluginMenuItem {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PluginContext f32539;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f32540;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9414 f32541;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f32542;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC22709 f32543;

    public C10160(PluginContext pluginContext, String str, String str2, InterfaceMenuItemC22709 interfaceMenuItemC22709, C9414 c9414) {
        this.f32539 = pluginContext;
        this.f32540 = str;
        this.f32542 = str2;
        this.f32543 = interfaceMenuItemC22709;
        this.f32541 = c9414;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getItemId() {
        return this.f32540;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getGroupId() {
        return this.f32542;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final CharSequence getTitle() {
        CharSequence title = this.f32543.getTitle();
        return title == null ? "" : title;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIcon(Drawable drawable) {
        this.f32543.setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final Drawable getIcon() {
        return this.f32543.getIcon();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIconTintList(ColorStateList colorStateList) {
        this.f32543.setIconTintList(colorStateList);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final ColorStateList getIconTintList() {
        return this.f32543.getIconTintList();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setCheckable(boolean z) {
        this.f32543.setCheckable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isCheckable() {
        return this.f32543.isCheckable();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setChecked(boolean z) {
        this.f32543.setChecked(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isChecked() {
        return this.f32543.isChecked();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setVisible(boolean z) {
        this.f32543.setVisible(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isVisible() {
        return this.f32543.isVisible();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setEnabled(boolean z) {
        this.f32543.setEnabled(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isEnabled() {
        return this.f32543.isEnabled();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean hasSubMenu() {
        return this.f32541 != null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginSubMenu getSubMenu() {
        return this.f32541;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final C9414 getSubMenu() {
        return this.f32541;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setTitle(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C22313.m50373(1, str) == '}' && (stringNullable = this.f32539.getStringNullable(str)) != null) {
                charSequence = stringNullable;
            }
        }
        this.f32543.setTitle(charSequence);
        return this;
    }
}
