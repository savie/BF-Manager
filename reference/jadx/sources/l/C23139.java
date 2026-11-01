package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes.dex */
public final class C23139 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f75135;

    public C23139(AbstractC6910 abstractC6910) {
        this.f75135 = abstractC6910;
    }

    public Object readResolve() {
        return this.f75135.entrySet();
    }
}
