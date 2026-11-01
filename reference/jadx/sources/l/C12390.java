package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.۫ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C12390 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6744 f41405;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SparseArray f41404 = new SparseArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41403 = -1;

    public C12390(C6744 c6744) {
        this.f41405 = c6744;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m30814(int i) {
        SparseArray sparseArray;
        if (this.f41403 == -1) {
            this.f41403 = 0;
        }
        while (true) {
            int i2 = this.f41403;
            sparseArray = this.f41404;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f41403--;
        }
        while (this.f41403 < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f41403 + 1)) {
            this.f41403++;
        }
        return sparseArray.valueAt(this.f41403);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30813(int i, Object obj) {
        int i2 = this.f41403;
        SparseArray sparseArray = this.f41404;
        if (i2 == -1) {
            C2023.m6510(sparseArray.size() == 0);
            this.f41403 = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C2023.m6507(i >= iKeyAt);
            if (iKeyAt == i) {
                this.f41405.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m30816() {
        SparseArray sparseArray = this.f41404;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30817(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f41404;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.f41405.accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.f41403;
            if (i4 > 0) {
                this.f41403 = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30812(int i) {
        SparseArray sparseArray = this.f41404;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0 || i >= sparseArray.keyAt(size)) {
                break;
            }
            this.f41405.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f41403 = sparseArray.size() > 0 ? Math.min(this.f41403, sparseArray.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30811() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f41404;
            if (i < sparseArray.size()) {
                this.f41405.accept(sparseArray.valueAt(i));
                i++;
            } else {
                this.f41403 = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30815() {
        return this.f41404.size() == 0;
    }
}
