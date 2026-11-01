package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SB */
/* JADX INFO: loaded from: classes2.dex */
public class C1619 implements InterfaceC14113 {
    @Override // l.InterfaceC14113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5494(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // l.InterfaceC14113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3030 mo5496(C9382 c9382, C4939 c4939) {
        IOException iOException = c4939.f17273;
        if (!(iOException instanceof C1360)) {
            return null;
        }
        int i = ((C1360) iOException).f5709;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && c9382.f31757 - c9382.f31756 > 1) {
            return new C3030(2, 60000L);
        }
        return null;
    }

    @Override // l.InterfaceC14113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long mo5495(C4939 c4939) {
        Throwable cause = c4939.f17273;
        if ((cause instanceof C22861) || (cause instanceof FileNotFoundException) || (cause instanceof C2771) || (cause instanceof C7056)) {
            return -9223372036854775807L;
        }
        int i = C20018.f64120;
        while (cause != null) {
            if ((cause instanceof C20018) && ((C20018) cause).f64121 == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c4939.f17272 - 1) * 1000, OpenAuthTask.Duplex);
    }
}
