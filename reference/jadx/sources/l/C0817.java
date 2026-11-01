package l;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes.dex */
public final class C0817 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۫ۗۜ, reason: not valid java name and contains not printable characters */
    public static boolean f3443;

    /* JADX INFO: renamed from: ֨֨᩹, reason: not valid java name and contains not printable characters */
    public static void m3397(Object obj, Object obj2, Object obj3) {
        C8265.m21677((C11545) obj, (InterfaceC2557) obj2, (InterfaceC18848) obj3);
    }

    /* JADX INFO: renamed from: ֨᩸ۗ, reason: not valid java name and contains not printable characters */
    public static long m3398(long j, long j2) {
        return C2516.m7714(j, j2);
    }

    /* JADX INFO: renamed from: ۘ᩸֫, reason: not valid java name and contains not printable characters */
    public static boolean m3399() {
        return true;
    }

    /* JADX INFO: renamed from: ۙܳ᩵, reason: not valid java name and contains not printable characters */
    public static int m3400(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۚܿ֫, reason: not valid java name and contains not printable characters */
    public static int m3401(Object obj) {
        return ((C6111) obj).m16916();
    }

    /* JADX INFO: renamed from: ۛܶܺ, reason: not valid java name and contains not printable characters */
    public static void m3402(Object obj, long j) {
        C16737.m39274((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ۜۜۛ, reason: not valid java name and contains not printable characters */
    public static void m3403(Object obj, Object obj2) {
        ((C17492) obj).setAdapter((AbstractC0414) obj2);
    }

    /* JADX INFO: renamed from: ۧۗܺ, reason: not valid java name and contains not printable characters */
    public static boolean m3404(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۧ۫ۗ, reason: not valid java name and contains not printable characters */
    public static int m3405(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ۨۜۧ, reason: not valid java name and contains not printable characters */
    public static String m3406(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܳۤۛ, reason: not valid java name and contains not printable characters */
    public static String m3407(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ܽܶ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3408(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ᩶۟ܰ, reason: not valid java name and contains not printable characters */
    public static String m3409(Object obj, boolean z) {
        return C1355.m4769((String) obj, z);
    }

    /* JADX INFO: renamed from: ᩸ۚᩴ, reason: not valid java name and contains not printable characters */
    public static String m3410(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩸ܿ᩵, reason: not valid java name and contains not printable characters */
    public static MenuItem m3411(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ᩸ᩳۢ, reason: not valid java name and contains not printable characters */
    public static String m3412(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C12813(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C12813[i];
    }
}
