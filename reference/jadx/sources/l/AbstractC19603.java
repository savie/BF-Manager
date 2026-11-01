package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19603 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f62948;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f62949;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f62950;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f62951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f62952;

    /* JADX INFO: renamed from: ۙ */
    public abstract InputStream mo2898();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f62951.compareTo(((AbstractC19603) obj).f62951);
    }

    public AbstractC19603(String str, long j, Object obj) {
        this.f62951 = str;
        this.f62949 = j;
        this.f62948 = obj;
    }
}
