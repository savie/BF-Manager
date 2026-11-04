package l;

/* JADX INFO: renamed from: l.ܿ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18666 extends AbstractC1513 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f60698 = C16980.m40037(C18666.class);

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f60699;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public String f60700;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f60701;

    public C18666(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m43421() {
        return this.f60700;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        m5382(C0481.m2318(0, bArr));
        this.f60701 = C0481.m2318(2, bArr);
        m5374(C0481.m2318(4, bArr));
        this.f60699 = C0481.m2318(6, bArr);
        return 8;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        InterfaceC9627[] interfaceC9627Arr = new C21650[m5376()];
        int i3 = i;
        C21650 c21650 = null;
        for (int i4 = 0; i4 < m5376(); i4++) {
            c21650 = new C21650();
            interfaceC9627Arr[i4] = c21650;
            c21650.f69119 = m12760(false, i3, 16, bArr);
            c21650.f69115 = bArr[i3 + 16] & 255;
            c21650.f69116 = bArr[i3 + 17] & 255;
            c21650.f69118 = C0481.m2322(i3 + 18, bArr);
            int iM2322 = C0481.m2322(i3 + 22, bArr);
            i3 += 26;
            c21650.f69117 = m12760(false, ((iM2322 & 65535) - this.f60701) + i, 48, bArr);
            InterfaceC25186 interfaceC25186 = f60698;
            if (interfaceC25186.mo13713()) {
                interfaceC25186.mo13717(c21650.toString());
            }
        }
        m5372(interfaceC9627Arr);
        this.f60700 = c21650 != null ? c21650.f69119 : null;
        return i3 - i;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2Response[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m5375());
        sb.append(",converter=");
        sb.append(this.f60701);
        sb.append(",entriesReturned=");
        sb.append(m5376());
        sb.append(",totalAvailableEntries=");
        sb.append(this.f60699);
        sb.append(",lastName=");
        return new String(C8947.m23910(sb, this.f60700, "]"));
    }
}
