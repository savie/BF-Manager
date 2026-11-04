package l;

import java.util.BitSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5331 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18728;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18729;

    public /* synthetic */ C5331(int i, Object obj) {
        this.f18728 = i;
        this.f18729 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f18728) {
            case 0:
                ((BitSet) this.f18729).set(((C11785) obj).m29616().getId());
                break;
            case 1:
                ((AbstractC18881) this.f18729).mo35576((String) obj);
                break;
            default:
                C18959 c18959 = (C18959) obj;
                ((C7708) this.f18729).getClass();
                if (c18959.getType() == EnumC24203.STR_CONCAT && c18959.m44039() >= 2) {
                    AbstractC1566 type = c18959.mo44035(0).getType();
                    AbstractC1566 abstractC1566 = AbstractC1566.f5417;
                    if (!type.equals(abstractC1566) && !c18959.mo44035(1).getType().equals(abstractC1566)) {
                        c18959.m44023().add(0, AbstractC16481.m39110(new C5557("")));
                        break;
                    }
                }
                break;
        }
    }
}
