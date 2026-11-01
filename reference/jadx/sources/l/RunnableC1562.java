package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1562 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC21750 f6293;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f6294;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9325 f6295;

    public RunnableC1562(C9325 c9325, ArrayList arrayList, C16916 c16916) {
        this.f6295 = c9325;
        this.f6294 = arrayList;
        this.f6293 = c16916;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f6294;
        C9325 c9325 = this.f6295;
        c9325.f31649.lock();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC20745) list.get(i)).mo32855(this.f6293.getLong(i));
            }
            c9325.f31649.unlock();
        } catch (Throwable th) {
            c9325.f31649.unlock();
            throw th;
        }
    }
}
