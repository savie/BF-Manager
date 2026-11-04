package l;

import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;

/* JADX INFO: renamed from: l.ۜ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HB62 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7428 extends OutArchiveImpl implements IOutCreateArchive7z, IOutUpdateArchive7z {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f24443;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f24444;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24439 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f24441 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f24440 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24445 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f24442 = -1;

    @Override // net.sf.sevenzipjbinding.impl.OutArchiveImpl, net.sf.sevenzipjbinding.IOutFeatureSetLevel
    public final void setLevel(int i) {
        this.f24439 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetMultithreading
    public final void setThreadCount(int i) {
        this.f24441 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetEncryptHeader
    public final void setHeaderEncryption(boolean z) {
        this.f24443 = Boolean.valueOf(z);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolid(boolean z) {
        this.f24440 = z;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidFiles(int i) {
        this.f24445 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidSize(long j) {
        this.f24442 = j;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidExtension(boolean z) {
        this.f24444 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۜ᩸ۨ, net.sf.sevenzipjbinding.impl.OutArchiveImpl] */
    @Override // net.sf.sevenzipjbinding.impl.OutArchiveImpl
    public final void applyFeatures() {
        String string;
        ensureOpened();
        Boolean bool = this.f24443;
        ?? BooleanValue = bool == null ? -1 : bool.booleanValue();
        if (this.f24440) {
            StringBuilder sb = new StringBuilder();
            if (this.f24444) {
                sb.append("E");
            }
            int i = this.f24445;
            if (i != -1) {
                sb.append(i);
                sb.append("F");
            }
            long j = this.f24442;
            if (j != -1) {
                sb.append(j);
                sb.append("B");
            }
            string = sb.length() > 0 ? sb.toString() : null;
        } else {
            string = "";
        }
        nativeSet7z(this.f24439, BooleanValue, this.f24441, string);
    }
}
