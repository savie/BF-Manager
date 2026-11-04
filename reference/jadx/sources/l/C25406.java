package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes.dex */
public final class C25406 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81983 = EnumSet.of(EnumC11979.LABELS);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81981 = EnumSet.of(EnumC11979.CONSTANT_POOL, EnumC11979.PRINT_BCI, EnumC11979.CP_INDEX, EnumC11979.DETAILED_Output);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81984 = EnumSet.of(EnumC11979.DROP_Source, EnumC11979.DROP_Classes, EnumC11979.DROP_CharacterRange);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81982 = EnumSet.of(EnumC11979.LINE_NUMBER_TABLE_Numbers, EnumC11979.LINE_NUMBER_TABLE_Lines, EnumC11979.LINE_NUMBER_TABLE_Table);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumSet f81985 = EnumSet.of(EnumC11979.LOCAL_VARIABLE_Vars, EnumC11979.LOCAL_VARIABLE_Types);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m56771() {
        return (String) C1170.stream(f81983).map(new C13471(0)).collect(C2025.joining("\n"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56768(EnumC11979 enumC11979) {
        if (enumC11979 == EnumC11979.PRINT_BCI) {
            AbstractC20997.f67124 = 27;
        }
        f81983.add(enumC11979);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m56773() {
        m56767(f81981);
        EnumC11979 enumC11979 = EnumC11979.LABELS;
        if (enumC11979 == EnumC11979.PRINT_BCI) {
            AbstractC20997.f67124 = 25;
        }
        f81983.remove(enumC11979);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56767(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            m56768((EnumC11979) it.next());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56772(EnumC11979 enumC11979) {
        int iOrdinal = enumC11979.ordinal();
        if (iOrdinal == 8) {
            m56767(f81982);
        } else if (iOrdinal == 11) {
            m56767(f81985);
        } else {
            if (iOrdinal != 22) {
                throw new RuntimeException(C14483.m34972(enumC11979.name(), " ia not group option"));
            }
            m56767(f81984);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m56770() {
        f81983.clear();
        m56768(EnumC11979.LABELS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56769(EnumC11979... enumC11979Arr) {
        for (EnumC11979 enumC11979 : enumC11979Arr) {
            if (f81983.contains(enumC11979)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56766() {
        return String.format("[ %s ]", C1170.stream(f81983).map(new C23773(9)).collect(C2025.joining(", ")));
    }
}
