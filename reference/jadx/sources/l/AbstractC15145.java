package l;

/* JADX INFO: renamed from: l.ܳۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49413;

    public AbstractC15145(int i) {
        this.f49413 = i;
    }

    public String toString() {
        return m36443(this.f49413);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36443(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
