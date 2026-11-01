package l;

/* JADX INFO: renamed from: l.ܺ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15820 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C10175 f51201 = new C10175();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20758 f51202;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6667 m37601(Class cls) {
        C22896.m50665(cls);
        InterfaceC13328 interfaceC13328Mo11796 = this.f51202.mo11796(cls);
        if (interfaceC13328Mo11796.mo1955()) {
            if (AbstractC16129.class.isAssignableFrom(cls)) {
                return C16150.m38234(C22896.m50675(), C6935.m18596(), interfaceC13328Mo11796.mo1958());
            }
            return C16150.m38234(C22896.m50662(), C6935.m18595(), interfaceC13328Mo11796.mo1958());
        }
        if (AbstractC16129.class.isAssignableFrom(cls)) {
            if (C7352.f24416[interfaceC13328Mo11796.mo1957().ordinal()] != 1) {
                return C21088.m47501(interfaceC13328Mo11796, C12622.m31407(), AbstractC19347.m44353(), C22896.m50675(), C6935.m18596(), C5566.m15357());
            }
            return C21088.m47501(interfaceC13328Mo11796, C12622.m31407(), AbstractC19347.m44353(), C22896.m50675(), null, C5566.m15357());
        }
        if (C7352.f24416[interfaceC13328Mo11796.mo1957().ordinal()] != 1) {
            return C21088.m47501(interfaceC13328Mo11796, C12622.m31406(), AbstractC19347.m44352(), C22896.m50662(), C6935.m18595(), C5566.m15356());
        }
        return C21088.m47501(interfaceC13328Mo11796, C12622.m31406(), AbstractC19347.m44352(), C22896.m50662(), null, C5566.m15356());
    }

    public C15820() {
        InterfaceC4154 interfaceC4154;
        C18951 c18951M43653 = C18951.m43653();
        try {
            int i = C18516.f58968;
            interfaceC4154 = (InterfaceC4154) C18516.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC4154 = f51201;
        }
        C20758 c20758 = new C20758(c18951M43653, interfaceC4154);
        byte[] bArr = C9779.f33478;
        this.f51202 = c20758;
    }
}
