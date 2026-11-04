package l;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes.dex */
public final class C0773 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ᩷ۧ᩺, reason: not valid java name and contains not printable characters */
    public static int f2792;

    /* JADX INFO: renamed from: ֡ۨۙ, reason: not valid java name and contains not printable characters */
    public static void m3156(Object obj, Object obj2) throws IOException {
        ((C25179) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ֡ܽ۟, reason: not valid java name and contains not printable characters */
    public static int m3157(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۙ᩷᩵, reason: not valid java name and contains not printable characters */
    public static int m3158(Object obj) {
        return ((View) obj).getWidth();
    }

    /* JADX INFO: renamed from: ۚ᩹ܶ, reason: not valid java name and contains not printable characters */
    public static Integer m3159(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ۛۤ᩶, reason: not valid java name and contains not printable characters */
    public static void m3160(Object obj) throws IOException {
        ((C25179) obj).close();
    }

    /* JADX INFO: renamed from: ۢ֡ۗ, reason: not valid java name and contains not printable characters */
    public static int m3161() {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۬ۤ, reason: not valid java name and contains not printable characters */
    public static Set m3162(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ܶܶ֡, reason: not valid java name and contains not printable characters */
    public static void m3163(Object obj, Object obj2) {
        ((C8614) obj).m23230((String) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩺۫, reason: not valid java name and contains not printable characters */
    public static void m3164(int i, int i2, Object obj) {
        C6929.m19210(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܺۡ᩻, reason: not valid java name and contains not printable characters */
    public static void m3165(Object obj, Object obj2) {
        ((C5068) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺܽ۠, reason: not valid java name and contains not printable characters */
    public static String m3166(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿۙۚ, reason: not valid java name and contains not printable characters */
    public static String m3167() {
        return C18978.m44077();
    }

    /* JADX INFO: renamed from: ܿۨ֡, reason: not valid java name and contains not printable characters */
    public static String m3168(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ᩳ᩷ۖ, reason: not valid java name and contains not printable characters */
    public static int m3169(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ᩶ܽۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3170(Object obj, Object obj2) {
        return ((AbstractC18900) obj).m43847((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ᩳ۟, reason: not valid java name and contains not printable characters */
    public static void m3171(Object obj) {
        ((View) obj).invalidate();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C8231 c8231 = new C8231(parcel);
        c8231.f27092 = parcel.readByte() != 0;
        return c8231;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8231[i];
    }
}
