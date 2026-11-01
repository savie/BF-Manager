package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.UMConfigure;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18100 extends C19027 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f57872;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C9733 f57873;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C8614 f57874;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8614 f57875;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f57876;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8614 f57877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9320 f57880;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8614 f57881;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f57879 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f57878 = new ArrayDeque(AbstractC22433.of((Object) Boolean.FALSE));

    public C18100(C9320 c9320, int i) {
        this.f57880 = c9320;
        this.f57876 = i;
        C8614.m22391(-2, i);
        this.f57877 = C8614.m22391(-4, i);
        this.f57875 = C8614.m22391(2, i);
        this.f57881 = C8614.m22391(4, i);
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1856(C0285 c0285, Object obj) {
        m42152(c0285);
        m42132("do");
        m42123(c0285.f1595, EnumC13162.YES, EnumC4694.YES, EnumC13868.YES);
        EnumC12490 enumC12490Mo1801 = c0285.f1595.mo1801();
        EnumC12490 enumC12490 = EnumC12490.BLOCK;
        C9320 c9320 = this.f57880;
        if (enumC12490Mo1801 == enumC12490) {
            c9320.m23966();
        } else {
            c9320.m23964();
        }
        m42132("while");
        c9320.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        m42146((InterfaceC17428) ((InterfaceC8256) c0285.f1596).getExpression());
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1857(C0990 c0990, Object obj) {
        m42152((InterfaceC17428) c0990);
        m42130((AbstractC5930) c0990);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1858(C1011 c1011, Object obj) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1859(C1321 c1321, Object obj) {
        m42152((InterfaceC17428) c1321);
        String strM30934 = C12457.m30934(c1321, m43757());
        if (!strM30934.startsWith("\"\"\"")) {
            if (strM30934.startsWith("-")) {
                m42132("-");
                strM30934 = strM30934.substring(1).trim();
            }
            m42132(strM30934);
            return null;
        }
        String strM39866 = C17080.m39866(strM30934);
        ArrayList arrayListM32993 = C13486.m32993(strM30934);
        String strM32995 = C13486.m32995((String) C9030.stream(arrayListM32993).skip(1L).collect(C1890.joining(strM39866)));
        String str = (String) C22808.m50475(arrayListM32993);
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        int length2 = str.substring(0, length).length();
        String str2 = (String) C4004.m11499(C9030.stream(C13486.m32993(strM32995))).orElseThrow();
        int length3 = str2.length();
        while (length3 > 0) {
            int iCodePointBefore2 = Character.codePointBefore(str2, length3);
            if (!Character.isWhitespace(iCodePointBefore2)) {
                break;
            }
            length3 -= Character.charCount(iCodePointBefore2);
        }
        if (length2 == str2.substring(0, length3).length()) {
            int i = this.f57876;
            C8614 c8614M22391 = C8614.m22391(Integer.MIN_VALUE / i, i);
            C9320 c9320 = this.f57880;
            c9320.getClass();
            c9320.m23953(EnumC0851.UNIFIED, "", c8614M22391);
        }
        m42132(strM30934);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1860(C2026 c2026, Object obj) {
        m42152(c2026);
        m42139((InterfaceC0723) c2026.f7570, (List) c2026.f7568);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1861(C2401 c2401, Object obj) {
        m42152((InterfaceC17428) c2401);
        InterfaceC17428 interfaceC17428 = c2401.f9659;
        boolean z = interfaceC17428 instanceof InterfaceC2610;
        C9320 c9320 = this.f57880;
        if (z) {
            InterfaceC2610 interfaceC2610 = (InterfaceC2610) interfaceC17428;
            m42146((InterfaceC17428) interfaceC2610.getExpression());
            m42132(".");
            C21825 c21825 = c2401.f9658;
            EnumC1166 enumC1166 = EnumC1166.NO;
            m42135(c21825, enumC1166, enumC1166);
            c9320.m23944();
            m42147(interfaceC2610.mo8084());
            return null;
        }
        if (interfaceC17428 instanceof InterfaceC3068) {
            m42130((AbstractC5930) c2401);
            return null;
        }
        C21825 c21826 = c2401.f9658;
        EnumC1166 enumC1167 = EnumC1166.NO;
        m42135(c21826, enumC1167, enumC1167);
        c9320.m23944();
        m42146(interfaceC17428);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1862(C2422 c2422, Object obj) {
        m42152((InterfaceC17428) c2422);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        m42146(c2422.f9707);
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        c9320.m23966();
        m42146((InterfaceC17428) c2422.f9708);
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1863(C2732 c2732, Object obj) {
        m42152(c2732);
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42147(c2732.f10509);
        m42132(":");
        c9320.m23946();
        c9320.m23967();
        m42146(c2732.f10508);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1864(C3107 c3107, Object obj) {
        m42152((InterfaceC17428) c3107);
        m42132(c3107.f11715.toString());
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1865(C3437 c3437, Object obj) {
        m42152(c3437);
        m42132(MessageHandler.Properties.IsSynchronized);
        C9320 c9320 = this.f57880;
        c9320.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        c9320.m23956(this.f57881);
        c9320.m23949();
        m42146((InterfaceC17428) ((InterfaceC8256) c3437.f12663).getExpression());
        c9320.m23967();
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        c9320.m23966();
        m42146(c3437.f12662);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1866(C3812 c3812, Object obj) {
        m42152((InterfaceC17428) c3812);
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c3812.f14145);
        c9320.m23966();
        m42128(C12457.m30933((InterfaceC0723) c3812));
        c9320.m23966();
        m42146((InterfaceC17428) c3812.f14146);
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1867(C3833 c3833, Object obj) {
        m42132("uses");
        this.f57880.m23966();
        m42146((InterfaceC17428) c3833.f14206);
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1868(C4539 c4539, Object obj) {
        m42152(c4539);
        m42132("throw");
        this.f57880.m23966();
        m42146((InterfaceC17428) c4539.f16146);
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1869(C4849 c4849, Object obj) {
        m42152(c4849);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InterfaceC6368 interfaceC6368 = c4849;
        while (true) {
            arrayList.add(interfaceC6368.mo13540());
            arrayList2.add(interfaceC6368.mo13541());
            if (interfaceC6368.mo13542() == null || interfaceC6368.mo13542().mo1801() != EnumC12490.IF) {
                break;
            }
            interfaceC6368 = (InterfaceC6368) interfaceC6368.mo13542();
        }
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < size) {
            if (z) {
                if (z2) {
                    c9320.m23966();
                } else {
                    c9320.m23946();
                }
                m42132("else");
                c9320.m23966();
            }
            m42132("if");
            c9320.m23966();
            m42132(MotionUtils.EASING_TYPE_FORMAT_START);
            m42146((InterfaceC17428) ((InterfaceC8256) ((InterfaceC0723) arrayList.get(i))).getExpression());
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
            z = true;
            m42123((InterfaceC20956) arrayList2.get(i), EnumC13162.m32550(size == 1 && interfaceC6368.mo13542() == null), EnumC4694.YES, EnumC13868.m33707(i < size + (-1) || interfaceC6368.mo13542() != null));
            z2 = ((InterfaceC20956) arrayList2.get(i)).mo1801() == EnumC12490.BLOCK;
            i++;
        }
        if (interfaceC6368.mo13542() != null) {
            if (z2) {
                c9320.m23966();
            } else {
                c9320.m23946();
            }
            m42132("else");
            m42123(interfaceC6368.mo13542(), EnumC13162.NO, EnumC4694.YES, EnumC13868.NO);
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1870(C5224 c5224, Object obj) {
        m42152((InterfaceC17428) c5224);
        int iM48596 = c5224.f18122.m48596();
        C8614 c8614 = this.f57881;
        C8614 c8615 = f57874;
        C9320 c9320 = this.f57880;
        if (iM48596 == 1) {
            InterfaceC17428 interfaceC17428 = (InterfaceC0723) C22808.m50467((Collection) c5224.f18122);
            if (interfaceC17428.mo1801() != EnumC12490.ASSIGNMENT) {
                boolean z = interfaceC17428.mo1801() == EnumC12490.NEW_ARRAY;
                if (z) {
                    c8614 = c8615;
                }
                c9320.m23956(c8614);
                m42132("@");
                m42146(c5224.f18121);
                m42132(MotionUtils.EASING_TYPE_FORMAT_START);
                if (!z) {
                    c9320.m23949();
                }
                m42146(interfaceC17428);
                c9320.m23967();
                m42132(MotionUtils.EASING_TYPE_FORMAT_END);
                return null;
            }
        }
        c9320.m23956(c8615);
        m42132("@");
        m42146(c5224.f18121);
        if (c5224.f18122.isEmpty()) {
            if (c9320.m23959(0).equals(C11521.of(MotionUtils.EASING_TYPE_FORMAT_START))) {
                m42132(MotionUtils.EASING_TYPE_FORMAT_START);
                m42132(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            c9320.m23967();
            return null;
        }
        c9320.m23956(c8614);
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        c9320.m23949();
        boolean zM50469 = C22808.m50469(c5224.f18122, new C5837());
        boolean z2 = false;
        for (InterfaceC17428 interfaceC17429 : c5224.f18122) {
            if (z2) {
                m42132(",");
                if (zM50469) {
                    c9320.m23946();
                } else {
                    c9320.m23964();
                }
            }
            if (interfaceC17429 instanceof InterfaceC14131) {
                InterfaceC14131 interfaceC14131 = (InterfaceC14131) interfaceC17429;
                boolean z3 = interfaceC14131.getExpression().mo1801() == EnumC12490.NEW_ARRAY;
                m42152(interfaceC14131);
                c9320.m23956(z3 ? c8615 : c8614);
                m42146(interfaceC14131.mo11102());
                c9320.m23966();
                m42132("=");
                if (z3) {
                    c9320.m23966();
                } else {
                    c9320.m23964();
                }
                m42146(interfaceC14131.getExpression());
                c9320.m23967();
            } else {
                m42146(interfaceC17429);
            }
            z2 = true;
        }
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        c9320.m23967();
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1871(C5245 c5245, Object obj) {
        m42152((InterfaceC17428) c5245);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        boolean z = false;
        for (InterfaceC17428 interfaceC17428 : c5245.f18177) {
            if (z) {
                c9320.m23944();
                m42132(a.p);
                c9320.m23966();
            }
            m42146(interfaceC17428);
            z = true;
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1872(C6260 c6260, Object obj) {
        m42132("requires");
        C9320 c9320 = this.f57880;
        c9320.m23966();
        while (true) {
            if (c9320.m23959(0).equals(C11521.of("static"))) {
                m42132("static");
                c9320.m23966();
            } else if (c9320.m23959(0).equals(C11521.of("transitive"))) {
                m42132("transitive");
                c9320.m23966();
            } else {
                m42146((InterfaceC17428) c6260.f21222);
                m42132(l.b);
                return null;
            }
        }
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1873(C6635 c6635, Object obj) {
        m42152((InterfaceC17428) c6635);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c6635.f22412);
        c9320.m23966();
        m42128(C12457.m30933((InterfaceC0723) c6635));
        c9320.m23964();
        m42146((InterfaceC17428) c6635.f22413);
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1874(C6656 c6656, Object obj) {
        m42152(c6656);
        m42136(AbstractC22433.of((Object) c6656), EnumC3988.NONE, m42112((InterfaceC1199) c6656.f22476));
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1875(C6966 c6966, Object obj) {
        C9320 c9320 = this.f57880;
        C8614 c8614 = this.f57881;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c6966.f23408);
        c9320.m23949();
        c9320.m23961("::");
        m42151(c6966.f23411, c8614);
        int[] iArr = C3014.f11273;
        EnumC13901 enumC13901 = c6966.f23414;
        int i = iArr[enumC13901.ordinal()];
        if (i == 1) {
            m42147(c6966.f23413);
        } else if (i == 2) {
            m42132("new");
        } else {
            throw new AssertionError(enumC13901);
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1876(C7341 c7341, Object obj) {
        m42152((InterfaceC17428) c7341);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c7341.f24394);
        if (m42108()) {
            c9320.m23946();
        } else {
            c9320.m23966();
        }
        m42132("?");
        c9320.m23966();
        m42146((InterfaceC17428) c7341.f24393);
        if (m42108()) {
            c9320.m23946();
        } else {
            c9320.m23966();
        }
        m42132(":");
        c9320.m23966();
        m42146((InterfaceC17428) c7341.f24392);
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1878(C8378 c8378, Object obj) {
        m42152((InterfaceC17428) c8378);
        C9320 c9320 = this.f57880;
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        AbstractC5930 abstractC5930 = c8378.f29093;
        if (abstractC5930 != null) {
            m42146((InterfaceC17428) abstractC5930);
            c9320.m23949();
            m42132(".");
        }
        m42132("new");
        c9320.m23966();
        m42151(c8378.f29096, this.f57881);
        C8753 c8753 = c8378.f29098;
        if (c8753 != null) {
            C21783 c21783 = c8753.f30089;
            m42135(m42113(m42131((InterfaceC1199) c21783, (List) c21783.getAnnotations()), EnumC15279.HORIZONTAL, C11521.empty()), EnumC1166.NO, EnumC1166.YES);
        }
        m42146((InterfaceC17428) c8378.f29095);
        m42137((List) c8378.f29099, (AbstractC7202) c8614);
        c9320.m23967();
        C8753 c8754 = c8378.f29098;
        if (c8754 != null) {
            m42138(c8754.f30090, EnumC22334.YES, EnumC21628.YES);
        }
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1879(C8753 c8753, Object obj) {
        AbstractC7202 abstractC7202;
        int i = C3014.f11272[c8753.mo1801().ordinal()];
        C9320 c9320 = this.f57880;
        AbstractC7202 abstractC7203 = this.f57881;
        AbstractC7202 abstractC7204 = f57874;
        if (i == 1) {
            m42152(c8753);
            c9320.m23956(abstractC7204);
            InterfaceC1199 interfaceC1199 = c8753.f30089;
            for (InterfaceC17428 interfaceC17428 : m42113(m42131(interfaceC1199, (List) interfaceC1199.getAnnotations()), EnumC15279.VERTICAL, C11521.empty())) {
                c9320.m23946();
                m42146(interfaceC17428);
                c9320.m23946();
            }
            c9320.m23956(abstractC7204);
            m42132("@");
            m42132("interface");
            c9320.m23964();
            m42147(c8753.f30093);
            c9320.m23967();
            c9320.m23967();
            List list = c8753.f30090;
            if (list == null) {
                c9320.m23956(abstractC7203);
                m42132(l.b);
                c9320.m23967();
            } else {
                m42138(list, EnumC22334.YES, EnumC21628.YES);
            }
            c9320.m23965(l.b);
            return null;
        }
        if (i == 2 || i == 3) {
            m42152(c8753);
            InterfaceC1199 interfaceC11910 = c8753.f30089;
            for (InterfaceC17428 interfaceC17429 : m42113(m42131(interfaceC11910, (List) interfaceC11910.getAnnotations()), EnumC15279.VERTICAL, C11521.empty())) {
                c9320.m23946();
                m42146(interfaceC17429);
                c9320.m23946();
            }
            List list2 = c8753.f30091;
            boolean z = c8753.f30092 != null;
            boolean zIsEmpty = c8753.f30087.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            EnumC12490 enumC12490Mo1801 = c8753.mo1801();
            EnumC12490 enumC12490 = EnumC12490.INTERFACE;
            m42132(enumC12490Mo1801 != enumC12490 ? Name.LABEL : "interface");
            c9320.m23966();
            m42147(c8753.f30093);
            if (!c8753.f30088.isEmpty()) {
                m42132("<");
            }
            c9320.m23956(abstractC7203);
            if (!c8753.f30088.isEmpty()) {
                List list3 = c8753.f30088;
                if (!z && zIsEmpty && zIsEmpty2) {
                    abstractC7203 = abstractC7204;
                }
                m42149(list3, abstractC7203);
            }
            if (z) {
                c9320.m23944();
                m42132("extends");
                c9320.m23966();
                m42146(c8753.f30092);
            }
            m42116(c8753.mo1801() == enumC12490 ? "extends" : "implements", c8753.f30087);
            m42116("permits", list2);
            c9320.m23967();
            List list4 = c8753.f30090;
            if (list4 == null) {
                m42132(l.b);
            } else {
                m42138(list4, EnumC22334.YES, EnumC21628.YES);
            }
            m42150();
            return null;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(c8753.mo1801());
            }
            m42152(c8753);
            InterfaceC1199 interfaceC11911 = c8753.f30089;
            for (InterfaceC17428 interfaceC174210 : m42113(m42131(interfaceC11911, (List) interfaceC11911.getAnnotations()), EnumC15279.VERTICAL, C11521.empty())) {
                c9320.m23946();
                m42146(interfaceC174210);
                c9320.m23946();
            }
            if (c8753.f30092 != null) {
                throw new C5458();
            }
            boolean zIsEmpty3 = c8753.f30087.isEmpty();
            m42132("record");
            c9320.m23966();
            m42147(c8753.f30093);
            if (!c8753.f30088.isEmpty()) {
                m42132("<");
            }
            c9320.m23956(abstractC7203);
            if (!c8753.f30088.isEmpty()) {
                m42149(c8753.f30088, !zIsEmpty3 ? abstractC7203 : abstractC7204);
            }
            AbstractC22433 abstractC22433 = (AbstractC22433) C9030.stream(c8753.f30090).filter(new C17126()).map(new C1533(7)).filter(new C17696(1)).collect(AbstractC22433.m49795());
            m42132(MotionUtils.EASING_TYPE_FORMAT_START);
            abstractC22433.isEmpty();
            m42145(C11521.empty(), abstractC22433);
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
            if (!zIsEmpty3) {
                c9320.m23944();
                if (c8753.f30087.m48596() <= 1) {
                    abstractC7203 = abstractC7204;
                }
                c9320.m23956(abstractC7203);
                m42132("implements");
                c9320.m23966();
                boolean z2 = false;
                for (InterfaceC17428 interfaceC174211 : c8753.f30087) {
                    if (z2) {
                        m42132(",");
                        c9320.m23964();
                    }
                    m42146(interfaceC174211);
                    z2 = true;
                }
                c9320.m23967();
            }
            c9320.m23967();
            C21825 c21825 = c8753.f30090;
            if (c21825 == null) {
                m42132(l.b);
            } else {
                m42138((AbstractC22433) C9030.stream(c21825).filter(new C2185(1)).collect(AbstractC22433.m49795()), EnumC22334.YES, EnumC21628.YES);
            }
            m42150();
            return null;
        }
        m42152(c8753);
        c9320.m23956(abstractC7204);
        InterfaceC1199 interfaceC11912 = c8753.f30089;
        for (InterfaceC17428 interfaceC174212 : m42113(m42131(interfaceC11912, (List) interfaceC11912.getAnnotations()), EnumC15279.VERTICAL, C11521.empty())) {
            c9320.m23946();
            m42146(interfaceC174212);
            c9320.m23946();
        }
        c9320.m23956(abstractC7203);
        m42132("enum");
        c9320.m23966();
        m42147(c8753.f30093);
        c9320.m23967();
        c9320.m23967();
        if (!c8753.f30087.isEmpty()) {
            c9320.m23956(abstractC7203);
            c9320.m23964();
            c9320.m23956(abstractC7203);
            m42132("implements");
            c9320.m23964();
            c9320.m23956(abstractC7204);
            boolean z3 = false;
            for (InterfaceC17428 interfaceC174213 : c8753.f30087) {
                if (z3) {
                    m42132(",");
                    c9320.m23944();
                }
                m42146(interfaceC174213);
                z3 = true;
            }
            c9320.m23967();
            c9320.m23967();
            c9320.m23967();
        }
        c9320.m23966();
        AbstractC7202 abstractC7205 = this.f57875;
        m42144(abstractC7205);
        ArrayList<InterfaceC4915> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC17428 interfaceC174214 : c8753.f30090) {
            if (interfaceC174214 instanceof C6656) {
                C6656 c6656 = (C6656) interfaceC174214;
                abstractC7202 = abstractC7205;
                if ((c6656.f22476.f70567 & 16384) == 16384) {
                    arrayList.add(c6656);
                }
                abstractC7205 = abstractC7202;
            } else {
                abstractC7202 = abstractC7205;
            }
            arrayList2.add(interfaceC174214);
            abstractC7205 = abstractC7202;
        }
        AbstractC7202 abstractC7206 = abstractC7205;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            c9320.m23956(abstractC7206);
            c9320.m23954(AbstractC1557.f6287);
            c9320.m23946();
            c9320.m23956(abstractC7204);
            boolean z4 = false;
            for (InterfaceC4915 interfaceC4915 : arrayList) {
                if (z4) {
                    m42132(",");
                    c9320.m23946();
                    c9320.m23954(AbstractC1557.f6289);
                }
                m42148();
                Iterator it = interfaceC4915.mo13674().f70566.iterator();
                while (it.hasNext()) {
                    m42146((InterfaceC17428) it.next());
                    c9320.m23946();
                }
                m42147(interfaceC4915.getName());
                InterfaceC23073 interfaceC23073 = (InterfaceC23073) interfaceC4915.mo13673();
                if (interfaceC23073.mo22007().isEmpty()) {
                    c9320.m23965(MotionUtils.EASING_TYPE_FORMAT_START);
                    c9320.m23965(MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    m42137(interfaceC23073.mo22007(), abstractC7203);
                }
                if (interfaceC23073.mo22006() != null) {
                    m42138(interfaceC23073.mo22006().f30090, EnumC22334.YES, EnumC21628.YES);
                }
                z4 = true;
            }
            if (((String) c9320.m23959(0).orElse("")).equals(",")) {
                m42132(",");
                c9320.m23946();
            }
            c9320.m23967();
            c9320.m23967();
            if (c9320.m23959(0).equals(C11521.of(l.b))) {
                c9320.m23956(abstractC7206);
                m42132(l.b);
                c9320.m23946();
                m42150();
                c9320.m23967();
            }
            c9320.m23956(abstractC7204);
            m42138(arrayList2, EnumC22334.NO, EnumC21628.NO);
            c9320.m23946();
            c9320.m23954(AbstractC1557.f6287);
            m42133(l.d, abstractC7206);
            c9320.m23967();
        } else if (c9320.m23959(0).equals(C11521.of(l.b))) {
            c9320.m23956(abstractC7206);
            c9320.m23946();
            m42132(l.b);
            c9320.m23946();
            m42150();
            c9320.m23967();
            c9320.m23956(abstractC7204);
            c9320.m23946();
            c9320.m23954(AbstractC1557.f6287);
            m42133(l.d, abstractC7206);
            c9320.m23967();
        } else {
            c9320.m23956(abstractC7204);
            c9320.m23954(AbstractC1557.f6287);
            m42132(l.d);
            c9320.m23967();
        }
        c9320.m23965(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1881(C9789 c9789, Object obj) {
        m42152((InterfaceC17428) c9789);
        m42139((InterfaceC0723) c9789.f33504, (List) c9789.f33505);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1882(C10164 c10164, Object obj) {
        boolean z;
        C21825<InterfaceC1657> c21825M48588;
        AbstractC5930 abstractC5930M25898 = c10164.m25898();
        C9320 c9320 = this.f57880;
        if (abstractC5930M25898 != null) {
            m42148();
            AbstractC5930 abstractC5930M25899 = c10164.m25898();
            C7672 c7672M25894 = c10164.m25894();
            if (c7672M25894 == null) {
                c21825M48588 = C21825.m48588();
            } else {
                c21825M48588 = c7672M25894.f25386;
            }
            if (!c21825M48588.isEmpty()) {
                for (InterfaceC1657 interfaceC1657 : c21825M48588) {
                    c9320.m23946();
                    m42146((InterfaceC17428) interfaceC1657);
                }
                c9320.m23946();
            }
            c9320.m23956(this.f57881);
            m42132("package");
            c9320.m23966();
            m42127(abstractC5930M25899);
            c9320.m23967();
            m42132(l.b);
            c9320.m23946();
            z = true;
        } else {
            z = false;
        }
        m42150();
        if (!c10164.m25896().isEmpty()) {
            if (z) {
                c9320.m23954(AbstractC1557.f6288);
            }
            for (InterfaceC11308 interfaceC11308 : c10164.m25896()) {
                m42148();
                c9320.m23954(AbstractC1557.f6289);
                m42146(interfaceC11308);
                c9320.m23946();
            }
            z = true;
        }
        m42150();
        for (InterfaceC17428 interfaceC17428 : c10164.m25895()) {
            if (interfaceC17428.mo1801() != EnumC12490.IMPORT) {
                if (z) {
                    c9320.m23954(AbstractC1557.f6288);
                }
                m42148();
                m42146(interfaceC17428);
                c9320.m23946();
                m42150();
                z = true;
            }
        }
        C18255 c18255M25899 = c10164.m25899();
        if (c18255M25899 != null) {
            if (z) {
                c9320.m23954(AbstractC1557.f6288);
            }
            m42148();
            m42141((InterfaceC4021) c18255M25899);
            c9320.m23946();
        }
        m42148();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1883(C10870 c10870, Object obj) {
        m42152(c10870);
        m42146((InterfaceC17428) c10870.f36960);
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1884(C11200 c11200, Object obj) {
        m42152(c11200);
        m42132("return");
        if (c11200.f37914 != null) {
            this.f57880.m23966();
            m42146((InterfaceC17428) c11200.f37914);
        }
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1885(C11596 c11596, Object obj) {
        m42152((InterfaceC17428) c11596);
        if (c11596.f38962.isEmpty()) {
            m42146((InterfaceC17428) c11596.f38963);
            m42132("<");
            m42132(">");
            return null;
        }
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c11596.f38963);
        m42132("<");
        c9320.m23949();
        c9320.m23956(f57874);
        boolean z = false;
        for (InterfaceC17428 interfaceC17428 : c11596.f38962) {
            if (z) {
                m42132(",");
                c9320.m23964();
            }
            m42146(interfaceC17428);
            z = true;
        }
        c9320.m23967();
        c9320.m23967();
        m42132(">");
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1886(C11906 c11906, Object obj) {
        m42152((InterfaceC17428) c11906);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c11906.f39945);
        c9320.m23964();
        c9320.m23956(f57874);
        m42132("instanceof");
        c9320.m23964();
        if (c11906.m29699() != null) {
            m42146(c11906.m29699());
        } else {
            m42146(c11906.getType());
        }
        c9320.m23967();
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1888(C12611 c12611, Object obj) {
        m42152((InterfaceC17428) c12611);
        int[] iArr = C3014.f11270;
        EnumC6617 enumC6617 = c12611.f42127;
        switch (iArr[enumC6617.m17952().ordinal()]) {
            case 1:
                m42132(ClassTransform.BOOLEAN);
                return null;
            case 2:
                m42132(ClassTransform.BYTE);
                return null;
            case 3:
                m42132(ClassTransform.SHORT);
                return null;
            case 4:
                m42132(ClassTransform.INTEGER);
                return null;
            case 5:
                m42132(ClassTransform.LONG);
                return null;
            case 6:
                m42132(ClassTransform.CHARACTER);
                return null;
            case 7:
                m42132(ClassTransform.FLOAT);
                return null;
            case 8:
                m42132(ClassTransform.DOUBLE);
                return null;
            case 9:
                m42132(ClassTransform.VOID);
                return null;
            default:
                throw new AssertionError(enumC6617.m17952());
        }
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1889(C12986 c12986, Object obj) {
        m42152(c12986);
        C9320 c9320 = this.f57880;
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        m42132("assert");
        c9320.m23966();
        if (c12986.f43313 != null) {
            c8614 = this.f57881;
        }
        c9320.m23956(c8614);
        m42146((InterfaceC17428) c12986.f43312);
        if (c12986.f43313 != null) {
            c9320.m23964();
            m42132(":");
            c9320.m23966();
            m42146((InterfaceC17428) c12986.f43313);
        }
        c9320.m23967();
        c9320.m23967();
        m42132(l.b);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1890(C13007 c13007, Object obj) {
        EnumC18651 enumC18651Mo1803;
        m42152((InterfaceC17428) c13007);
        String strM30933 = C12457.m30933((InterfaceC0723) c13007);
        if (c13007.mo1803().m43137()) {
            m42146((InterfaceC17428) c13007.f43378);
            m42128(strM30933);
            return null;
        }
        m42128(strM30933);
        int i = C3014.f11272[c13007.mo1801().ordinal()];
        if (i == 6 || i == 7) {
            AbstractC5930 abstractC5930 = c13007.f43378;
            if (abstractC5930 instanceof InterfaceC1905) {
                enumC18651Mo1803 = abstractC5930.mo1803();
            } else if (abstractC5930 instanceof InterfaceC4727) {
                if (C12457.m30934((InterfaceC4727) abstractC5930, m43757()).startsWith("-")) {
                    enumC18651Mo1803 = EnumC18651.f60485;
                } else {
                    enumC18651Mo1803 = null;
                }
            } else {
                enumC18651Mo1803 = null;
            }
            if (enumC18651Mo1803 != null && !enumC18651Mo1803.m43137() && C12457.m30933((InterfaceC0723) c13007).startsWith(strM30933)) {
                this.f57880.m23966();
            }
        }
        m42146((InterfaceC17428) c13007.f43378);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1891(C13713 c13713, Object obj) {
        C8614 c8614;
        C8614 c8615;
        String str;
        C8614 c8616;
        C13713 c13714 = c13713;
        m42152(c13713);
        C9320 c9320 = this.f57880;
        C8614 c8617 = f57874;
        c9320.m23956(c8617);
        m42132("try");
        c9320.m23966();
        boolean zIsEmpty = c13714.f45222.isEmpty();
        C8614 c8618 = this.f57881;
        String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
        if (zIsEmpty) {
            c8614 = c8618;
            c8615 = c8617;
            str = MotionUtils.EASING_TYPE_FORMAT_START;
        } else {
            m42132(MotionUtils.EASING_TYPE_FORMAT_START);
            c9320.m23956(c13714.f45222.m48596() > 1 ? c8618 : c8617);
            boolean z = false;
            for (InterfaceC17428 interfaceC17428 : c13714.f45222) {
                if (z) {
                    c9320.m23946();
                }
                if (interfaceC17428 instanceof InterfaceC4915) {
                    InterfaceC4915 interfaceC4915 = (InterfaceC4915) interfaceC17428;
                    m42140(EnumC3988.PARAMETER, m42112((InterfaceC1199) interfaceC4915.mo13674()), C11521.of(interfaceC4915.mo13674()), interfaceC4915.getType(), interfaceC4915.getName(), "=", C11521.ofNullable(interfaceC4915.mo13673()), C11521.empty(), C11521.empty(), C11521.empty());
                } else {
                    m42146(interfaceC17428);
                }
                if (c9320.m23959(0).equals(C11521.of(r8))) {
                    m42132(l.b);
                    c9320.m23966();
                }
                z = true;
                str2 = str2;
                c8617 = c8617;
                c8618 = c8618;
            }
            c8614 = c8618;
            c8615 = c8617;
            str = str2;
            if (c9320.m23959(0).equals(C11521.of(l.b))) {
                m42132(l.b);
                c9320.m23966();
            }
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
            c9320.m23967();
            c9320.m23966();
        }
        boolean z2 = (c13714.f45221.isEmpty() && c13714.f45218 == null) ? false : true;
        m42142(c13714.f45220, EnumC13162.m32550(!z2), EnumC4694.YES, EnumC13868.m33707(z2));
        int i = 0;
        while (i < c13714.f45221.m48596()) {
            InterfaceC7074 interfaceC7074 = (InterfaceC7074) c13714.f45221.get(i);
            EnumC13868 enumC13868M33707 = EnumC13868.m33707(i < c13714.f45221.m48596() + (-1) || c13714.f45218 != null);
            m42152(interfaceC7074);
            c9320.m23966();
            m42132("catch");
            c9320.m23966();
            m42132(str);
            C8614 c8619 = c8614;
            c9320.m23956(c8619);
            C6656 c6656Mo18945 = interfaceC7074.mo18945();
            if (c6656Mo18945.f22477.mo1801() == EnumC12490.UNION_TYPE) {
                C8614 c86110 = c8615;
                c9320.m23956(c86110);
                InterfaceC9668 interfaceC9668 = (InterfaceC9668) c6656Mo18945.f22477;
                c9320.m23956(c86110);
                m42152(c6656Mo18945);
                InterfaceC1199 interfaceC1199 = c6656Mo18945.f22476;
                m42135(m42113(m42131(interfaceC1199, (List) interfaceC1199.getAnnotations()), EnumC15279.HORIZONTAL, C11521.empty()), EnumC1166.NO, EnumC1166.YES);
                C21825 c21825Mo3837 = interfaceC9668.mo3837();
                boolean z3 = false;
                for (int i2 = 0; i2 < c21825Mo3837.m48596() - 1; i2++) {
                    if (z3) {
                        c9320.m23964();
                        m42132("|");
                        c9320.m23966();
                    } else {
                        z3 = true;
                    }
                    m42146((InterfaceC17428) c21825Mo3837.get(i2));
                }
                c9320.m23964();
                m42132("|");
                c9320.m23966();
                c8616 = c86110;
                m42140(EnumC3988.NONE, EnumC15279.HORIZONTAL, C11521.empty(), (InterfaceC17428) c21825Mo3837.get(c21825Mo3837.m48596() - 1), c6656Mo18945.f22478, "=", C11521.ofNullable(c6656Mo18945.f22481), C11521.empty(), C11521.empty(), C11521.empty());
                c9320.m23967();
                c9320.m23967();
            } else {
                c8616 = c8615;
                c9320.m23960();
                c9320.m23956(c8616);
                m42146(c6656Mo18945);
                c9320.m23967();
            }
            c9320.m23967();
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
            c9320.m23966();
            m42142(interfaceC7074.mo18944(), EnumC13162.NO, EnumC4694.YES, enumC13868M33707);
            i++;
            c13714 = c13713;
            c8615 = c8616;
            c8614 = c8619;
            str = str;
        }
        C13713 c13715 = c13714;
        if (c13715.f45218 != null) {
            c9320.m23966();
            m42132("finally");
            c9320.m23966();
            m42142(c13715.f45218, EnumC13162.NO, EnumC4694.YES, EnumC13868.NO);
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1892(C14023 c14023, Object obj) {
        AbstractC11242 abstractC11242Mo8084;
        Cloneable cloneable = c14023.f46089;
        if (cloneable instanceof InterfaceC17657) {
            abstractC11242Mo8084 = ((InterfaceC17657) cloneable).getName();
        } else {
            abstractC11242Mo8084 = ((InterfaceC2610) cloneable).mo8084();
        }
        AbstractC23844 abstractC23844 = f57873.get((Object) abstractC11242Mo8084.toString());
        if (!abstractC23844.isEmpty() && abstractC23844.contains(c14023.f46089.toString())) {
            this.f57879.add(abstractC11242Mo8084);
        }
        m42152(c14023);
        m42132("import");
        C9320 c9320 = this.f57880;
        c9320.m23966();
        if (c14023.f46087) {
            m42132("static");
            c9320.m23966();
        }
        m42127(c14023.f46089);
        m42132(l.b);
        m42150();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1893(C14398 c14398, Object obj) {
        m42152(c14398);
        m42132("for");
        C9320 c9320 = this.f57880;
        c9320.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        C8614 c8614 = this.f57881;
        c9320.m23956(c8614);
        int iM48596 = c14398.f47204.m48596();
        C8614 c8615 = f57874;
        boolean z = true;
        c9320.m23956((iM48596 <= 1 || ((InterfaceC20956) c14398.f47204.get(0)).mo1801() != EnumC12490.EXPRESSION_STATEMENT) ? c8615 : c8614);
        if (c14398.f47204.isEmpty()) {
            m42132(l.b);
        } else if (((InterfaceC20956) c14398.f47204.get(0)).mo1801() == EnumC12490.VARIABLE) {
            InterfaceC23659 interfaceC23659M38722 = C16458.m38722(c14398.f47204.iterator());
            m42136(m42109(interfaceC23659M38722, (InterfaceC17428) interfaceC23659M38722.next()), EnumC3988.NONE, EnumC15279.HORIZONTAL);
        } else {
            c9320.m23956(c8615);
            boolean z2 = false;
            for (InterfaceC20956 interfaceC20956 : c14398.f47204) {
                if (z2) {
                    m42132(",");
                    c9320.m23964();
                }
                m42146((InterfaceC17428) ((InterfaceC20480) interfaceC20956).getExpression());
                z2 = true;
            }
            m42132(l.b);
            c9320.m23967();
        }
        c9320.m23967();
        c9320.m23964();
        AbstractC5930 abstractC5930 = c14398.f47207;
        if (abstractC5930 != null) {
            m42146((InterfaceC17428) abstractC5930);
        }
        m42132(l.b);
        if (c14398.f47205.isEmpty()) {
            c9320.m23966();
        } else {
            c9320.m23964();
            if (c14398.f47205.m48596() <= 1) {
                c8614 = c8615;
            }
            c9320.m23956(c8614);
            for (InterfaceC20480 interfaceC20480 : c14398.f47205) {
                if (!z) {
                    m42132(",");
                    c9320.m23944();
                }
                m42146((InterfaceC17428) interfaceC20480.getExpression());
                z = false;
            }
            c9320.m23965(l.b);
            c9320.m23967();
        }
        c9320.m23967();
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        m42123(c14398.f47206, EnumC13162.YES, EnumC4694.YES, EnumC13868.NO);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1894(C15103 c15103, Object obj) {
        m42152(c15103);
        C6656 c6656 = c15103.f49323;
        m42140(EnumC3988.PARAMETER, EnumC15279.HORIZONTAL, C11521.of(c6656.f22476), c6656.f22477, c6656.f22478, "", C11521.empty(), C11521.empty(), C11521.empty(), C11521.empty());
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1895(C15124 c15124, Object obj) {
        m42152((InterfaceC17428) c15124);
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42132("?");
        if (c15124.f49398 != null) {
            c9320.m23956(this.f57881);
            c9320.m23966();
            m42132(c15124.mo1801() == EnumC12490.EXTENDS_WILDCARD ? "extends" : "super");
            c9320.m23964();
            m42146(c15124.f49398);
            c9320.m23967();
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1896(C15434 c15434, Object obj) {
        m42152((InterfaceC17428) c15434);
        if (((AbstractC11242) C12457.m30935((InterfaceC5433) c15434)).mo28213("log")) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Object expression = c15434;
            while (expression instanceof InterfaceC5433) {
                InterfaceC5433 interfaceC5433 = (InterfaceC5433) expression;
                arrayDeque.addFirst(interfaceC5433);
                if (f57872.contains(C12457.m30935(interfaceC5433).toString())) {
                    Cloneable cloneableMo15014 = interfaceC5433.mo15014();
                    expression = cloneableMo15014 instanceof InterfaceC2610 ? ((InterfaceC2610) cloneableMo15014).getExpression() : null;
                }
            }
            if (expression instanceof InterfaceC17657) {
                arrayDeque.addFirst(expression);
                m42119((List) AbstractC22433.copyOf((Collection) arrayDeque), false, (AbstractCollection) AbstractC22433.of((Object) Integer.valueOf(arrayDeque.size() - 1)), EnumC0851.INDEPENDENT);
                return null;
            }
        }
        m42143((AbstractC5930) c15434);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1899(C16514 c16514, Object obj) {
        m42152(c16514);
        C9320 c9320 = this.f57880;
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        m42132("for");
        c9320.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        c9320.m23956(c8614);
        m42122(EnumC3988.NONE, EnumC15279.HORIZONTAL, c16514.f53042, C11521.of(c16514.f53044), ":", C11521.empty());
        c9320.m23967();
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        c9320.m23967();
        m42123(c16514.f53043, EnumC13162.YES, EnumC4694.YES, EnumC13868.NO);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1900(C17219 c17219, Object obj) {
        m42115("exports", "to", c17219.f54878, c17219.f54880);
        return null;
    }

    @Override // l.C19027, l.C8444
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo22105(InterfaceC17428 interfaceC17428, Object obj) {
        m42146(interfaceC17428);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1901(C17549 c17549, Object obj) {
        m42115("provides", "with", c17549.f55774, c17549.f55773);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1902(C17924 c17924, Object obj) {
        m42152(c17924);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42132("break");
        AbstractC11242 abstractC11242 = c17924.f56926;
        if (abstractC11242 != null) {
            c9320.m23966();
            m42147(abstractC11242);
        }
        c9320.m23967();
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1903(C18255 c18255, Object obj) {
        m42141((InterfaceC4021) c18255);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1904(C18630 c18630, Object obj) {
        EnumC13425 enumC13425 = c18630.f60402;
        InterfaceC17428 interfaceC17428 = c18630.f60401;
        m42152(c18630);
        m42148();
        C9320 c9320 = this.f57880;
        c9320.m23946();
        C21825<InterfaceC17428> c21825 = c18630.f60400;
        boolean z = false;
        boolean z2 = c21825.m48596() == 1 && ((InterfaceC1429) C22808.m50467((Collection) c21825)).mo1801().name().equals("DEFAULT_CASE_LABEL");
        boolean zEquals = enumC13425.equals(EnumC13425.RULE);
        C8614 c8614 = f57874;
        c9320.m23956(zEquals ? this.f57881 : c8614);
        if (z2) {
            m42133("default", c8614);
        } else {
            m42133("case", c8614);
            c9320.m23956(c8614);
            c9320.m23966();
            for (InterfaceC17428 interfaceC17429 : c21825) {
                if (z) {
                    m42132(",");
                    c9320.m23964();
                }
                m42146(interfaceC17429);
                z = true;
            }
            c9320.m23967();
        }
        int i = C3014.f11271[enumC13425.ordinal()];
        if (i == 1) {
            m42132(":");
            c9320.m23956(this.f57875);
            m42134(c18630.m43084());
            c9320.m23967();
            c9320.m23967();
            return null;
        }
        if (i != 2) {
            return null;
        }
        c9320.m23966();
        m42132("-");
        m42132(">");
        if (interfaceC17428.mo1801() == EnumC12490.BLOCK) {
            c9320.m23967();
            c9320.m23966();
            m42142((InterfaceC5663) interfaceC17428, EnumC13162.YES, EnumC4694.NO, EnumC13868.NO);
        } else {
            c9320.m23964();
            m42146(interfaceC17428);
            c9320.m23967();
        }
        c9320.m23965(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1905(C18961 c18961, Object obj) {
        AbstractC5930 abstractC5930 = c18961.f61402;
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        if (abstractC5930 != null) {
            c9320.m23956(c8614);
            m42132("new");
            c9320.m23966();
            C6542 c6542M50426 = C22771.m50426(c18961.f61402, EnumC3719.YES);
            InterfaceC17428 interfaceC17428 = c6542M50426.f22026;
            ArrayDeque arrayDeque = new ArrayDeque(c18961.f61398);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(AbstractC22433.copyOf((Collection) c18961.f61400));
            arrayDeque2.addAll(c18961.f61401);
            arrayDeque2.addAll(c6542M50426.f22025);
            m42146(interfaceC17428);
            c9320.m23956(f57874);
            m42118(arrayDeque, (Deque) arrayDeque2);
            c9320.m23967();
            c9320.m23967();
        }
        C21825 c21825 = c18961.f61399;
        if (c21825 != null) {
            if (c21825.isEmpty()) {
                AbstractC7202 abstractC7202 = this.f57875;
                m42144(abstractC7202);
                if (c9320.m23959(0).equals(C11521.of(","))) {
                    m42132(",");
                }
                m42133(l.d, abstractC7202);
                return null;
            }
            c9320.m23956(c8614);
            m42132("{");
            int iM48596 = c21825.m48596();
            boolean z = true;
            for (int i = 0; i < iM48596; i++) {
                InterfaceC17428 interfaceC17429 = (InterfaceC0723) c21825.get(i);
                if (m42108()) {
                    c9320.m23946();
                    z = false;
                }
                m42146(interfaceC17429);
                if (((String) c9320.m23959(0).orElseThrow()).equals(",")) {
                    if (m42108()) {
                        c9320.m23946();
                        z = false;
                    }
                    m42132(",");
                    if (i != iM48596 - 1) {
                        c9320.m23966();
                    }
                }
            }
            c9320.m23967();
            if (!((z && m42108()) ? false : z)) {
                c9320.m23946();
            }
            m42132(l.d);
        }
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1906(C19336 c19336, Object obj) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1907(C19667 c19667, Object obj) {
        m42115("opens", "to", c19667.f63121, c19667.f63123);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1908(C20747 c20747, Object obj) {
        m42152(c20747);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42132("continue");
        AbstractC11242 abstractC11242 = c20747.f67504;
        if (abstractC11242 != null) {
            c9320.m23966();
            m42147(abstractC11242);
        }
        m42132(l.b);
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1909(C21077 c21077, Object obj) {
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        m42146((InterfaceC17428) c21077.f68656);
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1910(C21452 c21452, Object obj) {
        m42142((InterfaceC5663) c21452, EnumC13162.NO, EnumC4694.NO, EnumC13868.NO);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1911(C21473 c21473, Object obj) {
        m42152(c21473);
        m42132("yield");
        this.f57880.m23966();
        m42146((InterfaceC17428) c21473.f69790);
        m42132(l.b);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1912(C21783 c21783, Object obj) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1913(C22158 c22158, Object obj) {
        m42152((InterfaceC17428) c22158);
        m42143((AbstractC5930) c22158);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1914(C22179 c22179, Object obj) {
        m42152(c22179);
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42135(c22179.f72546, EnumC1166.NO, EnumC1166.YES);
        m42147(c22179.f72545);
        if (!c22179.f72547.isEmpty()) {
            c9320.m23966();
            m42132("extends");
            C8614 c8615 = this.f57881;
            c9320.m23956(c8615);
            c9320.m23964();
            c9320.m23956(c8615);
            boolean z = false;
            for (InterfaceC17428 interfaceC17428 : c22179.f72547) {
                if (z) {
                    c9320.m23944();
                    m42132(a.p);
                    c9320.m23966();
                }
                m42146(interfaceC17428);
                z = true;
            }
            c9320.m23967();
            c9320.m23967();
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1915(C22489 c22489, Object obj) {
        m42152((InterfaceC17428) c22489);
        c22489.m49993();
        EnumC9897 enumC9897 = EnumC9897.EXPRESSION;
        C9320 c9320 = this.f57880;
        boolean zEquals = c9320.m23959(0).equals(C11521.of(MotionUtils.EASING_TYPE_FORMAT_START));
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        if (zEquals) {
            m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        boolean z = false;
        for (InterfaceC4915 interfaceC4915 : c22489.f73410) {
            if (z) {
                m42132(",");
                c9320.m23966();
            }
            m42136(AbstractC22433.of((Object) interfaceC4915), EnumC3988.NONE, m42112((InterfaceC1199) interfaceC4915.mo13674()));
            z = true;
        }
        if (zEquals) {
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c9320.m23967();
        c9320.m23966();
        c9320.m23961("->");
        if (m42124(c9320.m23963(-1), c9320.m23963(0))) {
            c9320.m23956(this.f57881);
            c9320.m23946();
        } else {
            c9320.m23956(c8614);
            c9320.m23966();
        }
        if (c22489.f73408.mo1801() == EnumC12490.BLOCK) {
            m42142((InterfaceC5663) c22489.f73408, EnumC13162.YES, EnumC4694.NO, EnumC13868.NO);
        } else {
            m42146(c22489.f73408);
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1916(C22864 c22864, Object obj) {
        m42152((InterfaceC17428) c22864);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m42114(C3128.m9436(c22864.mo1803()), c22864, arrayList, arrayList2);
        EnumC0851 enumC0851 = EnumC0851.UNIFIED;
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        int i = 0;
        m42146((InterfaceC17428) arrayList.get(0));
        int size = arrayList2.size();
        while (i < size) {
            if (m42108()) {
                c9320.m23946();
            } else {
                c9320.m23966();
            }
            c9320.m23961((String) arrayList2.get(i));
            if (m42108()) {
                c9320.m23946();
            } else {
                c9320.m23966();
            }
            i++;
            m42146((InterfaceC17428) arrayList.get(i));
        }
        c9320.m23967();
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1917(C22885 c22885, Object obj) {
        m42152(c22885);
        m42132("while");
        this.f57880.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        m42146((InterfaceC17428) ((InterfaceC8256) c22885.f74426).getExpression());
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        m42123(c22885.f74425, EnumC13162.YES, EnumC4694.YES, EnumC13868.NO);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [l.ᩳܰ᩸] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1918(C23195 c23195, Object obj) {
        InterfaceC17428 interfaceC17428;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        AbstractC5930 abstractC5930 = c23195.f75265;
        m42152(c23195);
        ?? SubList = c23195.f75267.f70566;
        List listOf = AbstractC22433.of();
        boolean z3 = false;
        boolean z4 = (c23195.f75267.f70567 & 2251799813685248L) == 2251799813685248L;
        if (!c23195.f75269.isEmpty() && !SubList.isEmpty()) {
            int iM30932 = C12457.m30932((InterfaceC17428) c23195.f75269.get(0));
            for (int i = 0; i < SubList.m48596(); i++) {
                if (C12457.m30932((InterfaceC17428) SubList.get(i)) > iM30932) {
                    listOf = SubList.subList(i, SubList.m48596());
                    SubList = SubList.subList(0, i);
                    break;
                }
            }
        }
        AbstractC22433<InterfaceC1657> abstractC22433M42113 = m42113(m42131(c23195.f75267, SubList), EnumC15279.VERTICAL, C11521.empty());
        if (c23195.f75269.isEmpty() && c23195.f75266 != null) {
            listOf = abstractC22433M42113;
            abstractC22433M42113 = AbstractC22433.of();
        }
        AbstractC5930 abstractC5931 = c23195.f75266;
        C9320 c9320 = this.f57880;
        if (abstractC5931 != null) {
            C6542 c6542M50426 = C22771.m50426(abstractC5931, EnumC3719.YES);
            interfaceC17428 = c6542M50426.f22026;
            arrayDeque = new ArrayDeque(c6542M50426.f22025);
        } else {
            for (InterfaceC1657 interfaceC1657 : abstractC22433M42113) {
                c9320.m23946();
                m42146(interfaceC1657);
                c9320.m23946();
            }
            abstractC22433M42113 = AbstractC22433.of();
            interfaceC17428 = null;
            arrayDeque = null;
        }
        C8614 c8614 = this.f57881;
        c9320.m23956(c8614);
        C2968 c2968 = new C2968();
        C2968 c2969 = new C2968();
        C8614 c8615 = f57874;
        c9320.m23956(c8615);
        if (abstractC22433M42113.isEmpty()) {
            z = false;
        } else {
            EnumC1166 enumC1166 = EnumC1166.NO;
            m42135(abstractC22433M42113, enumC1166, enumC1166);
            z = true;
        }
        if (!c23195.f75269.isEmpty()) {
            if (z) {
                c9320.m23944();
            }
            m42132("<");
            m42149(c23195.f75269, c8614);
            z = true;
        }
        if (interfaceC17428 != null) {
            if (z) {
                c9320.m23966();
            } else {
                z = true;
            }
            c9320.m23956(C10025.m25303(c2969, c8614, c8615));
            c9320.m23956(c8615);
            if (!listOf.isEmpty()) {
                EnumC1166 enumC1167 = EnumC1166.NO;
                m42135(listOf, enumC1167, enumC1167);
                c9320.m23966();
            }
            m42146(interfaceC17428);
            m42126(arrayDeque);
            c9320.m23967();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            c9320.m23966();
        }
        if (!z2) {
            c9320.m23956(c8615);
        }
        String string = c23195.f75272.toString();
        if (string.equals("<init>")) {
            string = (String) c9320.m23959(0).get();
        }
        m42132(string);
        if (!z4) {
            m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        c9320.m23967();
        c9320.m23967();
        c9320.m23956(C10025.m25303(c2968, c8614, c8615));
        c9320.m23956(C10025.m25303(c2969, c8614, c8615));
        c9320.m23956(c8615);
        if (!z4) {
            if (!c23195.f75270.isEmpty() || c23195.f75262 != null) {
                m42145(C11521.ofNullable(c23195.f75262), c23195.f75270);
            }
            m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (arrayDeque != null) {
            m42126(arrayDeque);
        }
        if (!c23195.f75264.isEmpty()) {
            c9320.m23944();
            c9320.m23956(c8614);
            C21825<InterfaceC0723> c21825 = c23195.f75264;
            m42132("throws");
            c9320.m23944();
            for (InterfaceC0723 interfaceC0723 : c21825) {
                if (z3) {
                    m42132(",");
                    c9320.m23964();
                }
                m42146(interfaceC0723);
                z3 = true;
            }
            c9320.m23967();
        }
        if (abstractC5930 != null) {
            c9320.m23966();
            m42132("default");
            if (abstractC5930.mo1801() == EnumC12490.NEW_ARRAY) {
                c9320.m23956(this.f57877);
                c9320.m23966();
                m42146(abstractC5930);
                c9320.m23967();
            } else {
                c9320.m23956(c8615);
                c9320.m23944();
                m42146(abstractC5930);
                c9320.m23967();
            }
        }
        c9320.m23967();
        c9320.m23967();
        c9320.m23967();
        C21452 c21452 = c23195.f75268;
        C8614 c8616 = this.f57875;
        if (c21452 == null) {
            m42132(l.b);
        } else {
            c9320.m23966();
            c9320.m23951("{", EnumC14964.REAL, c8616, C11521.of(c8616));
        }
        c9320.m23967();
        C21452 c21453 = c23195.f75268;
        if (c21453 != null) {
            if (c21453.f69737.isEmpty()) {
                c9320.m23954(AbstractC1557.f6287);
            } else {
                c9320.m23956(c8616);
                c9320.m23946();
                c9320.m23954(AbstractC1557.f6289);
                m42134(c23195.f75268.f69737);
                c9320.m23967();
                c9320.m23946();
                c9320.m23954(AbstractC1557.f6287);
                m42148();
            }
            m42133(l.d, c8616);
        }
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1919(C23570 c23570, Object obj) {
        m42152((InterfaceC17428) c23570);
        m42143((AbstractC5930) c23570);
        return null;
    }

    @Override // l.C8444, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1920(C23900 c23900, Object obj) {
        m42152(c23900);
        m42150();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C14672 c14672 = new C14672();
        AbstractC16706 abstractC16706ListIterator = AbstractC22433.of((Object) "org.jspecify.annotations.NonNull", (Object) "org.jspecify.annotations.Nullable", (Object) "org.jspecify.annotations.Nullable", (Object) "org.checkerframework.checker.nullness.qual.NonNull", (Object) "org.checkerframework.checker.nullness.qual.Nullable").listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            String str = (String) abstractC16706ListIterator.next();
            c14672.m35204(str.substring(str.lastIndexOf(46) + 1), str);
        }
        f57873 = c14672.m35203();
        f57874 = C8614.f29736;
        f57872 = AbstractC23844.m52568("at", "atConfig", "atDebug", "atFine", "atFiner", "atFinest", "atInfo", "atMostEvery", "atSevere", "atWarning", "every", "log", "logVarargs", "perUnique", "withCause", "withStackTrace");
        Pattern.compile("%|\\{[0-9]\\}");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42118(ArrayDeque arrayDeque, Deque deque) {
        while (true) {
            boolean z = false;
            while (true) {
                C9320 c9320 = this.f57880;
                if (c9320.m23959(0).isPresent()) {
                    String str = (String) c9320.m23959(0).get();
                    str.getClass();
                    switch (str) {
                        case ".":
                            if (((String) c9320.m23959(0).get()).equals(".") && ((String) c9320.m23959(1).get()).equals(".")) {
                                if (z) {
                                    c9320.m23944();
                                } else {
                                    c9320.m23960();
                                }
                                c9320.m23961("...");
                                break;
                            }
                            return;
                        case "@":
                            if (!deque.isEmpty()) {
                                List list = (List) deque.removeFirst();
                                if (!list.isEmpty()) {
                                    c9320.m23944();
                                    EnumC1166 enumC1166 = EnumC1166.NO;
                                    m42135(list, enumC1166, enumC1166);
                                    z = true;
                                }
                                break;
                            } else {
                                return;
                            }
                            break;
                        case "[":
                            if (z) {
                                c9320.m23944();
                            }
                            m42132("[");
                            if (!((String) c9320.m23959(0).get()).equals("]")) {
                                m42146((InterfaceC17428) arrayDeque.removeFirst());
                            }
                            m42132("]");
                            break;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42150() {
        C9320 c9320 = this.f57880;
        if (c9320.m23959(0).equals(C11521.of(l.b))) {
            while (c9320.m23959(0).equals(C11521.of(l.b))) {
                c9320.m23946();
                m42148();
                m42132(l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42125(AbstractC22433 abstractC22433) {
        if (abstractC22433 != null) {
            AbstractC16706 abstractC16706ListIterator = abstractC22433.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                String strMo37426 = ((InterfaceC20608) abstractC16706ListIterator.next()).mo37426();
                for (int i = 0; i < strMo37426.length(); i++) {
                    char cCharAt = strMo37426.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\n') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42148() {
        if (((Boolean) this.f57878.peekLast()).booleanValue()) {
            return;
        }
        this.f57880.m23968();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42146(InterfaceC17428 interfaceC17428) {
        boolean z = interfaceC17428 instanceof InterfaceC0723;
        ArrayDeque arrayDeque = this.f57878;
        arrayDeque.addLast(Boolean.valueOf(z || ((Boolean) arrayDeque.peekLast()).booleanValue()));
        C9320 c9320 = this.f57880;
        int iM23943 = c9320.m23943();
        try {
            try {
                super.mo22105(interfaceC17428, (Object) null);
                arrayDeque.removeLast();
                c9320.m23950(iM23943);
            } catch (Throwable th) {
                arrayDeque.removeLast();
                throw th;
            }
        } catch (C19197 e) {
            throw e;
        } catch (Throwable th2) {
            int i = C13926.f45858;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            throw new C19197(c9320.m23947(stringWriter.toString()));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42130(AbstractC5930 abstractC5930) {
        C6542 c6542M50426 = C22771.m50426(abstractC5930, EnumC3719.YES);
        C8614 c8614 = this.f57881;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        m42146(c6542M50426.f22026);
        ArrayDeque arrayDeque = new ArrayDeque(c6542M50426.f22025);
        m42126(arrayDeque);
        if (!arrayDeque.isEmpty()) {
            throw new C5458();
        }
        c9320.m23967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42136(List list, EnumC3988 enumC3988, EnumC15279 enumC15279) {
        boolean z = false;
        if (list.size() == 1) {
            InterfaceC4915 interfaceC4915 = (InterfaceC4915) list.get(0);
            m42140(enumC3988, enumC15279, C11521.of(interfaceC4915.mo13674()), interfaceC4915.getType(), interfaceC4915.getName(), "=", C11521.ofNullable(interfaceC4915.mo13673()), C11521.of(l.b), C11521.empty(), C11521.ofNullable(m42111(false, 0, interfaceC4915.getType())));
            return;
        }
        C9320 c9320 = this.f57880;
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        C21783 c21783Mo13674 = ((InterfaceC4915) list.get(0)).mo13674();
        InterfaceC17428 type = ((InterfaceC4915) list.get(0)).getType();
        m42135(m42113(m42131((InterfaceC1199) c21783Mo13674, (List) c21783Mo13674.getAnnotations()), enumC15279, C11521.empty()), EnumC1166.NO, EnumC1166.YES);
        C8614 c8615 = this.f57881;
        c9320.m23956(c8615);
        c9320.m23956(c8614);
        C6542 c6542M50426 = C22771.m50426(type, EnumC3719.YES);
        ArrayDeque arrayDeque = new ArrayDeque(c6542M50426.f22025);
        m42146(c6542M50426.f22026);
        int size = arrayDeque.size();
        m42126(arrayDeque);
        int size2 = size - arrayDeque.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4915 interfaceC4916 = (InterfaceC4915) it.next();
            if (z) {
                m42132(",");
            }
            ArrayDeque arrayDeque2 = new ArrayDeque(m42111(z, size2, interfaceC4916.getType()).f22025);
            c9320.m23964();
            c9320.m23956(c8614);
            m42126(arrayDeque2);
            m42147(interfaceC4916.getName());
            m42126(arrayDeque2);
            AbstractC5930 abstractC5930Mo13673 = interfaceC4916.mo13673();
            if (abstractC5930Mo13673 != null) {
                c9320.m23966();
                m42132("=");
                c9320.m23956(c8615);
                c9320.m23964();
                m42146((InterfaceC17428) abstractC5930Mo13673);
                c9320.m23967();
            }
            c9320.m23967();
            if (!z) {
                c9320.m23967();
            }
            z = true;
        }
        c9320.m23967();
        m42132(l.b);
        c9320.m23967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6542 m42111(boolean z, int i, InterfaceC17428 interfaceC17428) {
        if (interfaceC17428 == null) {
            return null;
        }
        if (!z) {
            return C22771.m50426(interfaceC17428, EnumC3719.YES);
        }
        AbstractC22433 abstractC22433SubList = C22771.m50426(interfaceC17428, EnumC3719.NO).f22025;
        if (i > 0) {
            abstractC22433SubList = abstractC22433SubList.subList(0, abstractC22433SubList.size() - i);
        }
        return new C6542(null, abstractC22433SubList);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42128(String str) {
        for (int i = 0; i < str.length(); i++) {
            m42132(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42147(InterfaceC22510 interfaceC22510) {
        m42132(interfaceC22510.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42139(InterfaceC0723 interfaceC0723, List list) {
        m42132("switch");
        C9320 c9320 = this.f57880;
        c9320.m23966();
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        m42146((InterfaceC17428) ((InterfaceC8256) interfaceC0723).getExpression());
        m42132(MotionUtils.EASING_TYPE_FORMAT_END);
        c9320.m23966();
        C8614 c8614 = this.f57875;
        m42144(c8614);
        c9320.m23954(AbstractC1557.f6287);
        c9320.m23956(c8614);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC4251 interfaceC4251 = (InterfaceC4251) it.next();
            if (z) {
                c9320.m23954(AbstractC1557.f6289);
            }
            m42146(interfaceC4251);
            z = true;
        }
        c9320.m23967();
        c9320.m23946();
        c9320.m23954(AbstractC1557.f6287);
        m42133(l.d, this.f57881);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42135(List list, EnumC1166 enumC1166, EnumC1166 enumC1167) {
        if (list.isEmpty()) {
            return;
        }
        boolean zM4301 = enumC1166.m4301();
        C9320 c9320 = this.f57880;
        if (zM4301) {
            c9320.m23944();
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC1657 interfaceC1657 = (InterfaceC1657) it.next();
            if (z) {
                c9320.m23944();
            }
            m42146((InterfaceC17428) interfaceC1657);
            z = true;
        }
        if (enumC1167.m4301()) {
            c9320.m23944();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42142(InterfaceC5663 interfaceC5663, EnumC13162 enumC13162, EnumC4694 enumC4694, EnumC13868 enumC13868) {
        m42152(interfaceC5663);
        boolean zMo15547 = interfaceC5663.mo15547();
        C9320 c9320 = this.f57880;
        if (zMo15547) {
            m42132("static");
            c9320.m23966();
        }
        boolean zM32552 = enumC13162.m32552();
        C8614 c8614 = this.f57875;
        if (zM32552 && interfaceC5663.mo15548().isEmpty()) {
            if (c9320.m23959(0).equals(C11521.of(l.b))) {
                m42132(l.b);
                return;
            }
            m42144(c8614);
            c9320.m23954(AbstractC1557.f6287);
            m42133(l.d, c8614);
            return;
        }
        c9320.m23956(f57874);
        c9320.m23956(c8614);
        m42144(c8614);
        if (enumC4694 == EnumC4694.NO) {
            c9320.m23954(AbstractC1557.f6287);
        } else {
            c9320.m23954(AbstractC1557.f6289);
        }
        m42134(interfaceC5663.mo15548());
        c9320.m23967();
        c9320.m23946();
        c9320.m23967();
        if (enumC13868 == EnumC13868.NO) {
            c9320.m23954(AbstractC1557.f6287);
        } else {
            c9320.m23954(AbstractC1557.f6289);
        }
        m42148();
        m42133(l.d, c8614);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42123(InterfaceC20956 interfaceC20956, EnumC13162 enumC13162, EnumC4694 enumC4694, EnumC13868 enumC13868) {
        m42152(interfaceC20956);
        int i = C3014.f11272[interfaceC20956.mo1801().ordinal()];
        C9320 c9320 = this.f57880;
        if (i == 8) {
            c9320.m23966();
            m42142((InterfaceC5663) interfaceC20956, enumC13162, enumC4694, enumC13868);
            return;
        }
        c9320.m23956(this.f57875);
        if (m42108()) {
            c9320.m23946();
        } else {
            c9320.m23964();
        }
        m42146(interfaceC20956);
        c9320.m23967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42134(List list) {
        EnumC15279 enumC15279;
        InterfaceC23659 interfaceC23659M38722 = C16458.m38722(list.iterator());
        m42150();
        boolean z = false;
        while (interfaceC23659M38722.hasNext()) {
            InterfaceC17428 interfaceC17428 = (InterfaceC20956) interfaceC23659M38722.next();
            C9320 c9320 = this.f57880;
            c9320.m23946();
            if (z) {
                c9320.m23954(AbstractC1557.f6289);
            }
            m42148();
            ArrayList arrayListM42109 = m42109(interfaceC23659M38722, interfaceC17428);
            if (!arrayListM42109.isEmpty()) {
                EnumC3988 enumC3988 = EnumC3988.NONE;
                C21783 c21783Mo13674 = ((InterfaceC4915) arrayListM42109.get(0)).mo13674();
                Iterator it = c21783Mo13674.f70566.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((InterfaceC1657) it.next()).mo5562().isEmpty()) {
                        i++;
                    }
                }
                if (i <= 1 && i == c21783Mo13674.f70566.m48596()) {
                    enumC15279 = EnumC15279.HORIZONTAL;
                } else {
                    enumC15279 = EnumC15279.VERTICAL;
                }
                m42136(arrayListM42109, enumC3988, enumC15279);
            } else {
                m42146(interfaceC17428);
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22433 m42113(AbstractC23040 abstractC23040, EnumC15279 enumC15279, C11521 c11521) {
        AbstractC22433 abstractC22433Of;
        AbstractC22433 abstractC22433Of2;
        if (abstractC23040.mo3588().isEmpty()) {
            return abstractC23040.mo3589();
        }
        ArrayDeque arrayDeque = new ArrayDeque(abstractC23040.mo3588());
        C9320 c9320 = this.f57880;
        C8614 c8614 = f57874;
        c9320.m23956(c8614);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!arrayDeque.isEmpty() && !((AbstractC5400) arrayDeque.peekFirst()).mo14963().equals(EnumC2577.MODIFIER)) {
            if (z2) {
                if (!enumC15279.m36592()) {
                    abstractC22433Of2 = AbstractC22433.of((Object) C22019.m48910(EnumC0851.UNIFIED, " ", c8614, c11521));
                } else {
                    abstractC22433Of2 = AbstractC22433.of((Object) C22019.m48910(EnumC0851.FORCED, "", C8614.f29736, c11521));
                }
                c9320.m23952(abstractC22433Of2);
            }
            m42117(arrayDeque);
            z2 = true;
            z3 = true;
        }
        c9320.m23967();
        if (!enumC15279.m36592()) {
            abstractC22433Of = AbstractC22433.of((Object) C22019.m48910(EnumC0851.UNIFIED, " ", c8614, c11521));
        } else {
            abstractC22433Of = AbstractC22433.of((Object) C22019.m48910(EnumC0851.FORCED, "", C8614.f29736, c11521));
        }
        if (arrayDeque.isEmpty()) {
            c9320.m23952(abstractC22433Of);
            return abstractC23040.mo3589();
        }
        if (z3) {
            c9320.m23952(abstractC22433Of);
        }
        c9320.m23956(c8614);
        while (!arrayDeque.isEmpty()) {
            if (z) {
                c9320.m23966();
            }
            m42117(arrayDeque);
            z = true;
        }
        c9320.m23967();
        c9320.m23966();
        return abstractC23040.mo3589();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0897 m42131(InterfaceC1199 interfaceC1199, List list) {
        boolean zIsEmpty = list.isEmpty();
        int i = 1;
        C9320 c9320 = this.f57880;
        if (zIsEmpty) {
            String str = (String) c9320.m23959(0).get();
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1888027236:
                    if (str.equals("volatile")) {
                        b = 0;
                    }
                    break;
                case -1466596076:
                    if (str.equals(MessageHandler.Properties.IsSynchronized)) {
                        b = 1;
                    }
                    break;
                case -1052618729:
                    if (str.equals(UMConfigure.WRAPER_TYPE_NATIVE)) {
                        b = 2;
                    }
                    break;
                case -977423767:
                    if (str.equals("public")) {
                        b = 3;
                    }
                    break;
                case -906342564:
                    if (str.equals("sealed")) {
                        b = 4;
                    }
                    break;
                case -892481938:
                    if (str.equals("static")) {
                        b = 5;
                    }
                    break;
                case -608539730:
                    if (str.equals("protected")) {
                        b = 6;
                    }
                    break;
                case -314497661:
                    if (str.equals("private")) {
                        b = 7;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    if (str.equals("-")) {
                        b = 8;
                    }
                    break;
                case 109261:
                    if (str.equals("non")) {
                        b = 9;
                    }
                    break;
                case 97436022:
                    if (str.equals("final")) {
                        b = 10;
                    }
                    break;
                case 1052746378:
                    if (str.equals("transient")) {
                        b = 11;
                    }
                    break;
                case 1544803905:
                    if (str.equals("default")) {
                        b = 12;
                    }
                    break;
                case 1732898850:
                    if (str.equals("abstract")) {
                        b = cb.k;
                    }
                    break;
                case 1794694483:
                    if (str.equals("strictfp")) {
                        b = cb.f77931l;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    return new C0897(AbstractC22433.of(), AbstractC22433.of());
            }
        }
        C20234 c20234M45738 = C20234.m45738();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17428 interfaceC17428 = (InterfaceC1657) it.next();
            Integer numValueOf = Integer.valueOf(C12457.m30932(interfaceC17428));
            AbstractC8774 abstractC8774 = (AbstractC8774) interfaceC17428;
            AbstractC6323 abstractC6323 = ((C10164) m43757().m42560()).f34724;
            abstractC8774.getClass();
            c20234M45738.mo26252(C9548.m24401(numValueOf, Integer.valueOf(C3128.m9435(abstractC8774, abstractC6323))));
        }
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) C4004.m11498(C9030.stream(c9320.m23948(C12457.m30932(interfaceC1199), new C10777(c20234M45738))).filter(new C20522(i, c20234M45738)).map(new C23477()), C9030.stream(list).map(new C14305())).sorted().collect(C1890.toList()));
        C4793 c4793 = new C4793();
        for (int size = abstractC22433CopyOf.size() - 1; size >= 0; size--) {
            AbstractC5400 abstractC5400 = (AbstractC5400) abstractC22433CopyOf.get(size);
            if (abstractC5400.mo14963().equals(EnumC2577.ANNOTATION)) {
                Cloneable cloneableMo5561 = abstractC5400.mo7051().mo5561();
                if (!(cloneableMo5561 instanceof InterfaceC17657) ? false : this.f57879.contains(((InterfaceC17657) cloneableMo5561).getName())) {
                    c4793.m52163(abstractC5400.mo7051());
                }
            }
            return new C0897(abstractC22433CopyOf.subList(0, size + 1), c4793.m13309().mo29543());
        }
        return new C0897(abstractC22433CopyOf.subList(0, size + 1), c4793.m13309().mo29543());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42117(ArrayDeque arrayDeque) {
        AbstractC5400 abstractC5400 = (AbstractC5400) arrayDeque.removeFirst();
        int iOrdinal = abstractC5400.mo14963().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            m42146((InterfaceC17428) abstractC5400.mo7051());
        } else {
            m42132(abstractC5400.mo7052().getText());
            if (abstractC5400.mo7052().getText().equals("non")) {
                m42132(((AbstractC5400) arrayDeque.removeFirst()).mo7052().getText());
                m42132(((AbstractC5400) arrayDeque.removeFirst()).mo7052().getText());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42114(int i, InterfaceC0723 interfaceC0723, ArrayList arrayList, ArrayList arrayList2) {
        if (interfaceC0723 instanceof InterfaceC12014) {
            InterfaceC12014 interfaceC12014 = (InterfaceC12014) interfaceC0723;
            if (C3128.m9436(((AbstractC8774) interfaceC12014).mo1803()) == i) {
                m42114(i, interfaceC12014.mo29908(), arrayList, arrayList2);
                arrayList2.add(C12457.m30933(interfaceC0723));
                m42114(i, interfaceC12014.mo29909(), arrayList, arrayList2);
                return;
            }
            arrayList.add(interfaceC0723);
            return;
        }
        arrayList.add(interfaceC0723);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42145(l.C11521 r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18100.m42145(l.ۨۛᩴ, java.util.List):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42141(InterfaceC4021 interfaceC4021) {
        C9320 c9320;
        AbstractC1557 abstractC1557;
        Iterator it = interfaceC4021.getAnnotations().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c9320 = this.f57880;
            if (!zHasNext) {
                break;
            }
            m42146((InterfaceC17428) it.next());
            c9320.m23946();
        }
        if (interfaceC4021.mo11527() == EnumC13195.OPEN) {
            m42132("open");
            c9320.m23966();
        }
        m42132(am.e);
        c9320.m23966();
        m42146((InterfaceC17428) interfaceC4021.getName());
        c9320.m23966();
        boolean zIsEmpty = interfaceC4021.mo11528().isEmpty();
        C8614 c8614 = this.f57875;
        if (zIsEmpty) {
            m42144(c8614);
            c9320.m23954(AbstractC1557.f6287);
            m42133(l.d, c8614);
            return;
        }
        c9320.m23956(c8614);
        m42132("{");
        c9320.m23946();
        C11521 c11521Empty = C11521.empty();
        for (InterfaceC19775 interfaceC19775 : interfaceC4021.mo11528()) {
            m42148();
            if (((Boolean) c11521Empty.map(new C16421(0, interfaceC19775)).orElse(Boolean.FALSE)).booleanValue()) {
                abstractC1557 = AbstractC1557.f6288;
            } else {
                abstractC1557 = AbstractC1557.f6287;
            }
            c9320.m23954(abstractC1557);
            c9320.m23946();
            m42146(interfaceC19775);
            c11521Empty = C11521.of(interfaceC19775.mo1801());
        }
        c9320.m23967();
        c9320.m23946();
        m42132(l.d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42115(String str, String str2, InterfaceC0723 interfaceC0723, List list) {
        m42132(str);
        C9320 c9320 = this.f57880;
        c9320.m23966();
        m42146((InterfaceC17428) interfaceC0723);
        if (list != null) {
            c9320.m23956(this.f57881);
            c9320.m23966();
            m42132(str2);
            c9320.m23946();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC0723 interfaceC0724 = (InterfaceC0723) it.next();
                if (z) {
                    m42132(",");
                    c9320.m23946();
                }
                m42146((InterfaceC17428) interfaceC0724);
                z = true;
            }
            m42132(l.b);
            c9320.m23967();
            return;
        }
        m42132(l.b);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m42127(InterfaceC17428 interfaceC17428) {
        ArrayDeque<InterfaceC22510> arrayDeque = new ArrayDeque();
        while (interfaceC17428 instanceof InterfaceC2610) {
            InterfaceC2610 interfaceC2610 = (InterfaceC2610) interfaceC17428;
            arrayDeque.addFirst(interfaceC2610.mo8084());
            interfaceC17428 = interfaceC2610.getExpression();
        }
        arrayDeque.addFirst(((InterfaceC17657) interfaceC17428).getName());
        boolean z = false;
        for (InterfaceC22510 interfaceC22510 : arrayDeque) {
            if (z) {
                m42132(".");
            }
            m42132(interfaceC22510.toString());
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42122(EnumC3988 enumC3988, EnumC15279 enumC15279, InterfaceC4915 interfaceC4915, C11521 c11521, String str, C11521 c11522) {
        C11521 c11521Empty;
        InterfaceC17428 interfaceC17428;
        m42152(interfaceC4915);
        if (interfaceC4915.getType() != null) {
            C6542 c6542M50426 = C22771.m50426(interfaceC4915.getType(), EnumC3719.YES);
            C11521 c11521Of = C11521.of(c6542M50426);
            interfaceC17428 = c6542M50426.f22026;
            c11521Empty = c11521Of;
        } else {
            c11521Empty = C11521.empty();
            interfaceC17428 = null;
        }
        m42140(enumC3988, enumC15279, C11521.of(interfaceC4915.mo13674()), interfaceC17428, interfaceC4915.getName(), str, c11521, c11522, C11521.empty(), c11521Empty);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42149(List list, AbstractC7202 abstractC7202) {
        C9320 c9320 = this.f57880;
        c9320.m23956(abstractC7202);
        c9320.m23956(f57874);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC14607 interfaceC14607 = (InterfaceC14607) it.next();
            if (z) {
                m42132(",");
                c9320.m23964();
            }
            m42146(interfaceC14607);
            z = true;
        }
        m42132(">");
        c9320.m23967();
        c9320.m23967();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0221  */
    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x026f  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0280  */
    /* JADX WARN: Code duplicated, block: B:127:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x034a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0350  */
    /* JADX WARN: Code duplicated, block: B:171:0x037a  */
    /* JADX WARN: Code duplicated, block: B:175:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[LOOP:0: B:3:0x0009->B:178:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:2: B:34:0x00bd->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42143(AbstractC5930 abstractC5930) {
        InterfaceC0723 interfaceC0723;
        boolean z;
        AbstractC22433 abstractC22433M13309;
        EnumC3283 enumC3283Mo6069;
        C11521 c11521Empty;
        int i;
        int i2;
        int i3;
        int i4;
        List list;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        boolean z5;
        InterfaceC0723 interfaceC0724;
        boolean z6;
        Iterator it2;
        boolean zM42124;
        boolean zM42125;
        boolean z7;
        AbstractC7202 abstractC7202;
        InterfaceC5433 interfaceC5433;
        InterfaceC22510 interfaceC22510M30935;
        String str;
        AbstractC11242 abstractC11242;
        boolean z8;
        AbstractC7202 abstractC7203;
        boolean z9;
        Object obj;
        InterfaceC15670 interfaceC15670M23963;
        Object obj2;
        EnumC0851 enumC0851;
        String string;
        ArrayDeque<InterfaceC0723> arrayDeque = new ArrayDeque();
        InterfaceC0723 expression = abstractC5930;
        while (true) {
            arrayDeque.addFirst(expression);
            if (expression.mo1801() == EnumC12490.ARRAY_ACCESS) {
                expression = m42110(expression);
            }
            interfaceC0723 = null;
            switch (C3014.f11272[expression.mo1801().ordinal()]) {
                case 9:
                    expression = ((InterfaceC2610) expression).getExpression();
                    if (expression == null) {
                        interfaceC0723 = expression;
                    }
                    break;
                case 10:
                    Cloneable cloneableMo15014 = ((InterfaceC5433) expression).mo15014();
                    expression = cloneableMo15014 instanceof InterfaceC2610 ? ((InterfaceC2610) cloneableMo15014).getExpression() : null;
                    if (expression == null) {
                        interfaceC0723 = expression;
                    }
                    break;
                case 11:
                    break;
                default:
                    interfaceC0723 = (InterfaceC0723) arrayDeque.removeFirst();
                    break;
            }
        }
        ArrayList arrayList = new ArrayList(arrayDeque);
        AbstractC7202 abstractC7204 = this.f57881;
        String str2 = ".";
        AbstractC7202 abstractC7205 = f57874;
        C9320 c9320 = this.f57880;
        int i5 = 0;
        if (interfaceC0723 != null) {
            if (interfaceC0723.mo1801() == EnumC12490.NEW_CLASS && ((InterfaceC23073) interfaceC0723).mo22006() != null) {
                c9320.m23956(abstractC7205);
                m42146(m42110(interfaceC0723));
                m42132(".");
                z = false;
            } else {
                m42146(m42110(interfaceC0723));
                c9320.m23956(abstractC7204);
                z = true;
            }
            ArrayDeque arrayDeque2 = new ArrayDeque();
            InterfaceC0723 expression2 = interfaceC0723;
            while (expression2 instanceof InterfaceC9420) {
                InterfaceC9420 interfaceC9420 = (InterfaceC9420) expression2;
                arrayDeque2.addLast(interfaceC9420.getIndex());
                expression2 = interfaceC9420.getExpression();
            }
            m42129(arrayDeque2);
            if (arrayDeque.isEmpty()) {
                c9320.m23967();
                return;
            }
        } else {
            z = false;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i6 = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        for (InterfaceC0723 interfaceC0725 : arrayDeque) {
            boolean z10 = interfaceC0725.mo1801() == EnumC12490.ARRAY_ACCESS;
            InterfaceC0723 interfaceC0723M42110 = m42110(interfaceC0725);
            switch (C3014.f11272[interfaceC0723M42110.mo1801().ordinal()]) {
                case 9:
                    c4793.m52163(((InterfaceC2610) interfaceC0723M42110).mo8084().toString());
                    if (z10) {
                    }
                    break;
                case 10:
                    c4793.m52163(C12457.m30935((InterfaceC5433) interfaceC0723M42110).toString());
                    break;
                case 11:
                    c4793.m52163(((InterfaceC17657) interfaceC0723M42110).getName().toString());
                    if (z10) {
                    }
                    break;
            }
            abstractC22433M13309 = c4793.m13309();
            enumC3283Mo6069 = EnumC3283.f12172;
            c11521Empty = C11521.empty();
            for (i = 0; i < abstractC22433M13309.size() && (enumC3283Mo6069 = enumC3283Mo6069.mo6069(EnumC6106.m16600((String) abstractC22433M13309.get(i)))) != EnumC3283.f12170; i++) {
                if (enumC3283Mo6069.m9776()) {
                    c11521Empty = C11521.of(Integer.valueOf(i));
                }
            }
            c11521Empty.ifPresent(new Consumer() { // from class: l.֫ۙ᩸
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj3) {
                    linkedHashSet.add((Integer) obj3);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
            i3 = 0;
            i4 = -1;
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                if (((InterfaceC0723) arrayList.get(i2)).mo1801() != EnumC12490.METHOD_INVOCATION) {
                    if (i2 <= 0 || interfaceC0723 != null) {
                        i3++;
                    }
                    if (i4 < 0) {
                        i4 = i2;
                    }
                }
            }
            if (i3 == 1 && i4 > 0) {
                linkedHashSet.add(Integer.valueOf(i4));
            }
            if (linkedHashSet.isEmpty() && (arrayList.get(0) instanceof InterfaceC17657)) {
                string = ((InterfaceC17657) arrayList.get(0)).getName().toString();
                if (!string.equals("this") || string.equals("super")) {
                    linkedHashSet.add(1);
                }
            }
            list = (List) C4004.m11497(C9030.stream(arrayList), new C4328(new C12188())).filter(new C9627(1)).collect(C1890.toList());
            C0356.forEach(list, new C2644(1, linkedHashSet));
            if (!linkedHashSet.isEmpty()) {
                if (list.isEmpty()) {
                    enumC0851 = EnumC0851.INDEPENDENT;
                } else {
                    enumC0851 = EnumC0851.UNIFIED;
                }
                m42119(arrayList, z, linkedHashSet, enumC0851);
            } else {
                if (arrayList.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = !z;
                if (arrayList.size() == 1) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                it = arrayList.iterator();
                z5 = false;
                while (it.hasNext()) {
                    interfaceC0724 = (InterfaceC0723) it.next();
                    if (z5) {
                        c9320.m23956(abstractC7204);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        it2 = it;
                        zM42124 = false;
                        zM42125 = false;
                        z7 = false;
                    } else {
                        z9 = z3;
                        it2 = it;
                        obj = interfaceC0724;
                        while (!(obj instanceof C23570)) {
                            if (obj instanceof C15434) {
                                obj2 = ((C15434) obj).f50296;
                            } else if (obj instanceof C22158) {
                                obj2 = ((C22158) obj).f72477;
                            } else {
                                throw new RuntimeException("Unexpected tree type: " + obj);
                            }
                            obj = obj2;
                            i5 = 0;
                        }
                        interfaceC15670M23963 = c9320.m23963(i5);
                        C13638.requireNonNull(interfaceC15670M23963);
                        if (((C15716) interfaceC15670M23963.mo37335()).mo37426().equals(str2)) {
                            throw new AssertionError(interfaceC15670M23963.toString());
                        }
                        InterfaceC15670 interfaceC15670M23964 = c9320.m23963(-1);
                        InterfaceC15670 interfaceC15670M23965 = c9320.m23963(1);
                        zM42125 = m42124(interfaceC15670M23964, interfaceC15670M23963);
                        zM42124 = m42124(interfaceC15670M23963, interfaceC15670M23965);
                        if (!z6 && z4 && (zM42125 || zM42124)) {
                            c9320.m23956(abstractC7204);
                            z6 = true;
                        }
                        if (z4 || z5 || !(zM42125 || zM42124)) {
                            z7 = z9;
                        } else {
                            z7 = z9;
                            z5 = true;
                        }
                    }
                    if (z) {
                        if (zM42125) {
                            c9320.m23946();
                        }
                        m42132(str2);
                        if (zM42124) {
                            c9320.m23946();
                        }
                    }
                    if (z2) {
                        abstractC7202 = abstractC7205;
                    } else {
                        abstractC7202 = this.f57877;
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList.size() >= 2 && interfaceC0724.mo1801() == EnumC12490.METHOD_INVOCATION) {
                        interfaceC5433 = (InterfaceC5433) interfaceC0724;
                        interfaceC22510M30935 = C12457.m30935(interfaceC5433);
                        str = str2;
                        if (interfaceC5433.mo15014() instanceof InterfaceC17657) {
                            abstractC11242 = (AbstractC11242) interfaceC22510M30935;
                            z8 = z4;
                            if (abstractC11242.length() > 4 && interfaceC5433.mo15013().isEmpty() && interfaceC5433.mo15012().m48596() == 1) {
                                c9320.m23956(abstractC7205);
                                c9320.m23956(abstractC7202);
                                m42132(abstractC11242.toString());
                                m42132(MotionUtils.EASING_TYPE_FORMAT_START);
                                m42146((InterfaceC17428) C22808.m50467((Collection) interfaceC5433.mo15012()));
                                c9320.m23967();
                                m42132(MotionUtils.EASING_TYPE_FORMAT_END);
                                c9320.m23967();
                            }
                            if (z6) {
                                c9320.m23967();
                            }
                            AbstractC8774 abstractC8774 = (AbstractC8774) interfaceC0724;
                            AbstractC6323 abstractC6323 = ((C10164) m43757().m42560()).f34724;
                            abstractC8774.getClass();
                            C3128.m9435(abstractC8774, abstractC6323);
                            C12457.m30932((InterfaceC17428) interfaceC0724);
                            i5 = 0;
                            z = true;
                            arrayList = arrayList2;
                            z3 = z7;
                            it = it2;
                            str2 = str;
                            z4 = z8;
                        }
                        C2968 c2968 = new C2968();
                        m42121(interfaceC0724, C11521.of(c2968));
                        C10025 c10025M25303 = C10025.m25303(c2968, abstractC7204, abstractC7205);
                        if (!z2 || z) {
                            abstractC7203 = abstractC7204;
                        } else {
                            abstractC7203 = abstractC7205;
                        }
                        m42120(interfaceC0724, c10025M25303, abstractC7203);
                        if (z6) {
                            c9320.m23967();
                        }
                        AbstractC8774 abstractC8775 = (AbstractC8774) interfaceC0724;
                        AbstractC6323 abstractC6324 = ((C10164) m43757().m42560()).f34724;
                        abstractC8775.getClass();
                        C3128.m9435(abstractC8775, abstractC6324);
                        C12457.m30932((InterfaceC17428) interfaceC0724);
                        i5 = 0;
                        z = true;
                        arrayList = arrayList2;
                        z3 = z7;
                        it = it2;
                        str2 = str;
                        z4 = z8;
                    } else {
                        str = str2;
                    }
                    z8 = z4;
                    C2968 c2969 = new C2968();
                    m42121(interfaceC0724, C11521.of(c2969));
                    C10025 c10025M25304 = C10025.m25303(c2969, abstractC7204, abstractC7205);
                    if (z2) {
                        abstractC7203 = abstractC7204;
                    } else {
                        abstractC7203 = abstractC7204;
                    }
                    m42120(interfaceC0724, c10025M25304, abstractC7203);
                    if (z6) {
                        c9320.m23967();
                    }
                    AbstractC8774 abstractC8776 = (AbstractC8774) interfaceC0724;
                    AbstractC6323 abstractC6325 = ((C10164) m43757().m42560()).f34724;
                    abstractC8776.getClass();
                    C3128.m9435(abstractC8776, abstractC6325);
                    C12457.m30932((InterfaceC17428) interfaceC0724);
                    i5 = 0;
                    z = true;
                    arrayList = arrayList2;
                    z3 = z7;
                    it = it2;
                    str2 = str;
                    z4 = z8;
                }
            }
            if (interfaceC0723 != null) {
                c9320.m23967();
            }
        }
        abstractC22433M13309 = c4793.m13309();
        enumC3283Mo6069 = EnumC3283.f12172;
        c11521Empty = C11521.empty();
        while (i < abstractC22433M13309.size()) {
            if (enumC3283Mo6069.m9776()) {
                c11521Empty = C11521.of(Integer.valueOf(i));
            }
        }
        c11521Empty.ifPresent(new Consumer() { // from class: l.֫ۙ᩸
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj3) {
                linkedHashSet.add((Integer) obj3);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
        i3 = 0;
        i4 = -1;
        while (i2 < arrayList.size()) {
            if (((InterfaceC0723) arrayList.get(i2)).mo1801() != EnumC12490.METHOD_INVOCATION) {
                if (i2 <= 0) {
                    i3++;
                } else {
                    i3++;
                }
                if (i4 < 0) {
                    i4 = i2;
                }
            }
        }
        if (i3 == 1) {
            linkedHashSet.add(Integer.valueOf(i4));
        }
        if (linkedHashSet.isEmpty()) {
            string = ((InterfaceC17657) arrayList.get(0)).getName().toString();
            if (!string.equals("this")) {
                linkedHashSet.add(1);
            } else {
                linkedHashSet.add(1);
            }
        }
        list = (List) C4004.m11497(C9030.stream(arrayList), new C4328(new C12188())).filter(new C9627(1)).collect(C1890.toList());
        C0356.forEach(list, new C2644(1, linkedHashSet));
        if (!linkedHashSet.isEmpty()) {
            if (list.isEmpty()) {
                enumC0851 = EnumC0851.INDEPENDENT;
            } else {
                enumC0851 = EnumC0851.UNIFIED;
            }
            m42119(arrayList, z, linkedHashSet, enumC0851);
        } else {
            if (arrayList.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = !z;
            if (arrayList.size() == 1) {
                z4 = false;
            } else {
                z4 = z3;
            }
            it = arrayList.iterator();
            z5 = false;
            while (it.hasNext()) {
                interfaceC0724 = (InterfaceC0723) it.next();
                if (z5) {
                    c9320.m23956(abstractC7204);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z9 = z3;
                    it2 = it;
                    obj = interfaceC0724;
                    while (!(obj instanceof C23570)) {
                        if (obj instanceof C15434) {
                            obj2 = ((C15434) obj).f50296;
                        } else if (obj instanceof C22158) {
                            obj2 = ((C22158) obj).f72477;
                        } else {
                            throw new RuntimeException("Unexpected tree type: " + obj);
                        }
                        obj = obj2;
                        i5 = 0;
                    }
                    interfaceC15670M23963 = c9320.m23963(i5);
                    C13638.requireNonNull(interfaceC15670M23963);
                    if (((C15716) interfaceC15670M23963.mo37335()).mo37426().equals(str2)) {
                        throw new AssertionError(interfaceC15670M23963.toString());
                    }
                    InterfaceC15670 interfaceC15670M23966 = c9320.m23963(-1);
                    InterfaceC15670 interfaceC15670M23967 = c9320.m23963(1);
                    zM42125 = m42124(interfaceC15670M23966, interfaceC15670M23963);
                    zM42124 = m42124(interfaceC15670M23963, interfaceC15670M23967);
                    if (!z6) {
                        c9320.m23956(abstractC7204);
                        z6 = true;
                    }
                    if (z4) {
                        z7 = z9;
                    } else {
                        z7 = z9;
                    }
                } else {
                    it2 = it;
                    zM42124 = false;
                    zM42125 = false;
                    z7 = false;
                }
                if (z) {
                    if (zM42125) {
                        c9320.m23946();
                    }
                    m42132(str2);
                    if (zM42124) {
                        c9320.m23946();
                    }
                }
                if (z2) {
                    abstractC7202 = abstractC7205;
                } else {
                    abstractC7202 = this.f57877;
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList.size() >= 2) {
                    interfaceC5433 = (InterfaceC5433) interfaceC0724;
                    interfaceC22510M30935 = C12457.m30935(interfaceC5433);
                    str = str2;
                    if (interfaceC5433.mo15014() instanceof InterfaceC17657) {
                        abstractC11242 = (AbstractC11242) interfaceC22510M30935;
                        z8 = z4;
                        if (abstractC11242.length() > 4) {
                        }
                    } else {
                        z8 = z4;
                    }
                    C2968 c29610 = new C2968();
                    m42121(interfaceC0724, C11521.of(c29610));
                    C10025 c10025M25305 = C10025.m25303(c29610, abstractC7204, abstractC7205);
                    if (z2) {
                        abstractC7203 = abstractC7204;
                    } else {
                        abstractC7203 = abstractC7204;
                    }
                    m42120(interfaceC0724, c10025M25305, abstractC7203);
                } else {
                    str = str2;
                    z8 = z4;
                    C2968 c29611 = new C2968();
                    m42121(interfaceC0724, C11521.of(c29611));
                    C10025 c10025M25306 = C10025.m25303(c29611, abstractC7204, abstractC7205);
                    if (z2) {
                        abstractC7203 = abstractC7204;
                    } else {
                        abstractC7203 = abstractC7204;
                    }
                    m42120(interfaceC0724, c10025M25306, abstractC7203);
                }
                if (z6) {
                    c9320.m23967();
                }
                AbstractC8774 abstractC8777 = (AbstractC8774) interfaceC0724;
                AbstractC6323 abstractC6326 = ((C10164) m43757().m42560()).f34724;
                abstractC8777.getClass();
                C3128.m9435(abstractC8777, abstractC6326);
                C12457.m30932((InterfaceC17428) interfaceC0724);
                i5 = 0;
                z = true;
                arrayList = arrayList3;
                z3 = z7;
                it = it2;
                str2 = str;
                z4 = z8;
            }
        }
        if (interfaceC0723 != null) {
            c9320.m23967();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42119(List list, boolean z, AbstractCollection abstractCollection, EnumC0851 enumC0851) {
        C8614 c8614;
        C9320 c9320;
        boolean z2;
        if (!abstractCollection.isEmpty()) {
            ((Integer) C22808.m50475(abstractCollection)).intValue();
            list.size();
        }
        int i = 0;
        while (true) {
            int size = abstractCollection.size();
            c8614 = f57874;
            c9320 = this.f57880;
            if (i >= size) {
                break;
            }
            c9320.m23956(c8614);
            i++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(AbstractC0934.copyOf((Collection) abstractCollection));
        C2968 c2968 = new C2968();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < list.size()) {
            InterfaceC0723 interfaceC0723 = (InterfaceC0723) list.get(i2);
            C8614 c8615 = this.f57881;
            if (z3) {
                c9320.m23956(c8615);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 0 && m42108()) {
                if (!z2) {
                    c9320.m23956(c8615);
                    z2 = true;
                }
                c9320.m23946();
                z3 = true;
            }
            if (z) {
                m42132(".");
            } else if (z) {
                EnumC0851 enumC0852 = (arrayDeque.isEmpty() || i2 > ((Integer) arrayDeque.peekFirst()).intValue()) ? EnumC0851.UNIFIED : enumC0851;
                C11521 c11521Of = C11521.of(c2968);
                c9320.getClass();
                c9320.m23955(C22019.m48910(enumC0852, "", c8614, c11521Of));
                m42132(".");
            }
            C2968 c2969 = new C2968();
            m42121(interfaceC0723, C11521.of(c2969));
            if (!arrayDeque.isEmpty() && i2 == ((Integer) arrayDeque.peekFirst()).intValue()) {
                c9320.m23967();
                arrayDeque.removeFirst();
            }
            m42120(interfaceC0723, C10025.m25303(c2969, c8615, c8614), c8615);
            if (z2) {
                c9320.m23967();
            }
            i2++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42121(InterfaceC0723 interfaceC0723, C11521 c11521) {
        InterfaceC0723 interfaceC0723M42110 = m42110(interfaceC0723);
        switch (C3014.f11272[interfaceC0723M42110.mo1801().ordinal()]) {
            case 9:
                m42147(((InterfaceC2610) interfaceC0723M42110).mo8084());
                break;
            case 10:
                InterfaceC5433 interfaceC5433 = (InterfaceC5433) interfaceC0723M42110;
                if (!interfaceC5433.mo15013().isEmpty()) {
                    C8614 c8614 = this.f57881;
                    C9320 c9320 = this.f57880;
                    c9320.m23956(c8614);
                    C21825 c21825Mo15013 = interfaceC5433.mo15013();
                    C8614 c8615 = f57874;
                    m42151(c21825Mo15013, c8615);
                    c9320.m23955(C22019.m48910(EnumC0851.UNIFIED, "", c8615, c11521));
                    c9320.m23967();
                }
                m42147(C12457.m30935(interfaceC5433));
                break;
            case 11:
                m42147(((InterfaceC17657) interfaceC0723M42110).getName());
                break;
            default:
                m42146((InterfaceC17428) interfaceC0723M42110);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0723 m42110(InterfaceC0723 interfaceC0723) {
        while (interfaceC0723 instanceof InterfaceC9420) {
            interfaceC0723 = ((InterfaceC9420) interfaceC0723).getExpression();
        }
        return interfaceC0723;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42129(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        C8614 c8614 = f57874;
        C9320 c9320 = this.f57880;
        c9320.m23956(c8614);
        do {
            m42132("[");
            c9320.m23960();
            m42146((InterfaceC17428) arrayDeque.removeLast());
            m42132("]");
        } while (!arrayDeque.isEmpty());
        c9320.m23967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42120(InterfaceC0723 interfaceC0723, C10025 c10025, AbstractC7202 abstractC7202) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC0723 expression = interfaceC0723;
        while (expression instanceof InterfaceC9420) {
            InterfaceC9420 interfaceC9420 = (InterfaceC9420) expression;
            arrayDeque.addLast(interfaceC9420.getIndex());
            expression = interfaceC9420.getExpression();
        }
        InterfaceC0723 interfaceC0723M42110 = m42110(interfaceC0723);
        if (C3014.f11272[interfaceC0723M42110.mo1801().ordinal()] == 10) {
            C9320 c9320 = this.f57880;
            c9320.m23956(c10025);
            m42137((List) ((InterfaceC5433) interfaceC0723M42110).mo15012(), abstractC7202);
            c9320.m23967();
        }
        m42129(arrayDeque);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42151(List list, AbstractC7202 abstractC7202) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m42132("<");
        C9320 c9320 = this.f57880;
        c9320.m23956(abstractC7202);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC17428 interfaceC17428 = (InterfaceC17428) it.next();
            if (z) {
                m42132(",");
                c9320.m23944();
            }
            m42146(interfaceC17428);
            z = true;
        }
        c9320.m23967();
        m42132(">");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42137(List list, AbstractC7202 abstractC7202) {
        m42132(MotionUtils.EASING_TYPE_FORMAT_START);
        boolean zIsEmpty = list.isEmpty();
        C9320 c9320 = this.f57880;
        boolean z = false;
        if (!zIsEmpty) {
            Iterator it = list.iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                InterfaceC0723 interfaceC0723 = (InterfaceC0723) it.next();
                InterfaceC15670 interfaceC15670M23963 = c9320.m23963(i);
                C13638.requireNonNull(interfaceC15670M23963);
                InterfaceC15670 interfaceC15670M23964 = c9320.m23963(i != 0 ? 0 : -1);
                C13638.requireNonNull(interfaceC15670M23964);
                InterfaceC15670 interfaceC15670M23965 = c9320.m23963(i == 0 ? -2 : -1);
                if (i != 0) {
                    if ((interfaceC15670M23965 != null && m42125(interfaceC15670M23965.mo37336())) || m42125(interfaceC15670M23964.mo37337())) {
                        if (!z) {
                            c9320.m23956(abstractC7202);
                            z = true;
                        }
                        c9320.m23946();
                    }
                    m42132(",");
                }
                if (m42125(interfaceC15670M23964.mo37336()) || m42125(interfaceC15670M23963.mo37337())) {
                    if (!z) {
                        c9320.m23956(abstractC7202);
                        z = true;
                    }
                    c9320.m23946();
                } else if (i != 0) {
                    c9320.m23966();
                }
                m42146((InterfaceC17428) interfaceC0723);
                i = 1;
            }
        }
        if (z) {
            c9320.m23967();
        }
        if (!list.isEmpty() && m42108()) {
            c9320.m23946();
        }
        m42133(MotionUtils.EASING_TYPE_FORMAT_END, abstractC7202);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m42126(ArrayDeque arrayDeque) {
        m42118(new ArrayDeque(), (Deque) arrayDeque);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42138(List list, EnumC22334 enumC22334, EnumC21628 enumC21628) {
        boolean z;
        boolean zIsEmpty = list.isEmpty();
        C8614 c8614 = f57874;
        C8614 c8615 = this.f57875;
        C9320 c9320 = this.f57880;
        if (zIsEmpty) {
            if (enumC22334.m49502()) {
                c9320.m23966();
                m42144(c8615);
                c9320.m23954(AbstractC1557.f6287);
                c9320.m23956(c8614);
                if (c9320.m23959(0).equals(C11521.of(l.b))) {
                    c9320.m23956(c8615);
                    m42150();
                    c9320.m23967();
                    c9320.m23946();
                }
                m42133(l.d, c8615);
                c9320.m23967();
                return;
            }
            return;
        }
        if (enumC22334.m49502()) {
            c9320.m23966();
            m42144(c8615);
            c9320.m23956(c8614);
        }
        c9320.m23956(c8615);
        boolean zM48339 = enumC21628.m48339();
        InterfaceC23659 interfaceC23659M38722 = C16458.m38722(list.iterator());
        boolean z2 = false;
        while (interfaceC23659M38722.hasNext()) {
            InterfaceC17428 interfaceC17428 = (InterfaceC17428) interfaceC23659M38722.next();
            m42150();
            c9320.m23946();
            if (interfaceC17428.mo1801() == EnumC12490.VARIABLE) {
                InterfaceC15670 interfaceC15670 = (InterfaceC15670) c9320.m23958().mo1426().mo2653(Integer.valueOf(C3128.m9453((AbstractC8774) interfaceC17428)));
                if (interfaceC15670 != null) {
                    AbstractC16706 abstractC16706ListIterator = interfaceC15670.mo37337().listIterator(0);
                    while (true) {
                        if (abstractC16706ListIterator.hasNext()) {
                            if (((InterfaceC20608) abstractC16706ListIterator.next()).getText().startsWith("/**")) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (zM48339) {
                c9320.m23954(AbstractC1557.f6289);
            } else if (!zM48339 && (z || z2)) {
                c9320.m23954(AbstractC1557.f6288);
            }
            m42148();
            if (interfaceC17428.mo1801() == EnumC12490.VARIABLE) {
                m42136(m42109(interfaceC23659M38722, interfaceC17428), EnumC3988.FIELD, m42112((InterfaceC1199) ((InterfaceC4915) interfaceC17428).mo13674()));
            } else {
                m42146(interfaceC17428);
            }
            zM48339 = false;
            z2 = z;
        }
        m42150();
        c9320.m23946();
        c9320.m23967();
        c9320.m23946();
        m42148();
        if (enumC22334.m49502()) {
            c9320.m23954(AbstractC1557.f6289);
            m42133(l.d, c8615);
            c9320.m23967();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42116(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        C9320 c9320 = this.f57880;
        c9320.m23944();
        c9320.m23956(list.size() > 1 ? this.f57881 : f57874);
        m42132(str);
        c9320.m23966();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC17428 interfaceC17428 = (InterfaceC17428) it.next();
            if (z) {
                m42132(",");
                c9320.m23964();
            }
            m42146(interfaceC17428);
            z = true;
        }
        c9320.m23967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42109(InterfaceC23659 interfaceC23659, InterfaceC17428 interfaceC17428) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC17428.mo1801() == EnumC12490.VARIABLE) {
            int iM30932 = C12457.m30932(interfaceC17428);
            arrayList.add((InterfaceC4915) interfaceC17428);
            while (interfaceC23659.hasNext() && ((InterfaceC17428) interfaceC23659.peek()).mo1801() == EnumC12490.VARIABLE && C12457.m30932((InterfaceC17428) interfaceC23659.peek()) == iM30932) {
                arrayList.add((InterfaceC4915) interfaceC23659.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15279 m42112(InterfaceC1199 interfaceC1199) {
        Iterator it = interfaceC1199.getAnnotations().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1657) it.next()).mo5562().isEmpty()) {
                return EnumC15279.VERTICAL;
            }
        }
        return EnumC15279.HORIZONTAL;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42132(String str) {
        this.f57880.m23951(str, EnumC14964.REAL, f57874, C11521.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42133(String str, AbstractC7202 abstractC7202) {
        this.f57880.m23951(str, EnumC14964.REAL, abstractC7202, C11521.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42144(AbstractC7202 abstractC7202) {
        this.f57880.m23951("{", EnumC14964.REAL, f57874, C11521.of(abstractC7202));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42152(InterfaceC17428 interfaceC17428) {
        AbstractC8774 abstractC8774 = (AbstractC8774) interfaceC17428;
        abstractC8774.getClass();
        this.f57880.m23945(C3128.m9453(abstractC8774));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42140(EnumC3988 enumC3988, EnumC15279 enumC15279, C11521 c11521, InterfaceC17428 interfaceC17428, InterfaceC22510 interfaceC22510, String str, C11521 c11522, C11521 c11523, C11521 c11524, C11521 c11525) {
        C2968 c2968 = new C2968();
        C2968 c2969 = new C2968();
        boolean z = true;
        boolean z2 = enumC3988 == EnumC3988.FIELD;
        C9320 c9320 = this.f57880;
        if (z2) {
            c9320.m23954(AbstractC1557.m5335(c2969));
        }
        ArrayDeque arrayDeque = new ArrayDeque(c11525.isPresent() ? ((C6542) c11525.get()).f22025 : AbstractC22433.of());
        AbstractC23040 abstractC23040 = (AbstractC23040) c11521.map(new Function() { // from class: l.ۢۙ᩸
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC1199 interfaceC1199 = (InterfaceC1199) obj;
                return this.f31736.m42131(interfaceC1199, (List) interfaceC1199.getAnnotations());
            }
        }).orElse(new C0897(AbstractC22433.of(), AbstractC22433.of()));
        EnumC3988 enumC3989 = EnumC3988.PARAMETER;
        C8614 c8614 = f57874;
        C8614 c8615 = this.f57881;
        c9320.m23956((enumC3988 == enumC3989 && abstractC23040.m50973()) ? c8615 : c8614);
        AbstractC22433 abstractC22433M42113 = m42113(abstractC23040, enumC15279, C11521.of(c2969));
        boolean z3 = ((String) c9320.m23959(0).get()).equals("var") && (!interfaceC22510.mo28213("var") || ((String) c9320.m23959(1).get()).equals("var"));
        if (interfaceC17428 == null && !z3) {
            z = false;
        }
        c9320.m23956(c8614);
        c9320.m23956(c8614);
        c9320.m23956(c8614);
        m42135(abstractC22433M42113, EnumC1166.NO, EnumC1166.YES);
        if (c11525.isPresent() && ((C6542) c11525.get()).f22026 != null) {
            m42146(((C6542) c11525.get()).f22026);
            arrayDeque.size();
            c9320.m23956(c8615);
            m42126(arrayDeque);
            c9320.m23967();
            arrayDeque.size();
        } else if (z3) {
            m42132("var");
        } else {
            m42146(interfaceC17428);
        }
        c9320.m23967();
        if (z) {
            c9320.m23966();
        }
        c9320.m23956(C10025.m25303(c2968, c8615, c8614));
        if (c11524.isPresent()) {
            m42146((InterfaceC17428) c11524.get());
        } else {
            m42147(interfaceC22510);
        }
        c9320.m23961("");
        m42126(arrayDeque);
        c9320.m23967();
        c9320.m23967();
        if (c11522.isPresent()) {
            c9320.m23966();
            m42132(str);
            if (((InterfaceC0723) c11522.get()).mo1801() == EnumC12490.NEW_ARRAY && ((InterfaceC6844) c11522.get()).getType() == null) {
                c9320.m23966();
                ((InterfaceC0723) c11522.get()).mo1800(this, null);
            } else {
                c9320.m23956(C10025.m25303(c2968, c8615, c8614));
                c9320.m23966();
                m42146((InterfaceC17428) c11522.get());
                c9320.m23967();
            }
        }
        if (c11523.isPresent() && c9320.m23959(0).equals(c11523)) {
            c9320.m23965((String) c11523.get());
        }
        c9320.m23967();
        c9320.m23967();
        if (z2) {
            c9320.m23954(AbstractC1557.m5335(c2969));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m42108() {
        C9320 c9320 = this.f57880;
        return m42124(c9320.m23963(-1), c9320.m23963(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42124(InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671) {
        if (interfaceC15670 == null || !m42125(interfaceC15670.mo37336())) {
            return interfaceC15671 != null && m42125(interfaceC15671.mo37337());
        }
        return true;
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f57880, "builder");
        return c23244M37072.toString();
    }
}
