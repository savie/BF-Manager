package l;

/* JADX INFO: renamed from: l.ᩳۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N67N */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18966 {
    string,
    type,
    field,
    method,
    none;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m44056(AbstractC10739 abstractC10739) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return abstractC10739 instanceof C3282;
        }
        if (iOrdinal == 1) {
            return abstractC10739 instanceof C20436;
        }
        if (iOrdinal == 2) {
            return abstractC10739 instanceof C13548;
        }
        if (iOrdinal != 3) {
            return iOrdinal == 4 && abstractC10739 == null;
        }
        return abstractC10739 instanceof C5520;
    }
}
