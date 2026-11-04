package l;

/* JADX INFO: renamed from: l.᩻᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25358 extends AbstractC17152 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] f81880;

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7637(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7639(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo7640() {
        return true;
    }

    public C25358(String str, EnumC6121 enumC6121, boolean z, int i, byte[] bArr) {
        super(str, EnumC24021.TYPE_TXT, enumC6121, z, i);
        this.f81880 = (bArr == null || bArr.length <= 0) ? C5132.f17872 : bArr;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] m56712() {
        return this.f81880;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final void mo7635(C10219 c10219) {
        byte[] bArr = this.f81880;
        c10219.m26354(bArr.length, bArr);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7638(AbstractC17152 abstractC17152) {
        if (!(abstractC17152 instanceof C25358)) {
            return false;
        }
        byte[] bArr = ((C25358) abstractC17152).f81880;
        byte[] bArr2 = this.f81880;
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

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C17307 mo7633(boolean z) {
        return new C17307(C4681.unmodifiableMap(this.f48028), 0, 0, 0, z, this.f81880);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C11340 mo7632(C14168 c14168) {
        C17307 c17307Mo7633 = mo7633(false);
        c17307Mo7633.m40642(c14168);
        return new C11340(c14168, c17307Mo7633.mo30939(), c17307Mo7633.getName(), c17307Mo7633);
    }

    @Override // l.AbstractC17152, l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo7634(StringBuilder sb) {
        super.mo7634(sb);
        sb.append(" text: '");
        byte[] bArr = C5132.f17871;
        byte[] bArr2 = this.f81880;
        String strM15521 = C5132.m15521(0, bArr2.length, bArr2);
        if (20 < strM15521.length()) {
            sb.append((CharSequence) strM15521, 0, 17);
            sb.append("...");
        } else {
            sb.append(strM15521);
        }
        sb.append('\'');
    }
}
