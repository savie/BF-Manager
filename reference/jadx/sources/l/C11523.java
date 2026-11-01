package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11523 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final int mo10037(AbstractC9032 abstractC9032) throws IOException {
        C2349 c2349 = (C2349) abstractC9032;
        if (c2349.f8290 == null) {
            m28700(c2349);
        }
        return c2349.f8290.length;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C2349 c2349 = (C2349) abstractC9032;
        if (c2349.f8290 != null) {
            c15382.write(c2349.f8290);
            return;
        }
        Iterator it = c2349.iterator();
        while (it.hasNext()) {
            c15382.m36819((AbstractC9032) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28700(C2349 c2349) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15382 c15382 = new C15382(this.f61194, byteArrayOutputStream);
        Iterator it = c2349.iterator();
        while (it.hasNext()) {
            c15382.m36819((AbstractC9032) it.next());
        }
        c2349.f8290 = byteArrayOutputStream.toByteArray();
    }
}
