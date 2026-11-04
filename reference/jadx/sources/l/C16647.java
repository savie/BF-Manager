package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes5.dex */
public final class C16647 extends AbstractC3223 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53792;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f53793;

    public C16647(Object obj, Method method) {
        this.f53793 = method;
        this.f53792 = obj;
    }

    @Override // l.AbstractC3223
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10572(Class cls) {
        String strM54296 = C24281.m54296(cls);
        if (strM54296 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM54296));
        }
        return this.f53793.invoke(this.f53792, cls);
    }
}
