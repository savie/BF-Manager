package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K66W */
/* JADX INFO: loaded from: classes3.dex */
public final class C12343 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f41253 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f41251 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f41252 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30659(C16576 c16576, Object obj) {
        if (obj instanceof InterfaceC0347) {
            throw new AssertionError("T extends Context.Factory");
        }
        HashMap map = this.f41253;
        if (map != null) {
            Object objPut = map.put(c16576, obj);
            if (objPut != null && !(objPut instanceof InterfaceC0347) && objPut != obj && obj != null) {
                throw new AssertionError("duplicate context value");
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m30655(Class cls) {
        return m30656(m30661(cls));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30657(Class cls, Object obj) {
        m30659(m30661(cls), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30658(Class cls, InterfaceC0347 interfaceC0347) {
        m30660(m30661(cls), interfaceC0347);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m30656(C16576 c16576) {
        HashMap map = this.f41253;
        if (map != null) {
            Object obj = map.get(c16576);
            if (!(obj instanceof InterfaceC0347)) {
                return obj;
            }
            Object objMo2033 = ((InterfaceC0347) obj).mo2033(this);
            if (objMo2033 instanceof InterfaceC0347) {
                throw new AssertionError("T extends Context.Factory");
            }
            C6171.m17176(map.get(c16576) == objMo2033);
            return objMo2033;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30660(C16576 c16576, InterfaceC0347 interfaceC0347) {
        HashMap map = this.f41253;
        if (map != null) {
            if (map.put(c16576, interfaceC0347) != null) {
                throw new AssertionError("duplicate context value");
            }
            HashMap map2 = this.f41251;
            if (map2 != null) {
                map2.put(c16576, interfaceC0347);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16576 m30661(Class cls) {
        HashMap map = this.f41252;
        if (map != null) {
            C16576 c16576 = (C16576) map.get(cls);
            if (c16576 != null) {
                return c16576;
            }
            C16576 c16577 = new C16576();
            map.put(cls, c16577);
            return c16577;
        }
        throw new IllegalStateException();
    }
}
