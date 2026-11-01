package l;

/* JADX INFO: renamed from: l.ۜᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C6956 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f23383 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f23384;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1995[] f23385;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23869[] f23386;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2806 f23387;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1995 m18693(C6956 c6956, C21151 c21151) {
        c6956.getClass();
        if (c21151.m47593() != c6956.f23387) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
        return c6956.f23385[c21151.m47595()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23869 m18695(C6956 c6956, C19741 c19741) {
        c6956.getClass();
        if (c19741.m44910() != c6956.f23387) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (c19741.m44908()) {
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        return c6956.f23386[c19741.m44900()];
    }

    public C6956(C2806 c2806, String[] strArr) {
        this.f23387 = c2806;
        this.f23384 = strArr;
        this.f23386 = new InterfaceC23869[c2806.getFields().size()];
        this.f23385 = new InterfaceC1995[c2806.m8527().size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18696(Class cls, Class cls2) {
        if (this.f23383) {
            return;
        }
        synchronized (this) {
            if (this.f23383) {
                return;
            }
            int length = this.f23386.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                C19741 c19741 = (C19741) this.f23387.getFields().get(i);
                if (c19741.m44906() != null) {
                    int iM47595 = c19741.m44906().m47595() + length;
                    String[] strArr = this.f23384;
                    if (iM47595 < strArr.length) {
                        str = strArr[iM47595];
                    }
                }
                String str2 = str;
                if (c19741.mo23408()) {
                    if (c19741.m44913() == EnumC19035.MESSAGE) {
                        if (c19741.m44909()) {
                            this.f23386[i] = new C14697(c19741, cls);
                        } else {
                            this.f23386[i] = new C11896(cls, cls2, this.f23384[i]);
                        }
                    } else if (c19741.m44913() == EnumC19035.ENUM) {
                        this.f23386[i] = new C3406(c19741, this.f23384[i], cls, cls2);
                    } else {
                        this.f23386[i] = new C14013(cls, cls2, this.f23384[i]);
                    }
                } else if (c19741.m44913() == EnumC19035.MESSAGE) {
                    this.f23386[i] = new C1311(c19741, this.f23384[i], cls, cls2, str2);
                } else if (c19741.m44913() == EnumC19035.ENUM) {
                    this.f23386[i] = new C2722(c19741, this.f23384[i], cls, cls2, str2);
                } else if (c19741.m44913() == EnumC19035.STRING) {
                    this.f23386[i] = new C13307(c19741, this.f23384[i], cls, cls2, str2);
                } else {
                    this.f23386[i] = new C22479(c19741, this.f23384[i], cls, cls2, str2);
                }
                i++;
            }
            for (int i2 = 0; i2 < this.f23387.m8527().size(); i2++) {
                if (i2 < this.f23387.m8534().size()) {
                    this.f23385[i2] = new C9758(this.f23387, this.f23384[i2 + length], cls, cls2);
                } else {
                    this.f23385[i2] = new C4133(this.f23387, i2);
                }
            }
            this.f23383 = true;
            this.f23384 = null;
        }
    }
}
