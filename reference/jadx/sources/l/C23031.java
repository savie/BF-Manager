package l;

import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩸᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23031 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2390 f74734;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f74735;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f74736;

    public C23031(Spinner spinner, C2390 c2390, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f74736 = spinner;
        this.f74734 = c2390;
        this.f74735 = onItemSelectedListener;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int selectedItemPosition = this.f74736.getSelectedItemPosition();
        if (selectedItemPosition < this.f74734.getCount()) {
            ((C11096) this.f74735).onItemSelected(null, null, selectedItemPosition, 0L);
        }
    }
}
