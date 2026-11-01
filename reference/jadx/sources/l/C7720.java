package l;

import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes4.dex */
public class C7720 extends AbstractDialogInterfaceOnClickListenerC22391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence[] f25536;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f25537;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f25538;

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25538 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f25537 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f25536 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C8426 c8426 = (C8426) m49663();
        if (c8426.m22074() == null || c8426.m22075() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f25538 = c8426.m22072(c8426.getValue());
        this.f25537 = c8426.m22074();
        this.f25536 = c8426.m22075();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f25538);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f25537);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f25536);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20368(C18540 c18540) {
        c18540.setSingleChoiceItems(this.f25537, this.f25538, new DialogInterfaceOnClickListenerC10543(this));
        c18540.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20369(boolean z) {
        int i;
        if (!z || (i = this.f25538) < 0) {
            return;
        }
        String string = this.f25536[i].toString();
        C8426 c8426 = (C8426) m49663();
        c8426.m13140((Serializable) string);
        c8426.m22069(string);
    }
}
