package l;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C7105 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۨᩴۛ, reason: not valid java name and contains not printable characters */
    public static int f23796;

    /* JADX INFO: renamed from: ۗ᩺۠, reason: not valid java name and contains not printable characters */
    public static void m18978(Object obj, boolean z) {
        ((C12562) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۛۙܽ, reason: not valid java name and contains not printable characters */
    public static void m18979(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ۟ۗܶ, reason: not valid java name and contains not printable characters */
    public static MenuItem m18980(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۟᩶᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC11462 m18981(Object obj) {
        return ((C11545) obj).m28817();
    }

    /* JADX INFO: renamed from: ۤۨܺ, reason: not valid java name and contains not printable characters */
    public static Intent m18982(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ۨ֡۫, reason: not valid java name and contains not printable characters */
    public static void m18983(Object obj, Object obj2, Object obj3) {
        ((AbstractC19769) obj).m44959((InterfaceC1423) obj2, (InterfaceC10597) obj3);
    }

    /* JADX INFO: renamed from: ۨۡ֫, reason: not valid java name and contains not printable characters */
    public static C2519 m18984(long j) {
        return C2519.m7824(j);
    }

    /* JADX INFO: renamed from: ۬ۙܿ, reason: not valid java name and contains not printable characters */
    public static boolean m18985() {
        return false;
    }

    /* JADX INFO: renamed from: ܰۢᩴ, reason: not valid java name and contains not printable characters */
    public static int m18986(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ܰܿۚ, reason: not valid java name and contains not printable characters */
    public static String m18987(Object obj) {
        return ((C18419) obj).m42711();
    }

    /* JADX INFO: renamed from: ܳۢ۟, reason: not valid java name and contains not printable characters */
    public static void m18988(Object obj, Object obj2) {
        C13465.m32967(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܳܳ᩶, reason: not valid java name and contains not printable characters */
    public static String m18989(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܶ۠ۘ, reason: not valid java name and contains not printable characters */
    public static int m18990(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ᩹ۡᩳ, reason: not valid java name and contains not printable characters */
    public static String m18991(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ᩹᩷ۜ, reason: not valid java name and contains not printable characters */
    public static void m18992(Object obj) {
        ((AbstractActivityC12483) obj).m31017();
    }

    /* JADX INFO: renamed from: ᩻֫ۖ, reason: not valid java name and contains not printable characters */
    public static void m18993(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C20511(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C20511[i];
    }
}
