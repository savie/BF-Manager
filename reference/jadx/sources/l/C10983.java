package l;

/* JADX INFO: renamed from: l.ۤܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9KD */
/* JADX INFO: loaded from: classes4.dex */
public final class C10983 extends C24652 {
    public C10983(EnumC15700 enumC15700, long j, long j2, long j3) {
        super(enumC15700, EnumC23906.SMB2_CANCEL, j);
        ((C18684) this.f16383).m43467(j2);
        if (j3 != 0) {
            ((C18684) this.f16383).m43469(EnumC12717.SMB2_FLAGS_ASYNC_COMMAND);
            ((C18684) this.f16383).m43453(j3);
        }
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        c7453.m20461();
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        c7453.m56017();
        c7453.m56021(2);
    }
}
