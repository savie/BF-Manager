package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۖۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2266 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m6947(long j, Future future) throws Throwable {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC11440 interfaceC11440 = C21317.f69360;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw interfaceC11440.mo12998(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw interfaceC11440.mo12998(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw interfaceC11440.mo12998(e);
        }
    }
}
