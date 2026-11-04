package l;

import android.text.Html;
import android.webkit.WebResourceResponse;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G72T */
/* JADX INFO: loaded from: classes3.dex */
public final class C0851 implements InterfaceC13138, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f3200;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f3201;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f3202;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f3204;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f3205;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f3207;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f3208;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC3846 f3209;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f3210;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f3211;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f3212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f3203 = new Object();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashSet f3206 = new HashSet();

    public C0851(ActivityC3846 activityC3846, AbstractC7629 abstractC7629, String str, boolean z, AbstractC22044 abstractC22044, String str2, boolean z2) {
        this.f3209 = activityC3846;
        this.f3208 = abstractC7629;
        this.f3202 = abstractC7629 instanceof C17036 ? new Object() : abstractC7629;
        this.f3205 = str;
        this.f3207 = z;
        this.f3201 = abstractC7629 instanceof AbstractC18881;
        this.f3204 = abstractC22044;
        this.f3211 = str2;
        this.f3212 = z2;
    }

    @Override // l.InterfaceC13138
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse mo3477(String str) {
        return m3469(str, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m3480(String str) {
        if (this.f3201) {
            m3472(false);
        }
        return m3469(str, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m3481(String str, String[] strArr) {
        String strM3478;
        if (!this.f3201) {
            return m3478(str, strArr);
        }
        m3472(false);
        synchronized (this.f3208) {
            this.f3208.mo20837(false);
            strM3478 = m3478(str, strArr);
        }
        return strM3478;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3478(String str, String[] strArr) {
        String str2;
        String strM41985 = C18004.m41985(str);
        if (strM41985 != null) {
            if (this.f3204 != null && (str2 = this.f3211) != null && str2.equals(C18004.m41987(this.f3205, strM41985))) {
                return "/".concat(strM41985);
            }
            if (this.f3212) {
                synchronized (this.f3208) {
                    InterfaceC2386 interfaceC2386M3476 = strM41985.isEmpty() ? null : m3476(strM41985);
                    if (!strM41985.isEmpty() && interfaceC2386M3476 == null) {
                        interfaceC2386M3476 = m3476(strM41985.concat("/"));
                    }
                    if (!strM41985.isEmpty()) {
                        if (interfaceC2386M3476 == null) {
                            return null;
                        }
                        if (!((C13352) interfaceC2386M3476).isDirectory()) {
                            return "/".concat(strM41985);
                        }
                    }
                    String strConcat = strM41985.isEmpty() ? "" : strM41985.concat("/");
                    for (String str3 : strArr) {
                        InterfaceC2386 interfaceC2386M3477 = m3476(strConcat + str3);
                        if (interfaceC2386M3477 != null && ((C13352) interfaceC2386M3477).mo8090() && (!this.f3207 || interfaceC2386M3477.mo8093().mo4304())) {
                            return "/" + strConcat + str3;
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private InterfaceC2386 m3476(String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(this.f3205);
        int i = 0;
        while (i < str.length()) {
            int iIndexOf = str.indexOf(47, i);
            boolean z = iIndexOf == -1;
            if (z) {
                iIndexOf = str.length();
            }
            sb.append((CharSequence) str, i, iIndexOf);
            if (z) {
                string = sb.toString();
            } else {
                string = ((Object) sb) + "/";
            }
            arrayList.add(string);
            if (!z) {
                sb.append('/');
            }
            i = iIndexOf + 1;
        }
        Iterator it = arrayList.iterator();
        InterfaceC2386 interfaceC2386Mo20831 = null;
        while (it.hasNext()) {
            interfaceC2386Mo20831 = this.f3208.mo20831((String) it.next());
            if (interfaceC2386Mo20831 == null || ((C13352) interfaceC2386Mo20831).mo8107()) {
                return null;
            }
        }
        return interfaceC2386Mo20831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m3469(String str, boolean z) {
        final int i;
        final InterfaceC2386 interfaceC2386M3476;
        C23226 c23226;
        synchronized (this.f3203) {
            i = this.f3200;
        }
        if (!m3473(i)) {
            return m3474(404, "Not Found");
        }
        String strM41985 = C18004.m41985(str);
        if (strM41985 != null && (strM41985.isEmpty() || str.endsWith("/"))) {
            strM41985 = strM41985.isEmpty() ? "index.html" : strM41985.concat("/index.html");
        }
        String str2 = strM41985;
        String strM41987 = C18004.m41987(this.f3205, str2);
        if (str2 == null || strM41987 == null) {
            return m3474(404, "Not Found");
        }
        try {
            if (this.f3204 != null && strM41987.equals(this.f3211)) {
                return m3468("text/html", a.D, new C23226(this.f3204.mo4290(), new Consumer() { // from class: l.ᩳ֫ܳ
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        C0851.m3471(this.f60910, (C23226) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }
                }), i);
            }
            if (!this.f3212) {
                return m3474(404, "Not Found");
            }
            synchronized (this.f3202) {
                synchronized (this.f3208) {
                    if (!m3473(i)) {
                        return m3474(404, "Not Found");
                    }
                    if (this.f3201 && z) {
                        this.f3208.mo20837(false);
                    }
                    if (this.f3207 || this.f3201) {
                        interfaceC2386M3476 = m3476(str2);
                    } else {
                        interfaceC2386M3476 = this.f3208.mo20831(strM41987);
                    }
                    if (interfaceC2386M3476 != null && ((C13352) interfaceC2386M3476).mo8090()) {
                        if (this.f3201) {
                            c23226 = new C23226(new InterfaceC15766() { // from class: l.ۢ֫ܳ
                                @Override // l.InterfaceC15766
                                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                public final InputStream mo25529() {
                                    return C0851.m3470(this.f31585, i, interfaceC2386M3476);
                                }
                            }, new Consumer() { // from class: l.ᩳ֫ܳ
                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void n(Object obj) {
                                    C0851.m3471(this.f60910, (C23226) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C12312.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            InputStream inputStreamMo20829 = this.f3208.mo20829(this.f3209, interfaceC2386M3476);
                            if (inputStreamMo20829 == null) {
                                return m3474(404, "Not Found");
                            }
                            c23226 = new C23226(inputStreamMo20829, new Consumer() { // from class: l.ᩳ֫ܳ
                                @Override // java.util.function.Consumer
                                /* JADX INFO: renamed from: accept */
                                public final void n(Object obj) {
                                    C0851.m3471(this.f60910, (C23226) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C12312.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return m3468(C11401.m28751(str2), null, c23226, i);
                    }
                    return m3467(404, "Not Found", z);
                }
            }
        } catch (IOException | RuntimeException unused) {
            if (this.f3201 && m3473(i)) {
                return m3467(502, "Bad Gateway", z);
            }
            return m3474(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m3470(C0851 c0851, int i, InterfaceC2386 interfaceC2386) {
        InputStream inputStreamMo20829;
        synchronized (c0851.f3208) {
            if (!c0851.m3473(i)) {
                throw new IOException("HTML preview request was cancelled");
            }
            inputStreamMo20829 = c0851.f3208.mo20829(c0851.f3209, interfaceC2386);
        }
        return inputStreamMo20829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m3468(String str, String str2, C23226 c23226, int i) {
        synchronized (this.f3203) {
            if (!this.f3210 && i == this.f3200) {
                this.f3206.add(c23226);
                return new WebResourceResponse(str, str2, 200, "OK", m3475(), c23226);
            }
            c23226.close();
            return m3474(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m3467(int i, String str, boolean z) {
        if (!this.f3201 || !z) {
            return m3474(i, str);
        }
        return new WebResourceResponse("text/html", a.D, i, str, m3475(), new ByteArrayInputStream(("<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C21576.m49088(R.string.MT_Protector)) + "</p><p><a href=\"\">" + Html.escapeHtml(C21576.m49088(R.string.MT_Protector)) + "</a></p>").getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m3474(int i, String str) {
        return new WebResourceResponse("text/plain", a.D, i, str, m3475(), new ByteArrayInputStream(new byte[0]));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap m3475() {
        HashMap map = new HashMap();
        map.put("Cache-Control", "no-store");
        map.put("Referrer-Policy", "same-origin");
        map.put("Cross-Origin-Resource-Policy", "same-origin");
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3479() {
        m3472(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m3472(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3472(boolean z) {
        int i;
        C23226[] c23226Arr;
        synchronized (this.f3203) {
            this.f3210 = z | this.f3210;
            this.f3200++;
            c23226Arr = (C23226[]) this.f3206.toArray(new C23226[0]);
            this.f3206.clear();
        }
        for (C23226 c23226 : c23226Arr) {
            c23226.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m3473(int i) {
        boolean z;
        synchronized (this.f3203) {
            z = !this.f3210 && this.f3200 == i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3471(C0851 c0851, C23226 c23226) {
        synchronized (c0851.f3203) {
            c0851.f3206.remove(c23226);
        }
    }
}
