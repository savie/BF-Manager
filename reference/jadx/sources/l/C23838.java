package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩻ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B32G */
/* JADX INFO: loaded from: classes.dex */
public final class C23838 extends CancellationException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient C2339 f77037;

    public C23838(String str, Throwable th, C2339 c2339) {
        super(str);
        this.f77037 = c2339;
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
        return super.toString() + "; job=" + this.f77037;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23838)) {
            return false;
        }
        C23838 c23838 = (C23838) obj;
        return C13465.m32965((Object) c23838.getMessage(), (Object) getMessage()) && C13465.m32965(c23838.f77037, this.f77037) && C13465.m32965(c23838.getCause(), getCause());
    }

    public final int hashCode() {
        String message = getMessage();
        C13465.m32962((Object) message);
        int iHashCode = (this.f77037.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }
}
