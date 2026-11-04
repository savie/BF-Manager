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

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܽᩴ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֨ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O56L */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1114 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3941;

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3942;

    /* JADX INFO: renamed from: ֡ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3943;

    /* JADX INFO: renamed from: ֡ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3944;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3945;

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3946;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3947;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3948;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3949;

    /* JADX INFO: renamed from: ֨ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3950;

    /* JADX INFO: renamed from: ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3951;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3952;

    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3953;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3954;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3955;

    /* JADX INFO: renamed from: ֫۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3956;

    /* JADX INFO: renamed from: ֫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3957;

    /* JADX INFO: renamed from: ֫ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3958;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3959;

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3961;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3962;

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3963;

    /* JADX INFO: renamed from: ۖܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3964;

    /* JADX INFO: renamed from: ۖᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3965;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3966;

    /* JADX INFO: renamed from: ۖ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3967;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3968;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3969;

    /* JADX INFO: renamed from: ۗ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114[] f3970;

    /* JADX INFO: renamed from: ۗܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3971;

    /* JADX INFO: renamed from: ۗᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3972;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3973;

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3974;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3975;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3976;

    /* JADX INFO: renamed from: ۘܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3977;

    /* JADX INFO: renamed from: ۘᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3978;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3979;

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3980;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3981;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3982;

    /* JADX INFO: renamed from: ۙ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3983;

    /* JADX INFO: renamed from: ۙܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3984;

    /* JADX INFO: renamed from: ۙᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3985;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3986;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3987;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3988;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3989;

    /* JADX INFO: renamed from: ۚ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3990;

    /* JADX INFO: renamed from: ۚܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3991;

    /* JADX INFO: renamed from: ۚᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3992;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3993;

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3994;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3995;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3996;

    /* JADX INFO: renamed from: ۛܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3997;

    /* JADX INFO: renamed from: ۛᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3998;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f3999;

    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4000;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4001;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4002;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4003;

    /* JADX INFO: renamed from: ۜܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4004;

    /* JADX INFO: renamed from: ۜᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4005;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4006;

    /* JADX INFO: renamed from: ۜ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4007;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4008;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4009;

    /* JADX INFO: renamed from: ۟ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4010;

    /* JADX INFO: renamed from: ۟ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4011;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4012;

    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4013;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4014;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4015;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4016;

    /* JADX INFO: renamed from: ۠ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4017;

    /* JADX INFO: renamed from: ۠ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4018;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4019;

    /* JADX INFO: renamed from: ۠᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4020;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4021;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4022;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4023;

    /* JADX INFO: renamed from: ۡܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4024;

    /* JADX INFO: renamed from: ۡᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4025;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4026;

    /* JADX INFO: renamed from: ۡ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4027;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1114[] f4028;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4029;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4030;

    /* JADX INFO: renamed from: ۢܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4031;

    /* JADX INFO: renamed from: ۢᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4032;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4033;

    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4034;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4035;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4036;

    /* JADX INFO: renamed from: ۤ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4037;

    /* JADX INFO: renamed from: ۤܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4038;

    /* JADX INFO: renamed from: ۤᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4039;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4040;

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4041;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4042;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4043;

    /* JADX INFO: renamed from: ۧ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4044;

    /* JADX INFO: renamed from: ۧܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4045;

    /* JADX INFO: renamed from: ۧᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4046;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4047;

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4048;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4049;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4050;

    /* JADX INFO: renamed from: ۨܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4051;

    /* JADX INFO: renamed from: ۨᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4052;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4053;

    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4054;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4055;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4056;

    /* JADX INFO: renamed from: ۫۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4057;

    /* JADX INFO: renamed from: ۫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4058;

    /* JADX INFO: renamed from: ۫ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4059;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4060;

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4061;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4062;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4063;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4064;

    /* JADX INFO: renamed from: ۬ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4065;

    /* JADX INFO: renamed from: ۬ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4066;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4067;

    /* JADX INFO: renamed from: ۬᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4068;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4069;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4070;

    /* JADX INFO: renamed from: ܰܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4071;

    /* JADX INFO: renamed from: ܰᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4072;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4073;

    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4074;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4075;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4076;

    /* JADX INFO: renamed from: ܳ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4077;

    /* JADX INFO: renamed from: ܳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4078;

    /* JADX INFO: renamed from: ܳᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4079;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4080;

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4081;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4082;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4083;

    /* JADX INFO: renamed from: ܶ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4084;

    /* JADX INFO: renamed from: ܶܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4085;

    /* JADX INFO: renamed from: ܶᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4086;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4087;

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4088;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4089;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4090;

    /* JADX INFO: renamed from: ܺ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4091;

    /* JADX INFO: renamed from: ܺܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4092;

    /* JADX INFO: renamed from: ܺᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4093;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4094;

    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4095;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4096;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4097;

    /* JADX INFO: renamed from: ܽ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4098;

    /* JADX INFO: renamed from: ܽܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4099;

    /* JADX INFO: renamed from: ܽᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4100;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4101;

    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4102;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4103;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4104;

    /* JADX INFO: renamed from: ܿܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4105;

    /* JADX INFO: renamed from: ܿᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4106;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4107;

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4108;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4109;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4110;

    /* JADX INFO: renamed from: ᩳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4111;

    /* JADX INFO: renamed from: ᩳᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4112;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4113;

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4114;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4115;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4116;

    /* JADX INFO: renamed from: ᩴ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4117;

    /* JADX INFO: renamed from: ᩴܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4118;

    /* JADX INFO: renamed from: ᩴᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4119;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4120;

    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4121;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4122;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4123;

    /* JADX INFO: renamed from: ᩵ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4124;

    /* JADX INFO: renamed from: ᩵ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4125;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4126;

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4127;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4128;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4129;

    /* JADX INFO: renamed from: ᩶ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4130;

    /* JADX INFO: renamed from: ᩶ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4131;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4132;

    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4133;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4134;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4135;

    /* JADX INFO: renamed from: ᩷۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4136;

    /* JADX INFO: renamed from: ᩷ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4137;

    /* JADX INFO: renamed from: ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4138;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4139;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4140;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4141;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4142;

    /* JADX INFO: renamed from: ᩸۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4143;

    /* JADX INFO: renamed from: ᩸ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4144;

    /* JADX INFO: renamed from: ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4145;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4146;

    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4147;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4148;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4149;

    /* JADX INFO: renamed from: ᩹۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4150;

    /* JADX INFO: renamed from: ᩹ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4151;

    /* JADX INFO: renamed from: ᩹ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4152;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4153;

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4154;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4155;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4156;

    /* JADX INFO: renamed from: ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4157;

    /* JADX INFO: renamed from: ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4158;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4159;

    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4160;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4161;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4162;

    /* JADX INFO: renamed from: ᩻۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4163;

    /* JADX INFO: renamed from: ᩻ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4164;

    /* JADX INFO: renamed from: ᩻ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4165;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4166;

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC1114 f4167;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC19013 f4168;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC10062 f4169;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f4170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4171;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f4173;

    public static EnumC1114 valueOf(String str) {
        return (EnumC1114) Enum.valueOf(EnumC1114.class, str);
    }

    public static EnumC1114[] values() {
        return (EnumC1114[]) f4028.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1114[] m4130() {
        return new EnumC1114[]{f4100, f4054, f3980, f4000, f4034, f4027, f3953, f4074, f4108, f4133, f3946, f4114, f4013, f4160, f3984, f4005, f4137, f4066, f3986, f4063, f4002, f4040, f3959, f4047, f3993, f4166, f4080, f4060, f4139, f3974, f4127, f4109, f3996, f3941, f4093, f4165, f3945, f4012, f4113, f4143, f3966, f4019, f4006, f4072, f4071, f3962, f3948, f4022, f4029, f4015, f4067, f4043, f3989, f4135, f4142, f4076, f3982, f4162, f3955, f4036, f4116, f4056, f4115, f4161, f3954, f4075, f4055, f3988, f4042, f4049, f4103, f4069, f3995, f4155, f3975, f4128, f4090, f4050, f3969, f4097, f4083, f4149, f4123, f4081, f4095, f4048, f4061, f3994, f3960, f4167, f4118, f4164, f3957, f4078, f4058, f3991, f4045, f4130, f3950, f4111, f4105, f3943, f4010, f4031, f4147, f4140, f4030, f4064, f4023, f4121, f4041, f3949, f3987, f3963, f3958, f4086, f4046, f4152, f3992, f4059, f4104, f4129, f4070, f4154, f4088, f4102, f3952, f4026, f4033, f4132, f4107, f4073, f4156, f3976, f3942, f4001, f4065, f3985, f3973, f4112, f4089, f3972, f4044, f4092, f4124, f4117, f4035, f4136, f4119, f4159, f3965, f3968, f4158, f4084, f4151, f4157, f3990, f3961, f4017, f4007, f4087, f3944, f3947, f4024, f3967, f4094, f4131, f4062, f3983, f4138, f4126, f4032, f4096, f4125, f4163, f4099, f4051, f4077, f4141, f4037, f4079, f3979, f4018, f4122, f3978, f4150, f3971, f3977, f3956, f4014, f4004, f4068, f4153, f4011, f4021, f3964, f4020, f4101, f4106, f3981, f4038, f4039, f4053, f3951, f4082, f4052, f4091, f4134, f4144, f4145, f3999, f4025, f4148, f3998, f4098, f4085, f3997, f4057, f4016, f4003, f4009, f4110, f4146, f4120, f4008};
    }

    static {
        EnumC19013 enumC19013 = EnumC19013.kFmt10x;
        EnumC10062 enumC10062 = EnumC10062.kIndexNone;
        f4100 = new EnumC1114("NOP", 0, 0, "nop", enumC19013, enumC10062, 2, false);
        EnumC19013 enumC19014 = EnumC19013.kFmt12x;
        f4054 = new EnumC1114("MOVE", 1, 1, "move", enumC19014, enumC10062, 2, true);
        EnumC19013 enumC19015 = EnumC19013.kFmt22x;
        f3980 = new EnumC1114("MOVE_FROM16", 2, 2, "move/from16", enumC19015, enumC10062, 2, true);
        EnumC19013 enumC19016 = EnumC19013.kFmt32x;
        f4000 = new EnumC1114("MOVE_16", 3, 3, "move/16", enumC19016, enumC10062, 2, true);
        f4034 = new EnumC1114("MOVE_WIDE", 4, 4, "move-wide", enumC19014, enumC10062, 2, true);
        f4027 = new EnumC1114("MOVE_WIDE_FROM16", 5, 5, "move-wide/from16", enumC19015, enumC10062, 2, true);
        f3953 = new EnumC1114("MOVE_WIDE_16", 6, 6, "move-wide/16", enumC19016, enumC10062, 2, true);
        f4074 = new EnumC1114("MOVE_OBJECT", 7, 7, "move-object", enumC19014, enumC10062, 2, true);
        f4108 = new EnumC1114("MOVE_OBJECT_FROM16", 8, 8, "move-object/from16", enumC19015, enumC10062, 2, true);
        f4133 = new EnumC1114("MOVE_OBJECT_16", 9, 9, "move-object/16", enumC19016, enumC10062, 2, true);
        EnumC19013 enumC19017 = EnumC19013.kFmt11x;
        f3946 = new EnumC1114("MOVE_RESULT", 10, 10, "move-result", enumC19017, enumC10062, 2, true);
        f4114 = new EnumC1114("MOVE_RESULT_WIDE", 11, 11, "move-result-wide", enumC19017, enumC10062, 2, true);
        f4013 = new EnumC1114("MOVE_RESULT_OBJECT", 12, 12, "move-result-object", enumC19017, enumC10062, 2, true);
        f4160 = new EnumC1114("MOVE_EXCEPTION", 13, 13, "move-exception", enumC19017, enumC10062, 2, true);
        f3984 = new EnumC1114("RETURN_VOID", 14, 14, "return-void", enumC19013, enumC10062, 16, false);
        f4005 = new EnumC1114("RETURN", 15, 15, "return", enumC19017, enumC10062, 16, false);
        f4137 = new EnumC1114("RETURN_WIDE", 16, 16, "return-wide", enumC19017, enumC10062, 16, false);
        f4066 = new EnumC1114("RETURN_OBJECT", 17, 17, "return-object", enumC19017, enumC10062, 16, false);
        f3986 = new EnumC1114("CONST_4", 18, 18, "const/4", EnumC19013.kFmt11n, enumC10062, 2, true);
        EnumC19013 enumC19018 = EnumC19013.kFmt21s;
        f4063 = new EnumC1114("CONST_16", 19, 19, "const/16", enumC19018, enumC10062, 2, true);
        EnumC19013 enumC19019 = EnumC19013.kFmt31i;
        f4002 = new EnumC1114("CONST", 20, 20, "const", enumC19019, enumC10062, 2, true);
        EnumC19013 enumC190110 = EnumC19013.kFmt21h;
        f4040 = new EnumC1114("CONST_HIGH16", 21, 21, "const/high16", enumC190110, enumC10062, 2, true);
        f3959 = new EnumC1114("CONST_WIDE_16", 22, 22, "const-wide/16", enumC19018, enumC10062, 2, true);
        f4047 = new EnumC1114("CONST_WIDE_32", 23, 23, "const-wide/32", enumC19019, enumC10062, 2, true);
        f3993 = new EnumC1114("CONST_WIDE", 24, 24, "const-wide", EnumC19013.kFmt51l, enumC10062, 2, true);
        f4166 = new EnumC1114("CONST_WIDE_HIGH16", 25, 25, "const-wide/high16", enumC190110, enumC10062, 2, true);
        EnumC19013 enumC190111 = EnumC19013.kFmt21c;
        EnumC10062 enumC10063 = EnumC10062.kIndexStringRef;
        f4080 = new EnumC1114("CONST_STRING", 26, 26, "const-string", enumC190111, enumC10063, 10, true);
        f4060 = new EnumC1114("CONST_STRING_JUMBO", 27, 27, "const-string/jumbo", EnumC19013.kFmt31c, enumC10063, 10, true);
        EnumC10062 enumC10064 = EnumC10062.kIndexTypeRef;
        f4139 = new EnumC1114("CONST_CLASS", 28, 28, "const-class", enumC190111, enumC10064, 10, true);
        f3974 = new EnumC1114("MONITOR_ENTER", 29, 29, "monitor-enter", enumC19017, enumC10062, 10, false);
        f4127 = new EnumC1114("MONITOR_EXIT", 30, 30, "monitor-exit", enumC19017, enumC10062, 10, false);
        f4109 = new EnumC1114("CHECK_CAST", 31, 31, "check-cast", enumC190111, enumC10064, 10, true);
        EnumC19013 enumC190112 = EnumC19013.kFmt22c;
        f3996 = new EnumC1114("INSTANCE_OF", 32, 32, "instance-of", enumC190112, enumC10064, 10, true);
        f3941 = new EnumC1114("ARRAY_LENGTH", 33, 33, "array-length", enumC19014, enumC10062, 10, true);
        f4093 = new EnumC1114("NEW_INSTANCE", 34, 34, "new-instance", enumC190111, enumC10064, 10, true);
        f4165 = new EnumC1114("NEW_ARRAY", 35, 35, "new-array", enumC190112, enumC10064, 10, true);
        EnumC19013 enumC190113 = EnumC19013.kFmt35c;
        f3945 = new EnumC1114("FILLED_NEW_ARRAY", 36, 36, "filled-new-array", enumC190113, enumC10064, 10, true);
        EnumC19013 enumC190114 = EnumC19013.kFmt3rc;
        f4012 = new EnumC1114("FILLED_NEW_ARRAY_RANGE", 37, 37, "filled-new-array/range", enumC190114, enumC10064, 10, true);
        EnumC19013 enumC190115 = EnumC19013.kFmt31t;
        f4113 = new EnumC1114("FILL_ARRAY_DATA", 38, 38, "fill-array-data", enumC190115, enumC10062, 2, false);
        f4143 = new EnumC1114("THROW", 39, 39, "throw", enumC19017, enumC10062, 8, false);
        f3966 = new EnumC1114("GOTO", 40, 40, "goto", EnumC19013.kFmt10t, enumC10062, 1, false);
        f4019 = new EnumC1114("GOTO_16", 41, 41, "goto/16", EnumC19013.kFmt20t, enumC10062, 1, false);
        f4006 = new EnumC1114("GOTO_32", 42, 42, "goto/32", EnumC19013.kFmt30t, enumC10062, 1, false);
        f4072 = new EnumC1114("PACKED_SWITCH", 43, 43, "packed-switch", enumC190115, enumC10062, 6, false);
        f4071 = new EnumC1114("SPARSE_SWITCH", 44, 44, "sparse-switch", enumC190115, enumC10062, 6, false);
        EnumC19013 enumC190116 = EnumC19013.kFmt23x;
        f3962 = new EnumC1114("CMPL_FLOAT", 45, 45, "cmpl-float", enumC190116, enumC10062, 2, false);
        f3948 = new EnumC1114("CMPG_FLOAT", 46, 46, "cmpg-float", enumC190116, enumC10062, 2, false);
        f4022 = new EnumC1114("CMPL_DOUBLE", 47, 47, "cmpl-double", enumC190116, enumC10062, 2, false);
        f4029 = new EnumC1114("CMPG_DOUBLE", 48, 48, "cmpg-double", enumC190116, enumC10062, 2, false);
        f4015 = new EnumC1114("CMP_LONG", 49, 49, "cmp-long", enumC190116, enumC10062, 2, false);
        EnumC19013 enumC190117 = EnumC19013.kFmt22t;
        f4067 = new EnumC1114("IF_EQ", 50, 50, "if-eq", enumC190117, enumC10062, 3, false);
        f4043 = new EnumC1114("IF_NE", 51, 51, "if-ne", enumC190117, enumC10062, 3, false);
        f3989 = new EnumC1114("IF_LT", 52, 52, "if-lt", enumC190117, enumC10062, 3, false);
        f4135 = new EnumC1114("IF_GE", 53, 53, "if-ge", enumC190117, enumC10062, 3, false);
        f4142 = new EnumC1114("IF_GT", 54, 54, "if-gt", enumC190117, enumC10062, 3, false);
        f4076 = new EnumC1114("IF_LE", 55, 55, "if-le", enumC190117, enumC10062, 3, false);
        EnumC19013 enumC190118 = EnumC19013.kFmt21t;
        f3982 = new EnumC1114("IF_EQZ", 56, 56, "if-eqz", enumC190118, enumC10062, 3, false);
        f4162 = new EnumC1114("IF_NEZ", 57, 57, "if-nez", enumC190118, enumC10062, 3, false);
        f3955 = new EnumC1114("IF_LTZ", 58, 58, "if-ltz", enumC190118, enumC10062, 3, false);
        f4036 = new EnumC1114("IF_GEZ", 59, 59, "if-gez", enumC190118, enumC10062, 3, false);
        f4116 = new EnumC1114("IF_GTZ", 60, 60, "if-gtz", enumC190118, enumC10062, 3, false);
        f4056 = new EnumC1114("IF_LEZ", 61, 61, "if-lez", enumC190118, enumC10062, 3, false);
        f4115 = new EnumC1114("AGET", 62, 68, "aget", enumC190116, enumC10062, 10, true);
        f4161 = new EnumC1114("AGET_WIDE", 63, 69, "aget-wide", enumC190116, enumC10062, 10, true);
        f3954 = new EnumC1114("AGET_OBJECT", 64, 70, "aget-object", enumC190116, enumC10062, 10, true);
        f4075 = new EnumC1114("AGET_BOOLEAN", 65, 71, "aget-boolean", enumC190116, enumC10062, 10, true);
        f4055 = new EnumC1114("AGET_BYTE", 66, 72, "aget-byte", enumC190116, enumC10062, 10, true);
        f3988 = new EnumC1114("AGET_CHAR", 67, 73, "aget-char", enumC190116, enumC10062, 10, true);
        f4042 = new EnumC1114("AGET_SHORT", 68, 74, "aget-short", enumC190116, enumC10062, 10, true);
        f4049 = new EnumC1114("APUT", 69, 75, "aput", enumC190116, enumC10062, 10, false);
        f4103 = new EnumC1114("APUT_WIDE", 70, 76, "aput-wide", enumC190116, enumC10062, 10, false);
        f4069 = new EnumC1114("APUT_OBJECT", 71, 77, "aput-object", enumC190116, enumC10062, 10, false);
        f3995 = new EnumC1114("APUT_BOOLEAN", 72, 78, "aput-boolean", enumC190116, enumC10062, 10, false);
        f4155 = new EnumC1114("APUT_BYTE", 73, 79, "aput-byte", enumC190116, enumC10062, 10, false);
        f3975 = new EnumC1114("APUT_CHAR", 74, 80, "aput-char", enumC190116, enumC10062, 10, false);
        f4128 = new EnumC1114("APUT_SHORT", 75, 81, "aput-short", enumC190116, enumC10062, 10, false);
        EnumC10062 enumC10065 = EnumC10062.kIndexFieldRef;
        f4090 = new EnumC1114("IGET", 76, 82, "iget", enumC190112, enumC10065, 10, true);
        f4050 = new EnumC1114("IGET_WIDE", 77, 83, "iget-wide", enumC190112, enumC10065, 10, true);
        f3969 = new EnumC1114("IGET_OBJECT", 78, 84, "iget-object", enumC190112, enumC10065, 10, true);
        f4097 = new EnumC1114("IGET_BOOLEAN", 79, 85, "iget-boolean", enumC190112, enumC10065, 10, true);
        f4083 = new EnumC1114("IGET_BYTE", 80, 86, "iget-byte", enumC190112, enumC10065, 10, true);
        f4149 = new EnumC1114("IGET_CHAR", 81, 87, "iget-char", enumC190112, enumC10065, 10, true);
        f4123 = new EnumC1114("IGET_SHORT", 82, 88, "iget-short", enumC190112, enumC10065, 10, true);
        f4081 = new EnumC1114("IPUT", 83, 89, "iput", enumC190112, enumC10065, 10, false);
        f4095 = new EnumC1114("IPUT_WIDE", 84, 90, "iput-wide", enumC190112, enumC10065, 10, false);
        f4048 = new EnumC1114("IPUT_OBJECT", 85, 91, "iput-object", enumC190112, enumC10065, 10, false);
        f4061 = new EnumC1114("IPUT_BOOLEAN", 86, 92, "iput-boolean", enumC190112, enumC10065, 10, false);
        f3994 = new EnumC1114("IPUT_BYTE", 87, 93, "iput-byte", enumC190112, enumC10065, 10, false);
        f3960 = new EnumC1114("IPUT_CHAR", 88, 94, "iput-char", enumC190112, enumC10065, 10, false);
        f4167 = new EnumC1114("IPUT_SHORT", 89, 95, "iput-short", enumC190112, enumC10065, 10, false);
        f4118 = new EnumC1114("SGET", 90, 96, "sget", enumC190111, enumC10065, 10, true);
        f4164 = new EnumC1114("SGET_WIDE", 91, 97, "sget-wide", enumC190111, enumC10065, 10, true);
        f3957 = new EnumC1114("SGET_OBJECT", 92, 98, "sget-object", enumC190111, enumC10065, 10, true);
        f4078 = new EnumC1114("SGET_BOOLEAN", 93, 99, "sget-boolean", enumC190111, enumC10065, 10, true);
        f4058 = new EnumC1114("SGET_BYTE", 94, 100, "sget-byte", enumC190111, enumC10065, 10, true);
        f3991 = new EnumC1114("SGET_CHAR", 95, 101, "sget-char", enumC190111, enumC10065, 10, true);
        f4045 = new EnumC1114("SGET_SHORT", 96, IShizukuService.Stub.TRANSACTION_attachUserService, "sget-short", enumC190111, enumC10065, 10, true);
        f4130 = new EnumC1114("SPUT", 97, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "sput", enumC190111, enumC10065, 10, false);
        f3950 = new EnumC1114("SPUT_WIDE", 98, IShizukuService.Stub.TRANSACTION_isHidden, "sput-wide", enumC190111, enumC10065, 10, false);
        f4111 = new EnumC1114("SPUT_OBJECT", 99, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "sput-object", enumC190111, enumC10065, 10, false);
        f4105 = new EnumC1114("SPUT_BOOLEAN", 100, IShizukuService.Stub.TRANSACTION_getFlagsForUid, "sput-boolean", enumC190111, enumC10065, 10, false);
        f3943 = new EnumC1114("SPUT_BYTE", 101, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "sput-byte", enumC190111, enumC10065, 10, false);
        f4010 = new EnumC1114("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, 108, "sput-char", enumC190111, enumC10065, 10, false);
        f4031 = new EnumC1114("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 109, "sput-short", enumC190111, enumC10065, 10, false);
        EnumC10062 enumC10066 = EnumC10062.kIndexMethodRef;
        f4147 = new EnumC1114("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_JSON_FAILED, "invoke-virtual", enumC190113, enumC10066, 42, true);
        f4140 = new EnumC1114("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, UMErrorCode.E_UM_BE_CREATE_FAILED, "invoke-super", enumC190113, enumC10066, 42, true);
        f4030 = new EnumC1114("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, UMErrorCode.E_UM_BE_DEFLATE_FAILED, "invoke-direct", enumC190113, enumC10066, 42, true);
        f4064 = new EnumC1114("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, UMErrorCode.E_UM_BE_RAW_OVERSIZE, "invoke-static", enumC190113, enumC10066, 42, true);
        f4023 = new EnumC1114("INVOKE_INTERFACE", 108, 114, "invoke-interface", enumC190113, enumC10066, 42, true);
        f4121 = new EnumC1114("INVOKE_VIRTUAL_RANGE", 109, 116, "invoke-virtual/range", enumC190114, enumC10066, 42, true);
        f4041 = new EnumC1114("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, "invoke-super/range", enumC190114, enumC10066, 42, true);
        f3949 = new EnumC1114("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, 118, "invoke-direct/range", enumC190114, enumC10066, 42, true);
        f3987 = new EnumC1114("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 119, "invoke-static/range", enumC190114, enumC10066, 42, true);
        f3963 = new EnumC1114("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, "invoke-interface/range", enumC190114, enumC10066, 42, true);
        f3958 = new EnumC1114("NEG_INT", 114, 123, "neg-int", enumC19014, enumC10062, 2, true);
        f4086 = new EnumC1114("NOT_INT", 115, 124, "not-int", enumC19014, enumC10062, 2, true);
        f4046 = new EnumC1114("NEG_LONG", 116, q.h, "neg-long", enumC19014, enumC10062, 2, true);
        f4152 = new EnumC1114("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 126, "not-long", enumC19014, enumC10062, 2, true);
        f3992 = new EnumC1114("NEG_FLOAT", 118, 127, "neg-float", enumC19014, enumC10062, 2, true);
        f4059 = new EnumC1114("NEG_DOUBLE", 119, 128, "neg-double", enumC19014, enumC10062, 2, true);
        f4104 = new EnumC1114("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 129, "int-to-long", enumC19014, enumC10062, 2, true);
        f4129 = new EnumC1114("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 130, "int-to-float", enumC19014, enumC10062, 2, true);
        f4070 = new EnumC1114("INT_TO_DOUBLE", 122, 131, "int-to-double", enumC19014, enumC10062, 2, true);
        f4154 = new EnumC1114("LONG_TO_INT", 123, 132, "long-to-int", enumC19014, enumC10062, 2, true);
        f4088 = new EnumC1114("LONG_TO_FLOAT", 124, 133, "long-to-float", enumC19014, enumC10062, 2, true);
        f4102 = new EnumC1114("LONG_TO_DOUBLE", q.h, 134, "long-to-double", enumC19014, enumC10062, 2, true);
        f3952 = new EnumC1114("FLOAT_TO_INT", 126, 135, "float-to-int", enumC19014, enumC10062, 2, true);
        f4026 = new EnumC1114("FLOAT_TO_LONG", 127, 136, "float-to-long", enumC19014, enumC10062, 2, true);
        f4033 = new EnumC1114("FLOAT_TO_DOUBLE", 128, 137, "float-to-double", enumC19014, enumC10062, 2, true);
        f4132 = new EnumC1114("DOUBLE_TO_INT", 129, 138, "double-to-int", enumC19014, enumC10062, 2, true);
        f4107 = new EnumC1114("DOUBLE_TO_LONG", 130, 139, "double-to-long", enumC19014, enumC10062, 2, true);
        f4073 = new EnumC1114("DOUBLE_TO_FLOAT", 131, 140, "double-to-float", enumC19014, enumC10062, 2, true);
        f4156 = new EnumC1114("INT_TO_BYTE", 132, 141, "int-to-byte", enumC19014, enumC10062, 2, true);
        f3976 = new EnumC1114("INT_TO_CHAR", 133, 142, "int-to-char", enumC19014, enumC10062, 2, true);
        f3942 = new EnumC1114("INT_TO_SHORT", 134, 143, "int-to-short", enumC19014, enumC10062, 2, true);
        f4001 = new EnumC1114("ADD_INT", 135, 144, "add-int", enumC190116, enumC10062, 2, true);
        f4065 = new EnumC1114("SUB_INT", 136, 145, "sub-int", enumC190116, enumC10062, 2, true);
        f3985 = new EnumC1114("MUL_INT", 137, 146, "mul-int", enumC190116, enumC10062, 2, true);
        f3973 = new EnumC1114("DIV_INT", 138, 147, "div-int", enumC190116, enumC10062, 10, true);
        f4112 = new EnumC1114("REM_INT", 139, 148, "rem-int", enumC190116, enumC10062, 10, true);
        f4089 = new EnumC1114("AND_INT", 140, 149, "and-int", enumC190116, enumC10062, 2, true);
        f3972 = new EnumC1114("OR_INT", 141, 150, "or-int", enumC190116, enumC10062, 2, true);
        f4044 = new EnumC1114("XOR_INT", 142, 151, "xor-int", enumC190116, enumC10062, 2, true);
        f4092 = new EnumC1114("SHL_INT", 143, 152, "shl-int", enumC190116, enumC10062, 2, true);
        f4124 = new EnumC1114("SHR_INT", 144, 153, "shr-int", enumC190116, enumC10062, 2, true);
        f4117 = new EnumC1114("USHR_INT", 145, EnumC24309.f78687, "ushr-int", enumC190116, enumC10062, 2, true);
        f4035 = new EnumC1114("ADD_LONG", 146, 155, "add-long", enumC190116, enumC10062, 2, true);
        f4136 = new EnumC1114("SUB_LONG", 147, 156, "sub-long", enumC190116, enumC10062, 2, true);
        f4119 = new EnumC1114("MUL_LONG", 148, 157, "mul-long", enumC190116, enumC10062, 2, true);
        f4159 = new EnumC1114("DIV_LONG", 149, 158, "div-long", enumC190116, enumC10062, 10, true);
        f3965 = new EnumC1114("REM_LONG", 150, 159, "rem-long", enumC190116, enumC10062, 10, true);
        f3968 = new EnumC1114("AND_LONG", 151, DHParameters.DEFAULT_MINIMUM_LENGTH, "and-long", enumC190116, enumC10062, 2, true);
        f4158 = new EnumC1114("OR_LONG", 152, 161, "or-long", enumC190116, enumC10062, 2, true);
        f4084 = new EnumC1114("XOR_LONG", 153, 162, "xor-long", enumC190116, enumC10062, 2, true);
        f4151 = new EnumC1114("SHL_LONG", EnumC24309.f78687, 163, "shl-long", enumC190116, enumC10062, 2, true);
        f4157 = new EnumC1114("SHR_LONG", 155, 164, "shr-long", enumC190116, enumC10062, 2, true);
        f3990 = new EnumC1114("USHR_LONG", 156, 165, "ushr-long", enumC190116, enumC10062, 2, true);
        f3961 = new EnumC1114("ADD_FLOAT", 157, 166, "add-float", enumC190116, enumC10062, 2, true);
        f4017 = new EnumC1114("SUB_FLOAT", 158, 167, "sub-float", enumC190116, enumC10062, 2, true);
        f4007 = new EnumC1114("MUL_FLOAT", 159, 168, "mul-float", enumC190116, enumC10062, 2, true);
        f4087 = new EnumC1114("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, 169, "div-float", enumC190116, enumC10062, 2, true);
        f3944 = new EnumC1114("REM_FLOAT", 161, 170, "rem-float", enumC190116, enumC10062, 2, true);
        f3947 = new EnumC1114("ADD_DOUBLE", 162, 171, "add-double", enumC190116, enumC10062, 2, true);
        f4024 = new EnumC1114("SUB_DOUBLE", 163, 172, "sub-double", enumC190116, enumC10062, 2, true);
        f3967 = new EnumC1114("MUL_DOUBLE", 164, 173, "mul-double", enumC190116, enumC10062, 2, true);
        f4094 = new EnumC1114("DIV_DOUBLE", 165, 174, "div-double", enumC190116, enumC10062, 2, true);
        f4131 = new EnumC1114("REM_DOUBLE", 166, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, "rem-double", enumC190116, enumC10062, 2, true);
        f4062 = new EnumC1114("ADD_INT_2ADDR", 167, PicnicEngine.MAX_AUX_BYTES, "add-int/2addr", enumC19014, enumC10062, 2, true);
        f3983 = new EnumC1114("SUB_INT_2ADDR", 168, 177, "sub-int/2addr", enumC19014, enumC10062, 2, true);
        f4138 = new EnumC1114("MUL_INT_2ADDR", 169, 178, "mul-int/2addr", enumC19014, enumC10062, 2, true);
        f4126 = new EnumC1114("DIV_INT_2ADDR", 170, 179, "div-int/2addr", enumC19014, enumC10062, 10, true);
        f4032 = new EnumC1114("REM_INT_2ADDR", 171, 180, "rem-int/2addr", enumC19014, enumC10062, 10, true);
        f4096 = new EnumC1114("AND_INT_2ADDR", 172, 181, "and-int/2addr", enumC19014, enumC10062, 2, true);
        f4125 = new EnumC1114("OR_INT_2ADDR", 173, 182, "or-int/2addr", enumC19014, enumC10062, 2, true);
        f4163 = new EnumC1114("XOR_INT_2ADDR", 174, 183, "xor-int/2addr", enumC19014, enumC10062, 2, true);
        f4099 = new EnumC1114("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 184, "shl-int/2addr", enumC19014, enumC10062, 2, true);
        f4051 = new EnumC1114("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, 185, "shr-int/2addr", enumC19014, enumC10062, 2, true);
        f4077 = new EnumC1114("USHR_INT_2ADDR", 177, 186, "ushr-int/2addr", enumC19014, enumC10062, 2, true);
        f4141 = new EnumC1114("ADD_LONG_2ADDR", 178, 187, "add-long/2addr", enumC19014, enumC10062, 2, true);
        f4037 = new EnumC1114("SUB_LONG_2ADDR", 179, 188, "sub-long/2addr", enumC19014, enumC10062, 2, true);
        f4079 = new EnumC1114("MUL_LONG_2ADDR", 180, 189, "mul-long/2addr", enumC19014, enumC10062, 2, true);
        f3979 = new EnumC1114("DIV_LONG_2ADDR", 181, 190, "div-long/2addr", enumC19014, enumC10062, 10, true);
        f4018 = new EnumC1114("REM_LONG_2ADDR", 182, 191, "rem-long/2addr", enumC19014, enumC10062, 10, true);
        f4122 = new EnumC1114("AND_LONG_2ADDR", 183, 192, "and-long/2addr", enumC19014, enumC10062, 2, true);
        f3978 = new EnumC1114("OR_LONG_2ADDR", 184, 193, "or-long/2addr", enumC19014, enumC10062, 2, true);
        f4150 = new EnumC1114("XOR_LONG_2ADDR", 185, 194, "xor-long/2addr", enumC19014, enumC10062, 2, true);
        f3971 = new EnumC1114("SHL_LONG_2ADDR", 186, 195, "shl-long/2addr", enumC19014, enumC10062, 2, true);
        f3977 = new EnumC1114("SHR_LONG_2ADDR", 187, 196, "shr-long/2addr", enumC19014, enumC10062, 2, true);
        f3956 = new EnumC1114("USHR_LONG_2ADDR", 188, 197, "ushr-long/2addr", enumC19014, enumC10062, 2, true);
        f4014 = new EnumC1114("ADD_FLOAT_2ADDR", 189, 198, "add-float/2addr", enumC19014, enumC10062, 2, true);
        f4004 = new EnumC1114("SUB_FLOAT_2ADDR", 190, 199, "sub-float/2addr", enumC19014, enumC10062, 2, true);
        f4068 = new EnumC1114("MUL_FLOAT_2ADDR", 191, 200, "mul-float/2addr", enumC19014, enumC10062, 2, true);
        f4153 = new EnumC1114("DIV_FLOAT_2ADDR", 192, 201, "div-float/2addr", enumC19014, enumC10062, 2, true);
        f4011 = new EnumC1114("REM_FLOAT_2ADDR", 193, 202, "rem-float/2addr", enumC19014, enumC10062, 2, true);
        f4021 = new EnumC1114("ADD_DOUBLE_2ADDR", 194, 203, "add-double/2addr", enumC19014, enumC10062, 2, true);
        f3964 = new EnumC1114("SUB_DOUBLE_2ADDR", 195, 204, "sub-double/2addr", enumC19014, enumC10062, 2, true);
        f4020 = new EnumC1114("MUL_DOUBLE_2ADDR", 196, 205, "mul-double/2addr", enumC19014, enumC10062, 2, true);
        f4101 = new EnumC1114("DIV_DOUBLE_2ADDR", 197, 206, "div-double/2addr", enumC19014, enumC10062, 2, true);
        f4106 = new EnumC1114("REM_DOUBLE_2ADDR", 198, 207, "rem-double/2addr", enumC19014, enumC10062, 2, true);
        EnumC19013 enumC190119 = EnumC19013.kFmt22s;
        f3981 = new EnumC1114("ADD_INT_LIT16", 199, 208, "add-int/lit16", enumC190119, enumC10062, 2, true);
        f4038 = new EnumC1114("RSUB_INT", 200, 209, "rsub-int", enumC190119, enumC10062, 2, true);
        f4039 = new EnumC1114("MUL_INT_LIT16", 201, 210, "mul-int/lit16", enumC190119, enumC10062, 2, true);
        f4053 = new EnumC1114("DIV_INT_LIT16", 202, Primes.SMALL_FACTOR_LIMIT, "div-int/lit16", enumC190119, enumC10062, 10, true);
        f3951 = new EnumC1114("REM_INT_LIT16", 203, 212, "rem-int/lit16", enumC190119, enumC10062, 10, true);
        f4082 = new EnumC1114("AND_INT_LIT16", 204, 213, "and-int/lit16", enumC190119, enumC10062, 2, true);
        f4052 = new EnumC1114("OR_INT_LIT16", 205, 214, "or-int/lit16", enumC190119, enumC10062, 2, true);
        f4091 = new EnumC1114("XOR_INT_LIT16", 206, 215, "xor-int/lit16", enumC190119, enumC10062, 2, true);
        EnumC19013 enumC190120 = EnumC19013.kFmt22b;
        f4134 = new EnumC1114("ADD_INT_LIT8", 207, 216, "add-int/lit8", enumC190120, enumC10062, 2, true);
        f4144 = new EnumC1114("RSUB_INT_LIT8", 208, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, "rsub-int/lit8", enumC190120, enumC10062, 2, true);
        f4145 = new EnumC1114("MUL_INT_LIT8", 209, 218, "mul-int/lit8", enumC190120, enumC10062, 2, true);
        f3999 = new EnumC1114("DIV_INT_LIT8", 210, 219, "div-int/lit8", enumC190120, enumC10062, 10, true);
        f4025 = new EnumC1114("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, 220, "rem-int/lit8", enumC190120, enumC10062, 10, true);
        f4148 = new EnumC1114("AND_INT_LIT8", 212, 221, "and-int/lit8", enumC190120, enumC10062, 2, true);
        f3998 = new EnumC1114("OR_INT_LIT8", 213, 222, "or-int/lit8", enumC190120, enumC10062, 2, true);
        f4098 = new EnumC1114("XOR_INT_LIT8", 214, 223, "xor-int/lit8", enumC190120, enumC10062, 2, true);
        f4085 = new EnumC1114("SHL_INT_LIT8", 215, BERTags.FLAGS, "shl-int/lit8", enumC190120, enumC10062, 2, true);
        f3997 = new EnumC1114("SHR_INT_LIT8", 216, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, "shr-int/lit8", enumC190120, enumC10062, 2, true);
        f4057 = new EnumC1114("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 226, "ushr-int/lit8", enumC190120, enumC10062, 2, true);
        EnumC19013 enumC190121 = EnumC19013.kFmt45cc;
        EnumC10062 enumC10067 = EnumC10062.kIndexMethodAndProtoRef;
        f4016 = new EnumC1114("INVOKE_POLYMORPHIC", 218, 250, "invoke-polymorphic", enumC190121, enumC10067, 42, true);
        f4003 = new EnumC1114("INVOKE_POLYMORPHIC_RANGE", 219, 251, "invoke-polymorphic/range", EnumC19013.kFmt4rcc, enumC10067, 42, true);
        EnumC10062 enumC10068 = EnumC10062.kIndexCallSiteRef;
        f4009 = new EnumC1114("INVOKE_CUSTOM", 220, 252, "invoke-custom", enumC190113, enumC10068, 42, true);
        f4110 = new EnumC1114("INVOKE_CUSTOM_RANGE", 221, 253, "invoke-custom/range", enumC190114, enumC10068, 42, true);
        f4146 = new EnumC1114("CONST_METHOD_HANDLE", 222, Scalar25519.TARGET_LENGTH, "const-method-handle", enumC190111, EnumC10062.kIndexMethodHandleRef, 10, true);
        f4120 = new EnumC1114("CONST_METHOD_TYPE", 223, 255, "const-method-type", enumC190111, EnumC10062.kIndexProtoRef, 10, true);
        f4008 = new EnumC1114("BAD_OP", BERTags.FLAGS, -1, "bad-opcode", null, enumC10062, 0, false);
        f4028 = m4130();
        EnumC1114[] enumC1114Arr = new EnumC1114[256];
        f3970 = enumC1114Arr;
        for (EnumC1114 enumC1114 : values()) {
            int i = enumC1114.f4172;
            if (i >= 0) {
                enumC1114Arr[i] = enumC1114;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m4132() {
        return (this.f4171 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m4135() {
        return (this.f4171 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m4134() {
        return (this.f4171 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m4133() {
        return (this.f4171 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m4131() {
        return (this.f4171 & 8) != 0;
    }

    public EnumC1114(String str, int i, int i2, String str2, EnumC19013 enumC19013, EnumC10062 enumC10062, int i3, boolean z) {
        super(str, i);
        this.f4172 = i2;
        this.f4173 = str2;
        this.f4168 = enumC19013;
        this.f4169 = enumC10062;
        this.f4171 = i3;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f4173;
    }
}
