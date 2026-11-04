package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes3.dex */
public class C0986 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        AbstractC22338 abstractC22338 = (AbstractC22338) obj;
        if (abstractC22338 instanceof C11149) {
            c21362.m48600();
            c21362.m48589("totalSeconds");
            c21362.m48601(((C11149) abstractC22338).getTotalSeconds());
            c21362.m48597();
            return;
        }
        c21362.m48600();
        c21362.m48589("id");
        c21362.m48602(abstractC22338.getId());
        c21362.m48597();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        c4208.m13456();
        String strM13453 = null;
        Integer numValueOf = null;
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            String strM13437 = c4208.m13437();
            strM13437.getClass();
            if (strM13437.equals("totalSeconds")) {
                numValueOf = Integer.valueOf(c4208.m13455());
            } else if (strM13437.equals("id")) {
                strM13453 = c4208.m13453();
            } else {
                c4208.m13445();
            }
        }
        c4208.m13447();
        if (strM13453 != null) {
            return AbstractC22338.of(strM13453);
        }
        if (numValueOf != null) {
            return C11149.ofTotalSeconds(numValueOf.intValue());
        }
        throw new C7367("Missing id or totalSeconds field; at path " + c4208.m13451());
    }
}
