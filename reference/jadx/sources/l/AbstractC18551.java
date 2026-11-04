package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f60277;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f60278;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f60279;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3178(C8614 c8614);

    /* JADX INFO: renamed from: ܳ */
    public boolean mo3179() {
        return true;
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo26900() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo25328(C8614 c8614) {
        return true;
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo26901() {
        return false;
    }

    public AbstractC18551(int i, int i2) {
        this.f60278 = i;
        this.f60277 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m43131() {
        return this.f60278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43129() {
        return this.f60277;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43130(AbstractC18551 abstractC18551) {
        if (this.f60279 == null) {
            this.f60279 = new ArrayList();
        }
        this.f60279.add(abstractC18551);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m43132() {
        ArrayList arrayList = this.f60279;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
