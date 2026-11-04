package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۨ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9DN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12038 implements InterfaceC22896 {
    FILE_ATTRIBUTE_ARCHIVE(32),
    FILE_ATTRIBUTE_COMPRESSED(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
    FILE_ATTRIBUTE_DIRECTORY(16),
    FILE_ATTRIBUTE_ENCRYPTED(16384),
    FILE_ATTRIBUTE_HIDDEN(2),
    FILE_ATTRIBUTE_NORMAL(128),
    FILE_ATTRIBUTE_NOT_CONTENT_INDEXED(8192),
    FILE_ATTRIBUTE_OFFLINE(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
    FILE_ATTRIBUTE_READONLY(1),
    FILE_ATTRIBUTE_REPARSE_POINT(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS),
    FILE_ATTRIBUTE_SPARSE_FILE(512),
    FILE_ATTRIBUTE_SYSTEM(4),
    FILE_ATTRIBUTE_TEMPORARY(256),
    FILE_ATTRIBUTE_INTEGRITY_STREAM(X931RNG.BLOCK64_RESEED_MAX),
    FILE_ATTRIBUTE_NO_SCRUB_DATA(131072);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f38800;

    EnumC12038(long j) {
        this.f38800 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f38800;
    }
}
