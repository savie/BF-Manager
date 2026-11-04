package l;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89IN */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17259 extends AbstractC4691 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f56232;

    public AbstractC17259(AbstractC15877 abstractC15877, byte[] bArr) {
        super(abstractC15877);
        this.f56232 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f16567.m37844() == EnumC13857.CONSTRUCTED) {
            AbstractC15877 abstractC15877 = AbstractC15877.f51628;
            return ((C12148) abstractC15877.mo6071(new C1112()).mo1664(abstractC15877, this.f56232)).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}
