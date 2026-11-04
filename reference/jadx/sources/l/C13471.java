package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۫᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13471 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42872;

    public /* synthetic */ C13471(int i) {
        this.f42872 = i;
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
        switch (this.f42872) {
            case 0:
                EnumC11979 enumC11979 = (EnumC11979) obj;
                return String.format("%-26s: \"%s\"", enumC11979.name(), enumC11979.f38601);
            default:
                return C1170.stream(((AbstractC15029) obj).m36184()).filter(new C10754(2));
        }
    }
}
