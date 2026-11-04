package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۨ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12674 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12674 f40598 = new C12674();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        C12829 c12829 = c9690.f31277;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullListAsEmpty.f5702) != 0) {
                c5372.write("[]");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            c5372.append((CharSequence) "[]");
            return;
        }
        C15066 c15066 = c9690.f31285;
        c9690.m25279(c15066, obj, obj2);
        try {
            c5372.write(91);
            int i2 = 0;
            if ((c5372.f18847 & EnumC1643.PrettyFormat.f5702) != 0) {
                c9690.m25280();
                c9690.m25283();
                while (i2 < length) {
                    if (i2 != 0) {
                        c5372.write(44);
                        c9690.m25283();
                    }
                    c9690.m25277(objArr[i2]);
                    i2++;
                }
                c9690.m25276();
                c9690.m25283();
                c5372.write(93);
                c9690.f31285 = c15066;
                return;
            }
            Class<?> cls = null;
            InterfaceC10591 interfaceC10591M31835 = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    c5372.append((CharSequence) "null,");
                } else {
                    IdentityHashMap identityHashMap = c9690.f31286;
                    if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                        c9690.m25282(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            interfaceC10591M31835.mo3063(c9690, obj3, null, null);
                        } else {
                            interfaceC10591M31835 = c12829.m31835(cls2);
                            interfaceC10591M31835.mo3063(c9690, obj3, null, null);
                            cls = cls2;
                        }
                    }
                    c5372.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                c5372.append((CharSequence) "null]");
            } else {
                IdentityHashMap identityHashMap2 = c9690.f31286;
                if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                    c9690.m25282(obj4);
                } else {
                    try {
                        c12829.m31835(obj4.getClass()).mo3063(c9690, obj4, Integer.valueOf(i), null);
                    } catch (IOException e) {
                        throw new C4251(e.getMessage(), (Throwable) e);
                    }
                }
                c5372.write(93);
            }
            c9690.f31285 = c15066;
        } catch (Throwable th) {
            c9690.f31285 = c15066;
            throw th;
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        if (iM33938 == 8) {
            c13945.m33973(16);
            return null;
        }
        if (type != char[].class) {
            if (iM33938 == 4) {
                byte[] bArrM33948 = c13945.m33948();
                c13945.m33973(16);
                return bArrM33948;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            C6489 c6489 = new C6489();
            c2759.m9111(componentType, c6489, obj);
            return m31450(c2759, (Class) componentType, c6489);
        }
        if (iM33938 == 4) {
            String strM33979 = c13945.m33979();
            c13945.m33973(16);
            return strM33979.toCharArray();
        }
        if (iM33938 == 2) {
            Number numberM33960 = c13945.m33960();
            c13945.m33973(16);
            return numberM33960.toString().toCharArray();
        }
        return AbstractC12454.m30927(c2759.m9106((Object) null)).toCharArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m31450(C2759 c2759, Class cls, C6489 c6489) {
        if (c6489 == null) {
            return null;
        }
        int size = c6489.size();
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Object objM10215 = c6489.get(i);
            if (objM10215 == c6489) {
                Array.set(objNewInstance, i, objNewInstance);
            } else {
                if (cls.isArray()) {
                    if (!cls.isInstance(objM10215)) {
                        objM10215 = m31450(c2759, cls, (C6489) objM10215);
                    }
                } else {
                    objM10215 = C3134.m10215(objM10215, cls, c2759.f9130);
                }
                Array.set(objNewInstance, i, objM10215);
            }
        }
        c6489.m18323(objNewInstance);
        c6489.m18321((Type) cls);
        return objNewInstance;
    }
}
