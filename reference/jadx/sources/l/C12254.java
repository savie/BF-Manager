package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public class C12254 extends AbstractC18785 {
    @Override // l.InterfaceC6271
    public C5903 parsePartialFrom(AbstractC3262 abstractC3262, C2701 c2701) throws C4529 {
        C17192 c17192NewBuilder = C5903.newBuilder();
        try {
            c17192NewBuilder.mergeFrom(abstractC3262, c2701);
            return c17192NewBuilder.buildPartial();
        } catch (C2474 e) {
            C4529 c4529M7587 = e.m7587();
            c4529M7587.m12651(c17192NewBuilder.buildPartial());
            throw c4529M7587;
        } catch (C4529 e2) {
            e2.m12651(c17192NewBuilder.buildPartial());
            throw e2;
        } catch (IOException e3) {
            C4529 c4529 = new C4529(e3.getMessage(), e3);
            c4529.m12651(c17192NewBuilder.buildPartial());
            throw c4529;
        }
    }
}
