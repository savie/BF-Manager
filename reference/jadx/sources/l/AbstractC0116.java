package l;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0116 {

    /* JADX INFO: renamed from: ۫ۙ᩶, reason: not valid java name and contains not printable characters */
    public static int f1064;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1065;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f1066;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f1067;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f1068;

    /* JADX INFO: renamed from: ֨ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1230(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ֨ۤ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m1231(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۙۖ۟, reason: not valid java name and contains not printable characters */
    public static Intent m1232(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ۜۤۘ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19106 m1233(Object obj) {
        return ((C24132) obj).m54021();
    }

    /* JADX INFO: renamed from: ۟֡᩹, reason: not valid java name and contains not printable characters */
    public static ActivityC3409 m1234(Object obj) {
        return ((ComponentCallbacksC11612) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۢ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static float m1235(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ܰᩴۢ, reason: not valid java name and contains not printable characters */
    public static String m1236(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܳ᩶᩷, reason: not valid java name and contains not printable characters */
    public static String m1237(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ܶܺۡ, reason: not valid java name and contains not printable characters */
    public static void m1238(Object obj) {
        ((AbstractActivityC17204) obj).m40393();
    }

    /* JADX INFO: renamed from: ܺ᩸ۗ, reason: not valid java name and contains not printable characters */
    public static C8002 m1239(Object obj, Object obj2) {
        return ((C22941) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ܿۙܺ, reason: not valid java name and contains not printable characters */
    public static C14955 m1240(Object obj) {
        return C14955.m35973((InputStream) obj);
    }

    /* JADX INFO: renamed from: ܿᩴ᩻, reason: not valid java name and contains not printable characters */
    public static void m1241(Object obj, int i) {
        ((InterfaceC23332) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ᩴ᩺ۨ, reason: not valid java name and contains not printable characters */
    public static Object m1242(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ᩹ۛۧ, reason: not valid java name and contains not printable characters */
    public static int m1243() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩺ۙܺ, reason: not valid java name and contains not printable characters */
    public static String m1244(int i) {
        return C21576.m49088(i);
    }

    /* JADX INFO: renamed from: ᩺᩵֨, reason: not valid java name and contains not printable characters */
    public static C5408 m1245(Object obj, Object obj2) {
        return ((C5408) obj).m16121((C5408) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo1246(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo1247(View view, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo1248(Object obj, Object obj2);

    public AbstractC0116(int i, int i2, int i3, Class cls) {
        this.f1066 = i;
        this.f1068 = cls;
        this.f1065 = i2;
        this.f1067 = i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m1249(View view) {
        if (Build.VERSION.SDK_INT >= this.f1067) {
            return mo1246(view);
        }
        Object tag = view.getTag(this.f1066);
        if (this.f1068.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1250(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f1067) {
            mo1247(view, obj);
            return;
        }
        if (mo1248(m1249(view), obj)) {
            C22687 c22687M51119 = C22666.m51119(view);
            if (c22687M51119 == null) {
                c22687M51119 = new C22687();
            }
            C22666.m51098(view, c22687M51119);
            view.setTag(this.f1066, obj);
            C22666.m51086(this.f1065, view);
        }
    }
}
