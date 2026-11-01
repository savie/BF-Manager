package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15993 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f51772;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C15993(IntConsumer intConsumer) {
        this.f51772 = intConsumer;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f51772.accept(i);
    }
}
