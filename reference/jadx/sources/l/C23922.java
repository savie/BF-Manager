package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NALW */
/* JADX INFO: loaded from: classes.dex */
public final class C23922 implements InterfaceC10643, InterfaceC6282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f77496;

    public C23922(Class cls) {
        C13465.m32966(cls, "jClass");
        this.f77496 = cls;
    }

    @Override // l.InterfaceC6282
    /* JADX INFO: renamed from: ۙ */
    public final Class mo6762() {
        return this.f77496;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m52744() {
        return C11222.m28184(this.f77496);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23922) && C13530.m33062(this).equals(C13530.m33062((InterfaceC10643) obj));
    }

    public final int hashCode() {
        return C13530.m33062(this).hashCode();
    }

    public final String toString() {
        return this.f77496.toString() + " (Kotlin reflection is not available)";
    }

    static {
        int i = 0;
        List listM13618 = C4892.m13618((Object[]) new Class[]{InterfaceC4871.class, InterfaceC15456.class, InterfaceC8400.class, InterfaceC19689.class, InterfaceC9106.class, InterfaceC10517.class, InterfaceC7694.class, InterfaceC21099.class, InterfaceC16161.class, InterfaceC20394.class, InterfaceC14045.class, InterfaceC11928.class, InterfaceC2754.class, InterfaceC5577.class, InterfaceC22511.class, InterfaceC1343.class, InterfaceC13339.class, InterfaceC4165.class, InterfaceC6988.class, InterfaceC23217.class, InterfaceC21805.class, InterfaceC18277.class, InterfaceC18983.class});
        ArrayList arrayList = new ArrayList(C4892.m13614((Iterable) listM13618));
        for (Object obj : listM13618) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C15083((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        C19710.m44830(arrayList);
    }
}
