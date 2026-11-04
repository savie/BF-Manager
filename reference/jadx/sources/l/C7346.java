package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7346 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24187 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f24188 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20162(SpannableString spannableString) {
        if (this.f24188.add(spannableString.toString())) {
            this.f24187.add(spannableString);
        }
    }

    public final void clear() {
        this.f24187.clear();
        this.f24188.clear();
    }

    public final void sort(Comparator comparator) {
        Collections.sort(this.f24187, comparator);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f24187.iterator();
    }
}
