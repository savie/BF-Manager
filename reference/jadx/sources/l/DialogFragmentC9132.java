package l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC9132 extends AbstractDialogFragmentC2634 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence[] f31075;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f31076;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31077;

    @Deprecated
    public DialogFragmentC9132() {
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f31077 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f31076 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f31075 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C8426 c8426 = (C8426) m8118();
        if (c8426.m22074() == null || c8426.m22075() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f31077 = c8426.m22072(c8426.getValue());
        this.f31076 = c8426.m22074();
        this.f31075 = c8426.m22075();
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f31077);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f31076);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f31075);
    }

    @Override // l.AbstractDialogFragmentC2634
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo8121(boolean z) {
        int i;
        C8426 c8426 = (C8426) m8118();
        if (!z || (i = this.f31077) < 0) {
            return;
        }
        String string = this.f31075[i].toString();
        c8426.m13140((Serializable) string);
        c8426.m22069(string);
    }

    @Override // l.AbstractDialogFragmentC2634
    /* JADX INFO: renamed from: ۙ */
    public final void mo8119(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f31076, this.f31077, new DialogInterfaceOnClickListenerC19715(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}
