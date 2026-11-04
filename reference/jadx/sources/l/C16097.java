package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16097 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f52147;

    public C16097(AbstractC17589 abstractC17589) {
        this.f52147 = abstractC17589;
    }

    public Object readResolve() {
        return this.f52147.entrySet();
    }
}
