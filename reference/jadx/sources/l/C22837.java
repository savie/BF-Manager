package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes.dex */
public class C22837 extends AbstractC18785 {
    @Override // l.InterfaceC6271
    public C21425 parsePartialFrom(AbstractC3262 abstractC3262, C2701 c2701) throws C4529 {
        C15076 c15076NewBuilder = C21425.newBuilder();
        try {
            c15076NewBuilder.mergeFrom(abstractC3262, c2701);
            return c15076NewBuilder.buildPartial();
        } catch (C2474 e) {
            C4529 c4529M7587 = e.m7587();
            c4529M7587.m12651(c15076NewBuilder.buildPartial());
            throw c4529M7587;
        } catch (C4529 e2) {
            e2.m12651(c15076NewBuilder.buildPartial());
            throw e2;
        } catch (IOException e3) {
            C4529 c4529 = new C4529(e3.getMessage(), e3);
            c4529.m12651(c15076NewBuilder.buildPartial());
            throw c4529;
        }
    }
}
