package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13099 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f43609;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f43610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f43611;

    public C13099(Method method, Method method2, Method method3) {
        this.f43609 = method;
        this.f43611 = method2;
        this.f43610 = method3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m32316() {
        Method method = this.f43609;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                this.f43611.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32317(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f43610.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
