package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩹ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes.dex */
public final class C22447 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C14377[][] f73249;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2008 f73250;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f73251;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f73252;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5286 f73254;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f73255;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23153 f73257;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23942 f73261;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21741 f73262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC11909 f73263;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f73264;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f73267;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6656 f73268;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20330 f73269;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f73270;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f73271;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C20414 f73272;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12281 f73275;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73276;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC6323 f73277;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21825 f73256 = C21825.m48588();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73273 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73260 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f73259 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f73266 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f73253 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f73258 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f73274 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18959 f73265 = new C18959(5);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49877(int i, AbstractC5930 abstractC5930, C19003 c19003) {
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C10870 c10870M14642 = c5286.m14642(m49909(abstractC5930));
        AbstractC6323 abstractC6323 = this.f73277;
        c19003.m43723(abstractC6323.mo6628(c10870M14642));
        while (this.f73269.f65849 == EnumC0573.f2469) {
            m49918();
            int i2 = this.f73269.f65847;
            AbstractC5930 abstractC5930M49900 = m49900(1);
            c5286.f18294 = i2;
            c19003.m43723(abstractC6323.mo6628(c5286.m14642(m49909(abstractC5930M49900))));
        }
    }

    public C22447(C15392 c15392, C21741 c21741, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC6323 c2089;
        this.f73262 = c21741;
        m49918();
        C5286 c5286 = c15392.f50098;
        this.f73254 = c5286;
        this.f73272 = c15392.f50101;
        this.f73261 = c15392.f50100;
        EnumC11909 enumC11909 = c15392.f50096;
        this.f73263 = enumC11909;
        this.f73250 = c15392.f50099;
        String strM35397 = c15392.f50097.m35397("allowStringFolding");
        this.f73276 = strM35397 == null ? true : Boolean.parseBoolean(strM35397);
        this.f73270 = z;
        this.f73267 = z4;
        this.f73257 = z ? new C23153(c15392) : null;
        this.f73271 = z2;
        this.f73275 = c5286.m14644();
        if (z3) {
            c2089 = new C5513(this);
        } else {
            c2089 = new C2089(this);
        }
        this.f73277 = c2089;
        this.f73264 = EnumC14026.f46091.m33945(enumC11909);
        this.f73252 = EnumC14026.f46103.m33945(enumC11909);
        this.f73255 = EnumC14026.f46102.m33945(enumC11909);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m49924() {
        this.f73260 = (this.f73260 & 32) | 1;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m49898() {
        this.f73260 = (this.f73260 & 32) | 2;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m49918() {
        C21741 c21741 = this.f73262;
        c21741.m48505();
        this.f73269 = c21741.m48507(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49887(int i, Predicate predicate) {
        return predicate.test(this.f73262.m48507(i + 1).f65849);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49888(int i, Predicate predicate, Predicate predicate2) {
        C21741 c21741 = this.f73262;
        return predicate.test(c21741.m48507(i + 1).f65849) && predicate2.test(c21741.m48507(i + 2).f65849);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49886(boolean z, boolean z2, boolean z3, boolean z4) {
        while (true) {
            switch (C17612.f55968[this.f73269.f65849.ordinal()]) {
                case 1:
                    m49918();
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return;
                case 10:
                    if (z) {
                        return;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (z2) {
                        return;
                    }
                    break;
                case 31:
                case 32:
                    if (z3) {
                        return;
                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (z4) {
                        return;
                    }
                    break;
                case 51:
                    if (z4) {
                        return;
                    }
                    break;
            }
            m49918();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12281 m49913(int i, C5909 c5909) {
        return m49866(i, C21825.m48588(), c5909);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12281 m49866(int i, C21825 c21825, C5909 c5909) {
        AbstractC8774 abstractC8774;
        m49916(i);
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C12281 c12281M14645 = c5286.m14645(c21825);
        m49884(c12281M14645, c5909);
        if (c21825 != null && (abstractC8774 = (AbstractC8774) c21825.last()) != null) {
            m49882(abstractC8774, i);
        }
        return (C12281) this.f73277.mo6628(c12281M14645);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49876(int i, C5909 c5909) {
        m49884(new C3086(i), c5909);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49884(InterfaceC12260 interfaceC12260, C5909 c5909) {
        int iMo9278 = interfaceC12260.mo9278();
        C21741 c21741 = this.f73262;
        if (iMo9278 > c21741.m48502() || iMo9278 == -1) {
            EnumC0573 enumC0573 = this.f73269.f65849;
            EnumC0573 enumC0574 = EnumC0573.f2441;
            C20414 c20414 = this.f73272;
            if (enumC0573 == enumC0574) {
                c20414.m48193(EnumC0264.SYNTAX, interfaceC12260, C23879.f77219);
            } else {
                c20414.m48193(EnumC0264.SYNTAX, interfaceC12260, c5909);
            }
        }
        c21741.m48503(iMo9278);
        C20330 c20330 = this.f73269;
        int i = c20330.f65847;
        if (i == this.f73266 && c20330.f65849 != EnumC0573.f2441) {
            int i2 = this.f73253;
            this.f73253 = i2 + 1;
            C6171.m17176(i2 < 50);
        } else {
            this.f73253 = 0;
            this.f73266 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49880(EnumC0573 enumC0573) {
        m49881(enumC0573, new C17437(5));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49881(EnumC0573 enumC0573, Function function) {
        C20330 c20330 = this.f73269;
        if (c20330.f65849 == enumC0573) {
            m49918();
        } else {
            m49916(c20330.f65847);
            m49876(this.f73262.m48501().f65850, (C5909) function.apply(enumC0573));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12281 m49865(int i) {
        m49916(i);
        if ((this.f73260 & 1) != 0) {
            return m49913(i, C23879.f77195);
        }
        return m49913(i, C23879.f77280);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12281 m49895() {
        return m49865(this.f73269.f65847);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49883(AbstractC8774 abstractC8774, InterfaceC9042 interfaceC9042) {
        if (!this.f73270 || interfaceC9042 == null) {
            return;
        }
        this.f73257.m51145(abstractC8774, interfaceC9042);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49882(AbstractC8774 abstractC8774, int i) {
        this.f73277.mo6627(abstractC8774, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m49823(AbstractC5930 abstractC5930, C21825 c21825, boolean z) {
        EnumC18651 enumC18651;
        EnumC18651 enumC18652;
        AbstractC6323 abstractC6323 = this.f73277;
        int iMo6625 = abstractC6323.mo6625(abstractC5930);
        C0990 c0990 = null;
        AbstractC5930 abstractC5931 = abstractC5930;
        while (C3128.m9458(abstractC5931).m22847(EnumC18651.f60566)) {
            c0990 = (C0990) C3128.m9458(abstractC5931);
            abstractC5931 = c0990.f4638;
        }
        C5286 c5286 = this.f73254;
        if (z) {
            c5286.f18294 = this.f73269.f65847;
            abstractC5931 = (AbstractC5930) abstractC6323.mo6629(c5286.m14630(abstractC5931));
            iMo6625 = abstractC6323.mo6625(abstractC5931);
        }
        if (c21825.m48595()) {
            AbstractC5930 abstractC5932 = abstractC5931;
            AbstractC5930 abstractC5933 = abstractC5932;
            while (true) {
                AbstractC5930 abstractC5930M9458 = C3128.m9458(abstractC5932);
                enumC18651 = EnumC18651.f60473;
                if (!abstractC5930M9458.m22847(enumC18651)) {
                    AbstractC5930 abstractC5930M9459 = C3128.m9458(abstractC5932);
                    enumC18652 = EnumC18651.f60493;
                    if (!abstractC5930M9459.m22847(enumC18652)) {
                        break;
                    }
                }
                while (C3128.m9458(abstractC5932).m22847(EnumC18651.f60473)) {
                    abstractC5933 = abstractC5932;
                    abstractC5932 = ((C23570) C3128.m9458(abstractC5932)).f76357;
                }
                while (C3128.m9458(abstractC5932).m22847(EnumC18651.f60493)) {
                    abstractC5933 = abstractC5932;
                    abstractC5932 = ((C11596) C3128.m9458(abstractC5932)).f38963;
                }
            }
            c5286.f18294 = ((C5224) c21825.f70876).f30189;
            C2401 c2401M14582 = c5286.m14582(abstractC5932, c21825);
            if (C3128.m9458(abstractC5933).m22847(enumC18652)) {
                ((C11596) C3128.m9458(abstractC5933)).f38963 = c2401M14582;
            } else if (C3128.m9458(abstractC5933).m22847(enumC18651)) {
                ((C23570) C3128.m9458(abstractC5933)).f76357 = c2401M14582;
            } else {
                abstractC5931 = c2401M14582;
            }
        }
        if (c0990 == null) {
            return abstractC5931;
        }
        c0990.f4638 = abstractC5931;
        m49882(abstractC5930, iMo6625);
        return abstractC5930;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m49863(boolean z) {
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        int i = c20330.f65847;
        EnumC0573 enumC0574 = EnumC0573.f2416;
        if (enumC0573 == enumC0574) {
            AbstractC11242 abstractC11242Mo26414 = c20330.mo26414();
            m49918();
            return abstractC11242Mo26414;
        }
        EnumC0573 enumC0575 = EnumC0573.f2493;
        C23942 c23942 = this.f73261;
        C20414 c20414 = this.f73272;
        if (enumC0573 == enumC0575) {
            c20414.m48192(EnumC0264.SYNTAX, i, C23879.f77307);
            m49918();
            return c23942.f77652;
        }
        if (enumC0573 == EnumC0573.f2462) {
            c20414.m48192(EnumC0264.SYNTAX, i, C23879.f77212);
            m49918();
            return c23942.f77652;
        }
        if (enumC0573 == EnumC0573.f2442) {
            if (this.f73251) {
                m49885(EnumC14026.f46100);
                AbstractC11242 abstractC11242Mo26415 = this.f73269.mo26414();
                m49918();
                return abstractC11242Mo26415;
            }
            c20414.m48192(EnumC0264.SYNTAX, i, C23879.f77298);
            m49918();
            return c23942.f77652;
        }
        if (enumC0573 == EnumC0573.f2428) {
            if (EnumC14026.f46108.m33945(this.f73263)) {
                c20414.m48190(this.f73269.f65847, C9768.f32832);
            } else {
                c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77190);
            }
            AbstractC11242 abstractC11242Mo26416 = this.f73269.mo26414();
            m49918();
            return abstractC11242Mo26416;
        }
        m49880(enumC0574);
        if (z && this.f73269.f65849 == EnumC0573.f2490) {
            m49918();
            return c23942.f77615;
        }
        return c23942.f77652;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49845(boolean z) {
        int i = this.f73269.f65847;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C3107 c3107M14639 = c5286.m14639(m49863(false));
        AbstractC6323 abstractC6323 = this.f73277;
        AbstractC5930 abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c3107M14639);
        while (true) {
            C20330 c20330 = this.f73269;
            if (c20330.f65849 != EnumC0573.f2417) {
                return abstractC5930;
            }
            int i2 = c20330.f65847;
            m49918();
            C21825 c21825M49873 = z ? m49873(EnumC18651.f60508) : null;
            c5286.f18294 = i2;
            abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14625(abstractC5930, m49863(false)));
            if (c21825M49873 != null && c21825M49873.m48595()) {
                c5286.f18294 = ((C5224) c21825M49873.f70876).f30189;
                abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5930, c21825M49873));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x022b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49856(AbstractC11242 abstractC11242, int i) {
        char c;
        long j;
        AbstractC5930 abstractC5930M14581;
        int i2;
        int i3;
        Float fValueOf;
        Double dValueOf;
        int i4 = C17612.f55968[this.f73269.f65849.ordinal()];
        C20414 c20414 = this.f73272;
        C5286 c5286 = this.f73254;
        C12281 c12281 = this.f73275;
        switch (i4) {
            case 52:
                try {
                    c5286.f18294 = i;
                    EnumC6617 enumC6617 = EnumC6617.INT;
                    String strM49849 = m49849(abstractC11242);
                    int iMo20177 = this.f73269.mo20177();
                    if (iMo20177 == 10) {
                        i2 = Integer.parseInt(strM49849, iMo20177);
                    } else {
                        int i5 = Integer.MAX_VALUE / (iMo20177 / 2);
                        int i6 = 0;
                        for (char c2 : strM49849.toCharArray()) {
                            int iDigit = Character.digit(c2, iMo20177);
                            if (i6 < 0 || i6 > i5 || (i3 = i6 * iMo20177) > Integer.MAX_VALUE - iDigit) {
                                throw new NumberFormatException();
                            }
                            i6 = i3 + iDigit;
                        }
                        i2 = i6;
                    }
                    abstractC5930M14581 = c5286.m14581(enumC6617, Integer.valueOf(i2));
                } catch (NumberFormatException unused) {
                    EnumC0264 enumC0264 = EnumC0264.SYNTAX;
                    int i7 = this.f73269.f65847;
                    String strM498410 = m49849(abstractC11242);
                    C5909 c5909 = C23879.f77204;
                    c20414.m48192(enumC0264, i7, new C5909("compiler", "int.number.too.large", strM498410));
                    abstractC5930M14581 = c12281;
                }
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case 53:
                try {
                    c5286.f18294 = i;
                    EnumC6617 enumC6618 = EnumC6617.LONG;
                    String strM498411 = m49849(abstractC11242);
                    int iMo20178 = this.f73269.mo20177();
                    if (iMo20178 == 10) {
                        j = Long.parseLong(strM498411, iMo20178);
                    } else {
                        char[] charArray = strM498411.toCharArray();
                        long j2 = C17492.FOREVER_NS / ((long) (iMo20178 / 2));
                        int length = charArray.length;
                        int i8 = 0;
                        long j3 = 0;
                        while (i8 < length) {
                            int iDigit2 = Character.digit(charArray[i8], iMo20178);
                            if (j3 >= 0 && j3 <= j2) {
                                char[] cArr = charArray;
                                int i9 = length;
                                long j4 = j3 * ((long) iMo20178);
                                long j5 = iDigit2;
                                if (j4 <= C17492.FOREVER_NS - j5) {
                                    j3 = j4 + j5;
                                    i8++;
                                    charArray = cArr;
                                    length = i9;
                                }
                            }
                            throw new NumberFormatException();
                        }
                        j = j3;
                    }
                    c = 0;
                    try {
                        abstractC5930M14581 = c5286.m14581(enumC6618, Long.valueOf(j));
                    } catch (NumberFormatException unused2) {
                        EnumC0264 enumC0265 = EnumC0264.SYNTAX;
                        int i10 = this.f73269.f65847;
                        String strM498412 = m49849(abstractC11242);
                        C5909 c59010 = C23879.f77204;
                        Object[] objArr = new Object[1];
                        objArr[c] = strM498412;
                        c20414.m48192(enumC0265, i10, new C5909("compiler", "int.number.too.large", objArr));
                        abstractC5930M14581 = c12281;
                    }
                    break;
                } catch (NumberFormatException unused3) {
                    c = 0;
                }
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                String strMo45897 = this.f73269.mo20177() == 16 ? "0x" + this.f73269.mo45897() : this.f73269.mo45897();
                try {
                    fValueOf = Float.valueOf(strMo45897);
                    break;
                } catch (NumberFormatException unused4) {
                    fValueOf = Float.valueOf(Float.NaN);
                }
                if (fValueOf.floatValue() != 0.0f || m49827(strMo45897)) {
                    if (fValueOf.floatValue() == Float.POSITIVE_INFINITY) {
                        c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77331);
                    } else {
                        c5286.f18294 = i;
                        abstractC5930M14581 = c5286.m14581(EnumC6617.FLOAT, fValueOf);
                    }
                    if (abstractC5930M14581 == c12281) {
                        c5286.f18294 = i;
                        abstractC5930M14581 = c5286.m14644();
                    }
                    m49882(abstractC5930M14581, this.f73269.f65850);
                    m49918();
                    return abstractC5930M14581;
                }
                c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77294);
                abstractC5930M14581 = c12281;
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                String strMo45898 = this.f73269.mo20177() == 16 ? "0x" + this.f73269.mo45897() : this.f73269.mo45897();
                try {
                    dValueOf = Double.valueOf(strMo45898);
                    break;
                } catch (NumberFormatException unused5) {
                    dValueOf = Double.valueOf(Double.NaN);
                }
                if (dValueOf.doubleValue() != 0.0d || m49827(strMo45898)) {
                    if (dValueOf.doubleValue() == Double.POSITIVE_INFINITY) {
                        c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77331);
                    } else {
                        c5286.f18294 = i;
                        abstractC5930M14581 = c5286.m14581(EnumC6617.DOUBLE, dValueOf);
                    }
                    if (abstractC5930M14581 == c12281) {
                        c5286.f18294 = i;
                        abstractC5930M14581 = c5286.m14644();
                    }
                    m49882(abstractC5930M14581, this.f73269.f65850);
                    m49918();
                    return abstractC5930M14581;
                }
                c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77294);
                abstractC5930M14581 = c12281;
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case 56:
                c5286.f18294 = i;
                abstractC5930M14581 = c5286.m14581(EnumC6617.CHAR, Integer.valueOf(this.f73269.mo45897().charAt(0)));
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case 57:
                c5286.f18294 = i;
                abstractC5930M14581 = c5286.m14581(EnumC6617.CLASS, this.f73269.mo45897());
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                c5286.f18294 = i;
                abstractC5930M14581 = c5286.m14581(EnumC6617.BOOLEAN, Integer.valueOf(this.f73269.f65849 != EnumC0573.f2453 ? 0 : 1));
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            case 60:
                c5286.f18294 = i;
                abstractC5930M14581 = c5286.m14581(EnumC6617.BOT, (Object) null);
                if (abstractC5930M14581 == c12281) {
                    c5286.f18294 = i;
                    abstractC5930M14581 = c5286.m14644();
                }
                m49882(abstractC5930M14581, this.f73269.f65850);
                m49918();
                return abstractC5930M14581;
            default:
                C6171.m17170();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49827(String str) {
        char c;
        char[] charArray = str.toCharArray();
        int i = (charArray.length <= 1 || Character.toLowerCase(charArray[1]) != 'x') ? 10 : 16;
        int i2 = i == 16 ? 2 : 0;
        while (i2 < charArray.length && ((c = charArray[i2]) == '0' || c == '.')) {
            i2++;
        }
        return i2 >= charArray.length || Character.digit(charArray[i2], i) <= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49849(AbstractC11242 abstractC11242) {
        String strMo45897 = this.f73269.mo45897();
        if (abstractC11242.isEmpty()) {
            return strMo45897;
        }
        return ((Object) abstractC11242) + strMo45897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20372 m49868(int i, C21783 c21783, AbstractC5930 abstractC5930, boolean z) {
        AbstractC20372 abstractC20372;
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2460;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (enumC0573 == enumC0574 && abstractC5930 == null) {
            int i2 = c20330.f65847;
            m49880(enumC0574);
            AbstractC20372 abstractC20372M49868 = m49868(this.f73269.f65847, (C21783) null, (AbstractC5930) null, false);
            m49880(EnumC0573.f2415);
            c5286.f18294 = i2;
            C16139 c16139 = new C16139();
            c16139.f52149 = abstractC20372M49868;
            c16139.f30189 = c5286.f18294;
            abstractC20372 = (AbstractC20372) abstractC6323.mo6628(c16139);
        } else {
            if (c21783 == null) {
                c21783 = m49870(0L);
            }
            if (abstractC5930 == null) {
                abstractC5930 = m49900(34);
            }
            c5286.f18294 = this.f73269.f65847;
            C6656 c6656 = (C6656) abstractC6323.mo6628(c5286.m14596(c21783, m49863(false), abstractC5930, (AbstractC5930) null));
            c5286.f18294 = i;
            C15103 c15103 = new C15103();
            c15103.f49323 = c6656;
            c15103.f30189 = c5286.f18294;
            abstractC20372 = (AbstractC20372) abstractC6323.mo6628(c15103);
        }
        if (z || this.f73269.f65849 != EnumC0573.f2465) {
            return abstractC20372;
        }
        m49885(EnumC14026.f46127);
        m49918();
        AbstractC5930 abstractC5930M49900 = m49900(33);
        c5286.f18294 = i;
        C9459 c9459 = new C9459();
        c9459.f32014 = abstractC20372;
        c9459.f32013 = abstractC5930M49900;
        c9459.f30189 = c5286.f18294;
        return c9459;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49841(boolean z) {
        AbstractC5930 abstractC5930M49900 = m49900(2);
        AbstractC11242 abstractC11242M49862 = m49862(abstractC5930M49900, !z);
        if (abstractC11242M49862 != null && (!z || abstractC11242M49862 != this.f73261.f77534)) {
            int i = abstractC5930M49900.f30189;
            C5909 c5909 = C23879.f77204;
            m49913(i, new C5909("compiler", "restricted.type.not.allowed.here", abstractC11242M49862));
        }
        return abstractC5930M49900;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49900(int i) {
        int i2 = this.f73260;
        this.f73260 = i;
        AbstractC5930 abstractC5930M49896 = m49896();
        this.f73259 = this.f73260;
        this.f73260 = i2;
        return abstractC5930M49896;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49896() {
        AbstractC5930 abstractC5930M49926 = m49926();
        if ((this.f73260 & 1) == 0) {
            return abstractC5930M49926;
        }
        EnumC0573 enumC0573 = this.f73269.f65849;
        return (enumC0573 == EnumC0573.f2466 || (EnumC0573.f2405.compareTo(enumC0573) <= 0 && this.f73269.f65849.compareTo(EnumC0573.f2402) <= 0)) ? m49928(abstractC5930M49926) : abstractC5930M49926;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49928(AbstractC5930 abstractC5930) {
        int i = C17612.f55968[this.f73269.f65849.ordinal()];
        C5286 c5286 = this.f73254;
        switch (i) {
            case 61:
                int i2 = this.f73269.f65847;
                m49918();
                m49924();
                AbstractC5930 abstractC5930M49896 = m49896();
                c5286.f18294 = i2;
                return (AbstractC5930) this.f73277.mo6628(c5286.m14587(abstractC5930, abstractC5930M49896));
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                C20330 c20330 = this.f73269;
                int i3 = c20330.f65847;
                EnumC0573 enumC0573 = c20330.f65849;
                m49918();
                m49924();
                AbstractC5930 abstractC5930M49897 = m49896();
                c5286.f18294 = i3;
                return c5286.m14593(m49837(enumC0573), (AbstractC8774) abstractC5930, (AbstractC8774) abstractC5930M49897);
            default:
                return abstractC5930;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49843(AbstractC5930 abstractC5930) {
        C20330 c20330 = this.f73269;
        if (c20330.f65849 != EnumC0573.f2488) {
            return abstractC5930;
        }
        int i = c20330.f65847;
        m49918();
        AbstractC5930 abstractC5930M49896 = m49896();
        m49880(EnumC0573.f2484);
        AbstractC5930 abstractC5930M49926 = m49926();
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        return c5286.m14598(abstractC5930, abstractC5930M49896, abstractC5930M49926);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49926() {
        AbstractC5930 abstractC5930M49919 = m49919();
        if ((this.f73260 & 1) != 0 && m49833(this.f73269.f65849) >= 4) {
            m49924();
            abstractC5930M49919 = m49891(abstractC5930M49919);
        }
        if ((this.f73260 & 1) == 0 || this.f73269.f65849 != EnumC0573.f2488) {
            return abstractC5930M49919;
        }
        m49924();
        return m49843(abstractC5930M49919);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49889(C19003 c19003, C19003 c19004) {
        if (c19003.isEmpty()) {
            return false;
        }
        if (c19003.size() == 1) {
            c19004.m43729((AbstractC5930) c19003.first());
            return false;
        }
        C1321 c1321 = (C1321) c19003.first();
        c1321.getClass();
        int iM9453 = C3128.m9453(c1321);
        C5286 c5286 = this.f73254;
        c5286.f18294 = iM9453;
        C1321 c1321M14581 = c5286.m14581(EnumC6617.CLASS, C9030.stream(c19003).map(new C7459(6)).collect(C1890.joining()));
        C1321 c1322 = (C1321) c19003.last();
        c1322.getClass();
        m49882(c1321M14581, C3128.m9435(c1322, this.f73277));
        c19004.m43729(c1321M14581);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49828(AbstractC5930 abstractC5930, C19003 c19003, C19003 c19004, boolean z) {
        C1321 c1321;
        if (abstractC5930.m22847(EnumC18651.f60472)) {
            c1321 = (C1321) abstractC5930;
            if (c1321.f5611 != EnumC6617.CLASS) {
                c1321 = null;
            }
        } else {
            c1321 = null;
        }
        if (c1321 != null) {
            c19003.m43729(c1321);
            return z && m49889(c19003, c19004);
        }
        boolean zM49889 = m49889(c19003, c19004);
        c19003.clear();
        c19004.m43729(abstractC5930);
        return zM49889;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49891(AbstractC5930 abstractC5930) {
        C5286 c5286;
        AbstractC20372 abstractC20372M49868;
        AbstractC20372 abstractC20372M49823;
        ArrayList arrayList = this.f73258;
        boolean z = true;
        AbstractC5930[] abstractC5930Arr = arrayList.isEmpty() ? new AbstractC5930[11] : (AbstractC5930[]) C17745.m41308(arrayList, 1);
        ArrayList arrayList2 = this.f73274;
        C20330[] c20330Arr = arrayList2.isEmpty() ? new C20330[11] : (C20330[]) C17745.m41308(arrayList2, 1);
        boolean z2 = false;
        abstractC5930Arr[0] = abstractC5930;
        int i = this.f73269.f65847;
        C20330 c20330 = C16802.f53796;
        int i2 = 0;
        while (true) {
            int iM49833 = m49833(this.f73269.f65849);
            c5286 = this.f73254;
            if (iM49833 < 4) {
                break;
            }
            c20330Arr[i2] = c20330;
            C20330 c20331 = this.f73269;
            if (c20331.f65849 == EnumC0573.f2471) {
                int i3 = c20331.f65847;
                m49918();
                C20330 c20332 = this.f73269;
                EnumC0573 enumC0573 = c20332.f65849;
                int i4 = c20332.f65847;
                if (enumC0573 == EnumC0573.f2460) {
                    m49878(i4, EnumC14026.f46127);
                    abstractC20372M49868 = m49868(this.f73269.f65847, (C21783) null, (AbstractC5930) null, z);
                } else {
                    C21783 c21783M49870 = m49870(0L);
                    int i5 = this.f73269.f65847;
                    AbstractC5930 abstractC5930M49841 = m49841(z2);
                    C20330 c20333 = this.f73269;
                    if (c20333.f65849 == EnumC0573.f2416) {
                        m49878(c20333.f65847, EnumC14026.f46101);
                        abstractC20372M49868 = m49868(i4, c21783M49870, abstractC5930M49841, true);
                    } else {
                        long j = c21783M49870.f70567 & (-131073);
                        if (j != 0) {
                            long j2 = (-j) & j;
                            EnumC0264 enumC0264 = EnumC0264.SYNTAX;
                            EnumSet enumSetM21884 = C8360.m21884(j2);
                            C5909 c5909 = C23879.f77204;
                            this.f73272.m48192(enumC0264, i5, new C5909("compiler", "mod.not.allowed.here", enumSetM21884));
                        }
                        abstractC20372M49823 = abstractC5930M49841;
                        if (c21783M49870.f70566.m48595()) {
                            m49878(((C5224) c21783M49870.f70566.f70876).f30189, EnumC14026.f46100);
                            abstractC20372M49823 = m49823(abstractC5930M49841, c21783M49870.f70566.m48592(new Function() { // from class: l.۫᩸۟
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
                                    C5224 c5224 = (C5224) obj;
                                    C22447 c22447 = this.f42321;
                                    C5286 c5287 = c22447.f73254;
                                    c5287.f18294 = c5224.f30189;
                                    C5224 c5224M14633 = c5287.m14633(c5224.f18121, c5224.f18122);
                                    c22447.f73277.mo6626(c5224, c5224M14633);
                                    return c5224M14633;
                                }
                            }), false);
                        }
                    }
                    c5286.f18294 = i3;
                    AbstractC5930 abstractC5931 = abstractC5930Arr[i2];
                    C11906 c11906 = new C11906();
                    c11906.f39945 = abstractC5931;
                    c11906.f39946 = abstractC20372M49823;
                    c11906.f30189 = c5286.f18294;
                    abstractC5930Arr[i2] = c11906;
                    c20330 = c20330;
                }
                arrayList = arrayList;
                abstractC5930Arr = abstractC5930Arr;
                abstractC20372M49823 = abstractC20372M49868;
                c20330 = c20330;
                c5286.f18294 = i3;
                AbstractC5930 abstractC5932 = abstractC5930Arr[i2];
                C11906 c11907 = new C11906();
                c11907.f39945 = abstractC5932;
                c11907.f39946 = abstractC20372M49823;
                c11907.f30189 = c5286.f18294;
                abstractC5930Arr[i2] = c11907;
                c20330 = c20330;
            } else {
                arrayList = arrayList;
                abstractC5930Arr = abstractC5930Arr;
                m49918();
                i2++;
                abstractC5930Arr[i2] = m49919();
                c20330 = c20331;
            }
            while (i2 > 0 && m49833(c20330.f65849) >= m49833(this.f73269.f65849)) {
                int i6 = i2 - 1;
                c5286.f18294 = c20330.f65847;
                abstractC5930Arr[i6] = c5286.m14622(m49837(c20330.f65849), abstractC5930Arr[i6], abstractC5930Arr[i2]);
                i2--;
                c20330 = c20330Arr[i2];
            }
            z = true;
            z2 = false;
            arrayList = arrayList;
            abstractC5930Arr = abstractC5930Arr;
        }
        ArrayList arrayList3 = arrayList;
        AbstractC5930[] abstractC5930Arr2 = abstractC5930Arr;
        C6171.m17176(i2 == 0);
        AbstractC5930 abstractC5933 = abstractC5930Arr2[0];
        if (abstractC5933.m22847(EnumC18651.f60558) && this.f73276) {
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            boolean zM49828 = false;
            AbstractC5930 abstractC5934 = abstractC5933;
            while (abstractC5934.m22847(EnumC18651.f60558)) {
                C22864 c22864 = (C22864) abstractC5934;
                zM49828 |= m49828(c22864.f74368, c19004, c19003, false);
                abstractC5934 = c22864.f74367;
            }
            if (m49828(abstractC5934, c19004, c19003, true) | zM49828) {
                C21825 c21825M43726 = c19003.m43726();
                AbstractC5930 abstractC5930M14622 = (AbstractC5930) c21825M43726.f70876;
                for (AbstractC5930 abstractC5935 : c21825M43726.f70877) {
                    abstractC5935.getClass();
                    c5286.f18294 = C3128.m9453(abstractC5935);
                    abstractC5930M14622 = c5286.m14622(m49837(EnumC0573.f2399), abstractC5930M14622, abstractC5935);
                    m49882(abstractC5930M14622, this.f73277.mo6625(abstractC5935));
                }
                abstractC5933 = abstractC5930M14622;
            }
        }
        arrayList3.add(abstractC5930Arr2);
        arrayList2.add(c20330Arr);
        return abstractC5933;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:462:0x0976 A[PHI: r4
      0x0976: PHI (r4v9 int) = (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v8 int), (r4v11 int), (r4v8 int) binds: [B:411:0x0894, B:413:0x0898, B:415:0x089c, B:417:0x08a0, B:419:0x08a4, B:420:0x08a6, B:425:0x08b3, B:421:0x08a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:465:0x0982  */
    /* JADX WARN: Code duplicated, block: B:489:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x020f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Failed to find 'out' block for switch in B:420:0x08a6. Please report as an issue. */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0184 -> B:55:0x0127). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final l.AbstractC5930 m49919() {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22447.m49919():l.ۛ۠۟");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49844(AbstractC5930 abstractC5930, C21825 c21825) {
        C5286 c5286;
        AbstractC6323 abstractC6323;
        EnumC0573 enumC0573;
        if (c21825 != null) {
            m49895();
        }
        while (true) {
            int i = this.f73269.f65847;
            EnumC18651 enumC18651 = EnumC18651.f60508;
            C21825 c21825M49873 = m49873(enumC18651);
            EnumC0573 enumC0574 = this.f73269.f65849;
            EnumC0573 enumC0575 = EnumC0573.f2432;
            c5286 = this.f73254;
            abstractC6323 = this.f73277;
            if (enumC0574 == enumC0575) {
                m49918();
                int i2 = this.f73260;
                if ((i2 & 2) != 0) {
                    m49898();
                    if (this.f73269.f65849 == EnumC0573.f2445) {
                        m49918();
                        AbstractC5930 abstractC5930M49834 = m49834(abstractC5930);
                        c5286.f18294 = i;
                        abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14630(abstractC5930M49834));
                        if (this.f73269.f65849 != EnumC0573.f2455) {
                            if (!c21825M49873.m48595()) {
                                return abstractC5930;
                            }
                            c5286.f18294 = i;
                            return (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5930, c21825M49873));
                        }
                        m49924();
                    } else {
                        this.f73260 = i2;
                    }
                }
                if ((this.f73260 & 1) != 0) {
                    m49924();
                    AbstractC5930 abstractC5930M49896 = m49896();
                    c5286.f18294 = i;
                    abstractC5930 = (AbstractC5930) abstractC6323.mo6629(c5286.m14649(abstractC5930, abstractC5930M49896));
                }
                m49880(EnumC0573.f2445);
            } else if (enumC0574 == EnumC0573.f2417) {
                m49918();
                C21825 c21825M49847 = m49847(1);
                EnumC0573 enumC0576 = this.f73269.f65849;
                if (enumC0576 == EnumC0573.f2479 && (this.f73260 & 1) != 0) {
                    m49924();
                    c5286.f18294 = i;
                    AbstractC5930 abstractC5931 = (AbstractC5930) abstractC6323.mo6629(c5286.m14625(abstractC5930, this.f73261.f77638));
                    m49918();
                    abstractC5930 = m49855(abstractC5931, c21825M49847);
                } else if (enumC0576 != EnumC0573.f2436 || (this.f73260 & 1) == 0) {
                    C21825 c21825M49874 = ((this.f73260 & 2) == 0 || enumC0576 != EnumC0573.f2468) ? null : m49873(enumC18651);
                    c5286.f18294 = i;
                    abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14625(abstractC5930, m49863(true)));
                    C20330 c20330 = this.f73269;
                    if (c20330.f65847 <= abstractC6323.f21357 && c20330.f65849 == EnumC0573.f2468) {
                        break;
                    }
                    if (c21825M49874 != null && c21825M49874.m48595()) {
                        c5286.f18294 = ((C5224) c21825M49874.f70876).f30189;
                        abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5930, c21825M49874));
                    }
                    abstractC5930 = m49910(m49840(abstractC5930), c21825M49847);
                } else {
                    if (c21825M49847 != null) {
                        return m49895();
                    }
                    m49924();
                    int i3 = this.f73269.f65847;
                    m49918();
                    if (this.f73269.f65849 == EnumC0573.f2480) {
                        c21825M49847 = m49930(false);
                    }
                    abstractC5930 = m49860(i3, abstractC5930, c21825M49847);
                }
                c21825 = null;
            } else {
                if ((this.f73260 & 1) == 0 || enumC0574 != (enumC0573 = EnumC0573.f2455)) {
                    if (c21825M49873.isEmpty()) {
                        break;
                    }
                    if (!this.f73273) {
                        return m49865(((C5224) c21825M49873.f70876).f30189);
                    }
                    this.f73256 = c21825M49873;
                    break;
                }
                m49924();
                if (c21825 != null) {
                    return m49895();
                }
                m49880(enumC0573);
                abstractC5930 = m49901(abstractC5930);
            }
        }
        while (true) {
            EnumC0573 enumC0577 = this.f73269.f65849;
            EnumC0573 enumC0578 = EnumC0573.f2449;
            if ((enumC0577 != enumC0578 && enumC0577 != EnumC0573.f2459) || (this.f73260 & 1) == 0) {
                break;
            }
            m49924();
            C20330 c20331 = this.f73269;
            c5286.f18294 = c20331.f65847;
            abstractC5930 = (AbstractC5930) abstractC6323.mo6629(c5286.m14605(c20331.f65849 == enumC0578 ? EnumC18651.f60538 : EnumC18651.f60467, abstractC5930));
            m49918();
        }
        return (AbstractC5930) abstractC6323.mo6628(abstractC5930);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m49830(int i) {
        int i2 = i + 1;
        while (m49887(i2, EnumC0573.f2417)) {
            i2 += 2;
        }
        if (m49887(i2, EnumC0573.f2460)) {
            i2++;
            int i3 = 0;
            while (true) {
                int i4 = C17612.f55968[this.f73262.m48507(i2).f65849.ordinal()];
                if (i4 == 6) {
                    break;
                }
                if (i4 == 74) {
                    i3++;
                } else if (i4 == 85 && (i3 = i3 - 1) == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49853(int i, boolean z, boolean z2) {
        C21825<C6656> c21825M43726;
        C20414 c20414;
        char c;
        AbstractC11242 abstractC11242M49862;
        C5909 c5909;
        C5286 c5286 = this.f73254;
        boolean z3 = false;
        if (z2) {
            c21825M43726 = m49915(true, false);
        } else {
            if (z) {
                m49880(EnumC0573.f2460);
            }
            C19003 c19003 = new C19003();
            C20330 c20330 = this.f73269;
            EnumC0573 enumC0573 = c20330.f65849;
            if (enumC0573 != EnumC0573.f2415 && enumC0573 != EnumC0573.f2433) {
                c5286.f18294 = c20330.f65847;
                c19003.m43723(m49858(c5286.m14618(8589934592L), (AbstractC5930) null, true, false));
                while (this.f73269.f65849 == EnumC0573.f2469) {
                    m49918();
                    c5286.f18294 = this.f73269.f65847;
                    c19003.m43723(m49858(c5286.m14618(8589934592L), (AbstractC5930) null, true, false));
                }
            }
            if (z) {
                m49880(EnumC0573.f2415);
            }
            c21825M43726 = c19003.m43726();
        }
        if (z2) {
            C4807 c4807 = new C4807(this);
            Iterator it = c21825M43726.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c20414 = this.f73272;
                if (!zHasNext) {
                    c = 0;
                    break;
                }
                C6656 c6656 = (C6656) it.next();
                AbstractC5930 abstractC5930 = c6656.f22477;
                if (abstractC5930 == null || (abstractC11242M49862 = m49862(abstractC5930, z3)) == null || !c6656.f22477.m22847(EnumC18651.f60566)) {
                    c = 0;
                } else {
                    EnumC0264 enumC0264 = EnumC0264.SYNTAX;
                    int i2 = c6656.f30189;
                    c = 0;
                    if (EnumC14026.f46129.m33945(this.f73263)) {
                        C5909 c59010 = C23879.f77204;
                        c5909 = new C5909("compiler", "restricted.type.not.allowed.array", abstractC11242M49862);
                    } else {
                        C5909 c59011 = C23879.f77204;
                        c5909 = new C5909("compiler", "restricted.type.not.allowed.here", abstractC11242M49862);
                    }
                    c20414.m48192(enumC0264, i2, c5909);
                }
                c4807.m13363(c6656);
                if (c4807.f16898 == EnumC13981.ERROR) {
                    break;
                }
                z3 = false;
            }
            C14377 c14377 = c4807.f16896;
            if (c14377 != null) {
                EnumC0264 enumC0265 = EnumC0264.SYNTAX;
                C5909 c59012 = C23879.f77204;
                Object[] objArr = new Object[1];
                objArr[c] = c14377;
                c20414.m48192(enumC0265, i, new C5909("compiler", "invalid.lambda.parameter.declaration", objArr));
            }
            for (C6656 c6657 : c21825M43726) {
                AbstractC5930 abstractC5931 = c6657.f22477;
                if (abstractC5931 != null && m49862(abstractC5931, true) != null) {
                    m49878(c6657.f30189, EnumC14026.f46129);
                    c6657.f22480 = C3128.m9453(c6657.f22477);
                    c6657.f22477 = null;
                }
            }
        }
        m49885(EnumC14026.f46098);
        m49880(EnumC0573.f2433);
        C20330 c20331 = this.f73269;
        EnumC0573 enumC0574 = c20331.f65849;
        EnumC0573 enumC0575 = EnumC0573.f2425;
        AbstractC6323 abstractC6323 = this.f73277;
        if (enumC0574 == enumC0575) {
            C21452 c21452M49869 = m49869(c20331.f65847, 0L);
            c5286.f18294 = i;
            return (AbstractC5930) abstractC6323.mo6628(c5286.m14650(c21452M49869, c21825M43726));
        }
        AbstractC5930 abstractC5930M49900 = m49900(1);
        c5286.f18294 = i;
        return (AbstractC5930) abstractC6323.mo6628(c5286.m14650((AbstractC8774) abstractC5930M49900, c21825M43726));
    }

    static {
        C14377 c14377 = C14707.f48064;
        C14377 c14378 = C14707.f48115;
        C14377 c14379 = C14707.f48063;
        f73249 = new C14377[][]{new C14377[]{null, c14377, c14378}, new C14377[]{c14377, null, c14379}, new C14377[]{c14378, c14379, null}};
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49902(AbstractC5930 abstractC5930, C21825 c21825) {
        m49918();
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        if (enumC0573 == EnumC0573.f2460 || c21825 != null) {
            return m49855(abstractC5930, c21825);
        }
        EnumC0573 enumC0574 = EnumC0573.f2455;
        if (enumC0573 == enumC0574) {
            if (c21825 != null) {
                return m49895();
            }
            m49880(enumC0574);
            return m49901(abstractC5930);
        }
        int i = c20330.f65847;
        m49880(EnumC0573.f2417);
        C21825 c21825M49930 = this.f73269.f65849 == EnumC0573.f2480 ? m49930(false) : null;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        return m49910((AbstractC5930) this.f73277.mo6628(c5286.m14625(abstractC5930, m49863(false))), c21825M49930);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12611 m49892() {
        EnumC6617 enumC6617;
        C20330 c20330 = this.f73269;
        int i = c20330.f65847;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        switch (C17612.f55968[c20330.f65849.ordinal()]) {
            case 22:
                enumC6617 = EnumC6617.BYTE;
                break;
            case 23:
                enumC6617 = EnumC6617.SHORT;
                break;
            case 24:
                enumC6617 = EnumC6617.CHAR;
                break;
            case 25:
                enumC6617 = EnumC6617.INT;
                break;
            case 26:
                enumC6617 = EnumC6617.LONG;
                break;
            case 27:
                enumC6617 = EnumC6617.FLOAT;
                break;
            case 28:
                enumC6617 = EnumC6617.DOUBLE;
                break;
            case 29:
                enumC6617 = EnumC6617.BOOLEAN;
                break;
            default:
                enumC6617 = EnumC6617.NONE;
                break;
        }
        C12611 c12611 = (C12611) this.f73277.mo6629(c5286.m14604(enumC6617));
        m49918();
        return c12611;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49910(AbstractC5930 abstractC5930, C21825 c21825) {
        if (((this.f73260 & 1) == 0 || this.f73269.f65849 != EnumC0573.f2460) && c21825 == null) {
            return abstractC5930;
        }
        m49924();
        return m49855(abstractC5930, c21825);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m49904() {
        C19003 c19003 = new C19003();
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2460;
        if (enumC0573 == enumC0574) {
            m49918();
            if (this.f73269.f65849 != EnumC0573.f2415) {
                c19003.m43723(m49900(1));
                while (this.f73269.f65849 == EnumC0573.f2469) {
                    m49918();
                    c19003.m43723(m49900(1));
                }
            }
            m49880(EnumC0573.f2415);
        } else {
            m49913(c20330.f65847, C23879.m52616(enumC0574));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49855(AbstractC5930 abstractC5930, C21825 c21825) {
        int i = this.f73269.f65847;
        C21825 c21825M49904 = m49904();
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        AbstractC8774 abstractC8774M14610 = c5286.m14610(abstractC5930, c21825, c21825M49904);
        if (abstractC5930.m22847(EnumC18651.f60465)) {
            C3107 c3107 = (C3107) abstractC5930;
            int i2 = c3107.f30189;
            if (c3107.f11715 == this.f73261.f77597) {
                boolean z = this.f73264;
                C20414 c20414 = this.f73272;
                if (z) {
                    c20414.m48193(EnumC0264.SYNTAX, abstractC5930, C23879.f77333);
                    abstractC8774M14610 = c5286.m14645(C21825.of((Object) abstractC8774M14610));
                } else {
                    c20414.m48190(i2, C9768.f32835);
                }
            }
        }
        return (AbstractC5930) this.f73277.mo6628(abstractC8774M14610);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49840(AbstractC5930 abstractC5930) {
        if (this.f73269.f65849 != EnumC0573.f2480) {
            return abstractC5930;
        }
        int i = this.f73260;
        if ((i & 2) == 0 || (i & 4) != 0) {
            return abstractC5930;
        }
        m49898();
        return m49912(abstractC5930, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m49847(int i) {
        if (this.f73269.f65849 != EnumC0573.f2480) {
            return null;
        }
        int i2 = this.f73260;
        if ((i2 & i) == 0 || (i2 & 4) != 0) {
            m49895();
        }
        this.f73260 = i;
        return m49930(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21825 m49930(boolean z) {
        EnumC0573 enumC0573;
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0574 = c20330.f65849;
        EnumC0573 enumC0575 = EnumC0573.f2480;
        if (enumC0574 == enumC0575) {
            m49918();
            if (this.f73269.f65849 == EnumC0573.f2395 && z) {
                m49885(EnumC14026.f46114);
                this.f73260 |= 16;
                m49918();
                return C21825.m48588();
            }
            C19003 c19003 = new C19003();
            c19003.m43723((this.f73260 & 1) == 0 ? m49925() : m49903(false));
            while (true) {
                enumC0573 = this.f73269.f65849;
                if (enumC0573 != EnumC0573.f2469) {
                    break;
                }
                m49918();
                c19003.m43723((this.f73260 & 1) == 0 ? m49925() : m49903(false));
            }
            int i = C17612.f55968[enumC0573.ordinal()];
            if (i == 71 || i == 72 || i == 93) {
                this.f73269 = this.f73262.m48504();
            } else {
                switch (i) {
                    case 89:
                    case 90:
                        this.f73269 = this.f73262.m48504();
                        break;
                    case 91:
                        m49918();
                        break;
                    default:
                        c19003.m43723(m49913(this.f73269.f65847, C23879.m52616(EnumC0573.f2395)));
                        break;
                }
            }
            return c19003.m43726();
        }
        return C21825.of((Object) m49913(c20330.f65847, C23879.m52616(enumC0575)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11596 m49912(AbstractC5930 abstractC5930, boolean z) {
        int i = this.f73269.f65847;
        C21825 c21825M49930 = m49930(z);
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        return (C11596) this.f73277.mo6628(c5286.m14651(abstractC5930, c21825M49930));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m49834(AbstractC5930 abstractC5930) {
        return m49831(abstractC5930, C21825.m48588());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m49835(int i, AbstractC5930 abstractC5930, C21825 c21825) {
        m49880(EnumC0573.f2445);
        AbstractC5930 abstractC5930M49834 = m49834(abstractC5930);
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C0990 c0990M14630 = c5286.m14630(abstractC5930M49834);
        AbstractC6323 abstractC6323 = this.f73277;
        AbstractC5930 abstractC5931 = (AbstractC5930) abstractC6323.mo6628(c0990M14630);
        if (!c21825.m48595()) {
            return abstractC5931;
        }
        c5286.f18294 = i;
        return (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5931, c21825));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49854(AbstractC5930 abstractC5930) {
        AbstractC11242 abstractC11242Mo26414;
        int i = this.f73260;
        if ((i & 1) == 0 || this.f73269.f65849 != EnumC0573.f2417) {
            if ((i & 2) != 0) {
                if (this.f73269.f65849 != EnumC0573.f2455) {
                    m49898();
                    return abstractC5930;
                }
            } else {
                C20330 c20330 = this.f73269;
                if (c20330.f65849 != EnumC0573.f2455) {
                    m49913(c20330.f65847, C23879.f77281);
                }
            }
            return abstractC5930;
        }
        m49924();
        int i2 = this.f73269.f65847;
        m49918();
        m49880(EnumC0573.f2490);
        C20330 c20331 = this.f73269;
        int i3 = c20331.f65847;
        AbstractC6323 abstractC6323 = this.f73277;
        int i4 = abstractC6323.f21357;
        C5286 c5286 = this.f73254;
        C23942 c23942 = this.f73261;
        if (i3 == i4) {
            if (this.f73265.test(c20331.f65849)) {
                abstractC11242Mo26414 = this.f73269.mo26414();
                m49918();
            } else {
                abstractC11242Mo26414 = c23942.f77652;
            }
            c5286.f18294 = i2;
            return c5286.m14645(C21825.of((Object) abstractC6323.mo6628(c5286.m14625(abstractC5930, abstractC11242Mo26414))));
        }
        EnumC18651 enumC18651Mo1803 = abstractC5930.mo1803();
        if ((enumC18651Mo1803 == EnumC18651.f60566 && C3128.m9465((AbstractC8774) abstractC5930)) || enumC18651Mo1803 == EnumC18651.f60535) {
            m49913(this.f73269.f65847, C23879.f77202);
        }
        c5286.f18294 = i2;
        return (AbstractC5930) abstractC6323.mo6628(c5286.m14625(abstractC5930, c23942.f77615));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49901(AbstractC5930 abstractC5930) {
        EnumC13901 enumC13901;
        AbstractC11242 abstractC11242M49863;
        m49885(EnumC14026.f46112);
        m49924();
        C21825 c21825M49930 = this.f73269.f65849 == EnumC0573.f2480 ? m49930(false) : null;
        if (this.f73269.f65849 == EnumC0573.f2436) {
            enumC13901 = EnumC13901.NEW;
            abstractC11242M49863 = this.f73261.f77632;
            m49918();
        } else {
            enumC13901 = EnumC13901.INVOKE;
            abstractC11242M49863 = m49863(false);
        }
        abstractC5930.getClass();
        int iM9453 = C3128.m9453(abstractC5930);
        C5286 c5286 = this.f73254;
        c5286.f18294 = iM9453;
        C6966 c6966 = new C6966(enumC13901, abstractC11242M49863, abstractC5930, c21825M49930);
        c6966.f30189 = c5286.f18294;
        return (AbstractC5930) this.f73277.mo6628(c6966);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8378 m49861(int i, AbstractC5930 abstractC5930, C21825 c21825, AbstractC5930 abstractC5931) {
        C8753 c8753;
        C21825 c21825M49904 = m49904();
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2425;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (enumC0573 == enumC0574) {
            int i2 = c20330.f65847;
            C21825 c21825M49872 = m49872(this.f73261.f77594, false, false);
            c5286.f18294 = -1;
            C21783 c21783M14618 = c5286.m14618(0L);
            c5286.f18294 = i2;
            c8753 = (C8753) abstractC6323.mo6628(c5286.m14603(c21783M14618, c21825M49872));
        } else {
            c8753 = null;
        }
        c5286.f18294 = i;
        return (C8378) abstractC6323.mo6628(c5286.m14600(abstractC5930, c21825, abstractC5931, c21825M49904, c8753, false));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49908(int i, AbstractC5930 abstractC5930) {
        C21825 c21825M49846 = m49846();
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        return (AbstractC5930) this.f73277.mo6628(c5286.m14647(abstractC5930, C21825.m48588(), c21825M49846));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m49846() {
        m49880(EnumC0573.f2425);
        C19003 c19003 = new C19003();
        EnumC0573 enumC0573 = this.f73269.f65849;
        if (enumC0573 == EnumC0573.f2469) {
            m49918();
        } else if (enumC0573 != EnumC0573.f2387) {
            c19003.m43723(m49894());
            while (this.f73269.f65849 == EnumC0573.f2469) {
                m49918();
                if (this.f73269.f65849 == EnumC0573.f2387) {
                    break;
                }
                c19003.m43723(m49894());
            }
        }
        m49880(EnumC0573.f2387);
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49894() {
        C20330 c20330 = this.f73269;
        return c20330.f65849 == EnumC0573.f2425 ? m49908(c20330.f65847, (AbstractC5930) null) : m49900(1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49927() {
        int i = this.f73269.f65847;
        m49880(EnumC0573.f2460);
        AbstractC5930 abstractC5930M49900 = m49900(1);
        m49880(EnumC0573.f2415);
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C21077 c21077 = new C21077();
        c21077.f68656 = abstractC5930M49900;
        c21077.f30189 = c5286.f18294;
        return (AbstractC5930) this.f73277.mo6628(c21077);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21452 m49869(int i, long j) {
        m49880(EnumC0573.f2425);
        C21825 c21825M49906 = m49906();
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C21452 c21452M14617 = c5286.m14617(j, c21825M49906);
        while (true) {
            C20330 c20330 = this.f73269;
            EnumC0573 enumC0573 = c20330.f65849;
            int i2 = c20330.f65847;
            if (enumC0573 == EnumC0573.f2386 || enumC0573 == EnumC0573.f2423) {
                C5909 c5909 = C23879.f77204;
                m49913(i2, new C5909("compiler", "orphaned", enumC0573));
                m49899();
            } else {
                c21452M14617.f69738 = i2;
                m49880(EnumC0573.f2387);
                return (C21452) this.f73277.mo6628(c21452M14617);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21452 m49929() {
        return m49869(this.f73269.f65847, 0L);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21825 m49906() {
        C19003 c19003 = new C19003();
        int i = -1;
        while (true) {
            C21825 c21825M49842 = m49842();
            if (c21825M49842.isEmpty()) {
                return c19003.m43726();
            }
            int i2 = this.f73269.f65847;
            if (i2 == i) {
                return c19003.m43726();
            }
            if (i2 <= this.f73277.f21357) {
                m49886(false, true, true, true);
                i = this.f73269.f65847;
            }
            c19003.addAll(c21825M49842);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC14728 m49923() {
        C5909 c5909;
        int i = this.f73269.f65847;
        C21825 c21825M49842 = m49842();
        boolean zIsEmpty = c21825M49842.isEmpty();
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (zIsEmpty) {
            C12281 c12281M49913 = m49913(i, C23879.f77209);
            c5286.f18294 = i;
            return (AbstractC14728) abstractC6323.mo6628(c5286.m14642(c12281M49913));
        }
        AbstractC14728 abstractC14728 = (AbstractC14728) c21825M49842.f70876;
        int i2 = C17612.f55969[abstractC14728.mo1803().ordinal()];
        if (i2 == 3) {
            c5909 = C23879.f77264;
        } else {
            c5909 = i2 != 4 ? null : C23879.f77337;
        }
        if (c5909 == null) {
            return abstractC14728;
        }
        this.f73272.m48193(EnumC0264.SYNTAX, abstractC14728, c5909);
        c5286.f18294 = abstractC14728.f30189;
        C21825 c21825Of = C21825.of((Object) c5286.m14617(0L, c21825M49842));
        c5286.f18294 = abstractC14728.f30189;
        return (AbstractC14728) abstractC6323.mo6628(c5286.m14642(c5286.m14645(c21825Of)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:192:0x0517  */
    /* JADX WARN: Code duplicated, block: B:196:0x052b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0533  */
    /* JADX WARN: Code duplicated, block: B:203:0x0561  */
    /* JADX WARN: Code duplicated, block: B:206:0x0570  */
    /* JADX WARN: Code duplicated, block: B:207:0x0575  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b A[FALL_THROUGH] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        if (r6.m48507(1).f65849 != l.EnumC0573.f2491) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r6.m48507(2).f65849 != l.EnumC0573.f2491) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r7 == l.EnumC0573.f2433) goto L76;
     */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C21825 m49842() {
        /*
            Method dump skipped, instruction units count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22447.m49842():l.᩸᩷۟");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m49825(C21783 c21783, AbstractC5930 abstractC5930) {
        C19003 c19003 = new C19003();
        m49879(this.f73269.f65847, c21783, abstractC5930, m49863(false), false, (InterfaceC9042) null, c19003, true);
        m49880(EnumC0573.f2491);
        m49882((AbstractC8774) c19003.last(), this.f73262.m48501().f65850);
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC14728 m49824(int i, EnumC14791 enumC14791, C5909 c5909) {
        C21741 c21741 = this.f73262;
        int iM48502 = c21741.m48502();
        AbstractC8774 abstractC8774Mo10294 = enumC14791.mo10294(this);
        c21741.m48503(iM48502);
        return (AbstractC14728) this.f73277.mo6628(this.f73254.m14642(m49866(i, C21825.of((Object) abstractC8774Mo10294), c5909)));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C19336 m49848() {
        AbstractC5930 abstractC5930;
        int i = this.f73269.f65847;
        m49880(EnumC0573.f2444);
        m49880(EnumC0573.f2460);
        C21783 c21783M49870 = m49870(8589934592L);
        C19003 c19003 = new C19003();
        while (true) {
            c19003.m43723(m49903(false));
            if (this.f73269.f65849 != EnumC0573.f2426) {
                break;
            }
            m49918();
        }
        C21825 c21825M43726 = c19003.m43726();
        int iM48596 = c21825M43726.m48596();
        C5286 c5286 = this.f73254;
        if (iM48596 > 1) {
            AbstractC5930 abstractC5931 = (AbstractC5930) c21825M43726.f70876;
            abstractC5931.getClass();
            c5286.f18294 = C3128.m9453(abstractC5931);
            C1011 c1011 = new C1011();
            c1011.f4699 = c21825M43726;
            c1011.f30189 = c5286.f18294;
            abstractC5930 = (AbstractC5930) this.f73277.mo6628(c1011);
        } else {
            abstractC5930 = (AbstractC5930) c21825M43726.f70876;
        }
        C6656 c6656M49858 = m49858(c21783M49870, abstractC5930, false, false);
        m49880(EnumC0573.f2415);
        C21452 c21452M49929 = m49929();
        c5286.f18294 = i;
        return c5286.m14616(c6656M49858, c21452M49929);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21825 m49899() {
        EnumC0573 enumC0573;
        EnumC13425 enumC13425;
        C21825 c21825M49906;
        C21825 c21825M43726;
        EnumC13425 enumC13426;
        C21825 c21825M49907;
        C19003 c19003 = new C19003();
        while (true) {
            C20330 c20330 = this.f73269;
            int i = c20330.f65847;
            int[] iArr = C17612.f55968;
            int i2 = iArr[c20330.f65849.ordinal()];
            if (i2 == 6 || i2 == 12) {
                break;
            }
            if (i2 != 33 && i2 != 34) {
                m49918();
                m49913(i, C23879.m52618(EnumC0573.f2386, EnumC0573.f2423, EnumC0573.f2387));
            } else {
                int i3 = this.f73269.f65847;
                C19003 c19004 = new C19003();
                int i4 = iArr[this.f73269.f65849.ordinal()];
                C21741 c21741 = this.f73262;
                C20414 c20414 = this.f73272;
                AbstractC8774 abstractC8774 = null;
                C5286 c5286 = this.f73254;
                if (i4 == 33) {
                    m49918();
                    C19003 c19005 = new C19003();
                    while (true) {
                        c19005.m43723(m49838());
                        enumC0573 = this.f73269.f65849;
                        if (enumC0573 != EnumC0573.f2469) {
                            break;
                        }
                        m49918();
                        m49885(EnumC14026.f46117);
                    }
                    EnumC0573 enumC0574 = EnumC0573.f2433;
                    if (enumC0573 == enumC0574) {
                        m49885(EnumC14026.f46111);
                        m49880(enumC0574);
                        enumC13425 = C18630.f60398;
                        AbstractC14728 abstractC14728M49923 = m49923();
                        if (!abstractC14728M49923.m22847(EnumC18651.f60549) && !abstractC14728M49923.m22847(EnumC18651.f60513) && !abstractC14728M49923.m22847(EnumC18651.f60469)) {
                            c20414.m48199(abstractC14728M49923, C23879.f77228);
                        }
                        c21825M49906 = C21825.of((Object) abstractC14728M49923);
                        abstractC8774 = (AbstractC8774) c21825M49906.f70876;
                    } else {
                        m49881(EnumC0573.f2484, new C23590(10));
                        enumC13425 = C18630.f60397;
                        c21825M49906 = m49906();
                    }
                    c5286.f18294 = i3;
                    C18630 c18630M14615 = c5286.m14615(enumC13425, c19005.m43726(), c21825M49906, abstractC8774);
                    if (c21825M49906.isEmpty()) {
                        m49882(c18630M14615, c21741.m48501().f65850);
                    }
                    c19004.m43723(c18630M14615);
                    c21825M43726 = c19004.m43726();
                } else if (i4 == 34) {
                    m49918();
                    C20330 c20331 = this.f73269;
                    int i5 = c20331.f65847;
                    EnumC0573 enumC0575 = c20331.f65849;
                    EnumC0573 enumC0576 = EnumC0573.f2433;
                    if (enumC0575 == enumC0576) {
                        m49885(EnumC14026.f46111);
                        m49880(enumC0576);
                        enumC13426 = C18630.f60398;
                        AbstractC14728 abstractC14728M49924 = m49923();
                        if (!abstractC14728M49924.m22847(EnumC18651.f60549) && !abstractC14728M49924.m22847(EnumC18651.f60513) && !abstractC14728M49924.m22847(EnumC18651.f60469)) {
                            c20414.m48199(abstractC14728M49924, C23879.f77228);
                        }
                        c21825M49907 = C21825.of((Object) abstractC14728M49924);
                        abstractC8774 = (AbstractC8774) c21825M49907.f70876;
                    } else {
                        m49881(EnumC0573.f2484, new C13688(6));
                        enumC13426 = C18630.f60397;
                        c21825M49907 = m49906();
                    }
                    c5286.f18294 = i5;
                    AbstractC8047 abstractC8047 = (AbstractC8047) this.f73277.mo6628(c5286.m14611());
                    c5286.f18294 = i3;
                    C18630 c18630M14616 = c5286.m14615(enumC13426, C21825.of((Object) abstractC8047), c21825M49907, abstractC8774);
                    if (c21825M49907.isEmpty()) {
                        m49882(c18630M14616, c21741.m48501().f65850);
                    }
                    c19004.m43723(c18630M14616);
                    c21825M43726 = c19004.m43726();
                } else {
                    throw new AssertionError("should not reach here");
                }
                c19003.m43725(c21825M43726);
            }
        }
        return c19003.m43726();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private AbstractC8047 m49838() {
        C21741 c21741;
        EnumC2690 enumC2690;
        C20330 c20330 = this.f73269;
        int i = c20330.f65847;
        if (c20330.f65849 == EnumC0573.f2423) {
            m49878(i, EnumC14026.f46127);
            m49918();
            C5286 c5286 = this.f73254;
            c5286.f18294 = i;
            return (AbstractC8047) this.f73277.mo6628(c5286.m14611());
        }
        int iM49830 = 0;
        while (true) {
            c21741 = this.f73262;
            if (c21741.m48507(iM49830).f65849 != EnumC0573.f2460) {
                break;
            }
            iM49830++;
        }
        C21783 c21783M49870 = m49870(0L);
        if (c21783M49870.f70567 == 0 && !c21783M49870.f70566.m48595()) {
            int i2 = 0;
            while (true) {
                int i3 = C17612.f55968[c21741.m48507(iM49830).f65849.ordinal()];
                if (i3 != 5) {
                    C18959 c18959 = this.f73265;
                    if (i3 == 9) {
                        if (i2 != 0 && m49887(iM49830, c18959)) {
                            enumC2690 = EnumC2690.PATTERN;
                        }
                    } else if (i3 == 49) {
                        continue;
                    } else if (i3 == 51) {
                        if (i2 != 0) {
                            continue;
                        }
                    } else if (i3 == 73) {
                        EnumC0573 enumC0573 = EnumC0573.f2445;
                        if (m49888(iM49830, enumC0573, c18959)) {
                            enumC2690 = EnumC2690.PATTERN;
                        } else if (m49887(iM49830, enumC0573)) {
                            iM49830++;
                        } else {
                            enumC2690 = EnumC2690.EXPRESSION;
                        }
                    } else if (i3 != 75 && i3 != 77 && i3 != 86) {
                        switch (i3) {
                            case 21:
                                i2++;
                                continue;
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                                if (i2 != 0) {
                                }
                                break;
                            default:
                                switch (i3) {
                                    case 88:
                                        break;
                                    case 89:
                                        i2--;
                                    case 90:
                                        i2--;
                                    case 91:
                                        i2--;
                                        if (i2 != 0) {
                                            if (i2 < 0) {
                                                enumC2690 = EnumC2690.EXPRESSION;
                                            }
                                        } else if (!m49887(iM49830, c18959)) {
                                            enumC2690 = EnumC2690.EXPRESSION;
                                        } else {
                                            enumC2690 = EnumC2690.PATTERN;
                                        }
                                        break;
                                    default:
                                        enumC2690 = EnumC2690.EXPRESSION;
                                        break;
                                }
                                break;
                        }
                    }
                } else {
                    iM49830 = m49830(iM49830);
                }
                iM49830++;
            }
            if (enumC2690 != EnumC2690.PATTERN) {
                return m49900(33);
            }
        }
        m49878(this.f73269.f65847, EnumC14026.f46127);
        return m49868(i, c21783M49870, (AbstractC5930) null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m49873(EnumC18651 enumC18651) {
        if (this.f73269.f65849 != EnumC0573.f2468) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        int i = this.f73260;
        while (true) {
            C20330 c20330 = this.f73269;
            if (c20330.f65849 == EnumC0573.f2468) {
                int i2 = c20330.f65847;
                m49918();
                c19003.m43723(m49850(enumC18651, i2));
            } else {
                this.f73259 = this.f73260;
                this.f73260 = i;
                return c19003.m43726();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private AbstractC5930 m49831(AbstractC5930 abstractC5930, C21825 c21825) {
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        C20330 c20330 = this.f73269;
        if (c20330.f65849 == EnumC0573.f2432) {
            int i = c20330.f65847;
            m49918();
            abstractC5930 = m49835(i, abstractC5930, c21825M49873);
        } else if (!c21825M49873.isEmpty()) {
            if (this.f73273) {
                this.f73256 = c21825M49873;
            } else {
                return m49865(((C5224) c21825M49873.f70876).f30189);
            }
        }
        if (c21825.isEmpty()) {
            return abstractC5930;
        }
        int i2 = this.f73269.f65847;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i2;
        return (AbstractC5930) this.f73277.mo6628(c5286.m14582(abstractC5930, c21825));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49852(int i, AbstractC5930 abstractC5930) {
        C20330 c20330;
        EnumC0573 enumC0573;
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        m49880(EnumC0573.f2432);
        EnumC0573 enumC0574 = this.f73269.f65849;
        EnumC0573 enumC0575 = EnumC0573.f2445;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (enumC0574 == enumC0575) {
            m49880(enumC0575);
            AbstractC5930 abstractC5930M49831 = m49831(abstractC5930, c21825M49873);
            if (this.f73269.f65849 != EnumC0573.f2425) {
                c5286.f18294 = i;
                return m49866(this.f73269.f65847, C21825.of(abstractC6323.mo6628(c5286.m14647(abstractC5930M49831, C21825.m48588(), null))), C23879.f77334);
            }
            C18961 c18961 = (C18961) m49908(i, abstractC5930M49831);
            if (c21825M49873.m48595()) {
                C2401 c2401 = (C2401) abstractC5930M49831;
                c18961.f61400 = c2401.f9658;
                c18961.f61402 = c2401.f9659;
            }
            return c18961;
        }
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        c19004.m43723((Object) c21825M49873);
        c19003.m43723(m49900(1));
        m49880(enumC0575);
        while (true) {
            c20330 = this.f73269;
            enumC0573 = c20330.f65849;
            if (enumC0573 != EnumC0573.f2432 && enumC0573 != EnumC0573.f2468) {
                break;
            }
            C21825 c21825M49874 = m49873(EnumC18651.f60508);
            int i2 = this.f73269.f65847;
            m49918();
            EnumC0573 enumC0576 = this.f73269.f65849;
            EnumC0573 enumC0577 = EnumC0573.f2445;
            if (enumC0576 == enumC0577) {
                abstractC5930 = m49835(i2, abstractC5930, c21825M49874);
            } else {
                c19004.m43723((Object) c21825M49874);
                c19003.m43723(m49900(1));
                m49880(enumC0577);
            }
        }
        int i3 = c20330.f65847;
        C21825 c21825M49846 = enumC0573 == EnumC0573.f2425 ? m49846() : null;
        c5286.f18294 = i;
        C18961 c18962 = (C18961) abstractC6323.mo6628(c5286.m14647(abstractC5930, c19003.m43726(), c21825M49846));
        c18962.f61401 = c19004.m43726();
        return c21825M49846 != null ? m49866(i3, C21825.of((Object) c18962), C23879.f77299) : c18962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8378 m49860(int i, AbstractC5930 abstractC5930, C21825 c21825) {
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        int i2 = this.f73269.f65847;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i2;
        C3107 c3107M14639 = c5286.m14639(m49863(false));
        AbstractC6323 abstractC6323 = this.f73277;
        AbstractC5930 abstractC5930M49912 = (AbstractC5930) abstractC6323.mo6628(c3107M14639);
        if (c21825M49873.m48595()) {
            c5286.f18294 = ((C5224) c21825M49873.f70876).f30189;
            abstractC5930M49912 = (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5930M49912, c21825M49873));
        }
        if (this.f73269.f65849 == EnumC0573.f2480) {
            int i3 = this.f73260;
            abstractC5930M49912 = m49912(abstractC5930M49912, true);
            this.f73260 = i3;
        }
        return m49861(i, abstractC5930, c21825, abstractC5930M49912);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49903(boolean z) {
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        AbstractC5930 abstractC5930M49841 = m49841(z);
        return c21825M49873.m48595() ? m49823(abstractC5930M49841, c21825M49873, false) : abstractC5930M49841;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49925() {
        AbstractC5930 abstractC5930M14645;
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        C20330 c20330 = this.f73269;
        if (c20330.f65849 != EnumC0573.f2488) {
            AbstractC5930 abstractC5930M49841 = m49841(false);
            return c21825M49873.m48595() ? m49823(abstractC5930M49841, c21825M49873, false) : abstractC5930M49841;
        }
        int i = c20330.f65847;
        m49918();
        EnumC0573 enumC0573 = this.f73269.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2494;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (enumC0573 == enumC0574) {
            c5286.f18294 = i;
            C8068 c8068 = (C8068) abstractC6323.mo6629(c5286.m14599(EnumC15395.EXTENDS));
            m49918();
            AbstractC5930 abstractC5930M49903 = m49903(false);
            c5286.f18294 = i;
            abstractC5930M14645 = c5286.m14608(c8068, (AbstractC8774) abstractC5930M49903);
        } else {
            EnumC0573 enumC0575 = EnumC0573.f2479;
            if (enumC0573 == enumC0575) {
                c5286.f18294 = i;
                C8068 c8069 = (C8068) abstractC6323.mo6629(c5286.m14599(EnumC15395.SUPER));
                m49918();
                AbstractC5930 abstractC5930M49904 = m49903(false);
                c5286.f18294 = i;
                abstractC5930M14645 = c5286.m14608(c8069, (AbstractC8774) abstractC5930M49904);
            } else if (this.f73265.test(enumC0573)) {
                c5286.f18294 = -1;
                C8068 c8068M14599 = c5286.m14599(EnumC15395.UNBOUND);
                c5286.f18294 = i;
                AbstractC5930 abstractC5930 = (AbstractC5930) abstractC6323.mo6628(c5286.m14608(c8068M14599, (AbstractC8774) null));
                c5286.f18294 = this.f73269.f65847;
                C3107 c3107 = (C3107) abstractC6323.mo6628(c5286.m14639(m49863(false)));
                c5286.f18294 = i;
                abstractC5930M14645 = c5286.m14645(C21825.of((Object) abstractC5930, (Object) c3107));
                m49884(abstractC5930M14645, C23879.m52618(EnumC0573.f2395, enumC0574, enumC0575));
            } else {
                c5286.f18294 = i;
                C8068 c80610 = (C8068) abstractC6323.mo6628(c5286.m14599(EnumC15395.UNBOUND));
                c5286.f18294 = i;
                abstractC5930M14645 = (AbstractC5930) abstractC6323.mo6628(c5286.m14608(c80610, (AbstractC8774) null));
            }
        }
        if (c21825M49873.isEmpty()) {
            return abstractC5930M14645;
        }
        c5286.f18294 = ((C5224) c21825M49873.f70876).f30189;
        return (AbstractC5930) abstractC6323.mo6628(c5286.m14582(abstractC5930M14645, c21825M49873));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21783 m49870(long j) {
        C21783 c21783M49871 = m49871((C21783) null);
        long j2 = c21783M49871.f70567 & (-131089);
        int i = this.f73269.f65847;
        if (j2 != 0) {
            EnumC0264 enumC0264 = EnumC0264.SYNTAX;
            EnumSet enumSetM21884 = C8360.m21884(j2 & (-j2));
            C5909 c5909 = C23879.f77204;
            this.f73272.m48192(enumC0264, i, new C5909("compiler", "mod.not.allowed.here", enumSetM21884));
        }
        c21783M49871.f70567 = j | c21783M49871.f70567;
        return c21783M49871;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:80:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:47:0x00c4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final l.C21783 m49871(l.C21783 r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22447.m49871(l.᩸᩵۟):l.᩸᩵۟");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5224 m49850(EnumC18651 enumC18651, int i) {
        C21825 c21825M48588;
        C5224 c5224M14633;
        if (enumC18651 == EnumC18651.f60508) {
            m49885(EnumC14026.f46100);
        }
        AbstractC5930 abstractC5930M49845 = m49845(false);
        EnumC0573 enumC0573 = this.f73269.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2460;
        if (enumC0573 != enumC0574) {
            c21825M48588 = C21825.m48588();
        } else {
            m49880(enumC0574);
            C19003 c19003 = new C19003();
            if (this.f73269.f65849 != EnumC0573.f2415) {
                c19003.m43723(m49851());
                while (this.f73269.f65849 == EnumC0573.f2469) {
                    m49918();
                    c19003.m43723(m49851());
                }
            }
            m49880(EnumC0573.f2415);
            c21825M48588 = c19003.m43726();
        }
        EnumC18651 enumC18652 = EnumC18651.f60516;
        C5286 c5286 = this.f73254;
        if (enumC18651 == enumC18652) {
            c5286.f18294 = i;
            c5224M14633 = c5286.m14589((AbstractC8774) abstractC5930M49845, c21825M48588);
        } else if (enumC18651 == EnumC18651.f60508) {
            c5286.f18294 = i;
            c5224M14633 = c5286.m14633((AbstractC8774) abstractC5930M49845, c21825M48588);
        } else {
            throw new AssertionError("Unhandled annotation kind: " + enumC18651);
        }
        m49882(c5224M14633, this.f73262.m48501().f65850);
        return c5224M14633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49851() {
        if (this.f73265.test(this.f73269.f65849)) {
            m49924();
            AbstractC5930 abstractC5930M49926 = m49926();
            if (!abstractC5930M49926.m22847(EnumC18651.f60465)) {
                return abstractC5930M49926;
            }
            C20330 c20330 = this.f73269;
            EnumC0573 enumC0573 = c20330.f65849;
            EnumC0573 enumC0574 = EnumC0573.f2466;
            if (enumC0573 != enumC0574) {
                return abstractC5930M49926;
            }
            int i = c20330.f65847;
            m49880(enumC0574);
            AbstractC5930 abstractC5930M49907 = m49907();
            C5286 c5286 = this.f73254;
            c5286.f18294 = i;
            return (AbstractC5930) this.f73277.mo6628(c5286.m14587(abstractC5930M49926, abstractC5930M49907));
        }
        return m49907();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49907() {
        int i = C17612.f55968[this.f73269.f65849.ordinal()];
        if (i == 5) {
            int i2 = this.f73269.f65847;
            m49918();
            return m49850(EnumC18651.f60516, i2);
        }
        if (i == 11) {
            int i3 = this.f73269.f65847;
            m49880(EnumC0573.f2425);
            C19003 c19003 = new C19003();
            EnumC0573 enumC0573 = this.f73269.f65849;
            if (enumC0573 == EnumC0573.f2469) {
                m49918();
            } else if (enumC0573 != EnumC0573.f2387) {
                c19003.m43723(m49907());
                while (this.f73269.f65849 == EnumC0573.f2469) {
                    m49918();
                    if (this.f73269.f65849 == EnumC0573.f2387) {
                        break;
                    }
                    c19003.m43723(m49907());
                }
            }
            m49880(EnumC0573.f2387);
            C5286 c5286 = this.f73254;
            c5286.f18294 = i3;
            return (AbstractC5930) this.f73277.mo6628(c5286.m14647(null, C21825.m48588(), c19003.m43726()));
        }
        m49924();
        return m49926();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49879(int i, C21783 c21783, AbstractC5930 abstractC5930, AbstractC11242 abstractC11242, boolean z, InterfaceC9042 interfaceC9042, C19003 c19003, boolean z2) {
        c19003.m43723(m49857(i, c21783, abstractC5930, abstractC11242, z, interfaceC9042, z2, false));
        while (this.f73269.f65849 == EnumC0573.f2469) {
            m49882((AbstractC8774) c19003.last(), this.f73269.f65850);
            m49918();
            c19003.m43723(m49857(this.f73269.f65847, c21783, abstractC5930, m49863(false), z, interfaceC9042, z2, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m49857(int i, C21783 c21783, AbstractC5930 abstractC5930, AbstractC11242 abstractC11242, boolean z, InterfaceC9042 interfaceC9042, boolean z2, boolean z3) {
        AbstractC5930 abstractC5930M49894;
        int iM9453;
        AbstractC5930 abstractC5931;
        boolean z4;
        AbstractC5930 abstractC5930M49834 = m49834(abstractC5930);
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2466;
        if (enumC0573 == enumC0574) {
            m49918();
            abstractC5930M49894 = m49894();
        } else {
            if (z) {
                m49913(c20330.f65847, C23879.m52616(enumC0574));
            }
            abstractC5930M49894 = null;
        }
        AbstractC8774 abstractC8774M9438 = C3128.m9438((AbstractC8774) abstractC5930M49834, true);
        if (abstractC8774M9438.m22847(EnumC18651.f60465)) {
            AbstractC11242 abstractC11243 = ((C3107) abstractC8774M9438).f11715;
            if (m49864(abstractC11243, i, !z3 && z2) == null) {
                iM9453 = -1;
                abstractC5931 = abstractC5930M49834;
                z4 = false;
            } else {
                if (abstractC11243 != this.f73261.f77534) {
                    int i2 = abstractC8774M9438.f30189;
                    C5909 c5909 = C23879.f77204;
                    m49876(i2, new C5909("compiler", "restricted.type.not.allowed.here", abstractC11243));
                } else if (abstractC5930M49834.m22847(EnumC18651.f60566) && !z3) {
                    int i3 = abstractC8774M9438.f30189;
                    C5909 c59010 = C23879.f77204;
                    m49876(i3, new C5909("compiler", "restricted.type.not.allowed.array", abstractC11243));
                } else {
                    if (z3) {
                        int i4 = abstractC8774M9438.f30189;
                        C5909 c59011 = C23879.f77204;
                        m49876(i4, new C5909("compiler", "restricted.type.not.allowed.compound", abstractC11243));
                    }
                    iM9453 = C3128.m9453(c21783);
                    if (iM9453 == -1) {
                        iM9453 = C3128.m9453(abstractC5930M49834);
                    }
                    abstractC5931 = null;
                    z4 = true;
                }
                iM9453 = -1;
                abstractC5931 = abstractC5930M49834;
                z4 = false;
            }
        } else {
            iM9453 = -1;
            abstractC5931 = abstractC5930M49834;
            z4 = false;
        }
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C6656 c6656 = (C6656) this.f73277.mo6628(c5286.m14597(c21783, abstractC11242, abstractC5931, abstractC5930M49894, z4));
        m49883(c6656, interfaceC9042);
        c6656.f22480 = iM9453;
        return c6656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m49862(AbstractC5930 abstractC5930, boolean z) {
        int i = C17612.f55969[abstractC5930.mo1803().ordinal()];
        if (i != 5) {
            if (i != 6) {
                return null;
            }
            return m49862(((C0990) abstractC5930).f4638, z);
        }
        C3107 c3107 = (C3107) abstractC5930;
        if (m49864(c3107.f11715, abstractC5930.f30189, z) != null) {
            return c3107.f11715;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11909 m49864(AbstractC11242 abstractC11242, int i, boolean z) {
        C23942 c23942 = this.f73261;
        AbstractC11242 abstractC11243 = c23942.f77534;
        C20414 c20414 = this.f73272;
        if (abstractC11242 == abstractC11243) {
            if (EnumC14026.f46126.m33945(this.f73263)) {
                return EnumC11909.JDK10;
            }
            if (z) {
                C14065 c14065 = C9768.f32836;
                c20414.m48190(i, new C14065("compiler", "restricted.type.not.allowed", abstractC11242, EnumC11909.JDK10));
            }
        }
        if (abstractC11242 == c23942.f77597) {
            if (this.f73264) {
                return EnumC11909.JDK14;
            }
            if (z) {
                C14065 c14066 = C9768.f32836;
                c20414.m48190(i, new C14065("compiler", "restricted.type.not.allowed", abstractC11242, EnumC11909.JDK14));
            }
        }
        if (abstractC11242 == c23942.f77601) {
            if (this.f73252) {
                return EnumC11909.JDK14;
            }
            if (z) {
                C14065 c14067 = C9768.f32836;
                c20414.m48190(i, new C14065("compiler", "restricted.type.not.allowed.preview", abstractC11242, EnumC11909.JDK14));
            }
        }
        AbstractC11242 abstractC11244 = c23942.f77612;
        boolean z2 = this.f73255;
        if (abstractC11242 == abstractC11244) {
            if (z2) {
                return EnumC11909.JDK15;
            }
            if (z) {
                C14065 c14068 = C9768.f32836;
                c20414.m48190(i, new C14065("compiler", "restricted.type.not.allowed.preview", abstractC11242, EnumC11909.JDK15));
            }
        }
        if (abstractC11242 != c23942.f77560) {
            return null;
        }
        if (z2) {
            return EnumC11909.JDK15;
        }
        if (!z) {
            return null;
        }
        C14065 c14069 = C9768.f32836;
        c20414.m48190(i, new C14065("compiler", "restricted.type.not.allowed.preview", abstractC11242, EnumC11909.JDK15));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m49858(C21783 c21783, AbstractC5930 abstractC5930, boolean z, boolean z2) {
        AbstractC11242 abstractC11242;
        AbstractC11242 abstractC11242Mo26414;
        C20330 c20330 = this.f73269;
        int i = c20330.f65847;
        EnumC0573 enumC0573 = c20330.f65849;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        boolean z3 = false;
        C23942 c23942 = this.f73261;
        C20414 c20414 = this.f73272;
        if (z && enumC0573 == EnumC0573.f2428) {
            c20414.m48188(i, C23879.f77213);
            abstractC11242Mo26414 = this.f73269.mo26414();
            m49918();
        } else if (this.f73251 || !z || this.f73265.test(enumC0573) || c21783.f70567 != 8589934592L || c21783.f70566.m48595()) {
            AbstractC5930 abstractC5930M49845 = m49845(false);
            if (!abstractC5930M49845.m22847(EnumC18651.f60465) || (abstractC11242 = ((C3107) abstractC5930M49845).f11715) == c23942.f77533) {
                if (this.f73251) {
                    if ((17179869184L & c21783.f70567) != 0) {
                        c20414.m48188(this.f73269.f65847, C23879.f77349);
                    }
                    C20330 c20331 = this.f73269;
                    if (c20331.f65849 == EnumC0573.f2432) {
                        c20414.m48188(c20331.f65847, C23879.f77286);
                    }
                    if (abstractC5930M49845.m22847(EnumC18651.f60473) && ((C23570) abstractC5930M49845).f76356 != c23942.f77533) {
                        c20414.m48188(this.f73269.f65847, C23879.f77235);
                    }
                }
                c5286.f18294 = i;
                return (C6656) abstractC6323.mo6628(c5286.m14595(c21783, abstractC5930M49845, abstractC5930));
            }
            abstractC11242Mo26414 = abstractC11242;
        } else {
            abstractC11242Mo26414 = c23942.f77594;
        }
        if ((17179869184L & c21783.f70567) != 0) {
            C20330 c20332 = this.f73269;
            if (c20332.f65849 == EnumC0573.f2432) {
                c20414.m48188(c20332.f65847, C23879.f77224);
            }
        }
        if (z2) {
            C20330 c20333 = this.f73269;
            if (c20333.f65849 == EnumC0573.f2432) {
                c20414.m48188(c20333.f65847, C23879.f77276);
            }
        }
        AbstractC5930 abstractC5930M49834 = m49834(abstractC5930);
        c5286.f18294 = i;
        if (abstractC5930M49834 != null && abstractC5930M49834.m22847(EnumC18651.f60465) && ((C3107) abstractC5930M49834).f11715 == c23942.f77534) {
            z3 = true;
        }
        return (C6656) abstractC6323.mo6628(c5286.m14597(c21783, abstractC11242Mo26414, abstractC5930M49834, null, z3));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC8774 m49897() {
        C20330 c20330 = this.f73269;
        int i = c20330.f65847;
        EnumC0573 enumC0573 = c20330.f65849;
        if (enumC0573 == EnumC0573.f2390 || enumC0573 == EnumC0573.f2468) {
            return m49857(this.f73269.f65847, m49870(16L), m49903(true), m49863(false), true, (InterfaceC9042) null, true, false);
        }
        AbstractC5930 abstractC5930M49900 = m49900(3);
        if ((this.f73259 & 2) != 0) {
            if (this.f73265.test(this.f73269.f65849)) {
                C5286 c5286 = this.f73254;
                c5286.f18294 = i;
                return m49857(this.f73269.f65847, (C21783) this.f73277.mo6628(c5286.m14618(16L)), abstractC5930M49900, m49863(false), true, (InterfaceC9042) null, true, false);
            }
        }
        m49885(EnumC14026.f46095);
        if (!abstractC5930M49900.m22847(EnumC18651.f60465) && !abstractC5930M49900.m22847(EnumC18651.f60473)) {
            this.f73272.m48199(abstractC5930M49900, C23879.f77254);
        }
        return abstractC5930M49900;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0403  */
    /* JADX WARN: Code duplicated, block: B:138:0x0427  */
    /* JADX WARN: Code duplicated, block: B:141:0x0433  */
    /* JADX WARN: Code duplicated, block: B:144:0x043e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0441  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10164 m49922() {
        boolean z;
        boolean z2;
        C21741 c21741;
        C20330 c20330;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        InterfaceC9042 interfaceC9042M45896;
        C20414 c20414;
        String str3;
        C20330 c20331;
        String str4;
        AbstractC8774 abstractC8774M49867;
        C20330 c20332;
        EnumC0573 enumC0573;
        EnumC0573 enumC0574;
        EnumC13195 enumC13195;
        EnumC13195 enumC13196;
        C20330 c20333;
        C20414 c20415;
        String str5;
        AbstractC5930 abstractC5930;
        C21783 c21783;
        InterfaceC9042 interfaceC9042;
        C21825 c21825M49893;
        AbstractC8774 abstractC8774;
        EnumC0573 enumC0575;
        boolean z5;
        String str6;
        String str7;
        AbstractC5930 abstractC5931;
        C21783 c21784;
        C20330 c20334 = this.f73269;
        C19003 c19003 = new C19003();
        C21783 c21783M49871 = this.f73269.f65849 == EnumC0573.f2468 ? m49871((C21783) null) : null;
        C20330 c20335 = this.f73269;
        EnumC0573 enumC0576 = c20335.f65849;
        EnumC0573 enumC0577 = EnumC0573.f2454;
        String str8 = "mod.not.allowed.here";
        String str9 = "compiler";
        C20414 c20416 = this.f73272;
        C5286 c5286 = this.f73254;
        AbstractC6323 abstractC6323 = this.f73277;
        if (enumC0576 == enumC0577) {
            int i = c20335.f65847;
            C21825 c21825M48588 = C21825.m48588();
            if (c21783M49871 != null) {
                long j = c21783M49871.f70567 & (-131073);
                int i2 = this.f73269.f65847;
                if (j != 0) {
                    EnumC0264 enumC0264 = EnumC0264.SYNTAX;
                    EnumSet enumSetM21884 = C8360.m21884(j & (-j));
                    C5909 c5909 = C23879.f77204;
                    c20416.m48192(enumC0264, i2, new C5909("compiler", "mod.not.allowed.here", enumSetM21884));
                }
                c21825M48588 = c21783M49871.f70566;
                c21784 = null;
            } else {
                c21784 = c21783M49871;
            }
            m49918();
            AbstractC5930 abstractC5930M49845 = m49845(false);
            m49880(EnumC0573.f2491);
            c5286.f18294 = i;
            C6171.m17171(c21825M48588);
            C6171.m17171(abstractC5930M49845);
            C7672 c7672 = new C7672();
            c7672.f25386 = c21825M48588;
            c7672.f25385 = abstractC5930M49845;
            c7672.f30189 = c5286.f18294;
            AbstractC8774 abstractC8775 = (C7672) abstractC6323.mo6628(c7672);
            EnumC19625 enumC19625 = EnumC19625.LINE;
            m49883(abstractC8775, c20334.m45896());
            c19003.m43723(abstractC8775);
            c21783M49871 = c21784;
            z = true;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = true;
        while (true) {
            C20330 c20336 = this.f73269;
            EnumC0573 enumC0578 = c20336.f65849;
            boolean z9 = z;
            EnumC0573 enumC0579 = EnumC0573.f2441;
            C20414 c20417 = c20416;
            c21741 = this.f73262;
            if (enumC0578 != enumC0579) {
                if (c20336.f65847 <= abstractC6323.f21357) {
                    m49886(z6, false, false, false);
                    if (this.f73269.f65849 == enumC0579) {
                    }
                }
                C23942 c23942 = this.f73261;
                if (z6 && c21783M49871 == null) {
                    C20330 c20337 = this.f73269;
                    z4 = z6;
                    if (c20337.f65849 == EnumC0573.f2486) {
                        int i3 = c20337.f65847;
                        m49918();
                        if (this.f73269.f65849 == EnumC0573.f2476) {
                            m49918();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c5286.f18294 = this.f73269.f65847;
                        AbstractC5930 abstractC5932 = (AbstractC5930) abstractC6323.mo6628(c5286.m14639(m49863(false)));
                        while (true) {
                            int i4 = this.f73269.f65847;
                            EnumC0573 enumC05710 = EnumC0573.f2417;
                            m49880(enumC05710);
                            str6 = str8;
                            str7 = str9;
                            if (this.f73269.f65849 == EnumC0573.f2473) {
                                c5286.f18294 = i4;
                                abstractC5931 = (AbstractC5930) abstractC6323.mo6629(c5286.m14625(abstractC5932, c23942.f77589));
                                m49918();
                                break;
                            }
                            c5286.f18294 = i4;
                            abstractC5932 = (AbstractC5930) abstractC6323.mo6628(c5286.m14625(abstractC5932, m49863(false)));
                            if (this.f73269.f65849 != enumC05710) {
                                abstractC5931 = abstractC5932;
                                break;
                            }
                            str8 = str6;
                            str9 = str7;
                        }
                        m49880(EnumC0573.f2491);
                        c5286.f18294 = i3;
                        C14023 c14023 = new C14023();
                        c14023.f46089 = abstractC5931;
                        c14023.f46087 = z5;
                        c14023.f30189 = c5286.f18294;
                        c19003.m43723(abstractC6323.mo6628(c14023));
                        z7 = true;
                        z = z9;
                        c20416 = c20417;
                        z6 = z4;
                        str8 = str6;
                        str9 = str7;
                    } else {
                        str = str8;
                        str2 = str9;
                        C20330 c20338 = this.f73269;
                        EnumC19625 enumC19626 = EnumC19625.LINE;
                        interfaceC9042M45896 = c20338.m45896();
                        if (z8) {
                            interfaceC9042M45896 = c20334.m45896();
                            z9 = true;
                        }
                        if (c21783M49871 == null) {
                            c21783M49871 = m49871(c21783M49871);
                        } else {
                            c21783M49871 = m49871(c21783M49871);
                        }
                        if (z8) {
                            c20332 = this.f73269;
                            enumC0573 = c20332.f65849;
                            enumC0574 = EnumC0573.f2416;
                            if (enumC0573 == enumC0574) {
                                enumC13195 = EnumC13195.STRONG;
                                if (c20332.mo26414() == c23942.f77556) {
                                    enumC13196 = EnumC13195.OPEN;
                                    m49918();
                                } else {
                                    enumC13196 = enumC13195;
                                }
                                c20333 = this.f73269;
                                if (c20333.f65849 != enumC0574) {
                                }
                                c20414 = c20417;
                                str3 = str2;
                                c20331 = c20334;
                                str4 = str;
                                if (enumC13196 != enumC13195) {
                                    m49876(this.f73269.f65847, C23879.f77309);
                                }
                            } else {
                                c20414 = c20417;
                                str3 = str2;
                                c20331 = c20334;
                                str4 = str;
                            }
                        } else {
                            c20414 = c20417;
                            str3 = str2;
                            c20331 = c20334;
                            str4 = str;
                        }
                        C20330 c20339 = this.f73269;
                        int i5 = c20339.f65847;
                        if (c21783M49871 == null) {
                            abstractC8774M49867 = m49867(m49871(c21783M49871), interfaceC9042M45896);
                        } else {
                            abstractC8774M49867 = m49867(m49871(c21783M49871), interfaceC9042M45896);
                        }
                        if (abstractC8774M49867 instanceof C10870) {
                            abstractC8774M49867 = ((C10870) abstractC8774M49867).f36960;
                        }
                        c19003.m43723(abstractC8774M49867);
                        if (abstractC8774M49867 instanceof C8753) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        c21783M49871 = null;
                        str8 = str4;
                        str9 = str3;
                        c20416 = c20414;
                        z = z9;
                        c20334 = c20331;
                        z8 = false;
                    }
                } else {
                    z4 = z6;
                    str = str8;
                    str2 = str9;
                    C20330 c203310 = this.f73269;
                    EnumC19625 enumC19627 = EnumC19625.LINE;
                    interfaceC9042M45896 = c203310.m45896();
                    if (z8 && !z7 && !z2) {
                        interfaceC9042M45896 = c20334.m45896();
                        z9 = true;
                    }
                    if (c21783M49871 == null || this.f73269.f65849 != EnumC0573.f2491) {
                        c21783M49871 = m49871(c21783M49871);
                    }
                    if (z8) {
                        c20332 = this.f73269;
                        enumC0573 = c20332.f65849;
                        enumC0574 = EnumC0573.f2416;
                        if (enumC0573 == enumC0574) {
                            enumC13195 = EnumC13195.STRONG;
                            if (c20332.mo26414() == c23942.f77556) {
                                enumC13196 = EnumC13195.OPEN;
                                m49918();
                            } else {
                                enumC13196 = enumC13195;
                            }
                            c20333 = this.f73269;
                            if (c20333.f65849 != enumC0574 && c20333.mo26414() == c23942.f77659) {
                                if (c21783M49871 != null) {
                                    long j2 = c21783M49871.f70567 & (-131073);
                                    int i6 = this.f73269.f65847;
                                    if (j2 != 0) {
                                        EnumC0264 enumC0265 = EnumC0264.SYNTAX;
                                        EnumSet enumSetM21885 = C8360.m21884((-j2) & j2);
                                        C5909 c59010 = C23879.f77204;
                                        str5 = str2;
                                        c20415 = c20417;
                                        c20415.m48192(enumC0265, i6, new C5909(str5, str, enumSetM21885));
                                    } else {
                                        c20415 = c20417;
                                        str5 = str2;
                                    }
                                } else {
                                    c20415 = c20417;
                                    str5 = str2;
                                }
                                int i7 = this.f73269.f65847;
                                m49885(EnumC14026.f46096);
                                m49918();
                                AbstractC5930 abstractC5930M49846 = m49845(false);
                                m49880(EnumC0573.f2425);
                                C19003 c19004 = new C19003();
                                while (true) {
                                    C20330 c203311 = this.f73269;
                                    EnumC0573 enumC05711 = c203311.f65849;
                                    c20330 = c20334;
                                    EnumC0573 enumC05712 = EnumC0573.f2416;
                                    if (enumC05711 != enumC05712) {
                                        abstractC5930 = abstractC5930M49846;
                                        c21783 = c21783M49871;
                                        interfaceC9042 = interfaceC9042M45896;
                                        break;
                                    }
                                    int i8 = c203311.f65847;
                                    AbstractC11242 abstractC11242Mo26414 = c203311.mo26414();
                                    interfaceC9042 = interfaceC9042M45896;
                                    AbstractC11242 abstractC11242 = c23942.f77655;
                                    abstractC5930 = abstractC5930M49846;
                                    AbstractC11242 abstractC11243 = c23942.f77620;
                                    c21783 = c21783M49871;
                                    AbstractC11242 abstractC11244 = c23942.f77602;
                                    if (abstractC11242Mo26414 != abstractC11242) {
                                        if (this.f73269.mo26414() != abstractC11244 && this.f73269.mo26414() != c23942.f77605) {
                                            if (this.f73269.mo26414() != c23942.f77538) {
                                                if (this.f73269.mo26414() != c23942.f77571) {
                                                    m49916(i8);
                                                    m49876(i8, C23879.f77231);
                                                    break;
                                                }
                                                m49918();
                                                AbstractC5930 abstractC5930M49847 = m49845(false);
                                                m49880(EnumC0573.f2491);
                                                c5286.f18294 = i8;
                                                C3833 c3833 = new C3833();
                                                c3833.f14206 = abstractC5930M49847;
                                                c3833.f30189 = c5286.f18294;
                                                c19004.m43723((AbstractC20042) abstractC6323.mo6628(c3833));
                                            } else {
                                                m49918();
                                                AbstractC5930 abstractC5930M49848 = m49845(false);
                                                C20330 c203312 = this.f73269;
                                                if (c203312.f65849 == enumC05712 && c203312.mo26414() == abstractC11243) {
                                                    m49918();
                                                    C21825 c21825M49894 = m49893(false);
                                                    m49880(EnumC0573.f2491);
                                                    c5286.f18294 = i8;
                                                    C17549 c17549 = new C17549();
                                                    c17549.f55774 = abstractC5930M49848;
                                                    c17549.f55773 = c21825M49894;
                                                    c17549.f30189 = c5286.f18294;
                                                    c19004.m43723((AbstractC20042) abstractC6323.mo6628(c17549));
                                                } else {
                                                    C5909 c59011 = C23879.f77204;
                                                    c20415.m48192(EnumC0264.SYNTAX, this.f73269.f65847, new C5909(str5, "expected.str", "'" + ((Object) abstractC11243) + "'"));
                                                    m49886(false, false, false, false);
                                                }
                                            }
                                        } else {
                                            boolean z10 = this.f73269.mo26414() == abstractC11244;
                                            m49918();
                                            AbstractC5930 abstractC5930M49849 = m49845(false);
                                            C20330 c203313 = this.f73269;
                                            if (c203313.f65849 == enumC05712 && c203313.mo26414() == c23942.f77575) {
                                                m49918();
                                                c21825M49893 = m49893(false);
                                            } else {
                                                c21825M49893 = null;
                                            }
                                            m49880(EnumC0573.f2491);
                                            if (z10) {
                                                c5286.f18294 = i8;
                                                C17219 c17219 = new C17219();
                                                c17219.f54878 = abstractC5930M49849;
                                                c17219.f54880 = c21825M49893;
                                                c17219.f30189 = c5286.f18294;
                                                abstractC8774 = c17219;
                                            } else {
                                                c5286.f18294 = i8;
                                                C19667 c19667 = new C19667();
                                                c19667.f63121 = abstractC5930M49849;
                                                c19667.f63123 = c21825M49893;
                                                c19667.f30189 = c5286.f18294;
                                                abstractC8774 = c19667;
                                            }
                                            c19004.m43723((AbstractC20042) abstractC6323.mo6628(abstractC8774));
                                        }
                                    } else {
                                        m49918();
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        while (true) {
                                            int i9 = C17612.f55968[this.f73269.f65849.ordinal()];
                                            if (i9 == 15) {
                                                if (z11) {
                                                    c20415.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77177);
                                                }
                                                z11 = true;
                                            } else {
                                                if (i9 != 32 || this.f73269.mo26414() != c23942.f77579 || z12 || (enumC0575 = c21741.m48507(1).f65849) == EnumC0573.f2491 || enumC0575 == EnumC0573.f2417) {
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                            m49918();
                                        }
                                        AbstractC5930 abstractC5930M498410 = m49845(false);
                                        m49880(EnumC0573.f2491);
                                        c5286.f18294 = i8;
                                        C6260 c6260 = new C6260();
                                        c6260.f21221 = z12;
                                        c6260.f21224 = z11;
                                        c6260.f21222 = abstractC5930M498410;
                                        c6260.f30189 = c5286.f18294;
                                        c19004.m43723((AbstractC20042) abstractC6323.mo6628(c6260));
                                    }
                                    abstractC5930M49846 = abstractC5930;
                                    c20334 = c20330;
                                    interfaceC9042M45896 = interfaceC9042;
                                    c21783M49871 = c21783;
                                }
                                z3 = true;
                                C21825 c21825M43726 = c19004.m43726();
                                m49880(EnumC0573.f2387);
                                m49880(EnumC0573.f2441);
                                c5286.f18294 = i7;
                                AbstractC8774 abstractC8776 = (C18255) abstractC6323.mo6628(c5286.m14614(c21783, enumC13196, abstractC5930, c21825M43726));
                                m49883(abstractC8776, interfaceC9042);
                                c19003 = c19003;
                                c19003.m43723(abstractC8776);
                                break;
                            }
                            c20414 = c20417;
                            str3 = str2;
                            c20331 = c20334;
                            str4 = str;
                            if (enumC13196 != enumC13195) {
                                m49876(this.f73269.f65847, C23879.f77309);
                            }
                        } else {
                            c20414 = c20417;
                            str3 = str2;
                            c20331 = c20334;
                            str4 = str;
                        }
                    } else {
                        c20414 = c20417;
                        str3 = str2;
                        c20331 = c20334;
                        str4 = str;
                    }
                    C20330 c203314 = this.f73269;
                    int i10 = c203314.f65847;
                    if (c21783M49871 == null || c203314.f65849 != EnumC0573.f2491) {
                        abstractC8774M49867 = m49867(m49871(c21783M49871), interfaceC9042M45896);
                    } else {
                        m49918();
                        c5286.f18294 = i10;
                        abstractC8774M49867 = abstractC6323.mo6628(c5286.m14638());
                    }
                    if (abstractC8774M49867 instanceof C10870) {
                        abstractC8774M49867 = ((C10870) abstractC8774M49867).f36960;
                    }
                    c19003.m43723(abstractC8774M49867);
                    if (abstractC8774M49867 instanceof C8753) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c21783M49871 = null;
                    str8 = str4;
                    str9 = str3;
                    c20416 = c20414;
                    z = z9;
                    c20334 = c20331;
                    z8 = false;
                }
            }
            c20330 = c20334;
            z3 = z9;
            break;
        }
        C20330 c203315 = c20330;
        c5286.f18294 = c203315.f65847;
        C10164 c10164M14579 = c5286.m14579(c19003.m43726());
        if (!z3) {
            EnumC19625 enumC19628 = EnumC19625.LINE;
            m49883(c10164M14579, c203315.m45896());
        }
        if (c19003.isEmpty()) {
            m49882(c10164M14579, c21741.m48501().f65850);
        }
        if (this.f73270) {
            c10164M14579.f34729 = this.f73257;
        }
        if (this.f73271) {
            c10164M14579.f34726 = c21741.m48506();
        }
        abstractC6323.f21358 = null;
        c10164M14579.f34724 = abstractC6323;
        return c10164M14579;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14728 m49867(C21783 c21783, InterfaceC9042 interfaceC9042) {
        C21825 c21825Of;
        C12281 c12281M49866;
        boolean z;
        boolean z2;
        boolean z3;
        C21825 c21825;
        EnumC0573 enumC0573;
        boolean z4;
        int i;
        EnumC9852 enumC9852;
        C19003 c19003;
        C21741 c21741;
        boolean z5;
        C23942 c23942;
        C8753 c8753;
        AbstractC5930 abstractC5930M49903;
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0574 = c20330.f65849;
        EnumC0573 enumC0575 = EnumC0573.f2490;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (enumC0574 == enumC0575) {
            int i2 = c20330.f65847;
            m49880(enumC0575);
            AbstractC11242 abstractC11242M49920 = m49920();
            C21825 c21825M49921 = m49921();
            if (this.f73269.f65849 == EnumC0573.f2494) {
                m49918();
                abstractC5930M49903 = m49903(false);
            } else {
                abstractC5930M49903 = null;
            }
            C21825 c21825M48588 = C21825.m48588();
            if (this.f73269.f65849 == EnumC0573.f2457) {
                m49918();
                c21825M48588 = m49839();
            }
            C21825 c21825M49874 = m49874(c21783, Name.LABEL);
            C21825 c21825M49872 = m49872(abstractC11242M49920, false, false);
            c5286.f18294 = i2;
            C8753 c8754 = (C8753) abstractC6323.mo6628(c5286.m14602(c21783, abstractC11242M49920, c21825M49921, abstractC5930M49903, c21825M48588, c21825M49874, c21825M49872));
            m49883(c8754, interfaceC9042);
            return c8754;
        }
        if (m49931()) {
            return m49911(c21783, interfaceC9042);
        }
        C20330 c20331 = this.f73269;
        EnumC0573 enumC0576 = c20331.f65849;
        int i3 = c20331.f65847;
        EnumC0573 enumC0577 = EnumC0573.f2422;
        if (enumC0576 == enumC0577) {
            m49880(enumC0577);
            AbstractC11242 abstractC11242M49921 = m49920();
            C21825 c21825M49922 = m49921();
            C21825 c21825M48589 = C21825.m48588();
            if (this.f73269.f65849 == EnumC0573.f2494) {
                m49918();
                c21825M48589 = m49839();
            }
            C21825 c21825M49875 = m49874(c21783, "interface");
            C21825 c21825M49873 = m49872(abstractC11242M49921, true, false);
            c5286.f18294 = i3;
            C8753 c8755 = (C8753) abstractC6323.mo6628(c5286.m14602(c21783, abstractC11242M49921, c21825M49922, null, c21825M48589, c21825M49875, c21825M49873));
            m49883(c8755, interfaceC9042);
            return c8755;
        }
        EnumC0573 enumC0578 = EnumC0573.f2462;
        C23942 c23943 = this.f73261;
        boolean z6 = this.f73252;
        if (enumC0576 != enumC0578) {
            if (enumC0576 == EnumC0573.f2416 && c20331.mo26414() == c23943.f77601) {
                m49885(EnumC14026.f46103);
                return (AbstractC14728) abstractC6323.mo6628(c5286.m14642(m49866(this.f73269.f65847, C21825.of((Object) c21783), C23879.f77259)));
            }
            if (this.f73265.test(this.f73269.f65849)) {
                c5286.f18294 = i3;
                c21825Of = C21825.of((Object) c21783, (Object) abstractC6323.mo6628(c5286.m14639(m49863(false))));
                m49916(this.f73269.f65847);
            } else {
                c21825Of = C21825.of((Object) c21783);
            }
            if (this.f73267) {
                c12281M49866 = m49866(i3, c21825Of, C23879.f77315);
            } else if (z6) {
                C5909 c5909 = C23879.f77204;
                c12281M49866 = m49866(i3, c21825Of, new C5909("compiler", "expected4", enumC0575, enumC0577, enumC0578, "record"));
            } else {
                c12281M49866 = m49866(i3, c21825Of, C23879.m52618(enumC0575, enumC0577, enumC0578));
            }
            return (AbstractC14728) abstractC6323.mo6628(c5286.m14642(c12281M49866));
        }
        m49880(enumC0578);
        AbstractC11242 abstractC11242M49922 = m49920();
        C21825 c21825M485810 = C21825.m48588();
        if (this.f73269.f65849 == EnumC0573.f2457) {
            m49918();
            c21825M485810 = m49839();
        }
        C21825 c21826 = c21825M485810;
        m49880(EnumC0573.f2425);
        C19003 c19004 = new C19003();
        EnumC0573 enumC0579 = this.f73269.f65849;
        EnumC0573 enumC05710 = EnumC0573.f2469;
        C21741 c21742 = this.f73262;
        if (enumC0579 == enumC05710) {
            m49918();
            EnumC0573 enumC05711 = this.f73269.f65849;
            EnumC0573 enumC05712 = EnumC0573.f2491;
            if (enumC05711 == enumC05712) {
                m49918();
                z = true;
                z3 = false;
                z2 = false;
            } else {
                EnumC0573 enumC05713 = EnumC0573.f2387;
                if (enumC05711 != enumC05713) {
                    m49876(c21742.m48501().f65850, C23879.m52617(enumC05713, enumC05712));
                    z = false;
                    z3 = false;
                    z2 = true;
                } else {
                    z = false;
                    z3 = false;
                    z2 = false;
                }
            }
        } else {
            z = false;
            z3 = false;
            z2 = false;
        }
        while (true) {
            EnumC0573 enumC05714 = this.f73269.f65849;
            boolean z7 = z;
            EnumC0573 enumC05715 = EnumC0573.f2387;
            if (enumC05714 == enumC05715 || enumC05714 == (enumC0573 = EnumC0573.f2441)) {
                break;
            }
            c21825 = c21826;
            EnumC0573 enumC05716 = EnumC0573.f2491;
            if (enumC05714 == enumC05716) {
                m49880(enumC05716);
                EnumC0573 enumC05717 = this.f73269.f65849;
                if (enumC05717 != enumC05715 && enumC05717 != enumC0573) {
                    z4 = true;
                }
            } else {
                z4 = z7;
            }
            C20330 c20332 = this.f73269;
            int i4 = i3;
            EnumC0573 enumC05718 = c20332.f65849;
            if ((enumC05718 == EnumC0573.f2416 || enumC05718 == EnumC0573.f2428) && c20332.mo26414() != abstractC11242M49922 && (!(z6 && m49931()) && ((i = C17612.f55968[c21742.m48507(1).f65849.ordinal()]) == 1 || i == 11 || i == 74 || i == 88))) {
                enumC9852 = EnumC9852.ENUMERATOR;
            } else {
                int i5 = C17612.f55968[this.f73269.f65849.ordinal()];
                if (i5 == 5 || i5 == 21 || i5 == 31) {
                    enumC9852 = EnumC9852.UNKNOWN;
                } else if (i5 != 32) {
                    enumC9852 = EnumC9852.MEMBER;
                } else if (z6 && m49931()) {
                    enumC9852 = EnumC9852.MEMBER;
                } else {
                    enumC9852 = EnumC9852.UNKNOWN;
                }
            }
            if (enumC9852 == EnumC9852.UNKNOWN) {
                enumC9852 = z4 ? EnumC9852.MEMBER : EnumC9852.ENUMERATOR;
            }
            if (enumC9852 == EnumC9852.ENUMERATOR) {
                if (z4 && !z3) {
                    m49876(this.f73269.f65847, C23879.f77271);
                    z3 = true;
                }
                C20330 c20333 = this.f73269;
                EnumC19625 enumC19625 = EnumC19625.LINE;
                InterfaceC9042 interfaceC9042M45896 = c20333.m45896();
                int i6 = this.f73269.m45895() ? 147481 : 16409;
                int i7 = this.f73269.f65847;
                C21825 c21825M49876 = m49873(EnumC18651.f60516);
                c5286.f18294 = c21825M49876.isEmpty() ? -1 : i7;
                C21741 c21743 = c21742;
                C21783 c21783M14648 = c5286.m14648(i6, c21825M49876);
                C21825 c21825M49847 = m49847(2);
                int i8 = this.f73269.f65847;
                AbstractC11242 abstractC11242M49863 = m49863(false);
                C20330 c20334 = this.f73269;
                int i9 = c20334.f65847;
                C21825 c21825M49904 = c20334.f65849 == EnumC0573.f2460 ? m49904() : C21825.m48588();
                z5 = z6;
                if (this.f73269.f65849 == EnumC0573.f2425) {
                    c5286.f18294 = -1;
                    C21783 c21783M14618 = c5286.m14618(16384L);
                    C21825 c21825M49877 = m49872(c23943.f77594, false, false);
                    c5286.f18294 = i8;
                    c8753 = (C8753) abstractC6323.mo6628(c5286.m14603(c21783M14618, c21825M49877));
                } else {
                    c8753 = null;
                }
                int i10 = (c21825M49904.isEmpty() && c8753 == null) ? i8 : i9;
                c5286.f18294 = i8;
                C3107 c3107M14639 = c5286.m14639(abstractC11242M49922);
                c5286.f18294 = i10;
                C19003 c19005 = c19004;
                c21741 = c21743;
                c23942 = c23943;
                C8378 c8378M14600 = c5286.m14600((AbstractC5930) null, c21825M49847, (AbstractC5930) c3107M14639, c21825M49904, c8753, false);
                if (i10 != i8) {
                    m49882(c8378M14600, c21741.m48501().f65850);
                }
                c5286.f18294 = i8;
                C3107 c3107M146310 = c5286.m14639(abstractC11242M49922);
                c5286.f18294 = i7;
                AbstractC8774 abstractC8774Mo6628 = abstractC6323.mo6628(c5286.m14596(c21783M14648, abstractC11242M49863, c3107M146310, c8378M14600));
                m49883(abstractC8774Mo6628, interfaceC9042M45896);
                c19003 = c19005;
                c19003.m43723(abstractC8774Mo6628);
                C20330 c20335 = this.f73269;
                int i11 = c20335.f65847;
                if (i11 <= abstractC6323.f21357) {
                    m49886(false, true, true, false);
                } else {
                    EnumC0573 enumC05719 = c20335.f65849;
                    if (enumC05719 != enumC05715 && enumC05719 != enumC05716 && enumC05719 != enumC0573) {
                        EnumC0573 enumC05720 = EnumC0573.f2469;
                        if (enumC05719 == enumC05720) {
                            m49918();
                        } else {
                            m49916(i11);
                            m49876(c21741.m48501().f65850, C23879.m52618(enumC05720, enumC05715, enumC05716));
                            z3 = z3;
                            z2 = true;
                        }
                        c19004 = c19003;
                        c21826 = c21825;
                        z = z4;
                        i3 = i4;
                        c21742 = c21741;
                        z6 = z5;
                        c23943 = c23942;
                    }
                }
                z3 = z3;
            } else {
                c19003 = c19004;
                c21741 = c21742;
                z5 = z6;
                c23942 = c23943;
                if (!z4 && !z3 && !z2) {
                    m49876(this.f73269.f65847, C23879.f77178);
                    z3 = true;
                }
                c19003.m43725(m49914(abstractC11242M49922, false, false));
                if (this.f73269.f65847 <= abstractC6323.f21357) {
                    m49886(false, true, true, false);
                }
            }
            z2 = false;
            c19004 = c19003;
            c21826 = c21825;
            z = z4;
            i3 = i4;
            c21742 = c21741;
            z6 = z5;
            c23943 = c23942;
            m49880(enumC05715);
            C21825 c21825M43726 = c19004.m43726();
            c21783.f70567 |= 16384;
            c5286.f18294 = i3;
            C8753 c8756 = (C8753) abstractC6323.mo6628(c5286.m14601(c21783, abstractC11242M49922, C21825.m48588(), (AbstractC5930) null, c21825, c21825M43726));
            m49883(c8756, interfaceC9042);
            return c8756;
        }
        c21825 = c21826;
        m49880(enumC05715);
        C21825 c21825M43727 = c19004.m43726();
        c21783.f70567 |= 16384;
        c5286.f18294 = i3;
        C8753 c8757 = (C8753) abstractC6323.mo6628(c5286.m14601(c21783, abstractC11242M49922, C21825.m48588(), (AbstractC5930) null, c21825, c21825M43727));
        m49883(c8757, interfaceC9042);
        return c8757;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8753 m49911(C21783 c21783, InterfaceC9042 interfaceC9042) {
        C5286 c5286;
        C21825 c21825;
        C21825 c21826;
        int i = this.f73269.f65847;
        m49918();
        c21783.f70567 |= 2305843009213693952L;
        AbstractC11242 abstractC11242M49920 = m49920();
        C21825 c21825M49921 = m49921();
        C21825<C6656> c21825M49915 = m49915(false, true);
        C21825 c21825M48588 = C21825.m48588();
        if (this.f73269.f65849 == EnumC0573.f2457) {
            m49918();
            c21825M48588 = m49839();
        }
        C21825 c21825M49872 = m49872(abstractC11242M49920, false, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = c21825M49915.iterator();
        while (it.hasNext()) {
            arrayList.add((C6656) it.next());
        }
        Iterator it2 = c21825M49872.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c5286 = this.f73254;
            if (!zHasNext) {
                break;
            }
            AbstractC8774 abstractC8774 = (AbstractC8774) it2.next();
            if (abstractC8774.m22847(EnumC18651.f60478)) {
                C23195 c23195 = (C23195) abstractC8774;
                if (c23195.f75272 == this.f73261.f77632 && c23195.f75270.isEmpty() && (c23195.f75267.f70567 & 2251799813685248L) != 0) {
                    C19003 c19003 = new C19003();
                    for (C6656 c6656 : c21825M49915) {
                        c5286.m14629((InterfaceC12260) c6656);
                        C21783 c21784 = c6656.f22476;
                        c19003.m43723(c5286.m14596(c5286.m14648((c21784.f70567 & 17179869184L) | 8606711808L, c21784.f70566), c6656.f22478, c6656.f22477, (AbstractC5930) null));
                        c21825M49915 = c21825M49915;
                        c21825M48588 = c21825M48588;
                    }
                    c21825 = c21825M49915;
                    c21826 = c21825M48588;
                    c23195.f75270 = c19003.m43726();
                } else {
                    c21825 = c21825M49915;
                    c21826 = c21825M48588;
                }
            } else {
                c21825 = c21825M49915;
                c21826 = c21825M48588;
            }
            c21825M49915 = c21825;
            c21825M48588 = c21826;
        }
        C21825 c21827 = c21825M48588;
        C21825 c21825M48597 = c21825M49872;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c21825M48597 = c21825M48597.m48597((C6656) arrayList.get(size));
        }
        c5286.f18294 = i;
        C8753 c8753 = (C8753) this.f73277.mo6628(c5286.m14601(c21783, abstractC11242M49920, c21825M49921, (AbstractC5930) null, c21827, c21825M48597));
        m49883(c8753, interfaceC9042);
        return c8753;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m49920() {
        int i = this.f73269.f65847;
        AbstractC11242 abstractC11242M49863 = m49863(false);
        EnumC11909 enumC11909M49864 = m49864(abstractC11242M49863, i, true);
        if (enumC11909M49864 != null) {
            C5909 c5909 = C23879.f77204;
            m49876(i, new C5909("compiler", "restricted.type.not.allowed", abstractC11242M49863, enumC11909M49864));
        }
        return abstractC11242M49863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m49874(C21783 c21783, String str) {
        if (this.f73255) {
            C20330 c20330 = this.f73269;
            if (c20330.f65849 == EnumC0573.f2416 && c20330.mo26414() == this.f73261.f77560) {
                m49885(EnumC14026.f46102);
                if ((c21783.f70567 & SkeinEngine.UbiTweak.T1_FIRST) == 0) {
                    this.f73272.m48188(this.f73269.f65847, C23879.m52621(new C14377("compiler", "class.is.not.sealed", str)));
                }
                m49918();
                return m49893(false);
            }
        }
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21825 m49839() {
        C19003 c19003 = new C19003();
        c19003.m43723(m49903(false));
        while (this.f73269.f65849 == EnumC0573.f2469) {
            m49918();
            c19003.m43723(m49903(false));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m49872(AbstractC11242 abstractC11242, boolean z, boolean z2) {
        EnumC0573 enumC0573;
        EnumC0573 enumC0574 = EnumC0573.f2425;
        m49880(enumC0574);
        int i = this.f73269.f65847;
        AbstractC6323 abstractC6323 = this.f73277;
        if (i <= abstractC6323.f21357) {
            m49886(false, true, false, false);
            if (this.f73269.f65849 == enumC0574) {
                m49918();
            } else {
                return C21825.m48588();
            }
        }
        C19003 c19003 = new C19003();
        while (true) {
            EnumC0573 enumC0575 = this.f73269.f65849;
            enumC0573 = EnumC0573.f2387;
            if (enumC0575 == enumC0573 || enumC0575 == EnumC0573.f2441) {
                break;
            }
            c19003.m43725(m49914(abstractC11242, z, z2));
            if (this.f73269.f65847 <= abstractC6323.f21357) {
                m49886(false, true, true, false);
            }
        }
        m49880(enumC0573);
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m49914(AbstractC11242 abstractC11242, boolean z, boolean z2) {
        EnumC0573 enumC0573;
        AbstractC5930 abstractC5930M49841;
        C21825 c21825Of;
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0574 = c20330.f65849;
        EnumC0573 enumC0575 = EnumC0573.f2491;
        if (enumC0574 == enumC0575) {
            m49918();
            return C21825.m48588();
        }
        EnumC19625 enumC19625 = EnumC19625.LINE;
        InterfaceC9042 interfaceC9042M45896 = c20330.m45896();
        int i = this.f73269.f65847;
        C21783 c21783M49871 = m49871((C21783) null);
        if (this.f73269.f65849 == EnumC0573.f2490 || ((this.f73252 && m49931()) || (enumC0573 = this.f73269.f65849) == EnumC0573.f2422 || enumC0573 == EnumC0573.f2462)) {
            return C21825.of((Object) m49867(c21783M49871, interfaceC9042M45896));
        }
        EnumC0573 enumC0576 = EnumC0573.f2425;
        C20414 c20414 = this.f73272;
        if (enumC0573 == enumC0576 && (c21783M49871.f70567 & 4087) == 0 && c21783M49871.f70566.isEmpty()) {
            if (z) {
                c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77203);
            } else if (z2 && (c21783M49871.f70567 & 8) == 0) {
                c20414.m48192(EnumC0264.SYNTAX, this.f73269.f65847, C23879.f77226);
            }
            return C21825.of((Object) m49869(i, c21783M49871.f70567));
        }
        int i2 = this.f73269.f65847;
        C21825 c21825M49921 = m49921();
        if (c21825M49921.m48595() && c21783M49871.f30189 == -1) {
            c21783M49871.f30189 = i2;
            m49882(c21783M49871, i2);
        }
        C21825 c21825M49873 = m49873(EnumC18651.f60516);
        if (c21825M49873.m48595()) {
            m49878(((C5224) c21825M49873.f70876).f30189, EnumC14026.f46118);
            C21825 c21825 = c21783M49871.f70566;
            c21825.getClass();
            C21825 c21825M48594 = c21825M49873.m48594(c21825);
            c21783M49871.f70566 = c21825M48594;
            if (c21783M49871.f30189 == -1) {
                c21783M49871.f30189 = ((C5224) c21825M48594.f70876).f30189;
            }
        }
        C20330 c20331 = this.f73269;
        int i3 = c20331.f65847;
        boolean z3 = c20331.f65849 == EnumC0573.f2398;
        AbstractC6323 abstractC6323 = this.f73277;
        C5286 c5286 = this.f73254;
        if (z3) {
            c5286.f18294 = i3;
            abstractC5930M49841 = (AbstractC5930) abstractC6323.mo6629(c5286.m14604(EnumC6617.VOID));
            m49918();
        } else {
            abstractC5930M49841 = m49841(false);
        }
        EnumC0573 enumC0577 = this.f73269.f65849;
        EnumC0573 enumC0578 = EnumC0573.f2460;
        C23942 c23942 = this.f73261;
        if (((enumC0577 == enumC0578 && !z) || (z2 && enumC0577 == enumC0576)) && abstractC5930M49841.m22847(EnumC18651.f60465)) {
            if (z || c20331.mo26414() != abstractC11242) {
                c20414.m48192(EnumC0264.SYNTAX, i3, C23879.f77252);
            } else if (c21825M49873.m48595()) {
                m49865(((C5224) c21825M49873.f70876).f30189);
            }
            if (z2 && this.f73269.f65849 == enumC0576) {
                c21783M49871.f70567 |= 2251799813685248L;
            }
            return C21825.of((Object) m49875(i3, c21783M49871, null, c23942.f77632, c21825M49921, z, true, z2, interfaceC9042M45896));
        }
        if (z2 && abstractC5930M49841.m22847(EnumC18651.f60465)) {
            C20330 c20332 = this.f73269;
            if (c20332.f65849 == EnumC0573.f2412) {
                EnumC0264 enumC0264 = EnumC0264.SYNTAX;
                int i4 = c20332.f65847;
                C14377 c14377 = C14707.f48090;
                c20414.m48192(enumC0264, i4, C23879.m52622(c14377, abstractC11242, new C14377("compiler", "throws.clause.not.allowed.for.canonical.constructor", c14377)));
                m49886(false, true, false, false);
                return C21825.of((Object) m49875(i3, c21783M49871, null, c23942.f77632, c21825M49921, z, true, z2, interfaceC9042M45896));
            }
        }
        int i5 = this.f73269.f65847;
        AbstractC11242 abstractC11242M49863 = m49863(false);
        if (this.f73269.f65849 == enumC0578) {
            return C21825.of((Object) m49875(i5, c21783M49871, abstractC5930M49841, abstractC11242M49863, c21825M49921, z, z3, false, interfaceC9042M45896));
        }
        if (z3 || !c21825M49921.isEmpty()) {
            int i6 = this.f73269.f65847;
            if (z3 || c21825M49921.m48595()) {
                c5286.f18294 = i6;
                C23195 c23195 = (C23195) abstractC6323.mo6628(c5286.m14624(c21783M49871, abstractC11242M49863, abstractC5930M49841, c21825M49921, null, C21825.m48588(), C21825.m48588(), null, null));
                m49883(c23195, interfaceC9042M45896);
                c21825Of = C21825.of((Object) c23195);
            } else {
                c21825Of = C21825.m48588();
            }
            return C21825.of((Object) m49866(this.f73269.f65847, c21825Of, C23879.m52616(enumC0578)));
        }
        if (!z2 || (z2 && (c21783M49871.f70567 & 8) != 0)) {
            C19003 c19003 = new C19003();
            m49879(i5, c21783M49871, abstractC5930M49841, abstractC11242M49863, z, interfaceC9042M45896, c19003, false);
            C21825 c21825M43726 = c19003.m43726();
            m49880(enumC0575);
            m49882((AbstractC8774) c21825M43726.last(), this.f73262.m48501().f65850);
            return c21825M43726;
        }
        C19003 c19004 = new C19003();
        m49879(i5, c21783M49871, abstractC5930M49841, abstractC11242M49863, z, interfaceC9042M45896, c19004, false);
        c19004.m43726();
        m49880(enumC0575);
        return C21825.of((Object) m49866(i5, (C21825) null, C23879.f77196));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m49931() {
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2416;
        if (enumC0573 != enumC0574 || c20330.mo26414() != this.f73261.f77601 || (!m49888(0, enumC0574, EnumC0573.f2460) && !m49888(0, enumC0574, EnumC0573.f2441) && !m49888(0, enumC0574, EnumC0573.f2480))) {
            return false;
        }
        m49885(EnumC14026.f46103);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49890(C20330 c20330, int i) {
        AbstractC11242 abstractC11242Mo26414 = c20330.mo26414();
        C23942 c23942 = this.f73261;
        if (abstractC11242Mo26414 != c23942.f77583 || !m49888(i, EnumC0573.f2418, EnumC0573.f2416)) {
            return false;
        }
        C21741 c21741 = this.f73262;
        C20330 c20330M48507 = c21741.m48507(i + 1);
        C20330 c20330M48508 = c21741.m48507(i + 2);
        if (c20330.f65850 != c20330M48507.f65847 || c20330M48507.f65850 != c20330M48508.f65847 || c20330M48508.mo26414() != c23942.f77612) {
            return false;
        }
        m49885(EnumC14026.f46102);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m49917(boolean z) {
        if (this.f73269.mo26414() != this.f73261.f77612 || !m49829(this.f73262.m48507(1), z, false)) {
            return false;
        }
        m49885(EnumC14026.f46102);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49829(C20330 c20330, boolean z, boolean z2) {
        C21741 c21741 = this.f73262;
        if (z) {
            int i = C17612.f55968[c20330.f65849.ordinal()];
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 7 && i != 8 && i != 9 && i != 20) {
                        return false;
                    }
                } else if (c21741.m48507(2).f65849 == EnumC0573.f2422 && !z2) {
                    return false;
                }
            }
        } else {
            int i2 = C17612.f55968[c20330.f65849.ordinal()];
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 20) {
                        if (i2 != 32) {
                            switch (i2) {
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            if (!m49890(c20330, z2 ? 3 : 1) && c20330.mo26414() != this.f73261.f77612) {
                                return false;
                            }
                        }
                    }
                } else if (c21741.m48507(2).f65849 == EnumC0573.f2422 && !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23195 m49875(int i, C21783 c21783, AbstractC5930 abstractC5930, AbstractC11242 abstractC11242, C21825 c21825, boolean z, boolean z2, boolean z3, InterfaceC9042 interfaceC9042) {
        AbstractC5930 abstractC5930M49834;
        AbstractC5930 abstractC5930M49907;
        C21452 c21452M49929;
        AbstractC5930 abstractC5931;
        if (z) {
            if ((c21783.f70567 & 8) != 0) {
                m49885(EnumC14026.f46124);
            }
            if ((c21783.f70567 & 2) != 0) {
                m49885(EnumC14026.f46120);
            }
        }
        C6656 c6656 = this.f73268;
        C21452 c21452M499210 = null;
        try {
            this.f73268 = null;
            C21825 c21825M48588 = C21825.m48588();
            C21825 c21825M48589 = C21825.m48588();
            if (z3 && abstractC11242 == this.f73261.f77632 && this.f73269.f65849 != EnumC0573.f2460) {
                abstractC5930M49834 = abstractC5930;
            } else {
                c21825M48588 = m49915(false, false);
                abstractC5930M49834 = !z2 ? m49834(abstractC5930) : abstractC5930;
                if (this.f73269.f65849 == EnumC0573.f2412) {
                    m49918();
                    c21825M48589 = m49893(true);
                }
            }
            C21825 c21826 = c21825M48588;
            C21825 c21827 = c21825M48589;
            EnumC0573 enumC0573 = this.f73269.f65849;
            EnumC0573 enumC0574 = EnumC0573.f2425;
            AbstractC6323 abstractC6323 = this.f73277;
            if (enumC0573 == enumC0574) {
                abstractC5931 = null;
                c21452M49929 = m49929();
            } else {
                EnumC0573 enumC0575 = EnumC0573.f2423;
                if (enumC0573 == enumC0575) {
                    m49880(enumC0575);
                    abstractC5930M49907 = m49907();
                } else {
                    abstractC5930M49907 = null;
                }
                m49880(EnumC0573.f2491);
                if (this.f73269.f65847 <= abstractC6323.f21357) {
                    m49886(false, true, false, false);
                    if (this.f73269.f65849 == enumC0574) {
                        c21452M499210 = m49929();
                    }
                }
                c21452M49929 = c21452M499210;
                abstractC5931 = abstractC5930M49907;
            }
            C5286 c5286 = this.f73254;
            c5286.f18294 = i;
            C23195 c23195 = (C23195) abstractC6323.mo6628(c5286.m14624(c21783, abstractC11242, abstractC5930M49834, c21825, this.f73268, c21826, c21827, c21452M49929, abstractC5931));
            m49883(c23195, interfaceC9042);
            return c23195;
        } finally {
            this.f73268 = c6656;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m49893(boolean z) {
        C21825 c21825M48588;
        C21825 c21825M48589;
        C19003 c19003 = new C19003();
        if (z) {
            c21825M48588 = m49873(EnumC18651.f60508);
        } else {
            c21825M48588 = C21825.m48588();
        }
        AbstractC5930 abstractC5930M49845 = m49845(z);
        if (!c21825M48588.isEmpty()) {
            c19003.m43723(m49823(abstractC5930M49845, c21825M48588, false));
        } else {
            c19003.m43723(abstractC5930M49845);
        }
        while (this.f73269.f65849 == EnumC0573.f2469) {
            m49918();
            if (z) {
                c21825M48589 = m49873(EnumC18651.f60508);
            } else {
                c21825M48589 = C21825.m48588();
            }
            AbstractC5930 abstractC5930M49846 = m49845(z);
            if (!c21825M48589.isEmpty()) {
                c19003.m43723(m49823(abstractC5930M49846, c21825M48589, false));
            } else {
                c19003.m43723(abstractC5930M49846);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21825 m49921() {
        if (this.f73269.f65849 == EnumC0573.f2480) {
            C19003 c19003 = new C19003();
            m49918();
            c19003.m43723(m49905());
            while (this.f73269.f65849 == EnumC0573.f2469) {
                m49918();
                c19003.m43723(m49905());
            }
            m49880(EnumC0573.f2395);
            return c19003.m43726();
        }
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22179 m49905() {
        int i = this.f73269.f65847;
        C21825 c21825M49873 = m49873(EnumC18651.f60508);
        AbstractC11242 abstractC11242M49920 = m49920();
        C19003 c19003 = new C19003();
        if (this.f73269.f65849 == EnumC0573.f2494) {
            m49918();
            c19003.m43723(m49903(false));
            while (this.f73269.f65849 == EnumC0573.f2440) {
                m49918();
                c19003.m43723(m49903(false));
            }
        }
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C21825 c21825M43726 = c19003.m43726();
        C22179 c22179 = new C22179();
        c22179.f72545 = abstractC11242M49920;
        c22179.f72547 = c21825M43726;
        c22179.f72546 = c21825M49873;
        c22179.f30189 = c5286.f18294;
        return (C22179) this.f73277.mo6628(c22179);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m49915(boolean z, boolean z2) {
        C19003 c19003 = new C19003();
        m49880(EnumC0573.f2460);
        if (this.f73269.f65849 != EnumC0573.f2415) {
            this.f73251 = (z || z2) ? false : true;
            C6656 c6656M49859 = m49859(z, z2);
            if (c6656M49859.f22482 != null) {
                this.f73268 = c6656M49859;
            } else {
                c19003.m43723(c6656M49859);
            }
            this.f73251 = false;
            while (this.f73269.f65849 == EnumC0573.f2469) {
                if ((c6656M49859.f22476.f70567 & 17179869184L) != 0) {
                    this.f73272.m48193(EnumC0264.SYNTAX, c6656M49859, C23879.f77289);
                }
                m49918();
                c6656M49859 = m49859(z, z2);
                c19003.m43723(c6656M49859);
            }
        }
        C20330 c20330 = this.f73269;
        EnumC0573 enumC0573 = c20330.f65849;
        EnumC0573 enumC0574 = EnumC0573.f2415;
        if (enumC0573 == enumC0574) {
            m49918();
        } else {
            m49916(c20330.f65847);
            m49876(this.f73262.m48501().f65850, C23879.m52618(EnumC0573.f2469, enumC0574, EnumC0573.f2432));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6656 m49859(boolean z, boolean z2) {
        C21783 c21783M49871;
        if (z2) {
            c21783M49871 = m49871((C21783) null);
        } else {
            c21783M49871 = m49870(8589934592L);
        }
        if (z2 && c21783M49871.f70567 != 0) {
            this.f73272.m48188(c21783M49871.f30189, C23879.f77205);
        }
        if (z2) {
            c21783M49871.f70567 |= 2305843009230471186L;
        }
        this.f73273 = true;
        AbstractC5930 abstractC5930M49903 = m49903(z);
        this.f73273 = false;
        if (this.f73269.f65849 == EnumC0573.f2478) {
            C21825 c21825 = this.f73256;
            this.f73256 = C21825.m48588();
            c21783M49871.f70567 |= 17179869184L;
            abstractC5930M49903 = m49823(abstractC5930M49903, c21825, true);
            m49918();
        } else {
            if (this.f73256.m48595()) {
                m49876(((C5224) this.f73256.f70876).f30189, C23879.f77280);
            }
            this.f73256 = C21825.m48588();
        }
        return m49858(c21783M49871, abstractC5930M49903, z, z2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m49909(AbstractC5930 abstractC5930) {
        if (C3128.m9449(abstractC5930)) {
            return abstractC5930;
        }
        int i = abstractC5930.f30189;
        C5286 c5286 = this.f73254;
        c5286.f18294 = i;
        C12281 c12281M14645 = c5286.m14645(C21825.of((Object) abstractC5930));
        this.f73272.m48193(EnumC0264.SYNTAX, c12281M14645, C23879.f77327);
        return c12281M14645;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m49833(EnumC0573 enumC0573) {
        EnumC18651 enumC18651M49837 = m49837(enumC0573);
        if (enumC18651M49837 != EnumC18651.f60545) {
            return C3128.m9436(enumC18651M49837);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC18651 m49837(EnumC0573 enumC0573) {
        int i = C17612.f55968[enumC0573.ordinal()];
        if (i == 21) {
            return EnumC18651.f60505;
        }
        if (i == 82) {
            return EnumC18651.f60558;
        }
        if (i != 83) {
            switch (i) {
                case 62:
                    return EnumC18651.f60534;
                case 63:
                    return EnumC18651.f60525;
                case 64:
                    return EnumC18651.f60522;
                case 65:
                    return EnumC18651.f60559;
                case 66:
                    return EnumC18651.f60564;
                case 67:
                    return EnumC18651.f60471;
                case 68:
                    return EnumC18651.f60477;
                case 69:
                    return EnumC18651.f60523;
                case 70:
                    return EnumC18651.f60484;
                case 71:
                    return EnumC18651.f60514;
                case 72:
                    return EnumC18651.f60533;
                default:
                    switch (i) {
                        case 89:
                            return EnumC18651.f60557;
                        case 90:
                            return EnumC18651.f60524;
                        case 91:
                            return EnumC18651.f60532;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            return EnumC18651.f60526;
                        case 93:
                            return EnumC18651.f60556;
                        default:
                            switch (i) {
                                case 95:
                                    return EnumC18651.f60551;
                                case 96:
                                    return EnumC18651.f60464;
                                case 97:
                                    return EnumC18651.f60504;
                                case 98:
                                    return EnumC18651.f60483;
                                case q.f /* 99 */:
                                    return EnumC18651.f60546;
                                case 100:
                                    return EnumC18651.f60482;
                                case 101:
                                    return EnumC18651.f60569;
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    return EnumC18651.f60479;
                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    return EnumC18651.f60470;
                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    return EnumC18651.f60529;
                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    return EnumC18651.f60515;
                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    return EnumC18651.f60550;
                                default:
                                    return EnumC18651.f60545;
                            }
                    }
            }
        }
        return EnumC18651.f60485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49885(EnumC14026 enumC14026) {
        m49878(this.f73269.f65847, enumC14026);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49878(int i, EnumC14026 enumC14026) {
        C2008 c2008 = this.f73250;
        boolean zM6478 = c2008.m6478(enumC14026);
        C20414 c20414 = this.f73272;
        if (zM6478 && !c2008.m6473()) {
            c20414.m48192(EnumC0264.SOURCE_LEVEL, i, c2008.m6469(enumC14026));
            return;
        }
        EnumC11909 enumC11909 = this.f73263;
        if (!enumC14026.m33945(enumC11909)) {
            c20414.m48192(EnumC0264.SOURCE_LEVEL, i, enumC14026.m33943(enumC11909.f39974));
        } else if (c2008.m6478(enumC14026)) {
            c2008.m6471(new C3086(i), enumC14026);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49916(int i) {
        AbstractC6323 abstractC6323 = this.f73277;
        if (i > abstractC6323.f21357) {
            abstractC6323.f21357 = i;
        }
    }
}
