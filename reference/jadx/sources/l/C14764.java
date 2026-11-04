package l;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14764 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24550 f48237;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f48238;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17223 f48239;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C10510 f48240;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48241;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C23721 f48242;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48243;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48244;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48245;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final HashMap f48246;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C15252 f48247;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final C13494 f48248;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17223 f48249;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48250;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final C15731 f48251;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48252;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C17223 f48253;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48254;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17223 f48255;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C17223 f48256;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48257;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48258;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48259;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48260;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48261;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48262;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12748 f48263;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 f48264;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48265;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48266;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48267;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C10510 f48268;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48269;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48270;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24550 f48271;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48272;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48273;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C24550 f48274;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C24550 f48275;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48276;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48277;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C2920 f48278;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final C10510 f48279;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48280;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C5816 f48281;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48282;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC14852 f48283;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C11035 f48284;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10377 f48285;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48286;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10377 f48287;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48288;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48289;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f48290;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14852 f48291;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664[] f48292;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17223 f48293;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48294;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48295;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17223 f48296;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48297;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48298;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2920 f48299;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48300;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48301;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C10510 f48302;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48303;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C2920 f48304;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48305;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48306;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48307;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final C2920 f48308;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24550 f48309;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48310;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48311;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48312;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48313;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10377 f48314;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48315;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final C17223 f48316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48317;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f48318;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public final C24550 f48319;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48320;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22970 f48321;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48322;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC19728[] f48323;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48324;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f48325;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public static final C13477 f48236 = new C13477();

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f48235 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14764 m35506(C4747 c4747) {
        C14764 c14764 = (C14764) c4747.m14643(f48236);
        return c14764 == null ? new C14764(c4747) : c14764;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5816 m35516(final AbstractC22664 abstractC22664, final C24705 c24705) {
        return (C5816) C11392.computeIfAbsent(this.f48290, new C11278(abstractC22664, c24705), new Function() { // from class: l.ܺܿ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C14764.m35504(c24705, this, abstractC22664);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5816 m35504(C24705 c24705, C14764 c14764, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M55132;
        AbstractC22664 abstractC22665 = c14764.f48317;
        if (abstractC22664.mo9097() == EnumC21172.ARRAY || abstractC22664.mo9097() == EnumC21172.CLASS) {
            abstractC22664M55132 = c24705.m55132(abstractC22664);
        } else if (abstractC22664.mo40456()) {
            abstractC22664M55132 = c24705.m55108(abstractC22664).f38067;
        } else {
            throw new AssertionError(abstractC22664);
        }
        return new C5816(25L, c14764.f48247.f49816, new C10510(abstractC22665.f73596, abstractC22665.mo23449(), C14769.of((Object) abstractC22664M55132)), abstractC22664.f73596);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35521(AbstractC22664 abstractC22664, String str, String str2) {
        C15252 c15252 = this.f48247;
        AbstractC22712 abstractC22712 = c15252.f49864;
        abstractC22712.getClass();
        char[] charArray = str.toCharArray();
        abstractC22664.f73596 = new C24550(1L, abstractC22712.mo2069(charArray, charArray.length), abstractC22664, this.f48284);
        this.f48292[abstractC22664.mo9097().ordinal()] = abstractC22664;
        this.f48323[abstractC22664.mo9097().ordinal()] = c15252.f49864.m51194("java.lang.".concat(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m35507(String str) {
        AbstractC22712 abstractC22712 = this.f48247.f49864;
        abstractC22712.getClass();
        char[] charArray = str.toCharArray();
        return m35517(this.f48304, abstractC22712.mo2069(charArray, charArray.length)).f38067;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35530(AbstractC22664 abstractC22664) {
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        abstractC22970.f38070 = new C23716(this, abstractC22970.f38070);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35520(AbstractC22664 abstractC22664) {
        C24550 c24550M35517 = m35517(this.f48304, this.f48323[abstractC22664.mo9097().ordinal()]);
        c24550M35517.f38070 = new C3578(this, c24550M35517.f38070, abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10510 m35511(String str) {
        AbstractC22712 abstractC22712 = this.f48247.f49864;
        abstractC22712.getClass();
        char[] charArray = str.toCharArray();
        C10510 c10510 = (C10510) m35517(this.f48304, abstractC22712.mo2069(charArray, charArray.length)).f38067;
        C24550 c24550 = (C24550) c10510.f73596;
        c24550.f38070 = InterfaceC14852.f48554;
        c24550.f38071 = 1073750529L;
        c24550.f38073 = c10510;
        c24550.f79576 = new C2175(c24550);
        c10510.f33438 = C14769.m35543();
        c10510.f33441 = C14769.m35543();
        c10510.f33442 = this.f48311;
        c10510.f33437 = C14769.m35543();
        return c10510;
    }

    public C14764(C4747 c4747) {
        C2920 c2920;
        C17223 c17223 = new C17223(EnumC21172.BYTE);
        this.f48293 = c17223;
        C17223 c17224 = new C17223(EnumC21172.CHAR);
        this.f48296 = c17224;
        C17223 c17225 = new C17223(EnumC21172.SHORT);
        this.f48316 = c17225;
        C17223 c17226 = new C17223(EnumC21172.INT);
        this.f48253 = c17226;
        C17223 c17227 = new C17223(EnumC21172.LONG);
        this.f48256 = c17227;
        C17223 c17228 = new C17223(EnumC21172.FLOAT);
        this.f48239 = c17228;
        C17223 c17229 = new C17223(EnumC21172.DOUBLE);
        this.f48249 = c17229;
        C17223 c172210 = new C17223(EnumC21172.BOOLEAN);
        this.f48255 = c172210;
        C14458 c14458 = C14458.f45498;
        C8798 c8798 = new C8798(null, c14458);
        this.f48241 = c8798;
        C15731 c15731 = new C15731(null, c14458);
        this.f48251 = c15731;
        AbstractC22664[] abstractC22664Arr = new AbstractC22664[EnumC21172.m48304()];
        this.f48292 = abstractC22664Arr;
        this.f48323 = new AbstractC19728[EnumC21172.m48304()];
        this.f48246 = new HashMap();
        this.f48238 = new HashMap();
        this.f48318 = new LinkedHashMap();
        this.f48290 = new HashMap();
        c4747.m14646(f48236, this);
        C15252 c15252M36599 = C15252.m36599(c4747);
        AbstractC22712 abstractC22712 = c15252M36599.f49864;
        AbstractC19728 abstractC19728 = c15252M36599.f49799;
        this.f48247 = c15252M36599;
        C13494 c13494 = new C13494(null, c14458);
        this.f48248 = c13494;
        this.f48242 = C23721.m52973(c4747);
        C13477 c13477 = C13163.f42089;
        C13163 c13163 = (C13163) c4747.m14643(c13477);
        if (c13163 == null) {
            c13163 = new C13163();
            c4747.m14646(c13477, c13163);
            C15252.m36599(c4747);
        }
        C11035 c11035 = new C11035(abstractC19728, c13163, EnumC16305.m38659(c4747).m38668());
        this.f48284 = c11035;
        C2920 c20732 = new C20732(this, abstractC19728);
        this.f48308 = c20732;
        m35508(c20732);
        c20732.f9547 = c20732.f9547.m35552(c20732.f9550);
        C2920 c12527 = new C12527(abstractC19728);
        c12527.f9543 = C14769.m35543();
        c12527.f9546 = C14769.m35543();
        c12527.f9557 = C14769.m35543();
        c12527.f9560 = C14769.m35543();
        c12527.f9551 = C14769.of((Object) new C0180(m35515(this.f48247.f49807), EnumSet.of(EnumC7638.MANDATED)));
        this.f48299 = c12527;
        m35508(c12527);
        C2920 c6562 = new C6562(abstractC19728);
        this.f48278 = c6562;
        m35508(c6562);
        EnumC13603 enumC13603 = EnumC13603.f43211;
        AbstractC19728 abstractC19729 = c15252M36599.f49799;
        C11256 c11256 = AbstractC22664.f73590;
        C24462 c24462 = new C24462(enumC13603, 0L, abstractC19729, c11256, c11035);
        this.f48321 = c24462;
        C24550 c24550 = new C24550(1073741833L, c15252M36599.f49840, null, c11035);
        this.f48237 = c24550;
        C12748 c12748 = new C12748(c24550, c11256);
        this.f48263 = c12748;
        abstractC22712.getClass();
        char[] charArray = "<any?>".toCharArray();
        C24550 c24551 = new C24550(1073741833L, abstractC22712.mo2069(charArray, charArray.length), null, c11035);
        this.f48319 = c24551;
        c24551.f79576 = new C14654((AbstractC11781) c24551);
        c24551.f38067 = c13494;
        m35521(c17223, ClassTransform.BYTE, "Byte");
        m35521(c17225, ClassTransform.SHORT, "Short");
        m35521(c17224, ClassTransform.CHARACTER, "Character");
        m35521(c17226, ClassTransform.INTEGER, "Integer");
        m35521(c17227, ClassTransform.LONG, "Long");
        m35521(c17228, ClassTransform.FLOAT, "Float");
        m35521(c17229, ClassTransform.DOUBLE, "Double");
        m35521(c172210, ClassTransform.BOOLEAN, "Boolean");
        m35521(c15731, ClassTransform.VOID, "Void");
        abstractC22712.getClass();
        char[] charArray2 = "<nulltype>".toCharArray();
        c8798.f73596 = new C24550(1L, abstractC22712.mo2069(charArray2, charArray2.length), c8798, c11035);
        abstractC22664Arr[c8798.mo9097().ordinal()] = c8798;
        c12748.f73596 = c24550;
        abstractC22664Arr[c12748.mo9097().ordinal()] = c12748;
        c13494.f73596 = c24551;
        abstractC22664Arr[c13494.mo9097().ordinal()] = c13494;
        C24550 c24552 = new C24550(1073741825L, c15252M36599.f49858, c24462);
        this.f48271 = c24552;
        C24550 c24553 = new C24550(1073741825L, c15252M36599.f49819, c24462);
        this.f48274 = c24553;
        c24553.f79576 = new C14654((AbstractC11781) c24553);
        C24550 c24554 = new C24550(1073741825L, c15252M36599.f49783, c24462);
        this.f48275 = c24554;
        c24554.f79576 = new C14654((AbstractC11781) c24553);
        C24550 c24555 = new C24550(1073741825L, abstractC19728, c11035);
        this.f48264 = c24555;
        C2175 c2175 = new C2175(c24555);
        c24555.f79576 = c2175;
        this.f48283 = C19571.m45162(c4747).m45170();
        c11035.f44616 = new C2175(c11035);
        c2175.mo7481(c17223.f73596);
        c2175.mo7481(c17225.f73596);
        c2175.mo7481(c17224.f73596);
        c2175.mo7481(c17226.f73596);
        c2175.mo7481(c17227.f73596);
        c2175.mo7481(c17228.f73596);
        c2175.mo7481(c17229.f73596);
        c2175.mo7481(c172210.f73596);
        c2175.mo7481(c12748.f73596);
        c2175.mo7481(c24550);
        if (EnumC3666.f12544.m11915(EnumC20820.m47625(c4747))) {
            C2920 c2920M35515 = m35515(c15252M36599.f49807);
            this.f48304 = c2920M35515;
            c2920M35515.f38070 = InterfaceC14852.f48554;
            c2920M35515.f9554 = Collections.EMPTY_MAP;
            c2920 = c6562;
        } else {
            c2920 = c6562;
            this.f48304 = c2920;
        }
        InterfaceC14852 interfaceC14852M45781 = C19881.m45741(c4747).m45781();
        this.f48291 = interfaceC14852M45781;
        AbstractC22664 abstractC22664M35507 = m35507("java.lang.Object");
        this.f48286 = abstractC22664M35507;
        this.f48250 = m35507("java.lang.runtime.ObjectMethods");
        this.f48310 = m35507("java.util.Objects");
        this.f48317 = m35507("java.lang.Class");
        this.f48282 = m35507("java.lang.String");
        m35507("java.lang.StringBuffer");
        this.f48305 = m35507("java.lang.StringBuilder");
        AbstractC22664 abstractC22664M35508 = m35507("java.lang.Cloneable");
        this.f48306 = abstractC22664M35508;
        this.f48325 = m35507("java.lang.Throwable");
        AbstractC22664 abstractC22664M35509 = m35507("java.io.Serializable");
        this.f48313 = abstractC22664M35509;
        AbstractC22664 abstractC22664M355010 = m35507("java.lang.invoke.SerializedLambda");
        this.f48273 = abstractC22664M355010;
        this.f48322 = m35507("java.lang.invoke.VarHandle");
        this.f48294 = m35507("java.lang.invoke.MethodHandle");
        this.f48324 = m35507("java.lang.invoke.MethodHandles$Lookup");
        this.f48297 = m35507("java.lang.invoke.MethodType");
        this.f48301 = m35507("java.lang.Error");
        this.f48244 = m35507("java.lang.IllegalArgumentException");
        this.f48312 = m35507("java.lang.InterruptedException");
        AbstractC22664 abstractC22664M355011 = m35507("java.lang.Exception");
        this.f48269 = abstractC22664M355011;
        this.f48254 = m35507("java.lang.RuntimeException");
        m35507("java.lang.ClassNotFoundException");
        m35507("java.lang.NoClassDefFoundError");
        this.f48259 = m35507("java.lang.NoSuchFieldError");
        this.f48303 = m35507("java.lang.AssertionError");
        this.f48265 = m35507("java.lang.IncompatibleClassChangeError");
        m35507("java.lang.CloneNotSupportedException");
        this.f48311 = m35507("java.lang.annotation.Annotation");
        m35507("java.lang.ClassLoader");
        C24550 c24550M35517 = m35517(this.f48304, c15252M36599.f49853);
        this.f48309 = c24550M35517;
        C2920 c2921 = c2920;
        this.f48285 = new C10377(137438953492L, c15252M36599.f49756, new C23191(C14769.m35543(), c15731, C14769.m35543(), c24554), c24550M35517);
        m35507("java.util.List");
        m35507("java.util.Collections");
        m35507("java.lang.Comparable");
        this.f48277 = m35507("java.util.Comparator");
        m35507("java.util.Arrays");
        this.f48272 = m35507("java.lang.Iterable");
        this.f48315 = m35507("java.util.Iterator");
        this.f48252 = m35507("java.lang.annotation.Target");
        this.f48300 = m35507("java.lang.Override");
        this.f48262 = m35507("java.lang.annotation.Retention");
        this.f48258 = m35507("java.lang.Deprecated");
        this.f48257 = m35507("java.lang.SuppressWarnings");
        m35507("java.util.function.Supplier");
        this.f48261 = m35507("java.lang.annotation.Inherited");
        this.f48266 = m35507("java.lang.annotation.Repeatable");
        this.f48320 = m35507("java.lang.annotation.Documented");
        m35507("java.lang.annotation.ElementType");
        this.f48276 = m35507("java.lang.System");
        AbstractC22664 abstractC22664M355012 = m35507("java.lang.AutoCloseable");
        this.f48280 = abstractC22664M355012;
        this.f48287 = new C10377(1L, c15252M36599.f49781, new C23191(C14769.m35543(), c15731, C14769.of((Object) abstractC22664M355011), c24554), abstractC22664M355012.f73596);
        this.f48295 = m35507("java.lang.SafeVarargs");
        this.f48307 = m35507("java.lang.annotation.Native");
        AbstractC22664 abstractC22664M355013 = m35507("java.lang.invoke.LambdaMetafactory");
        this.f48288 = abstractC22664M355013;
        AbstractC22664 abstractC22664M355014 = m35507("java.lang.invoke.StringConcatFactory");
        this.f48289 = abstractC22664M355014;
        this.f48267 = m35507("java.lang.FunctionalInterface");
        this.f48270 = m35507("jdk.internal.javac.PreviewFeature");
        this.f48302 = m35511("jdk.internal.PreviewFeature+Annotation");
        this.f48298 = m35507("java.lang.invoke.TypeDescriptor");
        this.f48245 = m35507("java.lang.Record");
        this.f48243 = m35507("java.lang.runtime.SwitchBootstraps");
        this.f48260 = m35507("jdk.internal.ValueBased");
        this.f48279 = m35511("jdk.internal.ValueBased+Annotation");
        m35530(abstractC22664M355012);
        m35530(abstractC22664M35508);
        m35530(abstractC22664M35509);
        m35530(abstractC22664M355013);
        m35530(abstractC22664M355010);
        m35530(abstractC22664M355014);
        m35520(c17229);
        m35520(c17228);
        m35520(c15731);
        this.f48268 = m35511("sun.Proprietary+Annotation");
        C10510 c10510M35511 = m35511("jdk.Profile+Annotation");
        this.f48240 = c10510M35511;
        c10510M35511.f73596.mo29571().mo7481(new C10377(1025L, c15252M36599.f49766, c17226, c10510M35511.f73596));
        C10510 c10510 = (C10510) c24552.f38067;
        c10510.f33442 = abstractC22664M35507;
        c10510.f33437 = C14769.of((Object) abstractC22664M35508, (Object) abstractC22664M35509);
        c24552.f79576 = new C2175(c24552);
        C5816 c5816 = new C5816(17L, c15252M36599.f49786, c17226, c24552);
        this.f48281 = c5816;
        c24552.mo29590();
        c24552.f79576.mo7481(c5816);
        C10377 c10377 = new C10377(1L, c15252M36599.f49788, new C23191(C14769.m35543(), abstractC22664M35507, C14769.m35543(), c24554), c24552);
        this.f48314 = c10377;
        c24552.mo29590();
        c24552.f79576.mo7481(c10377);
        C2920 c2922 = this.f48304;
        if (c2922 != c2921) {
            C17359.requireNonNull(interfaceC14852M45781);
            c2922.f38070 = new C19411(5, interfaceC14852M45781);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m35519(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        C24550 c24550 = new C24550(0L, abstractC19728, abstractC11781);
        c24550.f38070 = this.f48283;
        return c24550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m35518(C2920 c2920, AbstractC19728 abstractC19728, AbstractC22970 abstractC22970) {
        C11972.m30021(c2920);
        C24550 c24550M35523 = m35523(c2920, AbstractC22970.m51842(abstractC19728, abstractC22970));
        if (c24550M35523 == null) {
            C24550 c24550M35519 = m35519(abstractC19728, abstractC22970);
            ((Map) C11392.computeIfAbsent(this.f48246, c24550M35519.f79578, new C17748(0))).put(c2920, c24550M35519);
            return c24550M35519;
        }
        if ((c24550M35523.f38072 != abstractC19728 || c24550M35523.f38069 != abstractC22970) && abstractC22970.f38066 == EnumC13603.f43213) {
            AbstractC11781 abstractC11781 = c24550M35523.f38069;
            if (abstractC11781.f38066 == EnumC13603.f43219) {
                abstractC11781.mo29571().mo7479(c24550M35523);
                c24550M35523.f38072 = abstractC19728;
                c24550M35523.f38069 = abstractC22970;
                c24550M35523.f79577 = AbstractC22970.m51843(abstractC19728, abstractC22970);
            }
        }
        return c24550M35523;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24550 m35523(C2920 c2920, AbstractC19728 abstractC19728) {
        C17359.requireNonNull(abstractC19728);
        C11972.m30022(c2920, new C5399(1, abstractC19728));
        return (C24550) ((Map) C11392.getOrDefault(this.f48246, abstractC19728, Collections.EMPTY_MAP)).get(c2920);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14106 m35526(C2920 c2920, AbstractC19728 abstractC19728) {
        return m35505(c2920, abstractC19728, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14106 m35505(C2920 c2920, AbstractC19728 abstractC19728, boolean z) {
        C11972.m30021(c2920);
        if (abstractC19728.isEmpty()) {
            return c2920.f9550;
        }
        if (c2920 == this.f48278) {
            return m35529(c2920, abstractC19728);
        }
        c2920.mo29590();
        C14106 c14106 = (C14106) c2920.f9554.get(abstractC19728);
        if (c14106 != null) {
            return c14106;
        }
        C14106 c14106M35532 = m35532(c2920, abstractC19728);
        if ((c14106M35532 != null && c14106M35532.mo7873()) || z) {
            return c14106M35532;
        }
        C14769 c14769 = c2920.f9551;
        if (c14769 != null && C1170.stream(c14769).map(new C13105(8)).anyMatch(new C21765(1, this))) {
            C2920 c2921 = this.f48308;
            C14106 c14106M35533 = m35532(c2921, abstractC19728);
            if (c14106M35533 != null && c14106M35533.mo7873()) {
                c2920.f9554.put(c14106M35533.f44619, c14106M35533);
                return c14106M35533;
            }
            C14106 c14106M35529 = m35529(c2920, abstractC19728);
            c14106M35529.mo29590();
            if (!c14106M35529.mo7873()) {
                C14106 c14106M355210 = m35529(c2921, abstractC19728);
                c14106M355210.mo29590();
                if (c14106M355210.mo7873()) {
                    c2920.f9554.put(c14106M355210.f44619, c14106M355210);
                    return c14106M355210;
                }
            }
            return c14106M35529;
        }
        return m35529(c2920, abstractC19728);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m35524(C2920 c2920, AbstractC19728 abstractC19728) {
        ((Map) C11392.getOrDefault(this.f48246, abstractC19728, f48235)).remove(c2920);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m35517(C2920 c2920, AbstractC19728 abstractC19728) {
        C11972.m30021(c2920);
        C14106 c14106M35505 = m35505(c2920, abstractC19728.m45429(0, abstractC19728.m45427((byte) 46)), false);
        C11972.m30021(c14106M35505);
        C11972.m30021(c14106M35505.f44618);
        C24550 c24550M35523 = m35523(c14106M35505.f44618, abstractC19728);
        if (c24550M35523 != null) {
            return c24550M35523;
        }
        C24550 c24550M35519 = m35519(C21901.m49594(abstractC19728), c14106M35505);
        ((Map) C11392.computeIfAbsent(this.f48246, c24550M35519.f79578, new C17748(0))).put(c14106M35505.f44618, c24550M35519);
        return c24550M35519;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m35525(C2920 c2920, AbstractC19728 abstractC19728) {
        C11972.m30021(c2920);
        C14106 c14106M35505 = m35505(c2920, abstractC19728, true);
        return c14106M35505 != null && c14106M35505.mo7873();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14106 m35529(C2920 c2920, AbstractC19728 abstractC19728) {
        C11972.m30021(c2920);
        C14106 c14106M35532 = m35532(c2920, abstractC19728);
        if (c14106M35532 != null) {
            return c14106M35532;
        }
        C11972.m30027(!abstractC19728.isEmpty(), new C16256(0, c2920));
        C14106 c14106 = new C14106(C21901.m49594(abstractC19728), m35529(c2920, abstractC19728.m45429(0, abstractC19728.m45427((byte) 46))));
        c14106.f38070 = this.f48283;
        c14106.f44618 = c2920;
        ((Map) C11392.computeIfAbsent(this.f48238, c14106.f44619, new C9587(8))).put(c2920, c14106);
        c2920.f9547 = c2920.f9547.m35552(c14106);
        return c14106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35508(C2920 c2920) {
        C11035 c11035 = this.f48284;
        ((Map) C11392.computeIfAbsent(this.f48238, c11035.f44619, new C9587(8))).put(c2920, c11035);
        c2920.f9547 = c2920.f9547.m35552(c11035);
        C4324 c4324 = new C4324(this, this.f48247.f49799, c11035);
        c4324.f44618 = c2920;
        c4324.f38070 = new C24159(this);
        c4324.f38071 |= X931RNG.BLOCK128_RESEED_MAX;
        c2920.f9550 = c4324;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14106 m35532(C2920 c2920, AbstractC19728 abstractC19728) {
        return (C14106) ((Map) C11392.getOrDefault(this.f48238, abstractC19728, Collections.EMPTY_MAP)).get(c2920);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2920 m35515(AbstractC19728 abstractC19728) {
        LinkedHashMap linkedHashMap = this.f48318;
        C2920 c2920 = (C2920) linkedHashMap.get(abstractC19728);
        if (c2920 != null) {
            return c2920;
        }
        AbstractC19728 abstractC19729 = this.f48247.f49759;
        C2920 c2921 = new C2920(abstractC19728);
        C24550 c24550 = new C24550(2251799813685248L, abstractC19729, c2921);
        AbstractC19728 abstractC19728M51843 = AbstractC22970.m51843(abstractC19729, c2921);
        c24550.f79577 = abstractC19728M51843;
        c24550.f79578 = abstractC19728M51843;
        c24550.f79576 = new C2175(c24550);
        c2921.f9544 = c24550;
        m35508(c2921);
        c2921.f38070 = new C11021(this);
        linkedHashMap.put(abstractC19728, c2921);
        return c2921;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2920 m35522(AbstractC19728 abstractC19728) {
        return (C2920) this.f48318.get(abstractC19728);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m35527(AbstractC19728 abstractC19728) {
        if (abstractC19728.isEmpty()) {
            return C14769.m35543();
        }
        C14769 c14769M35543 = C14769.m35543();
        Map map = (Map) this.f48238.get(abstractC19728);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C14106 c14106 = (C14106) entry.getValue();
                c14106.mo29590();
                if (!c14106.f44616.m38843()) {
                    c14769M35543 = c14769M35543.m35552((C2920) entry.getKey());
                }
            }
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m35514() {
        return this.f48318.values();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Collection m35528(AbstractC19728 abstractC19728) {
        return ((Map) C11392.getOrDefault(this.f48246, abstractC19728, Collections.EMPTY_MAP)).values();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection m35531(AbstractC19728 abstractC19728) {
        return ((Map) C11392.getOrDefault(this.f48238, abstractC19728, Collections.EMPTY_MAP)).values();
    }
}
