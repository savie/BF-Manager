package l;

import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֡֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JG */
/* JADX INFO: loaded from: classes2.dex */
public class C0052 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumSet f904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f905;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 f908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8256 f909;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1610 f910;

    static {
        C16980.m40037(C0052.class);
        f904 = EnumSet.noneOf(EnumC17951.class);
        f906 = EnumSet.of(EnumC17951.BODY_ONLY);
        f905 = EnumSet.of(EnumC17951.BODY_ONLY_NOWRAP);
    }

    public C0052(C8256 c8256, boolean z) {
        this.f909 = c8256;
        C2551 c2551M22243 = c8256.m22243();
        this.f908 = c2551M22243;
        this.f910 = c2551M22243.mo8527();
        this.f907 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m940(InterfaceC3145 interfaceC3145, AbstractC16481 abstractC16481) {
        int length = interfaceC3145.getLength();
        m942(interfaceC3145, abstractC16481, true);
        if (length != interfaceC3145.getLength()) {
            interfaceC3145.mo10270('.');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m942(InterfaceC3145 interfaceC3145, AbstractC16481 abstractC16481, boolean z) {
        m941(interfaceC3145, abstractC16481, z ? f906 : f905);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m941(InterfaceC3145 interfaceC3145, AbstractC16481 abstractC16481, Set set) throws C7852 {
        abstractC16481.getClass();
        if (abstractC16481 instanceof C6041) {
            C6041 c6041 = (C6041) abstractC16481;
            if (interfaceC3145.mo10281()) {
                interfaceC3145.mo10274(C3450.m11263(this.f908, c6041));
            }
            interfaceC3145.add(this.f909.m22241().m18889(c6041));
            return;
        }
        if (abstractC16481 instanceof C23195) {
            String strM925 = m925((C23195) abstractC16481);
            if (set.contains(EnumC17951.BODY_ONLY_NOWRAP) || !strM925.startsWith("-")) {
                interfaceC3145.add(strM925);
                return;
            } else {
                interfaceC3145.mo10270('(').add(strM925).mo10270(')');
                return;
            }
        }
        if (!(abstractC16481 instanceof C17227)) {
            if (abstractC16481 instanceof C20211) {
                interfaceC3145.add(((InterfaceC3057) abstractC16481).getName());
                return;
            } else {
                throw new C7852("Unknown arg type " + abstractC16481);
            }
        }
        C17227 c17227 = (C17227) abstractC16481;
        C18959 c18959M40461 = c17227.m40461();
        if (!c18959M40461.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) {
            m930(interfaceC3145, c18959M40461, set, c17227.getType());
            return;
        }
        interfaceC3145.mo10270('(');
        m944(c18959M40461, interfaceC3145, EnumC17951.INLINE);
        interfaceC3145.mo10270(')');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m937(InterfaceC3145 interfaceC3145, C11260 c11260) {
        if (c11260.m28515()) {
            interfaceC3145.add("final ");
        }
        m936(interfaceC3145, c11260.m28517());
        interfaceC3145.mo10270(' ');
        m934(interfaceC3145, c11260);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m934(InterfaceC3145 interfaceC3145, C11260 c11260) {
        String strM18890 = this.f909.m22241().m18890(c11260);
        if (interfaceC3145.mo10281()) {
            interfaceC3145.mo10275((InterfaceC16874) C3450.m11262(this.f908, c11260.m28505()));
        }
        interfaceC3145.add(strM18890);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m925(C23195 c23195) {
        int i = C15186.f49582;
        return C15186.m36534(c23195.m52122(), c23195.getType(), this.f908.mo8527().m5686(), this.f907, c23195.mo17865(EnumC1763.EXPLICIT_PRIMITIVE_TYPE));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m927(InterfaceC3145 interfaceC3145, C14022 c14022, AbstractC16481 abstractC16481) {
        C13694 c13694;
        C2551 c2551 = this.f908;
        C17467 c17467M5670 = c2551.m8536().mo8527().m5670(c14022);
        if (c17467M5670 != null && !C8314.m22398(c2551.m8536()).m37753() && (c13694 = (C13694) c17467M5670.mo17862((InterfaceC2157) C11457.f36021)) != null) {
            int i = C20935.f66981[c13694.m33483().ordinal()];
            if (i == 1) {
                m935(interfaceC3145, c13694.m33481());
                interfaceC3145.add(".this");
                return;
            } else {
                if (i != 2) {
                    return;
                }
                m942(interfaceC3145, c13694.m33482(), true);
                return;
            }
        }
        m940(interfaceC3145, abstractC16481);
        if (c17467M5670 != null) {
            interfaceC3145.mo10274((InterfaceC11653) c17467M5670);
        }
        if (c17467M5670 == null) {
            interfaceC3145.add(c14022.m34145());
        } else {
            interfaceC3145.add(c17467M5670.m40967());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m938(InterfaceC3145 interfaceC3145, C14022 c14022) {
        C12203 c12203;
        C17467 c17467M5670 = this.f910.m5670(c14022);
        if (c17467M5670 != null && !C8314.m22398(this.f908.m8536()).m37753() && c17467M5670.mo17865(EnumC1763.INLINE_INSTANCE_FIELD) && c17467M5670.m40972().mo17867(C11457.f36004) && (c12203 = (C12203) c17467M5670.mo17862((InterfaceC2157) C11457.f36023)) != null) {
            C18959 c18959M30480 = c12203.m30480();
            if (c18959M30480 instanceof C6787) {
                c17467M5670.mo17866(EnumC1763.DONT_GENERATE);
                m931(interfaceC3145, c17467M5670.m40972(), (C6787) c18959M30480);
                return;
            }
        }
        m928(interfaceC3145, c14022, c17467M5670, this.f909.m22237());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m926(InterfaceC3145 interfaceC3145, C14022 c14022, C11984 c11984) {
        m928(interfaceC3145, c14022, c11984.m30113().mo8527().m5670(c14022), c11984);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m928(InterfaceC3145 interfaceC3145, C14022 c14022, C17467 c17467, C11984 c11984) {
        C1345 c1345M34148 = c14022.m34148();
        if (!c11984.m30113().m55571().equals(c1345M34148) || !c11984.m30111()) {
            int i = C14563.f45885;
            C1345 c1345M4973 = c1345M34148.m4973();
            if (c1345M4973 != null && c1345M4973.m4971().equals("R")) {
                c11984.m30109(interfaceC3145, c1345M4973);
                interfaceC3145.mo10270('.');
                interfaceC3145.add(c1345M34148.m4965());
            } else {
                c11984.m30109(interfaceC3145, c1345M34148);
            }
            interfaceC3145.mo10270('.');
        }
        if (c17467 != null) {
            interfaceC3145.mo10274((InterfaceC11653) c17467);
        }
        if (c17467 == null) {
            interfaceC3145.add(c14022.m34145());
        } else {
            interfaceC3145.add(c17467.m40967());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m935(InterfaceC3145 interfaceC3145, C1345 c1345) {
        this.f909.m22237().m30109(interfaceC3145, c1345);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m936(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566) {
        this.f909.m22237().m30115(interfaceC3145, abstractC1566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m943(InterfaceC3145 interfaceC3145, C18959 c18959) {
        m944(c18959, interfaceC3145, (EnumC17951) null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m944(C18959 c18959, InterfaceC3145 interfaceC3145, EnumC17951 enumC17951) {
        C2551 c2551 = this.f908;
        if (c18959.getType() == EnumC24203.REGION_ARG) {
            return;
        }
        try {
            EnumC17951 enumC17952 = EnumC17951.BODY_ONLY;
            AbstractC1566 abstractC1566M28517 = null;
            if (enumC17951 != enumC17952 && enumC17951 != EnumC17951.BODY_ONLY_NOWRAP) {
                EnumC17951 enumC17953 = EnumC17951.INLINE;
                if (enumC17951 != enumC17953) {
                    interfaceC3145.mo10277(c18959.m16977());
                    C17620.m41271(interfaceC3145, c18959);
                    if (c18959.mo17865(EnumC1763.COMMENT_OUT)) {
                        interfaceC3145.add("// ");
                    }
                }
                C6041 c6041M44027 = c18959.m44027();
                if (c6041M44027 != null) {
                    AbstractC1566 type = c6041M44027.getType();
                    if (!type.mo5564()) {
                        type = c6041M44027.m17531();
                    }
                    if (type.mo5564()) {
                        abstractC1566M28517 = type;
                    } else {
                        int i = C5492.f19104;
                        C17973 c17973M17530 = c6041M44027.m17530();
                        C11260 c11260M41945 = c17973M17530 != null ? c17973M17530.m41945() : null;
                        if (c11260M41945 == null || (abstractC1566M28517 = c11260M41945.m28517()) == null || !abstractC1566M28517.mo5564()) {
                            abstractC1566M28517 = type;
                        }
                    }
                    C17973 c17973M17531 = c6041M44027.m17530();
                    if (c17973M17531 == null || c17973M17531.m41952() != 0 || c18959.getType() != EnumC24203.CONSTRUCTOR) {
                        C6041 c6041M44028 = c18959.m44027();
                        if (!c18959.mo17865(EnumC1763.DECLARE_VAR)) {
                            m942(interfaceC3145, (AbstractC16481) c6041M44028, false);
                        } else {
                            m937(interfaceC3145, c6041M44028.m17530().m41945());
                        }
                        interfaceC3145.add(" = ");
                    }
                }
                m930(interfaceC3145, c18959, f904, abstractC1566M28517);
                if (enumC17951 != enumC17953) {
                    interfaceC3145.mo10270(';');
                    C5492.m16319(interfaceC3145, c2551, c18959);
                    return;
                }
                return;
            }
            m930(interfaceC3145, c18959, enumC17951 == enumC17952 ? f906 : f905, (AbstractC1566) null);
        } catch (Exception e) {
            throw new C7852(c2551, "Error generate insn: " + c18959, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0565  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m930(InterfaceC3145 interfaceC3145, C18959 c18959, Set set, AbstractC1566 abstractC1566) throws C7852 {
        C23720 c23720;
        int i = C20935.f66983[c18959.getType().ordinal()];
        C8256 c8256 = this.f909;
        boolean z = this.f907;
        C2551 c2551 = this.f908;
        int i2 = 0;
        boolean z2 = true;
        switch (i) {
            case 1:
                interfaceC3145.add(c2551.mo8527().m5686().m30751(((C5557) c18959).getString()));
                return;
            case 2:
                m936(interfaceC3145, ((C13014) c18959).m32420());
                interfaceC3145.add(".class");
                return;
            case 3:
                interfaceC3145.add(m925((C23195) c18959.mo44035(0)));
                return;
            case 4:
                m942(interfaceC3145, c18959.mo44035(0), false);
                return;
            case 5:
            case 6:
                boolean zContains = set.contains(EnumC17951.BODY_ONLY);
                if (zContains) {
                    interfaceC3145.mo10270('(');
                }
                interfaceC3145.mo10270('(');
                m936(interfaceC3145, (AbstractC1566) ((C3319) c18959).m10937());
                interfaceC3145.add(") ");
                m942(interfaceC3145, c18959.mo44035(0), true);
                if (zContains) {
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 7:
                C22711 c22711 = (C22711) c18959;
                if (!c22711.mo17865(EnumC1763.ARITH_ONEARG)) {
                    boolean z3 = set.contains(EnumC17951.BODY_ONLY) && !c22711.mo17865(EnumC1763.DONT_WRAP);
                    if (z3) {
                        interfaceC3145.mo10270('(');
                    }
                    m942(interfaceC3145, c22711.mo44035(0), true);
                    interfaceC3145.mo10270(' ');
                    interfaceC3145.add(c22711.m51191().m45425());
                    interfaceC3145.mo10270(' ');
                    m942(interfaceC3145, c22711.mo44035(1), true);
                    if (z3) {
                        interfaceC3145.mo10270(')');
                        return;
                    }
                    return;
                }
                EnumC19727 enumC19727M51191 = c22711.m51191();
                AbstractC16481 abstractC16481Mo44035 = c22711.mo44035(0);
                AbstractC16481 abstractC16481Mo44036 = c22711.mo44035(1);
                abstractC16481Mo44036.getClass();
                if ((abstractC16481Mo44036 instanceof C23195) && (enumC19727M51191 == EnumC19727.ADD || enumC19727M51191 == EnumC19727.SUB)) {
                    C23195 c23195 = (C23195) abstractC16481Mo44036;
                    if (c23195.m52122() == 1 && c23195.m52125()) {
                        m942(interfaceC3145, abstractC16481Mo44035, false);
                        String strM45425 = enumC19727M51191.m45425();
                        interfaceC3145.add(strM45425).add(strM45425);
                        return;
                    }
                }
                m942(interfaceC3145, abstractC16481Mo44035, false);
                interfaceC3145.mo10270(' ').add(enumC19727M51191.m45425()).add("= ");
                m942(interfaceC3145, abstractC16481Mo44036, false);
                return;
            case 8:
                m929(interfaceC3145, c18959, set, '-');
                return;
            case 9:
                m929(interfaceC3145, c18959, set, c18959.mo44035(0).getType() == AbstractC1566.f5436 ? '!' : '~');
                return;
            case 10:
                if (c18959.m44039() == 0) {
                    interfaceC3145.add("return");
                    return;
                } else {
                    interfaceC3145.add("return ");
                    m942(interfaceC3145, c18959.mo44035(0), false);
                    return;
                }
            case 11:
                interfaceC3145.add("break");
                C25212 c25212 = (C25212) c18959.mo17862((InterfaceC2157) C11457.f36029);
                if (c25212 != null) {
                    interfaceC3145.mo10270(' ').add(c8256.m22241().m18892(c25212));
                    return;
                }
                return;
            case 12:
                interfaceC3145.add("continue");
                return;
            case 13:
                interfaceC3145.add("throw ");
                m942(interfaceC3145, c18959.mo44035(0), true);
                return;
            case 14:
            case 15:
                interfaceC3145.mo10270('(');
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.add(" > ");
                m942(interfaceC3145, c18959.mo44035(1), true);
                interfaceC3145.add(" ? 1 : (");
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.add(" == ");
                m942(interfaceC3145, c18959.mo44035(1), true);
                interfaceC3145.add(" ? 0 : -1))");
                return;
            case 16:
                boolean zContains2 = set.contains(EnumC17951.BODY_ONLY);
                if (zContains2) {
                    interfaceC3145.mo10270('(');
                }
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.add(" instanceof ");
                m936(interfaceC3145, (AbstractC1566) ((C3319) c18959).m10937());
                if (zContains2) {
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 17:
                C6787 c6787 = (C6787) c18959;
                C24927 c24927M5671 = c2551.mo8527().m5671(c6787.m18927());
                if (c24927M5671 != null && c24927M5671.mo17867(C11457.f36004) && !z) {
                    m931(interfaceC3145, c24927M5671, c6787);
                    return;
                }
                if (c6787.m18921()) {
                    throw new C8597("Constructor 'self' invoke must be removed!");
                }
                C2551 c2551M5668 = c2551.mo8527().m5668(c6787.mo18926());
                C2551 c2551M52971 = (c2551M5668 == null || (c23720 = (C23720) c2551M5668.mo17862(C11457.f36012)) == null) ? c2551M5668 : c23720.m52971();
                if (c6787.m18922()) {
                    interfaceC3145.mo10274((InterfaceC11653) c2551M52971);
                    interfaceC3145.add("super");
                } else if (c6787.m18923()) {
                    interfaceC3145.mo10274((InterfaceC11653) c2551M52971);
                    interfaceC3145.add("this");
                } else {
                    if (C8314.m22398(c2551.m8536()).m37753() || c2551M5668 == null || !c2551M5668.mo17865(EnumC1763.SKIP_FIRST_ARG)) {
                        z2 = false;
                    } else {
                        C24927 declaringClass = c2551M5668.getDeclaringClass();
                        if (!declaringClass.m55552() || c6787.m44039() == 0) {
                            z2 = false;
                        } else {
                            AbstractC16481 abstractC16481Mo44037 = c6787.mo44035(0);
                            abstractC16481Mo44037.getClass();
                            if (!abstractC16481Mo44037.mo17865(EnumC1763.THIS) && abstractC16481Mo44037.getType().equals(declaringClass.getDeclaringClass().getType())) {
                                m940(interfaceC3145, abstractC16481Mo44037);
                            } else {
                                z2 = false;
                            }
                        }
                    }
                    interfaceC3145.add("new ");
                    if (c2551M52971 == null || c2551M52971.mo17865(EnumC1763.DONT_GENERATE)) {
                        interfaceC3145.mo10274(c2551.mo8527().m5671(c6787.mo18926().m49700()));
                    } else {
                        interfaceC3145.mo10274((InterfaceC11653) c2551M52971);
                    }
                    if (z2) {
                        c8256.m22237().m30114(interfaceC3145, c6787.m18927());
                    } else {
                        c8256.m22237().m30101(interfaceC3145, c6787.m18927());
                    }
                    if (((C22228) c6787.mo17862(C11457.f36002)) != null) {
                        interfaceC3145.mo10270('<');
                        interfaceC3145.mo10270('>');
                    }
                }
                m939(interfaceC3145, c6787, 0, c2551M5668);
                return;
            case 18:
                m933((C21219) c18959, interfaceC3145);
                return;
            case 19:
                AbstractC1566 abstractC1566M21250 = ((C7794) c18959).m21250();
                interfaceC3145.add("new ");
                m936(interfaceC3145, abstractC1566M21250.mo5555());
                int iM44039 = c18959.m44039();
                int i3 = 0;
                while (i3 < iM44039) {
                    interfaceC3145.mo10270('[');
                    m942(interfaceC3145, c18959.mo44035(i3), false);
                    interfaceC3145.mo10270(']');
                    i3++;
                }
                int iMo5562 = abstractC1566M21250.mo5562();
                while (i3 < iMo5562) {
                    interfaceC3145.add("[]");
                    i3++;
                }
                return;
            case 20:
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.add(".length");
                return;
            case 21:
                C24949 c24949 = (C24949) c18959;
                if (!c24949.mo17865(EnumC1763.DECLARE_VAR)) {
                    interfaceC3145.add("new ");
                    m936(interfaceC3145, c24949.m55706());
                }
                interfaceC3145.mo10270('{');
                int iM440310 = c24949.m44039();
                int i4 = 0;
                while (true) {
                    int i5 = 0;
                    do {
                        if (i4 >= iM440310) {
                            interfaceC3145.mo10270('}');
                            return;
                        }
                        m942(interfaceC3145, c24949.mo44035(i4), false);
                        i4++;
                        if (i4 < iM440310) {
                            interfaceC3145.add(", ");
                        }
                        i5++;
                    } while (i5 != 1000);
                    interfaceC3145.mo10282();
                }
                break;
            case 22:
                C11522 c11522 = (C11522) c18959;
                if (z) {
                    String strM29013 = c11522.m29013();
                    m942(interfaceC3145, c18959.mo44035(0), true);
                    interfaceC3145.add(" = {").add(strM29013.substring(1, strM29013.length() - 1)).add("} // fill-array");
                    return;
                }
                if (c2551.m31135(EnumC17315.INFO)) {
                    interfaceC3145.add("// fill-array-data instruction");
                }
                interfaceC3145.mo10282();
                AbstractC16481 abstractC16481Mo44038 = c11522.mo44035(0);
                AbstractC1566 type = abstractC16481Mo44038.getType();
                ArrayList arrayListM29009 = c11522.m29009((type.mo5564() && type.m5554()) ? type.mo5557() : c11522.m29011().mo5551());
                int size = arrayListM29009.size();
                while (i2 < size) {
                    if (i2 != 0) {
                        interfaceC3145.mo10270(';');
                        ((C15382) interfaceC3145).mo10282();
                    }
                    m942(interfaceC3145, abstractC16481Mo44038, true);
                    interfaceC3145.mo10270('[').add(Integer.toString(i2)).add("] = ").add(m925((C23195) arrayListM29009.get(i2)));
                    i2++;
                }
                return;
            case 23:
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.mo10270('[');
                m942(interfaceC3145, c18959.mo44035(1), false);
                interfaceC3145.mo10270(']');
                return;
            case 24:
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.mo10270('[');
                m942(interfaceC3145, c18959.mo44035(1), false);
                interfaceC3145.add("] = ");
                m942(interfaceC3145, c18959.mo44035(2), false);
                return;
            case 25:
                m927(interfaceC3145, (C14022) ((C3319) c18959).m10937(), c18959.mo44035(0));
                return;
            case 26:
                m927(interfaceC3145, (C14022) ((C3319) c18959).m10937(), c18959.mo44035(1));
                interfaceC3145.add(" = ");
                m942(interfaceC3145, c18959.mo44035(0), false);
                return;
            case 27:
                m938(interfaceC3145, (C14022) ((C3319) c18959).m10937());
                return;
            case 28:
                m938(interfaceC3145, (C14022) ((C3319) c18959).m10937());
                interfaceC3145.add(" = ");
                m942(interfaceC3145, c18959.mo44035(0), false);
                return;
            case 29:
                boolean zContains3 = set.contains(EnumC17951.BODY_ONLY);
                if (zContains3) {
                    interfaceC3145.mo10270('(');
                }
                Iterator it = c18959.m44026().iterator();
                while (it.hasNext()) {
                    m942(interfaceC3145, (AbstractC16481) it.next(), true);
                    if (it.hasNext()) {
                        interfaceC3145.add(" + ");
                    }
                }
                if (zContains3) {
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 30:
                if (z) {
                    interfaceC3145.add("monitor-enter(");
                    m942(interfaceC3145, c18959.mo44035(0), true);
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 31:
                if (z) {
                    interfaceC3145.add("monitor-exit(");
                    if (c18959.m44039() == 1) {
                        m942(interfaceC3145, c18959.mo44035(0), true);
                    }
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 32:
                C4789 c4789 = (C4789) c18959;
                boolean zContains4 = set.contains(EnumC17951.BODY_ONLY);
                if (zContains4) {
                    interfaceC3145.mo10270('(');
                }
                AbstractC16481 abstractC16481Mo44039 = c4789.mo44035(0);
                AbstractC16481 abstractC16481Mo440310 = c4789.mo44035(1);
                C14221 c14221 = new C14221(c8256, z);
                if (abstractC16481Mo44039.m39121() && abstractC16481Mo440310.m39119()) {
                    c14221.m34512(interfaceC3145, c4789.m14764());
                } else {
                    c14221.m34513(interfaceC3145, c4789.m14764());
                    interfaceC3145.add(" ? ");
                    m942(interfaceC3145, abstractC16481Mo44039, false);
                    interfaceC3145.add(" : ");
                    m942(interfaceC3145, abstractC16481Mo440310, false);
                }
                if (zContains4) {
                    interfaceC3145.mo10270(')');
                    return;
                }
                return;
            case 33:
                m941(interfaceC3145, c18959.mo44035(0), set);
                return;
            case 34:
                m932(c18959);
                C17489 c17489 = (C17489) c18959;
                interfaceC3145.add("if (");
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.mo10270(' ');
                interfaceC3145.add(c17489.m40994().m38125()).mo10270(' ');
                m942(interfaceC3145, c18959.mo44035(1), true);
                InterfaceC3145 interfaceC3145Add = interfaceC3145.add(") goto ");
                int i6 = C8256.f27151;
                C21943 c21943M40992 = c17489.m40992();
                interfaceC3145Add.add(c21943M40992 != null ? C8256.m22229(c21943M40992) : C8256.m22228(c17489.mo39519()));
                return;
            case 35:
                m932(c18959);
                interfaceC3145.add("goto ").add(C8256.m22228(((C16743) c18959).mo39519()));
                return;
            case 36:
                m932(c18959);
                interfaceC3145.add("move-exception");
                return;
            case 37:
                m932(c18959);
                C1082 c1082 = (C1082) c18959;
                interfaceC3145.add("switch(");
                m942(interfaceC3145, c18959.mo44035(0), true);
                interfaceC3145.add(") {");
                interfaceC3145.mo10278();
                int[] iArrM4073 = c1082.m4073();
                int length = iArrM4073.length;
                C21943[] c21943ArrM4078 = c1082.m4078();
                if (c21943ArrM4078 != null) {
                    while (i2 < length) {
                        interfaceC3145.mo10283("case ").add(Integer.toString(iArrM4073[i2])).add(": goto ");
                        interfaceC3145.add(C8256.m22229(c21943ArrM4078[i2])).mo10270(';');
                        i2++;
                    }
                    interfaceC3145.mo10283("default: goto ");
                    interfaceC3145.add(C8256.m22229(c1082.m4070())).mo10270(';');
                } else {
                    int[] iArrM4074 = c1082.m4074();
                    while (i2 < length) {
                        interfaceC3145.mo10283("case ").add(Integer.toString(iArrM4073[i2])).add(": goto ");
                        interfaceC3145.add(C8256.m22228(iArrM4074[i2])).mo10270(';');
                        i2++;
                    }
                    interfaceC3145.mo10283("default: goto ");
                    interfaceC3145.add(C8256.m22228(c1082.m4079())).mo10270(';');
                }
                interfaceC3145.mo10279();
                interfaceC3145.mo10280();
                return;
            case 38:
                m932(c18959);
                interfaceC3145.add("new ").add(c18959.m44027().m17531().toString());
                return;
            case 39:
                m932(c18959);
                interfaceC3145.add(c18959.getType().toString()).mo10270('(');
                Iterator it2 = c18959.m44026().iterator();
                while (it2.hasNext()) {
                    m942(interfaceC3145, (AbstractC16481) it2.next(), true);
                    interfaceC3145.mo10270(' ');
                }
                interfaceC3145.mo10270(')');
                return;
            case 40:
                if (z) {
                    interfaceC3145.add("move-result");
                    return;
                }
                C6041 c6041M44027 = c18959.m44027();
                AbstractC1566 type2 = AbstractC1566.f5420;
                if (c6041M44027 != null) {
                    type2 = c6041M44027.getType();
                    if (!type2.mo5564()) {
                        type2 = c6041M44027.m17531();
                    }
                }
                AbstractC1566 abstractC1567 = (type2.mo5564() || abstractC1566 == null || !abstractC1566.mo5564()) ? type2 : abstractC1566;
                c2551.m31138("Ignored leaked move-result in code generation, using default value to continue");
                int i7 = C15186.f49582;
                interfaceC3145.add(C15186.m36534(0L, abstractC1567, c2551.mo8527().m5686(), false, false));
                return;
            case 41:
                m932(c18959);
                interfaceC3145.add("fill-array " + c18959);
                return;
            case 42:
                m932(c18959);
                interfaceC3145.add(c18959.toString());
                return;
            case 43:
                m932(c18959);
                int iM440311 = c18959.m44039();
                while (i2 < iM440311 - 1) {
                    m942(interfaceC3145, c18959.mo44035(i2), true);
                    interfaceC3145.add(" = ");
                    m942(interfaceC3145, c18959.mo44035(i2 + 1), true);
                    interfaceC3145.add("; ");
                    i2 += 2;
                }
                return;
            case 44:
                m932(c18959);
                interfaceC3145.add("jsr -> ").add(C8256.m22228(((C2312) c18959).m7815()));
                return;
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                m932(c18959);
                interfaceC3145.add("ret ");
                m942(interfaceC3145, c18959.mo44035(0), true);
                return;
            default:
                throw new C7852(c2551, "Unknown instruction: " + c18959.getType(), null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m929(InterfaceC3145 interfaceC3145, C18959 c18959, Set set, char c) {
        boolean zContains = set.contains(EnumC17951.BODY_ONLY);
        if (zContains) {
            interfaceC3145.mo10270('(');
        }
        interfaceC3145.mo10270(c);
        m942(interfaceC3145, c18959.mo44035(0), true);
        if (zContains) {
            interfaceC3145.mo10270(')');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m932(C18959 c18959) throws C7852 {
        if (this.f907) {
            return;
        }
        String str = c18959.getType() + " instruction can be used only in instruction form";
        C7852 c7852 = new C7852(str);
        C2551 c2551 = this.f908;
        c2551.getClass();
        C23977.m53506(c2551, str, c7852);
        c2551.m8536().m55556().mo17866(EnumC1763.RESTART_CODEGEN);
        throw c7852;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m931(InterfaceC3145 interfaceC3145, C24927 c24927, C6787 c6787) throws C7852 {
        c24927.m55578();
        C2551 c2551 = this.f908;
        C24927 c24927M8536 = c2551.m8536();
        C11457 c11457 = C11457.f36004;
        if (c24927M8536 == c24927) {
            c24927.m39419(c11457);
            c24927.m39418(EnumC1763.DONT_GENERATE);
            c2551.m8536().m55556().mo17866(EnumC1763.RESTART_CODEGEN);
            throw new C7852("Anonymous inner class unlimited recursion detected. Convert class to inner: " + c24927.m55571().m4957());
        }
        AbstractC1566 abstractC1566M12935 = ((C4000) c24927.mo17862((InterfaceC2157) c11457)).m12935();
        for (C2551 c2552 : c24927.getMethods()) {
            if (c2552.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR) && !C20531.m47075(c2552.m8515())) {
                c2552.mo17866(EnumC1763.DONT_GENERATE);
            }
        }
        interfaceC3145.mo10275((InterfaceC16874) c24927);
        interfaceC3145.add("new ");
        C8256 c8256 = this.f909;
        c8256.m22237().m30102(interfaceC3145, abstractC1566M12935);
        C2551 c2551M5668 = c2551.mo8527().m5668(c6787.mo18926());
        if (c2551M5668 != null) {
            List listM8526 = c2551M5668.m8526();
            int iMin = Math.min(c6787.m44039(), listM8526.size());
            for (int i = 0; i < iMin; i++) {
                AbstractC16481 abstractC16481Mo44035 = c6787.mo44035(i);
                abstractC16481Mo44035.getClass();
                if (abstractC16481Mo44035 instanceof C6041) {
                    ((C6041) listM8526.get(i)).m17530().m41934(((C6041) abstractC16481Mo44035).m17530().m41945());
                }
            }
        }
        m939(interfaceC3145, c6787, 0, c2551M5668);
        interfaceC3145.mo10270(' ');
        C11984 c11984 = new C11984(c24927, c8256.m22237().m30112());
        c11984.m30105(c8256.m22241());
        c11984.m30104(interfaceC3145, true);
        c2551.m8536().m55577(c24927);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m933(C21219 c21219, InterfaceC3145 interfaceC3145) {
        C24927 c24927M5672;
        C1345 c1345M55571;
        EnumC0336 enumC0336M48374 = c21219.m48374();
        EnumC0336 enumC0336 = EnumC0336.CUSTOM;
        boolean z = this.f907;
        int i = 1;
        int i2 = 0;
        if (enumC0336M48374 != enumC0336) {
            C21965 c21965Mo18926 = c21219.mo18926();
            C2551 c2551 = this.f908;
            C2551 c2551M5668 = c2551.mo8527().m5668(c21965Mo18926);
            if (enumC0336M48374 == EnumC0336.CUSTOM_RAW) {
                C14505 c14505 = (C14505) c21219;
                if (z) {
                    interfaceC3145.add("call_site(");
                    interfaceC3145.mo10278();
                    Iterator it = c14505.m35015().iterator();
                    while (it.hasNext()) {
                        interfaceC3145.mo10283(((C15580) it.next()).toString());
                    }
                    interfaceC3145.mo10279();
                    interfaceC3145.mo10283(").invoke");
                    m939(interfaceC3145, c14505, 0, c2551M5668);
                    return;
                }
                AbstractC1566 abstractC1566M49698 = c14505.mo18926().m49698();
                if (!abstractC1566M49698.m5561()) {
                    interfaceC3145.mo10270('(');
                    m936(interfaceC3145, abstractC1566M49698);
                    interfaceC3145.add(") ");
                }
                m933(c14505.m35014(), interfaceC3145);
                interfaceC3145.add(".dynamicInvoker().invoke");
                m939(interfaceC3145, c14505, 0, c2551M5668);
                interfaceC3145.add(" /* invoke-custom */");
                return;
            }
            if (c21219.m48375()) {
                interfaceC3145.mo10270('(');
                m936(interfaceC3145, c21965Mo18926.m49698());
                interfaceC3145.add(") ");
            }
            switch (C20935.f66982[enumC0336M48374.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    AbstractC16481 abstractC16481Mo44035 = c21219.mo44035(0);
                    if (!abstractC16481Mo44035.m39116() || (!abstractC16481Mo44035.mo17865(EnumC1763.THIS) && ((c24927M5672 = c2551.mo8527().m5672(abstractC16481Mo44035.getType())) == null || !c24927M5672.mo17865(EnumC1763.DONT_GENERATE)))) {
                        m940(interfaceC3145, abstractC16481Mo44035);
                    }
                    break;
                case 5:
                    AbstractC1566 type = c21965Mo18926.m49700().getType();
                    C24927 c24927M8536 = c2551.m8536();
                    while (true) {
                        c1345M55571 = c24927M8536.m55571();
                        if (!AbstractC1566.m5534(this.f910, c1345M55571.getType(), type)) {
                            C24927 c24927M55574 = c24927M8536.m55574();
                            if (c24927M55574 == c24927M8536) {
                                c1345M55571 = null;
                            } else {
                                c24927M8536 = c24927M55574;
                            }
                        }
                    }
                    if (c1345M55571 == null) {
                        interfaceC3145.add("super/*").add(c21965Mo18926.m49700().m4957()).add("*/");
                    } else if (c1345M55571.equals(c2551.m8536().m55571())) {
                        interfaceC3145.add("super");
                    } else {
                        m935(interfaceC3145, c1345M55571);
                        interfaceC3145.add(".super");
                    }
                    interfaceC3145.mo10270('.');
                    break;
                case 6:
                    C1345 c1345M55572 = c2551.m8536().m55571();
                    C1345 c1345M49700 = c21965Mo18926.m49700();
                    if (!c1345M55572.equals(c1345M49700)) {
                        m935(interfaceC3145, c1345M49700);
                        interfaceC3145.mo10270('.');
                        break;
                    }
                default:
                    i = 0;
                    break;
            }
            if (c2551M5668 != null) {
                interfaceC3145.mo10274((InterfaceC11653) c2551M5668);
            }
            if (c21219.mo17865(EnumC1763.FORCE_RAW_NAME)) {
                interfaceC3145.add(c21965Mo18926.getName());
            } else if (c2551M5668 != null) {
                interfaceC3145.add(c2551M5668.m8522());
            } else {
                interfaceC3145.add(c21965Mo18926.m49696());
            }
            m939(interfaceC3145, c21219, i, c2551M5668);
            return;
        }
        C4065 c4065 = (C4065) c21219;
        if (c4065.m13121()) {
            C18959 c18959M13130 = c4065.m13130();
            if (c18959M13130 instanceof C6787) {
                m935(interfaceC3145, ((C6787) c18959M13130).mo18926().m49700());
                interfaceC3145.add("::new");
                return;
            } else {
                if (c18959M13130 instanceof C21219) {
                    C21965 c21965Mo18927 = ((C21219) c18959M13130).mo18926();
                    if (c4065.m13120() == EnumC22294.INVOKE_STATIC) {
                        m935(interfaceC3145, c21965Mo18927.m49700());
                    } else {
                        m942(interfaceC3145, c4065.mo44035(0), true);
                    }
                    interfaceC3145.add("::").add(c21965Mo18927.m49696());
                    return;
                }
                return;
            }
        }
        if (!z && c4065.m13129()) {
            C2551 c2552 = (C2551) c4065.m13130().mo17862((InterfaceC2157) C11457.f35998);
            C8256 c8256 = this.f909;
            C8256 c8257 = new C8256(c8256.m22237(), c2552);
            c8257.m22241().m18893(c8256.m22241());
            List listM49702 = c4065.m13127().m49702();
            List listM8526 = c2552.m8526();
            if (listM49702.isEmpty()) {
                interfaceC3145.add("()");
            } else {
                int size = listM8526.size();
                int size2 = size - listM49702.size();
                int i3 = size - size2;
                if (i3 > 1) {
                    interfaceC3145.mo10270('(');
                }
                for (int i4 = size2; i4 < size; i4++) {
                    if (i4 != size2) {
                        interfaceC3145.add(", ");
                    }
                    m934(interfaceC3145, ((C6041) listM8526.get(i4)).m17530().m41945());
                }
                if (i3 > 1) {
                    interfaceC3145.mo10270(')');
                }
            }
            int iM44039 = c4065.m44039();
            i = c4065.m13120() == EnumC22294.INVOKE_STATIC ? 0 : 1;
            while (i < iM44039) {
                AbstractC16481 abstractC16481Mo44036 = c4065.mo44035(i);
                abstractC16481Mo44036.getClass();
                if (!(abstractC16481Mo44036 instanceof C6041)) {
                    throw new C8597("Unexpected argument type in lambda call: ".concat(abstractC16481Mo44036.getClass().getSimpleName()));
                }
                ((C6041) listM8526.get(i2)).m17530().m41934(((C6041) abstractC16481Mo44036).m17530().m41945());
                i++;
                i2++;
            }
            interfaceC3145.add(" -> {");
            interfaceC3145.mo10278();
            c8257.m22238(interfaceC3145);
            interfaceC3145.mo10279();
            interfaceC3145.mo10280();
            return;
        }
        try {
            C18959 c18959M13131 = c4065.m13130();
            C21965 c21965M13127 = c4065.m13127();
            int iM49705 = c21965M13127.m49705();
            if (iM49705 == 0) {
                interfaceC3145.add("()");
            } else {
                interfaceC3145.mo10270('(');
                int iM440310 = c18959M13131.m44039();
                int i5 = iM440310 - iM49705;
                if (c4065.m13120() != EnumC22294.INVOKE_STATIC && c4065.m44039() > 0) {
                    AbstractC16481 abstractC16481Mo44037 = c4065.mo44035(0);
                    abstractC16481Mo44037.getClass();
                    EnumC1763 enumC1763 = EnumC1763.THIS;
                    if (abstractC16481Mo44037.mo17865(enumC1763)) {
                        c18959M13131.mo44035(0).mo17866(enumC1763);
                    }
                }
                if (i5 >= 0) {
                    for (int i6 = i5; i6 < iM440310; i6++) {
                        if (i6 != i5) {
                            interfaceC3145.add(", ");
                        }
                        m942(interfaceC3145, c18959M13131.mo44035(i6), true);
                    }
                } else {
                    interfaceC3145.add("/* ERROR: " + i5 + " */");
                }
                interfaceC3145.mo10270(')');
            }
            interfaceC3145.add(" -> {");
            if (z) {
                interfaceC3145.add(" // ").add(c21965M13127.toString());
            }
            interfaceC3145.mo10278();
            interfaceC3145.mo10282();
            if (!c21965M13127.m49698().m5561()) {
                interfaceC3145.add("return ");
            }
            m944(c18959M13131, interfaceC3145, EnumC17951.INLINE);
            interfaceC3145.add(l.b);
            interfaceC3145.mo10279();
            interfaceC3145.mo10280();
        } catch (Exception e) {
            throw new C8597(C16076.m38224(e, new StringBuilder("Failed to generate 'invoke-custom' instruction: ")), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m939(InterfaceC3145 interfaceC3145, AbstractC15251 abstractC15251, int i, C2551 c2551) {
        boolean z;
        boolean zM37753 = C8314.m22398(this.f908.m8536()).m37753();
        int i2 = (zM37753 || c2551 == null || !c2551.mo17865(EnumC1763.SKIP_FIRST_ARG)) ? i : i + 1;
        int iM44039 = abstractC15251.m44039();
        interfaceC3145.mo10270('(');
        C21482 c21482 = (zM37753 || c2551 == null) ? null : (C21482) c2551.mo17862((InterfaceC2157) C11457.f36005);
        if (i2 < iM44039) {
            boolean z2 = true;
            while (i2 < iM44039) {
                AbstractC16481 abstractC16481Mo44035 = abstractC15251.mo44035(i2);
                if (zM37753 || (!abstractC16481Mo44035.mo17865(EnumC1763.SKIP_ARG) && (c21482 == null || !c21482.m48890(i2 - i)))) {
                    if (z2) {
                        z2 = false;
                    } else {
                        interfaceC3145.add(", ");
                    }
                    if (i2 != iM44039 - 1) {
                        m942(interfaceC3145, abstractC16481Mo44035, false);
                    } else {
                        if (abstractC15251.mo17865(EnumC1763.VARARG_CALL) && abstractC16481Mo44035.getType().m5554() && (abstractC16481Mo44035 instanceof C17227)) {
                            C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                            if (c18959M40461.getType() == EnumC24203.FILLED_NEW_ARRAY) {
                                int iM440310 = c18959M40461.m44039();
                                if (iM440310 == 1) {
                                    AbstractC16481 abstractC16481Mo44036 = c18959M40461.mo44035(0);
                                    AbstractC1566 type = abstractC16481Mo44036.getType();
                                    z = abstractC16481Mo44036.m39120() ? type.mo5543() : type.m5554() && !type.mo5557().m5556() ? false : true;
                                }
                                for (int i3 = 0; i3 < iM440310; i3++) {
                                    m942(interfaceC3145, c18959M40461.mo44035(i3), false);
                                    if (i3 < iM440310 - 1) {
                                        interfaceC3145.add(", ");
                                    }
                                }
                            }
                        }
                        if (!z) {
                            m942(interfaceC3145, abstractC16481Mo44035, false);
                        }
                    }
                }
                i2++;
            }
        }
        interfaceC3145.mo10270(')');
    }
}
