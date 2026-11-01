package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 19M0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10850 extends AbstractList implements List {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo27203(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo27204();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo27203(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo27204();
    }
}
