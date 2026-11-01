package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۡۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8656 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C8656 f29847 = new C8656();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        C1162 c1162 = c23473.f76005;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullListAsEmpty.f14811) != 0) {
                c13158.write("[]");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            c13158.append((CharSequence) "[]");
            return;
        }
        C22330 c22330 = c23473.f76000;
        c23473.m51727(c22330, obj, obj2);
        try {
            c13158.write(91);
            int i2 = 0;
            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                c23473.m51728();
                c23473.m51723();
                while (i2 < length) {
                    if (i2 != 0) {
                        c13158.write(44);
                        c23473.m51723();
                    }
                    c23473.m51725(objArr[i2]);
                    i2++;
                }
                c23473.m51724();
                c23473.m51723();
                c13158.write(93);
                c23473.f76000 = c22330;
                return;
            }
            Class<?> cls = null;
            InterfaceC11747 interfaceC11747M4271 = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    c13158.append((CharSequence) "null,");
                } else {
                    IdentityHashMap identityHashMap = c23473.f76011;
                    if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                        c23473.m51730(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            interfaceC11747M4271.mo1396(c23473, obj3, null, null);
                        } else {
                            interfaceC11747M4271 = c1162.m4271(cls2);
                            interfaceC11747M4271.mo1396(c23473, obj3, null, null);
                            cls = cls2;
                        }
                    }
                    c13158.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                c13158.append((CharSequence) "null]");
            } else {
                IdentityHashMap identityHashMap2 = c23473.f76011;
                if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                    c23473.m51730(obj4);
                } else {
                    try {
                        c1162.m4271(obj4.getClass()).mo1396(c23473, obj4, Integer.valueOf(i), null);
                    } catch (IOException e) {
                        throw new C20614(e.getMessage(), (Throwable) e);
                    }
                }
                c13158.write(93);
            }
            c23473.f76000 = c22330;
        } catch (Throwable th) {
            c23473.f76000 = c22330;
            throw th;
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        if (iM8859 == 8) {
            c2974.m8850(16);
            return null;
        }
        if (type != char[].class) {
            if (iM8859 == 4) {
                byte[] bArrM8834 = c2974.m8834();
                c2974.m8850(16);
                return bArrM8834;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            C10031 c10031 = new C10031();
            c14265.m34401(componentType, c10031, obj);
            return m22459(c14265, (Class) componentType, c10031);
        }
        if (iM8859 == 4) {
            String strM8840 = c2974.m8840();
            c2974.m8850(16);
            return strM8840.toCharArray();
        }
        if (iM8859 == 2) {
            Number numberM8862 = c2974.m8862();
            c2974.m8850(16);
            return numberM8862.toString().toCharArray();
        }
        return AbstractC8620.m22398(c14265.m34396((Object) null)).toCharArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22459(C14265 c14265, Class cls, C10031 c10031) {
        if (c10031 == null) {
            return null;
        }
        int size = c10031.size();
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Object objM21510 = c10031.get(i);
            if (objM21510 == c10031) {
                Array.set(objNewInstance, i, objNewInstance);
            } else {
                if (cls.isArray()) {
                    if (!cls.isInstance(objM21510)) {
                        objM21510 = m22459(c14265, cls, (C10031) objM21510);
                    }
                } else {
                    objM21510 = C8219.m21510(objM21510, cls, c14265.f46686);
                }
                Array.set(objNewInstance, i, objM21510);
            }
        }
        c10031.m25313(objNewInstance);
        c10031.m25307((Type) cls);
        return objNewInstance;
    }
}
