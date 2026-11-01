package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S */
/* JADX INFO: loaded from: classes3.dex */
public final class C2950 extends AbstractC11418 implements InterfaceC9302, Serializable, Cloneable, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C4444.f15833;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C4444.f15833;
    }
}
