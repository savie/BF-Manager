package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩻᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25316 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17110 f81776;

    public C25316(C17110 c17110) {
        this.f81776 = c17110;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f81776.f55844;
        View childAt = dialogInterfaceOnDismissListenerC20840.f66727.getChildAt(0);
        dialogInterfaceOnDismissListenerC20840.f66727.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC20840.f66727.addView(childAt);
        if (i < dialogInterfaceOnDismissListenerC20840.f66728.size()) {
            AbstractC12635 abstractC12635 = (AbstractC12635) dialogInterfaceOnDismissListenerC20840.f66728.get(i);
            String strM47653 = DialogInterfaceOnDismissListenerC20840.m47653(abstractC12635);
            if (strM47653 != null) {
                ApplicationC17729.f58258.edit().putString("auto_translation_record", strM47653).apply();
            }
            abstractC12635.mo31404(dialogInterfaceOnDismissListenerC20840.f66727);
            if (abstractC12635.mo31401()) {
                dialogInterfaceOnDismissListenerC20840.f66725.setVisibility(0);
                return;
            } else {
                dialogInterfaceOnDismissListenerC20840.f66725.setVisibility(8);
                return;
            }
        }
        dialogInterfaceOnDismissListenerC20840.f66725.setVisibility(0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f81776.f55844;
        View childAt = dialogInterfaceOnDismissListenerC20840.f66727.getChildAt(0);
        dialogInterfaceOnDismissListenerC20840.f66727.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC20840.f66727.addView(childAt);
    }
}
