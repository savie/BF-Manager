package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8308 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f27275;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18252 f27276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6817 f27277;

    public RunnableC8308(C6817 c6817, ArrayList arrayList, C21982 c21982) {
        this.f27277 = c6817;
        this.f27275 = arrayList;
        this.f27276 = c21982;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f27275;
        C6817 c6817 = this.f27277;
        c6817.f22681.lock();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC22044) list.get(i)).mo2942(this.f27276.getLong(i));
            }
            c6817.f22681.unlock();
        } catch (Throwable th) {
            c6817.f22681.unlock();
            throw th;
        }
    }
}
