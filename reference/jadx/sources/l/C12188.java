package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C12188 implements InterfaceC11442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24123 f39190;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f39191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f39192;

    public C12188(C24123 c24123, boolean[] zArr, HashSet hashSet) {
        this.f39190 = c24123;
        this.f39191 = zArr;
        this.f39192 = hashSet;
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۤ */
    public final void mo2553(int i) {
        if (i < this.f39190.f77970) {
            this.f39191[i] = false;
        }
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۙ */
    public final void mo2552(int i) {
        if (this.f39192.contains(Integer.valueOf(i)) || i >= this.f39190.f77970) {
            return;
        }
        this.f39191[i] = true;
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2554(int i) {
        mo2553(i);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2555(int i) {
        mo2552(i);
    }
}
