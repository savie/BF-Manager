package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2673 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f8495;

    public C2673(Object[] objArr) {
        this.f8495 = objArr;
    }

    public Object readResolve() {
        return AbstractC8639.m23280(this.f8495);
    }
}
