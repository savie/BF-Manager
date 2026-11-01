package l;

/* JADX INFO: renamed from: l.ۘܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AUY */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3984 {
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


    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3984[] f14806 = new EnumC3984[0];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f14811 = 1 << ordinal();

    EnumC3984() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11482(EnumC3984[] enumC3984Arr) {
        if (enumC3984Arr == null) {
            return 0;
        }
        int i = 0;
        for (EnumC3984 enumC3984 : enumC3984Arr) {
            i |= enumC3984.f14811;
        }
        return i;
    }
}
