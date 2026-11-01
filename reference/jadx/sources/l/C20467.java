package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.᩶᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C20467 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        c1145.m4200();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            c1145.m4211(atomicIntegerArray.get(i));
        }
        c1145.m4199();
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        ArrayList arrayList = new ArrayList();
        c5379.m14913();
        while (c5379.m14924()) {
            try {
                arrayList.add(Integer.valueOf(c5379.m14926()));
            } catch (NumberFormatException e) {
                throw new C22003(e);
            }
        }
        c5379.m14929();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
