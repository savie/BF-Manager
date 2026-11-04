package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public final class C22108 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f71252;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c21362.m48598();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        if (this.f71252) {
            C22854.m51571(fFloatValue);
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        c21362.m48588(numberValueOf);
    }

    public C22108(boolean z) {
        this.f71252 = z;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        return Float.valueOf((float) c4208.m13448());
    }
}
