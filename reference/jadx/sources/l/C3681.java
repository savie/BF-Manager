package l;

import android.text.SpannableString;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H540 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SparseArray f12656 = new SparseArray();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12657 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11973(SpannableString spannableString, int i) {
        SparseArray sparseArray = this.f12656;
        C23819 c23819 = (C23819) sparseArray.get(i);
        if (c23819 == null) {
            c23819 = new C23819(0);
            sparseArray.put(i, c23819);
        }
        C16359 c16359 = new C16359();
        c16359.f53109 = spannableString;
        if (c23819.f77142 == null) {
            c23819.f77143 = c16359;
            c23819.f77142 = c16359;
        } else {
            c23819.f77143.f53108 = c16359;
            c23819.f77143 = c16359;
        }
        this.f12657++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11972() {
        return this.f12657;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m11975() {
        ArrayList arrayList = new ArrayList(this.f12657);
        m11974(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11974(ArrayList arrayList) {
        SparseArray sparseArray = this.f12656;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            C23819 c23819 = (C23819) sparseArray.get(iArr[i2]);
            if (c23819 != null) {
                for (C16359 c16359 = c23819.f77142; c16359 != null; c16359 = c16359.f53108) {
                    arrayList.add(c16359.f53109);
                }
            }
        }
    }
}
