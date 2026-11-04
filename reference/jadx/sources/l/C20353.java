package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20353 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final int mo3832(AbstractC4691 abstractC4691) throws IOException {
        C12148 c12148 = (C12148) abstractC4691;
        if (c12148.f39058 == null) {
            m46768(c12148);
        }
        return c12148.f39058.length;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C12148 c12148 = (C12148) abstractC4691;
        if (c12148.f39058 != null) {
            c1180.write(c12148.f39058);
            return;
        }
        Iterator it = c12148.iterator();
        while (it.hasNext()) {
            c1180.m4354((AbstractC4691) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46768(C12148 c12148) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1180 c1180 = new C1180(this.f28223, byteArrayOutputStream);
        Iterator it = c12148.iterator();
        while (it.hasNext()) {
            c1180.m4354((AbstractC4691) it.next());
        }
        c12148.f39058 = byteArrayOutputStream.toByteArray();
    }
}
