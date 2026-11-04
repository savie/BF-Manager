package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6962 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f22986 = C16980.m40037(C6962.class);

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        AbstractC1566 abstractC1566M28517;
        C24927 c24927M5671;
        if (c2551.m8524()) {
            return;
        }
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                if (c18959.getType() == EnumC24203.CONSTRUCTOR) {
                    C6787 c6787 = (C6787) c18959;
                    try {
                        C6041 c6041M44027 = c6787.m44027();
                        if (c6041M44027 != null && (abstractC1566M28517 = c6041M44027.m17530().m41945().m28517()) != null && abstractC1566M28517.mo5541() != null && ((c24927M5671 = c2551.mo8527().m5671(c6787.m18927())) == null || !c24927M5671.m55566().isEmpty())) {
                            c6787.mo17864(new C22228(abstractC1566M28517.mo5541()));
                        }
                    } catch (Exception e) {
                        f22986.mo13724("Failed to attach constructor generic info", (Throwable) e);
                    }
                }
            }
        }
    }
}
