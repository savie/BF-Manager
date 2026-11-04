package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۠ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes3.dex */
public class C8553 {
    /* JADX INFO: renamed from: ۙ */
    public void mo14339(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C15243.m36590(th, "cause");
        C15243.m36590(th2, "exception");
        Method method = C2587.f8309;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
