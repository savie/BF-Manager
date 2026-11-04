package l;

import android.util.SparseArray;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۟ᩴ' uses external variables
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
/* JADX INFO: renamed from: l.۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5XO */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7779 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final int f25588 = 4;

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25589;

    /* JADX INFO: renamed from: ֡۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25590;

    /* JADX INFO: renamed from: ֡ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25591;

    /* JADX INFO: renamed from: ֡ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25592;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25593;

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25594;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25595;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25596;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25597;

    /* JADX INFO: renamed from: ֨۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25598;

    /* JADX INFO: renamed from: ֨ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25599;

    /* JADX INFO: renamed from: ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f25600 = 64;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25601;

    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25602;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25603;

    /* JADX INFO: renamed from: ֫ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC7779[] f25604 = null;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25605;

    /* JADX INFO: renamed from: ֫۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25606;

    /* JADX INFO: renamed from: ֫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25607;

    /* JADX INFO: renamed from: ֫ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25608;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25609;

    /* JADX INFO: renamed from: ֫᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25610;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25611;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25612;

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25613;

    /* JADX INFO: renamed from: ۖ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25614;

    /* JADX INFO: renamed from: ۖܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25615;

    /* JADX INFO: renamed from: ۖᩴ, reason: not valid java name and contains not printable characters */
    public static final int f25616 = 256;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25617;

    /* JADX INFO: renamed from: ۖ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25618;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25619;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25620;

    /* JADX INFO: renamed from: ۗ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25621;

    /* JADX INFO: renamed from: ۗܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25622;

    /* JADX INFO: renamed from: ۗᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25623;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25624;

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25625;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25626;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25627;

    /* JADX INFO: renamed from: ۘ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25628;

    /* JADX INFO: renamed from: ۘܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25629;

    /* JADX INFO: renamed from: ۘᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25630;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25631;

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25632;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25633;

    /* JADX INFO: renamed from: ۙۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25634;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25635;

    /* JADX INFO: renamed from: ۙ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25636;

    /* JADX INFO: renamed from: ۙܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25637;

    /* JADX INFO: renamed from: ۙᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25638;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25639;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25640;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25641;

    /* JADX INFO: renamed from: ۚۚ, reason: not valid java name and contains not printable characters */
    public static SparseArray f25642 = null;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25643;

    /* JADX INFO: renamed from: ۚ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25644;

    /* JADX INFO: renamed from: ۚܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25645;

    /* JADX INFO: renamed from: ۚᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25646;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25647;

    /* JADX INFO: renamed from: ۚ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25648;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25649;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25650;

    /* JADX INFO: renamed from: ۛ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25651;

    /* JADX INFO: renamed from: ۛܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25652;

    /* JADX INFO: renamed from: ۛᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25653;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25654;

    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25655;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25656;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25657;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25658;

    /* JADX INFO: renamed from: ۜ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25659;

    /* JADX INFO: renamed from: ۜܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25660;

    /* JADX INFO: renamed from: ۜᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25661;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25662;

    /* JADX INFO: renamed from: ۜ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25663;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final int f25664 = 1;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25665;

    /* JADX INFO: renamed from: ۟۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25666;

    /* JADX INFO: renamed from: ۟ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25667;

    /* JADX INFO: renamed from: ۟ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25668;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25669;

    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25670;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25671;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25672;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25673;

    /* JADX INFO: renamed from: ۠۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25674;

    /* JADX INFO: renamed from: ۠ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25675;

    /* JADX INFO: renamed from: ۠ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f25676 = 2;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25677;

    /* JADX INFO: renamed from: ۠᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25678;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25679;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25680;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25681;

    /* JADX INFO: renamed from: ۡ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25682;

    /* JADX INFO: renamed from: ۡܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25683;

    /* JADX INFO: renamed from: ۡᩴ, reason: not valid java name and contains not printable characters */
    public static final int f25684 = 128;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25685;

    /* JADX INFO: renamed from: ۡ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25686;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25687;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25688;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25689;

    /* JADX INFO: renamed from: ۢ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25690;

    /* JADX INFO: renamed from: ۢܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25691;

    /* JADX INFO: renamed from: ۢᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25692;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25693;

    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25694;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25695;

    /* JADX INFO: renamed from: ۤۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25696;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25697;

    /* JADX INFO: renamed from: ۤ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25698;

    /* JADX INFO: renamed from: ۤܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25699;

    /* JADX INFO: renamed from: ۤᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25700;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25701;

    /* JADX INFO: renamed from: ۤ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25702;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25703;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25704;

    /* JADX INFO: renamed from: ۧ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25705;

    /* JADX INFO: renamed from: ۧܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25706;

    /* JADX INFO: renamed from: ۧᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25707;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25708;

    /* JADX INFO: renamed from: ۧ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25709;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25710;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25711;

    /* JADX INFO: renamed from: ۨ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25712;

    /* JADX INFO: renamed from: ۨܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25713;

    /* JADX INFO: renamed from: ۨᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25714;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25715;

    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25716;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25717;

    /* JADX INFO: renamed from: ۫ۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25718;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25719;

    /* JADX INFO: renamed from: ۫۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25720;

    /* JADX INFO: renamed from: ۫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25721;

    /* JADX INFO: renamed from: ۫ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25722;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25723;

    /* JADX INFO: renamed from: ۫᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25724;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25725;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25726;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25727;

    /* JADX INFO: renamed from: ۬۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25728;

    /* JADX INFO: renamed from: ۬ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25729;

    /* JADX INFO: renamed from: ۬ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25730;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25731;

    /* JADX INFO: renamed from: ۬᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25732;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25733;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25734;

    /* JADX INFO: renamed from: ܰ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25735;

    /* JADX INFO: renamed from: ܰܳ, reason: not valid java name and contains not printable characters */
    public static final int f25736 = 16;

    /* JADX INFO: renamed from: ܰᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25737;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25738;

    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25739;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25740;

    /* JADX INFO: renamed from: ܳۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25741;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25742;

    /* JADX INFO: renamed from: ܳ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25743;

    /* JADX INFO: renamed from: ܳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25744;

    /* JADX INFO: renamed from: ܳᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25745;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25746;

    /* JADX INFO: renamed from: ܳ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25747;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25748;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25749;

    /* JADX INFO: renamed from: ܶ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25750;

    /* JADX INFO: renamed from: ܶܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25751;

    /* JADX INFO: renamed from: ܶᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25752;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25753;

    /* JADX INFO: renamed from: ܶ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25754;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25755;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25756;

    /* JADX INFO: renamed from: ܺ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25757;

    /* JADX INFO: renamed from: ܺܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25758;

    /* JADX INFO: renamed from: ܺᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25759;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25760;

    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25761;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25762;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25763;

    /* JADX INFO: renamed from: ܽ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25764;

    /* JADX INFO: renamed from: ܽܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25765;

    /* JADX INFO: renamed from: ܽᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25766;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25767;

    /* JADX INFO: renamed from: ܽ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25768;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25769;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25770;

    /* JADX INFO: renamed from: ܿ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25771;

    /* JADX INFO: renamed from: ܿܳ, reason: not valid java name and contains not printable characters */
    public static final int f25772 = 32;

    /* JADX INFO: renamed from: ܿᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25773;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25774;

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25775;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7779[] f25776;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25777;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25778;

    /* JADX INFO: renamed from: ᩳ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25779;

    /* JADX INFO: renamed from: ᩳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25780;

    /* JADX INFO: renamed from: ᩳᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25781;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25782;

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25783;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25784;

    /* JADX INFO: renamed from: ᩴۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25785;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25786;

    /* JADX INFO: renamed from: ᩴ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25787;

    /* JADX INFO: renamed from: ᩴܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25788;

    /* JADX INFO: renamed from: ᩴᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25789;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25790;

    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25791;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25792;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25793;

    /* JADX INFO: renamed from: ᩵۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25794;

    /* JADX INFO: renamed from: ᩵ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25795;

    /* JADX INFO: renamed from: ᩵ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25796;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25797;

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25798;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25799;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25800;

    /* JADX INFO: renamed from: ᩶۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25801;

    /* JADX INFO: renamed from: ᩶ܳ, reason: not valid java name and contains not printable characters */
    public static final int f25802 = 8;

    /* JADX INFO: renamed from: ᩶ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25803;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25804;

    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25805;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25806;

    /* JADX INFO: renamed from: ᩷ۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25807;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25808;

    /* JADX INFO: renamed from: ᩷۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25809;

    /* JADX INFO: renamed from: ᩷ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25810;

    /* JADX INFO: renamed from: ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25811;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25812;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25813;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25814;

    /* JADX INFO: renamed from: ᩸ۚ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25815;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25816;

    /* JADX INFO: renamed from: ᩸۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25817;

    /* JADX INFO: renamed from: ᩸ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25818;

    /* JADX INFO: renamed from: ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25819;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25820;

    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25821;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25822;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25823;

    /* JADX INFO: renamed from: ᩹۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25824;

    /* JADX INFO: renamed from: ᩹ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25825;

    /* JADX INFO: renamed from: ᩹ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25826;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25827;

    /* JADX INFO: renamed from: ᩹᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25828;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25829;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25830;

    /* JADX INFO: renamed from: ᩺۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25831;

    /* JADX INFO: renamed from: ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25832;

    /* JADX INFO: renamed from: ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25833;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25834;

    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25835;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25836;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25837;

    /* JADX INFO: renamed from: ᩻۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25838;

    /* JADX INFO: renamed from: ᩻ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25839;

    /* JADX INFO: renamed from: ᩻ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25840;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25841;

    /* JADX INFO: renamed from: ᩻᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7779 f25842;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC18966 f25843;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte f25844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f25846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC7801 f25847;

    public static EnumC7779 valueOf(String str) {
        return (EnumC7779) Enum.valueOf(EnumC7779.class, str);
    }

    public static EnumC7779[] values() {
        return (EnumC7779[]) f25776.clone();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7779[] m21154() {
        return new EnumC7779[]{f25668, f25618, f25732, f25678, f25722, f25608, f25646, f25638, f25700, f25811, f25819, f25745, f25789, f25663, f25713, f25622, f25652, f25795, f25639, f25726, f25657, f25701, f25723, f25647, f25746, f25609, f25820, f25790, f25812, f25602, f25686, f25777, f25589, f25769, f25592, f25773, f25593, f25669, f25782, f25682, f25617, f25677, f25662, f25788, f25838, f25612, f25596, f25680, f25688, f25672, f25731, f25704, f25643, f25808, f25816, f25742, f25635, f25837, f25605, f25697, f25786, f25719, f25814, f25703, f25641, f25784, f25740, f25717, f25603, f25792, f25799, f25626, f25710, f25649, f25829, f25733, f25756, f25734, f25620, f25763, f25749, f25823, f25830, f25768, f25805, f25798, f25754, f25828, f25625, f25632, f25591, f25660, f25599, f25667, f25780, f25691, f25615, f25757, f25831, f25621, f25764, f25750, f25824, f25712, f25610, f25791, f25673, f25702, f25640, f25761, f25648, f25727, f25821, f25813, f25737, f25781, f25803, f25692, f25630, f25833, f25681, f25597, f25689, f25694, f25783, f25670, f25601, f25685, f25693, f25631, f25738, f25834, f25665, f25778, f25613, f25671, f25666, f25752, f25753, f25706, f25836, f25661, f25807, f25636, f25743, f25614, f25806, f25690, f25714, f25715, f25751, f25822, f25699, f25741, f25817, f25606, f25728, f25679, f25771, f25759, f25760, f25645, f25687, f25735, f25707, f25708, f25744, f25656, f25779, f25826, f25827, f25839, f25755, f25730, f25696, f25809, f25720, f25674, f25695, f25598, f25653, f25654, f25825, f25619, f25818, f25718, f25787, f25705, f25634, f25611, f25590, f25766, f25767, f25607, f25595, f25801, f25840, f25841, f25721, f25725, f25832, f25623, f25624, f25758, f25762, f25637, f25815, f25633, f25629, f25796, f25797, f25765, f25748, f25810, f25785, f25698, f25644, f25659, f25627, f25739, f25675, f25651, f25711, f25770, f25594, f25729, f25628, f25804, f25774, f25658, f25650, f25800, f25793, f25835, f25775, f25716, f25709, f25842, f25747, f25724, f25655, f25683, f25794};
    }

    static {
        EnumC18966 enumC18966 = EnumC18966.none;
        EnumC7801 enumC7801 = EnumC7801.Format10x;
        f25668 = new EnumC7779("NOP", 0, (byte) 0, "nop", enumC18966, enumC7801, 4);
        EnumC7801 enumC7802 = EnumC7801.Format12x;
        f25618 = new EnumC7779("MOVE", 1, (byte) 1, "move", enumC18966, enumC7802, 20);
        EnumC7801 enumC7803 = EnumC7801.Format22x;
        f25732 = new EnumC7779("MOVE_FROM16", 2, (byte) 2, "move/from16", enumC18966, enumC7803, 20);
        EnumC7801 enumC7804 = EnumC7801.Format32x;
        f25678 = new EnumC7779("MOVE_16", 3, (byte) 3, "move/16", enumC18966, enumC7804, 20);
        f25722 = new EnumC7779("MOVE_WIDE", 4, (byte) 4, "move-wide", enumC18966, enumC7802, 52);
        f25608 = new EnumC7779("MOVE_WIDE_FROM16", 5, (byte) 5, "move-wide/from16", enumC18966, enumC7803, 52);
        f25646 = new EnumC7779("MOVE_WIDE_16", 6, (byte) 6, "move-wide/16", enumC18966, enumC7804, 52);
        f25638 = new EnumC7779("MOVE_OBJECT", 7, (byte) 7, "move-object", enumC18966, enumC7802, 20);
        f25700 = new EnumC7779("MOVE_OBJECT_FROM16", 8, (byte) 8, "move-object/from16", enumC18966, enumC7803, 20);
        f25811 = new EnumC7779("MOVE_OBJECT_16", 9, (byte) 9, "move-object/16", enumC18966, enumC7804, 20);
        EnumC7801 enumC7805 = EnumC7801.Format11x;
        f25819 = new EnumC7779("MOVE_RESULT", 10, (byte) 10, "move-result", enumC18966, enumC7805, 20);
        f25745 = new EnumC7779("MOVE_RESULT_WIDE", 11, (byte) 11, "move-result-wide", enumC18966, enumC7805, 52);
        f25789 = new EnumC7779("MOVE_RESULT_OBJECT", 12, (byte) 12, "move-result-object", enumC18966, enumC7805, 20);
        f25663 = new EnumC7779("MOVE_EXCEPTION", 13, cb.k, "move-exception", enumC18966, enumC7805, 20);
        f25713 = new EnumC7779("RETURN_VOID", 14, cb.f82047l, "return-void", enumC18966, enumC7801);
        f25622 = new EnumC7779("RETURN", 15, (byte) 15, "return", enumC18966, enumC7805);
        f25652 = new EnumC7779("RETURN_WIDE", 16, (byte) 16, "return-wide", enumC18966, enumC7805);
        f25795 = new EnumC7779("RETURN_OBJECT", 17, (byte) 17, "return-object", enumC18966, enumC7805);
        f25639 = new EnumC7779("CONST_4", 18, (byte) 18, "const/4", enumC18966, EnumC7801.Format11n, 20);
        EnumC7801 enumC7806 = EnumC7801.Format21s;
        f25726 = new EnumC7779("CONST_16", 19, (byte) 19, "const/16", enumC18966, enumC7806, 20);
        EnumC7801 enumC7807 = EnumC7801.Format31i;
        f25657 = new EnumC7779("CONST", 20, (byte) 20, "const", enumC18966, enumC7807, 20);
        EnumC7801 enumC7808 = EnumC7801.Format21h;
        f25701 = new EnumC7779("CONST_HIGH16", 21, (byte) 21, "const/high16", enumC18966, enumC7808, 20);
        f25723 = new EnumC7779("CONST_WIDE_16", 22, (byte) 22, "const-wide/16", enumC18966, enumC7806, 52);
        f25647 = new EnumC7779("CONST_WIDE_32", 23, (byte) 23, "const-wide/32", enumC18966, enumC7807, 52);
        f25746 = new EnumC7779("CONST_WIDE", 24, (byte) 24, "const-wide", enumC18966, EnumC7801.Format51l, 52);
        f25609 = new EnumC7779("CONST_WIDE_HIGH16", 25, (byte) 25, "const-wide/high16", enumC18966, enumC7808, 52);
        EnumC18966 enumC18967 = EnumC18966.string;
        EnumC7801 enumC7809 = EnumC7801.Format21c;
        f25820 = new EnumC7779("CONST_STRING", 26, (byte) 26, "const-string", enumC18967, enumC7809, 21);
        f25790 = new EnumC7779("CONST_STRING_JUMBO", 27, (byte) 27, "const-string/jumbo", enumC18967, EnumC7801.Format31c, 21);
        EnumC18966 enumC18968 = EnumC18966.type;
        f25812 = new EnumC7779("CONST_CLASS", 28, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, "const-class", enumC18968, enumC7809, 21);
        f25602 = new EnumC7779("MONITOR_ENTER", 29, (byte) 29, "monitor-enter", enumC18966, enumC7805, 5);
        f25686 = new EnumC7779("MONITOR_EXIT", 30, (byte) 30, "monitor-exit", enumC18966, enumC7805, 5);
        f25777 = new EnumC7779("CHECK_CAST", 31, bo.j, "check-cast", enumC18968, enumC7809, 21);
        EnumC7801 enumC78010 = EnumC7801.Format22c;
        f25589 = new EnumC7779("INSTANCE_OF", 32, UTF8.S_CS3, "instance-of", enumC18968, enumC78010, 21);
        f25769 = new EnumC7779("ARRAY_LENGTH", 33, PublicSuffixDatabase.EXCEPTION_MARKER, "array-length", enumC18966, enumC7802, 21);
        f25592 = new EnumC7779("NEW_INSTANCE", 34, (byte) 34, "new-instance", enumC18968, enumC7809, 21);
        f25773 = new EnumC7779("NEW_ARRAY", 35, (byte) 35, "new-array", enumC18968, enumC78010, 21);
        EnumC7801 enumC78011 = EnumC7801.Format35c;
        f25593 = new EnumC7779("FILLED_NEW_ARRAY", 36, (byte) 36, "filled-new-array", enumC18968, enumC78011, 13);
        EnumC7801 enumC78012 = EnumC7801.Format3rc;
        f25669 = new EnumC7779("FILLED_NEW_ARRAY_RANGE", 37, (byte) 37, "filled-new-array/range", enumC18968, enumC78012, 13);
        EnumC7801 enumC78013 = EnumC7801.Format31t;
        f25782 = new EnumC7779("FILL_ARRAY_DATA", 38, (byte) 38, "fill-array-data", enumC18966, enumC78013, 4);
        f25682 = new EnumC7779("THROW", 39, (byte) 39, "throw", enumC18966, enumC7805, 1);
        f25617 = new EnumC7779("GOTO", 40, (byte) 40, "goto", enumC18966, EnumC7801.Format10t);
        f25677 = new EnumC7779("GOTO_16", 41, (byte) 41, "goto/16", enumC18966, EnumC7801.Format20t);
        f25662 = new EnumC7779("GOTO_32", 42, (byte) 42, "goto/32", enumC18966, EnumC7801.Format30t);
        f25788 = new EnumC7779("PACKED_SWITCH", 43, (byte) 43, "packed-switch", enumC18966, enumC78013, 4);
        f25838 = new EnumC7779("SPARSE_SWITCH", 44, (byte) 44, "sparse-switch", enumC18966, enumC78013, 4);
        EnumC7801 enumC78014 = EnumC7801.Format23x;
        f25612 = new EnumC7779("CMPL_FLOAT", 45, (byte) 45, "cmpl-float", enumC18966, enumC78014, 20);
        f25596 = new EnumC7779("CMPG_FLOAT", 46, (byte) 46, "cmpg-float", enumC18966, enumC78014, 20);
        f25680 = new EnumC7779("CMPL_DOUBLE", 47, (byte) 47, "cmpl-double", enumC18966, enumC78014, 20);
        f25688 = new EnumC7779("CMPG_DOUBLE", 48, UTF8.S_P3A, "cmpg-double", enumC18966, enumC78014, 20);
        f25672 = new EnumC7779("CMP_LONG", 49, (byte) 49, "cmp-long", enumC18966, enumC78014, 20);
        EnumC7801 enumC78015 = EnumC7801.Format22t;
        f25731 = new EnumC7779("IF_EQ", 50, (byte) 50, "if-eq", enumC18966, enumC78015, 4);
        f25704 = new EnumC7779("IF_NE", 51, (byte) 51, "if-ne", enumC18966, enumC78015, 4);
        f25643 = new EnumC7779("IF_LT", 52, (byte) 52, "if-lt", enumC18966, enumC78015, 4);
        f25808 = new EnumC7779("IF_GE", 53, (byte) 53, "if-ge", enumC18966, enumC78015, 4);
        f25816 = new EnumC7779("IF_GT", 54, (byte) 54, "if-gt", enumC18966, enumC78015, 4);
        f25742 = new EnumC7779("IF_LE", 55, (byte) 55, "if-le", enumC18966, enumC78015, 4);
        EnumC7801 enumC78016 = EnumC7801.Format21t;
        f25635 = new EnumC7779("IF_EQZ", 56, (byte) 56, "if-eqz", enumC18966, enumC78016, 4);
        f25837 = new EnumC7779("IF_NEZ", 57, (byte) 57, "if-nez", enumC18966, enumC78016, 4);
        f25605 = new EnumC7779("IF_LTZ", 58, (byte) 58, "if-ltz", enumC18966, enumC78016, 4);
        f25697 = new EnumC7779("IF_GEZ", 59, (byte) 59, "if-gez", enumC18966, enumC78016, 4);
        f25786 = new EnumC7779("IF_GTZ", 60, (byte) 60, "if-gtz", enumC18966, enumC78016, 4);
        f25719 = new EnumC7779("IF_LEZ", 61, Base32Encoder.DEFAULT_PADDING, "if-lez", enumC18966, enumC78016, 4);
        f25814 = new EnumC7779("AGET", 62, (byte) 68, "aget", enumC18966, enumC78014, 21);
        f25703 = new EnumC7779("AGET_WIDE", 63, (byte) 69, "aget-wide", enumC18966, enumC78014, 53);
        f25641 = new EnumC7779("AGET_OBJECT", 64, (byte) 70, "aget-object", enumC18966, enumC78014, 21);
        f25784 = new EnumC7779("AGET_BOOLEAN", 65, (byte) 71, "aget-boolean", enumC18966, enumC78014, 21);
        f25740 = new EnumC7779("AGET_BYTE", 66, (byte) 72, "aget-byte", enumC18966, enumC78014, 21);
        f25717 = new EnumC7779("AGET_CHAR", 67, (byte) 73, "aget-char", enumC18966, enumC78014, 21);
        f25603 = new EnumC7779("AGET_SHORT", 68, (byte) 74, "aget-short", enumC18966, enumC78014, 21);
        f25792 = new EnumC7779("APUT", 69, (byte) 75, "aput", enumC18966, enumC78014, 5);
        f25799 = new EnumC7779("APUT_WIDE", 70, (byte) 76, "aput-wide", enumC18966, enumC78014, 5);
        f25626 = new EnumC7779("APUT_OBJECT", 71, (byte) 77, "aput-object", enumC18966, enumC78014, 5);
        f25710 = new EnumC7779("APUT_BOOLEAN", 72, (byte) 78, "aput-boolean", enumC18966, enumC78014, 5);
        f25649 = new EnumC7779("APUT_BYTE", 73, (byte) 79, "aput-byte", enumC18966, enumC78014, 5);
        f25829 = new EnumC7779("APUT_CHAR", 74, UTF8.S_P4A, "aput-char", enumC18966, enumC78014, 5);
        f25733 = new EnumC7779("APUT_SHORT", 75, (byte) 81, "aput-short", enumC18966, enumC78014, 5);
        EnumC18966 enumC18969 = EnumC18966.field;
        f25756 = new EnumC7779("IGET", 76, (byte) 82, "iget", enumC18969, enumC78010, 21);
        f25734 = new EnumC7779("IGET_WIDE", 77, (byte) 83, "iget-wide", enumC18969, enumC78010, 53);
        f25620 = new EnumC7779("IGET_OBJECT", 78, (byte) 84, "iget-object", enumC18969, enumC78010, 21);
        f25763 = new EnumC7779("IGET_BOOLEAN", 79, (byte) 85, "iget-boolean", enumC18969, enumC78010, 21);
        f25749 = new EnumC7779("IGET_BYTE", 80, (byte) 86, "iget-byte", enumC18969, enumC78010, 21);
        f25823 = new EnumC7779("IGET_CHAR", 81, (byte) 87, "iget-char", enumC18969, enumC78010, 21);
        f25830 = new EnumC7779("IGET_SHORT", 82, (byte) 88, "iget-short", enumC18969, enumC78010, 21);
        f25768 = new EnumC7779("IPUT", 83, (byte) 89, "iput", enumC18969, enumC78010, 5);
        f25805 = new EnumC7779("IPUT_WIDE", 84, (byte) 90, "iput-wide", enumC18969, enumC78010, 5);
        f25798 = new EnumC7779("IPUT_OBJECT", 85, (byte) 91, "iput-object", enumC18969, enumC78010, 5);
        f25754 = new EnumC7779("IPUT_BOOLEAN", 86, (byte) 92, "iput-boolean", enumC18969, enumC78010, 5);
        f25828 = new EnumC7779("IPUT_BYTE", 87, (byte) 93, "iput-byte", enumC18969, enumC78010, 5);
        f25625 = new EnumC7779("IPUT_CHAR", 88, (byte) 94, "iput-char", enumC18969, enumC78010, 5);
        f25632 = new EnumC7779("IPUT_SHORT", 89, (byte) 95, "iput-short", enumC18969, enumC78010, 5);
        f25591 = new EnumC7779("SGET", 90, UTF8.S_P4B, "sget", enumC18969, enumC7809, 21);
        f25660 = new EnumC7779("SGET_WIDE", 91, (byte) 97, "sget-wide", enumC18969, enumC7809, 53);
        f25599 = new EnumC7779("SGET_OBJECT", 92, (byte) 98, "sget-object", enumC18969, enumC7809, 21);
        f25667 = new EnumC7779("SGET_BOOLEAN", 93, (byte) 99, "sget-boolean", enumC18969, enumC7809, 21);
        f25780 = new EnumC7779("SGET_BYTE", 94, (byte) 100, "sget-byte", enumC18969, enumC7809, 21);
        f25691 = new EnumC7779("SGET_CHAR", 95, (byte) 101, "sget-char", enumC18969, enumC7809, 21);
        f25615 = new EnumC7779("SGET_SHORT", 96, (byte) 102, "sget-short", enumC18969, enumC7809, 21);
        f25757 = new EnumC7779("SPUT", 97, (byte) 103, "sput", enumC18969, enumC7809, 5);
        f25831 = new EnumC7779("SPUT_WIDE", 98, (byte) 104, "sput-wide", enumC18969, enumC7809, 5);
        f25621 = new EnumC7779("SPUT_OBJECT", 99, (byte) 105, "sput-object", enumC18969, enumC7809, 5);
        f25764 = new EnumC7779("SPUT_BOOLEAN", 100, (byte) 106, "sput-boolean", enumC18969, enumC7809, 5);
        f25750 = new EnumC7779("SPUT_BYTE", 101, (byte) 107, "sput-byte", enumC18969, enumC7809, 5);
        f25824 = new EnumC7779("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, (byte) 108, "sput-char", enumC18969, enumC7809, 5);
        f25712 = new EnumC7779("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, (byte) 109, "sput-short", enumC18969, enumC7809, 5);
        EnumC18966 enumC189610 = EnumC18966.method;
        f25610 = new EnumC7779("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, KeyFactorySpi.x25519_type, "invoke-virtual", enumC189610, enumC78011, 13);
        f25791 = new EnumC7779("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, KeyFactorySpi.x448_type, "invoke-super", enumC189610, enumC78011, 13);
        f25673 = new EnumC7779("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, KeyFactorySpi.Ed25519_type, "invoke-direct", enumC189610, enumC78011, 13);
        f25702 = new EnumC7779("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, KeyFactorySpi.Ed448_type, "invoke-static", enumC189610, enumC78011, 13);
        f25640 = new EnumC7779("INVOKE_INTERFACE", 108, (byte) 114, "invoke-interface", enumC189610, enumC78011, 13);
        f25761 = new EnumC7779("INVOKE_VIRTUAL_RANGE", 109, (byte) 116, "invoke-virtual/range", enumC189610, enumC78012, 13);
        f25648 = new EnumC7779("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, (byte) 117, "invoke-super/range", enumC189610, enumC78012, 13);
        f25727 = new EnumC7779("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, (byte) 118, "invoke-direct/range", enumC189610, enumC78012, 13);
        f25821 = new EnumC7779("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, (byte) 119, "invoke-static/range", enumC189610, enumC78012, 13);
        f25813 = new EnumC7779("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, (byte) 120, "invoke-interface/range", enumC189610, enumC78012, 13);
        f25737 = new EnumC7779("NEG_INT", 114, (byte) 123, "neg-int", enumC18966, enumC7802, 20);
        f25781 = new EnumC7779("NOT_INT", 115, (byte) 124, "not-int", enumC18966, enumC7802, 20);
        f25803 = new EnumC7779("NEG_LONG", 116, (byte) 125, "neg-long", enumC18966, enumC7802, 52);
        f25692 = new EnumC7779("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, (byte) 126, "not-long", enumC18966, enumC7802, 52);
        f25630 = new EnumC7779("NEG_FLOAT", 118, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, "neg-float", enumC18966, enumC7802, 20);
        f25833 = new EnumC7779("NEG_DOUBLE", 119, GCMSIVBlockCipher.MASK, "neg-double", enumC18966, enumC7802, 52);
        f25681 = new EnumC7779("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, (byte) -127, "int-to-long", enumC18966, enumC7802, 52);
        f25597 = new EnumC7779("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, bo.h, "int-to-float", enumC18966, enumC7802, 20);
        f25689 = new EnumC7779("INT_TO_DOUBLE", 122, (byte) -125, "int-to-double", enumC18966, enumC7802, 52);
        f25694 = new EnumC7779("LONG_TO_INT", 123, (byte) -124, "long-to-int", enumC18966, enumC7802, 20);
        f25783 = new EnumC7779("LONG_TO_FLOAT", 124, (byte) -123, "long-to-float", enumC18966, enumC7802, 20);
        f25670 = new EnumC7779("LONG_TO_DOUBLE", q.h, (byte) -122, "long-to-double", enumC18966, enumC7802, 52);
        f25601 = new EnumC7779("FLOAT_TO_INT", 126, (byte) -121, "float-to-int", enumC18966, enumC7802, 20);
        f25685 = new EnumC7779("FLOAT_TO_LONG", 127, (byte) -120, "float-to-long", enumC18966, enumC7802, 52);
        f25693 = new EnumC7779("FLOAT_TO_DOUBLE", 128, (byte) -119, "float-to-double", enumC18966, enumC7802, 52);
        f25631 = new EnumC7779("DOUBLE_TO_INT", 129, (byte) -118, "double-to-int", enumC18966, enumC7802, 20);
        f25738 = new EnumC7779("DOUBLE_TO_LONG", 130, (byte) -117, "double-to-long", enumC18966, enumC7802, 52);
        f25834 = new EnumC7779("DOUBLE_TO_FLOAT", 131, (byte) -116, "double-to-float", enumC18966, enumC7802, 20);
        f25665 = new EnumC7779("INT_TO_BYTE", 132, (byte) -115, "int-to-byte", enumC18966, enumC7802, 20);
        f25778 = new EnumC7779("INT_TO_CHAR", 133, (byte) -114, "int-to-char", enumC18966, enumC7802, 20);
        f25613 = new EnumC7779("INT_TO_SHORT", 134, (byte) -113, "int-to-short", enumC18966, enumC7802, 20);
        f25671 = new EnumC7779("ADD_INT", 135, (byte) -112, "add-int", enumC18966, enumC78014, 20);
        f25666 = new EnumC7779("SUB_INT", 136, (byte) -111, "sub-int", enumC18966, enumC78014, 20);
        f25752 = new EnumC7779("MUL_INT", 137, (byte) -110, "mul-int", enumC18966, enumC78014, 20);
        f25753 = new EnumC7779("DIV_INT", 138, (byte) -109, "div-int", enumC18966, enumC78014, 21);
        f25706 = new EnumC7779("REM_INT", 139, (byte) -108, "rem-int", enumC18966, enumC78014, 21);
        f25836 = new EnumC7779("AND_INT", 140, (byte) -107, "and-int", enumC18966, enumC78014, 20);
        f25661 = new EnumC7779("OR_INT", 141, (byte) -106, "or-int", enumC18966, enumC78014, 20);
        f25807 = new EnumC7779("XOR_INT", 142, (byte) -105, "xor-int", enumC18966, enumC78014, 20);
        f25636 = new EnumC7779("SHL_INT", 143, (byte) -104, "shl-int", enumC18966, enumC78014, 20);
        f25743 = new EnumC7779("SHR_INT", 144, (byte) -103, "shr-int", enumC18966, enumC78014, 20);
        f25614 = new EnumC7779("USHR_INT", 145, (byte) -102, "ushr-int", enumC18966, enumC78014, 20);
        f25806 = new EnumC7779("ADD_LONG", 146, (byte) -101, "add-long", enumC18966, enumC78014, 52);
        f25690 = new EnumC7779("SUB_LONG", 147, (byte) -100, "sub-long", enumC18966, enumC78014, 52);
        f25714 = new EnumC7779("MUL_LONG", 148, (byte) -99, "mul-long", enumC18966, enumC78014, 52);
        f25715 = new EnumC7779("DIV_LONG", 149, (byte) -98, "div-long", enumC18966, enumC78014, 53);
        f25751 = new EnumC7779("REM_LONG", 150, (byte) -97, "rem-long", enumC18966, enumC78014, 53);
        f25822 = new EnumC7779("AND_LONG", 151, (byte) -96, "and-long", enumC18966, enumC78014, 52);
        f25699 = new EnumC7779("OR_LONG", 152, (byte) -95, "or-long", enumC18966, enumC78014, 52);
        f25741 = new EnumC7779("XOR_LONG", 153, (byte) -94, "xor-long", enumC18966, enumC78014, 52);
        f25817 = new EnumC7779("SHL_LONG", EnumC24309.f78687, (byte) -93, "shl-long", enumC18966, enumC78014, 52);
        f25606 = new EnumC7779("SHR_LONG", 155, (byte) -92, "shr-long", enumC18966, enumC78014, 52);
        f25728 = new EnumC7779("USHR_LONG", 156, (byte) -91, "ushr-long", enumC18966, enumC78014, 52);
        f25679 = new EnumC7779("ADD_FLOAT", 157, (byte) -90, "add-float", enumC18966, enumC78014, 20);
        f25771 = new EnumC7779("SUB_FLOAT", 158, (byte) -89, "sub-float", enumC18966, enumC78014, 20);
        f25759 = new EnumC7779("MUL_FLOAT", 159, (byte) -88, "mul-float", enumC18966, enumC78014, 20);
        f25760 = new EnumC7779("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, (byte) -87, "div-float", enumC18966, enumC78014, 20);
        f25645 = new EnumC7779("REM_FLOAT", 161, (byte) -86, "rem-float", enumC18966, enumC78014, 20);
        f25687 = new EnumC7779("ADD_DOUBLE", 162, (byte) -85, "add-double", enumC18966, enumC78014, 52);
        f25735 = new EnumC7779("SUB_DOUBLE", 163, (byte) -84, "sub-double", enumC18966, enumC78014, 52);
        f25707 = new EnumC7779("MUL_DOUBLE", 164, (byte) -83, "mul-double", enumC18966, enumC78014, 52);
        f25708 = new EnumC7779("DIV_DOUBLE", 165, (byte) -82, "div-double", enumC18966, enumC78014, 52);
        f25744 = new EnumC7779("REM_DOUBLE", 166, (byte) -81, "rem-double", enumC18966, enumC78014, 52);
        f25656 = new EnumC7779("ADD_INT_2ADDR", 167, (byte) -80, "add-int/2addr", enumC18966, enumC7802, 20);
        f25779 = new EnumC7779("SUB_INT_2ADDR", 168, (byte) -79, "sub-int/2addr", enumC18966, enumC7802, 20);
        f25826 = new EnumC7779("MUL_INT_2ADDR", 169, (byte) -78, "mul-int/2addr", enumC18966, enumC7802, 20);
        f25827 = new EnumC7779("DIV_INT_2ADDR", 170, (byte) -77, "div-int/2addr", enumC18966, enumC7802, 21);
        f25839 = new EnumC7779("REM_INT_2ADDR", 171, (byte) -76, "rem-int/2addr", enumC18966, enumC7802, 21);
        f25755 = new EnumC7779("AND_INT_2ADDR", 172, (byte) -75, "and-int/2addr", enumC18966, enumC7802, 20);
        f25730 = new EnumC7779("OR_INT_2ADDR", 173, (byte) -74, "or-int/2addr", enumC18966, enumC7802, 20);
        f25696 = new EnumC7779("XOR_INT_2ADDR", 174, (byte) -73, "xor-int/2addr", enumC18966, enumC7802, 20);
        f25809 = new EnumC7779("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, (byte) -72, "shl-int/2addr", enumC18966, enumC7802, 20);
        f25720 = new EnumC7779("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, (byte) -71, "shr-int/2addr", enumC18966, enumC7802, 20);
        f25674 = new EnumC7779("USHR_INT_2ADDR", 177, (byte) -70, "ushr-int/2addr", enumC18966, enumC7802, 20);
        f25695 = new EnumC7779("ADD_LONG_2ADDR", 178, (byte) -69, "add-long/2addr", enumC18966, enumC7802, 52);
        f25598 = new EnumC7779("SUB_LONG_2ADDR", 179, PSSSigner.TRAILER_IMPLICIT, "sub-long/2addr", enumC18966, enumC7802, 52);
        f25653 = new EnumC7779("MUL_LONG_2ADDR", 180, (byte) -67, "mul-long/2addr", enumC18966, enumC7802, 52);
        f25654 = new EnumC7779("DIV_LONG_2ADDR", 181, (byte) -66, "div-long/2addr", enumC18966, enumC7802, 53);
        f25825 = new EnumC7779("REM_LONG_2ADDR", 182, (byte) -65, "rem-long/2addr", enumC18966, enumC7802, 53);
        f25619 = new EnumC7779("AND_LONG_2ADDR", 183, (byte) -64, "and-long/2addr", enumC18966, enumC7802, 52);
        f25818 = new EnumC7779("OR_LONG_2ADDR", 184, (byte) -63, "or-long/2addr", enumC18966, enumC7802, 52);
        f25718 = new EnumC7779("XOR_LONG_2ADDR", 185, (byte) -62, "xor-long/2addr", enumC18966, enumC7802, 52);
        f25787 = new EnumC7779("SHL_LONG_2ADDR", 186, (byte) -61, "shl-long/2addr", enumC18966, enumC7802, 52);
        f25705 = new EnumC7779("SHR_LONG_2ADDR", 187, (byte) -60, "shr-long/2addr", enumC18966, enumC7802, 52);
        f25634 = new EnumC7779("USHR_LONG_2ADDR", 188, (byte) -59, "ushr-long/2addr", enumC18966, enumC7802, 52);
        f25611 = new EnumC7779("ADD_FLOAT_2ADDR", 189, (byte) -58, "add-float/2addr", enumC18966, enumC7802, 20);
        f25590 = new EnumC7779("SUB_FLOAT_2ADDR", 190, (byte) -57, "sub-float/2addr", enumC18966, enumC7802, 20);
        f25766 = new EnumC7779("MUL_FLOAT_2ADDR", 191, (byte) -56, "mul-float/2addr", enumC18966, enumC7802, 20);
        f25767 = new EnumC7779("DIV_FLOAT_2ADDR", 192, (byte) -55, "div-float/2addr", enumC18966, enumC7802, 20);
        f25607 = new EnumC7779("REM_FLOAT_2ADDR", 193, (byte) -54, "rem-float/2addr", enumC18966, enumC7802, 20);
        f25595 = new EnumC7779("ADD_DOUBLE_2ADDR", 194, (byte) -53, "add-double/2addr", enumC18966, enumC7802, 52);
        f25801 = new EnumC7779("SUB_DOUBLE_2ADDR", 195, (byte) -52, "sub-double/2addr", enumC18966, enumC7802, 52);
        f25840 = new EnumC7779("MUL_DOUBLE_2ADDR", 196, (byte) -51, "mul-double/2addr", enumC18966, enumC7802, 52);
        f25841 = new EnumC7779("DIV_DOUBLE_2ADDR", 197, (byte) -50, "div-double/2addr", enumC18966, enumC7802, 52);
        f25721 = new EnumC7779("REM_DOUBLE_2ADDR", 198, (byte) -49, "rem-double/2addr", enumC18966, enumC7802, 52);
        EnumC7801 enumC78017 = EnumC7801.Format22s;
        f25725 = new EnumC7779("ADD_INT_LIT16", 199, (byte) -48, "add-int/lit16", enumC18966, enumC78017, 20);
        f25832 = new EnumC7779("RSUB_INT", 200, (byte) -47, "rsub-int", enumC18966, enumC78017, 20);
        f25623 = new EnumC7779("MUL_INT_LIT16", 201, (byte) -46, "mul-int/lit16", enumC18966, enumC78017, 20);
        f25624 = new EnumC7779("DIV_INT_LIT16", 202, (byte) -45, "div-int/lit16", enumC18966, enumC78017, 21);
        f25758 = new EnumC7779("REM_INT_LIT16", 203, (byte) -44, "rem-int/lit16", enumC18966, enumC78017, 21);
        f25762 = new EnumC7779("AND_INT_LIT16", 204, (byte) -43, "and-int/lit16", enumC18966, enumC78017, 20);
        f25637 = new EnumC7779("OR_INT_LIT16", 205, (byte) -42, "or-int/lit16", enumC18966, enumC78017, 20);
        f25815 = new EnumC7779("XOR_INT_LIT16", 206, (byte) -41, "xor-int/lit16", enumC18966, enumC78017, 20);
        EnumC7801 enumC78018 = EnumC7801.Format22b;
        f25633 = new EnumC7779("ADD_INT_LIT8", 207, (byte) -40, "add-int/lit8", enumC18966, enumC78018, 20);
        f25629 = new EnumC7779("RSUB_INT_LIT8", 208, (byte) -39, "rsub-int/lit8", enumC18966, enumC78018, 20);
        f25796 = new EnumC7779("MUL_INT_LIT8", 209, (byte) -38, "mul-int/lit8", enumC18966, enumC78018, 20);
        f25797 = new EnumC7779("DIV_INT_LIT8", 210, (byte) -37, "div-int/lit8", enumC18966, enumC78018, 21);
        f25765 = new EnumC7779("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, (byte) -36, "rem-int/lit8", enumC18966, enumC78018, 21);
        f25748 = new EnumC7779("AND_INT_LIT8", 212, (byte) -35, "and-int/lit8", enumC18966, enumC78018, 20);
        f25810 = new EnumC7779("OR_INT_LIT8", 213, (byte) -34, "or-int/lit8", enumC18966, enumC78018, 20);
        f25785 = new EnumC7779("XOR_INT_LIT8", 214, (byte) -33, "xor-int/lit8", enumC18966, enumC78018, 20);
        f25698 = new EnumC7779("SHL_INT_LIT8", 215, bo.k, "shl-int/lit8", enumC18966, enumC78018, 20);
        f25644 = new EnumC7779("SHR_INT_LIT8", 216, GCMSIVBlockCipher.ADD, "shr-int/lit8", enumC18966, enumC78018, 20);
        f25659 = new EnumC7779("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, (byte) -30, "ushr-int/lit8", enumC18966, enumC78018, 20);
        f25627 = new EnumC7779("IGET_VOLATILE", 218, (byte) -29, "iget-volatile", enumC18969, enumC78010, 151);
        f25739 = new EnumC7779("IPUT_VOLATILE", 219, (byte) -28, "iput-volatile", enumC18969, enumC78010, 135);
        f25675 = new EnumC7779("SGET_VOLATILE", 220, (byte) -27, "sget-volatile", enumC18969, enumC7809, 279);
        f25651 = new EnumC7779("SPUT_VOLATILE", 221, (byte) -26, "sput-volatile", enumC18969, enumC7809, 263);
        f25711 = new EnumC7779("IGET_OBJECT_VOLATILE", 222, (byte) -25, "iget-object-volatile", enumC18969, enumC78010, 151);
        f25770 = new EnumC7779("IGET_WIDE_VOLATILE", 223, (byte) -24, "iget-wide-volatile", enumC18969, enumC78010, 183);
        f25594 = new EnumC7779("IPUT_WIDE_VOLATILE", BERTags.FLAGS, (byte) -23, "iput-wide-volatile", enumC18969, enumC78010, 135);
        f25729 = new EnumC7779("SGET_WIDE_VOLATILE", HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, (byte) -22, "sget-wide-volatile", enumC18969, enumC7809, 311);
        f25628 = new EnumC7779("SPUT_WIDE_VOLATILE", 226, (byte) -21, "sput-wide-volatile", enumC18969, enumC7809, 263);
        EnumC7801 enumC78019 = EnumC7801.Format35ms;
        f25804 = new EnumC7779("EXECUTE_INLINE", 227, (byte) -18, "execute-inline", enumC18966, enumC78019, 15);
        EnumC7801 enumC78020 = EnumC7801.Format3rms;
        f25774 = new EnumC7779("EXECUTE_INLINE_RANGE", 228, (byte) -17, "execute-inline/range", enumC18966, enumC78020, 15);
        f25658 = new EnumC7779("INVOKE_DIRECT_EMPTY", 229, (byte) -16, "invoke-direct-empty", enumC189610, EnumC7801.Format35s, 15);
        EnumC7801 enumC78021 = EnumC7801.Format22cs;
        f25650 = new EnumC7779("IGET_QUICK", 230, (byte) -14, "iget-quick", enumC18966, enumC78021, 87);
        f25800 = new EnumC7779("IGET_WIDE_QUICK", 231, (byte) -13, "iget-wide-quick", enumC18966, enumC78021, 119);
        f25793 = new EnumC7779("IGET_OBJECT_QUICK", 232, (byte) -12, "iget-object-quick", enumC18966, enumC78021, 87);
        f25835 = new EnumC7779("IPUT_QUICK", 233, (byte) -11, "iput-quick", enumC18966, enumC78021, 71);
        f25775 = new EnumC7779("IPUT_WIDE_QUICK", 234, (byte) -10, "iput-wide-quick", enumC18966, enumC78021, 71);
        f25716 = new EnumC7779("IPUT_OBJECT_QUICK", 235, (byte) -9, "iput-object-quick", enumC18966, enumC78021, 71);
        f25709 = new EnumC7779("INVOKE_VIRTUAL_QUICK", 236, (byte) -8, "invoke-virtual-quick", enumC18966, enumC78019, 15);
        f25842 = new EnumC7779("INVOKE_VIRTUAL_QUICK_RANGE", 237, (byte) -7, "invoke-virtual-quick/range", enumC18966, enumC78020, 15);
        f25747 = new EnumC7779("INVOKE_SUPER_QUICK", 238, (byte) -6, "invoke-super-quick", enumC18966, enumC78019, 15);
        f25724 = new EnumC7779("INVOKE_SUPER_QUICK_RANGE", 239, (byte) -5, "invoke-super-quick/range", enumC18966, enumC78020, 15);
        f25655 = new EnumC7779("IPUT_OBJECT_VOLATILE", 240, (byte) -4, "iput-object-volatile", enumC18969, enumC78010, 135);
        f25683 = new EnumC7779("SGET_OBJECT_VOLATILE", 241, (byte) -3, "sget-object-volatile", enumC18969, enumC7809, 279);
        f25794 = new EnumC7779("SPUT_OBJECT_VOLATILE", 242, (byte) -2, "sput-object-volatile", enumC18969, enumC7809, 263);
        f25776 = m21154();
        f25604 = new EnumC7779[256];
        f25642 = new SparseArray();
        for (EnumC7779 enumC7779 : values()) {
            f25604[enumC7779.f25844 & 255] = enumC7779;
            f25642.put(enumC7779.f25846.hashCode(), enumC7779);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7779 m21153(String str) {
        return (EnumC7779) f25642.get(str.toLowerCase().hashCode());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7779 m21152(byte b) {
        return f25604[b & 255];
    }

    public EnumC7779(String str, int i, byte b, String str2, EnumC18966 enumC18966, EnumC7801 enumC7801) {
        this(str, i, b, str2, enumC18966, enumC7801, 0);
    }

    public EnumC7779(String str, int i, byte b, String str2, EnumC18966 enumC18966, EnumC7801 enumC7801, int i2) {
        super(str, i);
        this.f25844 = b;
        this.f25846 = str2;
        this.f25843 = enumC18966;
        this.f25847 = enumC7801;
        this.f25845 = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21161() {
        return (this.f25845 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m21157() {
        return (this.f25845 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21156() {
        return (this.f25845 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m21159() {
        return (this.f25845 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m21163() {
        return (this.f25845 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m21162() {
        return (this.f25845 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21160() {
        return (this.f25845 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m21158() {
        return (this.f25845 & 128) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21155() {
        return (this.f25845 & 256) != 0;
    }
}
