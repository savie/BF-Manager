package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.۫ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C12395 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f41417;

    public C12395(AbstractC7186 abstractC7186) {
        this.f41417 = abstractC7186;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        c1145.m4200();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f41417.mo1572(c1145, Long.valueOf(atomicLongArray.get(i)));
        }
        c1145.m4199();
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        ArrayList arrayList = new ArrayList();
        c5379.m14913();
        while (c5379.m14924()) {
            arrayList.add(Long.valueOf(((Number) this.f41417.mo1571(c5379)).longValue()));
        }
        c5379.m14929();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
