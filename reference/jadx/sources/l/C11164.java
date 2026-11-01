package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11164 implements InterfaceC13302 {
    @Override // l.InterfaceC13302
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4660(C7648 c7648) {
        String str = c7648.f25265;
        return C13638.equals(str, "text/x-ssa") || C13638.equals(str, "text/vtt") || C13638.equals(str, "application/x-mp4-vtt") || C13638.equals(str, "application/x-subrip") || C13638.equals(str, "application/x-quicktime-tx3g") || C13638.equals(str, "application/pgs") || C13638.equals(str, "application/vobsub") || C13638.equals(str, "application/dvbsubs") || C13638.equals(str, "application/ttml+xml");
    }

    @Override // l.InterfaceC13302
    /* JADX INFO: renamed from: ܰ */
    public final int mo4662(C7648 c7648) {
        String str = c7648.f25265;
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
        throw new IllegalArgumentException(C0252.m1693("Unsupported MIME type: ", str));
    }

    @Override // l.InterfaceC13302
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC6951 mo4661(C7648 c7648) {
        String str = c7648.f25265;
        List list = c7648.f25268;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C4524(list);
                case "application/pgs":
                    return new C11581();
                case "application/x-mp4-vtt":
                    return new C20048();
                case "text/vtt":
                    return new C9465();
                case "application/x-quicktime-tx3g":
                    return new C7347(list);
                case "text/x-ssa":
                    return new C5230(list);
                case "application/vobsub":
                    return new C15815(list);
                case "application/x-subrip":
                    return new C3818();
                case "application/ttml+xml":
                    return new C18636();
            }
        }
        throw new IllegalArgumentException(C0252.m1693("Unsupported MIME type: ", str));
    }
}
