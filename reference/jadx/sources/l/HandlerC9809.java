package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9809 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f33556;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4995 f33557;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9809(C4995 c4995, Looper looper) {
        super(looper);
        this.f33557 = c4995;
        this.f33556 = new byte[4096];
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strM30911;
        int i = message.what;
        C4995 c4995 = this.f33557;
        if (i == 1 && c4995.m13847()) {
            C14769 c14769 = c4995.f17381;
            byte[] bArr = this.f33556;
            int iM35392 = c14769.m35392(bArr, false);
            if (iM35392 > 0) {
                c4995.f17394.m15431(iM35392, bArr);
                C4995.m13827(c4995);
                return;
            }
            return;
        }
        if (message.what == 4) {
            int iIntValue = ((Integer) message.obj).intValue();
            C4995.m13831(c4995);
            c4995.f17380.getClass();
            if (iIntValue > 0) {
                strM30911 = C2271.m6966(iIntValue, "(error ", ") ");
            } else {
                strM30911 = iIntValue < 0 ? C12441.m30911(-iIntValue, ") ", new StringBuilder("(signal ")) : "";
            }
            byte[] bytes = "\r\n".concat(C16737.m39264(R.string.MT_Protector, strM30911)).getBytes(StandardCharsets.UTF_8);
            c4995.f17394.m15431(bytes.length, bytes);
            C4995.m13827(c4995);
        }
    }
}
