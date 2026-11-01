package l;

import android.content.res.AssetManager;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.umeng.analytics.pro.am;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
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
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ܰ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C14119 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f46356;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۛۚ᩹] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ܿۚ᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34157(C9388 c9388, String str, boolean z, AssetManager assetManager, BufferedWriter bufferedWriter, String str2) throws IOException {
        String str3;
        HashMap map;
        C0617 c0617M42466;
        String str4;
        int iM34155;
        String strM24084 = c9388.m24084();
        List<InterfaceC21772> list = f46356;
        if (strM24084.length() > 1000000) {
            throw new C4945();
        }
        try {
            final C16443 c16443 = new C16443(strM24084.length());
            C9490 c9490 = new C9490();
            c9490.m24310(list);
            c9490.m24312(new C20676(strM24084));
            c9490.m24315(c16443);
            c9490.m24313((C17148) new InterfaceC1727() { // from class: l.ܿۚ᩹
                @Override // l.InterfaceC1727
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC14429 mo1699(C16524 c16524) {
                    c16443.m38710(c16524);
                    return new C14327(c16524);
                }
            });
            c9490.m24316(EnumC23601.BLOCKS_AND_INLINES);
            AbstractC19367 abstractC19367M12737 = c9490.m24309().m12737(strM24084);
            int i = 0;
            AbstractC19367 abstractC19367M44383 = abstractC19367M12737;
            while (abstractC19367M44383 != null) {
                i++;
                if (i > 100000) {
                    throw new C4945();
                }
                if (abstractC19367M44383.m44383() != null) {
                    abstractC19367M44383 = abstractC19367M44383.m44383();
                } else {
                    while (abstractC19367M44383 != abstractC19367M12737 && abstractC19367M44383.m44390() == null) {
                        abstractC19367M44383 = abstractC19367M44383.mo35319();
                    }
                    abstractC19367M44383 = abstractC19367M44383 == abstractC19367M12737 ? null : abstractC19367M44383.m44390();
                }
            }
            final String str5 = "data-mt-" + UUID.randomUUID();
            final String strM37076 = C15489.m37076(str5, "-kind");
            final HashMap map2 = new HashMap();
            final StringBuilder sb = new StringBuilder();
            final TreeMap treeMap = new TreeMap();
            C17291 c17291 = new C17291();
            for (InterfaceC21772 interfaceC21772 : list) {
                if (interfaceC21772 instanceof InterfaceC6002) {
                    ((InterfaceC6002) interfaceC21772).mo12641(c17291);
                }
            }
            c17291.m40259();
            c17291.m40257((C5859) new InterfaceC7413() { // from class: l.ۛۚ᩹
                /* JADX WARN: Type inference failed for: r0v0, types: [l.᩻ۚ᩹] */
                @Override // l.InterfaceC7413
                public final C23499 create() {
                    final String str6 = strM37076;
                    final String str7 = str5;
                    final HashMap map3 = map2;
                    return new InterfaceC10236() { // from class: l.᩻ۚ᩹
                        @Override // l.InterfaceC10236
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo26029(AbstractC19367 abstractC19367, String str8, LinkedHashMap linkedHashMap) {
                            if (abstractC19367 instanceof C22189) {
                                C22189 c22189 = (C22189) abstractC19367;
                                if ("pre".equals(str8)) {
                                    String str9 = c22189.m49225().trim().split("\\s+", 2)[0];
                                    if (str9.equals("math") || str9.equals("mermaid")) {
                                        linkedHashMap.put(str6, str9);
                                    }
                                }
                            }
                            if ((!(abstractC19367 instanceof AbstractC14738) && !(abstractC19367 instanceof AbstractC13723)) || (abstractC19367 instanceof C0214) || abstractC19367.m44394().isEmpty()) {
                                return;
                            }
                            List listM44394 = abstractC19367.m44394();
                            int iM1948 = ((C0316) listM44394.get(0)).m1948();
                            int iM1949 = ((C0316) C3012.m8974(1, listM44394)).m1948();
                            linkedHashMap.put(str7, iM1948 + ":" + iM1949);
                            if ("pre".equals(str8)) {
                                boolean z2 = abstractC19367 instanceof C22189;
                                if (z2 || (abstractC19367 instanceof C15134)) {
                                    map3.put(iM1948 + ":" + iM1949, Integer.toString(iM1948 + (z2 ? 1 : 0)));
                                }
                            }
                        }
                    };
                }
            });
            c17291.m40258(new InterfaceC16586() { // from class: l.ۧۚ᩹
                @Override // l.InterfaceC16586
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC8825 mo10137(InterfaceC0357 interfaceC0357) {
                    return new C1625(strM37076, interfaceC0357, treeMap, sb);
                }
            });
            c17291.m40256().m52108(abstractC19367M12737, sb);
            C10497 c10497M26634 = C10497.m26634("https://markdown.invalid/");
            C13756 c13756 = new C13756(new C5247());
            c13756.m33514();
            c10497M26634.m26640().m2840(0, c13756.m33515(sb.toString(), c10497M26634.m26640(), c10497M26634.mo2853()));
            for (C0617 c0617 : C14772.m35410(new C13921(), c10497M26634)) {
                if (!c0617.mo28140(str5) && (iM34155 = m34155(treeMap, c0617.m35271().m12680().m10146())) >= 0) {
                    int iM34156 = m34155(treeMap, c0617.m2862().m12678().m10146() - 1);
                    if (iM34156 < iM34155) {
                        iM34156 = m34155(treeMap, c0617.m35271().m12678().m10146() - 1);
                    }
                    c0617.mo20268(str5, iM34155 + ":" + Math.max(iM34155, iM34156));
                }
            }
            C6304 c6304 = new C6304();
            c6304.m17397(am.av, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", am.aC, "img", "li", "ol", am.ax, "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", am.aH, "ul");
            c6304.m17396(am.av, "href", "title");
            c6304.m17396("blockquote", "cite");
            c6304.m17396("col", "span", "width");
            c6304.m17396("colgroup", "span", "width");
            c6304.m17396("img", "align", "alt", "height", "src", "title", "width");
            c6304.m17396("ol", "start", "type");
            c6304.m17396("q", "cite");
            c6304.m17396("table", ErrorBundle.SUMMARY_ENTRY, "width");
            String str6 = "span";
            HashMap map3 = map2;
            c6304.m17396("td", "abbr", "axis", "colspan", "rowspan", "width");
            c6304.m17396("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
            c6304.m17396("ul", "type");
            c6304.m17395(am.av, "href", "ftp", a.s, b.a, "mailto");
            c6304.m17395("blockquote", "cite", a.s, b.a);
            c6304.m17395("cite", "cite", a.s, b.a);
            c6304.m17395("img", "src", a.s, b.a);
            c6304.m17395("q", "cite", a.s, b.a);
            c6304.m17397("div", "span", "del", am.aB, "hr", ErrorBundle.DETAIL_ENTRY, ErrorBundle.SUMMARY_ENTRY, "input");
            c6304.m17396(":all", str5, strM37076);
            c6304.m17396(ErrorBundle.DETAIL_ENTRY, "open");
            c6304.m17396("th", "align");
            c6304.m17396("td", "align");
            c6304.m17396("input", "checked");
            c6304.m17394("type", "checkbox");
            c6304.m17394("disabled", "disabled");
            c6304.m17395(am.av, "href", "#");
            c6304.m17393();
            C10497 c10497M38270 = new C16183(c6304).m38270(c10497M26634);
            c10497M38270.m26641().m44799();
            for (C0617 c0618 : c10497M38270.m2847("th[align],td[align]")) {
                String lowerCase = c0618.mo28144("align").toLowerCase(Locale.ROOT);
                if (lowerCase.equals("left") || lowerCase.equals("center") || lowerCase.equals("right")) {
                    c0618.mo20268("align", lowerCase);
                } else {
                    c0618.m2835("align");
                }
            }
            C5557.m15342(strM37076);
            for (C0617 c0619 : C14772.m35410(new C11804(strM37076.trim()), c10497M38270)) {
                String strMo28144 = c0619.mo28144(strM37076);
                c0619.m2835(strM37076);
                c0619.mo20268("data-mt-render", strMo28144);
                String strM2865 = c0619.m2865();
                c0619.m2868();
                c0619.mo2864(strM2865);
                c0619.m2871(strMo28144.equals("inline-math") ? str6 : "div");
                c0619.m2869("mt-".concat(strMo28144));
            }
            C5557.m15342(str5);
            for (C0617 c06110 : C14772.m35410(new C11804(str5.trim()), c10497M38270)) {
                String strMo28145 = c06110.mo28144(str5);
                int iIndexOf = strMo28145.indexOf(58);
                c06110.m2835(str5);
                c06110.mo20268("data-source-start", strMo28145.substring(0, iIndexOf));
                c06110.mo20268("data-source-end", strMo28145.substring(iIndexOf + 1));
                if (c06110.m2833().equals("pre")) {
                    map = map3;
                    if (map.containsKey(strMo28145) && (c0617M42466 = C18278.m42466("code", c06110)) != null) {
                        String strM2866 = c0617M42466.m2865();
                        c0617M42466.m2868();
                        int i2 = Integer.parseInt((String) map.get(strMo28145));
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 <= strM2866.length()) {
                            if (i3 >= strM2866.length() || strM2866.charAt(i3) == '\n') {
                                if (i3 > i4 || i3 < strM2866.length()) {
                                    str4 = str6;
                                    C0617 c0617M2829 = c0617M42466.m2829(str4);
                                    c0617M2829.mo20268("data-source-start", Integer.toString(i2));
                                    c0617M2829.mo20268("data-source-end", Integer.toString(i2));
                                    c0617M2829.mo2864(strM2866.substring(i4, i3));
                                } else {
                                    str4 = str6;
                                }
                                if (i3 < strM2866.length()) {
                                    c0617M42466.m2855(new C13715("\n"));
                                }
                                i4 = i3 + 1;
                                i2++;
                            } else {
                                str4 = str6;
                            }
                            i3++;
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
            for (C0617 c06111 : c10497M38270.m2847("input")) {
                C0617 c0617Mo2849 = c06111.mo2849();
                if (c0617Mo2849 != null && c0617Mo2849.m2833().equals(am.ax)) {
                    c0617Mo2849 = c0617Mo2849.mo2849();
                }
                if (c0617Mo2849 != null && c0617Mo2849.m2833().equals("li")) {
                    c0617Mo2849.m2869("task-list-item");
                    c06111.m2869("task-list-item-checkbox");
                }
            }
            for (C0617 c06112 : c10497M38270.m2847("h1,h2,h3,h4,h5,h6")) {
                String lowerCase2 = c06112.m2848().toLowerCase(Locale.ROOT);
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
                int i5 = 1;
                String str7 = string;
                while (!hashSet.add(str7)) {
                    str7 = string + "-" + i5;
                    i5++;
                }
                C5557.m15341((Object) str7);
                c06112.mo20268("id", str7);
            }
            boolean zIsEmpty = c10497M38270.m2847("[data-mt-render]").isEmpty();
            String string2 = UUID.randomUUID().toString();
            StringBuilder sb3 = new StringBuilder("<!doctype html><html data-theme=\"");
            sb3.append(z ? "dark" : "light");
            sb3.append("\"><head><meta charset=\"utf-8\"><title>");
            C0617 c06113 = new C0617("title");
            c06113.mo2864(str);
            sb3.append(c06113.m2850());
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb3, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src 'self' 'unsafe-inline'; script-src 'unsafe-inline' 'nonce-", string2, "'; base-uri 'none'; form-action 'none'\"><style nonce=\"", string2);
            sb3.append("\">");
            bufferedWriter.write(sb3.toString());
            String[] strArr = {"light", "dark"};
            for (int i6 = 0; i6 < 2; i6++) {
                String str8 = strArr[i6];
                bufferedWriter.write(m34156(assetManager, C16523.m38890("github-markdown-", str8, ".css")).replace(".markdown-body", "html[data-theme=\"" + str8 + "\"] .markdown-body"));
            }
            bufferedWriter.write(m34156(assetManager, "preview.css"));
            C0617 c06114 = new C0617("article");
            c06114.m2869("markdown-body");
            c06114.mo20268("data-render-error", str2);
            bufferedWriter.write("</style></head><body><article" + c06114.mo2839().m36930() + ">");
            c10497M38270.m26640().m2841(bufferedWriter);
            bufferedWriter.write("</article><script nonce=\"" + string2 + "\">");
            bufferedWriter.write(m34156(assetManager, "preview.js"));
            bufferedWriter.write("</script>");
            if (!zIsEmpty) {
                bufferedWriter.write("<script nonce=\"" + string2 + "\">");
                bufferedWriter.write(m34156(assetManager, "enhance.js"));
                bufferedWriter.write("</script>");
            }
            bufferedWriter.write("</body></html>");
        } catch (C3036 unused) {
            throw new C4945();
        }
    }

    static {
        int iM51269 = 0;
        Object[] objArr = {new C12600(), new C8367(), new C4528()};
        ArrayList arrayList = new ArrayList(3);
        while (iM51269 < 3) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList, obj, iM51269, 1);
        }
        f46356 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34156(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open("markdown-preview/" + str);
        try {
            String strM45297 = C20010.m45297(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return strM45297;
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
    public static int m34155(TreeMap treeMap, int i) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
        if (entryFloorEntry == null) {
            return -1;
        }
        return ((Integer) entryFloorEntry.getValue()).intValue();
    }
}
