package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4403 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C5061 c5061M51809 = C22961.m51809();
        ArrayList arrayList = new ArrayList();
        for (C9622 c9622 : (C9622[]) c5061M51809.m15323().toArray(new C9622[0])) {
            C8877 c8877M25121 = c9622.m25121();
            if (c8877M25121 != null) {
                if (C7606.m20792(c8877M25121.m23755()) == null) {
                    arrayList.add(c9622);
                }
            } else {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(c9622.m25117(), new String[0]);
                if (abstractC22044M35193.mo4295() && !abstractC22044M35193.mo2934()) {
                    arrayList.add(c9622);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C21576.m49068(new RunnableC14461(3, c5061M51809, arrayList));
    }
}
