package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q57Q */
/* JADX INFO: loaded from: classes2.dex */
public class C0884 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3286;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13561 f3287;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f3288;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f3289;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12295 f3290;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3291;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo3592(Object obj, Object obj2) {
        C15243.m36590(obj, "key");
        C15243.m36590(obj2, b.d);
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m3588(Object obj) {
        C15243.m36590(obj, "key");
        synchronized (this.f3290) {
            Object objM33270 = this.f3287.m33270(obj);
            if (objM33270 != null) {
                this.f3286++;
                return objM33270;
            }
            this.f3289++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m3589(Object obj, Object obj2) {
        Object objM33271;
        C15243.m36590(obj, "key");
        C15243.m36590(obj2, b.d);
        synchronized (this.f3290) {
            this.f3288 += m3587(obj, obj2);
            objM33271 = this.f3287.m33271(obj, obj2);
            if (objM33271 != null) {
                this.f3288 -= m3587(obj, objM33271);
            }
            C11471 c11471 = C11471.f36082;
        }
        m3591(this.f3291);
        return objM33271;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3593(Object obj) {
        C15243.m36590(obj, "key");
        synchronized (this.f3290) {
            Object objM33273 = this.f3287.m33273(obj);
            if (objM33273 != null) {
                this.f3288 -= m3587(obj, objM33273);
            }
            C11471 c11471 = C11471.f36082;
        }
    }

    public C0884(int i) {
        this.f3291 = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3287 = new C13561();
        this.f3290 = new C12295();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3591(int i) {
        Object next;
        Object value;
        while (true) {
            synchronized (this.f3290) {
                if (this.f3288 < 0 || (this.f3287.m33274() && this.f3288 != 0)) {
                    break;
                }
                if (this.f3288 > i && !this.f3287.m33274()) {
                    Set setM33272 = this.f3287.m33272();
                    if (setM33272 instanceof List) {
                        List list = (List) setM33272;
                        next = list.isEmpty() ? null : list.get(0);
                    } else {
                        Iterator it = setM33272.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return;
                    }
                    Object key = entry.getKey();
                    value = entry.getValue();
                    this.f3287.m33273(key);
                    this.f3288 -= m3587(key, value);
                }
                return;
            }
            C15243.m36590(value, "oldValue");
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final int m3587(Object obj, Object obj2) {
        int iMo3592 = mo3592(obj, obj2);
        if (iMo3592 >= 0) {
            return iMo3592;
        }
        throw new IllegalStateException(("Negative size: " + obj + a.h + obj2).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m3590() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f3290) {
            for (Map.Entry entry : this.f3287.m33272()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            C11471 c11471 = C11471.f36082;
        }
        return linkedHashMap;
    }

    public final String toString() {
        String str;
        synchronized (this.f3290) {
            int i = this.f3286;
            int i2 = this.f3289 + i;
            str = "LruCache[maxSize=" + this.f3291 + ",hits=" + this.f3286 + ",misses=" + this.f3289 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
