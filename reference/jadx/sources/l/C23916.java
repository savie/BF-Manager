package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C23916 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۫۬۫, reason: not valid java name and contains not printable characters */
    public static int f77426;

    /* JADX INFO: renamed from: ֡᩶ۡ, reason: not valid java name and contains not printable characters */
    public static Object m53416(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ֫ܳܿ, reason: not valid java name and contains not printable characters */
    public static int m53417(Object obj, int i) {
        return C23434.m52632((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ۟ۙۨ, reason: not valid java name and contains not printable characters */
    public static Set m53418(Object obj) {
        return ((InterfaceC1174) obj).mo4327();
    }

    /* JADX INFO: renamed from: ۟ܰ᩻, reason: not valid java name and contains not printable characters */
    public static int m53419() {
        return 0;
    }

    /* JADX INFO: renamed from: ۠᩸ۧ, reason: not valid java name and contains not printable characters */
    public static String m53420(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤ۫֡, reason: not valid java name and contains not printable characters */
    public static long m53421(Object obj) {
        return ((C8002) obj).getSize();
    }

    /* JADX INFO: renamed from: ۫᩹᩻, reason: not valid java name and contains not printable characters */
    public static String m53422(int i, Object obj) {
        return C13645.m33382(i, (String) obj);
    }

    /* JADX INFO: renamed from: ܰ֨ۗ, reason: not valid java name and contains not printable characters */
    public static Iterator m53423(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ܰۨۢ, reason: not valid java name and contains not printable characters */
    public static C17505 m53424(Object obj) {
        return ((InterfaceC19106) obj).mo11043();
    }

    /* JADX INFO: renamed from: ܰܺ᩹, reason: not valid java name and contains not printable characters */
    public static void m53425(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܶۙᩳ, reason: not valid java name and contains not printable characters */
    public static Iterator m53426(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ܿۘܿ, reason: not valid java name and contains not printable characters */
    public static int m53427(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ᩴۗܺ, reason: not valid java name and contains not printable characters */
    public static boolean m53428(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۡۛ, reason: not valid java name and contains not printable characters */
    public static Iterator m53429(Object obj) {
        return ((AbstractC8696) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩺ܶ۟, reason: not valid java name and contains not printable characters */
    public static Throwable m53430(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ᩺᩶ۤ, reason: not valid java name and contains not printable characters */
    public static void m53431(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C3778(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C3778[i];
    }
}
