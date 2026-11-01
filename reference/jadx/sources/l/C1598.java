package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.֫ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1598 implements InterfaceC23035 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f6459;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f6460;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC14113 f6461;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f6462;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f6463;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f6464;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11053 f6465;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f6466;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23472 f6467;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f6468;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11164 f6469;

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC23035 mo5446(InterfaceC14113 interfaceC14113) {
        m5449(interfaceC14113);
        return this;
    }

    public C1598(InterfaceC20723 interfaceC20723, InterfaceC0166 interfaceC0166) {
        this.f6462 = interfaceC20723;
        C11164 c11164 = new C11164();
        this.f6469 = c11164;
        C23472 c23472 = new C23472(interfaceC0166, c11164);
        this.f6467 = c23472;
        c23472.m51720(interfaceC20723);
        this.f6466 = -9223372036854775807L;
        this.f6468 = -9223372036854775807L;
        this.f6460 = -9223372036854775807L;
        this.f6459 = -3.4028235E38f;
        this.f6463 = -3.4028235E38f;
        this.f6464 = true;
    }

    @Override // l.InterfaceC23035
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23035 mo5447(boolean z) {
        this.f6464 = z;
        this.f6467.m51721(z);
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23035 mo5445(C11164 c11164) {
        this.f6469 = c11164;
        this.f6467.m51718(c11164);
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23035 mo5444() {
        this.f6467.m51717();
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5449(InterfaceC14113 interfaceC14113) {
        C2023.m6505(interfaceC14113, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f6461 = interfaceC14113;
        this.f6467.m51719(interfaceC14113);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5448(C11053 c11053) {
        this.f6465 = c11053;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18095 mo5443(C13689 c13689) {
        InterfaceC23035 interfaceC23035M51716;
        C11053 c11053;
        C14704 c14704 = c13689.f45157;
        C23876 c23876 = c13689.f45158;
        c14704.getClass();
        C14704 c14705 = c13689.f45157;
        Uri uri = c14705.f48029;
        String str = c14705.f48033;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (C13638.equals(str, "application/x-image-uri")) {
            String str2 = C17983.f57504;
            throw null;
        }
        int iM41819 = C17983.m41819(c14705.f48029, str);
        long j = c14705.f48034;
        C23472 c23472 = this.f6467;
        if (j != -9223372036854775807L) {
            c23472.m51722();
        }
        if (iM41819 == 2 && (c11053 = this.f6465) != null) {
            InterfaceC14113 interfaceC14113 = this.f6461;
            if (interfaceC14113 != null) {
                interfaceC23035M51716 = c11053;
                c11053.m27874(interfaceC14113);
                interfaceC23035M51716 = c11053;
            }
        } else {
            try {
                interfaceC23035M51716 = c23472.m51716(iM41819);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        interfaceC23035M51716 = c11053;
        C11176 c11176M52613 = c23876.m52613();
        if (c23876.f77163 == -9223372036854775807L) {
            c11176M52613.m28116(this.f6466);
        }
        if (c23876.f77161 == -3.4028235E38f) {
            c11176M52613.m28117(this.f6459);
        }
        if (c23876.f77165 == -3.4028235E38f) {
            c11176M52613.m28114(this.f6463);
        }
        if (c23876.f77164 == -9223372036854775807L) {
            c11176M52613.m28118(this.f6468);
        }
        if (c23876.f77162 == -9223372036854775807L) {
            c11176M52613.m28115(this.f6460);
        }
        C23876 c23876M28113 = c11176M52613.m28113();
        if (!c23876M28113.equals(c23876)) {
            C20348 c20348M33394 = c13689.m33394();
            c20348M33394.m45920(c23876M28113);
            c13689 = c20348M33394.m45915();
        }
        C14704 c14706 = c13689.f45157;
        InterfaceC18095 interfaceC18095Mo5443 = interfaceC23035M51716.mo5443(c13689);
        AbstractC22433 abstractC22433 = c14706.f48032;
        if (!abstractC22433.isEmpty()) {
            InterfaceC18095[] interfaceC18095Arr = new InterfaceC18095[abstractC22433.size() + 1];
            interfaceC18095Arr[0] = interfaceC18095Mo5443;
            for (int i = 0; i < abstractC22433.size(); i++) {
                boolean z = this.f6464;
                InterfaceC20723 interfaceC20723 = this.f6462;
                if (z) {
                    C10471 c10471 = new C10471();
                    c10471.m26533(((C4515) abstractC22433.get(i)).f16066);
                    c10471.m26509(((C4515) abstractC22433.get(i)).f16069);
                    c10471.m26530(((C4515) abstractC22433.get(i)).f16071);
                    c10471.m26513(((C4515) abstractC22433.get(i)).f16068);
                    c10471.m26495(((C4515) abstractC22433.get(i)).f16070);
                    c10471.m26516(((C4515) abstractC22433.get(i)).f16067);
                    C7648 c7648M26497 = c10471.m26497();
                    C22267 c22267 = new C22267(interfaceC20723, new C13228(this, c7648M26497));
                    if (this.f6469.mo4660(c7648M26497)) {
                        C10471 c10471M20201 = c7648M26497.m20201();
                        c10471M20201.m26533("application/x-media3-cues");
                        c10471M20201.m26502(c7648M26497.f25265);
                        c10471M20201.m26532(this.f6469.mo4662(c7648M26497));
                        c7648M26497 = c10471M20201.m26497();
                    }
                    c22267.m49433(c7648M26497);
                    InterfaceC14113 interfaceC14114 = this.f6461;
                    if (interfaceC14114 != null) {
                        c22267.m49434(interfaceC14114);
                    }
                    String string = ((C4515) abstractC22433.get(i)).f16065.toString();
                    C20348 c20348 = new C20348();
                    c20348.m45922(string);
                    interfaceC18095Arr[i + 1] = c22267.mo5443(c20348.m45915());
                } else {
                    C0394 c0394 = new C0394(interfaceC20723);
                    InterfaceC14113 interfaceC14115 = this.f6461;
                    if (interfaceC14115 != null) {
                        c0394.m2122(interfaceC14115);
                    }
                    interfaceC18095Arr[i + 1] = c0394.m2121((C4515) abstractC22433.get(i));
                }
            }
            interfaceC18095Mo5443 = new C12452(interfaceC18095Arr);
        }
        C12587 c12587 = c13689.f45155;
        boolean z2 = c12587.f53845;
        long j2 = c12587.f53846;
        long j3 = c12587.f53844;
        if (j3 == 0 && j2 == Long.MIN_VALUE && !z2) {
            return interfaceC18095Mo5443;
        }
        C18532 c18532 = new C18532(interfaceC18095Mo5443);
        c18532.m42930(j3);
        c18532.m42927(j2);
        c18532.m42929(!c12587.f53847);
        c18532.m42928(c12587.f53842);
        c18532.m42925(z2);
        c18532.m42931(c12587.f53843);
        return c18532.m42926();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC10045[] m5442(C1598 c1598, C7648 c7648) {
        InterfaceC10045 c14300;
        if (c1598.f6469.mo4660(c7648)) {
            c14300 = new C11891(c1598.f6469.mo4661(c7648));
        } else {
            c14300 = new C14300(c7648);
        }
        return new InterfaceC10045[]{c14300};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23035 m5441(Class cls, InterfaceC20723 interfaceC20723) {
        try {
            return (InterfaceC23035) cls.getConstructor(InterfaceC20723.class).newInstance(interfaceC20723);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
