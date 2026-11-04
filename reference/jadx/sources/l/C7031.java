package l;

/* JADX INFO: renamed from: l.ۜۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7031 implements InterfaceC1615 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f23197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23198;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5344 f23200;

    public C7031(InterfaceC5344 interfaceC5344, boolean z, C1255 c1255, String str) {
        this.f23200 = interfaceC5344;
        this.f23198 = z;
        this.f23197 = c1255;
        this.f23199 = str;
    }

    @Override // l.InterfaceC1615
    /* JADX INFO: renamed from: ᩷ */
    public final C9651 mo5709() {
        C10737 c10737Mo3997 = this.f23200.mo3997();
        mo5707(c10737Mo3997);
        return C16530.m39158(c10737Mo3997);
    }

    @Override // l.InterfaceC1615
    /* JADX INFO: renamed from: ۙ */
    public final void mo5707(C10737 c10737) {
        if (this.f23198) {
            boolean zIsChecked = this.f23197.isChecked();
            String str = this.f23199;
            if (zIsChecked) {
                C22672.m51151(str, c10737);
                return;
            }
            C22672.m51151(str, null);
        }
        InterfaceC18752 interfaceC18752PutBoolean = ApplicationC17729.f58258.edit().putString("auto_signature_key", c10737.m27351()).mo3486(c10737.m27349().ordinal(), "auto_signature_scheme").putBoolean("kv1sd", c10737.m27348());
        if (c10737.m27350() == null) {
            interfaceC18752PutBoolean.remove("v1_signature_filename");
        } else {
            interfaceC18752PutBoolean.putString("v1_signature_filename", c10737.m27350());
        }
        interfaceC18752PutBoolean.apply();
    }

    @Override // l.InterfaceC1615
    /* JADX INFO: renamed from: ܳ */
    public final void mo5708() {
        C10737 c10737Mo3997 = this.f23200.mo3997();
        AbstractC14806 abstractC14806M39159 = C16530.m39159(c10737Mo3997.m27351());
        if (abstractC14806M39159 == null) {
            return;
        }
        abstractC14806M39159.mo31285();
        if (!(abstractC14806M39159 instanceof C12569) || ((C12569) abstractC14806M39159).m31286() == null) {
            mo5707(c10737Mo3997);
        }
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۙ */
    public final C10737 mo3997() {
        return this.f23200.mo3997();
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo3999() {
        return C24736.m55235(((C1065) this.f23200).f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo4001() {
        return C24736.m55236(((C1065) this.f23200).f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ᩴ */
    public final C20774 mo4000() {
        return C24736.m55237(((C1065) this.f23200).f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۙ */
    public final void mo3998(Runnable runnable) {
        ((C1065) this.f23200).mo3998(runnable);
    }
}
