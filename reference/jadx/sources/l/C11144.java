package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۧܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11144 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f37805;

    public C11144(Object[] objArr) {
        this.f37805 = objArr;
    }

    public Object readResolve() {
        return AbstractC23844.m52571(this.f37805);
    }
}
