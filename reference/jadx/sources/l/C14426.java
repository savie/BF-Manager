package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8B6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14426 extends AbstractC7629 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Map f45429;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C13244 f45430;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Map f45431;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f45433;

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "multi-unix-zip";
    }

    public C14426(ArrayList arrayList) {
        this.f45432 = arrayList;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (AbstractC22044 abstractC22044 : this.f45432) {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                Collection collectionM51742 = c22941.m51742();
                arrayList.addAll(collectionM51742);
                map.putAll(c22941.m51739());
                Iterator it = collectionM51742.iterator();
                while (it.hasNext()) {
                    map2.put(((C8002) it.next()).getName(), abstractC22044);
                }
                c22941.close();
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Collections.sort(arrayList, C22941.f74522);
        this.f45433 = C4681.unmodifiableList(arrayList);
        this.f45429 = C4681.unmodifiableMap(map);
        this.f45431 = C4681.unmodifiableMap(map2);
        this.f45430 = new C13244(arrayList);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        C8002 c8002M8382 = ((C2494) interfaceC2386).m8382();
        AbstractC22044 abstractC22044 = (AbstractC22044) this.f45431.get(c8002M8382.getName());
        C17359.requireNonNull(abstractC22044);
        return new BufferedInputStream(C18902.m43871(c8002M8382, abstractC22044, null, null, null));
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        String strSubstring = str.substring(1);
        if (this.f45429 == null) {
            mo20837(false);
        }
        C8002 c8002 = (C8002) this.f45429.get(strSubstring);
        if (c8002 == null && strSubstring.endsWith("/")) {
            c8002 = (C8002) this.f45430.m18364(strSubstring);
        }
        if (c8002 == null) {
            return null;
        }
        return new C2494(c8002);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("multi-unix-zip".getBytes());
        Iterator it = this.f45432.iterator();
        while (it.hasNext()) {
            C15022.m36176(messageDigest, ((AbstractC22044) it.next()).mo4294());
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f45433 == null) {
            mo20837(false);
        }
        List listM18371 = this.f45430.m18371(str.substring(1));
        ArrayList arrayList = new ArrayList(listM18371.size());
        Iterator it = listM18371.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2494((C8002) it.next()));
        }
        return arrayList;
    }
}
