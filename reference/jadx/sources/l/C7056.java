package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public class C7056 extends AbstractC2716 {
    @Override // l.InterfaceC11490
    public C4557 parsePartialFrom(AbstractC3660 abstractC3660, C24215 c24215) throws C20463 {
        C13767 c13767NewBuilder = C4557.newBuilder();
        try {
            c13767NewBuilder.mergeFrom(abstractC3660, c24215);
            return c13767NewBuilder.buildPartial();
        } catch (C20463 e) {
            e.m46972(c13767NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C20463 c20463 = new C20463(e2.getMessage(), e2);
            c20463.m46972(c13767NewBuilder.buildPartial());
            throw c20463;
        } catch (C24128 e3) {
            C20463 c20463M53671 = e3.m53671();
            c20463M53671.m46972(c13767NewBuilder.buildPartial());
            throw c20463M53671;
        }
    }
}
