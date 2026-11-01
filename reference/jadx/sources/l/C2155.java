package l;

/* JADX INFO: renamed from: l.֫᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2155 implements InterfaceC13175 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1179 f7831;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f7832;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7833;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7834;

    public C2155(InterfaceC1179 interfaceC1179, boolean z, C12562 c12562, String str) {
        this.f7831 = interfaceC1179;
        this.f7833 = z;
        this.f7832 = c12562;
        this.f7834 = str;
    }

    @Override // l.InterfaceC13175
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14558 mo6720() {
        C11392 c11392Mo4314 = this.f7831.mo4314();
        mo6719(c11392Mo4314);
        return C23053.m50995(c11392Mo4314);
    }

    @Override // l.InterfaceC13175
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6719(C11392 c11392) {
        if (this.f7833) {
            boolean zIsChecked = this.f7832.isChecked();
            String str = this.f7834;
            if (zIsChecked) {
                C2218.m6839(str, c11392);
                return;
            }
            C2218.m6839(str, null);
        }
        InterfaceC17314 interfaceC17314PutBoolean = ApplicationC0716.f2992.edit().putString("auto_signature_key", c11392.m28501()).mo4065(c11392.m28499().ordinal(), "auto_signature_scheme").putBoolean("kv1sd", c11392.m28500());
        if (c11392.m28502() == null) {
            interfaceC17314PutBoolean.remove("v1_signature_filename");
        } else {
            interfaceC17314PutBoolean.putString("v1_signature_filename", c11392.m28502());
        }
        interfaceC17314PutBoolean.apply();
    }

    @Override // l.InterfaceC13175
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo6721() {
        C11392 c11392Mo4314 = this.f7831.mo4314();
        AbstractC17131 abstractC17131M50996 = C23053.m50996(c11392Mo4314.m28501());
        if (abstractC17131M50996 == null) {
            return;
        }
        abstractC17131M50996.mo40010();
        if (!(abstractC17131M50996 instanceof C19954) || ((C19954) abstractC17131M50996).m45250() == null) {
            mo6719(c11392Mo4314);
        }
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final C11392 mo4314() {
        return this.f7831.mo4314();
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4317() {
        return C6824.m18428(((C6389) this.f7831).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo4313() {
        return C6824.m18430(((C6389) this.f7831).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۚ */
    public final C15721 mo4316() {
        return C6824.m18431(((C6389) this.f7831).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final void mo4315(Runnable runnable) {
        ((C6389) this.f7831).mo4315(runnable);
    }
}
