package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6761 extends AbstractC19357 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f22792 = new C16576();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC6617[] f22793 = {EnumC6617.BYTE, EnumC6617.CHAR, EnumC6617.SHORT, EnumC6617.INT, EnumC6617.LONG, EnumC6617.FLOAT, EnumC6617.DOUBLE, EnumC6617.BOOLEAN};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5286 f22794;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f22795;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C5206 f22796;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22284 f22797;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f22798;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C1116 f22799;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f22800;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17573 f22801;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C23800 f22802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22803;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C1116 f22804;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f22805;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C3836 f22806;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C11701 f22807;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8528 f22808;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C1116 f22809;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10955 f22810;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2714 f22811;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9399 f22812;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4603 f22814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23942 f22815;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22816;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f22817;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4562 f22818;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18279 f22819;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C11492 f22820;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f22821;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C20145 f22822;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2008 f22823;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16784 f22824;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f22825;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13174 f22826;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11619 f22828;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5870 f22830;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C23549 f22831;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20414 f22832;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21017 f22834;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C1116 f22835;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22836;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7467 f22838;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C1116 f22839;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10727 f22840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC6139 f22833 = new C4644(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2923 f22827 = C4562.f16202;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1052 f22813 = new C20292();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C4748 f22837 = new C6180(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f22829 = new HashMap();

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3943(C14023 c14023) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6761 m18268(C12343 c12343) {
        C6761 c6761 = (C6761) c12343.m30656(f22792);
        return c6761 == null ? new C6761(c12343) : c6761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18301(final AbstractC8774 abstractC8774, final AbstractC16579 abstractC16579, final C21059 c21059, final C1116 c1116) {
        AbstractC16579 abstractC16579Mo4137;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        EnumC1946 enumC1946 = c1116.f5040;
        C21059 c210510 = c1116.f5039;
        AbstractC16579 abstractC165710 = c1116.f5036;
        final C19524 c19524Mo4574 = interfaceC18195.mo4574();
        boolean z = (abstractC16579.m39001(EnumC6617.ERROR) || abstractC165710.m39001(EnumC6617.METHOD) || abstractC165710.m39001(EnumC6617.FORALL)) ? false : true;
        if (z && !c21059.m47468(c210510)) {
            abstractC8774.getClass();
            EnumSet enumSetM47466 = c210510.m47466();
            EnumSet enumSetM47467 = c21059.m47466();
            C5909 c5909 = C23879.f77204;
            this.f22832.m48199(abstractC8774, new C5909("compiler", "unexpected.type", enumSetM47466, enumSetM47467));
            abstractC16579Mo4137 = this.f22802.m52440(abstractC16579);
        } else if (this.f22816 && abstractC16579.m39005(c19524Mo4574.f62771)) {
            AbstractC16579 abstractC165711 = z ? abstractC165710 : abstractC16579;
            if (enumC1946.mo6307()) {
                c19524Mo4574.m44595(C21825.of((Object) abstractC16579), new InterfaceC18383() { // from class: l.۟֡ۤ
                    @Override // l.InterfaceC18383
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo969(C19524 c19524) {
                        C6761 c6761 = this.f23808;
                        c6761.getClass();
                        C1116 c1117 = c1116;
                        AbstractC16579 abstractC165712 = c1117.f5036;
                        C19524 c19525 = c19524Mo4574;
                        C1116 c1116Mo4134 = c1117.mo4134(c19525.m44587(abstractC165712));
                        c6761.m18301(abstractC8774, c19525.m44587(abstractC16579), c21059, c1116Mo4134);
                    }
                });
            }
            abstractC16579Mo4137 = abstractC165711;
        } else {
            abstractC16579Mo4137 = z ? c1116.mo4137(abstractC8774, abstractC16579) : abstractC16579;
        }
        if (enumC1946.mo6308()) {
            abstractC8774.f30190 = abstractC16579Mo4137;
        }
        return abstractC16579Mo4137;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18314(AbstractC5930 abstractC5930, C6263 c6263, AbstractC8774 abstractC8774, C4603 c4603) {
        boolean z;
        AbstractC11242 abstractC11242 = c6263.f77453;
        C23942 c23942 = this.f22815;
        AbstractC11242 abstractC11243 = c23942.f77533;
        C20414 c20414 = this.f22832;
        if (abstractC11242 != abstractC11243) {
            long j = c6263.f77447;
            if ((16 & j) != 0) {
                if ((j & 262144) == 0 && (abstractC8774 == null || C3128.m9454(abstractC8774))) {
                    AbstractC23903 abstractC23903 = ((C22990) c4603.f16299).f74722.f11719;
                    if (c6263.f77448 != abstractC23903) {
                        if ((abstractC23903.f77453 == c23942.f77632 || abstractC23903.f77452 == EnumC10477.f35878 || (abstractC23903.mo20276() & 1048576) != 0) && c6263.f77448 == abstractC23903.f77448) {
                            z = (((c6263.f77447 & 8) > 0L ? 1 : ((c6263.f77447 & 8) == 0L ? 0 : -1)) != 0) == C20145.m45514(c4603);
                        }
                    }
                    C23195 c23195 = c4603.f16294;
                    if (z & (!(c23195 != null && C3128.m9475(c23195)))) {
                        return;
                    }
                }
                if (c6263.m17329()) {
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(abstractC5930, new C5909("compiler", "try.resource.may.not.be.assigned", c6263));
                    return;
                } else {
                    C5909 c59010 = C23879.f77204;
                    c20414.m48199(abstractC5930, new C5909("compiler", "cant.assign.val.to.final.var", c6263));
                    return;
                }
            }
            return;
        }
        c20414.m48199(abstractC5930, C23879.f77329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m18312(AbstractC5930 abstractC5930, C10164 c10164) {
        C4603 c4603M24146 = this.f22812.m24146(c10164);
        C5286 c5286 = this.f22794;
        C21783 c21783M14618 = c5286.m14618(0L);
        C3836 c3836 = this.f22806;
        C8753 c8753M14601 = c5286.m14601(c21783M14618, c3836.f14276.f77453, (C21825) null, (AbstractC5930) null, (C21825) null, (C21825) null);
        c4603M24146.f16301 = c8753M14601;
        c8753M14601.f30086 = c3836.f14276;
        return (AbstractC23903) abstractC5930.mo1800(this.f22833, c4603M24146);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18298(AbstractC8774 abstractC8774, C4603 c4603) {
        C18279 c18279 = this.f22819;
        C4603 c4604 = null;
        C1116 c1116 = null;
        c4604 = null;
        c4604 = null;
        c4604 = null;
        c4604 = null;
        c4604 = null;
        c4604 = null;
        if (!c18279.f58324.isEmpty() && !((C22990) c4603.f16299).f74713.f12499 && (abstractC8774 instanceof AbstractC14728) && !abstractC8774.m22847(EnumC18651.f60468) && !abstractC8774.m22847(EnumC18651.f60513) && !abstractC8774.m22847(EnumC18651.f60478) && !abstractC8774.m22847(EnumC18651.f60490)) {
            AbstractC8774 abstractC8775 = c4603.f16296;
            C22990 c22990 = (C22990) c4603.f16299;
            AbstractC9462 abstractC9462 = c22990.f74722;
            C4603 c4603M12747 = c4603.m12747(abstractC8775, c22990.m50854(abstractC9462.mo3801(abstractC9462.f11719)));
            C22990 c22991 = (C22990) c4603M12747.f16299;
            if (c22991.f74725 != null) {
                C6761 c6761 = c18279.f58320;
                C13638.requireNonNull(c6761);
                C1116 c1117 = c22991.f74725;
                c1116 = new C1116(c6761, c1117.f5039, c1117.f5036);
            }
            c22991.f74725 = c1116;
            c4604 = c4603M12747;
        }
        AbstractC16579 abstractC16579M18299 = m18299(abstractC8774, c4603, this.f22799);
        if (c4604 != null) {
            C15458 c15458 = new C15458(c18279, (AbstractC14728) abstractC8774, c4604);
            c15458.mo7248(c15458.f50379);
            if (!c15458.f50378.isEmpty()) {
                Iterator it = c15458.f50378.iterator();
                while (it.hasNext()) {
                    c18279.f58316.mo6261((C6990) it.next());
                }
            }
        }
        this.f22838.m19955();
        return abstractC16579M18299;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        AbstractC23903 abstractC23903M45535;
        AbstractC23903 abstractC23903;
        AbstractC23903 abstractC23903M45541;
        AbstractC11242 abstractC11242;
        boolean zM39001 = this.f22804.f5036.m39001(EnumC6617.METHOD);
        C20145 c20145 = this.f22822;
        if (zM39001 || this.f22804.f5036.m39001(EnumC6617.FORALL)) {
            C4603 c4603 = this.f22814;
            ((C22990) c4603.f16299).f74727 = null;
            AbstractC11242 abstractC11243 = c3107.f11715;
            C21825 c21825Mo33523 = this.f22804.f5036.mo33523();
            C21825 c21825Mo1938 = this.f22804.f5036.mo1938();
            c20145.getClass();
            C22492 c22492 = c4603.f16301.f30086;
            C8649 c8649 = c20145.f65411;
            C2297 c2297 = new C2297(c20145, abstractC11243, c22492.f77449, c21825Mo33523, c21825Mo1938);
            C6095 c6095 = new C6095(c20145);
            c6095.f20635 = c8649;
            abstractC23903M45535 = c20145.m45535(c4603, c3107, c22492, c6095, c2297);
        } else {
            abstractC23903M45535 = c3107.f11716;
            if (abstractC23903M45535 == null || abstractC23903M45535.f77452 == EnumC10477.f35878) {
                C4603 c4604 = this.f22814;
                AbstractC11242 abstractC11244 = c3107.f11715;
                AbstractC23903 abstractC23903M45530 = c20145.m45530(c3107, c4604, abstractC11244, this.f22804.f5039);
                AbstractC16579 abstractC16579 = c4604.f16301.f30086.f77449;
                abstractC23903M45535 = c20145.m45545(abstractC23903M45530, (InterfaceC12260) c3107, (AbstractC23903) abstractC16579.f53222, abstractC16579, abstractC11244, false);
            }
        }
        AbstractC23903 abstractC23904 = abstractC23903M45535;
        c3107.f11716 = abstractC23904;
        C4603 c4605 = this.f22814;
        EnumC10477 enumC10477 = c4605.f16301.f30086.f77448.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35867;
        C23942 c23942 = this.f22815;
        if (enumC10477 != enumC10478 && abstractC23904.f77452.m26580(C21059.f68591) && abstractC23904.f77448.f77452 == EnumC10477.f35865 && (abstractC11242 = c3107.f11715) != c23942.f77533 && abstractC11242 != c23942.f77638) {
            while (c4605.f16300 != null && !abstractC23904.m52704((AbstractC0618) c4605.f16301.f30086, this.f22802)) {
                c4605.f16301.f30086.mo49994();
                c4605 = c4605.f16300;
            }
        }
        EnumC10477 enumC10479 = abstractC23904.f77452;
        EnumC10477 enumC104710 = EnumC10477.f35878;
        if (enumC10479 == enumC104710) {
            C6263 c6263 = (C6263) abstractC23904;
            m18275((AbstractC5930) c3107, this.f22814, c6263, false);
            if (C21059.f68590.m47468(this.f22804.f5039)) {
                m18314(c3107, c6263, (AbstractC8774) null, this.f22814);
            }
        }
        boolean z = ((C22990) c4605.f16299).f74710;
        C21017 c21017 = this.f22834;
        if (z && abstractC23904.f77452.m26580(C21059.f68591) && abstractC23904.f77448.f77452 == EnumC10477.f35865 && (abstractC23904.mo20276() & 8) == 0) {
            if (abstractC23904.f77452 == enumC104710) {
                abstractC23903M45541 = abstractC23904;
            } else {
                C4603 c4606 = this.f22814;
                abstractC23903M45541 = c20145.m45541(c3107, c4606, c4606.f16301.f30086, c23942.f77533);
            }
            c21017.m47347(c3107, abstractC23903M45541);
        }
        C4603 c4607 = this.f22814;
        EnumC10477 enumC104711 = abstractC23904.f77452;
        if (enumC104711 != EnumC10477.f35866 && enumC104711 != EnumC10477.f35865 && (abstractC23903 = abstractC23904.f77448) != null && abstractC23903 != c4607.f16301.f30086) {
            while (c4607.f16300 != null && !c20145.m45553(this.f22814, c4607.f16301.f30086.f77449, abstractC23904)) {
                c4607 = c4607.f16300;
            }
        }
        C22990 c22990 = (C22990) this.f22814.f16299;
        if (c22990.f74719) {
            c21017.m47280(c3107, c22990.f74712);
        }
        this.f22800 = m18302(c3107, c4607.f16301.f30086.f77449, abstractC23904, this.f22814, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(final C9789 c9789) throws Throwable {
        C1116 c1116Mo4136;
        AbstractC16579 abstractC16579;
        EnumC0615 enumC0615 = (!this.f22804.f5036.m39001(EnumC6617.NONE) || (abstractC16579 = this.f22804.f5036) == AbstractC16579.f53218 || abstractC16579 == C13174.f43856) ? EnumC0615.POLY : EnumC0615.STANDALONE;
        c9789.f53897 = enumC0615;
        if (enumC0615 == EnumC0615.POLY && this.f22804.f5036.m39001(EnumC6617.VOID)) {
            this.f22804.f5037.mo2545(c9789, this.f22831.m51910(C14707.f48050));
            C5954 c5954M52440 = this.f22802.m52440(this.f22804.f5036);
            c9789.f30190 = c5954M52440;
            this.f22800 = c5954M52440;
            return;
        }
        EnumC0615 enumC0616 = c9789.f53897;
        EnumC0615 enumC0617 = EnumC0615.STANDALONE;
        if (enumC0616 == enumC0617) {
            c1116Mo4136 = this.f22809;
        } else {
            C1116 c1116 = this.f22804;
            c1116Mo4136 = c1116.mo4136(new C20997(this, c1116.f5037));
        }
        final C1116 c1117 = c1116Mo4136;
        final C19003 c19003 = new C19003();
        final C19003 c19004 = new C19003();
        m18284(c9789, c9789.f33504, c9789.f33505, new BiConsumer() { // from class: l.ۖܽۤ
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C18630 c18630 = (C18630) obj;
                C4603 c4603 = (C4603) obj2;
                ((C22990) c4603.f16299).f74717 = c1117;
                C21825 c21825 = c18630.f60403;
                C6761 c6761 = this.f10314;
                c6761.m18329(c21825, c4603);
                new C7592(c6761, c9789, c19003, c19004).m49334(c18630.f60403);
            }
        });
        boolean zIsEmpty = c9789.f33505.isEmpty();
        C20414 c20414 = this.f22832;
        if (zIsEmpty) {
            c20414.m48199(c9789, C23879.f77293);
        } else if (c19004.isEmpty()) {
            c20414.m48199(c9789, C23879.f77325);
        }
        AbstractC16579 abstractC16579M18301 = m18301(c9789, c9789.f53897 == enumC0617 ? m18308(c19003.m43726(), c19004.m43726()) : this.f22804.f5036, C21059.f68595, this.f22804);
        c9789.f30190 = abstractC16579M18301;
        this.f22800 = abstractC16579M18301;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18299(AbstractC8774 abstractC8774, C4603 c4603, C1116 c1116) {
        AbstractC16579 abstractC16579M47261;
        C4603 c4604 = this.f22814;
        C1116 c1117 = this.f22804;
        try {
            try {
                this.f22814 = c4603;
                this.f22804 = c1116;
                if (c1116.mo4138(abstractC8774)) {
                    this.f22800 = this.f22808.m22282(abstractC8774, c4603);
                } else {
                    abstractC8774.mo1802(this);
                }
                C4562 c4562 = this.f22818;
                C2923 c2923 = this.f22827;
                c4562.getClass();
                switch (C9275.f31533[abstractC8774.mo1803().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        c2923 = C4562.f16202;
                        break;
                }
                this.f22827 = c2923;
                abstractC16579M47261 = this.f22800;
            } catch (C4146 e) {
                abstractC8774.f30190 = this.f22806.f14261;
                abstractC16579M47261 = this.f22834.m47261(abstractC8774, e);
            }
            return abstractC16579M47261;
        } finally {
            this.f22814 = c4604;
            this.f22804 = c1117;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4603 m18290(C4603 c4603) {
        AbstractC8774 abstractC8774 = c4603.f16296;
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        AbstractC9462 abstractC9462M24222 = AbstractC9462.m24222(abstractC9462.f11719);
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = abstractC9462.mo3802((Predicate) null, EnumC10167.RECURSIVE).iterator();
        while (it.hasNext()) {
            c21825M48588 = c21825M48588.m48597((AbstractC23903) it.next());
        }
        Iterator it2 = c21825M48588.iterator();
        while (it2.hasNext()) {
            abstractC9462M24222.mo24224((AbstractC23903) it2.next());
        }
        C4603 c4603M12747 = c4603.m12747(abstractC8774, c22990.m50854(abstractC9462M24222));
        C4603 c4604 = c4603M12747.f16300;
        if (c4604 != null) {
            c4603M12747.f16300 = m18290(c4604);
        }
        return c4603M12747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18300(AbstractC8774 abstractC8774, C4603 c4603, AbstractC16579 abstractC16579) {
        C21059 c21059 = C21059.f68595;
        if (abstractC16579.m39001(EnumC6617.ERROR)) {
            abstractC16579 = AbstractC16579.f53219;
        }
        return m18299(abstractC8774, c4603, new C1116(this, c21059, abstractC16579));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18326(AbstractC8774 abstractC8774, C4603 c4603, AbstractC16579 abstractC16579) {
        return m18299(abstractC8774, c4603, new C1116(this, C21059.f68585, abstractC16579));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18329(C21825 c21825, C4603 c4603) {
        while (c21825.m48595()) {
            m18298((AbstractC8774) c21825.f70876, c4603);
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21059 m18310(C21059 c21059, C21825 c21825, C4603 c4603, C19003 c19003) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            AbstractC5930 abstractC5930 = (AbstractC5930) it.next();
            AbstractC16579 abstractC16579M47251 = this.f22834.m47251(abstractC5930, m18299(abstractC5930, c4603, this.f22816 ? this.f22807 : this.f22809));
            if (abstractC16579M47251.m39001(EnumC6617.DEFERRED)) {
                c21059 = C21059.m47465(C21059.f68589, c21059);
            }
            c19003.m43723(abstractC16579M47251);
        }
        return c21059;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m18311(C21825 c21825, C4603 c4603) {
        C19003 c19003 = new C19003();
        while (c21825.m48595()) {
            c19003.m43723(m18326((AbstractC8774) c21825.f70876, c4603, AbstractC16579.f53219));
            c21825 = c21825.f70877;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18318(C21825 c21825, C4603 c4603, boolean z) {
        C21825 c21825Of;
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C22179 c22179 = (C22179) it.next();
            C22929 c22929 = (C22929) c22179.f30190;
            c22929.f53222.f77447 |= 268435456;
            C14422 c14422 = AbstractC16579.f53219;
            c22929.mo18111(c14422);
            boolean zIsEmpty = c22179.f72547.isEmpty();
            C23800 c23800 = this.f22802;
            if (!zIsEmpty) {
                C21825 c21825Of2 = C21825.of((Object) m18326((AbstractC8774) c22179.f72547.f70876, c4603, c14422));
                Iterator it2 = c22179.f72547.f70877.iterator();
                while (it2.hasNext()) {
                    c21825Of2 = c21825Of2.m48597(m18326((AbstractC5930) it2.next(), c4603, AbstractC16579.f53219));
                }
                c21825Of = c21825Of2.m48589();
                c23800.getClass();
            } else {
                c21825Of = C21825.of((Object) this.f22806.f14275);
                c23800.getClass();
            }
            c23800.m52388(c22929, c21825Of, ((AbstractC16579) c21825Of.f70876).f53222.m52721());
            c22929.f53222.f77447 &= -268435457;
        }
        if (z) {
            Iterator it3 = c21825.iterator();
            while (it3.hasNext()) {
                C22179 c221710 = (C22179) it3.next();
                c221710.getClass();
                this.f22834.m47305(c221710, (C22929) c221710.f30190);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m18292(C15229 c15229, C4603 c4603, C6656 c6656, AbstractC16579 abstractC16579) {
        C2714 c2714 = this.f22811;
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c6656);
        InterfaceC2173 interfaceC2173 = c15229.f16295.f34725;
        C20414 c20414 = this.f22832;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        try {
            m18276(c6656, c4603);
            AbstractC16579 abstractC16579M18300 = m18300((AbstractC8774) c6656.f22481, (C4603) c15229, abstractC16579);
            if (c6656.m18039()) {
                C6263 c6263 = c6656.f22475;
                abstractC16579 = this.f22834.m47264(c6656, abstractC16579M18300, c6656.f22478);
                c6263.f77449 = abstractC16579;
                c6656.f30190 = abstractC16579;
            }
            if (abstractC16579M18300.mo24292() != null) {
                return this.f22824.m39436(abstractC16579M18300, abstractC16579).mo24292();
            }
            return null;
        } finally {
            c20414.m48202(interfaceC2173M48202);
            c2714.m8270(interfaceC12260M8270);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18297(AbstractC5930 abstractC5930, C4603 c4603, boolean z, boolean z2, boolean z3) {
        AbstractC16579 abstractC16579M18326 = abstractC5930.f30190;
        if (abstractC16579M18326 == null) {
            abstractC16579M18326 = m18326(abstractC5930, c4603, AbstractC16579.f53219);
        }
        return m18305(abstractC16579M18326, abstractC5930, z, z2, z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18305(AbstractC16579 abstractC16579, AbstractC8774 abstractC8774, boolean z, boolean z2, boolean z3) {
        if (abstractC8774.m22847(EnumC18651.f60493)) {
            abstractC8774 = ((C11596) abstractC8774).f38963;
            abstractC8774.getClass();
        }
        boolean zIsEmpty = abstractC16579.f53222.f77453.isEmpty();
        C23800 c23800 = this.f22802;
        C20414 c20414 = this.f22832;
        if (zIsEmpty) {
            c20414.m48199(abstractC8774, C23879.f77324);
            return c23800.m52440(abstractC16579);
        }
        if (abstractC16579.mo1926()) {
            return abstractC16579;
        }
        boolean zM39001 = abstractC16579.m39001(EnumC6617.TYPEVAR);
        C21017 c21017 = this.f22834;
        if (zM39001 && !z && !z2) {
            if (abstractC16579.mo18112() == null) {
                c20414.m48199(abstractC8774, C23879.f77255);
                return c23800.m52440(abstractC16579);
            }
        } else {
            abstractC16579 = c21017.m47267(abstractC8774, abstractC16579, z3);
        }
        if (z2 && (abstractC16579.f53222.mo20276() & 512) == 0) {
            c20414.m48199(abstractC8774, C23879.f77339);
            return c23800.m52440(abstractC16579);
        }
        if (z3 && z && (abstractC16579.f53222.mo20276() & 512) != 0) {
            c20414.m48199(abstractC8774, C23879.f77225);
            return c23800.m52440(abstractC16579);
        }
        if (z3 && (abstractC16579.f53222.mo20276() & 16) != 0) {
            AbstractC0618 abstractC0618 = abstractC16579.f53222;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC8774, new C5909("compiler", "cant.inherit.from.final", abstractC0618));
        }
        c21017.m47353(abstractC8774, abstractC16579);
        return abstractC16579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m18270(C4603 c4603, C3107 c3107) {
        C8753 c8753 = c4603.f16301;
        Object obj = c4603.f16299;
        C22492 c22492 = c8753.f30086;
        c22492.mo49994();
        C6171.m17176((c22492.f77447 & 16384) != 0);
        C22990 c22990 = (C22990) obj;
        c3107.f30190 = c22990.f74722.f11719.m52720().f77449;
        c3107.f11716 = c22990.f74722.f11719.m52720();
        return c3107.f30190;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C3587 c3587;
        C18321 c18321M42557;
        if (((C22990) this.f22814.f16299).f74713.f12499) {
            C8528 c8528 = this.f22808;
            c8528.getClass();
            c3587 = new C3587(c8528);
        } else {
            c3587 = null;
        }
        C11521 c11521OfNullable = C11521.ofNullable(c3587);
        try {
            boolean zM26580 = ((C22990) this.f22814.f16299).f74722.f11719.f77452.m26580(C21059.f68591);
            C9399 c9399 = this.f22812;
            if (zM26580) {
                c9399.m24142(c8753, this.f22814);
            } else if (this.f22814.f16296.m22847(EnumC18651.f60531) && (c18321M42557 = C18321.m42557(this.f22814.f16295, c8753)) != null) {
                Iterator it = c18321M42557.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC17428) it.next()).mo1801() == EnumC12490.ANNOTATION) {
                        c9399.m24142(c8753, this.f22814);
                        break;
                    }
                }
            }
            C22492 c22492 = c8753.f30086;
            if (c22492 == null) {
                this.f22800 = null;
            } else {
                c22492.mo49994();
                C4603 c4603 = this.f22814;
                if (((C22990) c4603.f16299).f74710 && c4603.f16296.m22847(EnumC18651.f60531)) {
                    c22492.f77447 |= 4194304;
                }
                try {
                    this.f22801.m40874();
                    m18320(c22492);
                } catch (C4146 e) {
                    this.f22834.m47261(c8753, e);
                }
                AbstractC16579 abstractC16579 = c22492.f77449;
                c8753.f30190 = abstractC16579;
                this.f22800 = abstractC16579;
            }
            c11521OfNullable.ifPresent(new C12056());
        } catch (Throwable th) {
            c11521OfNullable.ifPresent(new C12056());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03c0  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(final C23195 c23195) throws Throwable {
        C16826 c16826;
        C18258 c18258;
        C16826 c16827;
        C18258 c18259;
        C4603 c4603;
        C3836 c3836;
        C5909 c5909M52622;
        C6656 c6656;
        C17573 c17573 = this.f22801;
        C11619 c11619 = this.f22828;
        C5286 c5286 = this.f22794;
        C18258 c182510 = c23195.f75263;
        AbstractC11242 abstractC11242 = c23195.f75272;
        boolean z = (c182510.f77447 & 8796093022208L) != 0;
        C16826 c16826M39465 = ((C22990) this.f22814.f16299).f74715.m39465(c182510);
        C21017 c21017 = this.f22834;
        C16826 c16826M47268 = c21017.m47268(c16826M39465);
        C18258 c18258M47269 = c21017.m47269(c182510);
        try {
            this.f22811.m8271((AbstractC8774) c23195);
            c21017.m47316(c182510, c23195);
            C4603 c4603M28953 = c11619.m28953(c23195, this.f22814);
            Object obj = c4603M28953.f16299;
            ((C22990) obj).f74715 = c16826M39465;
            m18329(c23195.f75269, c4603M28953);
            if (c182510.mo22992()) {
                c21017.m47311(c23195, this.f22814.f16301.f30190, c182510);
            } else {
                c21017.m47349(c23195, this.f22814.f16301.f30190, c182510);
            }
            c21017.m47276(this.f22814, c23195, c182510);
            C23800 c23800 = this.f22802;
            C20414 c20414 = this.f22832;
            if (z) {
                c18259 = c18258M47269;
                try {
                    if (c23800.m52390(c182510.m52720(), c182510)) {
                        AbstractC11242 abstractC11243 = c182510.f77453;
                        EnumC7654 enumC7654M38160 = C16121.m38160(c182510.m52708());
                        AbstractC23903 abstractC23903M52708 = c182510.m52708();
                        C5909 c5909 = C23879.f77204;
                        c16827 = c16826M47268;
                        try {
                            c20414.m48199(c23195, new C5909("compiler", "default.overrides.object.member", abstractC11243, enumC7654M38160, abstractC23903M52708));
                        } catch (Throwable th) {
                            th = th;
                            c18258 = c18259;
                            c16826 = c16827;
                            c21017.m47268(c16826);
                            c21017.m47269(c18258);
                            throw th;
                        }
                    } else {
                        c16827 = c16826M47268;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c16827 = c16826M47268;
                    c18258 = c18259;
                    c16826 = c16827;
                    c21017.m47268(c16826);
                    c21017.m47269(c18258);
                    throw th;
                }
            } else {
                c16827 = c16826M47268;
                c18259 = c18258M47269;
            }
            for (C21825 c21825 = c23195.f75269; c21825.m48595(); c21825 = c21825.f70877) {
                ((C22990) obj).f74722.mo24226(((C22179) c21825.f70876).f30190.f53222);
            }
            C22492 c22492 = this.f22814.f16301.f30086;
            c22492.mo49994();
            if ((c22492.f77447 & 8192) != 0 && (c23195.f75270.m48595() || c23195.f75262 != null)) {
                if (c23195.f75270.m48595()) {
                    c6656 = (C6656) c23195.f75270.f70876;
                    c6656.getClass();
                } else {
                    c6656 = c23195.f75262;
                    c6656.getClass();
                }
                c20414.m48199(c6656, C23879.f77351);
            }
            for (C21825 c21826 = c23195.f75270; c21826.m48595(); c21826 = c21826.f70877) {
                m18298((AbstractC8774) c21826.f70876, c4603M28953);
            }
            c21017.m47309(c23195);
            c21017.m47303(c23195.f75269, c4603M28953);
            AbstractC5930 abstractC5930 = c23195.f75266;
            if (abstractC5930 != null && !abstractC5930.f30190.m39001(EnumC6617.VOID)) {
                c21017.m47287((AbstractC8774) c23195.f75266, c4603M28953, true);
            }
            if (c23195.f75262 != null) {
                C4603 c4603M28954 = c11619.m28953(c23195, this.f22814);
                m18326(c23195.f75262, c4603M28954, AbstractC16579.f53219);
                c21017.m47287((AbstractC8774) c23195.f75262, c4603M28954, true);
            }
            boolean zM50010 = this.f22814.f16301.f30086.m50010();
            C23942 c23942 = this.f22815;
            if (zM50010 && c23195.f75263.f77448.f77452 == EnumC10477.f35865) {
                C11521 c11521FindFirst = C9030.stream(this.f22814.f16301.f30086.m50004()).filter(new Predicate() { // from class: l.᩶֡ۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        C18258 c182511 = ((C16142) obj2).f52153;
                        return c182511 == c23195.f75263 && (c182511.f77447 & 16777216) == 0;
                    }
                }).findFirst();
                if (c11521FindFirst.isPresent()) {
                    if (!c23195.f75263.m52722()) {
                        c20414.m48199(c23195, C23879.m52628(this.f22814.f16301.f30086, C14707.f48097));
                    }
                    if (!c23800.m52399(c23195.f75263.f77449.mo16235(), ((C16142) c11521FindFirst.get()).f77449)) {
                        c20414.m48199(c23195, C23879.m52628(this.f22814.f16301.f30086, C14707.m35238(c23195.f75263, (AbstractC23903) c11521FindFirst.get())));
                    }
                    if (c23195.f75263.f77449.mo27295().f45366 != null && !c23195.f75263.f77449.mo27295().f45366.isEmpty()) {
                        c20414.m48199(c23195, C23879.m52628(this.f22814.f16301.f30086, C14707.f48054));
                    }
                    if (!c23195.f75269.isEmpty()) {
                        c20414.m48199(c23195, C23879.m52628(this.f22814.f16301.f30086, C14707.f48085));
                    }
                    if (c23195.f75263.mo22992()) {
                        c20414.m48199(c23195, C23879.m52628(this.f22814.f16301.f30086, C14707.f48077));
                    }
                }
                AbstractC11242 abstractC11244 = c23942.f77632;
                AbstractC11242 abstractC11245 = c23942.f77533;
                if (abstractC11242 == abstractC11244) {
                    c4603 = c4603M28953;
                    long j = c23195.f75263.f77447;
                    if ((j & 2305843009213693952L) == 0) {
                        C15434 c15434M9452 = C3128.m9452(c23195);
                        if (c15434M9452 == null || C3128.m9472(c15434M9452.f50296) != abstractC11245 || !m18321(c15434M9452, c23195, false)) {
                            c20414.m48199(c23195, C23879.m52627(this.f22814.f16301.f30086));
                        }
                    } else {
                        if ((j & 68719476736L) == 0) {
                            if (C21017.m47206(c182510.f77447) > C21017.m47206(this.f22814.f16301.f30086.mo20276())) {
                                if ((this.f22814.f16301.f30086.mo20276() & 7) == 0) {
                                    c5909M52622 = C23879.m52622(C14707.f48110, this.f22814.f16301.f30086.f77453, C14707.m35235());
                                } else {
                                    C14377 c14377 = C14707.f48110;
                                    C22492 c22493 = this.f22814.f16301.f30086;
                                    c5909M52622 = C23879.m52622(c14377, c22493.f77453, new C14377("compiler", "canonical.must.not.have.stronger.access", C8360.m21884(c22493.mo20276() & 7)));
                                }
                                c20414.m48199(c23195, c5909M52622);
                            } else {
                                abstractC11242 = abstractC11242;
                                z = z;
                                obj = obj;
                            }
                            C15434 c15434M9453 = C3128.m9452(c23195);
                            if (c15434M9453 != null && ((C3128.m9472(c15434M9453.f50296) == abstractC11245 || C3128.m9472(c15434M9453.f50296) == c23942.f77638) && m18321(c15434M9453, c23195, false))) {
                                c20414.m48199(c23195, C23879.m52622(C14707.f48110, this.f22814.f16301.f30086.f77453, C14707.f48082));
                            }
                        } else {
                            abstractC11242 = abstractC11242;
                            z = z;
                            obj = obj;
                        }
                        if (!c23195.f75269.isEmpty()) {
                            c20414.m48199(c23195, C23879.m52622(C14707.f48110, this.f22814.f16301.f30086.f77453, C14707.f48051));
                        }
                        C21825 c21825M50004 = this.f22814.f16301.f30086.m50004();
                        C21825 c21825M48592 = C3128.m9444(this.f22814.f16301).m48592((Function) new C11739(6));
                        for (C6656 c6657 : c23195.f75270) {
                            boolean z2 = (c6657.f22475.f77447 & 17179869184L) != 0;
                            if (!c23800.m52399(c6657.f30190, (AbstractC16579) c21825M48592.f70876) || ((C16142) c21825M50004.f70876).m38212() != z2) {
                                c20414.m48199(c6657, C23879.m52622(C14707.f48110, this.f22814.f16301.f30086.f77453, C14707.f48056));
                            }
                            c21825M50004 = c21825M50004.f70877;
                            c21825M48592 = c21825M48592.f70877;
                        }
                    }
                } else {
                    c4603 = c4603M28953;
                }
                obj = obj;
            } else {
                c4603 = c4603M28953;
                obj = obj;
            }
            if ((c22492.mo20276() & 8192) != 0) {
                if (c23195.f75264.m48595()) {
                    AbstractC5930 abstractC5931 = (AbstractC5930) c23195.f75264.f70876;
                    abstractC5931.getClass();
                    c20414.m48199(abstractC5931, C23879.f77265);
                }
                if (c23195.f75269.m48595()) {
                    C22179 c22179 = (C22179) c23195.f75269.f70876;
                    c22179.getClass();
                    c20414.m48199(c22179, C23879.f77291);
                }
                c21017.m47344(c23195.f75266);
                c21017.m47314(c23195, c182510);
            }
            C21825 c21827 = c23195.f75264;
            while (true) {
                boolean zM48595 = c21827.m48595();
                c3836 = this.f22806;
                if (!zM48595) {
                    break;
                }
                AbstractC5930 abstractC5932 = (AbstractC5930) c21827.f70876;
                abstractC5932.getClass();
                c21017.m47266(abstractC5932, ((AbstractC5930) c21827.f70876).f30190, c3836.f14302, c21017.f68418);
                c21827 = c21827.f70877;
            }
            if (c23195.f75268 == null) {
                if (c23195.f75265 != null && (c22492.mo20276() & 8192) == 0) {
                    c20414.m48199(c23195, C23879.f77352);
                }
                if (z || (c23195.f75263.mo20276() & 1280) == 0) {
                    c20414.m48199(c23195, C23879.f77208);
                }
            } else {
                if ((c23195.f75263.mo20276() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                    if ((c22492.mo20276() & 512) != 0) {
                        C21452 c21452 = c23195.f75268;
                        c21452.getClass();
                        c20414.m48199(c21452, C23879.f77312);
                    } else {
                        c20414.m48199(c23195, C23879.f77204);
                    }
                } else if ((c23195.f75267.f70567 & 256) != 0) {
                    c20414.m48199(c23195, C23879.f77180);
                }
                if (abstractC11242 == c23942.f77632 && c22492.f77449 != c3836.f14275) {
                    C21452 c21453 = c23195.f75268;
                    if (c21453.f69737.isEmpty() || C3128.m9441(c21453.f69737, c23942) == c23942.f77594) {
                        c5286.m14628(c21453.f30189);
                        c21453.f69737 = c21453.f69737.m48597(c5286.m14642(c5286.m14610(c5286.m14639(c23942.f77638), C21825.m48588(), c5286.m14637(C21825.m48588()))));
                    } else if ((this.f22814.f16301.f30086.mo20276() & 16384) != 0 && (c23195.f75267.f70567 & 68719476736L) == 0 && C3128.m9456((AbstractC8774) c21453.f69737.f70876)) {
                        AbstractC14728 abstractC14728 = (AbstractC14728) c23195.f75268.f69737.f70876;
                        abstractC14728.getClass();
                        c20414.m48199(abstractC14728, C23879.m52623(this.f22814.f16301.f30086));
                    }
                    if (this.f22814.f16301.f30086.m50010() && (c23195.f75263.f77447 & 2305843009213693952L) != 0) {
                        if (!c23195.f75263.f58259.m48592((Function) new C12964(5)).equals(C3128.m9444(this.f22814.f16301).m48592((Function) new C16025(4)))) {
                            c20414.m48199(c23195, C23879.m52622(C14707.f48110, this.f22814.f16301.f30086.f77453, C14707.f48062));
                        }
                        if (c23195.f75263.f77449.mo27295().f45366 != null && !c23195.f75263.f77449.mo27295().f45366.isEmpty()) {
                            c20414.m48199(c23195, C23879.m52622(C3128.m9475(c23195) ? C14707.f48090 : C14707.f48110, this.f22814.f16301.f30086.f77453, new C14377("compiler", "throws.clause.not.allowed.for.canonical.constructor", C3128.m9475(c23195) ? C14707.f48090 : C14707.f48110)));
                        }
                    }
                }
                C4603 c4604 = c4603;
                c17573.m40869(c23195.f75268, c4604, c182510, (InterfaceC12260) null);
                c17573.m40874();
                m18298(c23195.f75268, c4604);
            }
            ((C22990) obj).f74722.mo24225();
            AbstractC16579 abstractC16579 = c182510.f77449;
            c23195.f30190 = abstractC16579;
            this.f22800 = abstractC16579;
            c21017.m47268(c16827);
            c21017.m47269(c18259);
        } catch (Throwable th3) {
            th = th3;
            c16826 = c16826M47268;
            c18258 = c18258M47269;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C16826 c16826;
        boolean z;
        boolean z2;
        AbstractC5930 abstractC5930;
        C13736 c13736;
        AbstractC11242 abstractC11242 = c6656.f22478;
        C17573 c17573 = this.f22801;
        C4603 c4603 = this.f22814;
        AbstractC9462 abstractC9462 = ((C22990) c4603.f16299).f74722;
        EnumC10477 enumC10477 = abstractC9462.f11719.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35879;
        C11619 c11619 = this.f22828;
        C20414 c20414 = this.f22832;
        if (enumC10477 == enumC10478 || enumC10477 == EnumC10477.f35878) {
            C6263 c6263 = c6656.f22475;
            if (c6263 != null) {
                abstractC9462.mo24224(c6263);
            } else {
                if (c6656.m18039() && (c6656.f22476.f70567 & 8589934592L) == 0) {
                    AbstractC5930 abstractC5931 = c6656.f22481;
                    C5286 c5286 = this.f22794;
                    if (abstractC5931 == null) {
                        c20414.m48199(c6656, C23879.m52620(abstractC11242, C14707.f48066));
                        c6656.f22477 = c5286.m14644();
                    } else {
                        C13818 c13818 = new C13818();
                        c13818.f45604 = null;
                        c13818.f45605 = true;
                        c13818.mo7248(abstractC5931);
                        C14377 c14377 = c13818.f45604;
                        if (c14377 != null) {
                            c20414.m48199(c6656, C23879.m52620(abstractC11242, c14377));
                            c6656.f22477 = c5286.m14644();
                        }
                    }
                }
                try {
                    c17573.m40875();
                    c11619.m28956((AbstractC8774) c6656, this.f22814);
                    c17573.m40873();
                } catch (Throwable th) {
                    c17573.m40873();
                    throw th;
                }
            }
        } else {
            m18276(c6656, c4603);
        }
        C6263 c6264 = c6656.f22475;
        C16826 c16826M39465 = ((C22990) this.f22814.f16299).f74715.m39465(c6264);
        C21017 c21017 = this.f22834;
        C16826 c16826M47268 = c21017.m47268(c16826M39465);
        try {
            if (this.f22814.f16296.m22847(EnumC18651.f60511) && ((C22489) this.f22814.f16296).f73411 == EnumC5555.IMPLICIT) {
                c16826 = c16826M47268;
                z = (c6656.f22475.f77447 & 8589934592L) != 0;
                AbstractC5930 abstractC5932 = c6656.f22477;
                C4603 c4604 = this.f22814;
                if (!z || c6656.m18039()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c21017.m47287(abstractC5932, c4604, z2);
                c6264.m17332();
                this.f22811.m8271((AbstractC8774) c6656);
                c21017.m47316(c6264, c6656);
                abstractC5930 = c6656.f22481;
                if (abstractC5930 != null) {
                    if ((c6264.f77447 & 16) != 0) {
                        c11619.getClass();
                        c13736 = new C13736();
                        abstractC5930.mo1802(c13736);
                        if (!c13736.f45291) {
                            C4603 c4605 = this.f22814;
                            c11619.getClass();
                            C15229 c15229M28952 = C11619.m28952(c6656, c4605);
                            Object obj = c15229M28952.f16299;
                            ((C22990) obj).f74715 = c16826M39465;
                            ((C22990) obj).f74718 = c6264;
                            m18300((AbstractC8774) c6656.f22481, (C4603) c15229M28952, c6264.f77449);
                            if (c6656.m18039()) {
                                c6264.f77449 = c21017.m47264(c6656, c6656.f22481.f30190, abstractC11242);
                            }
                        }
                    } else {
                        C4603 c4606 = this.f22814;
                        c11619.getClass();
                        C15229 c15229M28953 = C11619.m28952(c6656, c4606);
                        Object obj2 = c15229M28953.f16299;
                        ((C22990) obj2).f74715 = c16826M39465;
                        ((C22990) obj2).f74718 = c6264;
                        m18300((AbstractC8774) c6656.f22481, (C4603) c15229M28953, c6264.f77449);
                        if (c6656.m18039()) {
                            c6264.f77449 = c21017.m47264(c6656, c6656.f22481.f30190, abstractC11242);
                        }
                    }
                    if (c6656.m18039()) {
                        m18277(c6656, c6264.f77449);
                    }
                }
                AbstractC16579 abstractC16579 = c6264.f77449;
                c6656.f30190 = abstractC16579;
                this.f22800 = abstractC16579;
                if (this.f22814.f16301.f30086.m50010() && c6656.f22475.f77448.f77452 == EnumC10477.f35865 && !c6264.mo22992() && m18288(c6264.f77453)) {
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c6656, new C5909("compiler", "illegal.record.component.name", c6264));
                }
                return;
            }
            c16826 = c16826M47268;
            c6264.m17332();
            this.f22811.m8271((AbstractC8774) c6656);
            c21017.m47316(c6264, c6656);
            abstractC5930 = c6656.f22481;
            if (abstractC5930 != null) {
                if ((c6264.f77447 & 16) != 0) {
                    c11619.getClass();
                    c13736 = new C13736();
                    abstractC5930.mo1802(c13736);
                    if (!c13736.f45291) {
                        C4603 c4607 = this.f22814;
                        c11619.getClass();
                        C15229 c15229M28954 = C11619.m28952(c6656, c4607);
                        Object obj3 = c15229M28954.f16299;
                        ((C22990) obj3).f74715 = c16826M39465;
                        ((C22990) obj3).f74718 = c6264;
                        m18300((AbstractC8774) c6656.f22481, (C4603) c15229M28954, c6264.f77449);
                        if (c6656.m18039()) {
                            c6264.f77449 = c21017.m47264(c6656, c6656.f22481.f30190, abstractC11242);
                        }
                    }
                } else {
                    C4603 c4608 = this.f22814;
                    c11619.getClass();
                    C15229 c15229M28955 = C11619.m28952(c6656, c4608);
                    Object obj4 = c15229M28955.f16299;
                    ((C22990) obj4).f74715 = c16826M39465;
                    ((C22990) obj4).f74718 = c6264;
                    m18300((AbstractC8774) c6656.f22481, (C4603) c15229M28955, c6264.f77449);
                    if (c6656.m18039()) {
                        c6264.f77449 = c21017.m47264(c6656, c6656.f22481.f30190, abstractC11242);
                    }
                }
                if (c6656.m18039()) {
                    m18277(c6656, c6264.f77449);
                }
            }
            AbstractC16579 abstractC165710 = c6264.f77449;
            c6656.f30190 = abstractC165710;
            this.f22800 = abstractC165710;
            if (this.f22814.f16301.f30086.m50010()) {
                C5909 c59010 = C23879.f77204;
                c20414.m48199(c6656, new C5909("compiler", "illegal.record.component.name", c6264));
            }
            return;
        } finally {
            c21017.m47268(c16826);
        }
        AbstractC5930 abstractC5933 = c6656.f22477;
        C4603 c4609 = this.f22814;
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        c21017.m47287(abstractC5933, c4609, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18276(C6656 c6656, C4603 c4603) {
        EnumC10477 enumC10477;
        AbstractC5930 abstractC5930 = c6656.f22481;
        if (abstractC5930 != null) {
            C21783 c21783 = c6656.f22476;
            long j = c21783.f70567;
            if ((j & 9007199254740992L) != 0 || (enumC10477 = ((C22990) c4603.f16299).f74722.f11719.f77452) == EnumC10477.f35879 || enumC10477 == EnumC10477.f35878) {
                return;
            }
            c21783.f70567 = j | 9007199254740992L;
            C6263 c6263 = c6656.f22475;
            C17573 c17573 = this.f22801;
            c17573.m40869(abstractC5930, c4603, c6263, c6656);
            c17573.m40874();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18288(AbstractC11242 abstractC11242) {
        AbstractC9462 abstractC9462Mo20272 = this.f22806.f14275.f53222.mo20272();
        C3704 c3704 = new C3704(1);
        abstractC9462Mo20272.getClass();
        Iterator it = abstractC9462Mo20272.mo3803(abstractC11242, c3704, EnumC10167.RECURSIVE).iterator();
        while (it.hasNext()) {
            if (((AbstractC23903) it.next()).f77449.mo33523().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3962(C23900 c23900) {
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        C4603 c4603 = this.f22814;
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        AbstractC23903 abstractC23903 = abstractC9462.f11719;
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 == EnumC10477.f35865 || enumC10477 == EnumC10477.f35866) {
            long j = c21452.f69739;
            C18258 c18258 = new C18258(1048576 | j | (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), this.f22815.f77594, null, ((C22990) this.f22814.f16299).f74722.f11719);
            C4603 c4604 = this.f22814;
            C22990 c22991 = (C22990) c4604.f16299;
            C4603 c4603M12747 = c4604.m12747(c21452, c22991.m50854(c22991.f74722.mo3801(c18258)));
            Object obj = c4603M12747.f16299;
            long j2 = j & 8;
            if (j2 != 0) {
                ((C22990) obj).f74716++;
            }
            C22990 c22992 = (C22990) obj;
            AbstractC23903 abstractC23904 = c22992.f74722.f11719;
            C17573 c17573 = this.f22801;
            c17573.m40869(c21452, c4603M12747, abstractC23904, (InterfaceC12260) null);
            c17573.m40874();
            m18329(c21452.f69737, c4603M12747);
            C22492 c22492 = (C22492) ((C22990) this.f22814.f16299).f74722.f11719;
            C21825 c21825Mo50009 = c22992.f74722.f11719.mo50009();
            if (j2 != 0) {
                c22492.m52715(c21825Mo50009);
            } else {
                c22492.m52710(c21825Mo50009);
            }
        } else {
            C4603 c4603M12748 = c4603.m12747(c21452, c22990.m50854(abstractC9462.mo3805(abstractC23903)));
            Object obj2 = c4603M12748.f16299;
            try {
                m18329(c21452.f69737, c4603M12748);
                ((C22990) obj2).f74722.mo24225();
            } catch (Throwable th) {
                ((C22990) obj2).f74722.mo24225();
                throw th;
            }
        }
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        AbstractC14728 abstractC14728 = c0285.f1595;
        C4603 c4603 = this.f22814;
        m18298(abstractC14728, c4603.m12747(c0285, c4603.f16299));
        m18300((AbstractC8774) c0285.f1596, this.f22814, (AbstractC16579) this.f22806.f14263);
        AbstractC14728 abstractC14729 = c0285.f1595;
        m18324(abstractC14729);
        if (!this.f22810.m27511(this.f22814, abstractC14729, this.f22794)) {
            C2923 c2923 = this.f22827;
            C21825 c21825 = c2923.f10987;
            AbstractC9462 abstractC9462 = ((C22990) this.f22814.f16299).f74722;
            C13638.requireNonNull(abstractC9462);
            C0356.forEach(c21825, new C18175(abstractC9462));
            C0356.forEach(c2923.f10987, new C18881());
        }
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        m18300((AbstractC8774) c22885.f74426, this.f22814, (AbstractC16579) this.f22806.f14263);
        C2923 c2923 = this.f22827;
        C4603 c4603 = this.f22814;
        C21825 c21825 = c2923.f10989;
        C21825 c21826 = c2923.f10987;
        C4603 c4603M18267 = m18267(c4603, c4603.f16296, c21825);
        Object obj = c4603M18267.f16299;
        try {
            m18298(c22885.f74425, c4603M18267.m12747(c22885, obj));
            ((C22990) obj).f74722.mo24225();
            AbstractC14728 abstractC14728 = c22885.f74425;
            m18324(abstractC14728);
            if (!this.f22810.m27511(this.f22814, abstractC14728, this.f22794)) {
                AbstractC9462 abstractC9462 = ((C22990) this.f22814.f16299).f74722;
                C13638.requireNonNull(abstractC9462);
                C0356.forEach(c21826, new C18175(abstractC9462));
                C0356.forEach(c21826, new C18881());
            }
            this.f22800 = null;
        } catch (Throwable th) {
            ((C22990) obj).f74722.mo24225();
            throw th;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        C4603 c4603 = this.f22814;
        AbstractC8774 abstractC8774 = c4603.f16296;
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        C4603 c4603M12747 = c4603.m12747(abstractC8774, c22990.m50854(abstractC9462.mo3805(abstractC9462.f11719)));
        Object obj = c4603M12747.f16299;
        C2923 c2923 = C4562.f16202;
        try {
            m18329(c14398.f47204, c4603M12747);
            AbstractC5930 abstractC5930 = c14398.f47207;
            if (abstractC5930 != null) {
                m18300((AbstractC8774) abstractC5930, c4603M12747, (AbstractC16579) this.f22806.f14263);
                c2923 = this.f22827;
            }
            C21825 c21825 = c2923.f10989;
            C21825 c21826 = c2923.f10987;
            C4603 c4603M18267 = m18267(c4603M12747, c4603M12747.f16296, c21825);
            try {
                c4603M18267.f16296 = c14398;
                m18329(c14398.f47205, c4603M18267);
                m18298(c14398.f47206, c4603M18267);
                ((C22990) c4603M18267.f16299).f74722.mo24225();
                this.f22800 = null;
                ((C22990) obj).f74722.mo24225();
                AbstractC14728 abstractC14728 = c14398.f47206;
                m18324(abstractC14728);
                if (this.f22810.m27511(this.f22814, abstractC14728, this.f22794)) {
                    return;
                }
                AbstractC9462 abstractC9463 = ((C22990) this.f22814.f16299).f74722;
                C13638.requireNonNull(abstractC9463);
                C0356.forEach(c21826, new C18175(abstractC9463));
                C0356.forEach(c21826, new C18881());
            } catch (Throwable th) {
                ((C22990) c4603M18267.f16299).f74722.mo24225();
                throw th;
            }
        } catch (Throwable th2) {
            ((C22990) obj).f74722.mo24225();
            throw th2;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        AbstractC16579 abstractC16579M52415;
        C3836 c3836 = this.f22806;
        C21017 c21017 = this.f22834;
        C23800 c23800 = this.f22802;
        C4603 c4603 = this.f22814;
        AbstractC8774 abstractC8774 = c4603.f16296;
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        C4603 c4603M12747 = c4603.m12747(abstractC8774, c22990.m50854(abstractC9462.mo3805(abstractC9462.f11719)));
        Object obj = c4603M12747.f16299;
        try {
            AbstractC16579 abstractC16579M18299 = m18299(c16514.f53044, c4603M12747, this.f22809);
            c23800.getClass();
            AbstractC16579 abstractC16579M52343 = C23800.m52343(abstractC16579M18299);
            c21017.m47251(c16514, abstractC16579M52343);
            AbstractC16579 abstractC16579M52416 = c23800.m52416(abstractC16579M52343);
            if (abstractC16579M52416 == null) {
                AbstractC16579 abstractC16579M52423 = c23800.m52423(c3836.f14259.f53222, abstractC16579M52343);
                C20414 c20414 = this.f22832;
                if (abstractC16579M52423 == null) {
                    AbstractC5930 abstractC5930 = c16514.f53044;
                    abstractC5930.getClass();
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(abstractC5930, new C5909("compiler", "foreach.not.applicable.to.type", abstractC16579M52343, C14707.f48087));
                    abstractC16579M52416 = c23800.m52440(abstractC16579M52343);
                } else {
                    C21825 c21825Mo1943 = abstractC16579M52423.mo1943();
                    if (c21825Mo1943.isEmpty()) {
                        abstractC16579M52415 = c3836.f14275;
                    } else {
                        abstractC16579M52415 = c23800.m52415((AbstractC16579) c21825Mo1943.f70876);
                    }
                    AbstractC16579 abstractC16579 = abstractC16579M52415;
                    if (c23800.m52423(c3836.f14224.f53222, this.f22822.m45527(c16514, c4603M12747, c23800.m52422(abstractC16579M52343, false), this.f22815.f77576, C21825.m48588(), C21825.m48588()).f77449.mo16235()) == null) {
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(c16514, new C5909("compiler", "foreach.not.applicable.to.type", abstractC16579M52343, C14707.f48087));
                    }
                    abstractC16579M52416 = abstractC16579;
                }
            }
            if (c16514.f53042.m18039()) {
                C6656 c6656 = c16514.f53042;
                m18277(c16514.f53042, c21017.m47264(c6656, abstractC16579M52416, c6656.f22478));
            }
            m18298((AbstractC8774) c16514.f53042, c4603M12747);
            AbstractC5930 abstractC5931 = c16514.f53044;
            abstractC5931.getClass();
            c21017.m47266(abstractC5931, abstractC16579M52416, c16514.f53042.f22475.f77449, c21017.f68418);
            c4603M12747.f16296 = c16514;
            m18298(c16514.f53043, c4603M12747);
            this.f22800 = null;
        } finally {
            ((C22990) obj).f74722.mo24225();
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        for (C4603 c4603 = this.f22814; c4603 != null && !c4603.f16296.m22847(EnumC18651.f60468); c4603 = c4603.f16297) {
            if (c4603.f16296.m22847(EnumC18651.f60490)) {
                AbstractC11242 abstractC11242 = ((C2732) c4603.f16296).f10509;
                AbstractC11242 abstractC11243 = c2732.f10509;
                if (abstractC11242 == abstractC11243) {
                    C5909 c5909 = C23879.f77204;
                    this.f22832.m48199(c2732, new C5909("compiler", "label.already.in.use", abstractC11243));
                    break;
                }
            }
        }
        AbstractC14728 abstractC14728 = c2732.f10508;
        C4603 c4604 = this.f22814;
        m18298(abstractC14728, c4604.m12747(c2732, c4604.f16299));
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) throws Throwable {
        m18284(c2026, c2026.f7570, c2026.f7568, new BiConsumer() { // from class: l.ۚܽۤ
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C6761 c6761 = this.f18847;
                c6761.getClass();
                c6761.m18329(((C18630) obj).f60403, (C4603) obj2);
            }
        });
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        c17924.f56927 = m18269(c17924, EnumC18651.f60474, c17924.f56926, this.f22814);
        this.f22800 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18284(AbstractC8774 abstractC8774, AbstractC5930 abstractC5930, C21825 c21825, BiConsumer biConsumer) throws Throwable {
        Object obj;
        boolean zAnyMatch;
        boolean z;
        C21017 c21017;
        C1116 c1116;
        C3131 c3131;
        boolean z2;
        C2008 c2008;
        C18630 c18630;
        C23800 c23800;
        C21017 c21018;
        HashSet hashSet;
        C20145 c20145 = this.f22822;
        C3836 c3836 = this.f22806;
        C23800 c23801 = this.f22802;
        C4603 c4603 = this.f22814;
        C1116 c1117 = this.f22809;
        AbstractC16579 abstractC16579M18299 = m18299(abstractC5930, c4603, c1117);
        C4603 c4604 = this.f22814;
        C22990 c22990 = (C22990) c4604.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        C4603 c4603M12747 = c4604.m12747(abstractC8774, c22990.m50854(abstractC9462.mo3805(abstractC9462.f11719)));
        Object obj2 = c4603M12747.f16299;
        try {
            boolean z3 = (abstractC16579M18299.f53222.mo20276() & 16384) != 0;
            AbstractC16579 abstractC16579 = c3836.f14220;
            C3131 c3132 = c3836.f14232;
            boolean zM52399 = c23801.m52399(abstractC16579M18299, abstractC16579);
            C10391 c10391 = c23801.f76946;
            boolean zM9450 = C3128.m9450(abstractC5930, c21825);
            C2008 c2009 = this.f22823;
            if (!z3 && !zM52399 && !zM9450 && !c23801.m52428(abstractC16579M18299, c3132, c10391)) {
                c2009.m6470(abstractC5930, EnumC14026.f46127);
                zAnyMatch = true;
            } else {
                zAnyMatch = C9030.stream(c21825).flatMap(new C13315(8)).anyMatch(new C1241(0));
            }
            HashSet hashSet2 = new HashSet();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            C21825 c21826 = c21825;
            C21825 c21825M48588 = C21825.m48588();
            EnumC13425 enumC13425 = null;
            C2923 c2923 = null;
            while (true) {
                boolean zM48595 = c21826.m48595();
                z = zAnyMatch;
                c21017 = this.f22834;
                if (!zM48595) {
                    break;
                }
                obj = obj2;
                C21825 c21827 = c21826;
                C21017 c21019 = c21017;
                try {
                    C18630 c18631 = (C18630) c21827.f70876;
                    C20414 c20414 = this.f22832;
                    if (enumC13425 == null) {
                        enumC13425 = c18631.f60402;
                        c1116 = c1117;
                    } else {
                        c1116 = c1117;
                        if (enumC13425 != c18631.f60402 && !z7) {
                            c20414.m48199(c18631, C23879.f77172);
                            z7 = true;
                        }
                    }
                    Iterator it = c18631.f60400.iterator();
                    C2923 c2923M12716 = c2923;
                    EnumC13425 enumC13426 = enumC13425;
                    C21825 c21825M48597 = c21825M48588;
                    boolean z8 = z6;
                    boolean z9 = z5;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        AbstractC8047 abstractC8047 = (AbstractC8047) it.next();
                        if (abstractC8047.mo16200()) {
                            c18630 = c18631;
                            AbstractC5930 abstractC5931 = (AbstractC5930) abstractC8047;
                            if (C3128.m9470(abstractC5931)) {
                                c3131 = c3132;
                                c2009.m6470(abstractC5931, EnumC14026.f46099);
                                if (z8) {
                                    c20414.m48199(abstractC8047, C23879.f77182);
                                } else if (z5) {
                                    c20414.m48199(abstractC8047, C23879.f77300);
                                }
                                m18300((AbstractC8774) abstractC5931, c4603M12747, abstractC16579M18299);
                                C2923 c2924 = this.f22827;
                                c2008 = c2009;
                                this.f22827 = new C2923(c2924.f10989, c2924.f10987, true);
                                c20145 = c20145;
                                c23800 = c23801;
                                z8 = true;
                            } else {
                                c3131 = c3132;
                                C23800 c23802 = c23801;
                                c2008 = c2009;
                                if (z3) {
                                    AbstractC23903 abstractC23903M18271 = m18271(abstractC16579M18299, abstractC5931);
                                    if (abstractC23903M18271 == null) {
                                        c20414.m48199(abstractC5931, C23879.f77200);
                                    } else if (!hashSet2.add(abstractC23903M18271)) {
                                        c20414.m48199(abstractC8047, C23879.f77182);
                                    } else {
                                        m18282(abstractC8047, c21825M48597, abstractC23903M18271.f77449);
                                    }
                                } else if (zM9450) {
                                    InterfaceC19501 interfaceC19501 = c20145.f65412;
                                    try {
                                        c20145.f65412 = c20145.f65414;
                                        m18300((AbstractC8774) abstractC8047, c4603M12747, abstractC16579M18299);
                                        c20145.f65412 = interfaceC19501;
                                    } catch (Throwable th) {
                                        c20145.f65412 = interfaceC19501;
                                        throw th;
                                    }
                                } else {
                                    C21059 c21059 = C21059.f68593;
                                    EnumC6617 enumC6617 = EnumC6617.ERROR;
                                    AbstractC16579 abstractC16579M182910 = m18299(abstractC5931, c4603M12747, new C1116(this, c21059, !abstractC16579M18299.m39001(enumC6617) ? abstractC16579M18299 : AbstractC16579.f53219));
                                    if (!abstractC16579M182910.m39001(enumC6617)) {
                                        if (abstractC16579M182910.mo24292() == null) {
                                            AbstractC23903 abstractC23903M9471 = C3128.m9471(abstractC5931);
                                            if (abstractC23903M9471 != null && abstractC23903M9471.f77452 == EnumC10477.f35865 && this.f22821) {
                                                c20414.m48199(abstractC5931, C23879.f77267);
                                            } else {
                                                c20414.m48199(abstractC5931, zM52399 ? C23879.f77249 : C23879.f77302);
                                            }
                                        } else {
                                            if (zM52399) {
                                                c23800 = c23802;
                                            } else {
                                                c23800 = c23802;
                                                if (c23800.m52428(abstractC16579M18299, c3131, c10391)) {
                                                    c3131 = c3131;
                                                } else {
                                                    C5909 c5909 = C23879.f77204;
                                                    c3131 = c3131;
                                                    z2 = z3;
                                                    c20414.m48199(abstractC8047, new C5909("compiler", "constant.label.not.compatible", abstractC16579M182910, abstractC16579M18299));
                                                    c18630 = c18630;
                                                }
                                            }
                                            z2 = z3;
                                            if (!hashSet2.add(abstractC16579M182910.mo24292())) {
                                                c18630 = c18630;
                                                c20414.m48199(c18630, C23879.f77182);
                                            } else {
                                                c18630 = c18630;
                                                if (abstractC16579M182910.mo9481()) {
                                                    abstractC16579M182910 = c23800.m52383(abstractC16579M182910).f77449;
                                                }
                                                m18282(abstractC8047, c21825M48597, abstractC16579M182910);
                                            }
                                        }
                                    }
                                    c23800 = c23802;
                                }
                                c20145 = c20145;
                                c23800 = c23802;
                            }
                            z2 = z3;
                        } else {
                            c20145 = c20145;
                            c3131 = c3132;
                            z2 = z3;
                            c2008 = c2009;
                            c18630 = c18631;
                            c23800 = c23801;
                            if (!abstractC8047.m22847(EnumC18651.f60565)) {
                                C1116 c1118 = c1116;
                                m18299(abstractC8047, c4603M12747, c1118);
                                C10891 c10891M9462 = C3128.m9462((AbstractC20372) abstractC8047);
                                AbstractC16579 abstractC16579M27290 = c10891M9462.m27290();
                                if (abstractC16579M27290.m39001(EnumC6617.TYPEVAR)) {
                                    c21018 = c21019;
                                } else {
                                    c21018 = c21019;
                                    abstractC16579M27290 = c21018.m47263(abstractC8047, abstractC16579M27290);
                                }
                                m18289(abstractC8047, abstractC16579M18299, abstractC16579M27290);
                                AbstractC16579 abstractC16579M52402 = c23800.m52402(abstractC16579M27290);
                                if (!c10891M9462.m27291() || abstractC16579M52402.mo1926()) {
                                    hashSet = hashSet2;
                                    c1116 = c1118;
                                } else {
                                    hashSet = hashSet2;
                                    c1116 = c1118;
                                    if (c23800.m52413(c23800.m52402(abstractC16579M18299), abstractC16579M52402, true)) {
                                        if (z9) {
                                            c20414.m48199(abstractC8047, C23879.f77193);
                                        } else if (z4) {
                                            c20414.m48199(abstractC8047, C23879.f77217);
                                        }
                                        z9 = true;
                                    }
                                }
                                m18282(abstractC8047, c21825M48597, abstractC16579M52402);
                                if (c10891M9462.m27291() && !abstractC16579M52402.mo1926()) {
                                    c21825M48597 = c21825M48597.m48597(abstractC16579M52402);
                                }
                            } else {
                                if (z4) {
                                    c20414.m48199(abstractC8047, C23879.f77243);
                                } else if (z9) {
                                    c20414.m48199(abstractC8047, C23879.f77217);
                                }
                                this.f22827 = C4562.f16202;
                                z4 = true;
                            }
                            c2923M12716 = this.f22818.m12716(abstractC8047, c2923M12716, this.f22827);
                            hashSet2 = hashSet;
                            c23801 = c23800;
                            c18631 = c18630;
                            c21019 = c21018;
                            it = it2;
                            c3132 = c3131;
                            c2009 = c2008;
                            z3 = z2;
                            c20145 = c20145;
                        }
                        c21018 = c21019;
                        hashSet = hashSet2;
                        c2923M12716 = this.f22818.m12716(abstractC8047, c2923M12716, this.f22827);
                        hashSet2 = hashSet;
                        c23801 = c23800;
                        c18631 = c18630;
                        c21019 = c21018;
                        it = it2;
                        c3132 = c3131;
                        c2009 = c2008;
                        z3 = z2;
                        c20145 = c20145;
                    }
                    HashSet hashSet3 = hashSet2;
                    C20145 c20146 = c20145;
                    C3131 c3133 = c3132;
                    boolean z10 = z3;
                    C2008 c20010 = c2009;
                    C18630 c18632 = c18631;
                    C23800 c23803 = c23801;
                    C2923 c2925 = c2923M12716;
                    C4603 c4603M18267 = m18267(c4603M12747, c18632, c2925.f10989);
                    try {
                        biConsumer.accept(c18632, c4603M18267);
                        ((C22990) c4603M18267.f16299).f74722.mo24225();
                        AbstractC9462 abstractC9463 = ((C22990) obj).f74722;
                        for (C21825 c21828 = c18632.f60403; c21828.m48595(); c21828 = c21828.f70877) {
                            AbstractC8774 abstractC8775 = (AbstractC8774) c21828.f70876;
                            if (abstractC8775.m22847(EnumC18651.f60554)) {
                                abstractC9463.mo24224(((C6656) abstractC8775).f22475);
                            }
                        }
                        m18324(c18632);
                        boolean zM27510 = this.f22810.m27510(c4603M18267, c18632, this.f22794);
                        c18632.f60399 = zM27510;
                        if (c18632.f60402 != EnumC13425.STATEMENT || !zM27510) {
                            c2925 = null;
                        }
                        hashSet2 = hashSet3;
                        c21826 = c21827.f70877;
                        z5 = z9;
                        z6 = z8;
                        obj2 = obj;
                        c1117 = c1116;
                        c3132 = c3133;
                        c2009 = c20010;
                        z3 = z10;
                        c20145 = c20146;
                        c21825M48588 = c21825M48597;
                        enumC13425 = enumC13426;
                        c2923 = c2925;
                        c23801 = c23803;
                        zAnyMatch = z;
                    } catch (Throwable th2) {
                        ((C22990) c4603M18267.f16299).f74722.mo24225();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((C22990) obj).f74722.mo24225();
                    throw th;
                }
            }
            Object obj3 = obj2;
            if (z) {
                c21017.m47302(c21825);
            }
            if (abstractC8774.m22847(EnumC18651.f60475)) {
                ((C2026) abstractC8774).f7566 = z4 || z5;
                ((C2026) abstractC8774).f7567 = z;
            } else if (abstractC8774.m22847(EnumC18651.f60487)) {
                ((C9789) abstractC8774).f33503 = z4 || z5;
                ((C9789) abstractC8774).f33506 = z;
            } else {
                C6171.m17174(abstractC8774.mo1803().name());
                throw null;
            }
            ((C22990) obj3).f74722.mo24225();
        } catch (Throwable th4) {
            th = th4;
            obj = obj2;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        c20747.f67505 = m18269(c20747, EnumC18651.f60492, c20747.f67504, this.f22814);
        this.f22800 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18282(AbstractC8047 abstractC8047, C21825 c21825, AbstractC16579 abstractC16579) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            if (this.f22802.m52413(abstractC16579, (AbstractC16579) it.next(), true)) {
                this.f22832.m48199(abstractC8047, C23879.f77300);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23903 m18271(AbstractC16579 abstractC16579, AbstractC5930 abstractC5930) {
        if (!abstractC5930.m22847(EnumC18651.f60465)) {
            return null;
        }
        C3107 c3107 = (C3107) abstractC5930;
        for (AbstractC23903 abstractC23903 : abstractC16579.f53222.mo20272().m9327(c3107.f11715)) {
            if (abstractC23903.f77452 == EnumC10477.f35878) {
                c3107.f11716 = abstractC23903;
                ((C6263) abstractC23903).m17332();
                c3107.f30190 = abstractC23903.f77449;
                if ((abstractC23903.f77447 & 16384) == 0) {
                    return null;
                }
                return abstractC23903;
            }
        }
        return null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3921(C3437 c3437) {
        AbstractC16579 abstractC16579;
        AbstractC0618 abstractC0618;
        this.f22834.m47256(c3437, m18299(c3437.f12663, this.f22814, this.f22809));
        C16826 c16826 = ((C22990) this.f22814.f16299).f74715;
        EnumC0597 enumC0597 = EnumC0597.SYNCHRONIZATION;
        if (c16826.m39467(enumC0597) && (abstractC16579 = c3437.f12663.f30190) != null && (abstractC0618 = abstractC16579.f53222) != null && (abstractC0618.mo20276() & 9007199254740992L) != 0) {
            this.f22832.m48203(enumC0597, c3437, C9768.f32845);
        }
        m18298(c3437.f12662, this.f22814);
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        C4603 c4603M12747;
        C3836 c3836;
        C21017 c21017 = this.f22834;
        C4603 c4603 = this.f22814;
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        C4603 c4603M12748 = c4603.m12747(c13713, c22990.m50854(abstractC9462.mo3805(abstractC9462.f11719)));
        Object obj = c4603M12748.f16299;
        try {
            boolean zM48595 = c13713.f45222.m48595();
            if (zM48595) {
                C4603 c4604 = this.f22814;
                AbstractC9462 abstractC9463 = ((C22990) obj).f74722;
                c4603M12747 = c4604.m12747(c13713, ((C22990) obj).m50854(abstractC9463.mo3805(abstractC9463.f11719)));
            } else {
                c4603M12747 = c4603M12748;
            }
            try {
                Iterator it = c13713.f45222.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c3836 = this.f22806;
                    if (!zHasNext) {
                        break;
                    }
                    AbstractC8774 abstractC8774 = (AbstractC8774) it.next();
                    C1116 c1116 = new C1116(this, C21059.f68592, c3836.f14218, new C16059(this, this.f22804.f5037));
                    if (abstractC8774.m22847(EnumC18651.f60554)) {
                        m18298(abstractC8774, c4603M12747);
                        c1116.mo4137(abstractC8774, abstractC8774.f30190);
                        m18317((InterfaceC12260) abstractC8774, c4603M12748, abstractC8774.f30190);
                        ((C6656) abstractC8774).f22475.m17327(EnumC1923.RESOURCE_VARIABLE);
                    } else {
                        m18299(abstractC8774, c4603M12747, c1116);
                    }
                }
                m18298(c13713.f45220, c4603M12747);
                if (zM48595) {
                    ((C22990) c4603M12747.f16299).f74722.mo24225();
                }
                for (C21825 c21825 = c13713.f45221; c21825.m48595(); c21825 = c21825.f70877) {
                    C19336 c19336 = (C19336) c21825.f70876;
                    AbstractC9462 abstractC9464 = ((C22990) obj).f74722;
                    C4603 c4603M12749 = c4603M12748.m12747(c19336, ((C22990) obj).m50854(abstractC9464.mo3805(abstractC9464.f11719)));
                    try {
                        AbstractC16579 abstractC16579M18298 = m18298(c19336.f62363, c4603M12749);
                        if (c19336.f62363.f22477.m22847(EnumC18651.f60502)) {
                            c19336.f62363.f22475.f77447 |= 549755813904L;
                        }
                        C6263 c6263 = c19336.f62363.f22475;
                        if (c6263.f77452 == EnumC10477.f35878) {
                            c6263.m17327(EnumC1923.EXCEPTION_PARAMETER);
                        }
                        AbstractC5930 abstractC5930 = c19336.f62363.f22477;
                        abstractC5930.getClass();
                        AbstractC5930 abstractC5931 = c19336.f62363.f22477;
                        abstractC5931.getClass();
                        c21017.m47266(abstractC5930, c21017.m47338(abstractC5931, abstractC16579M18298), c3836.f14302, c21017.f68418);
                        m18298(c19336.f62362, c4603M12749);
                        ((C22990) c4603M12749.f16299).f74722.mo24225();
                    } catch (Throwable th) {
                        ((C22990) c4603M12749.f16299).f74722.mo24225();
                        throw th;
                    }
                }
                AbstractC8774 abstractC8775 = c13713.f45218;
                if (abstractC8775 != null) {
                    m18298(abstractC8775, c4603M12748);
                }
                this.f22800 = null;
                ((C22990) obj).f74722.mo24225();
            } catch (Throwable th2) {
                if (zM48595) {
                    ((C22990) c4603M12747.f16299).f74722.mo24225();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            ((C22990) obj).f74722.mo24225();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18317(InterfaceC12260 interfaceC12260, C4603 c4603, AbstractC16579 abstractC16579) {
        if (abstractC16579.mo1926()) {
            return;
        }
        C3836 c3836 = this.f22806;
        AbstractC0618 abstractC0618 = c3836.f14218.f53222;
        C23800 c23800 = this.f22802;
        if (c23800.m52423(abstractC0618, abstractC16579) == null || c23800.m52399(abstractC16579, c3836.f14218)) {
            return;
        }
        C20414 c20414 = this.f22832;
        C7714 c7714 = new C7714(c20414);
        try {
            C20145 c20145 = this.f22822;
            AbstractC16579 abstractC16579M52422 = c23800.m52422(abstractC16579, false);
            AbstractC11242 abstractC11242 = this.f22815.f77582;
            C21825 c21825M48588 = C21825.m48588();
            C21825 c21825M48589 = C21825.m48588();
            c20145.getClass();
            AbstractC23903 abstractC23903M45543 = c20145.m45543(interfaceC12260, c4603, abstractC16579M52422.f53222, abstractC16579M52422, abstractC11242, c21825M48588, c21825M48589);
            c20414.m46175(c7714);
            if (abstractC23903M45543.f77452 == EnumC10477.f35879 && abstractC23903M45543.mo42453(c3836.f14297, abstractC16579.f53222, c23800, true)) {
                AbstractC16579 abstractC165710 = c3836.f14267;
                C21825 c21825Mo33524 = c23800.m52409(abstractC23903M45543, abstractC16579).mo33524();
                C21017 c21017 = this.f22834;
                if (c21017.m47351(abstractC165710) || c21017.m47255(abstractC165710, c21825Mo33524)) {
                    C16826 c16826 = ((C22990) c4603.f16299).f74715;
                    EnumC0597 enumC0597 = EnumC0597.TRY;
                    if (c16826.m39467(enumC0597)) {
                        C14065 c14065 = C9768.f32836;
                        c20414.m48203(enumC0597, interfaceC12260, new C14065("compiler", "try.resource.throws.interrupted.exc", abstractC16579));
                    }
                }
            }
        } catch (Throwable th) {
            c20414.m46175(c7714);
            throw th;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        C1116 c1116Mo4136;
        AbstractC16579 abstractC16579M39436;
        AbstractC16579 abstractC16579;
        AbstractC16579 abstractC16579M18300 = m18300((AbstractC8774) c7341.f24394, this.f22814, (AbstractC16579) this.f22806.f14263);
        C2923 c2923 = this.f22827;
        EnumC0615 enumC0615 = (!this.f22816 || !(!this.f22804.f5036.m39001(EnumC6617.NONE) || (abstractC16579 = this.f22804.f5036) == AbstractC16579.f53218 || abstractC16579 == C13174.f43856) || m18286(this.f22814, c7341)) ? EnumC0615.STANDALONE : EnumC0615.POLY;
        c7341.f53897 = enumC0615;
        if (enumC0615 == EnumC0615.POLY && this.f22804.f5036.m39001(EnumC6617.VOID)) {
            this.f22804.f5037.mo2545(c7341, this.f22831.m51910(C14707.f48108));
            C5954 c5954M52440 = this.f22802.m52440(this.f22804.f5036);
            c7341.f30190 = c5954M52440;
            this.f22800 = c5954M52440;
            return;
        }
        EnumC0615 enumC0616 = c7341.f53897;
        EnumC0615 enumC0617 = EnumC0615.STANDALONE;
        if (enumC0616 == enumC0617) {
            c1116Mo4136 = this.f22809;
        } else {
            C1116 c1116 = this.f22804;
            c1116Mo4136 = c1116.mo4136(new C0535(this, c1116.f5037));
        }
        C4603 c4603 = this.f22814;
        C4603 c4603M18267 = m18267(c4603, c4603.f16296, c2923.f10989);
        Object obj = c4603M18267.f16299;
        try {
            AbstractC16579 abstractC16579M18299 = m18299(c7341.f24393, c4603M18267, c1116Mo4136);
            ((C22990) obj).f74722.mo24225();
            C2923 c2924 = this.f22827;
            C4603 c4604 = this.f22814;
            C4603 c4603M18268 = m18267(c4604, c4604.f16296, c2923.f10987);
            Object obj2 = c4603M18268.f16299;
            try {
                AbstractC16579 abstractC16579M182910 = m18299(c7341.f24392, c4603M18268, c1116Mo4136);
                ((C22990) obj2).f74722.mo24225();
                C2923 c2925 = this.f22827;
                if (c7341.f53897 != enumC0617) {
                    abstractC16579M39436 = this.f22804.f5036;
                } else {
                    AbstractC5930 abstractC5930 = c7341.f24393;
                    abstractC5930.getClass();
                    AbstractC5930 abstractC5931 = c7341.f24392;
                    abstractC5931.getClass();
                    abstractC16579M39436 = m18308(C21825.of((Object) abstractC5930, (Object) abstractC5931), C21825.of((Object) abstractC16579M18299, (Object) abstractC16579M182910));
                }
                if (abstractC16579M18300.mo24292() != null && abstractC16579M18299.mo24292() != null && abstractC16579M182910.mo24292() != null && !abstractC16579M39436.m39001(EnumC6617.NONE)) {
                    if (!abstractC16579M18300.mo9483()) {
                        abstractC16579M18299 = abstractC16579M182910;
                    }
                    abstractC16579M39436 = this.f22824.m39436(abstractC16579M18299, abstractC16579M39436);
                }
                this.f22800 = m18301(c7341, abstractC16579M39436, C21059.f68595, this.f22804);
                this.f22827 = this.f22818.m12713(c7341, c2923, c2924, c2925);
            } catch (Throwable th) {
                ((C22990) obj2).f74722.mo24225();
                throw th;
            }
        } catch (Throwable th2) {
            ((C22990) obj).f74722.mo24225();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18286(C4603 c4603, AbstractC5930 abstractC5930) {
        AbstractC16579 abstractC16579;
        int i = C10415.f35605[abstractC5930.mo1803().ordinal()];
        C1116 c1116 = this.f22809;
        C8528 c8528 = this.f22808;
        C5870 c5870 = this.f22830;
        switch (i) {
            case 1:
                EnumC6617 enumC6617 = ((C1321) abstractC5930).f5611;
                return enumC6617.m17953(EnumC6617.DOUBLE) || enumC6617 == EnumC6617.BOOLEAN || enumC6617 == EnumC6617.BOT;
            case 2:
            case 3:
                return false;
            case 4:
                return m18286(c4603, ((C21077) abstractC5930).f68656);
            case 5:
                C7341 c7341 = (C7341) abstractC5930;
                return m18286(c4603, c7341.f24393) && m18286(c4603, c7341.f24392);
            case 6:
                c8528.getClass();
                C15434 c15434 = (C15434) c5870.m16084(abstractC5930, c4603, c1116, c5870.f20047, null, EnumC3377.SPECULATIVE, new C3587(c8528));
                AbstractC23903 abstractC23903M9471 = C3128.m9471(c15434.f50296);
                if (c15434.f50296.m22847(EnumC18651.f60465)) {
                    abstractC16579 = c4603.f16301.f30190;
                } else {
                    abstractC16579 = ((C23570) c15434.f50296).f76357.f30190;
                }
                return m18330(this.f22802.m52409(abstractC23903M9471, abstractC16579).mo16235());
            case 7:
                AbstractC5930 abstractC5931 = (AbstractC5930) this.f22813.mo3964(((C8378) abstractC5930).f29095);
                c8528.getClass();
                return m18330(((AbstractC5930) c5870.m16084(abstractC5931, c4603, this.f22839, c5870.f20047, null, EnumC3377.SPECULATIVE, new C3587(c8528))).f30190);
            default:
                c8528.getClass();
                return m18330(c5870.m16084(abstractC5930, c4603, c1116, c5870.f20047, null, EnumC3377.SPECULATIVE, new C3587(c8528)).f30190);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m18330(AbstractC16579 abstractC16579) {
        return (abstractC16579.m39001(EnumC6617.TYPEVAR) || abstractC16579.mo1926() || !this.f22802.m52355(abstractC16579).mo9481()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18308(C21825 c21825, C21825 c21826) {
        boolean zIsEmpty = c21826.isEmpty();
        C3836 c3836 = this.f22806;
        if (zIsEmpty) {
            return c3836.f14275;
        }
        final AbstractC16579 abstractC16579 = (AbstractC16579) c21826.f70876;
        if (C9030.stream(c21826.f70877).allMatch(new Predicate() { // from class: l.ܿ֡ۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f54337.f22802.m52399(abstractC16579, (AbstractC16579) obj);
            }
        })) {
            return abstractC16579.mo5593();
        }
        C21825<AbstractC16579> c21827 = (C21825) C9030.stream(c21826).map(new C10645(0, this)).collect(C21825.m48587());
        if (C9030.stream(c21827).allMatch(new C16973(2))) {
            for (final AbstractC16579 abstractC165710 : c21827) {
                if (abstractC165710.mo1933().m17951(EnumC6617.INT) && C9030.stream(c21827).filter(new Predicate() { // from class: l.᩻֡ۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((AbstractC16579) obj) != abstractC165710;
                    }
                }).allMatch(new C14173(0, this, abstractC165710))) {
                    return abstractC165710.mo5593();
                }
            }
            for (EnumC6617 enumC6617 : f22793) {
                final AbstractC16579 abstractC165711 = c3836.f14282[enumC6617.ordinal()];
                if (C9030.stream(c21827).allMatch(new Predicate() { // from class: l.֫֡ۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return this.f5988.f22802.m52413((AbstractC16579) obj, abstractC165711, true);
                    }
                })) {
                    return abstractC165711;
                }
            }
        }
        C21825<AbstractC16579> c21828 = (C21825) C9030.stream(c21826).map(new C2882(0, this)).collect(C21825.m48587());
        for (final AbstractC16579 abstractC165712 : c21828) {
            if (C9030.stream(c21828).filter(new Predicate() { // from class: l.ۙܽۤ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((AbstractC16579) obj) != abstractC165712;
                }
            }).allMatch(new C13943(this, abstractC165712))) {
                return abstractC165712.mo5593();
            }
        }
        return this.f22802.m52397((C21825) C9030.stream((C21825) C9030.stream(c21828).map(new C11826(0, this, c21825.iterator())).collect(C21825.m48587())).map(new C13212(5)).filter(new C5705(0)).collect(C21825.m48587()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4603 m18267(C4603 c4603, AbstractC8774 abstractC8774, C21825 c21825) {
        C22990 c22990 = (C22990) c4603.f16299;
        AbstractC9462 abstractC9462 = c22990.f74722;
        C4603 c4603M12747 = c4603.m12747(abstractC8774, c22990.m50854(abstractC9462.mo3805(abstractC9462.f11719)));
        AbstractC9462 abstractC9463 = ((C22990) c4603M12747.f16299).f74722;
        C13638.requireNonNull(abstractC9463);
        C0356.forEach(c21825, new C18175(abstractC9463));
        return c4603M12747;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        boolean zM27510;
        m18300((AbstractC8774) c4849.f17076, this.f22814, (AbstractC16579) this.f22806.f14263);
        C2923 c2923 = this.f22827;
        C4603 c4603 = this.f22814;
        C21825 c21825 = c2923.f10989;
        C21825 c21826 = c2923.f10987;
        C4603 c4603M18267 = m18267(c4603, c4603.f16296, c21825);
        Object obj = c4603M18267.f16299;
        try {
            m18298(c4849.f17075, c4603M18267);
            ((C22990) obj).f74722.mo24225();
            m18324(c4849.f17075);
            C4603 c4604 = this.f22814;
            AbstractC14728 abstractC14728 = c4849.f17075;
            C10955 c10955 = this.f22810;
            C5286 c5286 = this.f22794;
            boolean zM27511 = c10955.m27510(c4604, abstractC14728, c5286);
            if (c4849.f17077 != null) {
                C4603 c4605 = this.f22814;
                C4603 c4603M18268 = m18267(c4605, c4605.f16296, c21826);
                Object obj2 = c4603M18268.f16299;
                try {
                    m18298(c4849.f17077, c4603M18268);
                    ((C22990) obj2).f74722.mo24225();
                    m18324(c4849.f17077);
                    zM27510 = c10955.m27510(this.f22814, c4849.f17077, c5286);
                } catch (Throwable th) {
                    ((C22990) obj2).f74722.mo24225();
                    throw th;
                }
            } else {
                zM27510 = true;
            }
            this.f22834.m47277(c4849);
            C21825 c21825M48588 = C21825.m48588();
            if (zM27511 && !zM27510) {
                c21826 = c2923.f10989;
            } else if (!zM27510 || zM27511) {
                c21826 = c21825M48588;
            }
            AbstractC9462 abstractC9462 = ((C22990) this.f22814.f16299).f74722;
            C13638.requireNonNull(abstractC9462);
            C0356.forEach(c21826, new C18175(abstractC9462));
            C0356.forEach(c21826, new C18881());
            this.f22800 = null;
        } catch (Throwable th2) {
            ((C22990) obj).f74722.mo24225();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18324(AbstractC8774 abstractC8774) {
        this.f22838.m19955();
        new C16764(this).mo7248(abstractC8774);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3936(C10870 c10870) {
        C4603 c4603 = this.f22814;
        m18299(c10870.f36960, c4603.m12747(c10870, c4603.f16299), this.f22809);
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        C5909 c5909;
        C4603 c4603 = this.f22814;
        C1116 c1116 = ((C22990) c4603.f16299).f74717;
        if (c1116 != null) {
            m18299(c21473.f69790, c4603, c1116);
            c21473.f69789 = m18269(c21473, EnumC18651.f60518, this.f22815.f77594, this.f22814);
        } else {
            if (c21473.f69790.m22847(EnumC18651.f60509)) {
                c5909 = C23879.f77322;
            } else {
                c5909 = C23879.f77236;
            }
            this.f22832.m48199(c21473, c5909);
            m18299(c21473.f69790, this.f22814, this.f22809);
        }
        this.f22800 = null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC8774 m18269(AbstractC14728 abstractC14728, EnumC18651 enumC18651, AbstractC11242 abstractC11242, C4603 c4603) {
        C2068 c2068;
        Object obj;
        int i;
        C5909 c5909 = null;
        while (true) {
            if (c4603 != null && (i = C10415.f35605[c4603.f16296.mo1803().ordinal()]) != 2) {
                switch (i) {
                    case 8:
                        C2732 c2732 = (C2732) c4603.f16296;
                        if (abstractC11242 != c2732.f10509) {
                            c4603 = c4603.f16297;
                        } else if (enumC18651 != EnumC18651.f60492) {
                            c2068 = new C2068(c2732, c5909);
                        } else {
                            if (!c2732.f10508.m22847(EnumC18651.f60543) && !c2732.f10508.m22847(EnumC18651.f60466) && !c2732.f10508.m22847(EnumC18651.f60495) && !c2732.f10508.m22847(EnumC18651.f60507)) {
                                C5909 c59010 = C23879.f77204;
                                c5909 = new C5909("compiler", "not.loop.label", abstractC11242);
                            }
                            c2068 = new C2068(C3128.m9442(c2732), c5909);
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (abstractC11242 != null) {
                            c4603 = c4603.f16297;
                        } else {
                            c2068 = new C2068(c4603.f16296, c5909);
                        }
                        break;
                    case 13:
                        if (abstractC11242 == null && enumC18651 == EnumC18651.f60474) {
                            c2068 = new C2068(c4603.f16296, null);
                        } else {
                            c4603 = c4603.f16297;
                        }
                        break;
                    case 14:
                        if (enumC18651 != EnumC18651.f60518) {
                            c5909 = enumC18651 == EnumC18651.f60474 ? C23879.f77319 : C23879.f77253;
                            c4603 = c4603.f16297;
                        } else {
                            c2068 = new C2068(c4603.f16296, null);
                        }
                        break;
                    case 15:
                    case 16:
                        break;
                    default:
                        c4603 = c4603.f16297;
                        break;
                }
                obj = c2068.f7665;
                if (obj != null) {
                    this.f22832.m48199(abstractC14728, (C5909) obj);
                }
                return (AbstractC8774) c2068.f7664;
            }
            if (abstractC11242 != null) {
                C5909 c59011 = C23879.f77204;
                c2068 = new C2068(null, new C5909("compiler", "undef.label", abstractC11242));
            } else if (c5909 != null) {
                c2068 = new C2068(null, c5909);
            } else {
                c2068 = enumC18651 == EnumC18651.f60492 ? new C2068(null, C23879.f77216) : new C2068(null, C23879.f77238);
            }
            obj = c2068.f7665;
            if (obj != null) {
                this.f22832.m48199(abstractC14728, (C5909) obj);
            }
            return (AbstractC8774) c2068.f7664;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        C23195 c23195;
        C4603 c4603 = this.f22814;
        C22990 c22990 = (C22990) c4603.f16299;
        C1116 c1116 = c22990.f74725;
        C20414 c20414 = this.f22832;
        if (c1116 == null) {
            c20414.m48199(c11200, C23879.f77270);
        } else if (c22990.f74717 != null) {
            c20414.m48199(c11200, C23879.f77199);
        } else if (!c22990.f74714 && !c22990.f74726 && (c23195 = c4603.f16294) != null && C3128.m9475(c23195)) {
            C23195 c23196 = this.f22814.f16294;
            c20414.m48199(c23196, C23879.m52622(C14707.f48090, c23196.f75263.f77453, C14707.f48041));
        } else {
            AbstractC5930 abstractC5930 = c11200.f37914;
            C23549 c23549 = this.f22831;
            if (abstractC5930 != null) {
                if (((C22990) this.f22814.f16299).f74725.f5036.m39001(EnumC6617.VOID)) {
                    InterfaceC18195 interfaceC18195 = ((C22990) this.f22814.f16299).f74725.f5037;
                    AbstractC5930 abstractC5931 = c11200.f37914;
                    abstractC5931.getClass();
                    interfaceC18195.mo2545(abstractC5931, c23549.m51910(C14707.f48084));
                }
                AbstractC5930 abstractC5932 = c11200.f37914;
                C4603 c4604 = this.f22814;
                m18299(abstractC5932, c4604, ((C22990) c4604.f16299).f74725);
            } else if (!((C22990) this.f22814.f16299).f74725.f5036.m39001(EnumC6617.VOID) && !((C22990) this.f22814.f16299).f74725.f5036.m39001(EnumC6617.NONE)) {
                C1116 c1117 = ((C22990) this.f22814.f16299).f74725;
                c1117.f5037.mo2545(c11200, c23549.m51910(C14707.m35236(c1117.f5036)));
            }
        }
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        AbstractC5930 abstractC5930 = c4539.f16146;
        C4603 c4603 = this.f22814;
        C3836 c3836 = this.f22806;
        boolean z = this.f22816;
        AbstractC16579 abstractC16579M18300 = m18300((AbstractC8774) abstractC5930, c4603, z ? AbstractC16579.f53219 : c3836.f14302);
        if (z) {
            AbstractC16579 abstractC16579 = c3836.f14302;
            C21017 c21017 = this.f22834;
            c21017.m47266(c4539, abstractC16579M18300, abstractC16579, c21017.f68418);
        }
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3941(C12986 c12986) {
        m18300((AbstractC8774) c12986.f43312, this.f22814, (AbstractC16579) this.f22806.f14263);
        AbstractC5930 abstractC5930 = c12986.f43313;
        if (abstractC5930 != null) {
            this.f22834.m47251(abstractC5930, m18299(abstractC5930, this.f22814, this.f22809));
        }
        this.f22800 = null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        AbstractC16579 abstractC16579;
        char c;
        AbstractC16579 abstractC16579M52432;
        C3836 c3836;
        C4603 c4603 = this.f22814;
        C22990 c22990 = (C22990) c4603.f16299;
        C4603 c4603M12747 = c4603.m12747(c15434, c22990.m50854(c22990.f74722));
        Object obj = c4603M12747.f16299;
        AbstractC11242 abstractC11242M9472 = C3128.m9472(c15434.f50296);
        C23942 c23942 = this.f22815;
        AbstractC11242 abstractC11242 = c23942.f77533;
        AbstractC11242 abstractC11243 = c23942.f77638;
        boolean z = abstractC11242M9472 == abstractC11242 || abstractC11242M9472 == abstractC11243;
        C19003 c19003 = new C19003();
        C21017 c21017 = this.f22834;
        if (z) {
            m18321(c15434, this.f22814.f16294, true);
            C22990 c22991 = (C22990) obj;
            c22991.f74710 = true;
            C21059 c21059M18310 = m18310(C21059.f68586, c15434.f50298, c4603M12747, c19003);
            C21825 c21825M43726 = c19003.m43726();
            C21825 c21825 = c15434.f50297;
            C21825 c21825M18311 = m18311(c21825, c4603M12747);
            c21017.m47304(c21825, c21825M18311);
            AbstractC16579 abstractC165710 = this.f22814.f16301.f30086.f77449;
            C20414 c20414 = this.f22832;
            C3836 c3837 = this.f22806;
            if (abstractC11242M9472 == abstractC11243) {
                AbstractC16579 abstractC165711 = c3837.f14275;
                C23800 c23800 = this.f22802;
                if (abstractC165710 == abstractC165711) {
                    AbstractC5930 abstractC5930 = c15434.f50296;
                    abstractC5930.getClass();
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(abstractC5930, new C5909("compiler", "no.superclass", abstractC165710));
                    abstractC16579M52432 = c23800.m52440(c3837.f14275);
                } else {
                    abstractC16579M52432 = c23800.m52432(abstractC165710);
                }
                c = 0;
            } else {
                c21059M18310 = c21059M18310;
                c21825M18311 = c21825M18311;
                c = 0;
                abstractC16579M52432 = abstractC165710;
            }
            if (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
                AbstractC16579 abstractC16579Mo1934 = abstractC16579M52432.mo1934();
                while (abstractC16579Mo1934 != null && abstractC16579Mo1934.m39001(EnumC6617.TYPEVAR)) {
                    abstractC16579Mo1934 = abstractC16579Mo1934.mo18112();
                }
                if (abstractC16579Mo1934.m39001(EnumC6617.CLASS)) {
                    if (c15434.f50296.m22847(EnumC18651.f60473)) {
                        AbstractC5930 abstractC5931 = ((C23570) c15434.f50296).f76357;
                        abstractC5931.getClass();
                        c21017.m47256(abstractC5931, m18300((AbstractC8774) abstractC5931, c4603M12747, abstractC16579Mo1934));
                    } else if (abstractC11242M9472 == abstractC11243) {
                        AbstractC5930 abstractC5932 = c15434.f50296;
                        abstractC5932.getClass();
                        this.f22822.m45526((InterfaceC12260) abstractC5932, c4603M12747, abstractC16579M52432, true);
                    }
                } else if (c15434.f50296.m22847(EnumC18651.f60473)) {
                    AbstractC5930 abstractC5933 = c15434.f50296;
                    abstractC5933.getClass();
                    AbstractC0618 abstractC0618 = abstractC16579M52432.f53222;
                    C5909 c59010 = C23879.f77204;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC0618;
                    c20414.m48199(abstractC5933, new C5909("compiler", "illegal.qual.not.icls", objArr));
                    m18300((AbstractC8774) ((C23570) c15434.f50296).f76357, c4603M12747, abstractC16579M52432);
                }
                if (abstractC16579M52432.f53222 == c3837.f14289) {
                    c21825M43726 = c21825M43726.m48597(c3837.f14232).m48597(c3837.f14220);
                }
                boolean z2 = c22991.f74723;
                c22991.f74723 = true;
                c22991.f74727 = null;
                AbstractC5930 abstractC5934 = c15434.f50296;
                abstractC5934.getClass();
                C21825 c21826 = c21825M18311;
                AbstractC23903 abstractC23903M45542 = this.f22822.m45542(abstractC5934, c4603M12747, abstractC16579M52432, c21825M43726, c21826);
                c22991.f74723 = z2;
                C3128.m9464(abstractC23903M45542, c15434.f50296);
                c3836 = c3837;
                m18302(c15434.f50296, abstractC16579M52432, abstractC23903M45542, c4603M12747, new C1116(this, c21059M18310, m18306(this.f22804.f5036, c21825M43726, c21826)));
            } else {
                c3836 = c3837;
                if (abstractC16579M52432.m39001(EnumC6617.ERROR) && c15434.f50296.m22847(EnumC18651.f60473)) {
                    m18300((AbstractC8774) ((C23570) c15434.f50296).f76357, c4603M12747, abstractC16579M52432);
                }
            }
            C4583 c4583 = c3836.f14293;
            c15434.f30190 = c4583;
            this.f22800 = c4583;
        } else {
            C21059 c21059 = C21059.f68595;
            C21059 c21059M18311 = m18310(c21059, c15434.f50298, c4603M12747, c19003);
            C21825 c21825M43727 = c19003.m43726();
            C21825 c21825M18312 = m18311(c15434.f50297, c4603M12747);
            AbstractC16579 abstractC16579M18306 = m18306(this.f22804.f5036, c21825M43727, c21825M18312);
            ((C22990) obj).f74727 = null;
            AbstractC16579 abstractC16579M18299 = m18299(c15434.f50296, c4603M12747, new C1116(this, c21059M18311, abstractC16579M18306, this.f22804.f5037));
            AbstractC16579 abstractC16579Mo16235 = abstractC16579M18299.mo16235();
            if (abstractC16579Mo16235.m39001(EnumC6617.WILDCARD)) {
                throw new AssertionError(abstractC16579M18299);
            }
            if (c15434.f50296.m22847(EnumC18651.f60473)) {
                abstractC16579 = ((C23570) c15434.f50296).f76357.f30190;
            } else {
                abstractC16579 = this.f22814.f16301.f30086.f77449;
            }
            AbstractC16579 abstractC16579M18309 = m18309(C3128.m9471(c15434.f50296), abstractC16579, abstractC11242M9472, c21825M43727, abstractC16579Mo16235);
            c21017.m47304(c15434.f50297, c21825M18312);
            this.f22800 = m18301(c15434, this.f22804.f5037.mo4574().m44586((AbstractC8774) c15434, abstractC16579M18309, true), c21059, this.f22804);
        }
        c21017.m47303(c15434.f50297, c4603M12747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18309(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, AbstractC16579 abstractC165710) {
        C23800 c23800 = this.f22802;
        C23942 c23942 = this.f22815;
        C3836 c3836 = this.f22806;
        if (abstractC23903 != null && abstractC23903.f77448 == c3836.f14275.f53222 && abstractC11242 == c23942.f77656 && c21825.isEmpty()) {
            return new C0309(abstractC165710.mo1934(), C21825.of((Object) new C0350(c23800.m52402(abstractC16579.mo5593()), EnumC15395.EXTENDS, c3836.f14239)), abstractC165710.f53222, abstractC165710.m39010());
        }
        return (abstractC23903 != null && abstractC23903.f77448 == c3836.f14258 && abstractC11242 == c23942.f77541 && c23800.m52434(abstractC16579)) ? abstractC16579 : abstractC165710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18321(C15434 c15434, C23195 c23195, boolean z) {
        if (c23195 != null && c23195.f75272 == this.f22815.f77632) {
            C21452 c21452 = c23195.f75268;
            if (((AbstractC14728) c21452.f69737.f70876).m22847(EnumC18651.f60549) && ((C10870) c21452.f69737.f70876).f36960 == c15434) {
                return true;
            }
        }
        if (z) {
            AbstractC11242 abstractC11242M9472 = C3128.m9472(c15434.f50296);
            C5909 c5909 = C23879.f77204;
            this.f22832.m48199(c15434, new C5909("compiler", "call.must.be.first.stmt.in.ctor", abstractC11242M9472));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18306(AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        C13757 c13757 = new C13757(c21825, abstractC16579, C21825.m48588(), this.f22806.f14240);
        return c21826 == null ? c13757 : new C10894(c13757, c21826);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0345  */
    /* JADX WARN: Code duplicated, block: B:104:0x0355  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:109:0x0372  */
    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0408  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a4  */
    /* JADX WARN: Not found block with instruction: 0x01af: MOVE (r6v3 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(final C8378 c8378) {
        AbstractC5930 abstractC5930;
        C2401 c2401;
        AbstractC5930 abstractC5931;
        AbstractC5930 abstractC5932;
        AbstractC5930 abstractC5930M14625;
        C21825 c21825;
        C23800 c23800;
        C21825 c21826;
        boolean z;
        C21825 c21827;
        C21825 c21828;
        boolean zM9473;
        C3836 c3836;
        C4603 c4603;
        C8753 c8753;
        C21017 c21017;
        AbstractC5930 abstractC5933;
        AbstractC16579 abstractC16579M47267;
        C4603 c4603M12747;
        C22990 c22990;
        boolean z2;
        AbstractC23903 abstractC23903M45542;
        EnumC11678 enumC11678;
        boolean z3;
        AbstractC23903 abstractC23903;
        AbstractC16579 abstractC16579;
        boolean z4;
        C23800 c23801;
        AbstractC16579 abstractC16579M18302;
        C19524 c19524Mo4574;
        AbstractC16579 abstractC165710;
        AbstractC16579 abstractC165711 = c8378.f30190;
        C21825 c21829 = c8378.f29096;
        C23800 c23802 = this.f22802;
        C5954 c5954M52440 = c23802.m52440(abstractC165711);
        C4603 c4604 = this.f22814;
        C22990 c22991 = (C22990) c4604.f16299;
        C4603 c4603M12748 = c4604.m12747(c8378, c22991.m50854(c22991.f74722));
        Object obj = c4603M12748.f16299;
        C8753 c8754 = c8378.f29098;
        AbstractC5930 abstractC5934 = c8378.f29095;
        EnumC18651 enumC18651 = EnumC18651.f60493;
        if (abstractC5934.m22847(enumC18651)) {
            abstractC5930 = ((C11596) abstractC5934).f38963;
            if (abstractC5930.m22847(EnumC18651.f60535)) {
                c2401 = (C2401) abstractC5930;
                abstractC5931 = c2401.f9659;
            } else {
                abstractC5931 = abstractC5930;
                c2401 = null;
            }
        } else if (abstractC5934.m22847(EnumC18651.f60535)) {
            c2401 = (C2401) abstractC5934;
            abstractC5931 = c2401.f9659;
        } else {
            abstractC5930 = abstractC5934;
            abstractC5931 = abstractC5930;
            c2401 = null;
        }
        AbstractC8774 abstractC8774 = c8378.f29093;
        C21017 c21018 = this.f22834;
        if (abstractC8774 != null) {
            AbstractC16579 abstractC16579M47256 = c21018.m47256(abstractC8774, m18299(abstractC8774, this.f22814, this.f22809));
            int i = abstractC5934.f30189;
            C5286 c5286 = this.f22794;
            c5286.f18294 = i;
            abstractC5930M14625 = c5286.m14625(c5286.m14634(abstractC16579M47256), ((C3107) abstractC5931).f11715);
            AbstractC6323 abstractC6323 = this.f22814.f16295.f34724;
            abstractC5931.getClass();
            abstractC6323.mo6627(abstractC5930M14625, C3128.m9435(abstractC5931, abstractC6323));
            if (abstractC5934.m22847(EnumC18651.f60535)) {
                C2401 c2402 = (C2401) abstractC5934;
                C21825 c218210 = c2402.f9658;
                if (c2402.f9659.m22847(enumC18651)) {
                    c5286.f18294 = c8378.f30189;
                    abstractC5930M14625 = c5286.m14651(abstractC5930M14625, ((C11596) abstractC5934).f38962);
                }
                c5286.f18294 = c8378.f30189;
                abstractC5930M14625 = c5286.m14582(abstractC5930M14625, c218210);
            } else if (abstractC5934.m22847(enumC18651)) {
                c5286.f18294 = c8378.f30189;
                abstractC5930M14625 = c5286.m14651(abstractC5930M14625, ((C11596) abstractC5934).f38962);
            }
            abstractC5932 = abstractC5930M14625;
        } else {
            abstractC5932 = abstractC5934;
            abstractC5930M14625 = abstractC5931;
        }
        try {
            C4603 c4605 = this.f22814;
            ((C22990) c4605.f16299).f74726 = true;
            AbstractC16579 abstractC16579M18270 = C3128.m9468(c4605.f16296) ? m18270(this.f22814, (C3107) abstractC5932) : m18326(abstractC5932, this.f22814, AbstractC16579.f53219);
            ((C22990) this.f22814.f16299).f74726 = false;
            AbstractC16579 abstractC16579M47260 = c21018.m47260(c8378, abstractC16579M18270);
            c21018.m47287((AbstractC8774) abstractC5932, c4603M12748, true);
            AbstractC5930 abstractC5935 = c8378.f29093;
            C20145 c20145 = this.f22822;
            AbstractC5930 abstractC5936 = abstractC5932;
            C20414 c20414 = this.f22832;
            if (abstractC5935 != null) {
                c8378.f29095.f30190 = abstractC16579M47260;
                C3128.m9464(C3128.m9471(abstractC5930M14625), abstractC5931);
                AbstractC16579 abstractC165712 = ((C3107) abstractC5931).f11716.f77449;
                abstractC5931.f30190 = abstractC165712;
                if (c2401 != null) {
                    c2401.f30190 = abstractC165712;
                }
                if (!abstractC16579M47260.mo1926()) {
                    if (c8754 != null && abstractC16579M47260.f53222.m52721()) {
                        AbstractC5930 abstractC5937 = c8378.f29093;
                        abstractC5937.getClass();
                        c20414.m48199(abstractC5937, C23879.f77221);
                    } else if (abstractC16579M47260.f53222.mo22992()) {
                        AbstractC5930 abstractC5938 = c8378.f29093;
                        abstractC5938.getClass();
                        AbstractC0618 abstractC0618 = abstractC16579M47260.f53222;
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(abstractC5938, new C5909("compiler", "qualified.new.of.static.class", abstractC0618));
                    }
                }
            } else if (!abstractC16579M47260.f53222.m52721() && abstractC16579M47260.mo1934().m39001(EnumC6617.CLASS)) {
                c20145.m45526((InterfaceC12260) c8378, this.f22814, abstractC16579M47260, false);
            }
            C19003 c19003 = new C19003();
            C21059 c21059 = C21059.f68595;
            C21059 c21059M18310 = m18310(c21059, c8378.f29099, c4603M12748, c19003);
            C21825 c21825M43726 = c19003.m43726();
            C21825 c21825M18311 = m18311(c21829, c4603M12748);
            c21018.m47304(c21829, c21825M18311);
            if (abstractC16579M47260.m39001(EnumC6617.CLASS) || abstractC16579M47260.m39001(EnumC6617.ERROR)) {
                if ((abstractC16579M47260.f53222.f77447 & 16384) != 0) {
                    if (this.f22814.f16296.m22847(EnumC18651.f60554)) {
                        C6656 c6656 = (C6656) this.f22814.f16296;
                        c21825 = c21829;
                        c23800 = c23802;
                        if ((c6656.f22476.f70567 & 16384) == 0 || c6656.f22481 != c8378) {
                        }
                    } else {
                        c21825 = c21829;
                        c23800 = c23802;
                    }
                    c20414.m48199(c8378, C23879.f77342);
                } else {
                    c21825 = c21829;
                    c23800 = c23802;
                }
                boolean z5 = C3128.m9473(c8378) && this.f22804.f5037.mo4575().f42954 == EnumC9729.SPECULATIVE;
                if (c8754 != null || z5 || (abstractC16579M47260.f53222.mo20276() & 1536) == 0) {
                    if (c8754 == null || !abstractC16579M47260.f53222.m52721()) {
                        c21826 = c21825;
                        z = false;
                    } else {
                        if (!c21825M43726.isEmpty()) {
                            AbstractC5930 abstractC5939 = (AbstractC5930) c8378.f29099.f70876;
                            abstractC5939.getClass();
                            c20414.m48199(abstractC5939, C23879.f77198);
                        }
                        c21826 = c21825;
                        if (!c21825M18311.isEmpty()) {
                            AbstractC5930 abstractC59310 = (AbstractC5930) c21826.f70876;
                            abstractC59310.getClass();
                            c20414.m48199(abstractC59310, C23879.f77346);
                        }
                        c21825M43726 = C21825.m48588();
                        c21825M18311 = C21825.m48588();
                    }
                    c21827 = c21825M43726;
                    c21828 = c21825M18311;
                    zM9473 = C3128.m9473(c8378);
                    c3836 = this.f22806;
                    if (zM9473) {
                        C0309 c0309 = new C0309(abstractC16579M47260.mo1934(), abstractC16579M47260.f53222.f77449.mo1938(), abstractC16579M47260.f53222, abstractC16579M47260.m39010());
                        C4603 c4603M12749 = c4603M12748.m12747(c8378, obj);
                        C22990 c22992 = (C22990) c4603M12749.f16299;
                        if (c8754 == null || c8378.m22005()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c22992.f74723 = z4;
                        c22992.f74727 = null;
                        c20145.getClass();
                        AbstractC0618 abstractC0619 = c0309.f53222;
                        C8649 c8649 = c20145.f65411;
                        c8753 = c8754;
                        c4603 = c4603M12748;
                        C12882 c12882 = new C12882(c20145, c20145.f65436.f77632, c0309, c21827, c21828, c8378);
                        C6095 c6095 = new C6095(c20145);
                        c6095.f20635 = c8649;
                        AbstractC23903 abstractC23903M45535 = c20145.m45535(c4603M12749, c8378, abstractC0619, c6095, c12882);
                        c8378.f29097 = abstractC23903M45535.mo10880();
                        C1116 c1116 = new C1116(this, c21059M18310, m18306(this.f22804.f5036, c21827, c21828), new C12531(this, this.f22804.f5037, c8378, abstractC16579M47260.f53222), EnumC1946.f7331);
                        c23801 = c23800;
                        c8378.f29100 = c23801.m52440(abstractC16579M47260);
                        abstractC16579M18302 = m18302(c8378, c0309, abstractC23903M45535, c4603M12749, c1116);
                        c8378.f29095.f30190 = c23801.m52440(abstractC16579M47260);
                        if (abstractC16579M18302.mo1926()) {
                            abstractC5933 = abstractC5936;
                        } else {
                            AbstractC5930 abstractC59311 = c8378.f29095;
                            AbstractC16579 abstractC16579Mo16235 = abstractC16579M18302.mo16235();
                            abstractC5933 = abstractC5936;
                            abstractC5933.f30190 = abstractC16579Mo16235;
                            abstractC59311.f30190 = abstractC16579Mo16235;
                            c8378.f29100 = c23801.m52407(abstractC16579M18302, c3836.f14293);
                        }
                        AbstractC5930 abstractC59312 = c8378.f29095;
                        c21017 = c21018;
                        abstractC16579M47267 = c21017.m47267((InterfaceC12260) abstractC59312, abstractC59312.f30190, true);
                    } else {
                        c4603 = c4603M12748;
                        c8753 = c8754;
                        c21017 = c21018;
                        abstractC5933 = abstractC5936;
                        if (!z) {
                            c4603M12747 = c4603.m12747(c8378, obj);
                            c22990 = (C22990) c4603M12747.f16299;
                            if (c8753 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c22990.f74723 = z2;
                            c22990.f74727 = null;
                            c4603 = c4603;
                            abstractC23903M45542 = this.f22822.m45542(c8378, c4603M12747, abstractC16579M47260, c21827, c21828);
                            c8378.f29097 = abstractC23903M45542;
                            if (c8753 == null) {
                                c8378.f29100 = m18302(c8378, abstractC16579M47260, abstractC23903M45542, c4603M12747, new C1116(this, c21059M18310, m18306(c3836.f14293, c21827, c21828), c21017.f68418, EnumC1946.f7331));
                                enumC11678 = c22990.f74727;
                                if (enumC11678 != null && enumC11678.m29179()) {
                                    if (c8378.f29100.mo1926() && c8378.f29094 == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C6171.m17176(z3);
                                }
                            }
                        }
                        abstractC16579M47267 = abstractC16579M47260;
                    }
                    if (c8753 != null) {
                        m18283(c8378, abstractC5933, abstractC16579M47267, c8753, c4603, c21827, c21828, c21059M18310);
                        return;
                    }
                    abstractC23903 = c8378.f29097;
                    if (abstractC23903 == null && abstractC23903.f77452 == EnumC10477.f35879) {
                        abstractC16579 = abstractC16579M47267;
                    }
                    this.f22800 = m18301(c8378, abstractC16579, c21059, this.f22804);
                    c19524Mo4574 = this.f22804.f5037.mo4574();
                    abstractC165710 = c8378.f29100;
                    if (abstractC165710 != null && abstractC165710.m39005(c19524Mo4574.f62771)) {
                        c19524Mo4574.m44595(C21825.of((Object) c8378.f29100), new InterfaceC18383() { // from class: l.֡֡ۤ
                            @Override // l.InterfaceC18383
                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final void mo969(C19524 c19524) {
                                C8378 c8379 = c8378;
                                c8379.f29100 = c19524.m44587(c8379.f29100);
                            }
                        });
                    }
                    c21017.m47303(c21826, c4603);
                }
                AbstractC0618 abstractC06110 = abstractC16579M47260.f53222;
                C5909 c59010 = C23879.f77204;
                c20414.m48199(c8378, new C5909("compiler", "abstract.cant.be.instantiated", abstractC06110));
                c21826 = c21825;
                z = true;
                c21827 = c21825M43726;
                c21828 = c21825M18311;
                zM9473 = C3128.m9473(c8378);
                c3836 = this.f22806;
                if (zM9473) {
                    C0309 c03010 = new C0309(abstractC16579M47260.mo1934(), abstractC16579M47260.f53222.f77449.mo1938(), abstractC16579M47260.f53222, abstractC16579M47260.m39010());
                    C4603 c4603M127410 = c4603M12748.m12747(c8378, obj);
                    C22990 c22993 = (C22990) c4603M127410.f16299;
                    if (c8754 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    c22993.f74723 = z4;
                    c22993.f74727 = null;
                    c20145.getClass();
                    AbstractC0618 abstractC06111 = c03010.f53222;
                    C8649 c86410 = c20145.f65411;
                    c8753 = c8754;
                    c4603 = c4603M12748;
                    C12882 c12883 = new C12882(c20145, c20145.f65436.f77632, c03010, c21827, c21828, c8378);
                    C6095 c6096 = new C6095(c20145);
                    c6096.f20635 = c86410;
                    AbstractC23903 abstractC23903M45536 = c20145.m45535(c4603M127410, c8378, abstractC06111, c6096, c12883);
                    c8378.f29097 = abstractC23903M45536.mo10880();
                    C1116 c1117 = new C1116(this, c21059M18310, m18306(this.f22804.f5036, c21827, c21828), new C12531(this, this.f22804.f5037, c8378, abstractC16579M47260.f53222), EnumC1946.f7331);
                    c23801 = c23800;
                    c8378.f29100 = c23801.m52440(abstractC16579M47260);
                    abstractC16579M18302 = m18302(c8378, c03010, abstractC23903M45536, c4603M127410, c1117);
                    c8378.f29095.f30190 = c23801.m52440(abstractC16579M47260);
                    if (abstractC16579M18302.mo1926()) {
                        AbstractC5930 abstractC59313 = c8378.f29095;
                        AbstractC16579 abstractC16579Mo16236 = abstractC16579M18302.mo16235();
                        abstractC5933 = abstractC5936;
                        abstractC5933.f30190 = abstractC16579Mo16236;
                        abstractC59313.f30190 = abstractC16579Mo16236;
                        c8378.f29100 = c23801.m52407(abstractC16579M18302, c3836.f14293);
                    } else {
                        abstractC5933 = abstractC5936;
                    }
                    AbstractC5930 abstractC59314 = c8378.f29095;
                    c21017 = c21018;
                    abstractC16579M47267 = c21017.m47267((InterfaceC12260) abstractC59314, abstractC59314.f30190, true);
                } else {
                    c4603 = c4603M12748;
                    c8753 = c8754;
                    c21017 = c21018;
                    abstractC5933 = abstractC5936;
                    if (!z) {
                        c4603M12747 = c4603.m12747(c8378, obj);
                        c22990 = (C22990) c4603M12747.f16299;
                        if (c8753 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c22990.f74723 = z2;
                        c22990.f74727 = null;
                        c4603 = c4603;
                        abstractC23903M45542 = this.f22822.m45542(c8378, c4603M12747, abstractC16579M47260, c21827, c21828);
                        c8378.f29097 = abstractC23903M45542;
                        if (c8753 == null) {
                            c8378.f29100 = m18302(c8378, abstractC16579M47260, abstractC23903M45542, c4603M12747, new C1116(this, c21059M18310, m18306(c3836.f14293, c21827, c21828), c21017.f68418, EnumC1946.f7331));
                            enumC11678 = c22990.f74727;
                            if (enumC11678 != null) {
                                if (c8378.f29100.mo1926()) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                C6171.m17176(z3);
                            }
                        }
                    }
                    abstractC16579M47267 = abstractC16579M47260;
                }
                if (c8753 != null) {
                    m18283(c8378, abstractC5933, abstractC16579M47267, c8753, c4603, c21827, c21828, c21059M18310);
                    return;
                }
                abstractC23903 = c8378.f29097;
                if (abstractC23903 == null) {
                }
                this.f22800 = m18301(c8378, abstractC16579, c21059, this.f22804);
                c19524Mo4574 = this.f22804.f5037.mo4574();
                abstractC165710 = c8378.f29100;
                if (abstractC165710 != null) {
                    c19524Mo4574.m44595(C21825.of((Object) c8378.f29100), new InterfaceC18383() { // from class: l.֡֡ۤ
                        @Override // l.InterfaceC18383
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final void mo969(C19524 c19524) {
                            C8378 c8379 = c8378;
                            c8379.f29100 = c19524.m44587(c8379.f29100);
                        }
                    });
                }
                c21017.m47303(c21826, c4603);
            }
            c21826 = c21829;
            c4603 = c4603M12748;
            c21017 = c21018;
            abstractC16579 = c5954M52440;
            this.f22800 = m18301(c8378, abstractC16579, c21059, this.f22804);
            c19524Mo4574 = this.f22804.f5037.mo4574();
            abstractC165710 = c8378.f29100;
            if (abstractC165710 != null) {
                c19524Mo4574.m44595(C21825.of((Object) c8378.f29100), new InterfaceC18383() { // from class: l.֡֡ۤ
                    @Override // l.InterfaceC18383
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo969(C19524 c19524) {
                        C8378 c8379 = c8378;
                        c8379.f29100 = c19524.m44587(c8379.f29100);
                    }
                });
            }
            c21017.m47303(c21826, c4603);
        } catch (Throwable th) {
            ((C22990) this.f22814.f16299).f74726 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18283(final C8378 c8378, final AbstractC5930 abstractC5930, AbstractC16579 abstractC16579, final C8753 c8753, final C4603 c4603, final C21825 c21825, final C21825 c21826, final C21059 c21059) {
        C4603 c4604;
        C23800 c23800;
        AbstractC16579 abstractC16579M52440;
        AbstractC16579 abstractC16579M52441;
        C21017 c21017;
        char c;
        C14377 c14377;
        AbstractC16579 abstractC165710;
        AbstractC16579 abstractC165711;
        C19524 c19524Mo4574 = this.f22804.f5037.mo4574();
        boolean zM9473 = C3128.m9473(c8378);
        C23800 c23801 = this.f22802;
        C21017 c21018 = this.f22834;
        if (zM9473 && (((abstractC165710 = c8378.f29100) != null && abstractC165710.m39005(c19524Mo4574.f62771)) || ((abstractC165711 = c8378.f29095.f30190) != null && abstractC165711.m39005(c19524Mo4574.f62771)))) {
            final C1116 c1116 = this.f22804;
            c19524Mo4574.m44595(C21825.of((Object) c8378.f29100, (Object) c8378.f29095.f30190), new InterfaceC18383() { // from class: l.᩹ܽۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19524) {
                    C6761.m18280(this.f73129, c8378, abstractC5930, c1116, c8753, c4603, c21825, c21826, c21059, c19524);
                }
            });
            c4604 = c4603;
            abstractC16579M52441 = abstractC16579;
            c23800 = c23801;
            c21017 = c21018;
        } else {
            if (zM9473 && abstractC16579.m39001(EnumC6617.CLASS)) {
                c21018.getClass();
                C19003 c19003 = new C19003();
                for (AbstractC16579 abstractC165712 : ((C0309) abstractC16579).mo1943()) {
                    if (!C21017.m47242(abstractC165712)) {
                        c19003.m43723(abstractC165712);
                    }
                }
                C21825 c21825M43726 = c19003.m43726();
                if (!abstractC16579.mo1926() && c21825M43726.m48595()) {
                    AbstractC0618 abstractC0618 = abstractC16579.f53222;
                    C14377 c14378 = C14707.f48054;
                    C14377 c14379 = new C14377("compiler", "diamond", abstractC0618);
                    AbstractC5930 abstractC5931 = c8378.f29095;
                    abstractC5931.getClass();
                    if (c21825M43726.m48596() <= 1) {
                        c = 0;
                        c14377 = new C14377("compiler", "diamond.invalid.arg", c21825M43726, c14379);
                    } else {
                        c = 0;
                        c14377 = new C14377("compiler", "diamond.invalid.args", c21825M43726, c14379);
                    }
                    C5909 c5909 = C23879.f77204;
                    Object[] objArr = new Object[2];
                    objArr[c] = c14379;
                    objArr[1] = c14377;
                    this.f22832.m48199(abstractC5931, new C5909("compiler", "cant.apply.diamond.1", objArr));
                }
                Iterator it = abstractC16579.mo1938().iterator();
                while (it.hasNext()) {
                    this.f22822.f65413.m20360(this.f22814, (AbstractC16579) it.next());
                }
            }
            if (abstractC16579.f53222.m52721() || (abstractC16579.mo1926() && !abstractC16579.mo16234().m39001(EnumC6617.NONE) && abstractC16579.mo16234().f53222.m52721())) {
                c8753.f30087 = C21825.of((Object) abstractC5930);
            } else {
                c8753.f30092 = abstractC5930;
            }
            if (this.f22804.f5037.mo4575().f42954 == EnumC9729.CHECK && m18322(abstractC16579)) {
                c4604 = c4603;
                ((C22990) c4604.f16299).f74719 = true;
            } else {
                c4604 = c4603;
            }
            m18298(c8753, c4604);
            C21825 c21825M48597 = (c8378.f29093 == null || abstractC16579.f53222.m52721()) ? c21825 : c21825.m48597(c8378.f29093.f30190);
            if (zM9473 && c21059.m47467(C21059.f68589)) {
                c21825M48597 = c21825M48597.m48592((Function) this.f22830.f20049);
            }
            C21825 c21827 = c21825M48597;
            if (abstractC16579.m39001(EnumC6617.ERROR)) {
                c23800 = c23801;
                abstractC16579M52440 = c23800.m52440(c8753.f30086.f77449);
            } else {
                c23800 = c23801;
                abstractC16579M52440 = c8753.f30086.f77449;
            }
            abstractC16579M52441 = abstractC16579M52440;
            AbstractC23903 abstractC23903M45542 = this.f22822.m45542(c8378, c4603, abstractC16579M52441, c21827, c21826);
            c8378.f29097 = abstractC23903M45542;
            C6171.m17176(!abstractC23903M45542.f77452.m26583());
            c8378.f29097 = abstractC23903M45542;
            c21017 = c21018;
            c8378.f29100 = m18302(c8378, abstractC16579M52441, abstractC23903M45542, c4603, new C1116(this, c21059, m18306(this.f22806.f14293, c21827, c21826), c21017.f68418, EnumC1946.f7331));
        }
        AbstractC23903 abstractC23903 = c8378.f29097;
        if (abstractC23903 == null || abstractC23903.f77452 != EnumC10477.f35879) {
            abstractC16579M52441 = c23800.m52440(c8378.f30190);
        }
        this.f22800 = m18301(c8378, abstractC16579M52441, C21059.f68595, this.f22804.mo4133(EnumC1946.f7329));
        c21017.m47303(c8378.f29096, c4604);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18280(C6761 c6761, C8378 c8378, AbstractC5930 abstractC5930, C1116 c1116, C8753 c8753, C4603 c4603, C21825 c21825, C21825 c21826, C21059 c21059, C19524 c19524) {
        c8378.f29100 = c19524.m44587(c8378.f29100);
        AbstractC5930 abstractC5931 = c8378.f29095;
        AbstractC16579 abstractC16579M44587 = c19524.m44587(abstractC5930.f30190);
        abstractC5930.f30190 = abstractC16579M44587;
        abstractC5931.f30190 = abstractC16579M44587;
        C1116 c1117 = c6761.f22804;
        try {
            c6761.f22804 = c1116;
            c6761.m18283(c8378, abstractC5930, abstractC5930.f30190, c8753, c4603, c21825, c21826, c21059);
        } finally {
            c6761.f22804 = c1117;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m18295(AbstractC5930 abstractC5930) {
        if (abstractC5930.mo1803() != EnumC18651.f60531) {
            AbstractC11242 abstractC11242M9472 = C3128.m9472(abstractC5930);
            C23942 c23942 = this.f22815;
            if (abstractC11242M9472 != c23942.f77533 && abstractC11242M9472 != c23942.f77638) {
                EnumC18651 enumC18651 = EnumC18651.f60548;
                int i = abstractC5930.f30189;
                C5286 c5286 = this.f22794;
                c5286.f18294 = i;
                C13007 c13007M14605 = c5286.m14605(enumC18651, abstractC5930);
                c13007M14605.f35957 = this.f22840.m26960(abstractC5930, enumC18651, abstractC5930.f30190);
                c13007M14605.f30190 = abstractC5930.f30190;
                return c13007M14605;
            }
        }
        return abstractC5930;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        AbstractC16579 abstractC16579M52440;
        AbstractC23903 abstractC23903;
        AbstractC16579 c8777;
        AbstractC16579 abstractC16579M18326;
        AbstractC16579 abstractC16579 = c18961.f30190;
        C23800 c23800 = this.f22802;
        C5954 c5954M52440 = c23800.m52440(abstractC16579);
        C4603 c4603 = this.f22814;
        C4603 c4603M12747 = c4603.m12747(c18961, c4603.f16299);
        AbstractC5930 abstractC5930 = c18961.f61402;
        C20414 c20414 = this.f22832;
        C3836 c3836 = this.f22806;
        if (abstractC5930 != null) {
            abstractC16579M18326 = m18326(abstractC5930, c4603M12747, AbstractC16579.f53219);
            this.f22834.m47287((AbstractC8774) c18961.f61402, c4603M12747, true);
            C21825 c21825 = c18961.f61398;
            c8777 = abstractC16579M18326;
            while (c21825.m48595()) {
                m18300((AbstractC8774) c21825.f70876, c4603M12747, (AbstractC16579) c3836.f14232);
                C8777 c8778 = new C8777(c8777, c3836.f14258);
                c21825 = c21825.f70877;
                c8777 = c8778;
            }
        } else {
            if (this.f22804.f5036.m39001(EnumC6617.ARRAY)) {
                abstractC16579M52440 = c23800.m52416(this.f22804.f5036);
            } else {
                if (!this.f22804.f5036.m39001(EnumC6617.ERROR) && ((abstractC23903 = ((C22990) this.f22814.f16299).f74718) == null || !abstractC23903.f77449.mo1926())) {
                    AbstractC16579 abstractC165710 = this.f22804.f5036;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c18961, new C5909("compiler", "illegal.initializer.for.type", abstractC165710));
                }
                abstractC16579M52440 = c23800.m52440(this.f22804.f5036);
            }
            AbstractC16579 abstractC165711 = abstractC16579M52440;
            c8777 = c5954M52440;
            abstractC16579M18326 = abstractC165711;
        }
        C21825 c21826 = c18961.f61399;
        if (c21826 != null) {
            C19003 c19003 = new C19003();
            while (c21826.m48595()) {
                c19003.m43723(m18300((AbstractC8774) c21826.f70876, c4603M12747, abstractC16579M18326));
                c21826 = c21826.f70877;
            }
            c19003.m43726();
            c8777 = new C8777(abstractC16579M18326, c3836.f14258);
        }
        if (!c23800.m52436(abstractC16579M18326)) {
            c20414.m48199(c18961, C23879.f77326);
        }
        this.f22800 = m18301(c18961, c8777, C21059.f68595, this.f22804);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c A[Catch: all -> 0x02e4, ۘ᩵ۤ -> 0x02e6, ᩻᩷ۤ -> 0x02ea, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0212 A[Catch: all -> 0x02e4, ۘ᩵ۤ -> 0x02e6, ᩻᩷ۤ -> 0x02ea, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:126:0x026f A[Catch: all -> 0x02e4, ۘ᩵ۤ -> 0x02e6, ᩻᩷ۤ -> 0x02ea, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02e4, ۘ᩵ۤ -> 0x02e6, ᩻᩷ۤ -> 0x02ea, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4 A[Catch: all -> 0x02e4, ۘ᩵ۤ -> 0x02e6, ᩻᩷ۤ -> 0x02ea, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0303  */
    /* JADX WARN: Code duplicated, block: B:167:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x034c A[DONT_GENERATE, PHI: r1 r15 r16
      0x034c: PHI (r1v34 l.ܽۤۤ) = (r1v33 l.ܽۤۤ), (r1v36 l.ܽۤۤ) binds: [B:170:0x034a, B:155:0x030e] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r15v6 l.᩺۫ۤ) = (r15v12 l.᩺۫ۤ), (r15v13 l.᩺۫ۤ) binds: [B:170:0x034a, B:155:0x030e] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r16v5 boolean) = (r16v3 boolean), (r16v6 boolean) binds: [B:170:0x034a, B:155:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: ۘ᩵ۤ -> 0x008c, all -> 0x02e4, ᩻᩷ۤ -> 0x02ee, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[Catch: ۘ᩵ۤ -> 0x008c, all -> 0x02e4, ᩻᩷ۤ -> 0x02ee, TRY_LEAVE, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: ۘ᩵ۤ -> 0x008c, all -> 0x02e4, ᩻᩷ۤ -> 0x02ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176 A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0186 A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf A[Catch: ۘ᩵ۤ -> 0x008c, ᩻᩷ۤ -> 0x015e, all -> 0x02e4, TRY_LEAVE, TryCatch #0 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) throws Throwable {
        boolean z;
        AbstractC23903 abstractC23903;
        boolean z2;
        Object obj;
        C23800 c23800;
        AbstractC16579 abstractC16579;
        C21825 c21825M9446;
        AbstractC16579 abstractC165710;
        AbstractC16579 abstractC165711;
        boolean z3;
        boolean zM39001;
        C23549 c23549;
        C20414 c20414;
        C1116 c1116M18293;
        C21452 c21452;
        C21059 c21059;
        boolean z4;
        AbstractC16579 abstractC16579M18301;
        C21825 c21825Mo33523;
        C21825 c21825;
        boolean z5;
        AbstractC16579 abstractC165712;
        C14422 c14422;
        AbstractC16579 abstractC165713;
        AbstractC16579 abstractC165714;
        C14422 c14423;
        AbstractC16579 abstractC165715;
        C14422 c14424;
        C5286 c5286 = this.f22794;
        C10955 c10955 = this.f22810;
        boolean zMo1926 = this.f22804.f5036.mo1926();
        C20414 c20415 = this.f22832;
        C22284 c22284 = this.f22797;
        if (zMo1926 || (this.f22804.f5036.m39001(EnumC6617.NONE) && this.f22804.f5036 != AbstractC16579.f53218)) {
            if (this.f22804.f5036.m39001(EnumC6617.NONE) && ((abstractC23903 = ((C22990) this.f22814.f16299).f74718) == null || !abstractC23903.f77449.mo1926())) {
                c20415.m48199(c22489, C23879.f77343);
            }
            this.f22804 = c22284;
            z = true;
        } else {
            z = false;
        }
        C4603 c4603M18294 = m18294(c22489, this.f22814);
        Object obj2 = c4603M18294.f16299;
        boolean z6 = this.f22804.f5037.mo4575().f42954 == EnumC9729.CHECK;
        C23800 c23801 = this.f22802;
        try {
            if (!z6) {
                if (c22489.f73411 == EnumC5555.EXPLICIT) {
                    m18329(c22489.f73410, c4603M18294);
                    c21825M9446 = C3128.m9446(c22489.f73410);
                } else {
                    c21825M9446 = null;
                }
                C13112 c13112M18296 = m18296(c22489, this.f22804, c21825M9446);
                abstractC165710 = c13112M18296.f43682;
                abstractC165711 = c13112M18296.f43681;
                if (abstractC165710.mo1926()) {
                    c22489.f30190 = abstractC165710;
                    this.f22800 = abstractC165710;
                    ((C22990) obj2).f74722.mo24225();
                    if (z6) {
                        AbstractC16579 abstractC165716 = this.f22800;
                        m18299(c22489, this.f22814, c22284);
                        if (abstractC165715 == c14424) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C1116 c1116 = this.f22804;
                z3 = z;
                c23800 = c23801;
                m18274(c4603M18294, c22489, c1116.f5036, abstractC165711, abstractC165710, c1116.f5037);
                zM39001 = abstractC165711.m39001(EnumC6617.FORALL);
                c23549 = this.f22831;
                if (zM39001) {
                    EnumC7654 enumC7654M38160 = C16121.m38160(abstractC165710.f53222);
                    AbstractC0618 abstractC0618 = abstractC165710.f53222;
                    C14377 c14377 = C14707.f48054;
                    this.f22804.f5037.mo2545(c22489, c23549.m51910(new C14377("compiler", "invalid.generic.lambda.target", abstractC165711, enumC7654M38160, abstractC0618)));
                    C5954 c5954M52440 = c23800.m52440(this.f22804.f5036);
                    c22489.f30190 = c5954M52440;
                    this.f22800 = c5954M52440;
                    ((C22990) obj2).f74722.mo24225();
                    if (z6) {
                        AbstractC16579 abstractC165717 = this.f22800;
                        m18299(c22489, this.f22814, c22284);
                        if (abstractC165714 == c14423) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (c22489.f73411 == EnumC5555.IMPLICIT) {
                    c21825Mo33523 = abstractC165711.mo33523();
                    c21825 = c22489.f73410;
                    z5 = false;
                    while (c21825.m48595()) {
                        if (c21825Mo33523.isEmpty()) {
                            z5 = true;
                        }
                        if (z5) {
                            abstractC165713 = this.f22806.f14261;
                        } else {
                            abstractC165713 = (AbstractC16579) c21825Mo33523.f70876;
                        }
                        C20414 c20416 = c20415;
                        if (((C6656) c21825.f70876).m18039()) {
                            m18277((C6656) c21825.f70876, abstractC165713);
                        }
                        ((C6656) c21825.f70876).f22475 = null;
                        if (c21825Mo33523.isEmpty()) {
                            c21825Mo33523 = c21825Mo33523.f70877;
                        }
                        c21825 = c21825.f70877;
                        z5 = z5;
                        c20415 = c20416;
                    }
                    c20414 = c20415;
                    m18329(c22489.f73410, c4603M18294);
                    if (z5) {
                        this.f22804.f5037.mo2545(c22489, c23549.m51910(C14707.f48114));
                        C5954 c5954M52441 = c23800.m52440(abstractC165710);
                        c22489.f30190 = c5954M52441;
                        this.f22800 = c5954M52441;
                        ((C22990) obj2).f74722.mo24225();
                        if (z6) {
                            AbstractC16579 abstractC165718 = this.f22800;
                            m18299(c22489, this.f22814, c22284);
                            if (abstractC165712 == c14422) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    c20414 = c20415;
                }
                c1116M18293 = m18293(c22489, abstractC165711, this.f22804);
                ((C22990) obj2).f74725 = c1116M18293;
                if (c22489.m49993() == EnumC9897.EXPRESSION) {
                    m18299(c22489.f73408, c4603M18294, c1116M18293);
                } else {
                    c21452 = (C21452) c22489.f73408;
                    if (c21452 == null) {
                        m18290(c4603M18294);
                        throw new C11120();
                    }
                    m18329(c21452.f69737, c4603M18294);
                }
                c21059 = C21059.f68595;
                this.f22800 = m18301(c22489, abstractC165710, c21059, this.f22804);
                if (this.f22804.f5037.mo4575().f42954 == EnumC9729.SPECULATIVE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f22838.m19955();
                new C17469(this).mo7248(c22489.f73408);
                c10955.m27509(this.f22814, c22489, c5286, z4);
                c22489.f30190 = abstractC165710;
                m18319(c22489, abstractC165711, this.f22804.f5037);
                if (!z4) {
                    if (this.f22804.f5037.mo4574().m44601(abstractC165711.mo33524())) {
                        C21825 c21825Mo33524 = abstractC165711.mo33524();
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(c22489, new C5909("compiler", "incompatible.thrown.types.in.mref", c21825Mo33524));
                    }
                    m18273(c22489, c4603M18294, this.f22804.f5037.mo4574(), C21825.m48586((Object[]) new AbstractC16579[]{abstractC165711, abstractC165710}));
                }
                if (z3) {
                    abstractC16579M18301 = c23800.m52440(this.f22804.f5036);
                    c22489.f30190 = abstractC16579M18301;
                } else {
                    abstractC16579M18301 = m18301(c22489, abstractC165710, c21059, this.f22804);
                }
                this.f22800 = abstractC16579M18301;
                ((C22990) obj2).f74722.mo24225();
            }
            try {
                try {
                    try {
                        if (m18322(this.f22804.f5036)) {
                            ((C22990) obj2).f74719 = true;
                            ((C22990) obj2).f74712 = true;
                        }
                        if (c22489.f73411 == EnumC5555.EXPLICIT) {
                            m18329(c22489.f73410, c4603M18294);
                            c21825M9446 = C3128.m9446(c22489.f73410);
                        } else {
                            c21825M9446 = null;
                        }
                        C13112 c13112M18297 = m18296(c22489, this.f22804, c21825M9446);
                        abstractC165710 = c13112M18297.f43682;
                        abstractC165711 = c13112M18297.f43681;
                        if (abstractC165710.mo1926()) {
                            c22489.f30190 = abstractC165710;
                            this.f22800 = abstractC165710;
                            ((C22990) obj2).f74722.mo24225();
                            if (z6) {
                                AbstractC16579 abstractC165719 = this.f22800;
                                try {
                                    m18299(c22489, this.f22814, c22284);
                                    if (abstractC165715 == c14424) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    if (this.f22800 == AbstractC16579.f53218) {
                                        this.f22800 = abstractC165719;
                                    }
                                }
                            }
                            return;
                        }
                        C1116 c1117 = this.f22804;
                        z3 = z;
                        c23800 = c23801;
                        try {
                            m18274(c4603M18294, c22489, c1117.f5036, abstractC165711, abstractC165710, c1117.f5037);
                            zM39001 = abstractC165711.m39001(EnumC6617.FORALL);
                            c23549 = this.f22831;
                            if (zM39001) {
                                EnumC7654 enumC7654M38161 = C16121.m38160(abstractC165710.f53222);
                                AbstractC0618 abstractC0619 = abstractC165710.f53222;
                                C14377 c14378 = C14707.f48054;
                                this.f22804.f5037.mo2545(c22489, c23549.m51910(new C14377("compiler", "invalid.generic.lambda.target", abstractC165711, enumC7654M38161, abstractC0619)));
                                C5954 c5954M52442 = c23800.m52440(this.f22804.f5036);
                                c22489.f30190 = c5954M52442;
                                this.f22800 = c5954M52442;
                                ((C22990) obj2).f74722.mo24225();
                                if (z6) {
                                    AbstractC16579 abstractC1657110 = this.f22800;
                                    try {
                                        m18299(c22489, this.f22814, c22284);
                                        if (abstractC165714 == c14423) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    } finally {
                                        if (this.f22800 == AbstractC16579.f53218) {
                                            this.f22800 = abstractC1657110;
                                        }
                                    }
                                }
                                return;
                            }
                            if (c22489.f73411 == EnumC5555.IMPLICIT) {
                                c21825Mo33523 = abstractC165711.mo33523();
                                c21825 = c22489.f73410;
                                z5 = false;
                                while (c21825.m48595()) {
                                    if (c21825Mo33523.isEmpty()) {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        abstractC165713 = this.f22806.f14261;
                                    } else {
                                        abstractC165713 = (AbstractC16579) c21825Mo33523.f70876;
                                    }
                                    C20414 c20417 = c20415;
                                    if (((C6656) c21825.f70876).m18039()) {
                                        m18277((C6656) c21825.f70876, abstractC165713);
                                    }
                                    ((C6656) c21825.f70876).f22475 = null;
                                    if (c21825Mo33523.isEmpty()) {
                                        c21825Mo33523 = c21825Mo33523.f70877;
                                    }
                                    c21825 = c21825.f70877;
                                    z5 = z5;
                                    c20415 = c20417;
                                }
                                c20414 = c20415;
                                m18329(c22489.f73410, c4603M18294);
                                if (z5) {
                                    this.f22804.f5037.mo2545(c22489, c23549.m51910(C14707.f48114));
                                    C5954 c5954M52443 = c23800.m52440(abstractC165710);
                                    c22489.f30190 = c5954M52443;
                                    this.f22800 = c5954M52443;
                                    ((C22990) obj2).f74722.mo24225();
                                    if (z6) {
                                        AbstractC16579 abstractC1657111 = this.f22800;
                                        try {
                                            m18299(c22489, this.f22814, c22284);
                                            if (abstractC165712 == c14422) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        } finally {
                                            if (this.f22800 == AbstractC16579.f53218) {
                                                this.f22800 = abstractC1657111;
                                            }
                                        }
                                    }
                                    return;
                                }
                            } else {
                                c20414 = c20415;
                            }
                            try {
                                c1116M18293 = m18293(c22489, abstractC165711, this.f22804);
                                ((C22990) obj2).f74725 = c1116M18293;
                                if (c22489.m49993() == EnumC9897.EXPRESSION) {
                                    m18299(c22489.f73408, c4603M18294, c1116M18293);
                                } else {
                                    c21452 = (C21452) c22489.f73408;
                                    if (c21452 == null && this.f22804.f5037.mo4575().f42954 == EnumC9729.CHECK) {
                                        m18290(c4603M18294);
                                        throw new C11120();
                                    }
                                    m18329(c21452.f69737, c4603M18294);
                                }
                                c21059 = C21059.f68595;
                                this.f22800 = m18301(c22489, abstractC165710, c21059, this.f22804);
                                if (this.f22804.f5037.mo4575().f42954 == EnumC9729.SPECULATIVE) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f22838.m19955();
                                new C17469(this).mo7248(c22489.f73408);
                                c10955.m27509(this.f22814, c22489, c5286, z4);
                                c22489.f30190 = abstractC165710;
                                m18319(c22489, abstractC165711, this.f22804.f5037);
                                if (!z4) {
                                    if (this.f22804.f5037.mo4574().m44601(abstractC165711.mo33524()) && !m18323(c10955.m27507(this.f22814, c22489, c5286), abstractC165711.mo33524(), this.f22804.f5037.mo4574())) {
                                        C21825 c21825Mo33525 = abstractC165711.mo33524();
                                        C5909 c59010 = C23879.f77204;
                                        c20414.m48199(c22489, new C5909("compiler", "incompatible.thrown.types.in.mref", c21825Mo33525));
                                    }
                                    m18273(c22489, c4603M18294, this.f22804.f5037.mo4574(), C21825.m48586((Object[]) new AbstractC16579[]{abstractC165711, abstractC165710}));
                                }
                                if (z3) {
                                    abstractC16579M18301 = c23800.m52440(this.f22804.f5036);
                                    c22489.f30190 = abstractC16579M18301;
                                } else {
                                    abstractC16579M18301 = m18301(c22489, abstractC165710, c21059, this.f22804);
                                }
                                this.f22800 = abstractC16579M18301;
                                ((C22990) obj2).f74722.mo24225();
                            } catch (C4146 e) {
                                e = e;
                                z6 = false;
                                this.f22834.m47261(c22489, e);
                                C22990 c22990 = (C22990) obj2;
                                c22990.f74722.mo24225();
                                obj2 = c22990;
                                if (z6) {
                                    abstractC16579 = this.f22800;
                                    try {
                                        m18299(c22489, this.f22814, c22284);
                                    } finally {
                                        if (this.f22800 == AbstractC16579.f53218) {
                                            this.f22800 = abstractC16579;
                                        }
                                    }
                                }
                            } catch (C23945 e2) {
                                e = e2;
                                z6 = false;
                                this.f22804.f5037.mo2545(c22489, e.m52780());
                                C5954 c5954M52444 = c23800.m52440(this.f22804.f5036);
                                c22489.f30190 = c5954M52444;
                                this.f22800 = c5954M52444;
                                C22990 c22991 = (C22990) obj2;
                                c22991.f74722.mo24225();
                                obj2 = c22991;
                                if (z6) {
                                    abstractC16579 = this.f22800;
                                    try {
                                        m18299(c22489, this.f22814, c22284);
                                    } finally {
                                        if (this.f22800 == AbstractC16579.f53218) {
                                            this.f22800 = abstractC16579;
                                        }
                                    }
                                }
                            }
                        } catch (C23945 e3) {
                            e = e3;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = false;
                            obj = obj2;
                            ((C22990) obj).f74722.mo24225();
                            if (z2) {
                                AbstractC16579 abstractC165720 = this.f22800;
                                try {
                                    m18299(c22489, this.f22814, c22284);
                                } finally {
                                    if (this.f22800 == AbstractC16579.f53218) {
                                        this.f22800 = abstractC165720;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                } catch (C23945 e4) {
                    e = e4;
                    c23800 = c23801;
                    this.f22804.f5037.mo2545(c22489, e.m52780());
                    C5954 c5954M52445 = c23800.m52440(this.f22804.f5036);
                    c22489.f30190 = c5954M52445;
                    this.f22800 = c5954M52445;
                    C22990 c22992 = (C22990) obj2;
                    c22992.f74722.mo24225();
                    obj2 = c22992;
                    if (z6) {
                        abstractC16579 = this.f22800;
                        m18299(c22489, this.f22814, c22284);
                    }
                }
            } catch (C4146 e5) {
                e = e5;
                this.f22834.m47261(c22489, e);
                C22990 c22993 = (C22990) obj2;
                c22993.f74722.mo24225();
                obj2 = c22993;
                if (z6) {
                    abstractC16579 = this.f22800;
                    m18299(c22489, this.f22814, c22284);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = z6;
            obj = obj2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13112 m18296(AbstractC16844 abstractC16844, C1116 c1116, C21825 c21825) {
        AbstractC16579 c13757;
        AbstractC16579 abstractC16579;
        AbstractC16579 abstractC165710 = c1116.f5036;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        AbstractC16579 abstractC16579M52440 = AbstractC16579.f53218;
        C23800 c23800 = this.f22802;
        if (abstractC165710 != abstractC16579M52440) {
            C4748 c4748 = this.f22837;
            c4748.getClass();
            AbstractC16579 abstractC16579M32581 = (AbstractC16579) abstractC165710.mo1928(c4748, abstractC16844);
            abstractC16579M32581.getClass();
            boolean z = abstractC16579M32581 instanceof C23594;
            C13174 c13174 = this.f22826;
            if (z) {
                C19003 c19003 = new C19003();
                for (AbstractC16579 abstractC16579M32582 : ((C23594) abstractC16579M32581).m52021()) {
                    if (c21825 != null) {
                        try {
                            abstractC16579M32582 = c13174.m32581(abstractC16844, abstractC16579M32582, c21825, interfaceC18195);
                        } catch (C23945 unused) {
                        }
                    }
                    c19003.m43723(c23800.m52438(abstractC16579M32582));
                }
                abstractC16579M52440 = c23800.m52442(c19003.m43726());
                abstractC16579M52440.f53222.f77447 |= 512;
                c13757 = c23800.m52431(abstractC16579M52440);
            } else {
                if (c21825 != null) {
                    abstractC16579M32581 = c13174.m32581(abstractC16844, abstractC16579M32581, c21825, interfaceC18195);
                }
                abstractC16579M52440 = c23800.m52438(abstractC16579M32581);
                c13757 = c23800.m52431(abstractC16579M52440);
            }
        } else {
            int i = C10415.f35605[abstractC16844.mo1803().ordinal()];
            C3836 c3836 = this.f22806;
            if (i == 2) {
                C21825 c21825M48588 = C21825.m48588();
                Iterator it = ((C22489) abstractC16844).f73410.iterator();
                while (it.hasNext()) {
                    AbstractC5930 abstractC5930 = ((C6656) it.next()).f22477;
                    c21825M48588 = (abstractC5930 == null || (abstractC16579 = abstractC5930.f30190) == null) ? c21825M48588.m48591(c3836.f14261) : c21825M48588.m48591(abstractC16579);
                }
                c13757 = new C13757(c21825M48588, AbstractC16579.f53218, C21825.of((Object) c3836.f14302), c3836.f14240);
            } else {
                if (i != 3) {
                    C6171.m17174("Cannot get here!");
                    throw null;
                }
                c13757 = new C13757(C21825.m48588(), abstractC16579M52440, C21825.of((Object) c3836.f14302), c3836.f14240);
            }
        }
        if (abstractC16844.m22847(EnumC18651.f60511) && c13757.m39001(EnumC6617.FORALL)) {
            EnumC7654 enumC7654M38160 = C16121.m38160(abstractC16579M52440.f53222);
            AbstractC0618 abstractC0618 = abstractC16579M52440.f53222;
            C14377 c14377 = C14707.f48054;
            interfaceC18195.mo2545(abstractC16844, this.f22831.m51910(new C14377("compiler", "invalid.generic.lambda.target", c13757, enumC7654M38160, abstractC0618)));
            abstractC16579M52440 = c23800.m52440(this.f22804.f5036);
        }
        C13112 c13112 = new C13112();
        c13112.f43682 = abstractC16579M52440;
        c13112.f43681 = c13757;
        return c13112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m18273(final AbstractC1696 abstractC1696, final C4603 c4603, C19524 c19524, final C21825 c21825) {
        if (c19524.m44601(c21825)) {
            c19524.m44595(c21825, new InterfaceC18383() { // from class: l.ۢ֡ۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19525) {
                    this.f31380.m18273(abstractC1696, c4603, c19525, c19525.m44590(c21825));
                }
            });
            return;
        }
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            this.f22822.f65413.m20360(c4603, (AbstractC16579) it.next());
        }
    }

    public C6761(C12343 c12343) {
        c12343.m30659(f22792, this);
        this.f22815 = C23942.m52776(c12343);
        this.f22832 = C20414.m46161(c12343);
        this.f22806 = C3836.m11131(c12343);
        this.f22822 = C20145.m45505(c12343);
        this.f22840 = C10727.m26956(c12343);
        C21017 c21017M47211 = C21017.m47211(c12343);
        this.f22834 = c21017M47211;
        this.f22810 = C10955.m27495(c12343);
        this.f22828 = C11619.m28951(c12343);
        if (((C13609) c12343.m30656(C13609.f44889)) == null) {
            new C13609(c12343);
        }
        this.f22794 = C5286.m14576(c12343);
        this.f22812 = C9399.m24138(c12343);
        this.f22826 = C13174.m32565(c12343);
        this.f22819 = C18279.m42467(c12343);
        C5870 c5870M16083 = C5870.m16083(c12343);
        this.f22830 = c5870M16083;
        this.f22824 = C16784.m39433(c12343);
        EnumC14128.m34159(c12343);
        this.f22802 = C23800.m52336(c12343);
        C2008 c2008M6467 = C2008.m6467(c12343);
        this.f22823 = c2008M6467;
        this.f22831 = C23549.m51906(c12343);
        this.f22801 = C17573.m40852(c12343);
        this.f22796 = C5206.m14386(c12343);
        this.f22811 = C2714.m8268(c12343);
        this.f22820 = C11492.m28677(c12343);
        AbstractC2380.m7237(c12343);
        this.f22808 = C8528.m22273(c12343);
        C4562 c4562 = (C4562) c12343.m30656(C4562.f16201);
        this.f22818 = c4562 == null ? new C4562(c12343) : c4562;
        C7467 c7467 = (C7467) c12343.m30656(C7467.f24867);
        this.f22838 = c7467 == null ? new C7467(c12343) : c7467;
        C14770 c14770M35395 = C14770.m35395(c12343);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f22816 = EnumC14026.f46115.m33945(enumC11909M29706);
        this.f22795 = EnumC14026.f46100.m33945(enumC11909M29706);
        EnumC14026.f46098.m33945(enumC11909M29706);
        this.f22803 = EnumC14026.f46107.m33945(enumC11909M29706);
        this.f22836 = EnumC14026.f46124.m33945(enumC11909M29706);
        this.f22805 = EnumC14026.f46104.m33945(enumC11909M29706);
        this.f22798 = EnumC14026.f46103.m33945(enumC11909M29706);
        this.f22821 = (c2008M6467.m6473() || !c2008M6467.m6478(EnumC14026.f46127)) && EnumC14026.f46127.m33945(enumC11909M29706);
        this.f22817 = enumC11909M29706.f39974;
        this.f22825 = c14770M35395.m35407("useBeforeDeclarationWarning");
        C21059 c21059 = C21059.f68594;
        C14422 c14422 = AbstractC16579.f53219;
        this.f22799 = new C1116(this, c21059, c14422);
        this.f22835 = new C1116(this, C21059.f68590, c14422);
        this.f22809 = new C1116(this, C21059.f68595, c14422);
        this.f22807 = new C11701(this, c21017M47211.f68418);
        this.f22839 = new C1116(this, C21059.f68585, c14422);
        EnumC1946 enumC1946 = EnumC1946.f7332;
        this.f22797 = new C22284(this, c5870M16083.f20035, AbstractC16579.f53218);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1116 m18293(C22489 c22489, AbstractC16579 abstractC16579, C1116 c1116) {
        InterfaceC18195 c3357;
        if (c22489.m49993() == EnumC9897.EXPRESSION) {
            c3357 = new C9709(this, (AbstractC5930) c22489.f73408, c1116.f5037);
        } else {
            c3357 = new C3357(this, c1116.f5037);
        }
        if (abstractC16579.mo16235() == AbstractC16579.f53218) {
            return this.f22797;
        }
        return new C1116(this, C21059.f68595, abstractC16579.mo16235(), c3357);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18319(C22489 c22489, AbstractC16579 abstractC16579, InterfaceC18195 interfaceC18195) {
        AbstractC16579 abstractC16579M44602 = interfaceC18195.mo4574().m44602(abstractC16579.mo16235());
        EnumC9897 enumC9897M49993 = c22489.m49993();
        EnumC9897 enumC9897 = EnumC9897.STATEMENT;
        C23549 c23549 = this.f22831;
        if (enumC9897M49993 == enumC9897 && c22489.f73409 && !abstractC16579M44602.m39001(EnumC6617.VOID) && abstractC16579M44602 != AbstractC16579.f53218) {
            interfaceC18195.mo2545(c22489, c23549.m51910(new C14377("compiler", "incompatible.ret.type.in.lambda", C14707.m35236(abstractC16579M44602))));
        }
        if (this.f22802.m52401(interfaceC18195.mo4574().m44604(abstractC16579.mo33523()), C3128.m9446(c22489.f73410))) {
            return;
        }
        interfaceC18195.mo2545(c22489, c23549.m51910(C14707.f48114));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18258 m18327(C22492 c22492) {
        return (C18258) this.f22829.remove(c22492);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m18294(C22489 c22489, C4603 c4603) {
        C4603 c4603M12747;
        Object obj = c4603.f16299;
        C22990 c22990 = (C22990) obj;
        AbstractC9462 abstractC9462 = c22990.f74722;
        AbstractC23903 abstractC23903 = abstractC9462.f11719;
        if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 == EnumC10477.f35865) {
            C22492 c22492M52720 = abstractC23903.m52720();
            C22990 c22991 = (C22990) obj;
            AbstractC23903 abstractC23904 = c22991.f74722.f11719;
            long jMo20276 = abstractC23903.mo20276() & 8;
            C23942 c23942 = this.f22815;
            if (jMo20276 == 0) {
                Iterator it = c22492M52720.f73417.m9327(c23942.f77632).iterator();
                if (it.hasNext()) {
                    abstractC23904 = (AbstractC23903) it.next();
                }
            } else {
                HashMap map = this.f22829;
                C18258 c18258 = (C18258) map.get(c22492M52720);
                if (c18258 == null) {
                    C21825 c21825M48588 = C21825.m48588();
                    C3836 c3836 = this.f22806;
                    c18258 = new C18258(4106L, c23942.f77608, new C13757(c21825M48588, c3836.f14293, C21825.m48588(), c3836.f14240), c22492M52720);
                    c18258.f58259 = C21825.m48588();
                    map.put(c22492M52720, c18258);
                }
                abstractC23904 = c18258;
            }
            c4603M12747 = c4603.m12747(c22489, c22991.m50854(c22991.f74722.mo3801(abstractC23904)));
        } else {
            c4603M12747 = c4603.m12747(c22489, c22990.m50854(abstractC9462.mo3805(abstractC23903)));
        }
        C22990 c22992 = (C22990) c4603M12747.f16299;
        c22992.f74717 = null;
        c22992.f74714 = true;
        return c4603M12747;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x031f A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x035d A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x036a A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0382 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x038e A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:157:0x0424  */
    /* JADX WARN: Code duplicated, block: B:158:0x0426  */
    /* JADX WARN: Code duplicated, block: B:161:0x0439 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[Catch: ᩻᩷ۤ -> 0x0472, TryCatch #5 {᩻᩷ۤ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:193:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8 A[Catch: ᩻᩷ۤ -> 0x0260, TRY_LEAVE, TryCatch #3 {᩻᩷ۤ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:189:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0 A[Catch: ᩻᩷ۤ -> 0x0260, TryCatch #3 {᩻᩷ۤ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:189:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0209 A[Catch: ᩻᩷ۤ -> 0x0260, TryCatch #3 {᩻᩷ۤ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:189:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0234 A[Catch: ᩻᩷ۤ -> 0x025b, TryCatch #1 {᩻᩷ۤ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:187:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x023a A[Catch: ᩻᩷ۤ -> 0x025b, TryCatch #1 {᩻᩷ۤ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:187:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0243 A[Catch: ᩻᩷ۤ -> 0x025b, TryCatch #1 {᩻᩷ۤ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:187:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024b A[Catch: ᩻᩷ۤ -> 0x025b, TRY_LEAVE, TryCatch #1 {᩻᩷ۤ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:187:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0273 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0284 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0289  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9 A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ae A[Catch: ᩻᩷ۤ -> 0x045c, TryCatch #2 {᩻᩷ۤ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:188:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [l.ۡۡ۟, l.۫۟۟] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.᩻ܺۤ] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.ᩳܿۤ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) throws Throwable {
        AbstractC23903 abstractC23903;
        ?? r14;
        ?? r12;
        AbstractC16579 abstractC16579M52440;
        char c;
        AbstractC23903 abstractC23903M9471;
        boolean z;
        C21825 c21825M48588;
        C21825 c21825;
        EnumC9729 enumC9729;
        EnumC9729 enumC97210;
        boolean z2;
        AbstractC16579 abstractC16579;
        AbstractC16579 abstractC165710;
        AbstractC16579 abstractC165711;
        EnumC13901 enumC13901;
        C21825 c21825Mo33523;
        AbstractC10766 c0450;
        C21825 c21825M44597;
        EnumC13901 enumC13902;
        C6966 c6967;
        AbstractC23903 abstractC23904;
        AbstractC22967 abstractC22967;
        EnumC10477 enumC10477;
        AbstractC23903 abstractC23903Mo10880;
        EnumC13901 enumC13903;
        AbstractC16579 abstractC16579Mo16235;
        C21825 c21826;
        C1116 c1116Mo4135;
        AbstractC22967 abstractC22968;
        AbstractC16579 abstractC16579M18302;
        AbstractC16579 abstractC16579M52407;
        boolean z3;
        C23942 c23942;
        C21017 c21017;
        AbstractC16579 abstractC16579Mo1934;
        boolean z4;
        C11948 c11948Mo8964;
        AbstractC16493 c5909;
        C11948 c11948M51909;
        AbstractC16579 abstractC165712;
        C23942 c23943 = this.f22815;
        C20145 c20145 = this.f22822;
        boolean zMo1926 = this.f22804.f5036.mo1926();
        C20414 c20414 = this.f22832;
        C23800 c23800 = this.f22802;
        if (zMo1926 || (this.f22804.f5036.m39001(EnumC6617.NONE) && this.f22804.f5036 != AbstractC16579.f53218)) {
            if (this.f22804.f5036.m39001(EnumC6617.NONE) && ((abstractC23903 = ((C22990) this.f22814.f16299).f74718) == null || !abstractC23903.f77449.mo1926())) {
                c20414.m48199(c6966, C23879.f77179);
            }
            C5954 c5954M52440 = c23800.m52440(this.f22804.f5036);
            c6966.f30190 = c5954M52440;
            this.f22800 = c5954M52440;
            return;
        }
        C4603 c4603 = this.f22814;
        C4603 c4603M12747 = c4603.m12747(c6966, c4603.f16299);
        try {
            AbstractC5930 abstractC5930 = c6966.f23408;
            C21825 c21827 = c6966.f23411;
            EnumC13901 enumC13904 = c6966.f23414;
            AbstractC16579 abstractC16579M18299 = m18299(abstractC5930, this.f22814, m18325(c6966));
            EnumC13901 enumC13905 = EnumC13901.NEW;
            C21017 c21018 = this.f22834;
            if (enumC13904 == enumC13905) {
                abstractC16579M18299 = c21018.m47252(c6966.f23408, abstractC16579M18299);
                if (!abstractC16579M18299.mo1926() && abstractC16579M18299.mo1936() && c21827 != null) {
                    AbstractC5930 abstractC5931 = c6966.f23408;
                    abstractC5931.getClass();
                    EnumC7654 enumC7654M38159 = C16121.m38159(enumC13904);
                    C5909 c59010 = C23879.f77204;
                    enumC13905 = enumC13905;
                    enumC13904 = enumC13904;
                    c20414.m48199(abstractC5931, new C5909("compiler", "invalid.mref", enumC7654M38159, C14707.f48061));
                    abstractC16579M52440 = c23800.m52440(abstractC16579M18299);
                    c = 1;
                }
                if (abstractC16579M52440.mo1926()) {
                    c6966.f30190 = abstractC16579M52440;
                    this.f22800 = abstractC16579M52440;
                    return;
                }
                if (C3128.m9451(c6966.f23408, c23943)) {
                    c21018.m47287((AbstractC8774) c6966.f23408, this.f22814, false);
                } else {
                    abstractC23903M9471 = C3128.m9471(c6966.f23408);
                    C22990 c22990 = (C22990) c4603M12747.f16299;
                    if (abstractC23903M9471 == null && abstractC23903M9471.f77453 == c23943.f77638) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c22990.f74723 = z;
                }
                c21825M48588 = C21825.m48588();
                if (c21827 != null) {
                    c21825M48588 = m18311(c21827, c4603M12747);
                    c21018.m47304(c21827, c21825M48588);
                }
                c21825 = c21825M48588;
                enumC9729 = this.f22804.f5037.mo4575().f42954;
                enumC97210 = EnumC9729.CHECK;
                if (enumC9729 == enumC97210 || !m18322(this.f22804.f5036)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C13112 c13112M18296 = m18296(c6966, this.f22804, (C21825) null);
                abstractC16579 = c13112M18296.f43682;
                abstractC165710 = c13112M18296.f43681;
                C1116 c1116 = this.f22804;
                abstractC165711 = abstractC16579M52440;
                enumC13901 = enumC13905;
                m18274(c4603M12747, c6966, c1116.f5036, abstractC165710, abstractC16579, c1116.f5037);
                c21825Mo33523 = abstractC165710.mo33523();
                c0450 = c20145.f65411;
                if (this.f22804.f5037.mo4574().m44601(c21825Mo33523)) {
                    c0450 = new C0450(c20145, this.f22804.f5037.mo4574());
                }
                try {
                    AbstractC10766 abstractC10766 = c0450;
                    c21825M44597 = this.f22804.f5037.mo4574().m44597();
                    try {
                        enumC13902 = enumC13904;
                        try {
                            C2068 c2068M45523 = this.f22822.m45523(c4603M12747, c6966, c6966.f23408.f30190, c6966.f23413, c21825Mo33523, c21825, c13112M18296.f43681, abstractC10766, this.f22804.f5037.mo4574(), c20145.f65418);
                            try {
                                this.f22804.f5037.mo4574().m44606(c21825M44597);
                                abstractC23904 = (AbstractC23903) c2068M45523.f7664;
                                abstractC22967 = (AbstractC22967) c2068M45523.f7665;
                                enumC10477 = abstractC23904.f77452;
                                if (enumC10477 == EnumC10477.f35879) {
                                    if (abstractC23904.m52713()) {
                                        abstractC23903Mo10880 = abstractC23904.mo10880();
                                    } else {
                                        abstractC23903Mo10880 = abstractC23904;
                                    }
                                    c6966.f23412 = abstractC23903Mo10880;
                                    c6966.f23410 = abstractC22967.mo5433(abstractC23903Mo10880);
                                    c6966.f23409 = c20145.m45551(c4603M12747, (AbstractC0618) c6966.f23412.m52720(), false);
                                    if (abstractC165710.mo16235() == AbstractC16579.f53218) {
                                        c6966.f30190 = abstractC16579;
                                        this.f22800 = abstractC16579;
                                        return;
                                    }
                                    if (((C22990) this.f22814.f16299).f74713.f12499) {
                                        enumC13903 = enumC13902;
                                    } else {
                                        enumC13903 = enumC13902;
                                        if (enumC13903 == enumC13901 && (abstractC16579Mo1934 = abstractC165711.mo1934()) != null && abstractC16579Mo1934.m39001(EnumC6617.CLASS)) {
                                            c20145.m45526((InterfaceC12260) c6966, this.f22814, abstractC165711, false);
                                        }
                                    }
                                    if (this.f22804.f5037.mo4575().f42954 == enumC97210) {
                                        if (enumC13903 == EnumC13901.INVOKE) {
                                            c23942 = c23943;
                                            if (!C3128.m9451(c6966.f23408, c23942) && c6966.f23410.m11777() && abstractC22967.f35427.mo1936()) {
                                                abstractC22967 = abstractC22967;
                                                c21017 = c21018;
                                                c21017.m47285(c6966.f23408, c4603M12747);
                                            }
                                            if (!c6966.f23412.mo22992() && C3128.m9451(c6966.f23408, c23942) && abstractC165711.mo1938().m48595()) {
                                                AbstractC5930 abstractC5932 = c6966.f23408;
                                                abstractC5932.getClass();
                                                EnumC7654 enumC7654M381510 = C16121.m38159(enumC13903);
                                                C5909 c59011 = C23879.f77204;
                                                Object[] objArr = new Object[2];
                                                objArr[0] = enumC7654M381510;
                                                objArr[c] = C14707.f48072;
                                                c20414.m48199(abstractC5932, new C5909("compiler", "invalid.mref", objArr));
                                                C5954 c5954M52441 = c23800.m52440(abstractC16579);
                                                c6966.f30190 = c5954M52441;
                                                this.f22800 = c5954M52441;
                                                return;
                                            }
                                            if (!abstractC23904.mo22992() && c6966.f23410 == EnumC4143.f15153) {
                                                c20145.m45550(c6966, c6966.f23412);
                                            }
                                            if (z2) {
                                                c21017.m47280((AbstractC5930) c6966, true);
                                            }
                                        } else {
                                            c23942 = c23943;
                                        }
                                        c21017 = c21018;
                                        if (!c6966.f23412.mo22992()) {
                                        }
                                        if (!abstractC23904.mo22992()) {
                                            c20145.m45550(c6966, c6966.f23412);
                                        }
                                        if (z2) {
                                            c21017.m47280((AbstractC5930) c6966, true);
                                        }
                                    } else {
                                        abstractC22967 = abstractC22967;
                                    }
                                    C1116 c1117 = this.f22804;
                                    if (abstractC165710.mo16235().m39001(EnumC6617.VOID)) {
                                        abstractC16579Mo16235 = AbstractC16579.f53219;
                                    } else {
                                        abstractC16579Mo16235 = abstractC165710.mo16235();
                                    }
                                    if (c6966.f23410.m11777()) {
                                        c21826 = c21825Mo33523.f70877;
                                    } else {
                                        c21826 = c21825Mo33523;
                                    }
                                    c1116Mo4135 = c1117.mo4135(m18306(abstractC16579Mo16235, c21826, c21825), new C3357(this, this.f22804.f5037), EnumC1946.f7331);
                                    abstractC22968 = abstractC22967;
                                    abstractC16579M18302 = m18302(c6966, abstractC22968.f35427, abstractC23904, c4603M12747, c1116Mo4135);
                                    if (c6966.f23410.m11777() && ((AbstractC16579) c21825Mo33523.f70876).m39005(this.f22804.f5037.mo4574().f62771) && !c23800.m52413(this.f22804.f5037.mo4574().m44602((AbstractC16579) c21825Mo33523.f70876), abstractC165711, true)) {
                                        C6171.m17174("Can't get here");
                                        throw null;
                                    }
                                    if (abstractC16579M18302.mo1926()) {
                                        abstractC16579M52407 = abstractC16579M18302;
                                    } else {
                                        abstractC16579M52407 = c23800.m52407(abstractC16579M18302, m18309(abstractC23904, abstractC22968.f35427, c6966.f23413, c1116Mo4135.f5036.mo33523(), abstractC16579M18302.mo16235()));
                                    }
                                    if (this.f22804.f5037.mo4575().f42954 == EnumC9729.SPECULATIVE) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c6966.f30190 = abstractC16579;
                                    m18315(c6966, abstractC165710, abstractC16579M52407, this.f22804.f5037, z3);
                                    if (!z3) {
                                        m18273(c6966, c4603M12747, this.f22804.f5037.mo4574(), C21825.m48586((Object[]) new AbstractC16579[]{abstractC165710, abstractC16579}));
                                    }
                                    this.f22800 = m18301(c6966, abstractC16579, C21059.f68595, this.f22804);
                                    return;
                                }
                                switch (C10415.f35608[enumC10477.ordinal()]) {
                                    case 1:
                                    case 2:
                                        z4 = false;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        z4 = true;
                                        break;
                                    default:
                                        C6171.m17174("unexpected result kind " + abstractC23904.f77452);
                                        throw null;
                                }
                                c11948Mo8964 = ((AbstractC8856) abstractC23904.mo10880()).mo8964(EnumC17198.FRAGMENT, c6966, abstractC165711.f53222, abstractC165711, c6966.f23413, c21825Mo33523, c21825);
                                C23549 c23549 = this.f22831;
                                C22137 c22137M48186 = c20414.m48186();
                                if (z4) {
                                    EnumC7654 enumC7654M381511 = C16121.m38159(enumC13902);
                                    C14377 c14377 = C14707.f48054;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = enumC7654M381511;
                                    objArr2[c] = c11948Mo8964;
                                    c5909 = new C14377("compiler", "invalid.mref", objArr2);
                                } else {
                                    EnumC7654 enumC7654M381512 = C16121.m38159(enumC13902);
                                    C5909 c59012 = C23879.f77204;
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = enumC7654M381512;
                                    objArr3[c] = c11948Mo8964;
                                    c5909 = new C5909("compiler", "invalid.mref", objArr3);
                                }
                                c23549.getClass();
                                c6967 = c6966;
                                try {
                                    c11948M51909 = c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137M48186, c6966, c5909);
                                    if (z4) {
                                        abstractC165712 = abstractC16579;
                                        if (abstractC165712 == AbstractC16579.f53218) {
                                            c6967.f30190 = abstractC165712;
                                            this.f22800 = abstractC165712;
                                            return;
                                        }
                                    } else {
                                        abstractC165712 = abstractC16579;
                                    }
                                    if (z4) {
                                        this.f22804.f5037.mo2545(c6967, c11948M51909);
                                    } else {
                                        c20414.mo46176(c11948M51909);
                                    }
                                    C5954 c5954M52442 = c23800.m52440(abstractC165712);
                                    c6967.f30190 = c5954M52442;
                                    this.f22800 = c5954M52442;
                                    return;
                                } catch (C23945 e) {
                                    e = e;
                                }
                            } catch (C23945 e2) {
                                e = e2;
                                c6967 = c6966;
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.f22804.f5037.mo4574().m44606(c21825M44597);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (C23945 e3) {
                    e = e3;
                    r12 = c20414;
                    r14 = c20145;
                }
            }
            abstractC16579M52440 = abstractC16579M18299;
            c = 1;
            if (abstractC16579M52440.mo1926()) {
                c6966.f30190 = abstractC16579M52440;
                this.f22800 = abstractC16579M52440;
                return;
            }
            if (C3128.m9451(c6966.f23408, c23943)) {
                c21018.m47287((AbstractC8774) c6966.f23408, this.f22814, false);
            } else {
                abstractC23903M9471 = C3128.m9471(c6966.f23408);
                C22990 c22991 = (C22990) c4603M12747.f16299;
                if (abstractC23903M9471 == null) {
                    z = false;
                } else {
                    z = false;
                }
                c22991.f74723 = z;
            }
            c21825M48588 = C21825.m48588();
            if (c21827 != null) {
                c21825M48588 = m18311(c21827, c4603M12747);
                c21018.m47304(c21827, c21825M48588);
            }
            c21825 = c21825M48588;
            enumC9729 = this.f22804.f5037.mo4575().f42954;
            enumC97210 = EnumC9729.CHECK;
            if (enumC9729 == enumC97210) {
                z2 = false;
            } else {
                z2 = false;
            }
            C13112 c13112M18297 = m18296(c6966, this.f22804, (C21825) null);
            abstractC16579 = c13112M18297.f43682;
            abstractC165710 = c13112M18297.f43681;
            C1116 c1118 = this.f22804;
            abstractC165711 = abstractC16579M52440;
            enumC13901 = enumC13905;
            m18274(c4603M12747, c6966, c1118.f5036, abstractC165710, abstractC16579, c1118.f5037);
            c21825Mo33523 = abstractC165710.mo33523();
            c0450 = c20145.f65411;
            if (this.f22804.f5037.mo4574().m44601(c21825Mo33523)) {
                c0450 = new C0450(c20145, this.f22804.f5037.mo4574());
            }
            AbstractC10766 abstractC10767 = c0450;
            c21825M44597 = this.f22804.f5037.mo4574().m44597();
            enumC13902 = enumC13904;
            C2068 c2068M45524 = this.f22822.m45523(c4603M12747, c6966, c6966.f23408.f30190, c6966.f23413, c21825Mo33523, c21825, c13112M18297.f43681, abstractC10767, this.f22804.f5037.mo4574(), c20145.f65418);
            this.f22804.f5037.mo4574().m44606(c21825M44597);
            abstractC23904 = (AbstractC23903) c2068M45524.f7664;
            abstractC22967 = (AbstractC22967) c2068M45524.f7665;
            enumC10477 = abstractC23904.f77452;
            if (enumC10477 == EnumC10477.f35879) {
                switch (C10415.f35608[enumC10477.ordinal()]) {
                    case 1:
                    case 2:
                        z4 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z4 = true;
                        break;
                    default:
                        C6171.m17174("unexpected result kind " + abstractC23904.f77452);
                        throw null;
                }
                c11948Mo8964 = ((AbstractC8856) abstractC23904.mo10880()).mo8964(EnumC17198.FRAGMENT, c6966, abstractC165711.f53222, abstractC165711, c6966.f23413, c21825Mo33523, c21825);
                C23549 c235410 = this.f22831;
                C22137 c22137M48187 = c20414.m48186();
                if (z4) {
                    EnumC7654 enumC7654M381513 = C16121.m38159(enumC13902);
                    C14377 c14378 = C14707.f48054;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = enumC7654M381513;
                    objArr4[c] = c11948Mo8964;
                    c5909 = new C14377("compiler", "invalid.mref", objArr4);
                } else {
                    EnumC7654 enumC7654M381514 = C16121.m38159(enumC13902);
                    C5909 c59013 = C23879.f77204;
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = enumC7654M381514;
                    objArr5[c] = c11948Mo8964;
                    c5909 = new C5909("compiler", "invalid.mref", objArr5);
                }
                c235410.getClass();
                c6967 = c6966;
                c11948M51909 = c235410.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137M48187, c6966, c5909);
                if (z4) {
                    abstractC165712 = abstractC16579;
                    if (abstractC165712 == AbstractC16579.f53218) {
                        c6967.f30190 = abstractC165712;
                        this.f22800 = abstractC165712;
                        return;
                    }
                } else {
                    abstractC165712 = abstractC16579;
                }
                if (z4) {
                    this.f22804.f5037.mo2545(c6967, c11948M51909);
                } else {
                    c20414.mo46176(c11948M51909);
                }
                C5954 c5954M52443 = c23800.m52440(abstractC165712);
                c6967.f30190 = c5954M52443;
                this.f22800 = c5954M52443;
                return;
            }
            if (abstractC23904.m52713()) {
                abstractC23903Mo10880 = abstractC23904.mo10880();
            } else {
                abstractC23903Mo10880 = abstractC23904;
            }
            c6966.f23412 = abstractC23903Mo10880;
            c6966.f23410 = abstractC22967.mo5433(abstractC23903Mo10880);
            c6966.f23409 = c20145.m45551(c4603M12747, (AbstractC0618) c6966.f23412.m52720(), false);
            if (abstractC165710.mo16235() == AbstractC16579.f53218) {
                c6966.f30190 = abstractC16579;
                this.f22800 = abstractC16579;
                return;
            }
            if (((C22990) this.f22814.f16299).f74713.f12499) {
                enumC13903 = enumC13902;
                if (enumC13903 == enumC13901) {
                    c20145.m45526((InterfaceC12260) c6966, this.f22814, abstractC165711, false);
                }
            } else {
                enumC13903 = enumC13902;
            }
            if (this.f22804.f5037.mo4575().f42954 == enumC97210) {
                if (enumC13903 == EnumC13901.INVOKE) {
                    c23942 = c23943;
                    if (!C3128.m9451(c6966.f23408, c23942)) {
                    }
                } else {
                    c23942 = c23943;
                }
                c21017 = c21018;
                if (!c6966.f23412.mo22992()) {
                }
                if (!abstractC23904.mo22992()) {
                    c20145.m45550(c6966, c6966.f23412);
                }
                if (z2) {
                    c21017.m47280((AbstractC5930) c6966, true);
                }
            } else {
                abstractC22967 = abstractC22967;
            }
            C1116 c1119 = this.f22804;
            if (abstractC165710.mo16235().m39001(EnumC6617.VOID)) {
                abstractC16579Mo16235 = AbstractC16579.f53219;
            } else {
                abstractC16579Mo16235 = abstractC165710.mo16235();
            }
            if (c6966.f23410.m11777()) {
                c21826 = c21825Mo33523.f70877;
            } else {
                c21826 = c21825Mo33523;
            }
            c1116Mo4135 = c1119.mo4135(m18306(abstractC16579Mo16235, c21826, c21825), new C3357(this, this.f22804.f5037), EnumC1946.f7331);
            abstractC22968 = abstractC22967;
            abstractC16579M18302 = m18302(c6966, abstractC22968.f35427, abstractC23904, c4603M12747, c1116Mo4135);
            if (c6966.f23410.m11777()) {
                C6171.m17174("Can't get here");
                throw null;
            }
            if (abstractC16579M18302.mo1926()) {
                abstractC16579M52407 = c23800.m52407(abstractC16579M18302, m18309(abstractC23904, abstractC22968.f35427, c6966.f23413, c1116Mo4135.f5036.mo33523(), abstractC16579M18302.mo16235()));
            } else {
                abstractC16579M52407 = abstractC16579M18302;
            }
            if (this.f22804.f5037.mo4575().f42954 == EnumC9729.SPECULATIVE) {
                z3 = true;
            } else {
                z3 = false;
            }
            c6966.f30190 = abstractC16579;
            m18315(c6966, abstractC165710, abstractC16579M52407, this.f22804.f5037, z3);
            if (!z3) {
                m18273(c6966, c4603M12747, this.f22804.f5037.mo4574(), C21825.m48586((Object[]) new AbstractC16579[]{abstractC165710, abstractC16579}));
            }
            this.f22800 = m18301(c6966, abstractC16579, C21059.f68595, this.f22804);
            return;
            r14 = c23800;
            r12 = c6967;
            this.f22804.f5037.mo2545(r12, e.m52780());
            C5954 c5954M52444 = r14.m52440(this.f22804.f5036);
            r12.f30190 = c5954M52444;
            this.f22800 = c5954M52444;
        } catch (C23945 e4) {
            e = e4;
            r14 = c23800;
            r12 = c6966;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1116 m18325(C6966 c6966) {
        return new C1116(this, c6966.f23414 == EnumC13901.INVOKE ? C21059.f68593 : C21059.f68585, AbstractC16579.f53219);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18315(final C6966 c6966, AbstractC16579 abstractC16579, final AbstractC16579 abstractC165710, InterfaceC18195 interfaceC18195, boolean z) {
        AbstractC16579 abstractC16579Mo16235;
        C19524 c19524Mo4574 = interfaceC18195.mo4574();
        AbstractC16579 abstractC16579M44602 = c19524Mo4574.m44602(abstractC16579.mo16235());
        if (C10415.f35606[c6966.f23414.ordinal()] == 1 && !c6966.f23408.f30190.mo1936()) {
            abstractC16579Mo16235 = c6966.f23408.f30190;
        } else {
            abstractC16579Mo16235 = abstractC165710.mo16235();
        }
        EnumC6617 enumC6617 = EnumC6617.VOID;
        AbstractC16579 abstractC165711 = null;
        AbstractC16579 abstractC165712 = abstractC16579M44602.m39001(enumC6617) ? null : abstractC16579Mo16235;
        if (abstractC16579M44602.m39001(enumC6617) || abstractC16579Mo16235.m39001(enumC6617)) {
            abstractC165711 = abstractC165712;
        } else if (!abstractC16579Mo16235.mo1926()) {
            if (!((C1261) this.f22834.f68418).mo2933(interfaceC18195.mo4574().m44602(abstractC16579Mo16235), interfaceC18195.mo4574().m44602(abstractC16579M44602), interfaceC18195.mo4573(c6966, abstractC16579Mo16235, abstractC16579M44602))) {
                abstractC165711 = abstractC165712;
            }
        }
        if (abstractC165711 == null) {
            if (abstractC165710.m39005(c19524Mo4574.f62771)) {
                c19524Mo4574.m44595(C21825.of((Object) abstractC165710), new InterfaceC18383() { // from class: l.ۤ֡ۤ
                    @Override // l.InterfaceC18383
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo969(C19524 c19524) {
                        c6966.f23407 = c19524.m44587(abstractC165710);
                    }
                });
            } else {
                c6966.f23407 = abstractC165710;
            }
        } else {
            interfaceC18195.mo2545(c6966, this.f22831.m51910(new C14377("compiler", "incompatible.ret.type.in.mref", C14707.m35237(abstractC16579Mo16235, abstractC16579.mo16235()))));
        }
        if (z || m18323(abstractC165710.mo33524(), abstractC16579.mo33524(), c19524Mo4574)) {
            return;
        }
        C21825 c21825Mo33524 = abstractC165710.mo33524();
        C5909 c5909 = C23879.f77204;
        this.f22832.m48199(c6966, new C5909("compiler", "incompatible.thrown.types.in.mref", c21825Mo33524));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18323(C21825 c21825, C21825 c21826, C19524 c19524) {
        C21825 c21827 = (C21825) C9030.stream(c21826).filter(new C13237(0, c19524)).collect(C21825.m48587());
        C21825 c21825M48593 = c21826.m48593(c21827);
        C21825<AbstractC16579> c21828 = (C21825) C9030.stream(c21825).filter(new Predicate() { // from class: l.ۜܽۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !this.f23194.f22834.m47351((AbstractC16579) obj);
            }
        }).collect(C21825.m48587());
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC16579 : c21828) {
            Iterator it = c21825M48593.iterator();
            do {
                if (!it.hasNext()) {
                    c19003.m43723(abstractC16579);
                    break;
                }
            } while (!this.f22802.m52413(abstractC16579, (AbstractC16579) it.next(), true));
        }
        if (c21827.isEmpty() && !c19003.isEmpty()) {
            return false;
        }
        C21825 c21825M44604 = c19524.m44604(c21827);
        C0356.forEach(c19003, new C23115(0, this, c21825M44604));
        C9030.stream(c21825M44604).filter(new C15354()).forEach(new C21703());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m18274(final C4603 c4603, final AbstractC1696 abstractC1696, final AbstractC16579 abstractC16579, final AbstractC16579 abstractC165710, final AbstractC16579 abstractC165711, final InterfaceC18195 interfaceC18195) {
        if (abstractC165710.m39005(interfaceC18195.mo4574().f62771)) {
            interfaceC18195.mo4574().m44595(C21825.of((Object) abstractC16579, (Object) abstractC165710), new InterfaceC18383() { // from class: l.ܽ֡ۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19524) {
                    AbstractC16579 abstractC165712 = abstractC165711;
                    this.f52468.m18274(c4603, abstractC1696, abstractC16579, c19524.m44587(abstractC165710), c19524.m44587(abstractC165712), interfaceC18195);
                }
            });
            return;
        }
        if (abstractC16579.m39001(EnumC6617.CLASS)) {
            abstractC1696.f6716 = abstractC165711;
        }
        if (interfaceC18195.mo4575().f42954 != EnumC9729.CHECK || abstractC16579 == AbstractC16579.f53218) {
            return;
        }
        try {
            C22492 c22492M52382 = this.f22802.m52382(c4603, this.f22815.f77594, abstractC1696.f6716, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            if (c22492M52382 != null) {
                this.f22834.m47290(c4603.f16296, c22492M52382, c22492M52382);
                try {
                    c22492M52382.f77447 |= 512;
                    this.f22802.m52431(c22492M52382.f77449);
                } catch (C23945 unused) {
                    this.f22804.f5037.mo2545(abstractC1696, this.f22831.m51910(C14707.m35239(abstractC1696.f6716)));
                }
            }
        } catch (C23945 e) {
            this.f22804.f5037.mo2545(c4603.f16296, e.m52780());
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1266(C21077 c21077) {
        AbstractC16579 abstractC16579M18299 = m18299(c21077.f68656, this.f22814, this.f22804);
        C1116 c1116 = this.f22804;
        this.f22800 = m18301(c21077, abstractC16579M18299, c1116.f5039, c1116);
        AbstractC23903 abstractC23903M9471 = C3128.m9471(c21077);
        if (abstractC23903M9471 == null || !abstractC23903M9471.f77452.m26580(C21059.f68587) || abstractC23903M9471.f77452 == EnumC10477.f35866) {
            return;
        }
        this.f22832.m48199(c21077, C23879.f77184);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(C3812 c3812) {
        AbstractC5930 abstractC5930 = c3812.f14145;
        C4603 c4603 = this.f22814;
        AbstractC16579 abstractC16579M18299 = m18299(abstractC5930, c4603.m12747(c3812, c4603.f16299), this.f22835);
        AbstractC16579 abstractC16579M52419 = this.f22802.m52419(abstractC16579M18299);
        m18300((AbstractC8774) c3812.f14146, this.f22814, abstractC16579M18299);
        this.f22800 = m18301(c3812, abstractC16579M52419, C21059.f68595, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        AbstractC16579 abstractC16579M18299 = m18299(c6635.f22412, this.f22814, this.f22835);
        AbstractC16579 abstractC16579M182910 = m18299(c6635.f22413, this.f22814, this.f22809);
        EnumC18651 enumC18651M43134 = c6635.mo1803().m43134();
        C10727 c10727 = this.f22840;
        C10498 c10498M26961 = c10727.m26961(c6635, enumC18651M43134, abstractC16579M18299, abstractC16579M182910);
        c6635.f35957 = c10498M26961;
        if (c10498M26961 != c10727.f36566 && !abstractC16579M18299.mo1926() && !abstractC16579M182910.mo1926()) {
            AbstractC5930 abstractC5930 = c6635.f22413;
            abstractC5930.getClass();
            C21017 c21017 = this.f22834;
            c21017.m47296(abstractC5930, c10498M26961, abstractC16579M182910);
            AbstractC5930 abstractC5931 = c6635.f22413;
            abstractC5931.getClass();
            c21017.m47265(abstractC5931, c10498M26961.f77449.mo16235(), abstractC16579M18299);
        }
        this.f22800 = m18301(c6635, abstractC16579M18299, C21059.f68595, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        AbstractC16579 abstractC16579M47251;
        AbstractC16579 abstractC16579Mo16235;
        C16784 c16784;
        AbstractC16579 abstractC16579M39434;
        if (c13007.mo1803().m43138()) {
            abstractC16579M47251 = m18299(c13007.f43378, this.f22814, this.f22835);
        } else {
            AbstractC5930 abstractC5930 = c13007.f43378;
            abstractC5930.getClass();
            abstractC16579M47251 = this.f22834.m47251(abstractC5930, m18299(c13007.f43378, this.f22814, this.f22809));
        }
        EnumC18651 enumC18651Mo1803 = c13007.mo1803();
        C10727 c10727 = this.f22840;
        C10498 c10498M26960 = c10727.m26960(c13007, enumC18651Mo1803, abstractC16579M47251);
        c13007.f35957 = c10498M26960;
        AbstractC16579 abstractC16579M52440 = this.f22802.m52440(c13007.f30190);
        if (c10498M26960 != c10727.f36566 && !abstractC16579M47251.mo1926()) {
            if (c13007.mo1803().m43138()) {
                abstractC16579Mo16235 = c13007.f43378.f30190;
            } else {
                abstractC16579Mo16235 = c10498M26960.f77449.mo16235();
            }
            abstractC16579M52440 = abstractC16579Mo16235;
            int i = c10498M26960.f35962;
            if (abstractC16579M47251.mo24292() != null && (abstractC16579M39434 = (c16784 = this.f22824).m39434(i, abstractC16579M47251)) != null) {
                abstractC16579M52440 = c16784.m39436(abstractC16579M39434, abstractC16579M52440);
            }
        }
        this.f22800 = m18301(c13007, abstractC16579M52440, C21059.f68595, this.f22804);
        C2923 c2923 = this.f22827;
        this.f22818.getClass();
        if (c2923 != C4562.f16202 && c13007.m22847(EnumC18651.f60561)) {
            c2923 = new C2923(c2923.f10987, c2923.f10989, false);
        }
        this.f22827 = c2923;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        C21825 c21825M48588;
        C16784 c16784;
        AbstractC16579 abstractC16579M39435;
        AbstractC5930 abstractC5930 = c22864.f74367;
        abstractC5930.getClass();
        AbstractC5930 abstractC5931 = c22864.f74367;
        C4603 c4603 = this.f22814;
        C1116 c1116 = this.f22809;
        AbstractC16579 abstractC16579M18299 = m18299(abstractC5931, c4603, c1116);
        C21017 c21017 = this.f22834;
        AbstractC16579 abstractC16579M47251 = c21017.m47251(abstractC5930, abstractC16579M18299);
        C2923 c2923 = this.f22827;
        int i = C10415.f35605[c22864.mo1803().ordinal()];
        if (i == 17) {
            c21825M48588 = c2923.f10989;
        } else if (i == 18) {
            c21825M48588 = c2923.f10987;
        } else {
            c21825M48588 = C21825.m48588();
        }
        C4603 c4604 = this.f22814;
        C4603 c4603M18267 = m18267(c4604, c4604.f16296, c21825M48588);
        Object obj = c4603M18267.f16299;
        try {
            AbstractC5930 abstractC5932 = c22864.f74368;
            abstractC5932.getClass();
            AbstractC16579 abstractC16579M47252 = c21017.m47251(abstractC5932, m18299(c22864.f74368, c4603M18267, c1116));
            ((C22990) obj).f74722.mo24225();
            this.f22827 = this.f22818.m12715(c22864, c2923, this.f22827);
            EnumC18651 enumC18651Mo1803 = c22864.mo1803();
            C10727 c10727 = this.f22840;
            C10498 c10498M26961 = c10727.m26961(c22864, enumC18651Mo1803, abstractC16579M47251, abstractC16579M47252);
            c22864.f35957 = c10498M26961;
            AbstractC16579 abstractC16579 = c22864.f30190;
            C23800 c23800 = this.f22802;
            AbstractC16579 abstractC16579M52440 = c23800.m52440(abstractC16579);
            if (c10498M26961 != c10727.f36566 && !abstractC16579M47251.mo1926() && !abstractC16579M47252.mo1926()) {
                AbstractC16579 abstractC16579Mo16235 = c10498M26961.f77449.mo16235();
                int i2 = c10498M26961.f35962;
                if (abstractC16579M47251.mo24292() != null && abstractC16579M47252.mo24292() != null && (abstractC16579M39435 = (c16784 = this.f22824).m39435(i2, abstractC16579M47251, abstractC16579M47252)) != null) {
                    abstractC16579Mo16235 = c16784.m39436(abstractC16579M39435, abstractC16579Mo16235);
                }
                if ((i2 == 165 || i2 == 166) && !c23800.m52412(abstractC16579M47251, abstractC16579M47252, new C10391(c22864))) {
                    C5909 c5909 = C23879.f77204;
                    this.f22832.m48199(c22864, new C5909("compiler", "incomparable.types", abstractC16579M47251, abstractC16579M47252));
                }
                AbstractC5930 abstractC5933 = c22864.f74368;
                abstractC5933.getClass();
                c21017.m47296(abstractC5933, c10498M26961, abstractC16579M47252);
                abstractC16579M52440 = abstractC16579Mo16235;
            }
            this.f22800 = m18301(c22864, abstractC16579M52440, C21059.f68595, this.f22804);
        } catch (Throwable th) {
            ((C22990) obj).f74722.mo24225();
            throw th;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1261(C2422 c2422) {
        C1116 c1116;
        AbstractC16579 abstractC16579M18326 = m18326(c2422.f9707, this.f22814, AbstractC16579.f53219);
        AbstractC8774 abstractC8774 = c2422.f9707;
        C4603 c4603 = this.f22814;
        C21017 c21017 = this.f22834;
        boolean z = false;
        c21017.m47287(abstractC8774, c4603, false);
        C4603 c4604 = this.f22814;
        C4603 c4603M12747 = c4604.m12747(c2422, c4604.f16299);
        AbstractC5930 abstractC5930M9461 = C3128.m9461(c2422.f9708);
        if (this.f22816 && (abstractC5930M9461.m22847(EnumC18651.f60511) || abstractC5930M9461.m22847(EnumC18651.f60512))) {
            z = true;
        }
        if (z) {
            c1116 = new C1116(this, C21059.f68595, abstractC16579M18326, new C8298(this, this.f22804.f5037));
        } else {
            c1116 = this.f22809;
        }
        AbstractC16579 abstractC16579M18299 = m18299(c2422.f9708, c4603M12747, c1116);
        if (!z) {
            AbstractC5930 abstractC5930 = c2422.f9708;
            abstractC5930.getClass();
            abstractC16579M18326 = c21017.m47265(abstractC5930, abstractC16579M18299, abstractC16579M18326);
        }
        if (abstractC16579M18299.mo24292() != null) {
            abstractC16579M18326 = this.f22824.m39436(abstractC16579M18299, abstractC16579M18326);
        }
        this.f22800 = m18301(c2422, this.f22802.m52419(abstractC16579M18326), C21059.f68595, this.f22804);
        if (z) {
            return;
        }
        c21017.m47274(c2422);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3938(C11906 c11906) {
        AbstractC16579 abstractC16579M52440;
        AbstractC8774 abstractC8774;
        InterfaceC12260 interfaceC12260 = c11906.f39945;
        interfaceC12260.getClass();
        AbstractC5930 abstractC5930 = c11906.f39945;
        C4603 c4603 = this.f22814;
        C1116 c1116 = this.f22809;
        AbstractC16579 abstractC16579M18299 = m18299(abstractC5930, c4603, c1116);
        C21017 c21017 = this.f22834;
        AbstractC16579 abstractC16579M47337 = c21017.m47337(interfaceC12260, abstractC16579M18299);
        EnumC18651 enumC18651Mo1803 = c11906.f39946.mo1803();
        EnumC18651 enumC18651 = EnumC18651.f60568;
        C20414 c20414 = this.f22832;
        boolean zM18289 = false;
        C23800 c23800 = this.f22802;
        if (enumC18651Mo1803 != enumC18651 && c11906.f39946.mo1803() != EnumC18651.f60497) {
            abstractC16579M52440 = m18326(c11906.f39946, this.f22814, AbstractC16579.f53219);
            abstractC8774 = c11906.f39946;
            c21017.m47287(abstractC8774, this.f22814, false);
        } else {
            m18299(c11906.f39946, this.f22814, c1116);
            abstractC16579M52440 = c11906.f39946.f30190;
            if (c23800.m52413(abstractC16579M47337, abstractC16579M52440, true) && !abstractC16579M47337.mo1926() && !abstractC16579M52440.mo1926()) {
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c11906, new C5909("compiler", "instanceof.pattern.no.subtype", abstractC16579M47337, abstractC16579M52440));
            }
            abstractC8774 = C3128.m9443((AbstractC20372) c11906.f39946).f49323.f22477;
        }
        if (!abstractC16579M52440.m39001(EnumC6617.TYPEVAR)) {
            abstractC8774.getClass();
            abstractC16579M52440 = c21017.m47263(abstractC8774, abstractC16579M52440);
        }
        if (!abstractC16579M52440.mo1926() && !c23800.m52436(abstractC16579M52440)) {
            if (this.f22805) {
                AbstractC5930 abstractC5931 = c11906.f39945;
                abstractC5931.getClass();
                zM18289 = m18289(abstractC5931, abstractC16579M47337, abstractC16579M52440);
            } else {
                c20414.m48193(EnumC0264.SOURCE_LEVEL, c11906, EnumC14026.f46104.m33943(this.f22817));
                this.f22805 = true;
            }
            if (!zM18289) {
                abstractC16579M52440 = c23800.m52440(abstractC16579M52440);
            }
        }
        InterfaceC12260 interfaceC12261 = c11906.f39945;
        interfaceC12261.getClass();
        c21017.m47265(interfaceC12261, abstractC16579M47337, abstractC16579M52440);
        this.f22800 = m18301(c11906, this.f22806.f14263, C21059.f68595, this.f22804);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18289(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C10391 c10391 = new C10391();
        if (!this.f22802.m52412(abstractC16579, abstractC165710, c10391)) {
            ((C1261) this.f22834.f68418).mo2545(interfaceC12260, this.f22831.m51910(C14707.m35237(abstractC16579, abstractC165710)));
            return false;
        }
        if (!c10391.m26290(EnumC0597.UNCHECKED)) {
            return true;
        }
        C5909 c5909 = C23879.f77204;
        this.f22832.m48199(interfaceC12260, new C5909("compiler", "instanceof.reifiable.not.safe", abstractC16579, abstractC165710));
        return false;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        C21059 c21059 = C21059.f68585;
        C1116 c1116 = this.f22804;
        C1116 c1117 = new C1116(this, c21059, c1116.f5036, c1116.f5037);
        C6656 c6656 = c15103.f49323;
        AbstractC16579 abstractC16579M18299 = m18299(c6656.f22477, this.f22814, c1117);
        c6656.f30190 = abstractC16579M18299;
        c15103.f30190 = abstractC16579M18299;
        C6656 c6657 = c15103.f49323;
        C5558 c5558 = new C5558(c6657.f22476.f70567, c6657.f22478, c6657.f22477.f30190, ((C22990) this.f22814.f16299).f74722.f11719);
        c5558.f21226 = c15103.f30189;
        C6656 c6658 = c15103.f49323;
        c6658.f22475 = c5558;
        AbstractC9462 abstractC9462 = ((C22990) this.f22814.f16299).f74722;
        C21017 c21017 = this.f22834;
        if (c21017.m47323((InterfaceC12260) c6658, (AbstractC23903) c5558, abstractC9462)) {
            C6656 c6659 = c15103.f49323;
            c6659.getClass();
            c21017.m47293((InterfaceC12260) c6659, (C6263) c5558, ((C22990) this.f22814.f16299).f74722);
        }
        C21825 c21825 = c15103.f49323.f22476.f70566;
        C4603 c4603 = this.f22814;
        C17573 c17573 = this.f22801;
        c17573.m40871(c21825, c4603, c5558, c15103);
        C6656 c66510 = c15103.f49323;
        c17573.m40869(c66510.f22477, this.f22814, c5558, c66510);
        c17573.m40874();
        c21017.m47287((AbstractC8774) c15103.f49323.f22477, this.f22814, true);
        this.f22800 = c15103.f30190;
        this.f22827 = new C2923(C21825.of((Object) c5558), C21825.m48588(), false);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3949(C16139 c16139) {
        m18299(c16139.f52149, this.f22814, this.f22809);
        AbstractC16579 abstractC16579 = c16139.f52149.f30190;
        c16139.f30190 = abstractC16579;
        this.f22800 = abstractC16579;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3933(C9459 c9459) {
        m18299(c9459.f32014, this.f22814, this.f22809);
        C2923 c2923 = this.f22827;
        C4603 c4603 = this.f22814;
        C4603 c4603M18267 = m18267(c4603, c4603.f16296, c2923.f10989);
        Object obj = c4603M18267.f16299;
        try {
            m18300((AbstractC8774) c9459.f32013, c4603M18267, (AbstractC16579) this.f22806.f14263);
            ((C22990) obj).f74722.mo24225();
            AbstractC16579 abstractC16579 = c9459.f32014.f30190;
            c9459.f30190 = abstractC16579;
            this.f22800 = abstractC16579;
            C2923 c2924 = this.f22827;
            C4562 c4562 = this.f22818;
            c4562.getClass();
            this.f22827 = c4562.m12714(c9459, c2923, c2924);
        } catch (Throwable th) {
            ((C22990) obj).f74722.mo24225();
            throw th;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3957(C22158 c22158) {
        AbstractC16579 abstractC16579 = c22158.f30190;
        C23800 c23800 = this.f22802;
        AbstractC16579 abstractC16579M52440 = c23800.m52440(abstractC16579);
        AbstractC16579 abstractC16579M18299 = m18299(c22158.f72477, this.f22814, this.f22809);
        m18300((AbstractC8774) c22158.f72476, this.f22814, (AbstractC16579) this.f22806.f14232);
        if (c23800.m52434(abstractC16579M18299)) {
            abstractC16579M52440 = c23800.m52416(abstractC16579M18299);
        } else if (!abstractC16579M18299.m39001(EnumC6617.ERROR)) {
            C5909 c5909 = C23879.f77204;
            this.f22832.m48199(c22158, new C5909("compiler", "array.req.but.found", abstractC16579M18299));
        }
        if (!this.f22804.f5039.m47467(C21059.f68595)) {
            abstractC16579M52440 = c23800.m52419(abstractC16579M52440);
        }
        this.f22800 = m18301(c22158, abstractC16579M52440, C21059.f68592, this.f22804);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x030f  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        AbstractC16579 abstractC16579M52422;
        AbstractC23903 abstractC23903M18272;
        boolean z;
        AbstractC16579 abstractC16579;
        AbstractC16579 abstractC16579M52423;
        EnumC10477 enumC10477;
        C21059 c21059M47465 = C21059.f68594;
        AbstractC11242 abstractC11242 = c23570.f76356;
        C23942 c23942 = this.f22815;
        AbstractC11242 abstractC11243 = c23942.f77533;
        AbstractC11242 abstractC11244 = c23942.f77615;
        AbstractC11242 abstractC11245 = c23942.f77638;
        if (abstractC11242 == abstractC11243 || abstractC11242 == abstractC11245 || abstractC11242 == abstractC11244) {
            c21059M47465 = C21059.f68585;
        } else {
            C21059 c21059 = this.f22804.f5039;
            C21059 c210510 = C21059.f68583;
            if (c21059.m47467(c210510)) {
                c21059M47465 = C21059.m47465(c21059M47465, c210510);
            }
            C21059 c210511 = this.f22804.f5039;
            C21059 c210512 = C21059.f68585;
            if (c210511.m47467(c210512)) {
                c21059M47465 = C21059.m47465(c21059M47465, c210512, c210510);
            }
            if (this.f22804.f5039.m47467(C21059.f68591)) {
                c21059M47465 = C21059.m47465(c21059M47465, C21059.f68595, c210512);
            }
        }
        AbstractC16579 abstractC16579M18299 = m18299(c23570.f76357, this.f22814, new C1116(this, c21059M47465, AbstractC16579.f53219));
        boolean zM47467 = this.f22804.f5039.m47467(C21059.f68587);
        C23800 c23800 = this.f22802;
        if (!zM47467) {
            abstractC16579M18299 = c23800.m52419(abstractC16579M18299);
        }
        AbstractC16579 abstractC165710 = abstractC16579M18299;
        C21059 c210513 = C21059.f68585;
        C20414 c20414 = this.f22832;
        if (c21059M47465 == c210513) {
            AbstractC16579 abstractC165711 = abstractC165710;
            while (abstractC165711.m39001(EnumC6617.ARRAY)) {
                abstractC165711 = ((C8777) abstractC165711).f30194;
            }
            if (abstractC165711.m39001(EnumC6617.TYPEVAR)) {
                c20414.m48199(c23570, C23879.f77183);
                AbstractC11242 abstractC11246 = c23570.f76356;
                AbstractC0618 abstractC0618 = abstractC165710.f53222;
                c23800.getClass();
                C5954 c5954M52331 = C23800.m52331(abstractC11246, abstractC0618, abstractC165710);
                c23570.f30190 = c5954M52331;
                this.f22800 = c5954M52331;
                c23570.f76355 = c5954M52331.f53222;
                return;
            }
        }
        AbstractC23903 abstractC23903M9471 = C3128.m9471(c23570.f76357);
        C4603 c4603 = this.f22814;
        C22990 c22990 = (C22990) c4603.f16299;
        boolean z2 = c22990.f74723;
        c22990.f74723 = abstractC23903M9471 != null && abstractC23903M9471.f77453 == abstractC11245;
        c22990.f74727 = null;
        AbstractC23903 abstractC23903M18273 = m18272(c23570, abstractC23903M9471, abstractC165710, c4603, this.f22804);
        EnumC10477 enumC10478 = abstractC23903M18273.f77452;
        EnumC10477 enumC10479 = EnumC10477.f35878;
        C3836 c3836 = this.f22806;
        if (enumC10478 == enumC10479 && abstractC23903M18273.f77453 != abstractC11245 && ((C22990) this.f22814.f16299).f74720 != null) {
            AbstractC5930 abstractC5930 = c23570.f76357;
            abstractC5930.getClass();
            AbstractC0618 abstractC0619 = abstractC165710.f53222;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "not.encl.class", abstractC0619));
            abstractC23903M18273 = c3836.f14276;
        }
        if (abstractC23903M18273.mo20273() && abstractC23903M18273.f77452 != EnumC10477.f35865 && this.f22804.f5039.m47467(C21059.f68587)) {
            AbstractC16579 abstractC16579M52419 = c23800.m52419(abstractC165710);
            abstractC23903M18272 = m18272(c23570, abstractC23903M9471, abstractC16579M52419, this.f22814, this.f22804);
            abstractC16579M52422 = abstractC16579M52419;
        } else {
            abstractC16579M52422 = abstractC165710;
            abstractC23903M18272 = abstractC23903M18273;
        }
        EnumC11678 enumC11678 = ((C22990) this.f22814.f16299).f74727;
        if (enumC11678 != null) {
            enumC11678.m29179();
        }
        c23570.f76355 = abstractC23903M18272;
        if (!abstractC16579M52422.m39001(EnumC6617.TYPEVAR) || ((abstractC23903M18272 != null && abstractC23903M18272.f77452 == EnumC10477.f35865) || abstractC23903M18272.f77452 == EnumC10477.f35866)) {
            z = true;
        } else {
            z = true;
            abstractC16579M52422 = c23800.m52422(abstractC16579M52422, true);
        }
        if (abstractC23903M18272.f77452 == enumC10479) {
            C6263 c6263 = (C6263) abstractC23903M18272;
            m18275(c23570, this.f22814, c6263, z);
            if (C21059.f68590.m47468(this.f22804.f5039)) {
                m18314(c23570, c6263, c23570.f76357, this.f22814);
            }
        }
        if (abstractC23903M9471 != null && abstractC23903M9471.f77452 == enumC10479 && ((C6263) abstractC23903M9471).m17329() && abstractC23903M18272.f77452 == EnumC10477.f35879 && abstractC23903M18272.f77453.equals(c23942.f77582) && abstractC23903M18272.mo42453(c3836.f14297, abstractC23903M9471.f77449.f53222, c23800, true)) {
            C16826 c16826 = ((C22990) this.f22814.f16299).f74715;
            EnumC0597 enumC0597 = EnumC0597.TRY;
            if (c16826.m39467(enumC0597)) {
                c20414.m48203(enumC0597, c23570, C9768.f32851);
            }
        }
        EnumC10477 enumC104710 = abstractC23903M18272.f77452;
        EnumC10477 enumC104711 = EnumC10477.f35865;
        if (enumC104710 == enumC104711 && (abstractC23903M9471 == null || !abstractC23903M9471.f77452.m26580(C21059.f68587))) {
            c23570.f30190 = m18301(c23570.f76357, this.f22804.f5036, abstractC23903M9471 == null ? C21059.f68595 : abstractC23903M9471.f77452.m26582(), new C1116(this, C21059.f68587, this.f22804.f5036));
        }
        C20145 c20145 = this.f22822;
        C21017 c21017 = this.f22834;
        if (abstractC23903M9471 != null && abstractC23903M9471.f77452 == enumC104711) {
            if (abstractC23903M18272.f77453 == c23942.f77533) {
                C4603 c4604 = this.f22814;
                if (((C22990) c4604.f16299).f74710 && abstractC16579M52422.f53222 == c4604.f16301.f30086) {
                    c21017.m47347(c23570, abstractC23903M18272);
                }
            } else {
                if ((abstractC23903M18272.mo20276() & 8) == 0 && abstractC23903M18272.f77453 != abstractC11245 && ((enumC10477 = abstractC23903M18272.f77452) == enumC10479 || enumC10477 == EnumC10477.f35879)) {
                    C13638.requireNonNull(c20145);
                    c20145.m45545((AbstractC23903) new C10267(abstractC23903M18272, c20145), (InterfaceC12260) c23570, (AbstractC23903) abstractC16579M52422.f53222, abstractC16579M52422, abstractC23903M18272.f77453, true);
                }
                if (!this.f22836 && abstractC23903M9471.m52721() && abstractC23903M18272.mo22992() && abstractC23903M18272.f77452 == EnumC10477.f35879) {
                    c20414.m48193(EnumC0264.SOURCE_LEVEL, c23570, EnumC14026.f46116.m33943(this.f22817));
                }
            }
            if (!this.f22836) {
                c20414.m48193(EnumC0264.SOURCE_LEVEL, c23570, EnumC14026.f46116.m33943(this.f22817));
            }
        } else if (abstractC23903M18272.f77452 != EnumC10477.f35866 && (abstractC23903M18272.mo20276() & 8) != 0 && abstractC23903M18272.f77453 != abstractC11244) {
            EnumC7654 enumC7654M26577 = abstractC23903M18272.f77452.m26577();
            AbstractC23903 abstractC23903 = abstractC23903M18272.f77448;
            C14065 c14065 = C9768.f32836;
            c21017.m47315(c23570, new C14065("compiler", "static.not.qualified.by.type", enumC7654M26577, abstractC23903));
        }
        if (((C22990) this.f22814.f16299).f74723 && (abstractC23903M18272.mo20276() & 8) == 0) {
            c20145.m45550(c23570, abstractC23903M18272);
            if (!abstractC16579M52422.mo1936() || (abstractC16579M52423 = c23800.m52423(abstractC16579M52422.f53222, this.f22814.f16301.f30086.f77449)) == null) {
                abstractC16579 = abstractC16579M52422;
            } else {
                abstractC16579 = abstractC16579M52423;
            }
        } else {
            abstractC16579 = abstractC16579M52422;
        }
        C22990 c22991 = (C22990) this.f22814.f16299;
        if (c22991.f74719) {
            c21017.m47280(c23570, c22991.f74712);
        }
        C4603 c4605 = this.f22814;
        ((C22990) c4605.f16299).f74723 = z2;
        this.f22800 = m18302(c23570, abstractC16579, abstractC23903M18272, c4605, this.f22804);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23903 m18272(C23570 c23570, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, C4603 c4603, C1116 c1116) {
        AbstractC23903 c23466;
        AbstractC11242 abstractC11242 = c23570.f76356;
        int i = C10415.f35607[abstractC16579.mo1933().ordinal()];
        C20145 c20145 = this.f22822;
        C20414 c20414 = this.f22832;
        C23942 c23942 = this.f22815;
        C23800 c23800 = this.f22802;
        C3836 c3836 = this.f22806;
        switch (i) {
            case 1:
                AbstractC0618 abstractC0618 = abstractC16579.f53222;
                C21059 c21059 = c1116.f5039;
                C20145 c20146 = this.f22822;
                return c20146.m45545(c20146.m45544(c23570, c4603, abstractC0618, abstractC11242, c21059), (InterfaceC12260) c23570, abstractC23903, abstractC16579, abstractC11242, true);
            case 2:
            case 3:
                AbstractC16579 abstractC165710 = c1116.f5036;
                if (abstractC165710.m39001(EnumC6617.METHOD) || abstractC165710.m39001(EnumC6617.FORALL)) {
                    return this.f22822.m45543(c23570, c4603, abstractC23903, abstractC16579, abstractC11242, abstractC165710.mo33523(), abstractC165710.mo1938());
                }
                if (abstractC11242 == c23942.f77533 || abstractC11242 == c23942.f77638) {
                    return c20145.m45541(c23570, c4603, abstractC16579.f53222, abstractC11242);
                }
                if (abstractC11242 == c23942.f77615) {
                    return c3836.m11145(abstractC16579, c23800);
                }
                return this.f22822.m45545(this.f22822.m45540(c23570, c4603, abstractC16579, abstractC11242, c1116.f5039), (InterfaceC12260) c23570, abstractC23903, abstractC16579, abstractC11242, true);
            case 4:
                throw new AssertionError(c23570);
            case 5:
                AbstractC23903 abstractC23903M18272 = abstractC16579.mo18112() != null ? m18272(c23570, abstractC23903, c23800.m52419(abstractC16579.mo18112()), c4603, c1116) : null;
                if (abstractC23903M18272 == null) {
                    c20414.m48199(c23570, C23879.f77183);
                    return c3836.f14276;
                }
                if ((abstractC23903M18272.mo20276() & 2) != 0) {
                    C13638.requireNonNull(c20145);
                    c23466 = new C23466(c20145, c4603, abstractC16579, abstractC23903M18272);
                } else {
                    c23466 = abstractC23903M18272;
                }
                this.f22822.m45545(c23466, (InterfaceC12260) c23570, abstractC23903, abstractC16579, abstractC11242, true);
                return abstractC23903M18272;
            case 6:
                AbstractC0618 abstractC0619 = abstractC16579.f53222;
                c23800.getClass();
                return C23800.m52331(abstractC11242, abstractC0619, abstractC16579).f53222;
            default:
                if (abstractC11242 == c23942.f77615) {
                    return c3836.m11145(abstractC16579, c23800);
                }
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c23570, new C5909("compiler", "cant.deref", abstractC16579));
                return c3836.f14276;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18302(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C4603 c4603, C1116 c1116) {
        if (!c1116.f5036.m39001(EnumC6617.FORALL) && !c1116.f5036.m39001(EnumC6617.METHOD)) {
            return m18303(abstractC8774, abstractC16579, abstractC23903, c1116.f5036, c4603, c1116);
        }
        if (c1116.f5039.m47467(C21059.f68589)) {
            return this.f22838.m19954(abstractC8774, abstractC16579, abstractC23903, c4603, c1116);
        }
        return m18303(abstractC8774, abstractC16579, abstractC23903, c1116.f5036, c4603, c1116);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18303(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, AbstractC16579 abstractC165710, C4603 c4603, C1116 c1116) {
        AbstractC16579 c0309;
        AbstractC16579 abstractC16579M52409;
        AbstractC23903 abstractC23903M9471;
        AbstractC11242 abstractC11242;
        AbstractC16579 abstractC16579M52372;
        boolean zMo1926 = abstractC165710.mo1926();
        C23800 c23800 = this.f22802;
        if (zMo1926) {
            return c23800.m52440(abstractC16579);
        }
        int i = C10415.f35608[abstractC23903.f77452.ordinal()];
        C23942 c23942 = this.f22815;
        C21017 c21017 = this.f22834;
        switch (i) {
            case 8:
                c0309 = abstractC23903.f77449;
                EnumC6617 enumC6617 = EnumC6617.CLASS;
                if (c0309.m39001(enumC6617)) {
                    abstractC8774.getClass();
                    c21017.m47286(abstractC8774, c4603, (C22492) abstractC23903);
                    AbstractC16579 abstractC16579Mo1934 = c0309.mo1934();
                    if (c0309.f53222.f77449.mo1938().m48595()) {
                        c0309 = c23800.m52402(c0309);
                    } else if (abstractC16579Mo1934.m39001(enumC6617) && abstractC16579 != abstractC16579Mo1934) {
                        AbstractC16579 abstractC16579M52369 = abstractC16579.m39001(enumC6617) ? c23800.m52369(abstractC16579, abstractC16579Mo1934.f53222) : abstractC16579;
                        if (abstractC16579M52369 == null) {
                            abstractC16579M52369 = c23800.m52402(abstractC16579Mo1934);
                        }
                        if (abstractC16579M52369 != abstractC16579Mo1934) {
                            c0309 = new C0309(abstractC16579M52369, C21825.m48588(), c0309.f53222, c0309.m39010());
                        }
                    }
                }
                break;
            case 9:
                C6263 c6263 = (C6263) abstractC23903;
                if (((C22990) c4603.f16299).f74718 != null && c6263.f77449.m39001(EnumC6617.NONE)) {
                    AbstractC8774 abstractC8775 = c4603.f16301;
                    AbstractC8774 abstractC8774M9439 = C3128.m9439(c6263, abstractC8775);
                    if (abstractC8774M9439 != null) {
                        abstractC8775 = abstractC8774M9439;
                    }
                    this.f22832.m48188(abstractC8775.f30189, C23879.m52620(c6263.f77453, C14707.f48093));
                    C5954 c5954M52440 = c23800.m52440(c6263.f77449);
                    c6263.f77449 = c5954M52440;
                    return c5954M52440;
                }
                if (C21059.f68590.m47468(this.f22804.f5039) && c6263.f77448.f77452 == EnumC10477.f35865 && (c6263.f77447 & 8) == 0 && ((abstractC16579.m39001(EnumC6617.CLASS) || abstractC16579.m39001(EnumC6617.TYPEVAR)) && (abstractC16579M52372 = c23800.m52372(c6263.f77448, abstractC16579)) != null && abstractC16579M52372.mo1936() && !c23800.m52399(c6263.f77449, c6263.mo50006(c23800)))) {
                    abstractC8774.getClass();
                    C14065 c14065 = C9768.f32836;
                    c21017.m47346(abstractC8774, new C14065("compiler", "unchecked.assign.to.var", c6263, abstractC16579M52372));
                }
                EnumC10477 enumC10477 = abstractC23903.f77448.f77452;
                EnumC10477 enumC10478 = EnumC10477.f35865;
                if (enumC10477 == enumC10478 && (abstractC11242 = abstractC23903.f77453) != c23942.f77533 && abstractC11242 != c23942.f77638) {
                    abstractC16579M52409 = c23800.m52409(abstractC23903, abstractC16579);
                } else {
                    abstractC16579M52409 = abstractC23903.f77449;
                }
                c0309 = (c6263.m17332() == null || (abstractC8774.m22847(EnumC18651.f60473) && ((abstractC23903M9471 = C3128.m9471(((C23570) abstractC8774).f76357)) == null || abstractC23903M9471.f77452 != enumC10478))) ? abstractC16579M52409 : abstractC16579M52409.mo1930(c6263.m17332());
                if (c1116.f5039 == C21059.f68595) {
                    c0309 = c23800.m52419(c0309);
                }
                break;
                break;
            case 10:
                C21059 c21059 = c1116.f5039;
                AbstractC16579 abstractC165711 = c1116.f5036;
                c0309 = m18307(abstractC16579, abstractC23903, new C1116(this, c21059, abstractC165711.mo16235(), c1116.f5037, c1116.f5040), c4603, C3128.m9445(c4603.f16296), abstractC165711.mo33523(), abstractC165711.mo1938());
                break;
            case 11:
            case 12:
                c0309 = abstractC23903.f77449;
                break;
            default:
                throw new AssertionError("unexpected kind: " + abstractC23903.f77452 + " in tree " + abstractC8774);
        }
        if (abstractC23903.f77453 != c23942.f77632 || abstractC8774.m22847(EnumC18651.f60512)) {
            abstractC8774.getClass();
            AbstractC23903 abstractC23904 = ((C22990) c4603.f16299).f74722.f11719;
            c21017.getClass();
            c21017.m47273(new C2672(abstractC8774), abstractC23904, abstractC23903);
            c21017.m47335(abstractC23903, abstractC8774);
            c21017.m47350(abstractC23903, abstractC8774);
            c21017.m47299(abstractC8774, ((C22990) c4603.f16299).f74722.f11719, abstractC23903);
        }
        return m18301(abstractC8774, c0309, abstractC23903.f77452.m26582(), c1116);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18275(AbstractC5930 abstractC5930, C4603 c4603, C6263 c6263, boolean z) {
        C22492 c22492M52720;
        C14065 c14065;
        C4603 c4604 = c4603;
        while (true) {
            switch (C10415.f35605[c4604.f16296.mo1803().ordinal()]) {
                case 15:
                case 16:
                case 21:
                    c4604 = null;
                    break;
                case 17:
                case 18:
                default:
                    continue;
                    C6171.m17171(c4604.f16297);
                    c4604 = c4604.f16297;
                    break;
                case 19:
                    if (((C6656) c4604.f16296).f22475.f77448.f77452 != EnumC10477.f35865) {
                        C6171.m17171(c4604.f16297);
                        c4604 = c4604.f16297;
                    }
                    break;
                case 20:
                    if (!c4604.f16297.f16296.m22847(EnumC18651.f60468)) {
                        C6171.m17171(c4604.f16297);
                        c4604 = c4604.f16297;
                    }
                    break;
            }
        }
        C20414 c20414 = this.f22832;
        if (c4604 != null) {
            C22990 c22990 = (C22990) c4604.f16299;
            if (c22990.f74718 == c6263 || c6263.f21226 > abstractC5930.f30189) {
                AbstractC23903 abstractC23903 = c6263.f77448;
                if (abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903 == ((C22990) c4603.f16299).f74722.f11719.m52720()) {
                    if (((c6263.f77447 & 8) != 0) == C20145.m45514(c4603) && (!c4603.f16296.m22847(EnumC18651.f60510) || C3128.m9461(((C3812) c4603.f16296).f14145) != abstractC5930)) {
                        if (!z || m18287(c6263)) {
                            c20414.m48199(abstractC5930, c22990.f74718 == c6263 ? C23879.f77245 : C23879.f77255);
                        } else if (this.f22825) {
                            if (c22990.f74718 == c6263) {
                                C14065 c14066 = C9768.f32836;
                                c14065 = new C14065("compiler", "self.ref", c6263);
                            } else {
                                C14065 c14067 = C9768.f32836;
                                c14065 = new C14065("compiler", "forward.ref", c6263);
                            }
                            c20414.m48204(abstractC5930, c14065);
                        }
                    }
                }
            }
        }
        c6263.m17332();
        if (!m18287(c6263) || (c22492M52720 = ((C22990) c4603.f16299).f74722.f11719.m52720()) == null || c22492M52720.f77448 == null) {
            return;
        }
        AbstractC23903 abstractC23904 = c6263.f77448;
        if (abstractC23904 == c22492M52720 || this.f22802.m52413(c22492M52720.f77449, abstractC23904.f77449, true)) {
            C16576 c16576 = C20145.f65404;
            AbstractC23903 abstractC23905 = ((C22990) c4603.f16299).f74722.f11719;
            if (!abstractC23905.m52713()) {
                if (abstractC23905.f77448.f77452 != EnumC10477.f35865) {
                    return;
                }
                EnumC10477 enumC10477 = abstractC23905.f77452;
                if ((enumC10477 != EnumC10477.f35878 && (enumC10477 != EnumC10477.f35879 || (abstractC23905.mo20276() & 1048576) == 0)) || (abstractC23905.mo20276() & 8) != 0) {
                    return;
                }
            }
            c20414.m48199(abstractC5930, C23879.f77304);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18287(C6263 c6263) {
        AbstractC23903 abstractC23903 = c6263.f77448;
        int i = C8360.f28995;
        return ((abstractC23903.mo20276() & 16384) == 0 || (c6263.f77447 & 8) == 0 || c6263.m17332() != null || c6263.f77453 == this.f22815.f77615) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0297 A[Catch: ֨ܰ۟ -> 0x02c1, ܿ᩻ۤ -> 0x02c5, TryCatch #0 {ܿ᩻ۤ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:147:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1 A[Catch: ֨ܰ۟ -> 0x02c1, ܿ᩻ۤ -> 0x02c5, TryCatch #0 {ܿ᩻ۤ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:147:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e A[Catch: ܿ᩻ۤ -> 0x0283, ֨ܰ۟ -> 0x02c7, TRY_ENTER, TryCatch #15 {֨ܰ۟ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:170:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0289 A[Catch: ֨ܰ۟ -> 0x02c7, ܿ᩻ۤ -> 0x02cd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ܿ᩻ۤ -> 0x02cd, blocks: (B:90:0x0264, B:98:0x0289), top: B:153:0x0264 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18307(AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C1116 c1116, C4603 c4603, C21825 c21825, C21825 c21826, C21825 c21827) {
        InterfaceC18195 interfaceC18195;
        C21825 c21828;
        C20414 c20414;
        Object obj;
        C4603 c4604;
        C21825 c21829;
        C23800 c23800;
        C21825 c218210;
        AbstractC16579 c13757;
        EnumC0615 enumC0615;
        EnumC11678 enumC11678;
        boolean z;
        Object obj2;
        AbstractC16579 abstractC16579M52372;
        InterfaceC18195 interfaceC18196 = c1116.f5037;
        C20145 c20145 = this.f22822;
        long jMo20276 = abstractC23903.mo20276() & 8;
        C21017 c21017 = this.f22834;
        C23800 c23801 = this.f22802;
        if (jMo20276 == 0 && ((abstractC16579.m39001(EnumC6617.CLASS) || abstractC16579.m39001(EnumC6617.TYPEVAR)) && (abstractC16579M52372 = c23801.m52372(abstractC23903.f77448, abstractC16579)) != null && abstractC16579M52372.mo1936() && !c23801.m52401(abstractC23903.f77449.mo33523(), abstractC23903.mo50006(c23801).mo33523()))) {
            AbstractC8774 abstractC8774 = c4603.f16296;
            abstractC8774.getClass();
            C14065 c14065 = C9768.f32836;
            c21017.m47346(abstractC8774, new C14065("compiler", "unchecked.call.mbr.of.raw.type", abstractC23903, abstractC16579M52372));
        }
        Object obj3 = c4603.f16299;
        AbstractC16579 abstractC165710 = ((C22990) obj3).f74720;
        C20414 c20415 = this.f22832;
        if (abstractC165710 != null) {
            Iterator it = c23801.m52439(c4603.f16301.f30190).m48597(c23801.m52432(c4603.f16301.f30190)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC18195 = interfaceC18196;
                    break;
                }
                AbstractC16579 abstractC165711 = (AbstractC16579) it.next();
                if (abstractC165711.f53222.mo50008((AbstractC23903) abstractC23903.m52720(), c23801)) {
                    C22990 c22990 = (C22990) obj3;
                    if (c23801.m52399(abstractC165711, c22990.f74720)) {
                        interfaceC18195 = interfaceC18196;
                    } else {
                        C21825 c21825M52376 = c23801.m52376(abstractC165711, (C18258) abstractC23903);
                        if (!c21825M52376.m48595() || (obj2 = c21825M52376.f70876) == abstractC23903) {
                            interfaceC18195 = interfaceC18196;
                        } else {
                            C18258 c18258 = (C18258) obj2;
                            interfaceC18195 = interfaceC18196;
                            if (c18258.mo42453(abstractC23903, c18258.m52720(), c23801, true)) {
                                AbstractC8774 abstractC8775 = c4603.f16296;
                                abstractC8775.getClass();
                                AbstractC16579 abstractC165712 = c22990.f74720;
                                C14377 c14377 = C14707.f48054;
                                C14377 c14378 = new C14377("compiler", "overridden.default", abstractC23903, abstractC165711);
                                C5909 c5909 = C23879.f77204;
                                c20415.m48199(abstractC8775, new C5909("compiler", "illegal.default.super.call", abstractC165712, c14378));
                                break;
                            }
                        }
                    }
                } else {
                    interfaceC18195 = interfaceC18196;
                }
                it = it;
                interfaceC18196 = interfaceC18195;
                c23801 = c23801;
            }
            ((C22990) obj3).f74720 = null;
        } else {
            c23801 = c23801;
            interfaceC18195 = interfaceC18196;
        }
        if (abstractC23903.mo22992() && abstractC16579.mo16236() && c4603.f16296.m22847(EnumC18651.f60539)) {
            C15434 c15434 = (C15434) c4603.f16296;
            if (c15434.f50296.m22847(EnumC18651.f60473) && !C3128.m9451(((C23570) c15434.f50296).f76357, this.f22815)) {
                AbstractC8774 abstractC8776 = c4603.f16296;
                abstractC8776.getClass();
                C5909 c59010 = C23879.f77204;
                c20415.m48199(abstractC8776, new C5909("compiler", "illegal.static.intf.meth.call", abstractC16579));
            }
        }
        C10391 c10391 = new C10391();
        try {
            obj = obj3;
            c20414 = c20415;
            try {
                try {
                    AbstractC16579 abstractC16579M45525 = this.f22822.m45525(c4603, abstractC16579, abstractC23903, c1116, c21826, c21827, c10391);
                    AbstractC16579 abstractC165713 = c1116.f5036;
                    C5870 c5870 = this.f22830;
                    C13638.requireNonNull(c5870);
                    try {
                        C7281 c7281 = new C7281(c5870, EnumC9729.CHECK, abstractC23903, ((C22990) obj).f74727);
                        c21828 = c21826;
                        try {
                            C21825 c21825M48592 = c21828.m48592((Function) c7281);
                            try {
                                try {
                                    try {
                                        try {
                                            if (c10391.m26293(EnumC0597.UNCHECKED)) {
                                                try {
                                                    try {
                                                        AbstractC8774 abstractC8777 = c4603.f16296;
                                                        abstractC8777.getClass();
                                                        EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
                                                        AbstractC11242 abstractC11242 = abstractC23903.f77453;
                                                        Object objM45522 = c20145.m45522(abstractC23903.f77449.mo33523());
                                                        Object objM45523 = c20145.m45522(c21825M48592.m48592((Function) c7281));
                                                        EnumC7654 enumC7654M38161 = C16121.m38160(abstractC23903.m52708());
                                                        AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
                                                        try {
                                                            C14065 c14066 = C9768.f32836;
                                                            c20145 = c20145;
                                                            try {
                                                                c218210 = c21825M48592;
                                                                try {
                                                                    c21017.m47346(abstractC8777, new C14065("compiler", "unchecked.meth.invocation.applied", enumC7654M38160, abstractC11242, objM45522, objM45523, enumC7654M38161, abstractC23903M52708));
                                                                    try {
                                                                        try {
                                                                            if (abstractC165713 == C13174.f43856) {
                                                                                try {
                                                                                    if (!abstractC16579M45525.m39001(EnumC6617.METHOD) || !abstractC16579M45525.mo14987()) {
                                                                                    }
                                                                                    if (abstractC23903.f77449.m39001(EnumC6617.FORALL) || !abstractC23903.f77449.mo16235().m39005(((C10894) abstractC23903.f77449).f37076)) {
                                                                                        enumC0615 = EnumC0615.STANDALONE;
                                                                                    } else {
                                                                                        enumC0615 = EnumC0615.POLY;
                                                                                    }
                                                                                    c4604 = c4603;
                                                                                    C3128.m9447(c4604.f16296, enumC0615);
                                                                                    if (abstractC165713 == C13174.f43856) {
                                                                                        return c13757;
                                                                                    }
                                                                                    C21017 c21018 = this.f22834;
                                                                                    enumC11678 = ((C22990) obj).f74727;
                                                                                    if (enumC11678 == null && enumC11678.m29179()) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    c21829 = c218210;
                                                                                    try {
                                                                                        c21018.m47300(c13757, abstractC23903, c4603, c21825, c218210, z, interfaceC18195.mo4574());
                                                                                        return c13757;
                                                                                    } catch (C1155 e) {
                                                                                        e = e;
                                                                                        C11948 c11948Mo4255 = e.mo4255();
                                                                                        C13638.requireNonNull(c20145);
                                                                                        C20145 c20146 = c20145;
                                                                                        C19587 c19587 = new C19587(c20146, abstractC23903, c11948Mo4255);
                                                                                        EnumC9729 enumC9729 = EnumC9729.CHECK;
                                                                                        EnumC11678 enumC11679 = ((C22990) obj).f74727;
                                                                                        C5870 c5871 = c20146.f65438;
                                                                                        C13638.requireNonNull(c5871);
                                                                                        c20414.mo46176(c19587.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5871, enumC9729, abstractC23903, enumC11679)), c21827));
                                                                                        return c23801.m52440(abstractC16579);
                                                                                    }
                                                                                } catch (C1155 e2) {
                                                                                    e = e2;
                                                                                    c21829 = c218210;
                                                                                    c4604 = c4603;
                                                                                    c23801 = c23801;
                                                                                    C11948 c11948Mo4256 = e.mo4255();
                                                                                    C13638.requireNonNull(c20145);
                                                                                    C20145 c20147 = c20145;
                                                                                    C19587 c19588 = new C19587(c20147, abstractC23903, c11948Mo4256);
                                                                                    EnumC9729 enumC97210 = EnumC9729.CHECK;
                                                                                    EnumC11678 enumC116710 = ((C22990) obj).f74727;
                                                                                    C5870 c5872 = c20147.f65438;
                                                                                    C13638.requireNonNull(c5872);
                                                                                    c20414.mo46176(c19588.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5872, enumC97210, abstractC23903, enumC116710)), c21827));
                                                                                    return c23801.m52440(abstractC16579);
                                                                                }
                                                                            }
                                                                            c13757 = new C13757(abstractC16579M45525.mo33523(), c23801.m52402(abstractC16579M45525.mo16235()), c23801.m52424(abstractC16579M45525.mo33524()), this.f22806.f14240);
                                                                            if (abstractC23903.f77449.m39001(EnumC6617.FORALL)) {
                                                                                enumC0615 = EnumC0615.STANDALONE;
                                                                            } else {
                                                                                enumC0615 = EnumC0615.STANDALONE;
                                                                            }
                                                                            c4604 = c4603;
                                                                            C3128.m9447(c4604.f16296, enumC0615);
                                                                            if (abstractC165713 == C13174.f43856) {
                                                                                return c13757;
                                                                            }
                                                                            C21017 c21019 = this.f22834;
                                                                            enumC11678 = ((C22990) obj).f74727;
                                                                            if (enumC11678 == null) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            c21829 = c218210;
                                                                            c21019.m47300(c13757, abstractC23903, c4603, c21825, c218210, z, interfaceC18195.mo4574());
                                                                            return c13757;
                                                                        } catch (C1155 e3) {
                                                                            e = e3;
                                                                            c21829 = c218210;
                                                                            c4604 = c4603;
                                                                            C11948 c11948Mo4257 = e.mo4255();
                                                                            C13638.requireNonNull(c20145);
                                                                            C20145 c20148 = c20145;
                                                                            C19587 c19589 = new C19587(c20148, abstractC23903, c11948Mo4257);
                                                                            EnumC9729 enumC97211 = EnumC9729.CHECK;
                                                                            EnumC11678 enumC116711 = ((C22990) obj).f74727;
                                                                            C5870 c5873 = c20148.f65438;
                                                                            C13638.requireNonNull(c5873);
                                                                            c20414.mo46176(c19589.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5873, enumC97211, abstractC23903, enumC116711)), c21827));
                                                                            return c23801.m52440(abstractC16579);
                                                                        }
                                                                    } catch (C17677 e4) {
                                                                        e = e4;
                                                                        c4604 = c4603;
                                                                        c23800 = c23801;
                                                                        AbstractC8774 abstractC8778 = c4604.f16296;
                                                                        abstractC8778.getClass();
                                                                        interfaceC18195.mo2545(abstractC8778, e.mo4255());
                                                                        return c23800.m52440(abstractC16579);
                                                                    }
                                                                    c23801 = c23801;
                                                                } catch (C1155 e5) {
                                                                    e = e5;
                                                                    c23801 = c23801;
                                                                    c21829 = c218210;
                                                                    c4604 = c4603;
                                                                    C11948 c11948Mo4258 = e.mo4255();
                                                                    C13638.requireNonNull(c20145);
                                                                    C20145 c20149 = c20145;
                                                                    C19587 c195810 = new C19587(c20149, abstractC23903, c11948Mo4258);
                                                                    EnumC9729 enumC97212 = EnumC9729.CHECK;
                                                                    EnumC11678 enumC116712 = ((C22990) obj).f74727;
                                                                    C5870 c5874 = c20149.f65438;
                                                                    C13638.requireNonNull(c5874);
                                                                    c20414.mo46176(c195810.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5874, enumC97212, abstractC23903, enumC116712)), c21827));
                                                                    return c23801.m52440(abstractC16579);
                                                                }
                                                            } catch (C1155 e6) {
                                                                e = e6;
                                                                c218210 = c21825M48592;
                                                            }
                                                        } catch (C1155 e7) {
                                                            e = e7;
                                                            c218210 = c21825M48592;
                                                            c20145 = c20145;
                                                        }
                                                    } catch (C17677 e8) {
                                                        e = e8;
                                                        abstractC16579 = abstractC16579;
                                                        c4604 = c4603;
                                                        c23800 = c23801;
                                                        AbstractC8774 abstractC8779 = c4604.f16296;
                                                        abstractC8779.getClass();
                                                        interfaceC18195.mo2545(abstractC8779, e.mo4255());
                                                        return c23800.m52440(abstractC16579);
                                                    }
                                                } catch (C1155 e9) {
                                                    e = e9;
                                                    c4604 = c4603;
                                                    c21829 = c21825M48592;
                                                    C11948 c11948Mo4259 = e.mo4255();
                                                    C13638.requireNonNull(c20145);
                                                    C20145 c201410 = c20145;
                                                    C19587 c195811 = new C19587(c201410, abstractC23903, c11948Mo4259);
                                                    EnumC9729 enumC97213 = EnumC9729.CHECK;
                                                    EnumC11678 enumC116713 = ((C22990) obj).f74727;
                                                    C5870 c5875 = c201410.f65438;
                                                    C13638.requireNonNull(c5875);
                                                    c20414.mo46176(c195811.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5875, enumC97213, abstractC23903, enumC116713)), c21827));
                                                    return c23801.m52440(abstractC16579);
                                                }
                                            } else {
                                                c218210 = c21825M48592;
                                                c20145 = c20145;
                                            }
                                            C3128.m9447(c4604.f16296, enumC0615);
                                            if (abstractC165713 == C13174.f43856) {
                                                return c13757;
                                            }
                                            C21017 c210110 = this.f22834;
                                            enumC11678 = ((C22990) obj).f74727;
                                            if (enumC11678 == null) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            c21829 = c218210;
                                            c210110.m47300(c13757, abstractC23903, c4603, c21825, c218210, z, interfaceC18195.mo4574());
                                            return c13757;
                                        } catch (C17677 e10) {
                                            e = e10;
                                            c23800 = c23801;
                                            AbstractC8774 abstractC87710 = c4604.f16296;
                                            abstractC87710.getClass();
                                            interfaceC18195.mo2545(abstractC87710, e.mo4255());
                                            return c23800.m52440(abstractC16579);
                                        }
                                    } catch (C1155 e11) {
                                        e = e11;
                                        c21829 = c218210;
                                    }
                                    if (abstractC23903.f77449.m39001(EnumC6617.FORALL)) {
                                        enumC0615 = EnumC0615.STANDALONE;
                                    } else {
                                        enumC0615 = EnumC0615.STANDALONE;
                                    }
                                    c4604 = c4603;
                                } catch (C17677 e12) {
                                    e = e12;
                                    c4604 = c4603;
                                }
                                c23801 = c23801;
                                c13757 = abstractC16579M45525;
                            } catch (C1155 e13) {
                                e = e13;
                                c4604 = c4603;
                            }
                        } catch (C1155 e14) {
                            e = e14;
                            c4604 = c4603;
                            c20145 = c20145;
                            c23801 = c23801;
                            c21829 = c21828;
                            C11948 c11948Mo42510 = e.mo4255();
                            C13638.requireNonNull(c20145);
                            C20145 c201411 = c20145;
                            C19587 c195812 = new C19587(c201411, abstractC23903, c11948Mo42510);
                            EnumC9729 enumC97214 = EnumC9729.CHECK;
                            EnumC11678 enumC116714 = ((C22990) obj).f74727;
                            C5870 c5876 = c201411.f65438;
                            C13638.requireNonNull(c5876);
                            c20414.mo46176(c195812.mo8964(EnumC17198.ERROR, c4604.f16296, abstractC23903, abstractC16579, abstractC23903.f77453, c21829.m48592((Function) new C19439(c5876, enumC97214, abstractC23903, enumC116714)), c21827));
                            return c23801.m52440(abstractC16579);
                        }
                    } catch (C1155 e15) {
                        e = e15;
                        c21828 = c21826;
                    }
                } catch (C17677 e16) {
                    e = e16;
                    c4604 = c4603;
                    abstractC16579 = abstractC16579;
                }
            } catch (C1155 e17) {
                e = e17;
                c21828 = c21826;
            }
        } catch (C17677 e18) {
            e = e18;
            abstractC16579 = abstractC16579;
            c4604 = c4603;
        } catch (C1155 e19) {
            e = e19;
            c21828 = c21826;
            c20414 = c20415;
            obj = obj3;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3917(C1321 c1321) {
        EnumC6617 enumC6617 = c1321.f5611;
        EnumC6617 enumC6618 = EnumC6617.CLASS;
        C3836 c3836 = this.f22806;
        this.f22800 = m18301(c1321, (enumC6617 == enumC6618 ? c3836.f14220 : c3836.f14282[enumC6617.ordinal()]).mo1930(c1321.f5612), C21059.f68595, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3940(C12611 c12611) {
        this.f22800 = m18301(c12611, this.f22806.f14282[c12611.f42127.ordinal()], C21059.f68585, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3915(C0990 c0990) {
        this.f22800 = m18301(c0990, new C8777(m18326(c0990.f4638, this.f22814, AbstractC16579.f53219), this.f22806.f14258), C21059.f68585, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        AbstractC16579 abstractC16579M52372;
        AbstractC16579 abstractC16579 = c11596.f30190;
        C23800 c23800 = this.f22802;
        C0309 c0309M52440 = c23800.m52440(abstractC16579);
        AbstractC5930 abstractC5930 = c11596.f38963;
        abstractC5930.getClass();
        AbstractC16579 abstractC16579M18326 = m18326(c11596.f38963, this.f22814, AbstractC16579.f53219);
        C21017 c21017 = this.f22834;
        AbstractC16579 abstractC16579M47338 = c21017.m47338(abstractC5930, abstractC16579M18326);
        C21825 c21825 = c11596.f38962;
        C21825 c21825M18311 = m18311(c21825, this.f22814);
        c21017.m47304(c21825, c21825M18311);
        if (abstractC16579M47338.m39001(EnumC6617.CLASS)) {
            C21825 c21825Mo1938 = abstractC16579M47338.f53222.f77449.mo1938();
            if (c21825M18311.isEmpty()) {
                c21825M18311 = c21825Mo1938;
            }
            if (c21825M18311.m48596() == c21825Mo1938.m48596()) {
                C21825 c21826 = c21825M18311;
                while (c21826.m48595()) {
                    c21826.f70876 = ((AbstractC16579) c21826.f70876).mo2035((AbstractC16579) c21825Mo1938.f70876);
                    c21826 = c21826.f70877;
                    c21825Mo1938 = c21825Mo1938.f70877;
                }
                AbstractC16579 abstractC16579Mo1934 = abstractC16579M47338.mo1934();
                EnumC6617 enumC6617 = EnumC6617.CLASS;
                if (abstractC16579Mo1934.m39001(enumC6617)) {
                    AbstractC5930 abstractC5930M9458 = C3128.m9458(c11596.f38963);
                    if (abstractC5930M9458.m22847(EnumC18651.f60465)) {
                        abstractC16579M52372 = this.f22814.f16301.f30086.f77449;
                    } else if (abstractC5930M9458.m22847(EnumC18651.f60473)) {
                        abstractC16579M52372 = ((C23570) abstractC5930M9458).f76357.f30190;
                    } else {
                        throw new AssertionError("" + c11596);
                    }
                    if (abstractC16579Mo1934.m39001(enumC6617) && abstractC16579M52372 != abstractC16579Mo1934) {
                        if (abstractC16579M52372.m39001(enumC6617)) {
                            abstractC16579M52372 = c23800.m52372(abstractC16579Mo1934.f53222, abstractC16579M52372);
                        }
                        abstractC16579Mo1934 = abstractC16579M52372 == null ? c23800.m52402(abstractC16579Mo1934) : abstractC16579M52372;
                    }
                }
                c0309M52440 = new C0309(abstractC16579Mo1934, c21825M18311, abstractC16579M47338.f53222, abstractC16579M47338.m39010());
            } else {
                int iM48596 = c21825Mo1938.m48596();
                C20414 c20414 = this.f22832;
                if (iM48596 != 0) {
                    String string = Integer.toString(c21825Mo1938.m48596());
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c11596, new C5909("compiler", "wrong.number.type.args", string));
                } else {
                    AbstractC0618 abstractC0618 = abstractC16579M47338.f53222;
                    C5909 c59010 = C23879.f77204;
                    c20414.m48199(c11596, new C5909("compiler", "type.doesnt.take.params", abstractC0618));
                }
                c0309M52440 = c23800.m52440(c11596.f30190);
            }
        }
        this.f22800 = m18301(c11596, c0309M52440, C21059.f68585, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3916(C1011 c1011) {
        C23800 c23800;
        C19003<AbstractC16579> c19003 = new C19003();
        Iterator it = c1011.f4699.iterator();
        C19003 c19004 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c23800 = this.f22802;
            if (!zHasNext) {
                break;
            }
            AbstractC5930 abstractC5930 = (AbstractC5930) it.next();
            AbstractC16579 abstractC16579M18326 = m18326(abstractC5930, this.f22814, AbstractC16579.f53219);
            abstractC5930.getClass();
            C21017 c21017 = this.f22834;
            AbstractC16579 abstractC16579M47266 = c21017.m47266(abstractC5930, c21017.m47338(abstractC5930, abstractC16579M18326), this.f22806.f14302, c21017.f68418);
            if (!abstractC16579M47266.mo1926()) {
                if (c21017.m47336(abstractC16579M47266, c19003.m43726())) {
                    for (AbstractC16579 abstractC16579 : c19003) {
                        boolean zM52413 = c23800.m52413(abstractC16579M47266, abstractC16579, true);
                        boolean zM52414 = c23800.m52413(abstractC16579, abstractC16579M47266, true);
                        if (zM52413 || zM52414) {
                            AbstractC16579 abstractC165710 = zM52413 ? abstractC16579M47266 : abstractC16579;
                            if (!zM52413) {
                                abstractC16579 = abstractC16579M47266;
                            }
                            C5909 c5909 = C23879.f77204;
                            this.f22832.m48199(abstractC5930, new C5909("compiler", "multicatch.types.must.be.disjoint", abstractC165710, abstractC16579));
                        }
                    }
                }
                c19003.m43723(abstractC16579M47266);
                if (c19004 != null) {
                    c19004.m43723(abstractC16579M47266);
                }
            } else {
                if (c19004 == null) {
                    c19004 = new C19003();
                    c19004.m43724(c19003);
                }
                c19004.m43723(abstractC16579M47266);
            }
        }
        AbstractC16579 abstractC16579M18301 = m18301(c1011, c23800.m52397(c19003.m43726()), C21059.f68585, this.f22804.mo4133(EnumC1946.f7331));
        if (abstractC16579M18301.m39001(EnumC6617.CLASS)) {
            if (c19004 != null) {
                c19003 = c19004;
            }
            abstractC16579M18301 = new C7406((C0309) abstractC16579M18301, c19003.m43726());
        }
        this.f22800 = abstractC16579M18301;
        c1011.f30190 = abstractC16579M18301;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3926(C5245 c5245) throws Throwable {
        C21825 c21825 = c5245.f18177;
        this.f22834.m47304(c21825, m18311(c21825, this.f22814));
        AbstractC16579 abstractC16579M18304 = m18304(c5245, c5245.f18177);
        this.f22800 = abstractC16579M18304;
        c5245.f30190 = abstractC16579M18304;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        C22929 c22929 = (C22929) c22179.f30190;
        C21825 c21825 = c22179.f72546;
        if (c21825 != null && c21825.m48595()) {
            C21825 c21826 = c22179.f72546;
            C17573 c17573 = this.f22801;
            c17573.getClass();
            c17573.f55856.m43723(new RunnableC23506(2, c17573, c21826));
        }
        if (c22929.mo18112().mo1926()) {
            return;
        }
        c22929.mo18111(m18304(c22179, c22179.f72547));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m18304(AbstractC8774 abstractC8774, C21825 c21825) throws Throwable {
        AbstractC5930 abstractC5930;
        HashSet hashSet = new HashSet();
        boolean zM48595 = c21825.m48595();
        C23800 c23800 = this.f22802;
        if (zM48595) {
            Object obj = c21825.f70876;
            AbstractC5930 abstractC5931 = (AbstractC5930) obj;
            abstractC5931.f30190 = m18305(abstractC5931.f30190, (AbstractC8774) obj, false, false, false);
            hashSet.add(c23800.m52402(((AbstractC5930) c21825.f70876).f30190));
            if (((AbstractC5930) c21825.f70876).f30190.mo1926()) {
                return ((AbstractC5930) c21825.f70876).f30190;
            }
            if (((AbstractC5930) c21825.f70876).f30190.m39001(EnumC6617.TYPEVAR)) {
                if (c21825.f70877.m48595()) {
                    AbstractC5930 abstractC5932 = (AbstractC5930) c21825.f70877.f70876;
                    abstractC5932.getClass();
                    this.f22832.m48199(abstractC5932, C23879.f77244);
                    return ((AbstractC5930) c21825.f70876).f30190;
                }
            } else {
                for (AbstractC5930 abstractC5933 : c21825.f70877) {
                    AbstractC16579 abstractC16579M18305 = m18305(abstractC5933.f30190, (AbstractC8774) abstractC5933, false, true, false);
                    abstractC5933.f30190 = abstractC16579M18305;
                    if (abstractC16579M18305.mo1926()) {
                        c21825 = C21825.of((Object) abstractC5933);
                    } else if (abstractC5933.f30190.m39001(EnumC6617.CLASS)) {
                        this.f22834.m47278(abstractC5933, c23800.m52402(abstractC5933.f30190), hashSet);
                    }
                }
            }
        }
        if (c21825.m48596() == 0) {
            return this.f22806.f14275;
        }
        if (c21825.m48596() == 1) {
            return ((AbstractC5930) c21825.f70876).f30190;
        }
        C23594 c23594M52442 = c23800.m52442(C3128.m9446(c21825));
        if (((AbstractC5930) c21825.f70876).f30190.mo16236()) {
            abstractC5930 = null;
        } else {
            abstractC5930 = (AbstractC5930) c21825.f70876;
            c21825 = c21825.f70877;
        }
        C5286 c5286 = this.f22794;
        c5286.m14629((InterfaceC12260) abstractC8774);
        C8753 c8753M14601 = c5286.m14601(c5286.m14618(1025L), this.f22815.f77594, C21825.m48588(), abstractC5930, c21825, C21825.m48588());
        C22492 c22492 = (C22492) c23594M52442.f53222;
        c22492.mo49994();
        C6171.m17176((c22492.f77447 & 16777216) != 0);
        c8753M14601.f30086 = c22492;
        C4603 c4603 = this.f22814;
        c22492.f73415 = c4603.f16295.f34725;
        c22492.f77447 |= 268435456;
        this.f22812.getClass();
        this.f22820.m28680(c22492, C9399.m24137(c4603, c8753M14601));
        m18320(c22492);
        return c23594M52442;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3946(C15124 c15124) {
        AbstractC16579 abstractC16579M18326;
        EnumC15395 enumC15395 = c15124.f49399.f28284;
        EnumC15395 enumC15396 = EnumC15395.UNBOUND;
        C3836 c3836 = this.f22806;
        if (enumC15395 != enumC15396) {
            abstractC16579M18326 = m18326(c15124.f49398, this.f22814, AbstractC16579.f53219);
        } else {
            abstractC16579M18326 = c3836.f14275;
        }
        this.f22800 = m18301(c15124, new C0350(this.f22834.m47256(c15124, abstractC16579M18326), c15124.f49399.f28284, c3836.f14239), C21059.f68585, this.f22804);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        C6171.m17174("should be handled in annotate");
        throw null;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        C4603 c4603 = this.f22814;
        for (C21825 c21825 = c2401.f9658; c21825.m48595(); c21825 = c21825.f70877) {
            m18326(((C5224) c21825.f70876).f18121, c4603, AbstractC16579.f53219);
        }
        final AbstractC16579 abstractC16579Mo29058 = m18326(c2401.f9659, this.f22814, AbstractC16579.f53219).mo29058(C22140.f71664);
        if (!((C22990) this.f22814.f16299).f74726) {
            final C21825 c21826 = c2401.f9658;
            final C17573 c17573 = this.f22801;
            c17573.getClass();
            c17573.f55856.m43723(new Runnable() { // from class: l.ᩴ᩶ۤ
                @Override // java.lang.Runnable
                public final void run() {
                    c17573.getClass();
                    C21825 c21827 = c21826;
                    C21825 c21825M40853 = C17573.m40853(c21827);
                    C6171.m17176(c21827.m48596() == c21825M40853.m48596());
                    abstractC16579Mo29058.m38999(EnumC0972.ANNOTATIONS).mo32097(new C22140(c21825M40853));
                }
            });
        }
        c2401.f30190 = abstractC16579Mo29058;
        this.f22800 = abstractC16579Mo29058;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3939(C12281 c12281) {
        C21825 c21825 = c12281.f41061;
        if (c21825 != null) {
            C4603 c4603 = this.f22814;
            C4603 c4603M12747 = c4603.m12747(c4603.f16296, c4603.f16299);
            ((C22990) c4603M12747.f16299).f74725 = this.f22809;
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                m18299((AbstractC8774) it.next(), c4603M12747, new C1116(this, C21059.f68588, this.f22804.f5036));
            }
        }
        C5954 c5954 = this.f22806.f14261;
        c12281.f30190 = c5954;
        this.f22800 = c5954;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18313(C4603 c4603) throws Throwable {
        int i = C10415.f35605[c4603.f16296.mo1803().ordinal()];
        C17573 c17573 = this.f22801;
        C21017 c21017 = this.f22834;
        if (i == 22) {
            AbstractC8774 abstractC8774 = c4603.f16296;
            abstractC8774.getClass();
            C19670 c19670 = ((C18255) c4603.f16296).f58256;
            try {
                c17573.m40874();
                C4603 c4603M28678 = this.f22812.f31863.m28678(c19670);
                m18298(c4603M28678.f16296, c4603M28678);
                return;
            } catch (C4146 e) {
                c21017.m47261(abstractC8774, e);
                return;
            }
        }
        if (i == 23) {
            AbstractC8774 abstractC8775 = c4603.f16296;
            abstractC8775.getClass();
            C7675 c7675 = ((C7672) c4603.f16296).f25387;
            try {
                c17573.m40874();
                AbstractC5930 abstractC5930 = ((C7672) this.f22820.m28678(c7675).f16296).f25385;
                abstractC5930.getClass();
                c21017.m47316(c7675, abstractC5930);
                return;
            } catch (C4146 e2) {
                c21017.m47261(abstractC8775, e2);
                return;
            }
        }
        AbstractC8774 abstractC8776 = c4603.f16296;
        abstractC8776.getClass();
        C22492 c22492 = c4603.f16301.f30086;
        try {
            c17573.m40874();
            m18320(c22492);
        } catch (C4146 e3) {
            c21017.m47261(abstractC8776, e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18320(C22492 c22492) throws Throwable {
        C16826 c16826;
        InterfaceC2173 interfaceC2173;
        C1116 c1116;
        boolean z;
        C14377 c14377;
        if (!c22492.f77449.m39001(EnumC6617.ERROR)) {
            AbstractC16579 abstractC16579 = c22492.f77449;
            C21017 c21017 = this.f22834;
            c21017.m47353(null, abstractC16579);
            AbstractC16579 abstractC165710 = c22492.f77449;
            C23800 c23800 = this.f22802;
            AbstractC16579 abstractC16579M52432 = c23800.m52432(abstractC165710);
            long j = c22492.f77447;
            if ((16777216 & j) == 0 && (j & 536870912) == 0) {
                EnumC6617 enumC6617 = EnumC6617.CLASS;
                if (abstractC16579M52432.m39001(enumC6617)) {
                    m18320((C22492) abstractC16579M52432.f53222);
                }
                AbstractC23903 abstractC23903 = c22492.f77448;
                if (abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.f77449.m39001(enumC6617)) {
                    m18320((C22492) c22492.f77448);
                }
                c22492.f77447 |= 536870912;
            }
            long j2 = c22492.f77447;
            if ((268435456 & j2) != 0) {
                c22492.f77447 = j2 & (-268435457);
                C4603 c4603M28678 = this.f22820.m28678(c22492);
                boolean zM52707 = c22492.m52707();
                C20414 c20414 = this.f22832;
                if (zM52707 && !c22492.m52717() && !c22492.f73416 && c22492.f73421.isEmpty()) {
                    c20414.m48199(C3128.m9440(c22492, c4603M28678.f16296, false), C23879.f77347);
                }
                boolean zM52708 = c22492.m52707();
                C3836 c3836 = this.f22806;
                if (zM52708) {
                    HashSet hashSet = new HashSet();
                    boolean z2 = c22492.m52724().f25392 == c3836.f14288 || c22492.m52724().f25392 == c3836.f14249;
                    for (Iterator it = c22492.f73421.iterator(); it.hasNext(); it = it) {
                        AbstractC23903 abstractC23904 = (AbstractC23903) it.next();
                        if (abstractC23904.f77449.mo1933() == EnumC6617.TYPEVAR) {
                            AbstractC8774 abstractC8774M9440 = C3128.m9440(abstractC23904, c4603M28678.f16296, false);
                            AbstractC16579 abstractC165711 = abstractC23904.f77449;
                            C14377 c14378 = C14707.f48054;
                            c20414.m48199(abstractC8774M9440, C23879.m52621(new C14377("compiler", "is.a.type.variable", abstractC165711)));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (abstractC23904.f77453.isEmpty() && !c22492.m52717()) {
                            AbstractC8774 abstractC8774M9441 = C3128.m9440(abstractC23904, c4603M28678.f16296, false);
                            C5909 c5909 = C23879.f77204;
                            c20414.m48199(abstractC8774M9441, new C5909("compiler", "local.classes.cant.extend.sealed", C14707.f48046));
                        }
                        if (hashSet.contains(abstractC23904)) {
                            InterfaceC12260 interfaceC12260 = (InterfaceC12260) ((C21825) C9030.stream(c4603M28678.f16301.f30091).filter(new C12197(1, abstractC23904)).limit(2L).collect(C21825.m48587())).get(1);
                            AbstractC16579 abstractC165712 = abstractC23904.f77449;
                            C14377 c14379 = C14707.f48054;
                            c20414.m48199(interfaceC12260, C23879.m52621(new C14377("compiler", "is.duplicated", abstractC165712)));
                        } else {
                            hashSet.add(abstractC23904);
                        }
                        if (z2) {
                            if (abstractC23904.m52724() != c22492.m52724()) {
                                AbstractC8774 abstractC8774M9442 = C3128.m9440(abstractC23904, c4603M28678.f16296, false);
                                C5909 c59010 = C23879.f77204;
                                c20414.m48199(abstractC8774M9442, new C5909("compiler", "class.in.unnamed.module.cant.extend.sealed.in.diff.package", c22492));
                            }
                        } else if (abstractC23904.m52724().f25392 != c22492.m52724().f25392) {
                            AbstractC8774 abstractC8774M9443 = C3128.m9440(abstractC23904, c4603M28678.f16296, false);
                            C19670 c19670 = c22492.m52724().f25392;
                            C5909 c59011 = C23879.f77204;
                            c20414.m48199(abstractC8774M9443, new C5909("compiler", "class.in.module.cant.extend.sealed.in.diff.module", c22492, c19670));
                        }
                        AbstractC16579 abstractC165713 = c22492.f77449;
                        if (abstractC23904 == abstractC165713.f53222 || c23800.m52443(abstractC23904.f77449, abstractC165713)) {
                            InterfaceC12260 interfaceC12261 = (InterfaceC12260) C9030.stream(((C8753) c4603M28678.f16296).f30091).map(new C8542(3, abstractC23904)).filter(new C16973(5)).findFirst().get();
                            if (abstractC23904 == c22492.f77449.f53222) {
                                c14377 = C14707.f48076;
                            } else {
                                AbstractC16579 abstractC165714 = abstractC23904.f77449;
                                C14377 c143710 = C14707.f48054;
                                c14377 = new C14377("compiler", "must.not.be.supertype", abstractC165714);
                            }
                            c20414.m48199(interfaceC12261, C23879.m52621(c14377));
                        } else if (!z && !C9030.stream(c23800.m52356(abstractC23904.f77449)).anyMatch(new C20522(0, c22492))) {
                            AbstractC8774 abstractC8774M9444 = C3128.m9440(abstractC23904, c4603M28678.f16296, false);
                            AbstractC16579 abstractC165715 = abstractC23904.f77449;
                            C14377 c143711 = C14707.f48054;
                            c20414.m48199(abstractC8774M9444, C23879.m52621(new C14377("compiler", "doesnt.extend.sealed", abstractC165715)));
                        }
                        abstractC16579M52432 = abstractC16579M52432;
                        c3836 = c3836;
                    }
                }
                C3836 c3837 = c3836;
                AbstractC16579 abstractC165716 = abstractC16579M52432;
                C21825<C22492> c21825 = (C21825) C9030.stream(c23800.m52356(c22492.f77449)).filter(new C15584(0)).map(new C16177(5)).collect(C21825.m48587());
                if (!c21825.isEmpty()) {
                    if (c22492.m52728() && !c22492.m52717()) {
                        AbstractC8774 abstractC8774M9445 = C3128.m9440(c22492, c4603M28678.f16296, false);
                        C14377 c143712 = c22492.f77453.isEmpty() ? C14707.f48046 : C14707.f48101;
                        C5909 c59012 = C23879.f77204;
                        c20414.m48199(abstractC8774M9445, new C5909("compiler", "local.classes.cant.extend.sealed", c143712));
                    }
                    if (!c22492.f77449.mo12731()) {
                        for (C22492 c22493 : c21825) {
                            if (!c22493.f73421.contains(c22492.f77449.f53222)) {
                                AbstractC8774 abstractC8774M9446 = C3128.m9440(c22492.f77449.f53222, c4603M28678.f16296, false);
                                C5909 c59013 = C23879.f77204;
                                c20414.m48199(abstractC8774M9446, new C5909("compiler", "cant.inherit.from.sealed", c22493));
                            }
                        }
                        long j3 = c22492.f77447;
                        if ((j3 & Long.MIN_VALUE) == 0 && (j3 & 16) == 0 && !c22492.m52707()) {
                            c20414.m48199(C3128.m9440(c22492, c4603M28678.f16296, false), c22492.m52721() ? C23879.f77241 : C23879.f77251);
                        }
                    }
                } else if ((c22492.f77447 & Long.MIN_VALUE) != 0 && !C9030.stream(c23800.m52356(c22492.f77449)).anyMatch(new C2185(2))) {
                    AbstractC8774 abstractC8774M9447 = C3128.m9440(c22492, c4603M28678.f16296, false);
                    C5909 c59014 = C23879.f77204;
                    c20414.m48199(abstractC8774M9447, new C5909("compiler", "non.sealed.with.no.sealed.supertype", c22492));
                }
                C4603 c4603 = c4603M28678;
                while (true) {
                    c16826 = ((C22990) c4603.f16299).f74715;
                    if (c16826 != null) {
                        break;
                    } else {
                        c4603 = c4603.f16297;
                    }
                }
                Object obj = c4603M28678.f16299;
                ((C22990) obj).f74715 = c16826.m39465(c22492);
                C22990 c22990 = (C22990) obj;
                C16826 c16826M47268 = c21017.m47268(c22990.f74715);
                InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c22492.f73415);
                C1116 c1117 = c22990.f74725;
                try {
                    this.f22811.m8271(c4603M28678.f16296);
                    ((C22990) obj).f74725 = null;
                    if (abstractC165716.f53222 == c3837.f14289) {
                        interfaceC2173 = interfaceC2173M48202;
                        c1116 = c1117;
                        try {
                            if ((c22492.f77447 & 16793600) == 0) {
                                AbstractC8774 abstractC8774 = c4603M28678.f16296;
                                abstractC8774.getClass();
                                c20414.m48199(abstractC8774, C23879.f77348);
                            }
                        } catch (Throwable th) {
                            th = th;
                            c22990.f74725 = c1116;
                            c20414.m48202(interfaceC2173);
                            c21017.m47268(c16826M47268);
                            throw th;
                        }
                    } else {
                        interfaceC2173 = interfaceC2173M48202;
                        c1116 = c1117;
                    }
                    AbstractC0618 abstractC0618 = abstractC165716.f53222;
                    if (abstractC0618 != null && (abstractC0618.f77447 & 16384) != 0 && (c22492.f77447 & 16793600) == 0) {
                        AbstractC8774 abstractC8775 = c4603M28678.f16296;
                        abstractC8775.getClass();
                        c20414.m48199(abstractC8775, C23879.f77288);
                    }
                    if (m18322(c22492.f77449)) {
                        ((C22990) obj).f74719 = true;
                    }
                    m18285(c22492, c4603M28678);
                    AbstractC8774 abstractC8776 = c4603M28678.f16296;
                    abstractC8776.getClass();
                    c21017.m47316((AbstractC23903) c22492, abstractC8776);
                    AbstractC8774 abstractC8777 = c4603M28678.f16296;
                    abstractC8777.getClass();
                    c21017.m47289(abstractC8777, c22492);
                    c21017.m47282((C8753) c4603M28678.f16296, c22492);
                    c21017.m47275(c4603M28678, (C8753) c4603M28678.f16296);
                    c22990.f74725 = c1116;
                    c20414.m48202(interfaceC2173);
                    c21017.m47268(c16826M47268);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC2173 = interfaceC2173M48202;
                    c1116 = c1117;
                }
            }
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        C19670 c19670 = c18255.f58256;
        InterfaceC13320 interfaceC13320 = c19670.f63147;
        InterfaceC13320 interfaceC13321 = InterfaceC13320.f44208;
        if (interfaceC13320 != interfaceC13321) {
            c19670.f63147 = interfaceC13321;
            interfaceC13320.mo1179(c19670);
        }
        C19670 c19671 = c18255.f58256;
        C22990 c22990 = (C22990) this.f22814.f16300.f16299;
        C16826 c16826M39465 = c22990.f74715.m39465(c19671);
        c22990.f74715 = c16826M39465;
        C21017 c21017 = this.f22834;
        C16826 c16826M47268 = c21017.m47268(c16826M39465);
        c21017.m47301(c18255);
        c21017.m47316(c19671, c18255);
        try {
            this.f22811.m8271((AbstractC8774) c18255);
        } finally {
            c21017.m47268(c16826M47268);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18285(C22492 c22492, C4603 c4603) throws Throwable {
        C23942 c23942;
        long j;
        C6263 c6263;
        C5224 c5224;
        AbstractC8774 abstractC8774 = c4603.f16296;
        Object obj = c4603.f16299;
        C8753 c8753 = (C8753) abstractC8774;
        C6171.m17176(c22492 == c8753.f30086);
        m18329(c8753.f30088, c4603);
        boolean zIsEmpty = c22492.f77453.isEmpty();
        C21017 c21017 = this.f22834;
        if (!zIsEmpty) {
            c21017.m47303(c8753.f30088, c4603);
            c21017.m47287((AbstractC8774) c8753.f30092, c4603, true);
            c21017.m47303(c8753.f30087, c4603);
        }
        C23800 c23800 = this.f22802;
        c22492.m50002(c23800);
        c22492.mo49994();
        if ((c22492.f77447 & 1536) == 0) {
            c21017.m47308(c22492, (InterfaceC12260) c8753);
        }
        c22492.mo49994();
        long j2 = c22492.f77447 & 8192;
        C20414 c20414 = this.f22832;
        if (j2 != 0) {
            if (c8753.f30087.m48595()) {
                AbstractC5930 abstractC5930 = (AbstractC5930) c8753.f30087.f70876;
                abstractC5930.getClass();
                c20414.m48199(abstractC5930, C23879.f77292);
            }
            if (c8753.f30088.m48595()) {
                C22179 c22179 = (C22179) c8753.f30088.f70876;
                c22179.getClass();
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c22179, new C5909("compiler", "intf.annotation.cant.have.type.params", c22492));
            }
            C11867 c11867Mo38256 = c22492.mo2884().mo38256();
            if (c11867Mo38256 != null) {
                AbstractC16579 abstractC16579 = c11867Mo38256.f75167;
                C21825 c21825 = c8753.f30089.f70566;
                while (true) {
                    if (c21825.isEmpty()) {
                        c5224 = null;
                        break;
                    } else {
                        if (c23800.m52399(((C5224) c21825.f70876).f18121.f30190, abstractC16579)) {
                            c5224 = (C5224) c21825.f70876;
                            c5224.getClass();
                            break;
                        }
                        c21825 = c21825.f70877;
                    }
                }
                C6171.m17171(c5224);
                c21017.m47307(c22492, c11867Mo38256, c5224);
            }
        } else {
            c21017.m47334(c8753, c22492.f77449);
            if (this.f22803) {
                c21017.m47327(c8753, c22492.f77449);
            }
        }
        AbstractC16579 abstractC165710 = c22492.f77449;
        c21017.getClass();
        c21017.m47292(c8753, new HashMap(), abstractC165710);
        c8753.f30190 = c22492.f77449;
        for (C21825 c21826 = c8753.f30088; c21826.m48595(); c21826 = c21826.f70877) {
            C6171.m17171(((C22990) obj).f74722.mo3804(((C22179) c21826.f70876).f72545, (Predicate) null));
        }
        if (!c22492.f77449.mo1943().isEmpty() && c23800.m52413(c22492.f77449, this.f22806.f14302, true)) {
            AbstractC5930 abstractC5931 = c8753.f30092;
            abstractC5931.getClass();
            c20414.m48199(abstractC5931, C23879.f77173);
        }
        C22492 c22493 = c8753.f30086;
        c21017.m47290((AbstractC8774) c8753, c22493, c22493);
        m18317((InterfaceC12260) c8753, c4603, c22492.f77449);
        C21825 c21827 = c8753.f30090;
        while (true) {
            boolean zM48595 = c21827.m48595();
            c23942 = this.f22815;
            if (!zM48595) {
                break;
            }
            m18298((AbstractC8774) c21827.f70876, c4603);
            if (!this.f22798 && c22492.f77448.f77452 != EnumC10477.f35867) {
                c22492.mo49994();
                if (((c22492.f77447 & 8) == 0 || c22492.f77453 == c23942.f77594) && (C3128.m9431((AbstractC8774) c21827.f70876) & 520) != 0) {
                    C6263 c6264 = ((AbstractC8774) c21827.f70876).m22847(EnumC18651.f60554) ? ((C6656) c21827.f70876).f22475 : null;
                    if (c6264 == null || c6264.f77452 != EnumC10477.f35878 || c6264.m17332() == null) {
                        AbstractC8774 abstractC8775 = (AbstractC8774) c21827.f70876;
                        abstractC8775.getClass();
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(abstractC8775, new C5909("compiler", "icls.cant.have.static.decl", c22492));
                    }
                }
            }
            c21827 = c21827.f70877;
        }
        c21017.m47281(c8753);
        long j3 = c8753.f30086.f77447;
        if ((j3 & 8192) != 0) {
            C6171.m17176((j3 & 134217728) == 0);
            try {
                j = 34359738368L;
                try {
                    c8753.f30086.f77447 |= 134217728;
                    for (AbstractC8774 abstractC8776 : c8753.f30090) {
                        if (abstractC8776.m22847(EnumC18651.f60478)) {
                            C23195 c23195 = (C23195) abstractC8776;
                            c21017.m47310(c23195, c23195.f75266.f30190);
                        }
                    }
                    C22492 c22494 = c8753.f30086;
                    c22494.f77447 = ((-134217729) & c22494.f77447) | 34359738368L;
                } catch (Throwable th) {
                    th = th;
                    C22492 c22495 = c8753.f30086;
                    c22495.f77447 = (c22495.f77447 & (-134217729)) | j;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 34359738368L;
            }
        }
        C22990 c22990 = (C22990) obj;
        if (c22990.f74715.m39467(EnumC0597.SERIAL) && m18322(c22492.f77449)) {
            c22492.mo49994();
            if ((c22492.f77447 & 16896) == 0 && !c22492.f77453.isEmpty()) {
                c22492.mo49994();
                Iterator it = c22492.f73417.m9327(c23942.f77647).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c6263 = null;
                        break;
                    }
                    AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                    if (abstractC23903.f77452 == EnumC10477.f35878) {
                        c6263 = (C6263) abstractC23903;
                        break;
                    }
                }
                if (c6263 != null) {
                    C16826 c16826M39465 = c22990.f74715.m39465(c6263);
                    EnumC0597 enumC0597 = EnumC0597.SERIAL;
                    if (!c16826M39465.m39468(enumC0597)) {
                        if ((c6263.f77447 & 24) != 24) {
                            AbstractC8774 abstractC8774M9440 = C3128.m9440(c6263, c8753, false);
                            C14065 c14065 = C9768.f32836;
                            c20414.m48203(enumC0597, abstractC8774M9440, new C14065("compiler", "improper.SVUID", c22492));
                        } else if (!c6263.f77449.m39001(EnumC6617.LONG)) {
                            AbstractC8774 abstractC8774M9441 = C3128.m9440(c6263, c8753, false);
                            C14065 c14066 = C9768.f32836;
                            c20414.m48203(enumC0597, abstractC8774M9441, new C14065("compiler", "long.SVUID", c22492));
                        } else if (c6263.m17332() == null) {
                            AbstractC8774 abstractC8774M9442 = C3128.m9440(c6263, c8753, false);
                            C14065 c14067 = C9768.f32836;
                            c20414.m48203(enumC0597, abstractC8774M9442, new C14065("compiler", "constant.SVUID", c22492));
                        }
                    }
                } else if (!c22492.m50010()) {
                    EnumC0597 enumC0598 = EnumC0597.SERIAL;
                    C14065 c14068 = C9768.f32836;
                    c20414.m48203(enumC0598, c8753, new C14065("compiler", "missing.SVUID", c22492));
                }
            }
        }
        if (this.f22795) {
            this.f22796.m14390(c8753);
            m18316((AbstractC8774) c8753, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18322(AbstractC16579 abstractC16579) {
        C3836 c3836 = this.f22806;
        try {
            c3836.f14268.mo1940();
            return this.f22802.m52413(abstractC16579, c3836.f14268, true);
        } catch (C4146 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18277(C6656 c6656, AbstractC16579 abstractC16579) {
        boolean zMo1926 = abstractC16579.mo1926();
        C5286 c5286 = this.f22794;
        if (zMo1926) {
            c5286.f18294 = -1;
            c6656.f22477 = c5286.m14644();
        } else {
            c5286.f18294 = -1;
            c6656.f22477 = c5286.m14634(abstractC16579);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18316(AbstractC8774 abstractC8774, boolean z) {
        abstractC8774.mo1802(new C3938(this, z));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18328(AbstractC8774 abstractC8774) {
        new C2527(this).mo7248(abstractC8774);
    }
}
