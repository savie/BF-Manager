package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes5.dex */
public class C17330 extends AbstractDialogInterfaceOnClickListenerC7635 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f56430;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f56431;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashSet f56432 = new HashSet();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f56433;

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f56432;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f56431 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f56433 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f56430 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        C1669 c1669 = (C1669) m20853();
        if (c1669.m6000() == null || c1669.m6001() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c1669.m5995());
        this.f56431 = false;
        this.f56433 = c1669.m6000();
        this.f56430 = c1669.m6001();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f56432));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f56431);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f56433);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f56430);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ */
    public final void mo20852(C20756 c20756) {
        int length = this.f56430.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f56432.contains(this.f56430[i].toString());
        }
        c20756.setMultiChoiceItems(this.f56433, zArr, new DialogInterfaceOnMultiChoiceClickListenerC16584(this));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ */
    public final void mo9811(boolean z) {
        if (z && this.f56431) {
            C1669 c1669 = (C1669) m20853();
            HashSet hashSet = this.f56432;
            c1669.m12566((Serializable) hashSet);
            c1669.m5999(hashSet);
        }
        this.f56431 = false;
    }
}
