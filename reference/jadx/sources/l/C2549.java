package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2549 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8484(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24442(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m8486(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24444(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m8485(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24443(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8481(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24439(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8482(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24440(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8483(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC22709) {
            ((InterfaceMenuItemC22709) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C9260.m24441(menuItem, mode);
        }
    }
}
