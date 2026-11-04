package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10919 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f34566;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo15748(long[] jArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract long[] mo15749(Object obj);

    public AbstractC10919(String... strArr) {
        this.f34566 = Arrays.asList(strArr);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        c4208.m13456();
        List list = this.f34566;
        long[] jArr = new long[list.size()];
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            int iIndexOf = list.indexOf(c4208.m13437());
            if (iIndexOf >= 0) {
                jArr[iIndexOf] = c4208.m13452();
            } else {
                c4208.m13445();
            }
        }
        c4208.m13447();
        return mo15748(jArr);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        if (obj == null) {
            c21362.m48598();
            return;
        }
        c21362.m48600();
        long[] jArrMo15749 = mo15749(obj);
        int i = 0;
        while (true) {
            List list = this.f34566;
            if (i < list.size()) {
                c21362.m48589((String) list.get(i));
                c21362.m48601(jArrMo15749[i]);
                i++;
            } else {
                c21362.m48597();
                return;
            }
        }
    }
}
