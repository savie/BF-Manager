package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13261 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42368;

    public /* synthetic */ C13261(int i, Object obj) {
        this.f42367 = i;
        this.f42368 = obj;
    }

    public /* synthetic */ C13261(AbstractC1379 abstractC1379, Consumer consumer) {
        this.f42367 = 1;
        this.f42368 = consumer;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f42367) {
            case 0:
                StringBuilder sb = (StringBuilder) this.f42368;
                Map.Entry entry = (Map.Entry) obj;
                sb.append((String) entry.getValue());
                sb.append(" -> ");
                sb.append((String) entry.getKey());
                sb.append(":\n");
                break;
            case 1:
                Consumer consumer = (Consumer) this.f42368;
                InterfaceC8409 interfaceC8409 = (InterfaceC8409) obj;
                if (interfaceC8409 != null) {
                    interfaceC8409.forEachRemaining(consumer);
                }
                break;
            default:
                ((Set) this.f42368).add((C21943) obj);
                break;
        }
    }
}
