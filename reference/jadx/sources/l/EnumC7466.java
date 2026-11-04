package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۧ᩷' uses external variables
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
/* JADX INFO: renamed from: l.ۜ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC7466 implements InterfaceC13449, Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24599;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24600;

    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24601;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24602;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24603;

    /* JADX INFO: renamed from: ֨ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24605;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24606;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24607;

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24608;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24609;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24610;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24611;

    /* JADX INFO: renamed from: ۖۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24612;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24613;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24614;

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24615;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24616;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24617;

    /* JADX INFO: renamed from: ۘۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24618;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24619;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24620;

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24621;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24622;

    /* JADX INFO: renamed from: ۙ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24623;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24624;

    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24625;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24626;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24627;

    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24628;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24629;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24630;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24631;

    /* JADX INFO: renamed from: ۜۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24632;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24633;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24634;

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24636;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24637;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24638;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24639;

    /* JADX INFO: renamed from: ۠ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24640;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24641;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24642;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24643;

    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24644;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24645;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24646;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24647;

    /* JADX INFO: renamed from: ۢۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24648;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24649;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24650;

    /* JADX INFO: renamed from: ۤۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24651;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24652;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24653;

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24654;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24655;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24656;

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24657;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24658;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24659;

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24660;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24661;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24662;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24663;

    /* JADX INFO: renamed from: ۬ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24664;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24665;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24666;

    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24667;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24668;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24669;

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24670;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24671;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24672;

    /* JADX INFO: renamed from: ܶۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24673;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24674;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24675;

    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24676;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24677;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24678;

    /* JADX INFO: renamed from: ܽۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24679;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24680;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7466[] f24681;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24682;

    /* JADX INFO: renamed from: ܿۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24683;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24684;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24685;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24686;

    /* JADX INFO: renamed from: ᩳۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24687;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24688;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24689;

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24690;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24691;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24692;

    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24693;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24694;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24695;

    /* JADX INFO: renamed from: ᩶ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24696;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24697;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24698;

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24699;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24700;

    /* JADX INFO: renamed from: ᩷᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24701;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24702;

    /* JADX INFO: renamed from: ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24703;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24704;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24705;

    /* JADX INFO: renamed from: ᩹ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24706;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24707;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24708;

    /* JADX INFO: renamed from: ᩺ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24709;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24710;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24711;

    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24712;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24713;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f24714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC2991 f24715;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24635 = new EnumC7466("EOF", 0);

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7466 f24604 = new EnumC7466("ERROR", 1);

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m20508() {
        return "Token";
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean test(EnumC7466 enumC7466) {
        return this == enumC7466;
    }

    public static EnumC7466 valueOf(String str) {
        return (EnumC7466) Enum.valueOf(EnumC7466.class, str);
    }

    public static EnumC7466[] values() {
        return (EnumC7466[]) f24681.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7466[] m20507() {
        return new EnumC7466[]{f24635, f24604, f24655, f24599, f24642, f24698, f24650, f24702, f24659, f24624, f24607, f24711, f24705, f24614, f24656, f24627, f24617, f24682, f24600, f24643, f24639, f24631, f24663, f24700, f24652, f24713, f24677, f24680, f24674, f24707, f24616, f24710, f24649, f24606, f24613, f24651, f24703, f24690, f24608, f24676, f24693, f24657, f24696, f24683, f24601, f24636, f24687, f24648, f24644, f24640, f24664, f24623, f24701, f24694, f24619, f24622, f24666, f24653, f24628, f24612, f24611, f24645, f24632, f24603, f24675, f24668, f24654, f24658, f24660, f24629, f24625, f24712, f24672, f24708, f24695, f24686, f24704, f24697, f24610, f24605, f24670, f24678, f24647, f24684, f24691, f24638, f24685, f24662, f24699, f24667, f24665, f24709, f24706, f24679, f24634, f24630, f24689, f24641, f24602, f24671, f24626, f24621, f24618, f24615, f24673, f24646, f24620, f24669, f24633, f24637, f24661, f24609, f24688, f24692};
    }

    static {
        EnumC2991 enumC2991 = EnumC2991.NAMED;
        f24655 = new EnumC7466("IDENTIFIER", 2, enumC2991);
        f24599 = new EnumC7466("ABSTRACT", 3, "abstract");
        f24642 = new EnumC7466("ASSERT", 4, "assert", enumC2991);
        f24698 = new EnumC7466("BOOLEAN", 5, ClassTransform.BOOLEAN, enumC2991);
        f24650 = new EnumC7466("BREAK", 6, "break");
        f24702 = new EnumC7466("BYTE", 7, ClassTransform.BYTE, enumC2991);
        f24659 = new EnumC7466("CASE", 8, "case");
        f24624 = new EnumC7466("CATCH", 9, "catch");
        f24607 = new EnumC7466("CHAR", 10, ClassTransform.CHARACTER, enumC2991);
        f24711 = new EnumC7466("CLASS", 11, Name.LABEL);
        f24705 = new EnumC7466("CONST", 12, "const");
        f24614 = new EnumC7466("CONTINUE", 13, "continue");
        f24656 = new EnumC7466("DEFAULT", 14, "default");
        f24627 = new EnumC7466("DO", 15, "do");
        f24617 = new EnumC7466("DOUBLE", 16, ClassTransform.DOUBLE, enumC2991);
        f24682 = new EnumC7466("ELSE", 17, "else");
        f24600 = new EnumC7466("ENUM", 18, "enum", enumC2991);
        f24643 = new EnumC7466("EXTENDS", 19, "extends");
        f24639 = new EnumC7466("FINAL", 20, "final");
        f24631 = new EnumC7466("FINALLY", 21, "finally");
        f24663 = new EnumC7466("FLOAT", 22, ClassTransform.FLOAT, enumC2991);
        f24700 = new EnumC7466("FOR", 23, "for");
        f24652 = new EnumC7466("GOTO", 24, "goto");
        f24713 = new EnumC7466("IF", 25, "if");
        f24677 = new EnumC7466("IMPLEMENTS", 26, "implements");
        f24680 = new EnumC7466("IMPORT", 27, "import");
        f24674 = new EnumC7466("INSTANCEOF", 28, "instanceof");
        f24707 = new EnumC7466("INT", 29, ClassTransform.INTEGER, enumC2991);
        f24616 = new EnumC7466("INTERFACE", 30, "interface");
        f24710 = new EnumC7466("LONG", 31, ClassTransform.LONG, enumC2991);
        f24649 = new EnumC7466("NATIVE", 32, UMConfigure.WRAPER_TYPE_NATIVE);
        f24606 = new EnumC7466("NEW", 33, "new");
        f24613 = new EnumC7466("PACKAGE", 34, "package");
        f24651 = new EnumC7466("PRIVATE", 35, "private");
        f24703 = new EnumC7466("PROTECTED", 36, "protected");
        f24690 = new EnumC7466("PUBLIC", 37, "public");
        f24608 = new EnumC7466("RETURN", 38, "return");
        f24676 = new EnumC7466("SHORT", 39, ClassTransform.SHORT, enumC2991);
        f24693 = new EnumC7466("STATIC", 40, "static");
        f24657 = new EnumC7466("STRICTFP", 41, "strictfp");
        f24696 = new EnumC7466("SUPER", 42, "super", enumC2991);
        f24683 = new EnumC7466("SWITCH", 43, "switch");
        f24601 = new EnumC7466("SYNCHRONIZED", 44, MessageHandler.Properties.IsSynchronized);
        f24636 = new EnumC7466("THIS", 45, "this", enumC2991);
        f24687 = new EnumC7466("THROW", 46, "throw");
        f24648 = new EnumC7466("THROWS", 47, "throws");
        f24644 = new EnumC7466("TRANSIENT", 48, "transient");
        f24640 = new EnumC7466("TRY", 49, "try");
        f24664 = new EnumC7466("VOID", 50, ClassTransform.VOID, enumC2991);
        f24623 = new EnumC7466("VOLATILE", 51, "volatile");
        f24701 = new EnumC7466("WHILE", 52, "while");
        EnumC2991 enumC2992 = EnumC2991.NUMERIC;
        f24694 = new EnumC7466("INTLITERAL", 53, enumC2992);
        f24619 = new EnumC7466("LONGLITERAL", 54, enumC2992);
        f24622 = new EnumC7466("FLOATLITERAL", 55, enumC2992);
        f24666 = new EnumC7466("DOUBLELITERAL", 56, enumC2992);
        f24653 = new EnumC7466("CHARLITERAL", 57, enumC2992);
        f24628 = new EnumC7466("STRINGLITERAL", 58, EnumC2991.STRING);
        f24612 = new EnumC7466("TRUE", 59, "true", enumC2991);
        f24611 = new EnumC7466("FALSE", 60, "false", enumC2991);
        f24645 = new EnumC7466("NULL", 61, "null", enumC2991);
        f24632 = new EnumC7466("UNDERSCORE", 62, "_", enumC2991);
        f24603 = new EnumC7466("ARROW", 63, "->");
        f24675 = new EnumC7466("COLCOL", 64, "::");
        f24668 = new EnumC7466("LPAREN", 65, MotionUtils.EASING_TYPE_FORMAT_START);
        f24654 = new EnumC7466("RPAREN", 66, MotionUtils.EASING_TYPE_FORMAT_END);
        f24658 = new EnumC7466("LBRACE", 67, "{");
        f24660 = new EnumC7466("RBRACE", 68, l.d);
        f24629 = new EnumC7466("LBRACKET", 69, "[");
        f24625 = new EnumC7466("RBRACKET", 70, "]");
        f24712 = new EnumC7466("SEMI", 71, l.b);
        f24672 = new EnumC7466("COMMA", 72, ",");
        f24708 = new EnumC7466("DOT", 73, ".");
        f24695 = new EnumC7466("ELLIPSIS", 74, "...");
        f24686 = new EnumC7466("EQ", 75, "=");
        f24704 = new EnumC7466("GT", 76, ">");
        f24697 = new EnumC7466("LT", 77, "<");
        f24610 = new EnumC7466("BANG", 78, "!");
        f24605 = new EnumC7466("TILDE", 79, "~");
        f24670 = new EnumC7466("QUES", 80, "?");
        f24678 = new EnumC7466("COLON", 81, ":");
        f24647 = new EnumC7466("EQEQ", 82, "==");
        f24684 = new EnumC7466("LTEQ", 83, "<=");
        f24691 = new EnumC7466("GTEQ", 84, ">=");
        f24638 = new EnumC7466("BANGEQ", 85, "!=");
        f24685 = new EnumC7466("AMPAMP", 86, "&&");
        f24662 = new EnumC7466("BARBAR", 87, "||");
        f24699 = new EnumC7466("PLUSPLUS", 88, "++");
        f24667 = new EnumC7466("SUBSUB", 89, "--");
        f24665 = new EnumC7466("PLUS", 90, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        f24709 = new EnumC7466("SUB", 91, "-");
        f24706 = new EnumC7466("STAR", 92, "*");
        f24679 = new EnumC7466("SLASH", 93, "/");
        f24634 = new EnumC7466("AMP", 94, a.p);
        f24630 = new EnumC7466("BAR", 95, "|");
        f24689 = new EnumC7466("CARET", 96, "^");
        f24641 = new EnumC7466("PERCENT", 97, "%");
        f24602 = new EnumC7466("LTLT", 98, "<<");
        f24671 = new EnumC7466("GTGT", 99, ">>");
        f24626 = new EnumC7466("GTGTGT", 100, ">>>");
        f24621 = new EnumC7466("PLUSEQ", 101, "+=");
        f24618 = new EnumC7466("SUBEQ", IShizukuService.Stub.TRANSACTION_attachUserService, "-=");
        f24615 = new EnumC7466("STAREQ", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "*=");
        f24673 = new EnumC7466("SLASHEQ", IShizukuService.Stub.TRANSACTION_isHidden, "/=");
        f24646 = new EnumC7466("AMPEQ", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "&=");
        f24620 = new EnumC7466("BAREQ", IShizukuService.Stub.TRANSACTION_getFlagsForUid, "|=");
        f24669 = new EnumC7466("CARETEQ", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "^=");
        f24633 = new EnumC7466("PERCENTEQ", 108, "%=");
        f24637 = new EnumC7466("LTLTEQ", 109, "<<=");
        f24661 = new EnumC7466("GTGTEQ", UMErrorCode.E_UM_BE_JSON_FAILED, ">>=");
        f24609 = new EnumC7466("GTGTGTEQ", UMErrorCode.E_UM_BE_CREATE_FAILED, ">>>=");
        f24688 = new EnumC7466("MONKEYS_AT", UMErrorCode.E_UM_BE_DEFLATE_FAILED, "@");
        f24692 = new EnumC7466("CUSTOM", UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        f24681 = m20507();
    }

    public EnumC7466(String str, int i) {
        this(str, i, null, EnumC2991.DEFAULT);
    }

    public EnumC7466(String str, int i, String str2) {
        this(str, i, str2, EnumC2991.DEFAULT);
    }

    public EnumC7466(String str, int i, EnumC2991 enumC2991) {
        this(str, i, null, enumC2991);
    }

    public EnumC7466(String str, int i, String str2, EnumC2991 enumC2991) {
        super(str, i);
        this.f24714 = str2;
        this.f24715 = enumC2991;
    }

    @Override // java.lang.Enum
    public String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "token.end-of-input";
        }
        if (iOrdinal == 1) {
            return "token.bad-symbol";
        }
        if (iOrdinal == 2) {
            return "token.identifier";
        }
        switch (iOrdinal) {
            case 53:
                return "token.integer";
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return "token.long-integer";
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return "token.float";
            case 56:
                return "token.double";
            case 57:
                return "token.character";
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return "token.string";
            default:
                switch (iOrdinal) {
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                        return C8947.m23910(new StringBuilder("'"), this.f24714, "'");
                    default:
                        return this.f24714;
                }
        }
    }

    @Override // l.InterfaceC13449
    /* JADX INFO: renamed from: ۙ */
    public String mo15163(Locale locale, InterfaceC2263 interfaceC2263) {
        if (this.f24714 != null) {
            return toString();
        }
        return ((C23721) interfaceC2263).m52976(locale, "compiler.misc." + toString(), new Object[0]);
    }
}
