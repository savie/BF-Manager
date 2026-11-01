package l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaCodecInfo;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.᩺ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L70P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22979 implements InterfaceC7359, InterfaceC7814, InterfaceC3232, InterfaceC17591 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m50818(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m50819() {
        return Executable.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50820(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50821(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            throw null;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    @Override // l.InterfaceC17591
    /* JADX INFO: renamed from: ۙ */
    public Object mo1012(int i, int i2, byte[] bArr) {
        return C17281.m40240(i, i2, bArr);
    }

    @Override // l.InterfaceC3232
    /* JADX INFO: renamed from: ۙ */
    public String mo9687(EnumC15934 enumC15934, String str, String str2) {
        return EnumC14523.m34958(enumC15934, str, str2);
    }

    @Override // l.InterfaceC7814
    /* JADX INFO: renamed from: ۙ */
    public void mo20516(int i, int i2, int i3) {
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m50822(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i2] != bArr[i]) {
                i = iArr[i - 1];
            }
            if (bArr[i2] == bArr[i]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m50823(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM2791 = C0589.m2791("offset=", i2, ", length=", ", totalLength=", i3);
            sbM2791.append(i);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50824(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM2791 = C0589.m2791("offset=", i2, ", length=", ", arrayLength=", i3);
            sbM2791.append(i);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
    }
}
