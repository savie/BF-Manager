package l;

import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1599 implements InterfaceC11747 {
    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        C1162 c1162 = c23473.f76005;
        boolean z = (c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0;
        Type typeM21533 = z ? C8219.m21533(type) : null;
        if (obj == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullListAsEmpty.f14811) != 0) {
                c13158.write("[]");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            c13158.append((CharSequence) "[]");
            return;
        }
        C22330 c22330 = c23473.f76000;
        if ((c13158.f43818 & EnumC3984.DisableCircularReferenceDetect.f14811) == 0) {
            c23473.f76000 = new C22330(c22330, obj, obj2, 0);
            if (c23473.f76011 == null) {
                c23473.f76011 = new IdentityHashMap();
            }
            c23473.f76011.put(obj, c23473.f76000);
        }
        try {
            if ((c13158.f43818 & EnumC3984.PrettyFormat.f14811) != 0) {
                c13158.write(91);
                c23473.m51728();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (i != 0) {
                        c13158.write(44);
                    }
                    c23473.m51723();
                    if (obj3 != null) {
                        IdentityHashMap identityHashMap = c23473.f76011;
                        if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                            c23473.m51730(obj3);
                        } else {
                            InterfaceC11747 interfaceC11747M4271 = c1162.m4271(obj3.getClass());
                            c23473.f76000 = new C22330(c22330, obj, obj2, 0);
                            interfaceC11747M4271.mo1396(c23473, obj3, Integer.valueOf(i), typeM21533);
                        }
                    } else {
                        c13158.m32530();
                    }
                }
                c23473.m51724();
                c23473.m51723();
                c13158.write(93);
                return;
            }
            int i2 = c13158.f43820 + 1;
            if (i2 > c13158.f43819.length) {
                c13158.m32534(i2);
            }
            c13158.f43819[c13158.f43820] = '[';
            c13158.f43820 = i2;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj4 = list.get(i3);
                if (i3 != 0) {
                    int i4 = c13158.f43820 + 1;
                    if (i4 > c13158.f43819.length) {
                        c13158.m32534(i4);
                    }
                    c13158.f43819[c13158.f43820] = ',';
                    c13158.f43820 = i4;
                }
                if (obj4 == null) {
                    c13158.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        c13158.writeInt(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            c13158.m32535(jLongValue);
                            c13158.write(76);
                        } else {
                            c13158.m32535(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                            c13158.m32536(str);
                        } else {
                            c13158.m32532(str, (char) 0, true);
                        }
                    } else {
                        if ((c13158.f43818 & EnumC3984.DisableCircularReferenceDetect.f14811) == 0) {
                            c23473.f76000 = new C22330(c22330, obj, obj2, 0);
                        }
                        IdentityHashMap identityHashMap2 = c23473.f76011;
                        if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                            c23473.m51730(obj4);
                        } else {
                            c1162.m4271(obj4.getClass()).mo1396(c23473, obj4, Integer.valueOf(i3), typeM21533);
                        }
                    }
                }
            }
            int i5 = c13158.f43820 + 1;
            if (i5 > c13158.f43819.length) {
                c13158.m32534(i5);
            }
            c13158.f43819[c13158.f43820] = ']';
            c13158.f43820 = i5;
        } finally {
            c23473.f76000 = c22330;
        }
    }
}
