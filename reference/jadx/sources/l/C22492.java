package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes2.dex */
public final class C22492 extends AbstractC0618 implements InterfaceC23216 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f73414;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f73415;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f73416;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f73417;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C21825 f73418;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f73419;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C21825 f73420;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C21825 f73421;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f73422;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16163 f73423;

    public C22492(long j, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        super(EnumC10477.f35865, j, abstractC11242, abstractC16579, abstractC23903);
        this.f73420 = C21825.m48588();
        this.f73416 = false;
        this.f73417 = null;
        this.f73419 = AbstractC0618.m2876(abstractC11242, abstractC23903);
        this.f73414 = AbstractC0618.m2875(abstractC11242, abstractC23903);
        this.f73415 = null;
        this.f73422 = null;
        this.f73423 = C16163.m38250();
        this.f73421 = C21825.m48588();
    }

    public C22492(long j, AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        this(j, abstractC11242, new C0309(null, AbstractC16579.f53219, null), abstractC23903);
        this.f77449.f53222 = this;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܿ */
    public final long mo20276() {
        mo49994();
        return this.f77447;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۤۙ */
    public final AbstractC9462 mo20272() {
        mo49994();
        return this.f73417;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙۙ */
    public final C21825 mo20271() {
        mo49994();
        return super.mo20271();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C21825 mo50009() {
        mo49994();
        return super.mo50009();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 mo50006(C23800 c23800) {
        if (this.f77454 == null) {
            this.f77454 = new C0309(c23800.m52402(this.f77449.mo1934()), C21825.m48588(), this, this.f77449.f53221);
        }
        return this.f77454;
    }

    @Override // l.AbstractC23903
    public final String toString() {
        if (this.f77453.isEmpty()) {
            return C20414.m46158("anonymous.class", this.f73414);
        }
        return this.f73419.toString();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۗ */
    public final AbstractC11242 mo20270() {
        return this.f73419;
    }

    @Override // l.InterfaceC23216, l.InterfaceC4164
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC11242 mo11809() {
        return this.f73419;
    }

    @Override // l.AbstractC0618, l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ܶ */
    public final C21825 mo2882() {
        C21825 c21825Mo2882 = super.mo2882();
        if (!this.f73420.isEmpty()) {
            Iterator it = this.f73420.m48589().iterator();
            while (it.hasNext()) {
                c21825Mo2882 = c21825Mo2882.m48597((C16142) it.next());
            }
        }
        return c21825Mo2882;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 mo50003() {
        return this.f73414;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo50008(AbstractC23903 abstractC23903, C23800 c23800) {
        if (this == abstractC23903) {
            return true;
        }
        if ((abstractC23903.mo20276() & 512) != 0) {
            AbstractC16579 abstractC16579M52432 = this.f77449;
            while (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
                for (C21825 c21825M52439 = c23800.m52439(abstractC16579M52432); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
                    if (((AbstractC16579) c21825M52439.f70876).f53222.mo50008(abstractC23903, c23800)) {
                        return true;
                    }
                }
                abstractC16579M52432 = c23800.m52432(abstractC16579M52432);
            }
            return false;
        }
        AbstractC16579 abstractC16579M52433 = this.f77449;
        while (abstractC16579M52433.m39001(EnumC6617.CLASS)) {
            if (abstractC16579M52433.f53222 == abstractC23903) {
                return true;
            }
            abstractC16579M52433 = c23800.m52432(abstractC16579M52433);
        }
        return false;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo49994() {
        InterfaceC13320 interfaceC13320 = this.f77451;
        try {
            super.mo49994();
        } catch (C4146 e) {
            e.f15169.m13418(this, interfaceC13320);
            this.f77447 |= 9;
            this.f77449 = new C5954(this, AbstractC16579.f53219);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m50007() {
        m52718();
        AbstractC16579 abstractC16579 = this.f77449;
        if (abstractC16579 instanceof C0309) {
            C0309 c0309 = (C0309) abstractC16579;
            if (c0309.f1658 == null) {
                c0309.f1658 = C21825.m48588();
            }
            C21825 c21825 = c0309.f1657;
            if (c21825 != null) {
                C19003 c19003 = new C19003();
                Iterator it = c21825.iterator();
                while (it.hasNext()) {
                    c19003.m43723(((AbstractC16579) it.next()).mo39006());
                }
                return c19003.m43726();
            }
            return c0309.f1658;
        }
        return C21825.m48588();
    }

    @Override // l.InterfaceC23216
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo49995() {
        m52718();
        AbstractC16579 abstractC16579 = this.f77449;
        if (abstractC16579 instanceof C0309) {
            C0309 c0309 = (C0309) abstractC16579;
            if (c0309.f1654 == null) {
                c0309.f1654 = AbstractC16579.f53219;
            }
            if (c0309.mo16236()) {
                return AbstractC16579.f53219;
            }
            return c0309.f1654.mo39006();
        }
        return AbstractC16579.f53219;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final EnumC1923 mo17325() {
        m52718();
        mo49994();
        long j = this.f77447;
        if ((8192 & j) != 0) {
            return EnumC1923.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC1923.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC1923.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC1923.RECORD;
        }
        return EnumC1923.CLASS;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩹ */
    public final Set mo35138() {
        m52718();
        mo49994();
        return C8360.m21885(this.f77447 & (-8796093022209L));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16142 m49998(C6263 c6263) {
        for (C16142 c16142 : this.f73420) {
            if (c16142.f77453 == c6263.f77453) {
                return c16142;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16142 m49999(C6656 c6656) {
        C16142 c16142 = null;
        for (C16142 c16143 : this.f73420) {
            if (c16143.f77453 == c6656.f22478 && c6656.f30189 == c16143.f52154) {
                c16142 = c16143;
            }
        }
        return c16142;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50000(C16142 c16142, C6656 c6656, C21825 c21825) {
        boolean z;
        if (c16142 != null) {
            C21825 c21825M48585 = C21825.m48585(c16142, this.f73420);
            this.f73420 = c21825M48585;
            this.f73420 = c21825M48585.m48591(new C16142(c6656.f22475, c16142.f52155, c16142.f52152));
            return;
        }
        C21825 c21826 = this.f73420;
        C6263 c6263 = c6656.f22475;
        if (c6263.f77449.m39001(EnumC6617.ARRAY)) {
            C8777 c8777 = (C8777) c6263.f77449;
            c8777.getClass();
            if (c8777 instanceof C19360) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f73420 = c21826.m48591(new C16142(c6263, c21825, z));
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m50004() {
        return this.f73420;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m50005() {
        return this.f73420;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m49997(C21825 c21825) {
        this.f73420 = c21825;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1342 m50012() {
        m52718();
        if (this.f77448.f77452 == EnumC10477.f35867) {
            return EnumC1342.TOP_LEVEL;
        }
        if (this.f77453.isEmpty()) {
            return EnumC1342.ANONYMOUS;
        }
        if (this.f77448.f77452 == EnumC10477.f35879) {
            return EnumC1342.LOCAL;
        }
        return EnumC1342.MEMBER;
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo18691(this, obj);
    }

    @Override // l.AbstractC0618, l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo4413(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50002(C23800 c23800) {
        if (c23800.f76953.m24141(this) != null) {
            mo49994();
            if ((this.f77447 & 16384) == 0 || c23800.m52432(this.f77449).f53222 != c23800.f76937.f14289) {
                return;
            }
            mo49994();
            if ((this.f77447 & 1040) != 0 || c23800.m52375(this) == null) {
                return;
            }
            this.f77447 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m49996() {
        this.f77452 = EnumC10477.f35865;
        this.f77454 = null;
        this.f73417 = null;
        this.f77447 = 0L;
        AbstractC16579 abstractC16579 = this.f77449;
        if (abstractC16579 instanceof C0309) {
            C0309 c0309 = (C0309) abstractC16579;
            c0309.mo1927(AbstractC16579.f53219);
            c0309.f1656 = -1;
            c0309.f1655 = null;
            c0309.f1659 = null;
            c0309.f1654 = null;
            c0309.f1658 = null;
            c0309.f1657 = null;
        }
        m50011();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m50011() {
        this.f77450 = null;
        this.f73423 = C16163.m38250();
    }

    @Override // l.AbstractC0618
    /* JADX INFO: renamed from: ᩶ۙ */
    public final C16163 mo2884() {
        return this.f73423;
    }

    @Override // l.AbstractC0618
    /* JADX INFO: renamed from: ֡ۙ */
    public final boolean mo2877() {
        return (this.f77447 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50001(C16163 c16163) {
        C6171.m17176(!this.f73423.m38255());
        this.f73423 = c16163;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50010() {
        return (this.f77447 & 2305843009213693952L) != 0;
    }
}
