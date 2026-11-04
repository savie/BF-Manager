package l;

import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ܿ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F764 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18176 implements InterfaceC19795, InterfaceC14075, InterfaceC0277, ShapeAppearanceModel.CornerSizeUnaryOperator {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42345(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42346(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // l.InterfaceC14075
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC14075
    /* JADX INFO: renamed from: ۙ */
    public AbstractC7364 mo3080(int i) {
        return new C24913(i);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC0277
    /* JADX INFO: renamed from: ۙ */
    public void mo1814() {
        System.loadLibrary("mt-radare2");
    }
}
