package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.᩷ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public final class C21803 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f69533;

    public C21803(AbstractC17567 abstractC17567) {
        this.f69533 = abstractC17567;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        c21362.m48585();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f69533.mo3723(c21362, Long.valueOf(atomicLongArray.get(i)));
        }
        c21362.m48594();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        ArrayList arrayList = new ArrayList();
        c4208.m13441();
        while (c4208.m13457()) {
            Number number = (Number) this.f69533.mo3722(c4208);
            if (number == null) {
                throw new C7367("null is not a valid AtomicLongArray element; at path " + c4208.m13451());
            }
            arrayList.add(Long.valueOf(number.longValue()));
        }
        c4208.m13449();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
