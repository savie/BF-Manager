package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5566 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16752 f19343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13023 f19344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f19345;

    public C5566(AbstractC16752 abstractC16752, AtomicBoolean atomicBoolean, C13023 c13023) {
        this.f19343 = abstractC16752;
        this.f19345 = atomicBoolean;
        this.f19344 = c13023;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AbstractC16752 abstractC16752 = this.f19343;
        int count = abstractC16752.f54078.getAdapter().getCount() - 1;
        C13023 c13023 = this.f19344;
        AtomicBoolean atomicBoolean = this.f19345;
        if (i != count) {
            if (atomicBoolean.compareAndSet(true, false)) {
                abstractC16752.f54089.setEnabled(false);
                c13023.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            abstractC16752.f54089.setEnabled(true);
            c13023.notifyDataSetChanged();
        }
        abstractC16752.f54089.requestFocus();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f19345.set(false);
        this.f19344.notifyDataSetChanged();
    }
}
