package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes4.dex */
public class C12485 extends C9479 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C6520 f40085;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f40086;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C8407 f40087;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final int f40088;

    public C12485(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f40088 = 21;
            this.f40086 = 22;
        } else {
            this.f40088 = 22;
            this.f40086 = 21;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31021(C6520 c6520) {
        this.f40085 = c6520;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0204 c0204;
        C14373 c14373 = (C14373) getSelectedView();
        if (c14373 != null && i == this.f40088) {
            if (c14373.isEnabled() && c14373.getItemData().hasSubMenu()) {
                performItemClick(c14373, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (c14373 != null && i == this.f40086) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c0204 = (C0204) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c0204 = (C0204) adapter;
            }
            c0204.m1607().close(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // l.C9479, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0204 c0204;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f40085 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0204 = (C0204) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0204 = (C0204) adapter;
                headersCount = 0;
            }
            C8407 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0204.getCount()) ? null : c0204.getItem(i);
            C8407 c8407 = this.f40087;
            if (c8407 != item) {
                C9898 c9898M1607 = c0204.m1607();
                if (c8407 != null) {
                    this.f40085.mo18397(c9898M1607, (MenuItem) c8407);
                }
                this.f40087 = item;
                if (item != null) {
                    this.f40085.mo18398(c9898M1607, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
