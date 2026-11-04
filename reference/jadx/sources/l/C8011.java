package l;

import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8011 extends C18452 {
    @Override // l.C18452
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo21878() {
        super.mo21878();
        try {
            C15009 c15009 = this.f60070;
            ListView listViewMo39127 = !c15009.m36151() ? null : c15009.m36147().mo39127();
            ListAdapter adapter = listViewMo39127.getAdapter();
            C0204 c0204 = (C0204) (adapter instanceof HeaderViewListAdapter ? ((HeaderViewListAdapter) adapter).getWrappedAdapter() : adapter);
            Field declaredField = C0204.class.getDeclaredField("۟");
            declaredField.setAccessible(true);
            declaredField.setInt(c0204, R.layout.MT_Protector);
            listViewMo39127.setAdapter(adapter);
            c0204.notifyDataSetChanged();
        } catch (Exception unused) {
        }
    }
}
