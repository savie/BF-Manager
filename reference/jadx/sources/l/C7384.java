package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7384 implements InterfaceC0059 {
    @Override // l.InterfaceC0059
    /* JADX INFO: renamed from: ۙ */
    public final Set mo978() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'`'}[0];
        C17359.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C4681.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
    }

    @Override // l.InterfaceC0059
    public final InterfaceC17958 create() {
        return new C14095();
    }
}
