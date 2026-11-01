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

/* JADX INFO: renamed from: l.᩶ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAUK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19945 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C19945 f63889 = new C19945();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        if (obj == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullListAsEmpty.f14811) != 0) {
                c13158.write("[]");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        int i = c13158.f43818;
        EnumC3984 enumC3984 = EnumC3984.WriteClassName;
        Type typeM21533 = (i & enumC3984.f14811) != 0 ? C8219.m21533(type) : null;
        Collection collection = (Collection) obj;
        C22330 c22330 = c23473.f76000;
        c23473.m51727(c22330, obj, obj2);
        if ((c13158.f43818 & enumC3984.f14811) != 0) {
            if (HashSet.class == collection.getClass()) {
                c13158.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                c13158.append((CharSequence) "TreeSet");
            }
        }
        try {
            c13158.write(91);
            int i2 = 0;
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    c13158.write(44);
                }
                if (obj3 == null) {
                    c13158.m32530();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        c13158.writeInt(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        c13158.m32535(((Long) obj3).longValue());
                        if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0) {
                            c13158.write(76);
                        }
                    } else {
                        c23473.f76005.m4271(cls).mo1396(c23473, obj3, Integer.valueOf(i2), typeM21533);
                    }
                }
                i2 = i3;
            }
            c13158.write(93);
        } finally {
            c23473.f76000 = c22330;
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        Collection arrayList;
        Type type2;
        C2974 c2974 = c14265.f46690;
        if (c2974.m8859() == 8) {
            c2974.m8850(16);
            return null;
        }
        if (type == C10031.class) {
            C10031 c10031 = new C10031();
            c14265.m34403(c10031, (Object) null);
            return c10031;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            } else {
                throw new C20614("TODO");
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
                throw new C20614("create instane error, class ".concat(cls.getName()));
            }
        }
        c14265.m34401(C8219.m21533(type), arrayList, obj);
        return arrayList;
    }
}
