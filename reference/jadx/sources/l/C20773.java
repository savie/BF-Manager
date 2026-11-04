package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SB */
/* JADX INFO: loaded from: classes5.dex */
public class C20773 implements InterfaceC4365 {
    @Override // l.InterfaceC4365
    /* JADX INFO: renamed from: ۙ */
    public final int mo13867(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // l.InterfaceC4365
    /* JADX INFO: renamed from: ۙ */
    public final C6603 mo13869(C12568 c12568, C24503 c24503) {
        IOException iOException = c24503.f79485;
        if (!(iOException instanceof C8213)) {
            return null;
        }
        int i = ((C8213) iOException).f27043;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && c12568.f40360 - c12568.f40359 > 1) {
            return new C6603(2, 60000L);
        }
        return null;
    }

    @Override // l.InterfaceC4365
    /* JADX INFO: renamed from: ۙ */
    public long mo13868(C24503 c24503) {
        Throwable cause = c24503.f79485;
        if ((cause instanceof C2970) || (cause instanceof FileNotFoundException) || (cause instanceof C21638) || (cause instanceof C10330)) {
            return -9223372036854775807L;
        }
        int i = C5976.f20472;
        while (cause != null) {
            if ((cause instanceof C5976) && ((C5976) cause).f20473 == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c24503.f79484 - 1) * 1000, OpenAuthTask.Duplex);
    }
}
