package l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.֡ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0252 implements InterfaceC7359, InterfaceC2123, ShapeAppearanceModel.CornerSizeUnaryOperator, InterfaceC1727 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1481;

    public /* synthetic */ C0252(int i) {
        this.f1481 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1692(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1693(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1694(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6055 m1696(C18111 c18111, long j, String str, Object[] objArr) {
        c18111.mo2149(j, str, objArr);
        C6055 c6055 = new C6055();
        c6055.m16453();
        return c6055;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1697(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            C5861.m16072((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo1698(String str, boolean z) {
        C22959 c22959 = C9886.f33734;
        return 1;
    }

    @Override // l.InterfaceC1727
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14429 mo1699(C16524 c16524) {
        return new C1706(c16524);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        switch (this.f1481) {
            case 3:
                ((InterfaceC19333) obj).mo2609(C2170.m6757(new C16759("Player release timed out."), b.d));
                break;
            default:
                ((InterfaceC10430) obj).getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m1695(InterfaceC16481 interfaceC16481, Comparator comparator) {
        return comparator instanceof InterfaceC16481 ? interfaceC16481.mo30456((InterfaceC16481) comparator) : C7618.$default$thenComparing(interfaceC16481, comparator);
    }
}
