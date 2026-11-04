package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7PB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5689 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C13477 f19649 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f19650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16709(C4747 c4747) {
        if (((C5689) c4747.m14643(f19649)) == null) {
            new C5689(c4747);
        }
    }

    public C5689(C4747 c4747) {
        c4747.m14646(f19649, this);
        C19991.m45972(c4747);
        C5992.m17420(c4747);
        C4483.m14186(c4747);
        Object[] objArr = {"H1", "H2", "H3", "H4", "H5", "H6", "PRE", "P"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        this.f19650 = C4681.unmodifiableSet(hashSet);
    }
}
