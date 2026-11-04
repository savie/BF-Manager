package l;

/* JADX INFO: renamed from: l.ᩴ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19677 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f63369;

    public C19677(C25227 c25227) {
        this.f63369 = c25227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45349(C5067 c5067) {
        int i = c5067.f17653;
        C25227 c25227 = this.f63369;
        if (i == 1) {
            c25227.mLayout.onItemsAdded(c25227, c5067.f17656, c5067.f17655);
            return;
        }
        if (i == 2) {
            c25227.mLayout.onItemsRemoved(c25227, c5067.f17656, c5067.f17655);
        } else if (i == 4) {
            c25227.mLayout.onItemsUpdated(c25227, c5067.f17656, c5067.f17655, c5067.f17654);
        } else {
            if (i != 8) {
                return;
            }
            c25227.mLayout.onItemsMoved(c25227, c5067.f17656, c5067.f17655, 1);
        }
    }
}
