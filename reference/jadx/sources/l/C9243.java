package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9243 extends AbstractC4653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22959 f31403 = C22959.m50797();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2891 f31404;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f31405;

    public C9243(C2891 c2891) {
        this.f31404 = c2891;
    }

    @Override // l.AbstractC4653
    /* JADX INFO: renamed from: ۙ */
    public final void mo12845(final String str, boolean z) {
        if (!z) {
            this.f31405 = str;
        }
        if (this.f31403.m50802()) {
            C16737.m39273(new Runnable() { // from class: l.᩻֡᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C2891 c2891 = this.f75658.f31404;
                    c2891.f10914.setText(C16737.m39264(R.string.MT_Protector, Integer.valueOf(c2891.f10913.f39735.size())));
                    c2891.f10910.setText(C13012.m32191(250, str));
                }
            });
        } else {
            if (z) {
                return;
            }
            C4716.m13050(this, 100L, new Runnable() { // from class: l.ܳ֡᩹
                @Override // java.lang.Runnable
                public final void run() {
                    final C9243 c9243 = this.f46533;
                    C16737.m39273(new Runnable() { // from class: l.֫֡᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9243 c9244 = c9243;
                            C2891 c2891 = c9244.f31404;
                            c2891.f10914.setText(C16737.m39264(R.string.MT_Protector, Integer.valueOf(c2891.f10913.f39735.size())));
                            c2891.f10910.setText(C13012.m32191(250, c9244.f31405));
                        }
                    });
                }
            });
        }
    }
}
