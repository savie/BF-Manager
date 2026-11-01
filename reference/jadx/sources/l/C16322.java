package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I78P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16322 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f52555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52556;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f52557;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52558 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52559 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f52560;

    public C16322(int i, int i2, int i3, int i4, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        this.f52556 = i;
        this.f52560 = i2;
        this.f52557 = i3;
        this.f52555 = i4;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            this.f52558.add((String) it.next());
        }
        Iterator it2 = abstractCollection2.iterator();
        while (it2.hasNext()) {
            this.f52559.add((String) it2.next());
        }
    }
}
