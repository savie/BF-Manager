package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13109 implements InterfaceC17649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6398 f41891;

    public C13109(InterfaceC6398 interfaceC6398) {
        this.f41891 = interfaceC6398;
    }

    @Override // l.InterfaceC17649
    /* JADX INFO: renamed from: ۙ */
    public final C9444 mo19233(C4688 c4688) {
        InterfaceC7099 interfaceC7099Mo16639;
        InterfaceC6398 interfaceC6398 = this.f41891;
        C9444 c9444Mo18164 = interfaceC6398 != null ? interfaceC6398.mo18164(c4688.m14558()) : null;
        C11617 c11617M6600 = new C1923(System.currentTimeMillis(), c4688.m14558(), c9444Mo18164).m6600();
        C7954 c7954 = c11617M6600.f36450;
        C9444 c9444 = c11617M6600.f36449;
        if (interfaceC6398 != null) {
            interfaceC6398.mo18163(c11617M6600);
        }
        if (c9444Mo18164 != null && c9444 == null) {
            C19822.m45601(c9444Mo18164.m24818());
        }
        if (c7954 == null && c9444 == null) {
            C1242 c1242 = new C1242();
            c1242.m4485(c4688.m14558());
            c1242.m4483(EnumC4225.HTTP_1_1);
            c1242.m4480(504);
            c1242.m4492("Unsatisfiable Request (only-if-cached)");
            c1242.m4486(C19822.f63717);
            c1242.m4491(-1L);
            c1242.m4481(System.currentTimeMillis());
            return c1242.m4479();
        }
        if (c7954 == null) {
            C1242 c1242M24824 = c9444.m24824();
            c1242M24824.m4487(m32572(c9444));
            return c1242M24824.m4479();
        }
        try {
            C9444 c9444M14554 = c4688.m14554(c7954);
            if (c9444M14554 == null && c9444Mo18164 != null) {
                C19822.m45601(c9444Mo18164.m24818());
            }
            if (c9444 != null) {
                if (c9444M14554.m24820() == 304) {
                    C1242 c1242M24825 = c9444.m24824();
                    C11682 c11682M24822 = c9444.m24822();
                    C11682 c11682M24823 = c9444M14554.m24822();
                    C1988 c1988 = new C1988();
                    int iM29363 = c11682M24822.m29363();
                    for (int i = 0; i < iM29363; i++) {
                        String strM29360 = c11682M24822.m29360(i);
                        String strM29364 = c11682M24822.m29364(i);
                        if ((!"Warning".equalsIgnoreCase(strM29360) || !strM29364.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM29360) || "Content-Encoding".equalsIgnoreCase(strM29360) || "Content-Type".equalsIgnoreCase(strM29360) || !m32573(strM29360) || c11682M24823.m29361(strM29360) == null)) {
                            AbstractC4906.f17137.mo15057(c1988, strM29360, strM29364);
                        }
                    }
                    int iM29364 = c11682M24823.m29363();
                    for (int i2 = 0; i2 < iM29364; i2++) {
                        String strM29361 = c11682M24823.m29360(i2);
                        if (!"Content-Length".equalsIgnoreCase(strM29361) && !"Content-Encoding".equalsIgnoreCase(strM29361) && !"Content-Type".equalsIgnoreCase(strM29361) && m32573(strM29361)) {
                            AbstractC4906.f17137.mo15057(c1988, strM29361, c11682M24823.m29364(i2));
                        }
                    }
                    c1242M24825.m4488(c1988.m6809());
                    c1242M24825.m4491(c9444M14554.m24816());
                    c1242M24825.m4481(c9444M14554.m24815());
                    c1242M24825.m4487(m32572(c9444));
                    c1242M24825.m4493(m32572(c9444M14554));
                    C9444 c9444M4479 = c1242M24825.m4479();
                    c9444M14554.m24818().close();
                    interfaceC6398.mo18160();
                    interfaceC6398.mo18162(c9444, c9444M4479);
                    return c9444M4479;
                }
                C19822.m45601(c9444.m24818());
            }
            C1242 c1242M24826 = c9444M14554.m24824();
            c1242M24826.m4487(m32572(c9444));
            c1242M24826.m4493(m32572(c9444M14554));
            C9444 c9444M44710 = c1242M24826.m4479();
            if (interfaceC6398 != null) {
                if (C13854.m33802(c9444M44710) && C11617.m29187(c7954, c9444M44710)) {
                    InterfaceC5652 interfaceC5652Mo18159 = interfaceC6398.mo18159(c9444M44710);
                    if (interfaceC5652Mo18159 != null && (interfaceC7099Mo16639 = interfaceC5652Mo18159.mo16639()) != null) {
                        C15346 c15346 = new C15346(c9444M44710.m24818().mo9080(), interfaceC5652Mo18159, C14556.m35106(interfaceC7099Mo16639));
                        String strM24817 = c9444M44710.m24817("Content-Type");
                        long jMo9079 = c9444M44710.m24818().mo9079();
                        C1242 c1242M24827 = c9444M44710.m24824();
                        c1242M24827.m4486(new C21842(strM24817, jMo9079, C14556.m35108(c15346)));
                        return c1242M24827.m4479();
                    }
                } else if (C15407.m36885(c7954.m21651())) {
                    try {
                        interfaceC6398.mo18161(c7954);
                    } catch (IOException unused) {
                    }
                }
            }
            return c9444M44710;
        } catch (Throwable th) {
            if (c9444Mo18164 != null) {
                C19822.m45601(c9444Mo18164.m24818());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9444 m32572(C9444 c9444) {
        if (c9444 == null || c9444.m24818() == null) {
            return c9444;
        }
        C1242 c1242M24824 = c9444.m24824();
        c1242M24824.m4486((AbstractC8699) null);
        return c1242M24824.m4479();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32573(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
