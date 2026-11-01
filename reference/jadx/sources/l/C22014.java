package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22014 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71370;

    public /* synthetic */ C22014(int i) {
        this.f71370 = i;
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
        switch (this.f71370) {
            case 0:
                return C16523.m38890("\"", ((EnumC20934) obj).m47084(), "\"");
            default:
                return ((C2859) ((C15187) obj).f49578).m8627();
        }
    }
}
