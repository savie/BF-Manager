package l;

/* JADX INFO: renamed from: l.֫ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f6209;

    public AbstractC1832(String str) {
        C14838.m35754((Object) str);
        this.f6209 = str;
    }

    public final int hashCode() {
        String str = this.f6209;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = ((AbstractC1832) obj).f6209;
        String str2 = this.f6209;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        return this.f6209;
    }
}
