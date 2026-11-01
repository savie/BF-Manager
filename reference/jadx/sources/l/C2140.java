package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C2140 extends AbstractC7308 implements InterfaceC14842, Serializable, Cloneable, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C3551.f13068;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C3551.f13068;
    }
}
