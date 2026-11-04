package l;

/* JADX INFO: renamed from: l.۟᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8225 extends AbstractC1513 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f27073 = C16980.m40037(C8225.class);

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f27074;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f27075;

    public C8225(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        m5382(C0481.m2318(0, bArr));
        this.f27075 = C0481.m2318(2, bArr);
        m5374(C0481.m2318(4, bArr));
        this.f27074 = C0481.m2318(6, bArr);
        return 8;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        m12792(false);
        InterfaceC9627[] interfaceC9627Arr = new C19412[m5376()];
        int i3 = i;
        for (int i4 = 0; i4 < m5376(); i4++) {
            C19412 c19412 = new C19412();
            interfaceC9627Arr[i4] = c19412;
            c19412.f62745 = m12760(false, i3, 13, bArr);
            c19412.f62746 = C0481.m2318(i3 + 14, bArr);
            int iM2322 = C0481.m2322(i3 + 16, bArr);
            i3 += 20;
            c19412.f62747 = m12760(false, ((iM2322 & 65535) - this.f27075) + i, 128, bArr);
            InterfaceC25186 interfaceC25186 = f27073;
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(c19412.toString());
            }
        }
        m5372(interfaceC9627Arr);
        return i3 - i;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetShareEnumResponse[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m5375());
        sb.append(",converter=");
        sb.append(this.f27075);
        sb.append(",entriesReturned=");
        sb.append(m5376());
        sb.append(",totalAvailableEntries=");
        return new String(C12669.m31437(this.f27074, "]", sb));
    }
}
