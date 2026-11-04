package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20970 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f67060;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f67061;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f67062;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f67063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f67064;

    /* JADX INFO: renamed from: ۙ */
    public abstract InputStream mo10654();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f67060.compareTo(((AbstractC20970) obj).f67060);
    }

    public AbstractC20970(String str, long j, Object obj) {
        this.f67060 = str;
        this.f67061 = j;
        this.f67063 = obj;
    }
}
