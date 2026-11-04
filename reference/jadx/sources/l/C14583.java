package l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14583 implements InterfaceC16075, Cloneable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C14583 f45958 = new C14583();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f45959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f45960;

    public C14583() {
        List list = Collections.EMPTY_LIST;
        this.f45960 = list;
        this.f45959 = list;
    }

    public final Object clone() {
        try {
            return (C14583) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class clsM18232 = c6446.m18232();
        boolean zM35183 = m35183(clsM18232, true);
        boolean zM35184 = m35183(clsM18232, false);
        if (zM35183 || zM35184) {
            return new C4143(this, zM35184, zM35183, c24522, c6446);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35184(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m35183(field.getType(), z)) {
            return true;
        }
        List list = z ? this.f45960 : this.f45959;
        if (list.isEmpty()) {
            return false;
        }
        new C5876(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC13333) it.next()).m32901()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35183(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            int i = C1971.f6612;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f45960 : this.f45959).iterator();
        while (it.hasNext()) {
            if (((InterfaceC13333) it.next()).m32900()) {
                return true;
            }
        }
        return false;
    }
}
