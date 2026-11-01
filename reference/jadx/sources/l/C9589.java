package l;

import java.io.Serializable;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۢ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9589 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumSet f32328;

    public C9589(EnumSet enumSet) {
        this.f32328 = enumSet;
    }

    public Object readResolve() {
        return new C3237(this.f32328.clone(), 0);
    }
}
