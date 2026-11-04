package l;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۘۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4045 implements InterfaceC4944 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final boolean f13782;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f13783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UUID f13784;

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
        f13782 = z;
    }

    public C4045(UUID uuid, byte[] bArr) {
        this.f13784 = uuid;
        this.f13783 = bArr;
    }
}
