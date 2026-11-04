package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAZV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0655 {
    @Deprecated
    public AbstractC0655() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2892 m2867() {
        if (this instanceof C2892) {
            return (C2892) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String mo2866() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C21362 c21362 = new C21362(C24853.m55381(sb));
            c21362.m48591(EnumC19805.LENIENT);
            C25378.f81932.getClass();
            C25378.m56740(this, c21362);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
