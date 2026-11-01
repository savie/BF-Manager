package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7PB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3416 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C16576 f12610 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f12611;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10130(C12343 c12343) {
        if (((C3416) c12343.m30656(f12610)) == null) {
            new C3416(c12343);
        }
    }

    public C3416(C12343 c12343) {
        c12343.m30659(f12610, this);
        C23549.m51906(c12343);
        C23966.m52792(c12343);
        C15392.m36825(c12343);
        Object[] objArr = {"H1", "H2", "H3", "H4", "H5", "H6", "PRE", "P"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        this.f12611 = C0561.unmodifiableSet(hashSet);
    }
}
