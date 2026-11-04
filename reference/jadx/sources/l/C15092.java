package l;

import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܳۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes5.dex */
public class C15092 extends AbstractDialogInterfaceOnClickListenerC7635 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f49257;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence[] f49258;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f49259;

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f49259 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f49257 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f49258 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C21806 c21806 = (C21806) m20853();
        if (c21806.m49458() == null || c21806.m49455() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f49259 = c21806.m49457(c21806.getValue());
        this.f49257 = c21806.m49458();
        this.f49258 = c21806.m49455();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f49259);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f49257);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f49258);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ */
    public final void mo20852(C20756 c20756) {
        c20756.setSingleChoiceItems(this.f49257, this.f49259, new DialogInterfaceOnClickListenerC19568(this));
        c20756.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ */
    public final void mo9811(boolean z) {
        int i;
        if (!z || (i = this.f49259) < 0) {
            return;
        }
        String string = this.f49258[i].toString();
        C21806 c21806 = (C21806) m20853();
        c21806.m12566((Serializable) string);
        c21806.m49460(string);
    }
}
