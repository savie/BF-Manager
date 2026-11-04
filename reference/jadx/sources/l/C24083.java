package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes.dex */
public final class C24083 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final int mo3832(AbstractC4691 abstractC4691) throws IOException {
        C3945 c3945 = (C3945) abstractC4691;
        if (c3945.f13464 == null) {
            m53631(c3945);
        }
        return c3945.f13464.length;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C3945 c3945 = (C3945) abstractC4691;
        if (c3945.f13464 != null) {
            c1180.write(c3945.f13464);
            return;
        }
        Iterator it = c3945.iterator();
        while (it.hasNext()) {
            c1180.m4354((AbstractC4691) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53631(C3945 c3945) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1180 c1180 = new C1180(this.f28223, byteArrayOutputStream);
        Iterator it = c3945.iterator();
        while (it.hasNext()) {
            c1180.m4354((AbstractC4691) it.next());
        }
        c3945.f13464 = byteArrayOutputStream.toByteArray();
    }
}
