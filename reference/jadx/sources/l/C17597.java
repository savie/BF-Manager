package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes5.dex */
public class C17597 extends AbstractDialogInterfaceOnClickListenerC22391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f55932 = new HashSet();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f55933;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f55934;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence[] f55935;

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f55932;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f55933 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f55935 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f55934 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        C20420 c20420 = (C20420) m49663();
        if (c20420.m46191() == null || c20420.m46189() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c20420.m46192());
        this.f55933 = false;
        this.f55935 = c20420.m46191();
        this.f55934 = c20420.m46189();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f55932));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f55933);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f55935);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f55934);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ */
    public final void mo20368(C18540 c18540) {
        int length = this.f55934.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f55932.contains(this.f55934[i].toString());
        }
        c18540.setMultiChoiceItems(this.f55935, zArr, new DialogInterfaceOnMultiChoiceClickListenerC12659(this));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ */
    public final void mo20369(boolean z) {
        if (z && this.f55933) {
            C20420 c20420 = (C20420) m49663();
            HashSet hashSet = this.f55932;
            c20420.m13140((Serializable) hashSet);
            c20420.m46190(hashSet);
        }
        this.f55933 = false;
    }
}
