package l;

/* JADX INFO: renamed from: l.۟ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7270 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24189;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24191;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24192;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19971 f24190 = new C19971();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24193 = true;

    public C7270(String str, String str2, boolean z) {
        this.f24191 = z;
        this.f24192 = str;
        this.f24189 = str2;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f24190;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        if (this.f24191) {
            return null;
        }
        if (interfaceC8119.getLine().m29102().toString().substring(interfaceC8119.getIndex()).trim().equals(this.f24192)) {
            return new C22168(-1, -1, true);
        }
        return C22168.m49178(interfaceC8119.getIndex());
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo1822(C11647 c11647) {
        boolean z = this.f24193;
        C19971 c19971 = this.f24190;
        if (z) {
            this.f24193 = false;
            if (this.f24191) {
                StringBuilder sb = c19971.f63936;
                String str = this.f24189;
                sb.append((CharSequence) str, 2, str.length() - 2);
                return;
            }
            return;
        }
        StringBuilder sb2 = c19971.f63936;
        sb2.append(c11647.m29102());
        sb2.append('\n');
    }
}
