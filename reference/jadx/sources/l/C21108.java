package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.p.a;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩶ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21108 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Set f67410;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f67411;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f67412;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f67413;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f67414;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f67415;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0225 f67416;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67417 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13406 f67418;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f67419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f67420;

    static {
        String[] strArr = {"html", "head", "body", "address", "article", "aside", "blockquote", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "menu", "nav", "ol", am.ax, "pre", "section", "table", "thead", "tbody", "tfoot", "tr", "td", "th", "ul", "script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet = new HashSet(48);
        for (int i = 0; i < 48; i++) {
            String str = strArr[i];
            C17359.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f67410 = C4681.unmodifiableSet(hashSet);
        Object[] objArr = {"script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet2 = new HashSet(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Object obj = objArr[i2];
            C17359.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f67411 = C4681.unmodifiableSet(hashSet2);
    }

    public C21108(CharSequence charSequence, C13406 c13406, C15140 c15140, boolean z) {
        String string;
        this.f67412 = charSequence;
        this.f67416 = new C0225(charSequence);
        this.f67418 = c13406;
        this.f67419 = z;
        this.f67414 = !z && c15140.m36414() == EnumC19616.READABLE;
        this.f67413 = c15140.m36414() == EnumC19616.READABLE;
        this.f67420 = C18870.m43768(charSequence);
        if (c13406.m33049()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c13406.m33047());
            if (iMax < 0) {
                throw new IllegalArgumentException(C13645.m33382(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C14442.m34864(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f67415 = string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48182(CharSequence charSequence, C13406 c13406, C15140 c15140, boolean z, C11228 c11228) {
        try {
            C18870.m43769();
            C21108 c21108 = new C21108(charSequence, c13406, c15140, z);
            if (c21108.m48192()) {
                c21108.m48190();
                c21108.m48181();
                c21108.m48189();
                c21108.m48183(c11228);
            } else {
                c11228.append(charSequence);
            }
            C18870.m43769();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C7683 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0252  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [l.۟ܺۨ, l.᩵ۚ᩻] */
    /* JADX WARN: Type inference failed for: r12v2, types: [l.۟ܺۨ, l.ܽۚ᩻] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m48192() {
        C0225 c0225;
        Iterator it;
        C0225 c0226;
        Iterator it2;
        Iterator it3;
        ?? r5;
        ?? M5124;
        boolean z;
        C0225 c0227 = this.f67416;
        C24838 c24838 = new C24838(new C18870(c0227.m1697()));
        c24838.m24869();
        boolean zM33048 = this.f67418.m33048();
        CharSequence charSequence = this.f67412;
        C9919 c9919 = zM33048 ? new C9919(charSequence) : null;
        if (c9919 != null) {
            c24838.m24868(c9919);
        }
        C24092 c24092 = new C24092(c24838, charSequence.length());
        c24092.m11532();
        boolean z2 = false;
        z2 = false;
        if (!c24838.m39355()) {
            int i = 3;
            if (c9919 != null) {
                for (InterfaceC8743 interfaceC8743 : c24092.m11539()) {
                    int type = interfaceC8743.getType();
                    int iMo23442 = interfaceC8743.mo23442();
                    int iMo23440 = interfaceC8743.mo23440();
                    if (!c0227.m1698(iMo23442, iMo23440 + 1)) {
                        if (type == 2 && !C18856.m43750(charSequence, false, iMo23440 - 2, "-->", 3)) {
                            c9919.m25743(iMo23442, "Unterminated HTML comment");
                        } else if (type == 3 && !C18856.m43750(charSequence, false, iMo23440 - 2, "]]>", 3)) {
                            c9919.m25743(iMo23442, "Unterminated CDATA section");
                        }
                    }
                }
            }
            C12157 c12157 = new C12157(c24092);
            c12157.m24869();
            if (c9919 != null) {
                c12157.m24868(c9919);
            }
            Iterator it4 = c12157.m30366().m21803(C23346.class).iterator();
            while (it4.hasNext()) {
                C23346 c23346 = (C23346) it4.next();
                C18870.m43769();
                C14394 c14394 = new C14394(c23346.f26549.mo23442(), c23346.f26548.mo23440() + 1, c23346.f26549.getType());
                int i2 = c14394.f45373;
                int i3 = c14394.f45356;
                c14394.f45363 = c0227.m1698(i3, i2);
                C3208 c3208 = (C3208) c23346.m21805(C3208.class, z2 ? 1 : 0);
                if (c3208 != null) {
                    int i4 = 14;
                    InterfaceC8743 interfaceC8743Mo5285 = c3208.m21804(14, z2 ? 1 : 0).mo5285();
                    if (!c0227.m1698(interfaceC8743Mo5285.mo23442(), interfaceC8743Mo5285.mo23440() + 1)) {
                        c14394.f45358 = AbstractC16632.m39350(c3208.m21804(14, z2 ? 1 : 0).getText());
                        c14394.f45364 = c3208.m21804(14, z2 ? 1 : 0).getText();
                        c14394.f45357 = c3208.m21804(6, z2 ? 1 : 0) != null;
                        c14394.f45359 = c3208.m21804(10, z2 ? 1 : 0) != null;
                        boolean z3 = c3208.m21804(11, z2 ? 1 : 0) != null || c14394.f45359;
                        c14394.f45371 = z3;
                        c14394.f45369 = z3;
                        if (!z3) {
                            m48184(c14394, i3, "Unclosed HTML tag");
                        }
                        Iterator it5 = c3208.m21803(C20362.class).iterator();
                        ?? r6 = z2;
                        while (true) {
                            boolean zHasNext = it5.hasNext();
                            ArrayList arrayList = c14394.f45354;
                            if (!zHasNext) {
                                c0225 = c0227;
                                it = it4;
                                if (c14394.f45357 && (!arrayList.isEmpty() || c14394.f45359)) {
                                    m48184(c14394, i3, "Invalid HTML closing tag");
                                    c14394.f45369 = false;
                                }
                                if (c14394.f45363 && !c14394.f45369) {
                                    c14394.f45372 = true;
                                    break;
                                }
                                break;
                            }
                            ?? r10 = (C20362) it5.next();
                            ?? r12 = (C17378) r10.m21805(C17378.class, r6);
                            if (c0227.m1698(r10.f26549.mo23442(), r10.f26548.mo23440() + 1)) {
                                boolean z4 = c14394.f45372;
                                if (r12 == 0 || r12.m21804(19, r6) == null || c0227.m1698(r12.m21804(i4, r6).mo5285().mo23442(), r12.m21804(i4, r6).mo5285().mo23440() + 1)) {
                                    c0226 = c0227;
                                    it2 = it4;
                                    it3 = it5;
                                } else {
                                    String str = c14394.f45358;
                                    String strM39350 = AbstractC16632.m39350(r12.m21804(i4, r6).getText());
                                    if (strM39350.equals("style") || strM39350.equals("xml:space") || strM39350.equals("xmlns") || strM39350.startsWith("xmlns:")) {
                                        c0226 = c0227;
                                        it2 = it4;
                                        it3 = it5;
                                    } else {
                                        c0226 = c0227;
                                        if (str.equals("script")) {
                                            Object[] objArr = new Object[i];
                                            objArr[0] = "type";
                                            objArr[1] = am.N;
                                            objArr[2] = "src";
                                            it2 = it4;
                                            HashSet hashSet = new HashSet(i);
                                            it3 = it5;
                                            int i5 = 0;
                                            while (i5 < i) {
                                                Object obj = objArr[i5];
                                                C17359.requireNonNull(obj);
                                                if (!hashSet.add(obj)) {
                                                    throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
                                                }
                                                i5++;
                                                i = 3;
                                            }
                                            if (!C4681.unmodifiableSet(hashSet).contains(strM39350)) {
                                            }
                                        } else {
                                            it2 = it4;
                                            it3 = it5;
                                        }
                                        z = (str.equals("style") && strM39350.equals("type")) || (str.equals("annotation-xml") && strM39350.equals("encoding"));
                                    }
                                }
                                c14394.f45372 = z | z4;
                            } else {
                                c0226 = c0227;
                                it2 = it4;
                                it3 = it5;
                            }
                            if (r12 != 0) {
                                String text = r12.m21804(14, 0).getText();
                                ?? text2 = r12.m21804(19, 0) != null ? r12.m21804(19, 0).getText() : r12.m21804(20, 0) != null ? r12.m21804(20, 0).getText() : 0;
                                boolean z5 = r12.m21804(13, 0) != null;
                                if (z5 && text2 == 0) {
                                    m48184(c14394, r12.f26549.mo23442(), "Missing HTML attribute value");
                                }
                                if (!(z5 && text2 == 0) && text.indexOf(123) < 0 && text.indexOf(37) < 0) {
                                    r5 = 0;
                                } else {
                                    r5 = 0;
                                    c14394.f45369 = false;
                                }
                                if (text2 != 0 && ((text2.charAt(r5) == '\'' || text2.charAt(r5) == '\"') && (text2.length() < 2 || C22313.m50373(1, (String) text2) != text2.charAt(r5)))) {
                                    m48184(c14394, r12.f26549.mo23442(), "Unterminated HTML attribute value");
                                    c14394.f45369 = r5;
                                }
                                arrayList.add(new C6192(text, text2, z5));
                                String strM39351 = AbstractC16632.m39350(text);
                                if (text2 == 0) {
                                    M5124 = "";
                                } else if (text2.length() > 1 && (text2.charAt(0) == '\'' || text2.charAt(0) == '\"')) {
                                    M5124 = text2;
                                    M5124 = text2;
                                    M5124 = text2;
                                    char cM50373 = C22313.m50373(1, (String) text2);
                                    char cCharAt = text2.charAt(0);
                                    M5124 = text2;
                                    if (cM50373 == cCharAt) {
                                        M5124 = C1402.m5124(1, 1, (String) text2);
                                    }
                                }
                                M5124 = text2;
                                M5124 = text2;
                                M5124 = text2;
                                C11392.putIfAbsent(c14394.f45366, strM39351, M5124);
                            } else if (r10.m21804(12, 0) == null) {
                                c14394.f45369 = false;
                                m48184(c14394, r10.f26549.mo23442(), "Invalid HTML attribute");
                            }
                            i = 3;
                            r6 = 0;
                            i4 = 14;
                            it4 = it2;
                            it5 = it3;
                            c0227 = c0226;
                        }
                    }
                } else {
                    c0225 = c0227;
                    it = it4;
                }
                this.f67417.add(c14394);
                i = 3;
                z2 = false;
                it4 = it;
                c0227 = c0225;
            }
            if (c9919 != null) {
                c9919.m25744();
            }
            return true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48184(C14394 c14394, int i, String str) {
        if (this.f67418.m33048() && !c14394.f45363) {
            throw C9919.m25740(str, this.f67412, i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48190() {
        C1717 c1717M28763;
        C14394 c14394;
        C14394 c14395;
        C11411 c11411 = new C11411();
        for (C14394 c14396 : this.f67417) {
            C18870.m43769();
            String str = c14396.f45358;
            int i = c14396.f45361;
            if (str == null || !c14396.f45371) {
                c1717M28763 = null;
            } else {
                c1717M28763 = c14396.f45357 ? c11411.m28763(str) : c11411.m28764(str, c14396.f45366, c14396.f45359, c14396);
                if (c14396.f45357 && c1717M28763 != null) {
                    C14394 c14397 = (C14394) c1717M28763.f5867;
                    c14397.f45360 = c14396;
                    c14396.f45374 = c14397;
                }
            }
            C1717 c1717M28762 = (c1717M28763 == null || c14396.f45357) ? c11411.m28762() : c1717M28763.f5870;
            c14396.f45367 = (c1717M28763 == null || c14396.f45357) ? c11411.m28765() : c1717M28763.f5866;
            C14394 c14398 = c1717M28762 != null ? (C14394) c1717M28762.f5867 : null;
            c14396.f45365 = c14398;
            boolean z = false;
            c14396.f45355 = c1717M28763 == null ? !(c1717M28762 == null || c1717M28762.f5871 == 0) : c1717M28763.f5871 != 0;
            boolean z2 = (c1717M28763 != null && c1717M28763.f5869) || (c1717M28762 != null && c1717M28762.f5869);
            c14396.f45368 = z2;
            c14396.f45368 = z2 | (c14396.f45372 || (c14398 != null && c14398.f45368) || ((c14395 = c14396.f45374) != null && c14395.f45368));
            if (i == 8 && m48188(new C18334(c14396.f45356, c14396.f45373, this.f67412))) {
                z = true;
            }
            c14396.f45350 = z;
            if (c14396.f45358 == null && (c14394 = c14396.f45365) != null && i != 2 && i != 1 && !z) {
                c14394.f45353 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48181() {
        if (this.f67418.m33048()) {
            for (C14394 c14394 : this.f67417) {
                C18870.m43769();
                if (!c14394.f45357 && !c14394.f45355 && !c14394.f45368 && c14394.f45369 && c14394.f45360 == null && ("script".equals(c14394.f45358) || "style".equals(c14394.f45358))) {
                    m48184(c14394, c14394.f45356, "Missing closing tag for " + c14394.f45358);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0216  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:175:0x0300 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x0307  */
    /* JADX WARN: Code duplicated, block: B:180:0x030c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x030e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0313  */
    /* JADX WARN: Code duplicated, block: B:184:0x0318  */
    /* JADX WARN: Code duplicated, block: B:198:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0398 A[Catch: all -> 0x0395, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b5 A[Catch: all -> 0x0395, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03b8 A[Catch: all -> 0x0489, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0489, blocks: (B:201:0x036f, B:220:0x03d6, B:257:0x0455, B:242:0x0411, B:246:0x041e, B:256:0x0446, B:249:0x0428, B:255:0x043b, B:254:0x0439, B:211:0x03af, B:219:0x03c5, B:215:0x03b8), top: B:406:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:217:0x03bc A[Catch: all -> 0x0395, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x03c5 A[Catch: all -> 0x0489, TRY_ENTER, TryCatch #5 {all -> 0x0489, blocks: (B:201:0x036f, B:220:0x03d6, B:257:0x0455, B:242:0x0411, B:246:0x041e, B:256:0x0446, B:249:0x0428, B:255:0x043b, B:254:0x0439, B:211:0x03af, B:219:0x03c5, B:215:0x03b8), top: B:406:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:222:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f0 A[Catch: all -> 0x0395, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:237:0x0405 A[Catch: all -> 0x0395, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x040f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0411 A[Catch: all -> 0x0489, TRY_ENTER, TryCatch #5 {all -> 0x0489, blocks: (B:201:0x036f, B:220:0x03d6, B:257:0x0455, B:242:0x0411, B:246:0x041e, B:256:0x0446, B:249:0x0428, B:255:0x043b, B:254:0x0439, B:211:0x03af, B:219:0x03c5, B:215:0x03b8), top: B:406:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:244:0x041a  */
    /* JADX WARN: Code duplicated, block: B:245:0x041d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0425  */
    /* JADX WARN: Code duplicated, block: B:249:0x0428 A[Catch: all -> 0x0489, TRY_LEAVE, TryCatch #5 {all -> 0x0489, blocks: (B:201:0x036f, B:220:0x03d6, B:257:0x0455, B:242:0x0411, B:246:0x041e, B:256:0x0446, B:249:0x0428, B:255:0x043b, B:254:0x0439, B:211:0x03af, B:219:0x03c5, B:215:0x03b8), top: B:406:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:251:0x0432 A[Catch: all -> 0x0395, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0395, blocks: (B:205:0x0379, B:226:0x03e6, B:228:0x03ec, B:230:0x03f0, B:231:0x03f3, B:235:0x0400, B:237:0x0405, B:251:0x0432, B:208:0x0398, B:213:0x03b5, B:217:0x03bc), top: B:398:0x0379 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x0439 A[Catch: all -> 0x0489, TRY_ENTER, TryCatch #5 {all -> 0x0489, blocks: (B:201:0x036f, B:220:0x03d6, B:257:0x0455, B:242:0x0411, B:246:0x041e, B:256:0x0446, B:249:0x0428, B:255:0x043b, B:254:0x0439, B:211:0x03af, B:219:0x03c5, B:215:0x03b8), top: B:406:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:261:0x047c A[Catch: all -> 0x0487, TryCatch #2 {all -> 0x0487, blocks: (B:259:0x045f, B:261:0x047c, B:262:0x0480), top: B:400:0x045f }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0480 A[Catch: all -> 0x0487, TRY_LEAVE, TryCatch #2 {all -> 0x0487, blocks: (B:259:0x045f, B:261:0x047c, B:262:0x0480), top: B:400:0x045f }] */
    /* JADX WARN: Code duplicated, block: B:290:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:320:0x0568  */
    /* JADX WARN: Code duplicated, block: B:359:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:373:0x0613  */
    /* JADX WARN: Code duplicated, block: B:398:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: switch over string: strings are not added: [[aspect], [jscript], [method], [ecmascript], [ld+json], [json], [javascript], [livescript]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48183(C11228 c11228) throws Throwable {
        int i;
        CharSequence charSequence;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        int i5;
        C14394 c14394;
        String str2;
        C14394 c14395;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        String string;
        CharSequence charSequence2;
        C11228 c11228M28291;
        Throwable th;
        boolean zEquals;
        C13406 c13406;
        String str7;
        String str8;
        EnumC7440 enumC7440;
        String str9;
        boolean z3;
        int i6;
        CharSequence c3954;
        String str10;
        int i7;
        String string2;
        C14394 c14396;
        int i8;
        int i9;
        int i10;
        CharSequence string3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f67417;
            int size = arrayList.size();
            String str11 = this.f67420;
            boolean z4 = this.f67414;
            CharSequence charSequence3 = this.f67412;
            if (i11 >= size) {
                if (i12 < charSequence3.length()) {
                    c11228.m28292(i12, charSequence3.length(), charSequence3);
                }
                if (!z4 || arrayList.isEmpty()) {
                    return;
                }
                C14394 c14397 = (C14394) j$$ExternalSyntheticOutline0.m(arrayList, 1);
                if (c14397.f45350 && (i = c14397.f45352) >= 0) {
                    c14397 = (C14394) arrayList.get(i);
                }
                if (c14397.f45362 && c14397.f45357 && c14397.f45358.equals("html") && !c14397.f45368) {
                    c11228.append((CharSequence) str11);
                    return;
                }
                return;
            }
            C14394 c14398 = (C14394) arrayList.get(i11);
            C18870.m43769();
            int i13 = c14398.f45356;
            int i14 = c14398.f45373;
            if (i13 > i12) {
                c11228.m28292(i12, i13, charSequence3);
            }
            C18334 c18334 = new C18334(i13, i14, charSequence3);
            String str12 = " bytes String ";
            String str13 = this.f67415;
            if (z4 && m48185(i11)) {
                i2 = i13;
                int length = c11228.length();
                while (true) {
                    if (length > 0) {
                        charSequence = charSequence3;
                        if (AbstractC16632.m39351(c11228.charAt(length - 1))) {
                            length--;
                            charSequence3 = charSequence;
                        }
                    } else {
                        charSequence = charSequence3;
                    }
                }
                c11228.m28293(length);
                if (c11228.length() > 0) {
                    C11228 c11228Append = c11228.append((CharSequence) str11);
                    int i15 = c14398.f45351;
                    if (i15 < 0) {
                        throw new IllegalArgumentException(C13645.m33382(i15, "count is negative: "));
                    }
                    int length2 = str13.length();
                    if (i15 == 0 || length2 == 0) {
                        str11 = str11;
                        str = "";
                        string3 = str;
                    } else {
                        str11 = str11;
                        if (i15 == 1) {
                            string3 = str13;
                            str = "";
                        } else {
                            str = "";
                            if (str13.length() > Integer.MAX_VALUE / i15) {
                                throw new OutOfMemoryError("Repeating " + str13.length() + " bytes String " + i15 + " times will produce a String exceeding maximum size.");
                            }
                            StringBuilder sb = new StringBuilder(length2 * i15);
                            for (int i16 = 0; i16 < i15; i16++) {
                                sb.append(str13);
                            }
                            string3 = sb.toString();
                        }
                    }
                    c11228Append.append(string3);
                }
                if (!z4 && c14398.f45350 && (i10 = i11 + 1) < arrayList.size() && m48185(i10) && !c14398.f45368) {
                    i4 = i11;
                    i5 = i4;
                } else if (c14398.f45363) {
                    c11228.append((CharSequence) c18334);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c14398.f45361;
                    z = this.f67413;
                    if (i3 == 1 || (c14395 = c14398.f45365) == null) {
                        i4 = i11;
                        if (c14398.f45358 == null && c14398.f45369 && !c14398.f45368) {
                            boolean z5 = c14398.f45357;
                            ArrayList<C6192> arrayList2 = c14398.f45354;
                            c11228.append(z5 ? "</" : "<").append(c14398.f45364);
                            for (C6192 c6192 : arrayList2) {
                                c11228.append(' ');
                                c11228.append(c6192.f21090);
                                if (c6192.f21088) {
                                    c11228.append(a.h);
                                    c11228.append(c6192.f21089);
                                }
                            }
                            if (c14398.f45359) {
                                if (!arrayList2.isEmpty() && (str2 = ((C6192) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).f21089) != null && str2.charAt(0) != '\'' && str2.charAt(0) != '\"') {
                                    c11228.append(' ');
                                }
                                c11228.append("/>");
                            } else {
                                c11228.append('>');
                            }
                        } else if (z || i3 != 8 || c14398.f45368 || !((c14394 = c14398.f45365) == null || c14394.f45369)) {
                            i5 = i4;
                            c11228.append((CharSequence) c18334);
                        } else {
                            i5 = i4;
                            C14394 c14399 = (C14394) arrayList.get(i5);
                            if (!m48188(c18334)) {
                                boolean z6 = false;
                                for (int i17 = 0; i17 < c18334.length(); i17++) {
                                    if ((i17 & 1023) == 0) {
                                        C18870.m43769();
                                    }
                                    char cCharAt = c18334.charAt(i17);
                                    if (AbstractC16632.m39351(cCharAt)) {
                                        if (!z6) {
                                            c11228.append(' ');
                                        }
                                        z6 = true;
                                    } else {
                                        c11228.append(cCharAt);
                                        z6 = false;
                                    }
                                }
                            } else if (c14399.f45365 != null || (i5 != 0 && i5 + 1 != arrayList.size())) {
                                int i18 = i5 + 1;
                                if (i18 >= arrayList.size()) {
                                    c11228.append(' ');
                                } else if (((C14394) arrayList.get(i18)).f45370 != 1) {
                                    C14394 c143910 = (C14394) arrayList.get(i18);
                                    if (!c143910.f45369 || c143910.f45368 || !f67410.contains(c143910.f45358) || ((i5 <= 0 || !c143910.f45357 || c143910.f45374 != arrayList.get(i5 - 1)) && (i5 <= 0 || ((C14394) arrayList.get(i5 - 1)).f45361 != 4 || c14399.f45365 != null))) {
                                        c11228.append(' ');
                                    }
                                }
                            }
                        }
                    } else if (c14398.f45368 || !c14395.f45369 || c14395.f45360 == null) {
                        i4 = i11;
                        c11228.append((CharSequence) c18334);
                    } else {
                        String str14 = c14395.f45358;
                        HashMap map = c14395.f45366;
                        i4 = i11;
                        if (str14.equals("script") || c14395.f45358.equals("style")) {
                            str3 = " times will produce a String exceeding maximum size.";
                            String str15 = str;
                            String str16 = (String) C11392.getOrDefault(map, "type", str15);
                            str4 = str15;
                            if (c14395.f45358.equals("script") && !map.containsKey("type") && map.containsKey(am.N) && !((String) map.get(am.N)).isEmpty()) {
                                str16 = "text/" + ((String) map.get(am.N));
                            }
                            String strM39350 = AbstractC16632.m39350(str16.trim());
                            if (strM39350.indexOf(38) >= 0 || strM39350.indexOf(123) >= 0 || map.containsKey("src")) {
                                str5 = "Repeating ";
                            } else if (!strM39350.isEmpty()) {
                                if (c14395.f45358.equals("script") && strM39350.equals(am.e)) {
                                    str5 = "Repeating ";
                                } else {
                                    if (c14395.f45358.equals("script") && strM39350.equals("importmap")) {
                                        str5 = "Repeating ";
                                    } else {
                                        int iIndexOf = strM39350.indexOf(59);
                                        if (iIndexOf >= 0) {
                                            strM39350 = strM39350.substring(0, iIndexOf).trim();
                                        }
                                        if (!c14395.f45358.equals("style")) {
                                            int iIndexOf2 = strM39350.indexOf(47);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = strM39350.substring(0, iIndexOf2);
                                                Object[] objArr = {TextBundle.TEXT_ENTRY, "application", "dojo"};
                                                HashSet hashSet = new HashSet(3);
                                                str5 = "Repeating ";
                                                int i19 = 0;
                                                for (int i20 = 3; i19 < i20; i20 = 3) {
                                                    Object obj = objArr[i19];
                                                    C17359.requireNonNull(obj);
                                                    if (!hashSet.add(obj)) {
                                                        throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
                                                    }
                                                    i19++;
                                                }
                                                if (C4681.unmodifiableSet(hashSet).contains(strSubstring)) {
                                                    String strSubstring2 = strM39350.substring(iIndexOf2 + 1);
                                                    if (strSubstring2.startsWith("x-")) {
                                                        strSubstring2 = strSubstring2.substring(2);
                                                    }
                                                    strSubstring2.getClass();
                                                    switch (strSubstring2) {
                                                    }
                                                }
                                            }
                                        } else if (strM39350.equals("text/css")) {
                                            str5 = "Repeating ";
                                            str6 = "css";
                                        }
                                        str5 = "Repeating ";
                                    }
                                    str6 = "json";
                                }
                                str6 = "js";
                            } else if (c14395.f45358.equals("style")) {
                                str5 = "Repeating ";
                                str6 = "css";
                            } else {
                                str5 = "Repeating ";
                                str6 = "js";
                            }
                            if (str6 == null) {
                                c11228.append((CharSequence) c18334);
                            } else if (m48188(c18334)) {
                                z2 = this.f67419;
                                if (z2) {
                                    string = str4;
                                } else {
                                    if (z4) {
                                        i8 = 1;
                                        i9 = c14395.f45351 + 1;
                                    } else {
                                        i8 = 1;
                                        i9 = c14398.f45367;
                                    }
                                    if (i9 >= 0) {
                                        throw new IllegalArgumentException(C13645.m33382(i9, "count is negative: "));
                                    }
                                    int length3 = str13.length();
                                    if (i9 != 0 || length3 == 0) {
                                        string = str4;
                                    } else if (i9 == i8) {
                                        string = str13;
                                    } else {
                                        if (str13.length() > Integer.MAX_VALUE / i9) {
                                            throw new OutOfMemoryError(str5 + str13.length() + str12 + i9 + str3);
                                        }
                                        StringBuilder sb2 = new StringBuilder(length3 * i9);
                                        for (int i21 = 0; i21 < i9; i21++) {
                                            sb2.append(str13);
                                        }
                                        string = sb2.toString();
                                    }
                                }
                                try {
                                    c11228M28291 = c11228.m28291();
                                    try {
                                        zEquals = str6.equals("css");
                                        c13406 = this.f67418;
                                        if (zEquals) {
                                            str7 = str11;
                                            str8 = str4;
                                            if (str6.equals("json")) {
                                                enumC7440 = EnumC7440.JSON;
                                            } else {
                                                enumC7440 = EnumC7440.JAVASCRIPT;
                                            }
                                            if (z2) {
                                                C8931.m23842(c18334, enumC7440, c13406.m33048(), c11228M28291);
                                                str9 = str7;
                                            } else {
                                                EnumC7440 enumC7441 = enumC7440;
                                                str9 = str7;
                                                C17596.m41261(c18334, enumC7441, this.f67418, new C14151(string, str7), false, c11228M28291);
                                            }
                                        } else if (z2) {
                                            try {
                                                str8 = str4;
                                                C9676.m25249(c18334, new C13406(0, false, c13406.m33048()), C11914.f38390, EnumC2220.STYLESHEET, true, c11228M28291);
                                                str9 = str11;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                charSequence2 = charSequence;
                                                try {
                                                    c11228M28291.close();
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    th.addSuppressed(th3);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            str8 = str4;
                                            str9 = str11;
                                            C9676.m25249(c18334, c13406, new C11914(string, str9), EnumC2220.STYLESHEET, false, c11228M28291);
                                        }
                                        if (c11228M28291.length() == c18334.length()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        for (i6 = 0; z3 && i6 < c18334.length(); i6++) {
                                            if ((i6 & 1023) == 0) {
                                                C18870.m43769();
                                            }
                                            if (c11228M28291.charAt(i6) == c18334.charAt(i6)) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                        if (z3) {
                                            c11228.append((CharSequence) c18334);
                                            c11228M28291.close();
                                        } else {
                                            if (z2) {
                                                c3954 = c11228M28291;
                                            } else {
                                                if (m48186(c11228M28291, true)) {
                                                    str10 = str8;
                                                } else {
                                                    str10 = str9;
                                                }
                                                if (m48186(c11228M28291, false)) {
                                                    string2 = str8;
                                                } else {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(str9);
                                                    if (z4) {
                                                        i7 = c14395.f45351;
                                                    } else {
                                                        i7 = c14395.f45367;
                                                    }
                                                    sb3.append(C14483.m34969(i7, str13));
                                                    string2 = sb3.toString();
                                                }
                                                c3954 = new C3954(str10, c11228M28291, string2);
                                            }
                                            c14396 = c14395.f45360;
                                            charSequence2 = charSequence;
                                            try {
                                                if (AbstractC16632.m39349(new C3954(c3954, new C18334(c14396.f45356, c14396.f45373, charSequence2)), c14395.f45358) != c3954.length()) {
                                                    c11228.append((CharSequence) c18334);
                                                } else {
                                                    c11228.append(c3954);
                                                }
                                                try {
                                                    c11228M28291.close();
                                                } catch (C5949 e) {
                                                    e = e;
                                                    C5949 c5949M25740 = C9919.m25740(e.getMessage(), charSequence2, i2);
                                                    throw new C5949((e.m17328() + c5949M25740.m17328()) - 1, e.m17328() == 1 ? (e.m17327() + c5949M25740.m17327()) - 1 : e.m17327(), e.getMessage());
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th = th;
                                                c11228M28291.close();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        charSequence2 = charSequence;
                                    }
                                } catch (C5949 e2) {
                                    e = e2;
                                    charSequence2 = charSequence;
                                }
                            } else if (!z) {
                                c11228.append((CharSequence) c18334);
                            }
                        } else {
                            str3 = " times will produce a String exceeding maximum size.";
                            str12 = " bytes String ";
                            str5 = "Repeating ";
                            str4 = str;
                        }
                        str6 = null;
                        if (str6 == null) {
                            c11228.append((CharSequence) c18334);
                        } else if (m48188(c18334)) {
                            z2 = this.f67419;
                            if (z2) {
                                if (z4) {
                                    i8 = 1;
                                    i9 = c14395.f45351 + 1;
                                } else {
                                    i8 = 1;
                                    i9 = c14398.f45367;
                                }
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException(C13645.m33382(i9, "count is negative: "));
                                }
                                int length4 = str13.length();
                                if (i9 != 0) {
                                    string = str4;
                                } else {
                                    string = str4;
                                }
                            } else {
                                string = str4;
                            }
                            c11228M28291 = c11228.m28291();
                            zEquals = str6.equals("css");
                            c13406 = this.f67418;
                            if (zEquals) {
                                str7 = str11;
                                str8 = str4;
                                if (str6.equals("json")) {
                                    enumC7440 = EnumC7440.JSON;
                                } else {
                                    enumC7440 = EnumC7440.JAVASCRIPT;
                                }
                                if (z2) {
                                    C8931.m23842(c18334, enumC7440, c13406.m33048(), c11228M28291);
                                    str9 = str7;
                                } else {
                                    EnumC7440 enumC7442 = enumC7440;
                                    str9 = str7;
                                    C17596.m41261(c18334, enumC7442, this.f67418, new C14151(string, str7), false, c11228M28291);
                                }
                            } else if (z2) {
                                str8 = str4;
                                C9676.m25249(c18334, new C13406(0, false, c13406.m33048()), C11914.f38390, EnumC2220.STYLESHEET, true, c11228M28291);
                                str9 = str11;
                            } else {
                                str8 = str4;
                                str9 = str11;
                                C9676.m25249(c18334, c13406, new C11914(string, str9), EnumC2220.STYLESHEET, false, c11228M28291);
                            }
                            if (c11228M28291.length() == c18334.length()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            while (z3) {
                                if ((i6 & 1023) == 0) {
                                    C18870.m43769();
                                }
                                if (c11228M28291.charAt(i6) == c18334.charAt(i6)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                c11228.append((CharSequence) c18334);
                                c11228M28291.close();
                            } else {
                                if (z2) {
                                    c3954 = c11228M28291;
                                } else {
                                    if (m48186(c11228M28291, true)) {
                                        str10 = str8;
                                    } else {
                                        str10 = str9;
                                    }
                                    if (m48186(c11228M28291, false)) {
                                        string2 = str8;
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(str9);
                                        if (z4) {
                                            i7 = c14395.f45351;
                                        } else {
                                            i7 = c14395.f45367;
                                        }
                                        sb4.append(C14483.m34969(i7, str13));
                                        string2 = sb4.toString();
                                    }
                                    c3954 = new C3954(str10, c11228M28291, string2);
                                }
                                c14396 = c14395.f45360;
                                charSequence2 = charSequence;
                                if (AbstractC16632.m39349(new C3954(c3954, new C18334(c14396.f45356, c14396.f45373, charSequence2)), c14395.f45358) != c3954.length()) {
                                    c11228.append((CharSequence) c18334);
                                } else {
                                    c11228.append(c3954);
                                }
                                c11228M28291.close();
                            }
                        } else if (!z) {
                            c11228.append((CharSequence) c18334);
                        }
                    }
                    i5 = i4;
                }
                i11 = i5 + 1;
                i12 = i14;
            } else {
                charSequence = charSequence3;
                i2 = i13;
            }
            str = "";
            if (!z4) {
                if (c14398.f45363) {
                    c11228.append((CharSequence) c18334);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c14398.f45361;
                    z = this.f67413;
                    if (i3 == 1) {
                        i4 = i11;
                        if (c14398.f45358 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c11228.append((CharSequence) c18334);
                        } else {
                            i5 = i4;
                            c11228.append((CharSequence) c18334);
                        }
                    } else {
                        i4 = i11;
                        if (c14398.f45358 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c11228.append((CharSequence) c18334);
                        } else {
                            i5 = i4;
                            c11228.append((CharSequence) c18334);
                        }
                    }
                }
            } else if (c14398.f45363) {
                c11228.append((CharSequence) c18334);
                i4 = i11;
                i5 = i4;
            } else {
                i3 = c14398.f45361;
                z = this.f67413;
                if (i3 == 1) {
                    i4 = i11;
                    if (c14398.f45358 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c11228.append((CharSequence) c18334);
                    } else {
                        i5 = i4;
                        c11228.append((CharSequence) c18334);
                    }
                } else {
                    i4 = i11;
                    if (c14398.f45358 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c11228.append((CharSequence) c18334);
                    } else {
                        i5 = i4;
                        c11228.append((CharSequence) c18334);
                    }
                }
            }
            i11 = i5 + 1;
            i12 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:215:0x027c  */
    /* JADX WARN: Code duplicated, block: B:216:0x027e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m48189() {
        ArrayList arrayList;
        int iContains;
        C14394 c14394;
        boolean z;
        int i;
        C14394 c14395;
        C14394 c14396;
        C14394 c14397;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            arrayList = this.f67417;
            if (i3 >= arrayList.size()) {
                break;
            }
            C18870.m43769();
            C14394 c14398 = (C14394) arrayList.get(i3);
            c14398.f45352 = i2;
            String str = c14398.f45358;
            boolean z2 = str != null && !c14398.f45355 && c14398.f45369 && (!c14398.f45357 ? !((str.equals("html") && c14398.f45365 == null) || ((c14398.f45358.equals("head") || c14398.f45358.equals("body")) && ((c14396 = c14398.f45365) == null || (c14396.f45362 && c14396.f45358.equals("html"))))) : (c14397 = c14398.f45374) == null || !c14397.f45362);
            c14398.f45362 = z2;
            if (z2) {
                i = 0;
            } else if (!c14398.f45357 || (c14395 = c14398.f45374) == null) {
                C14394 c14399 = c14398.f45365;
                if (c14399 == null) {
                    i = 0;
                } else {
                    i = c14399.f45351 + 1;
                }
            } else {
                i = c14395.f45351;
            }
            c14398.f45351 = i;
            if (!c14398.f45350) {
                i2 = i3;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C18870.m43769();
            C14394 c143910 = (C14394) arrayList.get(i4);
            if (c143910.f45350 || ((c143910.f45363 && (c143910.f45358 == null || c143910.f45368)) || c143910.f45355 || ((c14394 = c143910.f45365) != null && c14394.f45368))) {
                iContains = 0;
            } else {
                int i5 = c143910.f45352;
                C14394 c143911 = i5 < 0 ? null : (C14394) arrayList.get(i5);
                if (c143911 != null && c143911.f45363 && (c143911.f45358 == null || c143911.f45368)) {
                    iContains = 0;
                } else {
                    int i6 = c143910.f45361;
                    if (i6 != 4) {
                        Object obj = c143910.f45358;
                        if (obj != null && (!c143910.f45369 || (((z = c143910.f45357) && c143910.f45374 == null) || (z && c143910.f45368)))) {
                            iContains = 0;
                        } else if (c143910.f45362) {
                            iContains = 1;
                        } else {
                            C14394 c143912 = c143910.f45365;
                            if (c143912 == null || !c143912.f45353) {
                                iContains = 2;
                                iContains = 2;
                                iContains = 2;
                                Set set = f67410;
                                if (i6 == 2) {
                                    if (c143912 != null && !set.contains(c143912.f45358)) {
                                        iContains = 0;
                                    } else if (c143911 == null || m48191(c143911)) {
                                        iContains = 1;
                                    }
                                } else if (obj == null || (c143910.f45357 && c143910.f45374.f45353)) {
                                    iContains = 0;
                                } else if (c143911 == null) {
                                    iContains = set.contains(obj);
                                } else {
                                    int i7 = c143911.f45361;
                                    if (i7 == 1) {
                                        iContains = 0;
                                    } else if (c143911.f45358 == null && i7 != 2 && i7 != 4) {
                                        C14394 c143913 = c143911.f45365;
                                        if (c143913 != null && c143913 != c143912 && !c143913.f45368 && set.contains(c143913.f45358)) {
                                            if (!c143910.f45357) {
                                                String str2 = c143911.f45365.f45358;
                                                String str3 = c143910.f45358;
                                                if (str2.equals(am.ax) && set.contains(str3)) {
                                                    Object[] objArr = {"script", "style", "meta", "link", "base"};
                                                    HashSet hashSet = new HashSet(5);
                                                    for (int i8 = 0; i8 < 5; i8++) {
                                                        Object obj2 = objArr[i8];
                                                        C17359.requireNonNull(obj2);
                                                        if (!hashSet.add(obj2)) {
                                                            throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj2));
                                                        }
                                                    }
                                                    if (C4681.unmodifiableSet(hashSet).contains(str3)) {
                                                        if (str2.equals("li")) {
                                                        }
                                                    }
                                                } else if ((str2.equals("li") || !str3.equals("li")) && (((!str2.equals("dt") && !str2.equals("dd")) || (!str3.equals("dt") && !str3.equals("dd"))) && ((!str2.equals("option") || (!str3.equals("option") && !str3.equals("optgroup"))) && ((!str2.equals("optgroup") || !str3.equals("optgroup")) && ((!str2.equals("tr") || !str3.equals("tr")) && (((!str2.equals("td") && !str2.equals("th")) || (!str3.equals("td") && !str3.equals("th"))) && ((!str2.equals("thead") && !str2.equals("tbody") && !str2.equals("tfoot")) || (!str3.equals("tbody") && !str3.equals("tfoot"))))))))) {
                                                }
                                            }
                                            iContains = 1;
                                        }
                                        iContains = 0;
                                    } else if (c143910.f45374 == c143911) {
                                        iContains = 0;
                                    } else if (!set.contains(obj)) {
                                        C14394 c143914 = c143910.f45365;
                                        if (c143914 == null || (!c143914.f45362 && c143914.f45358.indexOf(58) < 0)) {
                                            iContains = 0;
                                        } else if (m48191(c143911)) {
                                            iContains = 1;
                                        }
                                    } else if (m48191(c143911)) {
                                        iContains = 1;
                                    }
                                }
                            } else {
                                iContains = 0;
                            }
                        }
                    } else if (c143910.f45365 == null && m48187(c143910)) {
                        iContains = 1;
                    } else {
                        iContains = 0;
                    }
                }
            }
            c143910.f45370 = iContains;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m48191(C14394 c14394) {
        int i;
        C14394 c14395 = c14394.f45357 ? c14394.f45374 : c14394;
        String str = c14394.f45358;
        return (str != null && c14394.f45369 && f67410.contains(str) && (!f67411.contains(c14394.f45358) || (c14395 != null && c14395.f45370 == 1))) || ((i = c14394.f45361) == 2 && c14394.f45370 == 1) || (i == 4 && m48187(c14394));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48187(C14394 c14394) {
        int i;
        int i2 = c14394.f45356;
        if (c14394.f45361 != 4) {
            return false;
        }
        CharSequence charSequence = this.f67412;
        return C18856.m43750(charSequence, true, i2, "<!doctype", 9) && (i = c14394.f45373) > i2 + 9 && charSequence.charAt(i - 1) == '>';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48185(int i) {
        ArrayList arrayList = this.f67417;
        int i2 = ((C14394) arrayList.get(i)).f45370;
        return i2 == 1 || (i2 == 2 && i > 0 && ((C14394) arrayList.get(i - 1)).f45350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48186(C11228 c11228, boolean z) {
        int length = z ? 0 : c11228.length() - 1;
        while (length >= 0 && length < c11228.length()) {
            char cCharAt = c11228.charAt(length);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            if (!AbstractC16632.m39351(cCharAt)) {
                break;
            }
            length += z ? 1 : -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48188(C18334 c18334) {
        for (int i = 0; i < c18334.length(); i++) {
            if ((i & 1023) == 0) {
                C18870.m43769();
            }
            if (!AbstractC16632.m39351(c18334.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
