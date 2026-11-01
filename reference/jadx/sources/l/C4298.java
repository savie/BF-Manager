package l;

import com.thegrizzlylabs.sardineandroid.model.Multistatus;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AAS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4298 implements InterfaceC13472 {
    @Override // l.InterfaceC13472
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6552(C18485 c18485) throws IOException {
        AbstractC11355.m28436(c18485);
        AbstractC19191 abstractC19191M42860 = c18485.m42860();
        if (abstractC19191M42860 == null) {
            throw new C14757("No entity found in response", c18485.m42858(), c18485.m42868());
        }
        List<Response> response = ((Multistatus) C21938.m48761(Multistatus.class, abstractC19191M42860.m44051())).getResponse();
        ArrayList arrayList = new ArrayList(response.size());
        for (Response response2 : response) {
            try {
                arrayList.add(new C7701(response2));
            } catch (URISyntaxException unused) {
                response2.getHref();
            }
        }
        return arrayList;
    }
}
