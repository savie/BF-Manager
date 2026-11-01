package l;

/* JADX INFO: renamed from: l.᩷۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20876 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f67813;

    public C20876(C17492 c17492) {
        this.f67813 = c17492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46922(C8531 c8531) {
        int i = c8531.f29534;
        C17492 c17492 = this.f67813;
        if (i == 1) {
            c17492.mLayout.onItemsAdded(c17492, c8531.f29533, c8531.f29536);
            return;
        }
        if (i == 2) {
            c17492.mLayout.onItemsRemoved(c17492, c8531.f29533, c8531.f29536);
        } else if (i == 4) {
            c17492.mLayout.onItemsUpdated(c17492, c8531.f29533, c8531.f29536, c8531.f29535);
        } else {
            if (i != 8) {
                return;
            }
            c17492.mLayout.onItemsMoved(c17492, c8531.f29533, c8531.f29536, 1);
        }
    }
}
