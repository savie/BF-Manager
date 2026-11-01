package l;

import android.widget.EditText;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23710 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76732;

    public /* synthetic */ C23710(int i, Object obj) {
        this.f76731 = i;
        this.f76732 = obj;
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
        switch (this.f76731) {
            case 0:
                return ((C14538) this.f76732).m34972((String) obj);
            case 1:
                String strSubstring = ((String) obj).substring(((String) this.f76732).length());
                int iIndexOf = strSubstring.indexOf(47);
                return iIndexOf == -1 ? strSubstring : strSubstring.substring(0, iIndexOf);
            case 2:
                EditText editText = (EditText) this.f76732;
                return editText.length() == 0 ? (CharSequence) obj : editText.getText();
            default:
                return ((MaterialDynamicColors) this.f76732).lambda$onSecondaryFixed$125((DynamicScheme) obj);
        }
    }
}
