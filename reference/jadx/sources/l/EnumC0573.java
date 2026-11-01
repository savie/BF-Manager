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
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۜܰ' uses external variables
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
/* JADX INFO: renamed from: l.֡ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0573 implements InterfaceC11266, Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0573[] f2382;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2383;

    /* JADX INFO: renamed from: ֡ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2384;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2385;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2386;

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2387;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2388;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2389;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2390;

    /* JADX INFO: renamed from: ֫ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2391;

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2392;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2393;

    /* JADX INFO: renamed from: ۖۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2394;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2395;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2396;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2397;

    /* JADX INFO: renamed from: ۗۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2398;

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2399;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2400;

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2401;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2402;

    /* JADX INFO: renamed from: ۙۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2403;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2404;

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2405;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2406;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2407;

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2408;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2409;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2410;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2411;

    /* JADX INFO: renamed from: ۛۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2412;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2413;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2414;

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2415;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2416;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2417;

    /* JADX INFO: renamed from: ۟ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2418;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2419;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2420;

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2421;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2422;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2423;

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2424;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2425;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2426;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2427;

    /* JADX INFO: renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2428;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2429;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2430;

    /* JADX INFO: renamed from: ۤۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2431;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2432;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2433;

    /* JADX INFO: renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2435;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2436;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2437;

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2438;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2439;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2440;

    /* JADX INFO: renamed from: ۫ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2442;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2443;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2444;

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2445;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2446;

    /* JADX INFO: renamed from: ܰۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2447;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2448;

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2449;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2450;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2451;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2452;

    /* JADX INFO: renamed from: ܳۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2453;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2454;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2455;

    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2456;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2457;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2458;

    /* JADX INFO: renamed from: ܺۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2459;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2461;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2462;

    /* JADX INFO: renamed from: ܽۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2463;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2464;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2465;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2466;

    /* JADX INFO: renamed from: ܿۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2467;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2468;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2469;

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2470;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2471;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2472;

    /* JADX INFO: renamed from: ᩴۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2473;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2474;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2475;

    /* JADX INFO: renamed from: ᩵ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2476;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2477;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2478;

    /* JADX INFO: renamed from: ᩶ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2479;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2480;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2481;

    /* JADX INFO: renamed from: ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2482;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2483;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2484;

    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2485;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2486;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2487;

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2488;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2489;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2490;

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2491;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2492;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2493;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2494;

    /* JADX INFO: renamed from: ᩻ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2495;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2496;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f2497;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC16097 f2498;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2441 = new EnumC0573("EOF", 0);

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0573 f2434 = new EnumC0573("ERROR", 1);

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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m2721() {
        return "Token";
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean test(EnumC0573 enumC0573) {
        return this == enumC0573;
    }

    public static EnumC0573 valueOf(String str) {
        return (EnumC0573) Enum.valueOf(EnumC0573.class, str);
    }

    public static EnumC0573[] values() {
        return (EnumC0573[]) f2382.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0573[] m2720() {
        return new EnumC0573[]{f2441, f2434, f2416, f2461, f2493, f2448, f2437, f2393, f2386, f2444, f2400, f2490, f2472, f2420, f2423, f2430, f2481, f2383, f2462, f2494, f2390, f2427, f2397, f2450, f2439, f2492, f2457, f2486, f2471, f2474, f2422, f2419, f2413, f2436, f2454, f2438, f2394, f2408, f2401, f2456, f2476, f2424, f2479, f2384, f2463, f2442, f2467, f2412, f2495, f2391, f2398, f2403, f2447, f2477, f2483, f2406, f2458, f2414, f2431, f2453, f2452, f2496, f2428, f2433, f2455, f2460, f2415, f2425, f2387, f2432, f2445, f2491, f2469, f2417, f2478, f2466, f2395, f2480, f2451, f2435, f2488, f2484, f2411, f2385, f2409, f2389, f2465, f2396, f2449, f2459, f2399, f2418, f2473, f2485, f2440, f2426, f2407, f2392, f2464, f2489, f2446, f2405, f2482, f2421, f2470, f2410, f2404, f2487, f2429, f2443, f2388, f2402, f2468, f2475};
    }

    static {
        EnumC16097 enumC16097 = EnumC16097.NAMED;
        f2416 = new EnumC0573("IDENTIFIER", 2, enumC16097);
        f2461 = new EnumC0573("ABSTRACT", 3, "abstract");
        f2493 = new EnumC0573("ASSERT", 4, "assert", enumC16097);
        f2448 = new EnumC0573("BOOLEAN", 5, ClassTransform.BOOLEAN, enumC16097);
        f2437 = new EnumC0573("BREAK", 6, "break");
        f2393 = new EnumC0573("BYTE", 7, ClassTransform.BYTE, enumC16097);
        f2386 = new EnumC0573("CASE", 8, "case");
        f2444 = new EnumC0573("CATCH", 9, "catch");
        f2400 = new EnumC0573("CHAR", 10, ClassTransform.CHARACTER, enumC16097);
        f2490 = new EnumC0573("CLASS", 11, Name.LABEL);
        f2472 = new EnumC0573("CONST", 12, "const");
        f2420 = new EnumC0573("CONTINUE", 13, "continue");
        f2423 = new EnumC0573("DEFAULT", 14, "default");
        f2430 = new EnumC0573("DO", 15, "do");
        f2481 = new EnumC0573("DOUBLE", 16, ClassTransform.DOUBLE, enumC16097);
        f2383 = new EnumC0573("ELSE", 17, "else");
        f2462 = new EnumC0573("ENUM", 18, "enum", enumC16097);
        f2494 = new EnumC0573("EXTENDS", 19, "extends");
        f2390 = new EnumC0573("FINAL", 20, "final");
        f2427 = new EnumC0573("FINALLY", 21, "finally");
        f2397 = new EnumC0573("FLOAT", 22, ClassTransform.FLOAT, enumC16097);
        f2450 = new EnumC0573("FOR", 23, "for");
        f2439 = new EnumC0573("GOTO", 24, "goto");
        f2492 = new EnumC0573("IF", 25, "if");
        f2457 = new EnumC0573("IMPLEMENTS", 26, "implements");
        f2486 = new EnumC0573("IMPORT", 27, "import");
        f2471 = new EnumC0573("INSTANCEOF", 28, "instanceof");
        f2474 = new EnumC0573("INT", 29, ClassTransform.INTEGER, enumC16097);
        f2422 = new EnumC0573("INTERFACE", 30, "interface");
        f2419 = new EnumC0573("LONG", 31, ClassTransform.LONG, enumC16097);
        f2413 = new EnumC0573("NATIVE", 32, UMConfigure.WRAPER_TYPE_NATIVE);
        f2436 = new EnumC0573("NEW", 33, "new");
        f2454 = new EnumC0573("PACKAGE", 34, "package");
        f2438 = new EnumC0573("PRIVATE", 35, "private");
        f2394 = new EnumC0573("PROTECTED", 36, "protected");
        f2408 = new EnumC0573("PUBLIC", 37, "public");
        f2401 = new EnumC0573("RETURN", 38, "return");
        f2456 = new EnumC0573("SHORT", 39, ClassTransform.SHORT, enumC16097);
        f2476 = new EnumC0573("STATIC", 40, "static");
        f2424 = new EnumC0573("STRICTFP", 41, "strictfp");
        f2479 = new EnumC0573("SUPER", 42, "super", enumC16097);
        f2384 = new EnumC0573("SWITCH", 43, "switch");
        f2463 = new EnumC0573("SYNCHRONIZED", 44, MessageHandler.Properties.IsSynchronized);
        f2442 = new EnumC0573("THIS", 45, "this", enumC16097);
        f2467 = new EnumC0573("THROW", 46, "throw");
        f2412 = new EnumC0573("THROWS", 47, "throws");
        f2495 = new EnumC0573("TRANSIENT", 48, "transient");
        f2391 = new EnumC0573("TRY", 49, "try");
        f2398 = new EnumC0573("VOID", 50, ClassTransform.VOID, enumC16097);
        f2403 = new EnumC0573("VOLATILE", 51, "volatile");
        f2447 = new EnumC0573("WHILE", 52, "while");
        EnumC16097 enumC16098 = EnumC16097.NUMERIC;
        f2477 = new EnumC0573("INTLITERAL", 53, enumC16098);
        f2483 = new EnumC0573("LONGLITERAL", 54, enumC16098);
        f2406 = new EnumC0573("FLOATLITERAL", 55, enumC16098);
        f2458 = new EnumC0573("DOUBLELITERAL", 56, enumC16098);
        f2414 = new EnumC0573("CHARLITERAL", 57, enumC16098);
        f2431 = new EnumC0573("STRINGLITERAL", 58, EnumC16097.STRING);
        f2453 = new EnumC0573("TRUE", 59, "true", enumC16097);
        f2452 = new EnumC0573("FALSE", 60, "false", enumC16097);
        f2496 = new EnumC0573("NULL", 61, "null", enumC16097);
        f2428 = new EnumC0573("UNDERSCORE", 62, "_", enumC16097);
        f2433 = new EnumC0573("ARROW", 63, "->");
        f2455 = new EnumC0573("COLCOL", 64, "::");
        f2460 = new EnumC0573("LPAREN", 65, MotionUtils.EASING_TYPE_FORMAT_START);
        f2415 = new EnumC0573("RPAREN", 66, MotionUtils.EASING_TYPE_FORMAT_END);
        f2425 = new EnumC0573("LBRACE", 67, "{");
        f2387 = new EnumC0573("RBRACE", 68, l.d);
        f2432 = new EnumC0573("LBRACKET", 69, "[");
        f2445 = new EnumC0573("RBRACKET", 70, "]");
        f2491 = new EnumC0573("SEMI", 71, l.b);
        f2469 = new EnumC0573("COMMA", 72, ",");
        f2417 = new EnumC0573("DOT", 73, ".");
        f2478 = new EnumC0573("ELLIPSIS", 74, "...");
        f2466 = new EnumC0573("EQ", 75, "=");
        f2395 = new EnumC0573("GT", 76, ">");
        f2480 = new EnumC0573("LT", 77, "<");
        f2451 = new EnumC0573("BANG", 78, "!");
        f2435 = new EnumC0573("TILDE", 79, "~");
        f2488 = new EnumC0573("QUES", 80, "?");
        f2484 = new EnumC0573("COLON", 81, ":");
        f2411 = new EnumC0573("EQEQ", 82, "==");
        f2385 = new EnumC0573("LTEQ", 83, "<=");
        f2409 = new EnumC0573("GTEQ", 84, ">=");
        f2389 = new EnumC0573("BANGEQ", 85, "!=");
        f2465 = new EnumC0573("AMPAMP", 86, "&&");
        f2396 = new EnumC0573("BARBAR", 87, "||");
        f2449 = new EnumC0573("PLUSPLUS", 88, "++");
        f2459 = new EnumC0573("SUBSUB", 89, "--");
        f2399 = new EnumC0573("PLUS", 90, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        f2418 = new EnumC0573("SUB", 91, "-");
        f2473 = new EnumC0573("STAR", 92, "*");
        f2485 = new EnumC0573("SLASH", 93, "/");
        f2440 = new EnumC0573("AMP", 94, a.p);
        f2426 = new EnumC0573("BAR", 95, "|");
        f2407 = new EnumC0573("CARET", 96, "^");
        f2392 = new EnumC0573("PERCENT", 97, "%");
        f2464 = new EnumC0573("LTLT", 98, "<<");
        f2489 = new EnumC0573("GTGT", 99, ">>");
        f2446 = new EnumC0573("GTGTGT", 100, ">>>");
        f2405 = new EnumC0573("PLUSEQ", 101, "+=");
        f2482 = new EnumC0573("SUBEQ", IShizukuService.Stub.TRANSACTION_attachUserService, "-=");
        f2421 = new EnumC0573("STAREQ", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "*=");
        f2470 = new EnumC0573("SLASHEQ", IShizukuService.Stub.TRANSACTION_isHidden, "/=");
        f2410 = new EnumC0573("AMPEQ", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "&=");
        f2404 = new EnumC0573("BAREQ", IShizukuService.Stub.TRANSACTION_getFlagsForUid, "|=");
        f2487 = new EnumC0573("CARETEQ", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "^=");
        f2429 = new EnumC0573("PERCENTEQ", 108, "%=");
        f2443 = new EnumC0573("LTLTEQ", 109, "<<=");
        f2388 = new EnumC0573("GTGTEQ", UMErrorCode.E_UM_BE_JSON_FAILED, ">>=");
        f2402 = new EnumC0573("GTGTGTEQ", UMErrorCode.E_UM_BE_CREATE_FAILED, ">>>=");
        f2468 = new EnumC0573("MONKEYS_AT", UMErrorCode.E_UM_BE_DEFLATE_FAILED, "@");
        f2475 = new EnumC0573("CUSTOM", UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        f2382 = m2720();
    }

    public EnumC0573(String str, int i) {
        this(str, i, null, EnumC16097.DEFAULT);
    }

    public EnumC0573(String str, int i, String str2) {
        this(str, i, str2, EnumC16097.DEFAULT);
    }

    public EnumC0573(String str, int i, EnumC16097 enumC16097) {
        this(str, i, null, enumC16097);
    }

    public EnumC0573(String str, int i, String str2, EnumC16097 enumC16097) {
        super(str, i);
        this.f2497 = str2;
        this.f2498 = enumC16097;
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
                        return C22697.m50267(new StringBuilder("'"), this.f2497, "'");
                    default:
                        return this.f2497;
                }
        }
    }

    @Override // l.InterfaceC11266
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo2722(Locale locale, InterfaceC14794 interfaceC14794) {
        if (this.f2497 != null) {
            return toString();
        }
        return ((C22531) interfaceC14794).m50051(locale, "compiler.misc." + toString(), new Object[0]);
    }
}
