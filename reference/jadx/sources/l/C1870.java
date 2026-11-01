package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1870 extends AbstractC14303 implements InterfaceC14572, Serializable, Cloneable, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C3281.f12166;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C3281.f12166;
    }
}
