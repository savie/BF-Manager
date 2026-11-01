package l;

/* JADX INFO: renamed from: l.ᩴۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18733 {
    STATIC,
    NON_STATIC,
    BOTH,
    UNDEFINED;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18733 m43281(AbstractC23903 abstractC23903) {
        return abstractC23903.mo22992() ? STATIC : NON_STATIC;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18733 m43280(EnumC18733 enumC18733, EnumC18733 enumC18734) {
        EnumC18733 enumC18735 = UNDEFINED;
        if (enumC18733 == enumC18735) {
            return enumC18734;
        }
        return (enumC18734 == enumC18735 || enumC18733 == enumC18734) ? enumC18733 : BOTH;
    }
}
