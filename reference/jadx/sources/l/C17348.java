package l;

import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17348 implements InterfaceC17105 {
    @Override // l.InterfaceC17105
    /* JADX INFO: renamed from: ۙ */
    public final void mo40270(IOException iOException) {
    }

    @Override // l.InterfaceC17105
    /* JADX INFO: renamed from: ۙ */
    public final void mo40271(byte[] bArr) {
        HashMap mapM41700 = C17851.m41700(new String(bArr, Charset.defaultCharset()));
        if (mapM41700.containsKey("Data")) {
            int i = Integer.parseInt((String) mapM41700.get(e.g));
            byte[] bArrDecode = Base64.decode((String) mapM41700.get("Data"), 0);
            if (C23316.m52469(bArrDecode)) {
                ApplicationC17729.f58258.edit().mo3487(System.currentTimeMillis(), "JIAGU_TIME").mo3486(i, "JIAGU_VERSION").mo3488("JIAGU_DATA", bArrDecode).apply();
            }
        }
    }
}
