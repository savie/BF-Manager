package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܶܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15263 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21612 f49735;

    public C15263(C21612 c21612) {
        this.f49735 = c21612;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f49735.f70103;
        View childAt = dialogInterfaceOnDismissListenerC8913.f30573.getChildAt(0);
        dialogInterfaceOnDismissListenerC8913.f30573.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC8913.f30573.addView(childAt);
        if (i < dialogInterfaceOnDismissListenerC8913.f30566.size()) {
            AbstractC10324 abstractC10324 = (AbstractC10324) dialogInterfaceOnDismissListenerC8913.f30566.get(i);
            String strM23198 = DialogInterfaceOnDismissListenerC8913.m23198(abstractC10324);
            if (strM23198 != null) {
                ApplicationC0716.f2992.edit().putString("auto_translation_record", strM23198).apply();
            }
            abstractC10324.mo26143(dialogInterfaceOnDismissListenerC8913.f30573);
            if (abstractC10324.mo26140()) {
                dialogInterfaceOnDismissListenerC8913.f30567.setVisibility(0);
                return;
            } else {
                dialogInterfaceOnDismissListenerC8913.f30567.setVisibility(8);
                return;
            }
        }
        dialogInterfaceOnDismissListenerC8913.f30567.setVisibility(0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f49735.f70103;
        View childAt = dialogInterfaceOnDismissListenerC8913.f30573.getChildAt(0);
        dialogInterfaceOnDismissListenerC8913.f30573.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC8913.f30573.addView(childAt);
    }
}
