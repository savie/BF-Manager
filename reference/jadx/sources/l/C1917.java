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

/* JADX INFO: renamed from: l.֫۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1917 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13477 f6442 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f6443;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f6444;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15252 f6445;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24705 f6446;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14764 f6447;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC19728[] f6448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7312 f6449;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7395 f6450;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1917 m6583(C4747 c4747) {
        C1917 c1917 = (C1917) c4747.m14643(f6442);
        return c1917 == null ? new C1917(c4747) : c1917;
    }

    public C1917(C4747 c4747) {
        HashMap map = new HashMap(EnumC21461.m48820());
        this.f6444 = map;
        HashMap map2 = new HashMap(EnumC21461.m48820());
        this.f6443 = map2;
        AbstractC19728[] abstractC19728Arr = new AbstractC19728[EnumC21461.m48820()];
        this.f6448 = abstractC19728Arr;
        c4747.m14646(f6442, this);
        C14764 c14764M35506 = C14764.m35506(c4747);
        this.f6447 = c14764M35506;
        C15252 c15252M36599 = C15252.m36599(c4747);
        this.f6445 = c15252M36599;
        this.f6449 = C7312.m20023(c4747);
        this.f6446 = C24705.m55066(c4747);
        this.f6450 = new C7395(c15252M36599.f49799, AbstractC22664.f73590, -1, c14764M35506.f48321);
        EnumC21461 enumC21461 = EnumC21461.f68539;
        m6590(enumC21461, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC21461 enumC21462 = EnumC21461.f68497;
        m6590(enumC21462, "-");
        EnumC21461 enumC21463 = EnumC21461.f68521;
        m6590(enumC21463, "!");
        EnumC21461 enumC21464 = EnumC21461.f68470;
        m6590(enumC21464, "~");
        m6590(EnumC21461.f68529, "++");
        m6590(EnumC21461.f68482, "--");
        EnumC21461 enumC21465 = EnumC21461.f68451;
        m6590(enumC21465, "++");
        EnumC21461 enumC21466 = EnumC21461.f68525;
        m6590(enumC21466, "--");
        EnumC21461 enumC21467 = EnumC21461.f68548;
        m6590(enumC21467, "<*nullchk*>");
        EnumC21461 enumC21468 = EnumC21461.f68535;
        m6590(enumC21468, "||");
        EnumC21461 enumC21469 = EnumC21461.f68522;
        m6590(enumC21469, "&&");
        EnumC21461 enumC214610 = EnumC21461.f68546;
        m6590(enumC214610, "==");
        EnumC21461 enumC214611 = EnumC21461.f68457;
        m6590(enumC214611, "!=");
        EnumC21461 enumC214612 = EnumC21461.f68477;
        m6590(enumC214612, "<");
        EnumC21461 enumC214613 = EnumC21461.f68507;
        m6590(enumC214613, ">");
        EnumC21461 enumC214614 = EnumC21461.f68487;
        m6590(enumC214614, "<=");
        EnumC21461 enumC214615 = EnumC21461.f68464;
        m6590(enumC214615, ">=");
        EnumC21461 enumC214616 = EnumC21461.f68476;
        m6590(enumC214616, "|");
        EnumC21461 enumC214617 = EnumC21461.f68467;
        m6590(enumC214617, "^");
        EnumC21461 enumC214618 = EnumC21461.f68458;
        m6590(enumC214618, a.p);
        EnumC21461 enumC214619 = EnumC21461.f68506;
        m6590(enumC214619, "<<");
        EnumC21461 enumC214620 = EnumC21461.f68541;
        m6590(enumC214620, ">>");
        EnumC21461 enumC214621 = EnumC21461.f68465;
        m6590(enumC214621, ">>>");
        EnumC21461 enumC214622 = EnumC21461.f68466;
        m6590(enumC214622, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC21461 enumC214623 = EnumC21461.f68469;
        abstractC19728Arr[enumC214623.m48821()] = c15252M36599.f49826;
        EnumC21461 enumC214624 = EnumC21461.f68503;
        abstractC19728Arr[enumC214624.m48821()] = c15252M36599.f49751;
        EnumC21461 enumC214625 = EnumC21461.f68516;
        abstractC19728Arr[enumC214625.m48821()] = c15252M36599.f49825;
        EnumC21461 enumC214626 = EnumC21461.f68494;
        m6590(enumC214626, "%");
        C10865 c10865 = new C10865(this, enumC21461);
        EnumC4900 enumC4900 = EnumC4900.DOUBLE;
        c10865.m36788(enumC4900, enumC4900, 0);
        EnumC4900 enumC4901 = EnumC4900.FLOAT;
        c10865.m36788(enumC4901, enumC4901, 0);
        EnumC4900 enumC4902 = EnumC4900.LONG;
        c10865.m36788(enumC4902, enumC4902, 0);
        EnumC4900 enumC4903 = EnumC4900.INT;
        c10865.m36788(enumC4903, enumC4903, 0);
        C10865 c10866 = new C10865(this, enumC21462);
        c10866.m36788(enumC4900, enumC4900, 119);
        c10866.m36788(enumC4901, enumC4901, 118);
        c10866.m36788(enumC4902, enumC4902, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        c10866.m36788(enumC4903, enumC4903, 116);
        C10865 c10867 = new C10865(this, enumC21464, new C6191(2));
        c10867.m36788(enumC4902, enumC4902, 131);
        c10867.m36788(enumC4903, enumC4903, 130);
        C13103 c13103 = new C13103(this, enumC21465);
        c13103.m36788(enumC4900, enumC4900, 99);
        c13103.m36788(enumC4901, enumC4901, 98);
        c13103.m36788(enumC4902, enumC4902, 97);
        c13103.m36788(enumC4903, enumC4903, 96);
        EnumC4900 enumC4904 = EnumC4900.CHAR;
        c13103.m36788(enumC4904, enumC4904, 96);
        EnumC4900 enumC4905 = EnumC4900.SHORT;
        c13103.m36788(enumC4905, enumC4905, 96);
        EnumC4900 enumC4906 = EnumC4900.BYTE;
        c13103.m36788(enumC4906, enumC4906, 96);
        C13103 c13104 = new C13103(this, enumC21466);
        c13104.m36788(enumC4900, enumC4900, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c13104.m36788(enumC4901, enumC4901, IShizukuService.Stub.TRANSACTION_attachUserService);
        c13104.m36788(enumC4902, enumC4902, 101);
        c13104.m36788(enumC4903, enumC4903, 100);
        c13104.m36788(enumC4904, enumC4904, 100);
        c13104.m36788(enumC4905, enumC4905, 100);
        c13104.m36788(enumC4906, enumC4906, 100);
        C22054 c22054 = new C22054(this, enumC21463);
        EnumC4900 enumC4907 = EnumC4900.BOOLEAN;
        c22054.m36788(enumC4907, enumC4907, 257);
        C5646 c5646 = new C5646(this, enumC21467);
        EnumC4900 enumC4908 = EnumC4900.OBJECT;
        c5646.m36788(enumC4908, enumC4908, 276);
        AbstractC15340[] abstractC15340Arr = {c10865, c10866, c10867, c13103, c13104, c22054, c5646};
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            AbstractC15340 abstractC15340 = abstractC15340Arr[i];
            AbstractC19728 abstractC19728 = abstractC15340.f61929;
            map.put(abstractC19728, ((C14769) C11392.getOrDefault(map, abstractC19728, C14769.m35543())).m35552(abstractC15340));
            i++;
        }
        C14659 c14659 = new C14659(this, enumC214622);
        EnumC4900 enumC4909 = EnumC4900.STRING;
        c14659.m54426(enumC4909, enumC4908, enumC4909, 256);
        c14659.m54426(enumC4908, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4903, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4902, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4901, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4900, enumC4909, 256);
        c14659.m54426(enumC4909, enumC4907, enumC4909, 256);
        EnumC4900 enumC49010 = EnumC4900.BOT;
        c14659.m54426(enumC4909, enumC49010, enumC4909, 256);
        c14659.m54426(enumC4903, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4902, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4901, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4900, enumC4909, enumC4909, 256);
        c14659.m54426(enumC4907, enumC4909, enumC4909, 256);
        c14659.m54426(enumC49010, enumC4909, enumC4909, 256);
        C20627 c20627 = new C20627(this, enumC214622);
        c20627.m54426(enumC4900, enumC4900, enumC4900, 99);
        c20627.m54426(enumC4901, enumC4901, enumC4901, 98);
        c20627.m54426(enumC4902, enumC4902, enumC4902, 97);
        c20627.m54426(enumC4903, enumC4903, enumC4903, 96);
        C20627 c20628 = new C20627(this, enumC214623);
        c20628.m54426(enumC4900, enumC4900, enumC4900, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c20628.m54426(enumC4901, enumC4901, enumC4901, IShizukuService.Stub.TRANSACTION_attachUserService);
        c20628.m54426(enumC4902, enumC4902, enumC4902, 101);
        c20628.m54426(enumC4903, enumC4903, enumC4903, 100);
        C20627 c20629 = new C20627(this, enumC214624);
        c20629.m54426(enumC4900, enumC4900, enumC4900, IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        c20629.m54426(enumC4901, enumC4901, enumC4901, IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        c20629.m54426(enumC4902, enumC4902, enumC4902, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        c20629.m54426(enumC4903, enumC4903, enumC4903, IShizukuService.Stub.TRANSACTION_isHidden);
        C20627 c206210 = new C20627(this, enumC214625);
        c206210.m54426(enumC4900, enumC4900, enumC4900, UMErrorCode.E_UM_BE_CREATE_FAILED);
        c206210.m54426(enumC4901, enumC4901, enumC4901, UMErrorCode.E_UM_BE_JSON_FAILED);
        c206210.m54426(enumC4902, enumC4902, enumC4902, 109);
        c206210.m54426(enumC4903, enumC4903, enumC4903, 108);
        C20627 c206211 = new C20627(this, enumC214626);
        c206211.m54426(enumC4900, enumC4900, enumC4900, 115);
        c206211.m54426(enumC4901, enumC4901, enumC4901, 114);
        c206211.m54426(enumC4902, enumC4902, enumC4902, UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        c206211.m54426(enumC4903, enumC4903, enumC4903, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C23611 c23611 = new C23611(this, enumC214618);
        c23611.m54426(enumC4907, enumC4907, enumC4907, 126);
        C20627 c206212 = new C20627(this, enumC214618, new C6191(2));
        c206212.m54426(enumC4902, enumC4902, enumC4902, 127);
        c206212.m54426(enumC4903, enumC4903, enumC4903, 126);
        C23611 c23612 = new C23611(this, enumC214616);
        c23612.m54426(enumC4907, enumC4907, enumC4907, 128);
        C20627 c206213 = new C20627(this, enumC214616, new C6191(2));
        c206213.m54426(enumC4902, enumC4902, enumC4902, 129);
        c206213.m54426(enumC4903, enumC4903, enumC4903, 128);
        C23611 c23613 = new C23611(this, enumC214617);
        c23613.m54426(enumC4907, enumC4907, enumC4907, 130);
        C20627 c206214 = new C20627(this, enumC214617, new C6191(2));
        c206214.m54426(enumC4902, enumC4902, enumC4902, 131);
        c206214.m54426(enumC4903, enumC4903, enumC4903, 130);
        C4219 c4219 = new C4219(this, enumC214619);
        c4219.m54426(enumC4903, enumC4903, enumC4903, UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        c4219.m54426(enumC4903, enumC4902, enumC4903, BottomAppBarTopEdgeTreatment.ANGLE_UP);
        c4219.m54426(enumC4902, enumC4903, enumC4902, UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        c4219.m54426(enumC4902, enumC4902, enumC4902, 271);
        C4219 c42110 = new C4219(this, enumC214620);
        c42110.m54426(enumC4903, enumC4903, enumC4903, 122);
        c42110.m54426(enumC4903, enumC4902, enumC4903, 272);
        c42110.m54426(enumC4902, enumC4903, enumC4902, 123);
        c42110.m54426(enumC4902, enumC4902, enumC4902, 273);
        C4219 c42111 = new C4219(this, enumC214621);
        c42111.m54426(enumC4903, enumC4903, enumC4903, 124);
        c42111.m54426(enumC4903, enumC4902, enumC4903, 274);
        c42111.m54426(enumC4902, enumC4903, enumC4902, q.h);
        c42111.m54426(enumC4902, enumC4902, enumC4902, b.g);
        C20627 c206215 = new C20627(this, enumC214612);
        c206215.m54426(enumC4900, enumC4900, enumC4907, 152, 155);
        c206215.m54426(enumC4901, enumC4901, enumC4907, 150, 155);
        c206215.m54426(enumC4902, enumC4902, enumC4907, 148, 155);
        c206215.m54426(enumC4903, enumC4903, enumC4907, 161);
        C20627 c206216 = new C20627(this, enumC214613);
        c206216.m54426(enumC4900, enumC4900, enumC4907, 151, 157);
        c206216.m54426(enumC4901, enumC4901, enumC4907, 149, 157);
        c206216.m54426(enumC4902, enumC4902, enumC4907, 148, 157);
        c206216.m54426(enumC4903, enumC4903, enumC4907, 163);
        C20627 c206217 = new C20627(this, enumC214614);
        c206217.m54426(enumC4900, enumC4900, enumC4907, 152, 158);
        c206217.m54426(enumC4901, enumC4901, enumC4907, 150, 158);
        c206217.m54426(enumC4902, enumC4902, enumC4907, 148, 158);
        c206217.m54426(enumC4903, enumC4903, enumC4907, 164);
        C20627 c206218 = new C20627(this, enumC214615);
        c206218.m54426(enumC4900, enumC4900, enumC4907, 151, 156);
        c206218.m54426(enumC4901, enumC4901, enumC4907, 149, 156);
        c206218.m54426(enumC4902, enumC4902, enumC4907, 148, 156);
        c206218.m54426(enumC4903, enumC4903, enumC4907, 162);
        C3473 c3473 = new C3473(this, enumC214610);
        c3473.m54426(enumC4908, enumC4908, enumC4907, 165);
        c3473.m54426(enumC4907, enumC4907, enumC4907, 159);
        c3473.m54426(enumC4900, enumC4900, enumC4907, 151, 153);
        c3473.m54426(enumC4901, enumC4901, enumC4907, 149, 153);
        c3473.m54426(enumC4902, enumC4902, enumC4907, 148, 153);
        c3473.m54426(enumC4903, enumC4903, enumC4907, 159);
        C3473 c3474 = new C3473(this, enumC214611);
        c3474.m54426(enumC4908, enumC4908, enumC4907, 166);
        c3474.m54426(enumC4907, enumC4907, enumC4907, DHParameters.DEFAULT_MINIMUM_LENGTH);
        c3474.m54426(enumC4900, enumC4900, enumC4907, 151, EnumC24309.f78687);
        c3474.m54426(enumC4901, enumC4901, enumC4907, 149, EnumC24309.f78687);
        c3474.m54426(enumC4902, enumC4902, enumC4907, 148, EnumC24309.f78687);
        c3474.m54426(enumC4903, enumC4903, enumC4907, DHParameters.DEFAULT_MINIMUM_LENGTH);
        C23611 c23614 = new C23611(this, enumC21469);
        c23614.m54426(enumC4907, enumC4907, enumC4907, 258);
        C23611 c23615 = new C23611(this, enumC21468);
        c23615.m54426(enumC4907, enumC4907, enumC4907, 259);
        AbstractC24357[] abstractC24357Arr = {c14659, c20627, c20628, c20629, c206210, c206211, c23611, c206212, c23612, c206213, c23613, c206214, c4219, c42110, c42111, c206215, c206216, c206217, c206218, c3473, c3474, c23614, c23615};
        for (int i3 = 0; i3 < 23; i3++) {
            AbstractC24357 abstractC24357 = abstractC24357Arr[i3];
            AbstractC19728 abstractC19729 = abstractC24357.f61929;
            map2.put(abstractC19729, ((C14769) C11392.getOrDefault(map2, abstractC19729, C14769.m35543())).m35552(abstractC24357));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m6596(AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M55145 = this.f6446.m55145(abstractC22664);
        int i = C16151.f52440[abstractC22664M55145.mo9097().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.f6447.f48253 : abstractC22664M55145;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m6597(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C24705 c24705 = this.f6446;
        AbstractC22664 abstractC22664M55145 = c24705.m55145(abstractC22664);
        AbstractC22664 abstractC22664M55146 = c24705.m55145(abstractC22665);
        boolean zMo40455 = abstractC22664M55145.mo40455();
        C14764 c14764 = this.f6447;
        if (!zMo40455 || !abstractC22664M55146.mo40455()) {
            return c24705.m55149(abstractC22664M55145, abstractC22664M55146) ? abstractC22664M55145 : c14764.f48286;
        }
        EnumC21172 enumC21172 = EnumC21172.DOUBLE;
        if (abstractC22664M55145.m51067(enumC21172) || abstractC22664M55146.m51067(enumC21172)) {
            return c14764.f48249;
        }
        EnumC21172 enumC21173 = EnumC21172.FLOAT;
        if (abstractC22664M55145.m51067(enumC21173) || abstractC22664M55146.m51067(enumC21173)) {
            return c14764.f48239;
        }
        EnumC21172 enumC21174 = EnumC21172.LONG;
        if (abstractC22664M55145.m51067(enumC21174) || abstractC22664M55146.m51067(enumC21174)) {
            return c14764.f48256;
        }
        return c14764.f48253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7395 m6594(final AbstractC22295 abstractC22295, final EnumC21461 enumC21461, final AbstractC22664 abstractC22664) {
        C22511 c22511 = new C22511(1, abstractC22664);
        Function function = new Function() { // from class: l.۫ܳۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function2) {
                return C24247.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function2) {
                return C24247.$default$compose(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC15340) obj).mo16631(abstractC22664);
            }
        };
        return (C7395) C1170.stream((C14769) this.f6444.get(m6595(enumC21461))).filter(c22511).map(function).findFirst().orElseGet(new Supplier() { // from class: l.ۚܳۘ
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f19711.m6587(abstractC22295, enumC21461, abstractC22664);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7395 m6593(final AbstractC19311 abstractC19311, final EnumC21461 enumC21461, final AbstractC22664 abstractC22664, final AbstractC22664 abstractC22665) {
        Predicate predicate = new Predicate() { // from class: l.֫ܳۘ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C19025.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                return C19025.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC24357) obj).test(abstractC22664, abstractC22665);
            }
        };
        Function function = new Function() { // from class: l.ۧܳۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function2) {
                return C24247.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function2) {
                return C24247.$default$compose(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC24357) obj).mo11429(abstractC22664, abstractC22665);
            }
        };
        return (C7395) C1170.stream((C14769) this.f6443.get(m6595(enumC21461))).filter(predicate).map(function).findFirst().orElseGet(new Supplier() { // from class: l.᩻ܳۘ
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f81186.m6587(abstractC19311, enumC21461, abstractC22664, abstractC22665);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7395 m6586(final C1917 c1917, AbstractC19728 abstractC19728, C14769 c14769, EnumC4900 enumC4900, int[] iArr) {
        int i;
        C14769 c147610 = (C14769) C1170.stream(c14769).map(new Function() { // from class: l.ܳܳۘ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EnumC4900) obj).m15043(this.f50218.f6447);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).collect(C14769.m35544());
        C14764 c14764 = c1917.f6447;
        C23191 c23191 = new C23191(c147610, enumC4900.m15043(c14764), C14769.m35543(), c14764.f48275);
        int length = iArr.length;
        C11972.m30026(length == 1 || length == 2);
        if (length == 1) {
            i = iArr[0];
        } else {
            i = (iArr[0] << 9) | iArr[1];
        }
        return new C7395(abstractC19728, c23191, i, c14764.f48321);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7395 m6587(InterfaceC5075 interfaceC5075, EnumC21461 enumC21461, AbstractC22664... abstractC22664Arr) {
        C11040 c11040;
        if (C23654.of((Object[]) abstractC22664Arr).noneMatch(new C24091(1))) {
            AbstractC19728 abstractC19728M6595 = m6595(enumC21461);
            if (abstractC22664Arr.length == 1) {
                AbstractC22664 abstractC22664 = abstractC22664Arr[0];
                C11040 c11041 = C22843.f74058;
                c11040 = new C11040("compiler", "operator.cant.be.applied", abstractC19728M6595, abstractC22664);
            } else {
                AbstractC22664 abstractC22665 = abstractC22664Arr[0];
                AbstractC22664 abstractC22666 = abstractC22664Arr[1];
                C11040 c11042 = C22843.f74058;
                c11040 = new C11040("compiler", "operator.cant.be.applied.1", abstractC19728M6595, abstractC22665, abstractC22666);
            }
            this.f6449.m34520(interfaceC5075, c11040);
        }
        return this.f6450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m6595(EnumC21461 enumC21461) {
        return this.f6448[enumC21461.m48821()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7395 m6592(final C14133 c14133) {
        return (C7395) C1170.stream(this.f6443.values()).flatMap(new C16897()).map(new Function() { // from class: l.ܽܳۘ
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
                return ((AbstractC24357) obj).m44271(c14133);
            }
        }).distinct().filter(new C19355(3, this)).findFirst().get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6590(EnumC21461 enumC21461, String str) {
        AbstractC22712 abstractC22712 = this.f6445.f49864;
        abstractC22712.getClass();
        char[] charArray = str.toCharArray();
        this.f6448[enumC21461.m48821()] = abstractC22712.mo2069(charArray, charArray.length);
    }
}
