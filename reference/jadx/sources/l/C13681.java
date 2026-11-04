package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13681 extends AbstractC21821 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24720 f43423 = C24720.m55195();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4929 f43424;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f43425;

    public C13681(C4929 c4929) {
        this.f43424 = c4929;
    }

    @Override // l.AbstractC21821
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33471(final String str, boolean z) {
        if (!z) {
            this.f43425 = str;
        }
        if (this.f43423.m55199()) {
            C21576.m49068(new Runnable() { // from class: l.ۖۜܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C4929 c4929 = this.f7994.f43424;
                    c4929.f17192.setText(C21576.m49059(R.string.MT_Protector, Integer.valueOf(c4929.f17189.f73990.size())));
                    c4929.f17191.setText(C18969.m44066(250, str));
                }
            });
        } else {
            if (z) {
                return;
            }
            C5261.m15835(this, 100L, new Runnable() { // from class: l.۠ۜܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final C13681 c13681 = this.f27722;
                    C21576.m49068(new Runnable() { // from class: l.ۜۜܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13681 c13682 = c13681;
                            C4929 c4929 = c13682.f43424;
                            c4929.f17192.setText(C21576.m49059(R.string.MT_Protector, Integer.valueOf(c4929.f17189.f73990.size())));
                            c4929.f17191.setText(C18969.m44066(250, c13682.f43425));
                        }
                    });
                }
            });
        }
    }
}
