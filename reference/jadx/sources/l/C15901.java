package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes5.dex */
public final class C15901 extends AbstractC3223 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f51670;

    public C15901(Method method) {
        this.f51670 = method;
    }

    @Override // l.AbstractC3223
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10572(Class cls) {
        String strM54296 = C24281.m54296(cls);
        if (strM54296 == null) {
            return this.f51670.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM54296));
    }
}
