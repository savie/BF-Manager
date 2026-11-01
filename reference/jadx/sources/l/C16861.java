package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܽ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16861 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17566 f53934;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f53935;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C16861(C17566 c17566, String[] strArr) {
        this.f53934 = c17566;
        this.f53935 = strArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean zEquals = this.f53935[i].equals("exec-script");
        C17566 c17566 = this.f53934;
        if (zEquals) {
            c17566.f55804.setVisibility(0);
        } else {
            c17566.f55804.setVisibility(8);
        }
    }
}
