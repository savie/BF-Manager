package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۖۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B32G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2500 extends CancellationException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient C15374 f8007;

    public C2500(String str, Throwable th, C15374 c15374) {
        super(str);
        this.f8007 = c15374;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8007;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2500)) {
            return false;
        }
        C2500 c2500 = (C2500) obj;
        return C15243.m36589((Object) c2500.getMessage(), (Object) getMessage()) && C15243.m36589(c2500.f8007, this.f8007) && C15243.m36589(c2500.getCause(), getCause());
    }

    public final int hashCode() {
        String message = getMessage();
        C15243.m36586((Object) message);
        int iHashCode = (this.f8007.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }
}
