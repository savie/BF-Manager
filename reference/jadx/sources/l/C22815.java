package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22815 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73945;

    public /* synthetic */ C22815(int i, Object obj) {
        this.f73944 = i;
        this.f73945 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f73944) {
            case 0:
                ((InterfaceC13118) this.f73945).mo20515((AbstractC22044) obj);
                break;
            case 1:
                ((InterfaceC3145) this.f73945).mo10283("/* ").mo10271(((String) obj).replace("*/", "* /")).add(" */");
                break;
            default:
                C1610.m5662((C1610) this.f73945, (InterfaceC10161) obj);
                break;
        }
    }
}
