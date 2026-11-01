package l;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C2871 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ֨۬ۖ, reason: not valid java name and contains not printable characters */
    public static int f10837;

    /* JADX INFO: renamed from: ֡ۚۢ, reason: not valid java name and contains not printable characters */
    public static String m8637(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ܺ֫, reason: not valid java name and contains not printable characters */
    public static void m8638(Object obj, Object obj2) {
        ((C8067) obj).m21258((View) obj2);
    }

    /* JADX INFO: renamed from: ۗᩳ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m8639(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ۘ۫᩹, reason: not valid java name and contains not printable characters */
    public static String m8640(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۘ᩻ۘ, reason: not valid java name and contains not printable characters */
    public static int m8641(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ۚ۠ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m8642() {
        return C1709.m5693();
    }

    /* JADX INFO: renamed from: ۜܳ᩵, reason: not valid java name and contains not printable characters */
    public static Intent m8643(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ۜܺۚ, reason: not valid java name and contains not printable characters */
    public static void m8644(Object obj, int i) {
        ((InterfaceC16662) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ۟ۖܶ, reason: not valid java name and contains not printable characters */
    public static boolean m8645(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ۢۢܺ, reason: not valid java name and contains not printable characters */
    public static boolean m8646() {
        return true;
    }

    /* JADX INFO: renamed from: ۧ᩶ᩴ, reason: not valid java name and contains not printable characters */
    public static void m8647(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ۨܺ֡, reason: not valid java name and contains not printable characters */
    public static void m8648(Object obj) {
        C0577.m2746((String) obj);
    }

    /* JADX INFO: renamed from: ۫֫ۨ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m8649(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ܽۜᩴ, reason: not valid java name and contains not printable characters */
    public static int m8650(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ᩶֫֫, reason: not valid java name and contains not printable characters */
    public static Iterator m8651(Object obj) {
        return ((AbstractC18494) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩶᩺ܶ, reason: not valid java name and contains not printable characters */
    public static char m8652(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C13581(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C13581[i];
    }
}
