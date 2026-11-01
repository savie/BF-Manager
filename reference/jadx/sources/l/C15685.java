package l;

/* JADX INFO: renamed from: l.ܺۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15685 extends AbstractC19918 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f50927;

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19183(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19184(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19185() {
        return true;
    }

    public C15685(String str, EnumC23529 enumC23529, boolean z, int i, byte[] bArr) {
        super(str, EnumC14357.TYPE_TXT, enumC23529, z, i);
        this.f50927 = (bArr == null || bArr.length <= 0) ? C15540.f50591 : bArr;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final byte[] m37381() {
        return this.f50927;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final void mo19179(C5100 c5100) {
        byte[] bArr = this.f50927;
        c5100.m14209(bArr.length, bArr);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19182(AbstractC19918 abstractC19918) {
        if (!(abstractC19918 instanceof C15685)) {
            return false;
        }
        byte[] bArr = ((C15685) abstractC19918).f50927;
        byte[] bArr2 = this.f50927;
        if ((bArr2 == null && bArr != null) || bArr.length != bArr2.length) {
            return false;
        }
        int length = bArr2.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            length = i;
        }
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C0244 mo19176(boolean z) {
        return new C0244(C0561.unmodifiableMap(this.f32353), 0, 0, 0, z, this.f50927);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C20706 mo19177(C22823 c22823) {
        C0244 c0244Mo19176 = mo19176(false);
        c0244Mo19176.m1649(c22823);
        return new C20706(c22823, c0244Mo19176.mo1660(), c0244Mo19176.getName(), c0244Mo19176);
    }

    @Override // l.AbstractC19918, l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo19178(StringBuilder sb) {
        super.mo19178(sb);
        sb.append(" text: '");
        byte[] bArr = C15540.f50590;
        byte[] bArr2 = this.f50927;
        String strM37177 = C15540.m37177(0, bArr2.length, bArr2);
        if (20 < strM37177.length()) {
            sb.append((CharSequence) strM37177, 0, 17);
            sb.append("...");
        } else {
            sb.append(strM37177);
        }
        sb.append('\'');
    }
}
