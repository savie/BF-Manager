package l;

import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩶ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C20349 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18938 f65913;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f65914;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f65915;

    public C20349(Spinner spinner, C18938 c18938, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f65915 = spinner;
        this.f65913 = c18938;
        this.f65914 = onItemSelectedListener;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int selectedItemPosition = this.f65915.getSelectedItemPosition();
        if (selectedItemPosition < this.f65913.getCount()) {
            ((C16116) this.f65914).onItemSelected(null, null, selectedItemPosition, 0L);
        }
    }
}
