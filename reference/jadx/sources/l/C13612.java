package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13612 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f44915 = EnumSet.of(EnumC4438.LABELS);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f44914 = EnumSet.of(EnumC4438.CONSTANT_POOL, EnumC4438.PRINT_BCI, EnumC4438.CP_INDEX, EnumC4438.DETAILED_Output);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f44917 = EnumSet.of(EnumC4438.DROP_Source, EnumC4438.DROP_Classes, EnumC4438.DROP_CharacterRange);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f44916 = EnumSet.of(EnumC4438.LINE_NUMBER_TABLE_Numbers, EnumC4438.LINE_NUMBER_TABLE_Lines, EnumC4438.LINE_NUMBER_TABLE_Table);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f44913 = EnumSet.of(EnumC4438.LOCAL_VARIABLE_Vars, EnumC4438.LOCAL_VARIABLE_Types);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m33287() {
        return (String) C9030.stream(f44915).map(new C14235(0)).collect(C1890.joining("\n"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33284(EnumC4438 enumC4438) {
        if (enumC4438 == EnumC4438.PRINT_BCI) {
            AbstractC6741.f22679 = 27;
        }
        f44915.add(enumC4438);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m33281() {
        m33283(f44914);
        EnumC4438 enumC4438 = EnumC4438.LABELS;
        if (enumC4438 == EnumC4438.PRINT_BCI) {
            AbstractC6741.f22679 = 25;
        }
        f44915.remove(enumC4438);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33283(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            m33284((EnumC4438) it.next());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33288(EnumC4438 enumC4438) {
        int iOrdinal = enumC4438.ordinal();
        if (iOrdinal == 8) {
            m33283(f44916);
        } else if (iOrdinal == 11) {
            m33283(f44913);
        } else {
            if (iOrdinal != 22) {
                throw new RuntimeException(C15489.m37076(enumC4438.name(), " ia not group option"));
            }
            m33283(f44917);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33286() {
        f44915.clear();
        m33284(EnumC4438.LABELS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33285(EnumC4438... enumC4438Arr) {
        for (EnumC4438 enumC4438 : enumC4438Arr) {
            if (f44915.contains(enumC4438)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33282() {
        return String.format("[ %s ]", C9030.stream(f44915).map(new C1533(0)).collect(C1890.joining(", ")));
    }
}
