package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2350 extends AbstractC13946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5173 f8291;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f8292;

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo7139() {
        return this.f8292.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7137() {
        return this.f8291.f17943.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo7140(int i, int i2) {
        return this.f8292.get(i) == this.f8291.f17943.get(i2);
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7138(int i, int i2) {
        return this.f8292.get(i) == this.f8291.f17943.get(i2);
    }

    public C2350(C5173 c5173, ArrayList arrayList) {
        this.f8291 = c5173;
        this.f8292 = arrayList;
    }
}
