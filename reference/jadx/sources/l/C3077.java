package l;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L7M3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3077 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۘ᩹֨, reason: not valid java name and contains not printable characters */
    public static boolean f9998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22469 f9999;

    public /* synthetic */ C3077(AbstractC22469 abstractC22469) {
        this.f9999 = abstractC22469;
    }

    /* JADX INFO: renamed from: ۖۜܳ, reason: not valid java name and contains not printable characters */
    public static void m10033(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    /* JADX INFO: renamed from: ۖۢ᩶, reason: not valid java name and contains not printable characters */
    public static C9431 m10034(Object obj) {
        return ((AbstractC7283) obj).m19934();
    }

    /* JADX INFO: renamed from: ۘܰ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m10035(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۚۘۚ, reason: not valid java name and contains not printable characters */
    public static int m10036(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ۚ᩶ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m10037() {
        return C18978.m44078();
    }

    /* JADX INFO: renamed from: ۚ᩻᩷, reason: not valid java name and contains not printable characters */
    public static void m10038(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ۛ֡۫, reason: not valid java name and contains not printable characters */
    public static C22673 m10039(int i) {
        return C22673.m51152(i);
    }

    /* JADX INFO: renamed from: ۢ֨֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m10040(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC18752) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۤ۬ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m10041() {
        return false;
    }

    /* JADX INFO: renamed from: ۫ᩴ᩸, reason: not valid java name and contains not printable characters */
    public static int m10042(Object obj) {
        return ((C24132) obj).m53968();
    }

    /* JADX INFO: renamed from: ܽܶ᩺, reason: not valid java name and contains not printable characters */
    public static void m10043(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ᩵֨᩹, reason: not valid java name and contains not printable characters */
    public static long m10044(long j, long j2) {
        return C19143.m44353(j, j2);
    }

    /* JADX INFO: renamed from: ᩵۠ۙ, reason: not valid java name and contains not printable characters */
    public static int m10045(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ᩷ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m10046(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ᩸ᩴ᩶, reason: not valid java name and contains not printable characters */
    public static String m10047(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹ۚ֨, reason: not valid java name and contains not printable characters */
    public static boolean m10048(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0204 c0204 = listAdapter instanceof HeaderViewListAdapter ? (C0204) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0204) listAdapter;
        AbstractC22469 abstractC22469 = this.f9999;
        c0204.f1366.performItemAction((MenuItem) listAdapter.getItem(i), abstractC22469, abstractC22469 instanceof ViewOnKeyListenerC24071 ? 5 : 1);
    }
}
