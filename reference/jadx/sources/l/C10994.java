package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ۧ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10994 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f37413;

    static {
        try {
            Iterator it = Arrays.asList(new C7279()).iterator();
            C13465.m32966(it, "<this>");
            f37413 = C4061.m11591(new C2880(new C21701(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m27744(Throwable th, InterfaceC22386 interfaceC22386) {
        Throwable runtimeException;
        Iterator it = f37413.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC6054) it.next()).mo16451(th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C13672.m33380(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C13672.m33380(th, new C22427(interfaceC22386));
            C7321 c7321 = C7321.f24318;
        } catch (Throwable th3) {
            C18610.m43014(th3);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
