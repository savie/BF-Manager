package l;

import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۡۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 289S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9207 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f30018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC15700 f30019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f30020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10852 f30021;

    public AbstractC9207(C10852 c10852, C12828 c12828) {
        this.f30019 = c10852.m27585().m48065().m1341();
        this.f30021 = c10852;
        this.f30020 = c10852.m27586();
        this.f30018 = c12828.m31828();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15700 m24361() {
        return this.f30019;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24652 m24362(C24652 c24652, EnumSet enumSet) throws Throwable {
        Throwable interruptedIOException;
        try {
            try {
                C24652 c24653 = (C24652) this.f30021.m27584(c24652, false).get(this.f30018, TimeUnit.MILLISECONDS);
                C18684 c18684 = (C18684) c24653.mo3632();
                if (enumSet.contains(EnumC20243.m46515(c18684.m43472()))) {
                    return c24653;
                }
                throw new C9953(c18684, "expected=" + enumSet);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException();
                interruptedIOException2.initCause(e);
                throw interruptedIOException2;
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (TimeoutException e3) {
                if (Build.VERSION.SDK_INT >= 26) {
                    interruptedIOException = C1005.m3885();
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m24363() {
        return this.f30020;
    }
}
