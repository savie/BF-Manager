package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6EN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15361 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f50117;

    public /* synthetic */ C15361(C2551 c2551) {
        this.f50117 = c2551;
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
        C18959 c18959 = (C18959) obj;
        int i = C13124.f41929[c18959.getType().ordinal()];
        C2551 c2551 = this.f50117;
        switch (i) {
            case 1:
            case 2:
                C2551 c2551M5668 = c2551.mo8527().m5668(((AbstractC15251) c18959).mo18926());
                if (c2551M5668 == null || C17446.m40944(c2551, c2551M5668)) {
                    return null;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                C17467 c17467M5670 = c2551.mo8527().m5670((C14022) ((C3319) c18959).m10937());
                if (c17467M5670 == null || C17446.m40945(c2551, c17467M5670)) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return Boolean.FALSE;
    }
}
