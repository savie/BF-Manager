package l;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5796 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f19914;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f19916;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16910() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo16912(Intent intent);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo16913() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo16914() {
    }

    public AbstractC5796(ComponentName componentName) {
        this.f19914 = componentName;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16911(int i) {
        if (!this.f19916) {
            this.f19916 = true;
            this.f19915 = i;
        } else {
            if (this.f19915 == i) {
                return;
            }
            StringBuilder sbM12235 = C3769.m12235(i, "Given job ID ", " is different than previous ");
            sbM12235.append(this.f19915);
            throw new IllegalArgumentException(sbM12235.toString());
        }
    }
}
