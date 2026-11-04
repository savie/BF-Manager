package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C13473 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ᩸ۜ᩹, reason: not valid java name and contains not printable characters */
    public static int f42873;

    /* JADX INFO: renamed from: ֫ۚ֨, reason: not valid java name and contains not printable characters */
    public static byte m33133(Object obj, int i) {
        return ((C5408) obj).m16117(i);
    }

    /* JADX INFO: renamed from: ֫ۢܶ, reason: not valid java name and contains not printable characters */
    public static byte[] m33134(Object obj) {
        return ((AbstractC22044) obj).m49865();
    }

    /* JADX INFO: renamed from: ۙۖ᩶, reason: not valid java name and contains not printable characters */
    public static int m33135(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ۙۙ᩺, reason: not valid java name and contains not printable characters */
    public static void m33136(Object obj, int i) {
        ((C2361) obj).m8021(i);
    }

    /* JADX INFO: renamed from: ۜᩴ֡, reason: not valid java name and contains not printable characters */
    public static String m33137(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۠֫᩵, reason: not valid java name and contains not printable characters */
    public static C21962 m33138() {
        return C10773.m27467();
    }

    /* JADX INFO: renamed from: ۡۢۚ, reason: not valid java name and contains not printable characters */
    public static MenuItem m33139(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ۧܶۙ, reason: not valid java name and contains not printable characters */
    public static void m33140(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ۫ܳ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m33141(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* JADX INFO: renamed from: ܳۧۡ, reason: not valid java name and contains not printable characters */
    public static String m33142(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ܺۗ۠, reason: not valid java name and contains not printable characters */
    public static Intent m33143(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ܿ᩺֫, reason: not valid java name and contains not printable characters */
    public static boolean m33144() {
        return true;
    }

    /* JADX INFO: renamed from: ᩴۨۡ, reason: not valid java name and contains not printable characters */
    public static void m33145(Object obj, Object obj2, Object obj3) {
        ((C8458) obj).m22719((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩹᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static int m33146(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ᩺֡ܶ, reason: not valid java name and contains not printable characters */
    public static C12628 m33147(Object obj, boolean z) {
        return ((C18092) obj).m42190(z);
    }

    /* JADX INFO: renamed from: ᩺ۘ᩸, reason: not valid java name and contains not printable characters */
    public static long m33148(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C21811(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C21811[i];
    }
}
