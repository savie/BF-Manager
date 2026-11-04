package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4342 extends C6580 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        m18499();
        if (m18503() >= m18505().f48372) {
            throw new NoSuchElementException();
        }
        int iM18503 = m18503();
        m18504(iM18503 + 1);
        m18501(iM18503);
        Object[] objArr = m18505().f48368;
        C15243.m36586(objArr);
        Object obj = objArr[m18500()];
        m18502();
        return obj;
    }
}
