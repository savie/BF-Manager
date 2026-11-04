package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I9O8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f16861;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24935 f16862;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f16863;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16864;

    public C4819(C24935 c24935, long j) {
        this.f16862 = c24935;
        this.f16863 = c24935.getPartitionName() + ".img";
        long dataLength = 0;
        long numBlocks = 0L;
        for (C4797 c4797 : c24935.getOperationsList()) {
            dataLength += c4797.getDataLength();
            Iterator it = c4797.getDstExtentsList().iterator();
            while (it.hasNext()) {
                numBlocks += ((C9776) it.next()).getNumBlocks() * j;
            }
        }
        this.f16861 = dataLength;
        this.f16864 = numBlocks;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m14851() {
        return this.f16863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14849() {
        return this.f16861;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m14850() {
        return this.f16864;
    }

    public final String toString() {
        return "PayloadEntry{name='" + this.f16863 + "', size=" + this.f16864 + ", cSize=" + this.f16861 + '}';
    }
}
