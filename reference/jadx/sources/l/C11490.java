package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۨۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11490 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f38659;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1403 f38660;

    public /* synthetic */ C11490(List list, C1403 c1403) {
        this.f38659 = list;
        this.f38660 = c1403;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        int size;
        C13607 c13607;
        C21159 c21159 = (C21159) obj;
        int i = ActivityC19749.f63457;
        List list = this.f38659;
        if (list.isEmpty()) {
            size = list.size();
        } else {
            C21159 c211510 = (C21159) C3012.m8974(1, list);
            if (c211510.f68906.m33251() == 22 || ((c13607 = c211510.f68904) != null && c13607.m33251() == 22)) {
                size = list.size() - 1;
            } else {
                size = list.size();
            }
        }
        list.add(size, c21159);
        C1403 c1403 = this.f38660;
        c1403.f5816.notifyItemInserted(size);
        c1403.f5815.smoothScrollToPosition(size);
        C7754.m20408();
    }
}
