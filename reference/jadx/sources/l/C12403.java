package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.۫۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12403 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC17341 f41437;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C12403(AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341) {
        this.f41437 = abstractDialogInterfaceOnClickListenerC17341;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = this.f41437;
        if (abstractDialogInterfaceOnClickListenerC17341.m40377()) {
            abstractDialogInterfaceOnClickListenerC17341.f55200.setVisibility(8);
        }
    }
}
