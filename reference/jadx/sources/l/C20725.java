package l;

import android.os.PowerManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩷۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20725 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C9186 f67441;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f67442;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67443 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f67444;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f67445;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final PowerManager.WakeLock f67446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Iterable f67447;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f67444 = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        f67445 = copyOnWriteArrayList2;
        Iterable iterableM50465 = C22808.m50465(copyOnWriteArrayList, copyOnWriteArrayList2);
        f67447 = iterableM50465;
        f67441 = new C9186(iterableM50465);
        f67442 = C0561.synchronizedSet(new HashSet());
        PowerManager powerManager = (PowerManager) C16737.m39277().getSystemService("power");
        if (powerManager == null) {
            f67446 = null;
        } else {
            f67446 = powerManager.newWakeLock(1, C16737.m39293().concat(":Task"));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C9186 m46654() {
        return f67441;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static int m46649() {
        return f67444.size();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m46647() {
        return f67445.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m46656(AbstractC17902 abstractC17902) {
        return f67445.remove(abstractC17902);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m46661() {
        f67445.clear();
        f67441.mo23642(f67447);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17902 m46651(int i) {
        if (i <= 0) {
            return null;
        }
        for (AbstractC17902 abstractC17902 : f67444) {
            if (abstractC17902.m41563() == i) {
                return abstractC17902;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC17902 m46657() {
        for (AbstractC17902 abstractC17902 : f67444) {
            if (C1192.class.isInstance(abstractC17902)) {
                return abstractC17902;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m46660() {
        f67444.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46652(AbstractC17902 abstractC17902) {
        if (!abstractC17902.m41588()) {
            throw new IllegalStateException("Task is not finished.");
        }
        f67445.add(0, abstractC17902.m41561());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m46659(AbstractC17902 abstractC17902) {
        f67442.remove(Integer.valueOf(abstractC17902.m41563()));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m46662() {
        return !f67442.isEmpty();
    }
}
