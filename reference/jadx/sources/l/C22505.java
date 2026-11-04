package l;

/* JADX INFO: renamed from: l.᩸ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes.dex */
public final class C22505 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4605 f72807 = new C4605();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10570 f72808;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7762 m50745(Class cls) {
        C18949.m43984(cls);
        InterfaceC18029 interfaceC18029Mo1287 = this.f72808.mo1287(cls);
        if (interfaceC18029Mo1287.mo36490()) {
            if (AbstractC22701.class.isAssignableFrom(cls)) {
                return C22679.m51164(C18949.m44001(), C7806.m21281(), interfaceC18029Mo1287.mo36493());
            }
            return C22679.m51164(C18949.m43981(), C7806.m21280(), interfaceC18029Mo1287.mo36493());
        }
        if (AbstractC22701.class.isAssignableFrom(cls)) {
            if (C21759.f69402[interfaceC18029Mo1287.mo36491().ordinal()] != 1) {
                return C10744.m27358(interfaceC18029Mo1287, C5525.m16442(), AbstractC7038.m19362(), C18949.m44001(), C7806.m21281(), C3859.m12491());
            }
            return C10744.m27358(interfaceC18029Mo1287, C5525.m16442(), AbstractC7038.m19362(), C18949.m44001(), null, C3859.m12491());
        }
        if (C21759.f69402[interfaceC18029Mo1287.mo36491().ordinal()] != 1) {
            return C10744.m27358(interfaceC18029Mo1287, C5525.m16441(), AbstractC7038.m19361(), C18949.m43981(), C7806.m21280(), C3859.m12490());
        }
        return C10744.m27358(interfaceC18029Mo1287, C5525.m16441(), AbstractC7038.m19361(), C18949.m43981(), null, C3859.m12490());
    }

    public C22505() {
        InterfaceC0130 interfaceC0130;
        C2324 c2324M7830 = C2324.m7830();
        try {
            int i = C2914.f9525;
            interfaceC0130 = (InterfaceC0130) C2914.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC0130 = f72807;
        }
        C10570 c10570 = new C10570(c2324M7830, interfaceC0130);
        byte[] bArr = C23447.f75887;
        this.f72808 = c10570;
    }
}
