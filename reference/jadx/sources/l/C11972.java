package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.c;
import com.google.android.material.motion.MotionUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11972 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30015(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30018(Context context) {
        if (!C18450.f60066) {
            throw new RuntimeException("SDK Need Init First!");
        }
        C19196 c19196 = C8009.f26612;
        Context applicationContext = context.getApplicationContext();
        synchronized (c19196) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (c19196.f62071 != null) {
                try {
                    return c19196.m44466(applicationContext);
                } catch (RemoteException unused) {
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (applicationContext.bindService(intent, c19196.f62073, 1)) {
                synchronized (c19196.f62075) {
                    try {
                        c19196.f62075.wait(c.a);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            if (c19196.f62071 == null) {
                return "";
            }
            try {
                return c19196.m44466(applicationContext);
            } catch (RemoteException unused3) {
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m30017(ViewGroup viewGroup, float f, float f2) {
        View viewM30017;
        float scrollX = f + viewGroup.getScrollX();
        float scrollY = f2 + viewGroup.getScrollY();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (scrollX >= left && scrollX <= right && scrollY >= top && scrollY <= bottom) {
                return (!(childAt instanceof ViewGroup) || (viewM30017 = m30017((ViewGroup) childAt, scrollX - ((float) childAt.getLeft()), scrollY - ((float) childAt.getTop()))) == null) ? childAt : viewM30017;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30028(String str) {
        if (!"code".equals(str) && !e.m.equals(str) && !"both".equals(str)) {
            throw new IllegalArgumentException("Invalid scanKind");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30020(int i, String str) {
        m30028(str);
        C9225.m24407(i);
        if (e.m.equals(str)) {
            if (i != 4) {
                throw new IllegalArgumentException("scanKind=data requires referenceKinds=[data]");
            }
        } else if ("both".equals(str) && (i & 4) == 0) {
            throw new IllegalArgumentException("scanKind=both requires referenceKinds containing data");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30026(boolean z) {
        if (z) {
            return;
        }
        m30019();
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30030(Object obj) {
        if (obj == null) {
            return;
        }
        m30019();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30021(Object obj) {
        if (obj != null) {
            return;
        }
        m30019();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30023(Object obj, boolean z) {
        if (z) {
            return;
        }
        m30024(String.valueOf(obj));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30025(String str, boolean z) {
        if (z) {
            return;
        }
        m30024(str);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30027(boolean z, Supplier supplier) {
        if (z) {
            return;
        }
        m30024((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30022(Object obj, Supplier supplier) {
        if (obj != null) {
            return;
        }
        m30024((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30019() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30024(String str) {
        throw new AssertionError(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m30016(long j) {
        return 1 << (64 - Long.numberOfLeadingZeros(j - 1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m30029(float f, int i) {
        return Math.min((int) Math.ceil(((double) i) * ((double) f)), i - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30014(float f, int i) {
        long jMax = Math.max(2L, m30016((long) Math.ceil(((double) i) / ((double) f))));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new IllegalArgumentException("Too large (" + i + " expected elements with load factor " + f + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30031(String str) {
        C16121 c16121 = C19580.f63138;
        Set<InterfaceC18359> setM54376 = AbstractC24327.m54376();
        HashSet hashSet = new HashSet();
        for (InterfaceC18359 interfaceC18359 : setM54376) {
            if (interfaceC18359.mo42814().equals(str)) {
                hashSet.add(interfaceC18359);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC18359) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
