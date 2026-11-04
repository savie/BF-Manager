package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3509 implements InterfaceC1272 {
    @Override // l.InterfaceC1272
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4645(C15648 c15648) {
        String str = c15648.f50848;
        return C17359.equals(str, "text/x-ssa") || C17359.equals(str, "text/vtt") || C17359.equals(str, "application/x-mp4-vtt") || C17359.equals(str, "application/x-subrip") || C17359.equals(str, "application/x-quicktime-tx3g") || C17359.equals(str, "application/pgs") || C17359.equals(str, "application/vobsub") || C17359.equals(str, "application/dvbsubs") || C17359.equals(str, "application/ttml+xml");
    }

    @Override // l.InterfaceC1272
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4647(C15648 c15648) {
        String str = c15648.f50848;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(C25272.m56409("Unsupported MIME type: ", str));
    }

    @Override // l.InterfaceC1272
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC2763 mo4646(C15648 c15648) {
        String str = c15648.f50848;
        List list = c15648.f50835;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C14915(list);
                case "application/pgs":
                    return new C18645();
                case "application/x-mp4-vtt":
                    return new C11341();
                case "text/vtt":
                    return new C24022();
                case "application/x-quicktime-tx3g":
                    return new C12833(list);
                case "text/x-ssa":
                    return new C8204(list);
                case "application/vobsub":
                    return new C1647(list);
                case "application/x-subrip":
                    return new C9694();
                case "application/ttml+xml":
                    return new C21784();
            }
        }
        throw new IllegalArgumentException(C25272.m56409("Unsupported MIME type: ", str));
    }
}
