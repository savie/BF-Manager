package l;

import android.text.TextUtils;
import android.view.View;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0195 implements Runnable {

    /* JADX INFO: renamed from: ۢܰ᩸, reason: not valid java name and contains not printable characters */
    public static int f1321;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC16424 f1322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f1323;

    public /* synthetic */ RunnableC0195(ExecutorC16424 executorC16424, Runnable runnable) {
        this.f1322 = executorC16424;
        this.f1323 = runnable;
    }

    /* JADX INFO: renamed from: ֫᩶ܰ, reason: not valid java name and contains not printable characters */
    public static void m1428(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* JADX INFO: renamed from: ۖ᩶ܿ, reason: not valid java name and contains not printable characters */
    public static String m1429(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۘۨ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m1430(Object obj, Object obj2) {
        return ((AbstractC17902) obj).m41573((String) obj2);
    }

    /* JADX INFO: renamed from: ۟ۚ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1431() {
        return true;
    }

    /* JADX INFO: renamed from: ۠ܳ۬, reason: not valid java name and contains not printable characters */
    public static boolean m1432(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ۡ᩺۠, reason: not valid java name and contains not printable characters */
    public static String m1433(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC6025) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢۧ۬, reason: not valid java name and contains not printable characters */
    public static boolean m1434(Object obj) {
        return ((C12107) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ۢܽᩴ, reason: not valid java name and contains not printable characters */
    public static Object m1435(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ۬֡ۜ, reason: not valid java name and contains not printable characters */
    public static View m1436(Object obj, int i) {
        return ((AbstractActivityC12483) obj).m31016(i);
    }

    /* JADX INFO: renamed from: ۬ۙۡ, reason: not valid java name and contains not printable characters */
    public static String m1437(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۬ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1438(Object obj) {
        return C18810.m43407((String) obj);
    }

    /* JADX INFO: renamed from: ܺۙܺ, reason: not valid java name and contains not printable characters */
    public static InputStream m1439(Object obj, Object obj2) {
        return ((C2455) obj).m7471((C12107) obj2);
    }

    /* JADX INFO: renamed from: ᩳ۠ۗ, reason: not valid java name and contains not printable characters */
    public static EnumC10297 m1440(Object obj) {
        return ((InterfaceC1594) obj).mo5435();
    }

    /* JADX INFO: renamed from: ᩷֡֫, reason: not valid java name and contains not printable characters */
    public static String m1441(Object obj) {
        return C22253.m49424((byte[]) obj);
    }

    /* JADX INFO: renamed from: ᩺ܿ᩸, reason: not valid java name and contains not printable characters */
    public static void m1442(Object obj) {
        ((AbstractC3492) obj).m10243();
    }

    /* JADX INFO: renamed from: ᩻ᩳۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1443(Object obj) {
        return ((DialogInterfaceC19356) obj).m44375();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f1323;
        ExecutorC16424 executorC16424 = this.f1322;
        executorC16424.getClass();
        try {
            runnable.run();
        } finally {
            executorC16424.m38678();
        }
    }
}
