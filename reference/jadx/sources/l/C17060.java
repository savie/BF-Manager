package l;

/* JADX INFO: renamed from: l.ܺ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9GZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17060 extends AbstractC16314 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f55719 = C16980.m40037(C17060.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23028 f55720;

    public C17060(C23028 c23028) {
        this.f55720 = c23028;
    }

    @Override // l.AbstractC16314
    /* JADX INFO: renamed from: ۙ */
    public final void mo11782(C4514 c4514) {
        int iM43465 = ((C18684) c4514.m49391()).m43465();
        C23028 c23028 = this.f55720;
        c23028.m51928(iM43465);
        f55719.mo13725("Server granted us {} credits for {}, now available: {} credits", Integer.valueOf(((C18684) c4514.m49391()).m43465()), c4514, Integer.valueOf(c23028.m51927()));
        this.f42518.m32898(c4514);
    }
}
