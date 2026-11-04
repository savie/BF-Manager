package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18954 extends AbstractC10749 implements InterfaceC7767, Serializable, Cloneable, InterfaceC14375 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C1055.f3784;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C1055.f3784;
    }
}
