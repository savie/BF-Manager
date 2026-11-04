package l;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L17P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0284 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1595;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1596;

    public /* synthetic */ RunnableC0284(int i, Object obj) {
        this.f1595 = i;
        this.f1596 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1595) {
            case 0:
                Iterator it = ((List) this.f1596).iterator();
                while (it.hasNext()) {
                    ((C15945) it.next()).m38022();
                }
                return;
            case 1:
                try {
                    ((ServerSocket) this.f1596).close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                ((ViewOnClickListenerC7793) this.f1596).m21220();
                return;
        }
    }
}
