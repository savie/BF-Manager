package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19611 extends AbstractC15358 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f62962;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC6910 f62963;

    @Override // l.InterfaceC19425
    public abstract AbstractC1826 get(Object obj);

    public AbstractC19611(AbstractC6910 abstractC6910, int i) {
        this.f62963 = abstractC6910;
        this.f62962 = i;
    }

    @Override // l.InterfaceC19425
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo44700(Object obj) {
        return obj != null && super.mo44700(obj);
    }

    @Override // l.InterfaceC19425
    public final int size() {
        return this.f62962;
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ۨ */
    public final Set mo29511() {
        throw new AssertionError("unreachable");
    }

    @Override // l.AbstractC22413, l.InterfaceC19425
    /* JADX INFO: renamed from: ۙ */
    public AbstractC6910 mo44465() {
        return this.f62963;
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ܰ */
    public final Map mo29513() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC22413
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo29508() {
        return new C8322(this);
    }
}
