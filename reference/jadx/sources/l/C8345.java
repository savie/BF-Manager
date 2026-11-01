package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8345 extends AbstractC2098 implements InterfaceC18928, Serializable, Cloneable, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC14800
    @Deprecated
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo21796(long j) {
        return false;
    }

    public final Object clone() {
        return C19634.f63036;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C19634.f63036;
    }
}
