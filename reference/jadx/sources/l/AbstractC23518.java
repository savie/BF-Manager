package l;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89IN */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23518 extends AbstractC9032 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f76110;

    public AbstractC23518(AbstractC14676 abstractC14676, byte[] bArr) {
        super(abstractC14676);
        this.f76110 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f30834.m35211() == EnumC19615.CONSTRUCTED) {
            AbstractC14676 abstractC14676 = AbstractC14676.f47976;
            return ((C4466) abstractC14676.mo2657(new C9927()).mo1600(abstractC14676, this.f76110)).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}
