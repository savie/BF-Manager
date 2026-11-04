package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܿۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18263 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7822 f59592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f59593;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C18263(C7822 c7822, String[] strArr) {
        this.f59592 = c7822;
        this.f59593 = strArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean zEquals = this.f59593[i].equals("exec-script");
        C7822 c7822 = this.f59592;
        if (zEquals) {
            c7822.f26057.setVisibility(0);
        } else {
            c7822.f26057.setVisibility(8);
        }
    }
}
