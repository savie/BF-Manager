package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes3.dex */
public final class C10092 extends AbstractC20675 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f34449;

    public C10092(Method method) {
        this.f34449 = method;
    }

    @Override // l.AbstractC20675
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19403(Class cls) {
        String strM1196 = C0130.m1196(cls);
        if (strM1196 == null) {
            return this.f34449.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1196));
    }
}
