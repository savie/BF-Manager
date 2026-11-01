package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19004 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13360 f61513;

    public C19004(C13360 c13360) {
        this.f61513 = c13360;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8421(this.f61513.f44285.iterator());
    }
}
