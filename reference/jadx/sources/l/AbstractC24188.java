package l;

/* JADX INFO: renamed from: l.᩺ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R524 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24188 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7779 f78334;

    /* JADX INFO: renamed from: ۧ */
    public abstract EnumC7801 mo2083();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo2086(C24166 c24166, int i);

    /* JADX INFO: renamed from: ۙ */
    public int mo2082(int i) {
        return this.f78334.f25847.f25944 / 2;
    }

    public AbstractC24188(EnumC7779 enumC7779) {
        this.f78334 = enumC7779;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54171(C24166 c24166, int i) {
        mo2086(c24166, i);
        return mo2082(i) + i;
    }
}
