package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public class C2374 extends AbstractC18785 {
    @Override // l.InterfaceC6271
    public C12959 parsePartialFrom(AbstractC3262 abstractC3262, C2701 c2701) throws C4529 {
        C5197 c5197NewBuilder = C12959.newBuilder();
        try {
            c5197NewBuilder.mergeFrom(abstractC3262, c2701);
            return c5197NewBuilder.buildPartial();
        } catch (C2474 e) {
            C4529 c4529M7587 = e.m7587();
            c4529M7587.m12651(c5197NewBuilder.buildPartial());
            throw c4529M7587;
        } catch (C4529 e2) {
            e2.m12651(c5197NewBuilder.buildPartial());
            throw e2;
        } catch (IOException e3) {
            C4529 c4529 = new C4529(e3.getMessage(), e3);
            c4529.m12651(c5197NewBuilder.buildPartial());
            throw c4529;
        }
    }
}
