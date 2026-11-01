package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 59A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12509 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Class f41870;

    public C12509(Enum[] enumArr) {
        C13465.m32966(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        C13465.m32962(componentType);
        this.f41870 = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f41870.getEnumConstants();
        C13465.m32967(enumConstants, "getEnumConstants(...)");
        return C0513.m2406((Enum[]) enumConstants);
    }
}
