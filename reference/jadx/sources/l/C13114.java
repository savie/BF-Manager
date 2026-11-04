package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13114 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f41907;

    public C13114(Object[] objArr) {
        this.f41907 = objArr;
    }

    public Object readResolve() {
        return AbstractC1928.m6615(this.f41907);
    }
}
