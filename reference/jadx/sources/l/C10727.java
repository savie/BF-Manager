package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۧۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10727 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C16576 f36564 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23800 f36565;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10498 f36566;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f36567;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC11242[] f36568;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23942 f36569;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashMap f36570;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20414 f36571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3836 f36572;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10727 m26956(C12343 c12343) {
        C10727 c10727 = (C10727) c12343.m30656(f36564);
        return c10727 == null ? new C10727(c12343) : c10727;
    }

    public C10727(C12343 c12343) {
        HashMap map = new HashMap(EnumC18651.m43133());
        this.f36570 = map;
        HashMap map2 = new HashMap(EnumC18651.m43133());
        this.f36567 = map2;
        AbstractC11242[] abstractC11242Arr = new AbstractC11242[EnumC18651.m43133()];
        this.f36568 = abstractC11242Arr;
        c12343.m30659(f36564, this);
        C3836 c3836M11131 = C3836.m11131(c12343);
        this.f36572 = c3836M11131;
        C23942 c23942M52776 = C23942.m52776(c12343);
        this.f36569 = c23942M52776;
        this.f36571 = C20414.m46161(c12343);
        this.f36565 = C23800.m52336(c12343);
        this.f36566 = new C10498(c23942M52776.f77594, AbstractC16579.f53219, -1, c3836M11131.f14243);
        EnumC18651 enumC18651 = EnumC18651.f60555;
        m26958(enumC18651, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18651 enumC18652 = EnumC18651.f60494;
        m26958(enumC18652, "-");
        EnumC18651 enumC18653 = EnumC18651.f60561;
        m26958(enumC18653, "!");
        EnumC18651 enumC18654 = EnumC18651.f60520;
        m26958(enumC18654, "~");
        m26958(EnumC18651.f60542, "++");
        m26958(EnumC18651.f60519, "--");
        EnumC18651 enumC18655 = EnumC18651.f60538;
        m26958(enumC18655, "++");
        EnumC18651 enumC18656 = EnumC18651.f60467;
        m26958(enumC18656, "--");
        EnumC18651 enumC18657 = EnumC18651.f60548;
        m26958(enumC18657, "<*nullchk*>");
        EnumC18651 enumC18658 = EnumC18651.f60551;
        m26958(enumC18658, "||");
        EnumC18651 enumC18659 = EnumC18651.f60464;
        m26958(enumC18659, "&&");
        EnumC18651 enumC186510 = EnumC18651.f60546;
        m26958(enumC186510, "==");
        EnumC18651 enumC186511 = EnumC18651.f60482;
        m26958(enumC186511, "!=");
        EnumC18651 enumC186512 = EnumC18651.f60505;
        m26958(enumC186512, "<");
        EnumC18651 enumC186513 = EnumC18651.f60532;
        m26958(enumC186513, ">");
        EnumC18651 enumC186514 = EnumC18651.f60569;
        m26958(enumC186514, "<=");
        EnumC18651 enumC186515 = EnumC18651.f60556;
        m26958(enumC186515, ">=");
        EnumC18651 enumC186516 = EnumC18651.f60504;
        m26958(enumC186516, "|");
        EnumC18651 enumC186517 = EnumC18651.f60483;
        m26958(enumC186517, "^");
        EnumC18651 enumC186518 = EnumC18651.f60526;
        m26958(enumC186518, a.p);
        EnumC18651 enumC186519 = EnumC18651.f60479;
        m26958(enumC186519, "<<");
        EnumC18651 enumC186520 = EnumC18651.f60524;
        m26958(enumC186520, ">>");
        EnumC18651 enumC186521 = EnumC18651.f60557;
        m26958(enumC186521, ">>>");
        EnumC18651 enumC186522 = EnumC18651.f60558;
        m26958(enumC186522, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18651 enumC186523 = EnumC18651.f60485;
        abstractC11242Arr[enumC186523.m43135()] = c23942M52776.f77628;
        EnumC18651 enumC186524 = EnumC18651.f60470;
        abstractC11242Arr[enumC186524.m43135()] = c23942M52776.f77589;
        EnumC18651 enumC186525 = EnumC18651.f60529;
        abstractC11242Arr[enumC186525.m43135()] = c23942M52776.f77627;
        EnumC18651 enumC186526 = EnumC18651.f60515;
        m26958(enumC186526, "%");
        C19899 c19899 = new C19899(this, enumC18651);
        EnumC20604 enumC20604 = EnumC20604.DOUBLE;
        c19899.m30212(enumC20604, enumC20604, 0);
        EnumC20604 enumC20605 = EnumC20604.FLOAT;
        c19899.m30212(enumC20605, enumC20605, 0);
        EnumC20604 enumC20606 = EnumC20604.LONG;
        c19899.m30212(enumC20606, enumC20606, 0);
        EnumC20604 enumC20607 = EnumC20604.INT;
        c19899.m30212(enumC20607, enumC20607, 0);
        C19899 c198910 = new C19899(this, enumC18652);
        c198910.m30212(enumC20604, enumC20604, 119);
        c198910.m30212(enumC20605, enumC20605, 118);
        c198910.m30212(enumC20606, enumC20606, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        c198910.m30212(enumC20607, enumC20607, 116);
        C19899 c198911 = new C19899(this, enumC18654, new C15396(3));
        c198911.m30212(enumC20606, enumC20606, 131);
        c198911.m30212(enumC20607, enumC20607, 130);
        C17076 c17076 = new C17076(this, enumC18655);
        c17076.m30212(enumC20604, enumC20604, 99);
        c17076.m30212(enumC20605, enumC20605, 98);
        c17076.m30212(enumC20606, enumC20606, 97);
        c17076.m30212(enumC20607, enumC20607, 96);
        EnumC20604 enumC20608 = EnumC20604.CHAR;
        c17076.m30212(enumC20608, enumC20608, 96);
        EnumC20604 enumC20609 = EnumC20604.SHORT;
        c17076.m30212(enumC20609, enumC20609, 96);
        EnumC20604 enumC206010 = EnumC20604.BYTE;
        c17076.m30212(enumC206010, enumC206010, 96);
        C17076 c17077 = new C17076(this, enumC18656);
        c17077.m30212(enumC20604, enumC20604, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c17077.m30212(enumC20605, enumC20605, IShizukuService.Stub.TRANSACTION_attachUserService);
        c17077.m30212(enumC20606, enumC20606, 101);
        c17077.m30212(enumC20607, enumC20607, 100);
        c17077.m30212(enumC20608, enumC20608, 100);
        c17077.m30212(enumC20609, enumC20609, 100);
        c17077.m30212(enumC206010, enumC206010, 100);
        C15666 c15666 = new C15666(this, enumC18653);
        EnumC20604 enumC206011 = EnumC20604.BOOLEAN;
        c15666.m30212(enumC206011, enumC206011, 257);
        C5787 c5787 = new C5787(this, enumC18657);
        EnumC20604 enumC206012 = EnumC20604.OBJECT;
        c5787.m30212(enumC206012, enumC206012, 276);
        AbstractC12138[] abstractC12138Arr = {c19899, c198910, c198911, c17076, c17077, c15666, c5787};
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            AbstractC12138 abstractC12138 = abstractC12138Arr[i];
            AbstractC11242 abstractC11242 = abstractC12138.f48856;
            map.put(abstractC11242, ((C21825) C9735.getOrDefault(map, abstractC11242, C21825.m48588())).m48597(abstractC12138));
            i++;
        }
        C12843 c12843 = new C12843(this, enumC186522);
        EnumC20604 enumC206013 = EnumC20604.STRING;
        c12843.m48901(enumC206013, enumC206012, enumC206013, 256);
        c12843.m48901(enumC206012, enumC206013, enumC206013, 256);
        c12843.m48901(enumC206013, enumC206013, enumC206013, 256);
        c12843.m48901(enumC206013, enumC20607, enumC206013, 256);
        c12843.m48901(enumC206013, enumC20606, enumC206013, 256);
        c12843.m48901(enumC206013, enumC20605, enumC206013, 256);
        c12843.m48901(enumC206013, enumC20604, enumC206013, 256);
        c12843.m48901(enumC206013, enumC206011, enumC206013, 256);
        EnumC20604 enumC206014 = EnumC20604.BOT;
        c12843.m48901(enumC206013, enumC206014, enumC206013, 256);
        c12843.m48901(enumC20607, enumC206013, enumC206013, 256);
        c12843.m48901(enumC20606, enumC206013, enumC206013, 256);
        c12843.m48901(enumC20605, enumC206013, enumC206013, 256);
        c12843.m48901(enumC20604, enumC206013, enumC206013, 256);
        c12843.m48901(enumC206011, enumC206013, enumC206013, 256);
        c12843.m48901(enumC206014, enumC206013, enumC206013, 256);
        C11432 c11432 = new C11432(this, enumC186522);
        c11432.m48901(enumC20604, enumC20604, enumC20604, 99);
        c11432.m48901(enumC20605, enumC20605, enumC20605, 98);
        c11432.m48901(enumC20606, enumC20606, enumC20606, 97);
        c11432.m48901(enumC20607, enumC20607, enumC20607, 96);
        C11432 c11433 = new C11432(this, enumC186523);
        c11433.m48901(enumC20604, enumC20604, enumC20604, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c11433.m48901(enumC20605, enumC20605, enumC20605, IShizukuService.Stub.TRANSACTION_attachUserService);
        c11433.m48901(enumC20606, enumC20606, enumC20606, 101);
        c11433.m48901(enumC20607, enumC20607, enumC20607, 100);
        C11432 c11434 = new C11432(this, enumC186524);
        c11434.m48901(enumC20604, enumC20604, enumC20604, IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        c11434.m48901(enumC20605, enumC20605, enumC20605, IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        c11434.m48901(enumC20606, enumC20606, enumC20606, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        c11434.m48901(enumC20607, enumC20607, enumC20607, IShizukuService.Stub.TRANSACTION_isHidden);
        C11432 c11435 = new C11432(this, enumC186525);
        c11435.m48901(enumC20604, enumC20604, enumC20604, UMErrorCode.E_UM_BE_CREATE_FAILED);
        c11435.m48901(enumC20605, enumC20605, enumC20605, UMErrorCode.E_UM_BE_JSON_FAILED);
        c11435.m48901(enumC20606, enumC20606, enumC20606, 109);
        c11435.m48901(enumC20607, enumC20607, enumC20607, 108);
        C11432 c11436 = new C11432(this, enumC186526);
        c11436.m48901(enumC20604, enumC20604, enumC20604, 115);
        c11436.m48901(enumC20605, enumC20605, enumC20605, 114);
        c11436.m48901(enumC20606, enumC20606, enumC20606, UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        c11436.m48901(enumC20607, enumC20607, enumC20607, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C4375 c4375 = new C4375(this, enumC186518);
        c4375.m48901(enumC206011, enumC206011, enumC206011, 126);
        C11432 c11437 = new C11432(this, enumC186518, new C15396(3));
        c11437.m48901(enumC20606, enumC20606, enumC20606, 127);
        c11437.m48901(enumC20607, enumC20607, enumC20607, 126);
        C4375 c4376 = new C4375(this, enumC186516);
        c4376.m48901(enumC206011, enumC206011, enumC206011, 128);
        C11432 c11438 = new C11432(this, enumC186516, new C15396(3));
        c11438.m48901(enumC20606, enumC20606, enumC20606, 129);
        c11438.m48901(enumC20607, enumC20607, enumC20607, 128);
        C4375 c4377 = new C4375(this, enumC186517);
        c4377.m48901(enumC206011, enumC206011, enumC206011, 130);
        C11432 c11439 = new C11432(this, enumC186517, new C15396(3));
        c11439.m48901(enumC20606, enumC20606, enumC20606, 131);
        c11439.m48901(enumC20607, enumC20607, enumC20607, 130);
        C0847 c0847 = new C0847(this, enumC186519);
        c0847.m48901(enumC20607, enumC20607, enumC20607, UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        c0847.m48901(enumC20607, enumC20606, enumC20607, BottomAppBarTopEdgeTreatment.ANGLE_UP);
        c0847.m48901(enumC20606, enumC20607, enumC20606, UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        c0847.m48901(enumC20606, enumC20606, enumC20606, 271);
        C0847 c0848 = new C0847(this, enumC186520);
        c0848.m48901(enumC20607, enumC20607, enumC20607, 122);
        c0848.m48901(enumC20607, enumC20606, enumC20607, 272);
        c0848.m48901(enumC20606, enumC20607, enumC20606, 123);
        c0848.m48901(enumC20606, enumC20606, enumC20606, 273);
        C0847 c0849 = new C0847(this, enumC186521);
        c0849.m48901(enumC20607, enumC20607, enumC20607, 124);
        c0849.m48901(enumC20607, enumC20606, enumC20607, 274);
        c0849.m48901(enumC20606, enumC20607, enumC20606, q.h);
        c0849.m48901(enumC20606, enumC20606, enumC20606, b.g);
        C11432 c114310 = new C11432(this, enumC186512);
        c114310.m48901(enumC20604, enumC20604, enumC206011, 152, 155);
        c114310.m48901(enumC20605, enumC20605, enumC206011, 150, 155);
        c114310.m48901(enumC20606, enumC20606, enumC206011, 148, 155);
        c114310.m48901(enumC20607, enumC20607, enumC206011, 161);
        C11432 c114311 = new C11432(this, enumC186513);
        c114311.m48901(enumC20604, enumC20604, enumC206011, 151, 157);
        c114311.m48901(enumC20605, enumC20605, enumC206011, 149, 157);
        c114311.m48901(enumC20606, enumC20606, enumC206011, 148, 157);
        c114311.m48901(enumC20607, enumC20607, enumC206011, 163);
        C11432 c114312 = new C11432(this, enumC186514);
        c114312.m48901(enumC20604, enumC20604, enumC206011, 152, 158);
        c114312.m48901(enumC20605, enumC20605, enumC206011, 150, 158);
        c114312.m48901(enumC20606, enumC20606, enumC206011, 148, 158);
        c114312.m48901(enumC20607, enumC20607, enumC206011, 164);
        C11432 c114313 = new C11432(this, enumC186515);
        c114313.m48901(enumC20604, enumC20604, enumC206011, 151, 156);
        c114313.m48901(enumC20605, enumC20605, enumC206011, 149, 156);
        c114313.m48901(enumC20606, enumC20606, enumC206011, 148, 156);
        c114313.m48901(enumC20607, enumC20607, enumC206011, 162);
        C13549 c13549 = new C13549(this, enumC186510);
        c13549.m48901(enumC206012, enumC206012, enumC206011, 165);
        c13549.m48901(enumC206011, enumC206011, enumC206011, 159);
        c13549.m48901(enumC20604, enumC20604, enumC206011, 151, 153);
        c13549.m48901(enumC20605, enumC20605, enumC206011, 149, 153);
        c13549.m48901(enumC20606, enumC20606, enumC206011, 148, 153);
        c13549.m48901(enumC20607, enumC20607, enumC206011, 159);
        C13549 c135410 = new C13549(this, enumC186511);
        c135410.m48901(enumC206012, enumC206012, enumC206011, 166);
        c135410.m48901(enumC206011, enumC206011, enumC206011, DHParameters.DEFAULT_MINIMUM_LENGTH);
        c135410.m48901(enumC20604, enumC20604, enumC206011, 151, EnumC2300.f8185);
        c135410.m48901(enumC20605, enumC20605, enumC206011, 149, EnumC2300.f8185);
        c135410.m48901(enumC20606, enumC20606, enumC206011, 148, EnumC2300.f8185);
        c135410.m48901(enumC20607, enumC20607, enumC206011, DHParameters.DEFAULT_MINIMUM_LENGTH);
        C4375 c4378 = new C4375(this, enumC18659);
        c4378.m48901(enumC206011, enumC206011, enumC206011, 258);
        C4375 c4379 = new C4375(this, enumC18658);
        c4379.m48901(enumC206011, enumC206011, enumC206011, 259);
        AbstractC22015[] abstractC22015Arr = {c12843, c11432, c11433, c11434, c11435, c11436, c4375, c11437, c4376, c11438, c4377, c11439, c0847, c0848, c0849, c114310, c114311, c114312, c114313, c13549, c135410, c4378, c4379};
        for (int i3 = 0; i3 < 23; i3++) {
            AbstractC22015 abstractC22015 = abstractC22015Arr[i3];
            AbstractC11242 abstractC11243 = abstractC22015.f48856;
            map2.put(abstractC11243, ((C21825) C9735.getOrDefault(map2, abstractC11243, C21825.m48588())).m48597(abstractC22015));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m26964(AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M52355 = this.f36565.m52355(abstractC16579);
        int i = C3151.f11884[abstractC16579M52355.mo1933().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.f36572.f14232 : abstractC16579M52355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m26965(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C23800 c23800 = this.f36565;
        AbstractC16579 abstractC16579M52355 = c23800.m52355(abstractC16579);
        AbstractC16579 abstractC16579M52356 = c23800.m52355(abstractC165710);
        boolean zMo9484 = abstractC16579M52355.mo9484();
        C3836 c3836 = this.f36572;
        if (!zMo9484 || !abstractC16579M52356.mo9484()) {
            return c23800.m52399(abstractC16579M52355, abstractC16579M52356) ? abstractC16579M52355 : c3836.f14275;
        }
        EnumC6617 enumC6617 = EnumC6617.DOUBLE;
        if (abstractC16579M52355.m39001(enumC6617) || abstractC16579M52356.m39001(enumC6617)) {
            return c3836.f14291;
        }
        EnumC6617 enumC6618 = EnumC6617.FLOAT;
        if (abstractC16579M52355.m39001(enumC6618) || abstractC16579M52356.m39001(enumC6618)) {
            return c3836.f14256;
        }
        EnumC6617 enumC6619 = EnumC6617.LONG;
        if (abstractC16579M52355.m39001(enumC6619) || abstractC16579M52356.m39001(enumC6619)) {
            return c3836.f14264;
        }
        return c3836.f14232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10498 m26960(final AbstractC5930 abstractC5930, final EnumC18651 enumC18651, final AbstractC16579 abstractC16579) {
        Predicate predicate = new Predicate() { // from class: l.ۧۢۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C8512.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                return C8512.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC12138) obj).test(abstractC16579);
            }
        };
        C2882 c2882 = new C2882(1, abstractC16579);
        return (C10498) C9030.stream((C21825) this.f36570.get(m26963(enumC18651))).filter(predicate).map(c2882).findFirst().orElseGet(new Supplier() { // from class: l.᩻ۢۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f76512.m26955(abstractC5930, enumC18651, abstractC16579);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10498 m26961(final AbstractC10495 abstractC10495, final EnumC18651 enumC18651, final AbstractC16579 abstractC16579, final AbstractC16579 abstractC165710) {
        C13943 c13943 = new C13943(abstractC16579, abstractC165710);
        C11826 c11826 = new C11826(1, abstractC16579, abstractC165710);
        return (C10498) C9030.stream((C21825) this.f36567.get(m26963(enumC18651))).filter(c13943).map(c11826).findFirst().orElseGet(new Supplier() { // from class: l.ܳۢۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f47359.m26955(abstractC10495, enumC18651, abstractC16579, abstractC165710);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10498 m26953(final C10727 c10727, AbstractC11242 abstractC11242, C21825 c21825, EnumC20604 enumC20604, int[] iArr) {
        int i;
        C21825 c21826 = (C21825) C9030.stream(c21825).map(new Function() { // from class: l.ۛۢۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EnumC20604) obj).m46479(this.f20335.f36572);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        }).collect(C21825.m48587());
        C3836 c3836 = c10727.f36572;
        C13757 c13757 = new C13757(c21826, enumC20604.m46479(c3836), C21825.m48588(), c3836.f14240);
        int length = iArr.length;
        C6171.m17176(length == 1 || length == 2);
        if (length == 1) {
            i = iArr[0];
        } else {
            i = (iArr[0] << 9) | iArr[1];
        }
        return new C10498(abstractC11242, c13757, i, c3836.f14243);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10498 m26955(InterfaceC12260 interfaceC12260, EnumC18651 enumC18651, AbstractC16579... abstractC16579Arr) {
        C5909 c5909;
        if (C11397.of((Object[]) abstractC16579Arr).noneMatch(new C17263())) {
            AbstractC11242 abstractC11242M26963 = m26963(enumC18651);
            if (abstractC16579Arr.length == 1) {
                AbstractC16579 abstractC16579 = abstractC16579Arr[0];
                C5909 c59010 = C23879.f77204;
                c5909 = new C5909("compiler", "operator.cant.be.applied", abstractC11242M26963, abstractC16579);
            } else {
                AbstractC16579 abstractC165710 = abstractC16579Arr[0];
                AbstractC16579 abstractC165711 = abstractC16579Arr[1];
                C5909 c59011 = C23879.f77204;
                c5909 = new C5909("compiler", "operator.cant.be.applied.1", abstractC11242M26963, abstractC165710, abstractC165711);
            }
            this.f36571.m48199(interfaceC12260, c5909);
        }
        return this.f36566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m26963(EnumC18651 enumC18651) {
        return this.f36568[enumC18651.m43135()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10498 m26962(C20563 c20563) {
        return (C10498) C9030.stream(this.f36567.values()).flatMap(new C23726(5)).map(new C1740(0, c20563)).distinct().filter(new C9503(0, this)).findFirst().get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26958(EnumC18651 enumC18651, String str) {
        AbstractC6302 abstractC6302 = this.f36569.f77631;
        abstractC6302.getClass();
        char[] charArray = str.toCharArray();
        this.f36568[enumC18651.m43135()] = abstractC6302.mo17390(charArray, charArray.length);
    }
}
