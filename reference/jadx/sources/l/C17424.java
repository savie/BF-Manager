package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6IN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17424 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56659;

    public /* synthetic */ C17424(int i, Object obj) {
        this.f56658 = i;
        this.f56659 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f56658) {
            case 0:
                InterfaceC11851 interfaceC11851 = (InterfaceC11851) this.f56659;
                ((Map) obj).put(interfaceC11851.mo1791(), interfaceC11851);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f56659;
                String strConcat = (String) obj;
                if (!strConcat.startsWith("// ==")) {
                    strConcat = strConcat.concat(l.b);
                }
                arrayList.add(strConcat);
                break;
        }
    }
}
