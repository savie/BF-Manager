package l;

import android.os.PowerManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۬ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43415 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f43416;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C17930 f43417;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Iterable f43418;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f43419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final PowerManager.WakeLock f43420;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Set f43421;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f43419 = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        f43416 = copyOnWriteArrayList2;
        Iterable iterableM39329 = C16625.m39329(copyOnWriteArrayList, copyOnWriteArrayList2);
        f43418 = iterableM39329;
        f43417 = new C17930(iterableM39329);
        f43421 = C4681.synchronizedSet(new HashSet());
        PowerManager powerManager = (PowerManager) C21576.m49084().getSystemService("power");
        if (powerManager == null) {
            f43420 = null;
        } else {
            f43420 = powerManager.newWakeLock(1, C21576.m49092().concat(":Task"));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17930 m33462() {
        return f43417;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33455() {
        return f43419.size();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m33463() {
        return f43416.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m33461(AbstractC18900 abstractC18900) {
        return f43416.remove(abstractC18900);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m33464() {
        f43416.clear();
        f43417.mo40353(f43418);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC18900 m33457(int i) {
        if (i <= 0) {
            return null;
        }
        for (AbstractC18900 abstractC18900 : f43419) {
            if (abstractC18900.m43844() == i) {
                return abstractC18900;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC18900 m33459() {
        for (AbstractC18900 abstractC18900 : f43419) {
            if (C1322.class.isInstance(abstractC18900)) {
                return abstractC18900;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m33465() {
        f43419.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33458(AbstractC18900 abstractC18900) {
        if (!abstractC18900.m43861()) {
            throw new IllegalStateException("Task is not finished.");
        }
        f43416.add(0, abstractC18900.m43858());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33468(AbstractC18900 abstractC18900) {
        f43421.remove(Integer.valueOf(abstractC18900.m43844()));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m33470() {
        return !f43421.isEmpty();
    }
}
