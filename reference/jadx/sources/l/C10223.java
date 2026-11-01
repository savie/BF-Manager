package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10223 extends AbstractC20806 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34897;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f34898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34899;

    public C10223(int i, long j) {
        super(i);
        this.f34898 = j;
        this.f34897 = new ArrayList();
        this.f34899 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7400 m26005(int i) {
        ArrayList arrayList = this.f34897;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7400 c7400 = (C7400) arrayList.get(i2);
            if (c7400.f67638 == i) {
                return c7400;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10223 m26006(int i) {
        ArrayList arrayList = this.f34899;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C10223 c10223 = (C10223) arrayList.get(i2);
            if (c10223.f67638 == i) {
                return c10223;
            }
        }
        return null;
    }

    @Override // l.AbstractC20806
    public final String toString() {
        return AbstractC20806.m46786(this.f67638) + " leaves: " + Arrays.toString(this.f34897.toArray()) + " containers: " + Arrays.toString(this.f34899.toArray());
    }
}
