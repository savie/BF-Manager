package l;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۜۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6964 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f22989;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f22988 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f22990 = Math.max(1L, X931RNG.BLOCK128_RESEED_MAX);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m19268(C13675 c13675) {
        return (Bitmap) this.f22988.get(c13675);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19270(C13675 c13675, Bitmap bitmap) {
        LinkedHashMap linkedHashMap = this.f22988;
        Bitmap bitmap2 = (Bitmap) linkedHashMap.put(c13675, bitmap);
        if (bitmap2 != null) {
            this.f22989 -= (long) Math.max(1, bitmap2.getAllocationByteCount());
        }
        this.f22989 += (long) Math.max(1, bitmap.getAllocationByteCount());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (this.f22989 > this.f22990 && it.hasNext()) {
            this.f22989 -= (long) Math.max(1, ((Bitmap) ((Map.Entry) it.next()).getValue()).getAllocationByteCount());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m19267(int i, int i2, long j) {
        LinkedHashMap linkedHashMap = this.f22988;
        long j2 = C25227.FOREVER_NS;
        C13675 c13675 = null;
        for (C13675 c13676 : linkedHashMap.keySet()) {
            if (c13676.f43412 == i && c13676.f43413 == i2) {
                long jAbs = Math.abs(c13676.f43411 - j);
                if (jAbs < j2 || (jAbs == j2 && c13675 != null && c13676.f43411 < c13675.f43411)) {
                    c13675 = c13676;
                    j2 = jAbs;
                }
            }
        }
        if (c13675 == null) {
            return null;
        }
        return (Bitmap) linkedHashMap.get(c13675);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19269() {
        this.f22988.clear();
        this.f22989 = 0L;
    }
}
