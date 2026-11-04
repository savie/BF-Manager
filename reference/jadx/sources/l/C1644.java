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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644 extends C18891 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f5703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13859 f5704;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C16184 f5705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f5706 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f5707 = new ArrayDeque(AbstractC1928.of((Object) Boolean.FALSE));

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16184 f5708;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16184 f5709;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16184 f5710;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1269 f5711;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f5712;

    public C1644(C1269 c1269, int i) {
        this.f5711 = c1269;
        this.f5712 = i;
        C16184.m38411(-2, i);
        this.f5710 = C16184.m38411(-4, i);
        this.f5708 = C16184.m38411(2, i);
        this.f5709 = C16184.m38411(4, i);
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5839(C0468 c0468, Object obj) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5840(C0666 c0666, Object obj) {
        m5822("opens", "to", c0666.f2536, c0666.f2537);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5841(C1214 c1214, Object obj) {
        m5921(c1214);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5901("continue");
        AbstractC19728 abstractC19728 = c1214.f4446;
        if (abstractC19728 != null) {
            c1269.m4606();
            m5908(abstractC19728);
        }
        m5901(l.b);
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5842(C1412 c1412, Object obj) {
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        m5912((InterfaceC19637) c1412.f4986);
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5843(C2070 c2070, Object obj) {
        m5921(c2070);
        m5901("throw");
        this.f5711.m4606();
        m5912((InterfaceC19637) c2070.f6892);
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5844(C2158 c2158, Object obj) {
        m5921(c2158);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InterfaceC15335 interfaceC15335 = c2158;
        while (true) {
            arrayList.add(interfaceC15335.mo7420());
            arrayList2.add(interfaceC15335.mo7421());
            if (interfaceC15335.mo7422() == null || interfaceC15335.mo7422().mo2283() != EnumC22621.IF) {
                break;
            }
            interfaceC15335 = (InterfaceC15335) interfaceC15335.mo7422();
        }
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < size) {
            if (z) {
                if (z2) {
                    c1269.m4606();
                } else {
                    c1269.m4588();
                }
                m5901("else");
                c1269.m4606();
            }
            m5901("if");
            c1269.m4606();
            m5901(MotionUtils.EASING_TYPE_FORMAT_START);
            m5912((InterfaceC19637) ((InterfaceC10114) ((InterfaceC22049) arrayList.get(i))).getExpression());
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
            z = true;
            m5827((InterfaceC7132) arrayList2.get(i), EnumC10592.m27037(size == 1 && interfaceC15335.mo7422() == null), EnumC9691.YES, EnumC2980.m9699(i < size + (-1) || interfaceC15335.mo7422() != null));
            z2 = ((InterfaceC7132) arrayList2.get(i)).mo2283() == EnumC22621.BLOCK;
            i++;
        }
        if (interfaceC15335.mo7422() != null) {
            if (z2) {
                c1269.m4606();
            } else {
                c1269.m4588();
            }
            m5901("else");
            m5827(interfaceC15335.mo7422(), EnumC10592.NO, EnumC9691.YES, EnumC2980.NO);
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5845(C3451 c3451, Object obj) {
        m5921(c3451);
        C1269 c1269 = this.f5711;
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        m5901("assert");
        c1269.m4606();
        if (c3451.f11255 != null) {
            c16184 = this.f5709;
        }
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c3451.f11254);
        if (c3451.f11255 != null) {
            c1269.m4609();
            m5901(":");
            c1269.m4606();
            m5912((InterfaceC19637) c3451.f11255);
        }
        c1269.m4605();
        c1269.m4605();
        m5901(l.b);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5846(C3561 c3561, Object obj) {
        EnumC21461 enumC21461Mo2285;
        m5921((InterfaceC19637) c3561);
        String strM12511 = C3881.m12511((InterfaceC22049) c3561);
        if (c3561.mo2285().m48824()) {
            m5912((InterfaceC19637) c3561.f12203);
            m5835(strM12511);
            return null;
        }
        m5835(strM12511);
        int i = C1489.f5186[c3561.mo2283().ordinal()];
        if (i == 6 || i == 7) {
            AbstractC22295 abstractC22295 = c3561.f12203;
            if (abstractC22295 instanceof InterfaceC11432) {
                enumC21461Mo2285 = abstractC22295.mo2285();
            } else if (abstractC22295 instanceof InterfaceC17573) {
                if (C3881.m12510((InterfaceC17573) abstractC22295, m43808()).startsWith("-")) {
                    enumC21461Mo2285 = EnumC21461.f68469;
                } else {
                    enumC21461Mo2285 = null;
                }
            } else {
                enumC21461Mo2285 = null;
            }
            if (enumC21461Mo2285 != null && !enumC21461Mo2285.m48824() && C3881.m12511((InterfaceC22049) c3561).startsWith(strM12511)) {
                this.f5711.m4606();
            }
        }
        m5912((InterfaceC19637) c3561.f12203);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5847(C4197 c4197, Object obj) {
        m5913((InterfaceC20798) c4197, EnumC10592.NO, EnumC9691.NO, EnumC2980.NO);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5848(C4307 c4307, Object obj) {
        m5921(c4307);
        m5901("yield");
        this.f5711.m4606();
        m5912((InterfaceC19637) c4307.f15611);
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5849(C4395 c4395, Object obj) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5850(C5053 c5053, Object obj) {
        m5822("provides", "with", c5053.f17632, c5053.f17631);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5851(C5141 c5141, Object obj) {
        m5822("exports", "to", c5141.f17908, c5141.f17909);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5852(C5799 c5799, Object obj) {
        m5921(c5799);
        m5901(MessageHandler.Properties.IsSynchronized);
        C1269 c1269 = this.f5711;
        c1269.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        c1269.m4595(this.f5709);
        c1269.m4591();
        m5912((InterfaceC19637) ((InterfaceC10114) c5799.f19919).getExpression());
        c1269.m4605();
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        c1269.m4606();
        m5912(c5799.f19918);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5853(C5887 c5887, Object obj) {
        m5921((InterfaceC19637) c5887);
        m5901(c5887.f20169.toString());
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5854(C6435 c6435, Object obj) {
        m5921((InterfaceC19637) c6435);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m5821(C11239.m28322(c6435.mo2285()), c6435, arrayList, arrayList2);
        EnumC10963 enumC10963 = EnumC10963.UNIFIED;
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        int i = 0;
        m5912((InterfaceC19637) arrayList.get(0));
        int size = arrayList2.size();
        while (i < size) {
            if (m5838()) {
                c1269.m4588();
            } else {
                c1269.m4606();
            }
            c1269.m4602((String) arrayList2.get(i));
            if (m5838()) {
                c1269.m4588();
            } else {
                c1269.m4606();
            }
            i++;
            m5912((InterfaceC19637) arrayList.get(i));
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5855(C6545 c6545, Object obj) {
        m5921(c6545);
        m5901("while");
        this.f5711.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        m5912((InterfaceC19637) ((InterfaceC10114) c6545.f21979).getExpression());
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        m5827(c6545.f21978, EnumC10592.YES, EnumC9691.YES, EnumC2980.NO);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [l.֫ۗܽ] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, l.ܰᩳۘ] */
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
    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5856(C6633 c6633, Object obj) {
        InterfaceC19637 interfaceC19637;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        AbstractC22295 abstractC22295 = c6633.f22151;
        m5921(c6633);
        ?? SubList = c6633.f22144.f15824;
        List listOf = AbstractC1928.of();
        boolean z3 = false;
        boolean z4 = (c6633.f22144.f15825 & 2251799813685248L) == 2251799813685248L;
        if (!c6633.f22154.isEmpty() && !SubList.isEmpty()) {
            int iM12509 = C3881.m12509((InterfaceC19637) c6633.f22154.get(0));
            for (int i = 0; i < SubList.m35551(); i++) {
                if (C3881.m12509((InterfaceC19637) SubList.get(i)) > iM12509) {
                    listOf = SubList.subList(i, SubList.m35551());
                    SubList = SubList.subList(0, i);
                    break;
                }
            }
        }
        AbstractC1928<InterfaceC11847> abstractC1928M5817 = m5817(m5900(c6633.f22144, SubList), EnumC12830.VERTICAL, C15867.empty());
        if (c6633.f22154.isEmpty() && c6633.f22147 != null) {
            listOf = abstractC1928M5817;
            abstractC1928M5817 = AbstractC1928.of();
        }
        AbstractC22295 abstractC22296 = c6633.f22147;
        C1269 c1269 = this.f5711;
        if (abstractC22296 != null) {
            C15658 c15658M33062 = C13421.m33062(abstractC22296, EnumC20134.YES);
            interfaceC19637 = c15658M33062.f50885;
            arrayDeque = new ArrayDeque(c15658M33062.f50884);
        } else {
            for (InterfaceC11847 interfaceC11847 : abstractC1928M5817) {
                c1269.m4588();
                m5912(interfaceC11847);
                c1269.m4588();
            }
            abstractC1928M5817 = AbstractC1928.of();
            interfaceC19637 = null;
            arrayDeque = null;
        }
        C16184 c16184 = this.f5709;
        c1269.m4595(c16184);
        C9471 c9471 = new C9471();
        C9471 c9472 = new C9471();
        C16184 c16185 = f5705;
        c1269.m4595(c16185);
        if (abstractC1928M5817.isEmpty()) {
            z = false;
        } else {
            EnumC21781 enumC21781 = EnumC21781.NO;
            m5906(abstractC1928M5817, enumC21781, enumC21781);
            z = true;
        }
        if (!c6633.f22154.isEmpty()) {
            if (z) {
                c1269.m4611();
            }
            m5901("<");
            m5918(c6633.f22154, c16184);
            z = true;
        }
        if (interfaceC19637 != null) {
            if (z) {
                c1269.m4606();
            } else {
                z = true;
            }
            c1269.m4595(C23644.m52881(c9472, c16184, c16185));
            c1269.m4595(c16185);
            if (!listOf.isEmpty()) {
                EnumC21781 enumC21782 = EnumC21781.NO;
                m5906(listOf, enumC21782, enumC21782);
                c1269.m4606();
            }
            m5912(interfaceC19637);
            m5833(arrayDeque);
            c1269.m4605();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            c1269.m4606();
        }
        if (!z2) {
            c1269.m4595(c16185);
        }
        String string = c6633.f22150.toString();
        if (string.equals("<init>")) {
            string = (String) c1269.m4600(0).get();
        }
        m5901(string);
        if (!z4) {
            m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        c1269.m4605();
        c1269.m4605();
        c1269.m4595(C23644.m52881(c9471, c16184, c16185));
        c1269.m4595(C23644.m52881(c9472, c16184, c16185));
        c1269.m4595(c16185);
        if (!z4) {
            if (!c6633.f22145.isEmpty() || c6633.f22149 != null) {
                m5911(C15867.ofNullable(c6633.f22149), c6633.f22145);
            }
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (arrayDeque != null) {
            m5833(arrayDeque);
        }
        if (!c6633.f22146.isEmpty()) {
            c1269.m4611();
            c1269.m4595(c16184);
            C14769<InterfaceC22049> c14769 = c6633.f22146;
            m5901("throws");
            c1269.m4611();
            for (InterfaceC22049 interfaceC22049 : c14769) {
                if (z3) {
                    m5901(",");
                    c1269.m4609();
                }
                m5912(interfaceC22049);
                z3 = true;
            }
            c1269.m4605();
        }
        if (abstractC22295 != null) {
            c1269.m4606();
            m5901("default");
            if (abstractC22295.mo2283() == EnumC22621.NEW_ARRAY) {
                c1269.m4595(this.f5710);
                c1269.m4606();
                m5912(abstractC22295);
                c1269.m4605();
            } else {
                c1269.m4595(c16185);
                c1269.m4611();
                m5912(abstractC22295);
                c1269.m4605();
            }
        }
        c1269.m4605();
        c1269.m4605();
        c1269.m4605();
        C4197 c4197 = c6633.f22148;
        C16184 c16186 = this.f5708;
        if (c4197 == null) {
            m5901(l.b);
        } else {
            c1269.m4606();
            c1269.m4593("{", EnumC5744.REAL, c16186, C15867.of(c16186));
        }
        c1269.m4605();
        C4197 c4198 = c6633.f22148;
        if (c4198 != null) {
            if (c4198.f15344.isEmpty()) {
                c1269.m4596(AbstractC10217.f32657);
            } else {
                c1269.m4595(c16186);
                c1269.m4588();
                c1269.m4596(AbstractC10217.f32659);
                m5903(c6633.f22148.f15344);
                c1269.m4605();
                c1269.m4588();
                c1269.m4596(AbstractC10217.f32657);
                m5917();
            }
            m5902(l.d, c16186);
        }
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5857(C7180 c7180, Object obj) {
        m5921(c7180);
        C1269 c1269 = this.f5711;
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        m5901("for");
        c1269.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        c1269.m4595(c16184);
        m5830(EnumC22527.NONE, EnumC12830.HORIZONTAL, c7180.f23710, C15867.of(c7180.f23711), ":", C15867.empty());
        c1269.m4605();
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        c1269.m4605();
        m5827(c7180.f23709, EnumC10592.YES, EnumC9691.YES, EnumC2980.NO);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5858(C7926 c7926, Object obj) {
        AbstractC3506 abstractC3506;
        int i = C1489.f5186[c7926.mo2283().ordinal()];
        C1269 c1269 = this.f5711;
        AbstractC3506 abstractC3507 = this.f5709;
        AbstractC3506 abstractC3508 = f5705;
        if (i == 1) {
            m5921(c7926);
            c1269.m4595(abstractC3508);
            InterfaceC6387 interfaceC6387 = c7926.f26341;
            for (InterfaceC19637 interfaceC19637 : m5817(m5900(interfaceC6387, (List) interfaceC6387.getAnnotations()), EnumC12830.VERTICAL, C15867.empty())) {
                c1269.m4588();
                m5912(interfaceC19637);
                c1269.m4588();
            }
            c1269.m4595(abstractC3508);
            m5901("@");
            m5901("interface");
            c1269.m4609();
            m5908(c7926.f26346);
            c1269.m4605();
            c1269.m4605();
            List list = c7926.f26344;
            if (list == null) {
                c1269.m4595(abstractC3507);
                m5901(l.b);
                c1269.m4605();
            } else {
                m5905(list, EnumC4627.YES, EnumC5373.YES);
            }
            c1269.m4610(l.b);
            return null;
        }
        if (i == 2 || i == 3) {
            m5921(c7926);
            InterfaceC6387 interfaceC6388 = c7926.f26341;
            for (InterfaceC19637 interfaceC19638 : m5817(m5900(interfaceC6388, (List) interfaceC6388.getAnnotations()), EnumC12830.VERTICAL, C15867.empty())) {
                c1269.m4588();
                m5912(interfaceC19638);
                c1269.m4588();
            }
            List list2 = c7926.f26342;
            boolean z = c7926.f26348 != null;
            boolean zIsEmpty = c7926.f26347.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            EnumC22621 enumC22621Mo2283 = c7926.mo2283();
            EnumC22621 enumC22621 = EnumC22621.INTERFACE;
            m5901(enumC22621Mo2283 != enumC22621 ? Name.LABEL : "interface");
            c1269.m4606();
            m5908(c7926.f26346);
            if (!c7926.f26343.isEmpty()) {
                m5901("<");
            }
            c1269.m4595(abstractC3507);
            if (!c7926.f26343.isEmpty()) {
                List list3 = c7926.f26343;
                if (!z && zIsEmpty && zIsEmpty2) {
                    abstractC3507 = abstractC3508;
                }
                m5918(list3, abstractC3507);
            }
            if (z) {
                c1269.m4611();
                m5901("extends");
                c1269.m4606();
                m5912(c7926.f26348);
            }
            m5823(c7926.mo2283() == enumC22621 ? "extends" : "implements", c7926.f26347);
            m5823("permits", list2);
            c1269.m4605();
            List list4 = c7926.f26344;
            if (list4 == null) {
                m5901(l.b);
            } else {
                m5905(list4, EnumC4627.YES, EnumC5373.YES);
            }
            m5919();
            return null;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(c7926.mo2283());
            }
            m5921(c7926);
            InterfaceC6387 interfaceC6389 = c7926.f26341;
            for (InterfaceC19637 interfaceC19639 : m5817(m5900(interfaceC6389, (List) interfaceC6389.getAnnotations()), EnumC12830.VERTICAL, C15867.empty())) {
                c1269.m4588();
                m5912(interfaceC19639);
                c1269.m4588();
            }
            if (c7926.f26348 != null) {
                throw new C13377();
            }
            boolean zIsEmpty3 = c7926.f26347.isEmpty();
            m5901("record");
            c1269.m4606();
            m5908(c7926.f26346);
            if (!c7926.f26343.isEmpty()) {
                m5901("<");
            }
            c1269.m4595(abstractC3507);
            if (!c7926.f26343.isEmpty()) {
                m5918(c7926.f26343, !zIsEmpty3 ? abstractC3507 : abstractC3508);
            }
            AbstractC1928 abstractC1928 = (AbstractC1928) C1170.stream(c7926.f26344).filter(new C24715(2)).map(new C0948(5)).filter(new C5339(1)).collect(AbstractC1928.m6611());
            m5901(MotionUtils.EASING_TYPE_FORMAT_START);
            abstractC1928.isEmpty();
            m5911(C15867.empty(), abstractC1928);
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
            if (!zIsEmpty3) {
                c1269.m4611();
                if (c7926.f26347.m35551() <= 1) {
                    abstractC3507 = abstractC3508;
                }
                c1269.m4595(abstractC3507);
                m5901("implements");
                c1269.m4606();
                boolean z2 = false;
                for (InterfaceC19637 interfaceC196310 : c7926.f26347) {
                    if (z2) {
                        m5901(",");
                        c1269.m4609();
                    }
                    m5912(interfaceC196310);
                    z2 = true;
                }
                c1269.m4605();
            }
            c1269.m4605();
            C14769 c14769 = c7926.f26344;
            if (c14769 == null) {
                m5901(l.b);
            } else {
                m5905((AbstractC1928) C1170.stream(c14769).filter(new C18218(4)).collect(AbstractC1928.m6611()), EnumC4627.YES, EnumC5373.YES);
            }
            m5919();
            return null;
        }
        m5921(c7926);
        c1269.m4595(abstractC3508);
        InterfaceC6387 interfaceC63810 = c7926.f26341;
        for (InterfaceC19637 interfaceC196311 : m5817(m5900(interfaceC63810, (List) interfaceC63810.getAnnotations()), EnumC12830.VERTICAL, C15867.empty())) {
            c1269.m4588();
            m5912(interfaceC196311);
            c1269.m4588();
        }
        c1269.m4595(abstractC3507);
        m5901("enum");
        c1269.m4606();
        m5908(c7926.f26346);
        c1269.m4605();
        c1269.m4605();
        if (!c7926.f26347.isEmpty()) {
            c1269.m4595(abstractC3507);
            c1269.m4609();
            c1269.m4595(abstractC3507);
            m5901("implements");
            c1269.m4609();
            c1269.m4595(abstractC3508);
            boolean z3 = false;
            for (InterfaceC19637 interfaceC196312 : c7926.f26347) {
                if (z3) {
                    m5901(",");
                    c1269.m4611();
                }
                m5912(interfaceC196312);
                z3 = true;
            }
            c1269.m4605();
            c1269.m4605();
            c1269.m4605();
        }
        c1269.m4606();
        AbstractC3506 abstractC3509 = this.f5708;
        m5909(abstractC3509);
        ArrayList<InterfaceC17399> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC19637 interfaceC196313 : c7926.f26344) {
            if (interfaceC196313 instanceof C12510) {
                C12510 c12510 = (C12510) interfaceC196313;
                abstractC3506 = abstractC3509;
                if ((c12510.f40170.f15825 & 16384) == 16384) {
                    arrayList.add(c12510);
                }
                abstractC3509 = abstractC3506;
            } else {
                abstractC3506 = abstractC3509;
            }
            arrayList2.add(interfaceC196313);
            abstractC3509 = abstractC3506;
        }
        AbstractC3506 abstractC35010 = abstractC3509;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            c1269.m4595(abstractC35010);
            c1269.m4596(AbstractC10217.f32657);
            c1269.m4588();
            c1269.m4595(abstractC3508);
            boolean z4 = false;
            for (InterfaceC17399 interfaceC17399 : arrayList) {
                if (z4) {
                    m5901(",");
                    c1269.m4588();
                    c1269.m4596(AbstractC10217.f32659);
                }
                m5917();
                Iterator it = interfaceC17399.mo31063().f15824.iterator();
                while (it.hasNext()) {
                    m5912((InterfaceC19637) it.next());
                    c1269.m4588();
                }
                m5908(interfaceC17399.getName());
                InterfaceC21303 interfaceC21303 = (InterfaceC21303) interfaceC17399.mo31062();
                if (interfaceC21303.mo43142().isEmpty()) {
                    c1269.m4610(MotionUtils.EASING_TYPE_FORMAT_START);
                    c1269.m4610(MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    m5904(interfaceC21303.mo43142(), abstractC3507);
                }
                if (interfaceC21303.mo43141() != null) {
                    m5905(interfaceC21303.mo43141().f26344, EnumC4627.YES, EnumC5373.YES);
                }
                z4 = true;
            }
            if (((String) c1269.m4600(0).orElse("")).equals(",")) {
                m5901(",");
                c1269.m4588();
            }
            c1269.m4605();
            c1269.m4605();
            if (c1269.m4600(0).equals(C15867.of(l.b))) {
                c1269.m4595(abstractC35010);
                m5901(l.b);
                c1269.m4588();
                m5919();
                c1269.m4605();
            }
            c1269.m4595(abstractC3508);
            m5905(arrayList2, EnumC4627.NO, EnumC5373.NO);
            c1269.m4588();
            c1269.m4596(AbstractC10217.f32657);
            m5902(l.d, abstractC35010);
            c1269.m4605();
        } else if (c1269.m4600(0).equals(C15867.of(l.b))) {
            c1269.m4595(abstractC35010);
            c1269.m4588();
            m5901(l.b);
            c1269.m4588();
            m5919();
            c1269.m4605();
            c1269.m4595(abstractC3508);
            c1269.m4588();
            c1269.m4596(AbstractC10217.f32657);
            m5902(l.d, abstractC35010);
            c1269.m4605();
        } else {
            c1269.m4595(abstractC3508);
            c1269.m4596(AbstractC10217.f32657);
            m5901(l.d);
            c1269.m4605();
        }
        c1269.m4610(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5859(C8671 c8671, Object obj) {
        m5921(c8671);
        m5901("do");
        m5827(c8671.f28313, EnumC10592.YES, EnumC9691.YES, EnumC2980.YES);
        EnumC22621 enumC22621Mo2283 = c8671.f28313.mo2283();
        EnumC22621 enumC22621 = EnumC22621.BLOCK;
        C1269 c1269 = this.f5711;
        if (enumC22621Mo2283 == enumC22621) {
            c1269.m4606();
        } else {
            c1269.m4609();
        }
        m5901("while");
        c1269.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        m5912((InterfaceC19637) ((InterfaceC10114) c8671.f28314).getExpression());
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5860(C10162 c10162, Object obj) {
        m5921((InterfaceC19637) c10162);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c10162.f32546);
        if (m5838()) {
            c1269.m4588();
        } else {
            c1269.m4606();
        }
        m5901("?");
        c1269.m4606();
        m5912((InterfaceC19637) c10162.f32544);
        if (m5838()) {
            c1269.m4588();
        } else {
            c1269.m4606();
        }
        m5901(":");
        c1269.m4606();
        m5912((InterfaceC19637) c10162.f32545);
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5861(C11018 c11018, Object obj) {
        m5921(c11018);
        m5901("return");
        if (c11018.f34795 != null) {
            this.f5711.m4606();
            m5912((InterfaceC19637) c11018.f34795);
        }
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5862(C11106 c11106, Object obj) {
        m5921(c11106);
        m5912((InterfaceC19637) c11106.f35018);
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5863(C11764 c11764, Object obj) {
        C16184 c16184;
        C16184 c16185;
        String str;
        C16184 c16186;
        C11764 c11765 = c11764;
        m5921(c11764);
        C1269 c1269 = this.f5711;
        C16184 c16187 = f5705;
        c1269.m4595(c16187);
        m5901("try");
        c1269.m4606();
        boolean zIsEmpty = c11765.f38023.isEmpty();
        C16184 c16188 = this.f5709;
        String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
        if (zIsEmpty) {
            c16184 = c16188;
            c16185 = c16187;
            str = MotionUtils.EASING_TYPE_FORMAT_START;
        } else {
            m5901(MotionUtils.EASING_TYPE_FORMAT_START);
            c1269.m4595(c11765.f38023.m35551() > 1 ? c16188 : c16187);
            boolean z = false;
            for (InterfaceC19637 interfaceC19637 : c11765.f38023) {
                if (z) {
                    c1269.m4588();
                }
                if (interfaceC19637 instanceof InterfaceC17399) {
                    InterfaceC17399 interfaceC17399 = (InterfaceC17399) interfaceC19637;
                    m5916(EnumC22527.PARAMETER, m5818((InterfaceC6387) interfaceC17399.mo31063()), C15867.of(interfaceC17399.mo31063()), interfaceC17399.getType(), interfaceC17399.getName(), "=", C15867.ofNullable(interfaceC17399.mo31062()), C15867.empty(), C15867.empty(), C15867.empty());
                } else {
                    m5912(interfaceC19637);
                }
                if (c1269.m4600(0).equals(C15867.of(r8))) {
                    m5901(l.b);
                    c1269.m4606();
                }
                z = true;
                str2 = str2;
                c16187 = c16187;
                c16188 = c16188;
            }
            c16184 = c16188;
            c16185 = c16187;
            str = str2;
            if (c1269.m4600(0).equals(C15867.of(l.b))) {
                m5901(l.b);
                c1269.m4606();
            }
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
            c1269.m4605();
            c1269.m4606();
        }
        boolean z2 = (c11765.f38025.isEmpty() && c11765.f38024 == null) ? false : true;
        m5913(c11765.f38022, EnumC10592.m27037(!z2), EnumC9691.YES, EnumC2980.m9699(z2));
        int i = 0;
        while (i < c11765.f38025.m35551()) {
            InterfaceC14830 interfaceC14830 = (InterfaceC14830) c11765.f38025.get(i);
            EnumC2980 enumC2980M9699 = EnumC2980.m9699(i < c11765.f38025.m35551() + (-1) || c11765.f38024 != null);
            m5921(interfaceC14830);
            c1269.m4606();
            m5901("catch");
            c1269.m4606();
            m5901(str);
            C16184 c16189 = c16184;
            c1269.m4595(c16189);
            C12510 c12510Mo2287 = interfaceC14830.mo2287();
            if (c12510Mo2287.f40166.mo2283() == EnumC22621.UNION_TYPE) {
                C16184 c161810 = c16185;
                c1269.m4595(c161810);
                InterfaceC24859 interfaceC24859 = (InterfaceC24859) c12510Mo2287.f40166;
                c1269.m4595(c161810);
                m5921(c12510Mo2287);
                InterfaceC6387 interfaceC6387 = c12510Mo2287.f40170;
                m5906(m5817(m5900(interfaceC6387, (List) interfaceC6387.getAnnotations()), EnumC12830.HORIZONTAL, C15867.empty()), EnumC21781.NO, EnumC21781.YES);
                C14769 c14769Mo52956 = interfaceC24859.mo52956();
                boolean z3 = false;
                for (int i2 = 0; i2 < c14769Mo52956.m35551() - 1; i2++) {
                    if (z3) {
                        c1269.m4609();
                        m5901("|");
                        c1269.m4606();
                    } else {
                        z3 = true;
                    }
                    m5912((InterfaceC19637) c14769Mo52956.get(i2));
                }
                c1269.m4609();
                m5901("|");
                c1269.m4606();
                c16186 = c161810;
                m5916(EnumC22527.NONE, EnumC12830.HORIZONTAL, C15867.empty(), (InterfaceC19637) c14769Mo52956.get(c14769Mo52956.m35551() - 1), c12510Mo2287.f40164, "=", C15867.ofNullable(c12510Mo2287.f40171), C15867.empty(), C15867.empty(), C15867.empty());
                c1269.m4605();
                c1269.m4605();
            } else {
                c16186 = c16185;
                c1269.m4601();
                c1269.m4595(c16186);
                m5912(c12510Mo2287);
                c1269.m4605();
            }
            c1269.m4605();
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
            c1269.m4606();
            m5913(interfaceC14830.mo2286(), EnumC10592.NO, EnumC9691.YES, enumC2980M9699);
            i++;
            c11765 = c11764;
            c16185 = c16186;
            c16184 = c16189;
            str = str;
        }
        C11764 c11766 = c11765;
        if (c11766.f38024 != null) {
            c1269.m4606();
            m5901("finally");
            c1269.m4606();
            m5913(c11766.f38024, EnumC10592.NO, EnumC9691.YES, EnumC2980.NO);
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5864(C11852 c11852, Object obj) {
        AbstractC19728 abstractC19728Mo11141;
        Cloneable cloneable = c11852.f38181;
        if (cloneable instanceof InterfaceC19811) {
            abstractC19728Mo11141 = ((InterfaceC19811) cloneable).getName();
        } else {
            abstractC19728Mo11141 = ((InterfaceC3403) cloneable).mo11141();
        }
        AbstractC8639 abstractC8639 = f5704.get((Object) abstractC19728Mo11141.toString());
        if (!abstractC8639.isEmpty() && abstractC8639.contains(c11852.f38181.toString())) {
            this.f5706.add(abstractC19728Mo11141);
        }
        m5921(c11852);
        m5901("import");
        C1269 c1269 = this.f5711;
        c1269.m4606();
        if (c11852.f38180) {
            m5901("static");
            c1269.m4606();
        }
        m5834(c11852.f38181);
        m5901(l.b);
        m5919();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5865(C12400 c12400, Object obj) {
        m5921((InterfaceC19637) c12400);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c12400.f39896);
        c1269.m4606();
        m5835(C3881.m12511((InterfaceC22049) c12400));
        c1269.m4609();
        m5912((InterfaceC19637) c12400.f39895);
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5866(C12510 c12510, Object obj) {
        m5921(c12510);
        m5907(AbstractC1928.of((Object) c12510), EnumC22527.NONE, m5818((InterfaceC6387) c12510.f40170));
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5867(C12598 c12598, Object obj) {
        C1269 c1269 = this.f5711;
        C16184 c16184 = this.f5709;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c12598.f40436);
        c1269.m4591();
        c1269.m4602("::");
        m5920(c12598.f40437, c16184);
        int[] iArr = C1489.f5187;
        EnumC16081 enumC16081 = c12598.f40435;
        int i = iArr[enumC16081.ordinal()];
        if (i == 1) {
            m5908(c12598.f40431);
        } else if (i == 2) {
            m5901("new");
        } else {
            throw new AssertionError(enumC16081);
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5868(C13256 c13256, Object obj) {
        m5921((InterfaceC19637) c13256);
        m5914((InterfaceC22049) c13256.f42352, (List) c13256.f42355);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5869(C14089 c14089, Object obj) {
        m5921((InterfaceC19637) c14089);
        int[] iArr = C1489.f5188;
        EnumC21172 enumC21172 = c14089.f44595;
        switch (iArr[enumC21172.m48310().ordinal()]) {
            case 1:
                m5901(ClassTransform.BOOLEAN);
                return null;
            case 2:
                m5901(ClassTransform.BYTE);
                return null;
            case 3:
                m5901(ClassTransform.SHORT);
                return null;
            case 4:
                m5901(ClassTransform.INTEGER);
                return null;
            case 5:
                m5901(ClassTransform.LONG);
                return null;
            case 6:
                m5901(ClassTransform.CHARACTER);
                return null;
            case 7:
                m5901(ClassTransform.FLOAT);
                return null;
            case 8:
                m5901(ClassTransform.DOUBLE);
                return null;
            case 9:
                m5901(ClassTransform.VOID);
                return null;
            default:
                throw new AssertionError(enumC21172.m48310());
        }
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5870(C14637 c14637, Object obj) {
        m5921(c14637);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5901("break");
        AbstractC19728 abstractC19728 = c14637.f47895;
        if (abstractC19728 != null) {
            c1269.m4606();
            m5908(abstractC19728);
        }
        c1269.m4605();
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo5871(C14835 c14835, Object obj) {
        m5910((InterfaceC4149) c14835);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5872(C15493 c15493, Object obj) {
        m5921(c15493);
        m5914((InterfaceC22049) c15493.f50422, (List) c15493.f50421);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5873(C16129 c16129, Object obj) {
        m5921((InterfaceC19637) c16129);
        m5915((AbstractC22295) c16129);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5874(C16239 c16239, Object obj) {
        m5921(c16239);
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5906(c16239.f52783, EnumC21781.NO, EnumC21781.YES);
        m5908(c16239.f52784);
        if (!c16239.f52785.isEmpty()) {
            c1269.m4606();
            m5901("extends");
            C16184 c16185 = this.f5709;
            c1269.m4595(c16185);
            c1269.m4609();
            c1269.m4595(c16185);
            boolean z = false;
            for (InterfaceC19637 interfaceC19637 : c16239.f52785) {
                if (z) {
                    c1269.m4611();
                    m5901(a.p);
                    c1269.m4606();
                }
                m5912(interfaceC19637);
                z = true;
            }
            c1269.m4605();
            c1269.m4605();
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5875(C16327 c16327, Object obj) {
        m5921((InterfaceC19637) c16327);
        c16327.m38748();
        EnumC25033 enumC25033 = EnumC25033.EXPRESSION;
        C1269 c1269 = this.f5711;
        boolean zEquals = c1269.m4600(0).equals(C15867.of(MotionUtils.EASING_TYPE_FORMAT_START));
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        if (zEquals) {
            m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        boolean z = false;
        for (InterfaceC17399 interfaceC17399 : c16327.f52999) {
            if (z) {
                m5901(",");
                c1269.m4606();
            }
            m5907(AbstractC1928.of((Object) interfaceC17399), EnumC22527.NONE, m5818((InterfaceC6387) interfaceC17399.mo31063()));
            z = true;
        }
        if (zEquals) {
            m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c1269.m4605();
        c1269.m4606();
        c1269.m4602("->");
        if (m5832(c1269.m4608(-1), c1269.m4608(0))) {
            c1269.m4595(this.f5709);
            c1269.m4588();
        } else {
            c1269.m4595(c16184);
            c1269.m4606();
        }
        if (c16327.f53001.mo2283() == EnumC22621.BLOCK) {
            m5913((InterfaceC20798) c16327.f53001, EnumC10592.YES, EnumC9691.NO, EnumC2980.NO);
        } else {
            m5912(c16327.f53001);
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5876(C16875 c16875, Object obj) {
        m5921((InterfaceC19637) c16875);
        InterfaceC19637 interfaceC19637 = c16875.f55198;
        boolean z = interfaceC19637 instanceof InterfaceC3403;
        C1269 c1269 = this.f5711;
        if (z) {
            InterfaceC3403 interfaceC3403 = (InterfaceC3403) interfaceC19637;
            m5912((InterfaceC19637) interfaceC3403.getExpression());
            m5901(".");
            C14769 c14769 = c16875.f55197;
            EnumC21781 enumC21781 = EnumC21781.NO;
            m5906(c14769, enumC21781, enumC21781);
            c1269.m4611();
            m5908(interfaceC3403.mo11141());
            return null;
        }
        if (interfaceC19637 instanceof InterfaceC17068) {
            m5837((AbstractC22295) c16875);
            return null;
        }
        C14769 c147610 = c16875.f55197;
        EnumC21781 enumC21782 = EnumC21781.NO;
        m5906(c147610, enumC21782, enumC21782);
        c1269.m4611();
        m5912(interfaceC19637);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5877(C16985 c16985, Object obj) {
        m5921((InterfaceC19637) c16985);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        m5912(c16985.f55514);
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        c1269.m4606();
        m5912((InterfaceC19637) c16985.f55515);
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5878(C17073 c17073, Object obj) {
        m5921(c17073);
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5908(c17073.f55743);
        m5901(":");
        c1269.m4588();
        c1269.m4605();
        m5912(c17073.f55742);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5879(C17621 c17621, Object obj) {
        m5921((InterfaceC19637) c17621);
        int iM35551 = c17621.f57964.m35551();
        C16184 c16184 = this.f5709;
        C16184 c16185 = f5705;
        C1269 c1269 = this.f5711;
        if (iM35551 == 1) {
            InterfaceC19637 interfaceC19637 = (InterfaceC22049) C16625.m39331((Collection) c17621.f57964);
            if (interfaceC19637.mo2283() != EnumC22621.ASSIGNMENT) {
                boolean z = interfaceC19637.mo2283() == EnumC22621.NEW_ARRAY;
                if (z) {
                    c16184 = c16185;
                }
                c1269.m4595(c16184);
                m5901("@");
                m5912(c17621.f57962);
                m5901(MotionUtils.EASING_TYPE_FORMAT_START);
                if (!z) {
                    c1269.m4591();
                }
                m5912(interfaceC19637);
                c1269.m4605();
                m5901(MotionUtils.EASING_TYPE_FORMAT_END);
                return null;
            }
        }
        c1269.m4595(c16185);
        m5901("@");
        m5912(c17621.f57962);
        if (c17621.f57964.isEmpty()) {
            if (c1269.m4600(0).equals(C15867.of(MotionUtils.EASING_TYPE_FORMAT_START))) {
                m5901(MotionUtils.EASING_TYPE_FORMAT_START);
                m5901(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            c1269.m4605();
            return null;
        }
        c1269.m4595(c16184);
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        c1269.m4591();
        boolean zM39333 = C16625.m39333(c17621.f57964, new C21626());
        boolean z2 = false;
        for (InterfaceC19637 interfaceC19638 : c17621.f57964) {
            if (z2) {
                m5901(",");
                if (zM39333) {
                    c1269.m4588();
                } else {
                    c1269.m4609();
                }
            }
            if (interfaceC19638 instanceof InterfaceC16322) {
                InterfaceC16322 interfaceC16322 = (InterfaceC16322) interfaceC19638;
                boolean z3 = interfaceC16322.getExpression().mo2283() == EnumC22621.NEW_ARRAY;
                m5921(interfaceC16322);
                c1269.m4595(z3 ? c16185 : c16184);
                m5912(interfaceC16322.mo38746());
                c1269.m4606();
                m5901("=");
                if (z3) {
                    c1269.m4606();
                } else {
                    c1269.m4609();
                }
                m5912(interfaceC16322.getExpression());
                c1269.m4605();
            } else {
                m5912(interfaceC19638);
            }
            z2 = true;
        }
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        c1269.m4605();
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5880(C17731 c17731, Object obj) {
        m5921((InterfaceC19637) c17731);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        boolean z = false;
        for (InterfaceC19637 interfaceC19637 : c17731.f58264) {
            if (z) {
                c1269.m4611();
                m5901(a.p);
                c1269.m4606();
            }
            m5912(interfaceC19637);
            z = true;
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5881(C18565 c18565, Object obj) {
        m5921((InterfaceC19637) c18565);
        C1269 c1269 = this.f5711;
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        AbstractC22295 abstractC22295 = c18565.f60321;
        if (abstractC22295 != null) {
            m5912((InterfaceC19637) abstractC22295);
            c1269.m4591();
            m5901(".");
        }
        m5901("new");
        c1269.m4606();
        m5920(c18565.f60320, this.f5709);
        C7926 c7926 = c18565.f60319;
        if (c7926 != null) {
            C4395 c4395 = c7926.f26341;
            m5906(m5817(m5900((InterfaceC6387) c4395, (List) c4395.getAnnotations()), EnumC12830.HORIZONTAL, C15867.empty()), EnumC21781.NO, EnumC21781.YES);
        }
        m5912((InterfaceC19637) c18565.f60323);
        m5904((List) c18565.f60325, (AbstractC3506) c16184);
        c1269.m4605();
        C7926 c7927 = c18565.f60319;
        if (c7927 != null) {
            m5905(c7927.f26344, EnumC4627.YES, EnumC5373.YES);
        }
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5882(C19113 c19113, Object obj) {
        boolean z;
        C14769<InterfaceC11847> c14769M35543;
        AbstractC22295 abstractC22295M44236 = c19113.m44236();
        C1269 c1269 = this.f5711;
        if (abstractC22295M44236 != null) {
            m5917();
            AbstractC22295 abstractC22295M44237 = c19113.m44236();
            C10360 c10360M44237 = c19113.m44237();
            if (c10360M44237 == null) {
                c14769M35543 = C14769.m35543();
            } else {
                c14769M35543 = c10360M44237.f32979;
            }
            if (!c14769M35543.isEmpty()) {
                for (InterfaceC11847 interfaceC11847 : c14769M35543) {
                    c1269.m4588();
                    m5912((InterfaceC19637) interfaceC11847);
                }
                c1269.m4588();
            }
            c1269.m4595(this.f5709);
            m5901("package");
            c1269.m4606();
            m5834(abstractC22295M44237);
            c1269.m4605();
            m5901(l.b);
            c1269.m4588();
            z = true;
        } else {
            z = false;
        }
        m5919();
        if (!c19113.m44239().isEmpty()) {
            if (z) {
                c1269.m4596(AbstractC10217.f32658);
            }
            for (InterfaceC13098 interfaceC13098 : c19113.m44239()) {
                m5917();
                c1269.m4596(AbstractC10217.f32659);
                m5912(interfaceC13098);
                c1269.m4588();
            }
            z = true;
        }
        m5919();
        for (InterfaceC19637 interfaceC19637 : c19113.m44235()) {
            if (interfaceC19637.mo2283() != EnumC22621.IMPORT) {
                if (z) {
                    c1269.m4596(AbstractC10217.f32658);
                }
                m5917();
                m5912(interfaceC19637);
                c1269.m4588();
                m5919();
                z = true;
            }
        }
        C14835 c14835M44238 = c19113.m44238();
        if (c14835M44238 != null) {
            if (z) {
                c1269.m4596(AbstractC10217.f32658);
            }
            m5917();
            m5910((InterfaceC4149) c14835M44238);
            c1269.m4588();
        }
        m5917();
        return null;
    }

    @Override // l.C18891, l.C9940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo5883(InterfaceC19637 interfaceC19637, Object obj) {
        m5912(interfaceC19637);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5884(C20057 c20057, Object obj) {
        m5921(c20057);
        m5901("for");
        C1269 c1269 = this.f5711;
        c1269.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        C16184 c16184 = this.f5709;
        c1269.m4595(c16184);
        int iM35551 = c20057.f64457.m35551();
        C16184 c16185 = f5705;
        boolean z = true;
        c1269.m4595((iM35551 <= 1 || ((InterfaceC7132) c20057.f64457.get(0)).mo2283() != EnumC22621.EXPRESSION_STATEMENT) ? c16185 : c16184);
        if (c20057.f64457.isEmpty()) {
            m5901(l.b);
        } else if (((InterfaceC7132) c20057.f64457.get(0)).mo2283() == EnumC22621.VARIABLE) {
            InterfaceC9802 interfaceC9802M20913 = C7676.m20913(c20057.f64457.iterator());
            m5907(m5816(interfaceC9802M20913, (InterfaceC19637) interfaceC9802M20913.next()), EnumC22527.NONE, EnumC12830.HORIZONTAL);
        } else {
            c1269.m4595(c16185);
            boolean z2 = false;
            for (InterfaceC7132 interfaceC7132 : c20057.f64457) {
                if (z2) {
                    m5901(",");
                    c1269.m4609();
                }
                m5912((InterfaceC19637) ((InterfaceC4895) interfaceC7132).getExpression());
                z2 = true;
            }
            m5901(l.b);
            c1269.m4605();
        }
        c1269.m4605();
        c1269.m4609();
        AbstractC22295 abstractC22295 = c20057.f64458;
        if (abstractC22295 != null) {
            m5912((InterfaceC19637) abstractC22295);
        }
        m5901(l.b);
        if (c20057.f64455.isEmpty()) {
            c1269.m4606();
        } else {
            c1269.m4609();
            if (c20057.f64455.m35551() <= 1) {
                c16184 = c16185;
            }
            c1269.m4595(c16184);
            for (InterfaceC4895 interfaceC4895 : c20057.f64455) {
                if (!z) {
                    m5901(",");
                    c1269.m4611();
                }
                m5912((InterfaceC19637) interfaceC4895.getExpression());
                z = false;
            }
            c1269.m4610(l.b);
            c1269.m4605();
        }
        c1269.m4605();
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        m5827(c20057.f64456, EnumC10592.YES, EnumC9691.YES, EnumC2980.NO);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5885(C20605 c20605, Object obj) {
        m5921((InterfaceC19637) c20605);
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c20605.f66030);
        c1269.m4606();
        m5835(C3881.m12511((InterfaceC22049) c20605));
        c1269.m4606();
        m5912((InterfaceC19637) c20605.f66031);
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5886(C20715 c20715, Object obj) {
        m5901("uses");
        this.f5711.m4606();
        m5912((InterfaceC19637) c20715.f66388);
        m5901(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5887(C21351 c21351, Object obj) {
        EnumC24528 enumC24528 = c21351.f68011;
        InterfaceC19637 interfaceC19637 = c21351.f68008;
        m5921(c21351);
        m5917();
        C1269 c1269 = this.f5711;
        c1269.m4588();
        C14769<InterfaceC19637> c14769 = c21351.f68007;
        boolean z = false;
        boolean z2 = c14769.m35551() == 1 && ((InterfaceC6628) C16625.m39331((Collection) c14769)).mo2283().name().equals("DEFAULT_CASE_LABEL");
        boolean zEquals = enumC24528.equals(EnumC24528.RULE);
        C16184 c16184 = f5705;
        c1269.m4595(zEquals ? this.f5709 : c16184);
        if (z2) {
            m5902("default", c16184);
        } else {
            m5902("case", c16184);
            c1269.m4595(c16184);
            c1269.m4606();
            for (InterfaceC19637 interfaceC19638 : c14769) {
                if (z) {
                    m5901(",");
                    c1269.m4609();
                }
                m5912(interfaceC19638);
                z = true;
            }
            c1269.m4605();
        }
        int i = C1489.f5185[enumC24528.ordinal()];
        if (i == 1) {
            m5901(":");
            c1269.m4595(this.f5708);
            m5903(c21351.m48574());
            c1269.m4605();
            c1269.m4605();
            return null;
        }
        if (i != 2) {
            return null;
        }
        c1269.m4606();
        m5901("-");
        m5901(">");
        if (interfaceC19637.mo2283() == EnumC22621.BLOCK) {
            c1269.m4605();
            c1269.m4606();
            m5913((InterfaceC20798) interfaceC19637, EnumC10592.YES, EnumC9691.NO, EnumC2980.NO);
        } else {
            c1269.m4609();
            m5912(interfaceC19637);
            c1269.m4605();
        }
        c1269.m4610(l.b);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5888(C21549 c21549, Object obj) {
        AbstractC22295 abstractC22295 = c21549.f68829;
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        if (abstractC22295 != null) {
            c1269.m4595(c16184);
            m5901("new");
            c1269.m4606();
            C15658 c15658M33062 = C13421.m33062(c21549.f68829, EnumC20134.YES);
            InterfaceC19637 interfaceC19637 = c15658M33062.f50885;
            ArrayDeque arrayDeque = new ArrayDeque(c21549.f68830);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(AbstractC1928.copyOf((Collection) c21549.f68828));
            arrayDeque2.addAll(c21549.f68831);
            arrayDeque2.addAll(c15658M33062.f50884);
            m5912(interfaceC19637);
            c1269.m4595(f5705);
            m5825(arrayDeque, (Deque) arrayDeque2);
            c1269.m4605();
            c1269.m4605();
        }
        C14769 c14769 = c21549.f68827;
        if (c14769 != null) {
            if (c14769.isEmpty()) {
                AbstractC3506 abstractC3506 = this.f5708;
                m5909(abstractC3506);
                if (c1269.m4600(0).equals(C15867.of(","))) {
                    m5901(",");
                }
                m5902(l.d, abstractC3506);
                return null;
            }
            c1269.m4595(c16184);
            m5901("{");
            int iM35551 = c14769.m35551();
            boolean z = true;
            for (int i = 0; i < iM35551; i++) {
                InterfaceC19637 interfaceC19638 = (InterfaceC22049) c14769.get(i);
                if (m5838()) {
                    c1269.m4588();
                    z = false;
                }
                m5912(interfaceC19638);
                if (((String) c1269.m4600(0).orElseThrow()).equals(",")) {
                    if (m5838()) {
                        c1269.m4588();
                        z = false;
                    }
                    m5901(",");
                    if (i != iM35551 - 1) {
                        c1269.m4606();
                    }
                }
            }
            c1269.m4605();
            if (!((z && m5838()) ? false : z)) {
                c1269.m4588();
            }
            m5901(l.d);
        }
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5889(C22207 c22207, Object obj) {
        m5901("requires");
        C1269 c1269 = this.f5711;
        c1269.m4606();
        while (true) {
            if (c1269.m4600(0).equals(C15867.of("static"))) {
                m5901("static");
                c1269.m4606();
            } else if (c1269.m4600(0).equals(C15867.of("transitive"))) {
                m5901("transitive");
                c1269.m4606();
            } else {
                m5912((InterfaceC19637) c22207.f71540);
                m5901(l.b);
                return null;
            }
        }
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5890(C22953 c22953, Object obj) {
        m5921(c22953);
        m5919();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5891(C23041 c23041, Object obj) {
        m5921((InterfaceC19637) c23041);
        m5915((AbstractC22295) c23041);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5892(C23589 c23589, Object obj) {
        m5921((InterfaceC19637) c23589);
        m5837((AbstractC22295) c23589);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5893(C23699 c23699, Object obj) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5894(C23787 c23787, Object obj) {
        m5921((InterfaceC19637) c23787);
        String strM12510 = C3881.m12510(c23787, m43808());
        if (!strM12510.startsWith("\"\"\"")) {
            if (strM12510.startsWith("-")) {
                m5901("-");
                strM12510 = strM12510.substring(1).trim();
            }
            m5901(strM12510);
            return null;
        }
        String strM48705 = C21406.m48705(strM12510);
        ArrayList arrayListM2542 = C0547.m2542(strM12510);
        String strM2544 = C0547.m2544((String) C1170.stream(arrayListM2542).skip(1L).collect(C2025.joining(strM48705)));
        String str = (String) C16625.m39339(arrayListM2542);
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        int length2 = str.substring(0, length).length();
        String str2 = (String) C15702.m37479(C1170.stream(C0547.m2542(strM2544))).orElseThrow();
        int length3 = str2.length();
        while (length3 > 0) {
            int iCodePointBefore2 = Character.codePointBefore(str2, length3);
            if (!Character.isWhitespace(iCodePointBefore2)) {
                break;
            }
            length3 -= Character.charCount(iCodePointBefore2);
        }
        if (length2 == str2.substring(0, length3).length()) {
            int i = this.f5712;
            C16184 c16184M38411 = C16184.m38411(Integer.MIN_VALUE / i, i);
            C1269 c1269 = this.f5711;
            c1269.getClass();
            c1269.m4597(EnumC10963.UNIFIED, "", c16184M38411);
        }
        m5901(strM12510);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5895(C24335 c24335, Object obj) {
        m5921(c24335);
        C12510 c12510 = c24335.f78930;
        m5916(EnumC22527.PARAMETER, EnumC12830.HORIZONTAL, C15867.of(c12510.f40170), c12510.f40166, c12510.f40164, "", C15867.empty(), C15867.empty(), C15867.empty(), C15867.empty());
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5896(C24445 c24445, Object obj) {
        m5921((InterfaceC19637) c24445);
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5901("?");
        if (c24445.f79357 != null) {
            c1269.m4595(this.f5709);
            c1269.m4606();
            m5901(c24445.mo2283() == EnumC22621.EXTENDS_WILDCARD ? "extends" : "super");
            c1269.m4609();
            m5912(c24445.f79357);
            c1269.m4605();
        }
        c1269.m4605();
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5897(C24533 c24533, Object obj) {
        m5921((InterfaceC19637) c24533);
        if (((AbstractC19728) C3881.m12512((InterfaceC20557) c24533)).mo9945("log")) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Object expression = c24533;
            while (expression instanceof InterfaceC20557) {
                InterfaceC20557 interfaceC20557 = (InterfaceC20557) expression;
                arrayDeque.addFirst(interfaceC20557);
                if (f5703.contains(C3881.m12512(interfaceC20557).toString())) {
                    Cloneable cloneableMo47123 = interfaceC20557.mo47123();
                    expression = cloneableMo47123 instanceof InterfaceC3403 ? ((InterfaceC3403) cloneableMo47123).getExpression() : null;
                }
            }
            if (expression instanceof InterfaceC19811) {
                arrayDeque.addFirst(expression);
                m5826((List) AbstractC1928.copyOf((Collection) arrayDeque), false, (AbstractCollection) AbstractC1928.of((Object) Integer.valueOf(arrayDeque.size() - 1)), EnumC10963.INDEPENDENT);
                return null;
            }
        }
        m5915((AbstractC22295) c24533);
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5898(C25191 c25191, Object obj) {
        m5921((InterfaceC19637) c25191);
        if (c25191.f81424.isEmpty()) {
            m5912((InterfaceC19637) c25191.f81425);
            m5901("<");
            m5901(">");
            return null;
        }
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c25191.f81425);
        m5901("<");
        c1269.m4591();
        c1269.m4595(f5705);
        boolean z = false;
        for (InterfaceC19637 interfaceC19637 : c25191.f81424) {
            if (z) {
                m5901(",");
                c1269.m4609();
            }
            m5912(interfaceC19637);
            z = true;
        }
        c1269.m4605();
        c1269.m4605();
        m5901(">");
        return null;
    }

    @Override // l.C9940, l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5899(C25279 c25279, Object obj) {
        m5921((InterfaceC19637) c25279);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912((InterfaceC19637) c25279.f81646);
        c1269.m4609();
        c1269.m4595(f5705);
        m5901("instanceof");
        c1269.m4609();
        if (c25279.m56439() != null) {
            m5912(c25279.m56439());
        } else {
            m5912(c25279.getType());
        }
        c1269.m4605();
        c1269.m4605();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C7148 c7148 = new C7148();
        AbstractC14956 abstractC14956ListIterator = AbstractC1928.of((Object) "org.jspecify.annotations.NonNull", (Object) "org.jspecify.annotations.Nullable", (Object) "org.jspecify.annotations.Nullable", (Object) "org.checkerframework.checker.nullness.qual.NonNull", (Object) "org.checkerframework.checker.nullness.qual.Nullable").listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            String str = (String) abstractC14956ListIterator.next();
            c7148.m19713(str.substring(str.lastIndexOf(46) + 1), str);
        }
        f5704 = c7148.m19712();
        f5705 = C16184.f52525;
        f5703 = AbstractC8639.m23277("at", "atConfig", "atDebug", "atFine", "atFiner", "atFinest", "atInfo", "atMostEvery", "atSevere", "atWarning", "every", "log", "logVarargs", "perUnique", "withCause", "withStackTrace");
        Pattern.compile("%|\\{[0-9]\\}");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5825(ArrayDeque arrayDeque, Deque deque) {
        while (true) {
            boolean z = false;
            while (true) {
                C1269 c1269 = this.f5711;
                if (c1269.m4600(0).isPresent()) {
                    String str = (String) c1269.m4600(0).get();
                    str.getClass();
                    switch (str) {
                        case ".":
                            if (((String) c1269.m4600(0).get()).equals(".") && ((String) c1269.m4600(1).get()).equals(".")) {
                                if (z) {
                                    c1269.m4611();
                                } else {
                                    c1269.m4601();
                                }
                                c1269.m4602("...");
                                break;
                            }
                            return;
                        case "@":
                            if (!deque.isEmpty()) {
                                List list = (List) deque.removeFirst();
                                if (!list.isEmpty()) {
                                    c1269.m4611();
                                    EnumC21781 enumC21781 = EnumC21781.NO;
                                    m5906(list, enumC21781, enumC21781);
                                    z = true;
                                }
                                break;
                            } else {
                                return;
                            }
                            break;
                        case "[":
                            if (z) {
                                c1269.m4611();
                            }
                            m5901("[");
                            if (!((String) c1269.m4600(0).get()).equals("]")) {
                                m5912((InterfaceC19637) arrayDeque.removeFirst());
                            }
                            m5901("]");
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5919() {
        C1269 c1269 = this.f5711;
        if (c1269.m4600(0).equals(C15867.of(l.b))) {
            while (c1269.m4600(0).equals(C15867.of(l.b))) {
                c1269.m4588();
                m5917();
                m5901(l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5831(AbstractC1928 abstractC1928) {
        if (abstractC1928 != null) {
            AbstractC14956 abstractC14956ListIterator = abstractC1928.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                String strMo18733 = ((InterfaceC20660) abstractC14956ListIterator.next()).mo18733();
                for (int i = 0; i < strMo18733.length(); i++) {
                    char cCharAt = strMo18733.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\n') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5917() {
        if (((Boolean) this.f5707.peekLast()).booleanValue()) {
            return;
        }
        this.f5711.m4613();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5912(InterfaceC19637 interfaceC19637) {
        boolean z = interfaceC19637 instanceof InterfaceC22049;
        ArrayDeque arrayDeque = this.f5707;
        arrayDeque.addLast(Boolean.valueOf(z || ((Boolean) arrayDeque.peekLast()).booleanValue()));
        C1269 c1269 = this.f5711;
        int iM4604 = c1269.m4604();
        try {
            try {
                super.mo5883(interfaceC19637, (Object) null);
                arrayDeque.removeLast();
                c1269.m4592(iM4604);
            } catch (Throwable th) {
                arrayDeque.removeLast();
                throw th;
            }
        } catch (C17676 e) {
            throw e;
        } catch (Throwable th2) {
            int i = C23074.f74856;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            throw new C17676(c1269.m4590(stringWriter.toString()));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m5837(AbstractC22295 abstractC22295) {
        C15658 c15658M33062 = C13421.m33062(abstractC22295, EnumC20134.YES);
        C16184 c16184 = this.f5709;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        m5912(c15658M33062.f50885);
        ArrayDeque arrayDeque = new ArrayDeque(c15658M33062.f50884);
        m5833(arrayDeque);
        if (!arrayDeque.isEmpty()) {
            throw new C13377();
        }
        c1269.m4605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5907(List list, EnumC22527 enumC22527, EnumC12830 enumC12830) {
        boolean z = false;
        if (list.size() == 1) {
            InterfaceC17399 interfaceC17399 = (InterfaceC17399) list.get(0);
            m5916(enumC22527, enumC12830, C15867.of(interfaceC17399.mo31063()), interfaceC17399.getType(), interfaceC17399.getName(), "=", C15867.ofNullable(interfaceC17399.mo31062()), C15867.of(l.b), C15867.empty(), C15867.ofNullable(m5819(false, 0, interfaceC17399.getType())));
            return;
        }
        C1269 c1269 = this.f5711;
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        C4395 c4395Mo31063 = ((InterfaceC17399) list.get(0)).mo31063();
        InterfaceC19637 type = ((InterfaceC17399) list.get(0)).getType();
        m5906(m5817(m5900((InterfaceC6387) c4395Mo31063, (List) c4395Mo31063.getAnnotations()), enumC12830, C15867.empty()), EnumC21781.NO, EnumC21781.YES);
        C16184 c16185 = this.f5709;
        c1269.m4595(c16185);
        c1269.m4595(c16184);
        C15658 c15658M33062 = C13421.m33062(type, EnumC20134.YES);
        ArrayDeque arrayDeque = new ArrayDeque(c15658M33062.f50884);
        m5912(c15658M33062.f50885);
        int size = arrayDeque.size();
        m5833(arrayDeque);
        int size2 = size - arrayDeque.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17399 interfaceC173910 = (InterfaceC17399) it.next();
            if (z) {
                m5901(",");
            }
            ArrayDeque arrayDeque2 = new ArrayDeque(m5819(z, size2, interfaceC173910.getType()).f50884);
            c1269.m4609();
            c1269.m4595(c16184);
            m5833(arrayDeque2);
            m5908(interfaceC173910.getName());
            m5833(arrayDeque2);
            AbstractC22295 abstractC22295Mo31062 = interfaceC173910.mo31062();
            if (abstractC22295Mo31062 != null) {
                c1269.m4606();
                m5901("=");
                c1269.m4595(c16185);
                c1269.m4609();
                m5912((InterfaceC19637) abstractC22295Mo31062);
                c1269.m4605();
            }
            c1269.m4605();
            if (!z) {
                c1269.m4605();
            }
            z = true;
        }
        c1269.m4605();
        m5901(l.b);
        c1269.m4605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15658 m5819(boolean z, int i, InterfaceC19637 interfaceC19637) {
        if (interfaceC19637 == null) {
            return null;
        }
        if (!z) {
            return C13421.m33062(interfaceC19637, EnumC20134.YES);
        }
        AbstractC1928 abstractC1928SubList = C13421.m33062(interfaceC19637, EnumC20134.NO).f50884;
        if (i > 0) {
            abstractC1928SubList = abstractC1928SubList.subList(0, abstractC1928SubList.size() - i);
        }
        return new C15658(null, abstractC1928SubList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m5835(String str) {
        for (int i = 0; i < str.length(); i++) {
            m5901(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5908(InterfaceC3058 interfaceC3058) {
        m5901(interfaceC3058.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5914(InterfaceC22049 interfaceC22049, List list) {
        m5901("switch");
        C1269 c1269 = this.f5711;
        c1269.m4606();
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        m5912((InterfaceC19637) ((InterfaceC10114) interfaceC22049).getExpression());
        m5901(MotionUtils.EASING_TYPE_FORMAT_END);
        c1269.m4606();
        C16184 c16184 = this.f5708;
        m5909(c16184);
        c1269.m4596(AbstractC10217.f32657);
        c1269.m4595(c16184);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC4390 interfaceC4390 = (InterfaceC4390) it.next();
            if (z) {
                c1269.m4596(AbstractC10217.f32659);
            }
            m5912(interfaceC4390);
            z = true;
        }
        c1269.m4605();
        c1269.m4588();
        c1269.m4596(AbstractC10217.f32657);
        m5902(l.d, this.f5709);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5906(List list, EnumC21781 enumC21781, EnumC21781 enumC21782) {
        if (list.isEmpty()) {
            return;
        }
        boolean zM49393 = enumC21781.m49393();
        C1269 c1269 = this.f5711;
        if (zM49393) {
            c1269.m4611();
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC11847 interfaceC11847 = (InterfaceC11847) it.next();
            if (z) {
                c1269.m4611();
            }
            m5912((InterfaceC19637) interfaceC11847);
            z = true;
        }
        if (enumC21782.m49393()) {
            c1269.m4611();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5913(InterfaceC20798 interfaceC20798, EnumC10592 enumC10592, EnumC9691 enumC9691, EnumC2980 enumC2980) {
        m5921(interfaceC20798);
        boolean zMo13406 = interfaceC20798.mo13406();
        C1269 c1269 = this.f5711;
        if (zMo13406) {
            m5901("static");
            c1269.m4606();
        }
        boolean zM27039 = enumC10592.m27039();
        C16184 c16184 = this.f5708;
        if (zM27039 && interfaceC20798.mo13407().isEmpty()) {
            if (c1269.m4600(0).equals(C15867.of(l.b))) {
                m5901(l.b);
                return;
            }
            m5909(c16184);
            c1269.m4596(AbstractC10217.f32657);
            m5902(l.d, c16184);
            return;
        }
        c1269.m4595(f5705);
        c1269.m4595(c16184);
        m5909(c16184);
        if (enumC9691 == EnumC9691.NO) {
            c1269.m4596(AbstractC10217.f32657);
        } else {
            c1269.m4596(AbstractC10217.f32659);
        }
        m5903(interfaceC20798.mo13407());
        c1269.m4605();
        c1269.m4588();
        c1269.m4605();
        if (enumC2980 == EnumC2980.NO) {
            c1269.m4596(AbstractC10217.f32657);
        } else {
            c1269.m4596(AbstractC10217.f32659);
        }
        m5917();
        m5902(l.d, c16184);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5827(InterfaceC7132 interfaceC7132, EnumC10592 enumC10592, EnumC9691 enumC9691, EnumC2980 enumC2980) {
        m5921(interfaceC7132);
        int i = C1489.f5186[interfaceC7132.mo2283().ordinal()];
        C1269 c1269 = this.f5711;
        if (i == 8) {
            c1269.m4606();
            m5913((InterfaceC20798) interfaceC7132, enumC10592, enumC9691, enumC2980);
            return;
        }
        c1269.m4595(this.f5708);
        if (m5838()) {
            c1269.m4588();
        } else {
            c1269.m4609();
        }
        m5912(interfaceC7132);
        c1269.m4605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5903(List list) {
        EnumC12830 enumC12830;
        InterfaceC9802 interfaceC9802M20913 = C7676.m20913(list.iterator());
        m5919();
        boolean z = false;
        while (interfaceC9802M20913.hasNext()) {
            InterfaceC19637 interfaceC19637 = (InterfaceC7132) interfaceC9802M20913.next();
            C1269 c1269 = this.f5711;
            c1269.m4588();
            if (z) {
                c1269.m4596(AbstractC10217.f32659);
            }
            m5917();
            ArrayList arrayListM5816 = m5816(interfaceC9802M20913, interfaceC19637);
            if (!arrayListM5816.isEmpty()) {
                EnumC22527 enumC22527 = EnumC22527.NONE;
                C4395 c4395Mo31063 = ((InterfaceC17399) arrayListM5816.get(0)).mo31063();
                Iterator it = c4395Mo31063.f15824.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((InterfaceC11847) it.next()).mo29688().isEmpty()) {
                        i++;
                    }
                }
                if (i <= 1 && i == c4395Mo31063.f15824.m35551()) {
                    enumC12830 = EnumC12830.HORIZONTAL;
                } else {
                    enumC12830 = EnumC12830.VERTICAL;
                }
                m5907(arrayListM5816, enumC22527, enumC12830);
            } else {
                m5912(interfaceC19637);
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1928 m5817(AbstractC15067 abstractC15067, EnumC12830 enumC12830, C15867 c15867) {
        AbstractC1928 abstractC1928Of;
        AbstractC1928 abstractC1928Of2;
        if (abstractC15067.mo28181().isEmpty()) {
            return abstractC15067.mo28182();
        }
        ArrayDeque arrayDeque = new ArrayDeque(abstractC15067.mo28181());
        C1269 c1269 = this.f5711;
        C16184 c16184 = f5705;
        c1269.m4595(c16184);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!arrayDeque.isEmpty() && !((AbstractC14166) arrayDeque.peekFirst()).mo19837().equals(EnumC7455.MODIFIER)) {
            if (z2) {
                if (!enumC12830.m31837()) {
                    abstractC1928Of2 = AbstractC1928.of((Object) C22152.m50111(EnumC10963.UNIFIED, " ", c16184, c15867));
                } else {
                    abstractC1928Of2 = AbstractC1928.of((Object) C22152.m50111(EnumC10963.FORCED, "", C16184.f52525, c15867));
                }
                c1269.m4594(abstractC1928Of2);
            }
            m5824(arrayDeque);
            z2 = true;
            z3 = true;
        }
        c1269.m4605();
        if (!enumC12830.m31837()) {
            abstractC1928Of = AbstractC1928.of((Object) C22152.m50111(EnumC10963.UNIFIED, " ", c16184, c15867));
        } else {
            abstractC1928Of = AbstractC1928.of((Object) C22152.m50111(EnumC10963.FORCED, "", C16184.f52525, c15867));
        }
        if (arrayDeque.isEmpty()) {
            c1269.m4594(abstractC1928Of);
            return abstractC15067.mo28182();
        }
        if (z3) {
            c1269.m4594(abstractC1928Of);
        }
        c1269.m4595(c16184);
        while (!arrayDeque.isEmpty()) {
            if (z) {
                c1269.m4606();
            }
            m5824(arrayDeque);
            z = true;
        }
        c1269.m4605();
        c1269.m4606();
        return abstractC15067.mo28182();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11183 m5900(InterfaceC6387 interfaceC6387, List list) {
        boolean zIsEmpty = list.isEmpty();
        C1269 c1269 = this.f5711;
        if (zIsEmpty) {
            String str = (String) c1269.m4600(0).get();
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
                        b = cb.f82047l;
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
                    return new C11183(AbstractC1928.of(), AbstractC1928.of());
            }
        }
        final C24654 c24654M55012 = C24654.m55012();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19637 interfaceC19637 = (InterfaceC11847) it.next();
            Integer numValueOf = Integer.valueOf(C3881.m12509(interfaceC19637));
            AbstractC8036 abstractC8036 = (AbstractC8036) interfaceC19637;
            AbstractC11194 abstractC11194 = ((C19113) m43808().m20985()).f61860;
            abstractC8036.getClass();
            c24654M55012.mo12238(C2346.m7914(numValueOf, Integer.valueOf(C11239.m28320(abstractC8036, abstractC11194))));
        }
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) C15702.m37481(C1170.stream(c1269.m4589(C3881.m12509(interfaceC6387), new C18642(0, c24654M55012))).filter(new Predicate() { // from class: l.֡᩹ܽ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !c24654M55012.mo12240(Integer.valueOf(((InterfaceC20660) obj).getPosition()));
            }
        }).map(new C8201()), C1170.stream(list).map(new C19388())).sorted().collect(C2025.toList()));
        C22811 c22811 = new C22811();
        for (int size = abstractC1928CopyOf.size() - 1; size >= 0; size--) {
            AbstractC14166 abstractC14166 = (AbstractC14166) abstractC1928CopyOf.get(size);
            if (abstractC14166.mo19837().equals(EnumC7455.ANNOTATION)) {
                Cloneable cloneableMo29687 = abstractC14166.mo23411().mo29687();
                if (!(cloneableMo29687 instanceof InterfaceC19811) ? false : this.f5706.contains(((InterfaceC19811) cloneableMo29687).getName())) {
                    c22811.m19807(abstractC14166.mo23411());
                }
            }
            return new C11183(abstractC1928CopyOf.subList(0, size + 1), c22811.m51441().mo6620());
        }
        return new C11183(abstractC1928CopyOf.subList(0, size + 1), c22811.m51441().mo6620());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5824(ArrayDeque arrayDeque) {
        AbstractC14166 abstractC14166 = (AbstractC14166) arrayDeque.removeFirst();
        int iOrdinal = abstractC14166.mo19837().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            m5912((InterfaceC19637) abstractC14166.mo23411());
        } else {
            m5901(abstractC14166.mo19836().getText());
            if (abstractC14166.mo19836().getText().equals("non")) {
                m5901(((AbstractC14166) arrayDeque.removeFirst()).mo19836().getText());
                m5901(((AbstractC14166) arrayDeque.removeFirst()).mo19836().getText());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5821(int i, InterfaceC22049 interfaceC22049, ArrayList arrayList, ArrayList arrayList2) {
        if (interfaceC22049 instanceof InterfaceC23782) {
            InterfaceC23782 interfaceC23782 = (InterfaceC23782) interfaceC22049;
            if (C11239.m28322(((AbstractC8036) interfaceC23782).mo2285()) == i) {
                m5821(i, interfaceC23782.mo18214(), arrayList, arrayList2);
                arrayList2.add(C3881.m12511(interfaceC22049));
                m5821(i, interfaceC23782.mo18215(), arrayList, arrayList2);
                return;
            }
            arrayList.add(interfaceC22049);
            return;
        }
        arrayList.add(interfaceC22049);
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
    public final void m5911(l.C15867 r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1644.m5911(l.ܶۚۗ, java.util.List):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5910(InterfaceC4149 interfaceC4149) {
        C1269 c1269;
        AbstractC10217 abstractC10217;
        Iterator it = interfaceC4149.getAnnotations().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1269 = this.f5711;
            if (!zHasNext) {
                break;
            }
            m5912((InterfaceC19637) it.next());
            c1269.m4588();
        }
        if (interfaceC4149.mo13304() == EnumC24287.OPEN) {
            m5901("open");
            c1269.m4606();
        }
        m5901(am.e);
        c1269.m4606();
        m5912((InterfaceC19637) interfaceC4149.getName());
        c1269.m4606();
        boolean zIsEmpty = interfaceC4149.mo13303().isEmpty();
        C16184 c16184 = this.f5708;
        if (zIsEmpty) {
            m5909(c16184);
            c1269.m4596(AbstractC10217.f32657);
            m5902(l.d, c16184);
            return;
        }
        c1269.m4595(c16184);
        m5901("{");
        c1269.m4588();
        C15867 c15867Empty = C15867.empty();
        for (InterfaceC1407 interfaceC1407 : interfaceC4149.mo13303()) {
            m5917();
            if (((Boolean) c15867Empty.map(new C21659(1, interfaceC1407)).orElse(Boolean.FALSE)).booleanValue()) {
                abstractC10217 = AbstractC10217.f32658;
            } else {
                abstractC10217 = AbstractC10217.f32657;
            }
            c1269.m4596(abstractC10217);
            c1269.m4588();
            m5912(interfaceC1407);
            c15867Empty = C15867.of(interfaceC1407.mo2283());
        }
        c1269.m4605();
        c1269.m4588();
        m5901(l.d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5822(String str, String str2, InterfaceC22049 interfaceC22049, List list) {
        m5901(str);
        C1269 c1269 = this.f5711;
        c1269.m4606();
        m5912((InterfaceC19637) interfaceC22049);
        if (list != null) {
            c1269.m4595(this.f5709);
            c1269.m4606();
            m5901(str2);
            c1269.m4588();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC22049 interfaceC220410 = (InterfaceC22049) it.next();
                if (z) {
                    m5901(",");
                    c1269.m4588();
                }
                m5912((InterfaceC19637) interfaceC220410);
                z = true;
            }
            m5901(l.b);
            c1269.m4605();
            return;
        }
        m5901(l.b);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m5834(InterfaceC19637 interfaceC19637) {
        ArrayDeque<InterfaceC3058> arrayDeque = new ArrayDeque();
        while (interfaceC19637 instanceof InterfaceC3403) {
            InterfaceC3403 interfaceC3403 = (InterfaceC3403) interfaceC19637;
            arrayDeque.addFirst(interfaceC3403.mo11141());
            interfaceC19637 = interfaceC3403.getExpression();
        }
        arrayDeque.addFirst(((InterfaceC19811) interfaceC19637).getName());
        boolean z = false;
        for (InterfaceC3058 interfaceC3058 : arrayDeque) {
            if (z) {
                m5901(".");
            }
            m5901(interfaceC3058.toString());
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5830(EnumC22527 enumC22527, EnumC12830 enumC12830, InterfaceC17399 interfaceC17399, C15867 c15867, String str, C15867 c15868) {
        C15867 c15867Empty;
        InterfaceC19637 interfaceC19637;
        m5921(interfaceC17399);
        if (interfaceC17399.getType() != null) {
            C15658 c15658M33062 = C13421.m33062(interfaceC17399.getType(), EnumC20134.YES);
            C15867 c15867Of = C15867.of(c15658M33062);
            interfaceC19637 = c15658M33062.f50885;
            c15867Empty = c15867Of;
        } else {
            c15867Empty = C15867.empty();
            interfaceC19637 = null;
        }
        m5916(enumC22527, enumC12830, C15867.of(interfaceC17399.mo31063()), interfaceC19637, interfaceC17399.getName(), str, c15867, c15868, C15867.empty(), c15867Empty);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5918(List list, AbstractC3506 abstractC3506) {
        C1269 c1269 = this.f5711;
        c1269.m4595(abstractC3506);
        c1269.m4595(f5705);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC1738 interfaceC1738 = (InterfaceC1738) it.next();
            if (z) {
                m5901(",");
                c1269.m4609();
            }
            m5912(interfaceC1738);
            z = true;
        }
        m5901(">");
        c1269.m4605();
        c1269.m4605();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:104:0x0225  */
    /* JADX WARN: Code duplicated, block: B:109:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x0270  */
    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0281  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02af  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02be  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:162:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x034b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0351  */
    /* JADX WARN: Code duplicated, block: B:171:0x037b  */
    /* JADX WARN: Code duplicated, block: B:175:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[LOOP:0: B:3:0x0009->B:178:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:2: B:34:0x00bd->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5915(AbstractC22295 abstractC22295) {
        InterfaceC22049 interfaceC22049;
        boolean z;
        AbstractC1928 abstractC1928M51441;
        EnumC0898 enumC0898Mo1347;
        C15867 c15867Empty;
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
        InterfaceC22049 interfaceC220410;
        boolean z6;
        Iterator it2;
        boolean zM5832;
        boolean zM5833;
        boolean z7;
        AbstractC3506 abstractC3506;
        InterfaceC20557 interfaceC20557;
        InterfaceC3058 interfaceC3058M12512;
        String str;
        AbstractC19728 abstractC19728;
        boolean z8;
        AbstractC3506 abstractC3507;
        boolean z9;
        Object obj;
        InterfaceC12455 interfaceC12455M4608;
        Object obj2;
        EnumC10963 enumC10963;
        String string;
        ArrayDeque<InterfaceC22049> arrayDeque = new ArrayDeque();
        InterfaceC22049 expression = abstractC22295;
        while (true) {
            arrayDeque.addFirst(expression);
            if (expression.mo2283() == EnumC22621.ARRAY_ACCESS) {
                expression = m5820(expression);
            }
            interfaceC22049 = null;
            switch (C1489.f5186[expression.mo2283().ordinal()]) {
                case 9:
                    expression = ((InterfaceC3403) expression).getExpression();
                    if (expression == null) {
                        interfaceC22049 = expression;
                    }
                    break;
                case 10:
                    Cloneable cloneableMo47123 = ((InterfaceC20557) expression).mo47123();
                    expression = cloneableMo47123 instanceof InterfaceC3403 ? ((InterfaceC3403) cloneableMo47123).getExpression() : null;
                    if (expression == null) {
                        interfaceC22049 = expression;
                    }
                    break;
                case 11:
                    break;
                default:
                    interfaceC22049 = (InterfaceC22049) arrayDeque.removeFirst();
                    break;
            }
        }
        ArrayList arrayList = new ArrayList(arrayDeque);
        AbstractC3506 abstractC3508 = this.f5709;
        String str2 = ".";
        AbstractC3506 abstractC3509 = f5705;
        C1269 c1269 = this.f5711;
        int i5 = 1;
        int i6 = 0;
        if (interfaceC22049 != null) {
            if (interfaceC22049.mo2283() == EnumC22621.NEW_CLASS && ((InterfaceC21303) interfaceC22049).mo43141() != null) {
                c1269.m4595(abstractC3509);
                m5912(m5820(interfaceC22049));
                m5901(".");
                z = false;
            } else {
                m5912(m5820(interfaceC22049));
                c1269.m4595(abstractC3508);
                z = true;
            }
            ArrayDeque arrayDeque2 = new ArrayDeque();
            InterfaceC22049 expression2 = interfaceC22049;
            while (expression2 instanceof InterfaceC25274) {
                InterfaceC25274 interfaceC25274 = (InterfaceC25274) expression2;
                arrayDeque2.addLast(interfaceC25274.getIndex());
                expression2 = interfaceC25274.getExpression();
            }
            m5836(arrayDeque2);
            if (arrayDeque.isEmpty()) {
                c1269.m4605();
                return;
            }
        } else {
            z = false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i7 = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        for (InterfaceC22049 interfaceC220411 : arrayDeque) {
            boolean z10 = interfaceC220411.mo2283() == EnumC22621.ARRAY_ACCESS;
            InterfaceC22049 interfaceC22049M5820 = m5820(interfaceC220411);
            switch (C1489.f5186[interfaceC22049M5820.mo2283().ordinal()]) {
                case 9:
                    c22811.m19807(((InterfaceC3403) interfaceC22049M5820).mo11141().toString());
                    if (z10) {
                    }
                    break;
                case 10:
                    c22811.m19807(C3881.m12512((InterfaceC20557) interfaceC22049M5820).toString());
                    break;
                case 11:
                    c22811.m19807(((InterfaceC19811) interfaceC22049M5820).getName().toString());
                    if (z10) {
                    }
                    break;
            }
            abstractC1928M51441 = c22811.m51441();
            enumC0898Mo1347 = EnumC0898.f3334;
            c15867Empty = C15867.empty();
            for (i = 0; i < abstractC1928M51441.size() && (enumC0898Mo1347 = enumC0898Mo1347.mo1347(EnumC21035.m48074((String) abstractC1928M51441.get(i)))) != EnumC0898.f3331; i++) {
                if (enumC0898Mo1347.m3635()) {
                    c15867Empty = C15867.of(Integer.valueOf(i));
                }
            }
            c15867Empty.ifPresent(new C13782(i5, linkedHashSet));
            i3 = 0;
            i4 = -1;
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                if (((InterfaceC22049) arrayList.get(i2)).mo2283() != EnumC22621.METHOD_INVOCATION) {
                    if (i2 <= 0 || interfaceC22049 != null) {
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
            if (linkedHashSet.isEmpty() && (arrayList.get(0) instanceof InterfaceC19811)) {
                string = ((InterfaceC19811) arrayList.get(0)).getName().toString();
                if (!string.equals("this") || string.equals("super")) {
                    linkedHashSet.add(1);
                }
            }
            list = (List) C15702.m37480(C1170.stream(arrayList), new C0747(new C14912())).filter(new C1368(1)).collect(C2025.toList());
            C4937.forEach(list, new C11296(2, linkedHashSet));
            if (!linkedHashSet.isEmpty()) {
                if (list.isEmpty()) {
                    enumC10963 = EnumC10963.INDEPENDENT;
                } else {
                    enumC10963 = EnumC10963.UNIFIED;
                }
                m5826(arrayList, z, linkedHashSet, enumC10963);
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
                    interfaceC220410 = (InterfaceC22049) it.next();
                    if (z5) {
                        c1269.m4595(abstractC3508);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        it2 = it;
                        zM5832 = false;
                        zM5833 = false;
                        z7 = false;
                    } else {
                        z9 = z3;
                        it2 = it;
                        obj = interfaceC220410;
                        while (!(obj instanceof C23041)) {
                            if (obj instanceof C24533) {
                                obj2 = ((C24533) obj).f79554;
                            } else if (obj instanceof C16129) {
                                obj2 = ((C16129) obj).f52413;
                            } else {
                                throw new RuntimeException("Unexpected tree type: " + obj);
                            }
                            obj = obj2;
                            i6 = 0;
                        }
                        interfaceC12455M4608 = c1269.m4608(i6);
                        C17359.requireNonNull(interfaceC12455M4608);
                        if (((C6710) interfaceC12455M4608.mo30930()).mo18733().equals(str2)) {
                            throw new AssertionError(interfaceC12455M4608.toString());
                        }
                        InterfaceC12455 interfaceC12455M4609 = c1269.m4608(-1);
                        InterfaceC12455 interfaceC12455M46010 = c1269.m4608(1);
                        zM5833 = m5832(interfaceC12455M4609, interfaceC12455M4608);
                        zM5832 = m5832(interfaceC12455M4608, interfaceC12455M46010);
                        if (!z6 && z4 && (zM5833 || zM5832)) {
                            c1269.m4595(abstractC3508);
                            z6 = true;
                        }
                        if (z4 || z5 || !(zM5833 || zM5832)) {
                            z7 = z9;
                        } else {
                            z7 = z9;
                            z5 = true;
                        }
                    }
                    if (z) {
                        if (zM5833) {
                            c1269.m4588();
                        }
                        m5901(str2);
                        if (zM5832) {
                            c1269.m4588();
                        }
                    }
                    if (z2) {
                        abstractC3506 = abstractC3509;
                    } else {
                        abstractC3506 = this.f5710;
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList.size() >= 2 && interfaceC220410.mo2283() == EnumC22621.METHOD_INVOCATION) {
                        interfaceC20557 = (InterfaceC20557) interfaceC220410;
                        interfaceC3058M12512 = C3881.m12512(interfaceC20557);
                        str = str2;
                        if (interfaceC20557.mo47123() instanceof InterfaceC19811) {
                            abstractC19728 = (AbstractC19728) interfaceC3058M12512;
                            z8 = z4;
                            if (abstractC19728.length() > 4 && interfaceC20557.mo47124().isEmpty() && interfaceC20557.mo47125().m35551() == 1) {
                                c1269.m4595(abstractC3509);
                                c1269.m4595(abstractC3506);
                                m5901(abstractC19728.toString());
                                m5901(MotionUtils.EASING_TYPE_FORMAT_START);
                                m5912((InterfaceC19637) C16625.m39331((Collection) interfaceC20557.mo47125()));
                                c1269.m4605();
                                m5901(MotionUtils.EASING_TYPE_FORMAT_END);
                                c1269.m4605();
                            }
                            if (z6) {
                                c1269.m4605();
                            }
                            AbstractC8036 abstractC8036 = (AbstractC8036) interfaceC220410;
                            AbstractC11194 abstractC11194 = ((C19113) m43808().m20985()).f61860;
                            abstractC8036.getClass();
                            C11239.m28320(abstractC8036, abstractC11194);
                            C3881.m12509((InterfaceC19637) interfaceC220410);
                            i6 = 0;
                            z = true;
                            arrayList = arrayList2;
                            z3 = z7;
                            it = it2;
                            str2 = str;
                            z4 = z8;
                        }
                        C9471 c9471 = new C9471();
                        m5828(interfaceC220410, C15867.of(c9471));
                        C23644 c23644M52881 = C23644.m52881(c9471, abstractC3508, abstractC3509);
                        if (!z2 || z) {
                            abstractC3507 = abstractC3508;
                        } else {
                            abstractC3507 = abstractC3509;
                        }
                        m5829(interfaceC220410, c23644M52881, abstractC3507);
                        if (z6) {
                            c1269.m4605();
                        }
                        AbstractC8036 abstractC8037 = (AbstractC8036) interfaceC220410;
                        AbstractC11194 abstractC11195 = ((C19113) m43808().m20985()).f61860;
                        abstractC8037.getClass();
                        C11239.m28320(abstractC8037, abstractC11195);
                        C3881.m12509((InterfaceC19637) interfaceC220410);
                        i6 = 0;
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
                    C9471 c9472 = new C9471();
                    m5828(interfaceC220410, C15867.of(c9472));
                    C23644 c23644M52882 = C23644.m52881(c9472, abstractC3508, abstractC3509);
                    if (z2) {
                        abstractC3507 = abstractC3508;
                    } else {
                        abstractC3507 = abstractC3508;
                    }
                    m5829(interfaceC220410, c23644M52882, abstractC3507);
                    if (z6) {
                        c1269.m4605();
                    }
                    AbstractC8036 abstractC8038 = (AbstractC8036) interfaceC220410;
                    AbstractC11194 abstractC11196 = ((C19113) m43808().m20985()).f61860;
                    abstractC8038.getClass();
                    C11239.m28320(abstractC8038, abstractC11196);
                    C3881.m12509((InterfaceC19637) interfaceC220410);
                    i6 = 0;
                    z = true;
                    arrayList = arrayList2;
                    z3 = z7;
                    it = it2;
                    str2 = str;
                    z4 = z8;
                }
            }
            if (interfaceC22049 != null) {
                c1269.m4605();
            }
        }
        abstractC1928M51441 = c22811.m51441();
        enumC0898Mo1347 = EnumC0898.f3334;
        c15867Empty = C15867.empty();
        while (i < abstractC1928M51441.size()) {
            if (enumC0898Mo1347.m3635()) {
                c15867Empty = C15867.of(Integer.valueOf(i));
            }
        }
        c15867Empty.ifPresent(new C13782(i5, linkedHashSet));
        i3 = 0;
        i4 = -1;
        while (i2 < arrayList.size()) {
            if (((InterfaceC22049) arrayList.get(i2)).mo2283() != EnumC22621.METHOD_INVOCATION) {
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
            string = ((InterfaceC19811) arrayList.get(0)).getName().toString();
            if (!string.equals("this")) {
                linkedHashSet.add(1);
            } else {
                linkedHashSet.add(1);
            }
        }
        list = (List) C15702.m37480(C1170.stream(arrayList), new C0747(new C14912())).filter(new C1368(1)).collect(C2025.toList());
        C4937.forEach(list, new C11296(2, linkedHashSet));
        if (!linkedHashSet.isEmpty()) {
            if (list.isEmpty()) {
                enumC10963 = EnumC10963.INDEPENDENT;
            } else {
                enumC10963 = EnumC10963.UNIFIED;
            }
            m5826(arrayList, z, linkedHashSet, enumC10963);
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
                interfaceC220410 = (InterfaceC22049) it.next();
                if (z5) {
                    c1269.m4595(abstractC3508);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z9 = z3;
                    it2 = it;
                    obj = interfaceC220410;
                    while (!(obj instanceof C23041)) {
                        if (obj instanceof C24533) {
                            obj2 = ((C24533) obj).f79554;
                        } else if (obj instanceof C16129) {
                            obj2 = ((C16129) obj).f52413;
                        } else {
                            throw new RuntimeException("Unexpected tree type: " + obj);
                        }
                        obj = obj2;
                        i6 = 0;
                    }
                    interfaceC12455M4608 = c1269.m4608(i6);
                    C17359.requireNonNull(interfaceC12455M4608);
                    if (((C6710) interfaceC12455M4608.mo30930()).mo18733().equals(str2)) {
                        throw new AssertionError(interfaceC12455M4608.toString());
                    }
                    InterfaceC12455 interfaceC12455M46011 = c1269.m4608(-1);
                    InterfaceC12455 interfaceC12455M46012 = c1269.m4608(1);
                    zM5833 = m5832(interfaceC12455M46011, interfaceC12455M4608);
                    zM5832 = m5832(interfaceC12455M4608, interfaceC12455M46012);
                    if (!z6) {
                        c1269.m4595(abstractC3508);
                        z6 = true;
                    }
                    if (z4) {
                        z7 = z9;
                    } else {
                        z7 = z9;
                    }
                } else {
                    it2 = it;
                    zM5832 = false;
                    zM5833 = false;
                    z7 = false;
                }
                if (z) {
                    if (zM5833) {
                        c1269.m4588();
                    }
                    m5901(str2);
                    if (zM5832) {
                        c1269.m4588();
                    }
                }
                if (z2) {
                    abstractC3506 = abstractC3509;
                } else {
                    abstractC3506 = this.f5710;
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList.size() >= 2) {
                    interfaceC20557 = (InterfaceC20557) interfaceC220410;
                    interfaceC3058M12512 = C3881.m12512(interfaceC20557);
                    str = str2;
                    if (interfaceC20557.mo47123() instanceof InterfaceC19811) {
                        abstractC19728 = (AbstractC19728) interfaceC3058M12512;
                        z8 = z4;
                        if (abstractC19728.length() > 4) {
                        }
                    } else {
                        z8 = z4;
                    }
                    C9471 c9473 = new C9471();
                    m5828(interfaceC220410, C15867.of(c9473));
                    C23644 c23644M52883 = C23644.m52881(c9473, abstractC3508, abstractC3509);
                    if (z2) {
                        abstractC3507 = abstractC3508;
                    } else {
                        abstractC3507 = abstractC3508;
                    }
                    m5829(interfaceC220410, c23644M52883, abstractC3507);
                } else {
                    str = str2;
                    z8 = z4;
                    C9471 c9474 = new C9471();
                    m5828(interfaceC220410, C15867.of(c9474));
                    C23644 c23644M52884 = C23644.m52881(c9474, abstractC3508, abstractC3509);
                    if (z2) {
                        abstractC3507 = abstractC3508;
                    } else {
                        abstractC3507 = abstractC3508;
                    }
                    m5829(interfaceC220410, c23644M52884, abstractC3507);
                }
                if (z6) {
                    c1269.m4605();
                }
                AbstractC8036 abstractC8039 = (AbstractC8036) interfaceC220410;
                AbstractC11194 abstractC11197 = ((C19113) m43808().m20985()).f61860;
                abstractC8039.getClass();
                C11239.m28320(abstractC8039, abstractC11197);
                C3881.m12509((InterfaceC19637) interfaceC220410);
                i6 = 0;
                z = true;
                arrayList = arrayList3;
                z3 = z7;
                it = it2;
                str2 = str;
                z4 = z8;
            }
        }
        if (interfaceC22049 != null) {
            c1269.m4605();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5826(List list, boolean z, AbstractCollection abstractCollection, EnumC10963 enumC10963) {
        C16184 c16184;
        C1269 c1269;
        boolean z2;
        if (!abstractCollection.isEmpty()) {
            ((Integer) C16625.m39339(abstractCollection)).intValue();
            list.size();
        }
        int i = 0;
        while (true) {
            int size = abstractCollection.size();
            c16184 = f5705;
            c1269 = this.f5711;
            if (i >= size) {
                break;
            }
            c1269.m4595(c16184);
            i++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(AbstractC5439.copyOf((Collection) abstractCollection));
        C9471 c9471 = new C9471();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < list.size()) {
            InterfaceC22049 interfaceC22049 = (InterfaceC22049) list.get(i2);
            C16184 c16185 = this.f5709;
            if (z3) {
                c1269.m4595(c16185);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 0 && m5838()) {
                if (!z2) {
                    c1269.m4595(c16185);
                    z2 = true;
                }
                c1269.m4588();
                z3 = true;
            }
            if (z) {
                m5901(".");
            } else if (z) {
                EnumC10963 enumC10964 = (arrayDeque.isEmpty() || i2 > ((Integer) arrayDeque.peekFirst()).intValue()) ? EnumC10963.UNIFIED : enumC10963;
                C15867 c15867Of = C15867.of(c9471);
                c1269.getClass();
                c1269.m4598(C22152.m50111(enumC10964, "", c16184, c15867Of));
                m5901(".");
            }
            C9471 c9472 = new C9471();
            m5828(interfaceC22049, C15867.of(c9472));
            if (!arrayDeque.isEmpty() && i2 == ((Integer) arrayDeque.peekFirst()).intValue()) {
                c1269.m4605();
                arrayDeque.removeFirst();
            }
            m5829(interfaceC22049, C23644.m52881(c9472, c16185, c16184), c16185);
            if (z2) {
                c1269.m4605();
            }
            i2++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5828(InterfaceC22049 interfaceC22049, C15867 c15867) {
        InterfaceC22049 interfaceC22049M5820 = m5820(interfaceC22049);
        switch (C1489.f5186[interfaceC22049M5820.mo2283().ordinal()]) {
            case 9:
                m5908(((InterfaceC3403) interfaceC22049M5820).mo11141());
                break;
            case 10:
                InterfaceC20557 interfaceC20557 = (InterfaceC20557) interfaceC22049M5820;
                if (!interfaceC20557.mo47124().isEmpty()) {
                    C16184 c16184 = this.f5709;
                    C1269 c1269 = this.f5711;
                    c1269.m4595(c16184);
                    C14769 c14769Mo47124 = interfaceC20557.mo47124();
                    C16184 c16185 = f5705;
                    m5920(c14769Mo47124, c16185);
                    c1269.m4598(C22152.m50111(EnumC10963.UNIFIED, "", c16185, c15867));
                    c1269.m4605();
                }
                m5908(C3881.m12512(interfaceC20557));
                break;
            case 11:
                m5908(((InterfaceC19811) interfaceC22049M5820).getName());
                break;
            default:
                m5912((InterfaceC19637) interfaceC22049M5820);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22049 m5820(InterfaceC22049 interfaceC22049) {
        while (interfaceC22049 instanceof InterfaceC25274) {
            interfaceC22049 = ((InterfaceC25274) interfaceC22049).getExpression();
        }
        return interfaceC22049;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m5836(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        C16184 c16184 = f5705;
        C1269 c1269 = this.f5711;
        c1269.m4595(c16184);
        do {
            m5901("[");
            c1269.m4601();
            m5912((InterfaceC19637) arrayDeque.removeLast());
            m5901("]");
        } while (!arrayDeque.isEmpty());
        c1269.m4605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5829(InterfaceC22049 interfaceC22049, C23644 c23644, AbstractC3506 abstractC3506) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC22049 expression = interfaceC22049;
        while (expression instanceof InterfaceC25274) {
            InterfaceC25274 interfaceC25274 = (InterfaceC25274) expression;
            arrayDeque.addLast(interfaceC25274.getIndex());
            expression = interfaceC25274.getExpression();
        }
        InterfaceC22049 interfaceC22049M5820 = m5820(interfaceC22049);
        if (C1489.f5186[interfaceC22049M5820.mo2283().ordinal()] == 10) {
            C1269 c1269 = this.f5711;
            c1269.m4595(c23644);
            m5904((List) ((InterfaceC20557) interfaceC22049M5820).mo47125(), abstractC3506);
            c1269.m4605();
        }
        m5836(arrayDeque);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5920(List list, AbstractC3506 abstractC3506) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m5901("<");
        C1269 c1269 = this.f5711;
        c1269.m4595(abstractC3506);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC19637 interfaceC19637 = (InterfaceC19637) it.next();
            if (z) {
                m5901(",");
                c1269.m4611();
            }
            m5912(interfaceC19637);
            z = true;
        }
        c1269.m4605();
        m5901(">");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5904(List list, AbstractC3506 abstractC3506) {
        m5901(MotionUtils.EASING_TYPE_FORMAT_START);
        boolean zIsEmpty = list.isEmpty();
        C1269 c1269 = this.f5711;
        boolean z = false;
        if (!zIsEmpty) {
            Iterator it = list.iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                InterfaceC22049 interfaceC22049 = (InterfaceC22049) it.next();
                InterfaceC12455 interfaceC12455M4608 = c1269.m4608(i);
                C17359.requireNonNull(interfaceC12455M4608);
                InterfaceC12455 interfaceC12455M4609 = c1269.m4608(i != 0 ? 0 : -1);
                C17359.requireNonNull(interfaceC12455M4609);
                InterfaceC12455 interfaceC12455M46010 = c1269.m4608(i == 0 ? -2 : -1);
                if (i != 0) {
                    if ((interfaceC12455M46010 != null && m5831(interfaceC12455M46010.mo30931())) || m5831(interfaceC12455M4609.mo30932())) {
                        if (!z) {
                            c1269.m4595(abstractC3506);
                            z = true;
                        }
                        c1269.m4588();
                    }
                    m5901(",");
                }
                if (m5831(interfaceC12455M4609.mo30931()) || m5831(interfaceC12455M4608.mo30932())) {
                    if (!z) {
                        c1269.m4595(abstractC3506);
                        z = true;
                    }
                    c1269.m4588();
                } else if (i != 0) {
                    c1269.m4606();
                }
                m5912((InterfaceC19637) interfaceC22049);
                i = 1;
            }
        }
        if (z) {
            c1269.m4605();
        }
        if (!list.isEmpty() && m5838()) {
            c1269.m4588();
        }
        m5902(MotionUtils.EASING_TYPE_FORMAT_END, abstractC3506);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m5833(ArrayDeque arrayDeque) {
        m5825(new ArrayDeque(), (Deque) arrayDeque);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5905(List list, EnumC4627 enumC4627, EnumC5373 enumC5373) {
        boolean z;
        boolean zIsEmpty = list.isEmpty();
        C16184 c16184 = f5705;
        C16184 c16185 = this.f5708;
        C1269 c1269 = this.f5711;
        if (zIsEmpty) {
            if (enumC4627.m14439()) {
                c1269.m4606();
                m5909(c16185);
                c1269.m4596(AbstractC10217.f32657);
                c1269.m4595(c16184);
                if (c1269.m4600(0).equals(C15867.of(l.b))) {
                    c1269.m4595(c16185);
                    m5919();
                    c1269.m4605();
                    c1269.m4588();
                }
                m5902(l.d, c16185);
                c1269.m4605();
                return;
            }
            return;
        }
        if (enumC4627.m14439()) {
            c1269.m4606();
            m5909(c16185);
            c1269.m4595(c16184);
        }
        c1269.m4595(c16185);
        boolean zM16054 = enumC5373.m16054();
        InterfaceC9802 interfaceC9802M20913 = C7676.m20913(list.iterator());
        boolean z2 = false;
        while (interfaceC9802M20913.hasNext()) {
            InterfaceC19637 interfaceC19637 = (InterfaceC19637) interfaceC9802M20913.next();
            m5919();
            c1269.m4588();
            if (interfaceC19637.mo2283() == EnumC22621.VARIABLE) {
                InterfaceC12455 interfaceC12455 = (InterfaceC12455) c1269.m4603().mo14171().mo21436(Integer.valueOf(C11239.m28342((AbstractC8036) interfaceC19637)));
                if (interfaceC12455 != null) {
                    AbstractC14956 abstractC14956ListIterator = interfaceC12455.mo30932().listIterator(0);
                    while (true) {
                        if (abstractC14956ListIterator.hasNext()) {
                            if (((InterfaceC20660) abstractC14956ListIterator.next()).getText().startsWith("/**")) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (zM16054) {
                c1269.m4596(AbstractC10217.f32659);
            } else if (!zM16054 && (z || z2)) {
                c1269.m4596(AbstractC10217.f32658);
            }
            m5917();
            if (interfaceC19637.mo2283() == EnumC22621.VARIABLE) {
                m5907(m5816(interfaceC9802M20913, interfaceC19637), EnumC22527.FIELD, m5818((InterfaceC6387) ((InterfaceC17399) interfaceC19637).mo31063()));
            } else {
                m5912(interfaceC19637);
            }
            zM16054 = false;
            z2 = z;
        }
        m5919();
        c1269.m4588();
        c1269.m4605();
        c1269.m4588();
        m5917();
        if (enumC4627.m14439()) {
            c1269.m4596(AbstractC10217.f32659);
            m5902(l.d, c16185);
            c1269.m4605();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5823(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        C1269 c1269 = this.f5711;
        c1269.m4611();
        c1269.m4595(list.size() > 1 ? this.f5709 : f5705);
        m5901(str);
        c1269.m4606();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC19637 interfaceC19637 = (InterfaceC19637) it.next();
            if (z) {
                m5901(",");
                c1269.m4609();
            }
            m5912(interfaceC19637);
            z = true;
        }
        c1269.m4605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5816(InterfaceC9802 interfaceC9802, InterfaceC19637 interfaceC19637) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC19637.mo2283() == EnumC22621.VARIABLE) {
            int iM12509 = C3881.m12509(interfaceC19637);
            arrayList.add((InterfaceC17399) interfaceC19637);
            while (interfaceC9802.hasNext() && ((InterfaceC19637) interfaceC9802.peek()).mo2283() == EnumC22621.VARIABLE && C3881.m12509((InterfaceC19637) interfaceC9802.peek()) == iM12509) {
                arrayList.add((InterfaceC17399) interfaceC9802.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12830 m5818(InterfaceC6387 interfaceC6387) {
        Iterator it = interfaceC6387.getAnnotations().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC11847) it.next()).mo29688().isEmpty()) {
                return EnumC12830.VERTICAL;
            }
        }
        return EnumC12830.HORIZONTAL;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5901(String str) {
        this.f5711.m4593(str, EnumC5744.REAL, f5705, C15867.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5902(String str, AbstractC3506 abstractC3506) {
        this.f5711.m4593(str, EnumC5744.REAL, abstractC3506, C15867.empty());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5909(AbstractC3506 abstractC3506) {
        this.f5711.m4593("{", EnumC5744.REAL, f5705, C15867.of(abstractC3506));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5921(InterfaceC19637 interfaceC19637) {
        AbstractC8036 abstractC8036 = (AbstractC8036) interfaceC19637;
        abstractC8036.getClass();
        this.f5711.m4612(C11239.m28342(abstractC8036));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5916(EnumC22527 enumC22527, EnumC12830 enumC12830, C15867 c15867, InterfaceC19637 interfaceC19637, InterfaceC3058 interfaceC3058, String str, C15867 c15868, C15867 c15869, C15867 c158610, C15867 c158611) {
        C9471 c9471 = new C9471();
        C9471 c9472 = new C9471();
        boolean z = true;
        boolean z2 = enumC22527 == EnumC22527.FIELD;
        C1269 c1269 = this.f5711;
        if (z2) {
            c1269.m4596(AbstractC10217.m26351(c9472));
        }
        ArrayDeque arrayDeque = new ArrayDeque(c158611.isPresent() ? ((C15658) c158611.get()).f50884 : AbstractC1928.of());
        AbstractC15067 abstractC15067 = (AbstractC15067) c15867.map(new Function() { // from class: l.ۢ᩹ܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC6387 interfaceC6387 = (InterfaceC6387) obj;
                return this.f33164.m5900(interfaceC6387, (List) interfaceC6387.getAnnotations());
            }
        }).orElse(new C11183(AbstractC1928.of(), AbstractC1928.of()));
        EnumC22527 enumC22528 = EnumC22527.PARAMETER;
        C16184 c16184 = f5705;
        C16184 c16185 = this.f5709;
        c1269.m4595((enumC22527 == enumC22528 && abstractC15067.m36314()) ? c16185 : c16184);
        AbstractC1928 abstractC1928M5817 = m5817(abstractC15067, enumC12830, C15867.of(c9472));
        boolean z3 = ((String) c1269.m4600(0).get()).equals("var") && (!interfaceC3058.mo9945("var") || ((String) c1269.m4600(1).get()).equals("var"));
        if (interfaceC19637 == null && !z3) {
            z = false;
        }
        c1269.m4595(c16184);
        c1269.m4595(c16184);
        c1269.m4595(c16184);
        m5906(abstractC1928M5817, EnumC21781.NO, EnumC21781.YES);
        if (c158611.isPresent() && ((C15658) c158611.get()).f50885 != null) {
            m5912(((C15658) c158611.get()).f50885);
            arrayDeque.size();
            c1269.m4595(c16185);
            m5833(arrayDeque);
            c1269.m4605();
            arrayDeque.size();
        } else if (z3) {
            m5901("var");
        } else {
            m5912(interfaceC19637);
        }
        c1269.m4605();
        if (z) {
            c1269.m4606();
        }
        c1269.m4595(C23644.m52881(c9471, c16185, c16184));
        if (c158610.isPresent()) {
            m5912((InterfaceC19637) c158610.get());
        } else {
            m5908(interfaceC3058);
        }
        c1269.m4602("");
        m5833(arrayDeque);
        c1269.m4605();
        c1269.m4605();
        if (c15868.isPresent()) {
            c1269.m4606();
            m5901(str);
            if (((InterfaceC22049) c15868.get()).mo2283() == EnumC22621.NEW_ARRAY && ((InterfaceC14589) c15868.get()).getType() == null) {
                c1269.m4606();
                ((InterfaceC22049) c15868.get()).mo2282(this, null);
            } else {
                c1269.m4595(C23644.m52881(c9471, c16185, c16184));
                c1269.m4606();
                m5912((InterfaceC19637) c15868.get());
                c1269.m4605();
            }
        }
        if (c15869.isPresent() && c1269.m4600(0).equals(c15869)) {
            c1269.m4610((String) c15869.get());
        }
        c1269.m4605();
        c1269.m4605();
        if (z2) {
            c1269.m4596(AbstractC10217.m26351(c9472));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m5838() {
        C1269 c1269 = this.f5711;
        return m5832(c1269.m4608(-1), c1269.m4608(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5832(InterfaceC12455 interfaceC12455, InterfaceC12455 interfaceC12456) {
        if (interfaceC12455 == null || !m5831(interfaceC12455.mo30931())) {
            return interfaceC12456 != null && m5831(interfaceC12456.mo30932());
        }
        return true;
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f5711, "builder");
        return c3179M46714.toString();
    }
}
