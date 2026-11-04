package l;

import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۤܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10961 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m27791(Collection collection) {
        long value = 0;
        for (Object obj : collection) {
            if (obj instanceof InterfaceC22896) {
                value |= ((InterfaceC22896) obj).getValue();
            } else {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m27792(long j, Class cls) {
        if (!InterfaceC22896.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if (m27794(j, (InterfaceC22896) obj)) {
                enumSetNoneOf.add(obj);
            }
        }
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27794(long j, InterfaceC22896 interfaceC22896) {
        return (j & interfaceC22896.getValue()) > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22896 m27793(long j, Class cls, EnumC20243 enumC20243) {
        for (InterfaceC22896 interfaceC22896 : (InterfaceC22896[]) cls.getEnumConstants()) {
            if (interfaceC22896.getValue() == j) {
                return interfaceC22896;
            }
        }
        return enumC20243;
    }
}
