package l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9521 extends C0573 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19218 f30844 = new C19218();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19218 f30843 = new C19218();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m24914(C19218 c19218, int i) {
        C10267 c10267;
        Object obj;
        if (i < 32768) {
            return null;
        }
        synchronized (c19218) {
            c10267 = (C10267) c19218.get(Integer.valueOf(i));
        }
        if (c10267 == null) {
            return null;
        }
        do {
            Reference reference = (Reference) c10267.m26474();
            if (reference == null) {
                return null;
            }
            obj = reference.get();
        } while (obj == null);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24915(C19218 c19218, Object obj, int i) {
        C10267 c10267;
        if (i < 32768) {
            return;
        }
        synchronized (c19218) {
            c10267 = (C10267) c19218.get(Integer.valueOf(i));
            if (c10267 == null) {
                c10267 = new C10267(0);
                c19218.put(Integer.valueOf(i), c10267);
            }
        }
        c10267.m26475(new SoftReference(obj));
    }

    @Override // l.C0573
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2594(int i) {
        byte[] bArr = (byte[]) m24914(this.f30844, i);
        return bArr == null ? new byte[i] : bArr;
    }

    @Override // l.C0573
    /* JADX INFO: renamed from: ۙ */
    public final void mo2592(byte[] bArr) {
        m24915(this.f30844, bArr, bArr.length);
    }

    @Override // l.C0573
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo2595(int i, boolean z) {
        int[] iArr = (int[]) m24914(this.f30843, i);
        if (iArr == null) {
            return new int[i];
        }
        if (z) {
            Arrays.fill(iArr, 0);
        }
        return iArr;
    }

    @Override // l.C0573
    /* JADX INFO: renamed from: ۙ */
    public final void mo2593(int[] iArr) {
        m24915(this.f30843, iArr, iArr.length);
    }
}
