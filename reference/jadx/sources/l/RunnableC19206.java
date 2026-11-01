package l;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩵ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19206 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62027;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62029;

    public /* synthetic */ RunnableC19206(int i, Object obj, Object obj2) {
        this.f62028 = i;
        this.f62029 = obj;
        this.f62027 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62028) {
            case 0:
                C23229 c23229 = (C23229) this.f62029;
                C6111 c6111 = (C6111) this.f62027;
                if (c23229.m51236()) {
                    c6111.m17057(false);
                }
                break;
            case 1:
                C16611.m39058((C16611) this.f62029, (LinkedList) this.f62027);
                break;
            default:
                C12819.m31823((C12819) this.f62029, (ArrayList) this.f62027);
                break;
        }
    }
}
