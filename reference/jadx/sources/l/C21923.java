package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩷۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7MI */
/* JADX INFO: loaded from: classes.dex */
public final class C21923 implements InterfaceC6261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6261 f70786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f70787;

    public C21923(C2357 c2357, List list) {
        this.f70786 = c2357;
        this.f70787 = list;
    }

    @Override // l.InterfaceC6261
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9584 mo7989() {
        return new C7905(this.f70786.mo7989(), this.f70787);
    }

    @Override // l.InterfaceC6261
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9584 mo7990(C15955 c15955, C24907 c24907) {
        return new C7905(this.f70786.mo7990(c15955, c24907), this.f70787);
    }
}
