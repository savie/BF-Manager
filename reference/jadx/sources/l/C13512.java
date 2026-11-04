package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NALW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13512 implements InterfaceC7040, InterfaceC8292 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Map f42963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f42964;

    public C13512(Class cls) {
        C15243.m36590(cls, "jClass");
        this.f42964 = cls;
    }

    @Override // l.InterfaceC8292
    /* JADX INFO: renamed from: ۙ */
    public final Class mo16466() {
        return this.f42964;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m33198() {
        return C6801.m18984(this.f42964);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33199() {
        return C6801.m18982(this.f42964);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13512) && C4560.m14317((InterfaceC7040) this).equals(C4560.m14317((InterfaceC7040) obj));
    }

    public final int hashCode() {
        return C4560.m14317((InterfaceC7040) this).hashCode();
    }

    public final String toString() {
        return this.f42964.toString() + " (Kotlin reflection is not available)";
    }

    static {
        int i = 0;
        List listM21088 = C7743.m21088((Object[]) new Class[]{InterfaceC19479.class, InterfaceC3071.class, InterfaceC23955.class, InterfaceC3817.class, InterfaceC14257.class, InterfaceC20971.class, InterfaceC17987.class, InterfaceC0088.class, InterfaceC7546.class, InterfaceC18733.class, InterfaceC15003.class, InterfaceC12766.class, InterfaceC5309.class, InterfaceC1580.class, InterfaceC11274.class, InterfaceC24701.class, InterfaceC16495.class, InterfaceC17241.class, InterfaceC15749.class, InterfaceC23209.class, InterfaceC20225.class, InterfaceC12020.class, InterfaceC6055.class});
        ArrayList arrayList = new ArrayList(C7743.m21084((Iterable) listM21088));
        for (Object obj : listM21088) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C21914((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f42963 = C5834.m17022(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33197(AbstractC13213 abstractC13213) {
        Class clsM14317 = this.f42964;
        C15243.m36590(clsM14317, "jClass");
        Map map = f42963;
        C15243.m36587((Object) map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsM14317);
        if (num != null) {
            return C15989.m38121(num.intValue(), abstractC13213);
        }
        if (clsM14317.isPrimitive()) {
            clsM14317 = C4560.m14317((InterfaceC7040) C16735.m39514(clsM14317));
        }
        return clsM14317.isInstance(abstractC13213);
    }
}
