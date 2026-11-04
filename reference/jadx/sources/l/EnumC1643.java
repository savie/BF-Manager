package l;

/* JADX INFO: renamed from: l.֫ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AUY */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1643 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue;


    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC1643[] f5696 = new EnumC1643[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f5702 = 1 << ordinal();

    EnumC1643() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5815(EnumC1643[] enumC1643Arr) {
        if (enumC1643Arr == null) {
            return 0;
        }
        int i = 0;
        for (EnumC1643 enumC1643 : enumC1643Arr) {
            i |= enumC1643.f5702;
        }
        return i;
    }
}
