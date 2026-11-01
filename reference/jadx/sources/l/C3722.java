package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C3722 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static int f13525;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21362 f13526;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6545 f13527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17834 f13528;

    /* JADX INFO: renamed from: ֡ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10889(Object obj) {
        return ((C11545) obj).m28800();
    }

    /* JADX INFO: renamed from: ֨ܳۚ, reason: not valid java name and contains not printable characters */
    public static void m10890(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ֫᩶ܺ, reason: not valid java name and contains not printable characters */
    public static Object m10891(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ۚۜ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10892(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ۢܽۗ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10893(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ۧۤۘ, reason: not valid java name and contains not printable characters */
    public static int m10894() {
        return 1730717355;
    }

    /* JADX INFO: renamed from: ܰ۟֨, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m10895(Object obj, Object obj2) {
        return C5553.m15313((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ܳܶۨ, reason: not valid java name and contains not printable characters */
    public static String m10896(Object obj) {
        return ((C12107) obj).getName();
    }

    /* JADX INFO: renamed from: ܳ᩶֫, reason: not valid java name and contains not printable characters */
    public static int m10897(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ܿܰܶ, reason: not valid java name and contains not printable characters */
    public static int m10898(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ܿ᩶ۚ, reason: not valid java name and contains not printable characters */
    public static int m10899(Object obj) {
        return ((C1313) obj).m4681();
    }

    /* JADX INFO: renamed from: ᩷᩸᩹, reason: not valid java name and contains not printable characters */
    public static C2519 m10900(Object obj, Object obj2) {
        return ((C2519) obj).m7859((C2519) obj2);
    }

    /* JADX INFO: renamed from: ᩷᩺᩷, reason: not valid java name and contains not printable characters */
    public static String m10901(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸᩻᩹, reason: not valid java name and contains not printable characters */
    public static boolean m10902(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۗۜ, reason: not valid java name and contains not printable characters */
    public static boolean m10903(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩻᩹ۘ, reason: not valid java name and contains not printable characters */
    public static void m10904(Object obj) {
        ((C7817) obj).m20606();
    }

    public C3722(C6545 c6545, C21362 c21362, C17834 c17834) {
        this.f13527 = c6545;
        this.f13526 = c21362;
        this.f13528 = c17834;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C6545 c6545 = this.f13527;
        boolean[] zArr = c6545.f22046;
        C21362 c21362 = this.f13526;
        if (zArr != null) {
            zArr[i] = c21362.isItemChecked(i);
        }
        c6545.f22043.onClick(this.f13528.f56483, i, c21362.isItemChecked(i));
    }
}
