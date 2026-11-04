package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۨۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12131 implements InterfaceC2436 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC4365 f39006;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f39007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f39008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3103 f39009;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39010;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f39011;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f39012;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f39013;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3182 f39014;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f39015;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3509 f39016;

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC2436 mo8212(InterfaceC4365 interfaceC4365) {
        m30325(interfaceC4365);
        return this;
    }

    public C12131(InterfaceC15670 interfaceC15670, InterfaceC1603 interfaceC1603) {
        this.f39007 = interfaceC15670;
        C3509 c3509 = new C3509();
        this.f39016 = c3509;
        C3182 c3182 = new C3182(interfaceC1603, c3509);
        this.f39014 = c3182;
        c3182.m10388(interfaceC15670);
        this.f39008 = -9223372036854775807L;
        this.f39012 = -9223372036854775807L;
        this.f39015 = -9223372036854775807L;
        this.f39011 = -3.4028235E38f;
        this.f39013 = -3.4028235E38f;
        this.f39010 = true;
    }

    @Override // l.InterfaceC2436
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8213(boolean z) {
        this.f39010 = z;
        this.f39014.m10389(z);
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8211(C3509 c3509) {
        this.f39016 = c3509;
        this.f39014.m10386(c3509);
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8210() {
        this.f39014.m10385();
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30325(InterfaceC4365 interfaceC4365) {
        C20782.m47563(interfaceC4365, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f39006 = interfaceC4365;
        this.f39014.m10387(interfaceC4365);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30324(C3103 c3103) {
        this.f39009 = c3103;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13622 mo8214(C14902 c14902) {
        InterfaceC2436 interfaceC2436M10384;
        C3103 c3103;
        C20870 c20870 = c14902.f48681;
        C3716 c3716 = c14902.f48684;
        c20870.getClass();
        C20870 c20871 = c14902.f48681;
        Uri uri = c20871.f66802;
        String str = c20871.f66801;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (C17359.equals(str, "application/x-image-uri")) {
            String str2 = C7116.f23455;
            throw null;
        }
        int iM19466 = C7116.m19466(c20871.f66802, str);
        long j = c20871.f66805;
        C3182 c3182 = this.f39014;
        if (j != -9223372036854775807L) {
            c3182.m10390();
        }
        if (iM19466 == 2 && (c3103 = this.f39009) != null) {
            InterfaceC4365 interfaceC4365 = this.f39006;
            if (interfaceC4365 != null) {
                interfaceC2436M10384 = c3103;
                c3103.m10125(interfaceC4365);
                interfaceC2436M10384 = c3103;
            }
        } else {
            try {
                interfaceC2436M10384 = c3182.m10384(iM19466);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        interfaceC2436M10384 = c3103;
        C23854 c23854M12097 = c3716.m12097();
        if (c3716.f12772 == -9223372036854775807L) {
            c23854M12097.m53202(this.f39008);
        }
        if (c3716.f12774 == -3.4028235E38f) {
            c23854M12097.m53203(this.f39011);
        }
        if (c3716.f12773 == -3.4028235E38f) {
            c23854M12097.m53200(this.f39013);
        }
        if (c3716.f12771 == -9223372036854775807L) {
            c23854M12097.m53204(this.f39012);
        }
        if (c3716.f12770 == -9223372036854775807L) {
            c23854M12097.m53201(this.f39015);
        }
        C3716 c3716M53199 = c23854M12097.m53199();
        if (!c3716M53199.equals(c3716)) {
            C2225 c2225M35851 = c14902.m35851();
            c2225M35851.m7575(c3716M53199);
            c14902 = c2225M35851.m7570();
        }
        C20870 c20872 = c14902.f48681;
        InterfaceC13622 interfaceC13622Mo8214 = interfaceC2436M10384.mo8214(c14902);
        AbstractC1928 abstractC1928 = c20872.f66804;
        if (!abstractC1928.isEmpty()) {
            InterfaceC13622[] interfaceC13622Arr = new InterfaceC13622[abstractC1928.size() + 1];
            interfaceC13622Arr[0] = interfaceC13622Mo8214;
            for (int i = 0; i < abstractC1928.size(); i++) {
                boolean z = this.f39010;
                InterfaceC15670 interfaceC15670 = this.f39007;
                if (z) {
                    C20124 c20124 = new C20124();
                    c20124.m46315(((C4462) abstractC1928.get(i)).f15967);
                    c20124.m46321(((C4462) abstractC1928.get(i)).f15962);
                    c20124.m46294(((C4462) abstractC1928.get(i)).f15964);
                    c20124.m46311(((C4462) abstractC1928.get(i)).f15965);
                    c20124.m46330(((C4462) abstractC1928.get(i)).f15966);
                    c20124.m46309(((C4462) abstractC1928.get(i)).f15961);
                    C15648 c15648M46295 = c20124.m46295();
                    C8160 c8160 = new C8160(interfaceC15670, new C4601(this, c15648M46295));
                    if (this.f39016.mo4645(c15648M46295)) {
                        C20124 c20124M37397 = c15648M46295.m37397();
                        c20124M37397.m46315("application/x-media3-cues");
                        c20124M37397.m46300(c15648M46295.f50848);
                        c20124M37397.m46314(this.f39016.mo4647(c15648M46295));
                        c15648M46295 = c20124M37397.m46295();
                    }
                    c8160.m22074(c15648M46295);
                    InterfaceC4365 interfaceC4366 = this.f39006;
                    if (interfaceC4366 != null) {
                        c8160.m22075(interfaceC4366);
                    }
                    String string = ((C4462) abstractC1928.get(i)).f15963.toString();
                    C2225 c2225 = new C2225();
                    c2225.m7577(string);
                    interfaceC13622Arr[i + 1] = c8160.mo8214(c2225.m7570());
                } else {
                    C11559 c11559 = new C11559(interfaceC15670);
                    InterfaceC4365 interfaceC4367 = this.f39006;
                    if (interfaceC4367 != null) {
                        c11559.m29079(interfaceC4367);
                    }
                    interfaceC13622Arr[i + 1] = c11559.m29078((C4462) abstractC1928.get(i));
                }
            }
            interfaceC13622Mo8214 = new C17109(interfaceC13622Arr);
        }
        C17140 c17140 = c14902.f48680;
        boolean z2 = c17140.f81825;
        long j2 = c17140.f81828;
        long j3 = c17140.f81827;
        if (j3 == 0 && j2 == Long.MIN_VALUE && !z2) {
            return interfaceC13622Mo8214;
        }
        C4674 c4674 = new C4674(interfaceC13622Mo8214);
        c4674.m14535(j3);
        c4674.m14532(j2);
        c4674.m14534(!c17140.f81826);
        c4674.m14533(c17140.f81829);
        c4674.m14537(z2);
        c4674.m14536(c17140.f81824);
        return c4674.m14531();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC22486[] m30323(C12131 c12131, C15648 c15648) {
        InterfaceC22486 c20336;
        if (c12131.f39016.mo4645(c15648)) {
            c20336 = new C18425(c12131.f39016.mo4646(c15648));
        } else {
            c20336 = new C20336(c15648);
        }
        return new InterfaceC22486[]{c20336};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2436 m30322(Class cls, InterfaceC15670 interfaceC15670) {
        try {
            return (InterfaceC2436) cls.getConstructor(InterfaceC15670.class).newInstance(interfaceC15670);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
