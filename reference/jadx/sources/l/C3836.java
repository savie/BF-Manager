package l;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3836 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19670 f14216;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14217;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14218;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C6263 f14219;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14220;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14221;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14222;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18258 f14223;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14224;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final C3131 f14225;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 f14226;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C20375 f14227;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14228;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C22531 f14229;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14230;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14231;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C3131 f14232;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14234;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C19670 f14235;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14236;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14237;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14238;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22492 f14239;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C22492 f14240;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14241;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14242;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0618 f14243;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14244;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HashMap f14245;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C23942 f14246;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final C20812 f14247;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14248;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C19670 f14249;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final C0309 f14250;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14251;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14252;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14253;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14254;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14255;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3131 f14256;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C0309 f14257;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22492 f14258;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14259;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14260;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5954 f14261;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 f14262;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3131 f14263;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C3131 f14264;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14266;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14267;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14268;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14269;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14270;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3131 f14271;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14272;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18258 f14274;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14275;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22492 f14276;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f14277;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14278;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C0309 f14279;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f14280;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 f14281;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579[] f14282;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14283;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f14284;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public final C22492 f14285;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14286;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14287;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public final C19670 f14288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22492 f14289;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14290;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3131 f14291;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14292;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final C4583 f14293;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3131 f14294;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14295;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14296;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18258 f14297;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14298;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14299;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC11242[] f14300;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14301;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14302;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f14303;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C0309 f14304;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public static final C16576 f14215 = new C16576();

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f14214 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3836 m11131(C12343 c12343) {
        C3836 c3836 = (C3836) c12343.m30656(f14215);
        return c3836 == null ? new C3836(c12343) : c3836;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6263 m11145(final AbstractC16579 abstractC16579, final C23800 c23800) {
        return (C6263) C9735.computeIfAbsent(this.f14280, new C11100(abstractC16579, c23800), new Function() { // from class: l.֫᩵ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3836.m11132(c23800, this, abstractC16579);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C6263 m11132(C23800 c23800, C3836 c3836, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M52402;
        AbstractC16579 abstractC165710 = c3836.f14283;
        if (abstractC16579.mo1933() == EnumC6617.ARRAY || abstractC16579.mo1933() == EnumC6617.CLASS) {
            abstractC16579M52402 = c23800.m52402(abstractC16579);
        } else if (abstractC16579.mo9482()) {
            abstractC16579M52402 = c23800.m52383(abstractC16579).f77449;
        } else {
            throw new AssertionError(abstractC16579);
        }
        return new C6263(25L, c3836.f14246.f77615, new C0309(abstractC165710.f53222, abstractC165710.mo1934(), C21825.of((Object) abstractC16579M52402)), abstractC16579.f53222);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11151(AbstractC16579 abstractC16579, String str, String str2) {
        C23942 c23942 = this.f14246;
        AbstractC6302 abstractC6302 = c23942.f77631;
        abstractC6302.getClass();
        char[] charArray = str.toCharArray();
        abstractC16579.f53222 = new C22492(1L, abstractC6302.mo17390(charArray, charArray.length), abstractC16579, this.f14227);
        this.f14282[abstractC16579.mo1933().ordinal()] = abstractC16579;
        this.f14300[abstractC16579.mo1933().ordinal()] = c23942.f77631.m17389("java.lang.".concat(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m11134(String str) {
        AbstractC6302 abstractC6302 = this.f14246.f77631;
        abstractC6302.getClass();
        char[] charArray = str.toCharArray();
        return m11148(this.f14235, abstractC6302.mo17390(charArray, charArray.length)).f77449;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11158(AbstractC16579 abstractC16579) {
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        abstractC0618.f77451 = new C13716(this, abstractC0618.f77451);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11150(AbstractC16579 abstractC16579) {
        C22492 c22492M11148 = m11148(this.f14235, this.f14300[abstractC16579.mo1933().ordinal()]);
        c22492M11148.f77451 = new C11599(this, c22492M11148.f77451, abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C0309 m11138(String str) {
        AbstractC6302 abstractC6302 = this.f14246.f77631;
        abstractC6302.getClass();
        char[] charArray = str.toCharArray();
        C0309 c0309 = (C0309) m11148(this.f14235, abstractC6302.mo17390(charArray, charArray.length)).f77449;
        C22492 c22492 = (C22492) c0309.f53222;
        c22492.f77451 = InterfaceC13320.f44208;
        c22492.f77447 = 1073750529L;
        c22492.f77454 = c0309;
        c22492.f73417 = new C10873(c22492);
        c0309.f1655 = C21825.m48588();
        c0309.f1659 = C21825.m48588();
        c0309.f1654 = this.f14266;
        c0309.f1658 = C21825.m48588();
        return c0309;
    }

    public C3836(C12343 c12343) {
        C19670 c19670;
        C3131 c3131 = new C3131(EnumC6617.BYTE);
        this.f14271 = c3131;
        C3131 c3132 = new C3131(EnumC6617.CHAR);
        this.f14294 = c3132;
        C3131 c3133 = new C3131(EnumC6617.SHORT);
        this.f14225 = c3133;
        C3131 c3134 = new C3131(EnumC6617.INT);
        this.f14232 = c3134;
        C3131 c3135 = new C3131(EnumC6617.LONG);
        this.f14264 = c3135;
        C3131 c3136 = new C3131(EnumC6617.FLOAT);
        this.f14256 = c3136;
        C3131 c3137 = new C3131(EnumC6617.DOUBLE);
        this.f14291 = c3137;
        C3131 c3138 = new C3131(EnumC6617.BOOLEAN);
        this.f14263 = c3138;
        C3794 c3794 = C3794.f13674;
        C10188 c10188 = new C10188(null, c3794);
        this.f14228 = c10188;
        C4583 c4583 = new C4583(null, c3794);
        this.f14293 = c4583;
        AbstractC16579[] abstractC16579Arr = new AbstractC16579[EnumC6617.m17947()];
        this.f14282 = abstractC16579Arr;
        this.f14300 = new AbstractC11242[EnumC6617.m17947()];
        this.f14245 = new HashMap();
        this.f14277 = new HashMap();
        this.f14284 = new LinkedHashMap();
        this.f14280 = new HashMap();
        c12343.m30659(f14215, this);
        C23942 c23942M52776 = C23942.m52776(c12343);
        AbstractC6302 abstractC6302 = c23942M52776.f77631;
        AbstractC11242 abstractC11242 = c23942M52776.f77594;
        this.f14246 = c23942M52776;
        C20812 c20812 = new C20812(null, c3794);
        this.f14247 = c20812;
        this.f14229 = C22531.m50048(c12343);
        C16576 c16576 = C12593.f42102;
        C12593 c12593 = (C12593) c12343.m30656(c16576);
        if (c12593 == null) {
            c12593 = new C12593();
            c12343.m30659(c16576, c12593);
            C23942.m52776(c12343);
        }
        C20375 c20375 = new C20375(abstractC11242, c12593, EnumC14128.m34159(c12343).m34170());
        this.f14227 = c20375;
        C19670 c2425 = new C2425(this, abstractC11242);
        this.f14288 = c2425;
        m11136(c2425);
        c2425.f63135 = c2425.f63135.m48597(c2425.f63141);
        C19670 c5248 = new C5248(abstractC11242);
        c5248.f63146 = C21825.m48588();
        c5248.f63142 = C21825.m48588();
        c5248.f63140 = C21825.m48588();
        c5248.f63151 = C21825.m48588();
        c5248.f63134 = C21825.of((Object) new C6948(m11146(this.f14246.f77580), EnumSet.of(EnumC23177.MANDATED)));
        this.f14216 = c5248;
        m11136(c5248);
        C19670 c22182 = new C22182(abstractC11242);
        this.f14249 = c22182;
        m11136(c22182);
        EnumC10477 enumC10477 = EnumC10477.f35876;
        AbstractC11242 abstractC11243 = c23942M52776.f77594;
        C14422 c14422 = AbstractC16579.f53219;
        C1014 c1014 = new C1014(enumC10477, 0L, abstractC11243, c14422, c20375);
        this.f14243 = c1014;
        C22492 c22492 = new C22492(1073741833L, c23942M52776.f77623, null, c20375);
        this.f14276 = c22492;
        C5954 c5954 = new C5954(c22492, c14422);
        this.f14261 = c5954;
        abstractC6302.getClass();
        char[] charArray = "<any?>".toCharArray();
        C22492 c22493 = new C22492(1073741833L, abstractC6302.mo17390(charArray, charArray.length), null, c20375);
        this.f14285 = c22493;
        c22493.f73417 = new C0993((AbstractC23903) c22493);
        c22493.f77449 = c20812;
        m11151(c3131, ClassTransform.BYTE, "Byte");
        m11151(c3133, ClassTransform.SHORT, "Short");
        m11151(c3132, ClassTransform.CHARACTER, "Character");
        m11151(c3134, ClassTransform.INTEGER, "Integer");
        m11151(c3135, ClassTransform.LONG, "Long");
        m11151(c3136, ClassTransform.FLOAT, "Float");
        m11151(c3137, ClassTransform.DOUBLE, "Double");
        m11151(c3138, ClassTransform.BOOLEAN, "Boolean");
        m11151(c4583, ClassTransform.VOID, "Void");
        abstractC6302.getClass();
        char[] charArray2 = "<nulltype>".toCharArray();
        c10188.f53222 = new C22492(1L, abstractC6302.mo17390(charArray2, charArray2.length), c10188, c20375);
        abstractC16579Arr[c10188.mo1933().ordinal()] = c10188;
        c5954.f53222 = c22492;
        abstractC16579Arr[c5954.mo1933().ordinal()] = c5954;
        c20812.f53222 = c22493;
        abstractC16579Arr[c20812.mo1933().ordinal()] = c20812;
        C22492 c22494 = new C22492(1073741825L, c23942M52776.f77543, c1014);
        this.f14258 = c22494;
        C22492 c22495 = new C22492(1073741825L, c23942M52776.f77649, c1014);
        this.f14239 = c22495;
        c22495.f73417 = new C0993((AbstractC23903) c22495);
        C22492 c22496 = new C22492(1073741825L, c23942M52776.f77595, c1014);
        this.f14240 = c22496;
        c22496.f73417 = new C0993((AbstractC23903) c22495);
        C22492 c22497 = new C22492(1073741825L, abstractC11242, c20375);
        this.f14262 = c22497;
        C10873 c10873 = new C10873(c22497);
        c22497.f73417 = c10873;
        this.f14226 = C0576.m2728(c12343).m2737();
        c20375.f25395 = new C10873(c20375);
        c10873.mo24224(c3131.f53222);
        c10873.mo24224(c3133.f53222);
        c10873.mo24224(c3132.f53222);
        c10873.mo24224(c3134.f53222);
        c10873.mo24224(c3135.f53222);
        c10873.mo24224(c3136.f53222);
        c10873.mo24224(c3137.f53222);
        c10873.mo24224(c3138.f53222);
        c10873.mo24224(c5954.f53222);
        c10873.mo24224(c22492);
        if (EnumC14026.f46096.m33945(EnumC11909.m29706(c12343))) {
            C19670 c19670M11146 = m11146(c23942M52776.f77580);
            this.f14235 = c19670M11146;
            c19670M11146.f77451 = InterfaceC13320.f44208;
            c19670M11146.f63148 = Collections.EMPTY_MAP;
            c19670 = c22182;
        } else {
            c19670 = c22182;
            this.f14235 = c19670;
        }
        InterfaceC13320 interfaceC13320M30635 = C12325.m30599(c12343).m30635();
        this.f14281 = interfaceC13320M30635;
        AbstractC16579 abstractC16579M11134 = m11134("java.lang.Object");
        this.f14275 = abstractC16579M11134;
        this.f14292 = m11134("java.lang.runtime.ObjectMethods");
        this.f14290 = m11134("java.util.Objects");
        this.f14283 = m11134("java.lang.Class");
        this.f14220 = m11134("java.lang.String");
        m11134("java.lang.StringBuffer");
        this.f14236 = m11134("java.lang.StringBuilder");
        AbstractC16579 abstractC16579M11135 = m11134("java.lang.Cloneable");
        this.f14286 = abstractC16579M11135;
        this.f14302 = m11134("java.lang.Throwable");
        AbstractC16579 abstractC16579M11136 = m11134("java.io.Serializable");
        this.f14268 = abstractC16579M11136;
        AbstractC16579 abstractC16579M11137 = m11134("java.lang.invoke.SerializedLambda");
        this.f14260 = abstractC16579M11137;
        this.f14244 = m11134("java.lang.invoke.VarHandle");
        this.f14272 = m11134("java.lang.invoke.MethodHandle");
        this.f14301 = m11134("java.lang.invoke.MethodHandles$Lookup");
        this.f14295 = m11134("java.lang.invoke.MethodType");
        this.f14278 = m11134("java.lang.Error");
        this.f14269 = m11134("java.lang.IllegalArgumentException");
        this.f14267 = m11134("java.lang.InterruptedException");
        AbstractC16579 abstractC16579M11138 = m11134("java.lang.Exception");
        this.f14237 = abstractC16579M11138;
        this.f14233 = m11134("java.lang.RuntimeException");
        m11134("java.lang.ClassNotFoundException");
        m11134("java.lang.NoClassDefFoundError");
        this.f14254 = m11134("java.lang.NoSuchFieldError");
        this.f14234 = m11134("java.lang.AssertionError");
        this.f14221 = m11134("java.lang.IncompatibleClassChangeError");
        m11134("java.lang.CloneNotSupportedException");
        this.f14266 = m11134("java.lang.annotation.Annotation");
        m11134("java.lang.ClassLoader");
        C22492 c22492M11148 = m11148(this.f14235, c23942M52776.f77640);
        this.f14289 = c22492M11148;
        C19670 c19671 = c19670;
        this.f14274 = new C18258(137438953492L, c23942M52776.f77553, new C13757(C21825.m48588(), c4583, C21825.m48588(), c22496), c22492M11148);
        m11134("java.util.List");
        m11134("java.util.Collections");
        m11134("java.lang.Comparable");
        this.f14248 = m11134("java.util.Comparator");
        m11134("java.util.Arrays");
        this.f14259 = m11134("java.lang.Iterable");
        this.f14224 = m11134("java.util.Iterator");
        this.f14231 = m11134("java.lang.annotation.Target");
        this.f14217 = m11134("java.lang.Override");
        this.f14252 = m11134("java.lang.annotation.Retention");
        this.f14253 = m11134("java.lang.Deprecated");
        this.f14265 = m11134("java.lang.SuppressWarnings");
        m11134("java.util.function.Supplier");
        this.f14251 = m11134("java.lang.annotation.Inherited");
        this.f14222 = m11134("java.lang.annotation.Repeatable");
        this.f14242 = m11134("java.lang.annotation.Documented");
        m11134("java.lang.annotation.ElementType");
        this.f14241 = m11134("java.lang.System");
        AbstractC16579 abstractC16579M11139 = m11134("java.lang.AutoCloseable");
        this.f14218 = abstractC16579M11139;
        this.f14297 = new C18258(1L, c23942M52776.f77582, new C13757(C21825.m48588(), c4583, C21825.of((Object) abstractC16579M11138), c22496), abstractC16579M11139.f53222);
        this.f14273 = m11134("java.lang.SafeVarargs");
        this.f14287 = m11134("java.lang.annotation.Native");
        AbstractC16579 abstractC16579M111310 = m11134("java.lang.invoke.LambdaMetafactory");
        this.f14298 = abstractC16579M111310;
        AbstractC16579 abstractC16579M111311 = m11134("java.lang.invoke.StringConcatFactory");
        this.f14299 = abstractC16579M111311;
        this.f14303 = m11134("java.lang.FunctionalInterface");
        this.f14238 = m11134("jdk.internal.javac.PreviewFeature");
        this.f14279 = m11138("jdk.internal.PreviewFeature+Annotation");
        this.f14296 = m11134("java.lang.invoke.TypeDescriptor");
        this.f14270 = m11134("java.lang.Record");
        this.f14230 = m11134("java.lang.runtime.SwitchBootstraps");
        this.f14255 = m11134("jdk.internal.ValueBased");
        this.f14250 = m11138("jdk.internal.ValueBased+Annotation");
        m11158(abstractC16579M11139);
        m11158(abstractC16579M11135);
        m11158(abstractC16579M11136);
        m11158(abstractC16579M111310);
        m11158(abstractC16579M11137);
        m11158(abstractC16579M111311);
        m11150(c3137);
        m11150(c3136);
        m11150(c4583);
        this.f14304 = m11138("sun.Proprietary+Annotation");
        C0309 c0309M11138 = m11138("jdk.Profile+Annotation");
        this.f14257 = c0309M11138;
        c0309M11138.f53222.mo20272().mo24224(new C18258(1025L, c23942M52776.f77643, c3134, c0309M11138.f53222));
        C0309 c0309 = (C0309) c22494.f77449;
        c0309.f1654 = abstractC16579M11134;
        c0309.f1658 = C21825.of((Object) abstractC16579M11135, (Object) abstractC16579M11136);
        c22494.f73417 = new C10873(c22494);
        C6263 c6263 = new C6263(17L, c23942M52776.f77598, c3134, c22494);
        this.f14219 = c6263;
        c22494.mo49994();
        c22494.f73417.mo24224(c6263);
        C18258 c18258 = new C18258(1L, c23942M52776.f77541, new C13757(C21825.m48588(), abstractC16579M11134, C21825.m48588(), c22496), c22494);
        this.f14223 = c18258;
        c22494.mo49994();
        c22494.f73417.mo24224(c18258);
        C19670 c19672 = this.f14235;
        if (c19672 != c19671) {
            C13638.requireNonNull(interfaceC13320M30635);
            c19672.f77451 = new C5672(5, interfaceC13320M30635);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m11147(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        C22492 c22492 = new C22492(0L, abstractC11242, abstractC23903);
        c22492.f77451 = this.f14226;
        return c22492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m11149(C19670 c19670, AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        C6171.m17171(c19670);
        C22492 c22492M11155 = m11155(c19670, AbstractC0618.m2875(abstractC11242, abstractC0618));
        if (c22492M11155 == null) {
            C22492 c22492M11147 = m11147(abstractC11242, abstractC0618);
            ((Map) C9735.computeIfAbsent(this.f14245, c22492M11147.f73414, new C23788(2))).put(c19670, c22492M11147);
            return c22492M11147;
        }
        if ((c22492M11155.f77453 != abstractC11242 || c22492M11155.f77448 != abstractC0618) && abstractC0618.f77452 == EnumC10477.f35865) {
            AbstractC23903 abstractC23903 = c22492M11155.f77448;
            if (abstractC23903.f77452 == EnumC10477.f35867) {
                abstractC23903.mo20272().mo24223(c22492M11155);
                c22492M11155.f77453 = abstractC11242;
                c22492M11155.f77448 = abstractC0618;
                c22492M11155.f73419 = AbstractC0618.m2876(abstractC11242, abstractC0618);
            }
        }
        return c22492M11155;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22492 m11155(C19670 c19670, final AbstractC11242 abstractC11242) {
        C13638.requireNonNull(abstractC11242);
        C6171.m17172(c19670, new Supplier() { // from class: l.ۢ᩵ۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC11242.toString();
            }
        });
        return (C22492) ((Map) C9735.getOrDefault(this.f14245, abstractC11242, Collections.EMPTY_MAP)).get(c19670);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7675 m11152(C19670 c19670, AbstractC11242 abstractC11242) {
        return m11133(c19670, abstractC11242, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7675 m11133(C19670 c19670, AbstractC11242 abstractC11242, boolean z) {
        C6171.m17171(c19670);
        if (abstractC11242.isEmpty()) {
            return c19670.f63141;
        }
        if (c19670 == this.f14249) {
            return m11157(c19670, abstractC11242);
        }
        c19670.mo49994();
        C7675 c7675 = (C7675) c19670.f63148.get(abstractC11242);
        if (c7675 != null) {
            return c7675;
        }
        C7675 c7675M11143 = m11143(c19670, abstractC11242);
        if ((c7675M11143 != null && c7675M11143.mo20273()) || z) {
            return c7675M11143;
        }
        C21825 c21825 = c19670.f63134;
        if (c21825 != null && C9030.stream(c21825).map(new C1533(10)).anyMatch(new Predicate() { // from class: l.ۗ᩵ۤ
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
                return ((C19670) obj) == this.f12668.f14288;
            }
        })) {
            C19670 c19671 = this.f14288;
            C7675 c7675M11144 = m11143(c19671, abstractC11242);
            if (c7675M11144 != null && c7675M11144.mo20273()) {
                c19670.f63148.put(c7675M11144.f25396, c7675M11144);
                return c7675M11144;
            }
            C7675 c7675M11157 = m11157(c19670, abstractC11242);
            c7675M11157.mo49994();
            if (!c7675M11157.mo20273()) {
                C7675 c7675M11158 = m11157(c19671, abstractC11242);
                c7675M11158.mo49994();
                if (c7675M11158.mo20273()) {
                    c19670.f63148.put(c7675M11158.f25396, c7675M11158);
                    return c7675M11158;
                }
            }
            return c7675M11157;
        }
        return m11157(c19670, abstractC11242);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m11141(C19670 c19670, AbstractC11242 abstractC11242) {
        ((Map) C9735.getOrDefault(this.f14245, abstractC11242, f14214)).remove(c19670);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m11148(C19670 c19670, AbstractC11242 abstractC11242) {
        C6171.m17171(c19670);
        C7675 c7675M11133 = m11133(c19670, abstractC11242.m28210(0, abstractC11242.m28208((byte) 46)), false);
        C6171.m17171(c7675M11133);
        C6171.m17171(c7675M11133.f25392);
        C22492 c22492M11155 = m11155(c7675M11133.f25392, abstractC11242);
        if (c22492M11155 != null) {
            return c22492M11155;
        }
        C22492 c22492M11147 = m11147(C17281.m40243(abstractC11242), c7675M11133);
        ((Map) C9735.computeIfAbsent(this.f14245, c22492M11147.f73414, new C23788(2))).put(c7675M11133.f25392, c22492M11147);
        return c22492M11147;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m11159(C19670 c19670, AbstractC11242 abstractC11242) {
        C6171.m17171(c19670);
        C7675 c7675M11133 = m11133(c19670, abstractC11242, true);
        return c7675M11133 != null && c7675M11133.mo20273();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7675 m11157(final C19670 c19670, AbstractC11242 abstractC11242) {
        C6171.m17171(c19670);
        C7675 c7675M11143 = m11143(c19670, abstractC11242);
        if (c7675M11143 != null) {
            return c7675M11143;
        }
        C6171.m17177(!abstractC11242.isEmpty(), new Supplier() { // from class: l.ۙۡۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "rootPackage missing!; currModule: " + c19670;
            }
        });
        C7675 c7675 = new C7675(C17281.m40243(abstractC11242), m11157(c19670, abstractC11242.m28210(0, abstractC11242.m28208((byte) 46))));
        c7675.f77451 = this.f14226;
        c7675.f25392 = c19670;
        ((Map) C9735.computeIfAbsent(this.f14277, c7675.f25396, new C12291(6))).put(c19670, c7675);
        c19670.f63135 = c19670.f63135.m48597(c7675);
        return c7675;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11136(C19670 c19670) {
        C20375 c20375 = this.f14227;
        ((Map) C9735.computeIfAbsent(this.f14277, c20375.f25396, new C12291(6))).put(c19670, c20375);
        c19670.f63135 = c19670.f63135.m48597(c20375);
        C13010 c13010 = new C13010(this, this.f14246.f77594, c20375);
        c13010.f25392 = c19670;
        c13010.f77451 = new C4328(this);
        c13010.f77447 |= X931RNG.BLOCK128_RESEED_MAX;
        c19670.f63141 = c13010;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7675 m11143(C19670 c19670, AbstractC11242 abstractC11242) {
        return (C7675) ((Map) C9735.getOrDefault(this.f14277, abstractC11242, Collections.EMPTY_MAP)).get(c19670);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19670 m11146(AbstractC11242 abstractC11242) {
        LinkedHashMap linkedHashMap = this.f14284;
        C19670 c19670 = (C19670) linkedHashMap.get(abstractC11242);
        if (c19670 != null) {
            return c19670;
        }
        AbstractC11242 abstractC11243 = this.f14246.f77609;
        C19670 c19671 = new C19670(abstractC11242);
        C22492 c22492 = new C22492(2251799813685248L, abstractC11243, c19671);
        AbstractC11242 abstractC11242M2876 = AbstractC0618.m2876(abstractC11243, c19671);
        c22492.f73419 = abstractC11242M2876;
        c22492.f73414 = abstractC11242M2876;
        c22492.f73417 = new C10873(c22492);
        c19671.f63139 = c22492;
        m11136(c19671);
        c19671.f77451 = new C1359(7, this);
        linkedHashMap.put(abstractC11242, c19671);
        return c19671;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19670 m11154(AbstractC11242 abstractC11242) {
        return (C19670) this.f14284.get(abstractC11242);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m11153(AbstractC11242 abstractC11242) {
        if (abstractC11242.isEmpty()) {
            return C21825.m48588();
        }
        C21825 c21825M48588 = C21825.m48588();
        Map map = (Map) this.f14277.get(abstractC11242);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C7675 c7675 = (C7675) entry.getValue();
                c7675.mo49994();
                if (!c7675.f25395.m9329()) {
                    c21825M48588 = c21825M48588.m48597((C19670) entry.getKey());
                }
            }
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m11144() {
        return this.f14284.values();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collection m11156(AbstractC11242 abstractC11242) {
        return ((Map) C9735.getOrDefault(this.f14245, abstractC11242, Collections.EMPTY_MAP)).values();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Collection m11142(AbstractC11242 abstractC11242) {
        return ((Map) C9735.getOrDefault(this.f14277, abstractC11242, Collections.EMPTY_MAP)).values();
    }
}
