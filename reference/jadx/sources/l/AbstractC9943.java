package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۤ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9943 extends AbstractC0477 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f33952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC8532 f33953 = EnumC8532.NOT_READY;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo20056();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25170() {
        this.f33953 = EnumC8532.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC8532 enumC8532 = this.f33953;
        EnumC8532 enumC8533 = EnumC8532.FAILED;
        C18304.m42523(enumC8532 != enumC8533);
        int iOrdinal = this.f33953.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f33953 = enumC8533;
            this.f33952 = mo20056();
            if (this.f33953 != EnumC8532.DONE) {
                this.f33953 = EnumC8532.READY;
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
        this.f33953 = EnumC8532.NOT_READY;
        Object obj = this.f33952;
        this.f33952 = null;
        return obj;
    }
}
