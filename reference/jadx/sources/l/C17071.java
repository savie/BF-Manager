package l;

/* JADX INFO: renamed from: l.ܿۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17071 implements InterfaceC5782 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39855(C7648 c7648) {
        String str = c7648.f25265;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21188 m39854(C7648 c7648) {
        String str = c7648.f25265;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C20483();
                case "application/x-icy":
                    return new C6371();
                case "application/id3":
                    return new C5436(null);
                case "application/x-emsg":
                    return new C16955();
                case "application/x-scte35":
                    return new C10376();
            }
        }
        throw new IllegalArgumentException(C0252.m1693("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
