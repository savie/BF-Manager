package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes5.dex */
public final class C19264 extends AbstractC20675 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f62211;

    public C19264(Object obj, Method method) {
        this.f62211 = method;
        this.f62210 = obj;
    }

    @Override // l.AbstractC20675
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19403(Class cls) {
        String strM1196 = C0130.m1196(cls);
        if (strM1196 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1196));
        }
        return this.f62211.invoke(this.f62210, cls);
    }
}
