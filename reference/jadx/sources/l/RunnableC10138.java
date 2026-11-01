package l;

import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۤ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10138 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34633;

    public /* synthetic */ RunnableC10138(int i, Object obj) {
        this.f34632 = i;
        this.f34633 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34632) {
            case 0:
                ((ActivityC11632) this.f34633).m29024(true);
                break;
            case 1:
                C4677.m12961((C4677) this.f34633);
                break;
            case 2:
                ((ActivityC5760) this.f34633).m15871();
                break;
            case 3:
                ListView listView = (ListView) this.f34633;
                listView.setSelector(C0674.m3024(listView.getContext()));
                break;
            default:
                ((View) this.f34633).requestLayout();
                break;
        }
    }
}
