package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ܺۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16780 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9650 f54155;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SparseArray f54154 = new SparseArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54153 = -1;

    public C16780(C9650 c9650) {
        this.f54155 = c9650;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m39617(int i) {
        SparseArray sparseArray;
        if (this.f54153 == -1) {
            this.f54153 = 0;
        }
        while (true) {
            int i2 = this.f54153;
            sparseArray = this.f54154;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f54153--;
        }
        while (this.f54153 < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f54153 + 1)) {
            this.f54153++;
        }
        return sparseArray.valueAt(this.f54153);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39616(int i, Object obj) {
        int i2 = this.f54153;
        SparseArray sparseArray = this.f54154;
        if (i2 == -1) {
            C20782.m47568(sparseArray.size() == 0);
            this.f54153 = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C20782.m47565(i >= iKeyAt);
            if (iKeyAt == i) {
                this.f54155.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m39619() {
        SparseArray sparseArray = this.f54154;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39620(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f54154;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.f54155.accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.f54153;
            if (i4 > 0) {
                this.f54153 = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39615(int i) {
        SparseArray sparseArray = this.f54154;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0 || i >= sparseArray.keyAt(size)) {
                break;
            }
            this.f54155.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f54153 = sparseArray.size() > 0 ? Math.min(this.f54153, sparseArray.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39614() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f54154;
            if (i < sparseArray.size()) {
                this.f54155.accept(sparseArray.valueAt(i));
                i++;
            } else {
                this.f54153 = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m39618() {
        return this.f54154.size() == 0;
    }
}
