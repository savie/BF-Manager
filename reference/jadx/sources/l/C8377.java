package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C8377 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        c21362.m48601(((AtomicInteger) obj).get());
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        try {
            return new AtomicInteger(c4208.m13455());
        } catch (NumberFormatException e) {
            throw new C7367(e);
        }
    }
}
