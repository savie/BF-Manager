package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3385 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10037(AbstractC9032 abstractC9032) throws IOException {
        C4466 c4466 = (C4466) abstractC9032;
        if (c4466.f15878 == null) {
            m10036(c4466);
        }
        return c4466.f15878.length;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C4466 c4466 = (C4466) abstractC9032;
        if (c4466.f15878 != null) {
            c15382.write(c4466.f15878);
            return;
        }
        Iterator it = c4466.iterator();
        while (it.hasNext()) {
            c15382.m36819((AbstractC9032) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10036(C4466 c4466) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15382 c15382 = new C15382(this.f61194, byteArrayOutputStream);
        Iterator it = c4466.iterator();
        while (it.hasNext()) {
            c15382.m36819((AbstractC9032) it.next());
        }
        c4466.f15878 = byteArrayOutputStream.toByteArray();
    }
}
