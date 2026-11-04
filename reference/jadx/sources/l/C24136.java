package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P204 */
/* JADX INFO: loaded from: classes.dex */
public final class C24136 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f78139;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f78140;

    public C24136(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f78139 = new int[size];
        this.f78140 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f78139[i] = ((Integer) arrayList.get(i)).intValue();
            this.f78140[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C24136(int i, int i2) {
        this.f78139 = new int[]{i, i2};
        this.f78140 = new float[]{0.0f, 1.0f};
    }

    public C24136(int i, int i2, int i3) {
        this.f78139 = new int[]{i, i2, i3};
        this.f78140 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
