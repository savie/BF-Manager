package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 56C5 */
/* JADX INFO: loaded from: classes.dex */
public final class C25051 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f81027;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81028 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17973 f81029;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f81030;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f81031;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f81032;

    public C25051(C17973 c17973) {
        this.f81029 = c17973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55867(AbstractC1566 abstractC1566) {
        this.f81032 = abstractC1566;
        this.f81030 = true;
        this.f81027 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55870() {
        if (this.f81030) {
            return;
        }
        this.f81028 = 0;
        this.f81032 = (AbstractC1566) this.f81027.get(0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m55871() {
        if (this.f81030) {
            return false;
        }
        int size = (this.f81028 + 1) % this.f81027.size();
        this.f81028 = size;
        this.f81032 = (AbstractC1566) this.f81027.get(size);
        return this.f81028 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17973 m55869() {
        return this.f81029;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m55875() {
        return this.f81030;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55868(boolean z) {
        this.f81030 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m55872() {
        return this.f81032;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55874(AbstractC1566 abstractC1566) {
        this.f81032 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55866(List list) {
        this.f81027 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m55865() {
        return this.f81031;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55873(List list) {
        this.f81031 = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f81029.m41926());
        if (this.f81030) {
            sb.append(", resolved type: ");
            sb.append(this.f81032);
        } else {
            sb.append(", currentType=");
            sb.append(this.f81032);
            sb.append(", candidateTypes=");
            sb.append(this.f81027);
            sb.append(", constraints=");
            sb.append(this.f81031);
        }
        return sb.toString();
    }
}
