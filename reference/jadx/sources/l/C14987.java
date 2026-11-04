package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14987 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48915;

    public C14987(String str) {
        this.f48915 = str;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        C12750 c12750 = (C12750) obj;
        synchronized (C5293.f18629) {
            C9086 c9086 = C5293.f18628;
            ArrayList arrayList = (ArrayList) c9086.get(this.f48915);
            if (arrayList == null) {
                return;
            }
            c9086.remove(this.f48915);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC0818) arrayList.get(i)).accept(c12750);
            }
        }
    }
}
