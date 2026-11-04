package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes.dex */
public final class C22605 extends AbstractC15145 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f73059;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f73060;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f73061;

    public C22605(int i, long j) {
        super(i);
        this.f73059 = j;
        this.f73061 = new ArrayList();
        this.f73060 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19621 m50936(int i) {
        ArrayList arrayList = this.f73061;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C19621 c19621 = (C19621) arrayList.get(i2);
            if (c19621.f49413 == i) {
                return c19621;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22605 m50937(int i) {
        ArrayList arrayList = this.f73060;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C22605 c22605 = (C22605) arrayList.get(i2);
            if (c22605.f49413 == i) {
                return c22605;
            }
        }
        return null;
    }

    @Override // l.AbstractC15145
    public final String toString() {
        return AbstractC15145.m36443(this.f49413) + " leaves: " + Arrays.toString(this.f73061.toArray()) + " containers: " + Arrays.toString(this.f73060.toArray());
    }
}
