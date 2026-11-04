package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21390 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68152;

    public /* synthetic */ C21390(int i) {
        this.f68152 = i;
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
        switch (this.f68152) {
            case 0:
                return C14442.m34865("\"", (String) obj, "\"");
            default:
                return String.format("#%d", Integer.valueOf(((C7660) obj).f67820));
        }
    }
}
