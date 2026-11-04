package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12896 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparator f41245;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object[] f41246;

    public C12896(Comparator comparator, Object[] objArr) {
        this.f41245 = comparator;
        this.f41246 = objArr;
    }

    public Object readResolve() {
        C15133 c15133 = new C15133(this.f41245);
        c15133.m36412(this.f41246);
        return c15133.mo24709();
    }
}
