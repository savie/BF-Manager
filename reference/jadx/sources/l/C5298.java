package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5298 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2475 f18314;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3886 f18315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f18316;

    public C5298(AbstractC3886 abstractC3886, AtomicBoolean atomicBoolean, C2475 c2475) {
        this.f18315 = abstractC3886;
        this.f18316 = atomicBoolean;
        this.f18314 = c2475;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AbstractC3886 abstractC3886 = this.f18315;
        int count = abstractC3886.f14515.getAdapter().getCount() - 1;
        C2475 c2475 = this.f18314;
        AtomicBoolean atomicBoolean = this.f18316;
        if (i != count) {
            if (atomicBoolean.compareAndSet(true, false)) {
                abstractC3886.f14531.setEnabled(false);
                c2475.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            abstractC3886.f14531.setEnabled(true);
            c2475.notifyDataSetChanged();
        }
        abstractC3886.f14531.requestFocus();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f18316.set(false);
        this.f18314.notifyDataSetChanged();
    }
}
