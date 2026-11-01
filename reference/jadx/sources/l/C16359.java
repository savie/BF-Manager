package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16359 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52662;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC7186 f52663;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52664;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6044 f52665;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12126 f52666;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11730 f52667;

    public C16359(C12126 c12126, boolean z, boolean z2, C6044 c6044, C11730 c11730) {
        this.f52666 = c12126;
        this.f52662 = z;
        this.f52664 = z2;
        this.f52665 = c6044;
        this.f52667 = c11730;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (this.f52662) {
            c5379.m14911();
            return null;
        }
        AbstractC7186 abstractC7186M16441 = this.f52663;
        if (abstractC7186M16441 == null) {
            abstractC7186M16441 = this.f52665.m16441(this.f52666, this.f52667);
            this.f52663 = abstractC7186M16441;
        }
        return abstractC7186M16441.mo1571(c5379);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        if (this.f52664) {
            c1145.m4214();
            return;
        }
        AbstractC7186 abstractC7186M16441 = this.f52663;
        if (abstractC7186M16441 == null) {
            abstractC7186M16441 = this.f52665.m16441(this.f52666, this.f52667);
            this.f52663 = abstractC7186M16441;
        }
        abstractC7186M16441.mo1572(c1145, obj);
    }
}
