package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.᩺ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24388 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m54498(long j, Future future) throws Throwable {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC6488 interfaceC6488 = C9469.f30684;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw interfaceC6488.mo4586(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw interfaceC6488.mo4586(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw interfaceC6488.mo4586(e);
        }
    }
}
