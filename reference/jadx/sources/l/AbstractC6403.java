package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6403 extends AbstractC16294 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient AbstractC17589 f21604;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final transient int f21605;

    public AbstractC6403(AbstractC17589 abstractC17589, int i) {
        this.f21604 = abstractC17589;
        this.f21605 = i;
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17039(Object obj) {
        return obj != null && super.mo17039(obj);
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ۤ */
    public final Set mo17040() {
        throw new AssertionError("unreachable");
    }

    @Override // l.AbstractC5854, l.InterfaceC23229
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17589 mo17038() {
        return this.f21604;
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ᩷ */
    public final Map mo17042() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC5854
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo17043() {
        return new C12368(this);
    }
}
