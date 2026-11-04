package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C17525 extends AbstractC14124 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0701 f56970;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21943 f56971;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f56972;

    public C17525(C0701 c0701, ArrayList arrayList, C21943 c21943) {
        this.f56970 = c0701;
        this.f56972 = arrayList;
        this.f56971 = c21943;
    }

    @Override // l.AbstractC14124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1118 mo13193(C7830 c7830) {
        return new C16033(c7830, this.f56970, this.f56972, this.f56971);
    }
}
