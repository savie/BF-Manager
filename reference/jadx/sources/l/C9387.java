package l;

/* JADX INFO: renamed from: l.ۢۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R85J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9387 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f31772;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f31773;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f31774 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0130 f31775;

    static {
        int i = 0;
        f31772 = new C1624(i);
        f31773 = new C1624(i);
    }

    public C9387(C0130 c0130) {
        this.f31775 = c0130;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        InterfaceC15654 interfaceC15654 = (InterfaceC15654) c11730.m29316().getAnnotation(InterfaceC15654.class);
        if (interfaceC15654 == null) {
            return null;
        }
        return m24080(this.f31775, c6044, c11730, interfaceC15654, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 m24080(C0130 c0130, C6044 c6044, C11730 c11730, InterfaceC15654 interfaceC15654, boolean z) {
        InterfaceC20592 interfaceC20592;
        AbstractC7186 c21172;
        Object objMo1620 = c0130.m1197(C11730.m29313(interfaceC15654.value()), true).mo1620();
        boolean zNullSafe = interfaceC15654.nullSafe();
        if (objMo1620 instanceof AbstractC7186) {
            c21172 = (AbstractC7186) objMo1620;
        } else if (objMo1620 instanceof InterfaceC20592) {
            InterfaceC20592 interfaceC20593 = (InterfaceC20592) objMo1620;
            if (z) {
                InterfaceC20592 interfaceC20594 = (InterfaceC20592) this.f31774.putIfAbsent(c11730.m29316(), interfaceC20593);
                if (interfaceC20594 != null) {
                    interfaceC20593 = interfaceC20594;
                }
            }
            c21172 = interfaceC20593.mo5183(c6044, c11730);
        } else {
            boolean z2 = objMo1620 instanceof InterfaceC5069;
            if (z2 || (objMo1620 instanceof InterfaceC14512)) {
                InterfaceC5069 interfaceC5069 = z2 ? (InterfaceC5069) objMo1620 : null;
                InterfaceC14512 interfaceC14512 = objMo1620 instanceof InterfaceC14512 ? (InterfaceC14512) objMo1620 : null;
                if (z) {
                    interfaceC20592 = f31772;
                } else {
                    interfaceC20592 = f31773;
                }
                c21172 = new C21172(interfaceC5069, interfaceC14512, c6044, c11730, interfaceC20592, zNullSafe);
                zNullSafe = false;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo1620.getClass().getName() + " as a @JsonAdapter for " + c11730.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (c21172 == null || !zNullSafe) ? c21172 : c21172.m19120();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24081(InterfaceC20592 interfaceC20592, C11730 c11730) {
        C13638.requireNonNull(c11730);
        C13638.requireNonNull(interfaceC20592);
        if (interfaceC20592 != f31772) {
            Class clsM29316 = c11730.m29316();
            ConcurrentMapC13783 concurrentMapC13783 = this.f31774;
            InterfaceC20592 interfaceC20593 = (InterfaceC20592) concurrentMapC13783.get(clsM29316);
            if (interfaceC20593 == null) {
                InterfaceC15654 interfaceC15654 = (InterfaceC15654) clsM29316.getAnnotation(InterfaceC15654.class);
                if (interfaceC15654 == null) {
                    return false;
                }
                Class clsValue = interfaceC15654.value();
                if (!InterfaceC20592.class.isAssignableFrom(clsValue)) {
                    return false;
                }
                InterfaceC20592 interfaceC20594 = (InterfaceC20592) this.f31775.m1197(C11730.m29313(clsValue), true).mo1620();
                InterfaceC20592 interfaceC20595 = (InterfaceC20592) concurrentMapC13783.putIfAbsent(clsM29316, interfaceC20594);
                if (interfaceC20595 != null) {
                    interfaceC20594 = interfaceC20595;
                }
                if (interfaceC20594 != interfaceC20592) {
                    return false;
                }
            } else if (interfaceC20593 != interfaceC20592) {
                return false;
            }
        }
        return true;
    }
}
