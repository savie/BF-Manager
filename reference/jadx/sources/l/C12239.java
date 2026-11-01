package l;

/* JADX INFO: renamed from: l.۫ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12239 extends AbstractC21682 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5888 f40970;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20809 f40971;

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ */
    public final void mo27878(byte[] bArr) {
        this.f40971.m46794(0, bArr.length, bArr);
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ */
    public final void mo27877(AbstractC11242 abstractC11242) {
        byte[] bArrMo28214 = abstractC11242.mo28214();
        this.f40971.m46794(abstractC11242.mo28207(), abstractC11242.mo28217(), bArrMo28214);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12239(C5888 c5888, C23800 c23800) {
        super(c23800);
        this.f40970 = c5888;
        this.f40971 = new C20809(64);
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo30442(AbstractC16579 abstractC16579) {
        int i = C16472.f52932[abstractC16579.mo1933().ordinal()];
        if (i == 1 || i == 2) {
            mo30442(this.f40970.f20084.m52402(((C12011) abstractC16579).f53121));
        } else {
            super.mo30442(abstractC16579);
        }
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ */
    public final void mo27876(char c) {
        this.f40971.m46793(c);
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30441(C22492 c22492) {
        this.f40970.m16115(c22492);
    }
}
