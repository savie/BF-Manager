package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K66W */
/* JADX INFO: loaded from: classes2.dex */
public final class C4747 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f16691 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f16689 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f16690 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14646(C13477 c13477, Object obj) {
        if (obj instanceof InterfaceC6766) {
            throw new AssertionError("T extends Context.Factory");
        }
        HashMap map = this.f16691;
        if (map != null) {
            Object objPut = map.put(c13477, obj);
            if (objPut != null && !(objPut instanceof InterfaceC6766) && objPut != obj && obj != null) {
                throw new AssertionError("duplicate context value");
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m14642(Class cls) {
        return m14643(m14648(cls));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14644(Class cls, Object obj) {
        m14646(m14648(cls), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14645(Class cls, InterfaceC6766 interfaceC6766) {
        m14647(m14648(cls), interfaceC6766);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m14643(C13477 c13477) {
        HashMap map = this.f16691;
        if (map != null) {
            Object obj = map.get(c13477);
            if (!(obj instanceof InterfaceC6766)) {
                return obj;
            }
            Object objMo14222 = ((InterfaceC6766) obj).mo14222(this);
            if (objMo14222 instanceof InterfaceC6766) {
                throw new AssertionError("T extends Context.Factory");
            }
            C11972.m30026(map.get(c13477) == objMo14222);
            return objMo14222;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14647(C13477 c13477, InterfaceC6766 interfaceC6766) {
        HashMap map = this.f16691;
        if (map != null) {
            if (map.put(c13477, interfaceC6766) != null) {
                throw new AssertionError("duplicate context value");
            }
            HashMap map2 = this.f16689;
            if (map2 != null) {
                map2.put(c13477, interfaceC6766);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13477 m14648(Class cls) {
        HashMap map = this.f16690;
        if (map != null) {
            C13477 c13477 = (C13477) map.get(cls);
            if (c13477 != null) {
                return c13477;
            }
            C13477 c13478 = new C13477();
            map.put(cls, c13478);
            return c13478;
        }
        throw new IllegalStateException();
    }
}
