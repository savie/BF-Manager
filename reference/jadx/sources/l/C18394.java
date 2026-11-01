package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C18394 extends C15967 {
    @Override // l.C15967
    /* JADX INFO: renamed from: ۙ */
    public final void mo37211(int i, Bundle bundle) {
        if (bundle != null) {
            C1148.m4220(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof C20511)) {
            throw null;
        }
        throw null;
    }
}
