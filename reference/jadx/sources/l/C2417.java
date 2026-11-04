package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.ۖۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8404 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7744 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f7745 = new ConcurrentMapC17249(64);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m8159(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC9128.class);
        for (EnumC9128 enumC9128 : EnumC9128.values()) {
            if ((enumC9128.f29689 & j) != 0) {
                enumSetNoneOf.add(enumC9128);
                j &= ~enumC9128.f29689;
            }
        }
        C11972.m30026(j == 0);
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Set m8160(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentMapC17249 concurrentMapC17249 = f7745;
        Set set = (Set) concurrentMapC17249.get(lValueOf);
        if (set != null) {
            return set;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC24688.class);
        if (0 != (1 & j)) {
            enumSetNoneOf.add(EnumC24688.f79880);
        }
        if (0 != (4 & j)) {
            enumSetNoneOf.add(EnumC24688.f79874);
        }
        if (0 != (2 & j)) {
            enumSetNoneOf.add(EnumC24688.f79881);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j)) {
            enumSetNoneOf.add(EnumC24688.f79886);
        }
        if (0 != (8 & j)) {
            enumSetNoneOf.add(EnumC24688.f79879);
        }
        if (0 != (SkeinEngine.UbiTweak.T1_FIRST & j)) {
            enumSetNoneOf.add(EnumC24688.f79875);
        }
        if (0 != (Long.MIN_VALUE & j)) {
            enumSetNoneOf.add(EnumC24688.f79885);
        }
        if (0 != (16 & j)) {
            enumSetNoneOf.add(EnumC24688.f79873);
        }
        if (0 != (128 & j)) {
            enumSetNoneOf.add(EnumC24688.f79876);
        }
        if (0 != (64 & j)) {
            enumSetNoneOf.add(EnumC24688.f79887);
        }
        if (0 != (32 & j)) {
            enumSetNoneOf.add(EnumC24688.f79882);
        }
        if (0 != (256 & j)) {
            enumSetNoneOf.add(EnumC24688.f79878);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & j)) {
            enumSetNoneOf.add(EnumC24688.f79877);
        }
        if (0 != (8796093022208L & j)) {
            enumSetNoneOf.add(EnumC24688.f79884);
        }
        Set setUnmodifiableSet = C4681.unmodifiableSet(enumSetNoneOf);
        concurrentMapC17249.put(Long.valueOf(j), setUnmodifiableSet);
        return setUnmodifiableSet;
    }
}
