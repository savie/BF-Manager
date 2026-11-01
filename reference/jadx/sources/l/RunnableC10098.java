package l;

import android.os.Process;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10098 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34481;

    public /* synthetic */ RunnableC10098(int i, Object obj) {
        this.f34480 = i;
        this.f34481 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34480;
        Object obj = this.f34481;
        switch (i) {
            case 0:
                int i2 = ActivityC5677.f19358;
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((AbstractC20745) it.next()).mo24647();
                }
                break;
            case 1:
                ActivityC19126 activity = ((C20409) obj).getActivity();
                if (activity != null) {
                    ((ActivityC11632) activity).m29019(R.layout.MT_Protector);
                }
                break;
            case 2:
                ((C8765) obj).f30152.m5034(true);
                break;
            case 3:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
            case 4:
                ((AbstractC0656) obj).cancel();
                break;
            default:
                ((ActivityC18275) obj).m42464();
                break;
        }
    }
}
