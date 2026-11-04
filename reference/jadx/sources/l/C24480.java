package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes.dex */
public final class C24480 extends C6580 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        m18499();
        if (m18503() >= m18505().f48372) {
            throw new NoSuchElementException();
        }
        int iM18503 = m18503();
        m18504(iM18503 + 1);
        m18501(iM18503);
        Object obj = m18505().f48369[m18500()];
        m18502();
        return obj;
    }
}
