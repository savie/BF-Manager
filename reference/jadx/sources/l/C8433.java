package l;

import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۠᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8433 implements InterfaceC21692 {
    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22086(IOException iOException) {
    }

    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22087(byte[] bArr) {
        HashMap mapM42286 = C18164.m42286(new String(bArr, Charset.defaultCharset()));
        if (mapM42286.containsKey("Data")) {
            int i = Integer.parseInt((String) mapM42286.get(e.g));
            byte[] bArrDecode = Base64.decode((String) mapM42286.get("Data"), 0);
            if (C9139.m23468(bArrDecode)) {
                ApplicationC0716.f2992.edit().mo4066(System.currentTimeMillis(), "JIAGU_TIME").mo4065(i, "JIAGU_VERSION").mo4067("JIAGU_DATA", bArrDecode).apply();
            }
        }
    }
}
