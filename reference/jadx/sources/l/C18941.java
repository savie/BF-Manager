package l;

/* JADX INFO: renamed from: l.ᩴᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18941 extends AbstractC5535 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f61271;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f61272;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f61273;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f61274;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f61275;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f61276;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public String f61277;

    public C18941(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, 0);
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int m43622() {
        return this.f61275;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43620() {
        return this.f61274;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m43623() {
        return this.f61277;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int m43621() {
        return this.f61273;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        int i;
        if (m15239() == 1) {
            this.f61275 = C4850.m13545(0, bArr);
            i = 2;
        } else {
            i = 0;
        }
        m15233(C4850.m13545(i, bArr));
        this.f61274 = (bArr[i + 2] & 1) == 1;
        this.f61272 = C4850.m13545(i + 4, bArr);
        this.f61276 = C4850.m13545(i + 6, bArr);
        return i + 8;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        this.f61271 = this.f61276 + i;
        InterfaceC22180[] interfaceC22180Arr = new C10559[m15237()];
        for (int i3 = 0; i3 < m15237(); i3++) {
            C10559 c10559 = new C10559(m35454(), m35449());
            interfaceC22180Arr[i3] = c10559;
            c10559.mo1805(i, i2, bArr);
            if (this.f61271 >= i && (c10559.m26712() == 0 || this.f61271 < c10559.m26712() + i)) {
                this.f61277 = c10559.m26711();
                this.f61273 = c10559.mo24728();
            }
            i += c10559.m26712();
        }
        m15232(interfaceC22180Arr);
        return m15242();
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        StringBuilder sbM23356 = C9023.m23356(m15239() == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[");
        sbM23356.append(super.toString());
        sbM23356.append(",sid=");
        sbM23356.append(this.f61275);
        sbM23356.append(",searchCount=");
        sbM23356.append(m15237());
        sbM23356.append(",isEndOfSearch=");
        sbM23356.append(this.f61274);
        sbM23356.append(",eaErrorOffset=");
        sbM23356.append(this.f61272);
        sbM23356.append(",lastNameOffset=");
        sbM23356.append(this.f61276);
        sbM23356.append(",lastName=");
        return new String(C22697.m50267(sbM23356, this.f61277, "]"));
    }
}
