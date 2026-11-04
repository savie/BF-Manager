package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4450 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f15926;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC24588 f15927 = EnumC24588.NOT_READY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo14147();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14148() {
        this.f15927 = EnumC24588.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC24588 enumC24588 = this.f15927;
        EnumC24588 enumC24589 = EnumC24588.FAILED;
        C12128.m30315(enumC24588 != enumC24589);
        int iOrdinal = this.f15927.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f15927 = enumC24589;
            this.f15926 = mo14147();
            if (this.f15927 != EnumC24588.DONE) {
                this.f15927 = EnumC24588.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15927 = EnumC24588.NOT_READY;
        Object obj = this.f15926;
        this.f15926 = null;
        return obj;
    }
}
