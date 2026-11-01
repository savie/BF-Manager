package l;

/* JADX INFO: renamed from: l.ۙᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C4808 extends AbstractC14792 implements InterfaceC14087 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f16899 = C13488.m32997(C4808.class);

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f16900;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C4808(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601, (byte) 4);
        this.f16900 = i;
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4913 mo9821() {
        return (C3501) super.mo9821();
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC9522 mo9821() {
        return (C3501) super.mo9821();
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC14792 mo9821() {
        return (C3501) super.mo9821();
    }

    @Override // l.InterfaceC14087
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 mo13364(InterfaceC19067 interfaceC19067) {
        C3501 c3501 = new C3501(interfaceC19067.mo29449());
        mo24567((InterfaceC4913) c3501);
        return c3501;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f16900, i, bArr);
        int i2 = i + 2;
        if (this.f48373 != null) {
            int i3 = C23964.f77699;
            C4850.m13550(-1L, i2, bArr);
            return 6;
        }
        f16899.mo12127("SmbComClose without a digest");
        return 6;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComClose[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C12441.m30911(this.f16900, ",lastWriteTime=0]", sb));
    }
}
