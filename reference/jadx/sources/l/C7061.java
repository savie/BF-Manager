package l;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J84Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7061 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f23711 = new C13412(EnumC19181.f61950);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6044 f23712;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8598 f23713;

    public C7061(C6044 c6044, InterfaceC8598 interfaceC8598) {
        this.f23712 = c6044;
        this.f23713 = interfaceC8598;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20592 m18926(InterfaceC8598 interfaceC8598) {
        if (interfaceC8598 != EnumC19181.f61950) {
            return new C13412(interfaceC8598);
        }
        return f23711;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Serializable m18927(C5379 c5379, EnumC22313 enumC22313) throws IOException {
        int i = C4238.f15325[enumC22313.ordinal()];
        if (i == 1) {
            c5379.m14913();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c5379.m14917();
        return new C0918();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Serializable m18925(C5379 c5379, EnumC22313 enumC22313) throws IOException {
        int i = C4238.f15325[enumC22313.ordinal()];
        if (i == 3) {
            return c5379.m14922();
        }
        if (i == 4) {
            return this.f23713.mo20826(c5379);
        }
        if (i == 5) {
            return Boolean.valueOf(c5379.m14927());
        }
        if (i == 6) {
            c5379.m14918();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC22313);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        EnumC22313 enumC22313M14916 = c5379.m14916();
        Object objM18927 = m18927(c5379, enumC22313M14916);
        if (objM18927 == null) {
            return m18925(c5379, enumC22313M14916);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c5379.m14924()) {
                String strM14921 = objM18927 instanceof Map ? c5379.m14921() : null;
                EnumC22313 enumC22313M14917 = c5379.m14916();
                Serializable serializableM18927 = m18927(c5379, enumC22313M14917);
                boolean z = serializableM18927 != null;
                Serializable serializableM18925 = serializableM18927 == null ? m18925(c5379, enumC22313M14917) : serializableM18927;
                if (objM18927 instanceof List) {
                    ((List) objM18927).add(serializableM18925);
                } else {
                    ((Map) objM18927).put(strM14921, serializableM18925);
                }
                if (z) {
                    arrayDeque.addLast(objM18927);
                    objM18927 = serializableM18925;
                }
            } else {
                if (objM18927 instanceof List) {
                    c5379.m14929();
                } else {
                    c5379.m14910();
                }
                if (arrayDeque.isEmpty()) {
                    return objM18927;
                }
                objM18927 = arrayDeque.removeLast();
            }
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        if (obj == null) {
            c1145.m4214();
            return;
        }
        Class<?> cls = obj.getClass();
        C6044 c6044 = this.f23712;
        c6044.getClass();
        AbstractC7186 abstractC7186M16440 = c6044.m16440(C11730.m29313((Class) cls));
        if (abstractC7186M16440 instanceof C7061) {
            c1145.m4208();
            c1145.m4216();
        } else {
            abstractC7186M16440.mo1572(c1145, obj);
        }
    }
}
