package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I78P */
/* JADX INFO: loaded from: classes.dex */
public final class C21728 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69329;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f69331;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f69332;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f69334;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69330 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f69333 = new ArrayList();

    public C21728(int i, int i2, int i3, int i4, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        this.f69329 = i;
        this.f69331 = i2;
        this.f69332 = i3;
        this.f69334 = i4;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            this.f69330.add((String) it.next());
        }
        Iterator it2 = abstractCollection2.iterator();
        while (it2.hasNext()) {
            this.f69333.add((String) it2.next());
        }
    }
}
