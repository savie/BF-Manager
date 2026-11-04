package l;

import android.os.SystemClock;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۤۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56BZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10801 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f34268;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34272;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34274;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9732 f34277;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C10801 f34267 = new C10801(new C9732());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f34266 = new ThreadLocal();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f34270 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f34269 = new TreeMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TreeMap f34275 = new TreeMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f34278 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17930 f34271 = new C17930();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f34273 = 500;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34276 = 2097152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7402 m27527(JSONObject jSONObject, String str) {
        C7402 c7402;
        long j = 1 + this.f34272;
        this.f34272 = j;
        this.f34277.getClass();
        c7402 = new C7402(this, j, str, jSONObject, SystemClock.elapsedRealtime());
        this.f34269.put(Long.valueOf(c7402.f24394), c7402);
        f34266.set(c7402);
        m27520();
        return c7402;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m27530() {
        if (this.f34275.isEmpty()) {
            return;
        }
        this.f34275.clear();
        this.f34274 = 0;
        m27520();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m27531() {
        TreeMap treeMap;
        treeMap = new TreeMap((SortedMap) this.f34275);
        for (C7402 c7402 : this.f34269.values()) {
            treeMap.put(Long.valueOf(c7402.f24394), new C14113(c7402));
        }
        return new ArrayList(treeMap.descendingMap().values());
    }

    public C10801(C9732 c9732) {
        this.f34277 = c9732;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C10801 m27518() {
        return f34267;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m27529() {
        return this.f34270;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 m27528() {
        return this.f34271;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m27520() {
        long j = this.f34268 + 1;
        this.f34268 = j;
        this.f34271.mo40348(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27511(ReentrantLock reentrantLock) {
        boolean z = false;
        while (true) {
            try {
                try {
                    break;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (!reentrantLock.tryLock(0L, TimeUnit.NANOSECONDS)) {
            C21990 c21990M27505 = m27505();
            try {
                reentrantLock.lock();
                c21990M27505.close();
                if (!z) {
                    return;
                }
            } catch (Throwable th2) {
                try {
                    c21990M27505.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27510(Semaphore semaphore) {
        if (semaphore.tryAcquire(0L, TimeUnit.NANOSECONDS)) {
            return;
        }
        C21990 c21990M27505 = m27505();
        try {
            semaphore.acquire();
            c21990M27505.close();
        } catch (Throwable th) {
            try {
                c21990M27505.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21990 m27505() {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 != null) {
            synchronized (c7402.f24389) {
                if (!c7402.f24399) {
                    int i = c7402.f24387;
                    c7402.f24387 = i + 1;
                    if (i == 0) {
                        c7402.f24397 = EnumC4836.WAITING;
                        c7402.f24389.f34277.getClass();
                        c7402.f24393 = SystemClock.elapsedRealtime();
                        c7402.f24389.m27520();
                    }
                }
            }
        }
        return new C21990(c7402);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27525(String str) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null || !c7402.f24403.equals("mt_apk_continue")) {
            return;
        }
        synchronized (c7402.f24389) {
            int iM20122 = C7336.m20122(str);
            if (!c7402.f24399 && iM20122 != 0 && c7402.f24396 != iM20122) {
                c7402.f24396 = iM20122;
                c7402.f24389.m27520();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27524(JSONObject jSONObject, String str) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null || !c7402.f24403.equals("mt_apk_continue")) {
            return;
        }
        synchronized (c7402.f24389) {
            if (!c7402.f24399) {
                c7402.f24396 = C7336.m20126(jSONObject, str);
                c7402.f24398 = C7336.m20128(jSONObject, str);
                c7402.f24401 = C7336.m20124(jSONObject, str);
                c7402.f24389.m27520();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27508(String str, String str2) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null || !c7402.f24403.equals("mt_apk_resource_delete") || str.isEmpty()) {
            return;
        }
        synchronized (c7402.f24389) {
            if (!c7402.f24399) {
                c7402.f24398 = C7336.m20115(str, str2);
                c7402.f24389.m27520();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27507(String str) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null || !c7402.f24403.equals("mt_apk_build") || str.isEmpty()) {
            return;
        }
        String strM42088 = C18063.m42088(47, 1, str);
        if (strM42088.isEmpty()) {
            return;
        }
        synchronized (c7402.f24389) {
            if (!c7402.f24399) {
                c7402.f24398 = C4967.m15164(512, strM42088);
                c7402.f24402 = true;
                c7402.f24389.m27520();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27516(String str) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null || !c7402.f24403.equals("mt_apk_install")) {
            return;
        }
        synchronized (c7402.f24389) {
            if (!c7402.f24399) {
                JSONObject jSONObjectAdd = new JSONObject().add(MotionUtils.EASING_TYPE_PATH, str);
                c7402.f24398 = C7336.m20128(jSONObjectAdd, c7402.f24403);
                c7402.f24401 = C7336.m20124(jSONObjectAdd, c7402.f24403);
                c7402.f24389.m27520();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m27514() {
        boolean z;
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null) {
            return false;
        }
        synchronized (c7402.f24389) {
            String str = c7402.f24388;
            z = str == null || str.isEmpty();
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27509(String str, String str2, String str3) {
        C7402 c7402 = (C7402) f34266.get();
        if (c7402 == null) {
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = str3;
        }
        String strM15164 = C4967.m15164(256, str2);
        synchronized (c7402.f24389) {
            c7402.f24389.f34278.put(str, strM15164);
            while (c7402.f24389.f34278.size() > 500) {
                LinkedHashMap linkedHashMap = c7402.f24389.f34278;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            c7402.m20316(strM15164, str3);
            for (C7402 c7403 : c7402.f24389.f34269.values()) {
                if (str.equals(c7403.f24404)) {
                    c7403.m20316(strM15164, str3);
                }
            }
            c7402.f24389.m27520();
        }
    }
}
