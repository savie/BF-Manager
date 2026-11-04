package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7873 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26213;

    public /* synthetic */ C7873(int i) {
        this.f26213 = i;
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
        boolean z = false;
        switch (this.f26213) {
            case 0:
                Object objM35193 = C14584.m35193((String) obj, new String[0]);
                return objM35193 instanceof InterfaceC6557 ? ((InterfaceC6557) objM35193).mo15565() : objM35193;
            case 1:
                int i = AbstractActivityC10144.f32485;
                return ((C11636) obj).f36488;
            case 2:
                return ((AbstractC22044) obj).mo4294();
            case 3:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                String str = (String) obj;
                String lowerCase = str.trim().toLowerCase(Locale.ROOT);
                if (lowerCase.equals("yes") || lowerCase.equals("true")) {
                    z = true;
                } else if (!lowerCase.equals("no") && !lowerCase.equals("false")) {
                    throw new IllegalArgumentException(C14442.m34865("Unknown value '", str, "' for option 'dex-input.verify-checksum', expect: 'yes' or 'no'"));
                }
                return Boolean.valueOf(z);
            case 7:
                C6041 c6041 = (C6041) obj;
                return c6041 + " from " + c6041.m39118();
            case 8:
                C23773 c23773 = C1606.f5506;
                return null;
            case 9:
                int i2 = C11233.f35424;
                return null;
            default:
                return C15867.of(((InterfaceC12841) obj).m31886());
        }
    }
}
