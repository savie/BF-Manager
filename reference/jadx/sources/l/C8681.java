package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۡۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8681 extends AbstractC20675 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f29884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29885;

    public C8681(Method method, int i) {
        this.f29884 = method;
        this.f29885 = i;
    }

    @Override // l.AbstractC20675
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19403(Class cls) {
        String strM1196 = C0130.m1196(cls);
        if (strM1196 == null) {
            return this.f29884.invoke(null, cls, Integer.valueOf(this.f29885));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1196));
    }
}
