package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10593 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16237 f36242;

    public C10593(C16237 c16237) {
        this.f36242 = c16237;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C16237 c16237 = this.f36242;
        c16237.f52382.setSelection(i);
        if (c16237.f52382.getOnItemClickListener() != null) {
            c16237.f52382.performItemClick(view, i, c16237.f52381.getItemId(i));
        }
        c16237.dismiss();
    }
}
