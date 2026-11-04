package l;

import android.util.Base64;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ܳۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15278 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f49929;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f49930;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f49931;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f49932;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f49933;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f49934;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f49935;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f49936;

    public /* synthetic */ C15278(int i) {
        this();
    }

    public C15278() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36639() {
        switch (this.f49935) {
            case 32:
            case 48:
                return this.f49930;
            case 64:
                return C13041.m32460(this.f49931);
            case 80:
                return Base64.encodeToString(this.f49931, 2);
            case 96:
                return Integer.toString(this.f49933);
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return Integer.toString(this.f49933, 16);
            case 128:
                return Long.toString(this.f49932);
            case 144:
                return Long.toString(this.f49932, 16);
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return Float.toString(this.f49934);
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return Double.toString(this.f49936);
            case 192:
                return "true";
            case 208:
                return "false";
            default:
                return null;
        }
    }
}
