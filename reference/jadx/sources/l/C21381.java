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

/* JADX INFO: renamed from: l.᩸ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G72T */
/* JADX INFO: loaded from: classes5.dex */
public final class C21381 implements InterfaceC19196, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f69517;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69518;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f69519;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f69520;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f69522;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f69523;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f69524;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC10181 f69525;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69526;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f69527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f69528;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f69521 = new Object();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f69529 = new HashSet();

    public C21381(ActivityC10181 activityC10181, AbstractC9677 abstractC9677, String str, boolean z, AbstractC20745 abstractC20745, String str2, boolean z2) {
        this.f69525 = activityC10181;
        this.f69519 = abstractC9677;
        this.f69524 = abstractC9677 instanceof C21920 ? new Object() : abstractC9677;
        this.f69518 = str;
        this.f69520 = z;
        this.f69522 = abstractC9677 instanceof AbstractC12233;
        this.f69523 = abstractC20745;
        this.f69527 = str2;
        this.f69528 = z2;
    }

    @Override // l.InterfaceC19196
    /* JADX INFO: renamed from: ۙ */
    public final WebResourceResponse mo44106(String str) {
        return m47924(str, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m47932(String str) {
        if (this.f69522) {
            m47927(false);
        }
        return m47924(str, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m47924(String str, boolean z) {
        final int i;
        final InterfaceC2557 interfaceC2557M47921;
        C1542 c1542;
        synchronized (this.f69521) {
            i = this.f69526;
        }
        if (!m47928(i)) {
            return m47930(404, "Not Found");
        }
        String strM32001 = C12915.m32001(str);
        if (strM32001 != null && (strM32001.isEmpty() || str.endsWith("/"))) {
            strM32001 = strM32001.isEmpty() ? "index.html" : strM32001.concat("/index.html");
        }
        String str2 = strM32001;
        String strM32003 = C12915.m32003(this.f69518, str2);
        if (str2 == null || strM32003 == null) {
            return m47930(404, "Not Found");
        }
        try {
            if (this.f69523 != null && strM32003.equals(this.f69527)) {
                return m47923("text/html", a.D, new C1542(this.f69523.mo33970(), new Consumer() { // from class: l.᩺ۚ᩹
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C21381.m47926(this.f74179, (C1542) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C1455.$default$andThen(this, consumer);
                    }
                }), i);
            }
            if (!this.f69528) {
                return m47930(404, "Not Found");
            }
            synchronized (this.f69524) {
                synchronized (this.f69519) {
                    if (!m47928(i)) {
                        return m47930(404, "Not Found");
                    }
                    if (this.f69522 && z) {
                        this.f69519.mo10267(false);
                    }
                    if (this.f69520 || this.f69522) {
                        interfaceC2557M47921 = m47921(str2);
                    } else {
                        interfaceC2557M47921 = this.f69519.mo10264(strM32003);
                    }
                    if (interfaceC2557M47921 != null && ((C15404) interfaceC2557M47921).mo7985()) {
                        if (this.f69522) {
                            c1542 = new C1542(new InterfaceC14244() { // from class: l.ܶۚ᩹
                                @Override // l.InterfaceC14244
                                /* JADX INFO: renamed from: ۙ */
                                public final InputStream mo34378() {
                                    return C21381.m47925(this.f49008, i, interfaceC2557M47921);
                                }
                            }, new Consumer() { // from class: l.᩺ۚ᩹
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C21381.m47926(this.f74179, (C1542) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C1455.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            InputStream inputStreamMo15073 = this.f69519.mo15073(this.f69525, interfaceC2557M47921);
                            if (inputStreamMo15073 == null) {
                                return m47930(404, "Not Found");
                            }
                            c1542 = new C1542(inputStreamMo15073, new Consumer() { // from class: l.᩺ۚ᩹
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C21381.m47926(this.f74179, (C1542) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C1455.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return m47923(C10010.m25285(str2), null, c1542, i);
                    }
                    return m47922(404, "Not Found", z);
                }
            }
        } catch (IOException | RuntimeException unused) {
            if (this.f69522 && m47928(i)) {
                return m47922(502, "Bad Gateway", z);
            }
            return m47930(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private InterfaceC2557 m47921(String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(this.f69518);
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
        InterfaceC2557 interfaceC2557Mo10264 = null;
        while (it.hasNext()) {
            interfaceC2557Mo10264 = this.f69519.mo10264((String) it.next());
            if (interfaceC2557Mo10264 == null || ((C15404) interfaceC2557Mo10264).mo7986()) {
                return null;
            }
        }
        return interfaceC2557Mo10264;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m47925(C21381 c21381, int i, InterfaceC2557 interfaceC2557) {
        InputStream inputStreamMo15073;
        synchronized (c21381.f69519) {
            if (!c21381.m47928(i)) {
                throw new IOException("HTML preview request was cancelled");
            }
            inputStreamMo15073 = c21381.f69519.mo15073(c21381.f69525, interfaceC2557);
        }
        return inputStreamMo15073;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m47923(String str, String str2, C1542 c1542, int i) {
        synchronized (this.f69521) {
            if (!this.f69517 && i == this.f69526) {
                this.f69529.add(c1542);
                return new WebResourceResponse(str, str2, 200, "OK", m47929(), c1542);
            }
            c1542.close();
            return m47930(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m47922(int i, String str, boolean z) {
        if (!this.f69522 || !z) {
            return m47930(i, str);
        }
        return new WebResourceResponse("text/html", a.D, i, str, m47929(), new ByteArrayInputStream(("<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C16737.m39288(R.string.MT_Protector)) + "</p><p><a href=\"\">" + Html.escapeHtml(C16737.m39288(R.string.MT_Protector)) + "</a></p>").getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m47930(int i, String str) {
        return new WebResourceResponse("text/plain", a.D, i, str, m47929(), new ByteArrayInputStream(new byte[0]));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m47929() {
        HashMap map = new HashMap();
        map.put("Cache-Control", "no-store");
        map.put("Referrer-Policy", "same-origin");
        map.put("Cross-Origin-Resource-Policy", "same-origin");
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47931() {
        m47927(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m47927(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47927(boolean z) {
        int i;
        C1542[] c1542Arr;
        synchronized (this.f69521) {
            this.f69517 = z | this.f69517;
            this.f69526++;
            c1542Arr = (C1542[]) this.f69529.toArray(new C1542[0]);
            this.f69529.clear();
        }
        for (C1542 c1542 : c1542Arr) {
            c1542.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47928(int i) {
        boolean z;
        synchronized (this.f69521) {
            z = !this.f69517 && this.f69526 == i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47926(C21381 c21381, C1542 c1542) {
        synchronized (c21381.f69521) {
            c21381.f69529.remove(c1542);
        }
    }
}
