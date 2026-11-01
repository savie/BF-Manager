package l;

import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.᩻ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23631 implements ToIntFunction {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76555;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f76555) {
            case 0:
                return ((C14459) obj).f47424;
            default:
                return ((List) ((C13111) obj).f43680).size();
        }
    }
}
