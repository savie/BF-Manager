package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9187 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31265;

    public /* synthetic */ RunnableC9187(int i, Object obj) {
        this.f31264 = i;
        this.f31265 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31264) {
            case 0:
                try {
                    ((Runnable) this.f31265).run();
                } catch (RuntimeException unused) {
                    return;
                }
                break;
            default:
                Iterator it = ((List) this.f31265).iterator();
                while (it.hasNext()) {
                    ((C7817) it.next()).m20577();
                }
                break;
        }
    }
}
