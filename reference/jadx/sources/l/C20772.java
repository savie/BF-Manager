package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 96FJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20772 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f66552;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC20255 f66553;

    public C20772() {
        this.f66552 = new HashSet();
    }

    public C20772(C20772 c20772, AbstractC20255 abstractC20255) {
        this.f66552 = new HashSet(c20772.f66552);
        this.f66553 = abstractC20255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20772 m47522(AbstractC20255 abstractC20255) {
        return new C20772(this, abstractC20255);
    }

    public final String toString() {
        return "Region: " + this.f66553 + ", exits: " + this.f66552;
    }
}
