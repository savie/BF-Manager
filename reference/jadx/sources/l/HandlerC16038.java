package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܶۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC16038 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f52023;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24244 f52024;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC16038(C24244 c24244, Looper looper) {
        super(looper);
        this.f52024 = c24244;
        this.f52023 = new byte[4096];
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strM31437;
        int i = message.what;
        C24244 c24244 = this.f52024;
        if (i == 1 && c24244.m54260()) {
            C17356 c17356 = c24244.f78519;
            byte[] bArr = this.f52023;
            int iM40777 = c17356.m40777(bArr, false);
            if (iM40777 > 0) {
                c24244.f78526.m43260(iM40777, bArr);
                C24244.m54243(c24244);
                return;
            }
            return;
        }
        if (message.what == 4) {
            int iIntValue = ((Integer) message.obj).intValue();
            C24244.m54245(c24244);
            c24244.f78533.getClass();
            if (iIntValue > 0) {
                strM31437 = C14442.m34864(iIntValue, "(error ", ") ");
            } else {
                strM31437 = iIntValue < 0 ? C12669.m31437(-iIntValue, ") ", new StringBuilder("(signal ")) : "";
            }
            byte[] bytes = "\r\n".concat(C21576.m49059(R.string.MT_Protector, strM31437)).getBytes(StandardCharsets.UTF_8);
            c24244.f78526.m43260(bytes.length, bytes);
            C24244.m54243(c24244);
        }
    }
}
