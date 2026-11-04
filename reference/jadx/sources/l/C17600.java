package l;

/* JADX INFO: renamed from: l.ܽ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17600 implements InterfaceC16108 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41263(C15648 c15648) {
        String str = c15648.f50848;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13468 m41262(C15648 c15648) {
        String str = c15648.f50848;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C2282();
                case "application/x-icy":
                    return new C23911();
                case "application/id3":
                    return new C8248(null);
                case "application/x-emsg":
                    return new C25403();
                case "application/x-scte35":
                    return new C15463();
            }
        }
        throw new IllegalArgumentException(C25272.m56409("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
