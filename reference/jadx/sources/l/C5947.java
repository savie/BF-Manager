package l;

import com.thegrizzlylabs.sardineandroid.model.Allprop;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.simpleframework.xml.stream.MyPullProvider;

/* JADX INFO: renamed from: l.ۚ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24363 f20368;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile String f20369;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20370;

    static {
        MyPullProvider.inject();
    }

    public C5947(C24363 c24363, String str) {
        this.f20368 = c24363;
        this.f20370 = m17307(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17315(String str, String str2, boolean z) {
        C6463 c6463M54459 = this.f20368.m54459();
        c6463M54459.m18271(new C13798(str, str2));
        if (z) {
            c6463M54459.m18273(new C23101(str, str2));
        }
        this.f20368 = c6463M54459.m18265();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17318() {
        return this.f20369;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m17317(String str) {
        this.f20369 = m17307(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17312() {
        this.f20369 = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m17320(String str) {
        C16157 c16157M38331;
        Propfind propfind = new Propfind();
        propfind.setAllprop(new Allprop());
        try {
            c16157M38331 = C16157.m38331("text/xml");
        } catch (IllegalArgumentException unused) {
            c16157M38331 = null;
        }
        AbstractC10190 abstractC10190M26308 = AbstractC10190.m26308(c16157M38331, C6693.m18712(propfind));
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2398("Depth", Integer.toString(1));
        c0496.m2392("PROPFIND", abstractC10190M26308);
        return (List) m17301(c0496.m2389(), new C16387());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m17310(long j, String str) {
        if (j == 0) {
            Map map = Collections.EMPTY_MAP;
            C11682 c11682M29358 = C11682.m29358();
            C0496 c0496 = new C0496();
            c0496.m2397(str);
            c0496.m2396();
            c0496.m2393(c11682M29358);
            return (InputStream) m17301(c0496.m2389(), new C17133());
        }
        C0496 c0497 = new C0496();
        c0497.m2397(str);
        c0497.m2396();
        c0497.m2393(C11682.m29356("Range", "bytes=" + j + "-"));
        return (InputStream) m17301(c0497.m2389(), new C5201());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17319(String str) {
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("DELETE", C19822.f63727);
        C7954 c7954M2389 = c0496.m2389();
        C15641 c15641M17303 = m17303(c7954M2389);
        if (c15641M17303.f50789 && c15641M17303.f50788.m24820() == 403) {
            try {
                c15641M17303.f50788.close();
            } catch (Exception unused) {
            }
            this.f20369 = null;
            c15641M17303 = m17303(c7954M2389);
        }
        m17304(c15641M17303);
        C20863.m47689(c15641M17303.f50788);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17313(String str) {
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("MKCOL", (AbstractC10190) null);
        C7954 c7954M2389 = c0496.m2389();
        C15641 c15641M17303 = m17303(c7954M2389);
        if (c15641M17303.f50789 && c15641M17303.f50788.m24820() == 403) {
            try {
                c15641M17303.f50788.close();
            } catch (Exception unused) {
            }
            this.f20369 = null;
            c15641M17303 = m17303(c7954M2389);
        }
        m17304(c15641M17303);
        C20863.m47689(c15641M17303.f50788);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17316(String str) {
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("HEAD", (AbstractC10190) null);
        return ((Boolean) m17301(c0496.m2389(), new C25339())).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m17301(C7954 c7954, InterfaceC23847 interfaceC23847) throws ProtocolException {
        C15641 c15641M17303 = m17303(c7954);
        if (c15641M17303.f50789 && c15641M17303.f50788.m24820() == 403) {
            try {
                c15641M17303.f50788.close();
            } catch (Exception unused) {
            }
            this.f20369 = null;
            c15641M17303 = m17303(c7954);
        }
        m17304(c15641M17303);
        return interfaceC23847.mo15624(c15641M17303.f50788);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream m17311(String str, String str2, long j) throws ProtocolException {
        C13404 c13404;
        C16157 c16157M38331 = null;
        if (this.f20370 == null) {
            c13404 = new C13404(str, false);
        } else {
            String str3 = this.f20369;
            if (str3 != null) {
                String strM17308 = m17308(str, this.f20370, str3);
                c13404 = new C13404(strM17308, !strM17308.equals(str));
            } else {
                C0496 c0496 = new C0496();
                StringBuilder sb = new StringBuilder();
                String str4 = this.f20370;
                sb.append(str4);
                sb.append("/");
                c0496.m2397(sb.toString());
                c0496.m2392("HEAD", (AbstractC10190) null);
                C15641 c15641M17303 = m17303(c0496.m2389());
                String str5 = c15641M17303.f50786;
                C9444 c9444 = c15641M17303.f50788;
                try {
                    try {
                        if (c9444.m24819()) {
                            m17304(c15641M17303);
                            if (str5 != null) {
                                str4 = str5;
                            }
                            c9444.close();
                        } else {
                            int iM24820 = c9444.m24820();
                            if (iM24820 == 405 || iM24820 == 501) {
                                try {
                                    c9444.close();
                                } catch (Exception unused) {
                                }
                                C0496 c0497 = new C0496();
                                c0497.m2397(str4 + "/");
                                c0497.m2396();
                                C15641 c15641M17304 = m17303(c0497.m2389());
                                C9444 c9445 = c15641M17304.f50788;
                                try {
                                    if (c9445.m24819()) {
                                        m17304(c15641M17304);
                                    }
                                    String str6 = c15641M17304.f50786;
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                    c9445.close();
                                } catch (Throwable th) {
                                    try {
                                        c9445.close();
                                    } catch (Exception unused2) {
                                    }
                                    throw th;
                                }
                            } else {
                                if (str5 != null) {
                                    str4 = str5;
                                }
                                c9444.close();
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    String strM17309 = m17308(str, this.f20370, str4);
                    c13404 = new C13404(strM17309, (this.f20369 == null || !this.f20369.equals(str4) || strM17309.equals(str)) ? false : true);
                } catch (Throwable th2) {
                    try {
                        c9444.close();
                    } catch (Exception unused4) {
                    }
                    throw th2;
                }
            }
        }
        try {
            c16157M38331 = C16157.m38331(str2);
        } catch (IllegalArgumentException unused5) {
        }
        C16096 c16096 = new C16096(j, c16157M38331);
        C22411 c22411M38253 = c16096.m38253();
        long jM54462 = this.f20368.m54462();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c22411M38253.mo15814(jM54462);
        C0496 c0498 = new C0496();
        c0498.m2397(c13404.f42708);
        c0498.m2392("PUT", c16096);
        c0498.m2393(new C1988().m6809());
        C7954 c7954M2389 = c0498.m2389();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20368.m54450(c7954M2389).mo18519(new C22355(this, atomicReference, c16096, c13404, atomicBoolean));
        return new C11166(c16096.m38254(), c16096, atomicBoolean, atomicReference);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15641 m17303(C7954 c7954) throws ProtocolException {
        C20117 c20117;
        String strM17302;
        String strM24817;
        C16903 c16903M39867;
        C7954 c7954M2389;
        C0496 c0496M21650;
        String strM21646;
        boolean zEquals;
        String strM21647;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zM17305 = false;
        if (this.f20370 == null || this.f20369 == null) {
            c20117 = new C20117(c7954, false);
        } else {
            String str = this.f20369;
            String string = c7954.m21649().toString();
            String strM17308 = m17308(string, this.f20370, str);
            String strM17306 = m17306(c7954.m21646("DESTINATION"), this.f20370, str);
            String strM17307 = m17306(c7954.m21646("If"), this.f20370, str);
            if (string.equals(strM17308)) {
                String strM21648 = c7954.m21646("DESTINATION");
                if (strM17306 == null) {
                    zEquals3 = strM21648 == null;
                } else {
                    zEquals3 = strM17306.equals(strM21648);
                }
                if (zEquals3) {
                    String strM21649 = c7954.m21646("If");
                    if (strM17307 == null) {
                        zEquals4 = strM21649 == null;
                    } else {
                        zEquals4 = strM17307.equals(strM21649);
                    }
                    if (zEquals4) {
                        c20117 = new C20117(c7954, false);
                    } else {
                        c0496M21650 = c7954.m21650();
                        if (!string.equals(strM17308)) {
                            c0496M21650.m2397(strM17308);
                        }
                        strM21646 = c7954.m21646("DESTINATION");
                        if (strM17306 != null) {
                            zEquals = strM17306.equals(strM21646);
                        } else if (strM21646 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals && strM17306 != null) {
                            c0496M21650.m2398("DESTINATION", strM17306);
                        }
                        strM21647 = c7954.m21646("If");
                        if (strM17307 != null) {
                            zEquals2 = strM17307.equals(strM21647);
                        } else if (strM21647 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                        if (!zEquals2 && strM17307 != null) {
                            c0496M21650.m2398("If", strM17307);
                        }
                        c20117 = new C20117(c0496M21650.m2389(), true);
                    }
                } else {
                    c0496M21650 = c7954.m21650();
                    if (!string.equals(strM17308)) {
                        c0496M21650.m2397(strM17308);
                    }
                    strM21646 = c7954.m21646("DESTINATION");
                    if (strM17306 != null) {
                        zEquals = strM17306.equals(strM21646);
                    } else if (strM21646 == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                    if (!zEquals) {
                        c0496M21650.m2398("DESTINATION", strM17306);
                    }
                    strM21647 = c7954.m21646("If");
                    if (strM17307 != null) {
                        zEquals2 = strM17307.equals(strM21647);
                    } else if (strM21647 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                    if (!zEquals2) {
                        c0496M21650.m2398("If", strM17307);
                    }
                    c20117 = new C20117(c0496M21650.m2389(), true);
                }
            } else {
                c0496M21650 = c7954.m21650();
                if (!string.equals(strM17308)) {
                    c0496M21650.m2397(strM17308);
                }
                strM21646 = c7954.m21646("DESTINATION");
                if (strM17306 != null) {
                    zEquals = strM17306.equals(strM21646);
                } else if (strM21646 == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    c0496M21650.m2398("DESTINATION", strM17306);
                }
                strM21647 = c7954.m21646("If");
                if (strM17307 != null) {
                    zEquals2 = strM17307.equals(strM21647);
                } else if (strM21647 == null) {
                    zEquals2 = true;
                } else {
                    zEquals2 = false;
                }
                if (!zEquals2) {
                    c0496M21650.m2398("If", strM17307);
                }
                c20117 = new C20117(c0496M21650.m2389(), true);
            }
        }
        C7954 c7955 = c20117.f64622;
        String string2 = c7955.m21649().toString();
        String strM17303 = null;
        if (this.f20369 == null || !m17309(string2, this.f20369)) {
            String str2 = this.f20370;
            strM17302 = (str2 == null || !m17309(string2, str2)) ? null : this.f20370;
        } else {
            strM17302 = this.f20369;
        }
        C9444 c9444Execute = this.f20368.m54450(c7955).execute();
        int i = 0;
        while (true) {
            if (c9444Execute.m24820() == 307) {
                zM17305 = true;
            }
            zM17305 = zM17305 | m17305(c9444Execute, 302) | m17305(c9444Execute, 303) | m17305(c9444Execute, 307);
            String string3 = c9444Execute.m24826().m21649().toString();
            if (strM17302 == null || !m17309(string3, strM17302)) {
                if (this.f20369 == null || !m17309(string3, this.f20369)) {
                    String str3 = this.f20370;
                    strM17302 = (str3 == null || !m17309(string3, str3)) ? null : this.f20370;
                } else {
                    strM17302 = this.f20369;
                }
            }
            int iM24820 = c9444Execute.m24820();
            if ((iM24820 != 307 && iM24820 != 308) || (strM24817 = c9444Execute.m24817("Location")) == null || (c16903M39867 = c9444Execute.m24826().m21649().m39867(strM24817)) == null) {
                c7954M2389 = null;
            } else {
                C7954 c7954M24826 = c9444Execute.m24826();
                C0496 c0496M21651 = c7954M24826.m21650();
                c0496M21651.m2395(c16903M39867);
                if (strM17302 != null) {
                    String strM17304 = m17302(strM17302, c7954M24826.m21649().toString(), c16903M39867.toString());
                    String strM17309 = m17306(c7954M24826.m21646("DESTINATION"), strM17302, strM17304);
                    if (strM17309 != null) {
                        c0496M21651.m2398("DESTINATION", strM17309);
                    }
                    String strM173010 = m17306(c7954M24826.m21646("If"), strM17302, strM17304);
                    if (strM173010 != null) {
                        c0496M21651.m2398("If", strM173010);
                    }
                }
                c7954M2389 = c0496M21651.m2389();
            }
            if (c7954M2389 == null) {
                boolean z = c20117.f64623;
                String string4 = c7954.m21649().toString();
                String string5 = c9444Execute.m24826().m21649().toString();
                String str4 = this.f20370;
                if (str4 != null && m17309(string4, str4)) {
                    strM17303 = m17302(str4, string4, string5);
                }
                return new C15641(c9444Execute, z, zM17305, strM17303);
            }
            strM17302 = strM17302 == null ? null : m17302(strM17302, string3, c7954M2389.m21649().toString());
            c9444Execute.close();
            i++;
            if (i > 20) {
                throw new ProtocolException(C13645.m33382(i, "Too many follow-up requests: "));
            }
            c9444Execute = this.f20368.m54450(c7954M2389).execute();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17304(C15641 c15641) {
        String str;
        if (!c15641.f50788.m24819() || c15641.f50787 || (str = c15641.f50786) == null) {
            return;
        }
        this.f20369 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17302(String str, String str2, String str3) {
        if (!m17309(str2, str)) {
            return null;
        }
        String strSubstring = str2.substring(str.length());
        if (str3.endsWith(strSubstring)) {
            return m17307(str3.substring(0, str3.length() - strSubstring.length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m17308(String str, String str2, String str3) {
        if (str3 == null || str2.equals(str3) || !m17309(str, str2)) {
            return str;
        }
        StringBuilder sbM27333 = C10732.m27333(str3);
        sbM27333.append(str.substring(str2.length()));
        return sbM27333.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m17306(String str, String str2, String str3) {
        return (str == null || str3 == null || str2.equals(str3)) ? str : str.replace(str2, str3);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m17307(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            str = C16903.m39861(str).toString();
        } catch (IllegalArgumentException unused) {
        }
        while (str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17314(String str, String str2) {
        try {
            str2 = C16903.m39861(str2).toString();
        } catch (IllegalArgumentException unused) {
        }
        C0496 c0496 = new C0496();
        c0496.m2397(str);
        c0496.m2392("MOVE", (AbstractC10190) null);
        C1988 c1988 = new C1988();
        c1988.m6811("DESTINATION", str2);
        c1988.m6811("OVERWRITE", "T");
        c0496.m2393(c1988.m6809());
        C7954 c7954M2389 = c0496.m2389();
        C15641 c15641M17303 = m17303(c7954M2389);
        if (c15641M17303.f50789 && c15641M17303.f50788.m24820() == 403) {
            try {
                c15641M17303.f50788.close();
            } catch (Exception unused2) {
            }
            this.f20369 = null;
            c15641M17303 = m17303(c7954M2389);
        }
        m17304(c15641M17303);
        C20863.m47689(c15641M17303.f50788);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m17309(String str, String str2) {
        char cCharAt;
        if (str2 == null || !str.startsWith(str2)) {
            return false;
        }
        return str.length() == str2.length() || (cCharAt = str.charAt(str2.length())) == '/' || cCharAt == '?' || cCharAt == '#';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17305(C9444 c9444, int i) {
        do {
            c9444 = c9444.m24828();
            if (c9444 == null) {
                return false;
            }
        } while (c9444.m24820() != i);
        return true;
    }
}
