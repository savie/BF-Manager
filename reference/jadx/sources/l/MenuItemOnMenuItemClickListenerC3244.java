package l;

import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC3244 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۤᩴ᩻, reason: not valid java name and contains not printable characters */
    public static int f12064;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f12065;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC4386 f12066;

    /* JADX INFO: renamed from: ֡ᩳܳ, reason: not valid java name and contains not printable characters */
    public static int m9701() {
        return -1450528649;
    }

    /* JADX INFO: renamed from: ۘ᩷۟, reason: not valid java name and contains not printable characters */
    public static int m9702(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۚۛ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m9703(Object obj, Object obj2) {
        return ((C11545) obj).m28814((String) obj2);
    }

    /* JADX INFO: renamed from: ۚܶۜ, reason: not valid java name and contains not printable characters */
    public static void m9704(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۜܿ᩹, reason: not valid java name and contains not printable characters */
    public static Iterator m9705(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ۢ᩷ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9706(Object obj) {
        return C14952.m35723((String) obj);
    }

    /* JADX INFO: renamed from: ۨ᩷᩵, reason: not valid java name and contains not printable characters */
    public static boolean m9707() {
        return C1709.m5692();
    }

    /* JADX INFO: renamed from: ۫ܿ᩺, reason: not valid java name and contains not printable characters */
    public static int m9708(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ܰۨ֡, reason: not valid java name and contains not printable characters */
    public static void m9709(Object obj, Object obj2, Object obj3) {
        ((C10142) obj).m25768((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܺ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static void m9710(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩳۚܺ, reason: not valid java name and contains not printable characters */
    public static Set m9711(Object obj) {
        return ((InterfaceC15001) obj).mo34148();
    }

    /* JADX INFO: renamed from: ᩳۧᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9712(Object obj) {
        return ((C5202) obj).m14380();
    }

    /* JADX INFO: renamed from: ᩵۠᩷, reason: not valid java name and contains not printable characters */
    public static boolean m9713(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ᩵᩹᩺, reason: not valid java name and contains not printable characters */
    public static void m9714(Object obj) {
        ((C14638) obj).m35142();
    }

    /* JADX INFO: renamed from: ᩶ۖۚ, reason: not valid java name and contains not printable characters */
    public static String m9715(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻᩹᩶, reason: not valid java name and contains not printable characters */
    public static String m9716(Object obj) {
        return ((String) obj).toLowerCase();
    }

    public MenuItemOnMenuItemClickListenerC3244(MenuItemC4386 menuItemC4386, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12066 = menuItemC4386;
        this.f12065 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f12065.onMenuItemClick(this.f12066.m36508(menuItem));
    }
}
