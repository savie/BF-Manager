package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C3240 implements InterfaceC12414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13970 f12049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f12050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f12051;

    public C3240(C13970 c13970, boolean[] zArr, HashSet hashSet) {
        this.f12049 = c13970;
        this.f12050 = zArr;
        this.f12051 = hashSet;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۨ */
    public final void mo1609(int i) {
        if (i < this.f12049.f45945) {
            this.f12050[i] = false;
        }
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۙ */
    public final void mo1606(int i) {
        if (this.f12051.contains(Integer.valueOf(i)) || i >= this.f12049.f45945) {
            return;
        }
        this.f12050[i] = true;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ܰ */
    public final void mo1610(int i) {
        mo1609(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۖ */
    public final void mo1605(int i) {
        mo1606(i);
    }
}
