package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioFormat;
import android.os.Build;

/* JADX INFO: renamed from: l.ܰۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13772 implements InterfaceC22238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f45392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Boolean f45393;

    public C13772(ContextWrapper contextWrapper) {
        this.f45392 = contextWrapper.getApplicationContext();
    }

    @Override // l.InterfaceC22238
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15038 mo33528(C2708 c2708, C7648 c7648) {
        boolean zBooleanValue;
        c7648.getClass();
        int i = c7648.f25260;
        c2708.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C15038.f49026;
        }
        Boolean bool = this.f45393;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f45392;
            if (context != null) {
                String parameters = C21780.m48542(context).getParameters("offloadVariableRateSupported");
                this.f45393 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f45393 = Boolean.FALSE;
            }
            zBooleanValue = this.f45393.booleanValue();
        }
        String str = c7648.f25265;
        str.getClass();
        int iM17983 = C6632.m17983(str, c7648.f25277);
        if (iM17983 == 0 || i2 < C17983.m41811(iM17983)) {
            return C15038.f49026;
        }
        int iM41854 = C17983.m41854(c7648.f25249);
        if (iM41854 == 0) {
            return C15038.f49026;
        }
        try {
            AudioFormat audioFormatM41859 = C17983.m41859(i, iM41854, iM17983);
            if (i2 >= 31) {
                return C4598.m12742(audioFormatM41859, c2708.m8258().f39861, zBooleanValue);
            }
            return C3042.m9129(audioFormatM41859, c2708.m8258().f39861, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C15038.f49026;
        }
    }
}
