package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11582 extends AbstractC5231 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f38942;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f38943;

    public C11582(String str, String str2, String[] strArr) {
        super(str);
        this.f38942 = str2;
        this.f38943 = strArr;
    }

    @Override // l.AbstractC5231
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5231 mo14424(String str) {
        return new C11582(str, this.f38942, this.f38943);
    }

    @Override // l.AbstractC5231
    /* JADX INFO: renamed from: ۙ */
    public final EnumC2408 mo14423() {
        return EnumC2408.METHOD;
    }

    @Override // l.AbstractC5231
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11582)) {
            return false;
        }
        C11582 c11582 = (C11582) obj;
        return this.f38942.equals(c11582.f38942) && this.f18142.equals(c11582.f18142) && Arrays.equals(this.f38943, c11582.f38943);
    }

    @Override // l.AbstractC5231
    public final int hashCode() {
        return C13958.m33812(this.f38942.hashCode() * 17, 31, this.f18142) + Arrays.hashCode(this.f38943);
    }

    @Override // l.AbstractC5231
    public final String toString() {
        return this.f38942 + ' ' + this.f18142 + '(' + C6851.m18461((Object[]) this.f38943, ',') + ')';
    }
}
