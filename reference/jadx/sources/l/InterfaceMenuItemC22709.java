package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94YU */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC22709 extends MenuItem {
    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC22709 setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC22709 setTooltipText(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    AbstractC15227 mo6057();

    /* JADX INFO: renamed from: ۙ */
    InterfaceMenuItemC22709 mo6058(AbstractC15227 abstractC15227);

    /* JADX INFO: renamed from: ۤ */
    boolean mo6059();

    /* JADX INFO: renamed from: ᩷ */
    boolean mo6060();
}
