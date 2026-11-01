package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public class C3897 extends AbstractC18715 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f14569;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f14571;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C6656[] f14573;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f14574;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8753 f14576;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10955 f14577;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f14580;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f14583;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC10249 f14568 = EnumC10249.NORMAL;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f14575 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7403 f14570 = new C7403(false);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7403 f14581 = new C7403(false);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7403 f14578 = new C7403(false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7403 f14567 = new C7403(true);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7403 f14582 = new C7403(true);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C7403 f14572 = new C7403(true);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7403 f14579 = new C7403(true);

    @Override // l.AbstractC18715, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo3930(C7672 c7672) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        mo7248((AbstractC8774) c15103.f49323);
        m11349(c15103.f49323);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        mo7248(c23570.f76357);
        if (C3128.m9454(c23570.f76357)) {
            AbstractC23903 abstractC23903 = c23570.f76355;
            if (abstractC23903.f77452 == EnumC10477.f35878) {
                m11341((InterfaceC12260) c23570, (C6263) abstractC23903);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m11352(AbstractC8774 abstractC8774) {
        if (abstractC8774 != null) {
            super.mo7248(abstractC8774);
            if (this.f14570.m19747()) {
                m11345();
            }
        }
    }

    @Override // l.AbstractC18715
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo11337() {
        boolean z = this.f14575;
        C7403 c7403 = this.f14570;
        if (!z) {
            c7403.m19738(this.f14571, this.f14569);
        } else {
            for (int i = this.f14571; i < this.f14569; i++) {
                C6263 c6263 = this.f14573[i].f22475;
                if (!m11344(c6263) || !c6263.mo22992()) {
                    c7403.m19743(i);
                }
            }
        }
        this.f14581.m19738(this.f14571, this.f14569);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo11351(C6263 c6263) {
        if (c6263.f21226 < this.f14583) {
            return false;
        }
        EnumC10477 enumC10477 = c6263.f77448.f77452;
        return enumC10477 == EnumC10477.f35879 || enumC10477 == EnumC10477.f35878 || m11344(c6263);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11344(C6263 c6263) {
        AbstractC23903 abstractC23903 = c6263.f77448;
        if (abstractC23903.f77452 != EnumC10477.f35865 || (c6263.f77447 & 8590196752L) != 16) {
            return false;
        }
        AbstractC23903 abstractC23904 = this.f14576.f30086;
        C22492 c22492 = (C22492) abstractC23903;
        abstractC23904.getClass();
        while (abstractC23904.f77452 != EnumC10477.f35867) {
            if (abstractC23904 == c22492) {
                return true;
            }
            abstractC23904 = abstractC23904.f77448;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11348(C6656 c6656) {
        C6263 c6263 = c6656.f22475;
        C6656[] c6656Arr = (C6656[]) C23805.m52456(this.f14569, this.f14573);
        this.f14573 = c6656Arr;
        long j = c6263.f77447;
        if ((16 & j) == 0) {
            c6263.f77447 = j | 2199023255552L;
        }
        int i = this.f14569;
        c6263.f21228 = i;
        c6656Arr[i] = c6656;
        this.f14570.m19737(i);
        this.f14581.m19743(this.f14569);
        this.f14569++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11340(AbstractC8774 abstractC8774, C6263 c6263) {
        int i = c6263.f21228;
        int i2 = this.f14574;
        C10955 c10955 = this.f14577;
        if (i < i2 || !mo11351(c6263)) {
            if ((c6263.f77447 & 16) != 0) {
                C20414 c20414 = c10955.f37257;
                C5909 c5909 = C23879.f77204;
                c20414.m48199(abstractC8774, new C5909("compiler", "var.might.already.be.assigned", c6263));
                return;
            }
            return;
        }
        long j = c6263.f77447;
        long j2 = 2199023255552L & j;
        C7403 c7403 = this.f14581;
        if (j2 != 0) {
            if (!c7403.m19735(c6263.f21228)) {
                c6263.f77447 &= -2199023255553L;
            } else {
                m11347(c6263);
            }
        } else if ((16 & j) != 0) {
            if ((8589934592L & j) != 0) {
                if ((j & 549755813888L) != 0) {
                    C20414 c20415 = c10955.f37257;
                    C5909 c59010 = C23879.f77204;
                    c20415.m48199(abstractC8774, new C5909("compiler", "multicatch.parameter.may.not.be.assigned", c6263));
                } else {
                    C20414 c20416 = c10955.f37257;
                    C5909 c59011 = C23879.f77204;
                    c20416.m48199(abstractC8774, new C5909("compiler", "final.parameter.may.not.be.assigned", c6263));
                }
            } else if (!c7403.m19735(c6263.f21228)) {
                c10955.f37257.m48199(abstractC8774, c10955.f37249.m51907(this.f14568.f34961, c6263));
            } else {
                m11347(c6263);
            }
        }
        this.f14570.m19743(c6263.f21228);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11347(C6263 c6263) {
        boolean zM19735 = this.f14570.m19735(c6263.f21228);
        C7403 c7403 = this.f14581;
        if (!zM19735) {
            c7403.m19737(c6263.f21228);
            this.f14578.m19737(c6263.f21228);
        } else {
            c7403.m19737(c6263.f21228);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11338(AbstractC8774 abstractC8774) {
        AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC8774);
        if (abstractC8774M9467.m22847(EnumC18651.f60465) || abstractC8774M9467.m22847(EnumC18651.f60473)) {
            AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC8774M9467);
            if (abstractC23903M9471.f77452 == EnumC10477.f35878) {
                m11340(abstractC8774M9467, (C6263) abstractC23903M9471);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11341(InterfaceC12260 interfaceC12260, C6263 c6263) {
        C5909 c5909 = C23879.f77204;
        m11342(interfaceC12260, c6263, new C5909("compiler", "var.might.not.have.been.initialized", c6263));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11342(InterfaceC12260 interfaceC12260, C6263 c6263, C5909 c5909) {
        if ((c6263.f21228 >= this.f14574 || c6263.f77448.f77452 != EnumC10477.f35865) && mo11351(c6263)) {
            int i = c6263.f21228;
            C7403 c7403 = this.f14570;
            if (c7403.m19735(i) || (c6263.f77447 & 4398046511104L) != 0) {
                return;
            }
            this.f14577.f37257.m48199(interfaceC12260, c5909);
            c7403.m19743(c6263.f21228);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11335(C7403... c7403Arr) {
        for (C7403 c7403 : c7403Arr) {
            c7403.m19742();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11343(boolean z) {
        C7403 c7403 = this.f14582;
        C7403 c7404 = this.f14570;
        c7403.m19746(c7404);
        C7403 c7405 = this.f14579;
        C7403 c7406 = this.f14581;
        c7405.m19746(c7406);
        this.f14567.m19746(c7404);
        this.f14572.m19746(c7406);
        if (z) {
            m11335(c7404, c7406);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11345() {
        C7403 c7403 = this.f14567;
        C7403 c7404 = this.f14582;
        c7404.m19739(c7403);
        this.f14570.m19746(c7404);
        C7403 c7405 = this.f14572;
        C7403 c7406 = this.f14579;
        c7406.m19739(c7405);
        this.f14581.m19746(c7406);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11350(C21825 c21825) {
        if (c21825 != null) {
            while (c21825.m48595()) {
                m11352((AbstractC8774) c21825.f70876);
                c21825 = c21825.f70877;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11346(AbstractC8774 abstractC8774) {
        boolean zMo9479 = abstractC8774.f30190.mo9479();
        C10955 c10955 = this.f14577;
        C7403 c7403 = this.f14579;
        C7403 c7404 = this.f14582;
        C7403 c7405 = this.f14572;
        C7403 c7406 = this.f14567;
        C7403 c7407 = this.f14581;
        C7403 c7408 = this.f14570;
        if (zMo9479) {
            if (c7408.m19747()) {
                m11345();
            }
            c7406.m19746(c7408);
            c7406.m19738(this.f14574, this.f14569);
            c7405.m19746(c7407);
            c7405.m19738(this.f14574, this.f14569);
            c7404.m19746(c7408);
            c7403.m19746(c7407);
        } else if (!abstractC8774.f30190.mo9483()) {
            super.mo7248(abstractC8774);
            if (!c7408.m19747()) {
                m11343(abstractC8774.f30190 != c10955.f37253.f14247);
            }
        } else {
            if (c7408.m19747()) {
                m11345();
            }
            c7404.m19746(c7408);
            c7404.m19738(this.f14574, this.f14569);
            c7403.m19746(c7407);
            c7403.m19738(this.f14574, this.f14569);
            c7406.m19746(c7408);
            c7405.m19746(c7407);
        }
        if (abstractC8774.f30190 != c10955.f37253.f14247) {
            m11335(c7408, c7407);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1065(C8753 c8753) {
        if (c8753.f30086 == null) {
            return;
        }
        C10955 c10955 = this.f14577;
        C16826 c16826 = c10955.f37252;
        c10955.f37252 = c10955.f37252.m39465(c8753.f30086);
        try {
            if (c8753.f30086 != null) {
                C8753 c8754 = this.f14576;
                int i = this.f14574;
                int i2 = this.f14569;
                C19003 c19003 = this.f60692;
                this.f60692 = new C19003();
                if (c8753.f30093 != c10955.f37255.f77594) {
                    this.f14574 = this.f14569;
                }
                this.f14576 = c8753;
                try {
                    for (C21825 c21825 = c8753.f30090; c21825.m48595(); c21825 = c21825.f70877) {
                        if (((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60554)) {
                            C6656 c6656 = (C6656) c21825.f70876;
                            if ((8 & c6656.f22476.f70567) != 0 && mo11351(c6656.f22475)) {
                                m11348(c6656);
                            }
                        }
                    }
                    for (C21825 c21826 = c8753.f30090; c21826.m48595(); c21826 = c21826.f70877) {
                        if (!((AbstractC8774) c21826.f70876).m22847(EnumC18651.f60478) && (C3128.m9431((AbstractC8774) c21826.f70876) & 8) != 0) {
                            super.mo7248((AbstractC8774) c21826.f70876);
                            m11336(false);
                        }
                    }
                    for (C21825 c21827 = c8753.f30090; c21827.m48595(); c21827 = c21827.f70877) {
                        if (((AbstractC8774) c21827.f70876).m22847(EnumC18651.f60554)) {
                            C6656 c6657 = (C6656) c21827.f70876;
                            if ((c6657.f22476.f70567 & 8) == 0 && mo11351(c6657.f22475)) {
                                m11348(c6657);
                            }
                        }
                    }
                    for (C21825 c21828 = c8753.f30090; c21828.m48595(); c21828 = c21828.f70877) {
                        if (!((AbstractC8774) c21828.f70876).m22847(EnumC18651.f60478) && (C3128.m9431((AbstractC8774) c21828.f70876) & 8) == 0) {
                            super.mo7248((AbstractC8774) c21828.f70876);
                            m11336(false);
                        }
                    }
                    for (C21825 c21829 = c8753.f30090; c21829.m48595(); c21829 = c21829.f70877) {
                        if (((AbstractC8774) c21829.f70876).m22847(EnumC18651.f60478)) {
                            super.mo7248((AbstractC8774) c21829.f70876);
                        }
                    }
                    this.f60692 = c19003;
                    this.f14569 = i2;
                    this.f14574 = i;
                    this.f14576 = c8754;
                    c10955.f37252 = c16826;
                    return;
                } catch (Throwable th) {
                    this.f60692 = c19003;
                    this.f14569 = i2;
                    this.f14574 = i;
                    this.f14576 = c8754;
                    throw th;
                }
            }
            c10955.f37252 = c16826;
        } catch (Throwable th2) {
            c10955.f37252 = c16826;
            throw th2;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) throws Throwable {
        C16826 c16826;
        C10955 c10955;
        boolean z;
        C10955 c10956;
        C16826 c16827;
        boolean z2;
        C7403 c7403 = this.f14581;
        C7403 c7404 = this.f14570;
        if (c23195.f75268 != null && (c23195.f75263.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            C10955 c10957 = this.f14577;
            C16826 c16828 = c10957.f37252;
            c10957.f37252 = c10957.f37252.m39465(c23195.f75263);
            try {
                if (c23195.f75268 == null) {
                    c10957.f37252 = c16828;
                    return;
                }
                if ((c23195.f75263.f77447 & 562949953425408L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    c10957.f37252 = c16828;
                    return;
                }
                C7403 c7405 = new C7403(c7404);
                C7403 c7406 = new C7403(c7403);
                int i = this.f14569;
                int i2 = this.f14574;
                int i3 = this.f14571;
                C6171.m17176(this.f60692.isEmpty());
                boolean z3 = this.f14575;
                try {
                    boolean zM9455 = C3128.m9455(c23195);
                    this.f14575 = zM9455;
                    if (!zM9455) {
                        this.f14574 = this.f14569;
                    }
                    for (C21825 c21825 = c23195.f75270; c21825.m48595(); c21825 = c21825.f70877) {
                        C6656 c6656 = (C6656) c21825.f70876;
                        super.mo7248((AbstractC8774) c6656);
                        C6171.m17175("Method parameter without PARAMETER flag", (c6656.f22475.f77447 & 8589934592L) != 0);
                        m11349(c6656);
                    }
                    super.mo7248(c23195.f75268);
                    long j = c23195.f75263.f77447;
                    boolean z4 = (j & 2251799813685248L) != 0;
                    if (this.f14575) {
                        boolean z5 = (j & 68719476736L) != 0;
                        try {
                            int i4 = this.f14574;
                            while (i4 < this.f14569) {
                                C6656 c6657 = this.f14573[i4];
                                C6263 c6263 = c6657.f22475;
                                c10956 = c10957;
                                try {
                                    c16827 = c16828;
                                    try {
                                        if (c6263.f77448 == this.f14576.f30086) {
                                            if (!z5 || z4) {
                                                z5 = z5;
                                                z2 = z3;
                                                if (!z4) {
                                                    m11341(C3128.m9459(c23195.f75268), c6263);
                                                } else if (!c6263.m52720().m50010() || (c6263.f77447 & 2305843009230471186L) == 0 || c6263.mo22992() || c6263.f77448.f77452 != EnumC10477.f35865) {
                                                    m11341(C3128.m9440(c6263, c6657, false), c6263);
                                                } else if (!c7404.m19735(c6263.f21228) && c7403.m19735(c6263.f21228) && c23195.f75271) {
                                                    c6263.f77447 |= 2251799813685248L;
                                                } else {
                                                    m11341(C3128.m9459(c23195.f75268), c6263);
                                                }
                                            } else {
                                                InterfaceC12260 interfaceC12260M9440 = C3128.m9440(c6263, c6657, false);
                                                try {
                                                    C5909 c5909 = C23879.f77204;
                                                    z2 = z3;
                                                    try {
                                                        m11342(interfaceC12260M9440, c6263, new C5909("compiler", "var.not.initialized.in.default.constructor", c6263));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c10955 = c10956;
                                                        c16826 = c16827;
                                                        z = z2;
                                                        try {
                                                            c7404.m19746(c7405);
                                                            c7403.m19746(c7406);
                                                            this.f14569 = i;
                                                            this.f14574 = i2;
                                                            this.f14571 = i3;
                                                            this.f14575 = z;
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z2 = z3;
                                                    c10955 = c10956;
                                                    c16826 = c16827;
                                                    z = z2;
                                                    c7404.m19746(c7405);
                                                    c7403.m19746(c7406);
                                                    this.f14569 = i;
                                                    this.f14574 = i2;
                                                    this.f14571 = i3;
                                                    this.f14575 = z;
                                                    throw th;
                                                }
                                            }
                                            i4++;
                                            c10957 = c10956;
                                            c16828 = c16827;
                                            z5 = z5;
                                            z3 = z2;
                                        } else {
                                            z2 = z3;
                                        }
                                        i4++;
                                        c10957 = c10956;
                                        c16828 = c16827;
                                        z5 = z5;
                                        z3 = z2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c16827 = c16828;
                                    z2 = z3;
                                    c10955 = c10956;
                                    c16826 = c16827;
                                    z = z2;
                                    c7404.m19746(c7405);
                                    c7403.m19746(c7406);
                                    this.f14569 = i;
                                    this.f14574 = i2;
                                    this.f14571 = i3;
                                    this.f14575 = z;
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c10956 = c10957;
                        }
                    }
                    c10956 = c10957;
                    c16827 = c16828;
                    z2 = z3;
                    m11336(true);
                    try {
                        c7404.m19746(c7405);
                        c7403.m19746(c7406);
                        this.f14569 = i;
                        this.f14574 = i2;
                        this.f14571 = i3;
                        this.f14575 = z2;
                        c10956.f37252 = c16827;
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        c10955 = c10956;
                        c16826 = c16827;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c16826 = c16828;
                    c10955 = c10957;
                    z = z3;
                }
            } catch (Throwable th9) {
                th = th9;
                c16826 = c16828;
                c10955 = c10957;
            }
            c10955.f37252 = c16826;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m11336(boolean z) {
        boolean z2;
        C21825 c21825M43726 = this.f60692.m43726();
        this.f60692 = new C19003();
        while (c21825M43726.m48595()) {
            C18009 c18009 = (C18009) c21825M43726.f70876;
            c21825M43726 = c21825M43726.f70877;
            if (z && c18009.f57603.m22847(EnumC18651.f60528)) {
                z2 = true;
            } else {
                C20414 c20414 = this.f14577.f37257;
                AbstractC8774 abstractC8774 = c18009.f57603;
                abstractC8774.getClass();
                if (c20414.m46180(abstractC8774)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C6171.m17173(c18009.f57603, z2);
            if (z && this.f14575) {
                C6171.m17176(c18009 instanceof C13071);
                this.f14570.m19746(((C13071) c18009).f43566);
                for (int i = this.f14574; i < this.f14569; i++) {
                    AbstractC8774 abstractC8775 = c18009.f57603;
                    abstractC8775.getClass();
                    m11341((InterfaceC12260) abstractC8775, this.f14573[i].f22475);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11349(C6656 c6656) {
        this.f14570.m19743(c6656.f22475.f21228);
        this.f14581.m19737(c6656.f22475.f21228);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3928(C6656 c6656) {
        EnumC10477 enumC10477;
        C10955 c10955 = this.f14577;
        C16826 c16826 = c10955.f37252;
        c10955.f37252 = c10955.f37252.m39465(c6656.f22475);
        try {
            boolean zMo11351 = mo11351(c6656.f22475);
            if (zMo11351 && ((enumC10477 = c6656.f22475.f77448.f77452) == EnumC10477.f35879 || enumC10477 == EnumC10477.f35878)) {
                m11348(c6656);
            }
            AbstractC5930 abstractC5930 = c6656.f22481;
            if (abstractC5930 != null) {
                m11352(abstractC5930);
                if (zMo11351) {
                    m11340((AbstractC8774) c6656, c6656.f22475);
                }
            }
        } finally {
            c10955.f37252 = c16826;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        int i = this.f14569;
        m49334(c21452.f69737);
        this.f14569 = i;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        C7403 c7403;
        C7403 c7404;
        C19003 c19003 = this.f60692;
        EnumC10249 enumC10249 = this.f14568;
        this.f14568 = EnumC10249.NORMAL;
        C7403 c7405 = new C7403(true);
        C7403 c7406 = new C7403(true);
        this.f60692 = new C19003();
        C10955 c10955 = this.f14577;
        int i = c10955.f37257.f66177;
        while (true) {
            c7403 = this.f14581;
            C7403 c7407 = new C7403(c7403);
            c7407.m19745(this.f14569);
            super.mo7248(c0285.f1595);
            m43248(c0285);
            m11346(c0285.f1596);
            if (!this.f14568.m26043()) {
                c7405.m19746(this.f14582);
                c7406.m19746(this.f14579);
            }
            int i2 = c10955.f37257.f66177;
            c7404 = this.f14570;
            if (i2 != i || this.f14568.m26043()) {
                break;
            }
            C7403 c7408 = new C7403(c7407);
            C7403 c7409 = this.f14572;
            c7408.m19744(c7409);
            if (c7408.m19740(this.f14574) == -1) {
                break;
            }
            c7404.m19746(this.f14567);
            c7407.m19739(c7409);
            c7403.m19746(c7407);
            this.f14568 = EnumC10249.SPECULATIVE_LOOP;
        }
        this.f14568 = enumC10249;
        c7404.m19746(c7405);
        c7403.m19746(c7406);
        m43245(c0285, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        C7403 c7403;
        C19003 c19003 = this.f60692;
        EnumC10249 enumC10249 = this.f14568;
        this.f14568 = EnumC10249.NORMAL;
        C7403 c7404 = new C7403(true);
        C7403 c7405 = new C7403(true);
        this.f60692 = new C19003();
        C10955 c10955 = this.f14577;
        int i = c10955.f37257.f66177;
        C7403 c7406 = this.f14581;
        C7403 c7407 = new C7403(c7406);
        c7407.m19745(this.f14569);
        while (true) {
            m11346(c22885.f74426);
            if (!this.f14568.m26043()) {
                c7404.m19746(this.f14582);
                c7405.m19746(this.f14579);
            }
            C7403 c7408 = this.f14567;
            c7403 = this.f14570;
            c7403.m19746(c7408);
            c7406.m19746(this.f14572);
            super.mo7248(c22885.f74425);
            m43248(c22885);
            if (c10955.f37257.f66177 != i || this.f14568.m26043()) {
                break;
            }
            C7403 c7409 = new C7403(c7407);
            c7409.m19744(c7406);
            if (c7409.m19740(this.f14574) == -1) {
                break;
            }
            c7407.m19739(c7406);
            c7406.m19746(c7407);
            this.f14568 = EnumC10249.SPECULATIVE_LOOP;
        }
        this.f14568 = enumC10249;
        c7403.m19746(c7404);
        c7406.m19746(c7405);
        m43245(c22885, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        C7403 c7403;
        C7403 c7404;
        C19003 c19003 = this.f60692;
        EnumC10249 enumC10249 = this.f14568;
        this.f14568 = EnumC10249.NORMAL;
        int i = this.f14569;
        m49334(c14398.f47204);
        C7403 c7405 = new C7403(true);
        C7403 c7406 = new C7403(true);
        this.f60692 = new C19003();
        C10955 c10955 = this.f14577;
        int i2 = c10955.f37257.f66177;
        while (true) {
            c7403 = this.f14581;
            C7403 c7407 = new C7403(c7403);
            c7407.m19745(this.f14569);
            AbstractC5930 abstractC5930 = c14398.f47207;
            c7404 = this.f14570;
            if (abstractC5930 != null) {
                m11346(abstractC5930);
                if (!this.f14568.m26043()) {
                    c7405.m19746(this.f14582);
                    c7406.m19746(this.f14579);
                }
                c7404.m19746(this.f14567);
                c7403.m19746(this.f14572);
            } else if (!this.f14568.m26043()) {
                c7405.m19746(c7404);
                c7405.m19738(this.f14574, this.f14569);
                c7406.m19746(c7403);
                c7406.m19738(this.f14574, this.f14569);
            }
            super.mo7248(c14398.f47206);
            m43248(c14398);
            m49334(c14398.f47205);
            if (c10955.f37257.f66177 != i2 || this.f14568.m26043()) {
                break;
            }
            C7403 c7408 = new C7403(c7407);
            c7408.m19744(c7403);
            if (c7408.m19740(this.f14574) == -1) {
                break;
            }
            c7407.m19739(c7403);
            c7403.m19746(c7407);
            this.f14568 = EnumC10249.SPECULATIVE_LOOP;
        }
        this.f14568 = enumC10249;
        c7404.m19746(c7405);
        c7403.m19746(c7406);
        m43245(c14398, c19003);
        this.f14569 = i;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        mo3928(c16514.f53042);
        C19003 c19003 = this.f60692;
        EnumC10249 enumC10249 = this.f14568;
        this.f14568 = EnumC10249.NORMAL;
        int i = this.f14569;
        super.mo7248(c16514.f53044);
        C7403 c7403 = this.f14570;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14581;
        C7403 c7406 = new C7403(c7405);
        m11340((AbstractC8774) c16514, c16514.f53042.f22475);
        this.f60692 = new C19003();
        C10955 c10955 = this.f14577;
        int i2 = c10955.f37257.f66177;
        while (true) {
            C7403 c7407 = new C7403(c7405);
            c7407.m19745(this.f14569);
            super.mo7248(c16514.f53043);
            m43248(c16514);
            if (c10955.f37257.f66177 != i2 || this.f14568.m26043()) {
                break;
            }
            C7403 c7408 = new C7403(c7407);
            c7408.m19744(c7405);
            if (c7408.m19740(this.f14574) == -1) {
                break;
            }
            c7407.m19739(c7405);
            c7405.m19746(c7407);
            this.f14568 = EnumC10249.SPECULATIVE_LOOP;
        }
        this.f14568 = enumC10249;
        c7403.m19746(c7404);
        c7406.m19739(c7405);
        c7405.m19746(c7406);
        m43245(c16514, c19003);
        this.f14569 = i;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        super.mo7248(c2732.f10508);
        m43245(c2732, c19003);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        m11334(c2026, c2026.f7570, c2026.f7568, c2026.f7566);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        m11334(c9789, c9789.f33504, c9789.f33505, c9789.f33503);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11334(AbstractC8774 abstractC8774, AbstractC5930 abstractC5930, C21825 c21825, boolean z) {
        C19003 c19003 = this.f60692;
        this.f60692 = new C19003();
        int i = this.f14569;
        m11352(abstractC5930);
        C7403 c7403 = this.f14570;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14581;
        C7403 c7406 = new C7403(c7405);
        while (c21825.m48595()) {
            c7403.m19746(c7404);
            c7405.m19739(c7406);
            c7405.m19746(c7405);
            C18630 c18630 = (C18630) c21825.f70876;
            Iterator it = c18630.f60400.iterator();
            while (it.hasNext()) {
                super.mo7248((AbstractC8047) it.next());
                if (c7403.m19747()) {
                    c7403.m19746(this.f14567);
                    c7405.m19746(this.f14572);
                }
            }
            if (((C18630) c21825.f70876).f60403.isEmpty() && c21825.f70877.m48595() && ((C18630) c21825.f70877.f70876).f60400.m48596() == 1 && ((AbstractC8047) ((C18630) c21825.f70877.f70876).f60400.f70876).mo16200() && C3128.m9470((AbstractC8774) ((C18630) c21825.f70877.f70876).f60400.f70876)) {
                c21825 = c21825.f70877;
                c18630 = (C18630) c21825.f70876;
            }
            m49334(c18630.f60403);
            if (c18630.f60399 && c18630.f60402 == C18630.f60398) {
                m43246(abstractC8774, this.f14577.f37248);
            }
            for (C21825 c21826 = c18630.f60403; c21826.m48595(); c21826 = c21826.f70877) {
                AbstractC8774 abstractC8775 = (AbstractC8774) c21826.f70876;
                if (abstractC8775.m22847(EnumC18651.f60554)) {
                    int i2 = ((C6656) abstractC8775).f22475.f21228;
                    c7404.m19737(i2);
                    c7406.m19743(i2);
                }
            }
            c21825 = c21825.f70877;
        }
        if (!z) {
            if (abstractC8774.m22847(EnumC18651.f60487)) {
                mo11337();
            } else {
                c7403.m19746(c7404);
                c7405.m19739(c7406);
                c7405.m19746(c7405);
            }
        }
        if (abstractC8774.m22847(EnumC18651.f60487)) {
            m43249(abstractC8774, c19003);
        } else {
            m43245(abstractC8774, c19003);
        }
        this.f14569 = i;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        C19003 c19003 = new C19003();
        C7403 c7403 = this.f14578;
        C7403 c7404 = new C7403(c7403);
        C19003 c19004 = this.f60692;
        this.f60692 = new C19003();
        C7403 c7405 = this.f14570;
        C7403 c7406 = new C7403(c7405);
        C7403 c7407 = this.f14581;
        c7403.m19746(c7407);
        for (AbstractC8774 abstractC8774 : c13713.f45222) {
            if (abstractC8774 instanceof C6656) {
                C6656 c6656 = (C6656) abstractC8774;
                mo3928(c6656);
                this.f14580.mo24224(c6656.f22475);
                c19003.m43723(c6656);
            } else {
                if (!(abstractC8774 instanceof AbstractC5930)) {
                    throw new AssertionError(c13713);
                }
                m11352((AbstractC5930) abstractC8774);
            }
        }
        super.mo7248(c13713.f45220);
        c7403.m19739(c7407);
        C7403 c7408 = new C7403(c7405);
        C7403 c7409 = new C7403(c7407);
        int i = this.f14569;
        if (!c19003.isEmpty()) {
            C10955 c10955 = this.f14577;
            if (c10955.f37252.m39467(EnumC0597.TRY)) {
                Iterator it = c19003.iterator();
                while (it.hasNext()) {
                    C6656 c6657 = (C6656) it.next();
                    if (this.f14580.mo9331(c6657.f22475)) {
                        C20414 c20414 = c10955.f37257;
                        EnumC0597 enumC0597 = EnumC0597.TRY;
                        C6263 c6263 = c6657.f22475;
                        C14065 c14065 = C9768.f32836;
                        c20414.m48203(enumC0597, c6657, new C14065("compiler", "try.resource.not.referenced", c6263));
                        this.f14580.mo24223(c6657.f22475);
                    }
                    it = it;
                    c7404 = c7404;
                    c10955 = c10955;
                    c19004 = c19004;
                }
            }
        }
        C7403 c74010 = c7404;
        C19003 c19005 = c19004;
        C7403 c74011 = new C7403(c7406);
        C7403 c74012 = new C7403(c7403);
        for (C21825 c21825 = c13713.f45221; c21825.m48595(); c21825 = c21825.f70877) {
            C6656 c6658 = ((C19336) c21825.f70876).f62363;
            c7405.m19746(c74011);
            c7407.m19746(c74012);
            super.mo7248((AbstractC8774) c6658);
            m11349(c6658);
            super.mo7248(((C19336) c21825.f70876).f62362);
            c7408.m19739(c7405);
            c7409.m19739(c7407);
            this.f14569 = i;
        }
        if (c13713.f45218 != null) {
            c7405.m19746(c7406);
            c7407.m19746(c7403);
            C19003 c19006 = this.f60692;
            this.f60692 = c19005;
            super.mo7248(c13713.f45218);
            if (c13713.f45219) {
                c7407.m19739(c7409);
                while (c19006.m43722()) {
                    C18009 c18009 = (C18009) c19006.m43727();
                    if (c18009 instanceof C13071) {
                        C13071 c13071 = (C13071) c18009;
                        c13071.f43566.m19741(c7405);
                        c13071.f43565.m19739(c7407);
                    }
                    this.f60692.m43723(c18009);
                }
                c7405.m19741(c7408);
            }
        } else {
            c7405.m19746(c7408);
            c7407.m19746(c7409);
            C19003 c19007 = this.f60692;
            this.f60692 = c19005;
            while (c19007.m43722()) {
                this.f60692.m43723((C18009) c19007.m43727());
            }
        }
        c7403.m19739(c74010);
        c7403.m19739(c7407);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        m11346(c7341.f24394);
        C7403 c7403 = this.f14582;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14579;
        C7403 c7406 = new C7403(c7405);
        C7403 c7407 = this.f14570;
        C7403 c7408 = this.f14567;
        c7407.m19746(c7408);
        C7403 c7409 = this.f14581;
        C7403 c74010 = this.f14572;
        c7409.m19746(c74010);
        AbstractC16579 abstractC16579 = c7341.f24393.f30190;
        EnumC6617 enumC6617 = EnumC6617.BOOLEAN;
        if (abstractC16579.m39001(enumC6617) && c7341.f24392.f30190.m39001(enumC6617)) {
            m11346(c7341.f24393);
            C7403 c74011 = new C7403(c7408);
            C7403 c74012 = new C7403(c7403);
            C7403 c74013 = new C7403(c74010);
            C7403 c74014 = new C7403(c7405);
            c7407.m19746(c7404);
            c7409.m19746(c7406);
            m11346(c7341.f24392);
            c7408.m19739(c74011);
            c7403.m19739(c74012);
            c74010.m19739(c74013);
            c7405.m19739(c74014);
            return;
        }
        m11352(c7341.f24393);
        C7403 c74015 = new C7403(c7407);
        C7403 c74016 = new C7403(c7409);
        c7407.m19746(c7404);
        c7409.m19746(c7406);
        m11352(c7341.f24392);
        c7407.m19739(c74015);
        c7409.m19739(c74016);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        m11346(c4849.f17076);
        C7403 c7403 = new C7403(this.f14582);
        C7403 c7404 = new C7403(this.f14579);
        C7403 c7405 = this.f14567;
        C7403 c7406 = this.f14570;
        c7406.m19746(c7405);
        C7403 c7407 = this.f14572;
        C7403 c7408 = this.f14581;
        c7408.m19746(c7407);
        super.mo7248(c4849.f17075);
        if (c4849.f17077 != null) {
            C7403 c7409 = new C7403(c7406);
            C7403 c74010 = new C7403(c7408);
            c7406.m19746(c7403);
            c7408.m19746(c7404);
            super.mo7248(c4849.f17077);
            c7406.m19739(c7409);
            c7408.m19739(c74010);
            return;
        }
        c7406.m19739(c7403);
        c7408.m19739(c7404);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        m43247(new C13071(c17924, this.f14570, this.f14581));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        C9789 c9789 = (C9789) c21473.f69789;
        if (c9789 != null && c9789.f30190.m39001(EnumC6617.BOOLEAN)) {
            m11346(c21473.f69790);
            C1075 c1075 = new C1075(this, c21473, new C7403(this.f14567), new C7403(this.f14582), new C7403(this.f14572), new C7403(this.f14579));
            m11345();
            m43247(c1075);
            return;
        }
        m11352(c21473.f69790);
        m43247(new C13071(c21473, this.f14570, this.f14581));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        m43247(new C13071(c20747, this.f14570, this.f14581));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        m11352(c11200.f37914);
        m43247(new C13071(c11200, this.f14570, this.f14581));
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        m11352(c4539.f16146);
        mo11337();
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        m11352(c15434.f50296);
        m11350(c15434.f50298);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        m11352(c8378.f29093);
        m11350(c8378.f29099);
        super.mo7248(c8378.f29098);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3959(C22489 c22489) {
        C7403 c7403 = this.f14581;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14570;
        C7403 c7406 = new C7403(c7405);
        int i = this.f14571;
        int i2 = this.f14569;
        C19003 c19003 = this.f60692;
        try {
            this.f14571 = i2;
            this.f60692 = new C19003();
            for (C21825 c21825 = c22489.f73410; c21825.m48595(); c21825 = c21825.f70877) {
                C6656 c6656 = (C6656) c21825.f70876;
                super.mo7248((AbstractC8774) c6656);
                c7405.m19743(c6656.f22475.f21228);
                c7403.m19737(c6656.f22475.f21228);
            }
            if (c22489.m49993() != EnumC9897.EXPRESSION) {
                super.mo7248(c22489.f73408);
            } else {
                m11352(c22489.f73408);
            }
        } finally {
            this.f14571 = i;
            c7403.m19746(c7404);
            c7405.m19746(c7406);
            this.f60692 = c19003;
            this.f14569 = i2;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        m11350(c18961.f61398);
        m11350(c18961.f61399);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3941(C12986 c12986) {
        C7403 c7403 = this.f14570;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14581;
        C7403 c7406 = new C7403(c7405);
        m11346(c12986.f43312);
        c7406.m19739(this.f14572);
        if (c12986.f43313 != null) {
            c7403.m19746(this.f14582);
            c7405.m19746(this.f14579);
            m11352(c12986.f43313);
        }
        c7403.m19746(c7404);
        c7405.m19746(c7406);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(C3812 c3812) {
        if (!C3128.m9469(c3812.f14145)) {
            m11352(c3812.f14145);
        }
        m11352(c3812.f14146);
        m11338(c3812.f14145);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        m11352(c6635.f22412);
        m11352(c6635.f22413);
        m11338(c6635.f22412);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        int i = C13777.f45443[c13007.mo1803().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                m11352(c13007.f43378);
                m11338(c13007.f43378);
                return;
            } else {
                m11352(c13007.f43378);
                return;
            }
        }
        m11346(c13007.f43378);
        C7403 c7403 = this.f14582;
        C7403 c7404 = new C7403(c7403);
        C7403 c7405 = this.f14567;
        c7403.m19746(c7405);
        c7405.m19746(c7404);
        C7403 c7406 = this.f14579;
        c7404.m19746(c7406);
        C7403 c7407 = this.f14572;
        c7406.m19746(c7407);
        c7407.m19746(c7404);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        int i = C13777.f45443[c22864.mo1803().ordinal()];
        C7403 c7403 = this.f14581;
        C7403 c7404 = this.f14570;
        C7403 c7405 = this.f14579;
        C7403 c7406 = this.f14582;
        C7403 c7407 = this.f14572;
        C7403 c7408 = this.f14567;
        if (i == 6) {
            m11346(c22864.f74367);
            C7403 c7409 = new C7403(c7406);
            C7403 c74010 = new C7403(c7405);
            c7404.m19746(c7408);
            c7403.m19746(c7407);
            m11346(c22864.f74368);
            c7406.m19739(c7409);
            c7405.m19739(c74010);
            return;
        }
        if (i == 7) {
            m11346(c22864.f74367);
            C7403 c74011 = new C7403(c7408);
            C7403 c74012 = new C7403(c7407);
            c7404.m19746(c7406);
            c7403.m19746(c7405);
            m11346(c22864.f74368);
            c7408.m19739(c74011);
            c7407.m19739(c74012);
            return;
        }
        m11352(c22864.f74367);
        m11352(c22864.f74368);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        AbstractC23903 abstractC23903 = c3107.f11716;
        if (abstractC23903.f77452 == EnumC10477.f35878) {
            m11341((InterfaceC12260) c3107, (C6263) abstractC23903);
            this.f14580.mo24223(c3107.f11716);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        c2401.f9659.mo1802(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[LOOP:1: B:32:0x00c0->B:34:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[EDGE_INSN: B:44:0x00ca->B:35:0x00ca BREAK  A[LOOP:1: B:32:0x00c0->B:34:0x00c5], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11339(C4603 c4603, AbstractC8774 abstractC8774, C5286 c5286) {
        char c;
        char c2;
        int i;
        C6656[] c6656Arr;
        C7403 c7403 = this.f14579;
        C7403 c7404 = this.f14572;
        C7403 c7405 = this.f14582;
        C7403 c7406 = this.f14567;
        C7403 c7407 = this.f14578;
        C7403 c7408 = this.f14581;
        C7403 c7409 = this.f14570;
        C10955 c10955 = this.f14577;
        try {
            abstractC8774.getClass();
            this.f14583 = C3128.m9453(abstractC8774);
            if (this.f14573 == null) {
                this.f14573 = new C6656[32];
                c = 3;
                c2 = 2;
            } else {
                int i2 = 0;
                c = 3;
                while (true) {
                    try {
                        C6656[] c6656Arr2 = this.f14573;
                        c2 = 2;
                        try {
                            if (i2 >= c6656Arr2.length) {
                                break;
                            }
                            c6656Arr2[i2] = null;
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            this.f14583 = -1;
                            C7403[] c7403Arr = new C7403[7];
                            c7403Arr[0] = c7409;
                            c7403Arr[1] = c7408;
                            c7403Arr[c2] = c7407;
                            c7403Arr[c] = c7406;
                            c7403Arr[4] = c7405;
                            c7403Arr[5] = c7404;
                            c7403Arr[6] = c7403;
                            m11335(c7403Arr);
                            if (this.f14573 != null) {
                                i = 0;
                                while (true) {
                                    c6656Arr = this.f14573;
                                    if (i < c6656Arr.length) {
                                        break;
                                    }
                                    c6656Arr[i] = null;
                                    i++;
                                }
                            }
                            this.f14574 = 0;
                            this.f14569 = 0;
                            c10955.f37248 = null;
                            this.f60692 = null;
                            this.f14576 = null;
                            this.f14580 = null;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = 2;
                        this.f14583 = -1;
                        C7403[] c7403Arr2 = new C7403[7];
                        c7403Arr2[0] = c7409;
                        c7403Arr2[1] = c7408;
                        c7403Arr2[c2] = c7407;
                        c7403Arr2[c] = c7406;
                        c7403Arr2[4] = c7405;
                        c7403Arr2[5] = c7404;
                        c7403Arr2[6] = c7403;
                        m11335(c7403Arr2);
                        if (this.f14573 != null) {
                            i = 0;
                            while (true) {
                                c6656Arr = this.f14573;
                                if (i < c6656Arr.length) {
                                    break;
                                    break;
                                } else {
                                    c6656Arr[i] = null;
                                    i++;
                                }
                            }
                        }
                        this.f14574 = 0;
                        this.f14569 = 0;
                        c10955.f37248 = null;
                        this.f60692 = null;
                        this.f14576 = null;
                        this.f14580 = null;
                        throw th;
                    }
                }
            }
            this.f14574 = 0;
            this.f14569 = 0;
            c10955.f37248 = c5286;
            this.f60692 = new C19003();
            this.f14576 = null;
            this.f14580 = AbstractC9462.m24222(c4603.f16301.f30086);
            super.mo7248(abstractC8774);
            this.f14583 = -1;
            C7403[] c7403Arr3 = new C7403[7];
            c7403Arr3[0] = c7409;
            c7403Arr3[1] = c7408;
            c7403Arr3[c2] = c7407;
            c7403Arr3[c] = c7406;
            c7403Arr3[4] = c7405;
            c7403Arr3[5] = c7404;
            c7403Arr3[6] = c7403;
            m11335(c7403Arr3);
            if (this.f14573 != null) {
                int i3 = 0;
                while (true) {
                    C6656[] c6656Arr3 = this.f14573;
                    if (i3 >= c6656Arr3.length) {
                        break;
                    }
                    c6656Arr3[i3] = null;
                    i3++;
                }
            }
            this.f14574 = 0;
            this.f14569 = 0;
            c10955.f37248 = null;
            this.f60692 = null;
            this.f14576 = null;
            this.f14580 = null;
        } catch (Throwable th3) {
            th = th3;
            c = 3;
        }
    }

    public C3897(C10955 c10955) {
        this.f14577 = c10955;
    }
}
