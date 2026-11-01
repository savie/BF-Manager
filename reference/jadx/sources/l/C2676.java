package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2676 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object[] f10346;

    public C2676(Object[] objArr) {
        this.f10346 = objArr;
    }

    public Object readResolve() {
        return AbstractC22433.m49800(this.f10346);
    }
}
