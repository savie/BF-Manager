package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8221 implements InterfaceC5984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f27064;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22547 f27065;

    public C8221(Collection collection) {
        this.f27064 = collection.iterator();
        next();
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17407() {
        return this.f27065 != null;
    }

    @Override // l.InterfaceC5984
    public final void next() {
        Iterator it = this.f27064;
        this.f27065 = it.hasNext() ? (C22547) it.next() : null;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩸ */
    public final int mo17411() {
        return this.f27065.f72892;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩴ */
    public final int mo17409() {
        return this.f27065.f72894;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۤ */
    public final int mo17408() {
        return this.f27065.f72891;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17410() {
        return this.f27065.f72893;
    }
}
