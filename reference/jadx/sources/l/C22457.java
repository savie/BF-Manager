package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public class C22457 extends AbstractC2716 {
    @Override // l.InterfaceC11490
    public C5303 parsePartialFrom(AbstractC3660 abstractC3660, C24215 c24215) throws C20463 {
        C19473 c19473NewBuilder = C5303.newBuilder();
        try {
            c19473NewBuilder.mergeFrom(abstractC3660, c24215);
            return c19473NewBuilder.buildPartial();
        } catch (C20463 e) {
            e.m46972(c19473NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C20463 c20463 = new C20463(e2.getMessage(), e2);
            c20463.m46972(c19473NewBuilder.buildPartial());
            throw c20463;
        } catch (C24128 e3) {
            C20463 c20463M53671 = e3.m53671();
            c20463M53671.m46972(c19473NewBuilder.buildPartial());
            throw c20463M53671;
        }
    }
}
