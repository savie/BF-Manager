package l;

/* JADX INFO: renamed from: l.ۗᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396 extends AbstractC5535 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f12535 = C13488.m32997(C3396.class);

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f12536;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public String f12537;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f12538;

    public C3396(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m10068() {
        return this.f12537;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        m15241(C4850.m13545(0, bArr));
        this.f12536 = C4850.m13545(2, bArr);
        m15233(C4850.m13545(4, bArr));
        this.f12538 = C4850.m13545(6, bArr);
        return 8;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        InterfaceC22180[] interfaceC22180Arr = new C9748[m15237()];
        int i3 = i;
        C9748 c9748 = null;
        for (int i4 = 0; i4 < m15237(); i4++) {
            c9748 = new C9748();
            interfaceC22180Arr[i4] = c9748;
            c9748.f32801 = m35442(false, i3, 16, bArr);
            c9748.f32800 = bArr[i3 + 16] & 255;
            c9748.f32798 = bArr[i3 + 17] & 255;
            c9748.f32797 = C4850.m13549(i3 + 18, bArr);
            int iM13549 = C4850.m13549(i3 + 22, bArr);
            i3 += 26;
            c9748.f32799 = m35442(false, ((iM13549 & 65535) - this.f12536) + i, 48, bArr);
            InterfaceC4314 interfaceC4314 = f12535;
            if (interfaceC4314.mo12133()) {
                interfaceC4314.mo12127(c9748.toString());
            }
        }
        m15232(interfaceC22180Arr);
        this.f12537 = c9748 != null ? c9748.f32801 : null;
        return i3 - i;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2Response[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m15238());
        sb.append(",converter=");
        sb.append(this.f12536);
        sb.append(",entriesReturned=");
        sb.append(m15237());
        sb.append(",totalAvailableEntries=");
        sb.append(this.f12538);
        sb.append(",lastName=");
        return new String(C22697.m50267(sb, this.f12537, "]"));
    }
}
