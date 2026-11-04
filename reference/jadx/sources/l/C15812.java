package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܶۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAVZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15812 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f51449 = 1023;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17304[] f51448 = new C17304[1024];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m37737(Type type) {
        for (C17304 c17304 = this.f51448[System.identityHashCode(type) & this.f51449]; c17304 != null; c17304 = c17304.f56344) {
            if (type == c17304.f56342) {
                return c17304.f56343;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37738(Object obj, Type type) {
        int iIdentityHashCode = System.identityHashCode(type) & this.f51449;
        C17304[] c17304Arr = this.f51448;
        for (C17304 c17304 = c17304Arr[iIdentityHashCode]; c17304 != null; c17304 = c17304.f56344) {
            if (type == c17304.f56342) {
                c17304.f56343 = obj;
                return;
            }
        }
        c17304Arr[iIdentityHashCode] = new C17304(type, obj, c17304Arr[iIdentityHashCode]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m37736(String str) {
        int i = 0;
        while (true) {
            C17304[] c17304Arr = this.f51448;
            if (i >= c17304Arr.length) {
                return null;
            }
            C17304 c17304 = c17304Arr[i];
            if (c17304 != null) {
                for (C17304 c17305 = c17304; c17305 != null; c17305 = c17305.f56344) {
                    Type type = c17304.f56342;
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
