package l;

import android.content.Intent;
import android.graphics.Paint;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3624 {

    /* JADX INFO: renamed from: ᩳܶۤ, reason: not valid java name and contains not printable characters */
    public static int f12429;

    /* JADX INFO: renamed from: ֡ᩴ۫, reason: not valid java name and contains not printable characters */
    public static C14955 m11754(Object obj) {
        return C14955.m35973((InputStream) obj);
    }

    /* JADX INFO: renamed from: ֫ۡܺ, reason: not valid java name and contains not printable characters */
    public static int m11755() {
        return 0;
    }

    /* JADX INFO: renamed from: ۖ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19106 m11756(Object obj) {
        return ((C24132) obj).m54021();
    }

    /* JADX INFO: renamed from: ۙ۟֫, reason: not valid java name and contains not printable characters */
    public static void m11759(Object obj) {
        ((AbstractActivityC17204) obj).m40393();
    }

    /* JADX INFO: renamed from: ۜۖ۠, reason: not valid java name and contains not printable characters */
    public static C8002 m11760(Object obj, Object obj2) {
        return ((C22941) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ۟۟ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m11761(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۠ۤ֨, reason: not valid java name and contains not printable characters */
    public static void m11762(Object obj, int i) {
        ((InterfaceC23332) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m11763(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۫ۗ᩶, reason: not valid java name and contains not printable characters */
    public static float m11764(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۬֫ۛ, reason: not valid java name and contains not printable characters */
    public static String m11765(int i) {
        return C21576.m49088(i);
    }

    /* JADX INFO: renamed from: ܰ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static Object m11766(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ܰۜ᩵, reason: not valid java name and contains not printable characters */
    public static Intent m11767(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ܶ۬ܰ, reason: not valid java name and contains not printable characters */
    public static ActivityC3409 m11768(Object obj) {
        return ((ComponentCallbacksC11612) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ᩶֡᩺, reason: not valid java name and contains not printable characters */
    public static String m11769(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸ᩴۡ, reason: not valid java name and contains not printable characters */
    public static String m11770(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ᩺᩶᩻, reason: not valid java name and contains not printable characters */
    public static C5408 m11771(Object obj, Object obj2) {
        return ((C5408) obj).m16121((C5408) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract double mo11772(double d);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11773(double d, double[] dArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11774(double d, float[] fArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract double[] mo11775();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract double mo11776(double d);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo11777(double d, double[] dArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3624 m11757(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C24508(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            C23762 c23762 = new C23762();
            c23762.f76997 = d;
            c23762.f76998 = dArr3;
            return c23762;
        }
        return new C6608(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3624 m11758(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C16302(iArr, dArr, dArr2);
    }
}
