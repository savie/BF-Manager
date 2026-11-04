package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DACT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6361 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21490;

    public /* synthetic */ C6361(int i) {
        this.f21490 = i;
    }

    public /* synthetic */ C6361(C3486 c3486) {
        this.f21490 = 6;
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
        switch (this.f21490) {
            case 0:
                return C17359.toString(obj);
            case 1:
                return C11293.m28556((String) obj);
            case 2:
                return ((C12909) obj).f41283;
            case 3:
                return ((DynamicScheme) obj).errorPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
            case 5:
                return C11984.m30083((AbstractC12531) obj);
            default:
                C2551 c2551 = (C2551) obj;
                boolean z = false;
                try {
                    if (!new C1930(c2551).m6631()) {
                        c2551.m31138("Multi-variable type inference failed");
                    }
                    Iterator it = c2551.m8490().iterator();
                    while (it.hasNext()) {
                        if (!((C17973) it.next()).m41943().m51445().mo5564()) {
                            return Boolean.valueOf(z);
                        }
                        break;
                    }
                    z = true;
                } catch (Exception e) {
                    c2551.m31138("Multi-variable type inference failed. Error: " + C4123.m13224(e));
                }
                return Boolean.valueOf(z);
        }
    }
}
