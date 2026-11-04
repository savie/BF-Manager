package l;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J84Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4494 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f16057 = new C6732(EnumC11600.f36426);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24522 f16058;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC25027 f16059;

    public C4494(C24522 c24522, InterfaceC25027 interfaceC25027) {
        this.f16058 = c24522;
        this.f16059 = interfaceC25027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16075 m14216(InterfaceC25027 interfaceC25027) {
        if (interfaceC25027 != EnumC11600.f36426) {
            return new C6732(interfaceC25027);
        }
        return f16057;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m14217(C4208 c4208, EnumC14648 enumC14648) throws IOException {
        int i = C24632.f79759[enumC14648.ordinal()];
        if (i == 1) {
            c4208.m13441();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c4208.m13456();
        return new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Serializable m14215(C4208 c4208, EnumC14648 enumC14648) throws IOException {
        int i = C24632.f79759[enumC14648.ordinal()];
        if (i == 3) {
            return c4208.m13453();
        }
        if (i == 4) {
            return this.f16059.mo6563(c4208);
        }
        if (i == 5) {
            return Boolean.valueOf(c4208.m13440());
        }
        if (i == 6) {
            c4208.m13444();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC14648);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        EnumC14648 enumC14648M13438 = c4208.m13438();
        Object objM14217 = m14217(c4208, enumC14648M13438);
        if (objM14217 == null) {
            return m14215(c4208, enumC14648M13438);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c4208.m13457()) {
                String strM13437 = objM14217 instanceof Map ? c4208.m13437() : null;
                EnumC14648 enumC14648M13439 = c4208.m13438();
                Object objM14218 = m14217(c4208, enumC14648M13439);
                boolean z = objM14218 != null;
                Object objM14215 = objM14218 == null ? m14215(c4208, enumC14648M13439) : objM14218;
                if (objM14217 instanceof List) {
                    ((List) objM14217).add(objM14215);
                } else {
                    ((Map) objM14217).put(strM13437, objM14215);
                }
                if (z) {
                    arrayDeque.addLast(objM14217);
                    objM14217 = objM14215;
                }
            } else {
                if (objM14217 instanceof List) {
                    c4208.m13449();
                } else {
                    c4208.m13447();
                }
                if (arrayDeque.isEmpty()) {
                    return objM14217;
                }
                objM14217 = arrayDeque.removeLast();
            }
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        if (obj == null) {
            c21362.m48598();
            return;
        }
        Class<?> cls = obj.getClass();
        C24522 c24522 = this.f16058;
        c24522.getClass();
        AbstractC17567 abstractC17567M54785 = c24522.m54785(C6446.m18229((Class) cls));
        if (abstractC17567M54785 instanceof C4494) {
            c21362.m48600();
            c21362.m48597();
        } else {
            abstractC17567M54785.mo3723(c21362, obj);
        }
    }
}
