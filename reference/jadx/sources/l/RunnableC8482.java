package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8482 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public WeakReference f29402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f29403;

    public RunnableC8482(ActivityC3541 activityC3541) {
        this.f29402 = new WeakReference(activityC3541);
        this.f29403 = activityC3541.f13045;
        if (m22149().isEmpty()) {
            return;
        }
        C16737.m39274(this, 1000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m22149() {
        ArrayList arrayList = new ArrayList();
        for (C11780 c11780 : this.f29403) {
            int i = c11780.f39566;
            if (i == 0 || i == 1) {
                arrayList.add(c11780);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ActivityC3541 activityC3541 = (ActivityC3541) this.f29402.get();
        if (activityC3541 == null || activityC3541.isFinishing() || this.f29403 != activityC3541.f13045) {
            return;
        }
        if (!activityC3541.f13038) {
            C16737.m39274(this, 5000L);
            return;
        }
        final ArrayList arrayListM22149 = m22149();
        if (arrayListM22149.isEmpty()) {
            return;
        }
        int size = arrayListM22149.size();
        final int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C11780) arrayListM22149.get(i)).f39571;
        }
        C4716.f16636.execute(new Runnable() { // from class: l.ᩳ᩺ۜ
            /* JADX WARN: Code duplicated, block: B:14:0x0033 A[PHI: r4
              0x0033: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:7:0x0014, B:12:0x002f, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr2 = iArr;
                ArrayList arrayList = arrayListM22149;
                final ActivityC3541 activityC3542 = activityC3541;
                try {
                    int[] iArrM13087 = C4723.m13087(iArr2);
                    boolean z = false;
                    boolean z2 = false;
                    for (int i2 = 0; i2 < iArrM13087.length; i2++) {
                        if (iArrM13087[i2] == -1) {
                            z2 = true;
                        } else {
                            if (((C11780) arrayList.get(i2)).f39566 != iArrM13087[i2]) {
                                ((C11780) arrayList.get(i2)).f39566 = iArrM13087[i2];
                                z = true;
                            }
                            int i3 = iArrM13087[i2];
                            if (i3 == 0 || i3 == 1) {
                                z2 = true;
                            }
                        }
                    }
                    if (z) {
                        activityC3542.runOnUiThread(new Runnable() { // from class: l.ᩴ᩺ۜ
                            @Override // java.lang.Runnable
                            public final void run() {
                                activityC3542.f13039.notifyDataSetChanged();
                            }
                        });
                    }
                    if (!z2) {
                        return;
                    }
                } catch (C4987 unused) {
                }
                C16737.m39274(this.f58564, 5000L);
            }
        });
    }
}
