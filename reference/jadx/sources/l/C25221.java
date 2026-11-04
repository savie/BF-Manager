package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25221 implements BinaryOperator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81470;

    public /* synthetic */ C25221(int i) {
        this.f81470 = i;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f81470) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str.equals(str2)) {
                    return str;
                }
                int iIndexOf = str.indexOf(47);
                int iIndexOf2 = str2.indexOf(47);
                if (iIndexOf == iIndexOf2 && iIndexOf != -1) {
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    if (strSubstring.equals(str2.substring(0, iIndexOf2 + 1))) {
                        return strSubstring.concat("*");
                    }
                }
                return "*/*";
            default:
                C9829 c9829 = (C9829) obj;
                c9829.m25607(c9829.size(), (C9829) obj2);
                return c9829;
        }
    }
}
