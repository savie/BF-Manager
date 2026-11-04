package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13991 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f44344 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44345;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7280 m34080(Object obj) {
        return (C7280) this.f44344.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7280 m34081(Object obj, int[] iArr, long j) {
        this.f44345 += iArr.length;
        IdentityHashMap identityHashMap = this.f44344;
        if (identityHashMap.size() >= 4096 || this.f44345 > 65536) {
            throw new IllegalStateException("Speculative syntax history budget exceeded");
        }
        C7280 c7280 = new C7280(iArr, j);
        identityHashMap.put(obj, c7280);
        return c7280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m34079() {
        IdentityHashMap identityHashMap = this.f44344;
        Collection collectionValues = identityHashMap.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        for (Object obj : collectionValues) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C4681.unmodifiableList(arrayList);
        identityHashMap.clear();
        this.f44345 = 0;
        return listUnmodifiableList;
    }
}
