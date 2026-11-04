package l;

import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.UMConfigure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.IntPredicate;
import net.engio.mbassy.listener.MessageHandler;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۫ۙ' uses external variables
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
/* JADX INFO: renamed from: l.ܺ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7EI */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC16856 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54341;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54342;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54343;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54344;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54345;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54346;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54347;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static String f54348;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54349;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static String f54350;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54351;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54352;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54353;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54354;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC16856[] f54355;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54356;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54357;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54358;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54359;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54360;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54361;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54362;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54363 = new EnumC16856("ACC_NONE", 0, 0, "", EnumC19840.NONE);

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54364;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54365;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54366;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54367;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54368;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static String f54369;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54370;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54371;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54372;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54373;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54374;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54375;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54376;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54377;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54378;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54379;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856[] f54380;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54381;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54382;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54383;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static EnumC19840 f54384;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54385;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static String f54386;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16856 f54387;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f54388;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54389;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f54390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f54391;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m39787(int i, int i2) {
        return (i | i2) == i2;
    }

    public static EnumC16856 valueOf(String str) {
        return (EnumC16856) Enum.valueOf(EnumC16856.class, str);
    }

    public static EnumC16856[] values() {
        return (EnumC16856[]) f54355.clone();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC16856[] m39811() {
        return new EnumC16856[]{f54363, f54367, f54378, f54371, f54351, f54345, f54387, f54357, f54347, f54385, f54373, f54383, f54366, f54342, f54344, f54372, f54379, f54381, f54353, f54376, f54365, f54374, f54361, f54359, f54349, f54368, f54382, f54352, f54364};
    }

    static {
        EnumC19840 enumC19840 = EnumC19840.CLASS;
        EnumC19840 enumC19841 = EnumC19840.INNER_CLASS;
        EnumC19840 enumC19842 = EnumC19840.FIELD;
        EnumC19840 enumC19843 = EnumC19840.METHOD;
        EnumC16856 enumC16856 = new EnumC16856("ACC_PUBLIC", 1, 1, "public", enumC19840, enumC19841, enumC19842, enumC19843);
        f54367 = enumC16856;
        EnumC16856 enumC16857 = new EnumC16856("ACC_PRIVATE", 2, 2, "private", enumC19841, enumC19842, enumC19843);
        f54378 = enumC16857;
        EnumC16856 enumC16858 = new EnumC16856("ACC_PROTECTED", 3, 4, "protected", enumC19841, enumC19842, enumC19843);
        f54371 = enumC16858;
        EnumC16856 enumC16859 = new EnumC16856("ACC_STATIC", 4, 8, "static", enumC19841, enumC19842, enumC19843);
        f54351 = enumC16859;
        EnumC19840 enumC19844 = EnumC19840.METHOD_PARAMETERS;
        EnumC16856 enumC168510 = new EnumC16856("ACC_FINAL", 5, 16, "final", enumC19840, enumC19841, enumC19842, enumC19843, enumC19844);
        f54345 = enumC168510;
        EnumC16856 enumC168511 = new EnumC16856("ACC_SUPER", 6, 32, "super", enumC19840);
        f54387 = enumC168511;
        EnumC19840 enumC19845 = EnumC19840.VALUE_OBJECTS;
        EnumC16856 enumC168512 = new EnumC16856("ACC_IDENTITY", 7, 32, "identity", enumC19840, enumC19841, enumC19845);
        f54357 = enumC168512;
        f54347 = new EnumC16856("ACC_VALUE", 8, 0, b.d, enumC19840, enumC19841, enumC19845);
        EnumC19840 enumC19846 = EnumC19840.REQUIRES;
        EnumC16856 enumC168513 = new EnumC16856("ACC_TRANSITIVE", 9, 32, "transitive", enumC19846);
        f54385 = enumC168513;
        EnumC16856 enumC168514 = new EnumC16856("ACC_SYNCHRONIZED", 10, 32, MessageHandler.Properties.IsSynchronized, enumC19843);
        f54373 = enumC168514;
        EnumC19840 enumC19847 = EnumC19840.MODULE;
        EnumC16856 enumC168515 = new EnumC16856("ACC_OPEN", 11, 32, "open", enumC19847);
        f54383 = enumC168515;
        EnumC16856 enumC168516 = new EnumC16856("ACC_VOLATILE", 12, 64, "volatile", enumC19842);
        f54366 = enumC168516;
        EnumC16856 enumC168517 = new EnumC16856("ACC_BRIDGE", 13, 64, "bridge", enumC19843);
        f54342 = enumC168517;
        EnumC16856 enumC168518 = new EnumC16856("ACC_STATIC_PHASE", 14, 64, "static", enumC19846);
        f54344 = enumC168518;
        EnumC16856 enumC168519 = new EnumC16856("ACC_TRANSIENT", 15, 128, "transient", enumC19842);
        f54372 = enumC168519;
        EnumC16856 enumC168520 = new EnumC16856("ACC_VARARGS", 16, 128, "varargs", enumC19843);
        f54379 = enumC168520;
        EnumC16856 enumC168521 = new EnumC16856("ACC_NATIVE", 17, 256, UMConfigure.WRAPER_TYPE_NATIVE, enumC19843);
        f54381 = enumC168521;
        EnumC16856 enumC168522 = new EnumC16856("ACC_INTERFACE", 18, 512, "interface", enumC19840, enumC19841);
        f54353 = enumC168522;
        EnumC16856 enumC168523 = new EnumC16856("ACC_ABSTRACT", 19, 1024, "abstract", enumC19840, enumC19841, enumC19843);
        f54376 = enumC168523;
        EnumC16856 enumC168524 = new EnumC16856("ACC_STRICT", 20, 2048, "strict", enumC19843, enumC19842, enumC19845);
        f54365 = enumC168524;
        EnumC19840 enumC19848 = EnumC19840.EXPORTS;
        EnumC19840 enumC19849 = EnumC19840.OPENS;
        EnumC16856 enumC168525 = new EnumC16856("ACC_SYNTHETIC", 21, 4096, "synthetic", enumC19840, enumC19841, enumC19842, enumC19843, enumC19847, enumC19846, enumC19848, enumC19849, enumC19844);
        f54374 = enumC168525;
        EnumC16856 enumC168526 = new EnumC16856("ACC_ANNOTATION", 22, 8192, "annotation", enumC19840, enumC19841);
        f54361 = enumC168526;
        EnumC16856 enumC168527 = new EnumC16856("ACC_ENUM", 23, 16384, "enum", enumC19840, enumC19841, enumC19842);
        f54359 = enumC168527;
        EnumC16856 enumC168528 = new EnumC16856("ACC_MODULE", 24, 32768, am.e, enumC19840);
        f54349 = enumC168528;
        EnumC16856 enumC168529 = new EnumC16856("ACC_MANDATED", 25, 32768, "mandated", enumC19847, enumC19846, enumC19848, enumC19849, enumC19844);
        f54368 = enumC168529;
        f54382 = new EnumC16856("SYNTHETIC_ATTRIBUTE", 26, 65536, "Synthetic(Pseudo)", enumC19840, enumC19841, enumC19842, enumC19843);
        f54352 = new EnumC16856("DEPRECATED_ATTRIBUTE", 27, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "Deprecated(Pseudo)", enumC19840, enumC19841, enumC19842, enumC19843);
        f54364 = new EnumC16856("VALUE_OBJECTS_ATTRIBUTE", 28, 268435456, "ValueObjects(Pseudo)", enumC19840, enumC19841, enumC19842);
        f54355 = m39811();
        f54362 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC16859, enumC168510, enumC168514, enumC168517, enumC168520, enumC168521, enumC168523, enumC168525, enumC168524};
        f54380 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC168510, enumC168511, enumC168512, enumC168522, enumC168523, enumC168525, enumC168526, enumC168527, enumC168528};
        f54356 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC168522, enumC168523, enumC168525, enumC168526};
        f54375 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC16859, enumC168510, enumC168516, enumC168519, enumC168525, enumC168527, enumC168524};
        f54370 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC168517, enumC168520, enumC168523, enumC168525};
        f54341 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC168520, enumC168525, enumC168524, enumC16859};
        f54354 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC16859, enumC168510, enumC168522, enumC168523, enumC168525, enumC168526, enumC168527};
        f54377 = new EnumC16856[]{enumC16856, enumC16857, enumC16858, enumC16859, enumC168517, enumC168520, enumC168523, enumC168524, enumC168525};
        f54343 = new EnumC16856[]{enumC168515, enumC168525, enumC168529};
        f54358 = new EnumC16856[]{enumC168513, enumC168518, enumC168525, enumC168529};
        f54360 = new EnumC16856[]{enumC168525, enumC168529};
        f54346 = new EnumC16856[]{enumC168525, enumC168529};
        f54369 = ", ";
        f54350 = "";
        f54386 = " ";
        f54348 = " ";
        f54384 = EnumC19840.ORDINARY;
    }

    public EnumC16856(String str, int i, int i2, String str2, EnumC19840... enumC19840Arr) {
        super(str, i);
        this.f54389 = 0;
        this.f54390 = i2;
        this.f54388 = str2;
        this.f54391 = new HashSet(10);
        if (enumC19840Arr != null) {
            for (EnumC19840 enumC19840 : enumC19840Arr) {
                this.f54391.add(enumC19840);
                this.f54389 = enumC19840.m45697() | this.f54389;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39777(EnumC19840 enumC19840) {
        f54384 = enumC19840;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static EnumC19840 m39795() {
        return f54384;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m39782(int i) {
        return (i & f54367.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m39769(int i) {
        return (i & f54378.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m39789(int i) {
        return (i & f54371.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m39809(int i) {
        return (i & f54351.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m39781(int i) {
        return (i & f54345.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m39785(int i) {
        return m39781(i);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m39801(int i) {
        return (i & f54387.f54390) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m39797(int i) {
        return m39801(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m39768(int i) {
        return (i & f54366.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m39799(int i) {
        return m39768(i);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m39770(int i) {
        return m39768(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39798(int i) {
        return (i & f54372.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m39784(int i) {
        return m39798(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m39808(int i) {
        return (i & f54381.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39788(int i) {
        return (i & f54353.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39804(int i) {
        return (i & f54376.f54390) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m39792(int i) {
        return (i & f54365.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m39806(int i, EnumC16856[] enumC16856Arr) {
        int i2 = 0;
        for (EnumC16856 enumC16856 : enumC16856Arr) {
            int i3 = enumC16856.f54390;
            if ((i & i3) != 0) {
                i &= ~i3;
                EnumC19840 enumC19840M39812 = enumC16856.m39812();
                if (f54384 != enumC19840M39812 && enumC19840M39812 != EnumC19840.ORDINARY) {
                    i2 |= enumC16856.f54390;
                }
            }
        }
        return i | i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC19840 m39812() {
        for (EnumC19840 enumC19840 : this.f54391) {
            if (enumC19840.m45700()) {
                return enumC19840;
            }
        }
        return EnumC19840.ORDINARY;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m39765(int i) {
        return (i & f54374.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m39807(int i) {
        return (i & f54361.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m39790(int i) {
        return (i & f54359.f54390) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m39796(int i) {
        return (i & f54349.f54390) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m39810(int i) {
        return m39796(i);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean m39783(int i) {
        return (i & f54382.f54390) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m39793(int i) {
        return (i & f54352.f54390) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m39766(int i) {
        return (i & f54364.f54390) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39767(int i) {
        return (i & f54357.f54390) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39778(int i) {
        return m39783(i) || m39793(i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m39791(int i, EnumC16856... enumC16856Arr) {
        if (enumC16856Arr.length < 2) {
            return enumC16856Arr.length != 0 && i == enumC16856Arr[0].m39816();
        }
        final int iM39773 = i & m39773(enumC16856Arr);
        return C13847.stream(enumC16856Arr).mapToInt(new C1941()).anyMatch(new IntPredicate() { // from class: l.ۧ۬ۛ
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C14549.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C14549.$default$negate(this);
            }

            public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C14549.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return EnumC16856.m39787(iM39773, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39780(int i, EnumC16856... enumC16856Arr) {
        return enumC16856Arr.length > 0 && (i & m39773(enumC16856Arr)) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39802(int i, EnumC16856... enumC16856Arr) {
        if (enumC16856Arr.length > 0) {
            for (EnumC16856 enumC16856 : enumC16856Arr) {
                i &= ~enumC16856.f54390;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39779(int i, EnumC16856 enumC16856, EnumC16856 enumC16857) {
        int iM39816 = enumC16856.m39816() | enumC16857.m39816();
        return (i & iM39816) == iM39816;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m39800(int i, EnumC16856... enumC16856Arr) {
        int i2 = 0;
        for (EnumC16856 enumC16856 : enumC16856Arr) {
            if ((enumC16856.f54390 & i) != 0) {
                i2++;
            }
        }
        return i2 > 1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m39794(int i, EnumC16856... enumC16856Arr) {
        return (m39773(enumC16856Arr) & i) == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39773(EnumC16856... enumC16856Arr) {
        if (enumC16856Arr.length <= 0) {
            return 0;
        }
        int i = 0;
        for (EnumC16856 enumC16856 : enumC16856Arr) {
            i |= enumC16856.f54390;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39772(EnumC19840 enumC19840, EnumC16856... enumC16856Arr) {
        if (enumC16856Arr.length == 0) {
            enumC16856Arr = values();
        }
        int i = 0;
        for (EnumC16856 enumC16856 : enumC16856Arr) {
            if (enumC16856.f54391.contains(enumC19840)) {
                i |= enumC16856.f54390;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39771(ArrayList arrayList, int i, boolean z, EnumC16856 enumC16856) {
        arrayList.add(z ? enumC16856.m39815() : enumC16856.m39814());
        return m39786(i, enumC16856);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39774(int i, EnumC19840 enumC19840) {
        return m39775(i, false, enumC19840, f54386, f54348);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m39803(int i, EnumC19840 enumC19840) {
        return m39775(i, true, enumC19840, f54369, f54350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39775(int i, boolean z, EnumC19840 enumC19840, String str, String str2) {
        ArrayList arrayListM39776 = m39776(i, z, enumC19840);
        if (str == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayListM39776.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) str);
            }
        }
        String string = sb.toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C14483.m34972(string, str2);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m39776(int i, boolean z, EnumC19840 enumC19840) {
        ArrayList arrayList = new ArrayList();
        if (m39782(i)) {
            EnumC16856 enumC16856 = f54367;
            if (enumC19840.m45698(enumC16856)) {
                i = m39771(arrayList, i, z, enumC16856);
            }
        }
        if (m39769(i)) {
            EnumC16856 enumC16857 = f54378;
            if (enumC19840.m45698(enumC16857)) {
                i = m39771(arrayList, i, z, enumC16857);
            }
        }
        if (m39789(i)) {
            EnumC16856 enumC16858 = f54371;
            if (enumC19840.m45698(enumC16858)) {
                i = m39771(arrayList, i, z, enumC16858);
            }
        }
        if (m39809(i)) {
            EnumC16856 enumC16859 = f54351;
            if (enumC19840.m45698(enumC16859)) {
                i = m39771(arrayList, i, z, enumC16859);
            }
        }
        if (m39781(i) && enumC19840.m45699(EnumC19840.CLASS, EnumC19840.INNER_CLASS, EnumC19840.FIELD, EnumC19840.METHOD, EnumC19840.METHOD_PARAMETERS)) {
            i = m39771(arrayList, i, z, f54345);
        }
        if (m39801(i)) {
            int i2 = C25062.f81064[enumC19840.ordinal()];
            if (i2 == 1) {
                i = m39771(arrayList, i, z, f54384 == EnumC19840.VALUE_OBJECTS ? f54357 : f54387);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i = m39771(arrayList, i, z, f54385);
                } else if (i2 == 4) {
                    i = m39771(arrayList, i, z, f54373);
                } else if (i2 == 5) {
                    i = m39771(arrayList, i, z, f54383);
                }
            } else if (f54384 == EnumC19840.VALUE_OBJECTS) {
                i = m39771(arrayList, i, z, f54357);
            }
        }
        if (m39768(i)) {
            int i3 = C25062.f81064[enumC19840.ordinal()];
            if (i3 == 3) {
                i = m39771(arrayList, i, z, f54344);
            } else if (i3 == 4) {
                i = m39771(arrayList, i, z, f54342);
            } else if (i3 == 6) {
                i = m39771(arrayList, i, z, f54366);
            }
        }
        if (m39798(i)) {
            int i4 = C25062.f81064[enumC19840.ordinal()];
            if (i4 == 4) {
                i = m39771(arrayList, i, z, f54379);
            } else if (i4 == 6) {
                i = m39771(arrayList, i, z, f54372);
            }
        }
        if (m39808(i) && C25062.f81064[enumC19840.ordinal()] == 4) {
            i = m39771(arrayList, i, z, f54381);
        }
        if (m39788(i) && enumC19840.m45699(EnumC19840.CLASS, EnumC19840.INNER_CLASS)) {
            i = z ? m39771(arrayList, i, true, f54353) : m39786(i, f54353);
        }
        if (m39804(i) && enumC19840.m45699(EnumC19840.CLASS, EnumC19840.INNER_CLASS, EnumC19840.METHOD)) {
            i = m39771(arrayList, i, z, f54376);
        }
        if (m39792(i)) {
            int i5 = C25062.f81064[enumC19840.ordinal()];
            if (i5 == 4) {
                i = m39771(arrayList, i, z, f54365);
            } else if (i5 == 6 && f54384 == EnumC19840.VALUE_OBJECTS) {
                i = m39771(arrayList, i, z, f54365);
            }
        }
        if (m39765(i)) {
            EnumC16856 enumC168510 = f54374;
            if (enumC19840.m45698(enumC168510)) {
                i = m39771(arrayList, i, z, enumC168510);
            }
        }
        if (m39807(i) && enumC19840.m45699(EnumC19840.CLASS, EnumC19840.INNER_CLASS)) {
            i = m39771(arrayList, i, z, f54361);
        }
        if (m39790(i) && enumC19840.m45699(EnumC19840.CLASS, EnumC19840.INNER_CLASS, EnumC19840.FIELD)) {
            i = m39771(arrayList, i, z, f54359);
        }
        if (m39796(i)) {
            if (enumC19840 == EnumC19840.CLASS) {
                i = z ? m39771(arrayList, i, true, f54349) : m39786(i, f54349);
            } else if (enumC19840.m45699(EnumC19840.MODULE, EnumC19840.REQUIRES, EnumC19840.EXPORTS, EnumC19840.OPENS, EnumC19840.METHOD_PARAMETERS)) {
                i = m39771(arrayList, i, z, f54368);
            }
        }
        if (i != 0) {
            arrayList.add(String.format("0x%04X", Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m39786(int i, EnumC16856... enumC16856Arr) {
        for (EnumC16856 enumC16856 : enumC16856Arr) {
            int i2 = enumC16856.f54390;
            if ((i & i2) != 0) {
                i &= ~i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set m39817() {
        return this.f54391;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m39813() {
        return this.f54389;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int m39816() {
        return this.f54390;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m39814() {
        return this.f54388;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m39815() {
        return toString();
    }
}
