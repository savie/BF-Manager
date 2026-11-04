package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩶᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CA02 */
/* JADX INFO: loaded from: classes.dex */
public final class C21562 implements InterfaceC11843 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C13839 f68865 = new C13839();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f68864 = C16980.m40037(C21562.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4408 f68866 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f68871 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f68870 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f68867 = new Object();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4408 f68869 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f68868 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49038(InterfaceC23032 interfaceC23032, String str, C13839 c13839) {
        interfaceC23032.mo2875().getClass();
        InterfaceC25186 interfaceC25186 = f68864;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Inserting referral for " + str);
        }
        int iIndexOf = str.indexOf(92, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(92, i);
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            String strSubstring = str.substring(1, iIndexOf);
            Locale locale = Locale.ROOT;
            String lowerCase = strSubstring.toLowerCase(locale);
            String strSubstring2 = str.substring(i, iIndexOf2);
            String lowerCase2 = str.substring(0, c13839.mo14619()).toLowerCase(locale);
            interfaceC23032.mo2875().getClass();
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Adding key " + lowerCase2 + " to " + c13839);
            }
            c13839.mo14610(lowerCase.length() + 2 + strSubstring2.length());
            if (lowerCase2.charAt(lowerCase2.length() - 1) != '\\') {
                lowerCase2 = lowerCase2.concat("\\");
            }
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Key is " + lowerCase2);
            }
            C4408 c4408 = this.f68869;
            synchronized (this.f68868) {
                if (c4408 != null) {
                    if (System.currentTimeMillis() + 10000 > c4408.f15835) {
                    }
                    this.f68869 = c4408;
                }
                c4408 = new C4408(((C14826) interfaceC23032.mo2875()).m35725());
                this.f68869 = c4408;
            }
            c4408.f15836.put(lowerCase2, c13839);
            return;
        }
        interfaceC25186.mo13699("Invalid UNC path ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00e5, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ConcurrentMapC17249 m49034(InterfaceC23032 interfaceC23032) {
        C14014 c14014;
        InterfaceC25186 interfaceC25186 = f68864;
        interfaceC23032.mo2875().getClass();
        if (interfaceC23032.mo22000().mo45915() != null && !interfaceC23032.mo22000().mo45915().isEmpty()) {
            if (this.f68866 != null && System.currentTimeMillis() > this.f68866.f15835) {
                this.f68866 = null;
            }
            C4408 c4408 = this.f68866;
            if (c4408 != null) {
                return c4408.f15836;
            }
            try {
                String strMo45915 = interfaceC23032.mo22000().mo45915();
                Object objM49036 = m49036(strMo45915, interfaceC23032);
                try {
                    C4408 c4409 = new C4408(((C14826) interfaceC23032.mo2875()).m35725() * 10);
                    if (objM49036 != null) {
                        C14014 c14015 = (C14014) objM49036;
                        c14015.m34120(InterfaceC4541.class);
                        c14014 = c14015;
                    } else {
                        c14014 = null;
                    }
                    C13839 c13839M34122 = c14014 != null ? c14014.m34122(interfaceC23032.mo22002(), "", c14014.m34129(), strMo45915, 0) : null;
                    if (c13839M34122 != null) {
                        c13839M34122.mo14618();
                        C13839 c13839Mo14614 = c13839M34122;
                        do {
                            String lowerCase = c13839Mo14614.mo14609().toLowerCase();
                            c4409.f15836.put(lowerCase, new HashMap());
                            if (interfaceC25186.mo13713()) {
                                interfaceC25186.mo13717("Inserting cache entry for domain " + lowerCase + ": " + c13839Mo14614);
                            }
                            c13839Mo14614 = c13839Mo14614.mo14614();
                        } while (c13839Mo14614 != c13839M34122);
                        this.f68866 = c4409;
                        ConcurrentMapC17249 concurrentMapC17249 = c4409.f15836;
                        if (objM49036 != null) {
                            ((AbstractRunnableC0066) objM49036).m1095();
                        }
                        return concurrentMapC17249;
                    }
                    if (objM49036 != null) {
                        ((AbstractRunnableC0066) objM49036).m1095();
                        return null;
                    }
                } catch (Throwable th) {
                    if (objM49036 != null) {
                        try {
                            ((AbstractRunnableC0066) objM49036).m1095();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13711("getting trusted domains failed: " + interfaceC23032.mo22000().mo45915(), e);
                }
                this.f68866 = new C4408(((C14826) interfaceC23032.mo2875()).m35725() * 10);
                interfaceC23032.mo2875().getClass();
                return this.f68866.f15836;
            }
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13711("getting trusted domains failed: " + interfaceC23032.mo22000().mo45915(), e);
            }
            this.f68866 = new C4408(((C14826) interfaceC23032.mo2875()).m35725() * 10);
            interfaceC23032.mo2875().getClass();
            return this.f68866.f15836;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49039(String str, InterfaceC23032 interfaceC23032) {
        synchronized (this.f68871) {
            ConcurrentMapC17249 concurrentMapC17249M49034 = m49034(interfaceC23032);
            if (concurrentMapC17249M49034 == null) {
                return false;
            }
            return concurrentMapC17249M49034.get(str.toLowerCase(Locale.ROOT)) != null;
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
    public final l.InterfaceC4541 m49036(java.lang.String r17, l.InterfaceC23032 r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21562.m49036(java.lang.String, l.᩸᩵᩵):l.ۙ֡᩵");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14014 m49033(InterfaceC23032 interfaceC23032, InterfaceC4717 interfaceC4717) {
        if (interfaceC4717 != null) {
            InterfaceC4717 next = interfaceC4717;
            do {
                try {
                    String strMo14609 = next.mo14609();
                    InterfaceC25186 interfaceC25186 = f68864;
                    if (strMo14609 != null && !next.mo14609().isEmpty()) {
                        try {
                            InterfaceC24524 interfaceC24524Mo2874 = interfaceC23032.mo2874();
                            String strMo146010 = next.mo14609();
                            if (!interfaceC23032.mo22000().mo45913()) {
                                interfaceC23032.mo2875().getClass();
                            }
                            C14014 c14014 = (C14014) ((C10506) interfaceC24524Mo2874).m26967(interfaceC23032, strMo146010, 0, false, false);
                            c14014.m34120(C14014.class);
                            c14014.m34136();
                            return c14014;
                        } catch (IOException e) {
                            interfaceC25186.mo13711("Connection failed " + next.mo14609(), e);
                            next = next.next();
                        }
                    } else {
                        interfaceC25186.mo13721("No server name in referral");
                    }
                } catch (IOException unused) {
                    interfaceC23032.mo2875().getClass();
                }
            } while (next != interfaceC4717);
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4717 m49032(InterfaceC23032 interfaceC23032, InterfaceC4541 interfaceC4541, String str, String str2, String str3, String str4, String str5) {
        InterfaceC25186 interfaceC25186 = f68864;
        interfaceC23032.mo2875().getClass();
        String strM34972 = "\\" + str + "\\" + str4;
        if (str5 != null) {
            strM34972 = C14483.m34972(strM34972, str5);
        }
        try {
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Fetching referral for " + strM34972);
            }
            C13839 c13839M34122 = ((C14014) interfaceC4541).m34122(interfaceC23032, strM34972, str3, str2, 0);
            if (c13839M34122 == null) {
                return null;
            }
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Referral for " + strM34972 + ": " + c13839M34122);
            }
            c13839M34122.mo14618();
            return c13839M34122;
        } catch (IOException e) {
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13711("Getting referral for " + strM34972 + " failed", e);
            }
            interfaceC23032.mo2875().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4717 m49037(InterfaceC23032 interfaceC23032, String str, String str2, String str3) {
        return m49030(interfaceC23032, str, str2, str3, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC4717 m49030(InterfaceC23032 interfaceC23032, String str, String str2, String str3, int i) {
        String str4;
        InterfaceC4717 interfaceC4717M49029;
        C13839 c13839Mo14614;
        String str5;
        interfaceC23032.mo2875().getClass();
        C13839 c13839M33796 = null;
        if (str2 == null || str2.equals("IPC$") || i <= 0 || str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        InterfaceC25186 interfaceC25186 = f68864;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717(C3188.m10404("Resolving \\", lowerCase, "\\", str2, str3 != null ? str3 : ""));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f68871) {
            ConcurrentMapC17249 concurrentMapC17249M49034 = m49034(interfaceC23032);
            if (concurrentMapC17249M49034 != null) {
                if (interfaceC25186.mo13713()) {
                    m49035(concurrentMapC17249M49034);
                }
                String lowerCase2 = str2.toLowerCase();
                Map map = (Map) concurrentMapC17249M49034.get(lowerCase);
                interfaceC4717M49029 = map != null ? m49031(interfaceC23032, lowerCase, lowerCase2, str3, jCurrentTimeMillis, map) : null;
                interfaceC23032.mo2875().getClass();
                str4 = lowerCase2;
            } else {
                str4 = str2;
                interfaceC4717M49029 = null;
            }
        }
        if (interfaceC4717M49029 == null && str3 != null) {
            interfaceC4717M49029 = m49029(jCurrentTimeMillis, lowerCase, str4, str3);
        }
        if (interfaceC4717M49029 != null && interfaceC4717M49029.mo14616()) {
            do {
                c13839Mo14614 = interfaceC4717M49029.mo14614();
                if (interfaceC4717M49029.getPath() != null) {
                    str5 = "\\" + interfaceC4717M49029.getPath();
                } else {
                    str5 = "";
                }
                StringBuilder sbM27333 = C10732.m27333(str5);
                sbM27333.append(str3 != null ? str3.substring(c13839Mo14614.mo14619()) : "");
                String string = sbM27333.toString();
                InterfaceC25186 interfaceC25187 = f68864;
                if (interfaceC25187.mo13707()) {
                    String strMo14609 = c13839Mo14614.mo14609();
                    String strMo14615 = c13839Mo14614.mo14615();
                    String path = c13839Mo14614.getPath();
                    StringBuilder sbM10406 = C3188.m10406("Intermediate referral, server ", strMo14609, " share ", strMo14615, " refPath ");
                    C4794.m14774(sbM10406, path, " origPath ", str3, " nextPath ");
                    sbM10406.append(string);
                    interfaceC25187.mo13721(sbM10406.toString());
                }
                InterfaceC4717 interfaceC4717M49030 = m49030(interfaceC23032, c13839Mo14614.mo14609(), c13839Mo14614.mo14615(), string, i - 1);
                if (interfaceC4717M49030 != null) {
                    if (interfaceC25187.mo13707()) {
                        interfaceC25187.mo13721("Next referral is " + interfaceC4717M49030);
                    }
                    if (c13839M33796 == null) {
                        c13839M33796 = c13839Mo14614.m33796(interfaceC4717M49030);
                    } else {
                        c13839M33796.m33793(c13839Mo14614.m33796(interfaceC4717M49030));
                    }
                }
            } while (c13839Mo14614 != interfaceC4717M49029);
            if (c13839M33796 != null) {
                return c13839M33796;
            }
        }
        return interfaceC4717M49029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49035(ConcurrentMapC17249 concurrentMapC17249) {
        for (Map.Entry entry : concurrentMapC17249.entrySet()) {
            String str = "Domain " + ((String) entry.getKey());
            InterfaceC25186 interfaceC25186 = f68864;
            interfaceC25186.mo13717(str);
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                interfaceC25186.mo13717("  Root " + ((String) entry2.getKey()));
                if (((C4408) entry2.getValue()).f15836 != null) {
                    for (Map.Entry entry3 : ((C4408) entry2.getValue()).f15836.entrySet()) {
                        InterfaceC4717 interfaceC4717 = (InterfaceC4717) entry3.getValue();
                        InterfaceC4717 interfaceC4717Mo14614 = interfaceC4717;
                        do {
                            interfaceC25186.mo13717(ASN1Dump.TAB + ((String) entry3.getKey()) + " => " + entry3.getValue());
                            interfaceC4717Mo14614 = interfaceC4717Mo14614.mo14614();
                        } while (interfaceC4717Mo14614 != interfaceC4717);
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
    private InterfaceC4717 m49031(InterfaceC23032 interfaceC23032, String str, String str2, String str3, long j, Map map) {
        C4408 c4408;
        InterfaceC4717 interfaceC4717M49032;
        String strSubstring;
        InterfaceC4717 interfaceC4717;
        String strM34129;
        C4408 c4409;
        InterfaceC4717 interfaceC4717Mo14614;
        InterfaceC25186 interfaceC25186;
        InterfaceC25186 interfaceC25187 = f68864;
        if (interfaceC25187.mo13713()) {
            interfaceC25187.mo13717("Is a domain referral for " + str);
        }
        if (interfaceC25187.mo13713()) {
            interfaceC25187.mo13717("Resolving root " + str2);
        }
        C4408 c44010 = (C4408) map.get(str2);
        InterfaceC4717 interfaceC4718 = null;
        if (c44010 == null || j <= c44010.f15835) {
            c4408 = c44010;
        } else {
            if (interfaceC25187.mo13707()) {
                interfaceC25187.mo13721("Removing expired " + c44010.f15836);
            }
            map.remove(str2);
            c4408 = null;
        }
        if (c4408 == null) {
            interfaceC25187.mo13717("Loadings roots");
            Object objM49036 = m49036(str, interfaceC23032);
            try {
                if (objM49036 == null) {
                    if (interfaceC25187.mo13707()) {
                        interfaceC25187.mo13721("Failed to get domain controller for ".concat(str));
                    }
                    if (objM49036 != null) {
                        ((AbstractRunnableC0066) objM49036).m1095();
                    }
                } else {
                    C14014 c14014 = (C14014) objM49036;
                    c14014.m34120(InterfaceC4541.class);
                    synchronized (c14014) {
                        try {
                            c14014.m34136();
                            strM34129 = c14014.m34129();
                        } catch (IOException e) {
                            f68864.mo13702("Failed to connect to domain controller", (Throwable) e);
                            strM34129 = str;
                        }
                        interfaceC4717M49032 = m49032(interfaceC23032, c14014, str, str, strM34129, str2, null);
                    }
                    ((AbstractRunnableC0066) objM49036).m1095();
                    InterfaceC25186 interfaceC25188 = f68864;
                    if (interfaceC25188.mo13713()) {
                        interfaceC25188.mo13717("Have DC referral " + interfaceC4717M49032);
                    }
                    if (interfaceC4717M49032 != null) {
                        C13839 c13839 = (C13839) interfaceC4717M49032;
                        if (str.equals(c13839.mo14609()) && str2.equals(c13839.mo14615())) {
                            interfaceC25188.mo13729("Dropping self-referential referral " + interfaceC4717M49032);
                        }
                    }
                    if (interfaceC4717M49032 != null) {
                        c4409 = new C4408(((C14826) interfaceC23032.mo2875()).m35725());
                        c4409.f15836.put("\\", interfaceC4717M49032);
                        interfaceC4717Mo14614 = interfaceC4717M49032;
                        do {
                            C13839 c138310 = (C13839) interfaceC4717Mo14614;
                            c138310.m33792(c4409.f15836);
                            c138310.mo14611();
                            interfaceC4717Mo14614 = c138310.mo14614();
                        } while (interfaceC4717Mo14614 != interfaceC4717M49032);
                        interfaceC25186 = f68864;
                        if (interfaceC25186.mo13707()) {
                            interfaceC25186.mo13721("Have referral " + interfaceC4717M49032);
                        }
                        map.put(str2, c4409);
                        c4408 = c4409;
                    } else {
                        map.put(str2, new C14848(((C14826) interfaceC23032.mo2875()).m35725()));
                    }
                }
                interfaceC4717M49032 = null;
                if (interfaceC4717M49032 != null) {
                    c4409 = new C4408(((C14826) interfaceC23032.mo2875()).m35725());
                    c4409.f15836.put("\\", interfaceC4717M49032);
                    interfaceC4717Mo14614 = interfaceC4717M49032;
                    do {
                        C13839 c138311 = (C13839) interfaceC4717Mo14614;
                        c138311.m33792(c4409.f15836);
                        c138311.mo14611();
                        interfaceC4717Mo14614 = c138311.mo14614();
                    } while (interfaceC4717Mo14614 != interfaceC4717M49032);
                    interfaceC25186 = f68864;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Have referral " + interfaceC4717M49032);
                    }
                    map.put(str2, c4409);
                    c4408 = c4409;
                } else {
                    map.put(str2, new C14848(((C14826) interfaceC23032.mo2875()).m35725()));
                }
            } catch (Throwable th) {
                if (objM49036 == null) {
                    throw th;
                }
                try {
                    ((AbstractRunnableC0066) objM49036).m1095();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (c4408 instanceof C14848) {
            interfaceC4717M49032 = null;
            c4408 = null;
        } else {
            interfaceC4717M49032 = (InterfaceC4717) c4408.f15836.get("\\");
        }
        if (c4408 == null) {
            return interfaceC4717M49032;
        }
        String strSubstring2 = "\\";
        InterfaceC25186 interfaceC25189 = f68864;
        if (str3 == null || str3.length() <= 1) {
            strSubstring = "\\";
        } else {
            strSubstring = C22313.m50373(1, str3) == '\\' ? C1402.m5124(1, 0, str3) : str3;
        }
        if (interfaceC25189.mo13713()) {
            interfaceC25189.mo13717("Initial link is " + strSubstring);
        }
        if (interfaceC4717M49032 == null || !strSubstring.equals(interfaceC4717M49032.mo14613())) {
            while (true) {
                interfaceC4717 = (InterfaceC4717) c4408.f15836.get(strSubstring);
                if (interfaceC4717 == null) {
                    int iLastIndexOf = strSubstring.lastIndexOf(92);
                    if (iLastIndexOf <= 0) {
                        if (!interfaceC25189.mo13713()) {
                            break;
                        }
                        interfaceC25189.mo13717("Not found ".concat(strSubstring));
                        break;
                    }
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                } else {
                    if (!interfaceC25189.mo13713()) {
                        break;
                    }
                    interfaceC25189.mo13717("Found at " + strSubstring);
                    break;
                }
            }
        } else {
            interfaceC4717 = interfaceC4717M49032;
        }
        String str4 = strSubstring;
        if (interfaceC4717 != null && j > interfaceC4717.mo14612()) {
            if (interfaceC25189.mo13713()) {
                interfaceC25189.mo13717("Expiring links " + str4);
            }
            c4408.f15836.remove(str4);
            interfaceC4717 = null;
        }
        if (interfaceC4717 != null) {
            if (interfaceC25189.mo13713()) {
                interfaceC25189.mo13717("Have cached referral for " + interfaceC4717.mo14613() + " " + interfaceC4717);
            }
            return interfaceC4717;
        }
        interfaceC23032.mo2875().getClass();
        C14014 c14014M49033 = m49033(interfaceC23032, interfaceC4717M49032);
        if (c14014M49033 != null) {
            try {
                InterfaceC4717 interfaceC4717M49033 = m49032(interfaceC23032, c14014M49033, str, str, c14014M49033.m34129(), str2, str3);
                if (interfaceC4717M49033 != null) {
                    interfaceC23032.mo2875().getClass();
                    C13839 c138312 = (C13839) interfaceC4717M49033;
                    c138312.mo14610(str.length() + 2 + str2.length());
                    if (c138312.mo14619() > (str3 != null ? str3.length() : 0)) {
                        interfaceC25189.mo13699("Consumed more than we provided");
                    }
                    if (str3 != null && c138312.mo14619() > 0) {
                        strSubstring2 = str3.substring(0, c138312.mo14619());
                    }
                    c138312.m33797(strSubstring2);
                    if (interfaceC25189.mo13713()) {
                        interfaceC25189.mo13717("Have referral " + interfaceC4717M49033);
                    }
                    c4408.f15836.put(strSubstring2, interfaceC4717M49033);
                } else {
                    interfaceC25189.mo13721("No referral found for " + str4);
                }
                interfaceC4718 = interfaceC4717M49033;
            } catch (Throwable th3) {
                try {
                    c14014M49033.m1095();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else if (c14014M49033 == null) {
            return null;
        }
        c14014M49033.m1095();
        return interfaceC4718;
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
    private InterfaceC4717 m49029(long j, String str, String str2, String str3) {
        C4408 c4408;
        boolean zStartsWith;
        InterfaceC25186 interfaceC25186 = f68864;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13717("No match for domain based root, checking standalone " + str);
        }
        synchronized (this.f68868) {
            c4408 = this.f68869;
            if (c4408 == null || j > c4408.f15835) {
                c4408 = new C4408(0L);
            }
            this.f68869 = c4408;
        }
        String strM = ExternalValue$$ExternalSyntheticOutline0.m("\\", str, "\\", str2);
        if (!str3.equals("\\")) {
            strM = C14483.m34972(strM, str3);
        }
        String lowerCase = strM.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (String str4 : c4408.f15836.keySet()) {
            int length2 = str4.length();
            if (length2 == length) {
                zStartsWith = str4.equals(lowerCase);
            } else if (length2 < length) {
                zStartsWith = lowerCase.startsWith(str4);
            } else {
                InterfaceC25186 interfaceC25187 = f68864;
                if (interfaceC25187.mo13713()) {
                    interfaceC25187.mo13717(lowerCase + " vs. " + str4);
                }
                zStartsWith = false;
            }
            if (zStartsWith) {
                InterfaceC25186 interfaceC25188 = f68864;
                if (interfaceC25188.mo13707()) {
                    interfaceC25188.mo13721("Matched ".concat(str4));
                }
                return (InterfaceC4717) c4408.f15836.get(str4);
            }
        }
        InterfaceC25186 interfaceC25189 = f68864;
        if (!interfaceC25189.mo13713()) {
            return null;
        }
        interfaceC25189.mo13717("No match for ".concat(lowerCase));
        return null;
    }
}
