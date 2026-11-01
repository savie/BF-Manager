package l;

/* JADX INFO: renamed from: l.ܰᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 29T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14003 extends AbstractC5535 {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f46018 = C13488.m32997(C14003.class);

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f46019;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f46020;

    public C14003(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        m15241(C4850.m13545(0, bArr));
        this.f46019 = C4850.m13545(2, bArr);
        m15233(C4850.m13545(4, bArr));
        this.f46020 = C4850.m13545(6, bArr);
        return 8;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        m35453(false);
        InterfaceC22180[] interfaceC22180Arr = new C11886[m15237()];
        int i3 = i;
        for (int i4 = 0; i4 < m15237(); i4++) {
            C11886 c11886 = new C11886();
            interfaceC22180Arr[i4] = c11886;
            c11886.f39881 = m35442(false, i3, 13, bArr);
            c11886.f39880 = C4850.m13545(i3 + 14, bArr);
            int iM13549 = C4850.m13549(i3 + 16, bArr);
            i3 += 20;
            c11886.f39882 = m35442(false, ((iM13549 & 65535) - this.f46019) + i, 128, bArr);
            InterfaceC4314 interfaceC4314 = f46018;
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(c11886.toString());
            }
        }
        m15232(interfaceC22180Arr);
        return i3 - i;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetShareEnumResponse[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m15238());
        sb.append(",converter=");
        sb.append(this.f46019);
        sb.append(",entriesReturned=");
        sb.append(m15237());
        sb.append(",totalAvailableEntries=");
        return new String(C12441.m30911(this.f46020, "]", sb));
    }
}
