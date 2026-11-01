package l;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17596 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f55930;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f55929 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f55931 = Math.max(1L, X931RNG.BLOCK128_RESEED_MAX);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m40915(C6307 c6307) {
        return (Bitmap) this.f55929.get(c6307);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40917(C6307 c6307, Bitmap bitmap) {
        LinkedHashMap linkedHashMap = this.f55929;
        Bitmap bitmap2 = (Bitmap) linkedHashMap.put(c6307, bitmap);
        if (bitmap2 != null) {
            this.f55930 -= (long) Math.max(1, bitmap2.getAllocationByteCount());
        }
        this.f55930 += (long) Math.max(1, bitmap.getAllocationByteCount());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (this.f55930 > this.f55931 && it.hasNext()) {
            this.f55930 -= (long) Math.max(1, ((Bitmap) ((Map.Entry) it.next()).getValue()).getAllocationByteCount());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m40914(int i, int i2, long j) {
        LinkedHashMap linkedHashMap = this.f55929;
        long j2 = C17492.FOREVER_NS;
        C6307 c6307 = null;
        for (C6307 c6308 : linkedHashMap.keySet()) {
            if (c6308.f21331 == i && c6308.f21332 == i2) {
                long jAbs = Math.abs(c6308.f21330 - j);
                if (jAbs < j2 || (jAbs == j2 && c6307 != null && c6308.f21330 < c6307.f21330)) {
                    c6307 = c6308;
                    j2 = jAbs;
                }
            }
        }
        if (c6307 == null) {
            return null;
        }
        return (Bitmap) linkedHashMap.get(c6307);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40916() {
        this.f55929.clear();
        this.f55930 = 0L;
    }
}
