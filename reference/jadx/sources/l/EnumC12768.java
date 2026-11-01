package l;

/* JADX INFO: renamed from: l.۬֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N67N */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12768 {
    string,
    type,
    field,
    method,
    none;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m31744(AbstractC9011 abstractC9011) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return abstractC9011 instanceof C14655;
        }
        if (iOrdinal == 1) {
            return abstractC9011 instanceof C1953;
        }
        if (iOrdinal == 2) {
            return abstractC9011 instanceof C18888;
        }
        if (iOrdinal != 3) {
            return iOrdinal == 4 && abstractC9011 == null;
        }
        return abstractC9011 instanceof C20299;
    }
}
