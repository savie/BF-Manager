package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18998 extends AbstractC1845 implements InterfaceC7811, Serializable, Cloneable, InterfaceC14375 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC5574
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16517(long j) {
        return false;
    }

    public final Object clone() {
        return C10047.f32224;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C10047.f32224;
    }
}
