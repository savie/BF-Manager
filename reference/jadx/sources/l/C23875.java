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

/* JADX INFO: renamed from: l.᩹᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes.dex */
public final class C23875 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C15515[][] f77278;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12510 f77279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15714 f77283;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f77284;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15252 f77285;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC20820 f77286;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14923 f77288;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C24621 f77289;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f77291;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f77292;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f77293;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f77294;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13891 f77296;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17638 f77297;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8957 f77298;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f77299;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C7312 f77300;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77303;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f77304;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC11194 f77306;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14769 f77287 = C14769.m35543();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77301 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f77290 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f77281 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f77295 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77280 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f77305 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f77282 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6191 f77302 = new C6191(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53267(int i, AbstractC22295 abstractC22295, C18499 c18499) {
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C11106 c11106M37567 = c15714.m37567(m53313(abstractC22295));
        AbstractC11194 abstractC11194 = this.f77306;
        c18499.m43089(abstractC11194.mo28234(c11106M37567));
        while (this.f77298.f29212 == EnumC7466.f24672) {
            m53298();
            int i2 = this.f77298.f29214;
            AbstractC22295 abstractC22295M53284 = m53284(1);
            c15714.f51040 = i2;
            c18499.m43089(abstractC11194.mo28234(c15714.m37567(m53313(abstractC22295M53284))));
        }
    }

    public C23875(C4483 c4483, C14923 c14923, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC11194 c13432;
        this.f77288 = c14923;
        m53298();
        C15714 c15714 = c4483.f16030;
        this.f77283 = c15714;
        this.f77300 = c4483.f16035;
        this.f77285 = c4483.f16031;
        EnumC20820 enumC20820 = c4483.f16032;
        this.f77286 = enumC20820;
        this.f77297 = c4483.f16034;
        String strM32422 = c4483.f16036.m32422("allowStringFolding");
        this.f77293 = strM32422 == null ? true : Boolean.parseBoolean(strM32422);
        this.f77294 = z;
        this.f77292 = z4;
        this.f77289 = z ? new C24621(c4483) : null;
        this.f77304 = z2;
        this.f77296 = c15714.m37568();
        if (z3) {
            c13432 = new C16415(this);
        } else {
            c13432 = new C13432(this);
        }
        this.f77306 = c13432;
        this.f77284 = EnumC3666.f12569.m11915(enumC20820);
        this.f77303 = EnumC3666.f12546.m11915(enumC20820);
        this.f77299 = EnumC3666.f12578.m11915(enumC20820);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m53305() {
        this.f77290 = (this.f77290 & 32) | 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m53289() {
        this.f77290 = (this.f77290 & 32) | 2;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m53298() {
        C14923 c14923 = this.f77288;
        c14923.m35902();
        this.f77298 = c14923.m35905(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53275(int i, Predicate predicate) {
        return predicate.test(this.f77288.m35905(i + 1).f29212);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53276(int i, Predicate predicate, Predicate predicate2) {
        C14923 c14923 = this.f77288;
        return predicate.test(c14923.m35905(i + 1).f29212) && predicate2.test(c14923.m35905(i + 2).f29212);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53274(boolean z, boolean z2, boolean z3, boolean z4) {
        while (true) {
            switch (C22383.f72467[this.f77298.f29212.ordinal()]) {
                case 1:
                    m53298();
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
            m53298();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13891 m53308(int i, C11040 c11040) {
        return m53247(i, C14769.m35543(), c11040);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13891 m53247(int i, C14769 c14769, C11040 c11040) {
        AbstractC8036 abstractC8036;
        m53316(i);
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C13891 c13891M37569 = c15714.m37569(c14769);
        m53269(c13891M37569, c11040);
        if (c14769 != null && (abstractC8036 = (AbstractC8036) c14769.last()) != null) {
            m53272(abstractC8036, i);
        }
        return (C13891) this.f77306.mo28234(c13891M37569);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53266(int i, C11040 c11040) {
        m53269(new C2092(i), c11040);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53269(InterfaceC5075 interfaceC5075, C11040 c11040) {
        int iMo7191 = interfaceC5075.mo7191();
        C14923 c14923 = this.f77288;
        if (iMo7191 > c14923.m35900() || iMo7191 == -1) {
            EnumC7466 enumC7466 = this.f77298.f29212;
            EnumC7466 enumC7467 = EnumC7466.f24635;
            C7312 c7312 = this.f77300;
            if (enumC7466 == enumC7467) {
                c7312.m34523(EnumC6984.SYNTAX, interfaceC5075, C22843.f74097);
            } else {
                c7312.m34523(EnumC6984.SYNTAX, interfaceC5075, c11040);
            }
        }
        c14923.m35901(iMo7191);
        C8957 c8957 = this.f77298;
        int i = c8957.f29214;
        if (i == this.f77295 && c8957.f29212 != EnumC7466.f24635) {
            int i2 = this.f77280;
            this.f77280 = i2 + 1;
            C11972.m30026(i2 < 50);
        } else {
            this.f77280 = 0;
            this.f77295 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53270(EnumC7466 enumC7466) {
        m53271(enumC7466, new C9587(10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53271(EnumC7466 enumC7466, Function function) {
        C8957 c8957 = this.f77298;
        if (c8957.f29212 == enumC7466) {
            m53298();
        } else {
            m53316(c8957.f29214);
            m53266(this.f77288.m35906().f29213, (C11040) function.apply(enumC7466));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13891 m53246(int i) {
        m53316(i);
        if ((this.f77290 & 1) != 0) {
            return m53308(i, C22843.f74124);
        }
        return m53308(i, C22843.f74187);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13891 m53288() {
        return m53246(this.f77298.f29214);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53273(AbstractC8036 abstractC8036, InterfaceC19399 interfaceC19399) {
        if (!this.f77294 || interfaceC19399 == null) {
            return;
        }
        this.f77289.m54956(abstractC8036, interfaceC19399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53272(AbstractC8036 abstractC8036, int i) {
        this.f77306.mo6745(abstractC8036, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m53221(AbstractC22295 abstractC22295, C14769 c14769, boolean z) {
        EnumC21461 enumC21461;
        EnumC21461 enumC21462;
        AbstractC11194 abstractC11194 = this.f77306;
        int iMo6743 = abstractC11194.mo6743(abstractC22295);
        C23589 c23589 = null;
        AbstractC22295 abstractC22296 = abstractC22295;
        while (C11239.m28341(abstractC22296).m21911(EnumC21461.f68553)) {
            c23589 = (C23589) C11239.m28341(abstractC22296);
            abstractC22296 = c23589.f76594;
        }
        C15714 c15714 = this.f77283;
        if (z) {
            c15714.f51040 = this.f77298.f29214;
            abstractC22296 = (AbstractC22295) abstractC11194.mo28235(c15714.m37563(abstractC22296));
            iMo6743 = abstractC11194.mo6743(abstractC22296);
        }
        if (c14769.m35550()) {
            AbstractC22295 abstractC22297 = abstractC22296;
            AbstractC22295 abstractC22298 = abstractC22297;
            while (true) {
                AbstractC22295 abstractC22295M28341 = C11239.m28341(abstractC22297);
                enumC21461 = EnumC21461.f68485;
                if (!abstractC22295M28341.m21911(enumC21461)) {
                    AbstractC22295 abstractC22295M28342 = C11239.m28341(abstractC22297);
                    enumC21462 = EnumC21461.f68496;
                    if (!abstractC22295M28342.m21911(enumC21462)) {
                        break;
                    }
                }
                while (C11239.m28341(abstractC22297).m21911(EnumC21461.f68485)) {
                    abstractC22298 = abstractC22297;
                    abstractC22297 = ((C23041) C11239.m28341(abstractC22297)).f74776;
                }
                while (C11239.m28341(abstractC22297).m21911(EnumC21461.f68496)) {
                    abstractC22298 = abstractC22297;
                    abstractC22297 = ((C25191) C11239.m28341(abstractC22297)).f81425;
                }
            }
            c15714.f51040 = ((C17621) c14769.f48335).f26658;
            C16875 c16875M37532 = c15714.m37532(abstractC22297, c14769);
            if (C11239.m28341(abstractC22298).m21911(enumC21462)) {
                ((C25191) C11239.m28341(abstractC22298)).f81425 = c16875M37532;
            } else if (C11239.m28341(abstractC22298).m21911(enumC21461)) {
                ((C23041) C11239.m28341(abstractC22298)).f74776 = c16875M37532;
            } else {
                abstractC22296 = c16875M37532;
            }
        }
        if (c23589 == null) {
            return abstractC22296;
        }
        c23589.f76594 = abstractC22296;
        m53272(abstractC22295, iMo6743);
        return abstractC22295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m53255(boolean z) {
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        int i = c8957.f29214;
        EnumC7466 enumC7467 = EnumC7466.f24655;
        if (enumC7466 == enumC7467) {
            AbstractC19728 abstractC19728Mo23945 = c8957.mo23945();
            m53298();
            return abstractC19728Mo23945;
        }
        EnumC7466 enumC7468 = EnumC7466.f24642;
        C15252 c15252 = this.f77285;
        C7312 c7312 = this.f77300;
        if (enumC7466 == enumC7468) {
            c7312.m34522(EnumC6984.SYNTAX, i, C22843.f74139);
            m53298();
            return c15252.f49822;
        }
        if (enumC7466 == EnumC7466.f24600) {
            c7312.m34522(EnumC6984.SYNTAX, i, C22843.f74168);
            m53298();
            return c15252.f49822;
        }
        if (enumC7466 == EnumC7466.f24636) {
            if (this.f77291) {
                m53268(EnumC3666.f12558);
                AbstractC19728 abstractC19728Mo23946 = this.f77298.mo23945();
                m53298();
                return abstractC19728Mo23946;
            }
            c7312.m34522(EnumC6984.SYNTAX, i, C22843.f74030);
            m53298();
            return c15252.f49822;
        }
        if (enumC7466 == EnumC7466.f24632) {
            if (EnumC3666.f12543.m11915(this.f77286)) {
                c7312.m34518(this.f77298.f29214, C13146.f42058);
            } else {
                c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74192);
            }
            AbstractC19728 abstractC19728Mo23947 = this.f77298.mo23945();
            m53298();
            return abstractC19728Mo23947;
        }
        m53270(enumC7467);
        if (z && this.f77298.f29212 == EnumC7466.f24711) {
            m53298();
            return c15252.f49816;
        }
        return c15252.f49822;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53322(boolean z) {
        int i = this.f77298.f29214;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C5887 c5887M37565 = c15714.m37565(m53255(false));
        AbstractC11194 abstractC11194 = this.f77306;
        AbstractC22295 abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c5887M37565);
        while (true) {
            C8957 c8957 = this.f77298;
            if (c8957.f29212 != EnumC7466.f24708) {
                return abstractC22295;
            }
            int i2 = c8957.f29214;
            m53298();
            C14769 c14769M53250 = z ? m53250(EnumC21461.f68474) : null;
            c15714.f51040 = i2;
            abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37544(abstractC22295, m53255(false)));
            if (c14769M53250 != null && c14769M53250.m35550()) {
                c15714.f51040 = ((C17621) c14769M53250.f48335).f26658;
                abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22295, c14769M53250));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x022b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53261(AbstractC19728 abstractC19728, int i) {
        char c;
        long j;
        AbstractC22295 abstractC22295M37547;
        int i2;
        int i3;
        Float fValueOf;
        Double dValueOf;
        int i4 = C22383.f72467[this.f77298.f29212.ordinal()];
        C7312 c7312 = this.f77300;
        C15714 c15714 = this.f77283;
        C13891 c13891 = this.f77296;
        switch (i4) {
            case 52:
                try {
                    c15714.f51040 = i;
                    EnumC21172 enumC21172 = EnumC21172.INT;
                    String strM53237 = m53237(abstractC19728);
                    int iMo5353 = this.f77298.mo5353();
                    if (iMo5353 == 10) {
                        i2 = Integer.parseInt(strM53237, iMo5353);
                    } else {
                        int i5 = Integer.MAX_VALUE / (iMo5353 / 2);
                        int i6 = 0;
                        for (char c2 : strM53237.toCharArray()) {
                            int iDigit = Character.digit(c2, iMo5353);
                            if (i6 < 0 || i6 > i5 || (i3 = i6 * iMo5353) > Integer.MAX_VALUE - iDigit) {
                                throw new NumberFormatException();
                            }
                            i6 = i3 + iDigit;
                        }
                        i2 = i6;
                    }
                    abstractC22295M37547 = c15714.m37547(enumC21172, Integer.valueOf(i2));
                } catch (NumberFormatException unused) {
                    EnumC6984 enumC6984 = EnumC6984.SYNTAX;
                    int i7 = this.f77298.f29214;
                    String strM53238 = m53237(abstractC19728);
                    C11040 c11040 = C22843.f74058;
                    c7312.m34522(enumC6984, i7, new C11040("compiler", "int.number.too.large", strM53238));
                    abstractC22295M37547 = c13891;
                }
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case 53:
                try {
                    c15714.f51040 = i;
                    EnumC21172 enumC21173 = EnumC21172.LONG;
                    String strM53239 = m53237(abstractC19728);
                    int iMo5354 = this.f77298.mo5353();
                    if (iMo5354 == 10) {
                        j = Long.parseLong(strM53239, iMo5354);
                    } else {
                        char[] charArray = strM53239.toCharArray();
                        long j2 = C25227.FOREVER_NS / ((long) (iMo5354 / 2));
                        int length = charArray.length;
                        int i8 = 0;
                        long j3 = 0;
                        while (i8 < length) {
                            int iDigit2 = Character.digit(charArray[i8], iMo5354);
                            if (j3 >= 0 && j3 <= j2) {
                                char[] cArr = charArray;
                                int i9 = length;
                                long j4 = j3 * ((long) iMo5354);
                                long j5 = iDigit2;
                                if (j4 <= C25227.FOREVER_NS - j5) {
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
                        abstractC22295M37547 = c15714.m37547(enumC21173, Long.valueOf(j));
                    } catch (NumberFormatException unused2) {
                        EnumC6984 enumC6985 = EnumC6984.SYNTAX;
                        int i10 = this.f77298.f29214;
                        String strM532310 = m53237(abstractC19728);
                        C11040 c11041 = C22843.f74058;
                        Object[] objArr = new Object[1];
                        objArr[c] = strM532310;
                        c7312.m34522(enumC6985, i10, new C11040("compiler", "int.number.too.large", objArr));
                        abstractC22295M37547 = c13891;
                    }
                    break;
                } catch (NumberFormatException unused3) {
                    c = 0;
                }
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                String strMo23943 = this.f77298.mo5353() == 16 ? "0x" + this.f77298.mo23943() : this.f77298.mo23943();
                try {
                    fValueOf = Float.valueOf(strMo23943);
                    break;
                } catch (NumberFormatException unused4) {
                    fValueOf = Float.valueOf(Float.NaN);
                }
                if (fValueOf.floatValue() != 0.0f || m53222(strMo23943)) {
                    if (fValueOf.floatValue() == Float.POSITIVE_INFINITY) {
                        c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74054);
                    } else {
                        c15714.f51040 = i;
                        abstractC22295M37547 = c15714.m37547(EnumC21172.FLOAT, fValueOf);
                    }
                    if (abstractC22295M37547 == c13891) {
                        c15714.f51040 = i;
                        abstractC22295M37547 = c15714.m37568();
                    }
                    m53272(abstractC22295M37547, this.f77298.f29213);
                    m53298();
                    return abstractC22295M37547;
                }
                c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74129);
                abstractC22295M37547 = c13891;
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                String strMo23944 = this.f77298.mo5353() == 16 ? "0x" + this.f77298.mo23943() : this.f77298.mo23943();
                try {
                    dValueOf = Double.valueOf(strMo23944);
                    break;
                } catch (NumberFormatException unused5) {
                    dValueOf = Double.valueOf(Double.NaN);
                }
                if (dValueOf.doubleValue() != 0.0d || m53222(strMo23944)) {
                    if (dValueOf.doubleValue() == Double.POSITIVE_INFINITY) {
                        c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74054);
                    } else {
                        c15714.f51040 = i;
                        abstractC22295M37547 = c15714.m37547(EnumC21172.DOUBLE, dValueOf);
                    }
                    if (abstractC22295M37547 == c13891) {
                        c15714.f51040 = i;
                        abstractC22295M37547 = c15714.m37568();
                    }
                    m53272(abstractC22295M37547, this.f77298.f29213);
                    m53298();
                    return abstractC22295M37547;
                }
                c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74129);
                abstractC22295M37547 = c13891;
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case 56:
                c15714.f51040 = i;
                abstractC22295M37547 = c15714.m37547(EnumC21172.CHAR, Integer.valueOf(this.f77298.mo23943().charAt(0)));
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case 57:
                c15714.f51040 = i;
                abstractC22295M37547 = c15714.m37547(EnumC21172.CLASS, this.f77298.mo23943());
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                c15714.f51040 = i;
                abstractC22295M37547 = c15714.m37547(EnumC21172.BOOLEAN, Integer.valueOf(this.f77298.f29212 != EnumC7466.f24612 ? 0 : 1));
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            case 60:
                c15714.f51040 = i;
                abstractC22295M37547 = c15714.m37547(EnumC21172.BOT, (Object) null);
                if (abstractC22295M37547 == c13891) {
                    c15714.f51040 = i;
                    abstractC22295M37547 = c15714.m37568();
                }
                m53272(abstractC22295M37547, this.f77298.f29213);
                m53298();
                return abstractC22295M37547;
            default:
                C11972.m30019();
                throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53222(String str) {
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
    public final String m53237(AbstractC19728 abstractC19728) {
        String strMo23943 = this.f77298.mo23943();
        if (abstractC19728.isEmpty()) {
            return strMo23943;
        }
        return ((Object) abstractC19728) + strMo23943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2903 m53238(int i, C4395 c4395, AbstractC22295 abstractC22295, boolean z) {
        AbstractC2903 abstractC2903;
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24668;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (enumC7466 == enumC7467 && abstractC22295 == null) {
            int i2 = c8957.f29214;
            m53270(enumC7467);
            AbstractC2903 abstractC2903M53238 = m53238(this.f77298.f29214, (C4395) null, (AbstractC22295) null, false);
            m53270(EnumC7466.f24654);
            c15714.f51040 = i2;
            C9614 c9614 = new C9614();
            c9614.f31095 = abstractC2903M53238;
            c9614.f26658 = c15714.f51040;
            abstractC2903 = (AbstractC2903) abstractC11194.mo28234(c9614);
        } else {
            if (c4395 == null) {
                c4395 = m53240(0L);
            }
            if (abstractC22295 == null) {
                abstractC22295 = m53284(34);
            }
            c15714.f51040 = this.f77298.f29214;
            C12510 c12510 = (C12510) abstractC11194.mo28234(c15714.m37520(c4395, m53255(false), abstractC22295, (AbstractC22295) null));
            c15714.f51040 = i;
            C24335 c24335 = new C24335();
            c24335.f78930 = c12510;
            c24335.f26658 = c15714.f51040;
            abstractC2903 = (AbstractC2903) abstractC11194.mo28234(c24335);
        }
        if (z || this.f77298.f29212 != EnumC7466.f24685) {
            return abstractC2903;
        }
        m53268(EnumC3666.f12579);
        m53298();
        AbstractC22295 abstractC22295M53284 = m53284(33);
        c15714.f51040 = i;
        C13344 c13344 = new C13344();
        c13344.f42553 = abstractC2903;
        c13344.f42552 = abstractC22295M53284;
        c13344.f26658 = c15714.f51040;
        return c13344;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53292(boolean z) {
        AbstractC22295 abstractC22295M53284 = m53284(2);
        AbstractC19728 abstractC19728M53254 = m53254(abstractC22295M53284, !z);
        if (abstractC19728M53254 != null && (!z || abstractC19728M53254 != this.f77285.f49837)) {
            int i = abstractC22295M53284.f26658;
            C11040 c11040 = C22843.f74058;
            m53308(i, new C11040("compiler", "restricted.type.not.allowed.here", abstractC19728M53254));
        }
        return abstractC22295M53284;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53284(int i) {
        int i2 = this.f77290;
        this.f77290 = i;
        AbstractC22295 abstractC22295M53324 = m53324();
        this.f77281 = this.f77290;
        this.f77290 = i2;
        return abstractC22295M53324;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53324() {
        AbstractC22295 abstractC22295M53236 = m53236();
        if ((this.f77290 & 1) == 0) {
            return abstractC22295M53236;
        }
        EnumC7466 enumC7466 = this.f77298.f29212;
        return (enumC7466 == EnumC7466.f24686 || (EnumC7466.f24621.compareTo(enumC7466) <= 0 && this.f77298.f29212.compareTo(EnumC7466.f24609) <= 0)) ? m53296(abstractC22295M53236) : abstractC22295M53236;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53296(AbstractC22295 abstractC22295) {
        int i = C22383.f72467[this.f77298.f29212.ordinal()];
        C15714 c15714 = this.f77283;
        switch (i) {
            case 61:
                int i2 = this.f77298.f29214;
                m53298();
                m53305();
                AbstractC22295 abstractC22295M53324 = m53324();
                c15714.f51040 = i2;
                return (AbstractC22295) this.f77306.mo28234(c15714.m37541(abstractC22295, abstractC22295M53324));
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
                C8957 c8957 = this.f77298;
                int i3 = c8957.f29214;
                EnumC7466 enumC7466 = c8957.f29212;
                m53298();
                m53305();
                AbstractC22295 abstractC22295M53325 = m53324();
                c15714.f51040 = i3;
                return c15714.m37519(m53231(enumC7466), (AbstractC8036) abstractC22295, (AbstractC8036) abstractC22295M53325);
            default:
                return abstractC22295;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53320(AbstractC22295 abstractC22295) {
        C8957 c8957 = this.f77298;
        if (c8957.f29212 != EnumC7466.f24670) {
            return abstractC22295;
        }
        int i = c8957.f29214;
        m53298();
        AbstractC22295 abstractC22295M53324 = m53324();
        m53270(EnumC7466.f24678);
        AbstractC22295 abstractC22295M53236 = m53236();
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        return c15714.m37517(abstractC22295, abstractC22295M53324, abstractC22295M53236);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53236() {
        AbstractC22295 abstractC22295M53293 = m53293();
        if ((this.f77290 & 1) != 0 && m53227(this.f77298.f29212) >= 4) {
            m53305();
            abstractC22295M53293 = m53304(abstractC22295M53293);
        }
        if ((this.f77290 & 1) == 0 || this.f77298.f29212 != EnumC7466.f24670) {
            return abstractC22295M53293;
        }
        m53305();
        return m53320(abstractC22295M53293);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53278(C18499 c18499, C18499 c184910) {
        if (c18499.isEmpty()) {
            return false;
        }
        if (c18499.size() == 1) {
            c184910.m43095((AbstractC22295) c18499.first());
            return false;
        }
        C23787 c23787 = (C23787) c18499.first();
        c23787.getClass();
        int iM28342 = C11239.m28342(c23787);
        C15714 c15714 = this.f77283;
        c15714.f51040 = iM28342;
        C23787 c23787M37547 = c15714.m37547(EnumC21172.CLASS, C1170.stream(c18499).map(new C18285(7)).collect(C2025.joining()));
        C23787 c23788 = (C23787) c18499.last();
        c23788.getClass();
        m53272(c23787M37547, C11239.m28320(c23788, this.f77306));
        c184910.m43095(c23787M37547);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53224(AbstractC22295 abstractC22295, C18499 c18499, C18499 c184910, boolean z) {
        C23787 c23787;
        if (abstractC22295.m21911(EnumC21461.f68484)) {
            c23787 = (C23787) abstractC22295;
            if (c23787.f77042 != EnumC21172.CLASS) {
                c23787 = null;
            }
        } else {
            c23787 = null;
        }
        if (c23787 != null) {
            c18499.m43095(c23787);
            return z && m53278(c18499, c184910);
        }
        boolean zM53278 = m53278(c18499, c184910);
        c18499.clear();
        c184910.m43095(abstractC22295);
        return zM53278;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53304(AbstractC22295 abstractC22295) {
        C15714 c15714;
        AbstractC2903 abstractC2903M53238;
        AbstractC2903 abstractC2903M53221;
        ArrayList arrayList = this.f77305;
        boolean z = true;
        AbstractC22295[] abstractC22295Arr = arrayList.isEmpty() ? new AbstractC22295[11] : (AbstractC22295[]) C18011.m41990(arrayList, 1);
        ArrayList arrayList2 = this.f77282;
        C8957[] c8957Arr = arrayList2.isEmpty() ? new C8957[11] : (C8957[]) C18011.m41990(arrayList2, 1);
        boolean z2 = false;
        abstractC22295Arr[0] = abstractC22295;
        int i = this.f77298.f29214;
        C8957 c8957 = C14177.f44826;
        int i2 = 0;
        while (true) {
            int iM53227 = m53227(this.f77298.f29212);
            c15714 = this.f77283;
            if (iM53227 < 4) {
                break;
            }
            c8957Arr[i2] = c8957;
            C8957 c8958 = this.f77298;
            if (c8958.f29212 == EnumC7466.f24674) {
                int i3 = c8958.f29214;
                m53298();
                C8957 c8959 = this.f77298;
                EnumC7466 enumC7466 = c8959.f29212;
                int i4 = c8959.f29214;
                if (enumC7466 == EnumC7466.f24668) {
                    m53264(i4, EnumC3666.f12579);
                    abstractC2903M53238 = m53238(this.f77298.f29214, (C4395) null, (AbstractC22295) null, z);
                } else {
                    C4395 c4395M53240 = m53240(0L);
                    int i5 = this.f77298.f29214;
                    AbstractC22295 abstractC22295M53292 = m53292(z2);
                    C8957 c89510 = this.f77298;
                    if (c89510.f29212 == EnumC7466.f24655) {
                        m53264(c89510.f29214, EnumC3666.f12560);
                        abstractC2903M53238 = m53238(i4, c4395M53240, abstractC22295M53292, true);
                    } else {
                        long j = c4395M53240.f15825 & (-131073);
                        if (j != 0) {
                            long j2 = (-j) & j;
                            EnumC6984 enumC6984 = EnumC6984.SYNTAX;
                            EnumSet enumSetM8159 = C2417.m8159(j2);
                            C11040 c11040 = C22843.f74058;
                            this.f77300.m34522(enumC6984, i5, new C11040("compiler", "mod.not.allowed.here", enumSetM8159));
                        }
                        abstractC2903M53221 = abstractC22295M53292;
                        if (c4395M53240.f15824.m35550()) {
                            m53264(((C17621) c4395M53240.f15824.f48335).f26658, EnumC3666.f12558);
                            abstractC2903M53221 = m53221(abstractC22295M53292, c4395M53240.f15824.m35547(new Function() { // from class: l.ۙ᩺ۘ
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
                                    C17621 c17621 = (C17621) obj;
                                    C23875 c23875 = this.f18423;
                                    C15714 c15715 = c23875.f77283;
                                    c15715.f51040 = c17621.f26658;
                                    C17621 c17621M37556 = c15715.m37556(c17621.f57962, c17621.f57964);
                                    c23875.f77306.mo6744(c17621, c17621M37556);
                                    return c17621M37556;
                                }
                            }), false);
                        }
                    }
                    c15714.f51040 = i3;
                    AbstractC22295 abstractC22296 = abstractC22295Arr[i2];
                    C25279 c25279 = new C25279();
                    c25279.f81646 = abstractC22296;
                    c25279.f81647 = abstractC2903M53221;
                    c25279.f26658 = c15714.f51040;
                    abstractC22295Arr[i2] = c25279;
                    c8957 = c8957;
                }
                arrayList = arrayList;
                abstractC22295Arr = abstractC22295Arr;
                abstractC2903M53221 = abstractC2903M53238;
                c8957 = c8957;
                c15714.f51040 = i3;
                AbstractC22295 abstractC22297 = abstractC22295Arr[i2];
                C25279 c252710 = new C25279();
                c252710.f81646 = abstractC22297;
                c252710.f81647 = abstractC2903M53221;
                c252710.f26658 = c15714.f51040;
                abstractC22295Arr[i2] = c252710;
                c8957 = c8957;
            } else {
                arrayList = arrayList;
                abstractC22295Arr = abstractC22295Arr;
                m53298();
                i2++;
                abstractC22295Arr[i2] = m53293();
                c8957 = c8958;
            }
            while (i2 > 0 && m53227(c8957.f29212) >= m53227(this.f77298.f29212)) {
                int i6 = i2 - 1;
                c15714.f51040 = c8957.f29214;
                abstractC22295Arr[i6] = c15714.m37510(m53231(c8957.f29212), abstractC22295Arr[i6], abstractC22295Arr[i2]);
                i2--;
                c8957 = c8957Arr[i2];
            }
            z = true;
            z2 = false;
            arrayList = arrayList;
            abstractC22295Arr = abstractC22295Arr;
        }
        ArrayList arrayList3 = arrayList;
        AbstractC22295[] abstractC22295Arr2 = abstractC22295Arr;
        C11972.m30026(i2 == 0);
        AbstractC22295 abstractC22298 = abstractC22295Arr2[0];
        if (abstractC22298.m21911(EnumC21461.f68466) && this.f77293) {
            C18499 c18499 = new C18499();
            C18499 c184910 = new C18499();
            boolean zM53224 = false;
            AbstractC22295 abstractC22299 = abstractC22298;
            while (abstractC22299.m21911(EnumC21461.f68466)) {
                C6435 c6435 = (C6435) abstractC22299;
                zM53224 |= m53224(c6435.f21671, c184910, c18499, false);
                abstractC22299 = c6435.f21672;
            }
            if (m53224(abstractC22299, c184910, c18499, true) | zM53224) {
                C14769 c14769M43093 = c18499.m43093();
                AbstractC22295 abstractC22295M37510 = (AbstractC22295) c14769M43093.f48335;
                for (AbstractC22295 abstractC222910 : c14769M43093.f48336) {
                    abstractC222910.getClass();
                    c15714.f51040 = C11239.m28342(abstractC222910);
                    abstractC22295M37510 = c15714.m37510(m53231(EnumC7466.f24665), abstractC22295M37510, abstractC222910);
                    m53272(abstractC22295M37510, this.f77306.mo6743(abstractC222910));
                }
                abstractC22298 = abstractC22295M37510;
            }
        }
        arrayList3.add(abstractC22295Arr2);
        arrayList2.add(c8957Arr);
        return abstractC22298;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final l.AbstractC22295 m53293() {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23875.m53293():l.᩷᩶ۘ");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53321(AbstractC22295 abstractC22295, C14769 c14769) {
        C15714 c15714;
        AbstractC11194 abstractC11194;
        EnumC7466 enumC7466;
        if (c14769 != null) {
            m53288();
        }
        while (true) {
            int i = this.f77298.f29214;
            EnumC21461 enumC21461 = EnumC21461.f68474;
            C14769 c14769M53250 = m53250(enumC21461);
            EnumC7466 enumC7467 = this.f77298.f29212;
            EnumC7466 enumC7468 = EnumC7466.f24629;
            c15714 = this.f77283;
            abstractC11194 = this.f77306;
            if (enumC7467 == enumC7468) {
                m53298();
                int i2 = this.f77290;
                if ((i2 & 2) != 0) {
                    m53289();
                    if (this.f77298.f29212 == EnumC7466.f24625) {
                        m53298();
                        AbstractC22295 abstractC22295M53225 = m53225(abstractC22295);
                        c15714.f51040 = i;
                        abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37563(abstractC22295M53225));
                        if (this.f77298.f29212 != EnumC7466.f24675) {
                            if (!c14769M53250.m35550()) {
                                return abstractC22295;
                            }
                            c15714.f51040 = i;
                            return (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22295, c14769M53250));
                        }
                        m53305();
                    } else {
                        this.f77290 = i2;
                    }
                }
                if ((this.f77290 & 1) != 0) {
                    m53305();
                    AbstractC22295 abstractC22295M53324 = m53324();
                    c15714.f51040 = i;
                    abstractC22295 = (AbstractC22295) abstractC11194.mo28235(c15714.m37570(abstractC22295, abstractC22295M53324));
                }
                m53270(EnumC7466.f24625);
            } else if (enumC7467 == EnumC7466.f24708) {
                m53298();
                C14769 c14769M53319 = m53319(1);
                EnumC7466 enumC7469 = this.f77298.f29212;
                if (enumC7469 == EnumC7466.f24696 && (this.f77290 & 1) != 0) {
                    m53305();
                    c15714.f51040 = i;
                    AbstractC22295 abstractC22296 = (AbstractC22295) abstractC11194.mo28235(c15714.m37544(abstractC22295, this.f77285.f49851));
                    m53298();
                    abstractC22295 = m53263(abstractC22296, c14769M53319);
                } else if (enumC7469 != EnumC7466.f24606 || (this.f77290 & 1) == 0) {
                    C14769 c14769M53251 = ((this.f77290 & 2) == 0 || enumC7469 != EnumC7466.f24688) ? null : m53250(enumC21461);
                    c15714.f51040 = i;
                    abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37544(abstractC22295, m53255(true)));
                    C8957 c8957 = this.f77298;
                    if (c8957.f29214 <= abstractC11194.f35322 && c8957.f29212 == EnumC7466.f24688) {
                        break;
                    }
                    if (c14769M53251 != null && c14769M53251.m35550()) {
                        c15714.f51040 = ((C17621) c14769M53251.f48335).f26658;
                        abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22295, c14769M53251));
                    }
                    abstractC22295 = m53314(m53291(abstractC22295), c14769M53319);
                } else {
                    if (c14769M53319 != null) {
                        return m53288();
                    }
                    m53305();
                    int i3 = this.f77298.f29214;
                    m53298();
                    if (this.f77298.f29212 == EnumC7466.f24697) {
                        c14769M53319 = m53295(false);
                    }
                    abstractC22295 = m53252(i3, abstractC22295, c14769M53319);
                }
                c14769 = null;
            } else {
                if ((this.f77290 & 1) == 0 || enumC7467 != (enumC7466 = EnumC7466.f24675)) {
                    if (c14769M53250.isEmpty()) {
                        break;
                    }
                    if (!this.f77301) {
                        return m53246(((C17621) c14769M53250.f48335).f26658);
                    }
                    this.f77287 = c14769M53250;
                    break;
                }
                m53305();
                if (c14769 != null) {
                    return m53288();
                }
                m53270(enumC7466);
                abstractC22295 = m53285(abstractC22295);
            }
        }
        while (true) {
            EnumC7466 enumC74610 = this.f77298.f29212;
            EnumC7466 enumC74611 = EnumC7466.f24699;
            if ((enumC74610 != enumC74611 && enumC74610 != EnumC7466.f24667) || (this.f77290 & 1) == 0) {
                break;
            }
            m53305();
            C8957 c8958 = this.f77298;
            c15714.f51040 = c8958.f29214;
            abstractC22295 = (AbstractC22295) abstractC11194.mo28235(c15714.m37505(c8958.f29212 == enumC74611 ? EnumC21461.f68451 : EnumC21461.f68525, abstractC22295));
            m53298();
        }
        return (AbstractC22295) abstractC11194.mo28234(abstractC22295);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m53228(int i) {
        int i2 = i + 1;
        while (m53275(i2, EnumC7466.f24708)) {
            i2 += 2;
        }
        if (m53275(i2, EnumC7466.f24668)) {
            i2++;
            int i3 = 0;
            while (true) {
                int i4 = C22383.f72467[this.f77288.m35905(i2).f29212.ordinal()];
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
    public final AbstractC22295 m53260(int i, boolean z, boolean z2) {
        C14769<C12510> c14769M43093;
        C7312 c7312;
        char c;
        AbstractC19728 abstractC19728M53254;
        C11040 c11040;
        C15714 c15714 = this.f77283;
        boolean z3 = false;
        if (z2) {
            c14769M43093 = m53310(true, false);
        } else {
            if (z) {
                m53270(EnumC7466.f24668);
            }
            C18499 c18499 = new C18499();
            C8957 c8957 = this.f77298;
            EnumC7466 enumC7466 = c8957.f29212;
            if (enumC7466 != EnumC7466.f24654 && enumC7466 != EnumC7466.f24603) {
                c15714.f51040 = c8957.f29214;
                c18499.m43089(m53244(c15714.m37507(8589934592L), (AbstractC22295) null, true, false));
                while (this.f77298.f29212 == EnumC7466.f24672) {
                    m53298();
                    c15714.f51040 = this.f77298.f29214;
                    c18499.m43089(m53244(c15714.m37507(8589934592L), (AbstractC22295) null, true, false));
                }
            }
            if (z) {
                m53270(EnumC7466.f24654);
            }
            c14769M43093 = c18499.m43093();
        }
        if (z2) {
            C11940 c11940 = new C11940(this);
            Iterator it = c14769M43093.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c7312 = this.f77300;
                if (!zHasNext) {
                    c = 0;
                    break;
                }
                C12510 c12510 = (C12510) it.next();
                AbstractC22295 abstractC22295 = c12510.f40166;
                if (abstractC22295 == null || (abstractC19728M53254 = m53254(abstractC22295, z3)) == null || !c12510.f40166.m21911(EnumC21461.f68553)) {
                    c = 0;
                } else {
                    EnumC6984 enumC6984 = EnumC6984.SYNTAX;
                    int i2 = c12510.f26658;
                    c = 0;
                    if (EnumC3666.f12556.m11915(this.f77286)) {
                        C11040 c11041 = C22843.f74058;
                        c11040 = new C11040("compiler", "restricted.type.not.allowed.array", abstractC19728M53254);
                    } else {
                        C11040 c11042 = C22843.f74058;
                        c11040 = new C11040("compiler", "restricted.type.not.allowed.here", abstractC19728M53254);
                    }
                    c7312.m34522(enumC6984, i2, c11040);
                }
                c11940.m29907(c12510);
                if (c11940.f38449 == EnumC25367.ERROR) {
                    break;
                }
                z3 = false;
            }
            C15515 c15515 = c11940.f38447;
            if (c15515 != null) {
                EnumC6984 enumC6985 = EnumC6984.SYNTAX;
                C11040 c11043 = C22843.f74058;
                Object[] objArr = new Object[1];
                objArr[c] = c15515;
                c7312.m34522(enumC6985, i, new C11040("compiler", "invalid.lambda.parameter.declaration", objArr));
            }
            for (C12510 c12511 : c14769M43093) {
                AbstractC22295 abstractC22296 = c12511.f40166;
                if (abstractC22296 != null && m53254(abstractC22296, true) != null) {
                    m53264(c12511.f26658, EnumC3666.f12556);
                    c12511.f40165 = C11239.m28342(c12511.f40166);
                    c12511.f40166 = null;
                }
            }
        }
        m53268(EnumC3666.f12572);
        m53270(EnumC7466.f24603);
        C8957 c8958 = this.f77298;
        EnumC7466 enumC7467 = c8958.f29212;
        EnumC7466 enumC7468 = EnumC7466.f24658;
        AbstractC11194 abstractC11194 = this.f77306;
        if (enumC7467 == enumC7468) {
            C4197 c4197M53239 = m53239(c8958.f29214, 0L);
            c15714.f51040 = i;
            return (AbstractC22295) abstractC11194.mo28234(c15714.m37571(c4197M53239, c14769M43093));
        }
        AbstractC22295 abstractC22295M53284 = m53284(1);
        c15714.f51040 = i;
        return (AbstractC22295) abstractC11194.mo28234(c15714.m37571((AbstractC8036) abstractC22295M53284, c14769M43093));
    }

    static {
        C15515 c15515 = C19859.f63846;
        C15515 c15516 = C19859.f63888;
        C15515 c15517 = C19859.f63845;
        f77278 = new C15515[][]{new C15515[]{null, c15515, c15516}, new C15515[]{c15515, null, c15517}, new C15515[]{c15516, c15517, null}};
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53286(AbstractC22295 abstractC22295, C14769 c14769) {
        m53298();
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        if (enumC7466 == EnumC7466.f24668 || c14769 != null) {
            return m53263(abstractC22295, c14769);
        }
        EnumC7466 enumC7467 = EnumC7466.f24675;
        if (enumC7466 == enumC7467) {
            if (c14769 != null) {
                return m53288();
            }
            m53270(enumC7467);
            return m53285(abstractC22295);
        }
        int i = c8957.f29214;
        m53270(EnumC7466.f24708);
        C14769 c14769M53295 = this.f77298.f29212 == EnumC7466.f24697 ? m53295(false) : null;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        return m53314((AbstractC22295) this.f77306.mo28234(c15714.m37544(abstractC22295, m53255(false))), c14769M53295);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14089 m53302() {
        EnumC21172 enumC21172;
        C8957 c8957 = this.f77298;
        int i = c8957.f29214;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        switch (C22383.f72467[c8957.f29212.ordinal()]) {
            case 22:
                enumC21172 = EnumC21172.BYTE;
                break;
            case 23:
                enumC21172 = EnumC21172.SHORT;
                break;
            case 24:
                enumC21172 = EnumC21172.CHAR;
                break;
            case 25:
                enumC21172 = EnumC21172.INT;
                break;
            case 26:
                enumC21172 = EnumC21172.LONG;
                break;
            case 27:
                enumC21172 = EnumC21172.FLOAT;
                break;
            case 28:
                enumC21172 = EnumC21172.DOUBLE;
                break;
            case 29:
                enumC21172 = EnumC21172.BOOLEAN;
                break;
            default:
                enumC21172 = EnumC21172.NONE;
                break;
        }
        C14089 c14089 = (C14089) this.f77306.mo28235(c15714.m37524(enumC21172));
        m53298();
        return c14089;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53314(AbstractC22295 abstractC22295, C14769 c14769) {
        if (((this.f77290 & 1) == 0 || this.f77298.f29212 != EnumC7466.f24668) && c14769 == null) {
            return abstractC22295;
        }
        m53305();
        return m53263(abstractC22295, c14769);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m53283() {
        C18499 c18499 = new C18499();
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24668;
        if (enumC7466 == enumC7467) {
            m53298();
            if (this.f77298.f29212 != EnumC7466.f24654) {
                c18499.m43089(m53284(1));
                while (this.f77298.f29212 == EnumC7466.f24672) {
                    m53298();
                    c18499.m43089(m53284(1));
                }
            }
            m53270(EnumC7466.f24654);
        } else {
            m53308(c8957.f29214, C22843.m51548(enumC7467));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53263(AbstractC22295 abstractC22295, C14769 c14769) {
        int i = this.f77298.f29214;
        C14769 c14769M53283 = m53283();
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        AbstractC8036 abstractC8036M37550 = c15714.m37550(abstractC22295, c14769, c14769M53283);
        if (abstractC22295.m21911(EnumC21461.f68523)) {
            C5887 c5887 = (C5887) abstractC22295;
            int i2 = c5887.f26658;
            if (c5887.f20169 == this.f77285.f49785) {
                boolean z = this.f77284;
                C7312 c7312 = this.f77300;
                if (z) {
                    c7312.m34523(EnumC6984.SYNTAX, abstractC22295, C22843.f74056);
                    abstractC8036M37550 = c15714.m37569(C14769.of((Object) abstractC8036M37550));
                } else {
                    c7312.m34518(i2, C13146.f42043);
                }
            }
        }
        return (AbstractC22295) this.f77306.mo28234(abstractC8036M37550);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53291(AbstractC22295 abstractC22295) {
        if (this.f77298.f29212 != EnumC7466.f24697) {
            return abstractC22295;
        }
        int i = this.f77290;
        if ((i & 2) == 0 || (i & 4) != 0) {
            return abstractC22295;
        }
        m53289();
        return m53315(abstractC22295, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m53319(int i) {
        if (this.f77298.f29212 != EnumC7466.f24697) {
            return null;
        }
        int i2 = this.f77290;
        if ((i2 & i) == 0 || (i2 & 4) != 0) {
            m53288();
        }
        this.f77290 = i;
        return m53295(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14769 m53295(boolean z) {
        EnumC7466 enumC7466;
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7467 = c8957.f29212;
        EnumC7466 enumC7468 = EnumC7466.f24697;
        if (enumC7467 == enumC7468) {
            m53298();
            if (this.f77298.f29212 == EnumC7466.f24704 && z) {
                m53268(EnumC3666.f12545);
                this.f77290 |= 16;
                m53298();
                return C14769.m35543();
            }
            C18499 c18499 = new C18499();
            c18499.m43089((this.f77290 & 1) == 0 ? m53306() : m53287(false));
            while (true) {
                enumC7466 = this.f77298.f29212;
                if (enumC7466 != EnumC7466.f24672) {
                    break;
                }
                m53298();
                c18499.m43089((this.f77290 & 1) == 0 ? m53306() : m53287(false));
            }
            int i = C22383.f72467[enumC7466.ordinal()];
            if (i == 71 || i == 72 || i == 93) {
                this.f77298 = this.f77288.m35903();
            } else {
                switch (i) {
                    case 89:
                    case 90:
                        this.f77298 = this.f77288.m35903();
                        break;
                    case 91:
                        m53298();
                        break;
                    default:
                        c18499.m43089(m53308(this.f77298.f29214, C22843.m51548(EnumC7466.f24704)));
                        break;
                }
            }
            return c18499.m43093();
        }
        return C14769.of((Object) m53308(c8957.f29214, C22843.m51548(enumC7468)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25191 m53315(AbstractC22295 abstractC22295, boolean z) {
        int i = this.f77298.f29214;
        C14769 c14769M53295 = m53295(z);
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        return (C25191) this.f77306.mo28234(c15714.m37560(abstractC22295, c14769M53295));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m53225(AbstractC22295 abstractC22295) {
        return m53229(abstractC22295, C14769.m35543());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m53232(int i, AbstractC22295 abstractC22295, C14769 c14769) {
        m53270(EnumC7466.f24625);
        AbstractC22295 abstractC22295M53225 = m53225(abstractC22295);
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C23589 c23589M37563 = c15714.m37563(abstractC22295M53225);
        AbstractC11194 abstractC11194 = this.f77306;
        AbstractC22295 abstractC22296 = (AbstractC22295) abstractC11194.mo28234(c23589M37563);
        if (!c14769.m35550()) {
            return abstractC22296;
        }
        c15714.f51040 = i;
        return (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22296, c14769));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53262(AbstractC22295 abstractC22295) {
        AbstractC19728 abstractC19728Mo23945;
        int i = this.f77290;
        if ((i & 1) == 0 || this.f77298.f29212 != EnumC7466.f24708) {
            if ((i & 2) != 0) {
                if (this.f77298.f29212 != EnumC7466.f24675) {
                    m53289();
                    return abstractC22295;
                }
            } else {
                C8957 c8957 = this.f77298;
                if (c8957.f29212 != EnumC7466.f24675) {
                    m53308(c8957.f29214, C22843.f74042);
                }
            }
            return abstractC22295;
        }
        m53305();
        int i2 = this.f77298.f29214;
        m53298();
        m53270(EnumC7466.f24711);
        C8957 c8958 = this.f77298;
        int i3 = c8958.f29214;
        AbstractC11194 abstractC11194 = this.f77306;
        int i4 = abstractC11194.f35322;
        C15714 c15714 = this.f77283;
        C15252 c15252 = this.f77285;
        if (i3 == i4) {
            if (this.f77302.test(c8958.f29212)) {
                abstractC19728Mo23945 = this.f77298.mo23945();
                m53298();
            } else {
                abstractC19728Mo23945 = c15252.f49822;
            }
            c15714.f51040 = i2;
            return c15714.m37569(C14769.of((Object) abstractC11194.mo28234(c15714.m37544(abstractC22295, abstractC19728Mo23945))));
        }
        EnumC21461 enumC21461Mo2285 = abstractC22295.mo2285();
        if ((enumC21461Mo2285 == EnumC21461.f68553 && C11239.m28357((AbstractC8036) abstractC22295)) || enumC21461Mo2285 == EnumC21461.f68448) {
            m53308(this.f77298.f29214, C22843.f74038);
        }
        c15714.f51040 = i2;
        return (AbstractC22295) abstractC11194.mo28234(c15714.m37544(abstractC22295, c15252.f49816));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53285(AbstractC22295 abstractC22295) {
        EnumC16081 enumC16081;
        AbstractC19728 abstractC19728M53255;
        m53268(EnumC3666.f12549);
        m53305();
        C14769 c14769M53295 = this.f77298.f29212 == EnumC7466.f24697 ? m53295(false) : null;
        if (this.f77298.f29212 == EnumC7466.f24606) {
            enumC16081 = EnumC16081.NEW;
            abstractC19728M53255 = this.f77285.f49865;
            m53298();
        } else {
            enumC16081 = EnumC16081.INVOKE;
            abstractC19728M53255 = m53255(false);
        }
        abstractC22295.getClass();
        int iM28342 = C11239.m28342(abstractC22295);
        C15714 c15714 = this.f77283;
        c15714.f51040 = iM28342;
        C12598 c12598 = new C12598(enumC16081, abstractC19728M53255, abstractC22295, c14769M53295);
        c12598.f26658 = c15714.f51040;
        return (AbstractC22295) this.f77306.mo28234(c12598);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18565 m53253(int i, AbstractC22295 abstractC22295, C14769 c14769, AbstractC22295 abstractC22296) {
        C7926 c7926;
        C14769 c14769M53283 = m53283();
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24658;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (enumC7466 == enumC7467) {
            int i2 = c8957.f29214;
            C14769 c14769M53249 = m53249(this.f77285.f49799, false, false);
            c15714.f51040 = -1;
            C4395 c4395M37507 = c15714.m37507(0L);
            c15714.f51040 = i2;
            c7926 = (C7926) abstractC11194.mo28234(c15714.m37513(c4395M37507, c14769M53249));
        } else {
            c7926 = null;
        }
        c15714.f51040 = i;
        return (C18565) abstractC11194.mo28234(c15714.m37539(abstractC22295, c14769, abstractC22296, c14769M53283, c7926, false));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53312(int i, AbstractC22295 abstractC22295) {
        C14769 c14769M53318 = m53318();
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        return (AbstractC22295) this.f77306.mo28234(c15714.m37573(abstractC22295, C14769.m35543(), c14769M53318));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m53318() {
        m53270(EnumC7466.f24658);
        C18499 c18499 = new C18499();
        EnumC7466 enumC7466 = this.f77298.f29212;
        if (enumC7466 == EnumC7466.f24672) {
            m53298();
        } else if (enumC7466 != EnumC7466.f24660) {
            c18499.m43089(m53282());
            while (this.f77298.f29212 == EnumC7466.f24672) {
                m53298();
                if (this.f77298.f29212 == EnumC7466.f24660) {
                    break;
                }
                c18499.m43089(m53282());
            }
        }
        m53270(EnumC7466.f24660);
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53282() {
        C8957 c8957 = this.f77298;
        return c8957.f29212 == EnumC7466.f24658 ? m53312(c8957.f29214, (AbstractC22295) null) : m53284(1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53299() {
        int i = this.f77298.f29214;
        m53270(EnumC7466.f24668);
        AbstractC22295 abstractC22295M53284 = m53284(1);
        m53270(EnumC7466.f24654);
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C1412 c1412 = new C1412();
        c1412.f4986 = abstractC22295M53284;
        c1412.f26658 = c15714.f51040;
        return (AbstractC22295) this.f77306.mo28234(c1412);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4197 m53239(int i, long j) {
        m53270(EnumC7466.f24658);
        C14769 c14769M53279 = m53279();
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C4197 c4197M37506 = c15714.m37506(j, c14769M53279);
        while (true) {
            C8957 c8957 = this.f77298;
            EnumC7466 enumC7466 = c8957.f29212;
            int i2 = c8957.f29214;
            if (enumC7466 == EnumC7466.f24659 || enumC7466 == EnumC7466.f24656) {
                C11040 c11040 = C22843.f74058;
                m53308(i2, new C11040("compiler", "orphaned", enumC7466));
                m53280();
            } else {
                c4197M37506.f15343 = i2;
                m53270(EnumC7466.f24660);
                return (C4197) this.f77306.mo28234(c4197M37506);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4197 m53294() {
        return m53239(this.f77298.f29214, 0L);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14769 m53279() {
        C18499 c18499 = new C18499();
        int i = -1;
        while (true) {
            C14769 c14769M53290 = m53290();
            if (c14769M53290.isEmpty()) {
                return c18499.m43093();
            }
            int i2 = this.f77298.f29214;
            if (i2 == i) {
                return c18499.m43093();
            }
            if (i2 <= this.f77306.f35322) {
                m53274(false, true, true, true);
                i = this.f77298.f29214;
            }
            c18499.addAll(c14769M53290);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19969 m53323() {
        C11040 c11040;
        int i = this.f77298.f29214;
        C14769 c14769M53290 = m53290();
        boolean zIsEmpty = c14769M53290.isEmpty();
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (zIsEmpty) {
            C13891 c13891M53308 = m53308(i, C22843.f74062);
            c15714.f51040 = i;
            return (AbstractC19969) abstractC11194.mo28234(c15714.m37567(c13891M53308));
        }
        AbstractC19969 abstractC19969 = (AbstractC19969) c14769M53290.f48335;
        int i2 = C22383.f72468[abstractC19969.mo2285().ordinal()];
        if (i2 == 3) {
            c11040 = C22843.f74080;
        } else {
            c11040 = i2 != 4 ? null : C22843.f74154;
        }
        if (c11040 == null) {
            return abstractC19969;
        }
        this.f77300.m34523(EnumC6984.SYNTAX, abstractC19969, c11040);
        c15714.f51040 = abstractC19969.f26658;
        C14769 c14769Of = C14769.of((Object) c15714.m37506(0L, c14769M53290));
        c15714.f51040 = abstractC19969.f26658;
        return (AbstractC19969) abstractC11194.mo28234(c15714.m37567(c15714.m37569(c14769Of)));
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
    
        if (r6.m35905(1).f29212 != l.EnumC7466.f24712) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r6.m35905(2).f29212 != l.EnumC7466.f24712) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r7 == l.EnumC7466.f24603) goto L76;
     */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C14769 m53290() {
        /*
            Method dump skipped, instruction units count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23875.m53290():l.ܰᩳۘ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m53218(C4395 c4395, AbstractC22295 abstractC22295) {
        C18499 c18499 = new C18499();
        m53265(this.f77298.f29214, c4395, abstractC22295, m53255(false), false, (InterfaceC19399) null, c18499, true);
        m53270(EnumC7466.f24712);
        m53272((AbstractC8036) c18499.last(), this.f77288.m35906().f29213);
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC19969 m53220(int i, EnumC15669 enumC15669, C11040 c11040) {
        C14923 c14923 = this.f77288;
        int iM35900 = c14923.m35900();
        AbstractC8036 abstractC8036Mo7663 = enumC15669.mo7663(this);
        c14923.m35901(iM35900);
        return (AbstractC19969) this.f77306.mo28234(this.f77283.m37567(m53247(i, C14769.of((Object) abstractC8036Mo7663), c11040)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0468 m53234() {
        AbstractC22295 abstractC22295;
        int i = this.f77298.f29214;
        m53270(EnumC7466.f24624);
        m53270(EnumC7466.f24668);
        C4395 c4395M53240 = m53240(8589934592L);
        C18499 c18499 = new C18499();
        while (true) {
            c18499.m43089(m53287(false));
            if (this.f77298.f29212 != EnumC7466.f24630) {
                break;
            }
            m53298();
        }
        C14769 c14769M43093 = c18499.m43093();
        int iM35551 = c14769M43093.m35551();
        C15714 c15714 = this.f77283;
        if (iM35551 > 1) {
            AbstractC22295 abstractC22296 = (AbstractC22295) c14769M43093.f48335;
            abstractC22296.getClass();
            c15714.f51040 = C11239.m28342(abstractC22296);
            C23699 c23699 = new C23699();
            c23699.f76826 = c14769M43093;
            c23699.f26658 = c15714.f51040;
            abstractC22295 = (AbstractC22295) this.f77306.mo28234(c23699);
        } else {
            abstractC22295 = (AbstractC22295) c14769M43093.f48335;
        }
        C12510 c12510M53244 = m53244(c4395M53240, abstractC22295, false, false);
        m53270(EnumC7466.f24654);
        C4197 c4197M53294 = m53294();
        c15714.f51040 = i;
        return c15714.m37503(c12510M53244, c4197M53294);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C14769 m53280() {
        EnumC7466 enumC7466;
        EnumC24528 enumC24528;
        C14769 c14769M53279;
        C14769 c14769M43093;
        EnumC24528 enumC24529;
        C14769 c14769M532710;
        C18499 c18499 = new C18499();
        while (true) {
            C8957 c8957 = this.f77298;
            int i = c8957.f29214;
            int[] iArr = C22383.f72467;
            int i2 = iArr[c8957.f29212.ordinal()];
            if (i2 == 6 || i2 == 12) {
                break;
            }
            if (i2 != 33 && i2 != 34) {
                m53298();
                m53308(i, C22843.m51550(EnumC7466.f24659, EnumC7466.f24656, EnumC7466.f24660));
            } else {
                int i3 = this.f77298.f29214;
                C18499 c184910 = new C18499();
                int i4 = iArr[this.f77298.f29212.ordinal()];
                C14923 c14923 = this.f77288;
                C7312 c7312 = this.f77300;
                AbstractC8036 abstractC8036 = null;
                C15714 c15714 = this.f77283;
                if (i4 == 33) {
                    m53298();
                    C18499 c184911 = new C18499();
                    while (true) {
                        c184911.m43089(m53226());
                        enumC7466 = this.f77298.f29212;
                        if (enumC7466 != EnumC7466.f24672) {
                            break;
                        }
                        m53298();
                        m53268(EnumC3666.f12541);
                    }
                    EnumC7466 enumC7467 = EnumC7466.f24603;
                    if (enumC7466 == enumC7467) {
                        m53268(EnumC3666.f12553);
                        m53270(enumC7467);
                        enumC24528 = C21351.f68005;
                        AbstractC19969 abstractC19969M53323 = m53323();
                        if (!abstractC19969M53323.m21911(EnumC21461.f68533) && !abstractC19969M53323.m21911(EnumC21461.f68492) && !abstractC19969M53323.m21911(EnumC21461.f68502)) {
                            c7312.m34520(abstractC19969M53323, C22843.f74205);
                        }
                        c14769M53279 = C14769.of((Object) abstractC19969M53323);
                        abstractC8036 = (AbstractC8036) c14769M53279.f48335;
                    } else {
                        m53271(EnumC7466.f24678, new C3398(7));
                        enumC24528 = C21351.f68006;
                        c14769M53279 = m53279();
                    }
                    c15714.f51040 = i3;
                    C21351 c21351M37542 = c15714.m37542(enumC24528, c184911.m43093(), c14769M53279, abstractC8036);
                    if (c14769M53279.isEmpty()) {
                        m53272(c21351M37542, c14923.m35906().f29213);
                    }
                    c184910.m43089(c21351M37542);
                    c14769M43093 = c184910.m43093();
                } else if (i4 == 34) {
                    m53298();
                    C8957 c8958 = this.f77298;
                    int i5 = c8958.f29214;
                    EnumC7466 enumC7468 = c8958.f29212;
                    EnumC7466 enumC7469 = EnumC7466.f24603;
                    if (enumC7468 == enumC7469) {
                        m53268(EnumC3666.f12553);
                        m53270(enumC7469);
                        enumC24529 = C21351.f68005;
                        AbstractC19969 abstractC19969M53324 = m53323();
                        if (!abstractC19969M53324.m21911(EnumC21461.f68533) && !abstractC19969M53324.m21911(EnumC21461.f68492) && !abstractC19969M53324.m21911(EnumC21461.f68502)) {
                            c7312.m34520(abstractC19969M53324, C22843.f74205);
                        }
                        c14769M532710 = C14769.of((Object) abstractC19969M53324);
                        abstractC8036 = (AbstractC8036) c14769M532710.f48335;
                    } else {
                        m53271(EnumC7466.f24678, new C7351(8));
                        enumC24529 = C21351.f68006;
                        c14769M532710 = m53279();
                    }
                    c15714.f51040 = i5;
                    AbstractC18367 abstractC18367 = (AbstractC18367) this.f77306.mo28234(c15714.m37516());
                    c15714.f51040 = i3;
                    C21351 c21351M37543 = c15714.m37542(enumC24529, C14769.of((Object) abstractC18367), c14769M532710, abstractC8036);
                    if (c14769M532710.isEmpty()) {
                        m53272(c21351M37543, c14923.m35906().f29213);
                    }
                    c184910.m43089(c21351M37543);
                    c14769M43093 = c184910.m43093();
                } else {
                    throw new AssertionError("should not reach here");
                }
                c18499.m43090(c14769M43093);
            }
        }
        return c18499.m43093();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private AbstractC18367 m53226() {
        C14923 c14923;
        EnumC17907 enumC17907;
        C8957 c8957 = this.f77298;
        int i = c8957.f29214;
        if (c8957.f29212 == EnumC7466.f24656) {
            m53264(i, EnumC3666.f12579);
            m53298();
            C15714 c15714 = this.f77283;
            c15714.f51040 = i;
            return (AbstractC18367) this.f77306.mo28234(c15714.m37516());
        }
        int iM53228 = 0;
        while (true) {
            c14923 = this.f77288;
            if (c14923.m35905(iM53228).f29212 != EnumC7466.f24668) {
                break;
            }
            iM53228++;
        }
        C4395 c4395M53240 = m53240(0L);
        if (c4395M53240.f15825 == 0 && !c4395M53240.f15824.m35550()) {
            int i2 = 0;
            while (true) {
                int i3 = C22383.f72467[c14923.m35905(iM53228).f29212.ordinal()];
                if (i3 != 5) {
                    C6191 c6191 = this.f77302;
                    if (i3 == 9) {
                        if (i2 != 0 && m53275(iM53228, c6191)) {
                            enumC17907 = EnumC17907.PATTERN;
                        }
                    } else if (i3 == 49) {
                        continue;
                    } else if (i3 == 51) {
                        if (i2 != 0) {
                            continue;
                        }
                    } else if (i3 == 73) {
                        EnumC7466 enumC7466 = EnumC7466.f24625;
                        if (m53276(iM53228, enumC7466, c6191)) {
                            enumC17907 = EnumC17907.PATTERN;
                        } else if (m53275(iM53228, enumC7466)) {
                            iM53228++;
                        } else {
                            enumC17907 = EnumC17907.EXPRESSION;
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
                                                enumC17907 = EnumC17907.EXPRESSION;
                                            }
                                        } else if (!m53275(iM53228, c6191)) {
                                            enumC17907 = EnumC17907.EXPRESSION;
                                        } else {
                                            enumC17907 = EnumC17907.PATTERN;
                                        }
                                        break;
                                    default:
                                        enumC17907 = EnumC17907.EXPRESSION;
                                        break;
                                }
                                break;
                        }
                    }
                } else {
                    iM53228 = m53228(iM53228);
                }
                iM53228++;
            }
            if (enumC17907 != EnumC17907.PATTERN) {
                return m53284(33);
            }
        }
        m53264(this.f77298.f29214, EnumC3666.f12579);
        return m53238(i, c4395M53240, (AbstractC22295) null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m53250(EnumC21461 enumC21461) {
        if (this.f77298.f29212 != EnumC7466.f24688) {
            return C14769.m35543();
        }
        C18499 c18499 = new C18499();
        int i = this.f77290;
        while (true) {
            C8957 c8957 = this.f77298;
            if (c8957.f29212 == EnumC7466.f24688) {
                int i2 = c8957.f29214;
                m53298();
                c18499.m43089(m53251(enumC21461, i2));
            } else {
                this.f77281 = this.f77290;
                this.f77290 = i;
                return c18499.m43093();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m53229(AbstractC22295 abstractC22295, C14769 c14769) {
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        C8957 c8957 = this.f77298;
        if (c8957.f29212 == EnumC7466.f24629) {
            int i = c8957.f29214;
            m53298();
            abstractC22295 = m53232(i, abstractC22295, c14769M53250);
        } else if (!c14769M53250.isEmpty()) {
            if (this.f77301) {
                this.f77287 = c14769M53250;
            } else {
                return m53246(((C17621) c14769M53250.f48335).f26658);
            }
        }
        if (c14769.isEmpty()) {
            return abstractC22295;
        }
        int i2 = this.f77298.f29214;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i2;
        return (AbstractC22295) this.f77306.mo28234(c15714.m37532(abstractC22295, c14769));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18565 m53252(int i, AbstractC22295 abstractC22295, C14769 c14769) {
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        int i2 = this.f77298.f29214;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i2;
        C5887 c5887M37565 = c15714.m37565(m53255(false));
        AbstractC11194 abstractC11194 = this.f77306;
        AbstractC22295 abstractC22295M53315 = (AbstractC22295) abstractC11194.mo28234(c5887M37565);
        if (c14769M53250.m35550()) {
            c15714.f51040 = ((C17621) c14769M53250.f48335).f26658;
            abstractC22295M53315 = (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22295M53315, c14769M53250));
        }
        if (this.f77298.f29212 == EnumC7466.f24697) {
            int i3 = this.f77290;
            abstractC22295M53315 = m53315(abstractC22295M53315, true);
            this.f77290 = i3;
        }
        return m53253(i, abstractC22295, c14769, abstractC22295M53315);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53259(int i, AbstractC22295 abstractC22295) {
        C8957 c8957;
        EnumC7466 enumC7466;
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        m53270(EnumC7466.f24629);
        EnumC7466 enumC7467 = this.f77298.f29212;
        EnumC7466 enumC7468 = EnumC7466.f24625;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (enumC7467 == enumC7468) {
            m53270(enumC7468);
            AbstractC22295 abstractC22295M53229 = m53229(abstractC22295, c14769M53250);
            if (this.f77298.f29212 != EnumC7466.f24658) {
                c15714.f51040 = i;
                return m53247(this.f77298.f29214, C14769.of(abstractC11194.mo28234(c15714.m37573(abstractC22295M53229, C14769.m35543(), null))), C22843.f74151);
            }
            C21549 c21549 = (C21549) m53312(i, abstractC22295M53229);
            if (c14769M53250.m35550()) {
                C16875 c16875 = (C16875) abstractC22295M53229;
                c21549.f68828 = c16875.f55197;
                c21549.f68829 = c16875.f55198;
            }
            return c21549;
        }
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        c184910.m43089((Object) c14769M53250);
        c18499.m43089(m53284(1));
        m53270(enumC7468);
        while (true) {
            c8957 = this.f77298;
            enumC7466 = c8957.f29212;
            if (enumC7466 != EnumC7466.f24629 && enumC7466 != EnumC7466.f24688) {
                break;
            }
            C14769 c14769M53251 = m53250(EnumC21461.f68474);
            int i2 = this.f77298.f29214;
            m53298();
            EnumC7466 enumC7469 = this.f77298.f29212;
            EnumC7466 enumC74610 = EnumC7466.f24625;
            if (enumC7469 == enumC74610) {
                abstractC22295 = m53232(i2, abstractC22295, c14769M53251);
            } else {
                c184910.m43089((Object) c14769M53251);
                c18499.m43089(m53284(1));
                m53270(enumC74610);
            }
        }
        int i3 = c8957.f29214;
        C14769 c14769M53318 = enumC7466 == EnumC7466.f24658 ? m53318() : null;
        c15714.f51040 = i;
        C21549 c215410 = (C21549) abstractC11194.mo28234(c15714.m37573(abstractC22295, c18499.m43093(), c14769M53318));
        c215410.f68831 = c184910.m43093();
        return c14769M53318 != null ? m53247(i3, C14769.of((Object) c215410), C22843.f74027) : c215410;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53287(boolean z) {
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        AbstractC22295 abstractC22295M53292 = m53292(z);
        return c14769M53250.m35550() ? m53221(abstractC22295M53292, c14769M53250, false) : abstractC22295M53292;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53306() {
        AbstractC22295 abstractC22295M37569;
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        C8957 c8957 = this.f77298;
        if (c8957.f29212 != EnumC7466.f24670) {
            AbstractC22295 abstractC22295M53292 = m53292(false);
            return c14769M53250.m35550() ? m53221(abstractC22295M53292, c14769M53250, false) : abstractC22295M53292;
        }
        int i = c8957.f29214;
        m53298();
        EnumC7466 enumC7466 = this.f77298.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24643;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (enumC7466 == enumC7467) {
            c15714.f51040 = i;
            C18477 c18477 = (C18477) abstractC11194.mo28235(c15714.m37538(EnumC18670.EXTENDS));
            m53298();
            AbstractC22295 abstractC22295M53287 = m53287(false);
            c15714.f51040 = i;
            abstractC22295M37569 = c15714.m37548(c18477, (AbstractC8036) abstractC22295M53287);
        } else {
            EnumC7466 enumC7468 = EnumC7466.f24696;
            if (enumC7466 == enumC7468) {
                c15714.f51040 = i;
                C18477 c18478 = (C18477) abstractC11194.mo28235(c15714.m37538(EnumC18670.SUPER));
                m53298();
                AbstractC22295 abstractC22295M53288 = m53287(false);
                c15714.f51040 = i;
                abstractC22295M37569 = c15714.m37548(c18478, (AbstractC8036) abstractC22295M53288);
            } else if (this.f77302.test(enumC7466)) {
                c15714.f51040 = -1;
                C18477 c18477M37538 = c15714.m37538(EnumC18670.UNBOUND);
                c15714.f51040 = i;
                AbstractC22295 abstractC22295 = (AbstractC22295) abstractC11194.mo28234(c15714.m37548(c18477M37538, (AbstractC8036) null));
                c15714.f51040 = this.f77298.f29214;
                C5887 c5887 = (C5887) abstractC11194.mo28234(c15714.m37565(m53255(false)));
                c15714.f51040 = i;
                abstractC22295M37569 = c15714.m37569(C14769.of((Object) abstractC22295, (Object) c5887));
                m53269(abstractC22295M37569, C22843.m51550(EnumC7466.f24704, enumC7467, enumC7468));
            } else {
                c15714.f51040 = i;
                C18477 c18479 = (C18477) abstractC11194.mo28234(c15714.m37538(EnumC18670.UNBOUND));
                c15714.f51040 = i;
                abstractC22295M37569 = (AbstractC22295) abstractC11194.mo28234(c15714.m37548(c18479, (AbstractC8036) null));
            }
        }
        if (c14769M53250.isEmpty()) {
            return abstractC22295M37569;
        }
        c15714.f51040 = ((C17621) c14769M53250.f48335).f26658;
        return (AbstractC22295) abstractC11194.mo28234(c15714.m37532(abstractC22295M37569, c14769M53250));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4395 m53240(long j) {
        C4395 c4395M53241 = m53241((C4395) null);
        long j2 = c4395M53241.f15825 & (-131089);
        int i = this.f77298.f29214;
        if (j2 != 0) {
            EnumC6984 enumC6984 = EnumC6984.SYNTAX;
            EnumSet enumSetM8159 = C2417.m8159(j2 & (-j2));
            C11040 c11040 = C22843.f74058;
            this.f77300.m34522(enumC6984, i, new C11040("compiler", "mod.not.allowed.here", enumSetM8159));
        }
        c4395M53241.f15825 = j | c4395M53241.f15825;
        return c4395M53241;
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
    public final l.C4395 m53241(l.C4395 r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23875.m53241(l.ۘ᩶ۘ):l.ۘ᩶ۘ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17621 m53251(EnumC21461 enumC21461, int i) {
        C14769 c14769M35543;
        C17621 c17621M37556;
        if (enumC21461 == EnumC21461.f68474) {
            m53268(EnumC3666.f12558);
        }
        AbstractC22295 abstractC22295M53322 = m53322(false);
        EnumC7466 enumC7466 = this.f77298.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24668;
        if (enumC7466 != enumC7467) {
            c14769M35543 = C14769.m35543();
        } else {
            m53270(enumC7467);
            C18499 c18499 = new C18499();
            if (this.f77298.f29212 != EnumC7466.f24654) {
                c18499.m43089(m53258());
                while (this.f77298.f29212 == EnumC7466.f24672) {
                    m53298();
                    c18499.m43089(m53258());
                }
            }
            m53270(EnumC7466.f24654);
            c14769M35543 = c18499.m43093();
        }
        EnumC21461 enumC21462 = EnumC21461.f68479;
        C15714 c15714 = this.f77283;
        if (enumC21461 == enumC21462) {
            c15714.f51040 = i;
            c17621M37556 = c15714.m37535((AbstractC8036) abstractC22295M53322, c14769M35543);
        } else if (enumC21461 == EnumC21461.f68474) {
            c15714.f51040 = i;
            c17621M37556 = c15714.m37556((AbstractC8036) abstractC22295M53322, c14769M35543);
        } else {
            throw new AssertionError("Unhandled annotation kind: " + enumC21461);
        }
        m53272(c17621M37556, this.f77288.m35906().f29213);
        return c17621M37556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53258() {
        if (this.f77302.test(this.f77298.f29212)) {
            m53305();
            AbstractC22295 abstractC22295M53236 = m53236();
            if (!abstractC22295M53236.m21911(EnumC21461.f68523)) {
                return abstractC22295M53236;
            }
            C8957 c8957 = this.f77298;
            EnumC7466 enumC7466 = c8957.f29212;
            EnumC7466 enumC7467 = EnumC7466.f24686;
            if (enumC7466 != enumC7467) {
                return abstractC22295M53236;
            }
            int i = c8957.f29214;
            m53270(enumC7467);
            AbstractC22295 abstractC22295M53311 = m53311();
            C15714 c15714 = this.f77283;
            c15714.f51040 = i;
            return (AbstractC22295) this.f77306.mo28234(c15714.m37541(abstractC22295M53236, abstractC22295M53311));
        }
        return m53311();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53311() {
        int i = C22383.f72467[this.f77298.f29212.ordinal()];
        if (i == 5) {
            int i2 = this.f77298.f29214;
            m53298();
            return m53251(EnumC21461.f68479, i2);
        }
        if (i == 11) {
            int i3 = this.f77298.f29214;
            m53270(EnumC7466.f24658);
            C18499 c18499 = new C18499();
            EnumC7466 enumC7466 = this.f77298.f29212;
            if (enumC7466 == EnumC7466.f24672) {
                m53298();
            } else if (enumC7466 != EnumC7466.f24660) {
                c18499.m43089(m53311());
                while (this.f77298.f29212 == EnumC7466.f24672) {
                    m53298();
                    if (this.f77298.f29212 == EnumC7466.f24660) {
                        break;
                    }
                    c18499.m43089(m53311());
                }
            }
            m53270(EnumC7466.f24660);
            C15714 c15714 = this.f77283;
            c15714.f51040 = i3;
            return (AbstractC22295) this.f77306.mo28234(c15714.m37573(null, C14769.m35543(), c18499.m43093()));
        }
        m53305();
        return m53236();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53265(int i, C4395 c4395, AbstractC22295 abstractC22295, AbstractC19728 abstractC19728, boolean z, InterfaceC19399 interfaceC19399, C18499 c18499, boolean z2) {
        c18499.m43089(m53243(i, c4395, abstractC22295, abstractC19728, z, interfaceC19399, z2, false));
        while (this.f77298.f29212 == EnumC7466.f24672) {
            m53272((AbstractC8036) c18499.last(), this.f77298.f29213);
            m53298();
            c18499.m43089(m53243(this.f77298.f29214, c4395, abstractC22295, m53255(false), z, interfaceC19399, z2, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m53243(int i, C4395 c4395, AbstractC22295 abstractC22295, AbstractC19728 abstractC19728, boolean z, InterfaceC19399 interfaceC19399, boolean z2, boolean z3) {
        AbstractC22295 abstractC22295M53282;
        int iM28342;
        AbstractC22295 abstractC22296;
        boolean z4;
        AbstractC22295 abstractC22295M53225 = m53225(abstractC22295);
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24686;
        if (enumC7466 == enumC7467) {
            m53298();
            abstractC22295M53282 = m53282();
        } else {
            if (z) {
                m53308(c8957.f29214, C22843.m51548(enumC7467));
            }
            abstractC22295M53282 = null;
        }
        AbstractC8036 abstractC8036M28323 = C11239.m28323((AbstractC8036) abstractC22295M53225, true);
        if (abstractC8036M28323.m21911(EnumC21461.f68523)) {
            AbstractC19728 abstractC19729 = ((C5887) abstractC8036M28323).f20169;
            if (m53257(abstractC19729, i, !z3 && z2) == null) {
                iM28342 = -1;
                abstractC22296 = abstractC22295M53225;
                z4 = false;
            } else {
                if (abstractC19729 != this.f77285.f49837) {
                    int i2 = abstractC8036M28323.f26658;
                    C11040 c11040 = C22843.f74058;
                    m53266(i2, new C11040("compiler", "restricted.type.not.allowed.here", abstractC19729));
                } else if (abstractC22295M53225.m21911(EnumC21461.f68553) && !z3) {
                    int i3 = abstractC8036M28323.f26658;
                    C11040 c11041 = C22843.f74058;
                    m53266(i3, new C11040("compiler", "restricted.type.not.allowed.array", abstractC19729));
                } else {
                    if (z3) {
                        int i4 = abstractC8036M28323.f26658;
                        C11040 c11042 = C22843.f74058;
                        m53266(i4, new C11040("compiler", "restricted.type.not.allowed.compound", abstractC19729));
                    }
                    iM28342 = C11239.m28342(c4395);
                    if (iM28342 == -1) {
                        iM28342 = C11239.m28342(abstractC22295M53225);
                    }
                    abstractC22296 = null;
                    z4 = true;
                }
                iM28342 = -1;
                abstractC22296 = abstractC22295M53225;
                z4 = false;
            }
        } else {
            iM28342 = -1;
            abstractC22296 = abstractC22295M53225;
            z4 = false;
        }
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C12510 c12510 = (C12510) this.f77306.mo28234(c15714.m37521(c4395, abstractC19728, abstractC22296, abstractC22295M53282, z4));
        m53273(c12510, interfaceC19399);
        c12510.f40165 = iM28342;
        return c12510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m53254(AbstractC22295 abstractC22295, boolean z) {
        int i = C22383.f72468[abstractC22295.mo2285().ordinal()];
        if (i != 5) {
            if (i != 6) {
                return null;
            }
            return m53254(((C23589) abstractC22295).f76594, z);
        }
        C5887 c5887 = (C5887) abstractC22295;
        if (m53257(c5887.f20169, abstractC22295.f26658, z) != null) {
            return c5887.f20169;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20820 m53257(AbstractC19728 abstractC19728, int i, boolean z) {
        C15252 c15252 = this.f77285;
        AbstractC19728 abstractC19729 = c15252.f49837;
        C7312 c7312 = this.f77300;
        if (abstractC19728 == abstractC19729) {
            if (EnumC3666.f12565.m11915(this.f77286)) {
                return EnumC20820.JDK10;
            }
            if (z) {
                C25213 c25213 = C13146.f42046;
                c7312.m34518(i, new C25213("compiler", "restricted.type.not.allowed", abstractC19728, EnumC20820.JDK10));
            }
        }
        if (abstractC19728 == c15252.f49785) {
            if (this.f77284) {
                return EnumC20820.JDK14;
            }
            if (z) {
                C25213 c25214 = C13146.f42046;
                c7312.m34518(i, new C25213("compiler", "restricted.type.not.allowed", abstractC19728, EnumC20820.JDK14));
            }
        }
        if (abstractC19728 == c15252.f49774) {
            if (this.f77303) {
                return EnumC20820.JDK14;
            }
            if (z) {
                C25213 c25215 = C13146.f42046;
                c7312.m34518(i, new C25213("compiler", "restricted.type.not.allowed.preview", abstractC19728, EnumC20820.JDK14));
            }
        }
        AbstractC19728 abstractC197210 = c15252.f49829;
        boolean z2 = this.f77299;
        if (abstractC19728 == abstractC197210) {
            if (z2) {
                return EnumC20820.JDK15;
            }
            if (z) {
                C25213 c25216 = C13146.f42046;
                c7312.m34518(i, new C25213("compiler", "restricted.type.not.allowed.preview", abstractC19728, EnumC20820.JDK15));
            }
        }
        if (abstractC19728 != c15252.f49844) {
            return null;
        }
        if (z2) {
            return EnumC20820.JDK15;
        }
        if (!z) {
            return null;
        }
        C25213 c25217 = C13146.f42046;
        c7312.m34518(i, new C25213("compiler", "restricted.type.not.allowed.preview", abstractC19728, EnumC20820.JDK15));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m53244(C4395 c4395, AbstractC22295 abstractC22295, boolean z, boolean z2) {
        AbstractC19728 abstractC19728;
        AbstractC19728 abstractC19728Mo23945;
        C8957 c8957 = this.f77298;
        int i = c8957.f29214;
        EnumC7466 enumC7466 = c8957.f29212;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        boolean z3 = false;
        C15252 c15252 = this.f77285;
        C7312 c7312 = this.f77300;
        if (z && enumC7466 == EnumC7466.f24632) {
            c7312.m34517(i, C22843.f74170);
            abstractC19728Mo23945 = this.f77298.mo23945();
            m53298();
        } else if (this.f77291 || !z || this.f77302.test(enumC7466) || c4395.f15825 != 8589934592L || c4395.f15824.m35550()) {
            AbstractC22295 abstractC22295M53322 = m53322(false);
            if (!abstractC22295M53322.m21911(EnumC21461.f68523) || (abstractC19728 = ((C5887) abstractC22295M53322).f20169) == c15252.f49836) {
                if (this.f77291) {
                    if ((17179869184L & c4395.f15825) != 0) {
                        c7312.m34517(this.f77298.f29214, C22843.f74209);
                    }
                    C8957 c8958 = this.f77298;
                    if (c8958.f29212 == EnumC7466.f24629) {
                        c7312.m34517(c8958.f29214, C22843.f74145);
                    }
                    if (abstractC22295M53322.m21911(EnumC21461.f68485) && ((C23041) abstractC22295M53322).f74774 != c15252.f49836) {
                        c7312.m34517(this.f77298.f29214, C22843.f74050);
                    }
                }
                c15714.f51040 = i;
                return (C12510) abstractC11194.mo28234(c15714.m37522(c4395, abstractC22295M53322, abstractC22295));
            }
            abstractC19728Mo23945 = abstractC19728;
        } else {
            abstractC19728Mo23945 = c15252.f49799;
        }
        if ((17179869184L & c4395.f15825) != 0) {
            C8957 c8959 = this.f77298;
            if (c8959.f29212 == EnumC7466.f24629) {
                c7312.m34517(c8959.f29214, C22843.f74109);
            }
        }
        if (z2) {
            C8957 c89510 = this.f77298;
            if (c89510.f29212 == EnumC7466.f24629) {
                c7312.m34517(c89510.f29214, C22843.f74188);
            }
        }
        AbstractC22295 abstractC22295M53225 = m53225(abstractC22295);
        c15714.f51040 = i;
        if (abstractC22295M53225 != null && abstractC22295M53225.m21911(EnumC21461.f68523) && ((C5887) abstractC22295M53225).f20169 == c15252.f49837) {
            z3 = true;
        }
        return (C12510) abstractC11194.mo28234(c15714.m37521(c4395, abstractC19728Mo23945, abstractC22295M53225, null, z3));
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC8036 m53235() {
        C8957 c8957 = this.f77298;
        int i = c8957.f29214;
        EnumC7466 enumC7466 = c8957.f29212;
        if (enumC7466 == EnumC7466.f24639 || enumC7466 == EnumC7466.f24688) {
            return m53243(this.f77298.f29214, m53240(16L), m53287(true), m53255(false), true, (InterfaceC19399) null, true, false);
        }
        AbstractC22295 abstractC22295M53284 = m53284(3);
        if ((this.f77281 & 2) != 0) {
            if (this.f77302.test(this.f77298.f29212)) {
                C15714 c15714 = this.f77283;
                c15714.f51040 = i;
                return m53243(this.f77298.f29214, (C4395) this.f77306.mo28234(c15714.m37507(16L)), abstractC22295M53284, m53255(false), true, (InterfaceC19399) null, true, false);
            }
        }
        m53268(EnumC3666.f12563);
        if (!abstractC22295M53284.m21911(EnumC21461.f68523) && !abstractC22295M53284.m21911(EnumC21461.f68485)) {
            this.f77300.m34520(abstractC22295M53284, C22843.f74035);
        }
        return abstractC22295M53284;
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
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19113 m53297() {
        boolean z;
        boolean z2;
        C14923 c14923;
        C8957 c8957;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        InterfaceC19399 interfaceC19399M23944;
        C7312 c7312;
        String str3;
        C8957 c8958;
        String str4;
        AbstractC8036 abstractC8036M53256;
        C8957 c8959;
        EnumC7466 enumC7466;
        EnumC7466 enumC7467;
        EnumC24287 enumC24287;
        EnumC24287 enumC24288;
        C8957 c89510;
        C7312 c7313;
        String str5;
        AbstractC22295 abstractC22295;
        C4395 c4395;
        InterfaceC19399 interfaceC19399;
        C14769 c14769M53303;
        AbstractC8036 abstractC8036;
        EnumC7466 enumC7468;
        boolean z5;
        String str6;
        String str7;
        AbstractC22295 abstractC22296;
        C4395 c4396;
        C8957 c89511 = this.f77298;
        C18499 c18499 = new C18499();
        C4395 c4395M53241 = this.f77298.f29212 == EnumC7466.f24688 ? m53241((C4395) null) : null;
        C8957 c89512 = this.f77298;
        EnumC7466 enumC7469 = c89512.f29212;
        EnumC7466 enumC74610 = EnumC7466.f24613;
        String str8 = "mod.not.allowed.here";
        String str9 = "compiler";
        C7312 c7314 = this.f77300;
        C15714 c15714 = this.f77283;
        AbstractC11194 abstractC11194 = this.f77306;
        if (enumC7469 == enumC74610) {
            int i = c89512.f29214;
            C14769 c14769M35543 = C14769.m35543();
            if (c4395M53241 != null) {
                long j = c4395M53241.f15825 & (-131073);
                int i2 = this.f77298.f29214;
                if (j != 0) {
                    EnumC6984 enumC6984 = EnumC6984.SYNTAX;
                    EnumSet enumSetM8159 = C2417.m8159(j & (-j));
                    C11040 c11040 = C22843.f74058;
                    c7314.m34522(enumC6984, i2, new C11040("compiler", "mod.not.allowed.here", enumSetM8159));
                }
                c14769M35543 = c4395M53241.f15824;
                c4396 = null;
            } else {
                c4396 = c4395M53241;
            }
            m53298();
            AbstractC22295 abstractC22295M53322 = m53322(false);
            m53270(EnumC7466.f24712);
            c15714.f51040 = i;
            C11972.m30021(c14769M35543);
            C11972.m30021(abstractC22295M53322);
            C10360 c10360 = new C10360();
            c10360.f32979 = c14769M35543;
            c10360.f32980 = abstractC22295M53322;
            c10360.f26658 = c15714.f51040;
            AbstractC8036 abstractC8037 = (C10360) abstractC11194.mo28234(c10360);
            EnumC8212 enumC8212 = EnumC8212.LINE;
            m53273(abstractC8037, c89511.m23944());
            c18499.m43089(abstractC8037);
            c4395M53241 = c4396;
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
            C8957 c89513 = this.f77298;
            EnumC7466 enumC74611 = c89513.f29212;
            boolean z9 = z;
            EnumC7466 enumC74612 = EnumC7466.f24635;
            C7312 c7315 = c7314;
            c14923 = this.f77288;
            if (enumC74611 != enumC74612) {
                if (c89513.f29214 <= abstractC11194.f35322) {
                    m53274(z6, false, false, false);
                    if (this.f77298.f29212 == enumC74612) {
                    }
                }
                C15252 c15252 = this.f77285;
                if (z6 && c4395M53241 == null) {
                    C8957 c89514 = this.f77298;
                    z4 = z6;
                    if (c89514.f29212 == EnumC7466.f24680) {
                        int i3 = c89514.f29214;
                        m53298();
                        if (this.f77298.f29212 == EnumC7466.f24693) {
                            m53298();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c15714.f51040 = this.f77298.f29214;
                        AbstractC22295 abstractC22297 = (AbstractC22295) abstractC11194.mo28234(c15714.m37565(m53255(false)));
                        while (true) {
                            int i4 = this.f77298.f29214;
                            EnumC7466 enumC74613 = EnumC7466.f24708;
                            m53270(enumC74613);
                            str6 = str8;
                            str7 = str9;
                            if (this.f77298.f29212 == EnumC7466.f24706) {
                                c15714.f51040 = i4;
                                abstractC22296 = (AbstractC22295) abstractC11194.mo28235(c15714.m37544(abstractC22297, c15252.f49751));
                                m53298();
                                break;
                            }
                            c15714.f51040 = i4;
                            abstractC22297 = (AbstractC22295) abstractC11194.mo28234(c15714.m37544(abstractC22297, m53255(false)));
                            if (this.f77298.f29212 != enumC74613) {
                                abstractC22296 = abstractC22297;
                                break;
                            }
                            str8 = str6;
                            str9 = str7;
                        }
                        m53270(EnumC7466.f24712);
                        c15714.f51040 = i3;
                        C11852 c11852 = new C11852();
                        c11852.f38181 = abstractC22296;
                        c11852.f38180 = z5;
                        c11852.f26658 = c15714.f51040;
                        c18499.m43089(abstractC11194.mo28234(c11852));
                        z7 = true;
                        z = z9;
                        c7314 = c7315;
                        z6 = z4;
                        str8 = str6;
                        str9 = str7;
                    } else {
                        str = str8;
                        str2 = str9;
                        C8957 c89515 = this.f77298;
                        EnumC8212 enumC8213 = EnumC8212.LINE;
                        interfaceC19399M23944 = c89515.m23944();
                        if (z8) {
                            interfaceC19399M23944 = c89511.m23944();
                            z9 = true;
                        }
                        if (c4395M53241 == null) {
                            c4395M53241 = m53241(c4395M53241);
                        } else {
                            c4395M53241 = m53241(c4395M53241);
                        }
                        if (z8) {
                            c8959 = this.f77298;
                            enumC7466 = c8959.f29212;
                            enumC7467 = EnumC7466.f24655;
                            if (enumC7466 == enumC7467) {
                                enumC24287 = EnumC24287.STRONG;
                                if (c8959.mo23945() == c15252.f49770) {
                                    enumC24288 = EnumC24287.OPEN;
                                    m53298();
                                } else {
                                    enumC24288 = enumC24287;
                                }
                                c89510 = this.f77298;
                                if (c89510.f29212 != enumC7467) {
                                }
                                c7312 = c7315;
                                str3 = str2;
                                c8958 = c89511;
                                str4 = str;
                                if (enumC24288 != enumC24287) {
                                    m53266(this.f77298.f29214, C22843.f74140);
                                }
                            } else {
                                c7312 = c7315;
                                str3 = str2;
                                c8958 = c89511;
                                str4 = str;
                            }
                        } else {
                            c7312 = c7315;
                            str3 = str2;
                            c8958 = c89511;
                            str4 = str;
                        }
                        C8957 c89516 = this.f77298;
                        int i5 = c89516.f29214;
                        if (c4395M53241 == null) {
                            abstractC8036M53256 = m53256(m53241(c4395M53241), interfaceC19399M23944);
                        } else {
                            abstractC8036M53256 = m53256(m53241(c4395M53241), interfaceC19399M23944);
                        }
                        if (abstractC8036M53256 instanceof C11106) {
                            abstractC8036M53256 = ((C11106) abstractC8036M53256).f35018;
                        }
                        c18499.m43089(abstractC8036M53256);
                        if (abstractC8036M53256 instanceof C7926) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        c4395M53241 = null;
                        str8 = str4;
                        str9 = str3;
                        c7314 = c7312;
                        z = z9;
                        c89511 = c8958;
                        z8 = false;
                    }
                } else {
                    z4 = z6;
                    str = str8;
                    str2 = str9;
                    C8957 c89517 = this.f77298;
                    EnumC8212 enumC8214 = EnumC8212.LINE;
                    interfaceC19399M23944 = c89517.m23944();
                    if (z8 && !z7 && !z2) {
                        interfaceC19399M23944 = c89511.m23944();
                        z9 = true;
                    }
                    if (c4395M53241 == null || this.f77298.f29212 != EnumC7466.f24712) {
                        c4395M53241 = m53241(c4395M53241);
                    }
                    if (z8) {
                        c8959 = this.f77298;
                        enumC7466 = c8959.f29212;
                        enumC7467 = EnumC7466.f24655;
                        if (enumC7466 == enumC7467) {
                            enumC24287 = EnumC24287.STRONG;
                            if (c8959.mo23945() == c15252.f49770) {
                                enumC24288 = EnumC24287.OPEN;
                                m53298();
                            } else {
                                enumC24288 = enumC24287;
                            }
                            c89510 = this.f77298;
                            if (c89510.f29212 != enumC7467 && c89510.mo23945() == c15252.f49792) {
                                if (c4395M53241 != null) {
                                    long j2 = c4395M53241.f15825 & (-131073);
                                    int i6 = this.f77298.f29214;
                                    if (j2 != 0) {
                                        EnumC6984 enumC6985 = EnumC6984.SYNTAX;
                                        EnumSet enumSetM81510 = C2417.m8159((-j2) & j2);
                                        C11040 c11041 = C22843.f74058;
                                        str5 = str2;
                                        c7313 = c7315;
                                        c7313.m34522(enumC6985, i6, new C11040(str5, str, enumSetM81510));
                                    } else {
                                        c7313 = c7315;
                                        str5 = str2;
                                    }
                                } else {
                                    c7313 = c7315;
                                    str5 = str2;
                                }
                                int i7 = this.f77298.f29214;
                                m53268(EnumC3666.f12544);
                                m53298();
                                AbstractC22295 abstractC22295M53323 = m53322(false);
                                m53270(EnumC7466.f24658);
                                C18499 c184910 = new C18499();
                                while (true) {
                                    C8957 c89518 = this.f77298;
                                    EnumC7466 enumC74614 = c89518.f29212;
                                    c8957 = c89511;
                                    EnumC7466 enumC74615 = EnumC7466.f24655;
                                    if (enumC74614 != enumC74615) {
                                        abstractC22295 = abstractC22295M53323;
                                        c4395 = c4395M53241;
                                        interfaceC19399 = interfaceC19399M23944;
                                        break;
                                    }
                                    int i8 = c89518.f29214;
                                    AbstractC19728 abstractC19728Mo23945 = c89518.mo23945();
                                    interfaceC19399 = interfaceC19399M23944;
                                    AbstractC19728 abstractC19728 = c15252.f49872;
                                    abstractC22295 = abstractC22295M53323;
                                    AbstractC19728 abstractC19729 = c15252.f49748;
                                    c4395 = c4395M53241;
                                    AbstractC19728 abstractC197210 = c15252.f49775;
                                    if (abstractC19728Mo23945 != abstractC19728) {
                                        if (this.f77298.mo23945() != abstractC197210 && this.f77298.mo23945() != c15252.f49856) {
                                            if (this.f77298.mo23945() != c15252.f49810) {
                                                if (this.f77298.mo23945() != c15252.f49868) {
                                                    m53316(i8);
                                                    m53266(i8, C22843.f74204);
                                                    break;
                                                }
                                                m53298();
                                                AbstractC22295 abstractC22295M53324 = m53322(false);
                                                m53270(EnumC7466.f24712);
                                                c15714.f51040 = i8;
                                                C20715 c20715 = new C20715();
                                                c20715.f66388 = abstractC22295M53324;
                                                c20715.f26658 = c15714.f51040;
                                                c184910.m43089((AbstractC2705) abstractC11194.mo28234(c20715));
                                            } else {
                                                m53298();
                                                AbstractC22295 abstractC22295M53325 = m53322(false);
                                                C8957 c89519 = this.f77298;
                                                if (c89519.f29212 == enumC74615 && c89519.mo23945() == abstractC19729) {
                                                    m53298();
                                                    C14769 c14769M53304 = m53303(false);
                                                    m53270(EnumC7466.f24712);
                                                    c15714.f51040 = i8;
                                                    C5053 c5053 = new C5053();
                                                    c5053.f17632 = abstractC22295M53325;
                                                    c5053.f17631 = c14769M53304;
                                                    c5053.f26658 = c15714.f51040;
                                                    c184910.m43089((AbstractC2705) abstractC11194.mo28234(c5053));
                                                } else {
                                                    C11040 c11042 = C22843.f74058;
                                                    c7313.m34522(EnumC6984.SYNTAX, this.f77298.f29214, new C11040(str5, "expected.str", "'" + ((Object) abstractC19729) + "'"));
                                                    m53274(false, false, false, false);
                                                }
                                            }
                                        } else {
                                            boolean z10 = this.f77298.mo23945() == abstractC197210;
                                            m53298();
                                            AbstractC22295 abstractC22295M53326 = m53322(false);
                                            C8957 c89520 = this.f77298;
                                            if (c89520.f29212 == enumC74615 && c89520.mo23945() == c15252.f49762) {
                                                m53298();
                                                c14769M53303 = m53303(false);
                                            } else {
                                                c14769M53303 = null;
                                            }
                                            m53270(EnumC7466.f24712);
                                            if (z10) {
                                                c15714.f51040 = i8;
                                                C5141 c5141 = new C5141();
                                                c5141.f17908 = abstractC22295M53326;
                                                c5141.f17909 = c14769M53303;
                                                c5141.f26658 = c15714.f51040;
                                                abstractC8036 = c5141;
                                            } else {
                                                c15714.f51040 = i8;
                                                C0666 c0666 = new C0666();
                                                c0666.f2536 = abstractC22295M53326;
                                                c0666.f2537 = c14769M53303;
                                                c0666.f26658 = c15714.f51040;
                                                abstractC8036 = c0666;
                                            }
                                            c184910.m43089((AbstractC2705) abstractC11194.mo28234(abstractC8036));
                                        }
                                    } else {
                                        m53298();
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        while (true) {
                                            int i9 = C22383.f72467[this.f77298.f29212.ordinal()];
                                            if (i9 == 15) {
                                                if (z11) {
                                                    c7313.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74122);
                                                }
                                                z11 = true;
                                            } else {
                                                if (i9 != 32 || this.f77298.mo23945() != c15252.f49806 || z12 || (enumC7468 = c14923.m35905(1).f29212) == EnumC7466.f24712 || enumC7468 == EnumC7466.f24708) {
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                            m53298();
                                        }
                                        AbstractC22295 abstractC22295M53327 = m53322(false);
                                        m53270(EnumC7466.f24712);
                                        c15714.f51040 = i8;
                                        C22207 c22207 = new C22207();
                                        c22207.f71542 = z12;
                                        c22207.f71543 = z11;
                                        c22207.f71540 = abstractC22295M53327;
                                        c22207.f26658 = c15714.f51040;
                                        c184910.m43089((AbstractC2705) abstractC11194.mo28234(c22207));
                                    }
                                    abstractC22295M53323 = abstractC22295;
                                    c89511 = c8957;
                                    interfaceC19399M23944 = interfaceC19399;
                                    c4395M53241 = c4395;
                                }
                                z3 = true;
                                C14769 c14769M43093 = c184910.m43093();
                                m53270(EnumC7466.f24660);
                                m53270(EnumC7466.f24635);
                                c15714.f51040 = i7;
                                AbstractC8036 abstractC8038 = (C14835) abstractC11194.mo28234(c15714.m37529(c4395, enumC24288, abstractC22295, c14769M43093));
                                m53273(abstractC8038, interfaceC19399);
                                c18499 = c18499;
                                c18499.m43089(abstractC8038);
                                break;
                            }
                            c7312 = c7315;
                            str3 = str2;
                            c8958 = c89511;
                            str4 = str;
                            if (enumC24288 != enumC24287) {
                                m53266(this.f77298.f29214, C22843.f74140);
                            }
                        } else {
                            c7312 = c7315;
                            str3 = str2;
                            c8958 = c89511;
                            str4 = str;
                        }
                    } else {
                        c7312 = c7315;
                        str3 = str2;
                        c8958 = c89511;
                        str4 = str;
                    }
                    C8957 c895110 = this.f77298;
                    int i10 = c895110.f29214;
                    if (c4395M53241 == null || c895110.f29212 != EnumC7466.f24712) {
                        abstractC8036M53256 = m53256(m53241(c4395M53241), interfaceC19399M23944);
                    } else {
                        m53298();
                        c15714.f51040 = i10;
                        abstractC8036M53256 = abstractC11194.mo28234(c15714.m37558());
                    }
                    if (abstractC8036M53256 instanceof C11106) {
                        abstractC8036M53256 = ((C11106) abstractC8036M53256).f35018;
                    }
                    c18499.m43089(abstractC8036M53256);
                    if (abstractC8036M53256 instanceof C7926) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    c4395M53241 = null;
                    str8 = str4;
                    str9 = str3;
                    c7314 = c7312;
                    z = z9;
                    c89511 = c8958;
                    z8 = false;
                }
            }
            c8957 = c89511;
            z3 = z9;
            break;
        }
        C8957 c89521 = c8957;
        c15714.f51040 = c89521.f29214;
        C19113 c19113M37578 = c15714.m37578(c18499.m43093());
        if (!z3) {
            EnumC8212 enumC8215 = EnumC8212.LINE;
            m53273(c19113M37578, c89521.m23944());
        }
        if (c18499.isEmpty()) {
            m53272(c19113M37578, c14923.m35906().f29213);
        }
        if (this.f77294) {
            c19113M37578.f61862 = this.f77289;
        }
        if (this.f77304) {
            c19113M37578.f61853 = c14923.m35904();
        }
        abstractC11194.f35323 = null;
        c19113M37578.f61860 = abstractC11194;
        return c19113M37578;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19969 m53256(C4395 c4395, InterfaceC19399 interfaceC19399) {
        C14769 c14769Of;
        C13891 c13891M53247;
        boolean z;
        boolean z2;
        boolean z3;
        C14769 c14769;
        EnumC7466 enumC7466;
        boolean z4;
        int i;
        EnumC5975 enumC5975;
        C18499 c18499;
        C14923 c14923;
        boolean z5;
        C15252 c15252;
        C7926 c7926;
        AbstractC22295 abstractC22295M53287;
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7467 = c8957.f29212;
        EnumC7466 enumC7468 = EnumC7466.f24711;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (enumC7467 == enumC7468) {
            int i2 = c8957.f29214;
            m53270(enumC7468);
            AbstractC19728 abstractC19728M53233 = m53233();
            C14769 c14769M53301 = m53301();
            if (this.f77298.f29212 == EnumC7466.f24643) {
                m53298();
                abstractC22295M53287 = m53287(false);
            } else {
                abstractC22295M53287 = null;
            }
            C14769 c14769M35543 = C14769.m35543();
            if (this.f77298.f29212 == EnumC7466.f24677) {
                m53298();
                c14769M35543 = m53300();
            }
            C14769 c14769M53248 = m53248(c4395, Name.LABEL);
            C14769 c14769M53249 = m53249(abstractC19728M53233, false, false);
            c15714.f51040 = i2;
            C7926 c7927 = (C7926) abstractC11194.mo28234(c15714.m37515(c4395, abstractC19728M53233, c14769M53301, abstractC22295M53287, c14769M35543, c14769M53248, c14769M53249));
            m53273(c7927, interfaceC19399);
            return c7927;
        }
        if (m53325()) {
            return m53307(c4395, interfaceC19399);
        }
        C8957 c8958 = this.f77298;
        EnumC7466 enumC7469 = c8958.f29212;
        int i3 = c8958.f29214;
        EnumC7466 enumC74610 = EnumC7466.f24616;
        if (enumC7469 == enumC74610) {
            m53270(enumC74610);
            AbstractC19728 abstractC19728M53234 = m53233();
            C14769 c14769M53302 = m53301();
            C14769 c14769M35544 = C14769.m35543();
            if (this.f77298.f29212 == EnumC7466.f24643) {
                m53298();
                c14769M35544 = m53300();
            }
            C14769 c14769M532410 = m53248(c4395, "interface");
            C14769 c14769M532411 = m53249(abstractC19728M53234, true, false);
            c15714.f51040 = i3;
            C7926 c7928 = (C7926) abstractC11194.mo28234(c15714.m37515(c4395, abstractC19728M53234, c14769M53302, null, c14769M35544, c14769M532410, c14769M532411));
            m53273(c7928, interfaceC19399);
            return c7928;
        }
        EnumC7466 enumC74611 = EnumC7466.f24600;
        C15252 c15253 = this.f77285;
        boolean z6 = this.f77303;
        if (enumC7469 != enumC74611) {
            if (enumC7469 == EnumC7466.f24655 && c8958.mo23945() == c15253.f49774) {
                m53268(EnumC3666.f12546);
                return (AbstractC19969) abstractC11194.mo28234(c15714.m37567(m53247(this.f77298.f29214, C14769.of((Object) c4395), C22843.f74105)));
            }
            if (this.f77302.test(this.f77298.f29212)) {
                c15714.f51040 = i3;
                c14769Of = C14769.of((Object) c4395, (Object) abstractC11194.mo28234(c15714.m37565(m53255(false))));
                m53316(this.f77298.f29214);
            } else {
                c14769Of = C14769.of((Object) c4395);
            }
            if (this.f77292) {
                c13891M53247 = m53247(i3, c14769Of, C22843.f74196);
            } else if (z6) {
                C11040 c11040 = C22843.f74058;
                c13891M53247 = m53247(i3, c14769Of, new C11040("compiler", "expected4", enumC7468, enumC74610, enumC74611, "record"));
            } else {
                c13891M53247 = m53247(i3, c14769Of, C22843.m51550(enumC7468, enumC74610, enumC74611));
            }
            return (AbstractC19969) abstractC11194.mo28234(c15714.m37567(c13891M53247));
        }
        m53270(enumC74611);
        AbstractC19728 abstractC19728M53235 = m53233();
        C14769 c14769M35545 = C14769.m35543();
        if (this.f77298.f29212 == EnumC7466.f24677) {
            m53298();
            c14769M35545 = m53300();
        }
        C14769 c147610 = c14769M35545;
        m53270(EnumC7466.f24658);
        C18499 c184910 = new C18499();
        EnumC7466 enumC74612 = this.f77298.f29212;
        EnumC7466 enumC74613 = EnumC7466.f24672;
        C14923 c14924 = this.f77288;
        if (enumC74612 == enumC74613) {
            m53298();
            EnumC7466 enumC74614 = this.f77298.f29212;
            EnumC7466 enumC74615 = EnumC7466.f24712;
            if (enumC74614 == enumC74615) {
                m53298();
                z = true;
                z3 = false;
                z2 = false;
            } else {
                EnumC7466 enumC74616 = EnumC7466.f24660;
                if (enumC74614 != enumC74616) {
                    m53266(c14924.m35906().f29213, C22843.m51549(enumC74616, enumC74615));
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
            EnumC7466 enumC74617 = this.f77298.f29212;
            boolean z7 = z;
            EnumC7466 enumC74618 = EnumC7466.f24660;
            if (enumC74617 == enumC74618 || enumC74617 == (enumC7466 = EnumC7466.f24635)) {
                break;
            }
            c14769 = c147610;
            EnumC7466 enumC74619 = EnumC7466.f24712;
            if (enumC74617 == enumC74619) {
                m53270(enumC74619);
                EnumC7466 enumC74620 = this.f77298.f29212;
                if (enumC74620 != enumC74618 && enumC74620 != enumC7466) {
                    z4 = true;
                }
            } else {
                z4 = z7;
            }
            C8957 c8959 = this.f77298;
            int i4 = i3;
            EnumC7466 enumC74621 = c8959.f29212;
            if ((enumC74621 == EnumC7466.f24655 || enumC74621 == EnumC7466.f24632) && c8959.mo23945() != abstractC19728M53235 && (!(z6 && m53325()) && ((i = C22383.f72467[c14924.m35905(1).f29212.ordinal()]) == 1 || i == 11 || i == 74 || i == 88))) {
                enumC5975 = EnumC5975.ENUMERATOR;
            } else {
                int i5 = C22383.f72467[this.f77298.f29212.ordinal()];
                if (i5 == 5 || i5 == 21 || i5 == 31) {
                    enumC5975 = EnumC5975.UNKNOWN;
                } else if (i5 != 32) {
                    enumC5975 = EnumC5975.MEMBER;
                } else if (z6 && m53325()) {
                    enumC5975 = EnumC5975.MEMBER;
                } else {
                    enumC5975 = EnumC5975.UNKNOWN;
                }
            }
            if (enumC5975 == EnumC5975.UNKNOWN) {
                enumC5975 = z4 ? EnumC5975.MEMBER : EnumC5975.ENUMERATOR;
            }
            if (enumC5975 == EnumC5975.ENUMERATOR) {
                if (z4 && !z3) {
                    m53266(this.f77298.f29214, C22843.f74065);
                    z3 = true;
                }
                C8957 c89510 = this.f77298;
                EnumC8212 enumC8212 = EnumC8212.LINE;
                InterfaceC19399 interfaceC19399M23944 = c89510.m23944();
                int i6 = this.f77298.m23942() ? 147481 : 16409;
                int i7 = this.f77298.f29214;
                C14769 c14769M53250 = m53250(EnumC21461.f68479);
                c15714.f51040 = c14769M53250.isEmpty() ? -1 : i7;
                C14923 c14925 = c14924;
                C4395 c4395M37564 = c15714.m37564(i6, c14769M53250);
                C14769 c14769M53319 = m53319(2);
                int i8 = this.f77298.f29214;
                AbstractC19728 abstractC19728M53255 = m53255(false);
                C8957 c89511 = this.f77298;
                int i9 = c89511.f29214;
                C14769 c14769M53283 = c89511.f29212 == EnumC7466.f24668 ? m53283() : C14769.m35543();
                z5 = z6;
                if (this.f77298.f29212 == EnumC7466.f24658) {
                    c15714.f51040 = -1;
                    C4395 c4395M37507 = c15714.m37507(16384L);
                    C14769 c14769M532412 = m53249(c15253.f49799, false, false);
                    c15714.f51040 = i8;
                    c7926 = (C7926) abstractC11194.mo28234(c15714.m37513(c4395M37507, c14769M532412));
                } else {
                    c7926 = null;
                }
                int i10 = (c14769M53283.isEmpty() && c7926 == null) ? i8 : i9;
                c15714.f51040 = i8;
                C5887 c5887M37565 = c15714.m37565(abstractC19728M53235);
                c15714.f51040 = i10;
                C18499 c184911 = c184910;
                c14923 = c14925;
                c15252 = c15253;
                C18565 c18565M37539 = c15714.m37539((AbstractC22295) null, c14769M53319, (AbstractC22295) c5887M37565, c14769M53283, c7926, false);
                if (i10 != i8) {
                    m53272(c18565M37539, c14923.m35906().f29213);
                }
                c15714.f51040 = i8;
                C5887 c5887M37566 = c15714.m37565(abstractC19728M53235);
                c15714.f51040 = i7;
                AbstractC8036 abstractC8036Mo28234 = abstractC11194.mo28234(c15714.m37520(c4395M37564, abstractC19728M53255, c5887M37566, c18565M37539));
                m53273(abstractC8036Mo28234, interfaceC19399M23944);
                c18499 = c184911;
                c18499.m43089(abstractC8036Mo28234);
                C8957 c89512 = this.f77298;
                int i11 = c89512.f29214;
                if (i11 <= abstractC11194.f35322) {
                    m53274(false, true, true, false);
                } else {
                    EnumC7466 enumC74622 = c89512.f29212;
                    if (enumC74622 != enumC74618 && enumC74622 != enumC74619 && enumC74622 != enumC7466) {
                        EnumC7466 enumC74623 = EnumC7466.f24672;
                        if (enumC74622 == enumC74623) {
                            m53298();
                        } else {
                            m53316(i11);
                            m53266(c14923.m35906().f29213, C22843.m51550(enumC74623, enumC74618, enumC74619));
                            z3 = z3;
                            z2 = true;
                        }
                        c184910 = c18499;
                        c147610 = c14769;
                        z = z4;
                        i3 = i4;
                        c14924 = c14923;
                        z6 = z5;
                        c15253 = c15252;
                    }
                }
                z3 = z3;
            } else {
                c18499 = c184910;
                c14923 = c14924;
                z5 = z6;
                c15252 = c15253;
                if (!z4 && !z3 && !z2) {
                    m53266(this.f77298.f29214, C22843.f74118);
                    z3 = true;
                }
                c18499.m43090(m53309(abstractC19728M53235, false, false));
                if (this.f77298.f29214 <= abstractC11194.f35322) {
                    m53274(false, true, true, false);
                }
            }
            z2 = false;
            c184910 = c18499;
            c147610 = c14769;
            z = z4;
            i3 = i4;
            c14924 = c14923;
            z6 = z5;
            c15253 = c15252;
            m53270(enumC74618);
            C14769 c14769M43093 = c184910.m43093();
            c4395.f15825 |= 16384;
            c15714.f51040 = i3;
            C7926 c7929 = (C7926) abstractC11194.mo28234(c15714.m37514(c4395, abstractC19728M53235, C14769.m35543(), (AbstractC22295) null, c14769, c14769M43093));
            m53273(c7929, interfaceC19399);
            return c7929;
        }
        c14769 = c147610;
        m53270(enumC74618);
        C14769 c14769M43094 = c184910.m43093();
        c4395.f15825 |= 16384;
        c15714.f51040 = i3;
        C7926 c79210 = (C7926) abstractC11194.mo28234(c15714.m37514(c4395, abstractC19728M53235, C14769.m35543(), (AbstractC22295) null, c14769, c14769M43094));
        m53273(c79210, interfaceC19399);
        return c79210;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7926 m53307(C4395 c4395, InterfaceC19399 interfaceC19399) {
        C15714 c15714;
        C14769 c14769;
        C14769 c147610;
        int i = this.f77298.f29214;
        m53298();
        c4395.f15825 |= 2305843009213693952L;
        AbstractC19728 abstractC19728M53233 = m53233();
        C14769 c14769M53301 = m53301();
        C14769<C12510> c14769M53310 = m53310(false, true);
        C14769 c14769M35543 = C14769.m35543();
        if (this.f77298.f29212 == EnumC7466.f24677) {
            m53298();
            c14769M35543 = m53300();
        }
        C14769 c14769M53249 = m53249(abstractC19728M53233, false, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = c14769M53310.iterator();
        while (it.hasNext()) {
            arrayList.add((C12510) it.next());
        }
        Iterator it2 = c14769M53249.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c15714 = this.f77283;
            if (!zHasNext) {
                break;
            }
            AbstractC8036 abstractC8036 = (AbstractC8036) it2.next();
            if (abstractC8036.m21911(EnumC21461.f68505)) {
                C6633 c6633 = (C6633) abstractC8036;
                if (c6633.f22150 == this.f77285.f49865 && c6633.f22145.isEmpty() && (c6633.f22144.f15825 & 2251799813685248L) != 0) {
                    C18499 c18499 = new C18499();
                    for (C12510 c12510 : c14769M53310) {
                        c15714.m37552((InterfaceC5075) c12510);
                        C4395 c4396 = c12510.f40170;
                        c18499.m43089(c15714.m37520(c15714.m37564((c4396.f15825 & 17179869184L) | 8606711808L, c4396.f15824), c12510.f40164, c12510.f40166, (AbstractC22295) null));
                        c14769M53310 = c14769M53310;
                        c14769M35543 = c14769M35543;
                    }
                    c14769 = c14769M53310;
                    c147610 = c14769M35543;
                    c6633.f22145 = c18499.m43093();
                } else {
                    c14769 = c14769M53310;
                    c147610 = c14769M35543;
                }
            } else {
                c14769 = c14769M53310;
                c147610 = c14769M35543;
            }
            c14769M53310 = c14769;
            c14769M35543 = c147610;
        }
        C14769 c147611 = c14769M35543;
        C14769 c14769M35552 = c14769M53249;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c14769M35552 = c14769M35552.m35552((C12510) arrayList.get(size));
        }
        c15714.f51040 = i;
        C7926 c7926 = (C7926) this.f77306.mo28234(c15714.m37514(c4395, abstractC19728M53233, c14769M53301, (AbstractC22295) null, c147611, c14769M35552));
        m53273(c7926, interfaceC19399);
        return c7926;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m53233() {
        int i = this.f77298.f29214;
        AbstractC19728 abstractC19728M53255 = m53255(false);
        EnumC20820 enumC20820M53257 = m53257(abstractC19728M53255, i, true);
        if (enumC20820M53257 != null) {
            C11040 c11040 = C22843.f74058;
            m53266(i, new C11040("compiler", "restricted.type.not.allowed", abstractC19728M53255, enumC20820M53257));
        }
        return abstractC19728M53255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m53248(C4395 c4395, String str) {
        if (this.f77299) {
            C8957 c8957 = this.f77298;
            if (c8957.f29212 == EnumC7466.f24655 && c8957.mo23945() == this.f77285.f49844) {
                m53268(EnumC3666.f12578);
                if ((c4395.f15825 & SkeinEngine.UbiTweak.T1_FIRST) == 0) {
                    this.f77300.m34517(this.f77298.f29214, C22843.m51553(new C15515("compiler", "class.is.not.sealed", str)));
                }
                m53298();
                return m53303(false);
            }
        }
        return C14769.m35543();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14769 m53300() {
        C18499 c18499 = new C18499();
        c18499.m43089(m53287(false));
        while (this.f77298.f29212 == EnumC7466.f24672) {
            m53298();
            c18499.m43089(m53287(false));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m53249(AbstractC19728 abstractC19728, boolean z, boolean z2) {
        EnumC7466 enumC7466;
        EnumC7466 enumC7467 = EnumC7466.f24658;
        m53270(enumC7467);
        int i = this.f77298.f29214;
        AbstractC11194 abstractC11194 = this.f77306;
        if (i <= abstractC11194.f35322) {
            m53274(false, true, false, false);
            if (this.f77298.f29212 == enumC7467) {
                m53298();
            } else {
                return C14769.m35543();
            }
        }
        C18499 c18499 = new C18499();
        while (true) {
            EnumC7466 enumC7468 = this.f77298.f29212;
            enumC7466 = EnumC7466.f24660;
            if (enumC7468 == enumC7466 || enumC7468 == EnumC7466.f24635) {
                break;
            }
            c18499.m43090(m53309(abstractC19728, z, z2));
            if (this.f77298.f29214 <= abstractC11194.f35322) {
                m53274(false, true, true, false);
            }
        }
        m53270(enumC7466);
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m53309(AbstractC19728 abstractC19728, boolean z, boolean z2) {
        EnumC7466 enumC7466;
        AbstractC22295 abstractC22295M53292;
        C14769 c14769Of;
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7467 = c8957.f29212;
        EnumC7466 enumC7468 = EnumC7466.f24712;
        if (enumC7467 == enumC7468) {
            m53298();
            return C14769.m35543();
        }
        EnumC8212 enumC8212 = EnumC8212.LINE;
        InterfaceC19399 interfaceC19399M23944 = c8957.m23944();
        int i = this.f77298.f29214;
        C4395 c4395M53241 = m53241((C4395) null);
        if (this.f77298.f29212 == EnumC7466.f24711 || ((this.f77303 && m53325()) || (enumC7466 = this.f77298.f29212) == EnumC7466.f24616 || enumC7466 == EnumC7466.f24600)) {
            return C14769.of((Object) m53256(c4395M53241, interfaceC19399M23944));
        }
        EnumC7466 enumC7469 = EnumC7466.f24658;
        C7312 c7312 = this.f77300;
        if (enumC7466 == enumC7469 && (c4395M53241.f15825 & 4087) == 0 && c4395M53241.f15824.isEmpty()) {
            if (z) {
                c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74040);
            } else if (z2 && (c4395M53241.f15825 & 8) == 0) {
                c7312.m34522(EnumC6984.SYNTAX, this.f77298.f29214, C22843.f74110);
            }
            return C14769.of((Object) m53239(i, c4395M53241.f15825));
        }
        int i2 = this.f77298.f29214;
        C14769 c14769M53301 = m53301();
        if (c14769M53301.m35550() && c4395M53241.f26658 == -1) {
            c4395M53241.f26658 = i2;
            m53272(c4395M53241, i2);
        }
        C14769 c14769M53250 = m53250(EnumC21461.f68479);
        if (c14769M53250.m35550()) {
            m53264(((C17621) c14769M53250.f48335).f26658, EnumC3666.f12570);
            C14769 c14769 = c4395M53241.f15824;
            c14769.getClass();
            C14769 c14769M35549 = c14769M53250.m35549(c14769);
            c4395M53241.f15824 = c14769M35549;
            if (c4395M53241.f26658 == -1) {
                c4395M53241.f26658 = ((C17621) c14769M35549.f48335).f26658;
            }
        }
        C8957 c8958 = this.f77298;
        int i3 = c8958.f29214;
        boolean z3 = c8958.f29212 == EnumC7466.f24664;
        AbstractC11194 abstractC11194 = this.f77306;
        C15714 c15714 = this.f77283;
        if (z3) {
            c15714.f51040 = i3;
            abstractC22295M53292 = (AbstractC22295) abstractC11194.mo28235(c15714.m37524(EnumC21172.VOID));
            m53298();
        } else {
            abstractC22295M53292 = m53292(false);
        }
        EnumC7466 enumC74610 = this.f77298.f29212;
        EnumC7466 enumC74611 = EnumC7466.f24668;
        C15252 c15252 = this.f77285;
        if (((enumC74610 == enumC74611 && !z) || (z2 && enumC74610 == enumC7469)) && abstractC22295M53292.m21911(EnumC21461.f68523)) {
            if (z || c8958.mo23945() != abstractC19728) {
                c7312.m34522(EnumC6984.SYNTAX, i3, C22843.f74073);
            } else if (c14769M53250.m35550()) {
                m53246(((C17621) c14769M53250.f48335).f26658);
            }
            if (z2 && this.f77298.f29212 == enumC7469) {
                c4395M53241.f15825 |= 2251799813685248L;
            }
            return C14769.of((Object) m53242(i3, c4395M53241, null, c15252.f49865, c14769M53301, z, true, z2, interfaceC19399M23944));
        }
        if (z2 && abstractC22295M53292.m21911(EnumC21461.f68523)) {
            C8957 c8959 = this.f77298;
            if (c8959.f29212 == EnumC7466.f24648) {
                EnumC6984 enumC6984 = EnumC6984.SYNTAX;
                int i4 = c8959.f29214;
                C15515 c15515 = C19859.f63861;
                c7312.m34522(enumC6984, i4, C22843.m51554(c15515, abstractC19728, new C15515("compiler", "throws.clause.not.allowed.for.canonical.constructor", c15515)));
                m53274(false, true, false, false);
                return C14769.of((Object) m53242(i3, c4395M53241, null, c15252.f49865, c14769M53301, z, true, z2, interfaceC19399M23944));
            }
        }
        int i5 = this.f77298.f29214;
        AbstractC19728 abstractC19728M53255 = m53255(false);
        if (this.f77298.f29212 == enumC74611) {
            return C14769.of((Object) m53242(i5, c4395M53241, abstractC22295M53292, abstractC19728M53255, c14769M53301, z, z3, false, interfaceC19399M23944));
        }
        if (z3 || !c14769M53301.isEmpty()) {
            int i6 = this.f77298.f29214;
            if (z3 || c14769M53301.m35550()) {
                c15714.f51040 = i6;
                C6633 c6633 = (C6633) abstractC11194.mo28234(c15714.m37511(c4395M53241, abstractC19728M53255, abstractC22295M53292, c14769M53301, null, C14769.m35543(), C14769.m35543(), null, null));
                m53273(c6633, interfaceC19399M23944);
                c14769Of = C14769.of((Object) c6633);
            } else {
                c14769Of = C14769.m35543();
            }
            return C14769.of((Object) m53247(this.f77298.f29214, c14769Of, C22843.m51548(enumC74611)));
        }
        if (!z2 || (z2 && (c4395M53241.f15825 & 8) != 0)) {
            C18499 c18499 = new C18499();
            m53265(i5, c4395M53241, abstractC22295M53292, abstractC19728M53255, z, interfaceC19399M23944, c18499, false);
            C14769 c14769M43093 = c18499.m43093();
            m53270(enumC7468);
            m53272((AbstractC8036) c14769M43093.last(), this.f77288.m35906().f29213);
            return c14769M43093;
        }
        C18499 c184910 = new C18499();
        m53265(i5, c4395M53241, abstractC22295M53292, abstractC19728M53255, z, interfaceC19399M23944, c184910, false);
        c184910.m43093();
        m53270(enumC7468);
        return C14769.of((Object) m53247(i5, (C14769) null, C22843.f74125));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m53325() {
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24655;
        if (enumC7466 != enumC7467 || c8957.mo23945() != this.f77285.f49774 || (!m53276(0, enumC7467, EnumC7466.f24668) && !m53276(0, enumC7467, EnumC7466.f24635) && !m53276(0, enumC7467, EnumC7466.f24697))) {
            return false;
        }
        m53268(EnumC3666.f12546);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53277(C8957 c8957, int i) {
        AbstractC19728 abstractC19728Mo23945 = c8957.mo23945();
        C15252 c15252 = this.f77285;
        if (abstractC19728Mo23945 != c15252.f49782 || !m53276(i, EnumC7466.f24709, EnumC7466.f24655)) {
            return false;
        }
        C14923 c14923 = this.f77288;
        C8957 c8957M35905 = c14923.m35905(i + 1);
        C8957 c8957M35906 = c14923.m35905(i + 2);
        if (c8957.f29213 != c8957M35905.f29214 || c8957M35905.f29213 != c8957M35906.f29214 || c8957M35906.mo23945() != c15252.f49829) {
            return false;
        }
        m53268(EnumC3666.f12578);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53317(boolean z) {
        if (this.f77298.mo23945() != this.f77285.f49829 || !m53223(this.f77288.m35905(1), z, false)) {
            return false;
        }
        m53268(EnumC3666.f12578);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m53223(C8957 c8957, boolean z, boolean z2) {
        C14923 c14923 = this.f77288;
        if (z) {
            int i = C22383.f72467[c8957.f29212.ordinal()];
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (i != 7 && i != 8 && i != 9 && i != 20) {
                        return false;
                    }
                } else if (c14923.m35905(2).f29212 == EnumC7466.f24616 && !z2) {
                    return false;
                }
            }
        } else {
            int i2 = C22383.f72467[c8957.f29212.ordinal()];
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
                            if (!m53277(c8957, z2 ? 3 : 1) && c8957.mo23945() != this.f77285.f49829) {
                                return false;
                            }
                        }
                    }
                } else if (c14923.m35905(2).f29212 == EnumC7466.f24616 && !z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6633 m53242(int i, C4395 c4395, AbstractC22295 abstractC22295, AbstractC19728 abstractC19728, C14769 c14769, boolean z, boolean z2, boolean z3, InterfaceC19399 interfaceC19399) {
        AbstractC22295 abstractC22295M53225;
        AbstractC22295 abstractC22295M53311;
        C4197 c4197M53294;
        AbstractC22295 abstractC22296;
        if (z) {
            if ((c4395.f15825 & 8) != 0) {
                m53268(EnumC3666.f12547);
            }
            if ((c4395.f15825 & 2) != 0) {
                m53268(EnumC3666.f12566);
            }
        }
        C12510 c12510 = this.f77279;
        C4197 c4197M53295 = null;
        try {
            this.f77279 = null;
            C14769 c14769M35543 = C14769.m35543();
            C14769 c14769M35544 = C14769.m35543();
            if (z3 && abstractC19728 == this.f77285.f49865 && this.f77298.f29212 != EnumC7466.f24668) {
                abstractC22295M53225 = abstractC22295;
            } else {
                c14769M35543 = m53310(false, false);
                abstractC22295M53225 = !z2 ? m53225(abstractC22295) : abstractC22295;
                if (this.f77298.f29212 == EnumC7466.f24648) {
                    m53298();
                    c14769M35544 = m53303(true);
                }
            }
            C14769 c147610 = c14769M35543;
            C14769 c147611 = c14769M35544;
            EnumC7466 enumC7466 = this.f77298.f29212;
            EnumC7466 enumC7467 = EnumC7466.f24658;
            AbstractC11194 abstractC11194 = this.f77306;
            if (enumC7466 == enumC7467) {
                abstractC22296 = null;
                c4197M53294 = m53294();
            } else {
                EnumC7466 enumC7468 = EnumC7466.f24656;
                if (enumC7466 == enumC7468) {
                    m53270(enumC7468);
                    abstractC22295M53311 = m53311();
                } else {
                    abstractC22295M53311 = null;
                }
                m53270(EnumC7466.f24712);
                if (this.f77298.f29214 <= abstractC11194.f35322) {
                    m53274(false, true, false, false);
                    if (this.f77298.f29212 == enumC7467) {
                        c4197M53295 = m53294();
                    }
                }
                c4197M53294 = c4197M53295;
                abstractC22296 = abstractC22295M53311;
            }
            C15714 c15714 = this.f77283;
            c15714.f51040 = i;
            C6633 c6633 = (C6633) abstractC11194.mo28234(c15714.m37511(c4395, abstractC19728, abstractC22295M53225, c14769, this.f77279, c147610, c147611, c4197M53294, abstractC22296));
            m53273(c6633, interfaceC19399);
            return c6633;
        } finally {
            this.f77279 = c12510;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m53303(boolean z) {
        C14769 c14769M35543;
        C14769 c14769M35544;
        C18499 c18499 = new C18499();
        if (z) {
            c14769M35543 = m53250(EnumC21461.f68474);
        } else {
            c14769M35543 = C14769.m35543();
        }
        AbstractC22295 abstractC22295M53322 = m53322(z);
        if (!c14769M35543.isEmpty()) {
            c18499.m43089(m53221(abstractC22295M53322, c14769M35543, false));
        } else {
            c18499.m43089(abstractC22295M53322);
        }
        while (this.f77298.f29212 == EnumC7466.f24672) {
            m53298();
            if (z) {
                c14769M35544 = m53250(EnumC21461.f68474);
            } else {
                c14769M35544 = C14769.m35543();
            }
            AbstractC22295 abstractC22295M53323 = m53322(z);
            if (!c14769M35544.isEmpty()) {
                c18499.m43089(m53221(abstractC22295M53323, c14769M35544, false));
            } else {
                c18499.m43089(abstractC22295M53323);
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14769 m53301() {
        if (this.f77298.f29212 == EnumC7466.f24697) {
            C18499 c18499 = new C18499();
            m53298();
            c18499.m43089(m53281());
            while (this.f77298.f29212 == EnumC7466.f24672) {
                m53298();
                c18499.m43089(m53281());
            }
            m53270(EnumC7466.f24704);
            return c18499.m43093();
        }
        return C14769.m35543();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C16239 m53281() {
        int i = this.f77298.f29214;
        C14769 c14769M53250 = m53250(EnumC21461.f68474);
        AbstractC19728 abstractC19728M53233 = m53233();
        C18499 c18499 = new C18499();
        if (this.f77298.f29212 == EnumC7466.f24643) {
            m53298();
            c18499.m43089(m53287(false));
            while (this.f77298.f29212 == EnumC7466.f24634) {
                m53298();
                c18499.m43089(m53287(false));
            }
        }
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C14769 c14769M43093 = c18499.m43093();
        C16239 c16239 = new C16239();
        c16239.f52784 = abstractC19728M53233;
        c16239.f52785 = c14769M43093;
        c16239.f52783 = c14769M53250;
        c16239.f26658 = c15714.f51040;
        return (C16239) this.f77306.mo28234(c16239);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m53310(boolean z, boolean z2) {
        C18499 c18499 = new C18499();
        m53270(EnumC7466.f24668);
        if (this.f77298.f29212 != EnumC7466.f24654) {
            this.f77291 = (z || z2) ? false : true;
            C12510 c12510M53245 = m53245(z, z2);
            if (c12510M53245.f40169 != null) {
                this.f77279 = c12510M53245;
            } else {
                c18499.m43089(c12510M53245);
            }
            this.f77291 = false;
            while (this.f77298.f29212 == EnumC7466.f24672) {
                if ((c12510M53245.f40170.f15825 & 17179869184L) != 0) {
                    this.f77300.m34523(EnumC6984.SYNTAX, c12510M53245, C22843.f74148);
                }
                m53298();
                c12510M53245 = m53245(z, z2);
                c18499.m43089(c12510M53245);
            }
        }
        C8957 c8957 = this.f77298;
        EnumC7466 enumC7466 = c8957.f29212;
        EnumC7466 enumC7467 = EnumC7466.f24654;
        if (enumC7466 == enumC7467) {
            m53298();
        } else {
            m53316(c8957.f29214);
            m53266(this.f77288.m35906().f29213, C22843.m51550(EnumC7466.f24672, enumC7467, EnumC7466.f24629));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m53245(boolean z, boolean z2) {
        C4395 c4395M53241;
        if (z2) {
            c4395M53241 = m53241((C4395) null);
        } else {
            c4395M53241 = m53240(8589934592L);
        }
        if (z2 && c4395M53241.f15825 != 0) {
            this.f77300.m34517(c4395M53241.f26658, C22843.f74063);
        }
        if (z2) {
            c4395M53241.f15825 |= 2305843009230471186L;
        }
        this.f77301 = true;
        AbstractC22295 abstractC22295M53287 = m53287(z);
        this.f77301 = false;
        if (this.f77298.f29212 == EnumC7466.f24695) {
            C14769 c14769 = this.f77287;
            this.f77287 = C14769.m35543();
            c4395M53241.f15825 |= 17179869184L;
            abstractC22295M53287 = m53221(abstractC22295M53287, c14769, true);
            m53298();
        } else {
            if (this.f77287.m35550()) {
                m53266(((C17621) this.f77287.f48335).f26658, C22843.f74187);
            }
            this.f77287 = C14769.m35543();
        }
        return m53244(c4395M53241, abstractC22295M53287, z, z2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m53313(AbstractC22295 abstractC22295) {
        if (C11239.m28336(abstractC22295)) {
            return abstractC22295;
        }
        int i = abstractC22295.f26658;
        C15714 c15714 = this.f77283;
        c15714.f51040 = i;
        C13891 c13891M37569 = c15714.m37569(C14769.of((Object) abstractC22295));
        this.f77300.m34523(EnumC6984.SYNTAX, c13891M37569, C22843.f74180);
        return c13891M37569;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m53227(EnumC7466 enumC7466) {
        EnumC21461 enumC21461M53231 = m53231(enumC7466);
        if (enumC21461M53231 != EnumC21461.f68515) {
            return C11239.m28322(enumC21461M53231);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC21461 m53231(EnumC7466 enumC7466) {
        int i = C22383.f72467[enumC7466.ordinal()];
        if (i == 21) {
            return EnumC21461.f68477;
        }
        if (i == 82) {
            return EnumC21461.f68466;
        }
        if (i != 83) {
            switch (i) {
                case 62:
                    return EnumC21461.f68509;
                case 63:
                    return EnumC21461.f68542;
                case 64:
                    return EnumC21461.f68472;
                case 65:
                    return EnumC21461.f68519;
                case 66:
                    return EnumC21461.f68512;
                case 67:
                    return EnumC21461.f68483;
                case 68:
                    return EnumC21461.f68504;
                case 69:
                    return EnumC21461.f68540;
                case 70:
                    return EnumC21461.f68468;
                case 71:
                    return EnumC21461.f68493;
                case 72:
                    return EnumC21461.f68508;
                default:
                    switch (i) {
                        case 89:
                            return EnumC21461.f68465;
                        case 90:
                            return EnumC21461.f68541;
                        case 91:
                            return EnumC21461.f68507;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            return EnumC21461.f68458;
                        case 93:
                            return EnumC21461.f68464;
                        default:
                            switch (i) {
                                case 95:
                                    return EnumC21461.f68535;
                                case 96:
                                    return EnumC21461.f68522;
                                case 97:
                                    return EnumC21461.f68476;
                                case 98:
                                    return EnumC21461.f68467;
                                case q.f /* 99 */:
                                    return EnumC21461.f68546;
                                case 100:
                                    return EnumC21461.f68457;
                                case 101:
                                    return EnumC21461.f68487;
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    return EnumC21461.f68506;
                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    return EnumC21461.f68503;
                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    return EnumC21461.f68516;
                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    return EnumC21461.f68494;
                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    return EnumC21461.f68534;
                                default:
                                    return EnumC21461.f68515;
                            }
                    }
            }
        }
        return EnumC21461.f68469;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53268(EnumC3666 enumC3666) {
        m53264(this.f77298.f29214, enumC3666);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53264(int i, EnumC3666 enumC3666) {
        C17638 c17638 = this.f77297;
        boolean zM41300 = c17638.m41300(enumC3666);
        C7312 c7312 = this.f77300;
        if (zM41300 && !c17638.m41295()) {
            c7312.m34522(EnumC6984.SOURCE_LEVEL, i, c17638.m41290(enumC3666));
            return;
        }
        EnumC20820 enumC20820 = this.f77286;
        if (!enumC3666.m11915(enumC20820)) {
            c7312.m34522(EnumC6984.SOURCE_LEVEL, i, enumC3666.m11913(enumC20820.f66685));
        } else if (c17638.m41300(enumC3666)) {
            c17638.m41292(new C2092(i), enumC3666);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53316(int i) {
        AbstractC11194 abstractC11194 = this.f77306;
        if (i > abstractC11194.f35322) {
            abstractC11194.f35322 = i;
        }
    }
}
