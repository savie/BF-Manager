package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8I6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17899 implements InterfaceC24393 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f58636;

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21767() {
        return 1;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21768(long j) {
        return j < 0 ? 0 : -1;
    }

    public C17899(List list) {
        this.f58636 = list;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final long mo21769(int i) {
        C20782.m47565(i == 0);
        return 0L;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۤ */
    public final List mo21771(long j) {
        return j >= 0 ? this.f58636 : Collections.EMPTY_LIST;
    }
}
