package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23287 implements InterfaceC17144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f75532;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20464 f75533;

    public C23287(Collection collection) {
        this.f75532 = collection.iterator();
        next();
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo34577() {
        return this.f75533 != null;
    }

    @Override // l.InterfaceC17144
    public final void next() {
        Iterator it = this.f75532;
        this.f75533 = it.hasNext() ? (C20464) it.next() : null;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۖ */
    public final int mo34576() {
        return this.f75533.f66401;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۚ */
    public final int mo34578() {
        return this.f75533.f66399;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ۨ */
    public final int mo34579() {
        return this.f75533.f66400;
    }

    @Override // l.InterfaceC17144
    /* JADX INFO: renamed from: ܰ */
    public final int mo34580() {
        return this.f75533.f66402;
    }
}
