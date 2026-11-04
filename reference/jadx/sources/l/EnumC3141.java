package l;

import com.alipay.sdk.m.t0.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5JO */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3141 {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(IShizukuService.Stub.TRANSACTION_attachUserService, "Failed to read from given input"),
    NOT_GIF_FILE(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "Data is not in GIF format"),
    NO_SCRN_DSCR(IShizukuService.Stub.TRANSACTION_isHidden, "No screen descriptor detected"),
    NO_IMAG_DSCR(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "No image descriptor detected"),
    NO_COLOR_MAP(IShizukuService.Stub.TRANSACTION_getFlagsForUid, "Neither global nor local color map found"),
    WRONG_RECORD(IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(UMErrorCode.E_UM_BE_JSON_FAILED, "Failed to close given input"),
    NOT_READABLE(UMErrorCode.E_UM_BE_CREATE_FAILED, "Given file was not opened for read"),
    IMAGE_DEFECT(UMErrorCode.E_UM_BE_DEFLATE_FAILED, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(UMErrorCode.E_UM_BE_RAW_OVERSIZE, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(b.c, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(b.d, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f10199;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10200;

    EnumC3141(int i, String str) {
        this.f10200 = i;
        this.f10199 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3141 m10260(int i) {
        for (EnumC3141 enumC3141 : values()) {
            if (enumC3141.f10200 == i) {
                return enumC3141;
            }
        }
        EnumC3141 enumC3142 = UNKNOWN;
        enumC3142.f10200 = i;
        return enumC3142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m10262() {
        return this.f10200;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m10263() {
        Locale locale = Locale.ENGLISH;
        return "GifError " + this.f10200 + ": " + this.f10199;
    }
}
