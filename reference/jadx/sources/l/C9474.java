package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I9O8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9474 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f32061;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f32062;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23231 f32063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f32064;

    public C9474(C23231 c23231, long j) {
        this.f32063 = c23231;
        this.f32064 = c23231.getPartitionName() + ".img";
        long dataLength = 0;
        long numBlocks = 0L;
        for (C4885 c4885 : c23231.getOperationsList()) {
            dataLength += c4885.getDataLength();
            Iterator it = c4885.getDstExtentsList().iterator();
            while (it.hasNext()) {
                numBlocks += ((C5903) it.next()).getNumBlocks() * j;
            }
        }
        this.f32062 = dataLength;
        this.f32061 = numBlocks;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m24284() {
        return this.f32064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m24282() {
        return this.f32062;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m24283() {
        return this.f32061;
    }

    public final String toString() {
        return "PayloadEntry{name='" + this.f32064 + "', size=" + this.f32061 + ", cSize=" + this.f32062 + '}';
    }
}
