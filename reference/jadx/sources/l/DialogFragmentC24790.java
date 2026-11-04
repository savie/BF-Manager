package l;

import android.app.AlertDialog;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩻ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DialogFragmentC24790 extends AbstractDialogFragmentC18076 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f80234;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f80235;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashSet f80236 = new HashSet();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f80237;

    @Deprecated
    public DialogFragmentC24790() {
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f80236;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f80235 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.f80237 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.f80234 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        C1669 c1669 = (C1669) m42110();
        if (c1669.m6000() == null || c1669.m6001() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c1669.m5995());
        this.f80235 = false;
        this.f80237 = c1669.m6000();
        this.f80234 = c1669.m6001();
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f80236));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f80235);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f80237);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f80234);
    }

    @Override // l.AbstractDialogFragmentC18076
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo5385(boolean z) {
        C1669 c1669 = (C1669) m42110();
        if (z && this.f80235) {
            HashSet hashSet = this.f80236;
            c1669.m12566((Serializable) hashSet);
            c1669.m5999(hashSet);
        }
        this.f80235 = false;
    }

    @Override // l.AbstractDialogFragmentC18076
    /* JADX INFO: renamed from: ۙ */
    public final void mo42111(AlertDialog.Builder builder) {
        int length = this.f80234.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f80236.contains(this.f80234[i].toString());
        }
        builder.setMultiChoiceItems(this.f80237, zArr, new DialogInterfaceOnMultiChoiceClickListenerC11363(this));
    }
}
