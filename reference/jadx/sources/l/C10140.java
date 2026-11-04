package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10140 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C18959 c18959 = (C18959) obj;
        switch (C4673.f16494[c18959.getType().ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            default:
                for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                    abstractC16481.getClass();
                    if ((abstractC16481 instanceof C23195) && abstractC16481.getType() != AbstractC1566.f5429) {
                        abstractC16481.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                    }
                }
                break;
        }
    }
}
