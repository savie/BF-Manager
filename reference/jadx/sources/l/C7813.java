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

/* JADX INFO: renamed from: l.۠֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7813 extends AbstractC9677 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Map f25713;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1044 f25714;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Map f25715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f25717;

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "multi-unix-zip";
    }

    public C7813(ArrayList arrayList) {
        this.f25716 = arrayList;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (AbstractC20745 abstractC20745 : this.f25716) {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                Collection collectionM7466 = c2455.m7466();
                arrayList.addAll(collectionM7466);
                map.putAll(c2455.m7484());
                Iterator it = collectionM7466.iterator();
                while (it.hasNext()) {
                    map2.put(((C12107) it.next()).getName(), abstractC20745);
                }
                c2455.close();
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Collections.sort(arrayList, C2455.f9767);
        this.f25717 = C0561.unmodifiableList(arrayList);
        this.f25715 = C0561.unmodifiableMap(map);
        this.f25713 = C0561.unmodifiableMap(map2);
        this.f25714 = new C1044(arrayList);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        C12107 c12107M15713 = ((C5696) interfaceC2557).m15713();
        AbstractC20745 abstractC20745 = (AbstractC20745) this.f25713.get(c12107M15713.getName());
        C13638.requireNonNull(abstractC20745);
        return new BufferedInputStream(C19808.m45033(c12107M15713, abstractC20745, null, null, null));
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        String strSubstring = str.substring(1);
        if (this.f25715 == null) {
            mo10267(false);
        }
        C12107 c12107 = (C12107) this.f25715.get(strSubstring);
        if (c12107 == null && strSubstring.endsWith("/")) {
            c12107 = (C12107) this.f25714.m25250(strSubstring);
        }
        if (c12107 == null) {
            return null;
        }
        return new C5696(c12107);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("multi-unix-zip".getBytes());
        Iterator it = this.f25716.iterator();
        while (it.hasNext()) {
            C22253.m49418(messageDigest, ((AbstractC20745) it.next()).mo33986());
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f25717 == null) {
            mo10267(false);
        }
        List listM25252 = this.f25714.m25252(str.substring(1));
        ArrayList arrayList = new ArrayList(listM25252.size());
        Iterator it = listM25252.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5696((C12107) it.next()));
        }
        return arrayList;
    }
}
