package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩶᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAUK */
/* JADX INFO: loaded from: classes.dex */
public final class C21625 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21625 f69049 = new C21625();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        if (obj == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullListAsEmpty.f5702) != 0) {
                c5372.write("[]");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        int i = c5372.f18847;
        EnumC1643 enumC1643 = EnumC1643.WriteClassName;
        Type typeM10240 = (i & enumC1643.f5702) != 0 ? C3134.m10240(type) : null;
        Collection collection = (Collection) obj;
        C15066 c15066 = c9690.f31285;
        c9690.m25279(c15066, obj, obj2);
        if ((c5372.f18847 & enumC1643.f5702) != 0) {
            if (HashSet.class == collection.getClass()) {
                c5372.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                c5372.append((CharSequence) "TreeSet");
            }
        }
        try {
            c5372.write(91);
            int i2 = 0;
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    c5372.write(44);
                }
                if (obj3 == null) {
                    c5372.m16046();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        c5372.writeInt(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        c5372.m16051(((Long) obj3).longValue());
                        if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0) {
                            c5372.write(76);
                        }
                    } else {
                        c9690.f31277.m31835(cls).mo3063(c9690, obj3, Integer.valueOf(i2), typeM10240);
                    }
                }
                i2 = i3;
            }
            c5372.write(93);
        } finally {
            c9690.f31285 = c15066;
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        Collection arrayList;
        Type type2;
        C13945 c13945 = c2759.f9128;
        if (c13945.m33938() == 8) {
            c13945.m33973(16);
            return null;
        }
        if (type == C6489.class) {
            C6489 c6489 = new C6489();
            c2759.m9113(c6489, (Object) null);
            return c6489;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            } else {
                throw new C4251("TODO");
            }
        }
        Class cls = (Class) rawType;
        if (cls == AbstractCollection.class || cls == Collection.class) {
            arrayList = new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            arrayList = new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            arrayList = new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            arrayList = new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            arrayList = new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            if (type instanceof ParameterizedType) {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                type2 = Object.class;
            }
            arrayList = EnumSet.noneOf((Class) type2);
        } else {
            try {
                arrayList = (Collection) cls.newInstance();
            } catch (Exception unused) {
                throw new C4251("create instane error, class ".concat(cls.getName()));
            }
        }
        c2759.m9111(C3134.m10240(type), arrayList, obj);
        return arrayList;
    }
}
