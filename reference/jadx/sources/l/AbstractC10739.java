package l;

/* JADX INFO: renamed from: l.ۤ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H586 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10739 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24738 f34102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34103 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34104 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo10821(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo10823();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10825(C4028 c4028, C17452 c17452);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10826(C24166 c24166);

    public AbstractC10739(C24738 c24738) {
        this.f34102 = c24738;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27352(C4028 c4028, int i, C17452 c17452) {
        try {
            this.f34103 = c4028.m12992();
            this.f34104 = i;
            mo10825(c4028, c17452);
        } catch (Exception e) {
            throw C14468.m34931(mo10823(), e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27354(int i, int i2) {
        try {
            this.f34103 = i;
            this.f34104 = i2;
            return mo10821(i);
        } catch (Exception e) {
            throw C14468.m34931(mo10823(), e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27355(C24166 c24166) {
        try {
            c24166.m54137();
            mo10826(c24166);
            c24166.m54130();
        } catch (Exception e) {
            throw C14468.m34931(mo10823(), e);
        }
    }

    public final String toString() {
        return mo10823();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27353() {
        return this.f34104;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24738 m27356() {
        return this.f34102;
    }
}
