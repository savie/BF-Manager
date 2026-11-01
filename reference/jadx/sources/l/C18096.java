package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ᩳܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAVZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18096 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57862 = 1023;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21624[] f57861 = new C21624[1024];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42101(Type type) {
        for (C21624 c21624 = this.f57861[System.identityHashCode(type) & this.f57862]; c21624 != null; c21624 = c21624.f70136) {
            if (type == c21624.f70134) {
                return c21624.f70135;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42102(Object obj, Type type) {
        int iIdentityHashCode = System.identityHashCode(type) & this.f57862;
        C21624[] c21624Arr = this.f57861;
        for (C21624 c21624 = c21624Arr[iIdentityHashCode]; c21624 != null; c21624 = c21624.f70136) {
            if (type == c21624.f70134) {
                c21624.f70135 = obj;
                return;
            }
        }
        c21624Arr[iIdentityHashCode] = new C21624(type, obj, c21624Arr[iIdentityHashCode]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m42100(String str) {
        int i = 0;
        while (true) {
            C21624[] c21624Arr = this.f57861;
            if (i >= c21624Arr.length) {
                return null;
            }
            C21624 c21624 = c21624Arr[i];
            if (c21624 != null) {
                for (C21624 c21625 = c21624; c21625 != null; c21625 = c21625.f70136) {
                    Type type = c21624.f70134;
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (cls.getName().equals(str)) {
                            return cls;
                        }
                    }
                }
            }
            i++;
        }
    }
}
