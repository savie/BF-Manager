package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14006 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f44371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f44372;

    public RunnableC14006(ActivityC3041 activityC3041) {
        this.f44371 = new WeakReference(activityC3041);
        this.f44372 = activityC3041.f9853;
        if (m34098().isEmpty()) {
            return;
        }
        C21576.m49069(this, 1000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34098() {
        ArrayList arrayList = new ArrayList();
        for (C6025 c6025 : this.f44372) {
            int i = c6025.f20612;
            if (i == 0 || i == 1) {
                arrayList.add(c6025);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ActivityC3041 activityC3041 = (ActivityC3041) this.f44371.get();
        if (activityC3041 == null || activityC3041.isFinishing() || this.f44372 != activityC3041.f9853) {
            return;
        }
        if (!activityC3041.f9851) {
            C21576.m49069(this, 5000L);
            return;
        }
        final ArrayList arrayListM34098 = m34098();
        if (arrayListM34098.isEmpty()) {
            return;
        }
        int size = arrayListM34098.size();
        final int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C6025) arrayListM34098.get(i)).f20606;
        }
        C5261.f18540.execute(new Runnable() { // from class: l.۠ܿۧ
            /* JADX WARN: Code duplicated, block: B:14:0x0033 A[PHI: r4
              0x0033: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:7:0x0014, B:12:0x002f, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr2 = iArr;
                ArrayList arrayList = arrayListM34098;
                final ActivityC3041 activityC3042 = activityC3041;
                try {
                    int[] iArrM46446 = C20195.m46446(iArr2);
                    boolean z = false;
                    boolean z2 = false;
                    for (int i2 = 0; i2 < iArrM46446.length; i2++) {
                        if (iArrM46446[i2] == -1) {
                            z2 = true;
                        } else {
                            if (((C6025) arrayList.get(i2)).f20612 != iArrM46446[i2]) {
                                ((C6025) arrayList.get(i2)).f20612 = iArrM46446[i2];
                                z = true;
                            }
                            int i3 = iArrM46446[i2];
                            if (i3 == 0 || i3 == 1) {
                                z2 = true;
                            }
                        }
                    }
                    if (z) {
                        activityC3042.runOnUiThread(new Runnable() { // from class: l.ۜܿۧ
                            @Override // java.lang.Runnable
                            public final void run() {
                                activityC3042.f9857.notifyDataSetChanged();
                            }
                        });
                    }
                    if (!z2) {
                        return;
                    }
                } catch (C4866 unused) {
                }
                C21576.m49069(this.f28635, 5000L);
            }
        });
    }
}
