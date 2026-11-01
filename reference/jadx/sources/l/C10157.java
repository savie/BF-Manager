package l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q57Q */
/* JADX INFO: loaded from: classes3.dex */
public class C10157 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34670;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f34671;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34672;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f34673;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized LinkedHashMap m25802() {
        return new LinkedHashMap(this.f34673);
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo1601(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f34670;
        int i3 = this.f34669 + i2;
        i = i3 != 0 ? (i2 * 100) / i3 : 0;
        Locale locale = Locale.US;
        return "LruCache[maxSize=" + this.f34672 + ",hits=" + this.f34670 + ",misses=" + this.f34669 + ",hitRate=" + i + "%]";
    }

    public C10157(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f34672 = i;
        this.f34673 = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m25800(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f34673.get(obj);
            if (obj2 != null) {
                this.f34670++;
                return obj2;
            }
            this.f34669++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m25801(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f34671 += m25799(obj, obj2);
            objPut = this.f34673.put(obj, obj2);
            if (objPut != null) {
                this.f34671 -= m25799(obj, objPut);
            }
        }
        m25803(this.f34672);
        return objPut;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25803(int i) {
        while (true) {
            synchronized (this) {
                if (this.f34671 < 0 || (this.f34673.isEmpty() && this.f34671 != 0)) {
                    break;
                }
                if (this.f34671 > i && !this.f34673.isEmpty()) {
                    Map.Entry entry = (Map.Entry) this.f34673.entrySet().iterator().next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    this.f34673.remove(key);
                    this.f34671 -= m25799(key, value);
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25804(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object objRemove = this.f34673.remove(obj);
            if (objRemove != null) {
                this.f34671 -= m25799(obj, objRemove);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m25799(Object obj, Object obj2) {
        int iMo1601 = mo1601(obj, obj2);
        if (iMo1601 >= 0) {
            return iMo1601;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }
}
