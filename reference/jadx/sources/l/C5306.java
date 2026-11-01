package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.p.a;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۚۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5306 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Set f18342;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Set f18343;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1072 f18344;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f18345;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final CharSequence f18346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f18347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12052 f18348;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f18349;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f18350;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f18352 = new ArrayList();

    static {
        String[] strArr = {"html", "head", "body", "address", "article", "aside", "blockquote", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "menu", "nav", "ol", am.ax, "pre", "section", "table", "thead", "tbody", "tfoot", "tr", "td", "th", "ul", "script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet = new HashSet(48);
        for (int i = 0; i < 48; i++) {
            String str = strArr[i];
            C13638.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f18342 = C0561.unmodifiableSet(hashSet);
        Object[] objArr = {"script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet2 = new HashSet(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Object obj = objArr[i2];
            C13638.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f18343 = C0561.unmodifiableSet(hashSet2);
    }

    public C5306(CharSequence charSequence, C12052 c12052, C15746 c15746, boolean z) {
        String string;
        this.f18346 = charSequence;
        this.f18344 = new C1072(charSequence);
        this.f18348 = c12052;
        this.f18351 = z;
        this.f18350 = !z && c15746.m37487() == EnumC20684.READABLE;
        this.f18347 = c15746.m37487() == EnumC20684.READABLE;
        this.f18345 = C3894.m11327(charSequence);
        if (c12052.m29954()) {
            string = "\t";
        } else {
            int iMax = Math.max(0, c12052.m29953());
            if (iMax < 0) {
                throw new IllegalArgumentException(C8479.m22141(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C2271.m6966(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i = 0; i < iMax; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f18349 = string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14726(CharSequence charSequence, C12052 c12052, C15746 c15746, boolean z, C18503 c18503) {
        try {
            C3894.m11326();
            C5306 c5306 = new C5306(charSequence, c12052, c15746, z);
            if (c5306.m14732()) {
                c5306.m14725();
                c5306.m14733();
                c5306.m14727(c18503);
            } else {
                c18503.append(charSequence);
            }
            C3894.m11326();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C13068 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [l.ۧۛۜ, l.᩺᩹᩵] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v29, types: [l.ۢۛۜ, l.᩺᩹᩵] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m14732() {
        Iterator it;
        Iterator it2;
        ?? r7;
        ?? M46498;
        boolean z;
        boolean z2;
        C1072 c1072 = this.f18344;
        C17156 c17156 = new C17156(new C3894(c1072.m4047()));
        c17156.m43805();
        C13774 c13774 = new C13774(c17156, this.f18346.length());
        c13774.m13728();
        boolean z3 = false;
        z3 = false;
        if (!c17156.m16081()) {
            C3044 c3044 = new C3044(c13774);
            c3044.m43805();
            Iterator it3 = c3044.m9131().m51372(C14335.class).iterator();
            while (true) {
                int i = 1;
                if (!it3.hasNext()) {
                    return true;
                }
                C14335 c14335 = (C14335) it3.next();
                C3894.m11326();
                C2483 c2483 = new C2483(c14335.f75536.mo22508(), c14335.f75537.mo22510() + 1, c14335.f75536.getType());
                c2483.f9867 = c1072.m4048(c2483.f9860, c2483.f9857);
                C1633 c1633 = (C1633) c14335.m51374(C1633.class, z3 ? 1 : 0);
                if (c1633 != null) {
                    int i2 = 14;
                    InterfaceC19761 interfaceC19761Mo41396 = c1633.m51373(14, z3 ? 1 : 0).mo41396();
                    if (!c1072.m4048(interfaceC19761Mo41396.mo22508(), interfaceC19761Mo41396.mo22510() + 1)) {
                        c2483.f9856 = AbstractC5867.m16076(c1633.m51373(14, z3 ? 1 : 0).getText());
                        c2483.f9864 = c1633.m51373(14, z3 ? 1 : 0).getText();
                        c2483.f9861 = c1633.m51373(6, z3 ? 1 : 0) != null;
                        c2483.f9859 = c1633.m51373(10, z3 ? 1 : 0) != null;
                        boolean z4 = c1633.m51373(11, z3 ? 1 : 0) != null || c2483.f9859;
                        c2483.f9852 = z4;
                        c2483.f9870 = z4;
                        Iterator it4 = c1633.m51372(C9396.class).iterator();
                        ?? r4 = z3;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            ArrayList arrayList = c2483.f9854;
                            if (!zHasNext) {
                                it = it3;
                                if (c2483.f9861 && (!arrayList.isEmpty() || c2483.f9859)) {
                                    c2483.f9870 = false;
                                }
                                if (c2483.f9867 && !c2483.f9870) {
                                    c2483.f9868 = true;
                                    break;
                                }
                                break;
                            }
                            ?? r8 = (C9396) it4.next();
                            ?? r10 = (C10807) r8.m51374(C10807.class, r4);
                            if (c1072.m4048(r8.f75536.mo22508(), r8.f75537.mo22510() + i)) {
                                boolean z5 = c2483.f9868;
                                if (r10 == 0 || r10.m51373(19, r4) == null || c1072.m4048(r10.m51373(i2, r4).mo41396().mo22508(), r10.m51373(i2, r4).mo41396().mo22510() + i)) {
                                    it2 = it3;
                                } else {
                                    String str = c2483.f9856;
                                    String strM16076 = AbstractC5867.m16076(r10.m51373(i2, r4).getText());
                                    if (strM16076.equals("style") || strM16076.equals("xml:space") || strM16076.equals("xmlns") || strM16076.startsWith("xmlns:")) {
                                        it2 = it3;
                                    } else {
                                        if (str.equals("script")) {
                                            Object[] objArr = new Object[3];
                                            objArr[r4] = "type";
                                            objArr[1] = am.N;
                                            objArr[2] = "src";
                                            HashSet hashSet = new HashSet(3);
                                            it2 = it3;
                                            int i3 = 0;
                                            for (int i4 = 3; i3 < i4; i4 = 3) {
                                                Object obj = objArr[i3];
                                                C13638.requireNonNull(obj);
                                                if (!hashSet.add(obj)) {
                                                    throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
                                                }
                                                i3++;
                                            }
                                            if (!C0561.unmodifiableSet(hashSet).contains(strM16076)) {
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                        z2 = (str.equals("style") && strM16076.equals("type")) || (str.equals("annotation-xml") && strM16076.equals("encoding"));
                                    }
                                }
                                c2483.f9868 = z2 | z5;
                            } else {
                                it2 = it3;
                            }
                            if (r10 == 0) {
                                z = false;
                                z = false;
                                if (r8.m51373(12, 0) == null) {
                                    c2483.f9870 = false;
                                }
                            } else {
                                String text = r10.m51373(14, 0).getText();
                                ?? text2 = r10.m51373(19, 0) != null ? r10.m51373(19, 0).getText() : r10.m51373(20, 0) != null ? r10.m51373(20, 0).getText() : 0;
                                boolean z6 = r10.m51373(13, 0) != null;
                                if (!(z6 && text2 == 0) && text.indexOf(123) < 0 && text.indexOf(37) < 0) {
                                    r7 = 0;
                                } else {
                                    r7 = 0;
                                    c2483.f9870 = false;
                                }
                                if (text2 != 0 && ((text2.charAt(r7) == '\'' || text2.charAt(r7) == '\"') && (text2.length() < 2 || C3184.m9601(1, (String) text2) != text2.charAt(r7)))) {
                                    c2483.f9870 = r7;
                                }
                                arrayList.add(new C4600(text, text2, z6));
                                String strM16077 = AbstractC5867.m16076(text);
                                if (text2 == 0) {
                                    M46498 = "";
                                } else if (text2.length() > 1 && (text2.charAt(0) == '\'' || text2.charAt(0) == '\"')) {
                                    M46498 = text2;
                                    M46498 = text2;
                                    M46498 = text2;
                                    char cM9601 = C3184.m9601(1, (String) text2);
                                    char cCharAt = text2.charAt(0);
                                    M46498 = text2;
                                    if (cM9601 == cCharAt) {
                                        M46498 = C20630.m46498(1, 1, text2);
                                    }
                                }
                                M46498 = text2;
                                M46498 = text2;
                                M46498 = text2;
                                C9735.putIfAbsent(c2483.f9850, strM16077, M46498);
                                z = false;
                            }
                            i = 1;
                            i2 = 14;
                            it3 = it2;
                            r4 = z;
                        }
                    }
                } else {
                    it = it3;
                }
                this.f18352.add(c2483);
                z3 = false;
                it3 = it;
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14725() {
        C16451 c16451M30330;
        C2483 c2483;
        C2483 c2484;
        C12218 c12218 = new C12218();
        for (C2483 c2485 : this.f18352) {
            C3894.m11326();
            String str = c2485.f9856;
            int i = c2485.f9865;
            if (str == null || !c2485.f9852) {
                c16451M30330 = null;
            } else {
                c16451M30330 = c2485.f9861 ? c12218.m30330(str) : c12218.m30331(str, c2485.f9850, c2485.f9859, c2485);
                if (c2485.f9861 && c16451M30330 != null) {
                    C2483 c2486 = (C2483) c16451M30330.f52900;
                    c2486.f9851 = c2485;
                    c2485.f9874 = c2486;
                }
            }
            C16451 c16451M30329 = (c16451M30330 == null || c2485.f9861) ? c12218.m30329() : c16451M30330.f52902;
            c2485.f9855 = (c16451M30330 == null || c2485.f9861) ? c12218.m30332() : c16451M30330.f52897;
            C2483 c2487 = c16451M30329 != null ? (C2483) c16451M30329.f52900 : null;
            c2485.f9872 = c2487;
            boolean z = false;
            c2485.f9862 = c16451M30330 == null ? !(c16451M30329 == null || c16451M30329.f52898 == 0) : c16451M30330.f52898 != 0;
            boolean z2 = (c16451M30330 != null && c16451M30330.f52895) || (c16451M30329 != null && c16451M30329.f52895);
            c2485.f9869 = z2;
            c2485.f9869 = z2 | (c2485.f9868 || (c2487 != null && c2487.f9869) || ((c2484 = c2485.f9874) != null && c2484.f9869));
            if (i == 8 && m14730(new C17499(c2485.f9860, c2485.f9857, this.f18346))) {
                z = true;
            }
            c2485.f9866 = z;
            if (c2485.f9856 == null && (c2483 = c2485.f9872) != null && i != 2 && i != 1 && !z) {
                c2483.f9871 = true;
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
    /* JADX WARN: Code duplicated, block: B:198:0x0369  */
    /* JADX WARN: Code duplicated, block: B:202:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0379 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0393 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x03aa A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03b5 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x03b9 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03be A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03d0 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:216:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:223:0x03f9 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0406  */
    /* JADX WARN: Code duplicated, block: B:227:0x0408  */
    /* JADX WARN: Code duplicated, block: B:230:0x040e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0415  */
    /* JADX WARN: Code duplicated, block: B:233:0x0417 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0420  */
    /* JADX WARN: Code duplicated, block: B:236:0x0423  */
    /* JADX WARN: Code duplicated, block: B:239:0x042b  */
    /* JADX WARN: Code duplicated, block: B:240:0x042e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0438 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x043b A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x047e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0482 A[Catch: all -> 0x0489, TRY_LEAVE, TryCatch #0 {all -> 0x0489, blocks: (B:200:0x0371, B:203:0x0379, B:213:0x03df, B:219:0x03ef, B:221:0x03f5, B:223:0x03f9, B:224:0x03fc, B:228:0x0409, B:230:0x040e, B:246:0x0457, B:248:0x047e, B:249:0x0482, B:233:0x0417, B:237:0x0424, B:245:0x0448, B:240:0x042e, B:242:0x0438, B:244:0x043d, B:243:0x043b, B:204:0x0393, B:205:0x03aa, B:207:0x03b5, B:211:0x03be, B:212:0x03d0, B:209:0x03b9), top: B:368:0x0371 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x052d  */
    /* JADX WARN: Code duplicated, block: B:331:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:345:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:376:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: switch over string: strings are not added: [[aspect], [jscript], [method], [ecmascript], [ld+json], [json], [javascript], [livescript]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14727(C18503 c18503) throws Throwable {
        int i;
        CharSequence charSequence;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        int i5;
        C2483 c2483;
        String str2;
        C2483 c2484;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        String string;
        C18503 c18503M42895;
        String str7;
        String str8;
        String str9;
        EnumC18877 enumC18877;
        EnumC18877 enumC18878;
        String str10;
        boolean z3;
        int i6;
        CharSequence c11657;
        String str11;
        int i7;
        String string2;
        C2483 c2485;
        int i8;
        int i9;
        int i10;
        CharSequence string3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f18352;
            int size = arrayList.size();
            String str12 = this.f18345;
            boolean z4 = this.f18350;
            CharSequence charSequence2 = this.f18346;
            if (i11 >= size) {
                if (i12 < charSequence2.length()) {
                    c18503.m42896(i12, charSequence2.length(), charSequence2);
                }
                if (!z4 || arrayList.isEmpty()) {
                    return;
                }
                C2483 c2486 = (C2483) C19084.m43861(arrayList, 1);
                if (c2486.f9866 && (i = c2486.f9858) >= 0) {
                    c2486 = (C2483) arrayList.get(i);
                }
                if (c2486.f9873 && c2486.f9861 && c2486.f9856.equals("html") && !c2486.f9869) {
                    c18503.append((CharSequence) str12);
                    return;
                }
                return;
            }
            C2483 c2487 = (C2483) arrayList.get(i11);
            C3894.m11326();
            int i13 = c2487.f9860;
            int i14 = c2487.f9857;
            if (i13 > i12) {
                c18503.m42896(i12, i13, charSequence2);
            }
            C17499 c17499 = new C17499(c2487.f9860, i14, charSequence2);
            String str13 = " bytes String ";
            String str14 = this.f18349;
            if (z4 && m14728(i11)) {
                i2 = i14;
                int length = c18503.length();
                while (true) {
                    if (length > 0) {
                        charSequence = charSequence2;
                        if (AbstractC5867.m16077(c18503.charAt(length - 1))) {
                            length--;
                            charSequence2 = charSequence;
                        }
                    } else {
                        charSequence = charSequence2;
                    }
                }
                c18503.m42897(length);
                if (c18503.length() > 0) {
                    C18503 c18503Append = c18503.append((CharSequence) str12);
                    int i15 = c2487.f9853;
                    if (i15 < 0) {
                        throw new IllegalArgumentException(C8479.m22141(i15, "count is negative: "));
                    }
                    int length2 = str14.length();
                    if (i15 == 0 || length2 == 0) {
                        str12 = str12;
                        str = "";
                        string3 = str;
                    } else {
                        str12 = str12;
                        if (i15 == 1) {
                            string3 = str14;
                            str = "";
                        } else {
                            str = "";
                            if (str14.length() > Integer.MAX_VALUE / i15) {
                                throw new OutOfMemoryError("Repeating " + str14.length() + " bytes String " + i15 + " times will produce a String exceeding maximum size.");
                            }
                            StringBuilder sb = new StringBuilder(length2 * i15);
                            for (int i16 = 0; i16 < i15; i16++) {
                                sb.append(str14);
                            }
                            string3 = sb.toString();
                        }
                    }
                    c18503Append.append(string3);
                }
                if (!z4 && c2487.f9866 && (i10 = i11 + 1) < arrayList.size() && m14728(i10) && !c2487.f9869) {
                    i4 = i11;
                    i5 = i4;
                } else if (c2487.f9867) {
                    c18503.append((CharSequence) c17499);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c2487.f9865;
                    z = this.f18347;
                    if (i3 == 1 || (c2484 = c2487.f9872) == null) {
                        i4 = i11;
                        if (c2487.f9856 == null && c2487.f9870 && !c2487.f9869) {
                            boolean z5 = c2487.f9861;
                            ArrayList<C4600> arrayList2 = c2487.f9854;
                            c18503.append(z5 ? "</" : "<").append(c2487.f9864);
                            for (C4600 c4600 : arrayList2) {
                                c18503.append(' ');
                                c18503.append(c4600.f16280);
                                if (c4600.f16278) {
                                    c18503.append(a.h);
                                    c18503.append(c4600.f16279);
                                }
                            }
                            if (c2487.f9859) {
                                if (!arrayList2.isEmpty() && (str2 = ((C4600) C19084.m43861(arrayList2, 1)).f16279) != null && str2.charAt(0) != '\'' && str2.charAt(0) != '\"') {
                                    c18503.append(' ');
                                }
                                c18503.append("/>");
                            } else {
                                c18503.append('>');
                            }
                        } else if (z || i3 != 8 || c2487.f9869 || !((c2483 = c2487.f9872) == null || c2483.f9870)) {
                            i5 = i4;
                            c18503.append((CharSequence) c17499);
                        } else {
                            i5 = i4;
                            C2483 c2488 = (C2483) arrayList.get(i5);
                            if (!m14730(c17499)) {
                                boolean z6 = false;
                                for (int i17 = 0; i17 < c17499.length(); i17++) {
                                    if ((i17 & 1023) == 0) {
                                        C3894.m11326();
                                    }
                                    char cCharAt = c17499.charAt(i17);
                                    if (AbstractC5867.m16077(cCharAt)) {
                                        if (!z6) {
                                            c18503.append(' ');
                                        }
                                        z6 = true;
                                    } else {
                                        c18503.append(cCharAt);
                                        z6 = false;
                                    }
                                }
                            } else if (c2488.f9872 != null || (i5 != 0 && i5 + 1 != arrayList.size())) {
                                int i18 = i5 + 1;
                                if (i18 >= arrayList.size()) {
                                    c18503.append(' ');
                                } else if (((C2483) arrayList.get(i18)).f9863 != 1) {
                                    C2483 c2489 = (C2483) arrayList.get(i18);
                                    if (!c2489.f9870 || c2489.f9869 || !f18342.contains(c2489.f9856) || ((i5 <= 0 || !c2489.f9861 || c2489.f9874 != arrayList.get(i5 - 1)) && (i5 <= 0 || ((C2483) arrayList.get(i5 - 1)).f9865 != 4 || c2488.f9872 != null))) {
                                        c18503.append(' ');
                                    }
                                }
                            }
                        }
                    } else if (c2487.f9869 || !c2484.f9870 || c2484.f9851 == null) {
                        i4 = i11;
                        c18503.append((CharSequence) c17499);
                    } else {
                        String str15 = c2484.f9856;
                        HashMap map = c2484.f9850;
                        i4 = i11;
                        if (str15.equals("script") || c2484.f9856.equals("style")) {
                            str3 = " times will produce a String exceeding maximum size.";
                            String str16 = str;
                            String str17 = (String) C9735.getOrDefault(map, "type", str16);
                            str4 = str16;
                            if (c2484.f9856.equals("script") && !map.containsKey("type") && map.containsKey(am.N) && !((String) map.get(am.N)).isEmpty()) {
                                str17 = "text/" + ((String) map.get(am.N));
                            }
                            String strM16076 = AbstractC5867.m16076(str17.trim());
                            if (strM16076.indexOf(38) >= 0 || strM16076.indexOf(123) >= 0 || map.containsKey("src")) {
                                str5 = "Repeating ";
                            } else if (!strM16076.isEmpty()) {
                                if (c2484.f9856.equals("script") && strM16076.equals(am.e)) {
                                    str5 = "Repeating ";
                                } else {
                                    if (c2484.f9856.equals("script") && strM16076.equals("importmap")) {
                                        str5 = "Repeating ";
                                    } else {
                                        int iIndexOf = strM16076.indexOf(59);
                                        if (iIndexOf >= 0) {
                                            strM16076 = strM16076.substring(0, iIndexOf).trim();
                                        }
                                        if (!c2484.f9856.equals("style")) {
                                            int iIndexOf2 = strM16076.indexOf(47);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = strM16076.substring(0, iIndexOf2);
                                                Object[] objArr = {TextBundle.TEXT_ENTRY, "application", "dojo"};
                                                HashSet hashSet = new HashSet(3);
                                                str5 = "Repeating ";
                                                int i19 = 0;
                                                for (int i20 = 3; i19 < i20; i20 = 3) {
                                                    Object obj = objArr[i19];
                                                    C13638.requireNonNull(obj);
                                                    if (!hashSet.add(obj)) {
                                                        throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
                                                    }
                                                    i19++;
                                                }
                                                if (C0561.unmodifiableSet(hashSet).contains(strSubstring)) {
                                                    String strSubstring2 = strM16076.substring(iIndexOf2 + 1);
                                                    if (strSubstring2.startsWith("x-")) {
                                                        strSubstring2 = strSubstring2.substring(2);
                                                    }
                                                    strSubstring2.getClass();
                                                    switch (strSubstring2) {
                                                    }
                                                }
                                            }
                                        } else if (strM16076.equals("text/css")) {
                                            str5 = "Repeating ";
                                            str6 = "css";
                                        }
                                        str5 = "Repeating ";
                                    }
                                    str6 = "json";
                                }
                                str6 = "js";
                            } else if (c2484.f9856.equals("style")) {
                                str5 = "Repeating ";
                                str6 = "css";
                            } else {
                                str5 = "Repeating ";
                                str6 = "js";
                            }
                            if (str6 == null) {
                                c18503.append((CharSequence) c17499);
                            } else if (m14730(c17499)) {
                                z2 = this.f18351;
                                if (z2) {
                                    string = str4;
                                } else {
                                    if (z4) {
                                        i8 = 1;
                                        i9 = c2484.f9853 + 1;
                                    } else {
                                        i8 = 1;
                                        i9 = c2487.f9855;
                                    }
                                    if (i9 >= 0) {
                                        throw new IllegalArgumentException(C8479.m22141(i9, "count is negative: "));
                                    }
                                    int length3 = str14.length();
                                    if (i9 != 0 || length3 == 0) {
                                        string = str4;
                                    } else if (i9 == i8) {
                                        string = str14;
                                    } else {
                                        if (str14.length() > Integer.MAX_VALUE / i9) {
                                            throw new OutOfMemoryError(str5 + str14.length() + str13 + i9 + str3);
                                        }
                                        StringBuilder sb2 = new StringBuilder(length3 * i9);
                                        for (int i21 = 0; i21 < i9; i21++) {
                                            sb2.append(str14);
                                        }
                                        string = sb2.toString();
                                    }
                                }
                                c18503M42895 = c18503.m42895();
                                try {
                                    if (str6.equals("css")) {
                                        str7 = str14;
                                        str8 = str12;
                                        str9 = str4;
                                        if (str6.equals("json")) {
                                            enumC18877 = EnumC18877.JSON;
                                        } else {
                                            enumC18877 = EnumC18877.JAVASCRIPT;
                                        }
                                        enumC18878 = enumC18877;
                                        if (z2) {
                                            str10 = str8;
                                            C11137.m28067(c17499, enumC18878, new C12052(0, false), C8294.f28808, true, c18503M42895);
                                        } else {
                                            str10 = str8;
                                            C11137.m28067(c17499, enumC18878, this.f18348, new C8294(string, str10), false, c18503M42895);
                                        }
                                    } else if (z2) {
                                        str7 = str14;
                                        str9 = str4;
                                        C21699.m48445(c17499, new C12052(0, false), C5701.f19439, EnumC16990.STYLESHEET, true, c18503M42895);
                                        str10 = str12;
                                    } else {
                                        str7 = str14;
                                        str9 = str4;
                                        String str18 = str12;
                                        C21699.m48445(c17499, this.f18348, new C5701(string, str18), EnumC16990.STYLESHEET, false, c18503M42895);
                                        str10 = str18;
                                    }
                                    if (c18503M42895.length() == c17499.length()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    for (i6 = 0; z3 && i6 < c17499.length(); i6++) {
                                        if ((i6 & 1023) == 0) {
                                            C3894.m11326();
                                        }
                                        if (c18503M42895.charAt(i6) == c17499.charAt(i6)) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (z3) {
                                        c18503.append((CharSequence) c17499);
                                    } else {
                                        if (z2) {
                                            c11657 = c18503M42895;
                                        } else {
                                            if (m14731(c18503M42895, true)) {
                                                str11 = str9;
                                            } else {
                                                str11 = str10;
                                            }
                                            if (m14731(c18503M42895, false)) {
                                                string2 = str9;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str10);
                                                if (z4) {
                                                    i7 = c2484.f9853;
                                                } else {
                                                    i7 = c2484.f9855;
                                                }
                                                sb3.append(C0242.m1615(i7, str7));
                                                string2 = sb3.toString();
                                            }
                                            c11657 = new C11657(str11, c18503M42895, string2);
                                        }
                                        c2485 = c2484.f9851;
                                        if (AbstractC5867.m16075(new C11657(c11657, new C17499(c2485.f9860, c2485.f9857, charSequence)), c2484.f9856) != c11657.length()) {
                                            c18503.append((CharSequence) c17499);
                                        } else {
                                            c18503.append(c11657);
                                        }
                                    }
                                    c18503M42895.close();
                                } catch (Throwable th) {
                                    try {
                                        c18503M42895.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } else if (!z) {
                                c18503.append((CharSequence) c17499);
                            }
                        } else {
                            str3 = " times will produce a String exceeding maximum size.";
                            str13 = " bytes String ";
                            str5 = "Repeating ";
                            str4 = str;
                        }
                        str6 = null;
                        if (str6 == null) {
                            c18503.append((CharSequence) c17499);
                        } else if (m14730(c17499)) {
                            z2 = this.f18351;
                            if (z2) {
                                if (z4) {
                                    i8 = 1;
                                    i9 = c2484.f9853 + 1;
                                } else {
                                    i8 = 1;
                                    i9 = c2487.f9855;
                                }
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException(C8479.m22141(i9, "count is negative: "));
                                }
                                int length4 = str14.length();
                                if (i9 != 0) {
                                    string = str4;
                                } else {
                                    string = str4;
                                }
                            } else {
                                string = str4;
                            }
                            c18503M42895 = c18503.m42895();
                            if (str6.equals("css")) {
                                str7 = str14;
                                str8 = str12;
                                str9 = str4;
                                if (str6.equals("json")) {
                                    enumC18877 = EnumC18877.JSON;
                                } else {
                                    enumC18877 = EnumC18877.JAVASCRIPT;
                                }
                                enumC18878 = enumC18877;
                                if (z2) {
                                    str10 = str8;
                                    C11137.m28067(c17499, enumC18878, new C12052(0, false), C8294.f28808, true, c18503M42895);
                                } else {
                                    str10 = str8;
                                    C11137.m28067(c17499, enumC18878, this.f18348, new C8294(string, str10), false, c18503M42895);
                                }
                            } else if (z2) {
                                str7 = str14;
                                str9 = str4;
                                C21699.m48445(c17499, new C12052(0, false), C5701.f19439, EnumC16990.STYLESHEET, true, c18503M42895);
                                str10 = str12;
                            } else {
                                str7 = str14;
                                str9 = str4;
                                String str19 = str12;
                                C21699.m48445(c17499, this.f18348, new C5701(string, str19), EnumC16990.STYLESHEET, false, c18503M42895);
                                str10 = str19;
                            }
                            if (c18503M42895.length() == c17499.length()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            while (z3) {
                                if ((i6 & 1023) == 0) {
                                    C3894.m11326();
                                }
                                if (c18503M42895.charAt(i6) == c17499.charAt(i6)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                c18503.append((CharSequence) c17499);
                            } else {
                                if (z2) {
                                    c11657 = c18503M42895;
                                } else {
                                    if (m14731(c18503M42895, true)) {
                                        str11 = str9;
                                    } else {
                                        str11 = str10;
                                    }
                                    if (m14731(c18503M42895, false)) {
                                        string2 = str9;
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(str10);
                                        if (z4) {
                                            i7 = c2484.f9853;
                                        } else {
                                            i7 = c2484.f9855;
                                        }
                                        sb4.append(C0242.m1615(i7, str7));
                                        string2 = sb4.toString();
                                    }
                                    c11657 = new C11657(str11, c18503M42895, string2);
                                }
                                c2485 = c2484.f9851;
                                if (AbstractC5867.m16075(new C11657(c11657, new C17499(c2485.f9860, c2485.f9857, charSequence)), c2484.f9856) != c11657.length()) {
                                    c18503.append((CharSequence) c17499);
                                } else {
                                    c18503.append(c11657);
                                }
                            }
                            c18503M42895.close();
                        } else if (!z) {
                            c18503.append((CharSequence) c17499);
                        }
                    }
                    i5 = i4;
                }
                i11 = i5 + 1;
                i12 = i2;
            } else {
                charSequence = charSequence2;
                i2 = i14;
            }
            str = "";
            if (!z4) {
                if (c2487.f9867) {
                    c18503.append((CharSequence) c17499);
                    i4 = i11;
                    i5 = i4;
                } else {
                    i3 = c2487.f9865;
                    z = this.f18347;
                    if (i3 == 1) {
                        i4 = i11;
                        if (c2487.f9856 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c18503.append((CharSequence) c17499);
                        } else {
                            i5 = i4;
                            c18503.append((CharSequence) c17499);
                        }
                    } else {
                        i4 = i11;
                        if (c2487.f9856 == null) {
                        }
                        if (z) {
                            i5 = i4;
                            c18503.append((CharSequence) c17499);
                        } else {
                            i5 = i4;
                            c18503.append((CharSequence) c17499);
                        }
                    }
                }
            } else if (c2487.f9867) {
                c18503.append((CharSequence) c17499);
                i4 = i11;
                i5 = i4;
            } else {
                i3 = c2487.f9865;
                z = this.f18347;
                if (i3 == 1) {
                    i4 = i11;
                    if (c2487.f9856 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c18503.append((CharSequence) c17499);
                    } else {
                        i5 = i4;
                        c18503.append((CharSequence) c17499);
                    }
                } else {
                    i4 = i11;
                    if (c2487.f9856 == null) {
                    }
                    if (z) {
                        i5 = i4;
                        c18503.append((CharSequence) c17499);
                    } else {
                        i5 = i4;
                        c18503.append((CharSequence) c17499);
                    }
                }
            }
            i11 = i5 + 1;
            i12 = i2;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14733() {
        ArrayList arrayList;
        int iContains;
        C2483 c2483;
        boolean z;
        int i;
        C2483 c2484;
        C2483 c2485;
        C2483 c2486;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            arrayList = this.f18352;
            if (i3 >= arrayList.size()) {
                break;
            }
            C3894.m11326();
            C2483 c2487 = (C2483) arrayList.get(i3);
            c2487.f9858 = i2;
            String str = c2487.f9856;
            boolean z2 = str != null && !c2487.f9862 && c2487.f9870 && (!c2487.f9861 ? !((str.equals("html") && c2487.f9872 == null) || ((c2487.f9856.equals("head") || c2487.f9856.equals("body")) && ((c2485 = c2487.f9872) == null || (c2485.f9873 && c2485.f9856.equals("html"))))) : (c2486 = c2487.f9874) == null || !c2486.f9873);
            c2487.f9873 = z2;
            if (z2) {
                i = 0;
            } else if (!c2487.f9861 || (c2484 = c2487.f9874) == null) {
                C2483 c2488 = c2487.f9872;
                if (c2488 == null) {
                    i = 0;
                } else {
                    i = c2488.f9853 + 1;
                }
            } else {
                i = c2484.f9853;
            }
            c2487.f9853 = i;
            if (!c2487.f9866) {
                i2 = i3;
            }
            i3++;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C3894.m11326();
            C2483 c2489 = (C2483) arrayList.get(i4);
            if (c2489.f9866 || ((c2489.f9867 && (c2489.f9856 == null || c2489.f9869)) || c2489.f9862 || ((c2483 = c2489.f9872) != null && c2483.f9869))) {
                iContains = 0;
            } else {
                int i5 = c2489.f9858;
                C2483 c24810 = i5 < 0 ? null : (C2483) arrayList.get(i5);
                if (c24810 != null && c24810.f9867 && (c24810.f9856 == null || c24810.f9869)) {
                    iContains = 0;
                } else {
                    int i6 = c2489.f9865;
                    if (i6 != 4) {
                        Object obj = c2489.f9856;
                        if (obj != null && (!c2489.f9870 || (((z = c2489.f9861) && c2489.f9874 == null) || (z && c2489.f9869)))) {
                            iContains = 0;
                        } else if (c2489.f9873) {
                            iContains = 1;
                        } else {
                            C2483 c24811 = c2489.f9872;
                            if (c24811 == null || !c24811.f9871) {
                                iContains = 2;
                                iContains = 2;
                                iContains = 2;
                                Set set = f18342;
                                if (i6 == 2) {
                                    if (c24811 != null && !set.contains(c24811.f9856)) {
                                        iContains = 0;
                                    } else if (c24810 == null || m14734(c24810)) {
                                        iContains = 1;
                                    }
                                } else if (obj == null || (c2489.f9861 && c2489.f9874.f9871)) {
                                    iContains = 0;
                                } else if (c24810 == null) {
                                    iContains = set.contains(obj);
                                } else {
                                    int i7 = c24810.f9865;
                                    if (i7 == 1) {
                                        iContains = 0;
                                    } else if (c24810.f9856 == null && i7 != 2 && i7 != 4) {
                                        C2483 c24812 = c24810.f9872;
                                        if (c24812 != null && c24812 != c24811 && !c24812.f9869 && set.contains(c24812.f9856)) {
                                            if (!c2489.f9861) {
                                                String str2 = c24810.f9872.f9856;
                                                String str3 = c2489.f9856;
                                                if (str2.equals(am.ax) && set.contains(str3)) {
                                                    Object[] objArr = {"script", "style", "meta", "link", "base"};
                                                    HashSet hashSet = new HashSet(5);
                                                    for (int i8 = 0; i8 < 5; i8++) {
                                                        Object obj2 = objArr[i8];
                                                        C13638.requireNonNull(obj2);
                                                        if (!hashSet.add(obj2)) {
                                                            throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
                                                        }
                                                    }
                                                    if (C0561.unmodifiableSet(hashSet).contains(str3)) {
                                                        if (str2.equals("li")) {
                                                        }
                                                    }
                                                } else if ((str2.equals("li") || !str3.equals("li")) && (((!str2.equals("dt") && !str2.equals("dd")) || (!str3.equals("dt") && !str3.equals("dd"))) && ((!str2.equals("option") || (!str3.equals("option") && !str3.equals("optgroup"))) && ((!str2.equals("optgroup") || !str3.equals("optgroup")) && ((!str2.equals("tr") || !str3.equals("tr")) && (((!str2.equals("td") && !str2.equals("th")) || (!str3.equals("td") && !str3.equals("th"))) && ((!str2.equals("thead") && !str2.equals("tbody") && !str2.equals("tfoot")) || (!str3.equals("tbody") && !str3.equals("tfoot"))))))))) {
                                                }
                                            }
                                            iContains = 1;
                                        }
                                        iContains = 0;
                                    } else if (c2489.f9874 == c24810) {
                                        iContains = 0;
                                    } else if (!set.contains(obj)) {
                                        C2483 c24813 = c2489.f9872;
                                        if (c24813 == null || (!c24813.f9873 && c24813.f9856.indexOf(58) < 0)) {
                                            iContains = 0;
                                        } else if (m14734(c24810)) {
                                            iContains = 1;
                                        }
                                    } else if (m14734(c24810)) {
                                        iContains = 1;
                                    }
                                }
                            } else {
                                iContains = 0;
                            }
                        }
                    } else if (c2489.f9872 == null && m14729(c2489)) {
                        iContains = 1;
                    } else {
                        iContains = 0;
                    }
                }
            }
            c2489.f9863 = iContains;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m14734(C2483 c2483) {
        int i;
        C2483 c2484 = c2483.f9861 ? c2483.f9874 : c2483;
        String str = c2483.f9856;
        return (str != null && c2483.f9870 && f18342.contains(str) && (!f18343.contains(c2483.f9856) || (c2484 != null && c2484.f9863 == 1))) || ((i = c2483.f9865) == 2 && c2483.f9863 == 1) || (i == 4 && m14729(c2483));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14729(C2483 c2483) {
        int i;
        int i2 = c2483.f9860;
        if (c2483.f9865 != 4) {
            return false;
        }
        CharSequence charSequence = this.f18346;
        return C21460.m48082(charSequence, true, i2, "<!doctype", 9) && (i = c2483.f9857) > i2 + 9 && charSequence.charAt(i - 1) == '>';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14728(int i) {
        ArrayList arrayList = this.f18352;
        int i2 = ((C2483) arrayList.get(i)).f9863;
        return i2 == 1 || (i2 == 2 && i > 0 && ((C2483) arrayList.get(i - 1)).f9866);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14731(C18503 c18503, boolean z) {
        int length = z ? 0 : c18503.length() - 1;
        while (length >= 0 && length < c18503.length()) {
            char cCharAt = c18503.charAt(length);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            if (!AbstractC5867.m16077(cCharAt)) {
                break;
            }
            length += z ? 1 : -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14730(C17499 c17499) {
        for (int i = 0; i < c17499.length(); i++) {
            if ((i & 1023) == 0) {
                C3894.m11326();
            }
            if (!AbstractC5867.m16077(c17499.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
