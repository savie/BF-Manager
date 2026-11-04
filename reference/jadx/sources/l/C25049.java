package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes.dex */
public class C25049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f81023;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81024;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11622 f81025;

    public C25049() {
        this(4);
    }

    public C25049(int i) {
        this.f81023 = new Object[i * 2];
        this.f81024 = 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public C25049 mo14569(Object obj, Object obj2) {
        int i = (this.f81024 + 1) * 2;
        Object[] objArr = this.f81023;
        if (i > objArr.length) {
            this.f81023 = Arrays.copyOf(objArr, AbstractC13924.m33910(objArr.length, i));
        }
        C19278.m44624(obj, obj2);
        Object[] objArr2 = this.f81023;
        int i2 = this.f81024;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f81024 = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC17589 m55864(boolean z) {
        C11622 c11622;
        C11622 c11623;
        if (z && (c11623 = this.f81025) != null) {
            throw c11623.m29190();
        }
        C15307 c15307M36761 = C15307.m36761(this.f81024, this.f81023, this);
        if (!z || (c11622 = this.f81025) == null) {
            return c15307M36761;
        }
        throw c11622.m29190();
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC17589 mo14568() {
        return m55864(true);
    }

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC17589 mo14570() {
        return m55864(true);
    }
}
