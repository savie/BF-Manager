package l;

/* JADX INFO: renamed from: l.ܽܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f58235;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 f58236;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f58238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C25183 f58240;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f58242;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f58244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f58245;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58246;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9518 f58247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1316 f58239 = new C1316();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21287 f58243 = new C21287();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21287 f58237 = new C21287(1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21287 f58241 = new C21287();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m41507() {
        C1316 c1316 = this.f58239;
        c1316.f4744 = 0;
        c1316.f4740 = 0L;
        c1316.f4736 = false;
        c1316.f4733 = false;
        c1316.f4729 = false;
        c1316.f4737 = null;
        this.f58238 = 0;
        this.f58246 = 0;
        this.f58245 = 0;
        this.f58235 = 0;
        this.f58244 = false;
    }

    public C17723(InterfaceC22024 interfaceC22024, C9518 c9518, C25183 c25183, C15648 c15648) {
        this.f58242 = interfaceC22024;
        this.f58247 = c9518;
        this.f58240 = c25183;
        this.f58236 = c15648;
        m41504(c9518, c25183);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41504(C9518 c9518, C25183 c25183) {
        this.f58247 = c9518;
        this.f58240 = c25183;
        this.f58242.mo14384(this.f58236);
        m41507();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41505(C22362 c22362) {
        C19215 c19215 = this.f58247.f30825;
        C25183 c25183 = this.f58239.f4743;
        String str = C7116.f23455;
        C10264 c10264M44550 = c19215.m44550(c25183.f81396);
        C22362 c22362M50439 = c22362.m50439(c10264M44550 != null ? c10264M44550.f32791 : null);
        C20124 c20124M37397 = this.f58236.m37397();
        c20124M37397.m46304(c22362M50439);
        this.f58242.mo14384(c20124M37397.m46295());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m41506() {
        if (!this.f58244) {
            return this.f58247.f30827[this.f58238];
        }
        return this.f58239.f4738[this.f58238];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m41510() {
        if (!this.f58244) {
            return this.f58247.f30831[this.f58238];
        }
        return this.f58239.f4730[this.f58246];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41511() {
        if (!this.f58244) {
            return this.f58247.f30828[this.f58238];
        }
        return this.f58239.f4739[this.f58238];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41502() {
        int i;
        if (!this.f58244) {
            i = this.f58247.f30830[this.f58238];
        } else {
            i = this.f58239.f4745[this.f58238] ? 1 : 0;
        }
        return m41509() != null ? i | 1073741824 : i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m41508() {
        this.f58238++;
        if (!this.f58244) {
            return false;
        }
        int i = this.f58245 + 1;
        this.f58245 = i;
        int[] iArr = this.f58239.f4741;
        int i2 = this.f58246;
        if (i != iArr[i2]) {
            return true;
        }
        this.f58246 = i2 + 1;
        this.f58245 = 0;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41503(int i, int i2) {
        C21287 c21287;
        C10264 c10264M41509 = m41509();
        if (c10264M41509 == null) {
            return 0;
        }
        int length = c10264M41509.f32793;
        C1316 c1316 = this.f58239;
        if (length != 0) {
            c21287 = c1316.f4732;
        } else {
            byte[] bArr = c10264M41509.f32792;
            String str = C7116.f23455;
            int length2 = bArr.length;
            C21287 c21288 = this.f58241;
            c21288.m48491(length2, bArr);
            length = bArr.length;
            c21287 = c21288;
        }
        boolean z = c1316.f4733 && c1316.f4734[this.f58238];
        boolean z2 = z || i2 != 0;
        C21287 c21289 = this.f58237;
        c21289.m48497()[0] = (byte) ((z2 ? 128 : 0) | length);
        c21289.m48510(0);
        InterfaceC22024 interfaceC22024 = this.f58242;
        interfaceC22024.mo14385(c21289, 1, 1);
        interfaceC22024.mo14385(c21287, length, 1);
        if (!z2) {
            return length + 1;
        }
        C21287 c212810 = this.f58243;
        if (!z) {
            c212810.m48496(8);
            byte[] bArrM48497 = c212810.m48497();
            bArrM48497[0] = 0;
            bArrM48497[1] = 1;
            bArrM48497[2] = (byte) 0;
            bArrM48497[3] = (byte) (i2 & 255);
            bArrM48497[4] = (byte) ((i >> 24) & 255);
            bArrM48497[5] = (byte) ((i >> 16) & 255);
            bArrM48497[6] = (byte) ((i >> 8) & 255);
            bArrM48497[7] = (byte) (i & 255);
            interfaceC22024.mo14385(c212810, 8, 1);
            return length + 9;
        }
        C21287 c212811 = c1316.f4732;
        int iM48494 = c212811.m48494();
        c212811.m48503(-2);
        int i3 = (iM48494 * 6) + 2;
        if (i2 != 0) {
            c212810.m48496(i3);
            byte[] bArrM48498 = c212810.m48497();
            c212811.m48490(0, i3, bArrM48498);
            int i4 = (((bArrM48498[2] & 255) << 8) | (bArrM48498[3] & 255)) + i2;
            bArrM48498[2] = (byte) ((i4 >> 8) & 255);
            bArrM48498[3] = (byte) (i4 & 255);
        } else {
            c212810 = c212811;
        }
        interfaceC22024.mo14385(c212810, i3, 1);
        return length + 1 + i3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10264 m41509() {
        if (!this.f58244) {
            return null;
        }
        C1316 c1316 = this.f58239;
        C25183 c25183 = c1316.f4743;
        String str = C7116.f23455;
        int i = c25183.f81396;
        C10264 c10264M44550 = c1316.f4737;
        if (c10264M44550 == null) {
            c10264M44550 = this.f58247.f30825.m44550(i);
        }
        if (c10264M44550 == null || !c10264M44550.f32790) {
            return null;
        }
        return c10264M44550;
    }
}
