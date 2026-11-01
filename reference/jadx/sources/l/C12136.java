package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12136 implements InterfaceC1738 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2307 f40632;

    public C12136(InterfaceC2307 interfaceC2307) {
        this.f40632 = interfaceC2307;
    }

    @Override // l.InterfaceC1738
    /* JADX INFO: renamed from: ۙ */
    public final C18485 mo5785(C7247 c7247) {
        InterfaceC8597 interfaceC8597Mo39859;
        InterfaceC2307 interfaceC2307 = this.f40632;
        C18485 c18485Mo7050 = interfaceC2307 != null ? interfaceC2307.mo7050(c7247.m19366()) : null;
        C10725 c10725M15918 = new C5785(System.currentTimeMillis(), c7247.m19366(), c18485Mo7050).m15918();
        C22719 c22719 = c10725M15918.f36562;
        C18485 c18485 = c10725M15918.f36561;
        if (interfaceC2307 != null) {
            interfaceC2307.mo7047(c10725M15918);
        }
        if (c18485Mo7050 != null && c18485 == null) {
            C0140.m1231(c18485Mo7050.m42860());
        }
        if (c22719 == null && c18485 == null) {
            C17779 c17779 = new C17779();
            c17779.m41349(c7247.m19366());
            c17779.m41348(EnumC22013.HTTP_1_1);
            c17779.m41341(504);
            c17779.m41353("Unsatisfiable Request (only-if-cached)");
            c17779.m41347(C0140.f1173);
            c17779.m41352(-1L);
            c17779.m41342(System.currentTimeMillis());
            return c17779.m41340();
        }
        if (c22719 == null) {
            C17779 c17779M42864 = c18485.m42864();
            c17779M42864.m41346(m30209(c18485));
            return c17779M42864.m41340();
        }
        try {
            C18485 c18485M19370 = c7247.m19370(c22719);
            if (c18485M19370 == null && c18485Mo7050 != null) {
                C0140.m1231(c18485Mo7050.m42860());
            }
            if (c18485 != null) {
                if (c18485M19370.m42858() == 304) {
                    C17779 c17779M42865 = c18485.m42864();
                    C10912 c10912M42857 = c18485.m42857();
                    C10912 c10912M42858 = c18485M19370.m42857();
                    C5972 c5972 = new C5972();
                    int iM27347 = c10912M42857.m27347();
                    for (int i = 0; i < iM27347; i++) {
                        String strM27344 = c10912M42857.m27344(i);
                        String strM27348 = c10912M42857.m27348(i);
                        if ((!"Warning".equalsIgnoreCase(strM27344) || !strM27348.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM27344) || "Content-Encoding".equalsIgnoreCase(strM27344) || "Content-Type".equalsIgnoreCase(strM27344) || !m30210(strM27344) || c10912M42858.m27345(strM27344) == null)) {
                            AbstractC7196.f24003.mo19138(c5972, strM27344, strM27348);
                        }
                    }
                    int iM27348 = c10912M42858.m27347();
                    for (int i2 = 0; i2 < iM27348; i2++) {
                        String strM27345 = c10912M42858.m27344(i2);
                        if (!"Content-Length".equalsIgnoreCase(strM27345) && !"Content-Encoding".equalsIgnoreCase(strM27345) && !"Content-Type".equalsIgnoreCase(strM27345) && m30210(strM27345)) {
                            AbstractC7196.f24003.mo19138(c5972, strM27345, c10912M42858.m27348(i2));
                        }
                    }
                    c17779M42865.m41344(c5972.m16265());
                    c17779M42865.m41352(c18485M19370.m42867());
                    c17779M42865.m41342(c18485M19370.m42861());
                    c17779M42865.m41346(m30209(c18485));
                    c17779M42865.m41354(m30209(c18485M19370));
                    C18485 c18485M41340 = c17779M42865.m41340();
                    c18485M19370.m42860().close();
                    interfaceC2307.mo7046();
                    interfaceC2307.mo7048(c18485, c18485M41340);
                    return c18485M41340;
                }
                C0140.m1231(c18485.m42860());
            }
            C17779 c17779M42866 = c18485M19370.m42864();
            c17779M42866.m41346(m30209(c18485));
            c17779M42866.m41354(m30209(c18485M19370));
            C18485 c18485M41341 = c17779M42866.m41340();
            if (interfaceC2307 != null) {
                if (C10070.m25483(c18485M41341) && C10725.m26950(c22719, c18485M41341)) {
                    InterfaceC17074 interfaceC17074Mo7045 = interfaceC2307.mo7045(c18485M41341);
                    if (interfaceC17074Mo7045 != null && (interfaceC8597Mo39859 = interfaceC17074Mo7045.mo39859()) != null) {
                        C16369 c16369 = new C16369(c18485M41341.m42860().mo5211(), interfaceC17074Mo7045, C0834.m3436(interfaceC8597Mo39859));
                        String strM42859 = c18485M41341.m42859("Content-Type");
                        long jMo5212 = c18485M41341.m42860().mo5212();
                        C17779 c17779M42867 = c18485M41341.m42864();
                        c17779M42867.m41347(new C20653(strM42859, jMo5212, C0834.m3437(c16369)));
                        return c17779M42867.m41340();
                    }
                } else if (C12123.m30170(c22719.m50359())) {
                    try {
                        interfaceC2307.mo7049(c22719);
                    } catch (IOException unused) {
                    }
                }
            }
            return c18485M41341;
        } catch (Throwable th) {
            if (c18485Mo7050 != null) {
                C0140.m1231(c18485Mo7050.m42860());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18485 m30209(C18485 c18485) {
        if (c18485 == null || c18485.m42860() == null) {
            return c18485;
        }
        C17779 c17779M42864 = c18485.m42864();
        c17779M42864.m41347((AbstractC19191) null);
        return c17779M42864.m41340();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30210(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
