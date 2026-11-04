package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10565 extends C13744 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12803 f33576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f33577;

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27027(int i, int i2, int i3, boolean z) {
        C24738 c24738 = this.f33576.f34102;
        ArrayList arrayList = this.f33577;
        if (i2 != -1) {
            arrayList.add(c24738.f80094.m49623(i2));
        }
        if (i3 != -1) {
            arrayList.add(c24738.f80112.m49623(i3));
        }
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27026(int i, int i2, int i3, int i4, boolean z) {
        C24738 c24738 = this.f33576.f34102;
        ArrayList arrayList = this.f33577;
        if (i2 != -1) {
            arrayList.add(c24738.f80094.m49623(i2));
        }
        if (i3 != -1) {
            arrayList.add(c24738.f80112.m49623(i3));
        }
        if (i4 != -1) {
            arrayList.add(c24738.f80094.m49623(i4));
        }
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27025(int i) {
        if (i != -1) {
            this.f33577.add(this.f33576.f34102.f80094.m49623(i));
        }
    }

    public C10565(C12803 c12803, ArrayList arrayList) {
        this.f33576 = c12803;
        this.f33577 = arrayList;
    }
}
