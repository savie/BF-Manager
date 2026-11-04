package l;

/* JADX INFO: renamed from: l.۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8341 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f27335 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object m22449(C2375 c2375, int i) {
        Object obj;
        C15243.m36590(c2375, "<this>");
        int iM19064 = C6850.m19064(c2375.f7644, i, c2375.f7645);
        if (iM19064 < 0 || (obj = c2375.f7642[iM19064]) == f27335) {
            return 0;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m22446(C2375 c2375, int i) {
        Object obj;
        C15243.m36590(c2375, "<this>");
        int iM19064 = C6850.m19064(c2375.f7644, i, c2375.f7645);
        if (iM19064 < 0 || (obj = c2375.f7642[iM19064]) == f27335) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m22448(C2375 c2375, int i) {
        C15243.m36590(c2375, "<this>");
        int iM19064 = C6850.m19064(c2375.f7644, i, c2375.f7645);
        if (iM19064 >= 0) {
            Object[] objArr = c2375.f7642;
            Object obj = objArr[iM19064];
            Object obj2 = f27335;
            if (obj != obj2) {
                objArr[iM19064] = obj2;
                c2375.f7643 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m22447(C2375 c2375) {
        int i = c2375.f7644;
        int[] iArr = c2375.f7645;
        Object[] objArr = c2375.f7642;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f27335) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c2375.f7643 = false;
        c2375.f7644 = i2;
    }
}
