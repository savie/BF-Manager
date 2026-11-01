package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16625 extends AbstractC12392 implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0396(this);
    }

    public final String toString() {
        return "Directory{fileId=" + this.f41412 + ", fileName='" + this.f41411.m29354() + "'}";
    }
}
