package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4502 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18672 f16071;

    public C4502(C18672 c18672) {
        this.f16071 = c18672;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C18672 c18672 = this.f16071;
        c18672.f60715.setSelection(i);
        if (c18672.f60715.getOnItemClickListener() != null) {
            c18672.f60715.performItemClick(view, i, c18672.f60714.getItemId(i));
        }
        c18672.dismiss();
    }
}
