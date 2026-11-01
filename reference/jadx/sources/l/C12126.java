package l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12126 implements InterfaceC20592, Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C12126 f40599 = new C12126();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f40600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f40601;

    public C12126() {
        List list = Collections.EMPTY_LIST;
        this.f40601 = list;
        this.f40600 = list;
    }

    public final Object clone() {
        try {
            return (C12126) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class clsM29316 = c11730.m29316();
        boolean zM30184 = m30184(clsM29316, true);
        boolean zM30185 = m30184(clsM29316, false);
        if (zM30184 || zM30185) {
            return new C16359(this, zM30185, zM30184, c6044, c11730);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30185(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m30184(field.getType(), z)) {
            return true;
        }
        List list = z ? this.f40601 : this.f40600;
        if (list.isEmpty()) {
            return false;
        }
        new C4899(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC15217) it.next()).m36422()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30184(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            int i = C17023.f54385;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f40601 : this.f40600).iterator();
        while (it.hasNext()) {
            if (((InterfaceC15217) it.next()).m36421()) {
                return true;
            }
        }
        return false;
    }
}
