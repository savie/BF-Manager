package l;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AUS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2304 extends AbstractC18533 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Type f8219;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f8220;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC7950 f8221;

    public C2304(Class cls, C15275 c15275) {
        super(cls, c15275);
        Type type = c15275.f49787;
        Class cls2 = c15275.f49790;
        if (cls2.isArray()) {
            this.f8219 = cls2.getComponentType();
            this.f8220 = true;
        } else {
            this.f8219 = C8219.m21533(type);
            this.f8220 = false;
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
    @Override // l.AbstractC18533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7044(C14265 c14265, Object obj, Type type, Map map) {
        C10031 c10031;
        List arrayList;
        C10031 c10032;
        C15275 c15275;
        InterfaceC7950 interfaceC7950;
        Type c18802;
        Type type2;
        C10031 c10033;
        InterfaceC7950 interfaceC7950M3569;
        C10031 c10034;
        C10031 c10035;
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
        C10031 c10036;
        C10031 c10037;
        int i7;
        InterfaceC7950 interfaceC7951;
        int i8;
        C2974 c2974 = c14265.f46690;
        C0893 c0893 = c14265.f46686;
        int i9 = c2974.f11130;
        if (i9 == 8 || (i9 == 4 && c2974.m8840().length() == 0)) {
            mo31963(obj, null);
            c2974.m8839();
            return;
        }
        boolean z = this.f8220;
        Type type3 = this.f8219;
        if (z) {
            C10031 c10038 = new C10031();
            c10038.m25307(type3);
            c10031 = c10038;
            arrayList = c10038;
        } else {
            c10031 = null;
            arrayList = new ArrayList();
        }
        C22061 c22061 = c14265.f46689;
        C15275 c15276 = this.f58998;
        c14265.m34399(c22061, obj, c15276.f49788);
        InterfaceC7950 interfaceC7952 = this.f8221;
        if (type instanceof ParameterizedType) {
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type3;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls != null) {
                    interfaceC7951 = interfaceC7952;
                    int length = cls.getTypeParameters().length;
                    c15275 = c15276;
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
                            interfaceC7950M3569 = c0893.m3569(type2);
                        }
                        c10035 = c10031;
                    } else {
                        type2 = type3;
                    }
                    interfaceC7950M3569 = interfaceC7951;
                    c10035 = c10031;
                } else {
                    c15275 = c15276;
                    interfaceC7951 = interfaceC7952;
                }
                i8 = -1;
                if (i8 != -1) {
                    type2 = parameterizedType.getActualTypeArguments()[i8];
                    if (!type2.equals(type3)) {
                        interfaceC7950M3569 = c0893.m3569(type2);
                    }
                    c10035 = c10031;
                } else {
                    type2 = type3;
                }
                interfaceC7950M3569 = interfaceC7951;
                c10035 = c10031;
            } else {
                c15275 = c15276;
                interfaceC7950 = interfaceC7952;
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
                                c10037 = c10031;
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
                                c10036 = c10037;
                                if (i7 != -1) {
                                    actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                    c18802 = new C18802(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                    c10034 = c10037;
                                }
                            } else {
                                c10037 = c10031;
                            }
                            i7 = -1;
                            c10036 = c10037;
                            if (i7 != -1) {
                                actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                c18802 = new C18802(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                c10034 = c10037;
                            }
                        } else {
                            c10036 = c10031;
                        }
                        c18802 = type3;
                        c10034 = c10036;
                    } else {
                        c10036 = c10031;
                        c18802 = type3;
                        c10034 = c10036;
                    }
                    type2 = c18802;
                    c10033 = c10034;
                    interfaceC7950M3569 = interfaceC7950;
                    c10035 = c10033;
                } else {
                    c10032 = c10031;
                    type2 = type3;
                    c10033 = c10032;
                    interfaceC7950M3569 = interfaceC7950;
                    c10035 = c10033;
                }
            }
        } else {
            c10032 = c10031;
            c15275 = c15276;
            interfaceC7950 = interfaceC7952;
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
                                c18802 = bounds[0];
                                c10034 = c10032;
                                type2 = c18802;
                                c10033 = c10034;
                            }
                            interfaceC7950M3569 = interfaceC7950;
                            c10035 = c10033;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            type2 = type3;
            c10033 = c10032;
            interfaceC7950M3569 = interfaceC7950;
            c10035 = c10033;
        }
        if (interfaceC7950M3569 == null) {
            interfaceC7950M3569 = c0893.m3569(type2);
            this.f8221 = interfaceC7950M3569;
        }
        int i13 = c2974.f11130;
        String str = c2974.f11132;
        int i14 = c2974.f11129;
        if (i13 == 14) {
            char c2 = c2974.f11134;
            if (c2 == '[') {
                int i15 = c2974.f11127 + 1;
                c2974.f11127 = i15;
                c2974.f11134 = i15 >= i14 ? (char) 26 : str.charAt(i15);
                c2974.f11130 = 14;
            } else if (c2 == '{') {
                int i16 = c2974.f11127 + 1;
                c2974.f11127 = i16;
                c2974.f11134 = i16 >= i14 ? (char) 26 : str.charAt(i16);
                c2974.f11130 = 12;
            } else {
                if (c2 == '\"') {
                    c2974.m8841();
                } else if (c2 == ']') {
                    int i17 = c2974.f11127 + 1;
                    c2974.f11127 = i17;
                    c2974.f11134 = i17 >= i14 ? (char) 26 : str.charAt(i17);
                    i = 15;
                    c2974.f11130 = 15;
                } else {
                    i = 15;
                    c2974.m8839();
                }
                i2 = 0;
                while (true) {
                    i3 = c2974.f11130;
                    if (i3 == 16) {
                        c2974.m8839();
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        arrayList.add(interfaceC7950M3569.mo1395(c14265, type2, Integer.valueOf(i2)));
                        if (c14265.f46685 == 1) {
                            c14265.m34402((Collection) arrayList);
                        }
                        if (c2974.f11130 == 16) {
                            c = c2974.f11134;
                            if (c == '[') {
                                i6 = c2974.f11127 + 1;
                                c2974.f11127 = i6;
                                if (i6 >= i14) {
                                    cCharAt3 = 26;
                                } else {
                                    cCharAt3 = str.charAt(i6);
                                }
                                c2974.f11134 = cCharAt3;
                                c2974.f11130 = 14;
                            } else if (c == '{') {
                                i5 = c2974.f11127 + 1;
                                c2974.f11127 = i5;
                                if (i5 >= i14) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                c2974.f11134 = cCharAt2;
                                c2974.f11130 = 12;
                            } else if (c == '\"') {
                                c2974.m8841();
                            } else {
                                c2974.m8839();
                            }
                        }
                        i2++;
                        i = 15;
                    }
                    c15275 = c15275;
                }
                if (c2974.f11134 == ',') {
                    i4 = c2974.f11127 + 1;
                    c2974.f11127 = i4;
                    if (i4 >= i14) {
                        cCharAt = 26;
                    } else {
                        cCharAt = str.charAt(i4);
                    }
                    c2974.f11134 = cCharAt;
                    c2974.f11130 = 16;
                } else {
                    c2974.m8839();
                }
            }
            i = 15;
            i2 = 0;
            while (true) {
                i3 = c2974.f11130;
                if (i3 == 16) {
                    c2974.m8839();
                } else {
                    if (i3 == i) {
                        break;
                        break;
                    }
                    arrayList.add(interfaceC7950M3569.mo1395(c14265, type2, Integer.valueOf(i2)));
                    if (c14265.f46685 == 1) {
                        c14265.m34402((Collection) arrayList);
                    }
                    if (c2974.f11130 == 16) {
                        c = c2974.f11134;
                        if (c == '[') {
                            i6 = c2974.f11127 + 1;
                            c2974.f11127 = i6;
                            if (i6 >= i14) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str.charAt(i6);
                            }
                            c2974.f11134 = cCharAt3;
                            c2974.f11130 = 14;
                        } else if (c == '{') {
                            i5 = c2974.f11127 + 1;
                            c2974.f11127 = i5;
                            if (i5 >= i14) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            c2974.f11134 = cCharAt2;
                            c2974.f11130 = 12;
                        } else if (c == '\"') {
                            c2974.m8841();
                        } else {
                            c2974.m8839();
                        }
                    }
                    i2++;
                    i = 15;
                }
                c15275 = c15275;
            }
            if (c2974.f11134 == ',') {
                i4 = c2974.f11127 + 1;
                c2974.f11127 = i4;
                if (i4 >= i14) {
                    cCharAt = 26;
                } else {
                    cCharAt = str.charAt(i4);
                }
                c2974.f11134 = cCharAt;
                c2974.f11130 = 16;
            } else {
                c2974.m8839();
            }
        } else if (i13 == 12) {
            arrayList.add(interfaceC7950M3569.mo1395(c14265, type2, 0));
        } else {
            String strConcat = "exepct '[', but ".concat(C0735.m3199(i13));
            if (type != null) {
                strConcat = strConcat + ", type : " + type;
            }
            throw new C20614(strConcat);
        }
        c14265.m34405(c22061);
        Object obj2 = arrayList;
        if (z) {
            Object array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) type3, arrayList.size()));
            c10035.m25313(array);
            obj2 = array;
        }
        if (obj == null) {
            map.put(c15275.f49788, obj2);
        } else {
            mo31963(obj, obj2);
        }
    }
}
