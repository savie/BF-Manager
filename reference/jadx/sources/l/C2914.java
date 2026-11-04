package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914 implements InterfaceC0130 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9525 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashSet f9526;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1423 f9527;

    static {
        new C2914();
        f9526 = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        f9527 = new C1423();
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1288(Class cls) {
        return AbstractC9035.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۧۡܽ] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l.ۧۡܽ] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18029 mo1287(Class cls) {
        C9625 c9625;
        C10042 c10042M25899;
        ?? c0677;
        Class<?> returnType;
        if (!AbstractC9035.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        C24478 descriptorForType = m9549(cls).getDescriptorForType();
        List fields = descriptorForType.getFields();
        C19652 c19652 = new C19652(fields.size());
        c19652.m45303(m9549(cls));
        int i = C8135.f26841[descriptorForType.mo5003().m34197().ordinal()];
        c19652.m45302(i != 1 ? i != 2 ? EnumC16711.EDITIONS : EnumC16711.PROTO3 : EnumC16711.PROTO2);
        c19652.m45304(descriptorForType.m54744().m17896());
        C9625 c9626 = new C9625();
        Class<?>[] clsArr = null;
        Field fieldM9551 = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < fields.size()) {
            C7323 c7323 = (C7323) fields.get(i2);
            boolean zM20089 = c7323.m20089();
            EnumC2848 enumC2848M20086 = c7323.m20086();
            EnumC2848 enumC2848 = EnumC2848.ENUM;
            ?? c18576 = (enumC2848M20086 == enumC2848 && c7323.m20085()) ? new C18576(c7323) : clsArr;
            if (c7323.m20098() != null) {
                C1796 c1796M25128 = c9626.m25128(cls, c7323.m20094());
                EnumC4561 enumC4561M9548 = m9548(c7323);
                switch (C8135.f26842[enumC4561M9548.m14332().ordinal()]) {
                    case 1:
                        returnType = Boolean.class;
                        break;
                    case 2:
                        returnType = AbstractC17084.class;
                        break;
                    case 3:
                        returnType = Double.class;
                        break;
                    case 4:
                        returnType = Float.class;
                        break;
                    case 5:
                    case 6:
                        returnType = Integer.class;
                        break;
                    case 7:
                        returnType = Long.class;
                        break;
                    case 8:
                        returnType = String.class;
                        break;
                    case 9:
                        try {
                            returnType = cls.getDeclaredMethod(m9550(c7323.getType() == EnumC8814.f28793 ? c7323.m20093().getName() : c7323.getName()), clsArr).getReturnType();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid type for oneof: " + enumC4561M9548);
                }
                c19652.m45301(C10042.m25894(c7323.getNumber(), enumC4561M9548, c1796M25128, returnType, zM20089, c18576));
                c9625 = c9626;
            } else {
                EnumC8814 type = c7323.getType();
                EnumC8814 enumC8814 = EnumC8814.f28793;
                String name = type == enumC8814 ? c7323.m20093().getName() : c7323.getName();
                c9625 = c9626;
                Field fieldM9552 = m9551(cls, C8947.m23910(new StringBuilder(), m9546(name, false), f9526.contains(m9546(name, z)) ? "__" : "_"));
                int number = c7323.getNumber();
                EnumC4561 enumC4561M9549 = m9548(c7323);
                if (c7323.m20095()) {
                    if (fieldM9551 == null) {
                        fieldM9551 = m9551(cls, C14442.m34864(i3, "bitField", "_"));
                    }
                    c19652.m45301(c7323.m20090() ? C10042.m25903(fieldM9552, number, enumC4561M9549, fieldM9551, i4, zM20089, c18576) : C10042.m25898(fieldM9552, number, enumC4561M9549, fieldM9551, i4, zM20089, c18576));
                    int i5 = i4 << 1;
                    if (i5 == 0) {
                        i3++;
                        fieldM9551 = null;
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                } else {
                    if (c7323.m20096()) {
                        C7323 c7323M54735 = c7323.m20093().m54735(2);
                        if (c7323M54735.m20086() == enumC2848 && c7323M54735.m20085()) {
                            c0677 = c18576;
                            c0677 = c18576;
                            c0677 = new C0677(c7323M54735);
                        }
                        c0677 = c18576;
                        c0677 = c18576;
                        c0677 = c18576;
                        String name2 = c7323.getName();
                        int i6 = C18949.f61453;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cls.getName());
                            sb.append("$");
                            StringBuilder sb2 = new StringBuilder();
                            boolean z2 = true;
                            for (int i7 = 0; i7 < name2.length(); i7++) {
                                char cCharAt = name2.charAt(i7);
                                if ('a' > cCharAt || cCharAt > 'z') {
                                    if ('A' > cCharAt || cCharAt > 'Z') {
                                        if ('0' <= cCharAt && cCharAt <= '9') {
                                            sb2.append(cCharAt);
                                        }
                                        z2 = true;
                                    } else if (i7 != 0 || z2) {
                                        sb2.append(cCharAt);
                                    } else {
                                        sb2.append((char) (cCharAt + ' '));
                                    }
                                } else if (z2) {
                                    sb2.append((char) (cCharAt - ' '));
                                } else {
                                    sb2.append(cCharAt);
                                }
                                z2 = false;
                            }
                            sb.append(sb2.toString());
                            sb.append("DefaultEntryHolder");
                            Field[] declaredFields = Class.forName(sb.toString()).getDeclaredFields();
                            if (declaredFields.length != 1) {
                                throw new IllegalStateException("Unable to look up map field default entry holder class for " + name2 + " in " + cls.getName());
                            }
                            c10042M25899 = C10042.m25895(fieldM9552, number, C22832.m51502(declaredFields[0]), (InterfaceC11512) c0677);
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    } else if (c7323.mo8649() && c7323.m20086() == EnumC2848.MESSAGE) {
                        try {
                            c10042M25899 = C10042.m25896(fieldM9552, number, enumC4561M9549, cls.getDeclaredMethod(m9550(c7323.getType() == enumC8814 ? c7323.m20093().getName() : c7323.getName()), Integer.TYPE).getReturnType());
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (c7323.mo8650()) {
                        c10042M25899 = c18576 != 0 ? C10042.m25900(fieldM9552, number, enumC4561M9549, c18576, m9551(cls, C8947.m23910(new StringBuilder(), m9546(c7323.getName(), false), "MemoizedSerializedSize"))) : C10042.m25897(fieldM9552, number, enumC4561M9549, m9551(cls, C8947.m23910(new StringBuilder(), m9546(c7323.getName(), false), "MemoizedSerializedSize")));
                    } else {
                        c10042M25899 = c18576 != 0 ? C10042.m25899(fieldM9552, number, enumC4561M9549, (InterfaceC11512) c18576) : C10042.m25901(fieldM9552, number, enumC4561M9549, zM20089);
                    }
                    c19652.m45301(c10042M25899);
                }
            }
            i2++;
            z = true;
            clsArr = null;
            c9626 = c9625;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C7323 c7324 = (C7323) fields.get(i8);
            if (c7324.m20090() || (c7324.m20086() == EnumC2848.MESSAGE && f9527.m5160(c7324.m20093()))) {
                arrayList.add(Integer.valueOf(c7324.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        if (size > 0) {
            c19652.m45305(iArr);
        }
        return c19652.m45300();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21013 m9549(Class cls) {
        try {
            return (InterfaceC21013) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4561 m9548(C7323 c7323) {
        switch (C8135.f26843[c7323.getType().ordinal()]) {
            case 1:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16197 : EnumC4561.f16179;
                }
                return EnumC4561.f16199;
            case 2:
                return c7323.mo8649() ? EnumC4561.f16195 : EnumC4561.f16183;
            case 3:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16187 : EnumC4561.f16208;
                }
                return EnumC4561.f16192;
            case 4:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16220 : EnumC4561.f16226;
                }
                return EnumC4561.f16201;
            case 5:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16189 : EnumC4561.f16206;
                }
                return EnumC4561.f16211;
            case 6:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16230 : EnumC4561.f16203;
                }
                return EnumC4561.f16181;
            case 7:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16213 : EnumC4561.f16216;
                }
                return EnumC4561.f16214;
            case 8:
                return c7323.mo8649() ? EnumC4561.f16185 : EnumC4561.f16228;
            case 9:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16191 : EnumC4561.f16205;
                }
                return EnumC4561.f16222;
            case 10:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16210 : EnumC4561.f16186;
                }
                return EnumC4561.f16229;
            case 11:
                if (c7323.m20096()) {
                    return EnumC4561.f16223;
                }
                return c7323.mo8649() ? EnumC4561.f16178 : EnumC4561.f16217;
            case 12:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16200 : EnumC4561.f16219;
                }
                return EnumC4561.f16194;
            case 13:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16184 : EnumC4561.f16198;
                }
                return EnumC4561.f16180;
            case 14:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16209 : EnumC4561.f16193;
                }
                return EnumC4561.f16196;
            case 15:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16202 : EnumC4561.f16225;
                }
                return EnumC4561.f16188;
            case 16:
                return c7323.mo8649() ? EnumC4561.f16221 : EnumC4561.f16227;
            case 17:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16190 : EnumC4561.f16207;
                }
                return EnumC4561.f16212;
            case 18:
                if (c7323.mo8649()) {
                    return c7323.mo8650() ? EnumC4561.f16231 : EnumC4561.f16204;
                }
                return EnumC4561.f16182;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + c7323.getType());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field m9551(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbM51387 = C22783.m51387("Unable to find field ", str, " in message class ");
            sbM51387.append(cls.getName());
            throw new IllegalArgumentException(sbM51387.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9545(String str) {
        return m9546(str, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m9550(String str) {
        String strM9546 = m9546(str, false);
        return "get" + Character.toUpperCase(strM9546.charAt(0)) + strM9546.substring(1, strM9546.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9546(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '_') {
                z = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z = true;
            } else if (z) {
                sb.append(Character.toUpperCase(cCharAt));
                z = false;
            } else if (i == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
