package l;

/* JADX INFO: renamed from: l.֨ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1119 implements InterfaceC9321 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3509 f4179 = new C3509();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4157(C15648 c15648) {
        String str = c15648.f50848;
        return this.f4179.mo4645(c15648) || C17359.equals(str, "application/cea-608") || C17359.equals(str, "application/x-mp4-cea-608") || C17359.equals(str, "application/cea-708");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4255 m4156(C15648 c15648) {
        String str = c15648.f50848;
        int i = c15648.f50818;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new C11186(str, i);
                case "application/cea-708":
                    return new C5967(i, c15648.f50835);
            }
        }
        C3509 c3509 = this.f4179;
        if (!c3509.mo4645(c15648)) {
            throw new IllegalArgumentException(C25272.m56409("Attempted to create decoder for unsupported MIME type: ", str));
        }
        InterfaceC2763 interfaceC2763Mo4646 = c3509.mo4646(c15648);
        return new C7831(interfaceC2763Mo4646.getClass().getSimpleName().concat("Decoder"), interfaceC2763Mo4646);
    }
}
