package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.ۙۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C4649 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        c21362.m48585();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            c21362.m48601(atomicIntegerArray.get(i));
        }
        c21362.m48594();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        ArrayList arrayList = new ArrayList();
        c4208.m13441();
        while (c4208.m13457()) {
            try {
                arrayList.add(Integer.valueOf(c4208.m13455()));
            } catch (NumberFormatException e) {
                throw new C7367(e);
            }
        }
        c4208.m13449();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
