package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4771 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C4771 f16787 = new C4771();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f16788 = new LinkedHashMap(64, 0.75f, true);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16789;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16790;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C2884 m13240(int i) {
        if (i < 0 || i > 10485760) {
            return null;
        }
        m13239(i);
        int i2 = this.f16789;
        int i3 = this.f16790;
        if (i2 + i3 + i > 10485760) {
            return null;
        }
        this.f16790 = i3 + i;
        return new C2884(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9236 m13241(C1473 c1473) {
        C14175 c14175 = (C14175) this.f16788.get(c1473);
        if (c14175 == null) {
            return null;
        }
        c14175.f46525++;
        return new C9236(this, c14175);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9236 m13242(C1473 c1473, byte[] bArr, C2884 c2884) {
        C2884.m8675(c2884, bArr.length);
        C14175 c14175 = (C14175) this.f16788.get(c1473);
        if (c14175 != null) {
            if (bArr.length > c14175.f46524.length && c14175.f46525 == 0) {
                this.f16788.remove(c1473);
                this.f16789 -= c14175.f46524.length;
            }
            c14175.f46525++;
            return new C9236(this, c14175);
        }
        C14175 c14176 = new C14175(bArr);
        c14176.f46525 = 1;
        this.f16788.put(c1473, c14176);
        this.f16789 += bArr.length;
        return new C9236(this, c14176);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4771 m13236() {
        return f16787;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m13239(int i) {
        Iterator it = this.f16788.entrySet().iterator();
        while (this.f16789 + this.f16790 + i > 10485760 && it.hasNext()) {
            C14175 c14175 = (C14175) ((Map.Entry) it.next()).getValue();
            if (c14175.f46525 == 0) {
                this.f16789 -= c14175.f46524.length;
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13238(C4771 c4771, C2884 c2884) {
        synchronized (c4771) {
            if (c2884.f10869 > 0) {
                c4771.f16790 -= c2884.f10869;
                c2884.f10869 = 0;
            }
        }
    }
}
