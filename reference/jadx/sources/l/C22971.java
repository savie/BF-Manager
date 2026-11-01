package l;

import android.util.Base64;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩺ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22971 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f74654;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f74655;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f74656;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f74657;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f74658;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f74659;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74661;

    public /* synthetic */ C22971(int i) {
        this();
    }

    public C22971() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50813() {
        switch (this.f74660) {
            case 32:
            case 48:
                return this.f74659;
            case 64:
                return C15210.m36414(this.f74658);
            case 80:
                return Base64.encodeToString(this.f74658, 2);
            case 96:
                return Integer.toString(this.f74661);
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return Integer.toString(this.f74661, 16);
            case 128:
                return Long.toString(this.f74654);
            case 144:
                return Long.toString(this.f74654, 16);
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return Float.toString(this.f74657);
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return Double.toString(this.f74655);
            case 192:
                return "true";
            case 208:
                return "false";
            default:
                return null;
        }
    }
}
