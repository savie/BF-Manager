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

/* JADX INFO: renamed from: l.ۧ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11229 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5079 f38000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile String f38001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38002;

    static {
        MyPullProvider.inject();
    }

    public C11229(C5079 c5079, String str) {
        this.f38000 = c5079;
        this.f38002 = m28194(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28201(String str, String str2, boolean z) {
        C2256 c2256M14172 = this.f38000.m14172();
        c2256M14172.m6931(new C21106(str, str2));
        if (z) {
            c2256M14172.m6928(new C16873(str, str2));
        }
        this.f38000 = c2256M14172.m6922();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28204() {
        return this.f38001;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28202(String str) {
        this.f38001 = m28194(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28198() {
        this.f38001 = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m28195(String str) {
        C9501 c9501M24336;
        Propfind propfind = new Propfind();
        propfind.setAllprop(new Allprop());
        try {
            c9501M24336 = C9501.m24336("text/xml");
        } catch (IllegalArgumentException unused) {
            c9501M24336 = null;
        }
        AbstractC21307 abstractC21307M47776 = AbstractC21307.m47776(c9501M24336, C21938.m48762(propfind));
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17687("Depth", Integer.toString(1));
        c6490.m17681("PROPFIND", abstractC21307M47776);
        return (List) m28186(c6490.m17678(), new C4298());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m28196(long j, String str) {
        if (j == 0) {
            Map map = Collections.EMPTY_MAP;
            C10912 c10912M27342 = C10912.m27342();
            C6490 c6490 = new C6490();
            c6490.m17686(str);
            c6490.m17685();
            c6490.m17682(c10912M27342);
            return (InputStream) m28186(c6490.m17678(), new C9818());
        }
        C6490 c6491 = new C6490();
        c6491.m17686(str);
        c6491.m17685();
        c6491.m17682(C10912.m27340("Range", "bytes=" + j + "-"));
        return (InputStream) m28186(c6491.m17678(), new C16168());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28205(String str) {
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("DELETE", C0140.f1175);
        C22719 c22719M17678 = c6490.m17678();
        C17578 c17578M28188 = m28188(c22719M17678);
        if (c17578M28188.f55870 && c17578M28188.f55873.m42858() == 403) {
            try {
                c17578M28188.f55873.close();
            } catch (Exception unused) {
            }
            this.f38001 = null;
            c17578M28188 = m28188(c22719M17678);
        }
        m28189(c17578M28188);
        C2181.m6778(c17578M28188.f55873);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28199(String str) {
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("MKCOL", (AbstractC21307) null);
        C22719 c22719M17678 = c6490.m17678();
        C17578 c17578M28188 = m28188(c22719M17678);
        if (c17578M28188.f55870 && c17578M28188.f55873.m42858() == 403) {
            try {
                c17578M28188.f55873.close();
            } catch (Exception unused) {
            }
            this.f38001 = null;
            c17578M28188 = m28188(c22719M17678);
        }
        m28189(c17578M28188);
        C2181.m6778(c17578M28188.f55873);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m28203(String str) {
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("HEAD", (AbstractC21307) null);
        return ((Boolean) m28186(c6490.m17678(), new C2055())).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m28186(C22719 c22719, InterfaceC13472 interfaceC13472) throws ProtocolException {
        C17578 c17578M28188 = m28188(c22719);
        if (c17578M28188.f55870 && c17578M28188.f55873.m42858() == 403) {
            try {
                c17578M28188.f55873.close();
            } catch (Exception unused) {
            }
            this.f38001 = null;
            c17578M28188 = m28188(c22719);
        }
        m28189(c17578M28188);
        return interfaceC13472.mo6552(c17578M28188.f55873);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream m28197(String str, String str2, long j) throws ProtocolException {
        C6289 c6289;
        C9501 c9501M24336 = null;
        if (this.f38002 == null) {
            c6289 = new C6289(str, false);
        } else {
            String str3 = this.f38001;
            if (str3 != null) {
                String strM28192 = m28192(str, this.f38002, str3);
                c6289 = new C6289(strM28192, !strM28192.equals(str));
            } else {
                C6490 c6490 = new C6490();
                StringBuilder sb = new StringBuilder();
                String str4 = this.f38002;
                sb.append(str4);
                sb.append("/");
                c6490.m17686(sb.toString());
                c6490.m17681("HEAD", (AbstractC21307) null);
                C17578 c17578M28188 = m28188(c6490.m17678());
                C18485 c18485 = c17578M28188.f55873;
                try {
                    if (c18485.m42863()) {
                        m28189(c17578M28188);
                        String str5 = c17578M28188.f55871;
                        if (str5 != null) {
                            str4 = str5;
                        }
                    } else {
                        int iM42858 = c18485.m42858();
                        if (iM42858 == 405 || iM42858 == 501) {
                            try {
                                c18485.close();
                            } catch (Exception unused) {
                            }
                            C6490 c6491 = new C6490();
                            c6491.m17686(str4 + "/");
                            c6491.m17685();
                            C17578 c17578M28189 = m28188(c6491.m17678());
                            c18485 = c17578M28189.f55873;
                            try {
                                if (c18485.m42863()) {
                                    m28189(c17578M28189);
                                    String str6 = c17578M28189.f55871;
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    c18485.close();
                                } catch (Exception unused2) {
                                }
                                throw th;
                            }
                        }
                    }
                    try {
                        c18485.close();
                    } catch (Exception unused3) {
                    }
                    String strM28193 = m28192(str, this.f38002, str4);
                    c6289 = new C6289(strM28193, (this.f38001 == null || !this.f38001.equals(str4) || strM28193.equals(str)) ? false : true);
                } catch (Throwable th2) {
                    try {
                        c18485.close();
                    } catch (Exception unused4) {
                    }
                    throw th2;
                }
            }
        }
        try {
            c9501M24336 = C9501.m24336(str2);
        } catch (IllegalArgumentException unused5) {
        }
        C19617 c19617 = new C19617(j, c9501M24336);
        C20591 c20591M44709 = c19617.m44709();
        long jM14170 = this.f38000.m14170();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c20591M44709.mo9654(jM14170);
        C6490 c6492 = new C6490();
        c6492.m17686(c6289.f21295);
        c6492.m17681("PUT", c19617);
        c6492.m17682(new C5972().m16265());
        C22719 c22719M17678 = c6492.m17678();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f38000.m14157(c22719M17678).mo10830(new C20401(this, atomicReference, c19617, c6289, atomicBoolean));
        return new C0644(c19617.m44710(), c19617, atomicBoolean, atomicReference);
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
    private C17578 m28188(C22719 c22719) throws ProtocolException {
        C12640 c12640;
        String strM28187;
        String strM42859;
        C14440 c14440M34738;
        C22719 c22719M17678;
        C6490 c6490M50362;
        String strM50357;
        boolean zEquals;
        String strM50358;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zM28190 = false;
        if (this.f38002 == null || this.f38001 == null) {
            c12640 = new C12640(c22719, false);
        } else {
            String str = this.f38001;
            String string = c22719.m50355().toString();
            String strM28192 = m28192(string, this.f38002, str);
            String strM28191 = m28191(c22719.m50357("DESTINATION"), this.f38002, str);
            String strM28193 = m28191(c22719.m50357("If"), this.f38002, str);
            if (string.equals(strM28192)) {
                String strM50359 = c22719.m50357("DESTINATION");
                if (strM28191 == null) {
                    zEquals3 = strM50359 == null;
                } else {
                    zEquals3 = strM28191.equals(strM50359);
                }
                if (zEquals3) {
                    String strM503510 = c22719.m50357("If");
                    if (strM28193 == null) {
                        zEquals4 = strM503510 == null;
                    } else {
                        zEquals4 = strM28193.equals(strM503510);
                    }
                    if (zEquals4) {
                        c12640 = new C12640(c22719, false);
                    } else {
                        c6490M50362 = c22719.m50362();
                        if (!string.equals(strM28192)) {
                            c6490M50362.m17686(strM28192);
                        }
                        strM50357 = c22719.m50357("DESTINATION");
                        if (strM28191 != null) {
                            zEquals = strM28191.equals(strM50357);
                        } else if (strM50357 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals && strM28191 != null) {
                            c6490M50362.m17687("DESTINATION", strM28191);
                        }
                        strM50358 = c22719.m50357("If");
                        if (strM28193 != null) {
                            zEquals2 = strM28193.equals(strM50358);
                        } else if (strM50358 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                        if (!zEquals2 && strM28193 != null) {
                            c6490M50362.m17687("If", strM28193);
                        }
                        c12640 = new C12640(c6490M50362.m17678(), true);
                    }
                } else {
                    c6490M50362 = c22719.m50362();
                    if (!string.equals(strM28192)) {
                        c6490M50362.m17686(strM28192);
                    }
                    strM50357 = c22719.m50357("DESTINATION");
                    if (strM28191 != null) {
                        zEquals = strM28191.equals(strM50357);
                    } else if (strM50357 == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                    if (!zEquals) {
                        c6490M50362.m17687("DESTINATION", strM28191);
                    }
                    strM50358 = c22719.m50357("If");
                    if (strM28193 != null) {
                        zEquals2 = strM28193.equals(strM50358);
                    } else if (strM50358 == null) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                    if (!zEquals2) {
                        c6490M50362.m17687("If", strM28193);
                    }
                    c12640 = new C12640(c6490M50362.m17678(), true);
                }
            } else {
                c6490M50362 = c22719.m50362();
                if (!string.equals(strM28192)) {
                    c6490M50362.m17686(strM28192);
                }
                strM50357 = c22719.m50357("DESTINATION");
                if (strM28191 != null) {
                    zEquals = strM28191.equals(strM50357);
                } else if (strM50357 == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    c6490M50362.m17687("DESTINATION", strM28191);
                }
                strM50358 = c22719.m50357("If");
                if (strM28193 != null) {
                    zEquals2 = strM28193.equals(strM50358);
                } else if (strM50358 == null) {
                    zEquals2 = true;
                } else {
                    zEquals2 = false;
                }
                if (!zEquals2) {
                    c6490M50362.m17687("If", strM28193);
                }
                c12640 = new C12640(c6490M50362.m17678(), true);
            }
        }
        C22719 c227110 = c12640.f42221;
        String string2 = c227110.m50355().toString();
        String strM28188 = null;
        if (this.f38001 == null || !m28193(string2, this.f38001)) {
            String str2 = this.f38002;
            strM28187 = (str2 == null || !m28193(string2, str2)) ? null : this.f38002;
        } else {
            strM28187 = this.f38001;
        }
        C18485 c18485Execute = this.f38000.m14157(c227110).execute();
        int i = 0;
        while (true) {
            if (c18485Execute.m42858() == 307) {
                zM28190 = true;
            }
            zM28190 = zM28190 | m28190(c18485Execute, 302) | m28190(c18485Execute, 303) | m28190(c18485Execute, 307);
            String string3 = c18485Execute.m42866().m50355().toString();
            if (strM28187 == null || !m28193(string3, strM28187)) {
                if (this.f38001 == null || !m28193(string3, this.f38001)) {
                    String str3 = this.f38002;
                    strM28187 = (str3 == null || !m28193(string3, str3)) ? null : this.f38002;
                } else {
                    strM28187 = this.f38001;
                }
            }
            int iM42858 = c18485Execute.m42858();
            if ((iM42858 != 307 && iM42858 != 308) || (strM42859 = c18485Execute.m42859("Location")) == null || (c14440M34738 = c18485Execute.m42866().m50355().m34738(strM42859)) == null) {
                c22719M17678 = null;
            } else {
                C22719 c22719M42866 = c18485Execute.m42866();
                C6490 c6490M50363 = c22719M42866.m50362();
                c6490M50363.m17684(c14440M34738);
                if (strM28187 != null) {
                    String strM28189 = m28187(strM28187, c22719M42866.m50355().toString(), c14440M34738.toString());
                    String strM28194 = m28191(c22719M42866.m50357("DESTINATION"), strM28187, strM28189);
                    if (strM28194 != null) {
                        c6490M50363.m17687("DESTINATION", strM28194);
                    }
                    String strM28195 = m28191(c22719M42866.m50357("If"), strM28187, strM28189);
                    if (strM28195 != null) {
                        c6490M50363.m17687("If", strM28195);
                    }
                }
                c22719M17678 = c6490M50363.m17678();
            }
            if (c22719M17678 == null) {
                boolean z = c12640.f42222;
                String string4 = c22719.m50355().toString();
                String string5 = c18485Execute.m42866().m50355().toString();
                String str4 = this.f38002;
                if (str4 != null && m28193(string4, str4)) {
                    strM28188 = m28187(str4, string4, string5);
                }
                return new C17578(c18485Execute, z, zM28190, strM28188);
            }
            strM28187 = strM28187 == null ? null : m28187(strM28187, string3, c22719M17678.m50355().toString());
            c18485Execute.close();
            i++;
            if (i > 20) {
                throw new ProtocolException(C8479.m22141(i, "Too many follow-up requests: "));
            }
            c18485Execute = this.f38000.m14157(c22719M17678).execute();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28189(C17578 c17578) {
        String str;
        if (!c17578.f55873.m42863() || c17578.f55872 || (str = c17578.f55871) == null) {
            return;
        }
        this.f38001 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28187(String str, String str2, String str3) {
        if (!m28193(str2, str)) {
            return null;
        }
        String strSubstring = str2.substring(str.length());
        if (str3.endsWith(strSubstring)) {
            return m28194(str3.substring(0, str3.length() - strSubstring.length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m28192(String str, String str2, String str3) {
        if (str3 == null || str2.equals(str3) || !m28193(str, str2)) {
            return str;
        }
        StringBuilder sbM23356 = C9023.m23356(str3);
        sbM23356.append(str.substring(str2.length()));
        return sbM23356.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m28191(String str, String str2, String str3) {
        return (str == null || str3 == null || str2.equals(str3)) ? str : str.replace(str2, str3);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m28194(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            str = C14440.m34732(str).toString();
        } catch (IllegalArgumentException unused) {
        }
        while (str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28200(String str, String str2) {
        try {
            str2 = C14440.m34732(str2).toString();
        } catch (IllegalArgumentException unused) {
        }
        C6490 c6490 = new C6490();
        c6490.m17686(str);
        c6490.m17681("MOVE", (AbstractC21307) null);
        C5972 c5972 = new C5972();
        c5972.m16267("DESTINATION", str2);
        c5972.m16267("OVERWRITE", "T");
        c6490.m17682(c5972.m16265());
        C22719 c22719M17678 = c6490.m17678();
        C17578 c17578M28188 = m28188(c22719M17678);
        if (c17578M28188.f55870 && c17578M28188.f55873.m42858() == 403) {
            try {
                c17578M28188.f55873.close();
            } catch (Exception unused2) {
            }
            this.f38001 = null;
            c17578M28188 = m28188(c22719M17678);
        }
        m28189(c17578M28188);
        C2181.m6778(c17578M28188.f55873);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m28193(String str, String str2) {
        char cCharAt;
        if (str2 == null || !str.startsWith(str2)) {
            return false;
        }
        return str.length() == str2.length() || (cCharAt = str.charAt(str2.length())) == '/' || cCharAt == '?' || cCharAt == '#';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28190(C18485 c18485, int i) {
        do {
            c18485 = c18485.m42865();
            if (c18485 == null) {
                return false;
            }
        } while (c18485.m42858() != i);
        return true;
    }
}
