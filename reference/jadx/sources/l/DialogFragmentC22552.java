package l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DialogFragmentC22552 extends AbstractDialogFragmentC18076 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72901;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72902;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f72903;

    @Deprecated
    public DialogFragmentC22552() {
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f72903 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f72901 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f72902 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C21806 c21806 = (C21806) m42110();
        if (c21806.m49458() == null || c21806.m49455() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f72903 = c21806.m49457(c21806.getValue());
        this.f72901 = c21806.m49458();
        this.f72902 = c21806.m49455();
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f72903);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f72901);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f72902);
    }

    @Override // l.AbstractDialogFragmentC18076
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo5385(boolean z) {
        int i;
        C21806 c21806 = (C21806) m42110();
        if (!z || (i = this.f72903) < 0) {
            return;
        }
        String string = this.f72902[i].toString();
        c21806.m12566((Serializable) string);
        c21806.m49460(string);
    }

    @Override // l.AbstractDialogFragmentC18076
    /* JADX INFO: renamed from: ۙ */
    public final void mo42111(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f72901, this.f72903, new DialogInterfaceOnClickListenerC10617(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}
