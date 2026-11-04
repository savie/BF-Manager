package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20750 extends C6580 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        m18499();
        if (m18503() >= m18505().f48372) {
            throw new NoSuchElementException();
        }
        int iM18503 = m18503();
        m18504(iM18503 + 1);
        m18501(iM18503);
        C12545 c12545 = new C12545(m18505(), m18500());
        m18502();
        return c12545;
    }
}
