package l;

/* JADX INFO: renamed from: l.᩺ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes.dex */
public final class C24256 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f78548;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f78549;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f78551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21272 f78547 = new C21272();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f78550 = true;

    public C24256(String str, String str2, boolean z) {
        this.f78549 = z;
        this.f78548 = str;
        this.f78551 = str2;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f78547;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (this.f78549) {
            return null;
        }
        if (interfaceC4753.getLine().m34537().toString().substring(interfaceC4753.getIndex()).trim().equals(this.f78548)) {
            return new C7932(-1, -1, true);
        }
        return C7932.m21504(interfaceC4753.getIndex());
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo7445(C14228 c14228) {
        boolean z = this.f78550;
        C21272 c21272 = this.f78547;
        if (z) {
            this.f78550 = false;
            if (this.f78549) {
                StringBuilder sb = c21272.f67834;
                String str = this.f78551;
                sb.append((CharSequence) str, 2, str.length() - 2);
                return;
            }
            return;
        }
        StringBuilder sb2 = c21272.f67834;
        sb2.append(c14228.m34537());
        sb2.append('\n');
    }
}
