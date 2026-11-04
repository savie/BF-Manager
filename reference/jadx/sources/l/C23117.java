package l;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AUS */
/* JADX INFO: loaded from: classes.dex */
public final class C23117 extends AbstractC23863 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Type f74972;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC3725 f74973;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f74974;

    public C23117(Class cls, C16558 c16558) {
        super(cls, c16558);
        Type type = c16558.f53589;
        Class cls2 = c16558.f53586;
        if (cls2.isArray()) {
            this.f74972 = cls2.getComponentType();
            this.f74974 = true;
        } else {
            this.f74972 = C3134.m10240(type);
            this.f74974 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0237  */
    /* JADX WARN: Code duplicated, block: B:123:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0242  */
    /* JADX WARN: Code duplicated, block: B:126:0x024b  */
    /* JADX WARN: Code duplicated, block: B:136:0x027a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0290  */
    /* JADX WARN: Code duplicated, block: B:141:0x0299  */
    /* JADX WARN: Code duplicated, block: B:143:0x029f  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0231 A[EDGE_INSN: B:165:0x0231->B:119:0x0231 BREAK  A[LOOP:1: B:115:0x0220->B:160:0x02de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    @Override // l.AbstractC23863
    /* JADX INFO: renamed from: ۙ */
    public final void mo4587(C2759 c2759, Object obj, Type type, Map map) {
        C6489 c6489;
        List arrayList;
        C6489 c64810;
        C16558 c16558;
        InterfaceC3725 interfaceC3725;
        Type c23272;
        Type type2;
        C6489 c64811;
        InterfaceC3725 interfaceC3725M33061;
        C6489 c64812;
        C6489 c64813;
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char c;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        C6489 c64814;
        C6489 c64815;
        int i7;
        InterfaceC3725 interfaceC3726;
        int i8;
        C13945 c13945 = c2759.f9128;
        C13420 c13420 = c2759.f9130;
        int i9 = c13945.f44222;
        if (i9 == 8 || (i9 == 4 && c13945.m33979().length() == 0)) {
            mo17349(obj, null);
            c13945.m33956();
            return;
        }
        boolean z = this.f74974;
        Type type3 = this.f74972;
        if (z) {
            C6489 c64816 = new C6489();
            c64816.m18321(type3);
            c6489 = c64816;
            arrayList = c64816;
        } else {
            c6489 = null;
            arrayList = new ArrayList();
        }
        C15657 c15657 = c2759.f9133;
        C16558 c16559 = this.f77258;
        c2759.m9109(c15657, obj, c16559.f53585);
        InterfaceC3725 interfaceC3727 = this.f74973;
        if (type instanceof ParameterizedType) {
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type3;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls != null) {
                    interfaceC3726 = interfaceC3727;
                    int length = cls.getTypeParameters().length;
                    c16558 = c16559;
                    i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i10 = length;
                            Class cls2 = cls;
                            if (cls.getTypeParameters()[i8].getName().equals(typeVariable.getName())) {
                                break;
                            }
                            i8++;
                            cls = cls2;
                            length = i10;
                        }
                    }
                    if (i8 != -1) {
                        type2 = parameterizedType.getActualTypeArguments()[i8];
                        if (!type2.equals(type3)) {
                            interfaceC3725M33061 = c13420.m33061(type2);
                        }
                        c64813 = c6489;
                    } else {
                        type2 = type3;
                    }
                    interfaceC3725M33061 = interfaceC3726;
                    c64813 = c6489;
                } else {
                    c16558 = c16559;
                    interfaceC3726 = interfaceC3727;
                }
                i8 = -1;
                if (i8 != -1) {
                    type2 = parameterizedType.getActualTypeArguments()[i8];
                    if (!type2.equals(type3)) {
                        interfaceC3725M33061 = c13420.m33061(type2);
                    }
                    c64813 = c6489;
                } else {
                    type2 = type3;
                }
                interfaceC3725M33061 = interfaceC3726;
                c64813 = c6489;
            } else {
                c16558 = c16559;
                interfaceC3725 = interfaceC3727;
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) type3;
                    Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type4 = actualTypeArguments[0];
                        if (type4 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type4;
                            ParameterizedType parameterizedType3 = (ParameterizedType) type;
                            Class cls3 = parameterizedType3.getRawType() instanceof Class ? (Class) parameterizedType3.getRawType() : null;
                            if (cls3 != null) {
                                int length2 = cls3.getTypeParameters().length;
                                c64815 = c6489;
                                i7 = 0;
                                while (true) {
                                    if (i7 < length2) {
                                        int i11 = length2;
                                        Class cls4 = cls3;
                                        if (cls3.getTypeParameters()[i7].getName().equals(typeVariable2.getName())) {
                                            break;
                                        }
                                        i7++;
                                        cls3 = cls4;
                                        length2 = i11;
                                    }
                                }
                                c64814 = c64815;
                                if (i7 != -1) {
                                    actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                    c23272 = new C23272(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                    c64812 = c64815;
                                }
                            } else {
                                c64815 = c6489;
                            }
                            i7 = -1;
                            c64814 = c64815;
                            if (i7 != -1) {
                                actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                c23272 = new C23272(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                c64812 = c64815;
                            }
                        } else {
                            c64814 = c6489;
                        }
                        c23272 = type3;
                        c64812 = c64814;
                    } else {
                        c64814 = c6489;
                        c23272 = type3;
                        c64812 = c64814;
                    }
                    type2 = c23272;
                    c64811 = c64812;
                    interfaceC3725M33061 = interfaceC3725;
                    c64813 = c64811;
                } else {
                    c64810 = c6489;
                    type2 = type3;
                    c64811 = c64810;
                    interfaceC3725M33061 = interfaceC3725;
                    c64813 = c64811;
                }
            }
        } else {
            c64810 = c6489;
            c16558 = c16559;
            interfaceC3725 = interfaceC3727;
            if ((type3 instanceof TypeVariable) && (type instanceof Class)) {
                Class cls5 = (Class) type;
                TypeVariable typeVariable3 = (TypeVariable) type3;
                cls5.getTypeParameters();
                int length3 = cls5.getTypeParameters().length;
                int i12 = 0;
                while (true) {
                    if (i12 < length3) {
                        TypeVariable typeVariable4 = cls5.getTypeParameters()[i12];
                        if (typeVariable4.getName().equals(typeVariable3.getName())) {
                            Type[] bounds = typeVariable4.getBounds();
                            if (bounds.length == 1) {
                                c23272 = bounds[0];
                                c64812 = c64810;
                                type2 = c23272;
                                c64811 = c64812;
                            }
                            interfaceC3725M33061 = interfaceC3725;
                            c64813 = c64811;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            type2 = type3;
            c64811 = c64810;
            interfaceC3725M33061 = interfaceC3725;
            c64813 = c64811;
        }
        if (interfaceC3725M33061 == null) {
            interfaceC3725M33061 = c13420.m33061(type2);
            this.f74973 = interfaceC3725M33061;
        }
        int i13 = c13945.f44222;
        String str = c13945.f44211;
        int i14 = c13945.f44210;
        if (i13 == 14) {
            char c2 = c13945.f44209;
            if (c2 == '[') {
                int i15 = c13945.f44206 + 1;
                c13945.f44206 = i15;
                c13945.f44209 = i15 >= i14 ? (char) 26 : str.charAt(i15);
                c13945.f44222 = 14;
            } else if (c2 == '{') {
                int i16 = c13945.f44206 + 1;
                c13945.f44206 = i16;
                c13945.f44209 = i16 >= i14 ? (char) 26 : str.charAt(i16);
                c13945.f44222 = 12;
            } else {
                if (c2 == '\"') {
                    c13945.m33937();
                } else if (c2 == ']') {
                    int i17 = c13945.f44206 + 1;
                    c13945.f44206 = i17;
                    c13945.f44209 = i17 >= i14 ? (char) 26 : str.charAt(i17);
                    i = 15;
                    c13945.f44222 = 15;
                } else {
                    i = 15;
                    c13945.m33956();
                }
                i2 = 0;
                while (true) {
                    i3 = c13945.f44222;
                    if (i3 == 16) {
                        c13945.m33956();
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        arrayList.add(interfaceC3725M33061.mo12124(c2759, type2, Integer.valueOf(i2)));
                        if (c2759.f9124 == 1) {
                            c2759.m9112((Collection) arrayList);
                        }
                        if (c13945.f44222 == 16) {
                            c = c13945.f44209;
                            if (c == '[') {
                                i6 = c13945.f44206 + 1;
                                c13945.f44206 = i6;
                                if (i6 >= i14) {
                                    cCharAt3 = 26;
                                } else {
                                    cCharAt3 = str.charAt(i6);
                                }
                                c13945.f44209 = cCharAt3;
                                c13945.f44222 = 14;
                            } else if (c == '{') {
                                i5 = c13945.f44206 + 1;
                                c13945.f44206 = i5;
                                if (i5 >= i14) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                c13945.f44209 = cCharAt2;
                                c13945.f44222 = 12;
                            } else if (c == '\"') {
                                c13945.m33937();
                            } else {
                                c13945.m33956();
                            }
                        }
                        i2++;
                        i = 15;
                    }
                    c16558 = c16558;
                }
                if (c13945.f44209 == ',') {
                    i4 = c13945.f44206 + 1;
                    c13945.f44206 = i4;
                    if (i4 >= i14) {
                        cCharAt = 26;
                    } else {
                        cCharAt = str.charAt(i4);
                    }
                    c13945.f44209 = cCharAt;
                    c13945.f44222 = 16;
                } else {
                    c13945.m33956();
                }
            }
            i = 15;
            i2 = 0;
            while (true) {
                i3 = c13945.f44222;
                if (i3 == 16) {
                    c13945.m33956();
                } else {
                    if (i3 == i) {
                        break;
                        break;
                    }
                    arrayList.add(interfaceC3725M33061.mo12124(c2759, type2, Integer.valueOf(i2)));
                    if (c2759.f9124 == 1) {
                        c2759.m9112((Collection) arrayList);
                    }
                    if (c13945.f44222 == 16) {
                        c = c13945.f44209;
                        if (c == '[') {
                            i6 = c13945.f44206 + 1;
                            c13945.f44206 = i6;
                            if (i6 >= i14) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str.charAt(i6);
                            }
                            c13945.f44209 = cCharAt3;
                            c13945.f44222 = 14;
                        } else if (c == '{') {
                            i5 = c13945.f44206 + 1;
                            c13945.f44206 = i5;
                            if (i5 >= i14) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            c13945.f44209 = cCharAt2;
                            c13945.f44222 = 12;
                        } else if (c == '\"') {
                            c13945.m33937();
                        } else {
                            c13945.m33956();
                        }
                    }
                    i2++;
                    i = 15;
                }
                c16558 = c16558;
            }
            if (c13945.f44209 == ',') {
                i4 = c13945.f44206 + 1;
                c13945.f44206 = i4;
                if (i4 >= i14) {
                    cCharAt = 26;
                } else {
                    cCharAt = str.charAt(i4);
                }
                c13945.f44209 = cCharAt;
                c13945.f44222 = 16;
            } else {
                c13945.m33956();
            }
        } else if (i13 == 12) {
            arrayList.add(interfaceC3725M33061.mo12124(c2759, type2, 0));
        } else {
            String strConcat = "exepct '[', but ".concat(C11109.m28059(i13));
            if (type != null) {
                strConcat = strConcat + ", type : " + type;
            }
            throw new C4251(strConcat);
        }
        c2759.m9116(c15657);
        Object obj2 = arrayList;
        if (z) {
            Object array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) type3, arrayList.size()));
            c64813.m18323(array);
            obj2 = array;
        }
        if (obj == null) {
            map.put(c16558.f53585, obj2);
        } else {
            mo17349(obj, obj2);
        }
    }
}
