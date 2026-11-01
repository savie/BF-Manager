package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes2.dex */
public class C6158 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17161(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C13465.m32966(th, "cause");
        C13465.m32966(th2, "exception");
        Method method = C17447.f55548;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
