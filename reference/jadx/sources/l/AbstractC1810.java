package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: IAZV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1810 {
    @Deprecated
    public AbstractC1810() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2246 m5904() {
        if (this instanceof C2246) {
            return (C2246) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String mo5903() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C1145 c1145 = new C1145(C7975.m21040(sb));
            c1145.m4205(EnumC14948.LENIENT);
            C15613.f50774.mo1572(c1145, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
