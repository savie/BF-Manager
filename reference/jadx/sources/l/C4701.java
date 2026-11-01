package l;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۙܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4701 implements InterfaceC18854 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean f16595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f16596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UUID f16597;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f16595 = z;
    }

    public C4701(UUID uuid, byte[] bArr) {
        this.f16597 = uuid;
        this.f16596 = bArr;
    }
}
