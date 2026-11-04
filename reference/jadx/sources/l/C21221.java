package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioFormat;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21221 implements InterfaceC18983 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f67731;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Boolean f67732;

    public C21221(ContextWrapper contextWrapper) {
        this.f67731 = contextWrapper.getApplicationContext();
    }

    @Override // l.InterfaceC18983
    /* JADX INFO: renamed from: ۙ */
    public final C9549 mo44091(C18412 c18412, C15648 c15648) {
        boolean zBooleanValue;
        c15648.getClass();
        int i = c15648.f50829;
        c18412.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C9549.f30908;
        }
        Boolean bool = this.f67732;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f67731;
            if (context != null) {
                String parameters = C8345.m22450(context).getParameters("offloadVariableRateSupported");
                this.f67732 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f67732 = Boolean.FALSE;
            }
            zBooleanValue = this.f67732.booleanValue();
        }
        String str = c15648.f50848;
        str.getClass();
        int iM25255 = C9681.m25255(str, c15648.f50836);
        if (iM25255 == 0 || i2 < C7116.m19458(iM25255)) {
            return C9549.f30908;
        }
        int iM19504 = C7116.m19504(c15648.f50843);
        if (iM19504 == 0) {
            return C9549.f30908;
        }
        try {
            AudioFormat audioFormatM19509 = C7116.m19509(i, iM19504, iM25255);
            if (i2 >= 31) {
                return C14507.m35019(audioFormatM19509, c18412.m42921().f68157, zBooleanValue);
            }
            return C4067.m13140(audioFormatM19509, c18412.m42921().f68157, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C9549.f30908;
        }
    }
}
