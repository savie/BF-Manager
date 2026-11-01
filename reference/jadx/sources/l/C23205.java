package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 37TO */
/* JADX INFO: loaded from: classes.dex */
public final class C23205 implements InterfaceC22230 {
    @Override // l.InterfaceC22230
    /* JADX INFO: renamed from: ۙ */
    public final Set mo26660() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'<'}[0];
        C13638.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C0561.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
    }

    @Override // l.InterfaceC22230
    public final InterfaceC5296 create() {
        return new C15444();
    }
}
