package l;

import java.util.Arrays;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܳܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15400 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22860 f50206;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumSet f50207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet f50208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13477 f50205 = new C13477();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f50204 = new ConcurrentMapC17249(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15400 m36873(C4747 c4747) {
        C15400 c15400 = (C15400) c4747.m14643(f50205);
        return c15400 == null ? new C15400(c4747) : c15400;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15400 m36876(AbstractC11781 abstractC11781) {
        C15400 c15400M51580 = this.f50206.m51580(this, abstractC11781.m29561());
        if (abstractC11781.mo9560()) {
            if (c15400M51580 == this) {
                c15400M51580 = new C15400(this);
            }
            EnumSet enumSet = c15400M51580.f50207;
            EnumC19876 enumC19876 = EnumC19876.DEPRECATION;
            enumSet.remove(enumC19876);
            c15400M51580.f50208.add(enumC19876);
        }
        return c15400M51580;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15400 m36877(EnumC19876... enumC19876Arr) {
        C15400 c15400 = new C15400(this);
        c15400.f50207.removeAll(Arrays.asList(enumC19876Arr));
        c15400.f50208.addAll(Arrays.asList(enumC19876Arr));
        return c15400;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    public C15400(C4747 c4747) {
        C13015 c13015M32421 = C13015.m32421(c4747);
        if (c13015M32421.m32433(EnumC7687.f25345)) {
            this.f50207 = EnumSet.allOf(EnumC19876.class);
        } else {
            EnumC7687 enumC7687 = EnumC7687.f25329;
            if (c13015M32421.m32427(enumC7687, ProviderConfigurationPermission.ALL_STR)) {
                this.f50207 = EnumSet.allOf(EnumC19876.class);
            } else if (c13015M32421.m32427(enumC7687, "none")) {
                this.f50207 = EnumSet.noneOf(EnumC19876.class);
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC19876.class);
                this.f50207 = enumSetNoneOf;
                EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
                if (enumC20820M47625.compareTo(EnumC20820.JDK9) >= 0) {
                    enumSetNoneOf.add(EnumC19876.DEP_ANN);
                }
                if (EnumC3666.f12573.m11915(enumC20820M47625)) {
                    enumSetNoneOf.add(EnumC19876.STRICTFP);
                }
                enumSetNoneOf.add(EnumC19876.REQUIRES_TRANSITIVE_AUTOMATIC);
                enumSetNoneOf.add(EnumC19876.OPENS);
                enumSetNoneOf.add(EnumC19876.MODULE);
                enumSetNoneOf.add(EnumC19876.REMOVAL);
                if (!c13015M32421.m32433(EnumC7687.f25322)) {
                    enumSetNoneOf.add(EnumC19876.PREVIEW);
                }
                enumSetNoneOf.add(EnumC19876.SYNCHRONIZATION);
            }
        }
        for (EnumC19876 enumC19876 : EnumC19876.values()) {
            EnumC7687 enumC7688 = EnumC7687.f25329;
            if (c13015M32421.m32427(enumC7688, enumC19876.f63945)) {
                this.f50207.add(enumC19876);
            } else {
                if (c13015M32421.m32427(enumC7688, "-" + enumC19876.f63945)) {
                    this.f50207.remove(enumC19876);
                }
            }
        }
        this.f50208 = EnumSet.noneOf(EnumC19876.class);
        c4747.m14646(f50205, this);
        this.f50206 = new C22860(c4747);
    }

    public C15400(C15400 c15400) {
        this.f50206 = c15400.f50206;
        this.f50207 = c15400.f50207.clone();
        this.f50208 = c15400.f50208.clone();
    }

    public final String toString() {
        return "Lint:[values" + this.f50207 + " suppressedValues" + this.f50208 + "]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36878(EnumC19876 enumC19876) {
        return this.f50207.contains(enumC19876);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36879(EnumC19876 enumC19876) {
        return this.f50208.contains(enumC19876);
    }
}
