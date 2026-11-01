package l;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14914 implements InterfaceC4557 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18441 f48693;

    public C14914(C18441 c18441) {
        this.f48693 = c18441;
    }

    @Override // l.InterfaceC4557
    /* JADX INFO: renamed from: ۖ */
    public final void mo12697() {
        this.f48693.f58793.remove(this);
    }

    @Override // l.InterfaceC4557
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12698(Uri uri, C4939 c4939, boolean z) {
        C17735 c17735;
        C18441 c18441 = this.f48693;
        if (c18441.f58787 == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C5741 c5741 = c18441.f58788;
            String str = C17983.f57504;
            List list = c5741.f19532;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C17735 c17736 = (C17735) c18441.f58795.get(((C17030) list.get(i2)).f54408);
                if (c17736 != null && jElapsedRealtime < c17736.f56273) {
                    i++;
                }
            }
            C3030 c3030Mo5496 = c18441.f58786.mo5496(new C9382(c18441.f58788.f19532.size(), i), c4939);
            if (c3030Mo5496 != null && c3030Mo5496.f11340 == 2 && (c17735 = (C17735) c18441.f58795.get(uri)) != null) {
                C17735.m41284(c17735, c3030Mo5496.f11339);
            }
        }
        return false;
    }
}
