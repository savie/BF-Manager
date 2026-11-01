package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8I6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12596 implements InterfaceC9753 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f42103;

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15243() {
        return 1;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15244(long j) {
        return j < 0 ? 0 : -1;
    }

    public C12596(List list) {
        this.f42103 = list;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final long mo15245(int i) {
        C2023.m6507(i == 0);
        return 0L;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۨ */
    public final List mo15247(long j) {
        return j >= 0 ? this.f42103 : Collections.EMPTY_LIST;
    }
}
