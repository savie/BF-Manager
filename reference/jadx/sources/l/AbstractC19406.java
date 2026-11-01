package l;

import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.᩵ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 289S */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19406 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f62555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC20508 f62556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f62557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20858 f62558;

    public AbstractC19406(C20858 c20858, C16418 c16418) {
        this.f62556 = c20858.m46888().m4290().m11484();
        this.f62558 = c20858;
        this.f62555 = c20858.m46886();
        this.f62557 = c16418.m38674();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20508 m44458() {
        return this.f62556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11771 m44457(C11771 c11771, EnumSet enumSet) throws Throwable {
        Throwable interruptedIOException;
        try {
            try {
                C11771 c11772 = (C11771) this.f62558.m46889(c11771, false).get(this.f62557, TimeUnit.MILLISECONDS);
                C1186 c1186 = (C1186) c11772.mo25478();
                if (enumSet.contains(EnumC3055.m9149(c1186.m4349()))) {
                    return c11772;
                }
                throw new C18700(c1186, "expected=" + enumSet);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException();
                interruptedIOException2.initCause(e);
                throw interruptedIOException2;
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (TimeoutException e3) {
                if (Build.VERSION.SDK_INT >= 26) {
                    interruptedIOException = C8117.m21380();
                } else {
                    interruptedIOException = new InterruptedIOException("InterruptedByTimeout");
                }
                interruptedIOException.initCause(e3);
                throw interruptedIOException;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new IOException(e5);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m44459() {
        return this.f62555;
    }
}
