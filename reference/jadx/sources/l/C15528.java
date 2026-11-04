package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15528 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6997 f50514;

    public C15528(C6997 c6997) {
        this.f50514 = c6997;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C13291(this.f50514.f23091.iterator());
    }
}
