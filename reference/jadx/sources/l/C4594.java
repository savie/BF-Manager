package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4594 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16262;

    public C4594(String str) {
        this.f16262 = str;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        C13768 c13768 = (C13768) obj;
        synchronized (C11651.f39176) {
            C12274 c12274 = C11651.f39175;
            ArrayList arrayList = (ArrayList) c12274.getOrDefault(this.f16262, null);
            if (arrayList == null) {
                return;
            }
            c12274.remove(this.f16262);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC17295) arrayList.get(i)).accept(c13768);
            }
        }
    }
}
