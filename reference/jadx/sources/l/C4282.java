package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: l.ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes.dex */
public final class C4282 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩹ۧۚ, reason: not valid java name and contains not printable characters */
    public static int f15546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18452 f15547;

    /* JADX INFO: renamed from: ֡֡᩸, reason: not valid java name and contains not printable characters */
    public static boolean m13644() {
        return true;
    }

    /* JADX INFO: renamed from: ֡۠۠, reason: not valid java name and contains not printable characters */
    public static void m13645(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ۖܳ᩺, reason: not valid java name and contains not printable characters */
    public static String m13646(Object obj) {
        return C18326.m42779((String) obj);
    }

    /* JADX INFO: renamed from: ۘ֨᩶, reason: not valid java name and contains not printable characters */
    public static Iterator m13647(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۛۤܶ, reason: not valid java name and contains not printable characters */
    public static void m13648(Object obj) {
        ((C13511) obj).m33192();
    }

    /* JADX INFO: renamed from: ۜ֨۫, reason: not valid java name and contains not printable characters */
    public static String m13649(Object obj) {
        return ((AbstractC7364) obj).m20218();
    }

    /* JADX INFO: renamed from: ۡۗܺ, reason: not valid java name and contains not printable characters */
    public static String m13650(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ᩶۫, reason: not valid java name and contains not printable characters */
    public static int m13651(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۤ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static String m13652(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ۫ܶۘ, reason: not valid java name and contains not printable characters */
    public static Boolean m13653(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܳۢ᩻, reason: not valid java name and contains not printable characters */
    public static View m13654(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ܽ᩷ۗ, reason: not valid java name and contains not printable characters */
    public static InputStream m13655(Object obj) {
        return ((AbstractC22044) obj).mo4290();
    }

    /* JADX INFO: renamed from: ᩷۬ܽ, reason: not valid java name and contains not printable characters */
    public static char m13656(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ᩺ۚۗ, reason: not valid java name and contains not printable characters */
    public static void m13657(Object obj, Object obj2) {
        ((C2361) obj).m8005((View) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۙۜ, reason: not valid java name and contains not printable characters */
    public static boolean m13658(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩻ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m13659(Object obj) {
        return ((C20348) obj).m46753();
    }

    public C4282(C18452 c18452) {
        this.f15547 = c18452;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C18452 c18452 = this.f15547;
        InterfaceC14722 interfaceC14722 = c18452.f60072;
        if (interfaceC14722 != null) {
            interfaceC14722.mo18051(c18452);
        }
    }
}
