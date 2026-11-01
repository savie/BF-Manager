package l;

import net.sf.sevenzipjbinding.ArchiveFormat;

/* JADX INFO: renamed from: l.ܺ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B7C */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f50802;

    static {
        int[] iArr = new int[ArchiveFormat.values().length];
        f50802 = iArr;
        try {
            iArr[ArchiveFormat.SEVEN_ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f50802[ArchiveFormat.ZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f50802[ArchiveFormat.BZIP2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f50802[ArchiveFormat.GZIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f50802[ArchiveFormat.TAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
