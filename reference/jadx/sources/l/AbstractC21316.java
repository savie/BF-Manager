package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩸ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 45V6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21316 extends AbstractList {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo3245(int i);

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return mo3245(i);
    }
}
