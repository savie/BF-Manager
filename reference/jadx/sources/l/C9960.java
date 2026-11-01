package l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9960 extends C17720 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7843 f34033 = new C7843();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7843 f34032 = new C7843();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m25179(C7843 c7843, int i) {
        C19132 c19132;
        Object obj;
        if (i < 32768) {
            return null;
        }
        synchronized (c7843) {
            c19132 = (C19132) c7843.get(Integer.valueOf(i));
        }
        if (c19132 == null) {
            return null;
        }
        do {
            Reference reference = (Reference) c19132.m43952();
            if (reference == null) {
                return null;
            }
            obj = reference.get();
        } while (obj == null);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25180(C7843 c7843, Object obj, int i) {
        C19132 c19132;
        if (i < 32768) {
            return;
        }
        synchronized (c7843) {
            c19132 = (C19132) c7843.get(Integer.valueOf(i));
            if (c19132 == null) {
                c19132 = new C19132(0);
                c7843.put(Integer.valueOf(i), c19132);
            }
        }
        c19132.m43953(new SoftReference(obj));
    }

    @Override // l.C17720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo25183(int i) {
        byte[] bArr = (byte[]) m25179(this.f34033, i);
        return bArr == null ? new byte[i] : bArr;
    }

    @Override // l.C17720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25181(byte[] bArr) {
        m25180(this.f34033, bArr, bArr.length);
    }

    @Override // l.C17720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] mo25184(int i, boolean z) {
        int[] iArr = (int[]) m25179(this.f34032, i);
        if (iArr == null) {
            return new int[i];
        }
        if (z) {
            Arrays.fill(iArr, 0);
        }
        return iArr;
    }

    @Override // l.C17720
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25182(int[] iArr) {
        m25180(this.f34032, iArr, iArr.length);
    }
}
