package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18516 implements InterfaceC4154 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58968 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashSet f58969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21338 f58970;

    static {
        new C18516();
        f58969 = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        f58970 = new C21338();
    }

    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11797(Class cls) {
        return AbstractC18245.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۛᩴ᩸] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l.ۛᩴ᩸] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13328 mo11796(Class cls) {
        C17810 c17810;
        C15403 c15403M36857;
        ?? c3698;
        Class<?> returnType;
        if (!AbstractC18245.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        C2806 descriptorForType = m42909(cls).getDescriptorForType();
        List fields = descriptorForType.getFields();
        C20074 c20074 = new C20074(fields.size());
        c20074.m45440(m42909(cls));
        int i = C6521.f21970[descriptorForType.mo8528().m23487().ordinal()];
        c20074.m45442(i != 1 ? i != 2 ? EnumC23911.EDITIONS : EnumC23911.PROTO3 : EnumC23911.PROTO2);
        c20074.m45443(descriptorForType.m8525().m29472());
        C17810 c17811 = new C17810();
        Class<?>[] clsArr = null;
        Field fieldM42911 = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < fields.size()) {
            C19741 c19741 = (C19741) fields.get(i2);
            boolean zM44898 = c19741.m44898();
            EnumC19035 enumC19035M44913 = c19741.m44913();
            EnumC19035 enumC19035 = EnumC19035.ENUM;
            ?? c12872 = (enumC19035M44913 == enumC19035 && c19741.m44905()) ? new C12872(c19741) : clsArr;
            if (c19741.m44912() != null) {
                C17560 c17560M41397 = c17811.m41397(cls, c19741.m44906());
                EnumC10464 enumC10464M42908 = m42908(c19741);
                switch (C6521.f21971[enumC10464M42908.m26433().ordinal()]) {
                    case 1:
                        returnType = Boolean.class;
                        break;
                    case 2:
                        returnType = AbstractC23725.class;
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
                            returnType = cls.getDeclaredMethod(m42910(c19741.getType() == EnumC8452.f29320 ? c19741.m44907().getName() : c19741.getName()), clsArr).getReturnType();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid type for oneof: " + enumC10464M42908);
                }
                c20074.m45441(C15403.m36852(c19741.getNumber(), enumC10464M42908, c17560M41397, returnType, zM44898, c12872));
                c17810 = c17811;
            } else {
                EnumC8452 type = c19741.getType();
                EnumC8452 enumC8452 = EnumC8452.f29320;
                String name = type == enumC8452 ? c19741.m44907().getName() : c19741.getName();
                c17810 = c17811;
                Field fieldM42912 = m42911(cls, C22697.m50267(new StringBuilder(), m42906(name, false), f58969.contains(m42906(name, z)) ? "__" : "_"));
                int number = c19741.getNumber();
                EnumC10464 enumC10464M42909 = m42908(c19741);
                if (c19741.m44897()) {
                    if (fieldM42911 == null) {
                        fieldM42911 = m42911(cls, C2271.m6966(i3, "bitField", "_"));
                    }
                    c20074.m45441(c19741.m44914() ? C15403.m36861(fieldM42912, number, enumC10464M42909, fieldM42911, i4, zM44898, c12872) : C15403.m36856(fieldM42912, number, enumC10464M42909, fieldM42911, i4, zM44898, c12872));
                    int i5 = i4 << 1;
                    if (i5 == 0) {
                        i3++;
                        fieldM42911 = null;
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                } else {
                    if (c19741.m44909()) {
                        C19741 c19741M8521 = c19741.m44907().m8521(2);
                        if (c19741M8521.m44913() == enumC19035 && c19741M8521.m44905()) {
                            c3698 = c12872;
                            c3698 = c12872;
                            c3698 = new C3698(c19741M8521);
                        }
                        c3698 = c12872;
                        c3698 = c12872;
                        c3698 = c12872;
                        String name2 = c19741.getName();
                        int i6 = C22896.f74441;
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
                            c15403M36857 = C15403.m36853(fieldM42912, number, C15882.m37771(declaredFields[0]), (InterfaceC6250) c3698);
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    } else if (c19741.mo23408() && c19741.m44913() == EnumC19035.MESSAGE) {
                        try {
                            c15403M36857 = C15403.m36854(fieldM42912, number, enumC10464M42909, cls.getDeclaredMethod(m42910(c19741.getType() == enumC8452 ? c19741.m44907().getName() : c19741.getName()), Integer.TYPE).getReturnType());
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (c19741.mo23406()) {
                        c15403M36857 = c12872 != 0 ? C15403.m36858(fieldM42912, number, enumC10464M42909, c12872, m42911(cls, C22697.m50267(new StringBuilder(), m42906(c19741.getName(), false), "MemoizedSerializedSize"))) : C15403.m36855(fieldM42912, number, enumC10464M42909, m42911(cls, C22697.m50267(new StringBuilder(), m42906(c19741.getName(), false), "MemoizedSerializedSize")));
                    } else {
                        c15403M36857 = c12872 != 0 ? C15403.m36857(fieldM42912, number, enumC10464M42909, (InterfaceC6250) c12872) : C15403.m36859(fieldM42912, number, enumC10464M42909, zM44898);
                    }
                    c20074.m45441(c15403M36857);
                }
            }
            i2++;
            z = true;
            clsArr = null;
            c17811 = c17810;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C19741 c19742 = (C19741) fields.get(i8);
            if (c19742.m44914() || (c19742.m44913() == EnumC19035.MESSAGE && f58970.m47871(c19742.m44907()))) {
                arrayList.add(Integer.valueOf(c19742.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        if (size > 0) {
            c20074.m45444(iArr);
        }
        return c20074.m45439();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1332 m42909(Class cls) {
        try {
            return (InterfaceC1332) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10464 m42908(C19741 c19741) {
        switch (C6521.f21972[c19741.getType().ordinal()]) {
            case 1:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35757 : EnumC10464.f35730;
                }
                return EnumC10464.f35720;
            case 2:
                return c19741.mo23408() ? EnumC10464.f35708 : EnumC10464.f35739;
            case 3:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35716 : EnumC10464.f35712;
                }
                return EnumC10464.f35727;
            case 4:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35718 : EnumC10464.f35710;
                }
                return EnumC10464.f35732;
            case 5:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35735 : EnumC10464.f35706;
                }
                return EnumC10464.f35753;
            case 6:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35755 : EnumC10464.f35722;
                }
                return EnumC10464.f35714;
            case 7:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35747 : EnumC10464.f35752;
                }
                return EnumC10464.f35741;
            case 8:
                return c19741.mo23408() ? EnumC10464.f35725 : EnumC10464.f35748;
            case 9:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35729 : EnumC10464.f35726;
                }
                return EnumC10464.f35749;
            case 10:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35743 : EnumC10464.f35751;
                }
                return EnumC10464.f35724;
            case 11:
                if (c19741.m44909()) {
                    return EnumC10464.f35750;
                }
                return c19741.mo23408() ? EnumC10464.f35744 : EnumC10464.f35705;
            case 12:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35721 : EnumC10464.f35746;
                }
                return EnumC10464.f35734;
            case 13:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35740 : EnumC10464.f35758;
                }
                return EnumC10464.f35731;
            case 14:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35713 : EnumC10464.f35728;
                }
                return EnumC10464.f35709;
            case 15:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35733 : EnumC10464.f35738;
                }
                return EnumC10464.f35717;
            case 16:
                return c19741.mo23408() ? EnumC10464.f35719 : EnumC10464.f35711;
            case 17:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35736 : EnumC10464.f35707;
                }
                return EnumC10464.f35754;
            case 18:
                if (c19741.mo23408()) {
                    return c19741.mo23406() ? EnumC10464.f35756 : EnumC10464.f35723;
                }
                return EnumC10464.f35715;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + c19741.getType());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Field m42911(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbM30914 = C12441.m30914("Unable to find field ", str, " in message class ");
            sbM30914.append(cls.getName());
            throw new IllegalArgumentException(sbM30914.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42905(String str) {
        return m42906(str, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m42910(String str) {
        String strM42906 = m42906(str, false);
        return "get" + Character.toUpperCase(strM42906.charAt(0)) + strM42906.substring(1, strM42906.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42906(String str, boolean z) {
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
