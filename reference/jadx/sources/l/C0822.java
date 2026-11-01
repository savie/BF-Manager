package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0822 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3448 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f3449 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3417(SpannableString spannableString) {
        if (this.f3449.add(spannableString.toString())) {
            this.f3448.add(spannableString);
        }
    }

    public final void clear() {
        this.f3448.clear();
        this.f3449.clear();
    }

    public final void sort(Comparator comparator) {
        Collections.sort(this.f3448, comparator);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3448.iterator();
    }
}
