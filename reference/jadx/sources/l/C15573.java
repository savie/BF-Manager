package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public class C15573 extends C15967 {
    @Override // l.C15967
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37211(int i, Bundle bundle) {
        if (bundle != null) {
            C1148.m4220(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((C20511) parcelable);
        }
        throw null;
    }
}
