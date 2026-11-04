package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5578 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C5578 f19383 = new C5578();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f19384 = new LinkedHashMap(64, 0.75f, true);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19385;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19386;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13035 m16543(int i) {
        if (i < 0 || i > 10485760) {
            return null;
        }
        m16542(i);
        int i2 = this.f19385;
        int i3 = this.f19386;
        if (i2 + i3 + i > 10485760) {
            return null;
        }
        this.f19386 = i3 + i;
        return new C13035(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C15272 m16544(C19748 c19748) {
        C22732 c22732 = (C22732) this.f19384.get(c19748);
        if (c22732 == null) {
            return null;
        }
        c22732.f73775++;
        return new C15272(this, c22732);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C15272 m16545(C19748 c19748, byte[] bArr, C13035 c13035) {
        C13035.m32457(c13035, bArr.length);
        C22732 c22732 = (C22732) this.f19384.get(c19748);
        if (c22732 != null) {
            if (bArr.length > c22732.f73774.length && c22732.f73775 == 0) {
                this.f19384.remove(c19748);
                this.f19385 -= c22732.f73774.length;
            }
            c22732.f73775++;
            return new C15272(this, c22732);
        }
        C22732 c22733 = new C22732(bArr);
        c22733.f73775 = 1;
        this.f19384.put(c19748, c22733);
        this.f19385 += bArr.length;
        return new C15272(this, c22733);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5578 m16539() {
        return f19383;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16542(int i) {
        Iterator it = this.f19384.entrySet().iterator();
        while (this.f19385 + this.f19386 + i > 10485760 && it.hasNext()) {
            C22732 c22732 = (C22732) ((Map.Entry) it.next()).getValue();
            if (c22732.f73775 == 0) {
                this.f19385 -= c22732.f73774.length;
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16541(C5578 c5578, C13035 c13035) {
        synchronized (c5578) {
            if (c13035.f41720 > 0) {
                c5578.f19386 -= c13035.f41720;
                c13035.f41720 = 0;
            }
        }
    }
}
