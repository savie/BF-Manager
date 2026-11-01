package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۢ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CA02 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9790 implements InterfaceC21183 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C23259 f33507 = new C23259();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f33508 = C13488.m32997(C9790.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14729 f33510 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f33509 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f33513 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f33512 = new Object();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14729 f33511 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f33514 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m24900(InterfaceC19067 interfaceC19067, String str, C23259 c23259) {
        interfaceC19067.mo29449().getClass();
        InterfaceC4314 interfaceC4314 = f33508;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Inserting referral for " + str);
        }
        int iIndexOf = str.indexOf(92, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(92, i);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            String strSubstring = str.substring(1, iIndexOf);
            Locale locale = Locale.ROOT;
            String lowerCase = strSubstring.toLowerCase(locale);
            String strSubstring2 = str.substring(i, iIndexOf2);
            String lowerCase2 = str.substring(0, c23259.mo37106()).toLowerCase(locale);
            interfaceC19067.mo29449().getClass();
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Adding key " + lowerCase2 + " to " + c23259);
            }
            c23259.mo37099(lowerCase.length() + 2 + strSubstring2.length());
            if (lowerCase2.charAt(lowerCase2.length() - 1) != '\\') {
                lowerCase2 = lowerCase2.concat("\\");
            }
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Key is " + lowerCase2);
            }
            C14729 c14729 = this.f33511;
            synchronized (this.f33514) {
                if (c14729 != null) {
                    if (System.currentTimeMillis() + 10000 > c14729.f48147) {
                    }
                    this.f33511 = c14729;
                }
                c14729 = new C14729(((C9895) interfaceC19067.mo29449()).m25080());
                this.f33511 = c14729;
            }
            c14729.f48148.put(lowerCase2, c23259);
            return;
        }
        interfaceC4314.mo12119("Invalid UNC path ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00e5, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ConcurrentMapC13783 m24892(InterfaceC19067 interfaceC19067) {
        C3875 c3875;
        InterfaceC4314 interfaceC4314 = f33508;
        interfaceC19067.mo29449().getClass();
        if (interfaceC19067.mo13093().mo43139() != null && !interfaceC19067.mo13093().mo43139().isEmpty()) {
            if (this.f33510 != null && System.currentTimeMillis() > this.f33510.f48147) {
                this.f33510 = null;
            }
            C14729 c14729 = this.f33510;
            if (c14729 != null) {
                return c14729.f48148;
            }
            try {
                String strMo43139 = interfaceC19067.mo13093().mo43139();
                Object objM24898 = m24898(strMo43139, interfaceC19067);
                try {
                    C14729 c147210 = new C14729(((C9895) interfaceC19067.mo29449()).m25080() * 10);
                    if (objM24898 != null) {
                        C3875 c3876 = (C3875) objM24898;
                        c3876.m11234(InterfaceC6698.class);
                        c3875 = c3876;
                    } else {
                        c3875 = null;
                    }
                    C23259 c23259M11235 = c3875 != null ? c3875.m11235(interfaceC19067.mo13095(), "", c3875.m11244(), strMo43139, 0) : null;
                    if (c23259M11235 != null) {
                        c23259M11235.mo37104();
                        C23259 c23259Mo37095 = c23259M11235;
                        do {
                            String lowerCase = c23259Mo37095.mo37098().toLowerCase();
                            c147210.f48148.put(lowerCase, new HashMap());
                            if (interfaceC4314.mo12133()) {
                                interfaceC4314.mo12127("Inserting cache entry for domain " + lowerCase + ": " + c23259Mo37095);
                            }
                            c23259Mo37095 = c23259Mo37095.mo37095();
                        } while (c23259Mo37095 != c23259M11235);
                        this.f33510 = c147210;
                        ConcurrentMapC13783 concurrentMapC13783 = c147210.f48148;
                        if (objM24898 != null) {
                            ((AbstractRunnableC3170) objM24898).m9589();
                        }
                        return concurrentMapC13783;
                    }
                    if (objM24898 != null) {
                        ((AbstractRunnableC3170) objM24898).m9589();
                        return null;
                    }
                } catch (Throwable th) {
                    if (objM24898 != null) {
                        try {
                            ((AbstractRunnableC3170) objM24898).m9589();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12120("getting trusted domains failed: " + interfaceC19067.mo13093().mo43139(), (Exception) e);
                }
                this.f33510 = new C14729(((C9895) interfaceC19067.mo29449()).m25080() * 10);
                interfaceC19067.mo29449().getClass();
                return this.f33510.f48148;
            }
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12120("getting trusted domains failed: " + interfaceC19067.mo13093().mo43139(), (Exception) e);
            }
            this.f33510 = new C14729(((C9895) interfaceC19067.mo29449()).m25080() * 10);
            interfaceC19067.mo29449().getClass();
            return this.f33510.f48148;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24901(String str, InterfaceC19067 interfaceC19067) {
        synchronized (this.f33509) {
            ConcurrentMapC13783 concurrentMapC13783M24892 = m24892(interfaceC19067);
            if (concurrentMapC13783M24892 == null) {
                return false;
            }
            return concurrentMapC13783M24892.get(str.toLowerCase(Locale.ROOT)) != null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00d5 */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC6698 m24898(java.lang.String r17, l.InterfaceC19067 r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9790.m24898(java.lang.String, l.ᩴ᩺۠):l.ۜۤ۠");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3875 m24891(InterfaceC19067 interfaceC19067, InterfaceC15498 interfaceC15498) {
        if (interfaceC15498 != null) {
            InterfaceC15498 next = interfaceC15498;
            do {
                try {
                    String strMo37098 = next.mo37098();
                    InterfaceC4314 interfaceC4314 = f33508;
                    if (strMo37098 != null && !next.mo37098().isEmpty()) {
                        try {
                            InterfaceC14834 interfaceC14834Mo29452 = interfaceC19067.mo29452();
                            String strMo37099 = next.mo37098();
                            if (!interfaceC19067.mo13093().mo43144()) {
                                interfaceC19067.mo29449().getClass();
                            }
                            C3875 c3875 = (C3875) ((C15166) interfaceC14834Mo29452).m36379(interfaceC19067, strMo37099, 0, false, false);
                            c3875.m11234(C3875.class);
                            c3875.m11249();
                            return c3875;
                        } catch (IOException e) {
                            interfaceC4314.mo12120("Connection failed " + next.mo37098(), (Exception) e);
                            next = next.next();
                        }
                    } else {
                        interfaceC4314.mo12135("No server name in referral");
                    }
                } catch (IOException unused) {
                    interfaceC19067.mo29449().getClass();
                }
            } while (next != interfaceC15498);
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15498 m24896(InterfaceC19067 interfaceC19067, InterfaceC6698 interfaceC6698, String str, String str2, String str3, String str4, String str5) {
        InterfaceC4314 interfaceC4314 = f33508;
        interfaceC19067.mo29449().getClass();
        String strM37076 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            strM37076 = C15489.m37076(strM37076, str5);
        }
        try {
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Fetching referral for " + strM37076);
            }
            C23259 c23259M11235 = ((C3875) interfaceC6698).m11235(interfaceC19067, strM37076, str3, str2, 0);
            if (c23259M11235 == null) {
                return null;
            }
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12135("Referral for " + strM37076 + ": " + c23259M11235);
            }
            c23259M11235.mo37104();
            return c23259M11235;
        } catch (IOException e) {
            if (interfaceC4314.mo12125()) {
                interfaceC4314.mo12120("Getting referral for " + strM37076 + " failed", (Exception) e);
            }
            interfaceC19067.mo29449().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15498 m24899(InterfaceC19067 interfaceC19067, String str, String str2, String str3) {
        return m24894(interfaceC19067, str, str2, str3, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC15498 m24894(InterfaceC19067 interfaceC19067, String str, String str2, String str3, int i) {
        String str4;
        InterfaceC15498 interfaceC15498M24893;
        C23259 c23259Mo37095;
        String str5;
        interfaceC19067.mo29449().getClass();
        C23259 c23259M51334 = null;
        if (str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        InterfaceC4314 interfaceC4314 = f33508;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127(C0242.m1617("Resolving \\", lowerCase, "\\", str2, str3 != null ? str3 : ""));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f33509) {
            ConcurrentMapC13783 concurrentMapC13783M24892 = m24892(interfaceC19067);
            if (concurrentMapC13783M24892 != null) {
                if (interfaceC4314.mo12133()) {
                    m24897(concurrentMapC13783M24892);
                }
                String lowerCase2 = str2.toLowerCase();
                Map map = (Map) concurrentMapC13783M24892.get(lowerCase);
                interfaceC15498M24893 = map != null ? m24895(interfaceC19067, lowerCase, lowerCase2, str3, jCurrentTimeMillis, map) : null;
                interfaceC19067.mo29449().getClass();
                str4 = lowerCase2;
            } else {
                str4 = str2;
                interfaceC15498M24893 = null;
            }
        }
        if (interfaceC15498M24893 == null && str3 != null) {
            interfaceC15498M24893 = m24893(jCurrentTimeMillis, lowerCase, str4, str3);
        }
        if (interfaceC15498M24893 != null && interfaceC15498M24893.mo37100()) {
            do {
                c23259Mo37095 = interfaceC15498M24893.mo37095();
                if (interfaceC15498M24893.getPath() != null) {
                    str5 = "\\" + interfaceC15498M24893.getPath();
                } else {
                    str5 = "";
                }
                StringBuilder sbM23356 = C9023.m23356(str5);
                sbM23356.append(str3 != null ? str3.substring(c23259Mo37095.mo37106()) : "");
                String string = sbM23356.toString();
                InterfaceC4314 interfaceC4315 = f33508;
                if (interfaceC4315.mo12125()) {
                    String strMo37098 = c23259Mo37095.mo37098();
                    String strMo37105 = c23259Mo37095.mo37105();
                    String path = c23259Mo37095.getPath();
                    StringBuilder sbM30515 = C12278.m30515("Intermediate referral, server ", strMo37098, " share ", strMo37105, " refPath ");
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30515, path, " origPath ", str3, " nextPath ");
                    sbM30515.append(string);
                    interfaceC4315.mo12135(sbM30515.toString());
                }
                InterfaceC15498 interfaceC15498M24894 = m24894(interfaceC19067, c23259Mo37095.mo37098(), c23259Mo37095.mo37105(), string, i - 1);
                if (interfaceC15498M24894 != null) {
                    if (interfaceC4315.mo12125()) {
                        interfaceC4315.mo12135("Next referral is " + interfaceC15498M24894);
                    }
                    if (c23259M51334 == null) {
                        c23259M51334 = c23259Mo37095.m51334(interfaceC15498M24894);
                    } else {
                        c23259M51334.m51333(c23259Mo37095.m51334(interfaceC15498M24894));
                    }
                }
            } while (c23259Mo37095 != interfaceC15498M24893);
            if (c23259M51334 != null) {
                return c23259M51334;
            }
        }
        return interfaceC15498M24893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24897(ConcurrentMapC13783 concurrentMapC13783) {
        for (Map.Entry entry : concurrentMapC13783.entrySet()) {
            String str = "Domain " + ((String) entry.getKey());
            InterfaceC4314 interfaceC4314 = f33508;
            interfaceC4314.mo12127(str);
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                interfaceC4314.mo12127("  Root " + ((String) entry2.getKey()));
                if (((C14729) entry2.getValue()).f48148 != null) {
                    for (Map.Entry entry3 : ((C14729) entry2.getValue()).f48148.entrySet()) {
                        InterfaceC15498 interfaceC15498 = (InterfaceC15498) entry3.getValue();
                        InterfaceC15498 interfaceC15498Mo37095 = interfaceC15498;
                        do {
                            interfaceC4314.mo12127(ASN1Dump.TAB + ((String) entry3.getKey()) + " => " + entry3.getValue());
                            interfaceC15498Mo37095 = interfaceC15498Mo37095.mo37095();
                        } while (interfaceC15498Mo37095 != interfaceC15498);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0138, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC15498 m24895(InterfaceC19067 interfaceC19067, String str, String str2, String str3, long j, Map map) {
        C14729 c14729;
        InterfaceC15498 interfaceC15498M24896;
        String strSubstring;
        InterfaceC15498 interfaceC15498;
        String strM11244;
        C14729 c147210;
        InterfaceC15498 interfaceC15498Mo37095;
        InterfaceC4314 interfaceC4314;
        InterfaceC4314 interfaceC4315 = f33508;
        if (interfaceC4315.mo12133()) {
            interfaceC4315.mo12127("Is a domain referral for " + str);
        }
        if (interfaceC4315.mo12133()) {
            interfaceC4315.mo12127("Resolving root " + str2);
        }
        C14729 c147211 = (C14729) map.get(str2);
        InterfaceC15498 interfaceC15499 = null;
        if (c147211 == null || j <= c147211.f48147) {
            c14729 = c147211;
        } else {
            if (interfaceC4315.mo12125()) {
                interfaceC4315.mo12135("Removing expired " + c147211.f48148);
            }
            map.remove(str2);
            c14729 = null;
        }
        if (c14729 == null) {
            interfaceC4315.mo12127("Loadings roots");
            Object objM24898 = m24898(str, interfaceC19067);
            try {
                if (objM24898 == null) {
                    if (interfaceC4315.mo12125()) {
                        interfaceC4315.mo12135("Failed to get domain controller for ".concat(str));
                    }
                    if (objM24898 != null) {
                        ((AbstractRunnableC3170) objM24898).m9589();
                    }
                } else {
                    C3875 c3875 = (C3875) objM24898;
                    c3875.m11234(InterfaceC6698.class);
                    synchronized (c3875) {
                        try {
                            c3875.m11249();
                            strM11244 = c3875.m11244();
                        } catch (IOException e) {
                            f33508.mo12122("Failed to connect to domain controller", (Throwable) e);
                            strM11244 = str;
                        }
                        interfaceC15498M24896 = m24896(interfaceC19067, c3875, str, str, strM11244, str2, null);
                    }
                    ((AbstractRunnableC3170) objM24898).m9589();
                    InterfaceC4314 interfaceC4316 = f33508;
                    if (interfaceC4316.mo12133()) {
                        interfaceC4316.mo12127("Have DC referral " + interfaceC15498M24896);
                    }
                    if (interfaceC15498M24896 != null) {
                        C23259 c23259 = (C23259) interfaceC15498M24896;
                        if (str.equals(c23259.mo37098()) && str2.equals(c23259.mo37105())) {
                            interfaceC4316.mo12116("Dropping self-referential referral " + interfaceC15498M24896);
                        }
                    }
                    if (interfaceC15498M24896 != null) {
                        c147210 = new C14729(((C9895) interfaceC19067.mo29449()).m25080());
                        c147210.f48148.put("\\", interfaceC15498M24896);
                        interfaceC15498Mo37095 = interfaceC15498M24896;
                        do {
                            C23259 c232510 = (C23259) interfaceC15498Mo37095;
                            c232510.m51332(c147210.f48148);
                            c232510.mo37103();
                            interfaceC15498Mo37095 = c232510.mo37095();
                        } while (interfaceC15498Mo37095 != interfaceC15498M24896);
                        interfaceC4314 = f33508;
                        if (interfaceC4314.mo12125()) {
                            interfaceC4314.mo12135("Have referral " + interfaceC15498M24896);
                        }
                        map.put(str2, c147210);
                        c14729 = c147210;
                    } else {
                        map.put(str2, new C2027(((C9895) interfaceC19067.mo29449()).m25080()));
                    }
                }
                interfaceC15498M24896 = null;
                if (interfaceC15498M24896 != null) {
                    c147210 = new C14729(((C9895) interfaceC19067.mo29449()).m25080());
                    c147210.f48148.put("\\", interfaceC15498M24896);
                    interfaceC15498Mo37095 = interfaceC15498M24896;
                    do {
                        C23259 c232511 = (C23259) interfaceC15498Mo37095;
                        c232511.m51332(c147210.f48148);
                        c232511.mo37103();
                        interfaceC15498Mo37095 = c232511.mo37095();
                    } while (interfaceC15498Mo37095 != interfaceC15498M24896);
                    interfaceC4314 = f33508;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Have referral " + interfaceC15498M24896);
                    }
                    map.put(str2, c147210);
                    c14729 = c147210;
                } else {
                    map.put(str2, new C2027(((C9895) interfaceC19067.mo29449()).m25080()));
                }
            } catch (Throwable th) {
                if (objM24898 == null) {
                    throw th;
                }
                try {
                    ((AbstractRunnableC3170) objM24898).m9589();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (c14729 instanceof C2027) {
            interfaceC15498M24896 = null;
            c14729 = null;
        } else {
            interfaceC15498M24896 = (InterfaceC15498) c14729.f48148.get("\\");
        }
        if (c14729 == null) {
            return interfaceC15498M24896;
        }
        String strSubstring2 = "\\";
        InterfaceC4314 interfaceC4317 = f33508;
        if (str3 == null || str3.length() <= 1) {
            strSubstring = "\\";
        } else {
            strSubstring = C3184.m9601(1, str3) == '\\' ? C20630.m46498(1, 0, str3) : str3;
        }
        if (interfaceC4317.mo12133()) {
            interfaceC4317.mo12127("Initial link is " + strSubstring);
        }
        if (interfaceC15498M24896 == null || !strSubstring.equals(interfaceC15498M24896.mo37101())) {
            while (true) {
                interfaceC15498 = (InterfaceC15498) c14729.f48148.get(strSubstring);
                if (interfaceC15498 == null) {
                    int iLastIndexOf = strSubstring.lastIndexOf(92);
                    if (iLastIndexOf <= 0) {
                        if (!interfaceC4317.mo12133()) {
                            break;
                        }
                        interfaceC4317.mo12127("Not found ".concat(strSubstring));
                        break;
                    }
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                } else {
                    if (!interfaceC4317.mo12133()) {
                        break;
                    }
                    interfaceC4317.mo12127("Found at " + strSubstring);
                    break;
                }
            }
        } else {
            interfaceC15498 = interfaceC15498M24896;
        }
        String str4 = strSubstring;
        if (interfaceC15498 != null && j > interfaceC15498.mo37096()) {
            if (interfaceC4317.mo12133()) {
                interfaceC4317.mo12127("Expiring links " + str4);
            }
            c14729.f48148.remove(str4);
            interfaceC15498 = null;
        }
        if (interfaceC15498 != null) {
            if (interfaceC4317.mo12133()) {
                interfaceC4317.mo12127("Have cached referral for " + interfaceC15498.mo37101() + " " + interfaceC15498);
            }
            return interfaceC15498;
        }
        interfaceC19067.mo29449().getClass();
        C3875 c3875M24891 = m24891(interfaceC19067, interfaceC15498M24896);
        if (c3875M24891 != null) {
            try {
                InterfaceC15498 interfaceC15498M24897 = m24896(interfaceC19067, c3875M24891, str, str, c3875M24891.m11244(), str2, str3);
                if (interfaceC15498M24897 != null) {
                    interfaceC19067.mo29449().getClass();
                    C23259 c232512 = (C23259) interfaceC15498M24897;
                    c232512.mo37099(str.length() + 2 + str2.length());
                    if (c232512.mo37106() > (str3 != null ? str3.length() : 0)) {
                        interfaceC4317.mo12119("Consumed more than we provided");
                    }
                    if (str3 != null && c232512.mo37106() > 0) {
                        strSubstring2 = str3.substring(0, c232512.mo37106());
                    }
                    c232512.m51335(strSubstring2);
                    if (interfaceC4317.mo12133()) {
                        interfaceC4317.mo12127("Have referral " + interfaceC15498M24897);
                    }
                    c14729.f48148.put(strSubstring2, interfaceC15498M24897);
                } else {
                    interfaceC4317.mo12135("No referral found for " + str4);
                }
                interfaceC15499 = interfaceC15498M24897;
            } catch (Throwable th3) {
                try {
                    c3875M24891.m9589();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else if (c3875M24891 == null) {
            return null;
        }
        c3875M24891.m9589();
        return interfaceC15499;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC15498 m24893(long j, String str, String str2, String str3) {
        C14729 c14729;
        boolean zStartsWith;
        InterfaceC4314 interfaceC4314 = f33508;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12127("No match for domain based root, checking standalone " + str);
        }
        synchronized (this.f33514) {
            c14729 = this.f33511;
            if (c14729 == null || j > c14729.f48147) {
                c14729 = new C14729(0L);
            }
            this.f33511 = c14729;
        }
        String strM21055 = C7997.m21055("\\", str, "\\", str2);
        if (!str3.equals("\\")) {
            strM21055 = C15489.m37076(strM21055, str3);
        }
        String lowerCase = strM21055.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str4 : c14729.f48148.keySet()) {
            int length2 = str4.length();
            if (length2 == length) {
                zStartsWith = str4.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str4);
            } else {
                InterfaceC4314 interfaceC4315 = f33508;
                if (interfaceC4315.mo12133()) {
                    interfaceC4315.mo12127(lowerCase + " vs. " + str4);
                }
                zStartsWith = false;
            }
            if (zStartsWith) {
                InterfaceC4314 interfaceC4316 = f33508;
                if (interfaceC4316.mo12125()) {
                    interfaceC4316.mo12135("Matched ".concat(str4));
                }
                return (InterfaceC15498) c14729.f48148.get(str4);
            }
        }
        InterfaceC4314 interfaceC4317 = f33508;
        if (!interfaceC4317.mo12133()) {
            return null;
        }
        interfaceC4317.mo12127("No match for ".concat(lowerCase));
        return null;
    }
}
