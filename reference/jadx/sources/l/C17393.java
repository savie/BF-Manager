package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܽۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes5.dex */
public final class C17393 extends AbstractC3223 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f56564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56565;

    public C17393(Method method, int i) {
        this.f56564 = method;
        this.f56565 = i;
    }

    @Override // l.AbstractC3223
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10572(Class cls) {
        String strM54296 = C24281.m54296(cls);
        if (strM54296 == null) {
            return this.f56564.invoke(null, cls, Integer.valueOf(this.f56565));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM54296));
    }
}
