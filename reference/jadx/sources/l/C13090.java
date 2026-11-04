package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13090 extends AbstractC5633 implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15327(this);
    }

    public final String toString() {
        return "Directory{fileId=" + this.f19480 + ", fileName='" + this.f19481.m17653() + "'}";
    }
}
