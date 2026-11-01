package l;

import android.os.SystemClock;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩻ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23440 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75875;

    public /* synthetic */ RunnableC23440(int i, Object obj) {
        this.f75874 = i;
        this.f75875 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f75874;
        Object obj = this.f75875;
        switch (i) {
            case 0:
                ((C3040) obj).m9115();
                break;
            case 1:
                ((C7409) obj).m19814();
                break;
            case 2:
                ((C16408) obj).close();
                break;
            case 3:
                DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, (AbstractActivityC12483) obj, "def_sign_key_warn");
                break;
            case 4:
                int i2 = ActivityC15481.f50434;
                ((AtomicBoolean) obj).set(true);
                break;
            case 5:
                String str = (String) obj;
                int[] iArr = {500, 500, 500, 500, 1000, 1000, 1000, 1000, 1000, 2000, 2000};
                for (int i3 = 0; i3 < 11; i3++) {
                    SystemClock.sleep(iArr[i3]);
                    C2724 c2724M8305 = C2724.m8305(4208);
                    c2724M8305.m8326(str);
                    C1313 c1313M8314 = c2724M8305.m8314();
                    C13465.m32967(c1313M8314, "requestNeedLogin(...)");
                    if (c1313M8314.m4686()) {
                        C9616.m24524();
                        C12792.f42615.mo23641(new Object());
                    } else if (c1313M8314.m4672()) {
                    }
                    break;
                }
                break;
            default:
                ((ImageView) obj).setVisibility(8);
                break;
        }
    }
}
