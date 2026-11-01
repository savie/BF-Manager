package l;

import java.util.Arrays;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܽᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16826 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16576 f53857 = new C16576();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f53858 = new ConcurrentMapC13783(20);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20354 f53859;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumSet f53860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumSet f53861;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16826 m39463(C12343 c12343) {
        C16826 c16826 = (C16826) c12343.m30656(f53857);
        return c16826 == null ? new C16826(c12343) : c16826;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16826 m39465(AbstractC23903 abstractC23903) {
        C16826 c16826M45923 = this.f53859.m45923(this, abstractC23903.m52716());
        if (abstractC23903.mo44803()) {
            if (c16826M45923 == this) {
                c16826M45923 = new C16826(this);
            }
            EnumSet enumSet = c16826M45923.f53860;
            EnumC0597 enumC0597 = EnumC0597.DEPRECATION;
            enumSet.remove(enumC0597);
            c16826M45923.f53861.add(enumC0597);
        }
        return c16826M45923;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16826 m39466(EnumC0597... enumC0597Arr) {
        C16826 c16826 = new C16826(this);
        c16826.f53860.removeAll(Arrays.asList(enumC0597Arr));
        c16826.f53861.addAll(Arrays.asList(enumC0597Arr));
        return c16826;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    public C16826(C12343 c12343) {
        C14770 c14770M35395 = C14770.m35395(c12343);
        if (c14770M35395.m35408(EnumC19730.f63340)) {
            this.f53860 = EnumSet.allOf(EnumC0597.class);
        } else {
            EnumC19730 enumC19730 = EnumC19730.f63399;
            if (c14770M35395.m35402(enumC19730, ProviderConfigurationPermission.ALL_STR)) {
                this.f53860 = EnumSet.allOf(EnumC0597.class);
            } else if (c14770M35395.m35402(enumC19730, "none")) {
                this.f53860 = EnumSet.noneOf(EnumC0597.class);
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC0597.class);
                this.f53860 = enumSetNoneOf;
                EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
                if (enumC11909M29706.compareTo(EnumC11909.JDK9) >= 0) {
                    enumSetNoneOf.add(EnumC0597.DEP_ANN);
                }
                if (EnumC14026.f46122.m33945(enumC11909M29706)) {
                    enumSetNoneOf.add(EnumC0597.STRICTFP);
                }
                enumSetNoneOf.add(EnumC0597.REQUIRES_TRANSITIVE_AUTOMATIC);
                enumSetNoneOf.add(EnumC0597.OPENS);
                enumSetNoneOf.add(EnumC0597.MODULE);
                enumSetNoneOf.add(EnumC0597.REMOVAL);
                if (!c14770M35395.m35408(EnumC19730.f63323)) {
                    enumSetNoneOf.add(EnumC0597.PREVIEW);
                }
                enumSetNoneOf.add(EnumC0597.SYNCHRONIZATION);
            }
        }
        for (EnumC0597 enumC0597 : EnumC0597.values()) {
            EnumC19730 enumC19731 = EnumC19730.f63399;
            if (c14770M35395.m35402(enumC19731, enumC0597.f2616)) {
                this.f53860.add(enumC0597);
            } else {
                if (c14770M35395.m35402(enumC19731, "-" + enumC0597.f2616)) {
                    this.f53860.remove(enumC0597);
                }
            }
        }
        this.f53861 = EnumSet.noneOf(EnumC0597.class);
        c12343.m30659(f53857, this);
        this.f53859 = new C20354(c12343);
    }

    public C16826(C16826 c16826) {
        this.f53859 = c16826.f53859;
        this.f53860 = c16826.f53860.clone();
        this.f53861 = c16826.f53861.clone();
    }

    public final String toString() {
        return "Lint:[values" + this.f53860 + " suppressedValues" + this.f53861 + "]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39467(EnumC0597 enumC0597) {
        return this.f53860.contains(enumC0597);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39468(EnumC0597 enumC0597) {
        return this.f53861.contains(enumC0597);
    }
}
