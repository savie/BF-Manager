package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes4.dex */
public class C8434 extends C6129 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int f29285;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C19723 f29286;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final int f29287;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C23707 f29288;

    public C8434(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f29285 = 21;
            this.f29287 = 22;
        } else {
            this.f29285 = 22;
            this.f29287 = 21;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22088(C19723 c19723) {
        this.f29286 = c19723;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C20179 c20179;
        C7478 c7478 = (C7478) getSelectedView();
        if (c7478 != null && i == this.f29285) {
            if (c7478.isEnabled() && c7478.getItemData().hasSubMenu()) {
                performItemClick(c7478, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (c7478 != null && i == this.f29287) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c20179 = (C20179) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c20179 = (C20179) adapter;
            }
            c20179.m45614().close(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // l.C6129, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C20179 c20179;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f29286 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c20179 = (C20179) headerViewListAdapter.getWrappedAdapter();
            } else {
                c20179 = (C20179) adapter;
                headersCount = 0;
            }
            C23707 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c20179.getCount()) ? null : c20179.getItem(i);
            C23707 c23707 = this.f29288;
            if (c23707 != item) {
                C12418 c12418M45614 = c20179.m45614();
                if (c23707 != null) {
                    this.f29286.mo21477(c12418M45614, (MenuItem) c23707);
                }
                this.f29288 = item;
                if (item != null) {
                    this.f29286.mo21478(c12418M45614, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
