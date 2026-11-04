package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9298 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f30233;

    public C9298(Enum[] enumArr) {
        C15243.m36590(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        C15243.m36586(componentType);
        this.f30233 = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f30233.getEnumConstants();
        C15243.m36591(enumConstants, "getEnumConstants(...)");
        return C10044.m25933((Enum[]) enumConstants);
    }
}
