package l;

/* JADX INFO: renamed from: l.֡᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes3.dex */
public class C0678 extends C12569 implements InterfaceC9042 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public EnumC19625 f2839;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f2840;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2841;

    @Override // l.InterfaceC9042
    public String getText() {
        return null;
    }

    public C0678(EnumC19625 enumC19625, C18213 c18213, char[] cArr, int i) {
        super(c18213, cArr, i);
        this.f2841 = false;
        this.f2840 = false;
        this.f2839 = enumC19625;
    }

    @Override // l.InterfaceC9042
    public final EnumC19625 getStyle() {
        return this.f2839;
    }

    @Override // l.InterfaceC9042
    public final boolean isDeprecated() {
        if (!this.f2840 && this.f2839 == EnumC19625.JAVADOC) {
            mo3042();
        }
        return this.f2841;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo3042() {
        try {
            m17245("/**");
            while (m17247()) {
                m17248();
                while (m17243('*')) {
                    if (m17249('/')) {
                        return;
                    }
                }
                m17248();
                if ((this.f2841 || m17245("@deprecated")) && m17247()) {
                    if (Character.isWhitespace(m17241())) {
                        this.f2841 = true;
                    } else if (m17243('*') && m17249('/')) {
                        this.f2841 = true;
                        return;
                    }
                }
                while (m17247()) {
                    char cM17241 = m17241();
                    if (cM17241 == '\n' || cM17241 == '\r') {
                        m17243('\r');
                        m17243('\n');
                        break;
                    } else if (cM17241 != '*') {
                        mo17251();
                    } else {
                        mo17251();
                        if (m17249('/')) {
                            return;
                        }
                    }
                }
            }
        } finally {
            this.f2840 = true;
        }
    }
}
