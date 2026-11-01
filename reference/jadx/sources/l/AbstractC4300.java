package l;

/* JADX INFO: renamed from: l.ۙ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R524 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4300 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0772 f15468;

    /* JADX INFO: renamed from: ۜ */
    public abstract EnumC1227 mo4758();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo4759(C4651 c4651, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo12097(int i) {
        return this.f15468.f3349.f5390 / 2;
    }

    public AbstractC4300(EnumC0772 enumC0772) {
        this.f15468 = enumC0772;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12098(C4651 c4651, int i) {
        mo4759(c4651, i);
        return mo12097(i) + i;
    }
}
