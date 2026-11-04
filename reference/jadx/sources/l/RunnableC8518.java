package l;

import android.content.Context;
import android.os.SystemClock;
import android.widget.Button;

/* JADX INFO: renamed from: l.۠ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8518 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27842;

    public /* synthetic */ RunnableC8518(int i, Object obj) {
        this.f27841 = i;
        this.f27842 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f27841;
        Object obj = this.f27842;
        switch (i) {
            case 0:
                ((InterfaceC10559) obj).m27009();
                break;
            case 1:
                SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11213((SharedPreferencesOnSharedPreferenceChangeListenerC3444) obj);
                break;
            case 2:
                C10060.m25999((C10060) obj);
                break;
            case 3:
                ((Button) obj).setClickable(true);
                break;
            case 4:
                String str = (String) obj;
                int[] iArr = {500, 500, 500, 500, 1000, 1000, 1000, 1000, 1000, 2000, 2000};
                for (int i2 = 0; i2 < 11; i2++) {
                    SystemClock.sleep(iArr[i2]);
                    C2592 c2592M8672 = C2592.m8672(4208);
                    c2592M8672.m8687(str);
                    C13778 c13778M8688 = c2592M8672.m8688();
                    C15243.m36591(c13778M8688, "requestNeedLogin(...)");
                    if (c13778M8688.m33676()) {
                        C0486.m2344();
                        C7484.f24760.mo40348(new Object());
                    } else if (c13778M8688.m33682()) {
                    }
                    break;
                }
                break;
            default:
                C0831.m3333((Context) obj);
                break;
        }
    }
}
