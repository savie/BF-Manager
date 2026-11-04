package l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۗۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3188 implements InterfaceC19795, InterfaceC18689 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10404(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10405(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10406(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10407(Object obj) throws Exception {
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10408(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    @Override // l.InterfaceC18689
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5131(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            if (i2 == 80 && i3 == 73 && i4 == 67) {
                return true;
            }
            if (i2 != 84) {
                return false;
            }
            if (i3 == 84 && i4 == 50) {
                return true;
            }
            if (i3 == 80) {
                return i4 == 49 || i4 == 50;
            }
            return false;
        }
        if (i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) {
            return true;
        }
        if (i2 != 84) {
            return false;
        }
        if (i3 == 73 && i4 == 84 && i5 == 50) {
            return true;
        }
        if (i3 == 80 && i4 == 69) {
            return i5 == 49 || i5 == 50;
        }
        return false;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }
}
