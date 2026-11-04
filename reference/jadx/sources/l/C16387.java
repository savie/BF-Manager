package l;

import com.thegrizzlylabs.sardineandroid.model.Multistatus;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AAS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16387 implements InterfaceC23847 {
    @Override // l.InterfaceC23847
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15624(C9444 c9444) throws IOException {
        AbstractC3709.m12069(c9444);
        AbstractC8699 abstractC8699M24818 = c9444.m24818();
        if (abstractC8699M24818 == null) {
            throw new C11912("No entity found in response", c9444.m24820(), c9444.m24825());
        }
        List<Response> response = ((Multistatus) C6693.m18711(Multistatus.class, abstractC8699M24818.m23391())).getResponse();
        ArrayList arrayList = new ArrayList(response.size());
        for (Response response2 : response) {
            try {
                arrayList.add(new C7087(response2));
            } catch (URISyntaxException unused) {
                response2.getHref();
            }
        }
        return arrayList;
    }
}
