package l;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11296 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35610;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35611;

    public /* synthetic */ C11296(int i, Object obj) {
        this.f35610 = i;
        this.f35611 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String name;
        switch (this.f35610) {
            case 0:
                BitSet bitSet = (BitSet) this.f35611;
                BitSet bitSetM49638 = ((C21943) obj).m49638();
                if (!bitSetM49638.isEmpty()) {
                    bitSet.or(bitSetM49638);
                }
                break;
            case 1:
                ActivityC3846.m12413((ActivityC3846) this.f35611, (String) obj);
                break;
            case 2:
                ((LinkedHashSet) this.f35611).add(Integer.valueOf(((Long) obj).intValue()));
                break;
            default:
                HashSet hashSet = (HashSet) this.f35611;
                InterfaceC6238 interfaceC6238 = (AbstractC16481) obj;
                if ((interfaceC6238 instanceof InterfaceC3057) && (name = ((InterfaceC3057) interfaceC6238).getName()) != null) {
                    hashSet.add(name);
                    break;
                }
                break;
        }
    }
}
