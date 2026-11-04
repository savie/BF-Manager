package l;

/* JADX INFO: renamed from: l.᩹ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 565E */
/* JADX INFO: loaded from: classes.dex */
public class C23246 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75323 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC14294[] f75324;

    public C23246(C24738 c24738, C4028 c4028) {
        int i = 0;
        this.f75324 = new AbstractC14294[c4028.m12998()];
        while (true) {
            AbstractC14294[] abstractC14294Arr = this.f75324;
            if (i >= abstractC14294Arr.length) {
                return;
            }
            abstractC14294Arr[i] = AbstractC14294.m34702(c24738, c4028);
            i++;
        }
    }

    public C23246(AbstractC14294[] abstractC14294Arr) {
        this.f75324 = abstractC14294Arr;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public void mo1281(C24166 c24166) {
        c24166.m54135(this.f75324.length);
        for (AbstractC14294 abstractC14294 : this.f75324) {
            abstractC14294.mo1281(c24166);
        }
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public int mo1280(int i) {
        int iM19213 = C6929.m19213(this.f75324.length) + i;
        for (AbstractC14294 abstractC14294 : this.f75324) {
            iM19213 = abstractC14294.mo1280(iM19213);
        }
        return iM19213;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        C23246 c23246 = (C23246) abstractC14294;
        int length = this.f75324.length - c23246.f75324.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            AbstractC14294[] abstractC14294Arr = this.f75324;
            if (i >= abstractC14294Arr.length) {
                return length;
            }
            length = abstractC14294Arr[i].compareTo(c23246.f75324[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_ARRAY;
    }

    public final int hashCode() {
        if (this.f75323 == 0) {
            this.f75323 = 0;
            for (AbstractC14294 abstractC14294 : this.f75324) {
                this.f75323 = abstractC14294.hashCode() + (this.f75323 * 31);
            }
        }
        return this.f75323;
    }
}
