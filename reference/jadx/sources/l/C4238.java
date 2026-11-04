package l;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C4238 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ܶ᩵ۢ, reason: not valid java name and contains not printable characters */
    public static int f15451;

    /* JADX INFO: renamed from: ֡۟ۖ, reason: not valid java name and contains not printable characters */
    public static Object m13529(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ۙᩳۜ, reason: not valid java name and contains not printable characters */
    public static String m13530(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ֨᩶, reason: not valid java name and contains not printable characters */
    public static void m13531(Object obj, int i) {
        ((C24132) obj).mo52339(i);
    }

    /* JADX INFO: renamed from: ۢ᩷֫, reason: not valid java name and contains not printable characters */
    public static byte[] m13532(Object obj, Object obj2, Object obj3) {
        return ((C22941) obj).m51731((C8002) obj2, (C3374) obj3);
    }

    /* JADX INFO: renamed from: ۢ᩸᩸, reason: not valid java name and contains not printable characters */
    public static String m13533(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۤ۬֨, reason: not valid java name and contains not printable characters */
    public static String m13534(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ۧۘۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13535(Object obj, Object obj2, boolean z) {
        return ((InterfaceC9801) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۨۖۘ, reason: not valid java name and contains not printable characters */
    public static int m13536(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ܶ֡ۜ, reason: not valid java name and contains not printable characters */
    public static void m13537(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ܽܿܽ, reason: not valid java name and contains not printable characters */
    public static long m13538() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ᩴ᩺ۗ, reason: not valid java name and contains not printable characters */
    public static C2361 m13539(Object obj) {
        return ((InterfaceC15712) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ᩷ܳۡ, reason: not valid java name and contains not printable characters */
    public static int m13540() {
        return 1553186240;
    }

    /* JADX INFO: renamed from: ᩸᩺ۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m13541(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᩺۫ۜ, reason: not valid java name and contains not printable characters */
    public static void m13542(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩻֡ۖ, reason: not valid java name and contains not printable characters */
    public static void m13543(Object obj, Object obj2, Object obj3) {
        ((C18872) obj).m43775((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩻ܳܺ, reason: not valid java name and contains not printable characters */
    public static C10186 m13544(Object obj, Object obj2) {
        return C10186.m26305((String) obj, (String) obj2);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C14678(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C14678(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C14678[i];
    }
}
