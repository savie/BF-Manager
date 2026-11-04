package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17P5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13575 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f43118;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f43120;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f43099 = Pattern.compile("\r\n?");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC21825 f43110 = AbstractC21825.m49479('\n');

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f43090 = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43108 = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43106 = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f43113 = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f43114 = Pattern.compile("^<!--.*?-->", 32);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43101 = m33282("pre");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f43091 = m33280("pre");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f43116 = m33282("code");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43103 = m33280("code");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43098 = m33282("table");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f43100 = m33280("table");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f43115 = m33282("ul|ol|dl");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f43112 = m33280("ul|ol|dl");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43097 = m33282("li|dt|dd");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43104 = m33280("li|dt|dd");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43107 = m33282("h[1-6]");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43109 = m33280("h[1-6]");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43102 = m33282(am.ax);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43111 = m33280(am.ax);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43096 = m33282("blockquote");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f43105 = m33280("blockquote");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f43092 = m33282("br");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43093 = Pattern.compile("^[{]@snippet\\b");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43094 = Pattern.compile("^[{]@\\w*");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43095 = Pattern.compile("^.[^ \t\n@<{}*]*", 32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23030 f43117 = new C23030();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23030 f43122 = new C23030();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23030 f43121 = new C23030();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23030 f43119 = new C23030();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m33283(String str) throws C6864 {
        boolean z;
        int iMo33824;
        EnumC20046 enumC20046;
        EnumC20046 enumC20047;
        C12128.m30306(str, "Missing /**: %s", str.startsWith("/**"));
        C12128.m30306(str, "Missing */: %s", str.endsWith("*/") && str.length() > 4);
        String strReplaceAll = f43099.matcher(str.substring(3, str.length() - 2)).replaceAll("\n");
        C9100 c9100 = new C9100();
        strReplaceAll.getClass();
        c9100.f29569 = strReplaceAll;
        C13575 c13575 = new C13575(c9100);
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        c22811.m19807(new C15570(EnumC20046.BEGIN_JAVADOC, "/**"));
        while (!c9100.f29569.isEmpty()) {
            boolean zM33284 = c13575.m33284();
            if (c9100.m24251(f43090)) {
                c13575.f43120 = false;
                enumC20047 = zM33284 ? EnumC20046.FORCED_NEWLINE : EnumC20046.WHITESPACE;
            } else if (c9100.m24250(" ") || c9100.m24250("\t")) {
                enumC20047 = zM33284 ? EnumC20046.LITERAL : EnumC20046.WHITESPACE;
            } else if (c13575.f43120 || !c9100.m24251(f43108)) {
                c13575.f43120 = true;
                boolean zM24251 = c9100.m24251(f43093);
                C23030 c23030 = c13575.f43117;
                if (zM24251) {
                    if (c23030.m51933() == 0) {
                        c23030.m51935();
                        c13575.f43118 = true;
                        enumC20047 = EnumC20046.SNIPPET_BEGIN;
                    } else {
                        c23030.m51935();
                        enumC20047 = EnumC20046.LITERAL;
                    }
                } else if (c9100.m24251(f43094)) {
                    c23030.m51935();
                    enumC20047 = EnumC20046.LITERAL;
                } else if (c9100.m24250("{")) {
                    c23030.m51932();
                    enumC20047 = EnumC20046.LITERAL;
                } else if (!c9100.m24250(l.d)) {
                    boolean zM51936 = c23030.m51936();
                    Pattern pattern = f43095;
                    if (!zM51936) {
                        boolean zM24252 = c9100.m24251(f43101);
                        C23030 c23031 = c13575.f43122;
                        if (zM24252) {
                            c23031.m51935();
                            enumC20047 = zM33284 ? EnumC20046.LITERAL : EnumC20046.PRE_OPEN_TAG;
                        } else if (c9100.m24251(f43091)) {
                            c23031.m51931();
                            enumC20047 = c13575.m33284() ? EnumC20046.LITERAL : EnumC20046.PRE_CLOSE_TAG;
                        } else {
                            boolean zM24253 = c9100.m24251(f43116);
                            C23030 c23032 = c13575.f43121;
                            if (zM24253) {
                                c23032.m51935();
                                enumC20047 = zM33284 ? EnumC20046.LITERAL : EnumC20046.CODE_OPEN_TAG;
                            } else if (c9100.m24251(f43103)) {
                                c23032.m51931();
                                enumC20047 = c13575.m33284() ? EnumC20046.LITERAL : EnumC20046.CODE_CLOSE_TAG;
                            } else {
                                boolean zM24254 = c9100.m24251(f43098);
                                C23030 c23033 = c13575.f43119;
                                if (zM24254) {
                                    c23033.m51935();
                                    enumC20047 = zM33284 ? EnumC20046.LITERAL : EnumC20046.TABLE_OPEN_TAG;
                                } else if (c9100.m24251(f43100)) {
                                    c23033.m51931();
                                    enumC20047 = c13575.m33284() ? EnumC20046.LITERAL : EnumC20046.TABLE_CLOSE_TAG;
                                } else if (zM33284) {
                                    if (!c9100.m24251(pattern)) {
                                        throw new C13377();
                                    }
                                    enumC20047 = EnumC20046.LITERAL;
                                } else if (c9100.m24251(f43102)) {
                                    enumC20047 = EnumC20046.PARAGRAPH_OPEN_TAG;
                                } else if (c9100.m24251(f43111)) {
                                    enumC20047 = EnumC20046.PARAGRAPH_CLOSE_TAG;
                                } else if (c9100.m24251(f43115)) {
                                    enumC20047 = EnumC20046.LIST_OPEN_TAG;
                                } else if (c9100.m24251(f43112)) {
                                    enumC20047 = EnumC20046.LIST_CLOSE_TAG;
                                } else if (c9100.m24251(f43097)) {
                                    enumC20047 = EnumC20046.LIST_ITEM_OPEN_TAG;
                                } else if (c9100.m24251(f43104)) {
                                    enumC20047 = EnumC20046.LIST_ITEM_CLOSE_TAG;
                                } else if (c9100.m24251(f43096)) {
                                    enumC20047 = EnumC20046.BLOCKQUOTE_OPEN_TAG;
                                } else if (c9100.m24251(f43105)) {
                                    enumC20047 = EnumC20046.BLOCKQUOTE_CLOSE_TAG;
                                } else if (c9100.m24251(f43107)) {
                                    enumC20047 = EnumC20046.HEADER_OPEN_TAG;
                                } else if (c9100.m24251(f43109)) {
                                    enumC20047 = EnumC20046.HEADER_CLOSE_TAG;
                                } else if (c9100.m24251(f43092)) {
                                    enumC20047 = EnumC20046.BR_TAG;
                                } else if (c9100.m24251(f43106)) {
                                    enumC20047 = EnumC20046.MOE_BEGIN_STRIP_COMMENT;
                                } else if (c9100.m24251(f43113)) {
                                    enumC20047 = EnumC20046.MOE_END_STRIP_COMMENT;
                                } else if (c9100.m24251(f43114)) {
                                    enumC20047 = EnumC20046.HTML_COMMENT;
                                } else {
                                    if (!c9100.m24251(pattern)) {
                                        throw new AssertionError();
                                    }
                                    enumC20047 = EnumC20046.LITERAL;
                                }
                            }
                        }
                    } else {
                        if (!c9100.m24251(pattern)) {
                            throw new C13377();
                        }
                        enumC20047 = EnumC20046.LITERAL;
                    }
                } else if (c13575.f43118 && c23030.m51933() == 1) {
                    c23030.m51931();
                    c13575.f43118 = false;
                    enumC20047 = EnumC20046.SNIPPET_END;
                } else {
                    c23030.m51931();
                    enumC20047 = EnumC20046.LITERAL;
                }
            } else {
                c13575.m33281();
                c13575.f43120 = true;
                enumC20047 = EnumC20046.FOOTER_JAVADOC_TAG_START;
            }
            String strSubstring = c9100.f29569.substring(0, c9100.f29570);
            c9100.f29569 = c9100.f29569.substring(c9100.f29570);
            c9100.f29570 = 0;
            c22811.m19807(new C15570(enumC20047, strSubstring));
        }
        c13575.m33281();
        c22811.m19807(new C15570(EnumC20046.END_JAVADOC, "*/"));
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        int i2 = AbstractC1928.f6477;
        C22811 c22812 = new C22811();
        StringBuilder sb = new StringBuilder();
        InterfaceC9802 interfaceC9802M20913 = C7676.m20913(abstractC1928M51441.listIterator(0));
        while (interfaceC9802M20913.hasNext()) {
            if (((C15570) interfaceC9802M20913.peek()).m37287() == EnumC20046.LITERAL) {
                sb.append(((C15570) interfaceC9802M20913.peek()).m37289());
                interfaceC9802M20913.next();
            } else if (sb.length() == 0) {
                c22812.m19807((C15570) interfaceC9802M20913.peek());
                interfaceC9802M20913.next();
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    EnumC20046 enumC20046M37287 = ((C15570) interfaceC9802M20913.peek()).m37287();
                    enumC20046 = EnumC20046.WHITESPACE;
                    if (enumC20046M37287 != enumC20046) {
                        break;
                    }
                    sb2.append(((C15570) interfaceC9802M20913.next()).m37289());
                }
                EnumC20046 enumC20046M37288 = ((C15570) interfaceC9802M20913.peek()).m37287();
                EnumC20046 enumC20048 = EnumC20046.LITERAL;
                if (enumC20046M37288 == enumC20048 && ((C15570) interfaceC9802M20913.peek()).m37289().startsWith("@")) {
                    sb.append(" ");
                    sb.append(((C15570) interfaceC9802M20913.peek()).m37289());
                    interfaceC9802M20913.next();
                } else {
                    c22812.m19807(new C15570(enumC20048, sb.toString()));
                    sb.setLength(0);
                    if (sb2.length() > 0) {
                        c22812.m19807(new C15570(enumC20046, sb2.toString()));
                    }
                }
            }
        }
        AbstractC1928 abstractC1928M51442 = c22812.m51441();
        int i3 = AbstractC1928.f6477;
        C22811 c22813 = new C22811();
        InterfaceC9802 interfaceC9802M20914 = C7676.m20913(abstractC1928M51442.listIterator(0));
        while (interfaceC9802M20914.hasNext()) {
            EnumC20046 enumC20046M37289 = ((C15570) interfaceC9802M20914.peek()).m37287();
            EnumC20046 enumC20049 = EnumC20046.LITERAL;
            if (enumC20046M37289 == enumC20049) {
                c22813.m19807((C15570) interfaceC9802M20914.next());
                if (((C15570) interfaceC9802M20914.peek()).m37287() == EnumC20046.WHITESPACE) {
                    if (f43110.mo23310(((C15570) interfaceC9802M20914.peek()).m37289()) > 1) {
                        c22813.m19807((C15570) interfaceC9802M20914.next());
                        if (((C15570) interfaceC9802M20914.peek()).m37287() == enumC20049) {
                            c22813.m19807(new C15570(EnumC20046.PARAGRAPH_OPEN_TAG, "<p>"));
                        }
                    }
                }
            } else {
                c22813.m19807((C15570) interfaceC9802M20914.next());
            }
        }
        AbstractC1928 abstractC1928M51443 = c22813.m51441();
        int i4 = AbstractC1928.f6477;
        C22811 c22814 = new C22811();
        InterfaceC9802 interfaceC9802M20915 = C7676.m20913(abstractC1928M51443.listIterator(0));
        while (interfaceC9802M20915.hasNext()) {
            if (((C15570) interfaceC9802M20915.peek()).m37287() == EnumC20046.LITERAL && ((C15570) interfaceC9802M20915.peek()).m37289().matches("^href=[^>]*>")) {
                c22814.m19807((C15570) interfaceC9802M20915.next());
                if (((C15570) interfaceC9802M20915.peek()).m37287() == EnumC20046.WHITESPACE) {
                    c22814.m19807(new C15570(EnumC20046.OPTIONAL_LINE_BREAK, ((C15570) interfaceC9802M20915.next()).m37289()));
                }
            } else {
                c22814.m19807((C15570) interfaceC9802M20915.next());
            }
        }
        AbstractC1928 abstractC1928M51444 = c22814.m51441();
        int i5 = AbstractC1928.f6477;
        C22811 c22815 = new C22811();
        InterfaceC9802 interfaceC9802M20916 = C7676.m20913(abstractC1928M51444.listIterator(0));
        while (interfaceC9802M20916.hasNext()) {
            if (((C15570) interfaceC9802M20916.peek()).m37287() != EnumC20046.PRE_OPEN_TAG) {
                c22815.m19807((C15570) interfaceC9802M20916.next());
            } else {
                c22815.m19807((C15570) interfaceC9802M20916.next());
                ArrayList arrayList = new ArrayList();
                while (interfaceC9802M20916.hasNext() && ((C15570) interfaceC9802M20916.peek()).m37287() == EnumC20046.FORCED_NEWLINE) {
                    arrayList.add((C15570) interfaceC9802M20916.next());
                }
                EnumC20046 enumC20046M372810 = ((C15570) interfaceC9802M20916.peek()).m37287();
                EnumC20046 enumC200410 = EnumC20046.LITERAL;
                if (enumC20046M372810 == enumC200410 && ((C15570) interfaceC9802M20916.peek()).m37289().matches("[ \t]*[{]@code")) {
                    ArrayDeque<C15570> arrayDeque = new ArrayDeque();
                    c22815.m19807(new C15570(enumC200410, ((C15570) interfaceC9802M20916.next()).m37289().trim()));
                    while (interfaceC9802M20916.hasNext() && ((C15570) interfaceC9802M20916.peek()).m37287() != EnumC20046.PRE_CLOSE_TAG) {
                        arrayDeque.addLast((C15570) interfaceC9802M20916.next());
                    }
                    while (!arrayDeque.isEmpty() && ((C15570) arrayDeque.peekFirst()).m37287() == EnumC20046.FORCED_NEWLINE) {
                        arrayDeque.removeFirst();
                    }
                    while (!arrayDeque.isEmpty() && ((C15570) arrayDeque.peekLast()).m37287() == EnumC20046.FORCED_NEWLINE) {
                        arrayDeque.removeLast();
                    }
                    if (!arrayDeque.isEmpty()) {
                        C15570 c15570 = (C15570) arrayDeque.peekLast();
                        EnumC20046 enumC20046M372811 = c15570.m37287();
                        EnumC20046 enumC200411 = EnumC20046.LITERAL;
                        if (enumC20046M372811 == enumC200411 && c15570.m37289().endsWith(l.d)) {
                            arrayDeque.removeLast();
                            if (c15570.m37288() > 1) {
                                arrayDeque.addLast(new C15570(enumC200411, c15570.m37289().substring(0, c15570.m37289().length() - 1)));
                                arrayDeque.addLast(new C15570(EnumC20046.FORCED_NEWLINE, null));
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        int i6 = -1;
                        for (C15570 c15571 : arrayDeque) {
                            if (c15571.m37287() == EnumC20046.LITERAL && (iMo33824 = AbstractC21825.m49478().mo33824(0, c15571.m37289())) != -1 && (i6 == -1 || iMo33824 < i6)) {
                                i6 = iMo33824;
                            }
                        }
                        c22815.m19807(new C15570(EnumC20046.FORCED_NEWLINE, "\n"));
                        for (C15570 c15572 : arrayDeque) {
                            EnumC20046 enumC20046M372812 = c15572.m37287();
                            EnumC20046 enumC200412 = EnumC20046.LITERAL;
                            if (enumC20046M372812 == enumC200412) {
                                c22815.m19807(new C15570(enumC200412, (i6 <= 0 || c15572.m37288() <= i6) ? c15572.m37289() : c15572.m37289().substring(i6)));
                            } else {
                                c22815.m19807(c15572);
                            }
                        }
                        if (z) {
                            c22815.m19807(new C15570(EnumC20046.LITERAL, l.d));
                        } else {
                            c22815.m19807(new C15570(EnumC20046.FORCED_NEWLINE, "\n"));
                        }
                    }
                } else {
                    c22815.m19806((List) arrayList);
                    c22815.m19807((C15570) interfaceC9802M20916.next());
                }
            }
        }
        return c22815.m51441();
    }

    public C13575(C9100 c9100) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m33284() {
        return this.f43122.m51936() || this.f43119.m51936() || this.f43121.m51936() || this.f43118;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33281() throws C6864 {
        if (this.f43117.m51936() || this.f43122.m51936() || this.f43119.m51936() || this.f43121.m51936()) {
            throw new C6864();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m33282(String str) {
        return Pattern.compile("^<(?:" + str + ")\\b[^>]*>", 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m33280(String str) {
        return Pattern.compile("^</(?:" + str + ")\\b[^>]*>", 2);
    }
}
