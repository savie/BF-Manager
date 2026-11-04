package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۫ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6BN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13225 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f42279;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13225[] f42280;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5052 f42281;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC14088 f42282;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC15462 f42283;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f42284;

    static {
        C13225[] c13225Arr = new C13225[256];
        f42280 = c13225Arr;
        EnumC5052 enumC5052 = EnumC5052.NOP;
        AbstractC15462 abstractC15462 = AbstractC15462.f50366;
        m32772(c13225Arr, 0, enumC5052, abstractC15462);
        EnumC5052 enumC5053 = EnumC5052.MOVE;
        AbstractC15462 abstractC15463 = AbstractC15462.f50355;
        m32772(c13225Arr, 1, enumC5053, abstractC15463);
        AbstractC15462 abstractC15464 = AbstractC15462.f50364;
        m32772(c13225Arr, 2, enumC5053, abstractC15464);
        AbstractC15462 abstractC15465 = AbstractC15462.f50365;
        m32772(c13225Arr, 3, enumC5053, abstractC15465);
        EnumC5052 enumC5054 = EnumC5052.MOVE_WIDE;
        m32772(c13225Arr, 4, enumC5054, abstractC15463);
        m32772(c13225Arr, 5, enumC5054, abstractC15464);
        m32772(c13225Arr, 6, enumC5054, abstractC15465);
        EnumC5052 enumC5055 = EnumC5052.MOVE_OBJECT;
        m32772(c13225Arr, 7, enumC5055, abstractC15463);
        m32772(c13225Arr, 8, enumC5055, abstractC15464);
        m32772(c13225Arr, 9, enumC5055, abstractC15465);
        EnumC5052 enumC5056 = EnumC5052.MOVE_RESULT;
        AbstractC15462 abstractC15466 = AbstractC15462.f50357;
        m32772(c13225Arr, 10, enumC5056, abstractC15466);
        m32772(c13225Arr, 11, enumC5056, abstractC15466);
        m32772(c13225Arr, 12, enumC5056, abstractC15466);
        m32772(c13225Arr, 13, EnumC5052.MOVE_EXCEPTION, abstractC15466);
        m32772(c13225Arr, 14, EnumC5052.RETURN_VOID, abstractC15462);
        EnumC5052 enumC5057 = EnumC5052.RETURN;
        m32772(c13225Arr, 15, enumC5057, abstractC15466);
        m32772(c13225Arr, 16, enumC5057, abstractC15466);
        m32772(c13225Arr, 17, enumC5057, abstractC15466);
        EnumC5052 enumC5058 = EnumC5052.CONST;
        m32772(c13225Arr, 18, enumC5058, AbstractC15462.f50363);
        AbstractC15462 abstractC15467 = AbstractC15462.f50369;
        m32772(c13225Arr, 19, enumC5058, abstractC15467);
        AbstractC15462 abstractC15468 = AbstractC15462.f50346;
        m32772(c13225Arr, 20, enumC5058, abstractC15468);
        AbstractC15462 abstractC15469 = AbstractC15462.f50353;
        m32772(c13225Arr, 21, enumC5058, abstractC15469);
        EnumC5052 enumC5059 = EnumC5052.CONST_WIDE;
        m32772(c13225Arr, 22, enumC5059, abstractC15467);
        m32772(c13225Arr, 23, enumC5059, abstractC15468);
        m32772(c13225Arr, 24, enumC5059, AbstractC15462.f50351);
        m32772(c13225Arr, 25, enumC5059, abstractC15469);
        EnumC5052 enumC50510 = EnumC5052.CONST_STRING;
        EnumC14088 enumC14088 = EnumC14088.STRING_REF;
        AbstractC15462 abstractC154610 = AbstractC15462.f50343;
        m32773(c13225Arr, 26, enumC50510, abstractC154610, enumC14088);
        m32773(c13225Arr, 27, enumC50510, AbstractC15462.f50368, enumC14088);
        EnumC5052 enumC50511 = EnumC5052.CONST_CLASS;
        EnumC14088 enumC14089 = EnumC14088.TYPE_REF;
        m32773(c13225Arr, 28, enumC50511, abstractC154610, enumC14089);
        m32772(c13225Arr, 29, EnumC5052.MONITOR_ENTER, abstractC15466);
        m32772(c13225Arr, 30, EnumC5052.MONITOR_EXIT, abstractC15466);
        m32773(c13225Arr, 31, EnumC5052.CHECK_CAST, abstractC154610, enumC14089);
        EnumC5052 enumC50512 = EnumC5052.INSTANCE_OF;
        AbstractC15462 abstractC154611 = AbstractC15462.f50358;
        m32773(c13225Arr, 32, enumC50512, abstractC154611, enumC14089);
        m32772(c13225Arr, 33, EnumC5052.ARRAY_LENGTH, abstractC15463);
        m32773(c13225Arr, 34, EnumC5052.NEW_INSTANCE, abstractC154610, enumC14089);
        m32773(c13225Arr, 35, EnumC5052.NEW_ARRAY, abstractC154611, enumC14089);
        EnumC5052 enumC50513 = EnumC5052.FILLED_NEW_ARRAY;
        AbstractC15462 abstractC154612 = AbstractC15462.f50361;
        m32773(c13225Arr, 36, enumC50513, abstractC154612, enumC14089);
        EnumC5052 enumC50514 = EnumC5052.FILLED_NEW_ARRAY_RANGE;
        AbstractC15462 abstractC154613 = AbstractC15462.f50341;
        m32773(c13225Arr, 37, enumC50514, abstractC154613, enumC14089);
        EnumC5052 enumC50515 = EnumC5052.FILL_ARRAY_DATA;
        AbstractC15462 abstractC154614 = AbstractC15462.f50356;
        m32772(c13225Arr, 38, enumC50515, abstractC154614);
        m32772(c13225Arr, 39, EnumC5052.THROW, abstractC15466);
        EnumC5052 enumC50516 = EnumC5052.GOTO;
        m32772(c13225Arr, 40, enumC50516, AbstractC15462.f50352);
        m32772(c13225Arr, 41, enumC50516, AbstractC15462.f50347);
        m32772(c13225Arr, 42, enumC50516, AbstractC15462.f50348);
        m32772(c13225Arr, 43, EnumC5052.PACKED_SWITCH, abstractC154614);
        m32772(c13225Arr, 44, EnumC5052.SPARSE_SWITCH, abstractC154614);
        EnumC5052 enumC50517 = EnumC5052.CMPL_FLOAT;
        AbstractC15462 abstractC154615 = AbstractC15462.f50354;
        m32772(c13225Arr, 45, enumC50517, abstractC154615);
        m32772(c13225Arr, 46, EnumC5052.CMPG_FLOAT, abstractC154615);
        m32772(c13225Arr, 47, EnumC5052.CMPL_DOUBLE, abstractC154615);
        m32772(c13225Arr, 48, EnumC5052.CMPG_DOUBLE, abstractC154615);
        m32772(c13225Arr, 49, EnumC5052.CMP_LONG, abstractC154615);
        EnumC5052 enumC50518 = EnumC5052.IF_EQ;
        AbstractC15462 abstractC154616 = AbstractC15462.f50345;
        m32772(c13225Arr, 50, enumC50518, abstractC154616);
        m32772(c13225Arr, 51, EnumC5052.IF_NE, abstractC154616);
        m32772(c13225Arr, 52, EnumC5052.IF_LT, abstractC154616);
        m32772(c13225Arr, 53, EnumC5052.IF_GE, abstractC154616);
        m32772(c13225Arr, 54, EnumC5052.IF_GT, abstractC154616);
        m32772(c13225Arr, 55, EnumC5052.IF_LE, abstractC154616);
        EnumC5052 enumC50519 = EnumC5052.IF_EQZ;
        AbstractC15462 abstractC154617 = AbstractC15462.f50359;
        m32772(c13225Arr, 56, enumC50519, abstractC154617);
        m32772(c13225Arr, 57, EnumC5052.IF_NEZ, abstractC154617);
        m32772(c13225Arr, 58, EnumC5052.IF_LTZ, abstractC154617);
        m32772(c13225Arr, 59, EnumC5052.IF_GEZ, abstractC154617);
        m32772(c13225Arr, 60, EnumC5052.IF_GTZ, abstractC154617);
        m32772(c13225Arr, 61, EnumC5052.IF_LEZ, abstractC154617);
        m32772(c13225Arr, 68, EnumC5052.AGET, abstractC154615);
        m32772(c13225Arr, 69, EnumC5052.AGET_WIDE, abstractC154615);
        m32772(c13225Arr, 70, EnumC5052.AGET_OBJECT, abstractC154615);
        m32772(c13225Arr, 71, EnumC5052.AGET_BOOLEAN, abstractC154615);
        m32772(c13225Arr, 72, EnumC5052.AGET_BYTE, abstractC154615);
        m32772(c13225Arr, 73, EnumC5052.AGET_CHAR, abstractC154615);
        m32772(c13225Arr, 74, EnumC5052.AGET_SHORT, abstractC154615);
        m32772(c13225Arr, 75, EnumC5052.APUT, abstractC154615);
        m32772(c13225Arr, 76, EnumC5052.APUT_WIDE, abstractC154615);
        m32772(c13225Arr, 77, EnumC5052.APUT_OBJECT, abstractC154615);
        m32772(c13225Arr, 78, EnumC5052.APUT_BOOLEAN, abstractC154615);
        m32772(c13225Arr, 79, EnumC5052.APUT_BYTE, abstractC154615);
        m32772(c13225Arr, 80, EnumC5052.APUT_CHAR, abstractC154615);
        m32772(c13225Arr, 81, EnumC5052.APUT_SHORT, abstractC154615);
        EnumC5052 enumC50520 = EnumC5052.IGET;
        EnumC14088 enumC140810 = EnumC14088.FIELD_REF;
        m32773(c13225Arr, 82, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 83, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 84, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 85, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 86, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 87, enumC50520, abstractC154611, enumC140810);
        m32773(c13225Arr, 88, enumC50520, abstractC154611, enumC140810);
        EnumC5052 enumC50521 = EnumC5052.IPUT;
        m32773(c13225Arr, 89, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 90, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 91, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 92, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 93, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 94, enumC50521, abstractC154611, enumC140810);
        m32773(c13225Arr, 95, enumC50521, abstractC154611, enumC140810);
        EnumC5052 enumC50522 = EnumC5052.SGET;
        m32773(c13225Arr, 96, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, 97, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, 98, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, 99, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, 100, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, 101, enumC50522, abstractC154610, enumC140810);
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_attachUserService, enumC50522, abstractC154610, enumC140810);
        EnumC5052 enumC50523 = EnumC5052.SPUT;
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_isHidden, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_getFlagsForUid, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, 108, enumC50523, abstractC154610, enumC140810);
        m32773(c13225Arr, 109, enumC50523, abstractC154610, enumC140810);
        EnumC5052 enumC50524 = EnumC5052.INVOKE_VIRTUAL;
        EnumC14088 enumC140811 = EnumC14088.METHOD_REF;
        m32773(c13225Arr, UMErrorCode.E_UM_BE_JSON_FAILED, enumC50524, abstractC154612, enumC140811);
        m32773(c13225Arr, UMErrorCode.E_UM_BE_CREATE_FAILED, EnumC5052.INVOKE_SUPER, abstractC154612, enumC140811);
        m32773(c13225Arr, UMErrorCode.E_UM_BE_DEFLATE_FAILED, EnumC5052.INVOKE_DIRECT, abstractC154612, enumC140811);
        m32773(c13225Arr, UMErrorCode.E_UM_BE_RAW_OVERSIZE, EnumC5052.INVOKE_STATIC, abstractC154612, enumC140811);
        m32773(c13225Arr, 114, EnumC5052.INVOKE_INTERFACE, abstractC154612, enumC140811);
        m32773(c13225Arr, 116, EnumC5052.INVOKE_VIRTUAL_RANGE, abstractC154613, enumC140811);
        m32773(c13225Arr, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, EnumC5052.INVOKE_SUPER_RANGE, abstractC154613, enumC140811);
        m32773(c13225Arr, 118, EnumC5052.INVOKE_DIRECT_RANGE, abstractC154613, enumC140811);
        m32773(c13225Arr, 119, EnumC5052.INVOKE_STATIC_RANGE, abstractC154613, enumC140811);
        m32773(c13225Arr, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, EnumC5052.INVOKE_INTERFACE_RANGE, abstractC154613, enumC140811);
        m32772(c13225Arr, 123, EnumC5052.NEG_INT, abstractC15463);
        m32772(c13225Arr, 124, EnumC5052.NOT_INT, abstractC15463);
        m32772(c13225Arr, q.h, EnumC5052.NEG_LONG, abstractC15463);
        m32772(c13225Arr, 126, EnumC5052.NOT_LONG, abstractC15463);
        m32772(c13225Arr, 127, EnumC5052.NEG_FLOAT, abstractC15463);
        m32772(c13225Arr, 128, EnumC5052.NEG_DOUBLE, abstractC15463);
        m32772(c13225Arr, 129, EnumC5052.INT_TO_LONG, abstractC15463);
        m32772(c13225Arr, 130, EnumC5052.INT_TO_FLOAT, abstractC15463);
        m32772(c13225Arr, 131, EnumC5052.INT_TO_DOUBLE, abstractC15463);
        m32772(c13225Arr, 132, EnumC5052.LONG_TO_INT, abstractC15463);
        m32772(c13225Arr, 133, EnumC5052.LONG_TO_FLOAT, abstractC15463);
        m32772(c13225Arr, 134, EnumC5052.LONG_TO_DOUBLE, abstractC15463);
        m32772(c13225Arr, 135, EnumC5052.FLOAT_TO_INT, abstractC15463);
        m32772(c13225Arr, 136, EnumC5052.FLOAT_TO_LONG, abstractC15463);
        m32772(c13225Arr, 137, EnumC5052.FLOAT_TO_DOUBLE, abstractC15463);
        m32772(c13225Arr, 138, EnumC5052.DOUBLE_TO_INT, abstractC15463);
        m32772(c13225Arr, 139, EnumC5052.DOUBLE_TO_LONG, abstractC15463);
        m32772(c13225Arr, 140, EnumC5052.DOUBLE_TO_FLOAT, abstractC15463);
        m32772(c13225Arr, 141, EnumC5052.INT_TO_BYTE, abstractC15463);
        m32772(c13225Arr, 142, EnumC5052.INT_TO_CHAR, abstractC15463);
        m32772(c13225Arr, 143, EnumC5052.INT_TO_SHORT, abstractC15463);
        EnumC5052 enumC50525 = EnumC5052.ADD_INT;
        m32772(c13225Arr, 144, enumC50525, abstractC154615);
        EnumC5052 enumC50526 = EnumC5052.SUB_INT;
        m32772(c13225Arr, 145, enumC50526, abstractC154615);
        EnumC5052 enumC50527 = EnumC5052.MUL_INT;
        m32772(c13225Arr, 146, enumC50527, abstractC154615);
        EnumC5052 enumC50528 = EnumC5052.DIV_INT;
        m32772(c13225Arr, 147, enumC50528, abstractC154615);
        EnumC5052 enumC50529 = EnumC5052.REM_INT;
        m32772(c13225Arr, 148, enumC50529, abstractC154615);
        EnumC5052 enumC50530 = EnumC5052.AND_INT;
        m32772(c13225Arr, 149, enumC50530, abstractC154615);
        EnumC5052 enumC50531 = EnumC5052.OR_INT;
        m32772(c13225Arr, 150, enumC50531, abstractC154615);
        EnumC5052 enumC50532 = EnumC5052.XOR_INT;
        m32772(c13225Arr, 151, enumC50532, abstractC154615);
        EnumC5052 enumC50533 = EnumC5052.SHL_INT;
        m32772(c13225Arr, 152, enumC50533, abstractC154615);
        EnumC5052 enumC50534 = EnumC5052.SHR_INT;
        m32772(c13225Arr, 153, enumC50534, abstractC154615);
        EnumC5052 enumC50535 = EnumC5052.USHR_INT;
        m32772(c13225Arr, EnumC24309.f78687, enumC50535, abstractC154615);
        EnumC5052 enumC50536 = EnumC5052.ADD_LONG;
        m32772(c13225Arr, 155, enumC50536, abstractC154615);
        EnumC5052 enumC50537 = EnumC5052.SUB_LONG;
        m32772(c13225Arr, 156, enumC50537, abstractC154615);
        EnumC5052 enumC50538 = EnumC5052.MUL_LONG;
        m32772(c13225Arr, 157, enumC50538, abstractC154615);
        EnumC5052 enumC50539 = EnumC5052.DIV_LONG;
        m32772(c13225Arr, 158, enumC50539, abstractC154615);
        EnumC5052 enumC50540 = EnumC5052.REM_LONG;
        m32772(c13225Arr, 159, enumC50540, abstractC154615);
        EnumC5052 enumC50541 = EnumC5052.AND_LONG;
        m32772(c13225Arr, DHParameters.DEFAULT_MINIMUM_LENGTH, enumC50541, abstractC154615);
        EnumC5052 enumC50542 = EnumC5052.OR_LONG;
        m32772(c13225Arr, 161, enumC50542, abstractC154615);
        EnumC5052 enumC50543 = EnumC5052.XOR_LONG;
        m32772(c13225Arr, 162, enumC50543, abstractC154615);
        EnumC5052 enumC50544 = EnumC5052.SHL_LONG;
        m32772(c13225Arr, 163, enumC50544, abstractC154615);
        EnumC5052 enumC50545 = EnumC5052.SHR_LONG;
        m32772(c13225Arr, 164, enumC50545, abstractC154615);
        EnumC5052 enumC50546 = EnumC5052.USHR_LONG;
        m32772(c13225Arr, 165, enumC50546, abstractC154615);
        EnumC5052 enumC50547 = EnumC5052.ADD_FLOAT;
        m32772(c13225Arr, 166, enumC50547, abstractC154615);
        EnumC5052 enumC50548 = EnumC5052.SUB_FLOAT;
        m32772(c13225Arr, 167, enumC50548, abstractC154615);
        EnumC5052 enumC50549 = EnumC5052.MUL_FLOAT;
        m32772(c13225Arr, 168, enumC50549, abstractC154615);
        EnumC5052 enumC50550 = EnumC5052.DIV_FLOAT;
        m32772(c13225Arr, 169, enumC50550, abstractC154615);
        EnumC5052 enumC50551 = EnumC5052.REM_FLOAT;
        m32772(c13225Arr, 170, enumC50551, abstractC154615);
        EnumC5052 enumC50552 = EnumC5052.ADD_DOUBLE;
        m32772(c13225Arr, 171, enumC50552, abstractC154615);
        EnumC5052 enumC50553 = EnumC5052.SUB_DOUBLE;
        m32772(c13225Arr, 172, enumC50553, abstractC154615);
        EnumC5052 enumC50554 = EnumC5052.MUL_DOUBLE;
        m32772(c13225Arr, 173, enumC50554, abstractC154615);
        EnumC5052 enumC50555 = EnumC5052.DIV_DOUBLE;
        m32772(c13225Arr, 174, enumC50555, abstractC154615);
        EnumC5052 enumC50556 = EnumC5052.REM_DOUBLE;
        m32772(c13225Arr, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, enumC50556, abstractC154615);
        m32772(c13225Arr, PicnicEngine.MAX_AUX_BYTES, enumC50525, abstractC15463);
        m32772(c13225Arr, 177, enumC50526, abstractC15463);
        m32772(c13225Arr, 178, enumC50527, abstractC15463);
        m32772(c13225Arr, 179, enumC50528, abstractC15463);
        m32772(c13225Arr, 180, enumC50529, abstractC15463);
        m32772(c13225Arr, 181, enumC50530, abstractC15463);
        m32772(c13225Arr, 182, enumC50531, abstractC15463);
        m32772(c13225Arr, 183, enumC50532, abstractC15463);
        m32772(c13225Arr, 184, enumC50533, abstractC15463);
        m32772(c13225Arr, 185, enumC50534, abstractC15463);
        m32772(c13225Arr, 186, enumC50535, abstractC15463);
        m32772(c13225Arr, 187, enumC50536, abstractC15463);
        m32772(c13225Arr, 188, enumC50537, abstractC15463);
        m32772(c13225Arr, 189, enumC50538, abstractC15463);
        m32772(c13225Arr, 190, enumC50539, abstractC15463);
        m32772(c13225Arr, 191, enumC50540, abstractC15463);
        m32772(c13225Arr, 192, enumC50541, abstractC15463);
        m32772(c13225Arr, 193, enumC50542, abstractC15463);
        m32772(c13225Arr, 194, enumC50543, abstractC15463);
        m32772(c13225Arr, 195, enumC50544, abstractC15463);
        m32772(c13225Arr, 196, enumC50545, abstractC15463);
        m32772(c13225Arr, 197, enumC50546, abstractC15463);
        m32772(c13225Arr, 198, enumC50547, abstractC15463);
        m32772(c13225Arr, 199, enumC50548, abstractC15463);
        m32772(c13225Arr, 200, enumC50549, abstractC15463);
        m32772(c13225Arr, 201, enumC50550, abstractC15463);
        m32772(c13225Arr, 202, enumC50551, abstractC15463);
        m32772(c13225Arr, 203, enumC50552, abstractC15463);
        m32772(c13225Arr, 204, enumC50553, abstractC15463);
        m32772(c13225Arr, 205, enumC50554, abstractC15463);
        m32772(c13225Arr, 206, enumC50555, abstractC15463);
        m32772(c13225Arr, 207, enumC50556, abstractC15463);
        EnumC5052 enumC50557 = EnumC5052.ADD_INT_LIT;
        AbstractC15462 abstractC154618 = AbstractC15462.f50367;
        m32772(c13225Arr, 208, enumC50557, abstractC154618);
        EnumC5052 enumC50558 = EnumC5052.RSUB_INT;
        m32772(c13225Arr, 209, enumC50558, abstractC154618);
        EnumC5052 enumC50559 = EnumC5052.MUL_INT_LIT;
        m32772(c13225Arr, 210, enumC50559, abstractC154618);
        EnumC5052 enumC50560 = EnumC5052.DIV_INT_LIT;
        m32772(c13225Arr, Primes.SMALL_FACTOR_LIMIT, enumC50560, abstractC154618);
        EnumC5052 enumC50561 = EnumC5052.REM_INT_LIT;
        m32772(c13225Arr, 212, enumC50561, abstractC154618);
        EnumC5052 enumC50562 = EnumC5052.AND_INT_LIT;
        m32772(c13225Arr, 213, enumC50562, abstractC154618);
        EnumC5052 enumC50563 = EnumC5052.OR_INT_LIT;
        m32772(c13225Arr, 214, enumC50563, abstractC154618);
        EnumC5052 enumC50564 = EnumC5052.XOR_INT_LIT;
        m32772(c13225Arr, 215, enumC50564, abstractC154618);
        AbstractC15462 abstractC154619 = AbstractC15462.f50360;
        m32772(c13225Arr, 216, enumC50557, abstractC154619);
        m32772(c13225Arr, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, enumC50558, abstractC154619);
        m32772(c13225Arr, 218, enumC50559, abstractC154619);
        m32772(c13225Arr, 219, enumC50560, abstractC154619);
        m32772(c13225Arr, 220, enumC50561, abstractC154619);
        m32772(c13225Arr, 221, enumC50562, abstractC154619);
        m32772(c13225Arr, 222, enumC50563, abstractC154619);
        m32772(c13225Arr, 223, enumC50564, abstractC154619);
        m32772(c13225Arr, BERTags.FLAGS, EnumC5052.SHL_INT_LIT, abstractC154619);
        m32772(c13225Arr, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, EnumC5052.SHR_INT_LIT, abstractC154619);
        m32772(c13225Arr, 226, EnumC5052.USHR_INT_LIT, abstractC154619);
        m32773(c13225Arr, 250, EnumC5052.INVOKE_POLYMORPHIC, AbstractC15462.f50349, enumC140811);
        m32773(c13225Arr, 251, EnumC5052.INVOKE_POLYMORPHIC_RANGE, AbstractC15462.f50362, enumC140811);
        EnumC5052 enumC50565 = EnumC5052.INVOKE_CUSTOM;
        EnumC14088 enumC140812 = EnumC14088.CALL_SITE;
        m32773(c13225Arr, 252, enumC50565, abstractC154612, enumC140812);
        m32773(c13225Arr, 253, EnumC5052.INVOKE_CUSTOM_RANGE, abstractC154613, enumC140812);
        m32772(c13225Arr, Scalar25519.TARGET_LENGTH, EnumC5052.CONST_METHOD_HANDLE, abstractC154610);
        m32772(c13225Arr, 255, EnumC5052.CONST_METHOD_TYPE, abstractC154610);
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(3);
        f42279 = concurrentMapC17249;
        EnumC5052 enumC50566 = EnumC5052.PACKED_SWITCH_PAYLOAD;
        EnumC14088 enumC140813 = EnumC14088.NONE;
        concurrentMapC17249.put(256, new C13225(256, enumC50566, AbstractC15462.f50350, enumC140813));
        concurrentMapC17249.put(512, new C13225(512, EnumC5052.SPARSE_SWITCH_PAYLOAD, AbstractC15462.f50344, enumC140813));
        concurrentMapC17249.put(768, new C13225(768, EnumC5052.FILL_ARRAY_DATA_PAYLOAD, AbstractC15462.f50342, enumC140813));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32772(C13225[] c13225Arr, int i, EnumC5052 enumC5052, AbstractC15462 abstractC15462) {
        c13225Arr[i] = new C13225(i, enumC5052, abstractC15462, EnumC14088.NONE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32773(C13225[] c13225Arr, int i, EnumC5052 enumC5052, AbstractC15462 abstractC15462, EnumC14088 enumC14088) {
        c13225Arr[i] = new C13225(i, enumC5052, abstractC15462, enumC14088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13225 m32771(int i) {
        int i2 = i & 255;
        if (i2 == 0 && i != 0) {
            return (C13225) f42279.get(Integer.valueOf(i));
        }
        return f42280[i2];
    }

    public C13225(int i, EnumC5052 enumC5052, AbstractC15462 abstractC15462, EnumC14088 enumC14088) {
        this.f42284 = i;
        this.f42281 = enumC5052;
        this.f42283 = abstractC15462;
        this.f42282 = enumC14088;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5052 m32774() {
        return this.f42281;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC15462 m32776() {
        return this.f42283;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC14088 m32775() {
        return this.f42282;
    }

    public final String toString() {
        Integer numValueOf = Integer.valueOf(this.f42284);
        AbstractC15462 abstractC15462 = this.f42283;
        return String.format("0x%X :%d%d", numValueOf, Integer.valueOf(abstractC15462.m37023()), Integer.valueOf(abstractC15462.m37024()));
    }
}
