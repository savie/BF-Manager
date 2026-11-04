package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAN */
/* JADX INFO: loaded from: classes3.dex */
public final class C2152 extends AbstractC5378 implements InterfaceC5881, Serializable, Cloneable, InterfaceC14375 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C25273.f81633;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C25273.f81633;
    }
}
