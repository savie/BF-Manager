package l;

/* JADX INFO: renamed from: l.ᩴۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19567 extends AbstractC1513 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f63091;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f63092;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public int f63093;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f63094;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public String f63095;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public boolean f63096;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f63097;

    public C19567(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, 0);
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int m45157() {
        return this.f63093;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45160() {
        return this.f63096;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m45159() {
        return this.f63095;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int m45158() {
        return this.f63091;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        int i;
        if (m5381() == 1) {
            this.f63093 = C0481.m2318(0, bArr);
            i = 2;
        } else {
            i = 0;
        }
        m5374(C0481.m2318(i, bArr));
        this.f63096 = (bArr[i + 2] & 1) == 1;
        this.f63097 = C0481.m2318(i + 4, bArr);
        this.f63092 = C0481.m2318(i + 6, bArr);
        return i + 8;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        this.f63094 = this.f63092 + i;
        InterfaceC9627[] interfaceC9627Arr = new C1734[m5376()];
        for (int i3 = 0; i3 < m5376(); i3++) {
            C1734 c1734 = new C1734(m12793(), m12781());
            interfaceC9627Arr[i3] = c1734;
            c1734.mo6138(i, i2, bArr);
            if (this.f63094 >= i && (c1734.m6141() == 0 || this.f63094 < c1734.m6141() + i)) {
                this.f63095 = c1734.m6142();
                this.f63091 = c1734.mo6139();
            }
            i += c1734.m6141();
        }
        m5372(interfaceC9627Arr);
        return m5383();
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        StringBuilder sbM27333 = C10732.m27333(m5381() == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[");
        sbM27333.append(super.toString());
        sbM27333.append(",sid=");
        sbM27333.append(this.f63093);
        sbM27333.append(",searchCount=");
        sbM27333.append(m5376());
        sbM27333.append(",isEndOfSearch=");
        sbM27333.append(this.f63096);
        sbM27333.append(",eaErrorOffset=");
        sbM27333.append(this.f63097);
        sbM27333.append(",lastNameOffset=");
        sbM27333.append(this.f63092);
        sbM27333.append(",lastName=");
        return new String(C8947.m23910(sbM27333, this.f63095, "]"));
    }
}
