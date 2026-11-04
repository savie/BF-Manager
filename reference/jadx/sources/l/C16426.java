package l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16426 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22615 f53299;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f53300;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f53301;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c21362.m48598();
            return;
        }
        c21362.m48600();
        for (Map.Entry entry : map.entrySet()) {
            c21362.m48589(String.valueOf(entry.getKey()));
            this.f53300.mo3723(c21362, entry.getValue());
        }
        c21362.m48597();
    }

    public C16426(C23886 c23886, AbstractC17567 abstractC17567, AbstractC17567 abstractC17568, InterfaceC22615 interfaceC22615) {
        this.f53301 = abstractC17567;
        this.f53300 = abstractC17568;
        this.f53299 = interfaceC22615;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        EnumC14648 enumC14648M13438 = c4208.m13438();
        if (enumC14648M13438 == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        Map map = (Map) this.f53299.construct();
        if (enumC14648M13438 == EnumC14648.BEGIN_ARRAY) {
            c4208.m13441();
            while (c4208.m13457()) {
                c4208.m13441();
                Object objMo3722 = this.f53301.mo3722(c4208);
                if (map.containsKey(objMo3722)) {
                    throw new C7367("Duplicate key '" + objMo3722 + "'; at path " + c4208.m13451());
                }
                map.put(objMo3722, this.f53300.mo3722(c4208));
                c4208.m13449();
            }
            c4208.m13449();
            return map;
        }
        c4208.m13456();
        while (c4208.m13457()) {
            AbstractC10108.f32379.mo26066(c4208);
            Object objMo3723 = this.f53301.mo3722(c4208);
            if (map.containsKey(objMo3723)) {
                throw new C7367("Duplicate key '" + objMo3723 + "'; at path " + c4208.m13451());
            }
            map.put(objMo3723, this.f53300.mo3722(c4208));
        }
        c4208.m13447();
        return map;
    }
}
