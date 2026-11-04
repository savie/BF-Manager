package l;

import android.content.res.AssetManager;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۤ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11224 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f35405;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.֨ۧܳ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۢۧܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28289(C13812 c13812, String str, boolean z, AssetManager assetManager, Writer writer, String str2) throws IOException {
        String str3;
        HashMap map;
        C15496 c15496M7819;
        String str4;
        int iM28287;
        String strM33723 = c13812.m33723();
        List<InterfaceC6881> list = f35405;
        if (strM33723.length() > 1000000) {
            throw new C22413();
        }
        try {
            final C0389 c0389 = new C0389(strM33723.length());
            C11991 c11991 = new C11991();
            c11991.m30141(list);
            c11991.m30143(new C4118(strM33723));
            c11991.m30142(c0389);
            c11991.m30144((C10083) new InterfaceC3042() { // from class: l.ۢۧܳ
                @Override // l.InterfaceC3042
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC23180 mo9894(C11858 c11858) {
                    c0389.m2197(c11858);
                    return new C8592(c11858);
                }
            });
            c11991.m30146(EnumC15720.BLOCKS_AND_INLINES);
            AbstractC4534 abstractC4534M53443 = c11991.m30140().m53443(strM33723);
            int i = 0;
            AbstractC4534 abstractC4534M14254 = abstractC4534M53443;
            while (abstractC4534M14254 != null) {
                i++;
                if (i > 100000) {
                    throw new C22413();
                }
                if (abstractC4534M14254.m14254() != null) {
                    abstractC4534M14254 = abstractC4534M14254.m14254();
                } else {
                    while (abstractC4534M14254 != abstractC4534M53443 && abstractC4534M14254.m14261() == null) {
                        abstractC4534M14254 = abstractC4534M14254.mo14267();
                    }
                    abstractC4534M14254 = abstractC4534M14254 == abstractC4534M53443 ? null : abstractC4534M14254.m14261();
                }
            }
            final String str5 = "data-mt-" + UUID.randomUUID();
            final String strM34972 = C14483.m34972(str5, "-kind");
            final HashMap map2 = new HashMap();
            final StringBuilder sb = new StringBuilder();
            final TreeMap treeMap = new TreeMap();
            C16685 c16685 = new C16685();
            for (InterfaceC6881 interfaceC6881 : list) {
                if (interfaceC6881 instanceof InterfaceC17431) {
                    ((InterfaceC17431) interfaceC6881).mo13409(c16685);
                }
            }
            c16685.m39454();
            c16685.m39452((C1135) new InterfaceC19669() { // from class: l.֨ۧܳ
                /* JADX WARN: Type inference failed for: r0v0, types: [l.ۖۧܳ] */
                @Override // l.InterfaceC19669
                public final C2626 create() {
                    final String str6 = strM34972;
                    final String str7 = str5;
                    final HashMap map3 = map2;
                    return new InterfaceC22653() { // from class: l.ۖۧܳ
                        @Override // l.InterfaceC22653
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final void mo8767(AbstractC4534 abstractC4534, String str8, LinkedHashMap linkedHashMap) {
                            if (abstractC4534 instanceof C18483) {
                                C18483 c18483 = (C18483) abstractC4534;
                                if ("pre".equals(str8)) {
                                    String str9 = c18483.m43073().trim().split("\\s+", 2)[0];
                                    if (str9.equals("math") || str9.equals("mermaid")) {
                                        linkedHashMap.put(str6, str9);
                                    }
                                }
                            }
                            if ((!(abstractC4534 instanceof AbstractC23705) && !(abstractC4534 instanceof AbstractC24451)) || (abstractC4534 instanceof C18288) || abstractC4534.m14263().isEmpty()) {
                                return;
                            }
                            List listM14263 = abstractC4534.m14263();
                            int iM15872 = ((C5280) listM14263.get(0)).m15872();
                            int iM15873 = ((C5280) C7750.m21093(1, listM14263)).m15872();
                            linkedHashMap.put(str7, iM15872 + ":" + iM15873);
                            if ("pre".equals(str8)) {
                                boolean z2 = abstractC4534 instanceof C18483;
                                if (z2 || (abstractC4534 instanceof C9532)) {
                                    map3.put(iM15872 + ":" + iM15873, Integer.toString(iM15872 + (z2 ? 1 : 0)));
                                }
                            }
                        }
                    };
                }
            });
            c16685.m39453(new InterfaceC11464() { // from class: l.ۡۧܳ
                @Override // l.InterfaceC11464
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC10718 mo15151(InterfaceC1770 interfaceC1770) {
                    return new C7101(strM34972, interfaceC1770, treeMap, sb);
                }
            });
            c16685.m39451().m52583(abstractC4534M53443, sb);
            C5056 c5056M15292 = C5056.m15292("https://markdown.invalid/");
            C11988 c11988 = new C11988(new C4310());
            c11988.m30126();
            c5056M15292.m15302().m37071(0, c11988.m30118(sb.toString(), c5056M15292.m15302(), c5056M15292.mo37098()));
            for (C15496 c15496 : C17493.m41001(new C12272(), c5056M15292)) {
                if (!c15496.mo41539(str5) && (iM28287 = m28287(treeMap, c15496.m41537().m47386().m11612())) >= 0) {
                    int iM28288 = m28287(treeMap, c15496.m37067().m47384().m11612() - 1);
                    if (iM28288 < iM28287) {
                        iM28288 = m28287(treeMap, c15496.m41537().m47384().m11612() - 1);
                    }
                    c15496.mo41528(str5, iM28287 + ":" + Math.max(iM28287, iM28288));
                }
            }
            C11526 c11526 = new C11526();
            c11526.m29024(am.av, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", am.aC, "img", "li", "ol", am.ax, "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", am.aH, "ul");
            c11526.m29023(am.av, "href", "title");
            c11526.m29023("blockquote", "cite");
            c11526.m29023("col", "span", "width");
            c11526.m29023("colgroup", "span", "width");
            c11526.m29023("img", "align", "alt", "height", "src", "title", "width");
            c11526.m29023("ol", "start", "type");
            c11526.m29023("q", "cite");
            c11526.m29023("table", ErrorBundle.SUMMARY_ENTRY, "width");
            String str6 = "span";
            HashMap map3 = map2;
            c11526.m29023("td", "abbr", "axis", "colspan", "rowspan", "width");
            c11526.m29023("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
            c11526.m29023("ul", "type");
            c11526.m29022(am.av, "href", "ftp", a.s, b.a, "mailto");
            c11526.m29022("blockquote", "cite", a.s, b.a);
            c11526.m29022("cite", "cite", a.s, b.a);
            c11526.m29022("img", "src", a.s, b.a);
            c11526.m29022("q", "cite", a.s, b.a);
            c11526.m29024("div", "span", "del", am.aB, "hr", ErrorBundle.DETAIL_ENTRY, ErrorBundle.SUMMARY_ENTRY, "input");
            c11526.m29023(":all", str5, strM34972);
            c11526.m29023(ErrorBundle.DETAIL_ENTRY, "open");
            c11526.m29023("input", "checked");
            c11526.m29021("type", "checkbox");
            c11526.m29021("disabled", "disabled");
            c11526.m29022(am.av, "href", "#");
            c11526.m29020();
            String[] strArr = {"div", am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "th", "td"};
            for (int i2 = 0; i2 < 10; i2++) {
                c11526.m29023(strArr[i2], "align");
            }
            C5056 c5056M51223 = new C22715(c11526).m51223(c5056M15292);
            c5056M51223.m15300().m20279();
            for (C15496 c15497 : c5056M51223.m37086("[align]")) {
                if (!c15497.m37100().equals("img")) {
                    String lowerCase = c15497.mo41538("align").toLowerCase(Locale.ROOT);
                    if (lowerCase.equals("left") || lowerCase.equals("center") || lowerCase.equals("right")) {
                        c15497.mo41528("align", lowerCase);
                    } else {
                        c15497.m37064("align");
                    }
                }
            }
            C14838.m35755(strM34972);
            for (C15496 c15498 : C17493.m41001(new C6307(strM34972.trim()), c5056M51223)) {
                String strMo41538 = c15498.mo41538(strM34972);
                c15498.m37064(strM34972);
                c15498.mo41528("data-mt-render", strMo41538);
                String strM37094 = c15498.m37094();
                c15498.m37091();
                c15498.mo15297(strM37094);
                c15498.m37101(strMo41538.equals("inline-math") ? str6 : "div");
                c15498.m37092("mt-".concat(strMo41538));
            }
            C14838.m35755(str5);
            for (C15496 c15499 : C17493.m41001(new C6307(str5.trim()), c5056M51223)) {
                String strMo41539 = c15499.mo41538(str5);
                int iIndexOf = strMo41539.indexOf(58);
                c15499.m37064(str5);
                c15499.mo41528("data-source-start", strMo41539.substring(0, iIndexOf));
                c15499.mo41528("data-source-end", strMo41539.substring(iIndexOf + 1));
                if (c15499.m37100().equals("pre")) {
                    map = map3;
                    if (map.containsKey(strMo41539) && (c15496M7819 = C2316.m7819("code", c15499)) != null) {
                        String strM37095 = c15496M7819.m37094();
                        c15496M7819.m37091();
                        int i3 = Integer.parseInt((String) map.get(strMo41539));
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 <= strM37095.length()) {
                            if (i4 >= strM37095.length() || strM37095.charAt(i4) == '\n') {
                                if (i4 > i5 || i4 < strM37095.length()) {
                                    str4 = str6;
                                    C15496 c15496M37088 = c15496M7819.m37088(str4);
                                    c15496M37088.mo41528("data-source-start", Integer.toString(i3));
                                    c15496M37088.mo41528("data-source-end", Integer.toString(i3));
                                    c15496M37088.mo15297(strM37095.substring(i5, i4));
                                } else {
                                    str4 = str6;
                                }
                                if (i4 < strM37095.length()) {
                                    c15496M7819.m37084(new C12513("\n"));
                                }
                                i5 = i4 + 1;
                                i3++;
                            } else {
                                str4 = str6;
                            }
                            i4++;
                            str6 = str4;
                        }
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    map = map3;
                }
                map3 = map;
                str6 = str3;
            }
            HashSet hashSet = new HashSet();
            for (C15496 c154910 : c5056M51223.m37086("input")) {
                C15496 c15496Mo37068 = c154910.mo37068();
                if (c15496Mo37068 != null && c15496Mo37068.m37100().equals(am.ax)) {
                    c15496Mo37068 = c15496Mo37068.mo37068();
                }
                if (c15496Mo37068 != null && c15496Mo37068.m37100().equals("li")) {
                    c15496Mo37068.m37092("task-list-item");
                    c154910.m37092("task-list-item-checkbox");
                }
            }
            for (C15496 c154911 : c5056M51223.m37086("h1,h2,h3,h4,h5,h6")) {
                String lowerCase2 = c154911.m37087().toLowerCase(Locale.ROOT);
                StringBuilder sb2 = new StringBuilder();
                int iCharCount = 0;
                while (iCharCount < lowerCase2.length()) {
                    int iCodePointAt = lowerCase2.codePointAt(iCharCount);
                    iCharCount += Character.charCount(iCodePointAt);
                    if (Character.isLetterOrDigit(iCodePointAt) || iCodePointAt == 95 || iCodePointAt == 45) {
                        sb2.appendCodePoint(iCodePointAt);
                    } else if (Character.isWhitespace(iCodePointAt)) {
                        sb2.append('-');
                    }
                }
                String string = sb2.length() == 0 ? "section" : sb2.toString();
                int i6 = 1;
                String str7 = string;
                while (!hashSet.add(str7)) {
                    str7 = string + "-" + i6;
                    i6++;
                }
                C14838.m35754((Object) str7);
                c154911.mo41528("id", str7);
            }
            boolean zIsEmpty = c5056M51223.m37086("[data-mt-render]").isEmpty();
            String string2 = UUID.randomUUID().toString();
            StringBuilder sb3 = new StringBuilder("<!doctype html><html data-theme=\"");
            sb3.append(z ? "dark" : "light");
            sb3.append("\"><head><meta charset=\"utf-8\"><title>");
            C15496 c154912 = new C15496("title");
            c154912.mo15297(str);
            sb3.append(c154912.m37079());
            C4794.m14774(sb3, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src 'self' 'unsafe-inline'; script-src 'unsafe-inline' 'nonce-", string2, "'; base-uri 'none'; form-action 'none'\"><style nonce=\"", string2);
            sb3.append("\">");
            writer.write(sb3.toString());
            String[] strArr2 = {"light", "dark"};
            for (int i7 = 0; i7 < 2; i7++) {
                String str8 = strArr2[i7];
                writer.write(m28288(assetManager, C14442.m34865("github-markdown-", str8, ".css")).replace(".markdown-body", "html[data-theme=\"" + str8 + "\"] .markdown-body"));
            }
            writer.write(m28288(assetManager, "preview.css"));
            C15496 c154913 = new C15496("article");
            c154913.m37092("markdown-body");
            c154913.mo41528("data-render-error", str2);
            writer.write("</style><script nonce=\"" + string2 + "\">if(window.__mtMarkdownState){document.documentElement.setAttribute('data-mt-position-pending','');setTimeout(function(){document.documentElement.removeAttribute('data-mt-position-pending');},2000);}</script></head><body><article" + c154913.mo37069().m26655() + ">");
            c5056M51223.m15302().m37072(writer);
            StringBuilder sb4 = new StringBuilder("</article><script nonce=\"");
            sb4.append(string2);
            sb4.append("\">");
            writer.write(sb4.toString());
            writer.write(m28288(assetManager, "preview.js"));
            writer.write(m28288(assetManager, "outline.js"));
            writer.write("</script>");
            if (!zIsEmpty) {
                writer.write("<script nonce=\"" + string2 + "\">");
                writer.write(m28288(assetManager, "enhance.js"));
                writer.write("</script>");
            }
            writer.write("</body></html>");
        } catch (C5259 unused) {
            throw new C22413();
        }
    }

    static {
        int iM9136 = 0;
        Object[] objArr = {new C16881(), new C22103(), new C4203()};
        ArrayList arrayList = new ArrayList(3);
        while (iM9136 < 3) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
        }
        f35405 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28288(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open("preview/" + str);
        try {
            String strM15490 = C5125.m15490(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return strM15490;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28287(TreeMap treeMap, int i) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
        if (entryFloorEntry == null) {
            return -1;
        }
        return ((Integer) entryFloorEntry.getValue()).intValue();
    }
}
