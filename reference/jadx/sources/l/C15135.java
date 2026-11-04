package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6FE */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15135 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49376;

    public /* synthetic */ C15135(int i, Object obj) {
        this.f49375 = i;
        this.f49376 = obj;
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
        switch (this.f49375) {
            case 0:
                C2551 c2551 = (C2551) obj;
                return ((C23341) this.f49376).f75606.m5667(c2551.m8536().m55569(), c2551.mo8532().m49701());
            case 1:
                String strSubstring = ((String) obj).substring(((String) this.f49376).length());
                int iIndexOf = strSubstring.indexOf(47);
                return iIndexOf == -1 ? strSubstring : strSubstring.substring(0, iIndexOf);
            case 2:
                return ((MaterialDynamicColors) this.f49376).lambda$onSecondaryContainer$78((DynamicScheme) obj);
            default:
                return Boolean.valueOf(((C3486) this.f49376).m11468((C2551) obj));
        }
    }
}
