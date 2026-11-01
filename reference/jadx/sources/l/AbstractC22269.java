package l;

/* JADX INFO: renamed from: l.᩹ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9C7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22269 implements InterfaceC11686 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f72781;

    public AbstractC22269(long j) {
        this.f72781 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long m49436() {
        return this.f72781;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f72781 == ((AbstractC22269) obj).f72781;
    }

    public int hashCode() {
        long j = this.f72781;
        return (int) (j ^ (j >>> 32));
    }
}
