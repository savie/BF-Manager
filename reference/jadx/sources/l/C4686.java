package l;

import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4686 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16568;

    public /* synthetic */ C4686(int i) {
        this.f16568 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f16568) {
            case 0:
                int i = C3980.f14752;
                return "invalid index into the constant_pool table";
            case 1:
                return ((InterfaceC2557) obj).getPath();
            case 2:
                int i2 = C3494.f12808;
                return new DeleteObjectsRequest.KeyVersion(((S3ObjectSummary) obj).m660());
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            case 6:
                return ((EnumC1965) obj).m6342();
            case 7:
                return (C6656) ((AbstractC14728) obj);
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }
}
