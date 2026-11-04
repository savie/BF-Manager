package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public class C23170 extends C14854 {
    @Override // l.C14854
    /* JADX INFO: renamed from: ۙ */
    public final void mo34505(int i, Bundle bundle) {
        if (bundle != null) {
            C13363.m32945(bundle);
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
        if (parcelable == null || (parcelable instanceof C3778)) {
            throw null;
        }
        throw null;
    }
}
