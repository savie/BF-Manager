package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20986 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f67094;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f67095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f67096;

    public C20986(Method method, Method method2, Method method3) {
        this.f67094 = method;
        this.f67096 = method2;
        this.f67095 = method3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m47965() {
        Method method = this.f67094;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                this.f67096.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47966(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f67095.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
