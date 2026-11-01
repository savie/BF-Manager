package l;

import android.app.AlertDialog;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DialogFragmentC16892 extends AbstractDialogFragmentC2634 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f54036 = new HashSet();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f54037;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f54038;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence[] f54039;

    @Deprecated
    public DialogFragmentC16892() {
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f54036;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f54037 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.f54039 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.f54038 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        C20420 c20420 = (C20420) m8118();
        if (c20420.m46191() == null || c20420.m46189() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c20420.m46192());
        this.f54037 = false;
        this.f54039 = c20420.m46191();
        this.f54038 = c20420.m46189();
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f54036));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f54037);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f54039);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f54038);
    }

    @Override // l.AbstractDialogFragmentC2634
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo8121(boolean z) {
        C20420 c20420 = (C20420) m8118();
        if (z && this.f54037) {
            HashSet hashSet = this.f54036;
            c20420.m13140((Serializable) hashSet);
            c20420.m46190(hashSet);
        }
        this.f54037 = false;
    }

    @Override // l.AbstractDialogFragmentC2634
    /* JADX INFO: renamed from: ۙ */
    public final void mo8119(AlertDialog.Builder builder) {
        int length = this.f54038.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f54036.contains(this.f54038[i].toString());
        }
        builder.setMultiChoiceItems(this.f54039, zArr, new DialogInterfaceOnMultiChoiceClickListenerC0663(this));
    }
}
