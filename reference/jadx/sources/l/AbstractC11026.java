package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11026 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37475;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f37476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f37477;

    /* JADX INFO: renamed from: ۖ */
    public boolean mo6053() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2267(C11545 c11545);

    /* JADX INFO: renamed from: ۚ */
    public boolean mo6054() {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo9747(C11545 c11545) {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ */
    public boolean mo6292() {
        return true;
    }

    public AbstractC11026(int i, int i2) {
        this.f37476 = i;
        this.f37475 = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27806() {
        return this.f37476;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27804() {
        return this.f37475;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27805(AbstractC11026 abstractC11026) {
        if (this.f37477 == null) {
            this.f37477 = new ArrayList();
        }
        this.f37477.add(abstractC11026);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m27807() {
        ArrayList arrayList = this.f37477;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
