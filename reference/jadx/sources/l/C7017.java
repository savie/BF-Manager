package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7017 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f23147;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C7017(IntConsumer intConsumer) {
        this.f23147 = intConsumer;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f23147.accept(i);
    }
}
