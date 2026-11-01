package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7M3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18498 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42893(C2269 c2269) {
        AbstractC13560 abstractC13560M6962 = c2269.m6962();
        abstractC13560M6962.mo23046(true);
        abstractC13560M6962.show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42892(Object obj) {
        final ViewOnKeyListenerC21320 viewOnKeyListenerC21320 = (ViewOnKeyListenerC21320) obj;
        C0671.m2999(viewOnKeyListenerC21320.f69373).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۘ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C20179 c20179;
                ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
                if (listAdapter instanceof HeaderViewListAdapter) {
                    c20179 = (C20179) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
                } else {
                    c20179 = (C20179) listAdapter;
                }
                c20179.f65504.performItemAction((MenuItem) listAdapter.getItem(i), viewOnKeyListenerC21320, 1);
            }
        });
    }
}
