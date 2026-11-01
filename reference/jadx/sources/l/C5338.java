package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17P5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5338 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f18439;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f18440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f18422 = Pattern.compile("\r\n?");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC14384 f18410 = AbstractC14384.m34618('\n');

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18427 = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18425 = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18426 = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f18432 = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18430 = Pattern.compile("^<!--.*?-->", 32);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f18436 = m14817("pre");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18421 = m14815("pre");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f18435 = m14817("code");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18415 = m14815("code");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18419 = m14817("table");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f18412 = m14815("table");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f18416 = m14817("ul|ol|dl");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f18431 = m14815("ul|ol|dl");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18420 = m14817("li|dt|dd");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18418 = m14815("li|dt|dd");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18429 = m14817("h[1-6]");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f18434 = m14815("h[1-6]");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18414 = m14817(am.ax);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18428 = m14815(am.ax);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f18423 = m14817("blockquote");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f18411 = m14815("blockquote");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18413 = m14817("br");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18424 = Pattern.compile("^[{]@snippet\\b");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f18417 = Pattern.compile("^[{]@\\w*");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f18433 = Pattern.compile("^.[^ \t\n@<{}*]*", 32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3926 f18438 = new C3926();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3926 f18437 = new C3926();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3926 f18441 = new C3926();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3926 f18442 = new C3926();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m14818(String str) throws C2515 {
        boolean z;
        int iMo27207;
        EnumC6749 enumC6749;
        EnumC6749 enumC67410;
        C18304.m42514(str, "Missing /**: %s", str.startsWith("/**"));
        C18304.m42514(str, "Missing */: %s", str.endsWith("*/") && str.length() > 4);
        String strReplaceAll = f18422.matcher(str.substring(3, str.length() - 2)).replaceAll("\n");
        C4632 c4632 = new C4632();
        strReplaceAll.getClass();
        c4632.f16363 = strReplaceAll;
        C5338 c5338 = new C5338(c4632);
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        c4793.m52163(new C22978(EnumC6749.BEGIN_JAVADOC, "/**"));
        while (!c4632.f16363.isEmpty()) {
            boolean zM14819 = c5338.m14819();
            if (c4632.m12791(f18427)) {
                c5338.f18439 = false;
                enumC67410 = zM14819 ? EnumC6749.FORCED_NEWLINE : EnumC6749.WHITESPACE;
            } else if (c4632.m12790(" ") || c4632.m12790("\t")) {
                enumC67410 = zM14819 ? EnumC6749.LITERAL : EnumC6749.WHITESPACE;
            } else if (c5338.f18439 || !c4632.m12791(f18425)) {
                c5338.f18439 = true;
                boolean zM12791 = c4632.m12791(f18424);
                C3926 c3926 = c5338.f18438;
                if (zM12791) {
                    if (c3926.m11403() == 0) {
                        c3926.m11402();
                        c5338.f18440 = true;
                        enumC67410 = EnumC6749.SNIPPET_BEGIN;
                    } else {
                        c3926.m11402();
                        enumC67410 = EnumC6749.LITERAL;
                    }
                } else if (c4632.m12791(f18417)) {
                    c3926.m11402();
                    enumC67410 = EnumC6749.LITERAL;
                } else if (c4632.m12790("{")) {
                    c3926.m11401();
                    enumC67410 = EnumC6749.LITERAL;
                } else if (!c4632.m12790(l.d)) {
                    boolean zM11398 = c3926.m11398();
                    Pattern pattern = f18433;
                    if (!zM11398) {
                        boolean zM12792 = c4632.m12791(f18436);
                        C3926 c3927 = c5338.f18437;
                        if (zM12792) {
                            c3927.m11402();
                            enumC67410 = zM14819 ? EnumC6749.LITERAL : EnumC6749.PRE_OPEN_TAG;
                        } else if (c4632.m12791(f18421)) {
                            c3927.m11399();
                            enumC67410 = c5338.m14819() ? EnumC6749.LITERAL : EnumC6749.PRE_CLOSE_TAG;
                        } else {
                            boolean zM12793 = c4632.m12791(f18435);
                            C3926 c3928 = c5338.f18441;
                            if (zM12793) {
                                c3928.m11402();
                                enumC67410 = zM14819 ? EnumC6749.LITERAL : EnumC6749.CODE_OPEN_TAG;
                            } else if (c4632.m12791(f18415)) {
                                c3928.m11399();
                                enumC67410 = c5338.m14819() ? EnumC6749.LITERAL : EnumC6749.CODE_CLOSE_TAG;
                            } else {
                                boolean zM12794 = c4632.m12791(f18419);
                                C3926 c3929 = c5338.f18442;
                                if (zM12794) {
                                    c3929.m11402();
                                    enumC67410 = zM14819 ? EnumC6749.LITERAL : EnumC6749.TABLE_OPEN_TAG;
                                } else if (c4632.m12791(f18412)) {
                                    c3929.m11399();
                                    enumC67410 = c5338.m14819() ? EnumC6749.LITERAL : EnumC6749.TABLE_CLOSE_TAG;
                                } else if (zM14819) {
                                    if (!c4632.m12791(pattern)) {
                                        throw new C5458();
                                    }
                                    enumC67410 = EnumC6749.LITERAL;
                                } else if (c4632.m12791(f18414)) {
                                    enumC67410 = EnumC6749.PARAGRAPH_OPEN_TAG;
                                } else if (c4632.m12791(f18428)) {
                                    enumC67410 = EnumC6749.PARAGRAPH_CLOSE_TAG;
                                } else if (c4632.m12791(f18416)) {
                                    enumC67410 = EnumC6749.LIST_OPEN_TAG;
                                } else if (c4632.m12791(f18431)) {
                                    enumC67410 = EnumC6749.LIST_CLOSE_TAG;
                                } else if (c4632.m12791(f18420)) {
                                    enumC67410 = EnumC6749.LIST_ITEM_OPEN_TAG;
                                } else if (c4632.m12791(f18418)) {
                                    enumC67410 = EnumC6749.LIST_ITEM_CLOSE_TAG;
                                } else if (c4632.m12791(f18423)) {
                                    enumC67410 = EnumC6749.BLOCKQUOTE_OPEN_TAG;
                                } else if (c4632.m12791(f18411)) {
                                    enumC67410 = EnumC6749.BLOCKQUOTE_CLOSE_TAG;
                                } else if (c4632.m12791(f18429)) {
                                    enumC67410 = EnumC6749.HEADER_OPEN_TAG;
                                } else if (c4632.m12791(f18434)) {
                                    enumC67410 = EnumC6749.HEADER_CLOSE_TAG;
                                } else if (c4632.m12791(f18413)) {
                                    enumC67410 = EnumC6749.BR_TAG;
                                } else if (c4632.m12791(f18426)) {
                                    enumC67410 = EnumC6749.MOE_BEGIN_STRIP_COMMENT;
                                } else if (c4632.m12791(f18432)) {
                                    enumC67410 = EnumC6749.MOE_END_STRIP_COMMENT;
                                } else if (c4632.m12791(f18430)) {
                                    enumC67410 = EnumC6749.HTML_COMMENT;
                                } else {
                                    if (!c4632.m12791(pattern)) {
                                        throw new AssertionError();
                                    }
                                    enumC67410 = EnumC6749.LITERAL;
                                }
                            }
                        }
                    } else {
                        if (!c4632.m12791(pattern)) {
                            throw new C5458();
                        }
                        enumC67410 = EnumC6749.LITERAL;
                    }
                } else if (c5338.f18440 && c3926.m11403() == 1) {
                    c3926.m11399();
                    c5338.f18440 = false;
                    enumC67410 = EnumC6749.SNIPPET_END;
                } else {
                    c3926.m11399();
                    enumC67410 = EnumC6749.LITERAL;
                }
            } else {
                c5338.m14816();
                c5338.f18439 = true;
                enumC67410 = EnumC6749.FOOTER_JAVADOC_TAG_START;
            }
            String strSubstring = c4632.f16363.substring(0, c4632.f16364);
            c4632.f16363 = c4632.f16363.substring(c4632.f16364);
            c4632.f16364 = 0;
            c4793.m52163(new C22978(enumC67410, strSubstring));
        }
        c5338.m14816();
        c4793.m52163(new C22978(EnumC6749.END_JAVADOC, "*/"));
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        int i2 = AbstractC22433.f73217;
        C4793 c4794 = new C4793();
        StringBuilder sb = new StringBuilder();
        InterfaceC23659 interfaceC23659M38722 = C16458.m38722(abstractC22433M13309.listIterator(0));
        while (interfaceC23659M38722.hasNext()) {
            if (((C22978) interfaceC23659M38722.peek()).m50815() == EnumC6749.LITERAL) {
                sb.append(((C22978) interfaceC23659M38722.peek()).m50817());
                interfaceC23659M38722.next();
            } else if (sb.length() == 0) {
                c4794.m52163((C22978) interfaceC23659M38722.peek());
                interfaceC23659M38722.next();
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    EnumC6749 enumC6749M50815 = ((C22978) interfaceC23659M38722.peek()).m50815();
                    enumC6749 = EnumC6749.WHITESPACE;
                    if (enumC6749M50815 != enumC6749) {
                        break;
                    }
                    sb2.append(((C22978) interfaceC23659M38722.next()).m50817());
                }
                EnumC6749 enumC6749M50816 = ((C22978) interfaceC23659M38722.peek()).m50815();
                EnumC6749 enumC67411 = EnumC6749.LITERAL;
                if (enumC6749M50816 == enumC67411 && ((C22978) interfaceC23659M38722.peek()).m50817().startsWith("@")) {
                    sb.append(" ");
                    sb.append(((C22978) interfaceC23659M38722.peek()).m50817());
                    interfaceC23659M38722.next();
                } else {
                    c4794.m52163(new C22978(enumC67411, sb.toString()));
                    sb.setLength(0);
                    if (sb2.length() > 0) {
                        c4794.m52163(new C22978(enumC6749, sb2.toString()));
                    }
                }
            }
        }
        AbstractC22433 abstractC22433M133010 = c4794.m13309();
        int i3 = AbstractC22433.f73217;
        C4793 c4795 = new C4793();
        InterfaceC23659 interfaceC23659M38723 = C16458.m38722(abstractC22433M133010.listIterator(0));
        while (interfaceC23659M38723.hasNext()) {
            EnumC6749 enumC6749M50817 = ((C22978) interfaceC23659M38723.peek()).m50815();
            EnumC6749 enumC67412 = EnumC6749.LITERAL;
            if (enumC6749M50817 == enumC67412) {
                c4795.m52163((C22978) interfaceC23659M38723.next());
                if (((C22978) interfaceC23659M38723.peek()).m50815() == EnumC6749.WHITESPACE) {
                    if (f18410.mo27208(((C22978) interfaceC23659M38723.peek()).m50817()) > 1) {
                        c4795.m52163((C22978) interfaceC23659M38723.next());
                        if (((C22978) interfaceC23659M38723.peek()).m50815() == enumC67412) {
                            c4795.m52163(new C22978(EnumC6749.PARAGRAPH_OPEN_TAG, "<p>"));
                        }
                    }
                }
            } else {
                c4795.m52163((C22978) interfaceC23659M38723.next());
            }
        }
        AbstractC22433 abstractC22433M133011 = c4795.m13309();
        int i4 = AbstractC22433.f73217;
        C4793 c4796 = new C4793();
        InterfaceC23659 interfaceC23659M38724 = C16458.m38722(abstractC22433M133011.listIterator(0));
        while (interfaceC23659M38724.hasNext()) {
            if (((C22978) interfaceC23659M38724.peek()).m50815() == EnumC6749.LITERAL && ((C22978) interfaceC23659M38724.peek()).m50817().matches("^href=[^>]*>")) {
                c4796.m52163((C22978) interfaceC23659M38724.next());
                if (((C22978) interfaceC23659M38724.peek()).m50815() == EnumC6749.WHITESPACE) {
                    c4796.m52163(new C22978(EnumC6749.OPTIONAL_LINE_BREAK, ((C22978) interfaceC23659M38724.next()).m50817()));
                }
            } else {
                c4796.m52163((C22978) interfaceC23659M38724.next());
            }
        }
        AbstractC22433 abstractC22433M133012 = c4796.m13309();
        int i5 = AbstractC22433.f73217;
        C4793 c4797 = new C4793();
        InterfaceC23659 interfaceC23659M38725 = C16458.m38722(abstractC22433M133012.listIterator(0));
        while (interfaceC23659M38725.hasNext()) {
            if (((C22978) interfaceC23659M38725.peek()).m50815() != EnumC6749.PRE_OPEN_TAG) {
                c4797.m52163((C22978) interfaceC23659M38725.next());
            } else {
                c4797.m52163((C22978) interfaceC23659M38725.next());
                ArrayList arrayList = new ArrayList();
                while (interfaceC23659M38725.hasNext() && ((C22978) interfaceC23659M38725.peek()).m50815() == EnumC6749.FORCED_NEWLINE) {
                    arrayList.add((C22978) interfaceC23659M38725.next());
                }
                EnumC6749 enumC6749M50818 = ((C22978) interfaceC23659M38725.peek()).m50815();
                EnumC6749 enumC67413 = EnumC6749.LITERAL;
                if (enumC6749M50818 == enumC67413 && ((C22978) interfaceC23659M38725.peek()).m50817().matches("[ \t]*[{]@code")) {
                    ArrayDeque<C22978> arrayDeque = new ArrayDeque();
                    c4797.m52163(new C22978(enumC67413, ((C22978) interfaceC23659M38725.next()).m50817().trim()));
                    while (interfaceC23659M38725.hasNext() && ((C22978) interfaceC23659M38725.peek()).m50815() != EnumC6749.PRE_CLOSE_TAG) {
                        arrayDeque.addLast((C22978) interfaceC23659M38725.next());
                    }
                    while (!arrayDeque.isEmpty() && ((C22978) arrayDeque.peekFirst()).m50815() == EnumC6749.FORCED_NEWLINE) {
                        arrayDeque.removeFirst();
                    }
                    while (!arrayDeque.isEmpty() && ((C22978) arrayDeque.peekLast()).m50815() == EnumC6749.FORCED_NEWLINE) {
                        arrayDeque.removeLast();
                    }
                    if (!arrayDeque.isEmpty()) {
                        C22978 c22978 = (C22978) arrayDeque.peekLast();
                        EnumC6749 enumC6749M50819 = c22978.m50815();
                        EnumC6749 enumC67414 = EnumC6749.LITERAL;
                        if (enumC6749M50819 == enumC67414 && c22978.m50817().endsWith(l.d)) {
                            arrayDeque.removeLast();
                            if (c22978.m50816() > 1) {
                                arrayDeque.addLast(new C22978(enumC67414, c22978.m50817().substring(0, c22978.m50817().length() - 1)));
                                arrayDeque.addLast(new C22978(EnumC6749.FORCED_NEWLINE, null));
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        int i6 = -1;
                        for (C22978 c22979 : arrayDeque) {
                            if (c22979.m50815() == EnumC6749.LITERAL && (iMo27207 = AbstractC14384.m34617().mo27207(0, c22979.m50817())) != -1 && (i6 == -1 || iMo27207 < i6)) {
                                i6 = iMo27207;
                            }
                        }
                        c4797.m52163(new C22978(EnumC6749.FORCED_NEWLINE, "\n"));
                        for (C22978 c229710 : arrayDeque) {
                            EnumC6749 enumC6749M508110 = c229710.m50815();
                            EnumC6749 enumC67415 = EnumC6749.LITERAL;
                            if (enumC6749M508110 == enumC67415) {
                                c4797.m52163(new C22978(enumC67415, (i6 <= 0 || c229710.m50816() <= i6) ? c229710.m50817() : c229710.m50817().substring(i6)));
                            } else {
                                c4797.m52163(c229710);
                            }
                        }
                        if (z) {
                            c4797.m52163(new C22978(EnumC6749.LITERAL, l.d));
                        } else {
                            c4797.m52163(new C22978(EnumC6749.FORCED_NEWLINE, "\n"));
                        }
                    }
                } else {
                    c4797.m52162((List) arrayList);
                    c4797.m52163((C22978) interfaceC23659M38725.next());
                }
            }
        }
        return c4797.m13309();
    }

    public C5338(C4632 c4632) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m14819() {
        return this.f18437.m11398() || this.f18442.m11398() || this.f18441.m11398() || this.f18440;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14816() throws C2515 {
        if (this.f18438.m11398() || this.f18437.m11398() || this.f18442.m11398() || this.f18441.m11398()) {
            throw new C2515();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m14817(String str) {
        return Pattern.compile("^<(?:" + str + ")\\b[^>]*>", 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m14815(String str) {
        return Pattern.compile("^</(?:" + str + ")\\b[^>]*>", 2);
    }
}
