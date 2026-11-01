package l;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4283 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f15432;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15434;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12087() {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10161(Intent intent);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo12089() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo12090() {
    }

    public AbstractC4283(ComponentName componentName) {
        this.f15432 = componentName;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12088(int i) {
        if (!this.f15434) {
            this.f15434 = true;
            this.f15433 = i;
        } else {
            if (this.f15433 == i) {
                return;
            }
            StringBuilder sbM40153 = C17214.m40153(i, "Given job ID ", " is different than previous ");
            sbM40153.append(this.f15433);
            throw new IllegalArgumentException(sbM40153.toString());
        }
    }
}
