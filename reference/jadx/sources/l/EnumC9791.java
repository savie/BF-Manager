package l;

/* JADX INFO: renamed from: l.ۢ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9791 {
    STATIC,
    NON_STATIC,
    BOTH,
    UNDEFINED;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9791 m25521(AbstractC11781 abstractC11781) {
        return abstractC11781.mo7874() ? STATIC : NON_STATIC;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9791 m25520(EnumC9791 enumC9791, EnumC9791 enumC9792) {
        EnumC9791 enumC9793 = UNDEFINED;
        if (enumC9791 == enumC9793) {
            return enumC9792;
        }
        return (enumC9792 == enumC9793 || enumC9791 == enumC9792) ? enumC9791 : BOTH;
    }
}
