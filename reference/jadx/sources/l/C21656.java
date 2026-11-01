package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f70205 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f70206;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15307 m48363(Object obj) {
        return (C15307) this.f70205.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15307 m48364(Object obj, int[] iArr, long j) {
        this.f70206 += iArr.length;
        IdentityHashMap identityHashMap = this.f70205;
        if (identityHashMap.size() >= 4096 || this.f70206 > 65536) {
            throw new IllegalStateException("Speculative syntax history budget exceeded");
        }
        C15307 c15307 = new C15307(iArr, j);
        identityHashMap.put(obj, c15307);
        return c15307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m48362() {
        IdentityHashMap identityHashMap = this.f70205;
        Collection collectionValues = identityHashMap.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        for (Object obj : collectionValues) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C0561.unmodifiableList(arrayList);
        identityHashMap.clear();
        this.f70206 = 0;
        return listUnmodifiableList;
    }
}
