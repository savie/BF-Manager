package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8077 extends AbstractC16853 implements InterfaceC18660, Serializable, Cloneable, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C8783.f30203;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C8783.f30203;
    }
}
