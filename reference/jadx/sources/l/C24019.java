package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes.dex */
public final class C24019 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52859(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28368(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52861(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28372(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52860(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28371(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52856(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28365(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52857(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28366(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52858(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC9720) {
            ((InterfaceMenuItemC9720) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C11319.m28367(menuItem, mode);
        }
    }
}
