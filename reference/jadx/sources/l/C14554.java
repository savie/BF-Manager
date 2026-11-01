package l;

import bin.mt.json.JSONValue;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14554 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47652;

    public /* synthetic */ C14554(int i) {
        this.f47652 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f47652) {
            case 0:
                return new C9221((C17367) obj);
            case 1:
                return C9030.stream(((C0206) obj).f1365);
            case 2:
                return C6730.m18172((String) obj);
            case 3:
                return (CharSequence) obj;
            case 4:
                return ((JSONValue) obj).asString();
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
