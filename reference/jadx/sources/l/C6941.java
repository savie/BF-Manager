package l;

/* JADX INFO: renamed from: l.ۜۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes3.dex */
public class C6941 extends C4638 implements InterfaceC19399 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f22949;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC8212 f22950;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f22951;

    public String getText() {
        return null;
    }

    public C6941(EnumC8212 enumC8212, C21637 c21637, char[] cArr, int i) {
        super(c21637, cArr, i);
        this.f22951 = false;
        this.f22949 = false;
        this.f22950 = enumC8212;
    }

    @Override // l.InterfaceC19399
    public final EnumC8212 getStyle() {
        return this.f22950;
    }

    @Override // l.InterfaceC19399
    public final boolean isDeprecated() {
        if (!this.f22949 && this.f22950 == EnumC8212.JAVADOC) {
            mo12157();
        }
        return this.f22951;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo12157() {
        try {
            m27058("/**");
            while (m27065()) {
                m27062();
                while (m27056('*')) {
                    if (m27060('/')) {
                        return;
                    }
                }
                m27062();
                if ((this.f22951 || m27058("@deprecated")) && m27065()) {
                    if (Character.isWhitespace(m27054())) {
                        this.f22951 = true;
                    } else if (m27056('*') && m27060('/')) {
                        this.f22951 = true;
                        return;
                    }
                }
                while (m27065()) {
                    char cM27054 = m27054();
                    if (cM27054 == '\n' || cM27054 == '\r') {
                        m27056('\r');
                        m27056('\n');
                        break;
                    } else if (cM27054 != '*') {
                        mo14465();
                    } else {
                        mo14465();
                        if (m27060('/')) {
                            return;
                        }
                    }
                }
            }
        } finally {
            this.f22949 = true;
        }
    }
}
