package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18755 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60913;

    public /* synthetic */ C18755(int i, Object obj) {
        this.f60912 = i;
        this.f60913 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f60912) {
            case 0:
                C18959 c18959 = (C18959) obj;
                C9804.m25542((C2551) this.f60913, c18959);
                c18959.mo17866(EnumC1763.DONT_GENERATE);
                break;
            default:
                ((ArrayList) this.f60913).add((AbstractC3152) obj);
                break;
        }
    }
}
