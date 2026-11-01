package l;

/* JADX INFO: renamed from: l.᩷ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20806 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67638;

    public AbstractC20806(int i) {
        this.f67638 = i;
    }

    public String toString() {
        return m46786(this.f67638);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46786(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
