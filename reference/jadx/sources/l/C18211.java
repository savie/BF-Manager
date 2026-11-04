package l;

import android.os.Build;
import android.view.Menu;

/* JADX INFO: renamed from: l.ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q34F */
/* JADX INFO: loaded from: classes4.dex */
public final class C18211 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42360(Menu menu) {
        if (menu instanceof InterfaceMenuC10774) {
            ((InterfaceMenuC10774) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C21195.m48334(menu, true);
        }
    }
}
