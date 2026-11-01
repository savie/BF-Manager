package l;

import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩷ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20799 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m46781(Collection collection) {
        long value = 0;
        for (Object obj : collection) {
            if (obj instanceof InterfaceC15861) {
                value |= ((InterfaceC15861) obj).getValue();
            } else {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m46782(long j, Class cls) {
        if (!InterfaceC15861.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if (m46784(j, (InterfaceC15861) obj)) {
                enumSetNoneOf.add(obj);
            }
        }
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46784(long j, InterfaceC15861 interfaceC15861) {
        return (j & interfaceC15861.getValue()) > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15861 m46783(long j, Class cls, EnumC3055 enumC3055) {
        for (InterfaceC15861 interfaceC15861 : (InterfaceC15861[]) cls.getEnumConstants()) {
            if (interfaceC15861.getValue() == j) {
                return interfaceC15861;
            }
        }
        return enumC3055;
    }
}
