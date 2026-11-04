package l;

import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0948 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3487;

    public /* synthetic */ C0948(int i) {
        this.f3487 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3487) {
            case 0:
                return (C7660) ((Map.Entry) obj).getValue();
            case 1:
                int i = C22302.f72195;
                return new DeleteObjectsRequest.KeyVersion(((S3ObjectSummary) obj).m653());
            case 2:
                return MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return (C12510) C12510.class.cast((InterfaceC19637) obj);
            case 6:
                return C11984.m30083((C17467) obj);
            case 7:
                return new ArrayList();
            case 8:
                return (String) ((C15580) obj).m37318();
            default:
                return ((AbstractC11781) obj).f38067;
        }
    }
}
