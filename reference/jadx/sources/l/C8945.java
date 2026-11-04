package l;

import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8945 implements InterfaceC10591 {
    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        C12829 c12829 = c9690.f31277;
        boolean z = (c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0;
        Type typeM10240 = z ? C3134.m10240(type) : null;
        if (obj == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullListAsEmpty.f5702) != 0) {
                c5372.write("[]");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            c5372.append((CharSequence) "[]");
            return;
        }
        C15066 c15066 = c9690.f31285;
        if ((c5372.f18847 & EnumC1643.DisableCircularReferenceDetect.f5702) == 0) {
            c9690.f31285 = new C15066(c15066, obj, obj2, 0);
            if (c9690.f31286 == null) {
                c9690.f31286 = new IdentityHashMap();
            }
            c9690.f31286.put(obj, c9690.f31285);
        }
        try {
            if ((c5372.f18847 & EnumC1643.PrettyFormat.f5702) != 0) {
                c5372.write(91);
                c9690.m25280();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (i != 0) {
                        c5372.write(44);
                    }
                    c9690.m25283();
                    if (obj3 != null) {
                        IdentityHashMap identityHashMap = c9690.f31286;
                        if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                            c9690.m25282(obj3);
                        } else {
                            InterfaceC10591 interfaceC10591M31835 = c12829.m31835(obj3.getClass());
                            c9690.f31285 = new C15066(c15066, obj, obj2, 0);
                            interfaceC10591M31835.mo3063(c9690, obj3, Integer.valueOf(i), typeM10240);
                        }
                    } else {
                        c5372.m16046();
                    }
                }
                c9690.m25276();
                c9690.m25283();
                c5372.write(93);
                return;
            }
            int i2 = c5372.f18848 + 1;
            if (i2 > c5372.f18846.length) {
                c5372.m16050(i2);
            }
            c5372.f18846[c5372.f18848] = '[';
            c5372.f18848 = i2;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj4 = list.get(i3);
                if (i3 != 0) {
                    int i4 = c5372.f18848 + 1;
                    if (i4 > c5372.f18846.length) {
                        c5372.m16050(i4);
                    }
                    c5372.f18846[c5372.f18848] = ',';
                    c5372.f18848 = i4;
                }
                if (obj4 == null) {
                    c5372.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        c5372.writeInt(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            c5372.m16051(jLongValue);
                            c5372.write(76);
                        } else {
                            c5372.m16051(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((c5372.f18847 & EnumC1643.UseSingleQuotes.f5702) != 0) {
                            c5372.m16052(str);
                        } else {
                            c5372.m16048(str, (char) 0, true);
                        }
                    } else {
                        if ((c5372.f18847 & EnumC1643.DisableCircularReferenceDetect.f5702) == 0) {
                            c9690.f31285 = new C15066(c15066, obj, obj2, 0);
                        }
                        IdentityHashMap identityHashMap2 = c9690.f31286;
                        if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                            c9690.m25282(obj4);
                        } else {
                            c12829.m31835(obj4.getClass()).mo3063(c9690, obj4, Integer.valueOf(i3), typeM10240);
                        }
                    }
                }
            }
            int i5 = c5372.f18848 + 1;
            if (i5 > c5372.f18846.length) {
                c5372.m16050(i5);
            }
            c5372.f18846[c5372.f18848] = ']';
            c5372.f18848 = i5;
        } finally {
            c9690.f31285 = c15066;
        }
    }
}
