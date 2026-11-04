package l;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8323 implements InterfaceC4023 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4769 f27306;

    public C8323(C4769 c4769) {
        this.f27306 = c4769;
    }

    @Override // l.InterfaceC4023
    /* JADX INFO: renamed from: ᩸ */
    public final void mo12991() {
        this.f27306.f16738.remove(this);
    }

    @Override // l.InterfaceC4023
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12990(Uri uri, C24503 c24503, boolean z) {
        C13543 c13543;
        C4769 c4769 = this.f27306;
        if (c4769.f16730 == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C15955 c15955 = c4769.f16727;
            String str = C7116.f23455;
            List list = c15955.f51801;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C13543 c13544 = (C13543) c4769.f16733.get(((C17447) list.get(i2)).f56744);
                if (c13544 != null && jElapsedRealtime < c13544.f43019) {
                    i++;
                }
            }
            C6603 c6603Mo13869 = c4769.f16734.mo13869(new C12568(c4769.f16727.f51801.size(), i), c24503);
            if (c6603Mo13869 != null && c6603Mo13869.f22090 == 2 && (c13543 = (C13543) c4769.f16733.get(uri)) != null) {
                C13543.m33251(c13543, c6603Mo13869.f22089);
            }
        }
        return false;
    }
}
