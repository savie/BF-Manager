package l;

import android.os.Handler;
import android.os.Looper;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.֡ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0361 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1871;

    public /* synthetic */ RunnableC0361(int i, Object obj) {
        this.f1870 = i;
        this.f1871 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1870;
        int i2 = 0;
        Object obj = this.f1871;
        switch (i) {
            case 0:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                if (abstractActivityC17204 instanceof ActivityC20852) {
                    ((ActivityC20852) abstractActivityC17204).m47679(false);
                }
                break;
            case 1:
                C2093.m7194((C2093) obj);
                break;
            case 2:
                C23255 c23255 = (C23255) obj;
                if (c23255.hasFocus()) {
                    c23255.m52289();
                }
                break;
            case 3:
                ServiceC10702.m27291((ServiceC10702) obj);
                break;
            case 4:
                int i3 = ServiceC6459.f21716;
                ((C11678) obj).mo5440();
                new Handler(Looper.getMainLooper()).post(new RunnableC23613(i2));
                break;
            case 5:
                C20108.m46234((AbstractC22044) obj);
                C6331.m18055();
                C22961.m51805();
                break;
            default:
                ((SearchView) obj).lambda$requestFocusAndShowKeyboard$8();
                break;
        }
    }
}
