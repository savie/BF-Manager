package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14235 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46632;

    public /* synthetic */ C14235(int i) {
        this.f46632 = i;
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
        switch (this.f46632) {
            case 0:
                EnumC4438 enumC4438 = (EnumC4438) obj;
                return String.format("%-26s: \"%s\"", enumC4438.name(), enumC4438.f15805);
            default:
                return "#" + ((Integer) obj);
        }
    }
}
