package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12581 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C13308 c13308M51206 = C23186.m51206();
        ArrayList arrayList = new ArrayList();
        for (C11897 c11897 : (C11897[]) c13308M51206.m32798().toArray(new C11897[0])) {
            C5546 c5546M29659 = c11897.m29659();
            if (c5546M29659 != null) {
                if (C5717.m15770(c5546M29659.m15296()) == null) {
                    arrayList.add(c11897);
                }
            } else {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(c11897.m29678(), new String[0]);
                if (abstractC20745M15313.mo36912() && !abstractC20745M15313.mo33975()) {
                    arrayList.add(c11897);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C16737.m39273(new RunnableC12217(3, c13308M51206, arrayList));
    }
}
