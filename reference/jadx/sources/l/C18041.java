package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P204 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18041 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f57689;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f57690;

    public C18041(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f57689 = new int[size];
        this.f57690 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f57689[i] = ((Integer) arrayList.get(i)).intValue();
            this.f57690[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C18041(int i, int i2) {
        this.f57689 = new int[]{i, i2};
        this.f57690 = new float[]{0.0f, 1.0f};
    }

    public C18041(int i, int i2, int i3) {
        this.f57689 = new int[]{i, i2, i3};
        this.f57690 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
