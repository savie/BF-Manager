package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܳ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15618 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13381 f50744;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C15618(C13381 c13381) {
        this.f50744 = c13381;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C13381 c13381 = this.f50744;
        if (adapterView == c13381.f42658) {
            if (c13381.f42650) {
                return;
            }
            c13381.f42647 = (String) c13381.f42653.get(i);
            C13381.f42646 = (String) c13381.f42665.get(i);
            if (c13381.f42662.targetLanguageMutable) {
                c13381.m33004();
                return;
            }
            return;
        }
        if (adapterView != c13381.f42661 || c13381.f42650 || c13381.f42659) {
            return;
        }
        c13381.f42657 = (String) c13381.f42664.get(i);
        C13381.f42645 = (String) c13381.f42648.get(i);
    }
}
