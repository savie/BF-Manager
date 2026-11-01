package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.۠ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8404 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28995 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f28996 = new ConcurrentMapC13783(64);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m21884(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC18943.class);
        for (EnumC18943 enumC18943 : EnumC18943.values()) {
            if ((enumC18943.f61344 & j) != 0) {
                enumSetNoneOf.add(enumC18943);
                j &= ~enumC18943.f61344;
            }
        }
        C6171.m17176(j == 0);
        return enumSetNoneOf;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Set m21885(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentMapC13783 concurrentMapC13783 = f28996;
        Set set = (Set) concurrentMapC13783.get(lValueOf);
        if (set != null) {
            return set;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC4870.class);
        if (0 != (1 & j)) {
            enumSetNoneOf.add(EnumC4870.f17141);
        }
        if (0 != (4 & j)) {
            enumSetNoneOf.add(EnumC4870.f17133);
        }
        if (0 != (2 & j)) {
            enumSetNoneOf.add(EnumC4870.f17131);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j)) {
            enumSetNoneOf.add(EnumC4870.f17140);
        }
        if (0 != (8 & j)) {
            enumSetNoneOf.add(EnumC4870.f17128);
        }
        if (0 != (SkeinEngine.UbiTweak.T1_FIRST & j)) {
            enumSetNoneOf.add(EnumC4870.f17136);
        }
        if (0 != (Long.MIN_VALUE & j)) {
            enumSetNoneOf.add(EnumC4870.f17139);
        }
        if (0 != (16 & j)) {
            enumSetNoneOf.add(EnumC4870.f17138);
        }
        if (0 != (128 & j)) {
            enumSetNoneOf.add(EnumC4870.f17130);
        }
        if (0 != (64 & j)) {
            enumSetNoneOf.add(EnumC4870.f17135);
        }
        if (0 != (32 & j)) {
            enumSetNoneOf.add(EnumC4870.f17129);
        }
        if (0 != (256 & j)) {
            enumSetNoneOf.add(EnumC4870.f17134);
        }
        if (0 != (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & j)) {
            enumSetNoneOf.add(EnumC4870.f17132);
        }
        if (0 != (8796093022208L & j)) {
            enumSetNoneOf.add(EnumC4870.f17127);
        }
        Set setUnmodifiableSet = C0561.unmodifiableSet(enumSetNoneOf);
        concurrentMapC13783.put(Long.valueOf(j), setUnmodifiableSet);
        return setUnmodifiableSet;
    }
}
