package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public class C18258 extends AbstractC23903 implements InterfaceC9686 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C18959 f58257 = new C18959(3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC23156 f58258;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C21825 f58259;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21825 f58260;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10039 f58261;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21825 f58262;

    /* JADX INFO: renamed from: ܽۙ */
    public C18258 mo9802() {
        return this;
    }

    @Override // l.AbstractC23903
    public final String toString() {
        String string;
        if ((this.f77447 & 1048576) != 0) {
            return this.f77448.f77453.toString();
        }
        AbstractC11242 abstractC11242 = this.f77453;
        String string2 = abstractC11242 == abstractC11242.f38032.f21322.f77632 ? this.f77448.f77453.toString() : abstractC11242.toString();
        AbstractC16579 abstractC16579 = this.f77449;
        if (abstractC16579 == null) {
            return string2;
        }
        if (abstractC16579.m39001(EnumC6617.FORALL)) {
            string2 = "<" + ((C10894) this.f77449).f37076 + ">" + string2;
        }
        StringBuilder sbM8976 = C3012.m8976(string2, MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC16579 abstractC165710 = this.f77449;
        boolean z = (this.f77447 & 17179869184L) != 0;
        C21825 c21825Mo33523 = abstractC165710.mo33523();
        if (z) {
            StringBuilder sb = new StringBuilder();
            while (c21825Mo33523.f70877.m48595()) {
                sb.append(c21825Mo33523.f70876);
                c21825Mo33523 = c21825Mo33523.f70877;
                sb.append(',');
            }
            if (((AbstractC16579) c21825Mo33523.f70876).m39001(EnumC6617.ARRAY)) {
                sb.append(((C8777) c21825Mo33523.f70876).f30194);
                if (((AbstractC16579) c21825Mo33523.f70876).m39008().m48595()) {
                    sb.append(((AbstractC16579) c21825Mo33523.f70876).m39008());
                }
                sb.append("...");
            } else {
                sb.append(c21825Mo33523.f70876);
            }
            string = sb.toString();
        } else {
            string = c21825Mo33523.m48590(",");
        }
        return C22697.m50267(sbM8976, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC9686
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo24653() {
        return (this.f77447 & 17179869184L) != 0;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩹ */
    public final Set mo35138() {
        long j = this.f77447;
        if ((8796093022208L & j) != 0) {
            j &= -1025;
        }
        return C8360.m21885(j);
    }

    @Override // l.InterfaceC9686
    /* JADX INFO: renamed from: ۖ */
    public AbstractC16579 mo24650() {
        return this.f77449.mo16235();
    }

    @Override // l.InterfaceC9686
    /* JADX INFO: renamed from: ۤ */
    public C21825 mo24651() {
        return this.f77449.mo33524();
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۬ */
    public InterfaceC14625 mo2880() {
        return this.f77448;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC11242 mo2883() {
        return this.f77453;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۘ */
    public /* bridge */ /* synthetic */ C21825 mo2878() {
        return mo2878();
    }

    public C18258(long j, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        super(EnumC10477.f35879, j, abstractC11242, abstractC16579, abstractC23903);
        this.f58261 = null;
        this.f58260 = C21825.m48588();
        this.f58262 = C21825.m48588();
        this.f58259 = null;
        this.f58258 = null;
        if (abstractC23903.f77449.m39001(EnumC6617.TYPEVAR)) {
            C6171.m17174(abstractC23903 + "." + ((Object) abstractC11242));
            throw null;
        }
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܰ */
    public AbstractC23903 mo17330(AbstractC23903 abstractC23903) {
        C21786 c21786 = new C21786(this, this.f77447, this.f77453, this.f77449, abstractC23903, abstractC23903);
        c21786.f58261 = this.f58261;
        return c21786;
    }

    @Override // l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public int mo1941() {
        return this.f77448.m52721() ? 11 : 10;
    }

    /* JADX INFO: renamed from: ᩶ۙ */
    public C15437 mo36947() {
        return new C15437(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m42452(C22492 c22492, C23800 c23800) {
        AbstractC0618 abstractC0618 = c22492;
        while (abstractC0618 != null) {
            for (AbstractC23903 abstractC23903 : abstractC0618.mo20272().m9327(this.f77453)) {
                EnumC10477 enumC10477 = abstractC23903.f77452;
                EnumC10477 enumC10478 = EnumC10477.f35879;
                if (enumC10477 == enumC10478) {
                    C18258 c18258 = (C18258) abstractC23903;
                    if (!c18258.m52713() && this.f77452 == enumC10478) {
                        if (c18258 != this) {
                            if (m42449((AbstractC0618) c18258.f77448)) {
                                if (c23800.m52423(this.f77448, c18258.f77448.f77449) == null || !c23800.m52399(c18258.mo50006(c23800), mo50006(c23800))) {
                                }
                            }
                            if ((c18258.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 || !m42449((AbstractC0618) c22492) || !c18258.m52704((AbstractC0618) c22492, c23800) || !c23800.m52399(c18258.mo50006(c23800), mo50006(c23800))) {
                            }
                        }
                        return c18258;
                    }
                }
            }
            abstractC0618 = c23800.m52432(abstractC0618.f77449).f53222;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo42453(AbstractC23903 abstractC23903, AbstractC0618 abstractC0618, C23800 c23800, boolean z) {
        long j;
        AbstractC16579 abstractC16579M52409;
        AbstractC16579 abstractC16579M524010;
        C10391 c10391;
        C21825 c21825Mo1938;
        if (m52713() || abstractC23903.f77452 != EnumC10477.f35879) {
            return false;
        }
        if (this != abstractC23903) {
            C18258 c18258 = (C18258) abstractC23903;
            if (c18258.m42449((AbstractC0618) this.f77448)) {
                if (c23800.m52423(c18258.f77448, this.f77448.f77449) != null) {
                    AbstractC16579 abstractC16579M524011 = c23800.m52409(this, this.f77448.f77449);
                    AbstractC16579 abstractC16579M524012 = c23800.m52409(c18258, this.f77448.f77449);
                    if (!c23800.m52429(abstractC16579M524011, abstractC16579M524012, true) || (z && !c23800.m52365(abstractC16579M524011, abstractC16579M524012))) {
                        if ((this.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            return false;
                        }
                        j = c18258.f77447;
                        if (((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0 && (j & 8796093022208L) == 0) || !c18258.m42449(abstractC0618) || !m52704(abstractC0618, c23800)) {
                            return false;
                        }
                        abstractC16579M52409 = c23800.m52409(this, abstractC0618.f77449);
                        abstractC16579M524010 = c23800.m52409(c18258, abstractC0618.f77449);
                        if (!c23800.m52429(abstractC16579M52409, abstractC16579M524010, true)) {
                            return false;
                        }
                        if (z) {
                            c10391 = c23800.f76946;
                            c21825Mo1938 = abstractC16579M52409.mo1938();
                            if (!c23800.m52393(abstractC16579M52409.mo16235(), c23800.m52371(abstractC16579M524010.mo16235(), abstractC16579M524010.mo1938(), c21825Mo1938), c10391)) {
                                return false;
                            }
                        }
                    }
                } else {
                    if ((this.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        return false;
                    }
                    j = c18258.f77447;
                    if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                    }
                    abstractC16579M52409 = c23800.m52409(this, abstractC0618.f77449);
                    abstractC16579M524010 = c23800.m52409(c18258, abstractC0618.f77449);
                    if (!c23800.m52429(abstractC16579M52409, abstractC16579M524010, true)) {
                        return false;
                    }
                    if (z) {
                        c10391 = c23800.f76946;
                        c21825Mo1938 = abstractC16579M52409.mo1938();
                        if (!c23800.m52393(abstractC16579M52409.mo16235(), c23800.m52371(abstractC16579M524010.mo16235(), abstractC16579M524010.mo1938(), c21825Mo1938), c10391)) {
                            return false;
                        }
                    }
                }
            } else {
                if ((this.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                    return false;
                }
                j = c18258.f77447;
                if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                }
                abstractC16579M52409 = c23800.m52409(this, abstractC0618.f77449);
                abstractC16579M524010 = c23800.m52409(c18258, abstractC0618.f77449);
                if (!c23800.m52429(abstractC16579M52409, abstractC16579M524010, true)) {
                    return false;
                }
                if (z) {
                    c10391 = c23800.f76946;
                    c21825Mo1938 = abstractC16579M52409.mo1938();
                    if (!c23800.m52393(abstractC16579M52409.mo16235(), c23800.m52371(abstractC16579M524010.mo16235(), abstractC16579M524010.mo1938(), c21825Mo1938), c10391)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m42449(AbstractC0618 abstractC0618) {
        int i = (int) (this.f77447 & 7);
        if (i == 0) {
            return m52724() == abstractC0618.m52724() && (abstractC0618.mo20276() & 512) == 0;
        }
        if (i != 1) {
            return i == 4 && (abstractC0618.mo20276() & 512) == 0;
        }
        return !this.f77448.m52721() || (this.f77447 & 8) == 0;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo42454(AbstractC23903 abstractC23903, C23800 c23800) {
        if (((int) (this.f77447 & 7)) != 1) {
            return super.mo42454(abstractC23903, c23800);
        }
        return !this.f77448.m52721() || abstractC23903 == this.f77448 || (this.f77447 & 8) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m42451(AbstractC0618 abstractC0618, C23800 c23800, boolean z) {
        C18258 c18258M52374 = c23800.m52374(this, abstractC0618, z, f58257);
        if (c18258M52374 != null) {
            return c18258M52374;
        }
        if (!c23800.m52435(abstractC0618.f77449) || abstractC0618.m52721()) {
            return null;
        }
        return m42451(c23800.m52432(abstractC0618.f77449).f53222, c23800, z);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m42455() {
        this.f77448.mo49994();
        if (this.f58259 == null) {
            C19003 c19003 = new C19003();
            Iterator it = this.f77449.mo33523().iterator();
            int i = 0;
            while (it.hasNext()) {
                c19003.m43723(new C6263(8589934592L, this.f77453.f38032.m17389("arg" + i), (AbstractC16579) it.next(), this));
                i++;
            }
            this.f58259 = c19003.m43726();
        }
        C6171.m17171(this.f58259);
        return this.f58259;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo17326(AbstractC16579 abstractC16579, C23800 c23800) {
        return new C18258(this.f77447, this.f77453, c23800.m52409(this, abstractC16579), this.f77448);
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final EnumC1923 mo17325() {
        AbstractC11242 abstractC11242 = this.f77453;
        C23942 c23942 = abstractC11242.f38032.f21322;
        if (abstractC11242 == c23942.f77632) {
            return EnumC1923.CONSTRUCTOR;
        }
        if (abstractC11242 == c23942.f77608) {
            return EnumC1923.STATIC_INIT;
        }
        if ((this.f77447 & 1048576) != 0) {
            return mo22992() ? EnumC1923.STATIC_INIT : EnumC1923.INSTANCE_INIT;
        }
        return EnumC1923.METHOD;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42450() {
        return mo17325() == EnumC1923.STATIC_INIT || mo17325() == EnumC1923.INSTANCE_INIT;
    }

    @Override // l.InterfaceC9686
    /* JADX INFO: renamed from: ᩸ */
    public AbstractC23156 mo24654() {
        return this.f58258;
    }

    @Override // l.InterfaceC9686
    public C21825 getParameters() {
        return m42455();
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo18690(this, obj);
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo4412(this, (Object) locale);
    }
}
