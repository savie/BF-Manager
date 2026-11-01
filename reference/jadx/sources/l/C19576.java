package l;

import android.text.SpannableString;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H540 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19576 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SparseArray f62894 = new SparseArray();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62895 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44683(SpannableString spannableString, int i) {
        SparseArray sparseArray = this.f62894;
        C8287 c8287 = (C8287) sparseArray.get(i);
        if (c8287 == null) {
            c8287 = new C8287(0);
            sparseArray.put(i, c8287);
        }
        C18870 c18870 = new C18870();
        c18870.f61107 = spannableString;
        if (c8287.f28780 == null) {
            c8287.f28781 = c18870;
            c8287.f28780 = c18870;
        } else {
            c8287.f28781.f61106 = c18870;
            c8287.f28781 = c18870;
        }
        this.f62895++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44682() {
        return this.f62895;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44685() {
        ArrayList arrayList = new ArrayList(this.f62895);
        m44684(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44684(ArrayList arrayList) {
        SparseArray sparseArray = this.f62894;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            C8287 c8287 = (C8287) sparseArray.get(iArr[i2]);
            if (c8287 != null) {
                for (C18870 c18870 = c8287.f28780; c18870 != null; c18870 = c18870.f61106) {
                    arrayList.add(c18870.f61107);
                }
            }
        }
    }
}
