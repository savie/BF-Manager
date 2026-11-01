package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes.dex */
public final class C22102 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparator f71576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object[] f71577;

    public C22102(Comparator comparator, Object[] objArr) {
        this.f71576 = comparator;
        this.f71577 = objArr;
    }

    public Object readResolve() {
        C5168 c5168 = new C5168(this.f71576);
        c5168.m14321(this.f71577);
        return c5168.mo14317();
    }
}
