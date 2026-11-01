package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8535 extends C18412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15591 f29542;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f29543;

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19018(int i, int i2, int i3, boolean z) {
        C12063 c12063 = this.f29542.f30808;
        ArrayList arrayList = this.f29543;
        if (i2 != -1) {
            arrayList.add(c12063.f40354.m44688(i2));
        }
        if (i3 != -1) {
            arrayList.add(c12063.f40367.m44688(i3));
        }
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19017(int i, int i2, int i3, int i4, boolean z) {
        C12063 c12063 = this.f29542.f30808;
        ArrayList arrayList = this.f29543;
        if (i2 != -1) {
            arrayList.add(c12063.f40354.m44688(i2));
        }
        if (i3 != -1) {
            arrayList.add(c12063.f40367.m44688(i3));
        }
        if (i4 != -1) {
            arrayList.add(c12063.f40354.m44688(i4));
        }
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19015(int i) {
        if (i != -1) {
            this.f29543.add(this.f29542.f30808.f40354.m44688(i));
        }
    }

    public C8535(C15591 c15591, ArrayList arrayList) {
        this.f29542 = c15591;
        this.f29543 = arrayList;
    }
}
